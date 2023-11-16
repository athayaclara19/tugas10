public class Member implements CanGetDiskon{
    protected Integer poin = 0;
    public Integer totalBayar = 0;
    public Integer saldo = 0;
    
    public Integer getPoin(){
        if (this.totalBayar >= 10000){
            Integer x = 0;
            for (Integer i = 10000; i <= this.totalBayar;){
                this.totalBayar = this.totalBayar - 10000;
                x++;
            }
            this.poin = this.poin + x;
        }
        return this.poin;
    }

    public void redeemPoin(Integer hargaSouvenir){
        this.poin = this.poin - hargaSouvenir;
    }

    protected Integer getBonusPoin(Integer totalBayar){
        Integer poin = (int) (totalBayar / 10000);
        return poin;
    }

    @Override
    public Integer hitungTotalBayar(Integer totalBayar) {
        if (totalBayar >= 500000 && totalBayar <= 1000000){
            totalBayar = totalBayar - totalBayar * 1/100;
            this.totalBayar = totalBayar;
        }
        if (totalBayar > 1000000 && totalBayar <= 7000000){
            totalBayar = totalBayar - totalBayar * 2/100;
            this.totalBayar = totalBayar;
        }
        else if (totalBayar > 7000000){
            totalBayar =  totalBayar - totalBayar * 3/100;
            this.totalBayar = totalBayar;
        }
        
        this.totalBayar = totalBayar;
        return this.totalBayar;
    }


}