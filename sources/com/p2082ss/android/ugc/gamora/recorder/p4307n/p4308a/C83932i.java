package com.p2082ss.android.ugc.gamora.recorder.p4307n.p4308a;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2559g;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.tux.tooltip.EnumC23352h;
import com.bytedance.tux.tooltip.p1727a.p1729b.C23329a;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.C37407j;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.net.C37426a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.property.C65412cv;
import com.p2082ss.android.ugc.aweme.property.C65426di;
import com.p2082ss.android.ugc.aweme.property.C65499v;
import com.p2082ss.android.ugc.aweme.shortvideo.C69838ap;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.C71812ep;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.gamora.recorder.p4307n.C83938b;
import com.p2082ss.android.ugc.gamora.recorder.p4307n.p4308a.AbstractC83906b;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.n.a.i */
public final class C83932i extends AbstractC22219j {

    /* renamed from: c */
    public static final int f187360c = C65426di.m117144a();

    /* renamed from: d */
    public static final C83933a f187361d = new C83933a((byte) 0);

    /* renamed from: a */
    public C83908c f187362a;

    /* renamed from: b */
    public final int f187363b = C71812ep.m126783a(32.0d, C63247i.f143610a);

    /* renamed from: e */
    private RecyclerView f187364e;

    /* renamed from: f */
    private final AbstractC89244h f187365f = C89250i.m154773a((AbstractC89171a) new C83935c(this));

    /* renamed from: g */
    private final AbstractC83906b f187366g;

    /* renamed from: h */
    private final C2559g<Boolean> f187367h;

    /* renamed from: i */
    private final ShortVideoContext f187368i;

    /* renamed from: C */
    private final AbstractC83906b.AbstractC83907a m144362C() {
        return (AbstractC83906b.AbstractC83907a) this.f187365f.getValue();
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.n.a.i$a */
    public static final class C83933a {
        static {
            Covode.recordClassIndex(97824);
        }

        private C83933a() {
        }

        public /* synthetic */ C83933a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.n.a.i$c */
    static final class C83935c extends AbstractC89220m implements AbstractC89171a<C83905a> {

        /* renamed from: a */
        final /* synthetic */ C83932i f187370a;

        static {
            Covode.recordClassIndex(97826);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83935c(C83932i iVar) {
            super(0);
            this.f187370a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C83905a invoke() {
            return new C83905a(new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.gamora.recorder.p4307n.p4308a.C83932i.C83935c.C839361 */

                /* renamed from: a */
                final /* synthetic */ C83935c f187371a;

                static {
                    Covode.recordClassIndex(97827);
                }

                {
                    this.f187371a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    this.f187371a.f187370a.mo128815a().mo128803a(this.f187371a.f187370a.mo128817d());
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: a */
    public final C83908c mo128815a() {
        C83908c cVar = this.f187362a;
        if (cVar == null) {
            C89219l.m154710a("toolbarAdapter");
        }
        return cVar;
    }

    /* renamed from: b */
    public final void mo128816b() {
        View D = m144363D();
        if (D != null && D.getVisibility() == 0) {
            m144364a(D);
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        this.f187366g.mo128797b(m144362C());
    }

    static {
        Covode.recordClassIndex(97823);
    }

    /* renamed from: d */
    public final List<C83938b> mo128817d() {
        return C83937j.m144373a(this.f187366g.mo128791a(), this.f187366g.mo128799c(), this.f187366g.mo128796b());
    }

    /* renamed from: D */
    private final View m144363D() {
        int i = 0;
        for (T t : this.f187366g.mo128791a()) {
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            if (t.f187373a != 11) {
                i = i2;
            } else if (i >= this.f187366g.mo128799c() - 1) {
                RecyclerView recyclerView = this.f187364e;
                if (recyclerView == null) {
                    C89219l.m154710a("toolbarRecyclerView");
                }
                return recyclerView.getChildAt(this.f187366g.mo128799c() - 1);
            } else {
                RecyclerView recyclerView2 = this.f187364e;
                if (recyclerView2 == null) {
                    C89219l.m154710a("toolbarRecyclerView");
                }
                return recyclerView2.getChildAt(i);
            }
        }
        return null;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.n.a.i$b */
    static final class C83934b<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83932i f187369a;

        static {
            Covode.recordClassIndex(97825);
        }

        C83934b(C83932i iVar) {
            this.f187369a = iVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            if (obj != null) {
                View view = this.f187369a.f52550n;
                C89219l.m154716b(view, "");
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                int i = this.f187369a.f187363b;
                Activity activity = this.f187369a.f52549m;
                if (activity == null) {
                    C89219l.m154715b();
                }
                layoutParams2.topMargin = i + C70636dh.m124833c(activity);
                View view2 = this.f187369a.f52550n;
                C89219l.m154716b(view2, "");
                view2.setLayoutParams(layoutParams2);
                StringBuilder append = new StringBuilder("receive topMarginUpdate in RecordToolbarScene,now margin is:").append(layoutParams2.topMargin).append(",top is:");
                View view3 = this.f187369a.f52550n;
                C89219l.m154716b(view3, "");
                C84911q.m145921a(append.append(view3.getTop()).toString());
            }
        }
    }

    /* renamed from: a */
    private final void m144364a(View view) {
        boolean z;
        int i;
        String str;
        if (!C65499v.m117224b() || !C37426a.m75470b() || !C37426a.m75469a()) {
            z = true;
        } else {
            z = false;
        }
        if (!C65499v.m117226d() && z && C37407j.C37408a.m75451b()) {
            if (C65412cv.m117131e()) {
                i = R.string.f3r;
            } else {
                i = R.string.bvy;
            }
            Context s = mo36485s();
            C89219l.m154716b(s, "");
            C23329a aVar = (C23329a) new C23329a(s).mo38041b(view).mo38034a(EnumC23352h.START);
            Context r = mo36484r();
            if (r == null || (str = r.getString(i)) == null) {
                str = "";
            }
            C89219l.m154716b(str, "");
            C23329a a = aVar.mo38022a(str);
            Context s2 = mo36485s();
            C89219l.m154716b(s2, "");
            a.mo38028a(s2.getResources().getColor(R.color.bm)).mo38030a(5000L).mo38012d().mo38001a();
            C80322d.m139251a("reply_tooltip_show", new C84425b().mo129406a("shoot_way", this.f187368i.f155831p).mo129406a("enter_from", "video_shoot_page").mo129406a("creation_id", this.f187368i.f155830o).mo129406a("user_id", C63244g.m114602a().mo73255A().mo93904c()).mo129406a("content_source", "shoot").mo129406a("content_type", "video").f188764a);
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        View c = mo36475c(R.id.dgu);
        C89219l.m154716b(c, "");
        RecyclerView recyclerView = (RecyclerView) c;
        this.f187364e = recyclerView;
        if (recyclerView == null) {
            C89219l.m154710a("toolbarRecyclerView");
        }
        mo36486t();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.f187362a = new C83908c(mo128817d());
        RecyclerView recyclerView2 = this.f187364e;
        if (recyclerView2 == null) {
            C89219l.m154710a("toolbarRecyclerView");
        }
        C83908c cVar = this.f187362a;
        if (cVar == null) {
            C89219l.m154710a("toolbarAdapter");
        }
        recyclerView2.setAdapter(cVar);
        C69838ap apVar = new C69838ap(mo36486t());
        Drawable a = C0643b.m2369a(mo36486t(), (int) R.drawable.h9);
        if (a == null) {
            C89219l.m154715b();
        }
        apVar.mo4960a(a);
        RecyclerView recyclerView3 = this.f187364e;
        if (recyclerView3 == null) {
            C89219l.m154710a("toolbarRecyclerView");
        }
        recyclerView3.mo4402a(apVar);
        RecyclerView recyclerView4 = this.f187364e;
        if (recyclerView4 == null) {
            C89219l.m154710a("toolbarRecyclerView");
        }
        recyclerView4.setItemAnimator(null);
        this.f187367h.mo6997a(this, new C83934b(this));
        this.f187366g.mo128793a(m144362C());
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.bi6, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    public C83932i(AbstractC83906b bVar, C2559g<Boolean> gVar, ShortVideoContext shortVideoContext) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(shortVideoContext, "");
        this.f187366g = bVar;
        this.f187367h = gVar;
        this.f187368i = shortVideoContext;
    }
}
