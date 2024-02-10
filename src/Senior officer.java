 class Senior_officer extends  Officer {
    private String name;
    private int experience;


    public Senior_officer(int id, Address address, Rank rank, String name) {
        super(id, address, rank);
        this.name = name;
    }

    public Senior_officer(int id, Address address, Rank rank, String name, int experience) {
        super(id, address, rank);
        this.name = name;
        this.experience = experience;
    }

     public int getExperience() {
        return experience;
    }

    public String getName() {
        return name;
    }

    public String getInfo(String additionalInfo) {
        return "Дополнительная информация об офицере:" + additionalInfo;
    }

    public final void Order() {
        System.out.println("Генерал отдает приказ");
    }
     public final void Order1() {
         System.out.println("Маршал отдает приказ");}
    public final void Gratitude(){
        System.out.println("Маршал благодарит за службу");
    }
}