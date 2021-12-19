package com.bytedance.jedi.arch.ext.list.p1464a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.arch.ext.list.a.e */
public final class C20438e {

    /* renamed from: a */
    public final AbstractC20440b f48375a;

    /* renamed from: b */
    private final boolean f48376b;

    /* renamed from: c */
    private final int f48377c;

    /* renamed from: com.bytedance.jedi.arch.ext.list.a.e$b */
    public interface AbstractC20440b {
        static {
            Covode.recordClassIndex(23961);
        }

        /* renamed from: a */
        void mo33729a(int i);
    }

    static {
        Covode.recordClassIndex(23959);
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.a.e$a */
    public static final class C20439a {

        /* renamed from: a */
        public int f48378a;

        /* renamed from: b */
        public boolean f48379b;

        /* renamed from: c */
        public final AbstractC20440b f48380c;

        static {
            Covode.recordClassIndex(23960);
        }

        public C20439a(AbstractC20440b bVar) {
            C89219l.m154719c(bVar, "");
            this.f48380c = bVar;
        }
    }

    /* renamed from: a */
    public final void mo33771a(int i) {
        if (this.f48376b) {
            this.f48375a.mo33729a(i + this.f48377c);
        }
    }

    private C20438e(AbstractC20440b bVar, boolean z, int i) {
        this.f48375a = bVar;
        this.f48376b = z;
        this.f48377c = i;
    }

    public /* synthetic */ C20438e(AbstractC20440b bVar, boolean z, int i, byte b) {
        this(bVar, z, i);
    }
}
