package com.p2082ss.android.ugc.gamora.recorder.sticker.p4309a;

import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.als.C2560h;
import com.bytedance.als.C2563k;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a;
import com.bytedance.creativex.recorder.p938a.p939a.AbstractC14099a;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.C14171ac;
import com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a;
import com.p2082ss.android.ugc.aweme.beauty.C34805b;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.record.CameraModule;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72847c;
import com.p2082ss.android.ugc.aweme.sticker.AbstractC75275d;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75346e;
import com.p2082ss.android.ugc.aweme.sticker.types.game.p4011a.AbstractC76065a;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.c */
final class C83956c implements AbstractC76065a {

    /* renamed from: a */
    public FilterBean f187423a;

    /* renamed from: b */
    public final ActivityC0945e f187424b;

    /* renamed from: c */
    public final AbstractC14099a f187425c;

    /* renamed from: d */
    public final AbstractC14210a f187426d;

    /* renamed from: e */
    public final ShortVideoContext f187427e;

    /* renamed from: f */
    public final C2563k<AbstractC75275d> f187428f;

    /* renamed from: g */
    private final SafeHandler f187429g;

    /* renamed from: h */
    private final AbstractC14177d f187430h;

    /* renamed from: i */
    private final AbstractC14330a f187431i;

    static {
        Covode.recordClassIndex(97849);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.game.p4011a.AbstractC76065a
    /* renamed from: a */
    public final void mo119791a() {
        this.f187428f.mo6999a(AbstractC75275d.C75280e.f169246a);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.game.p4011a.AbstractC76065a
    /* renamed from: b */
    public final void mo119793b() {
        this.f187428f.mo6999a(AbstractC75275d.C75278c.f169244a);
    }

    /* renamed from: c */
    public final CameraModule mo128838c() {
        return this.f187430h.mo22810c();
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a.c$a */
    static final class RunnableC83957a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C83956c f187432a;

        /* renamed from: b */
        final /* synthetic */ Effect f187433b;

        static {
            Covode.recordClassIndex(97850);
        }

        RunnableC83957a(C83956c cVar, Effect effect) {
            this.f187432a = cVar;
            this.f187433b = effect;
        }

        public final void run() {
            T t;
            AbstractC14210a aVar;
            C2560h<FilterBean> curSelectedFilter;
            this.f187432a.f187428f.mo6999a(new AbstractC75275d.C75277b(this.f187433b));
            View findViewById = this.f187432a.f187424b.findViewById(R.id.dgc);
            C89219l.m154716b(findViewById, "");
            findViewById.setVisibility(8);
            View findViewById2 = this.f187432a.f187424b.findViewById(R.id.c48);
            C89219l.m154716b(findViewById2, "");
            findViewById2.setVisibility(0);
            this.f187432a.mo128838c().mo115025f();
            if (C34805b.m71107a()) {
                this.f187432a.f187425c.mo22651a(this.f187432a.f187427e.f155817b.f155637B);
            }
            this.f187432a.mo128838c().mo115028i();
            C83956c cVar = this.f187432a;
            AbstractC14210a aVar2 = cVar.f187426d;
            if (aVar2 == null || (curSelectedFilter = aVar2.getCurSelectedFilter()) == null) {
                t = null;
            } else {
                t = curSelectedFilter.f7727a.getValue();
            }
            cVar.f187423a = t;
            if (C72847c.m128639e(this.f187433b) && this.f187432a.f187423a != null && (aVar = this.f187432a.f187426d) != null) {
                aVar.clearFilterChosen();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.game.p4011a.AbstractC76065a
    /* renamed from: a */
    public final void mo119792a(Effect effect) {
        C89219l.m154721d(effect, "");
        this.f187429g.post(new RunnableC83957a(this, effect));
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.game.p4011a.AbstractC76065a
    /* renamed from: c */
    public final void mo119795c(Effect effect) {
        C89219l.m154721d(effect, "");
        this.f187428f.mo6999a(new AbstractC75275d.C75279d(effect));
        this.f187431i.mo23126h().mo119310a(effect, true);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.types.game.p4011a.AbstractC76065a
    /* renamed from: b */
    public final void mo119794b(Effect effect) {
        FilterBean filterBean;
        AbstractC14210a aVar;
        C89219l.m154721d(effect, "");
        this.f187428f.mo6999a(new AbstractC75275d.C75276a(effect));
        if (C75346e.m132161c(this.f187431i)) {
            this.f187430h.mo22779a(new C14171ac(false, false, 6));
        } else {
            this.f187430h.mo22779a(new C14171ac(true, false, 6));
        }
        View findViewById = this.f187424b.findViewById(R.id.dgc);
        C89219l.m154716b(findViewById, "");
        findViewById.setVisibility(0);
        View findViewById2 = this.f187424b.findViewById(R.id.c48);
        C89219l.m154716b(findViewById2, "");
        findViewById2.setVisibility(8);
        if (C72847c.m128639e(effect) && (filterBean = this.f187423a) != null && (aVar = this.f187426d) != null) {
            aVar.setFilterChosen(filterBean, null, false, false, false);
        }
    }

    public C83956c(ActivityC0945e eVar, AbstractC14177d dVar, AbstractC14099a aVar, AbstractC14210a aVar2, AbstractC14330a aVar3, ShortVideoContext shortVideoContext, C2563k<AbstractC75275d> kVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar3, "");
        C89219l.m154721d(shortVideoContext, "");
        C89219l.m154721d(kVar, "");
        this.f187424b = eVar;
        this.f187430h = dVar;
        this.f187425c = aVar;
        this.f187426d = aVar2;
        this.f187431i = aVar3;
        this.f187427e = shortVideoContext;
        this.f187428f = kVar;
        this.f187429g = new SafeHandler(eVar);
    }
}
