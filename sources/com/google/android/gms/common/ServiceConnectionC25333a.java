package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.google.android.gms.common.a */
public final class ServiceConnectionC25333a implements ServiceConnection {

    /* renamed from: a */
    public boolean f60091a;

    /* renamed from: b */
    public final BlockingQueue<IBinder> f60092b = new LinkedBlockingQueue();

    static {
        Covode.recordClassIndex(30726);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f60092b.add(iBinder);
    }
}
