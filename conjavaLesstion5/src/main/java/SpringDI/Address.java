package SpringDI;

public class Address {
    private String contry;
    private String province;
    private String district;

    public Address(){
    }

    public Address(String contry, String province, String district){
        this.contry = contry;
        this.province = province;
        this.district = district;
    }

    public String getContry() {
        return contry;
    }

    public void setContry(String contry) {
        this.contry = contry;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Override
    public String toString() {
        return "Address{" +
                "contry='" + contry + '\'' +
                ", province='" + province + '\'' +
                ", district='" + district + '\'' +
                '}';
    }

    public void setCountry(String country) {
        this.contry =country;
    }
}
