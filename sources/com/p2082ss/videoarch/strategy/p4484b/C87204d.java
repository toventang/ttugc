package com.p2082ss.videoarch.strategy.p4484b;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.ss.videoarch.strategy.b.d */
public final class C87204d {

    /* renamed from: a */
    final String f197463a;

    /* renamed from: b */
    final AbstractC87202b f197464b;

    /* renamed from: c */
    final List<Pair<String, String>> f197465c;

    /* renamed from: d */
    final ThreadPoolExecutor f197466d;

    static {
        Covode.recordClassIndex(103007);
    }

    /* renamed from: com.ss.videoarch.strategy.b.d$b */
    static class C87206b implements AbstractC87202b {
        static {
            Covode.recordClassIndex(103009);
        }

        private C87206b() {
        }

        /* synthetic */ C87206b(byte b) {
            this();
        }

        @Override // com.p2082ss.videoarch.strategy.p4484b.AbstractC87202b
        /* renamed from: a */
        public final String mo16648a(String str, byte[] bArr, String str2) {
            throw new RuntimeException("no implementation");
        }
    }

    /* renamed from: com.ss.videoarch.strategy.b.d$a */
    public static class C87205a {

        /* renamed from: a */
        public String f197467a;

        /* renamed from: b */
        public AbstractC87202b f197468b;

        /* renamed from: c */
        public ThreadPoolExecutor f197469c;

        static {
            Covode.recordClassIndex(103008);
        }

        /* renamed from: a */
        public final C87204d mo141072a() {
            return new C87204d(this, (byte) 0);
        }
    }

    private C87204d(C87205a aVar) {
        this.f197463a = aVar.f197467a;
        if (aVar.f197468b == null) {
            this.f197464b = new C87206b((byte) 0);
        } else {
            this.f197464b = aVar.f197468b;
        }
        this.f197465c = new ArrayList();
        this.f197466d = aVar.f197469c;
    }

    /* synthetic */ C87204d(C87205a aVar, byte b) {
        this(aVar);
    }
}
