package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b;

import android.view.View;
import com.airbnb.epoxy.AbstractC1916af;
import com.airbnb.epoxy.AbstractC1918ah;
import com.airbnb.epoxy.AbstractC1919ai;
import com.airbnb.epoxy.AbstractC1920aj;
import com.airbnb.epoxy.AbstractC1944n;
import com.airbnb.epoxy.AbstractC1954q;
import com.airbnb.epoxy.AbstractC1956s;
import com.airbnb.epoxy.AbstractC1975v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b.AbstractC54726o;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.p */
public class C54728p extends AbstractC54726o implements AbstractC1975v<AbstractC54726o.C54727a> {

    /* renamed from: j */
    private AbstractC1916af<C54728p, AbstractC54726o.C54727a> f125446j;

    /* renamed from: k */
    private AbstractC1918ah<C54728p, AbstractC54726o.C54727a> f125447k;

    /* renamed from: l */
    private AbstractC1920aj<C54728p, AbstractC54726o.C54727a> f125448l;

    /* renamed from: m */
    private AbstractC1919ai<C54728p, AbstractC54726o.C54727a> f125449m;

    static {
        Covode.recordClassIndex(64443);
    }

    /* Return type fixed from 'com.airbnb.epoxy.q' to match base method */
    @Override // com.airbnb.epoxy.AbstractC1973t
    /* renamed from: h */
    public final /* synthetic */ AbstractC54726o.C54727a mo5818h() {
        return new AbstractC54726o.C54727a();
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    public String toString() {
        return "SeeMoreModel_{moreTitle=" + this.f125442h + ", onClickListener=" + ((AbstractC54726o) this).f125443i + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int hashCode = super.hashCode() * 31;
        int i6 = 1;
        if (this.f125446j != null) {
            i = 1;
        } else {
            i = 0;
        }
        int i7 = (hashCode + i) * 31;
        if (this.f125447k != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 31;
        if (this.f125448l != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        if (this.f125449m != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        if (this.f125442h != null) {
            i5 = this.f125442h.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 31;
        if (((AbstractC54726o) this).f125443i == null) {
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
    public final C54728p mo91768b(long j) {
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
    public final /* bridge */ /* synthetic */ void mo5817b(AbstractC54726o.C54727a aVar) {
        super.mo5794b((AbstractC1954q) aVar);
    }

    /* renamed from: a */
    public final C54728p mo91766a(View.OnClickListener onClickListener) {
        mo5798e();
        ((AbstractC54726o) this).f125443i = onClickListener;
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC1956s, com.airbnb.epoxy.AbstractC1973t
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo5794b(Object obj) {
        super.mo5794b((AbstractC1954q) obj);
    }

    /* renamed from: a */
    public final C54728p mo91767a(String str) {
        mo5798e();
        this.f125442h = str;
        return this;
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
        boolean z9;
        boolean z10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C54728p) || !super.equals(obj)) {
            return false;
        }
        C54728p pVar = (C54728p) obj;
        if (this.f125446j == null) {
            z = true;
        } else {
            z = false;
        }
        if (pVar.f125446j == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            return false;
        }
        if (this.f125447k == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (pVar.f125447k == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 != z4) {
            return false;
        }
        if (this.f125448l == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (pVar.f125448l == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 != z6) {
            return false;
        }
        if (this.f125449m == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (pVar.f125449m == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 != z8) {
            return false;
        }
        if (this.f125442h == null ? pVar.f125442h != null : !this.f125442h.equals(pVar.f125442h)) {
            return false;
        }
        if (((AbstractC54726o) this).f125443i == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (((AbstractC54726o) pVar).f125443i == null) {
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
