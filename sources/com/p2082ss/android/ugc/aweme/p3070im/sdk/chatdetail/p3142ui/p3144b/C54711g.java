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
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3140b.p3141a.C54610b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.p3144b.AbstractC54703f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.g */
public class C54711g extends AbstractC54703f implements AbstractC1975v<AbstractC54703f.C54705b> {

    /* renamed from: m */
    private AbstractC1916af<C54711g, AbstractC54703f.C54705b> f125396m;

    /* renamed from: n */
    private AbstractC1918ah<C54711g, AbstractC54703f.C54705b> f125397n;

    /* renamed from: o */
    private AbstractC1920aj<C54711g, AbstractC54703f.C54705b> f125398o;

    /* renamed from: p */
    private AbstractC1919ai<C54711g, AbstractC54703f.C54705b> f125399p;

    static {
        Covode.recordClassIndex(64426);
    }

    /* Return type fixed from 'com.airbnb.epoxy.q' to match base method */
    @Override // com.airbnb.epoxy.AbstractC1973t
    /* renamed from: h */
    public final /* synthetic */ AbstractC54703f.C54705b mo5818h() {
        return new AbstractC54703f.C54705b();
    }

    /* renamed from: i */
    public final C54711g mo91742i() {
        super.mo5785a(-1L);
        return this;
    }

    @Override // com.airbnb.epoxy.AbstractC1956s
    public String toString() {
        return "GroupTitleModel_{viewModel=" + this.f125365h + ", conversationModel=" + ((AbstractC54703f) this).f125366i + ", groupChatDetailModel=" + ((AbstractC54703f) this).f125367j + "}" + super.toString();
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
        int i7 = 0;
        if (this.f125396m != null) {
            i = 1;
        } else {
            i = 0;
        }
        int i8 = (hashCode + i) * 31;
        if (this.f125397n != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i9 = (i8 + i2) * 31;
        if (this.f125398o != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i10 = (i9 + i3) * 31;
        if (this.f125399p == null) {
            i6 = 0;
        }
        int i11 = (i10 + i6) * 31;
        if (this.f125365h != null) {
            i4 = this.f125365h.hashCode();
        } else {
            i4 = 0;
        }
        int i12 = (i11 + i4) * 31;
        if (((AbstractC54703f) this).f125366i != null) {
            i5 = ((AbstractC54703f) this).f125366i.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 31;
        if (((AbstractC54703f) this).f125367j != null) {
            i7 = ((AbstractC54703f) this).f125367j.hashCode();
        }
        return i13 + i7;
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
    public final /* bridge */ /* synthetic */ void mo5817b(AbstractC54703f.C54705b bVar) {
        super.mo5794b((AbstractC1954q) bVar);
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

    /* renamed from: a */
    public final C54711g mo91739a(AbstractC17427b bVar) {
        mo5798e();
        ((AbstractC54703f) this).f125366i = bVar;
        return this;
    }

    /* renamed from: a */
    public final C54711g mo91740a(C54610b bVar) {
        mo5798e();
        ((AbstractC54703f) this).f125367j = bVar;
        return this;
    }

    /* renamed from: a */
    public final C54711g mo91741a(GroupChatDetailViewModel groupChatDetailViewModel) {
        mo5798e();
        this.f125365h = groupChatDetailViewModel;
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
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C54711g) || !super.equals(obj)) {
            return false;
        }
        C54711g gVar = (C54711g) obj;
        if (this.f125396m == null) {
            z = true;
        } else {
            z = false;
        }
        if (gVar.f125396m == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            return false;
        }
        if (this.f125397n == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (gVar.f125397n == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 != z4) {
            return false;
        }
        if (this.f125398o == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (gVar.f125398o == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 != z6) {
            return false;
        }
        if (this.f125399p == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (gVar.f125399p == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 != z8) {
            return false;
        }
        if (this.f125365h == null ? gVar.f125365h != null : !this.f125365h.equals(gVar.f125365h)) {
            return false;
        }
        if (((AbstractC54703f) this).f125366i == null ? ((AbstractC54703f) gVar).f125366i != null : !((AbstractC54703f) this).f125366i.equals(((AbstractC54703f) gVar).f125366i)) {
            return false;
        }
        if (((AbstractC54703f) this).f125367j == null ? ((AbstractC54703f) gVar).f125367j == null : ((AbstractC54703f) this).f125367j.equals(((AbstractC54703f) gVar).f125367j)) {
            return true;
        }
        return false;
    }
}
