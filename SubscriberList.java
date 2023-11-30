/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ottprojectf;

import java.util.ArrayList;

/**
 *
 * @author Asif
 */
public class SubscriberList {
    private ArrayList<Subscriber> subscribers;
    public SubscriberList(){
        subscribers= new ArrayList<>();
        subscribers.add(new Subscriber("soud@iub.com","ibnasoud"));
        subscribers.add(new Subscriber("ahnaf@iub.com","ibnasoud1"));
        subscribers.add(new Subscriber("faria@iub.com","ibnasoud2"));
        subscribers.add(new Subscriber("erin@iub.com","ibnasoud3"));
    }
    public ArrayList<Subscriber> getSubscribers(){
        return subscribers;
    }
}
