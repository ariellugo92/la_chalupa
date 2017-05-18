package Modelo;
public class RandomConector {
    public static RandomCreador buildRandom(String chalupa){
        return new RandomCreador(chalupa);
    }
}
