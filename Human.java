public class Human {
    protected String surname = null;
    protected String name = null;
    protected String patronymic = null;
    protected String birthday = null;
    protected String gender = null;
    protected Integer phone = null;

    
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setPhone(Integer phone) {
        this.phone = phone;

        
    }
    public String getSurname() {
        return surname;
    }
    public String getName() {
        return name;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public String getBirthday() {
        return birthday;
    }
    public String getGender() {
        return gender;
    }
    public Integer getPhone() {
        return phone;
    }
    
    @Override
    public String toString() {
        return "Human [surname=" + surname + ", name=" + name + ", patronymic=" + patronymic + ", birthday=" + birthday
                + ", gender=" + gender + ", phone=" + phone + "]";
    }




}
