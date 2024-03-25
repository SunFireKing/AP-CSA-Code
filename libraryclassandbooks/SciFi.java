public class SciFi extends FictionBook {
   private String galaxy;
   public SciFi() {
      super();
      galaxy = "unknown";
   }
   
   public SciFi(String x, String y, int z, String a, String b) {
      super(x, y, z, a);
      galaxy = b;
   }
   
   public String getGalaxy() {
      return galaxy;
   }
   
   public void setGalaxy(String a) {
      galaxy = a;
   }
   //randomize galaxy just cuz - use math class
   public void randomizeGalaxy() {
      int rand = (int)(Math.random() * 5);
      String[] galarray = {"Thraxas", "reptroherical", "eqoiwmxinr", "zerinydergints"};
      galaxy = galarray[rand];
   }
   
   public String toString() {
      return super.toString() + "galaxy: " + galaxy + "\n";
   }
}