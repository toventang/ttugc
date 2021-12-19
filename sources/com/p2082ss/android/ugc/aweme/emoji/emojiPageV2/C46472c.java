package com.p2082ss.android.ugc.aweme.emoji.emojiPageV2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.AbstractC1204m;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.emoji.emojichoose.AbstractC46519p;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46447a;
import com.p2082ss.android.ugc.aweme.emoji.sysemoji.C46613p;
import com.p2082ss.android.ugc.aweme.emoji.views.SwipeControlledViewPager;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojiPageV2.c */
public final class C46472c {

    /* renamed from: a */
    public final ImageView f108264a;

    /* renamed from: b */
    public final C46477d f108265b;

    /* renamed from: c */
    public final AbstractC1204m f108266c;

    /* renamed from: d */
    public final ViewGroup f108267d;

    /* renamed from: e */
    public final SwipeControlledViewPager f108268e;

    /* renamed from: f */
    public final int f108269f;

    /* renamed from: g */
    public final AbstractC46519p f108270g;

    /* renamed from: h */
    private final AbstractC89244h f108271h = C89250i.m154773a((AbstractC89171a) new C46473a(this));

    /* renamed from: i */
    private final AbstractC89244h f108272i = C89250i.m154773a((AbstractC89171a) new C46476d(this));

    /* renamed from: j */
    private final AbstractC89244h f108273j;

    static {
        Covode.recordClassIndex(55057);
    }

    /* renamed from: a */
    public final View mo78995a() {
        return (View) this.f108271h.getValue();
    }

    /* renamed from: b */
    public final SwipeControlledRecycleView mo78996b() {
        return (SwipeControlledRecycleView) this.f108272i.getValue();
    }

    /* renamed from: c */
    public final AbstractC46467a<C46447a> mo78997c() {
        return (AbstractC46467a) this.f108273j.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojiPageV2.c$d */
    static final class C46476d extends AbstractC89220m implements AbstractC89171a<SwipeControlledRecycleView> {

        /* renamed from: a */
        final /* synthetic */ C46472c f108277a;

        static {
            Covode.recordClassIndex(55061);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46476d(C46472c cVar) {
            super(0);
            this.f108277a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SwipeControlledRecycleView invoke() {
            return this.f108277a.mo78995a().findViewById(R.id.dgn);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojiPageV2.c$a */
    static final class C46473a extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ C46472c f108274a;

        static {
            Covode.recordClassIndex(55058);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46473a(C46472c cVar) {
            super(0);
            this.f108274a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return C1764a.m5927a(LayoutInflater.from(this.f108274a.f108267d.getContext()), R.layout.am0, this.f108274a.f108267d, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojiPageV2.c$c */
    static final class C46475c extends AbstractC89220m implements AbstractC89171a<AbstractC46467a<C46447a>> {

        /* renamed from: a */
        final /* synthetic */ C46472c f108276a;

        static {
            Covode.recordClassIndex(55060);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46475c(C46472c cVar) {
            super(0);
            this.f108276a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC46467a<C46447a> invoke() {
            C46472c cVar = this.f108276a;
            int i = cVar.f108269f;
            if (i == 1) {
                return new C46485i(cVar.f108266c);
            }
            if (i == 2) {
                return new C46484h(cVar.f108266c);
            }
            if (i == 3) {
                return new C46480e(cVar.f108266c);
            }
            if (i == 4) {
                return new C46482g(cVar.f108266c);
            }
            if (i != 5) {
                return null;
            }
            AbstractC1204m mVar = cVar.f108266c;
            SwipeControlledRecycleView b = cVar.mo78996b();
            C89219l.m154716b(b, "");
            return new C46613p(mVar, b, cVar.f108268e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojiPageV2.c$b */
    public static final class View$OnClickListenerC46474b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C46472c f108275a;

        static {
            Covode.recordClassIndex(55059);
        }

        public View$OnClickListenerC46474b(C46472c cVar) {
            this.f108275a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f108275a.f108270g.mo79015a();
        }
    }

    public C46472c(AbstractC1204m mVar, ViewGroup viewGroup, SwipeControlledViewPager swipeControlledViewPager, int i, AbstractC46519p pVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(swipeControlledViewPager, "");
        C89219l.m154721d(pVar, "");
        this.f108266c = mVar;
        this.f108267d = viewGroup;
        this.f108268e = swipeControlledViewPager;
        this.f108269f = i;
        this.f108270g = pVar;
        View findViewById = mo78995a().findViewById(R.id.aiz);
        C89219l.m154716b(findViewById, "");
        this.f108264a = (ImageView) findViewById;
        this.f108273j = C89250i.m154773a((AbstractC89171a) new C46475c(this));
        this.f108265b = new C46477d();
    }
}
