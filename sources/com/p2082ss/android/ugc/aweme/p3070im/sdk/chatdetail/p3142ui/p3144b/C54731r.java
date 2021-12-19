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
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b.AbstractC54729q;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.r */
public class C54731r extends AbstractC54729q implements AbstractC1975v<AbstractC54729q.C54730a> {

    /* renamed from: k */
    private AbstractC1916af<C54731r, AbstractC54729q.C54730a> f125456k;

    /* renamed from: l */
    private AbstractC1918ah<C54731r, AbstractC54729q.C54730a> f125457l;

    /* renamed from: m */
    private AbstractC1920aj<C54731r, AbstractC54729q.C54730a> f125458m;

    /* renamed from: n */
    private AbstractC1919ai<C54731r, AbstractC54729q.C54730a> f125459n;

    static {
        Covode.recordClassIndex(64446);
    }

    /* Return type fixed from 'com.airbnb.epoxy.q' to match base method */
    @Override // com.airbnb.epoxy.AbstractC1973t
    /* renamed from: h */
    public final /* synthetic */ AbstractC54729q.C54730a mo5818h() {
        return new AbstractC54729q.C54730a();
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    public String toString() {
        return "SensitiveModel_{titleId=" + this.f125450h + ", subTitleId=" + ((AbstractC54729q) this).f125451i + ", onClickListener=" + ((AbstractC54729q) this).f125452j + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int hashCode = super.hashCode() * 31;
        int i5 = 1;
        if (this.f125456k != null) {
            i = 1;
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 31;
        if (this.f125457l != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        if (this.f125458m != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        if (this.f125459n != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        int i9 = (((((i8 + i4) * 31) + this.f125450h) * 31) + ((AbstractC54729q) this).f125451i) * 31;
        if (((AbstractC54729q) this).f125452j == null) {
            i5 = 0;
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
    public final C54731r mo91772b(long j) {
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
    public final C54731r mo91773d(int i) {
        mo5798e();
        this.f125450h = i;
        return this;
    }

    /* renamed from: e */
    public final C54731r mo91774e(int i) {
        mo5798e();
        ((AbstractC54729q) this).f125451i = i;
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC1956s mo5786a(CharSequence charSequence) {
        super.mo5786a(charSequence);
        return this;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.airbnb.epoxy.q] */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b.AbstractC54729q, com.airbnb.epoxy.AbstractC1973t
    /* renamed from: b */
    public final /* synthetic */ void mo5817b(AbstractC54729q.C54730a aVar) {
        super.mo5794b(aVar);
    }

    /* renamed from: a */
    public final C54731r mo91771a(View.OnClickListener onClickListener) {
        mo5798e();
        ((AbstractC54729q) this).f125452j = onClickListener;
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b.AbstractC54729q, com.airbnb.epoxy.AbstractC1956s, com.airbnb.epoxy.AbstractC1973t
    /* renamed from: b */
    public final /* synthetic */ void mo5794b(Object obj) {
        super.mo5794b((AbstractC54729q.C54730a) obj);
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    /* renamed from: a */
    public final void mo5787a(AbstractC1944n nVar) {
        super.mo5787a(nVar);
        mo5793b(nVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b.AbstractC54729q
    /* renamed from: a */
    public final void mo91769a(AbstractC54729q.C54730a aVar) {
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
        if (!(obj instanceof C54731r) || !super.equals(obj)) {
            return false;
        }
        C54731r rVar = (C54731r) obj;
        if (this.f125456k == null) {
            z = true;
        } else {
            z = false;
        }
        if (rVar.f125456k == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            return false;
        }
        if (this.f125457l == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.f125457l == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 != z4) {
            return false;
        }
        if (this.f125458m == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (rVar.f125458m == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 != z6) {
            return false;
        }
        if (this.f125459n == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (rVar.f125459n == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 != z8 || this.f125450h != rVar.f125450h || ((AbstractC54729q) this).f125451i != ((AbstractC54729q) rVar).f125451i) {
            return false;
        }
        if (((AbstractC54729q) this).f125452j == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (((AbstractC54729q) rVar).f125452j == null) {
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
