public class DoubleLinkedList20 {
    Node20 head;
    Node20 tail;

    public DoubleLinkedList20() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
    return head == null;
    }

    public void addFirst(Mahasiswa20 data) {
    Node20 newNode = new Node20(data);
    if (isEmpty()) {
        head = tail = newNode;
    } else {
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
}

    public void addLast(Mahasiswa20 data) {
    Node20 newNode = new Node20(data);
    if (isEmpty()) {
        head = tail = newNode;
    } else {
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
}
     
    public void insertAfter(String keyNIM, Mahasiswa20 data) {
    Node20 current = head;
    while (current != null && !current.data.nim.equals(keyNIM)) {
        current = current.next;
    }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNIM + "tidak ditemukan.");
            return;
        }

        Node20 newNode = new Node20(data);

        // jika current adalah tail, node baru ditambahkan di akhir   
            if (current == tail) {
                newNode.prev = current;
                current.next = newNode;
                tail = newNode;
            } else { //node baru disisipkan di tengah
                newNode.prev = current;
                newNode.next = current.next;
                current.next.prev = newNode;
                current.next = newNode;
            }
            System.out.println("Data berhasil disisipkan setelah NIM " + keyNIM);
        }

        public void print() {
        if (isEmpty()) {
        System.out.println("Linked List masih kosong");
        return;
        }

        Node20 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void removeFirst() {
    if (isEmpty()) {
        System.out.println("Linked List kosong");
    } else if (head == tail) {
        System.out.println("Data yang berhasil dihapus:");
        head.data.tampil();
        head = tail = null;
    } else {
        System.out.println("Data yang berhasil dihapus:");
        head.data.tampil();
        head = head.next;
        head.prev = null;
       }
    }

    public void removeLast() {
    if (isEmpty()) {
        System.out.println("Linked List kosong");
    } else if (head == tail) {
        System.out.println("Data yang berhasil dihapus:");
        tail.data.tampil();
        head = tail = null;
    } else {
        System.out.println("Data yang berhasil dihapus:");
        tail.data.tampil();
        tail = tail.prev;
        tail.next = null;
    }
    }

    public void printReverse() {
    if (isEmpty()) {
        System.out.println("Linked List masih kosong");
    } else {
        Node20 current = tail;
        while (current != null) {
            current.data.tampil();
            System.out.println("-------------------");
            current = current.prev;
        }
    }
}
}

