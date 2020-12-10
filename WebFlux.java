Fuctional Web Reactor Function Handler Function

public interface Publisher{
public void subscribe(Subscriber <Super T>s);
}

public interface Subscriber{
public void onSubscribe((Subscription s);
public void onNext(element);
public void onError(Throwable T)
public void onComplete();
}

public interface Subscribtion{
public void request(long n);
public void cancel();
}

public intefcae processor extends Subscriber,Publisher{
}