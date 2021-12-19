package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.AbstractC25547i;
import com.google.android.gms.common.stats.C25588a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.common.internal.ah */
final class ServiceConnectionC25515ah implements ServiceConnection {

    /* renamed from: a */
    final Map<ServiceConnection, ServiceConnection> f60525a = new HashMap();

    /* renamed from: b */
    public int f60526b = 2;

    /* renamed from: c */
    public boolean f60527c;

    /* renamed from: d */
    public IBinder f60528d;

    /* renamed from: e */
    final AbstractC25547i.C25548a f60529e;

    /* renamed from: f */
    public ComponentName f60530f;

    /* renamed from: g */
    final /* synthetic */ C25514ag f60531g;

    static {
        Covode.recordClassIndex(30918);
    }

    /* renamed from: b */
    public final boolean mo41764b() {
        return this.f60525a.isEmpty();
    }

    /* renamed from: a */
    public final void mo41761a() {
        this.f60526b = 3;
        boolean a = C25588a.m49391a(this.f60531g.f60520b, this.f60529e.mo41819a(this.f60531g.f60520b), this, this.f60529e.f60624c);
        this.f60527c = a;
        if (a) {
            this.f60531g.f60521c.sendMessageDelayed(this.f60531g.f60521c.obtainMessage(1, this.f60529e), this.f60531g.f60523e);
            return;
        }
        this.f60526b = 2;
        try {
            this.f60531g.f60520b.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: a */
    public final boolean mo41763a(ServiceConnection serviceConnection) {
        return this.f60525a.containsKey(serviceConnection);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        MethodCollector.m26663i(7429);
        synchronized (this.f60531g.f60519a) {
            try {
                this.f60531g.f60521c.removeMessages(1, this.f60529e);
                this.f60528d = null;
                this.f60530f = componentName;
                for (ServiceConnection serviceConnection : this.f60525a.values()) {
                    serviceConnection.onServiceDisconnected(componentName);
                }
                this.f60526b = 2;
            } finally {
                MethodCollector.m26664o(7429);
            }
        }
    }

    /* renamed from: a */
    public final void mo41762a(ServiceConnection serviceConnection, ServiceConnection serviceConnection2) {
        this.f60529e.mo41819a(this.f60531g.f60520b);
        this.f60525a.put(serviceConnection, serviceConnection2);
    }

    public ServiceConnectionC25515ah(C25514ag agVar, AbstractC25547i.C25548a aVar) {
        this.f60531g = agVar;
        this.f60529e = aVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        MethodCollector.m26663i(7428);
        synchronized (this.f60531g.f60519a) {
            try {
                this.f60531g.f60521c.removeMessages(1, this.f60529e);
                this.f60528d = iBinder;
                this.f60530f = componentName;
                for (ServiceConnection serviceConnection : this.f60525a.values()) {
                    serviceConnection.onServiceConnected(componentName, iBinder);
                }
                this.f60526b = 1;
            } finally {
                MethodCollector.m26664o(7428);
            }
        }
    }
}
