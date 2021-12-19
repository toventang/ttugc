package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b;

import com.airbnb.epoxy.AbstractC1916af;
import com.airbnb.epoxy.AbstractC1918ah;
import com.airbnb.epoxy.AbstractC1919ai;
import com.airbnb.epoxy.AbstractC1920aj;
import com.airbnb.epoxy.AbstractC1944n;
import com.airbnb.epoxy.AbstractC1956s;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3140b.p3141a.C54606a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b.AbstractC54718l;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.n */
public final class C54725n extends AbstractC54718l implements Object {

    /* renamed from: l */
    private AbstractC1916af<C54725n, AbstractC54718l.C54719a> f125438l;

    /* renamed from: m */
    private AbstractC1918ah<C54725n, AbstractC54718l.C54719a> f125439m;

    /* renamed from: n */
    private AbstractC1920aj<C54725n, AbstractC54718l.C54719a> f125440n;

    /* renamed from: o */
    private AbstractC1919ai<C54725n, AbstractC54718l.C54719a> f125441o;

    static {
        Covode.recordClassIndex(64440);
    }

    /* Return type fixed from 'com.airbnb.epoxy.q' to match base method */
    @Override // com.airbnb.epoxy.AbstractC1973t
    /* renamed from: h */
    public final /* synthetic */ AbstractC54718l.C54719a mo5818h() {
        return new AbstractC54718l.C54719a();
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    public final String toString() {
        return "RequestModel_{request=" + this.f125415h + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int hashCode = super.hashCode() * 31;
        int i8 = 1;
        if (this.f125438l != null) {
            i = 1;
        } else {
            i = 0;
        }
        int i9 = (hashCode + i) * 31;
        if (this.f125439m != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i10 = (i9 + i2) * 31;
        if (this.f125440n != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i11 = (i10 + i3) * 31;
        if (this.f125441o != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        int i12 = (i11 + i4) * 31;
        if (this.f125415h != null) {
            i5 = this.f125415h.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 31;
        if (((AbstractC54718l) this).f125416i != null) {
            i6 = 1;
        } else {
            i6 = 0;
        }
        int i14 = (i13 + i6) * 31;
        if (((AbstractC54718l) this).f125417j != null) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        int i15 = (i14 + i7) * 31;
        if (((AbstractC54718l) this).f125418k == null) {
            i8 = 0;
        }
        return i15 + i8;
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC1956s mo5784a(int i) {
        super.mo5784a(i);
        return this;
    }

    /* renamed from: b */
    public final C54725n mo91762b(long j) {
        super.mo5785a(j);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC1956s mo5785a(long j) {
        super.mo5785a(j);
        return this;
    }

    /* renamed from: b */
    public final C54725n mo91763b(AbstractC89172b<? super IMUser, C89391z> bVar) {
        mo5798e();
        ((AbstractC54718l) this).f125417j = bVar;
        return this;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo91765c(int i) {
        mo5791a("The model was changed during the bind call.", i);
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC1956s mo5786a(CharSequence charSequence) {
        super.mo5786a(charSequence);
        return this;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo91764b(int i) {
        mo5791a("The model was changed between being added to the controller and being bound.", i);
    }

    /* renamed from: a */
    public final C54725n mo91759a(C54606a aVar) {
        mo5798e();
        this.f125415h = aVar;
        return this;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.airbnb.epoxy.q] */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b.AbstractC54718l, com.airbnb.epoxy.AbstractC1973t
    /* renamed from: b */
    public final /* synthetic */ void mo5817b(AbstractC54718l.C54719a aVar) {
        super.mo5794b(aVar);
    }

    /* renamed from: a */
    public final C54725n mo91760a(AbstractC89171a<C89391z> aVar) {
        mo5798e();
        ((AbstractC54718l) this).f125418k = aVar;
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b.AbstractC54718l, com.airbnb.epoxy.AbstractC1956s, com.airbnb.epoxy.AbstractC1973t
    /* renamed from: b */
    public final /* synthetic */ void mo5794b(Object obj) {
        super.mo5794b((AbstractC54718l.C54719a) obj);
    }

    /* renamed from: a */
    public final C54725n mo91761a(AbstractC89172b<? super Boolean, C89391z> bVar) {
        mo5798e();
        ((AbstractC54718l) this).f125416i = bVar;
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    /* renamed from: a */
    public final void mo5787a(AbstractC1944n nVar) {
        super.mo5787a(nVar);
        mo5793b(nVar);
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C54725n) || !super.equals(obj)) {
            return false;
        }
        C54725n nVar = (C54725n) obj;
        if (this.f125438l == null) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.f125438l == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            return false;
        }
        if (this.f125439m == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (nVar.f125439m == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 != z4) {
            return false;
        }
        if (this.f125440n == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (nVar.f125440n == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 != z6) {
            return false;
        }
        if (this.f125441o == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (nVar.f125441o == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 != z8) {
            return false;
        }
        if (this.f125415h == null ? nVar.f125415h != null : !this.f125415h.equals(nVar.f125415h)) {
            return false;
        }
        if (((AbstractC54718l) this).f125416i == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (((AbstractC54718l) nVar).f125416i == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 != z10) {
            return false;
        }
        if (((AbstractC54718l) this).f125417j == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (((AbstractC54718l) nVar).f125417j == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 != z12) {
            return false;
        }
        if (((AbstractC54718l) this).f125418k == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (((AbstractC54718l) nVar).f125418k == null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z13 != z14) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b.AbstractC54718l
    /* renamed from: a */
    public final void mo91749a(AbstractC54718l.C54719a aVar) {
        super.mo5794b(aVar);
    }
}
