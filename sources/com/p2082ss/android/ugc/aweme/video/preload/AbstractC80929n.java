package com.p2082ss.android.ugc.aweme.video.preload;

import com.bytedance.covode.number.Covode;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.video.preload.n */
public abstract class AbstractC80929n {

    /* renamed from: a */
    public final EnumC80868c f180956a;

    static {
        Covode.recordClassIndex(94231);
    }

    /* renamed from: com.ss.android.ugc.aweme.video.preload.n$a */
    public static final class C80930a extends AbstractC80929n {

        /* renamed from: b */
        public static final C80930a f180957b = new C80930a();

        private C80930a() {
            super(EnumC80868c.GHouse, (byte) 0);
        }

        static {
            Covode.recordClassIndex(94232);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.preload.n$b */
    public static final class C80931b extends AbstractC80929n {

        /* renamed from: b */
        public static final C80931b f180958b = new C80931b();

        private C80931b() {
            super(EnumC80868c.Normal, (byte) 0);
        }

        static {
            Covode.recordClassIndex(94233);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.preload.n$c */
    public static final class C80932c extends AbstractC80929n {

        /* renamed from: b */
        public static final C80932c f180959b = new C80932c();

        private C80932c() {
            super(EnumC80868c.Normal, (byte) 0);
        }

        static {
            Covode.recordClassIndex(94234);
        }
    }

    public int hashCode() {
        return this.f180956a.hashCode();
    }

    private AbstractC80929n(EnumC80868c cVar) {
        this.f180956a = cVar;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C89219l.m154714a(cls2, cls)) {
            return false;
        }
        if (obj == null) {
            throw new C89388w("null cannot be cast to non-null type");
        } else if (this.f180956a != ((AbstractC80929n) obj).f180956a) {
            return false;
        } else {
            return true;
        }
    }

    public /* synthetic */ AbstractC80929n(EnumC80868c cVar, byte b) {
        this(cVar);
    }
}
