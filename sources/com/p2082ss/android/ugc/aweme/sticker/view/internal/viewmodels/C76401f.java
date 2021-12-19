package com.p2082ss.android.ugc.aweme.sticker.view.internal.viewmodels;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75374c;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.f */
public final class C76401f<DATA> {

    /* renamed from: a */
    public final DATA f171622a;

    /* renamed from: b */
    public final int f171623b;

    /* renamed from: c */
    public final int f171624c;

    /* renamed from: d */
    public final boolean f171625d;

    /* renamed from: e */
    public final boolean f171626e;

    /* renamed from: f */
    public final boolean f171627f;

    /* renamed from: g */
    public final Bundle f171628g;

    /* renamed from: h */
    public final AbstractC75374c.AbstractC75376b f171629h;

    /* renamed from: i */
    public final AbstractC89171a<C89391z> f171630i;

    /* renamed from: j */
    public final AbstractC89171a<C89391z> f171631j;

    static {
        Covode.recordClassIndex(89361);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C76401f)) {
            return false;
        }
        C76401f fVar = (C76401f) obj;
        return C89219l.m154714a(this.f171622a, fVar.f171622a) && this.f171623b == fVar.f171623b && this.f171624c == fVar.f171624c && this.f171625d == fVar.f171625d && this.f171626e == fVar.f171626e && this.f171627f == fVar.f171627f && C89219l.m154714a(this.f171628g, fVar.f171628g) && C89219l.m154714a(this.f171629h, fVar.f171629h) && C89219l.m154714a(this.f171630i, fVar.f171630i) && C89219l.m154714a(this.f171631j, fVar.f171631j);
    }

    public final int hashCode() {
        DATA data = this.f171622a;
        int i = 0;
        int hashCode = (((((data != null ? data.hashCode() : 0) * 31) + this.f171623b) * 31) + this.f171624c) * 31;
        boolean z = this.f171625d;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        boolean z2 = this.f171626e;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        if (!this.f171627f) {
            i2 = 0;
        }
        int i11 = (i10 + i2) * 31;
        Bundle bundle = this.f171628g;
        int hashCode2 = (i11 + (bundle != null ? bundle.hashCode() : 0)) * 31;
        AbstractC75374c.AbstractC75376b bVar = this.f171629h;
        int hashCode3 = (hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        AbstractC89171a<C89391z> aVar = this.f171630i;
        int hashCode4 = (hashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        AbstractC89171a<C89391z> aVar2 = this.f171631j;
        if (aVar2 != null) {
            i = aVar2.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "StickerSelectRequest(effect=" + ((Object) this.f171622a) + ", adapterPosition=" + this.f171623b + ", categoryPosition=" + this.f171624c + ", supportCancel=" + this.f171625d + ", isChildEffect=" + this.f171626e + ", autoDownloadNext=" + this.f171627f + ", extraData=" + this.f171628g + ", onUpdate=" + this.f171629h + ", doOnCancel=" + this.f171630i + ", doOnSelected=" + this.f171631j + ")";
    }

    private C76401f(DATA data, int i, int i2, boolean z, boolean z2, boolean z3, Bundle bundle, AbstractC75374c.AbstractC75376b bVar, AbstractC89171a<C89391z> aVar) {
        this.f171622a = data;
        this.f171623b = i;
        this.f171624c = i2;
        this.f171625d = z;
        this.f171626e = z2;
        this.f171627f = z3;
        this.f171628g = bundle;
        this.f171629h = bVar;
        this.f171630i = aVar;
        this.f171631j = null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C76401f(Object obj, int i, int i2, boolean z, boolean z2, boolean z3, Bundle bundle, AbstractC75374c.AbstractC75376b bVar, AbstractC89171a aVar, int i3) {
        this(obj, i, i2, (i3 & 8) != 0 ? true : z, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? false : z3, (i3 & 64) != 0 ? null : bundle, (i3 & 128) != 0 ? null : bVar, (i3 & 256) == 0 ? aVar : null);
    }
}
