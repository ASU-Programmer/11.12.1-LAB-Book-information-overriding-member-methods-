public class Encyclopedia extends Book {
   // TODO: Declare private fields: edition, numVolumes
   private String edition;
   private int numVolumes;
  
   
   // TODO: Define mutator methods - 
   //       setEdition(), setNumVolumes()
   public void setEdition(String ed) {
      edition = ed;
   }
   
   public void setNumVolumes(int numVol) {
      numVolumes = numVol;
   }
  
   // TODO: Define accessor methods -
   //       getEdition(), getNumVolumes()
   public String getEdition() {
      return edition;
   }
   
   public int getNumVolumes() {
      return numVolumes;
   }
   
   // TODO: Define a printInfo() method that overrides 
   //       the printInfo in Book class 
   public void printInfo() {
      super.printInfo();
      System.out.println("   Edition: " + edition);
      System.out.println("   Number of Volumes: " + numVolumes);
   }
   
}
