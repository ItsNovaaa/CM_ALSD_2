public class RiwayatTransaksiArrayQueue {
    TransaksiLayanan[] data; 
    int front;
    int rear;
    int size;
    int max;

    public RiwayatTransaksiArrayQueue(int n) {
        max = n;
        data = new TransaksiLayanan[max]; 
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    // public void peek() {
    //     if (!isEmpty()) {
    //         // Menggunakan metode baru: representasiString()
    //         System.out.println("Elemen terdepan: " + data[front].representasiString()); 
    //     } else {
    //         System.out.println("Riwayat transaksi masih kosong");
    //     }
    // }

    public void print() {
        if (isEmpty()) {
            System.out.println("Belum ada riwayat transaksi.");
        } else {
            System.out.println("Daftar Transaksi:");
            int i = front;
            for (int count = 0; count < size; count++) {
                data[i].print();
                i = (i + 1) % max;
            }
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Riwayat transaksi berhasil dikosongkan");
        } else {
            System.out.println("Riwayat transaksi masih kosong");
        }
    }

    public void enqueue(TransaksiLayanan dt) { 
        if (isFull()) {
            System.out.println("Riwayat transaksi sudah penuh. Tidak bisa menambah data baru.");
            return; 
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max; 
        }
        data[rear] = dt;
        size++;
    }

    public TransaksiLayanan dequeue() { 
        TransaksiLayanan dt = null; 
        if (isEmpty()) {
            System.out.println("Riwayat transaksi masih kosong. Tidak bisa mengambil data.");
            return null; 
        }
        dt = data[front];
        size--;
        if (isEmpty()) { 
            front = rear = -1;
        } else {
            front = (front + 1) % max; 
        }
        return dt;
    }
}