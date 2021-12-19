package com.p2082ss.android.ugc.aweme.journey.step.p3298g;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.IMandatoryLoginService;
import com.p2082ss.android.ugc.aweme.account.AbstractC31670g;
import com.p2082ss.android.ugc.aweme.account.C31373a;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.app.services.HybridABInfoService;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.C34671a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.journey.C56850b;
import com.p2082ss.android.ugc.aweme.journey.step.ComponentDependencies;
import com.p2082ss.android.ugc.aweme.journey.step.p3298g.AbstractC56959e;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.p4173ug.C79679i;
import com.p2082ss.android.ugc.aweme.services.MandatoryLoginService;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.step.g.a */
public final class C56945a extends AbstractC56959e implements AbstractC31670g, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public View f129670a;

    /* renamed from: b */
    public TextView f129671b;

    /* renamed from: c */
    public View f129672c;

    /* renamed from: d */
    public ViewStub f129673d;

    /* renamed from: e */
    final IMandatoryLoginService f129674e = MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false);

    /* renamed from: o */
    private SparseArray f129675o;

    static {
        Covode.recordClassIndex(66832);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.step.p3298g.AbstractC56959e
    /* renamed from: a */
    public final View mo94130a(int i) {
        if (this.f129675o == null) {
            this.f129675o = new SparseArray();
        }
        View view = (View) this.f129675o.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f129675o.put(i, findViewById);
        return findViewById;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(139, new RunnableC90250g(C56945a.class, "onComplianceSettingDoneEvent", C56850b.class, ThreadMode.POSTING, 0, true));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.step.p3298g.AbstractC56959e
    /* renamed from: h */
    public final void mo94137h() {
        SparseArray sparseArray = this.f129675o;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.g.a$d */
    static final class RunnableC56949d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C56945a f129679a;

        static {
            Covode.recordClassIndex(66836);
        }

        RunnableC56949d(C56945a aVar) {
            this.f129679a = aVar;
        }

        public final void run() {
            C56945a.m103273e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.g.a$b */
    static final class RunnableC56947b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C56945a f129677a;

        static {
            Covode.recordClassIndex(66834);
        }

        RunnableC56947b(C56945a aVar) {
            this.f129677a = aVar;
        }

        public final void run() {
            this.f129677a.mo94153i();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.g.a$c */
    static final class RunnableC56948c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C56945a f129678a;

        static {
            Covode.recordClassIndex(66835);
        }

        RunnableC56948c(C56945a aVar) {
            this.f129678a = aVar;
        }

        public final void run() {
            this.f129678a.mo94131a(0L);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.g.a$a */
    static final class RunnableC56946a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C56945a f129676a;

        static {
            Covode.recordClassIndex(66833);
        }

        RunnableC56946a(C56945a aVar) {
            this.f129676a = aVar;
        }

        public final void run() {
            this.f129676a.mo94132a((Boolean) null);
            C56945a.m103273e();
        }
    }

    /* renamed from: e */
    public static void m103273e() {
        AbstractC81915c.m141874a(new C56955b());
    }

    /* renamed from: b */
    public final View mo94133b() {
        View view = this.f129670a;
        if (view == null) {
            C89219l.m154710a("logoView");
        }
        return view;
    }

    /* renamed from: c */
    public final TextView mo94134c() {
        TextView textView = this.f129671b;
        if (textView == null) {
            C89219l.m154710a("sloganView");
        }
        return textView;
    }

    /* renamed from: d */
    public final View mo94135d() {
        View view = this.f129672c;
        if (view == null) {
            C89219l.m154710a("rootView");
        }
        return view;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.journey.step.p3298g.AbstractC56959e
    /* renamed from: g */
    public final ViewStub mo94136g() {
        ViewStub viewStub = this.f129673d;
        if (viewStub == null) {
            C89219l.m154710a("mStatusView");
        }
        return viewStub;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f129692j = System.currentTimeMillis();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (C17873f.f42636l) {
            mo94132a((Boolean) true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.AbstractC31670g
    /* renamed from: a */
    public final void mo57662a() {
        C31373a.C31374a.m65595b(this);
        this.f129694l.postDelayed(new RunnableC56949d(this), 100);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.step.p3298g.AbstractC56959e, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        DmtStatusView dmtStatusView = this.f129695m;
        if (dmtStatusView != null) {
            dmtStatusView.mo27382d();
        }
        C31373a.C31374a.m65595b(this);
        super.onDestroyView();
        mo94137h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.journey.step.g.a$f */
    public static final class RunnableC56953f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C56945a f129685a;

        /* renamed from: b */
        final /* synthetic */ Bundle f129686b;

        static {
            Covode.recordClassIndex(66840);
        }

        RunnableC56953f(C56945a aVar, Bundle bundle) {
            this.f129685a = aVar;
            this.f129686b = bundle;
        }

        public final void run() {
            this.f129685a.mo94132a((Boolean) null);
            this.f129685a.mo94153i();
            C79679i.f178789a.storeLong("mandatory_login_shown_millis", System.currentTimeMillis());
            C58957c.m108324a(this.f129685a, "cold_launch", "welcome_screen", this.f129686b, new AbstractC34543f(this) {
                /* class com.p2082ss.android.ugc.aweme.journey.step.p3298g.C56945a.RunnableC56953f.C569541 */

                /* renamed from: a */
                final /* synthetic */ RunnableC56953f f129687a;

                static {
                    Covode.recordClassIndex(66841);
                }

                @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
                /* renamed from: a */
                public final void mo57673a() {
                }

                @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
                /* renamed from: b */
                public final void mo57674b() {
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f129687a = r1;
                }
            });
            C31373a.C31374a.m65592a(this.f129685a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.g.a$e */
    static final class RunnableC56950e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C56945a f129680a;

        /* renamed from: b */
        final /* synthetic */ float f129681b;

        /* renamed from: c */
        final /* synthetic */ float f129682c;

        static {
            Covode.recordClassIndex(66837);
        }

        RunnableC56950e(C56945a aVar, float f, float f2) {
            this.f129680a = aVar;
            this.f129681b = f;
            this.f129682c = f2;
        }

        public final void run() {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f129680a.mo94134c(), "translationY", this.f129681b, ((float) (-this.f129680a.mo94135d().getHeight())) + this.f129681b + ((float) this.f129680a.mo94134c().getHeight()));
            View b = this.f129680a.mo94133b();
            float height = (float) this.f129680a.mo94135d().getHeight();
            float f = this.f129682c;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(b, "translationY", height - f, -f);
            C89219l.m154716b(ofFloat, "");
            ofFloat.setDuration(420L);
            C89219l.m154716b(ofFloat2, "");
            ofFloat2.setDuration(420L);
            ofFloat2.setStartDelay(100);
            ofFloat.addListener(new Animator.AnimatorListener(this) {
                /* class com.p2082ss.android.ugc.aweme.journey.step.p3298g.C56945a.RunnableC56950e.C569511 */

                /* renamed from: a */
                final /* synthetic */ RunnableC56950e f129683a;

                static {
                    Covode.recordClassIndex(66838);
                }

                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f129683a = r1;
                }

                public final void onAnimationStart(Animator animator) {
                    this.f129683a.f129680a.mo94134c().setAlpha(1.0f);
                }
            });
            ofFloat2.addListener(new Animator.AnimatorListener(this) {
                /* class com.p2082ss.android.ugc.aweme.journey.step.p3298g.C56945a.RunnableC56950e.C569522 */

                /* renamed from: a */
                final /* synthetic */ RunnableC56950e f129684a;

                static {
                    Covode.recordClassIndex(66839);
                }

                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f129684a = r1;
                }

                public final void onAnimationStart(Animator animator) {
                    this.f129684a.f129680a.mo94133b().setAlpha(1.0f);
                }

                public final void onAnimationEnd(Animator animator) {
                    Bundle arguments;
                    C56945a aVar = this.f129684a.f129680a;
                    if (Build.VERSION.SDK_INT <= 28 && Build.VERSION.SDK_INT >= 21) {
                        new Handler(Looper.getMainLooper()).post(new AbstractC56959e.RunnableC56960a(aVar));
                    }
                    C56945a aVar2 = this.f129684a.f129680a;
                    IAccountUserService g = C31575b.m65865g();
                    C89219l.m154716b(g, "");
                    boolean z = false;
                    if (!g.isLogin() && (arguments = aVar2.getArguments()) != null && arguments.getBoolean("extra_require_login", false)) {
                        z = true;
                    }
                    if (!z && !aVar2.f129674e.shouldShowForcedLogin()) {
                        aVar2.f129694l.postDelayed(new RunnableC56946a(aVar2), 1500);
                    } else if (aVar2.f129693k) {
                        aVar2.mo94131a(1500L);
                    } else {
                        aVar2.f129694l.postDelayed(new RunnableC56947b(aVar2), 1500);
                        aVar2.f129694l.postDelayed(new RunnableC56948c(aVar2), 2500);
                    }
                }
            });
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat).with(ofFloat2);
            animatorSet.start();
        }
    }

    @AbstractC90264r(mo145423b = true)
    public final void onComplianceSettingDoneEvent(C56850b bVar) {
        C89219l.m154721d(bVar, "");
        this.f129693k = true;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C39162r.m79460a("show_slogan_page", new HashMap());
    }

    /* renamed from: a */
    public final void mo94131a(long j) {
        Bundle loginActivityBundle = this.f129674e.getLoginActivityBundle();
        loginActivityBundle.putBoolean("is_from_new_user_journey", true);
        this.f129694l.postDelayed(new RunnableC56953f(this, loginActivityBundle), j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo94132a(Boolean bool) {
        String str;
        C33744d a = new C33744d().mo59980a("is_background", C89219l.m154714a(bool, true) ? 1 : 0).mo59981a("stay_time", System.currentTimeMillis() - this.f129692j);
        if (C34671a.f81927a.mo61331e()) {
            str = "1";
        } else {
            str = "0";
        }
        C33744d a2 = a.mo59983a("if_send_fake_feed", str);
        Integer a3 = HybridABInfoService.m69246b().mo60084a();
        if (a3 != null) {
            a2.mo59980a("is_ab_backend_resp_received", a3.intValue());
        }
        C39162r.m79460a("exit_slogan_page", a2.f79943a);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.step.p3298g.AbstractC56959e, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        long j;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        boolean z = ((ComponentDependencies) C1181ae.m3881a(requireActivity(), (C1175ad.AbstractC1177b) null).mo3983a(ComponentDependencies.class)).f129549l;
        ImageView imageView = (ImageView) mo94130a(R.id.cgx);
        C89219l.m154716b(imageView, "");
        this.f129670a = imageView;
        TuxTextView tuxTextView = (TuxTextView) mo94130a(R.id.e2y);
        C89219l.m154716b(tuxTextView, "");
        this.f129671b = tuxTextView;
        FrameLayout frameLayout = (FrameLayout) mo94130a(R.id.e2z);
        C89219l.m154716b(frameLayout, "");
        this.f129672c = frameLayout;
        ViewStub viewStub = (ViewStub) getView().findViewById(R.id.e7i);
        C89219l.m154716b(viewStub, "");
        this.f129673d = viewStub;
        ((TuxTextView) mo94130a(R.id.e2y)).mo37697a(42.0f);
        float b = C13628n.m24520b(view.getContext(), 60.0f);
        float b2 = C13628n.m24520b(view.getContext(), 46.0f);
        if (z) {
            string = getString(R.string.df4);
        } else if (C58071d.m104912f()) {
            string = getString(R.string.det);
        } else {
            string = getString(R.string.der);
        }
        C89219l.m154716b(string, "");
        if (z) {
            string2 = getString(R.string.df5);
        } else if (C58071d.m104912f()) {
            string2 = getString(R.string.deu);
        } else {
            string2 = getString(R.string.des);
        }
        C89219l.m154716b(string2, "");
        TextView textView = this.f129671b;
        if (textView == null) {
            C89219l.m154710a("sloganView");
        }
        textView.setText(string + "\n" + string2);
        View view2 = this.f129670a;
        if (view2 == null) {
            C89219l.m154710a("logoView");
        }
        RunnableC56950e eVar = new RunnableC56950e(this, b, b2);
        Bundle arguments = getArguments();
        if (arguments == null || arguments.getInt("extra_optimize_option", 0) <= 0) {
            j = 1000;
        } else {
            j = 0;
        }
        view2.postDelayed(eVar, j);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.abn, viewGroup, false);
    }
}
