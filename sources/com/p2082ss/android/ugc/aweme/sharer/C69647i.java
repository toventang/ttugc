package com.p2082ss.android.ugc.aweme.sharer;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sharer.i */
public final class C69647i extends RuntimeException {
    public static final C69648a Companion = new C69648a((byte) 0);

    /* renamed from: a */
    private final String f155468a;

    static {
        Covode.recordClassIndex(82019);
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.i$a */
    public static final class C69648a {
        static {
            Covode.recordClassIndex(82020);
        }

        private C69648a() {
        }

        public /* synthetic */ C69648a(byte b) {
            this();
        }
    }

    public final String getMessage() {
        return this.f155468a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69647i(String str) {
        super(str);
        C89219l.m154721d(str, "");
        this.f155468a = str;
    }
}
