package Day8.Assigment;

//Marketing class
public class Marketing {

    //Instance fields
    private String employeeName;
    private String productName;
    private double salesAmount;

    //Constructor
    public Marketing(String employeeName, String productName, double salesAmount) {
        this.employeeName = employeeName;
        this.productName = productName;
        this.salesAmount = salesAmount;
    }

    //Getters and Setters


    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }

    @Override
    public String toString() {
        return "Marketing{" +
                "employeeName=" + employeeName + '\'' +
                ", productName=" + productName + '\'' +
                ", salesAmount=" + salesAmount + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Marketing mar = (Marketing) obj;
        return employeeName.equals(mar.employeeName) &&
                productName.equals(mar.productName) &&
                salesAmount == mar.salesAmount;
    }

}
