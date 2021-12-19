package com.p2082ss.android.ugc.aweme.sticker.p3954d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3955a.AbstractC75284a;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3955a.AbstractC75292d;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3956b.AbstractC75296b;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3956b.C75297c;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3956b.C75298d;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3956b.EnumC75295a;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75342a;
import com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75374c;
import com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75380g;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75650j;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75621d;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.C75691ac;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.d.a */
public final class C75281a implements AbstractC75300d {

    /* renamed from: a */
    public final AbstractC75299c f169247a;

    /* renamed from: b */
    public final List<AbstractC75292d> f169248b;

    /* renamed from: c */
    public final AbstractC75655o f169249c;

    /* renamed from: d */
    private final List<AbstractC75301e> f169250d;

    static {
        Covode.recordClassIndex(88183);
    }

    /* renamed from: a */
    private final AbstractC75650j m132074a() {
        return this.f169249c.mo119302n();
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.d.a$b */
    public static final class C75283b implements AbstractC75374c.AbstractC75376b {

        /* renamed from: a */
        final /* synthetic */ C75281a f169253a;

        /* renamed from: b */
        final /* synthetic */ C75297c f169254b;

        static {
            Covode.recordClassIndex(88185);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75374c.AbstractC75376b
        /* renamed from: a */
        public final void mo118622a() {
            AbstractC75374c.AbstractC75376b bVar = this.f169254b.f169286g;
            if (bVar != null) {
                bVar.mo118622a();
            }
            if (this.f169253a.f169247a.mo118629a(this.f169254b.f169280a, this.f169253a.f169249c)) {
                List<AbstractC75292d> list = this.f169253a.f169248b;
                ArrayList arrayList = new ArrayList();
                for (T t : list) {
                    if (t instanceof AbstractC75284a) {
                        arrayList.add(t);
                    }
                }
                ArrayList<AbstractC75284a> arrayList2 = arrayList;
                if (!arrayList2.isEmpty()) {
                    for (AbstractC75284a aVar : arrayList2) {
                        if (aVar.mo118624a(this.f169254b)) {
                            return;
                        }
                    }
                }
                this.f169253a.mo118616b(this.f169254b);
            }
        }

        C75283b(C75281a aVar, C75297c cVar) {
            this.f169253a = aVar;
            this.f169254b = cVar;
        }
    }

    public /* synthetic */ C75281a(AbstractC75655o oVar) {
        this(oVar, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.d.a$a */
    public static final class C75282a implements AbstractC75380g {

        /* renamed from: a */
        final /* synthetic */ C75281a f169251a;

        /* renamed from: b */
        final /* synthetic */ C75297c f169252b;

        static {
            Covode.recordClassIndex(88184);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75374c.AbstractC75375a
        /* renamed from: c */
        public final void mo118621c(Effect effect) {
            AbstractC75374c.AbstractC75375a aVar = this.f169252b.f169285f;
            if (aVar != null) {
                aVar.mo118621c(effect);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75374c.AbstractC75375a
        /* renamed from: b */
        public final void mo118620b(Effect effect) {
            AbstractC75374c.AbstractC75375a aVar = this.f169252b.f169285f;
            if (aVar != null) {
                aVar.mo118620b(effect);
            }
            this.f169251a.mo118614a(this.f169252b);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75380g
        /* renamed from: a */
        public final void mo118617a(Effect effect) {
            if (this.f169252b.f169285f instanceof AbstractC75380g) {
                ((AbstractC75380g) this.f169252b.f169285f).mo118617a(effect);
            } else {
                AbstractC75374c.AbstractC75375a aVar = this.f169252b.f169285f;
                if (aVar != null) {
                    aVar.mo118620b(effect);
                }
            }
            this.f169251a.mo118614a(this.f169252b);
        }

        C75282a(C75281a aVar, C75297c cVar) {
            this.f169251a = aVar;
            this.f169252b = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75374c.AbstractC75375a
        /* renamed from: a */
        public final void mo118618a(Effect effect, int i) {
            AbstractC75374c.AbstractC75375a aVar = this.f169252b.f169285f;
            if (aVar != null) {
                aVar.mo118618a(effect, i);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75374c.AbstractC75375a
        /* renamed from: a */
        public final void mo118619a(Effect effect, ExceptionResult exceptionResult) {
            AbstractC75374c.AbstractC75375a aVar = this.f169252b.f169285f;
            if (aVar != null) {
                aVar.mo118619a(effect, exceptionResult);
            }
        }
    }

    /* renamed from: a */
    private static boolean m132075a(Effect effect) {
        if (effect.getEffectType() == 1 || effect.getEffectType() == 2 || effect.getEffectType() == -1) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75300d
    /* renamed from: a */
    public final void mo118612a(AbstractC75292d dVar) {
        C89219l.m154721d(dVar, "");
        if (!this.f169248b.contains(dVar)) {
            this.f169248b.add(dVar);
        }
    }

    /* renamed from: a */
    public final void mo118614a(C75297c cVar) {
        if (cVar.f169288i) {
            C75283b bVar = new C75283b(this, cVar);
            if (m132075a(cVar.f169280a) || !this.f169249c.mo118905a(cVar.f169280a)) {
                bVar.mo118622a();
            } else {
                this.f169249c.mo118904a(cVar.f169280a, bVar);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75300d
    /* renamed from: a */
    public final <T> void mo118613a(AbstractC75296b<T> bVar) {
        C89219l.m154721d(bVar, "");
        List<AbstractC75292d> list = this.f169248b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!(!it.next().mo118624a(bVar))) {
                    return;
                }
            }
        }
        if (bVar instanceof C75298d) {
            this.f169249c.mo119302n().mo119324b(null);
            C75298d dVar = (C75298d) bVar;
            Effect effect = dVar.f169290a;
            m132074a().mo119321a((Effect) null);
            if (!m132074a().mo119326c(effect)) {
                Iterator<T> it2 = this.f169250d.iterator();
                while (it2.hasNext()) {
                    it2.next().mo87552a(new C75621d(effect, dVar.f169291b, dVar.f169292c, dVar.f169293d, (byte) 0));
                }
            }
        } else if (bVar instanceof C75297c) {
            C75297c cVar = (C75297c) bVar;
            this.f169249c.mo119302n().mo119324b(cVar.f169280a);
            C75282a aVar = new C75282a(this, cVar);
            if (m132075a(cVar.f169280a)) {
                aVar.mo118620b(cVar.f169280a);
            } else {
                this.f169249c.mo119282a(new C75691ac(cVar.f169280a), aVar);
            }
        }
    }

    /* renamed from: b */
    public final void mo118616b(C75297c cVar) {
        Effect g;
        Effect effect = cVar.f169280a;
        int i = cVar.f169281b;
        if (C75466g.m132340D(effect) && (g = this.f169249c.mo119295g()) != null && !C75466g.m132345a(g) && (TextUtils.isEmpty(g.getParentId()) || (!C89219l.m154714a((Object) g.getParentId(), (Object) effect.getParentId())))) {
            mo118613a(C75342a.m132144a(EnumC75295a.MANUAL_SET));
            this.f169249c.mo119302n().mo119324b(effect);
        }
        if (m132074a().mo119326c(effect)) {
            m132074a().mo119322a(effect, i);
        } else {
            m132074a().mo119321a(effect);
        }
        C75618a aVar = new C75618a(effect, i, cVar.f169282c, cVar.f169284e);
        this.f169249c.mo119302n().mo119320a(aVar);
        Iterator<T> it = this.f169250d.iterator();
        while (it.hasNext()) {
            it.next().mo87551a(aVar);
        }
        Effect effect2 = cVar.f169283d;
        if (effect2 != null) {
            this.f169249c.mo119282a(new C75691ac(effect2), (AbstractC75374c.AbstractC75375a) null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75300d
    /* renamed from: a */
    public final void mo118615a(AbstractC75301e eVar) {
        C89219l.m154721d(eVar, "");
        if (!this.f169250d.contains(eVar)) {
            this.f169250d.add(eVar);
        }
    }

    public C75281a(AbstractC75655o oVar, AbstractC75299c cVar) {
        C89219l.m154721d(oVar, "");
        this.f169249c = oVar;
        this.f169247a = cVar == null ? C75294b.f169278a : cVar;
        this.f169250d = new ArrayList();
        this.f169248b = new ArrayList();
    }
}
