/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author liliia anna, 2022
 */
//Student Number 991650300

//This is my comment from 1st february by Liliia Anna Korol


public class CardDealer 
{
    public static void main(String[] args)
    {
        
         Card card = new Card("Hearts", 10);
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit("diamonds");
    }
   
}

String[] card_suit = {"Clubs", "Hearts", "Spades", "Diamonds"}; //here I display suits
