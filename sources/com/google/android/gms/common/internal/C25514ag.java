package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.AbstractC25547i;
import com.google.android.gms.common.stats.C25588a;
import com.google.android.gms.internal.p1946e.HandlerC25734g;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.HashMap;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.internal.ag */
public final class C25514ag extends AbstractC25547i implements Handler.Callback {

    /* renamed from: a */
    final HashMap<AbstractC25547i.C25548a, ServiceConnectionC25515ah> f60519a = new HashMap<>();

    /* renamed from: b */
    final Context f60520b;

    /* renamed from: c */
    final Handler f60521c;

    /* renamed from: d */
    final C25588a f60522d;

    /* renamed from: e */
    final long f60523e;

    /* renamed from: f */
    private final long f60524f;

    static {
        Covode.recordClassIndex(30917);
    }

    public final boolean handleMessage(Message message) {
        return m49200a(this, message);
    }

    C25514ag(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f60520b = applicationContext;
        this.f60521c = new HandlerC25734g(context.getMainLooper(), this);
        this.f60522d = C25588a.m49390a();
        this.f60524f = 5000;
        this.f60523e = 300000;
    }

    /* renamed from: a */
    private boolean m49199a(Message message) {
        MethodCollector.m26663i(7596);
        int i = message.what;
        if (i == 0) {
            synchronized (this.f60519a) {
                try {
                    AbstractC25547i.C25548a aVar = (AbstractC25547i.C25548a) message.obj;
                    ServiceConnectionC25515ah ahVar = this.f60519a.get(aVar);
                    if (ahVar != null && ahVar.mo41764b()) {
                        if (ahVar.f60527c) {
                            ahVar.f60531g.f60521c.removeMessages(1, ahVar.f60529e);
                            ahVar.f60531g.f60520b.unbindService(ahVar);
                            ahVar.f60527c = false;
                            ahVar.f60526b = 2;
                        }
                        this.f60519a.remove(aVar);
                    }
                } finally {
                    MethodCollector.m26664o(7596);
                }
            }
            return true;
        } else if (i != 1) {
            MethodCollector.m26664o(7596);
            return false;
        } else {
            synchronized (this.f60519a) {
                try {
                    AbstractC25547i.C25548a aVar2 = (AbstractC25547i.C25548a) message.obj;
                    ServiceConnectionC25515ah ahVar2 = this.f60519a.get(aVar2);
                    if (ahVar2 != null && ahVar2.f60526b == 3) {
                        String.valueOf(String.valueOf(aVar2)).length();
                        new Exception();
                        ComponentName componentName = ahVar2.f60530f;
                        if (componentName == null && (componentName = aVar2.f60623b) == null) {
                            componentName = new ComponentName(aVar2.f60622a, "unknown");
                        }
                        ahVar2.onServiceDisconnected(componentName);
                    }
                } finally {
                    MethodCollector.m26664o(7596);
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    private static boolean m49200a(C25514ag agVar, Message message) {
        try {
            return agVar.m49199a(message);
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC25547i
    /* renamed from: b */
    public final void mo41759b(AbstractC25547i.C25548a aVar, ServiceConnection serviceConnection) {
        MethodCollector.m26663i(7593);
        C25565r.m49315a(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f60519a) {
            try {
                ServiceConnectionC25515ah ahVar = this.f60519a.get(aVar);
                if (ahVar == null) {
                    String valueOf = String.valueOf(aVar);
                    IllegalStateException illegalStateException = new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 50).append("Nonexistent connection status for service config: ").append(valueOf).toString());
                    MethodCollector.m26664o(7593);
                    throw illegalStateException;
                } else if (ahVar.mo41763a(serviceConnection)) {
                    ahVar.f60525a.remove(serviceConnection);
                    if (ahVar.mo41764b()) {
                        this.f60521c.sendMessageDelayed(this.f60521c.obtainMessage(0, aVar), this.f60524f);
                    }
                } else {
                    String valueOf2 = String.valueOf(aVar);
                    IllegalStateException illegalStateException2 = new IllegalStateException(new StringBuilder(String.valueOf(valueOf2).length() + 76).append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=").append(valueOf2).toString());
                    MethodCollector.m26664o(7593);
                    throw illegalStateException2;
                }
            } finally {
                MethodCollector.m26664o(7593);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC25547i
    /* renamed from: a */
    public final boolean mo41758a(AbstractC25547i.C25548a aVar, ServiceConnection serviceConnection) {
        boolean z;
        MethodCollector.m26663i(7435);
        C25565r.m49315a(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f60519a) {
            try {
                ServiceConnectionC25515ah ahVar = this.f60519a.get(aVar);
                if (ahVar == null) {
                    ahVar = new ServiceConnectionC25515ah(this, aVar);
                    ahVar.mo41762a(serviceConnection, serviceConnection);
                    ahVar.mo41761a();
                    this.f60519a.put(aVar, ahVar);
                } else {
                    this.f60521c.removeMessages(0, aVar);
                    if (!ahVar.mo41763a(serviceConnection)) {
                        ahVar.mo41762a(serviceConnection, serviceConnection);
                        int i = ahVar.f60526b;
                        if (i == 1) {
                            serviceConnection.onServiceConnected(ahVar.f60530f, ahVar.f60528d);
                        } else if (i == 2) {
                            ahVar.mo41761a();
                        }
                    } else {
                        String valueOf = String.valueOf(aVar);
                        IllegalStateException illegalStateException = new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 81).append("Trying to bind a GmsServiceConnection that was already connected before.  config=").append(valueOf).toString());
                        MethodCollector.m26664o(7435);
                        throw illegalStateException;
                    }
                }
                z = ahVar.f60527c;
            } finally {
                MethodCollector.m26664o(7435);
            }
        }
        return z;
    }
}
