package br.com.digitalhouse;

public class Principal {

    public static void main(String[] args) {

        Filho filho1 = new Filho("Maria","Jorge","José");
        Filho filho2 = new Filho("Maria","Jorge","Ana");

        mesmaMae(filho1,filho2);
        mesmoPai(filho1,filho2);

        System.out.println(saoMeioIrmaos(filho1, filho2));

    }


  public static String maeDe(Filho filho){
      return filho.getNomeMae();
  }

  public static String paiDe(Filho filho){
      return filho.getNomePai();
  }

  public static boolean mesmaMae(Filho filho1, Filho filho2){
      return maeDe(filho1) == maeDe(filho2);
  }

  public static boolean mesmoPai(Filho filho1, Filho filho2){
      if(paiDe(filho1) == paiDe(filho2)){
          return true;
      } else {
          return false;
      }
  }

  public static boolean saoMeioIrmaos(Filho filho1,Filho filho2){
      return mesmaMae(filho1, filho2) && !mesmoPai(filho1, filho2) || !mesmaMae(filho1,filho2) && mesmoPai(filho1,filho2);
  }

}