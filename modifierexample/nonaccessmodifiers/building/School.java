package javabasics.modifierexample.nonaccessmodifiers.building;

import javabasics.modifierexample.nonaccessmodifiers.tools.Furniture;



public class School extends Furniture{
  public static void main(String args[]){
    Furniture f = new Furniture(); // possible only if the Furniture class is non-abstract

    // System.out.println(f.localSofa);
  }


}
