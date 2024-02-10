 class Officer  {
    private Rank rank;
     private int id;
     private Address address;
     public Officer(int id, Address address, Rank rank) {
         this.rank = rank;
         this.address = address;
         this.id = id;
     }

     public int getId() {
         return id;
     }

     public Address getAddress() {
         return address;
     }

     public Rank getRank() {
         return rank;

     }
     public final void Order2() {
         System.out.println("Капитан выполняет приказ");}
     public String getInfo(String additionalInfo){
         return "Дополнительная информация о капитане: " + additionalInfo;
     }
 }
