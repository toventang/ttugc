package com.p2082ss.android.ugc.aweme.sticker.types.multi;

import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75498c;
import com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75575k;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75633m;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.AbstractC75620c;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75619b;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75621d;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76151g;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.multi.c */
public final class C76097c implements AbstractC75498c, AbstractC75576l, AbstractC75633m {

    /* renamed from: a */
    public C76100d f170971a;

    /* renamed from: b */
    private Effect f170972b;

    /* renamed from: c */
    private C75618a f170973c;

    /* renamed from: d */
    private boolean f170974d = true;

    /* renamed from: e */
    private boolean f170975e;

    /* renamed from: f */
    private final ActivityC0945e f170976f;

    /* renamed from: g */
    private final AbstractC75655o f170977g;

    /* renamed from: h */
    private final AbstractC75429h f170978h;

    /* renamed from: i */
    private final AbstractC76151g f170979i;

    /* renamed from: j */
    private final C75575k f170980j;

    /* renamed from: k */
    private final AbstractC76096b f170981k;

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.multi.c$a */
    static final class C76099a implements AbstractC76105i {

        /* renamed from: a */
        public static final C76099a f170983a = new C76099a();

        static {
            Covode.recordClassIndex(89046);
        }

        C76099a() {
        }
    }

    static {
        Covode.recordClassIndex(89044);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
    /* renamed from: b */
    public final void mo23177b(AbstractC75576l.EnumC75577a aVar) {
        C89219l.m154721d(aVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
    public final void cD_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75498c
    /* renamed from: b */
    public final boolean mo118933b() {
        return this.f170975e;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75498c
    /* renamed from: d */
    public final void mo118935d() {
        m133448g();
    }

    /* renamed from: e */
    private final void m133446e() {
        C76100d dVar = this.f170971a;
        if (dVar != null) {
            dVar.mo119770c();
        }
        this.f170972b = null;
        this.f170973c = null;
        m133448g();
    }

    /* renamed from: f */
    private final void m133447f() {
        C76100d dVar = this.f170971a;
        if (dVar != null) {
            dVar.mo119768a();
            this.f170975e = true;
        }
    }

    /* renamed from: g */
    private final void m133448g() {
        C76100d dVar = this.f170971a;
        if (dVar != null) {
            dVar.mo119769b();
            this.f170975e = false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75498c
    /* renamed from: c */
    public final void mo118934c() {
        if (C89219l.m154714a(this.f170977g.mo119294f(), this.f170972b)) {
            m133447f();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
    /* renamed from: a */
    public final void mo23176a(AbstractC75576l.EnumC75577a aVar) {
        C89219l.m154721d(aVar, "");
        if (!this.f170975e && C75466g.m132373y(this.f170972b)) {
            mo118934c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
    /* renamed from: a */
    public final void mo23175a(View view) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(view, "");
        C76100d dVar = new C76100d(this.f170976f, view, this.f170977g, this.f170979i, this.f170981k, this.f170980j, C76099a.f170983a);
        this.f170971a = dVar;
        dVar.mo119831a(this.f170978h);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75633m
    /* renamed from: a */
    public final C75619b mo23184a(AbstractC75620c cVar, AbstractC75633m.AbstractC75634a aVar) {
        List<String> children;
        int i;
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(aVar, "");
        C75619b a = aVar.mo119345a(cVar);
        if (cVar instanceof C75618a) {
            C75618a aVar2 = (C75618a) cVar;
            if (C75466g.m132373y(aVar2.f170022a)) {
                Effect effect = aVar2.f170022a;
                this.f170973c = aVar2;
                C76100d dVar = this.f170971a;
                if (dVar != null) {
                    dVar.mo119770c();
                }
                this.f170981k.mo119826a(effect);
                List list = (List) this.f170981k.mo120100l().getValue();
                if (this.f170974d) {
                    if (list != null && !list.isEmpty() && this.f170977g.mo119296h() != null) {
                        int size = list.size();
                        i = 0;
                        while (true) {
                            if (i >= size) {
                                break;
                            }
                            String id = ((com.p2082ss.ugc.effectplatform.model.Effect) list.get(i)).getId();
                            Effect h = this.f170977g.mo119296h();
                            if (h == null) {
                                C89219l.m154715b();
                            }
                            if (TextUtils.equals(id, h.getId())) {
                                break;
                            }
                            i++;
                        }
                    }
                    i = 0;
                    C76100d dVar2 = this.f170971a;
                    if (dVar2 != null) {
                        dVar2.mo119830a(i);
                    }
                    this.f170974d = false;
                } else {
                    C76100d dVar3 = this.f170971a;
                    if (dVar3 != null) {
                        dVar3.mo119830a(0);
                    }
                }
                m133447f();
                this.f170972b = effect;
            } else if (this.f170972b != null) {
                Effect effect2 = aVar2.f170022a;
                Effect effect3 = this.f170972b;
                if (effect3 == null || (children = effect3.getChildren()) == null || !children.contains(effect2.getEffectId())) {
                    m133446e();
                }
            }
        } else if ((cVar instanceof C75621d) && this.f170972b != null) {
            m133446e();
        }
        return a;
    }

    public C76097c(ActivityC0945e eVar, AbstractC75655o oVar, AbstractC75429h hVar, AbstractC76151g gVar, C75575k kVar, AbstractC76096b bVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(bVar, "");
        this.f170976f = eVar;
        this.f170977g = oVar;
        this.f170978h = hVar;
        this.f170979i = gVar;
        this.f170980j = kVar;
        this.f170981k = bVar;
        bVar.mo120100l().observe(eVar, new AbstractC1214u<List<? extends Effect>>(this) {
            /* class com.p2082ss.android.ugc.aweme.sticker.types.multi.C76097c.C760981 */

            /* renamed from: a */
            final /* synthetic */ C76097c f170982a;

            static {
                Covode.recordClassIndex(89045);
            }

            {
                this.f170982a = r1;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.ss.android.ugc.aweme.sticker.types.multi.d */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(List<? extends Effect> list) {
                List<? extends Effect> list2 = list;
                C76100d dVar = this.f170982a.f170971a;
                if (dVar != 0) {
                    dVar.mo119832a((List<Effect>) list2);
                }
            }
        });
    }
}
