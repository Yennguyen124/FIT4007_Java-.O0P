import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class FoodItem {
    private int Productcode;
    private String Itemname;
    private double Unitprice;
    private Date Manufacturer,Expiry;
    public FoodItem(int productCode,String itemName,double unitPrice,Date Manufacturer,Date Expiry){
        this.Productcode=productCode;
        this.Itemname=itemName;
        this.Unitprice=unitPrice;
        this.Manufacturer=Manufacturer;
        this.Expiry=Expiry;
    }
    public int getProductCode() {
        return Productcode;
    }
    public void setproductCode(int productCode) {
        this.Productcode= productCode;
    }
    public String getItemname() {
        return Itemname;
    }

    public void setItemname(String itemName) {
        this.Itemname =itemName ;
    }

    public double getUnitprice() {
        return Unitprice;
    }

    public void setUnitprice(double unitPrice) {
        this.Unitprice = unitPrice;
    }

    public Date getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(Date manufacturer) {
        this.Manufacturer = manufacturer;
    }

    public Date getExpiry() {
        return Expiry;
    }

    public void setExpiry(Date expiry) {
        this.Expiry = expiry;
    }
    @Override
    //khởi tạo phương thức toString
    public String toString() {
        //sử dung phương thức Locale để biến đổi theo tiền tệ việt nam
        Locale localeVN = new Locale("vi","VietNam");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
        String str = numberFormat.format(Unitprice);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String str1 = simpleDateFormat.format(Manufacturer);
        String str2 = simpleDateFormat.format(Expiry);
        return "Thông tin về thực phẩm: \n" +
                "Mã hàng : " + Unitprice +
                "\nTên hàng : '" + Itemname +
                "\nĐơn giá : " + str +
                "\nNgày sản xuất : " + str1 +
                "\nHạn sử dụng : " + str2
                ;
    }
}
