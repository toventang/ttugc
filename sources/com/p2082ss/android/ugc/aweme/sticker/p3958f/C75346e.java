package com.p2082ss.android.ugc.aweme.sticker.p3958f;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75300d;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3956b.AbstractC75296b;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.p3956b.EnumC75295a;
import com.p2082ss.android.ugc.aweme.sticker.p3959g.AbstractC75374c;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75466g;
import com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75573i;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3971a.AbstractC75474b;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3971a.C75477e;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75649i;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75626f;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75633m;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.p2082ss.android.ugc.tools.utils.C84892d;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.f.e */
public final class C75346e {
    static {
        Covode.recordClassIndex(88264);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.f.e$a */
    static final class RunnableC75347a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC75649i f169352a;

        /* renamed from: b */
        final /* synthetic */ Effect f169353b;

        static {
            Covode.recordClassIndex(88265);
        }

        RunnableC75347a(AbstractC75649i iVar, Effect effect) {
            this.f169352a = iVar;
            this.f169353b = effect;
        }

        public final void run() {
            Effect effect = this.f169353b;
            if (effect == null) {
                C75346e.m132155a(this.f169352a, C75342a.m132144a(EnumC75295a.MANUAL_SET));
            } else {
                C75346e.m132155a(this.f169352a, C75342a.m132143a(effect, -1, EnumC75295a.MANUAL_SET, null, null, null, null, 0, false, 252));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.f.e$b */
    public static final class C75348b extends AbstractC89220m implements AbstractC89172b<AbstractC75633m, Boolean> {

        /* renamed from: a */
        public static final C75348b f169354a = new C75348b();

        static {
            Covode.recordClassIndex(88266);
        }

        C75348b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(AbstractC75633m mVar) {
            C89219l.m154721d(mVar, "");
            return Boolean.valueOf(mVar instanceof AbstractC75626f);
        }
    }

    /* renamed from: a */
    public static final Effect m132154a(AbstractC75649i iVar) {
        C89219l.m154721d(iVar, "");
        return iVar.mo23167t().mo119294f();
    }

    /* renamed from: b */
    public static final void m132160b(AbstractC75649i iVar) {
        C89219l.m154721d(iVar, "");
        iVar.mo23168u().mo118613a(C75342a.m132144a(EnumC75295a.MANUAL_SET));
    }

    /* renamed from: c */
    public static final boolean m132161c(AbstractC75649i iVar) {
        C89219l.m154721d(iVar, "");
        AbstractC75573i v = iVar.mo23169v();
        if (v == null || !v.mo119140d()) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.f.e$c */
    public static final class C75349c implements IFetchEffectListByIdsListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC75649i f169355a;

        /* renamed from: b */
        final /* synthetic */ AbstractC75343b f169356b = null;

        /* renamed from: c */
        final /* synthetic */ List f169357c;

        /* renamed from: d */
        final /* synthetic */ Effect f169358d;

        /* renamed from: e */
        final /* synthetic */ boolean f169359e;

        /* renamed from: f */
        final /* synthetic */ AbstractC75374c.AbstractC75375a f169360f;

        static {
            Covode.recordClassIndex(88267);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
        public final void onFail(ExceptionResult exceptionResult) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectListResponse effectListResponse) {
            List<Effect> data;
            com.p2082ss.ugc.effectplatform.model.Effect effect;
            int i;
            EffectListResponse effectListResponse2 = effectListResponse;
            if (effectListResponse2 != null && (data = effectListResponse2.getData()) != null && (effect = (com.p2082ss.ugc.effectplatform.model.Effect) C89070n.m154583g((List) data)) != null && !C84892d.m145850a(effect.getChildren())) {
                if (!C84892d.m145850a(effectListResponse2.getCollection())) {
                    this.f169355a.mo23167t().mo119291c().mo119464j().mo119468a(effectListResponse2.getCollection());
                }
                if (!C84892d.m145850a(effectListResponse2.getBindEffects())) {
                    this.f169355a.mo23167t().mo119291c().mo119464j().mo119470b(effectListResponse2.getBindEffects());
                }
                AbstractC75300d u = this.f169355a.mo23168u();
                Effect effect2 = this.f169358d;
                if (this.f169359e) {
                    i = 1;
                } else {
                    i = -1;
                }
                u.mo118613a(C75342a.m132143a(effect2, i, EnumC75295a.MANUAL_SET, null, null, this.f169360f, null, 0, false, 236));
            }
        }

        C75349c(AbstractC75649i iVar, List list, Effect effect, boolean z, AbstractC75374c.AbstractC75375a aVar) {
            this.f169355a = iVar;
            this.f169357c = list;
            this.f169358d = effect;
            this.f169359e = z;
            this.f169360f = aVar;
        }
    }

    /* renamed from: a */
    public static final void m132155a(AbstractC75649i iVar, AbstractC75296b<?> bVar) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(bVar, "");
        iVar.mo23168u().mo118613a(bVar);
    }

    /* renamed from: a */
    public static final void m132156a(AbstractC75649i iVar, Effect effect) {
        C89219l.m154721d(iVar, "");
        iVar.mo23171x().post(new RunnableC75347a(iVar, effect));
    }

    /* renamed from: a */
    public static final void m132157a(AbstractC75649i iVar, List<? extends Effect> list) {
        C89219l.m154721d(iVar, "");
        if (list != null) {
            iVar.mo23167t().mo119291c().mo119464j().mo119468a(list);
        }
    }

    /* renamed from: a */
    public static final void m132158a(AbstractC75649i iVar, List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(list, "");
        iVar.mo23167t().mo119285a(list, map, iFetchEffectListByIdsListener);
    }

    /* renamed from: a */
    public static /* synthetic */ void m132159a(AbstractC75649i iVar, List list, boolean z, boolean z2, AbstractC75374c.AbstractC75375a aVar, int i, Effect effect, int i2) {
        int i3;
        int i4;
        int i5;
        AbstractC75474b c;
        AbstractC75374c.AbstractC75375a aVar2 = aVar;
        int i6 = i;
        Effect effect2 = effect;
        if ((i2 & 16) != 0) {
            aVar2 = null;
        }
        if ((i2 & 32) != 0) {
            i6 = C75344c.m132145a(iVar.mo23167t());
        }
        if ((i2 & 128) != 0) {
            effect2 = (Effect) C89070n.m154583g(list);
        }
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(list, "");
        if (!list.isEmpty()) {
            if (z) {
                iVar.mo23167t().mo119280a(i6, list);
            }
            if (z2 && effect2 != null) {
                AbstractC75573i v = iVar.mo23169v();
                if (!(v == null || (c = v.mo119139c()) == null)) {
                    c.mo119150a(new C75477e(i6, effect2));
                }
                iVar.mo23167t().mo119279a(i6);
                if (C75466g.m132345a(effect2)) {
                    AbstractC75300d u = iVar.mo23168u();
                    if (z) {
                        i5 = 1;
                    } else {
                        i5 = -1;
                    }
                    u.mo118613a(C75342a.m132143a(effect2, i5, EnumC75295a.MANUAL_SET, null, null, aVar2, null, 0, false, 236));
                    return;
                }
                String parentId = effect2.getParentId();
                if (!(parentId == null || parentId.length() == 0)) {
                    iVar.mo23167t().mo119289b(effect2);
                }
                if (!iVar.mo23167t().mo119288a() || C75466g.m132368t(effect2)) {
                    C75466g.m132368t(effect2);
                    AbstractC75300d u2 = iVar.mo23168u();
                    if (z) {
                        i3 = 1;
                    } else {
                        i3 = -1;
                    }
                    u2.mo118613a(C75342a.m132143a(effect2, i3, EnumC75295a.MANUAL_SET, null, null, aVar2, null, 0, false, 236));
                    return;
                }
                String parentId2 = effect2.getParentId();
                if (parentId2 == null || parentId2.length() == 0) {
                    AbstractC75300d u3 = iVar.mo23168u();
                    if (z) {
                        i4 = 1;
                    } else {
                        i4 = -1;
                    }
                    u3.mo118613a(C75342a.m132143a(effect2, i4, EnumC75295a.MANUAL_SET, null, null, aVar2, null, 0, false, 236));
                    return;
                }
                String parentId3 = effect2.getParentId();
                if (parentId3 == null) {
                    C89219l.m154715b();
                }
                m132158a(iVar, C89070n.m154516a(parentId3), null, new C75349c(iVar, list, effect2, z, aVar2));
            }
        }
    }
}
