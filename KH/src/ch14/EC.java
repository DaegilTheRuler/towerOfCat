package ch14;

public class EC {
	int no;
	String ordeData;
	String product;//주문상품
	String cardName;
	String cardNo;
	int pay;
	
	public EC() {
		
	}

	public EC(int no, String ordeData, String cardName, String cardNo, int pay) {
		super();
		this.no = no;
		this.ordeData = ordeData;
		this.cardName = cardName;
		this.cardNo = cardNo;
		this.pay = pay;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getOrdeData() {
		return ordeData;
	}

	public void setOrdeData(String ordeData) {
		this.ordeData = ordeData;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public void printEC() {
		System.out.println("주문번호\t주문일자\t주문상품\t카드명\t카드번호\t결제금액");
		System.out.println(no+"/t"+ordeData+"\t"+product+"\t"+cardNo+"\t"+pay);
		System.out.println("------------------------------------------------------------");
	}
}
