public class Mechanic {

    private String mechanicName;
    private String company;

    public Mechanic() {
    }

    public Mechanic(String mechanicName, String company) {
        this.mechanicName = mechanicName;
        this.company = company;
    }

    public String getMechanicName() {
        return mechanicName;
    }

    public void setMechanicName(String mechanicName) {
        this.mechanicName = mechanicName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String maintenance() {
        return "ТО проведен";
    }

    public String carRepairs() {
        return "Ремонт проведем";
    }
        public <T extends Transport> void performaMaintrnance(T t){
            System.out.println(t.toString() + " " + "обслуживается механиком " + this);
}

    @Override
    public String toString() {
        return "Mechanic{" + "Имя и фамилия механика='" + mechanicName + '\'' + ", Компания='" + company + '\'' + '}';
    }


}


