public class InvoiceItem {

    private String id;
    private String desc;
    private int qty;
    private double unitprice;

    public InvoiceItem(String id, String desc, int qty, double unitprice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitprice = unitprice;
    }

    public String getID() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitprice() {
        return unitprice;
    }

    void setUnitprice(double unitPrice) {
        this.unitprice = unitPrice;
    }

    public double getTotal() {
        return unitprice * qty;
    }

    public String toString() {
        return ("Id :  " + this.getID() + ".desc: " + this.getDesc() + ".qty:  " + this.getQty() + "."

                + "unitprice:  " + this.getTotal() + ".");

    }



}