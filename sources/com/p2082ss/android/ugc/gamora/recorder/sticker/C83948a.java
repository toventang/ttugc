package com.p2082ss.android.ugc.gamora.recorder.sticker;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.ActivityC0218d;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.tooltip.AbstractC17256a;
import com.bytedance.ies.dmt.p1194ui.tooltip.C17257b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72847c;
import com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75619b;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.C76238b;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractC76268d;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a */
public final class C83948a extends AbstractC75614b implements AbstractC75576l {

    /* renamed from: a */
    public AbstractC17256a f187402a;

    /* renamed from: b */
    private Effect f187403b;

    /* renamed from: c */
    private View f187404c;

    /* renamed from: d */
    private final ActivityC0218d f187405d;

    /* renamed from: e */
    private final AbstractC89171a<Boolean> f187406e;

    static {
        Covode.recordClassIndex(97841);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final void mo23210a() {
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
    /* renamed from: a */
    public final void mo23176a(AbstractC75576l.EnumC75577a aVar) {
        C89219l.m154721d(aVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
    /* renamed from: b */
    public final void mo23177b(AbstractC75576l.EnumC75577a aVar) {
        C89219l.m154721d(aVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
    public final void cD_() {
        AbstractC17256a aVar;
        AbstractC17256a aVar2 = this.f187402a;
        if (aVar2 != null && aVar2.isShowing() && (aVar = this.f187402a) != null) {
            aVar.dismiss();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
    /* renamed from: a */
    public final void mo23175a(View view) {
        C89219l.m154721d(view, "");
        this.f187404c = view;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a$a */
    static final class View$OnClickListenerC83949a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C83948a f187407a;

        static {
            Covode.recordClassIndex(97842);
        }

        View$OnClickListenerC83949a(C83948a aVar) {
            this.f187407a = aVar;
        }

        public final void onClick(View view) {
            AbstractC17256a aVar;
            ClickAgent.onClick(view);
            AbstractC17256a aVar2 = this.f187407a.f187402a;
            if (aVar2 != null && aVar2.isShowing() && (aVar = this.f187407a.f187402a) != null) {
                aVar.dismiss();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007b, code lost:
        if (p4600h.p4611f.p4613b.C89219l.m154714a((java.lang.Object) r1, (java.lang.Object) r0) != false) goto L_0x000f;
     */
    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo23213a(com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.C75618a r6) {
        /*
        // Method dump skipped, instructions count: 140
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.recorder.sticker.C83948a.mo23213a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.a):boolean");
    }

    public C83948a(ActivityC0218d dVar, AbstractC89171a<Boolean> aVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(aVar, "");
        this.f187405d = dVar;
        this.f187406e = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.presenter.handler.AbstractC75614b
    /* renamed from: a */
    public final void mo23212a(C75619b bVar, C75618a aVar) {
        int i;
        ViewPager viewPager;
        PagerAdapter pagerAdapter;
        Map<Integer, AbstractC76268d<Fragment>> map;
        AbstractC76268d<Fragment> dVar;
        View view;
        RecyclerView recyclerView;
        RecyclerView.AbstractC1362i layoutManager;
        View c;
        float f;
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        Effect effect = aVar.f170022a;
        this.f187403b = effect;
        if (C72847c.m128627a(effect)) {
            i = R.string.d_g;
        } else {
            i = R.string.d_h;
        }
        View view2 = this.f187404c;
        if (view2 != null) {
            viewPager = (ViewPager) view2.findViewById(R.id.fgr);
            if (viewPager != null) {
                pagerAdapter = viewPager.getAdapter();
            }
            pagerAdapter = null;
        } else {
            viewPager = null;
            pagerAdapter = null;
        }
        if (!(pagerAdapter instanceof C76238b.C76239a)) {
            pagerAdapter = null;
        }
        C76238b.C76239a aVar2 = (C76238b.C76239a) pagerAdapter;
        if (aVar2 != null && (map = aVar2.f171263b) != null && (dVar = map.get(Integer.valueOf(viewPager.getCurrentItem()))) != null && (view = dVar.mo119984l().getView()) != null && (recyclerView = (RecyclerView) view.findViewById(R.id.e93)) != null && (layoutManager = recyclerView.getLayoutManager()) != null && (c = layoutManager.mo4358c(aVar.f170023b)) != null) {
            C89219l.m154716b(c, "");
            if (aVar.f170023b % 5 == 1 || aVar.f170023b % 5 == 2) {
                f = C84912r.m145930a(this.f187405d, 12.0f);
            } else {
                f = C84912r.m145930a(this.f187405d, 22.0f);
            }
            Context context = c.getContext();
            C89219l.m154716b(context, "");
            C17257b a = new C17257b(context).mo27358b(48).mo27354a(c).mo27352a(3000L).mo27351a(i);
            a.f41226a.f41243l = (int) f;
            AbstractC17256a a2 = a.mo27353a(new View$OnClickListenerC83949a(this)).mo27350a();
            this.f187402a = a2;
            if (a2 != null) {
                a2.mo27341a();
            }
        }
    }
}
