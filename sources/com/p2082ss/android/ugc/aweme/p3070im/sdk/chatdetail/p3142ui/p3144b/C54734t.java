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
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.t */
public class C54734t extends AbstractC54732s implements AbstractC1975v<View> {

    /* renamed from: i */
    private AbstractC1916af<C54734t, View> f125462i;

    /* renamed from: j */
    private AbstractC1918ah<C54734t, View> f125463j;

    /* renamed from: k */
    private AbstractC1920aj<C54734t, View> f125464k;

    /* renamed from: l */
    private AbstractC1919ai<C54734t, View> f125465l;

    static {
        Covode.recordClassIndex(64449);
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    public String toString() {
        return "SimpleStaticModel_{}" + super.toString();
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int hashCode = super.hashCode() * 31;
        int i5 = 1;
        if (this.f125462i != null) {
            i = 1;
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 31;
        if (this.f125463j != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        if (this.f125464k != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        if (this.f125465l != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        if (this.f125460h == null) {
            i5 = 0;
        }
        return i9 + i5;
    }

    /* Return type fixed from 'com.airbnb.epoxy.s' to match base method */
    @Override // com.airbnb.epoxy.AbstractC1956s
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC1956s<View> mo5784a(int i) {
        super.mo5784a(i);
        return this;
    }

    /* renamed from: b */
    public final C54734t mo91777b(long j) {
        super.mo5785a(j);
        return this;
    }

    /* renamed from: d */
    public final C54734t mo91778d(int i) {
        super.mo5784a(i);
        return this;
    }

    /* Return type fixed from 'com.airbnb.epoxy.s' to match base method */
    @Override // com.airbnb.epoxy.AbstractC1956s
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC1956s<View> mo5785a(long j) {
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

    /* Return type fixed from 'com.airbnb.epoxy.s' to match base method */
    @Override // com.airbnb.epoxy.AbstractC1956s
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC1956s<View> mo5786a(CharSequence charSequence) {
        super.mo5786a(charSequence);
        return this;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.airbnb.epoxy.AbstractC1956s
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo5794b(View view) {
        super.mo5794b(view);
    }

    /* renamed from: a */
    public final C54734t mo91776a(AbstractC89171a<C89391z> aVar) {
        mo5798e();
        this.f125460h = aVar;
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
        if (!(obj instanceof C54734t) || !super.equals(obj)) {
            return false;
        }
        C54734t tVar = (C54734t) obj;
        if (this.f125462i == null) {
            z = true;
        } else {
            z = false;
        }
        if (tVar.f125462i == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            return false;
        }
        if (this.f125463j == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (tVar.f125463j == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 != z4) {
            return false;
        }
        if (this.f125464k == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (tVar.f125464k == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 != z6) {
            return false;
        }
        if (this.f125465l == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (tVar.f125465l == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 != z8) {
            return false;
        }
        if (this.f125460h == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (tVar.f125460h == null) {
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
