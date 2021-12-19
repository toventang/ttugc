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
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b.AbstractC54712h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.i */
public class C54714i extends AbstractC54712h implements AbstractC1975v<AbstractC54712h.C54713a> {

    /* renamed from: i */
    private AbstractC1916af<C54714i, AbstractC54712h.C54713a> f125403i;

    /* renamed from: j */
    private AbstractC1918ah<C54714i, AbstractC54712h.C54713a> f125404j;

    /* renamed from: k */
    private AbstractC1920aj<C54714i, AbstractC54712h.C54713a> f125405k;

    /* renamed from: l */
    private AbstractC1919ai<C54714i, AbstractC54712h.C54713a> f125406l;

    static {
        Covode.recordClassIndex(64429);
    }

    /* Return type fixed from 'com.airbnb.epoxy.q' to match base method */
    @Override // com.airbnb.epoxy.AbstractC1973t
    /* renamed from: h */
    public final /* synthetic */ AbstractC54712h.C54713a mo5818h() {
        return new AbstractC54712h.C54713a();
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    public String toString() {
        return "HeaderModel_{title=" + this.f125400h + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    public int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = super.hashCode() * 31;
        int i4 = 1;
        int i5 = 0;
        if (this.f125403i != null) {
            i = 1;
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 31;
        if (this.f125404j != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        if (this.f125405k != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        if (this.f125406l == null) {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        if (this.f125400h != null) {
            i5 = this.f125400h.hashCode();
        }
        return i9 + i5;
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC1956s mo5784a(int i) {
        super.mo5784a(i);
        return this;
    }

    /* renamed from: b */
    public final C54714i mo91744b(long j) {
        super.mo5785a(j);
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
    public final /* bridge */ /* synthetic */ void mo5817b(AbstractC54712h.C54713a aVar) {
        super.mo5794b((AbstractC1954q) aVar);
    }

    /* renamed from: a */
    public final C54714i mo91743a(String str) {
        mo5798e();
        this.f125400h = str;
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC1956s, com.airbnb.epoxy.AbstractC1973t
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo5794b(Object obj) {
        super.mo5794b((AbstractC1954q) obj);
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    /* renamed from: a */
    public final void mo5787a(AbstractC1944n nVar) {
        super.mo5787a(nVar);
        mo5793b(nVar);
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C54714i) || !super.equals(obj)) {
            return false;
        }
        C54714i iVar = (C54714i) obj;
        if (this.f125403i == null) {
            z = true;
        } else {
            z = false;
        }
        if (iVar.f125403i == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            return false;
        }
        if (this.f125404j == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (iVar.f125404j == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 != z4) {
            return false;
        }
        if (this.f125405k == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (iVar.f125405k == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 != z6) {
            return false;
        }
        if (this.f125406l == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (iVar.f125406l == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 != z8) {
            return false;
        }
        if (this.f125400h == null ? iVar.f125400h == null : this.f125400h.equals(iVar.f125400h)) {
            return true;
        }
        return false;
    }
}
