package com.p2082ss.android.ugc.aweme.ftc.p3040l.p3041a;

import android.app.Activity;
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
import com.p2082ss.android.ugc.aweme.ftc.p3040l.p3041a.AbstractC52708i;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.C69838ap;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.C71812ep;
import com.p2082ss.android.ugc.gamora.recorder.p4307n.C83938b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.l.a.g */
public final class C52702g extends AbstractC22219j {

    /* renamed from: c */
    public static final C52703a f121312c = new C52703a((byte) 0);

    /* renamed from: a */
    public C52685b f121313a;

    /* renamed from: b */
    public final int f121314b = C71812ep.m126783a(32.0d, C63247i.f143610a);

    /* renamed from: d */
    private RecyclerView f121315d;

    /* renamed from: e */
    private final AbstractC89244h f121316e = C89250i.m154773a((AbstractC89171a) new C52705c(this));

    /* renamed from: f */
    private final AbstractC52708i f121317f;

    /* renamed from: g */
    private final C2559g<Boolean> f121318g;

    static {
        Covode.recordClassIndex(62098);
    }

    /* renamed from: b */
    private final AbstractC52708i.AbstractC52709a m97572b() {
        return (AbstractC52708i.AbstractC52709a) this.f121316e.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.l.a.g$a */
    public static final class C52703a {
        static {
            Covode.recordClassIndex(62099);
        }

        private C52703a() {
        }

        public /* synthetic */ C52703a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.l.a.g$c */
    static final class C52705c extends AbstractC89220m implements AbstractC89171a<C52684a> {

        /* renamed from: a */
        final /* synthetic */ C52702g f121320a;

        static {
            Covode.recordClassIndex(62101);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52705c(C52702g gVar) {
            super(0);
            this.f121320a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C52684a invoke() {
            return new C52684a(new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.ftc.p3040l.p3041a.C52702g.C52705c.C527061 */

                /* renamed from: a */
                final /* synthetic */ C52705c f121321a;

                static {
                    Covode.recordClassIndex(62102);
                }

                {
                    this.f121321a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    C52685b bVar = this.f121321a.f121320a.f121313a;
                    if (bVar == null) {
                        C89219l.m154710a("toolbarAdapter");
                    }
                    bVar.mo88370a(this.f121321a.f121320a.mo88389a());
                    return C89391z.f203057a;
                }
            });
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        super.mo22713n_();
        this.f121317f.mo88385b(m97572b());
    }

    /* renamed from: a */
    public final List<C83938b> mo88389a() {
        return C52707h.m97579a(this.f121317f.mo88379a(), this.f121317f.mo88387c(), this.f121317f.mo88384b());
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.l.a.g$b */
    static final class C52704b<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52702g f121319a;

        static {
            Covode.recordClassIndex(62100);
        }

        C52704b(C52702g gVar) {
            this.f121319a = gVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            if (obj != null) {
                View view = this.f121319a.f52550n;
                C89219l.m154716b(view, "");
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                int i = this.f121319a.f121314b;
                Activity activity = this.f121319a.f52549m;
                if (activity == null) {
                    C89219l.m154715b();
                }
                layoutParams2.topMargin = i + C70636dh.m124833c(activity);
                View view2 = this.f121319a.f52550n;
                C89219l.m154716b(view2, "");
                view2.setLayoutParams(layoutParams2);
                StringBuilder append = new StringBuilder("receive topMarginUpdate in RecordToolbarScene,now margin is:").append(layoutParams2.topMargin).append(",top is:");
                View view3 = this.f121319a.f52550n;
                C89219l.m154716b(view3, "");
                C84911q.m145921a(append.append(view3.getTop()).toString());
            }
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        View c = mo36475c(R.id.dgu);
        C89219l.m154716b(c, "");
        RecyclerView recyclerView = (RecyclerView) c;
        this.f121315d = recyclerView;
        if (recyclerView == null) {
            C89219l.m154710a("toolbarRecyclerView");
        }
        mo36486t();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.f121313a = new C52685b(mo88389a());
        RecyclerView recyclerView2 = this.f121315d;
        if (recyclerView2 == null) {
            C89219l.m154710a("toolbarRecyclerView");
        }
        C52685b bVar = this.f121313a;
        if (bVar == null) {
            C89219l.m154710a("toolbarAdapter");
        }
        recyclerView2.setAdapter(bVar);
        C69838ap apVar = new C69838ap(mo36486t());
        Drawable a = C0643b.m2369a(mo36486t(), (int) R.drawable.h9);
        if (a == null) {
            C89219l.m154715b();
        }
        apVar.mo4960a(a);
        RecyclerView recyclerView3 = this.f121315d;
        if (recyclerView3 == null) {
            C89219l.m154710a("toolbarRecyclerView");
        }
        recyclerView3.mo4402a(apVar);
        this.f121318g.mo6997a(this, new C52704b(this));
        this.f121317f.mo88381a(m97572b());
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.a3a, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    public C52702g(AbstractC52708i iVar, C2559g<Boolean> gVar) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(gVar, "");
        this.f121317f = iVar;
        this.f121318g = gVar;
    }
}
