public class KronometreThread implements Runnable{
    private Thread thread;
    private String threadName;

    public KronometreThread(String threadName){
        this.threadName = threadName;
        System.out.println("Oluşturuluyor: "+threadName);
    }
    @Override
    public void run() { // Buraya yazılan kodlar thread şeklinde çalışır.
        System.out.println("Çaşıştırılıyor: "+threadName);
        try
        {
            for(int i=1;i<=10;i++) {
                System.out.println(threadName + ":" + i);
                Thread.sleep(1000); // Yaz, 1 sn bekle.
            }
        }catch(InterruptedException exception){
            System.out.println("Kesildi: "+threadName);
        }

        System.out.println("Thread bitti: "+threadName);

    }
   public void start(){
        System.out.println("Thread nesnesi oluşuyor");
        if(thread==null){
            thread = new Thread(this,threadName);
            thread.start();
        }
   }
}
