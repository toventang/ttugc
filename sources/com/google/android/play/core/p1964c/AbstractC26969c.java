package com.google.android.play.core.p1964c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.google.android.play.core.p1963b.C26909b;
import com.google.android.play.core.p1963b.C26958r;
import com.google.android.play.core.p1965d.C26991q;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.play.core.c.c */
public abstract class AbstractC26969c<StateT> {

    /* renamed from: a */
    private final IntentFilter f63851a;

    /* renamed from: b */
    private final Context f63852b;

    /* renamed from: c */
    private C26968b f63853c = null;

    /* renamed from: d */
    public final C26909b f63854d;

    /* renamed from: e */
    protected final Set<AbstractC26967a<StateT>> f63855e = new HashSet();

    /* renamed from: f */
    private volatile boolean f63856f = false;

    static {
        Covode.recordClassIndex(32444);
    }

    public AbstractC26969c(C26909b bVar, IntentFilter intentFilter, Context context) {
        this.f63854d = bVar;
        this.f63851a = intentFilter;
        this.f63852b = C26991q.m53630a(context);
    }

    /* renamed from: b */
    private final void m53583b() {
        C26968b bVar;
        if ((this.f63856f || !this.f63855e.isEmpty()) && this.f63853c == null) {
            C26968b bVar2 = new C26968b(this);
            this.f63853c = bVar2;
            m53582b(this.f63852b, bVar2, this.f63851a);
        }
        if (!this.f63856f && this.f63855e.isEmpty() && (bVar = this.f63853c) != null) {
            this.f63852b.unregisterReceiver(bVar);
            this.f63853c = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo44410a(Context context, Intent intent);

    /* renamed from: a */
    public final synchronized void mo44660a(AbstractC26967a<StateT> aVar) {
        this.f63854d.mo44598d("registerListener", new Object[0]);
        C26958r.m53562a(aVar, "Registered Play Core listener should not be null.");
        this.f63855e.add(aVar);
        m53583b();
    }

    /* renamed from: a */
    public final synchronized void mo44661a(StateT statet) {
        Iterator it = new HashSet(this.f63855e).iterator();
        while (it.hasNext()) {
            ((AbstractC26967a) it.next()).mo35005a(statet);
        }
    }

    /* renamed from: a */
    public final synchronized void mo44662a(boolean z) {
        this.f63856f = z;
        m53583b();
    }

    /* renamed from: a */
    public final synchronized boolean mo44663a() {
        return this.f63853c != null;
    }

    /* renamed from: b */
    public final synchronized void mo44664b(AbstractC26967a<StateT> aVar) {
        this.f63854d.mo44598d("unregisterListener", new Object[0]);
        C26958r.m53562a(aVar, "Unregistered Play Core listener should not be null.");
        this.f63855e.remove(aVar);
        m53583b();
    }

    /* renamed from: a */
    private static Intent m53581a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.Intent m53582b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m53581a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.p1964c.AbstractC26969c.m53582b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
