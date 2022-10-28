package com.journaldev.ConcurrentModificationException;
import com.sap.gateway.ip.core.customdev.util.Message;
import java.util.HashMap;
import groovy.json.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


def Message processData(Message message) {

    List myList = new ArrayList<String>();

    myList.add("1");
    myList.add("2");
    myList.add("3");
    myList.add("4");
    myList.add("5");


    for(int i = 0; i<myList.size(); i++){
        println(myList.get(i));
        if(myList.get(i).equals("3")){
            myList.remove(i);
            i++;
            myList.add(myList[i]);
        } 
    }
        
    return message;
} 




