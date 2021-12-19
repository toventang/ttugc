package com.p2082ss.android.ugc.aweme.notification.utils;

import androidx.constraintlayout.widget.C0550b;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.utils.a */
public final class C62252a {

    /* renamed from: a */
    public final C0550b f141301a = new C0550b();

    /* renamed from: b */
    public final ConstraintLayout f141302b;

    /* renamed from: c */
    private C62253a f141303c;

    /* renamed from: d */
    private final C0550b f141304d;

    static {
        Covode.recordClassIndex(73026);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.utils.a$a */
    public final class C62253a {
        static {
            Covode.recordClassIndex(73027);
        }

        /* renamed from: a */
        public final void mo100258a() {
            C62252a.this.f141301a.mo2454b(C62252a.this.f141302b);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C62253a() {
        }

        /* renamed from: a */
        public final C62253a mo100257a(int i, int i2) {
            C62252a.this.f141301a.mo2448a(i, 3, i2, 3);
            return this;
        }

        /* renamed from: b */
        public final C62253a mo100259b(int i, int i2) {
            C62252a.this.f141301a.mo2448a(i, 4, i2, 4);
            return this;
        }
    }

    /* renamed from: a */
    public final C62253a mo100256a() {
        MethodCollector.m26663i(579);
        synchronized (C62253a.class) {
            try {
                if (this.f141303c == null) {
                    this.f141303c = new C62253a();
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(579);
                throw th;
            }
        }
        this.f141301a.mo2451a(this.f141302b);
        C62253a aVar = this.f141303c;
        MethodCollector.m26664o(579);
        return aVar;
    }

    public C62252a(ConstraintLayout constraintLayout) {
        C89219l.m154721d(constraintLayout, "");
        this.f141302b = constraintLayout;
        C0550b bVar = new C0550b();
        this.f141304d = bVar;
        bVar.mo2451a(constraintLayout);
    }
}
