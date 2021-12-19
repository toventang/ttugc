package com.p2082ss.android.ugc.aweme.discover.mixfeed.p2793e;

import android.graphics.Outline;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AnimatedImageView;
import com.p2082ss.android.ugc.aweme.discover.adapter.AbstractView$OnAttachStateChangeListenerC41671b;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2789b.C42317b;
import com.p2082ss.android.ugc.aweme.discover.model.SearchOperation;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67492aq;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67494ar;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67496as;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67540c;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67542d;
import com.p2082ss.android.ugc.aweme.search.p3696l.C67631j;
import com.p2082ss.android.ugc.aweme.search.p3696l.C67641m;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import com.p2082ss.android.ugc.aweme.views.AutoRTLImageView;
import com.p2082ss.android.ugc.trill.R;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.e.g */
public final class C42400g extends AbstractView$OnAttachStateChangeListenerC41671b {

    /* renamed from: f */
    public static final C42402a f98768f = new C42402a((byte) 0);

    /* renamed from: a */
    public AnimatedImageView f98769a;

    /* renamed from: b */
    public TuxTextView f98770b;

    /* renamed from: c */
    public AutoRTLImageView f98771c;

    /* renamed from: d */
    public String f98772d = "";

    /* renamed from: e */
    public View f98773e;

    static {
        Covode.recordClassIndex(50345);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.e.g$a */
    public static final class C42402a {
        static {
            Covode.recordClassIndex(50347);
        }

        private C42402a() {
        }

        public /* synthetic */ C42402a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C42400g m84775a(ViewGroup viewGroup) {
            C89219l.m154721d(viewGroup, "");
            return new C42400g(C67641m.m119786a(viewGroup, R.layout.av2), viewGroup);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.adapter.AbstractView$OnAttachStateChangeListenerC41671b
    /* renamed from: I */
    public final View mo70834I() {
        View view = this.itemView;
        C89219l.m154716b(view, "");
        return view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.e.g$c */
    public static final class RunnableC42404c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C42400g f98775a;

        /* renamed from: b */
        final /* synthetic */ int f98776b = 2;

        /* renamed from: c */
        final /* synthetic */ SearchOperation f98777c;

        static {
            Covode.recordClassIndex(50349);
        }

        RunnableC42404c(C42400g gVar, SearchOperation searchOperation) {
            this.f98775a = gVar;
            this.f98777c = searchOperation;
        }

        public final void run() {
            C1731i.m5640b(new CallableC42406e(this.f98775a, this.f98777c), C1731i.f5562a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.e.g$e */
    static final class CallableC42406e<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C42400g f98780a;

        /* renamed from: b */
        final /* synthetic */ SearchOperation f98781b;

        static {
            Covode.recordClassIndex(50351);
        }

        CallableC42406e(C42400g gVar, SearchOperation searchOperation) {
            this.f98780a = gVar;
            this.f98781b = searchOperation;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C67540c c = new C67494ar().mo106483c(this.f98780a.mo70877F().f151315j);
            c.mo106452c(C67494ar.f151189b, this.f98781b.getCardId());
            ((C67540c) c.mo106459o(this.f98780a.mo70877F().f151312g)).mo106482b(this.f98780a.mo70877F().f151311f).mo96792f();
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private void m84771a(boolean z) {
        this.f98769a.setAttached(z);
        this.f98769a.setUserVisibleHint(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.adapter.AbstractView$OnAttachStateChangeListenerC41671b
    public final void onViewAttachedToWindow(View view) {
        C89219l.m154721d(view, "");
        super.onViewAttachedToWindow(view);
        m84771a(true);
        mo71591b("search_result_show");
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.adapter.AbstractView$OnAttachStateChangeListenerC41671b
    public final void onViewDetachedFromWindow(View view) {
        C89219l.m154721d(view, "");
        super.onViewDetachedFromWindow(view);
        m84771a(false);
        this.f98769a.mo61256c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.e.g$b */
    public static final class C42403b extends AbstractC89220m implements AbstractC89172b<Aweme, String> {

        /* renamed from: a */
        final /* synthetic */ C42400g f98774a;

        static {
            Covode.recordClassIndex(50348);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42403b(C42400g gVar) {
            super(1);
            this.f98774a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(Aweme aweme) {
            String str = this.f98774a.f98772d;
            if (TextUtils.isEmpty(str)) {
                return this.f98774a.mo70877F().f151315j + '_' + this.f98774a.mo70877F().f151318m;
            }
            return str;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.e.g$d */
    public static final class View$OnClickListenerC42405d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42400g f98778a;

        /* renamed from: b */
        final /* synthetic */ SearchOperation f98779b;

        static {
            Covode.recordClassIndex(50350);
        }

        View$OnClickListenerC42405d(C42400g gVar, SearchOperation searchOperation) {
            this.f98778a = gVar;
            this.f98779b = searchOperation;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            MainServiceImpl.createIMainServicebyMonsterPlugin(false).startAdsAppActivity(this.f98778a.mo70878G(), this.f98779b.getLink(), null);
            C67540c c = new C67492aq().mo106483c(this.f98778a.mo70877F().f151315j);
            c.mo106452c(C67492aq.f151186b, this.f98779b.getCardId());
            ((C67540c) c.mo106459o(this.f98778a.mo70877F().f151312g)).mo106482b(this.f98778a.mo70877F().f151311f).mo96792f();
            this.f98778a.mo71591b("search_result_click");
        }
    }

    /* renamed from: b */
    public final void mo71591b(String str) {
        C89219l.m154721d(str, "");
        if (TextUtils.equals("search_result_click", str)) {
            ((C67496as) ((C67542d) C42317b.m84680b(mo70877F()).mo106497x("activity")).mo106496w("1").mo106487g(this.f98772d)).mo106440B("click_photo").mo96792f();
        } else if (TextUtils.equals("search_result_show", str)) {
            ((C67542d) C42317b.m84679a(mo70877F()).mo106497x("activity")).mo106496w("1").mo106487g(this.f98772d).mo96792f();
        }
    }

    /* renamed from: a */
    public final void mo71590a(SearchOperation searchOperation) {
        C89219l.m154721d(searchOperation, "");
        String docId = searchOperation.getDocId();
        if (docId == null) {
            docId = "";
        }
        this.f98772d = docId;
        mo70877F().mo106508a(new C42403b(this));
        if (!searchOperation.getRecorded()) {
            C67631j.m119782a(this.itemView, new RunnableC42404c(this, searchOperation));
            searchOperation.setRecorded(true);
        }
        this.f98769a.mo61254a(searchOperation.getBanner());
        AnimatedImageView animatedImageView = this.f98769a;
        UrlModel banner = searchOperation.getBanner();
        AnimatedImageView animatedImageView2 = this.f98769a;
        C89219l.m154716b(animatedImageView2, "");
        C34577e.m70596a(animatedImageView, banner, animatedImageView2.getControllerListener());
        TuxTextView tuxTextView = this.f98770b;
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(searchOperation.getDesc());
        this.f98770b.setTuxFont(52);
        TuxTextView tuxTextView2 = this.f98770b;
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setMaxLines(2);
        TuxTextView tuxTextView3 = this.f98770b;
        C89219l.m154716b(tuxTextView3, "");
        if (TextUtils.isEmpty(tuxTextView3.getText())) {
            AutoRTLImageView autoRTLImageView = this.f98771c;
            C89219l.m154716b(autoRTLImageView, "");
            autoRTLImageView.setVisibility(4);
        }
        this.itemView.setOnClickListener(new View$OnClickListenerC42405d(this, searchOperation));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42400g(View view, View view2) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(view2, "");
        this.f98773e = view2;
        this.f98769a = (AnimatedImageView) view.findViewById(R.id.cwy);
        this.f98770b = (TuxTextView) view.findViewById(R.id.cwx);
        this.f98771c = (AutoRTLImageView) view.findViewById(R.id.cld);
        if (Build.VERSION.SDK_INT >= 21) {
            AnimatedImageView animatedImageView = this.f98769a;
            C89219l.m154716b(animatedImageView, "");
            animatedImageView.setOutlineProvider(new ViewOutlineProvider() {
                /* class com.p2082ss.android.ugc.aweme.discover.mixfeed.p2793e.C42400g.C424011 */

                static {
                    Covode.recordClassIndex(50346);
                }

                public final void getOutline(View view, Outline outline) {
                    C89219l.m154721d(view, "");
                    C89219l.m154721d(outline, "");
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight() + 8, 8.0f);
                }
            });
            AnimatedImageView animatedImageView2 = this.f98769a;
            C89219l.m154716b(animatedImageView2, "");
            animatedImageView2.setClipToOutline(true);
        }
    }
}
