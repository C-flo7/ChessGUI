/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csproject1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Square extends JButton implements ActionListener
{

	private int Xcoord;
	private int Ycoord;
	
	private int isOccupied;
	private boolean isVictorySquare;
	
	private boolean isHighlighted;
	
	private boolean valid;
	
	private String name;
	
	private String position;
	
	
	Square()
	{

			valid = true;
			isHighlighted = false;
			this.position = position;
			isVictorySquare = false;
			isOccupied = 0;
		
	}
	/*
	public int getPieceColor()
	{
		if (Piece.color == "White")
			return 0;
		else //if (Piece.color == "Black")
			return 1;
//		else
//			return -1; //invalid square
	}
	*/
	public boolean isOccupied()	//put invalid square here
	{
		if (this.isOccupied == 1)	//isOccupied is an int
			return true;
		else if (this.isOccupied == 0)
			return false;
		else
			this.valid = false;	//isValid is boolean
			return false;

	}

    public void invalid()
    {
        valid = false;
    }
	
    public boolean isValid()
    {
        return valid;
    }
	
	public void setOccupied()
	{
		this.isOccupied = 1;
	}
	
	public void removeOccupied()
	{
		this.isOccupied = 0;
	}
	
	public void setValid()
	{
		this.valid = true;
	}
	
	public void rmValid()
	{
		this.isOccupied = -1;
	}
	
	public int getXPos()
	{
		return Xcoord;
	}
	
	public int getYPos()
	{
		return Ycoord;
	}
	
	public void setXPos(int Xin)
	{	
		this.Xcoord = Xin; 
	}
	
	public void setYPos(int Yin)
	{
		this.Ycoord = Yin;
	}
	
	public boolean getVictorySquare()
	{
		return isVictorySquare;
	}
	
	public void setVictrySquare(boolean isVictory)
	{
		this.isVictorySquare = isVictory;
	}
	
	public String returnSquare(String sqIn)
	{
		return sqIn;
	}

	public void setName(String nameIn)
	{
		name = nameIn;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
	
		
		
	}

	
	
	
}