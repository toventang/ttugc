package com.bytedance.apm;

import com.bytedance.covode.number.Covode;
import java.util.HashSet;

/* renamed from: com.bytedance.apm.h */
public final class C12478h {

    /* renamed from: a */
    public AbstractC12480a f30314a;

    /* renamed from: b */
    private HashSet<String> f30315b;

    /* renamed from: com.bytedance.apm.h$a */
    public interface AbstractC12480a {
        static {
            Covode.recordClassIndex(14290);
        }

        /* renamed from: a */
        void mo20299a(String str);

        /* renamed from: a */
        void mo20300a(Throwable th, String str);

        /* renamed from: b */
        void mo20301b(Throwable th, String str);
    }

    static {
        Covode.recordClassIndex(14288);
    }

    /* renamed from: com.bytedance.apm.h$b */
    public static class C12481b {

        /* renamed from: a */
        public static final C12478h f30317a = new C12478h((byte) 0);

        static {
            Covode.recordClassIndex(14291);
        }
    }

    private C12478h() {
        this.f30315b = new HashSet<>();
    }

    /* synthetic */ C12478h(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo20295a(String str) {
        if (this.f30314a != null && !this.f30315b.contains(str)) {
            this.f30315b.add(str);
            this.f30314a.mo20299a("apm_".concat(String.valueOf(str)));
        }
        if (C12397c.m22288e()) {
            new RuntimeException(str);
            System.exit(1);
        }
    }

    /* renamed from: b */
    public final void mo20297b(Throwable th, String str) {
        try {
            AbstractC12480a aVar = this.f30314a;
            if (aVar != null) {
                aVar.mo20301b(th, str);
            }
        } catch (Throwable unused) {
        }
        if (C12397c.m22288e() || C12397c.m22289f()) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: a */
    public final void mo20296a(Throwable th, String str) {
        if (this.f30314a != null && !this.f30315b.contains(str)) {
            this.f30315b.add(str);
            this.f30314a.mo20300a(th, "apm_".concat(String.valueOf(str)));
        }
    }
}
