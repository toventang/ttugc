package com.bytedance.ies.bullet.service.popup.p1182a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.popup.AbstractC16876a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.popup.a.e */
public final class C16910e {

    /* renamed from: g */
    public static final C16911a f40197g = new C16911a((byte) 0);

    /* renamed from: a */
    public final C16916h f40198a;

    /* renamed from: b */
    public final C16916h f40199b;

    /* renamed from: c */
    public final int f40200c;

    /* renamed from: d */
    public final int f40201d;

    /* renamed from: e */
    public final int f40202e;

    /* renamed from: f */
    public final AbstractC16876a.AbstractC16878b f40203f;

    static {
        Covode.recordClassIndex(19350);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16910e)) {
            return false;
        }
        C16910e eVar = (C16910e) obj;
        return C89219l.m154714a(this.f40198a, eVar.f40198a) && C89219l.m154714a(this.f40199b, eVar.f40199b) && this.f40200c == eVar.f40200c && this.f40201d == eVar.f40201d && this.f40202e == eVar.f40202e && C89219l.m154714a(this.f40203f, eVar.f40203f);
    }

    public final int hashCode() {
        C16916h hVar = this.f40198a;
        int i = 0;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        C16916h hVar2 = this.f40199b;
        int hashCode2 = (((((((hashCode + (hVar2 != null ? hVar2.hashCode() : 0)) * 31) + this.f40200c) * 31) + this.f40201d) * 31) + this.f40202e) * 31;
        AbstractC16876a.AbstractC16878b bVar = this.f40203f;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "CenterSheetConfig(keyboardOnStyle=" + this.f40198a + ", keyboardOffStyle=" + this.f40199b + ", width=" + this.f40200c + ", height=" + this.f40201d + ", radius=" + this.f40202e + ", cancelableProvider=" + this.f40203f + ")";
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.a.e$a */
    public static final class C16911a {
        static {
            Covode.recordClassIndex(19351);
        }

        private C16911a() {
        }

        public /* synthetic */ C16911a(byte b) {
            this();
        }
    }

    public /* synthetic */ C16910e() {
        this(new C16916h(), new C16916h(), -1, -2, -1, null);
    }

    public C16910e(C16916h hVar, C16916h hVar2, int i, int i2, int i3, AbstractC16876a.AbstractC16878b bVar) {
        C89219l.m154719c(hVar, "");
        C89219l.m154719c(hVar2, "");
        this.f40198a = hVar;
        this.f40199b = hVar2;
        this.f40200c = i;
        this.f40201d = i2;
        this.f40202e = i3;
        this.f40203f = bVar;
    }
}
