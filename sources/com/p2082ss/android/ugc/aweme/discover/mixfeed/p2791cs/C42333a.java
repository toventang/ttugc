package com.p2082ss.android.ugc.aweme.discover.mixfeed.p2791cs;

import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.discover.api.p2765a.C41855a;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2791cs.ClickSearchView;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.ClickSearchResponse;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.ClickSearchWord;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3694j.AbstractC67459a;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.cs.a */
public final class C42333a {

    /* renamed from: f */
    public static final C42336a f98622f = new C42336a((byte) 0);

    /* renamed from: a */
    public C67568r f98623a;

    /* renamed from: b */
    public ClickSearchView f98624b;

    /* renamed from: c */
    public ClickSearchView f98625c;

    /* renamed from: d */
    public final ClickSearchViewModel f98626d;

    /* renamed from: e */
    public final AbstractC67459a f98627e;

    /* renamed from: g */
    private List<? extends View> f98628g;

    /* renamed from: h */
    private final ViewStub f98629h;

    static {
        Covode.recordClassIndex(50278);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.cs.a$a */
    static final class C42336a {
        static {
            Covode.recordClassIndex(50281);
        }

        private C42336a() {
        }

        public /* synthetic */ C42336a(byte b) {
            this();
        }
    }

    /* renamed from: c */
    public final void mo71528c() {
        ClickSearchViewModel clickSearchViewModel = this.f98626d;
        C42337b bVar = new C42337b(this);
        C89219l.m154721d(bVar, "");
        bVar.invoke(clickSearchViewModel.mo71517a().getValue());
    }

    /* renamed from: a */
    public final ClickSearchView mo71525a() {
        MethodCollector.m26663i(8377);
        if (this.f98625c == null && this.f98629h.getParent() != null) {
            this.f98629h.setLayoutResource(R.layout.aty);
            View inflate = this.f98629h.inflate();
            if (!(inflate instanceof ClickSearchView)) {
                inflate = null;
            }
            ClickSearchView clickSearchView = (ClickSearchView) inflate;
            if (clickSearchView == null) {
                MethodCollector.m26664o(8377);
                return null;
            }
            this.f98625c = clickSearchView;
            this.f98624b = clickSearchView;
            clickSearchView.setVisibility(4);
            clickSearchView.setAlwaysShowingViews(this.f98628g);
            clickSearchView.setOnCloseClickListener(new C42338c(this));
            clickSearchView.setOnClickListener(new View$OnClickListenerC42339d(this));
        }
        ClickSearchView clickSearchView2 = this.f98625c;
        MethodCollector.m26664o(8377);
        return clickSearchView2;
    }

    /* renamed from: b */
    public final void mo71527b() {
        C67678d k;
        Aweme x = this.f98627e.mo60396x();
        if (x != null && !x.isAd() && (k = this.f98627e.mo60383k()) != null && C42341c.m84706a()) {
            ClickSearchView a = mo71525a();
            if (a == null || !a.mo71508b()) {
                this.f98626d.mo71518a(this.f98627e.mo60388p());
                ClickSearchViewModel clickSearchViewModel = this.f98626d;
                String keyword = k.getKeyword();
                C89219l.m154716b(keyword, "");
                clickSearchViewModel.mo71520a(x, keyword, this.f98627e.mo60388p());
                return;
            }
            ClickSearchView a2 = mo71525a();
            if (a2 != null) {
                a2.mo71507a();
            }
            this.f98626d.mo71521a((Integer) null);
            mo71525a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.cs.a$d */
    public static final class View$OnClickListenerC42339d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42333a f98634a;

        static {
            Covode.recordClassIndex(50284);
        }

        View$OnClickListenerC42339d(C42333a aVar) {
            this.f98634a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f98634a.f98627e.mo60394v();
        }
    }

    /* renamed from: a */
    public final void mo71526a(View... viewArr) {
        C89219l.m154721d(viewArr, "");
        this.f98628g = C89064i.m154506g(viewArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.cs.a$c */
    public static final class C42338c extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C42333a f98633a;

        static {
            Covode.recordClassIndex(50283);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42338c(C42333a aVar) {
            super(1);
            this.f98633a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            C89219l.m154721d(view, "");
            this.f98633a.f98627e.mo60395w();
            this.f98633a.f98626d.mo71524d();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.cs.a$b */
    public static final class C42337b extends AbstractC89220m implements AbstractC89172b<C42340b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C42333a f98632a;

        static {
            Covode.recordClassIndex(50282);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42337b(C42333a aVar) {
            super(1);
            this.f98632a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C42340b bVar) {
            C42340b bVar2 = bVar;
            if (bVar2 != null) {
                Integer.valueOf(bVar2.f98635a);
            }
            this.f98632a.f98627e.mo60388p();
            if (bVar2 == null || bVar2.f98635a != this.f98632a.f98627e.mo60388p()) {
                if (this.f98632a.f98624b != null) {
                    ClickSearchView a = this.f98632a.mo71525a();
                    if (a != null) {
                        a.mo71509c();
                    }
                    this.f98632a.f98626d.mo71521a((Integer) null);
                }
            } else if (bVar2.f98635a == this.f98632a.f98627e.mo60388p()) {
                this.f98632a.mo71527b();
            }
            return C89391z.f203057a;
        }
    }

    public C42333a(ClickSearchViewModel clickSearchViewModel, AbstractC67459a aVar, ViewStub viewStub) {
        Fragment fragment;
        Fragment fragment2;
        C89219l.m154721d(clickSearchViewModel, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(viewStub, "");
        this.f98626d = clickSearchViewModel;
        this.f98627e = aVar;
        this.f98629h = viewStub;
        C423341 r2 = new AbstractC1214u(this) {
            /* class com.p2082ss.android.ugc.aweme.discover.mixfeed.p2791cs.C42333a.C423341 */

            /* renamed from: a */
            final /* synthetic */ C42333a f98630a;

            static {
                Covode.recordClassIndex(50279);
            }

            {
                this.f98630a = r1;
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Object obj) {
                C41855a<ClickSearchResponse> aVar;
                T t;
                List<ClickSearchWord> list;
                String str;
                int i;
                LogPbBean logPbBean;
                C42340b bVar = (C42340b) obj;
                if (bVar != null && (aVar = bVar.f98638d) != null && (t = aVar.f97652b) != null && (list = t.wordsList) != null) {
                    T t2 = bVar.f98638d.f97652b;
                    if (t2 == null || (logPbBean = t2.logPbBean) == null || (str = logPbBean.getImprId()) == null) {
                        str = "";
                    }
                    C67568r rVar = this.f98630a.f98623a;
                    if (rVar != null) {
                        rVar.mo106520i(str);
                    }
                    if (list.size() < 3) {
                        list.size();
                    } else if ((this.f98630a.f98627e.mo60382j() || this.f98630a.f98627e.mo60381i()) && bVar.f98635a == this.f98630a.f98627e.mo60388p()) {
                        ClickSearchView a = this.f98630a.mo71525a();
                        if (a != null) {
                            C67568r rVar2 = this.f98630a.f98623a;
                            if (rVar2 == null) {
                                C89219l.m154715b();
                            }
                            boolean z = bVar.f98639e;
                            C89219l.m154721d(list, "");
                            C89219l.m154721d(bVar, "");
                            C89219l.m154721d(rVar2, "");
                            list.size();
                            a.getVisibility();
                            a.getHeight();
                            a.getMeasuredHeight();
                            a.getWidth();
                            a.getMeasuredWidth();
                            if (list.isEmpty() || a.getHeight() <= 0) {
                                a.mo71509c();
                            } else {
                                View view = a.f98576c;
                                if (view != null) {
                                    i = view.getHeight();
                                } else {
                                    i = 0;
                                }
                                a.post(new ClickSearchView.RunnableC42324b(a, bVar, rVar2, list, ((int) (((float) a.getHeight()) * 0.6f)) - i, z));
                            }
                        }
                        this.f98630a.f98626d.mo71521a(Integer.valueOf(this.f98630a.f98627e.mo60388p()));
                    } else if (this.f98630a.f98627e.mo60388p() != bVar.f98635a) {
                        ClickSearchView a2 = this.f98630a.mo71525a();
                        if (a2 != null) {
                            a2.mo71509c();
                        }
                        this.f98630a.f98626d.mo71521a((Integer) null);
                    }
                }
            }
        };
        C89219l.m154721d(r2, "");
        WeakReference<Fragment> weakReference = clickSearchViewModel.f98605a;
        if (!(weakReference == null || (fragment2 = weakReference.get()) == null)) {
            clickSearchViewModel.mo71517a().observe(fragment2, r2);
        }
        C423352 r22 = new AbstractC1214u(this) {
            /* class com.p2082ss.android.ugc.aweme.discover.mixfeed.p2791cs.C42333a.C423352 */

            /* renamed from: a */
            final /* synthetic */ C42333a f98631a;

            static {
                Covode.recordClassIndex(50280);
            }

            {
                this.f98631a = r1;
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Object obj) {
                C42344e eVar = (C42344e) obj;
                if (eVar != null && eVar.f98644a != this.f98631a.f98627e.mo60388p() && eVar.f98645b == EnumC42343d.ENTER_DETAIL) {
                    this.f98631a.f98626d.mo71518a(this.f98631a.f98627e.mo60388p());
                    if (this.f98631a.f98624b != null) {
                        ClickSearchView a = this.f98631a.mo71525a();
                        if (a != null) {
                            a.mo71509c();
                        }
                        this.f98631a.f98626d.mo71521a((Integer) null);
                    }
                }
            }
        };
        C89219l.m154721d(r22, "");
        WeakReference<Fragment> weakReference2 = clickSearchViewModel.f98605a;
        if (weakReference2 != null && (fragment = weakReference2.get()) != null) {
            clickSearchViewModel.mo71522b().observe(fragment, r22);
        }
    }
}
