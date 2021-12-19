package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.discover.helper.C42062z;
import com.p2082ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.p2082ss.android.ugc.aweme.search.C67446h;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchIntermediateView */
public final class SearchIntermediateView extends FrameLayout {

    /* renamed from: j */
    public static final C42576a f99313j = new C42576a((byte) 0);

    /* renamed from: a */
    public SearchIntermediateViewModel f99314a;

    /* renamed from: b */
    public AbstractC42578c f99315b;

    /* renamed from: c */
    AbstractC0952i f99316c;

    /* renamed from: d */
    final C42062z f99317d;

    /* renamed from: e */
    public int f99318e;

    /* renamed from: f */
    boolean f99319f;

    /* renamed from: g */
    public int f99320g;

    /* renamed from: h */
    final AbstractC1214u<Integer> f99321h;

    /* renamed from: i */
    final AbstractC1214u<Integer> f99322i;

    /* renamed from: k */
    private Fragment f99323k;

    /* renamed from: l */
    private int f99324l;

    /* renamed from: m */
    private AbstractC42577b f99325m;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchIntermediateView$b */
    public interface AbstractC42577b {
        static {
            Covode.recordClassIndex(50678);
        }

        /* renamed from: a */
        void mo72765a(MotionEvent motionEvent);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchIntermediateView$c */
    public interface AbstractC42578c {
        static {
            Covode.recordClassIndex(50679);
        }

        /* renamed from: a */
        void mo72766a(int i);

        /* renamed from: b */
        void mo72767b(C67678d dVar);
    }

    static {
        Covode.recordClassIndex(50676);
    }

    public SearchIntermediateView(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public SearchIntermediateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchIntermediateView$a */
    public static final class C42576a {
        static {
            Covode.recordClassIndex(50677);
        }

        private C42576a() {
        }

        public /* synthetic */ C42576a(byte b) {
            this();
        }
    }

    public final Fragment getFragment() {
        return this.f99323k;
    }

    public final int getOpenSugFromState() {
        return this.f99324l;
    }

    /* renamed from: b */
    public final boolean mo72758b() {
        SearchIntermediateViewModel searchIntermediateViewModel = this.f99314a;
        if (searchIntermediateViewModel == null) {
            C89219l.m154710a("intermediateViewModel");
        }
        Integer value = searchIntermediateViewModel.getIntermediateState().getValue();
        if (value != null && value.intValue() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private final void m85074c() {
        if (this.f99323k == null) {
            AbstractC0952i iVar = this.f99316c;
            if (iVar == null) {
                C89219l.m154710a("fragmentManager");
            }
            this.f99323k = iVar.mo3551a("tag_intermediate");
        }
        if (this.f99323k == null) {
            this.f99323k = C67446h.f151111a.mo106218g();
            AbstractC0952i iVar2 = this.f99316c;
            if (iVar2 == null) {
                C89219l.m154710a("fragmentManager");
            }
            AbstractC0976n a = iVar2.mo3552a();
            C89219l.m154716b(a, "");
            int i = this.f99320g;
            Fragment fragment = this.f99323k;
            if (fragment == null) {
                C89219l.m154715b();
            }
            a.mo3470b(i, fragment, "tag_intermediate").mo3473c();
        }
    }

    /* renamed from: a */
    public final boolean mo72757a() {
        SearchIntermediateViewModel searchIntermediateViewModel = this.f99314a;
        if (searchIntermediateViewModel == null) {
            C89219l.m154710a("intermediateViewModel");
        }
        Integer value = searchIntermediateViewModel.getIntermediateState().getValue();
        if (value != null && value.intValue() == 2) {
            return true;
        }
        return false;
    }

    public final void setFragment(Fragment fragment) {
        this.f99323k = fragment;
    }

    public final void setOpenSugFromState(int i) {
        this.f99324l = i;
    }

    public final void setOnDispatchTouchEventListener(AbstractC42577b bVar) {
        C89219l.m154721d(bVar, "");
        this.f99325m = bVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ SearchIntermediateViewModel m85072a(SearchIntermediateView searchIntermediateView) {
        SearchIntermediateViewModel searchIntermediateViewModel = searchIntermediateView.f99314a;
        if (searchIntermediateViewModel == null) {
            C89219l.m154710a("intermediateViewModel");
        }
        return searchIntermediateViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ AbstractC42578c m85073b(SearchIntermediateView searchIntermediateView) {
        AbstractC42578c cVar = searchIntermediateView.f99315b;
        if (cVar == null) {
            C89219l.m154710a("responder");
        }
        return cVar;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        AbstractC42577b bVar = this.f99325m;
        if (bVar != null) {
            bVar.mo72765a(motionEvent);
        }
        return dispatchTouchEvent;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchIntermediateView$e */
    static final class C42580e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ SearchIntermediateView f99327a;

        static {
            Covode.recordClassIndex(50681);
        }

        C42580e(SearchIntermediateView searchIntermediateView) {
            this.f99327a = searchIntermediateView;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                SearchIntermediateView.m85073b(this.f99327a).mo72766a(num.intValue());
            }
        }
    }

    /* renamed from: a */
    public final void mo72755a(String str) {
        C89219l.m154721d(str, "");
        m85074c();
        this.f99317d.mo71171b();
        SearchIntermediateViewModel searchIntermediateViewModel = this.f99314a;
        if (searchIntermediateViewModel == null) {
            C89219l.m154710a("intermediateViewModel");
        }
        searchIntermediateViewModel.openSearchSug(str);
    }

    /* renamed from: a */
    public final void mo72756a(boolean z) {
        if (!mo72758b()) {
            m85074c();
            this.f99317d.mo71171b();
            SearchIntermediateViewModel searchIntermediateViewModel = this.f99314a;
            if (searchIntermediateViewModel == null) {
                C89219l.m154710a("intermediateViewModel");
            }
            searchIntermediateViewModel.openSearchSquare(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchIntermediateView$d */
    static final class C42579d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ SearchIntermediateView f99326a;

        static {
            Covode.recordClassIndex(50680);
        }

        C42579d(SearchIntermediateView searchIntermediateView) {
            this.f99326a = searchIntermediateView;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C67678d value;
            Integer num = (Integer) obj;
            if (num != null) {
                if (!(this.f99326a.f99318e == num.intValue() || num.intValue() != 0 || (value = SearchIntermediateView.m85072a(this.f99326a).getOpenSearchParam().getValue()) == null)) {
                    SearchIntermediateView.m85073b(this.f99326a).mo72767b(value);
                    if (SearchIntermediateView.m85072a(this.f99326a).enterSearchMiddlePageByBack) {
                        SearchIntermediateView.m85072a(this.f99326a).enterSearchMiddlePageByBack = false;
                    }
                }
                this.f99326a.f99318e = num.intValue();
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ SearchIntermediateView(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SearchIntermediateView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(9827);
        this.f99320g = R.id.drz;
        setVisibility(8);
        this.f99318e = 0;
        this.f99317d = new C42062z(context, this);
        this.f99321h = new C42579d(this);
        this.f99322i = new C42580e(this);
        this.f99324l = 1;
        MethodCollector.m26664o(9827);
    }
}
