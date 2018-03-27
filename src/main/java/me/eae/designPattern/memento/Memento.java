package me.eae.designPattern.memento;

/**
 * Created by 郝家雨 on 2018/3/24.
 * 负责储存originator对象的内部状态，并可防止originator以外的任何对象访问备忘录，备忘录有两个接口，Caretaker只能看到备忘录的窄接口，他只能将备忘录传递给其他对象，
 * Originator能够看到一个宽接口，允许它访问返回到先前状态所欲要的所有数据。
 */
public class Memento {

    private String status;
    public Memento(String status){
        this.status = status;
    }
    public String getStatus(){
        return status;
    }

}
