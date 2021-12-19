package com.p2082ss.android.ugc.aweme.sticker.presenter.handler;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActivityC0218d;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1181ae;
import com.bytedance.als.C2563k;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75591e;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75619b;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text.ARTextResultModule;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text.AbstractC75955e;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text.C75956f;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text.C75967n;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text.C75971q;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text.C75972r;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text.C75975s;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.utils.AbstractC84903j;
import java.util.ArrayList;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.a */
public final class C75607a extends AbstractC75614b implements AbstractC75576l, AbstractC75591e {

    /* renamed from: a */
    public final C2563k<C89391z> f169993a = new C2563k<>();

    /* renamed from: b */
    private boolean f169994b;

    /* renamed from: c */
    private Effect f169995c;

    /* renamed from: d */
    private final C75975s f169996d;

    /* renamed from: e */
    private final ActivityC0218d f169997e;

    /* renamed from: f */
    private final AbstractC75655o f169998f;

    /* renamed from: g */
    private final AbstractC75955e f169999g;

    /* renamed from: h */
    private final AbstractC89171a<ViewGroup> f170000h;

    /* renamed from: i */
    private final C75972r.AbstractC75974b f170001i;

    /* renamed from: j */
    private final AbstractC84903j f170002j;

    /* renamed from: k */
    private final AbstractC89171a<Integer> f170003k;

    static {
        Covode.recordClassIndex(88538);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
    /* renamed from: a */
    public final void mo23175a(View view) {
        C89219l.m154721d(view, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
    public final void cD_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final void mo23210a() {
        MethodCollector.m26663i(5320);
        this.f169995c = null;
        this.f169996d.mo119657a();
        ViewGroup invoke = this.f170000h.invoke();
        if (invoke != null) {
            ArrayList<View> arrayList = new ArrayList();
            int childCount = invoke.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = invoke.getChildAt(i);
                if (childAt instanceof C75967n) {
                    arrayList.add(childAt);
                }
            }
            for (View view : arrayList) {
                invoke.removeView(view);
            }
            arrayList.clear();
            MethodCollector.m26664o(5320);
            return;
        }
        MethodCollector.m26664o(5320);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
    /* renamed from: a */
    public final void mo23176a(AbstractC75576l.EnumC75577a aVar) {
        C89219l.m154721d(aVar, "");
        this.f169994b = true;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final boolean mo23213a(C75618a aVar) {
        C89219l.m154721d(aVar, "");
        return C75466g.m132360l(aVar.f170022a);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
    /* renamed from: b */
    public final void mo23177b(AbstractC75576l.EnumC75577a aVar) {
        Effect effect;
        C89219l.m154721d(aVar, "");
        this.f169994b = false;
        if (aVar == AbstractC75576l.EnumC75577a.AFTER_ANIMATE && (effect = this.f169995c) != null) {
            this.f169996d.mo119659a(effect);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final void mo23212a(C75619b bVar, C75618a aVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        this.f169995c = aVar.f170022a;
        AbstractC75955e eVar = this.f169999g;
        String a = C75956f.m133180a(this.f169997e);
        C89219l.m154716b(a, "");
        eVar.mo119402a(a);
        ViewGroup invoke = this.f170000h.invoke();
        if (invoke != null) {
            this.f169996d.mo119658a(this.f170001i, this.f169997e, invoke, this.f170003k);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75591e
    /* renamed from: a */
    public final void mo23211a(int i, int i2, int i3, String str) {
        if (i == 32 || i == 33) {
            if (!this.f169994b || ((this.f169998f.mo119288a() && this.f169994b) || (this.f169998f.mo119290b() && this.f169994b))) {
                if (!this.f169994b) {
                    this.f169993a.mo7000b(C89391z.f203057a);
                }
                AbstractC1174ac a = C1181ae.m3880a((ActivityC0945e) this.f169997e).mo3983a(ARTextResultModule.class);
                C89219l.m154716b(a, "");
                ((ARTextResultModule) a).mo119610a().postValue(new C75971q(i, i2, i3, str));
            } else {
                ((ARTextResultModule) C1181ae.m3880a((ActivityC0945e) this.f169997e).mo3983a(ARTextResultModule.class)).mo119611b().postValue(new C75971q(i, i2, i3, str));
            }
        }
        if (i == 17) {
            this.f169996d.mo119660b();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.a<? extends android.view.ViewGroup> */
    /* JADX WARN: Multi-variable type inference failed */
    public C75607a(ActivityC0218d dVar, AbstractC75655o oVar, AbstractC75955e eVar, AbstractC89171a<? extends ViewGroup> aVar, C75972r.AbstractC75974b bVar, AbstractC84903j jVar, AbstractC89171a<Integer> aVar2) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(aVar2, "");
        this.f169997e = dVar;
        this.f169998f = oVar;
        this.f169999g = eVar;
        this.f170000h = aVar;
        this.f170001i = bVar;
        this.f170002j = jVar;
        this.f170003k = aVar2;
        this.f169996d = new C75975s(dVar, oVar, eVar, jVar);
    }
}
