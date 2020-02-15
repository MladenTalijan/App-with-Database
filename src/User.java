class User {
    private int id;
    private String name, address, gender, membership, genre;
    
    public User(int id, String name, String address, String gender, String membership, String genre){
        this.id = id;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.membership = membership;
        this.genre = genre;
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
    
}
