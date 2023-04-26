package ch04;

public class VIPCustomer extends Customer {


    private int agentID;
    double salesRatio;

    public VIPCustomer() {

        customerGrade = "VIP";    //오류 발생 -> private이기 때문에 -> protexted로 변경
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }

    public int getAgentID() {
        return agentID;
    }


    @Override
    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        price -= (int)(price * salesRatio);
        return price;

    }


}
