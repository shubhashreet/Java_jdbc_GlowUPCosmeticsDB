package shubha_cosmetic;


public class login {
	public String aname="Shubha";
    public String apwd="shubha2004";
   public boolean admin(user u) {
if(u.getLname().equals(aname) && u.getPassword().equals(apwd)) {
  return true;
}
else {
return false;  
}
   }

}
