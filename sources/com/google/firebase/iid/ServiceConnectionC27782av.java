package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.Process;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.stats.C25588a;
import com.google.android.gms.common.util.p1939a.ThreadFactoryC25597b;
import com.google.android.gms.p1940d.AbstractC25631h;
import com.google.android.gms.p1940d.C25622ac;
import com.google.android.gms.p1940d.C25632i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.iid.av */
public final class ServiceConnectionC27782av implements ServiceConnection {

    /* renamed from: a */
    private final Context f65274a;

    /* renamed from: b */
    private final Intent f65275b;

    /* renamed from: c */
    private final ScheduledExecutorService f65276c;

    /* renamed from: d */
    private final Queue<C27783a> f65277d;

    /* renamed from: e */
    private BinderC27779at f65278e;

    /* renamed from: f */
    private boolean f65279f;

    static {
        Covode.recordClassIndex(33370);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.iid.av$a */
    public static class C27783a {

        /* renamed from: a */
        final Intent f65280a;

        /* renamed from: b */
        final C25632i<Void> f65281b = new C25632i<>();

        static {
            Covode.recordClassIndex(33371);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo46441a() {
            this.f65281b.mo41896b((Void) null);
        }

        C27783a(Intent intent) {
            this.f65280a = intent;
        }
    }

    /* renamed from: b */
    private void m55563b() {
        while (!this.f65277d.isEmpty()) {
            this.f65277d.poll().mo46441a();
        }
    }

    /* renamed from: a */
    private synchronized void m55562a() {
        MethodCollector.m26663i(11753);
        while (!this.f65277d.isEmpty()) {
            BinderC27779at atVar = this.f65278e;
            if (atVar == null || !atVar.isBinderAlive()) {
                if (!this.f65279f) {
                    this.f65279f = true;
                    try {
                        C25588a.m49390a();
                        if (C25588a.m49392b(this.f65274a, this.f65275b, this, 65)) {
                            MethodCollector.m26664o(11753);
                            return;
                        }
                    } catch (SecurityException unused) {
                    }
                    this.f65279f = false;
                    m55563b();
                }
                MethodCollector.m26664o(11753);
                return;
            }
            C27783a poll = this.f65277d.poll();
            BinderC27779at atVar2 = this.f65278e;
            if (Binder.getCallingUid() == Process.myUid()) {
                atVar2.f65272a.mo46437a(poll.f65280a).mo41873a(C27791g.f65294a, new C27781au(poll));
            } else {
                SecurityException securityException = new SecurityException("Binding only allowed within app");
                MethodCollector.m26664o(11753);
                throw securityException;
            }
        }
        MethodCollector.m26664o(11753);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String.valueOf(String.valueOf(componentName)).length();
        }
        m55562a();
    }

    /* renamed from: a */
    public final synchronized AbstractC25631h<Void> mo46438a(Intent intent) {
        C25622ac<TResult> acVar;
        MethodCollector.m26663i(11752);
        C27783a aVar = new C27783a(intent);
        ScheduledExecutorService scheduledExecutorService = this.f65276c;
        aVar.f65281b.f60753a.mo41873a(scheduledExecutorService, new C27785ax(scheduledExecutorService.schedule(new RunnableC27784aw(aVar), 1000, TimeUnit.MILLISECONDS)));
        this.f65277d.add(aVar);
        m55562a();
        acVar = aVar.f65281b.f60753a;
        MethodCollector.m26664o(11752);
        return acVar;
    }

    public ServiceConnectionC27782av(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new ThreadFactoryC25597b("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        MethodCollector.m26663i(11754);
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String.valueOf(String.valueOf(componentName)).length();
        }
        this.f65279f = false;
        if (!(iBinder instanceof BinderC27779at)) {
            String.valueOf(String.valueOf(iBinder)).length();
            m55563b();
            MethodCollector.m26664o(11754);
            return;
        }
        this.f65278e = (BinderC27779at) iBinder;
        m55562a();
        MethodCollector.m26664o(11754);
    }

    private ServiceConnectionC27782av(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f65277d = new ArrayDeque();
        this.f65279f = false;
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f65274a = applicationContext;
        this.f65275b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f65276c = scheduledExecutorService;
    }
}
