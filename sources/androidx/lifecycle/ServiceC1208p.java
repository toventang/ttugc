package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.AbstractC1196i;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.lifecycle.p */
public class ServiceC1208p extends Service implements AbstractC1204m {

    /* renamed from: a */
    private final C1227z f3998a = new C1227z(this);

    static {
        Covode.recordClassIndex(1315);
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public AbstractC1196i getLifecycle() {
        return this.f3998a.f4025a;
    }

    public void onCreate() {
        this.f3998a.mo4059a(AbstractC1196i.EnumC1198a.ON_CREATE);
        super.onCreate();
    }

    public void onDestroy() {
        C1227z zVar = this.f3998a;
        zVar.mo4059a(AbstractC1196i.EnumC1198a.ON_STOP);
        zVar.mo4059a(AbstractC1196i.EnumC1198a.ON_DESTROY);
        super.onDestroy();
    }

    public IBinder onBind(Intent intent) {
        this.f3998a.mo4059a(AbstractC1196i.EnumC1198a.ON_START);
        return null;
    }

    public void onStart(Intent intent, int i) {
        this.f3998a.mo4059a(AbstractC1196i.EnumC1198a.ON_START);
        super.onStart(intent, i);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
