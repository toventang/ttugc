package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.p1940d.AbstractC25631h;
import com.google.android.gms.p1940d.C25632i;
import com.google.android.gms.p1940d.C25635k;
import com.google.firebase.iid.AbstractC27807v;
import com.google.firebase.iid.C27760ae;
import com.google.firebase.iid.C27801q;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.v */
public final class C27884v {

    /* renamed from: b */
    private static final long f65478b = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a */
    final C27883u f65479a;

    /* renamed from: c */
    private final FirebaseInstanceId f65480c;

    /* renamed from: d */
    private final Context f65481d;

    /* renamed from: e */
    private final C27760ae f65482e;

    /* renamed from: f */
    private final C27801q f65483f;

    /* renamed from: g */
    private final Map<String, ArrayDeque<C25632i<Void>>> f65484g = new C0484a();

    /* renamed from: h */
    private final ScheduledExecutorService f65485h;

    /* renamed from: i */
    private boolean f65486i = false;

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized boolean mo46594b() {
        boolean z;
        MethodCollector.m26663i(10338);
        z = this.f65486i;
        MethodCollector.m26664o(10338);
        return z;
    }

    static {
        Covode.recordClassIndex(33477);
    }

    /* renamed from: c */
    private static boolean m55823c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        if (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (m55822a(r1) != false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(10171);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        r6.f65479a.mo46589a(r1);
        r4 = r6.f65484g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = r1.f65473c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        if (r6.f65484g.containsKey(r3) != false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        r2 = r6.f65484g.get(r3);
        r1 = r2.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        if (r1 == null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        r1.mo41894a((java.lang.Void) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004c, code lost:
        if (r2.isEmpty() == false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        r6.f65484g.remove(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0053, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0059, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005e, code lost:
        throw r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo46593a() {
        /*
        // Method dump skipped, instructions count: 101
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C27884v.mo46593a():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo46592a(boolean z) {
        MethodCollector.m26663i(10479);
        this.f65486i = z;
        MethodCollector.m26664o(10479);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo46590a(long j) {
        mo46591a(new RunnableC27886x(this, this.f65481d, this.f65482e, Math.min(Math.max(30L, j << 1), f65478b)), j);
        mo46592a(true);
    }

    /* renamed from: a */
    private static <T> T m55821a(AbstractC25631h<T> hVar) {
        try {
            return (T) C25635k.m49515a(hVar, 30, TimeUnit.SECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                throw cause;
            } else if (cause instanceof RuntimeException) {
                throw cause;
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException | TimeoutException e2) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e2);
        }
    }

    /* renamed from: a */
    private boolean m55822a(C27882t tVar) {
        String str;
        String str2;
        String str3;
        String str4;
        try {
            String str5 = tVar.f65472b;
            char c = 65535;
            int hashCode = str5.hashCode();
            if (hashCode != 83) {
                if (hashCode == 85) {
                    if (str5.equals("U")) {
                        c = 1;
                    }
                }
            } else if (str5.equals("S")) {
                c = 0;
            }
            if (c == 0) {
                String str6 = tVar.f65471a;
                AbstractC27807v vVar = (AbstractC27807v) m55821a(this.f65480c.mo46400d());
                C27801q qVar = this.f65483f;
                String a = vVar.mo46452a();
                String b = vVar.mo46453b();
                Bundle bundle = new Bundle();
                String valueOf = String.valueOf(str6);
                if (valueOf.length() != 0) {
                    str = "/topics/".concat(valueOf);
                } else {
                    str = new String("/topics/");
                }
                bundle.putString("gcm.topic", str);
                String valueOf2 = String.valueOf(str6);
                if (valueOf2.length() != 0) {
                    str2 = "/topics/".concat(valueOf2);
                } else {
                    str2 = new String("/topics/");
                }
                m55821a(qVar.mo46447a(qVar.mo46448a(a, b, str2, bundle)));
                if (m55823c()) {
                    String.valueOf(tVar.f65471a).length();
                }
            } else if (c == 1) {
                String str7 = tVar.f65471a;
                AbstractC27807v vVar2 = (AbstractC27807v) m55821a(this.f65480c.mo46400d());
                C27801q qVar2 = this.f65483f;
                String a2 = vVar2.mo46452a();
                String b2 = vVar2.mo46453b();
                Bundle bundle2 = new Bundle();
                String valueOf3 = String.valueOf(str7);
                if (valueOf3.length() != 0) {
                    str3 = "/topics/".concat(valueOf3);
                } else {
                    str3 = new String("/topics/");
                }
                bundle2.putString("gcm.topic", str3);
                bundle2.putString("delete", "1");
                String valueOf4 = String.valueOf(str7);
                if (valueOf4.length() != 0) {
                    str4 = "/topics/".concat(valueOf4);
                } else {
                    str4 = new String("/topics/");
                }
                m55821a(qVar2.mo46447a(qVar2.mo46448a(a2, b2, str4, bundle2)));
                if (m55823c()) {
                    String.valueOf(tVar.f65471a).length();
                }
            } else if (m55823c()) {
                String.valueOf(String.valueOf(tVar)).length();
            }
            return true;
        } catch (IOException e) {
            if ("SERVICE_NOT_AVAILABLE".equals(e.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e.getMessage())) {
                String.valueOf(e.getMessage()).length();
                return false;
            } else if (e.getMessage() == null) {
                return false;
            } else {
                throw e;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo46591a(Runnable runnable, long j) {
        this.f65485h.schedule(runnable, j, TimeUnit.SECONDS);
    }

    C27884v(FirebaseInstanceId firebaseInstanceId, C27760ae aeVar, C27883u uVar, C27801q qVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f65480c = firebaseInstanceId;
        this.f65482e = aeVar;
        this.f65479a = uVar;
        this.f65483f = qVar;
        this.f65481d = context;
        this.f65485h = scheduledExecutorService;
    }
}
