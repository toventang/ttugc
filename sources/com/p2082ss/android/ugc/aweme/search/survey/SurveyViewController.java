package com.p2082ss.android.ugc.aweme.search.survey;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.p037h.p039b.C0767b;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.p2082ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.p2082ss.android.ugc.aweme.discover.model.SearchSurveyConfig;
import com.p2082ss.android.ugc.aweme.discover.viewmodel.SearchResultViewModel;
import com.p2082ss.android.ugc.aweme.search.C67458j;
import com.p2082ss.android.ugc.aweme.search.feedback.C67434a;
import com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67567q;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67469ad;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67486am;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67540c;
import com.p2082ss.android.ugc.aweme.search.survey.C67754d;
import com.p2082ss.android.ugc.aweme.utils.AbstractC80379eg;
import com.p2082ss.android.ugc.aweme.utils.C80284by;
import com.p2082ss.android.ugc.aweme.utils.C80375ef;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.survey.SurveyViewController */
public final class SurveyViewController implements AbstractC80379eg {

    /* renamed from: o */
    public static final C67730b f151793o = new C67730b((byte) 0);

    /* renamed from: a */
    public ViewStub f151794a;

    /* renamed from: b */
    public ActivityC0945e f151795b;

    /* renamed from: c */
    public View f151796c;

    /* renamed from: d */
    View f151797d;

    /* renamed from: e */
    public TextView f151798e;

    /* renamed from: f */
    public ViewGroup f151799f;

    /* renamed from: g */
    List<? extends ImageView> f151800g;

    /* renamed from: h */
    public TextView f151801h;

    /* renamed from: i */
    public View f151802i;

    /* renamed from: j */
    public LottieAnimationView f151803j;

    /* renamed from: k */
    public SearchSurveyConfig f151804k = new SearchSurveyConfig();

    /* renamed from: l */
    public C67754d.C67755a f151805l = new C67754d.C67755a((byte) 0);

    /* renamed from: m */
    final AbstractC89244h f151806m = C89250i.m154773a((AbstractC89171a) new C67742m(this));

    /* renamed from: n */
    public int f151807n;

    /* renamed from: p */
    private final AbstractC89244h f151808p = C89250i.m154773a((AbstractC89171a) new C67732d(this));

    /* renamed from: q */
    private final AbstractC89244h f151809q = C89250i.m154773a((AbstractC89171a) new C67747r(this));

    /* renamed from: r */
    private final AbstractC89244h f151810r = C89250i.m154773a((AbstractC89171a) new C67741l(this));

    /* renamed from: s */
    private boolean f151811s;

    /* renamed from: t */
    private boolean f151812t;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.search.survey.SurveyViewController$a */
    public static final class HandlerC67728a extends Handler {

        /* renamed from: b */
        private static final C67729a f151813b = new C67729a((byte) 0);

        /* renamed from: a */
        final WeakReference<SurveyViewController> f151814a;

        static {
            Covode.recordClassIndex(79378);
        }

        /* renamed from: com.ss.android.ugc.aweme.search.survey.SurveyViewController$a$a */
        static final class C67729a {
            static {
                Covode.recordClassIndex(79379);
            }

            private C67729a() {
            }

            public /* synthetic */ C67729a(byte b) {
                this();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HandlerC67728a(SurveyViewController surveyViewController) {
            super(Looper.getMainLooper());
            C89219l.m154721d(surveyViewController, "");
            this.f151814a = new WeakReference<>(surveyViewController);
        }

        /* renamed from: a */
        public final void mo106830a(int i) {
            SearchSurveyConfig searchSurveyConfig;
            SurveyViewController surveyViewController = this.f151814a.get();
            if (surveyViewController != null && (searchSurveyConfig = surveyViewController.f151804k) != null) {
                long submitResultDelay = searchSurveyConfig.getSubmitResultDelay();
                removeMessages(2);
                removeMessages(3);
                sendMessageDelayed(obtainMessage(3, Integer.valueOf(i)), TimeUnit.SECONDS.toMillis(submitResultDelay));
            }
        }

        public final void handleMessage(Message message) {
            SurveyViewController surveyViewController;
            C89219l.m154721d(message, "");
            int i = message.what;
            Integer num = null;
            if (i == 1) {
                SurveyViewController surveyViewController2 = this.f151814a.get();
                if (surveyViewController2 != null) {
                    surveyViewController2.f151804k.getSurveyId();
                    String surveyId = surveyViewController2.f151804k.getSurveyId();
                    if (surveyId == null) {
                        surveyId = "";
                    }
                    C89219l.m154721d(surveyId, "");
                    SurveyApi.m119904a().fetch(surveyId).mo5534a(new C67731c(surveyViewController2), C1731i.f5564c, null);
                }
            } else if (i == 2) {
                SurveyViewController surveyViewController3 = this.f151814a.get();
                if (surveyViewController3 != null) {
                    surveyViewController3.mo106823a(0L);
                }
            } else if (i == 3) {
                Object obj = message.obj;
                if (obj instanceof Integer) {
                    num = obj;
                }
                Integer num2 = num;
                SurveyViewController surveyViewController4 = this.f151814a.get();
                if (surveyViewController4 != null) {
                    surveyViewController4.mo106824a(num2);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.setDuration(300L);
                    ofFloat.setInterpolator(C0767b.m2680a(0.25f, 1.0f, 0.25f, 1.0f));
                    ofFloat.addUpdateListener(new C67738j(surveyViewController4));
                    ofFloat.addListener(new C67739k(surveyViewController4));
                    ofFloat.start();
                }
            } else if (i == 4 && (surveyViewController = this.f151814a.get()) != null) {
                Object obj2 = message.obj;
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                surveyViewController.mo106822a(((Integer) obj2).intValue());
            }
        }
    }

    static {
        Covode.recordClassIndex(79377);
    }

    /* renamed from: a */
    public final HandlerC67728a mo106821a() {
        return (HandlerC67728a) this.f151808p.getValue();
    }

    /* renamed from: b */
    public final SurveyViewModel mo106825b() {
        return (SurveyViewModel) this.f151809q.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.search.survey.SurveyViewController$b */
    static final class C67730b {
        static {
            Covode.recordClassIndex(79380);
        }

        private C67730b() {
        }

        public /* synthetic */ C67730b(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80379eg
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public final void onCreate() {
        AbstractC80379eg.C80380a.onCreate(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80379eg
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        AbstractC80379eg.C80380a.onDestroy(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80379eg
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public final void onPause() {
        AbstractC80379eg.C80380a.onPause(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80379eg
    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_START)
    public final void onStart() {
        AbstractC80379eg.C80380a.onStart(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.search.survey.SurveyViewController$d */
    static final class C67732d extends AbstractC89220m implements AbstractC89171a<HandlerC67728a> {

        /* renamed from: a */
        final /* synthetic */ SurveyViewController f151816a;

        static {
            Covode.recordClassIndex(79382);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67732d(SurveyViewController surveyViewController) {
            super(0);
            this.f151816a = surveyViewController;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HandlerC67728a invoke() {
            return new HandlerC67728a(this.f151816a);
        }
    }

    /* renamed from: g */
    private final boolean m119909g() {
        if (this.f151796c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo106828e() {
        mo106821a().removeCallbacksAndMessages(null);
        mo106823a(0L);
    }

    /* renamed from: com.ss.android.ugc.aweme.search.survey.SurveyViewController$l */
    static final class C67741l extends AbstractC89220m implements AbstractC89171a<SearchResultViewModel> {

        /* renamed from: a */
        final /* synthetic */ SurveyViewController f151830a;

        static {
            Covode.recordClassIndex(79391);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67741l(SurveyViewController surveyViewController) {
            super(0);
            this.f151830a = surveyViewController;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SearchResultViewModel invoke() {
            return C1181ae.m3881a(SurveyViewController.m119905a(this.f151830a), (C1175ad.AbstractC1177b) null).mo3983a(SearchResultViewModel.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.survey.SurveyViewController$m */
    static final class C67742m extends AbstractC89220m implements AbstractC89171a<SearchStateViewModel> {

        /* renamed from: a */
        final /* synthetic */ SurveyViewController f151831a;

        static {
            Covode.recordClassIndex(79392);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67742m(SurveyViewController surveyViewController) {
            super(0);
            this.f151831a = surveyViewController;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SearchStateViewModel invoke() {
            return C1181ae.m3881a(SurveyViewController.m119905a(this.f151831a), (C1175ad.AbstractC1177b) null).mo3983a(SearchStateViewModel.class);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.search.survey.SurveyViewController$q */
    public static final class RunnableC67746q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SurveyViewModel f151835a;

        /* renamed from: b */
        final /* synthetic */ SurveyViewController f151836b;

        static {
            Covode.recordClassIndex(79396);
        }

        RunnableC67746q(SurveyViewModel surveyViewModel, SurveyViewController surveyViewController) {
            this.f151835a = surveyViewModel;
            this.f151836b = surveyViewController;
        }

        public final void run() {
            this.f151835a.f151840c.removeObservers(SurveyViewController.m119905a(this.f151836b));
            this.f151835a.f151838a.removeObservers(SurveyViewController.m119905a(this.f151836b));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.survey.SurveyViewController$r */
    static final class C67747r extends AbstractC89220m implements AbstractC89171a<SurveyViewModel> {

        /* renamed from: a */
        final /* synthetic */ SurveyViewController f151837a;

        static {
            Covode.recordClassIndex(79397);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67747r(SurveyViewController surveyViewController) {
            super(0);
            this.f151837a = surveyViewController;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SurveyViewModel invoke() {
            return C1181ae.m3881a(SurveyViewController.m119905a(this.f151837a), (C1175ad.AbstractC1177b) null).mo3983a(SurveyViewModel.class);
        }
    }

    /* renamed from: c */
    public final AbstractC67567q mo106826c() {
        ActivityC0945e eVar = this.f151795b;
        if (eVar == null) {
            C89219l.m154710a("activity");
        }
        return C67486am.m119565a(eVar.hashCode());
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80379eg
    public final void onResume() {
        if (this.f151811s && mo106827d()) {
            this.f151811s = false;
            mo106821a().mo106830a(this.f151807n);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.AbstractC80379eg
    public final void onStop() {
        View view = this.f151796c;
        if (view == null) {
            C89219l.m154710a("rootView");
        }
        if (view.getVisibility() == 0) {
            mo106821a().removeCallbacksAndMessages(null);
            this.f151811s = true;
        }
    }

    /* renamed from: d */
    public final boolean mo106827d() {
        if (this.f151796c == null) {
            return false;
        }
        View view = this.f151796c;
        if (view == null) {
            C89219l.m154710a("rootView");
        }
        if (view.getVisibility() != 0) {
            return false;
        }
        View view2 = this.f151796c;
        if (view2 == null) {
            C89219l.m154710a("rootView");
        }
        if (view2.getAlpha() == 1.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void mo106829f() {
        if (m119909g()) {
            View view = this.f151796c;
            if (view == null) {
                C89219l.m154710a("rootView");
            }
            view.setVisibility(8);
        }
        this.f151811s = false;
        this.f151807n = 0;
        mo106821a().removeCallbacksAndMessages(null);
        mo106821a().post(new RunnableC67746q(mo106825b(), this));
        ActivityC0945e eVar = this.f151795b;
        if (eVar == null) {
            C89219l.m154710a("activity");
        }
        C80375ef.m139357b(eVar, this);
    }

    /* renamed from: com.ss.android.ugc.aweme.search.survey.SurveyViewController$h */
    public static final class C67736h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ SurveyViewController f151823a;

        /* renamed from: b */
        final /* synthetic */ long f151824b;

        /* renamed from: c */
        final /* synthetic */ float f151825c;

        static {
            Covode.recordClassIndex(79386);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f151823a.mo106829f();
        }

        C67736h(SurveyViewController surveyViewController, long j, float f) {
            this.f151823a = surveyViewController;
            this.f151824b = j;
            this.f151825c = f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.survey.SurveyViewController$i */
    public static final class C67737i extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ SurveyViewController f151826a;

        static {
            Covode.recordClassIndex(79387);
        }

        C67737i(SurveyViewController surveyViewController) {
            this.f151826a = surveyViewController;
        }

        public final void onAnimationEnd(Animator animator) {
            String str;
            int i;
            SearchSurveyConfig searchSurveyConfig;
            C67469ad c;
            C67469ad c2;
            String a = C67458j.m119529a(SurveyViewController.m119905a(this.f151826a));
            AbstractC67567q c3 = this.f151826a.mo106826c();
            C67752c cVar = new C67752c();
            String str2 = null;
            if (c3 == null || (c2 = c3.mo106431c()) == null) {
                str = null;
            } else {
                str = c2.f151151a;
            }
            C67540c a2 = cVar.mo106480a(str);
            if (c3 != null) {
                i = c3.mo106426a();
            } else {
                i = -1;
            }
            C67540c f = a2.mo106486f(C67458j.m119528a(i));
            if (!(c3 == null || (c = c3.mo106431c()) == null)) {
                str2 = c.f151152b;
            }
            f.mo106482b(str2).mo106459o(a).mo96792f();
            HandlerC67728a a3 = this.f151826a.mo106821a();
            SurveyViewController surveyViewController = a3.f151814a.get();
            if (surveyViewController != null && (searchSurveyConfig = surveyViewController.f151804k) != null) {
                long showDuration = searchSurveyConfig.getShowDuration();
                a3.removeMessages(2);
                a3.sendEmptyMessageDelayed(2, TimeUnit.SECONDS.toMillis(showDuration));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.survey.SurveyViewController$k */
    public static final class C67739k extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ SurveyViewController f151828a;

        static {
            Covode.recordClassIndex(79389);
        }

        C67739k(SurveyViewController surveyViewController) {
            this.f151828a = surveyViewController;
        }

        public final void onAnimationEnd(Animator animator) {
            SurveyViewController.m119908d(this.f151828a).mo5828a(new AnimatorListenerAdapter(this) {
                /* class com.p2082ss.android.ugc.aweme.search.survey.SurveyViewController.C67739k.C677401 */

                /* renamed from: a */
                final /* synthetic */ C67739k f151829a;

                static {
                    Covode.recordClassIndex(79390);
                }

                {
                    this.f151829a = r1;
                }

                public final void onAnimationEnd(Animator animator) {
                    this.f151829a.f151828a.mo106823a(1000L);
                }

                public final void onAnimationStart(Animator animator) {
                    SurveyViewController.m119908d(this.f151829a.f151828a).setAlpha(1.0f);
                }
            });
            SurveyViewController.m119908d(this.f151828a).mo5826a();
        }

        public final void onAnimationStart(Animator animator) {
            SurveyViewController.m119907c(this.f151828a).setVisibility(0);
            SurveyViewController.m119908d(this.f151828a).setAlpha(0.0f);
            ViewGroup viewGroup = this.f151828a.f151799f;
            if (viewGroup == null) {
                C89219l.m154710a("starGroupLayout");
            }
            viewGroup.setVisibility(8);
            TextView textView = this.f151828a.f151801h;
            if (textView == null) {
                C89219l.m154710a("starDesc");
            }
            textView.setVisibility(8);
            SurveyViewController.m119906b(this.f151828a).setText(R.string.f5e);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ ActivityC0945e m119905a(SurveyViewController surveyViewController) {
        ActivityC0945e eVar = surveyViewController.f151795b;
        if (eVar == null) {
            C89219l.m154710a("activity");
        }
        return eVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ TextView m119906b(SurveyViewController surveyViewController) {
        TextView textView = surveyViewController.f151798e;
        if (textView == null) {
            C89219l.m154710a("titleText");
        }
        return textView;
    }

    /* renamed from: c */
    public static final /* synthetic */ View m119907c(SurveyViewController surveyViewController) {
        View view = surveyViewController.f151802i;
        if (view == null) {
            C89219l.m154710a("lottieGroup");
        }
        return view;
    }

    /* renamed from: d */
    public static final /* synthetic */ LottieAnimationView m119908d(SurveyViewController surveyViewController) {
        LottieAnimationView lottieAnimationView = surveyViewController.f151803j;
        if (lottieAnimationView == null) {
            C89219l.m154710a("lottieView");
        }
        return lottieAnimationView;
    }

    /* renamed from: com.ss.android.ugc.aweme.search.survey.SurveyViewController$g */
    static final class View$OnClickListenerC67735g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SurveyViewController f151822a;

        static {
            Covode.recordClassIndex(79385);
        }

        View$OnClickListenerC67735g(SurveyViewController surveyViewController) {
            this.f151822a = surveyViewController;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f151822a.mo106821a().removeCallbacksAndMessages(null);
            this.f151822a.mo106823a(0L);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.survey.SurveyViewController$n */
    static final class C67743n<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ SurveyViewController f151832a;

        static {
            Covode.recordClassIndex(79393);
        }

        C67743n(SurveyViewController surveyViewController) {
            this.f151832a = surveyViewController;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                SurveyViewController surveyViewController = this.f151832a;
                surveyViewController.mo106824a(Integer.valueOf(surveyViewController.f151807n));
                this.f151832a.mo106828e();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.survey.SurveyViewController$o */
    static final class C67744o<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ SurveyViewController f151833a;

        static {
            Covode.recordClassIndex(79394);
        }

        C67744o(SurveyViewController surveyViewController) {
            this.f151833a = surveyViewController;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                this.f151833a.mo106828e();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.survey.SurveyViewController$p */
    static final class C67745p<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ SurveyViewController f151834a;

        static {
            Covode.recordClassIndex(79395);
        }

        C67745p(SurveyViewController surveyViewController) {
            this.f151834a = surveyViewController;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            this.f151834a.mo106827d();
            C89219l.m154716b(bool, "");
            if (bool.booleanValue() && this.f151834a.mo106827d()) {
                this.f151834a.mo106828e();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.survey.SurveyViewController$j */
    static final class C67738j implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ SurveyViewController f151827a;

        static {
            Covode.recordClassIndex(79388);
        }

        C67738j(SurveyViewController surveyViewController) {
            this.f151827a = surveyViewController;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            SurveyViewController.m119906b(this.f151827a).setAlpha(floatValue);
            SurveyViewController.m119907c(this.f151827a).setAlpha(floatValue);
        }
    }

    /* renamed from: a */
    public final void mo106822a(int i) {
        ActivityC0945e eVar = this.f151795b;
        if (eVar == null) {
            C89219l.m154710a("activity");
        }
        if (C67434a.m119469a(eVar, null, true, null, "survey")) {
            this.f151812t = true;
            return;
        }
        this.f151812t = false;
        mo106821a().mo106830a(i);
    }

    /* renamed from: com.ss.android.ugc.aweme.search.survey.SurveyViewController$c */
    static final class C67731c<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ SurveyViewController f151815a;

        static {
            Covode.recordClassIndex(79381);
        }

        C67731c(SurveyViewController surveyViewController) {
            this.f151815a = surveyViewController;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            String str;
            List<String> list;
            C89219l.m154716b(iVar, "");
            iVar.mo5545d();
            C67754d.C67755a aVar = ((C67754d) iVar.mo5545d()).f151844a;
            if (aVar != null && (str = aVar.f151845a) != null && C80538hl.m139614a(str) && (list = aVar.f151846b) != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().length() == 0) {
                            break;
                        }
                    } else {
                        this.f151815a.f151805l = aVar;
                        SurveyViewController.m119906b(this.f151815a).setText(aVar.f151845a);
                        SurveyViewController surveyViewController = this.f151815a;
                        View view = surveyViewController.f151796c;
                        if (view == null) {
                            C89219l.m154710a("rootView");
                        }
                        view.setAlpha(0.0f);
                        View view2 = surveyViewController.f151796c;
                        if (view2 == null) {
                            C89219l.m154710a("rootView");
                        }
                        view2.setVisibility(0);
                        View view3 = surveyViewController.f151796c;
                        if (view3 == null) {
                            C89219l.m154710a("rootView");
                        }
                        View view4 = surveyViewController.f151796c;
                        if (view4 == null) {
                            C89219l.m154710a("rootView");
                        }
                        float height = (float) view4.getHeight();
                        View view5 = surveyViewController.f151796c;
                        if (view5 == null) {
                            C89219l.m154710a("rootView");
                        }
                        ViewGroup.LayoutParams layoutParams = view5.getLayoutParams();
                        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        view3.setTranslationY(height + ((float) ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.setDuration(300L);
                        animatorSet.setInterpolator(C0767b.m2680a(0.25f, 1.0f, 0.25f, 1.0f));
                        Animator[] animatorArr = new Animator[2];
                        View view6 = surveyViewController.f151796c;
                        if (view6 == null) {
                            C89219l.m154710a("rootView");
                        }
                        Property property = View.TRANSLATION_Y;
                        float[] fArr = new float[2];
                        View view7 = surveyViewController.f151796c;
                        if (view7 == null) {
                            C89219l.m154710a("rootView");
                        }
                        fArr[0] = view7.getTranslationY();
                        fArr[1] = 0.0f;
                        animatorArr[0] = ObjectAnimator.ofFloat(view6, property, fArr);
                        View view8 = surveyViewController.f151796c;
                        if (view8 == null) {
                            C89219l.m154710a("rootView");
                        }
                        animatorArr[1] = ObjectAnimator.ofFloat(view8, View.ALPHA, 0.0f, 1.0f);
                        animatorSet.playTogether(animatorArr);
                        animatorSet.addListener(new C67737i(surveyViewController));
                        animatorSet.start();
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo106823a(long j) {
        if (!mo106827d()) {
            mo106829f();
            return;
        }
        View view = this.f151796c;
        if (view == null) {
            C89219l.m154710a("rootView");
        }
        float height = (float) view.getHeight();
        View view2 = this.f151796c;
        if (view2 == null) {
            C89219l.m154710a("rootView");
        }
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        float f = height + ((float) ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(j);
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(C0767b.m2680a(0.25f, 1.0f, 0.25f, 1.0f));
        Animator[] animatorArr = new Animator[2];
        View view3 = this.f151796c;
        if (view3 == null) {
            C89219l.m154710a("rootView");
        }
        animatorArr[0] = ObjectAnimator.ofFloat(view3, View.TRANSLATION_Y, 0.0f, f);
        View view4 = this.f151796c;
        if (view4 == null) {
            C89219l.m154710a("rootView");
        }
        animatorArr[1] = ObjectAnimator.ofFloat(view4, View.ALPHA, 1.0f, 0.0f);
        animatorSet.playTogether(animatorArr);
        animatorSet.addListener(new C67736h(this, j, f));
        animatorSet.start();
    }

    /* renamed from: com.ss.android.ugc.aweme.search.survey.SurveyViewController$f */
    static final class View$OnClickListenerC67734f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f151818a;

        /* renamed from: b */
        final /* synthetic */ List f151819b;

        /* renamed from: c */
        final /* synthetic */ ViewGroup f151820c;

        /* renamed from: d */
        final /* synthetic */ SurveyViewController f151821d;

        static {
            Covode.recordClassIndex(79384);
        }

        View$OnClickListenerC67734f(int i, List list, ViewGroup viewGroup, SurveyViewController surveyViewController) {
            this.f151818a = i;
            this.f151819b = list;
            this.f151820c = viewGroup;
            this.f151821d = surveyViewController;
        }

        public final void onClick(View view) {
            int i;
            ClickAgent.onClick(view);
            SurveyViewController surveyViewController = this.f151821d;
            C89219l.m154716b(view, "");
            Object tag = view.getTag();
            Objects.requireNonNull(tag, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) tag).intValue();
            surveyViewController.f151807n = intValue + 1;
            List<? extends ImageView> list = surveyViewController.f151800g;
            if (list == null) {
                C89219l.m154710a("starViewList");
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 <= intValue) {
                    i = 2131233624;
                } else {
                    i = 2131233623;
                }
                List<? extends ImageView> list2 = surveyViewController.f151800g;
                if (list2 == null) {
                    C89219l.m154710a("starViewList");
                }
                ((ImageView) list2.get(i2)).setImageResource(i);
            }
            TextView textView = surveyViewController.f151801h;
            if (textView == null) {
                C89219l.m154710a("starDesc");
            }
            List<String> list3 = surveyViewController.f151805l.f151846b;
            textView.setText(list3 != null ? list3.get(intValue) : null);
            TextView textView2 = surveyViewController.f151801h;
            if (textView2 == null) {
                C89219l.m154710a("starDesc");
            }
            if (textView2.getAlpha() < 1.0f) {
                TextView textView3 = surveyViewController.f151801h;
                if (textView3 == null) {
                    C89219l.m154710a("starDesc");
                }
                textView3.setAlpha(0.0f);
                textView3.setVisibility(0);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(C0767b.m2680a(0.25f, 1.0f, 0.25f, 1.0f));
                Animator[] animatorArr = new Animator[2];
                TextView textView4 = surveyViewController.f151801h;
                if (textView4 == null) {
                    C89219l.m154710a("starDesc");
                }
                animatorArr[0] = ObjectAnimator.ofFloat(textView4, View.ALPHA, 0.0f, 1.0f);
                ViewGroup viewGroup = surveyViewController.f151799f;
                if (viewGroup == null) {
                    C89219l.m154710a("starGroupLayout");
                }
                animatorArr[1] = ObjectAnimator.ofFloat(viewGroup, View.TRANSLATION_Y, 0.0f, C80284by.m139183a(-10));
                animatorSet.playTogether(animatorArr);
                animatorSet.start();
            }
            surveyViewController.mo106821a().removeCallbacksAndMessages(null);
            if (intValue <= 2) {
                HandlerC67728a a = surveyViewController.mo106821a();
                int i3 = surveyViewController.f151807n;
                a.removeMessages(4);
                a.sendMessageDelayed(a.obtainMessage(4, Integer.valueOf(i3)), 250);
                return;
            }
            surveyViewController.mo106821a().mo106830a(surveyViewController.f151807n);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        if (r6 == null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        if (r0 == null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        r5 = new com.p2082ss.android.ugc.aweme.search.survey.C67756e(r2, r1, r0, r4);
        r1 = r8.f151795b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0057, code lost:
        if (r1 != null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0059, code lost:
        p4600h.p4611f.p4613b.C89219l.m154710a("activity");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005e, code lost:
        r6 = com.p2082ss.android.ugc.aweme.search.C67458j.m119529a(r1);
        r2 = mo106826c();
        r1 = new com.p2082ss.android.ugc.aweme.search.survey.C67750b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006b, code lost:
        if (r2 == null) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006d, code lost:
        r0 = r2.mo106431c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0071, code lost:
        if (r0 == null) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0073, code lost:
        r0 = r0.f151151a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0075, code lost:
        r1 = r1.mo106480a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0079, code lost:
        if (r2 == null) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007b, code lost:
        r0 = r2.mo106426a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007f, code lost:
        r1 = r1.mo106486f(com.p2082ss.android.ugc.aweme.search.C67458j.m119528a(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0087, code lost:
        if (r2 == null) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0089, code lost:
        r0 = r2.mo106431c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008d, code lost:
        if (r0 == null) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008f, code lost:
        r7 = r0.f151152b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0091, code lost:
        r1 = r1.mo106482b(r7).mo106459o(r6);
        r1.mo96785a("star_num", r4);
        r1.mo96792f();
        p4600h.p4611f.p4613b.C89219l.m154721d(r5, "");
        com.p2082ss.android.ugc.aweme.search.survey.SurveyApi.m119904a().submit(r5.f151847a, r5.f151848b, r5.f151850d, r5.f151849c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b5, code lost:
        r0 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b7, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo106824a(java.lang.Integer r9) {
        /*
        // Method dump skipped, instructions count: 188
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.search.survey.SurveyViewController.mo106824a(java.lang.Integer):void");
    }

    /* renamed from: com.ss.android.ugc.aweme.search.survey.SurveyViewController$e */
    public static final class C67733e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ SurveyViewController f151817a;

        static {
            Covode.recordClassIndex(79383);
        }

        public C67733e(SurveyViewController surveyViewController) {
            this.f151817a = surveyViewController;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            SearchSurveyConfig searchSurveyConfig;
            MethodCollector.m26663i(7848);
            SearchSurveyConfig searchSurveyConfig2 = (SearchSurveyConfig) obj;
            searchSurveyConfig2.getEnabled();
            searchSurveyConfig2.getSurveyId();
            searchSurveyConfig2.getShowDelay();
            if (searchSurveyConfig2.getEnabled() && C80538hl.m139614a(searchSurveyConfig2.getSurveyId()) && searchSurveyConfig2.getShowDelay() >= 0) {
                SurveyViewController surveyViewController = this.f151817a;
                SurveyViewModel b = surveyViewController.mo106825b();
                NextLiveData<Boolean> nextLiveData = b.f151838a;
                ActivityC0945e eVar = surveyViewController.f151795b;
                if (eVar == null) {
                    C89219l.m154710a("activity");
                }
                C80375ef.m139355a(nextLiveData, eVar, new C67743n(surveyViewController));
                NextLiveData<Boolean> nextLiveData2 = b.f151840c;
                ActivityC0945e eVar2 = surveyViewController.f151795b;
                if (eVar2 == null) {
                    C89219l.m154710a("activity");
                }
                C80375ef.m139355a(nextLiveData2, eVar2, new C67744o(surveyViewController));
                C1213t<Boolean> tVar = ((SearchStateViewModel) surveyViewController.f151806m.getValue()).isRefreshingData;
                ActivityC0945e eVar3 = surveyViewController.f151795b;
                if (eVar3 == null) {
                    C89219l.m154710a("activity");
                }
                C80375ef.m139355a(tVar, eVar3, new C67745p(surveyViewController));
                ActivityC0945e eVar4 = surveyViewController.f151795b;
                if (eVar4 == null) {
                    C89219l.m154710a("activity");
                }
                C80375ef.m139356a(eVar4, surveyViewController);
                SurveyViewController surveyViewController2 = this.f151817a;
                C89219l.m154716b(searchSurveyConfig2, "");
                surveyViewController2.f151804k = searchSurveyConfig2;
                if (this.f151817a.f151796c != null) {
                    SurveyViewController surveyViewController3 = this.f151817a;
                    View view = surveyViewController3.f151796c;
                    if (view == null) {
                        C89219l.m154710a("rootView");
                    }
                    view.setAlpha(0.0f);
                    view.setTranslationY(0.0f);
                    view.setVisibility(0);
                    TextView textView = surveyViewController3.f151801h;
                    if (textView == null) {
                        C89219l.m154710a("starDesc");
                    }
                    textView.setAlpha(0.0f);
                    textView.setVisibility(0);
                    TextView textView2 = surveyViewController3.f151798e;
                    if (textView2 == null) {
                        C89219l.m154710a("titleText");
                    }
                    textView2.setText("");
                    textView2.setAlpha(1.0f);
                    ViewGroup viewGroup = surveyViewController3.f151799f;
                    if (viewGroup == null) {
                        C89219l.m154710a("starGroupLayout");
                    }
                    viewGroup.setAlpha(1.0f);
                    viewGroup.setTranslationY(0.0f);
                    viewGroup.setVisibility(0);
                    List<? extends ImageView> list = surveyViewController3.f151800g;
                    if (list == null) {
                        C89219l.m154710a("starViewList");
                    }
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().setImageResource(2131233623);
                    }
                    View view2 = surveyViewController3.f151802i;
                    if (view2 == null) {
                        C89219l.m154710a("lottieGroup");
                    }
                    view2.setVisibility(8);
                    view2.setAlpha(0.0f);
                    LottieAnimationView lottieAnimationView = surveyViewController3.f151803j;
                    if (lottieAnimationView == null) {
                        C89219l.m154710a("lottieView");
                    }
                    lottieAnimationView.setAlpha(0.0f);
                } else {
                    SurveyViewController surveyViewController4 = this.f151817a;
                    ViewStub viewStub = surveyViewController4.f151794a;
                    if (viewStub == null) {
                        C89219l.m154710a("viewStub");
                    }
                    if (viewStub.getParent() != null) {
                        ViewStub viewStub2 = surveyViewController4.f151794a;
                        if (viewStub2 == null) {
                            C89219l.m154710a("viewStub");
                        }
                        if (viewStub2.getLayoutResource() != 0) {
                            ViewStub viewStub3 = surveyViewController4.f151794a;
                            if (viewStub3 == null) {
                                C89219l.m154710a("viewStub");
                            }
                            if (viewStub3.getLayoutResource() == 0) {
                                ViewStub viewStub4 = surveyViewController4.f151794a;
                                if (viewStub4 == null) {
                                    C89219l.m154710a("viewStub");
                                }
                                viewStub4.setLayoutResource(R.layout.awi);
                            }
                            ViewStub viewStub5 = surveyViewController4.f151794a;
                            if (viewStub5 == null) {
                                C89219l.m154710a("viewStub");
                            }
                            View inflate = viewStub5.inflate();
                            C89219l.m154716b(inflate, "");
                            surveyViewController4.f151796c = inflate;
                            View view3 = surveyViewController4.f151796c;
                            if (view3 == null) {
                                C89219l.m154710a("rootView");
                            }
                            view3.setAlpha(0.0f);
                            View findViewById = view3.findViewById(R.id.dsq);
                            C89219l.m154716b(findViewById, "");
                            surveyViewController4.f151797d = findViewById;
                            View findViewById2 = view3.findViewById(R.id.dsu);
                            C89219l.m154716b(findViewById2, "");
                            surveyViewController4.f151798e = (TextView) findViewById2;
                            View findViewById3 = view3.findViewById(R.id.dsp);
                            C89219l.m154716b(findViewById3, "");
                            surveyViewController4.f151802i = findViewById3;
                            View findViewById4 = view3.findViewById(R.id.dso);
                            C89219l.m154716b(findViewById4, "");
                            surveyViewController4.f151803j = (LottieAnimationView) findViewById4;
                            View findViewById5 = view3.findViewById(R.id.dse);
                            C89219l.m154716b(findViewById5, "");
                            surveyViewController4.f151801h = (TextView) findViewById5;
                            View findViewById6 = view3.findViewById(R.id.dst);
                            C89219l.m154716b(findViewById6, "");
                            surveyViewController4.f151799f = (ViewGroup) findViewById6;
                            ViewGroup viewGroup2 = surveyViewController4.f151799f;
                            if (viewGroup2 == null) {
                                C89219l.m154710a("starGroupLayout");
                            }
                            ArrayList arrayList = new ArrayList();
                            int childCount = viewGroup2.getChildCount();
                            for (int i = 0; i < childCount; i++) {
                                View childAt = viewGroup2.getChildAt(i);
                                if (childAt != null) {
                                    ImageView imageView = (ImageView) childAt;
                                    imageView.setTag(Integer.valueOf(i));
                                    imageView.setOnClickListener(new View$OnClickListenerC67734f(i, arrayList, viewGroup2, surveyViewController4));
                                    arrayList.add(imageView);
                                } else {
                                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                                    MethodCollector.m26664o(7848);
                                    throw nullPointerException;
                                }
                            }
                            surveyViewController4.f151800g = arrayList;
                            LottieAnimationView lottieAnimationView2 = surveyViewController4.f151803j;
                            if (lottieAnimationView2 == null) {
                                C89219l.m154710a("lottieView");
                            }
                            lottieAnimationView2.setAnimation("search_check.json");
                            View view4 = surveyViewController4.f151797d;
                            if (view4 == null) {
                                C89219l.m154710a("closeView");
                            }
                            view4.setOnClickListener(new View$OnClickListenerC67735g(surveyViewController4));
                        }
                    }
                }
                HandlerC67728a a = this.f151817a.mo106821a();
                SurveyViewController surveyViewController5 = a.f151814a.get();
                if (surveyViewController5 == null || (searchSurveyConfig = surveyViewController5.f151804k) == null) {
                    MethodCollector.m26664o(7848);
                    return;
                }
                long showDelay = searchSurveyConfig.getShowDelay();
                a.removeMessages(1);
                a.sendEmptyMessageDelayed(1, TimeUnit.SECONDS.toMillis(showDelay));
            }
            MethodCollector.m26664o(7848);
        }
    }
}
