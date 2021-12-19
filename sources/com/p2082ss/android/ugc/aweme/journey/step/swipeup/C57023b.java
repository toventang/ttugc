package com.p2082ss.android.ugc.aweme.journey.step.swipeup;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.C1764a;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17235c;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.app.services.HybridABInfoService;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33947e;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.consent.AbstractC39273a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.p2082ss.android.ugc.aweme.feed.model.NewUserProgressModel;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.progressguidance.C50418a;
import com.p2082ss.android.ugc.aweme.journey.AbstractC56869p;
import com.p2082ss.android.ugc.aweme.journey.p3291a.C56834a;
import com.p2082ss.android.ugc.aweme.journey.step.ComponentDependencies;
import com.p2082ss.android.ugc.aweme.journey.step.p3298g.C56955b;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88430c;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.journey.step.swipeup.b */
public final class C57023b extends AbstractC34586a {

    /* renamed from: o */
    public static final C57024a f129839o = new C57024a((byte) 0);

    /* renamed from: a */
    public ObjectAnimator f129840a;

    /* renamed from: b */
    public long f129841b = System.currentTimeMillis();

    /* renamed from: c */
    public GestureDetector f129842c;

    /* renamed from: d */
    public float f129843d;

    /* renamed from: e */
    public float f129844e;

    /* renamed from: j */
    public View f129845j;

    /* renamed from: k */
    public TextView f129846k;

    /* renamed from: l */
    public Context f129847l;

    /* renamed from: m */
    public boolean f129848m;

    /* renamed from: n */
    public AbstractC88412b f129849n;

    /* renamed from: p */
    private SparseArray f129850p;

    static {
        Covode.recordClassIndex(66912);
    }

    /* renamed from: a */
    public final View mo94181a(int i) {
        if (this.f129850p == null) {
            this.f129850p = new SparseArray();
        }
        View view = (View) this.f129850p.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f129850p.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.swipeup.b$a */
    public static final class C57024a {
        static {
            Covode.recordClassIndex(66913);
        }

        private C57024a() {
        }

        public /* synthetic */ C57024a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.swipeup.b$h */
    static final class RunnableC57031h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C57023b f129859a;

        static {
            Covode.recordClassIndex(66920);
        }

        RunnableC57031h(C57023b bVar) {
            this.f129859a = bVar;
        }

        public final void run() {
            this.f129859a.mo94182a("auto");
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onStop() {
        if (!this.f129848m) {
            mo94183b("background");
        }
        super.onStop();
    }

    /* renamed from: a */
    public static void m103369a() {
        AbstractC81915c.m141874a(new C56955b());
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onDestroyView() {
        ObjectAnimator objectAnimator = this.f129840a;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            ObjectAnimator objectAnimator2 = this.f129840a;
            if (objectAnimator2 == null) {
                C89219l.m154715b();
            }
            objectAnimator2.cancel();
        }
        super.onDestroyView();
        SparseArray sparseArray = this.f129850p;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f129849n = AbstractC88979t.m154296a(AbstractC88979t.m154310b(C39223a.m79604r()), C17873f.m33097e(), C57026c.f129854a).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143289d(new C57027d(this));
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f129849n = AbstractC88979t.m154310b(C39223a.m79604r()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143289d(new C57028e(this));
        this.f129841b = System.currentTimeMillis();
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.swipeup.b$k */
    static final class RunnableC57034k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C57023b f129862a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89235b f129863b;

        static {
            Covode.recordClassIndex(66923);
        }

        RunnableC57034k(C57023b bVar, C89233z.C89235b bVar2) {
            this.f129862a = bVar;
            this.f129863b = bVar2;
        }

        public final void run() {
            if (this.f129862a.af_()) {
                TextView textView = this.f129862a.f129846k;
                if (textView == null) {
                    C89219l.m154710a("startWatchingView");
                }
                int top = textView.getTop();
                View a = this.f129862a.mo94181a(R.id.bdx);
                C89219l.m154716b(a, "");
                float bottom = ((float) (top - a.getBottom())) - C13628n.m24520b(this.f129862a.getContext(), 24.0f);
                if (bottom < this.f129863b.element) {
                    View a2 = this.f129862a.mo94181a(R.id.fc5);
                    C89219l.m154716b(a2, "");
                    a2.getLayoutParams().height = (int) bottom;
                    View a3 = this.f129862a.mo94181a(R.id.fc5);
                    C89219l.m154716b(a3, "");
                    ViewGroup.LayoutParams layoutParams = a3.getLayoutParams();
                    View a4 = this.f129862a.mo94181a(R.id.fc5);
                    C89219l.m154716b(a4, "");
                    layoutParams.width = a4.getLayoutParams().height;
                    View a5 = this.f129862a.mo94181a(R.id.fc5);
                    C89219l.m154716b(a5, "");
                    View a6 = this.f129862a.mo94181a(R.id.fc5);
                    C89219l.m154716b(a6, "");
                    a5.setLayoutParams(a6.getLayoutParams());
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.swipeup.b$i */
    public static final class C57032i extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        final /* synthetic */ C57023b f129860a;

        static {
            Covode.recordClassIndex(66921);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57032i(C57023b bVar) {
            this.f129860a = bVar;
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            C89219l.m154721d(motionEvent, "");
            C89219l.m154721d(motionEvent2, "");
            if (motionEvent2.getRawY() - motionEvent.getRawY() < 0.0f && Math.abs(motionEvent2.getRawY() - motionEvent.getRawY()) >= 25.0f && Math.abs(f2) >= 400.0f) {
                if (!this.f129860a.f129848m) {
                    this.f129860a.f129848m = true;
                    this.f129860a.mo94183b("slide_up");
                }
                C57023b.m103369a();
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.swipeup.b$e */
    static final class C57028e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C57023b f129856a;

        static {
            Covode.recordClassIndex(66917);
        }

        C57028e(C57023b bVar) {
            this.f129856a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            ((ITpcConsentService) obj).mo68646i();
            AbstractC88412b bVar = this.f129856a.f129849n;
            if (bVar != null) {
                bVar.dispose();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.swipeup.b$f */
    static final class View$OnClickListenerC57029f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C57023b f129857a;

        static {
            Covode.recordClassIndex(66918);
        }

        View$OnClickListenerC57029f(C57023b bVar) {
            this.f129857a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f129857a.mo94182a("click");
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ View m103368a(C57023b bVar) {
        View view = bVar.f129845j;
        if (view == null) {
            C89219l.m154710a("viewRoot");
        }
        return view;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C39162r.m79460a("welcomescreen_show", new HashMap());
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.swipeup.b$d */
    static final class C57027d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C57023b f129855a;

        static {
            Covode.recordClassIndex(66916);
        }

        C57027d(C57023b bVar) {
            this.f129855a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C57025b bVar = (C57025b) obj;
            if (bVar.f129851a && C17873f.f42636l) {
                bVar.f129852b.mo68645h();
            }
            AbstractC88412b bVar2 = this.f129855a.f129849n;
            if (bVar2 != null) {
                bVar2.dispose();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.swipeup.b$g */
    static final class View$OnClickListenerC57030g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C57023b f129858a;

        static {
            Covode.recordClassIndex(66919);
        }

        View$OnClickListenerC57030g(C57023b bVar) {
            this.f129858a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f129858a.f129848m = true;
            this.f129858a.mo94183b("click");
            AbstractC81915c.m141874a(new C56955b());
        }
    }

    /* renamed from: a */
    public final void mo94182a(String str) {
        if (af_()) {
            TextView textView = this.f129846k;
            if (textView == null) {
                C89219l.m154710a("startWatchingView");
            }
            if (textView.getVisibility() != 0) {
                TextView textView2 = this.f129846k;
                if (textView2 == null) {
                    C89219l.m154710a("startWatchingView");
                }
                textView2.setAlpha(0.0f);
                TextView textView3 = this.f129846k;
                if (textView3 == null) {
                    C89219l.m154710a("startWatchingView");
                }
                textView3.setVisibility(0);
                C39162r.m79460a("start_watching_button_show", new C33744d().mo59983a("exit_method", str).mo59981a("duration", System.currentTimeMillis() - this.f129841b).f79943a);
                TextView textView4 = this.f129846k;
                if (textView4 == null) {
                    C89219l.m154710a("startWatchingView");
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView4, "alpha", 0.0f, 1.0f);
                this.f129840a = ofFloat;
                if (ofFloat == null) {
                    C89219l.m154715b();
                }
                ofFloat.setDuration(200L);
                ObjectAnimator objectAnimator = this.f129840a;
                if (objectAnimator == null) {
                    C89219l.m154715b();
                }
                objectAnimator.start();
            }
        }
    }

    /* renamed from: b */
    public final void mo94183b(String str) {
        C89219l.m154721d(str, "");
        AbstractC56869p a = AbstractC56869p.C56870a.m103133a();
        try {
            C33744d a2 = new C33744d().mo59983a("exit_method", str).mo59981a("duration", System.currentTimeMillis() - this.f129841b).mo59980a("if_send_fake_feed", a.f129514g).mo59983a("debuginfo", a.f129515h.toString());
            Integer a3 = HybridABInfoService.m69246b().mo60084a();
            if (a3 != null) {
                a2.mo59980a("is_ab_backend_resp_received", a3.intValue());
            }
            C39162r.m79460a("exit_welcomescreen", a2.f79943a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.swipeup.b$b */
    public static final class C57025b {

        /* renamed from: a */
        public final boolean f129851a;

        /* renamed from: b */
        public final ITpcConsentService f129852b;

        /* renamed from: c */
        public final WeakReference<Activity> f129853c;

        static {
            Covode.recordClassIndex(66914);
        }

        public C57025b(ITpcConsentService iTpcConsentService, WeakReference<Activity> weakReference) {
            C89219l.m154721d(iTpcConsentService, "");
            C89219l.m154721d(weakReference, "");
            this.f129852b = iTpcConsentService;
            this.f129853c = weakReference;
            this.f129851a = iTpcConsentService.mo68637a((AbstractC39273a) null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.swipeup.b$c */
    static final class C57026c<T1, T2, R> implements AbstractC88430c {

        /* renamed from: a */
        public static final C57026c f129854a = new C57026c();

        static {
            Covode.recordClassIndex(66915);
        }

        C57026c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88430c
        /* renamed from: a */
        public final /* synthetic */ Object mo9210a(Object obj, Object obj2) {
            ITpcConsentService iTpcConsentService = (ITpcConsentService) obj;
            C89219l.m154721d(iTpcConsentService, "");
            C89219l.m154721d(obj2, "");
            return new C57025b(iTpcConsentService, new WeakReference(obj2));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.swipeup.b$j */
    static final class View$OnTouchListenerC57033j implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C57023b f129861a;

        static {
            Covode.recordClassIndex(66922);
        }

        View$OnTouchListenerC57033j(C57023b bVar) {
            this.f129861a = bVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C89219l.m154716b(motionEvent, "");
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f129861a.f129843d = motionEvent.getRawY();
            } else if (action != 1) {
                if (action == 2) {
                    this.f129861a.f129844e = ((float) ((int) motionEvent.getRawY())) - this.f129861a.f129843d;
                    if (this.f129861a.f129844e < 0.0f) {
                        C57023b.m103368a(this.f129861a).setTranslationY(this.f129861a.f129844e);
                    }
                }
            } else if (Math.abs(C57023b.m103368a(this.f129861a).getTranslationY()) >= ((float) (C57023b.m103368a(this.f129861a).getMeasuredHeight() / 3))) {
                if (!this.f129861a.f129848m) {
                    this.f129861a.mo94183b("slide_up");
                    this.f129861a.f129848m = true;
                }
                C57023b.m103369a();
            } else {
                C57023b bVar = this.f129861a;
                View view2 = bVar.f129845j;
                if (view2 == null) {
                    C89219l.m154710a("viewRoot");
                }
                view2.clearAnimation();
                View view3 = bVar.f129845j;
                if (view3 == null) {
                    C89219l.m154710a("viewRoot");
                }
                ObjectAnimator.ofFloat(view3, View.TRANSLATION_Y, 0.0f).start();
            }
            GestureDetector gestureDetector = this.f129861a.f129842c;
            if (gestureDetector == null) {
                C89219l.m154710a("mGestureDetector");
            }
            gestureDetector.onTouchEvent(motionEvent);
            return false;
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        boolean z;
        float f;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        if (C39223a.m79604r().mo68637a((AbstractC39273a) null)) {
            ITpcConsentService r = C39223a.m79604r();
            ActivityC0945e activity = getActivity();
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            r.mo68636a(activity, "swipe_up");
        }
        TuxTextView tuxTextView = (TuxTextView) mo94181a(R.id.e6z);
        C89219l.m154716b(tuxTextView, "");
        this.f129846k = tuxTextView;
        Context context = this.f129847l;
        if (context == null) {
            context = getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(context, "");
        }
        C33744d a = new C33744d().mo59980a("backend_response_received", C50418a.f116406b.contains("response_caching_complete") ? 1 : 0);
        NewUserProgressModel.SwipeUpText swipeUpText = C50418a.f116412h;
        if (swipeUpText != null) {
            str = swipeUpText.getTitle();
        } else {
            str = null;
        }
        C39162r.m79460a("show_welcome_new_guidance", a.mo59980a("new_copy_shown", C80537hk.m139613a(str) ? 1 : 0).f79943a);
        ((TuxTextView) mo94181a(R.id.title)).mo37697a(38.0f);
        String c = C50418a.C50419a.m94574c();
        boolean z2 = true;
        if (c == null || C89361p.m154870a((CharSequence) c)) {
            TuxTextView tuxTextView2 = (TuxTextView) mo94181a(R.id.title);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setText(context.getString(R.string.deq));
        } else {
            TuxTextView tuxTextView3 = (TuxTextView) mo94181a(R.id.title);
            C89219l.m154716b(tuxTextView3, "");
            tuxTextView3.setText(C50418a.C50419a.m94574c());
        }
        String d = C50418a.C50419a.m94575d();
        if (d == null || C89361p.m154870a((CharSequence) d)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TuxTextView tuxTextView4 = (TuxTextView) mo94181a(R.id.dtf);
            C89219l.m154716b(tuxTextView4, "");
            tuxTextView4.setText(context.getString(R.string.g8z));
        } else {
            TuxTextView tuxTextView5 = (TuxTextView) mo94181a(R.id.dtf);
            C89219l.m154716b(tuxTextView5, "");
            tuxTextView5.setText(C50418a.C50419a.m94575d());
        }
        TextView textView = this.f129846k;
        if (textView == null) {
            C89219l.m154710a("startWatchingView");
        }
        textView.setText(context.getString(R.string.ddb));
        TextView textView2 = this.f129846k;
        if (textView2 == null) {
            C89219l.m154710a("startWatchingView");
        }
        C17235c.m31810a(textView2, 0.75f);
        TuxTextView tuxTextView6 = (TuxTextView) mo94181a(R.id.title);
        C89219l.m154716b(tuxTextView6, "");
        C56834a.m103085a(tuxTextView6);
        TuxTextView tuxTextView7 = (TuxTextView) mo94181a(R.id.dtf);
        C89219l.m154716b(tuxTextView7, "");
        C56834a.m103085a(tuxTextView7);
        ConstraintLayout constraintLayout = (ConstraintLayout) mo94181a(R.id.dnb);
        C89219l.m154716b(constraintLayout, "");
        ViewParent parent = constraintLayout.getParent();
        Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
        this.f129845j = (View) parent;
        ((ConstraintLayout) mo94181a(R.id.dnb)).setOnClickListener(new View$OnClickListenerC57029f(this));
        TextView textView3 = this.f129846k;
        if (textView3 == null) {
            C89219l.m154710a("startWatchingView");
        }
        textView3.setOnClickListener(new View$OnClickListenerC57030g(this));
        ((ConstraintLayout) mo94181a(R.id.dnb)).postDelayed(new RunnableC57031h(this), InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) mo94181a(R.id.dnb);
        C89219l.m154716b(constraintLayout2, "");
        this.f129842c = new GestureDetector(constraintLayout2.getContext(), new C57032i(this));
        if (((ComponentDependencies) C1181ae.m3881a(requireActivity(), (C1175ad.AbstractC1177b) null).mo3983a(ComponentDependencies.class)).f129538a) {
            ((ConstraintLayout) mo94181a(R.id.dnb)).setOnTouchListener(new View$OnTouchListenerC57033j(this));
        }
        C33947e.m69516a(this, mo94181a(R.id.fc5)).mo60217a(mo94181a(R.id.fc5), new WelcomeVideoWidget("welcome_screen_video4.mp4", 2131235022, (byte) 0));
        int a2 = C13628n.m24504a(getContext());
        float f2 = (float) a2;
        if ((((float) C13628n.m24521b(getContext())) * 1.0f) / f2 >= 1.7777778f) {
            z2 = false;
        }
        Context context2 = getContext();
        if (z2) {
            f = 300.0f;
        } else {
            f = 376.0f;
        }
        float b = C13628n.m24520b(context2, f);
        C89233z.C89235b bVar = new C89233z.C89235b();
        bVar.element = b;
        if (f2 < b) {
            bVar.element = f2;
            View a3 = mo94181a(R.id.fc5);
            C89219l.m154716b(a3, "");
            a3.getLayoutParams().height = a2;
            View a4 = mo94181a(R.id.fc5);
            C89219l.m154716b(a4, "");
            ViewGroup.LayoutParams layoutParams = a4.getLayoutParams();
            View a5 = mo94181a(R.id.fc5);
            C89219l.m154716b(a5, "");
            layoutParams.width = a5.getLayoutParams().height;
        } else if (z2) {
            View a6 = mo94181a(R.id.fc5);
            C89219l.m154716b(a6, "");
            a6.getLayoutParams().height = (int) b;
            View a7 = mo94181a(R.id.fc5);
            C89219l.m154716b(a7, "");
            ViewGroup.LayoutParams layoutParams2 = a7.getLayoutParams();
            View a8 = mo94181a(R.id.fc5);
            C89219l.m154716b(a8, "");
            layoutParams2.width = a8.getLayoutParams().height;
        }
        mo94181a(R.id.fc5).post(new RunnableC57034k(this, bVar));
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.aba, viewGroup, false);
    }
}
