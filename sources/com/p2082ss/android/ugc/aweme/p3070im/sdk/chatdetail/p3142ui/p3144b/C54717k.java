package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b;

import android.view.View;
import com.airbnb.epoxy.AbstractC1916af;
import com.airbnb.epoxy.AbstractC1918ah;
import com.airbnb.epoxy.AbstractC1919ai;
import com.airbnb.epoxy.AbstractC1920aj;
import com.airbnb.epoxy.AbstractC1944n;
import com.airbnb.epoxy.AbstractC1956s;
import com.airbnb.epoxy.AbstractC1975v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b.AbstractC54715j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.k */
public class C54717k extends AbstractC54715j implements AbstractC1975v<AbstractC54715j.C54716a> {

    /* renamed from: j */
    private AbstractC1916af<C54717k, AbstractC54715j.C54716a> f125411j;

    /* renamed from: k */
    private AbstractC1918ah<C54717k, AbstractC54715j.C54716a> f125412k;

    /* renamed from: l */
    private AbstractC1920aj<C54717k, AbstractC54715j.C54716a> f125413l;

    /* renamed from: m */
    private AbstractC1919ai<C54717k, AbstractC54715j.C54716a> f125414m;

    static {
        Covode.recordClassIndex(64432);
    }

    /* Return type fixed from 'com.airbnb.epoxy.q' to match base method */
    @Override // com.airbnb.epoxy.AbstractC1973t
    /* renamed from: h */
    public final /* synthetic */ AbstractC54715j.C54716a mo5818h() {
        return new AbstractC54715j.C54716a();
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int hashCode = super.hashCode() * 31;
        int i5 = 1;
        if (this.f125411j != null) {
            i = 1;
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 31;
        if (this.f125412k != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        if (this.f125413l != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        if (this.f125414m != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        int i9 = (((i8 + i4) * 31) + this.f125407h) * 31;
        if (((AbstractC54715j) this).f125408i == null) {
            i5 = 0;
        }
        return i9 + i5;
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    public String toString() {
        return "OptionModel_{titleId=" + this.f125407h + ", onClickListener=" + ((AbstractC54715j) this).f125408i + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC1956s mo5784a(int i) {
        super.mo5784a(i);
        return this;
    }

    /* renamed from: b */
    public final C54717k mo91747b(long j) {
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

    /* renamed from: d */
    public final C54717k mo91748d(int i) {
        mo5798e();
        this.f125407h = i;
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC1956s mo5786a(CharSequence charSequence) {
        super.mo5786a(charSequence);
        return this;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.airbnb.epoxy.q] */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b.AbstractC54715j, com.airbnb.epoxy.AbstractC1973t
    /* renamed from: b */
    public final /* synthetic */ void mo5817b(AbstractC54715j.C54716a aVar) {
        super.mo5794b(aVar);
    }

    /* renamed from: a */
    public final C54717k mo91746a(View.OnClickListener onClickListener) {
        mo5798e();
        ((AbstractC54715j) this).f125408i = onClickListener;
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b.AbstractC54715j, com.airbnb.epoxy.AbstractC1956s, com.airbnb.epoxy.AbstractC1973t
    /* renamed from: b */
    public final /* synthetic */ void mo5794b(Object obj) {
        super.mo5794b((AbstractC54715j.C54716a) obj);
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    /* renamed from: a */
    public final void mo5787a(AbstractC1944n nVar) {
        super.mo5787a(nVar);
        mo5793b(nVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b.AbstractC54715j
    /* renamed from: a */
    public final void mo91745a(AbstractC54715j.C54716a aVar) {
        super.mo5794b(aVar);
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
        boolean z9;
        boolean z10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C54717k) || !super.equals(obj)) {
            return false;
        }
        C54717k kVar = (C54717k) obj;
        if (this.f125411j == null) {
            z = true;
        } else {
            z = false;
        }
        if (kVar.f125411j == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            return false;
        }
        if (this.f125412k == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (kVar.f125412k == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 != z4) {
            return false;
        }
        if (this.f125413l == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (kVar.f125413l == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 != z6) {
            return false;
        }
        if (this.f125414m == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (kVar.f125414m == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 != z8 || this.f125407h != kVar.f125407h) {
            return false;
        }
        if (((AbstractC54715j) this).f125408i == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (((AbstractC54715j) kVar).f125408i == null) {
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
