import java.util.ArrayList;

public class MusicShop {
    ArrayList<ISell> stock;

    public MusicShop(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addStock(ISell item){
        stock.add(item);
    }

    public int stockCount(){
        return stock.size();
    }

    public int findStockIndex(ISell item){
        return stock.indexOf(item);
    }

    public void removeStock(ISell item){
        int itemIndex = findStockIndex(item);
        stock.remove(itemIndex);
    }


}
