package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifpanel;

import android.content.Context;
import com.airbnb.epoxy.AbstractC1916af;
import com.airbnb.epoxy.AbstractC1918ah;
import com.airbnb.epoxy.AbstractC1919ai;
import com.airbnb.epoxy.AbstractC1920aj;
import com.airbnb.epoxy.AbstractC1944n;
import com.airbnb.epoxy.AbstractC1954q;
import com.airbnb.epoxy.AbstractC1956s;
import com.airbnb.epoxy.AbstractC1975v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.emoji.emojichoose.AbstractC46519p;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifpanel.AbstractC54171b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifsearch.giphy.p3114a.C54186b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.c */
public final class C54175c extends AbstractC54171b implements AbstractC1975v<AbstractC54171b.C54172a> {

    /* renamed from: l */
    private AbstractC1916af<C54175c, AbstractC54171b.C54172a> f124124l;

    /* renamed from: m */
    private AbstractC1918ah<C54175c, AbstractC54171b.C54172a> f124125m;

    /* renamed from: n */
    private AbstractC1920aj<C54175c, AbstractC54171b.C54172a> f124126n;

    /* renamed from: o */
    private AbstractC1919ai<C54175c, AbstractC54171b.C54172a> f124127o;

    static {
        Covode.recordClassIndex(63857);
    }

    /* Return type fixed from 'com.airbnb.epoxy.q' to match base method */
    @Override // com.airbnb.epoxy.AbstractC1973t
    /* renamed from: h */
    public final /* synthetic */ AbstractC54171b.C54172a mo5818h() {
        return new AbstractC54171b.C54172a();
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
        if (this.f124124l != null) {
            i = 1;
        } else {
            i = 0;
        }
        int i9 = (hashCode + i) * 31;
        if (this.f124125m != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i10 = (i9 + i2) * 31;
        if (this.f124126n != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i11 = (i10 + i3) * 31;
        if (this.f124127o != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        int i12 = (i11 + i4) * 31;
        if (this.f124115h != null) {
            i5 = this.f124115h.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 31;
        if (((AbstractC54171b) this).f124116i != null) {
            i6 = 1;
        } else {
            i6 = 0;
        }
        int i14 = (i13 + i6) * 31;
        if (((AbstractC54171b) this).f124117j != null) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        int i15 = (i14 + i7) * 31;
        if (((AbstractC54171b) this).f124118k == null) {
            i8 = 0;
        }
        return i15 + i8;
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    public final String toString() {
        return "GifModel_{data=" + this.f124115h + ", context=" + ((AbstractC54171b) this).f124116i + ", inputBridge=" + ((AbstractC54171b) this).f124117j + ", viewModel=" + ((AbstractC54171b) this).f124118k + "}" + super.toString();
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC1956s mo5784a(int i) {
        super.mo5784a(i);
        return this;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.airbnb.epoxy.q] */
    @Override // com.airbnb.epoxy.AbstractC1973t
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo5817b(AbstractC54171b.C54172a aVar) {
        super.mo5794b((AbstractC1954q) aVar);
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
        if (!(obj instanceof C54175c) || !super.equals(obj)) {
            return false;
        }
        C54175c cVar = (C54175c) obj;
        if (this.f124124l == null) {
            z = true;
        } else {
            z = false;
        }
        if (cVar.f124124l == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            return false;
        }
        if (this.f124125m == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (cVar.f124125m == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 != z4) {
            return false;
        }
        if (this.f124126n == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (cVar.f124126n == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 != z6) {
            return false;
        }
        if (this.f124127o == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (cVar.f124127o == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 != z8) {
            return false;
        }
        if (this.f124115h == null ? cVar.f124115h != null : !this.f124115h.equals(cVar.f124115h)) {
            return false;
        }
        if (((AbstractC54171b) this).f124116i == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (((AbstractC54171b) cVar).f124116i == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 != z10) {
            return false;
        }
        if (((AbstractC54171b) this).f124117j == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (((AbstractC54171b) cVar).f124117j == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 != z12) {
            return false;
        }
        if (((AbstractC54171b) this).f124118k == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (((AbstractC54171b) cVar).f124118k == null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z13 != z14) {
            return false;
        }
        return true;
    }

    public C54175c(C54186b bVar, Context context, AbstractC46519p pVar, GiphyViewModel giphyViewModel) {
        super(bVar, context, pVar, giphyViewModel);
    }
}
