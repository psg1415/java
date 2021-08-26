package chapter8;

public class VIPCustomer {
	private int CustomerID; // 고객번호
	private String CustomerName; // 고객 이름 
	private String customerGrade; // 고객 등급 VIP
	private int bonusPoint; //적립금
	private double bonusRatio; //5%
	private double discountRatio; // 상품 할인 10%
	private int agentID; //전문 상담원 ID
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		discountRatio = 0.1;
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	public int calcPrice(int price) {
		int bonus = (int)(price * bonusRatio); //적립 비율에 따른 적립금
		bonusPoint += bonus;
		
		int discount = (int)(price * discountRatio);
		
		return price - discount;
	}
	
}
