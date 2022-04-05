public class Hero{
    int heroLevel;
    public Hero(String name){
    System.out.println("Hero Name: " + name );
}

public void setLevel ( int level ) {
    heroLevel = level;
}

public int getLevel(){
    System.out.println("Hero's level is :" + heroLevel);
    return heroLevel;
}

public static void main (String []args) {
    Hero myHero = new Hero( "Daffa");
    myHero.setLevel( 99 );
    myHero.getLevel( );
    System.out.println("Variable Value :" + myHero.heroLevel);

}
}