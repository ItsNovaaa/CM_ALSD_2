public class AntrianPasienLL {
    NodePasien head;
    NodePasien tail;
    int size;

    public AntrianPasienLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public int getSize() {
        return size;
    }

    public void print() {
        if (!isEmpty()) {
            NodePasien tmp = head;
            while (tmp != null) {
                tmp.data.tampilkanInformasi();
                if (tmp.next != null) {
                    System.out.println("---");
                }
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void enqueue(Pasien input) {
        NodePasien ndInput = new NodePasien(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
        size++;
    }

    public Pasien dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian Pasien masih Kosong, tidak dapat mengambil data!");
            return null;
        }
        NodePasien temp = head;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
        size--;
        return temp.data;
    }

    public Pasien peek() {
        if (isEmpty()) {
            return null;
        }
        return head.data;
    }
}
