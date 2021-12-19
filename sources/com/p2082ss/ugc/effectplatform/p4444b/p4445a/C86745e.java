package com.p2082ss.ugc.effectplatform.p4444b.p4445a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.p4450g.C86788a;
import p4519d.p4520a.p4530d.p4531a.AbstractC88054k;
import p4519d.p4520a.p4530d.p4531a.C88041a;
import p4519d.p4520a.p4530d.p4531a.C88044c;
import p4519d.p4520a.p4530d.p4531a.EnumC88043b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.b.a.e */
public final class C86745e implements AbstractC88054k {

    /* renamed from: b */
    public static final byte f195623b = f195623b;

    /* renamed from: c */
    public static final C86746a f195624c = new C86746a((byte) 0);

    /* renamed from: h */
    private static final byte f195625h = f195625h;

    /* renamed from: a */
    public final EnumC88043b f195626a;

    /* renamed from: d */
    private byte[] f195627d;

    /* renamed from: e */
    private int f195628e;

    /* renamed from: f */
    private int f195629f;

    /* renamed from: g */
    private final C88044c f195630g;

    /* renamed from: com.ss.ugc.effectplatform.b.a.e$a */
    public static final class C86746a {
        static {
            Covode.recordClassIndex(102445);
        }

        private C86746a() {
        }

        public /* synthetic */ C86746a(byte b) {
            this();
        }
    }

    @Override // p4519d.p4520a.p4530d.p4531a.AbstractC88054k
    /* renamed from: a */
    public final void mo139996a() {
        this.f195630g.mo139996a();
        this.f195627d = null;
    }

    /* renamed from: c */
    public final boolean mo140002c() {
        if (this.f195629f == -1) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(102444);
    }

    /* renamed from: d */
    private final boolean m150277d() {
        byte[] bArr = this.f195627d;
        if (bArr != null) {
            int a = this.f195630g.mo140022a(bArr, bArr.length);
            if (a <= 0) {
                return false;
            }
            this.f195628e = 0;
            this.f195629f = a;
            return true;
        }
        throw new Exception("buf is null!");
    }

    /* renamed from: com.ss.ugc.effectplatform.b.a.e$b */
    public static final class C86747b extends C88041a {

        /* renamed from: e */
        final /* synthetic */ C86745e f195631e;

        static {
            Covode.recordClassIndex(102446);
        }

        @Override // p4519d.p4520a.p4530d.p4531a.C88041a
        public final String toString() {
            int i;
            if (this.f199948b <= 0 || this.f199947a[this.f199948b - 1] != C86745e.f195623b) {
                i = this.f199948b;
            } else {
                i = this.f199948b - 1;
            }
            try {
                return C86788a.m150336a(this.f199947a, 0, i, this.f195631e.f195626a);
            } catch (Exception e) {
                throw new AssertionError(e);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C86747b(int i, C86745e eVar) {
            super(i);
            this.f195631e = eVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r5[r2] == com.p2082ss.ugc.effectplatform.p4444b.p4445a.C86745e.f195623b) goto L_0x002b;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo140001b() {
        /*
        // Method dump skipped, instructions count: 123
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ugc.effectplatform.p4444b.p4445a.C86745e.mo140001b():java.lang.String");
    }

    private C86745e(C88044c cVar, EnumC88043b bVar) {
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(bVar, "");
        this.f195630g = cVar;
        this.f195626a = bVar;
        if (bVar == EnumC88043b.Ascii) {
            this.f195627d = new byte[8192];
            return;
        }
        throw new IllegalArgumentException("Unsupported encoding!");
    }

    public /* synthetic */ C86745e(C88044c cVar, EnumC88043b bVar, byte b) {
        this(cVar, bVar);
    }
}
