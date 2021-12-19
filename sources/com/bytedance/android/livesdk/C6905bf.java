package com.bytedance.android.livesdk;

import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.android.livesdk.bf */
public final class C6905bf {

    /* renamed from: c */
    private static volatile C6905bf f17290c;

    /* renamed from: a */
    boolean f17291a;

    /* renamed from: b */
    public final C1213t<Boolean> f17292b = new C1213t<>();

    /* renamed from: d */
    private int f17293d;

    /* renamed from: e */
    private boolean f17294e;

    static {
        Covode.recordClassIndex(7643);
    }

    private C6905bf() {
    }

    /* renamed from: b */
    public final void mo13207b() {
        if (this.f17291a) {
            this.f17293d++;
        }
    }

    /* renamed from: e */
    public final void mo13210e() {
        if (this.f17291a) {
            this.f17291a = false;
            this.f17293d = 0;
            this.f17294e = false;
        }
    }

    /* renamed from: f */
    private void m14777f() {
        if (this.f17293d == 0 && !this.f17294e) {
            this.f17292b.postValue(true);
        }
    }

    /* renamed from: c */
    public final void mo13208c() {
        if (this.f17291a) {
            int i = this.f17293d - 1;
            this.f17293d = i;
            if (i < 0) {
                this.f17293d = 0;
            }
            if (this.f17293d == 0) {
                m14777f();
            }
        }
    }

    /* renamed from: d */
    public final boolean mo13209d() {
        if (!this.f17291a) {
            return false;
        }
        if (this.f17293d != 0 || this.f17294e) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C6905bf m14776a() {
        MethodCollector.m26663i(11821);
        if (f17290c == null) {
            synchronized (C6905bf.class) {
                try {
                    if (f17290c == null) {
                        f17290c = new C6905bf();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11821);
                    throw th;
                }
            }
        }
        C6905bf bfVar = f17290c;
        MethodCollector.m26664o(11821);
        return bfVar;
    }

    /* renamed from: a */
    public final void mo13206a(boolean z) {
        if (this.f17291a) {
            this.f17294e = z;
            if (!z) {
                m14777f();
            }
        }
    }
}
