package com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.event;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterAdapter;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.event.Logger */
public final class Logger implements AbstractC33974au {

    /* renamed from: a */
    public String f104065a = "";

    /* renamed from: b */
    public final AbstractC1196i f104066b;

    /* renamed from: c */
    private AbstractC44600c f104067c;

    /* renamed from: d */
    private AbstractC44600c f104068d;

    /* renamed from: e */
    private OrderCenterAdapter.C44590c f104069e;

    static {
        Covode.recordClassIndex(52962);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public final void onCreate() {
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_CREATE) {
            onCreate();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public final void onPause() {
        AbstractC44600c cVar = this.f104067c;
        if (cVar != null) {
            cVar.mo75664c().mo76747d();
            this.f104067c = null;
        }
        AbstractC44600c cVar2 = this.f104068d;
        if (cVar2 != null) {
            cVar2.mo75664c().mo76747d();
            this.f104068d = null;
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void onResume() {
        new C44604e().mo75661a(this.f104065a).mo76747d();
        if (this.f104067c == null) {
            this.f104067c = new C44606f().mo75661a(this.f104065a).mo75662b();
        }
    }

    public Logger(AbstractC1196i iVar) {
        C89219l.m154721d(iVar, "");
        this.f104066b = iVar;
        iVar.mo4012a(this);
    }

    /* renamed from: a */
    public final void mo75657a(OrderCenterAdapter.C44590c cVar) {
        C89219l.m154721d(cVar, "");
        if (this.f104068d != null && (!C89219l.m154714a(cVar, this.f104069e))) {
            AbstractC44600c cVar2 = this.f104068d;
            if (cVar2 == null) {
                C89219l.m154715b();
            }
            cVar2.mo75664c().mo76747d();
            this.f104068d = null;
        }
        this.f104069e = cVar;
        new C44608g().mo75661a(this.f104065a).mo75663b(cVar.f104048b).mo75665c(cVar.f104050d).mo76747d();
        if (this.f104068d == null) {
            this.f104068d = new C44610h().mo75661a(this.f104065a).mo75663b(cVar.f104048b).mo75665c(cVar.f104050d).mo75662b();
        }
    }
}
