package com.p2082ss.android.ugc.aweme.shortvideo.edit.p3809b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.b.b */
public final class C70936b {

    /* renamed from: g */
    public static final C70937a f158827g = new C70937a((byte) 0);

    /* renamed from: a */
    public final boolean f158828a;

    /* renamed from: b */
    public final int f158829b;

    /* renamed from: c */
    public final boolean f158830c;

    /* renamed from: d */
    public final boolean f158831d;

    /* renamed from: e */
    public final String f158832e;

    /* renamed from: f */
    public final C70941e f158833f;

    static {
        Covode.recordClassIndex(83430);
    }

    public C70936b(boolean z, int i, boolean z2, String str) {
        this(z, i, true, z2, str, null, 32);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.b.b$a */
    public static final class C70937a {
        static {
            Covode.recordClassIndex(83431);
        }

        private C70937a() {
        }

        public /* synthetic */ C70937a(byte b) {
            this();
        }
    }

    private C70936b(boolean z, int i, boolean z2, boolean z3, String str, C70941e eVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(eVar, "");
        this.f158828a = z;
        this.f158829b = i;
        this.f158830c = z2;
        this.f158831d = z3;
        this.f158832e = str;
        this.f158833f = eVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C70936b(boolean z, int i, boolean z2, boolean z3, String str, C70941e eVar, int i2) {
        this(z, i, (i2 & 4) != 0 ? true : z2, (i2 & 8) != 0 ? false : z3, (i2 & 16) != 0 ? "" : str, (i2 & 32) != 0 ? new C70941e() : eVar);
    }
}
