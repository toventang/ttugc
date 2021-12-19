package com.p2082ss.android.ugc.aweme.aabplugin.core.base.view;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.aabplugin.core.base.view.c */
public class C31357c {

    /* renamed from: c */
    private static volatile C31357c f75134c;

    /* renamed from: a */
    public volatile ProgressDialogC31356b f75135a;

    /* renamed from: b */
    public volatile boolean f75136b;

    static {
        Covode.recordClassIndex(38059);
    }

    private C31357c() {
    }

    /* renamed from: b */
    public final void mo57383b() {
        if (!(this.f75135a == null || this.f75135a.f75129b == null || this.f75135a.f75129b.isFinishing())) {
            this.f75135a.dismiss();
        }
        this.f75135a = null;
        this.f75136b = false;
    }

    /* renamed from: a */
    public static C31357c m65568a() {
        MethodCollector.m26663i(5763);
        if (f75134c == null) {
            synchronized (C31357c.class) {
                try {
                    if (f75134c == null) {
                        f75134c = new C31357c();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5763);
                    throw th;
                }
            }
        }
        C31357c cVar = f75134c;
        MethodCollector.m26664o(5763);
        return cVar;
    }

    /* renamed from: a */
    public final void mo57382a(long j, long j2) {
        int b;
        if (this.f75135a != null && this.f75135a.f75129b != null && (b = m65569b(j, j2)) > this.f75135a.getProgress()) {
            this.f75135a.setProgress(b);
        }
    }

    /* renamed from: b */
    private static int m65569b(long j, long j2) {
        int i;
        if (j <= 0 || j2 <= 0) {
            i = 0;
        } else {
            i = (int) Math.ceil((double) ((((float) j) * 100.0f) / ((float) j2)));
        }
        return Math.max(0, Math.min(i, 100));
    }
}
