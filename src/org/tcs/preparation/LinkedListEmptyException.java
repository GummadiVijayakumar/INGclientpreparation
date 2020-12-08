package org.tcs.preparation;


class LinkedListEmptyException extends RuntimeException{
    public LinkedListEmptyException(){
      super();
    }
   
  public LinkedListEmptyException(String message){
      super(message);
    }  
}