public class MemberSilver extends Member implements CanRequestDelivery {

    @Override
    public Integer hitungTotalBayar(Integer totalBayar) {
        if (totalBayar >= 500000 && totalBayar <= 1000000){
            totalBayar = totalBayar - totalBayar * 1/100;
            this.totalBayar = totalBayar;
        }
        if (totalBayar > 1000000 && totalBayar <= 7000000){
            totalBayar = totalBayar - totalBayar * 3/100;
            this.totalBayar = totalBayar;
        }
        else if (totalBayar > 7000000){
            totalBayar =  totalBayar - totalBayar * 5/100;
            this.totalBayar = totalBayar;
        }
        
        this.totalBayar = totalBayar;
        return this.totalBayar;
    }

    @Override
    public Integer hitungOngkir(Double jarakTujuan) {
        Integer hargaOngkir = 0;
        if (jarakTujuan >= 5.0){
            for (Integer i = 5; i < jarakTujuan; i = i + 1){
                hargaOngkir = hargaOngkir + 1500;
            }
        }
        return hargaOngkir;
    }


}