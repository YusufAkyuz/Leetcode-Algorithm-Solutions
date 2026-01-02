import java.util.Stack;

public class ImplementQueueUsingStacks {
    class MyQueue {

        // İki tane Stack tanımlıyoruz
        private Stack<Integer> inStack;
        private Stack<Integer> outStack;

        public MyQueue() {
            inStack = new Stack<>();
            outStack = new Stack<>();
        }

        // Elemanı kuyruğun arkasına ekler
        // Sadece inStack'e push yapıyoruz.
        public void push(int x) {
            inStack.push(x);
        }

        // Kuyruğun başındaki elemanı çıkarır ve döndürür
        public int pop() {
            // Önce peek() çağırarak outStack'in dolu olduğundan emin oluyoruz.
            peek();
            return outStack.pop();
        }

        // Kuyruğun başındaki elemanı döndürür (silmez)
        public int peek() {
            // Eğer çıkış yığını boşsa, giriş yığınındaki her şeyi oraya aktar.
            if (outStack.isEmpty()) {
                while (!inStack.isEmpty()) {
                    outStack.push(inStack.pop());
                }
            }
            // Artık outStack'in tepesinde en eski eleman (kuyruğun başı) var.
            return outStack.peek();
        }

        // Kuyruk boş mu kontrol eder
        public boolean empty() {
            // Her iki yığın da boşsa kuyruk boştur.
            return inStack.isEmpty() && outStack.isEmpty();
        }
    }

}
