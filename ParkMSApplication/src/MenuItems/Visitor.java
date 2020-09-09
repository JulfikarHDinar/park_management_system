/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuItems;

/**
 *
 * @author ASUS
 */
class Visitor {
    private int visitor_id,visitor_age;
    private String visitor_name,visitor_phone,visitor_gender;
    
    public Visitor(int visitor_id,String visitor_name,String visitor_phone,String visitor_gender,int visitor_age){
        this.visitor_id=visitor_id;
        this.visitor_name=visitor_name;
        this.visitor_phone=visitor_phone;
        this.visitor_gender=visitor_gender;
        this.visitor_age=visitor_age;
        
        
    }
    public int getvisitor_id(){
        return visitor_id;
    }
    public String getvisitor_name(){
        return visitor_name;
    }
    public String getvisitor_phone(){
        return visitor_phone;
    }
    
    public String getvisitor_gender(){
        return visitor_gender;
    }
    public int getvisitor_age(){
        return visitor_age;
    }
}
