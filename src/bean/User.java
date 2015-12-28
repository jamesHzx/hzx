package bean;

/*{"id":1001,
	 "name":"张飞",
	 "avatar":"avatar/zhangfei.jpg",
	 "password":"1234",
	 "phone":"68357788",
	 "email":"zhangfei@qq.com"
	 },*/
public class User {
	private int id;
	private String name;
	private String password;
	private String avatar;
	private String phone;
	private String email;
	public User(){}
	public User(int id,String name,String password,String avatar,String phone,String email){
		this.id=id;
		this.name=name;
		this.password=password;
		this.avatar=avatar;
		this.phone=phone;
		this.email=email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + 
				", 名字=" + name + 
				", 密码=" + password+ 
				", 头像=" + avatar + 
				", 电话=" + phone + 
				", email="+ email + "]";
	}
}
