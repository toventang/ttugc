package com.p2082ss.android.ugc.aweme.comment.util;

import androidx.constraintlayout.widget.C0550b;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.util.o */
public final class C37210o {

    /* renamed from: a */
    public final C0550b f87732a = new C0550b();

    /* renamed from: b */
    public final ConstraintLayout f87733b;

    /* renamed from: c */
    private C37211a f87734c;

    /* renamed from: d */
    private final C0550b f87735d;

    static {
        Covode.recordClassIndex(44565);
    }

    /* renamed from: a */
    public final C37211a mo64762a() {
        MethodCollector.m26663i(8705);
        synchronized (C37211a.class) {
            try {
                if (this.f87734c == null) {
                    this.f87734c = new C37211a();
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(8705);
                throw th;
            }
        }
        this.f87732a.mo2451a(this.f87733b);
        C37211a aVar = this.f87734c;
        MethodCollector.m26664o(8705);
        return aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.util.o$a */
    public final class C37211a {
        static {
            Covode.recordClassIndex(44566);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C37211a() {
        }

        /* renamed from: a */
        public final C37211a mo64763a(int i, int i2) {
            C37210o.this.f87732a.mo2448a(i, 3, i2, 4);
            return this;
        }
    }

    public C37210o(ConstraintLayout constraintLayout) {
        C89219l.m154721d(constraintLayout, "");
        this.f87733b = constraintLayout;
        C0550b bVar = new C0550b();
        this.f87735d = bVar;
        bVar.mo2451a(constraintLayout);
    }
}
