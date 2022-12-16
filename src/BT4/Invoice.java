package BT4;

public class Invoice {
    private String partNumber;
    private String partDescription;

    private int quantity;

    public Invoice(String partNumber, String partDescription, int quantity, double unitPrice) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    private double unitPrice;
    private String maSoHoaDon;
    private int soTien;


    public String getMaSoHoaDon() {
        return maSoHoaDon;
    }

    public void setMaSoHoaDon(String maSoHoaDon) {
        this.maSoHoaDon = maSoHoaDon;
    }

    public int getSoTien() {
        return soTien;
    }

    public void setSoTien(int soTien) {
        this.soTien = soTien;
    }

    public void inHoaDon() {
        System.out.println(this.maSoHoaDon + "\t" + this.soTien);
    }
    public double getInvoiceAmount(){
        return quantity*unitPrice;
    }
    @Override
    public String toString() {
        return "invoice{" +
                "maSoHoaDon='" + this.maSoHoaDon + '\'' +
                ", soTien=" + this.getInvoiceAmount() +
                '}';
    }
    public static void main(String[] args){
        Invoice iv = new Invoice("1", "Aaaa", 124, 124);
        System.out.println(iv.toString());
    }
}