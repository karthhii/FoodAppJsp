package res;

public class ResDt {
	int resId;
	String resName;
	String address;
	String location;
	String openTime;
	String closeTime;
	int gstNumber;
	int contactNumber;
	String email;
	float avgRating;
	int loginPassword;
	public ResDt(int resId,String resName,String address,String location,String openTime,String closeTime,int gstNumber,int contactNumber,String email,float avgRating,int loginPassword){
		this.resId= resId;
		this.resName=resName;
		this.address=address;
		this.location=location;
		this.openTime=openTime;
		this.closeTime=closeTime;
		this.gstNumber=gstNumber;
		this.contactNumber=contactNumber;
		this.email=email;
		this.avgRating=avgRating;
		this.loginPassword=loginPassword;
	}
	public int getResId() {
		return resId;
	}
	public void setResId(int resId) {
		this.resId = resId;
	}
	public String getResName() {
		return resName;
	}
	public void setResName(String resName) {
		this.resName = resName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getOpenTime() {
		return openTime;
	}
	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}
	public String getCloseTime() {
		return closeTime;
	}
	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}
	public int getGstNumber() {
		return gstNumber;
	}
	public void setGstNumber(int gstNumber) {
		this.gstNumber = gstNumber;
	}
	public int getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getAvgRating() {
		return avgRating;
	}
	public void setAvgRating(float avgRating) {
		this.avgRating = avgRating;
	}
	public int getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(int loginPassword) {
		this.loginPassword = loginPassword;
	}
	@Override
	public String toString() {
		return "ResObject [resId=" + resId + ", resName=" + resName + ", address=" + address + ", location=" + location
				+ ", openTime=" + openTime + ", closeTime=" + closeTime + ", gstNumber=" + gstNumber
				+ ", contactNumber=" + contactNumber + ", email=" + email + ", avgRating=" + avgRating + "]";
	}
	
	
}
	
