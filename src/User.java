class User {
    private int id;
    private String name, address, gender, membership, genre, date;
    
    public User(int id, String name, String address, String gender, String membership, String genre, String date){
        this.id = id;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.membership = membership;
        this.genre = genre;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public String getMembership() {
        return membership;
    }

    public String getGenre() {
        return genre;
    }
    
    public String getDate(){
        return date;
    }
    
}
