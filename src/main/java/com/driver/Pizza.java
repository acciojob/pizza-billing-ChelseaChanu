package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean extraCheese;
    private boolean extraTopping;
    private boolean takeAway;
    private boolean billGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
        }
        else{
            this.price = 400;
        }
        this.bill = "Base Price Of The Pizza: "+price+"\n";
        this.extraCheese = false;
        this.extraTopping = false;
        this.takeAway = false;
        this.billGenerated = false;
    }

    public int getPrice(){
        return this.price;
    }

    public Boolean getIsVeg() {
        return isVeg;
    }

    public String getBill(){
        // your code goes here
        if(billGenerated == false){
            if(extraCheese){
                this.bill += "Extra Cheese Added: 80\n";
            }
    
            if(extraTopping){
                if(isVeg){
                    this.bill += "Extra Toppings Added: 70\n";
                }
                else{
                    this.bill += "Extra Toppings Added: 120\n";
                }
            }
    
            if(takeAway){
                this.bill += "Paperbag Added: 20\n";
            }
    
            this.bill += "Total Price: "+price;
            billGenerated = true;
        }

        return this.bill;
    }
    
    public void addExtraCheese(){
        // your code goes here
        if(extraCheese == false){
            extraCheese = true;
            price += 80;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(extraTopping == false){
            extraTopping = true;
            if(isVeg){
                price += 70;
            }
            else{
                price += 120;
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(takeAway == false){
            takeAway  = true;
            price += 20;
        }
    }
}
