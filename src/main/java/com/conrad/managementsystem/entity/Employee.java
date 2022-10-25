package com.conrad.managementsystem.entity;

public class Employee {
    private Integer id;         //编号
    private String name;        //姓名
    private String department;  //部门
    private String address;     //地址
    private String enrolldate;  //入职时间
    private Integer gender;     //性别 0为女1为男
    private Integer maritalstatus;  //婚姻状况，0为未婚，1为已婚
    private String position;   //职位
    private Integer root_id;    //根节点id
    private Integer depth;      //距离根距离
    private Integer is_leaf;    //是否是叶子结点，0为否，1为是
    private Integer authority;  //权限
    private Integer departstatus;  //离职情况，0为在职，1为离职
    private String notes;       //备注
    private String create_date; //创建数据时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEnrolldate() {
        return enrolldate;
    }

    public void setEnrolldate(String enrolldate) {
        this.enrolldate = enrolldate;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getMaritalstatus() {
        return maritalstatus;
    }

    public void setMaritalstatus(Integer maritalstatus) {
        this.maritalstatus = maritalstatus;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getRoot_id() {
        return root_id;
    }

    public void setRoot_id(Integer root_id) {
        this.root_id = root_id;
    }

    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public Integer getIs_leaf() {
        return is_leaf;
    }

    public void setIs_leaf(Integer is_leaf) {
        this.is_leaf = is_leaf;
    }

    public Integer getAuthority() {
        return authority;
    }

    public void setAuthority(Integer authority) {
        this.authority = authority;
    }

    public Integer getDepartstatus() {
        return departstatus;
    }

    public void setDepartstatus(Integer departstatus) {
        this.departstatus = departstatus;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", address='" + address + '\'' +
                ", enrolldate='" + enrolldate + '\'' +
                ", gender=" + gender +
                ", maritalstatus=" + maritalstatus +
                ", position=" + position +
                ", root_id=" + root_id +
                ", depth=" + depth +
                ", is_leaf=" + is_leaf +
                ", authority=" + authority +
                ", departstatus=" + departstatus +
                ", notes='" + notes + '\'' +
                ", create_date='" + create_date + '\'' +
                '}';
    }
}
