public class StackBelanja06 {
    int size;
    int top;
    belanja06 data[];

    public StackBelanja06(int size){
        this.size = size;
        data = new belanja06[size];
        top = -1;
    }
    public boolean IsEmpty(){
        if (top== -1){
            return true;
        } else {
            return false;
        }
    }
    public boolean IsFull(){
        if (top == size-1){
            return true;
        } else {
            return false;
        }
    }
    public void push(belanja06 b){
        if(!IsFull()){
            top++;
            data[top] = b;
        } else {
            System.out.println("Isi stack penuh!");
        }
    }
    public void pop(){
        if(!IsEmpty()){
            belanja06 x = data[top];
            top--;
            System.out.println("Data yang keluar : " + x.noTransaksi + " " + x.tglPembelian + " " + x.jumBarang + " " + x.totalHargaBayar);
        } else {
            System.out.println("Stack masih kosong");
        }
    }
    public void peek (){
        System.out.println("Elemen teratas : " + data[top].noTransaksi + " " + data[top].tglPembelian + " " +data[top].jumBarang + " " + data[top].totalHargaBayar + " ");
    }
    public void print(){
        System.out.println("Isi Stack : ");
    for (int i = top; i >= 0; i--) {
        System.out.println(data[i].noTransaksi + " " + data[i].tglPembelian + " " + data[i].tglPembelian + " " + data[i].jumBarang + " " + data[i].totalHargaBayar + " ");
    }
    System.out.println(" ");
    }
    public void clear(){
        if (!IsEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Stack masih kosong");
        }
    }
}
