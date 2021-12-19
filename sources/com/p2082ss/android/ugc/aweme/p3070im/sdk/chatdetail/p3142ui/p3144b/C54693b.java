package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b;

import com.airbnb.epoxy.AbstractC1916af;
import com.airbnb.epoxy.AbstractC1918ah;
import com.airbnb.epoxy.AbstractC1919ai;
import com.airbnb.epoxy.AbstractC1920aj;
import com.airbnb.epoxy.AbstractC1944n;
import com.airbnb.epoxy.AbstractC1954q;
import com.airbnb.epoxy.AbstractC1956s;
import com.airbnb.epoxy.AbstractC1975v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b.AbstractC54690a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.b */
public final class C54693b extends AbstractC54690a implements AbstractC1975v<AbstractC54690a.C54691a> {

    /* renamed from: k */
    private AbstractC1916af<C54693b, AbstractC54690a.C54691a> f125339k;

    /* renamed from: l */
    private AbstractC1918ah<C54693b, AbstractC54690a.C54691a> f125340l;

    /* renamed from: m */
    private AbstractC1920aj<C54693b, AbstractC54690a.C54691a> f125341m;

    /* renamed from: n */
    private AbstractC1919ai<C54693b, AbstractC54690a.C54691a> f125342n;

    static {
        Covode.recordClassIndex(64408);
    }

    /* Return type fixed from 'com.airbnb.epoxy.q' to match base method */
    @Override // com.airbnb.epoxy.AbstractC1973t
    /* renamed from: h */
    public final /* synthetic */ AbstractC54690a.C54691a mo5818h() {
        return new AbstractC54690a.C54691a();
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    public final String toString() {
        return "AdminChooseModel_{user=" + this.f125327h + ", selected=" + ((AbstractC54690a) this).f125328i + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int hashCode = super.hashCode() * 31;
        int i6 = 1;
        if (this.f125339k != null) {
            i = 1;
        } else {
            i = 0;
        }
        int i7 = (hashCode + i) * 31;
        if (this.f125340l != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 31;
        if (this.f125341m != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        if (this.f125342n != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        if (this.f125327h != null) {
            i5 = this.f125327h.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (((i10 + i5) * 31) + (((AbstractC54690a) this).f125328i ? 1 : 0)) * 31;
        if (((AbstractC54690a) this).f125329j == null) {
            i6 = 0;
        }
        return i11 + i6;
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC1956s mo5784a(int i) {
        super.mo5784a(i);
        return this;
    }

    /* renamed from: b */
    public final C54693b mo91719b(CharSequence charSequence) {
        super.mo5786a(charSequence);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC1956s mo5785a(long j) {
        super.mo5785a(j);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC1975v
    /* renamed from: b */
    public final /* synthetic */ void mo5823b(int i) {
        mo5791a("The model was changed between being added to the controller and being bound.", i);
    }

    @Override // com.airbnb.epoxy.AbstractC1975v
    /* renamed from: c */
    public final /* synthetic */ void mo5824c(int i) {
        mo5791a("The model was changed during the bind call.", i);
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC1956s mo5786a(CharSequence charSequence) {
        super.mo5786a(charSequence);
        return this;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.airbnb.epoxy.q] */
    @Override // com.airbnb.epoxy.AbstractC1973t
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo5817b(AbstractC54690a.C54691a aVar) {
        super.mo5794b((AbstractC1954q) aVar);
    }

    /* renamed from: a */
    public final C54693b mo91716a(IMUser iMUser) {
        mo5798e();
        this.f125327h = iMUser;
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC1956s, com.airbnb.epoxy.AbstractC1973t
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo5794b(Object obj) {
        super.mo5794b((AbstractC1954q) obj);
    }

    /* renamed from: a */
    public final C54693b mo91717a(AbstractC89172b<? super IMUser, C89391z> bVar) {
        mo5798e();
        ((AbstractC54690a) this).f125329j = bVar;
        return this;
    }

    /* renamed from: a */
    public final C54693b mo91718a(boolean z) {
        mo5798e();
        ((AbstractC54690a) this).f125328i = z;
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
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C54693b) || !super.equals(obj)) {
            return false;
        }
        C54693b bVar = (C54693b) obj;
        if (this.f125339k == null) {
            z = true;
        } else {
            z = false;
        }
        if (bVar.f125339k == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            return false;
        }
        if (this.f125340l == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bVar.f125340l == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 != z4) {
            return false;
        }
        if (this.f125341m == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (bVar.f125341m == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 != z6) {
            return false;
        }
        if (this.f125342n == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (bVar.f125342n == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 != z8) {
            return false;
        }
        if (this.f125327h == null ? bVar.f125327h != null : !this.f125327h.equals(bVar.f125327h)) {
            return false;
        }
        if (((AbstractC54690a) this).f125328i != ((AbstractC54690a) bVar).f125328i) {
            return false;
        }
        if (((AbstractC54690a) this).f125329j == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (((AbstractC54690a) bVar).f125329j == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 != z10) {
            return false;
        }
        return true;
    }
}
