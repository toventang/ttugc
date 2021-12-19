package com.p2082ss.android.ugc.aweme.commercialize.views;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import java.util.ArrayList;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer */
public final class AdHalfWebPageContainer extends C38948l {

    /* renamed from: e */
    public static final C38773a f91561e = new C38773a((byte) 0);

    /* renamed from: h */
    private static final String f91562h = AdHalfWebPageContainer.class.getSimpleName();

    /* renamed from: a */
    public boolean f91563a;

    /* renamed from: b */
    public boolean f91564b;

    /* renamed from: c */
    public boolean f91565c;

    /* renamed from: d */
    public boolean f91566d;

    /* renamed from: f */
    private boolean f91567f;

    /* renamed from: g */
    private final AbstractC89244h f91568g;

    public AdHalfWebPageContainer(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public AdHalfWebPageContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final View getDecorView() {
        return (View) this.f91568g.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$a */
    public static final class C38773a {
        static {
            Covode.recordClassIndex(46317);
        }

        private C38773a() {
        }

        public /* synthetic */ C38773a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$b */
    static final class RunnableC38774b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageContainer f91569a;

        static {
            Covode.recordClassIndex(46318);
        }

        RunnableC38774b(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f91569a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f91569a.f91563a = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$e */
    static final class RunnableC38777e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageContainer f91573a;

        static {
            Covode.recordClassIndex(46321);
        }

        RunnableC38777e(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f91573a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f91573a.f91563a = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$f */
    static final class RunnableC38778f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageContainer f91574a;

        static {
            Covode.recordClassIndex(46322);
        }

        RunnableC38778f(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f91574a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f91574a.f91563a = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$h */
    static final class RunnableC38780h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageContainer f91576a;

        static {
            Covode.recordClassIndex(46324);
        }

        RunnableC38780h(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f91576a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f91576a.f91563a = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$j */
    static final class RunnableC38782j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageContainer f91578a;

        static {
            Covode.recordClassIndex(46326);
        }

        RunnableC38782j(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f91578a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f91578a.f91563a = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$l */
    static final class RunnableC38784l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageContainer f91580a;

        static {
            Covode.recordClassIndex(46328);
        }

        RunnableC38784l(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f91580a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f91580a.f91563a = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$m */
    static final class RunnableC38785m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageContainer f91581a;

        static {
            Covode.recordClassIndex(46329);
        }

        RunnableC38785m(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f91581a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f91581a.f91563a = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$n */
    static final class RunnableC38786n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageContainer f91582a;

        static {
            Covode.recordClassIndex(46330);
        }

        RunnableC38786n(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f91582a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f91582a.f91563a = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$o */
    static final class RunnableC38787o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageContainer f91583a;

        static {
            Covode.recordClassIndex(46331);
        }

        RunnableC38787o(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f91583a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f91583a.f91563a = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$c */
    static final class RunnableC38775c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageContainer f91570a;

        /* renamed from: b */
        final /* synthetic */ Runnable f91571b;

        static {
            Covode.recordClassIndex(46319);
        }

        RunnableC38775c(AdHalfWebPageContainer adHalfWebPageContainer, Runnable runnable) {
            this.f91570a = adHalfWebPageContainer;
            this.f91571b = runnable;
        }

        public final void run() {
            this.f91570a.f91563a = false;
            Runnable runnable = this.f91571b;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$i */
    static final class RunnableC38781i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageContainer f91577a;

        static {
            Covode.recordClassIndex(46325);
        }

        RunnableC38781i(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f91577a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f91577a.f91563a = false;
            this.f91577a.mo67320d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$k */
    static final class RunnableC38783k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageContainer f91579a;

        static {
            Covode.recordClassIndex(46327);
        }

        RunnableC38783k(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f91579a = adHalfWebPageContainer;
        }

        public final void run() {
            this.f91579a.f91563a = false;
            this.f91579a.mo67320d();
        }
    }

    /* renamed from: c */
    public final void mo67319c() {
        setTranslationX(getToTransX());
        setTranslationY(0.0f);
    }

    /* renamed from: d */
    public final void mo67320d() {
        setAlpha(0.0f);
        setVisibility(8);
        mo67319c();
    }

    /* renamed from: e */
    public final void mo67321e() {
        setAlpha(1.0f);
        m78700g();
    }

    public final boolean getCanCollapse() {
        if (!this.f91565c || this.f91566d) {
            return false;
        }
        return true;
    }

    public final boolean getCanExpand() {
        if (!this.f91565c || this.f91566d) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$d */
    static final class C38776d extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ Context f91572a;

        static {
            Covode.recordClassIndex(46320);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38776d(Context context) {
            super(0);
            this.f91572a = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            Window window;
            Context context = this.f91572a;
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity == null || (window = activity.getWindow()) == null) {
                return null;
            }
            return window.getDecorView();
        }
    }

    static {
        Covode.recordClassIndex(46316);
    }

    /* renamed from: g */
    private void m78700g() {
        if (this.f91567f && Build.VERSION.SDK_INT >= 21) {
            setZ(0.0f);
        }
        setVisibility(0);
    }

    private final int getScreenHeight() {
        View decorView = getDecorView();
        if (decorView != null) {
            return decorView.getHeight();
        }
        return C34723i.m70924a(getContext());
    }

    private final int getScreenWidth() {
        View decorView = getDecorView();
        if (decorView != null) {
            return decorView.getWidth();
        }
        return C34723i.m70928b(getContext());
    }

    /* renamed from: a */
    public final boolean mo67315a() {
        if (getVisibility() == 0 && getAlpha() == 1.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo67316b() {
        if (!this.f91567f || Build.VERSION.SDK_INT < 21) {
            setVisibility(4);
            return;
        }
        setZ(-1.0f);
        setVisibility(0);
    }

    /* renamed from: f */
    public final void mo67322f() {
        setTranslationX((((float) (getScreenWidth() - getWidth())) / 2.0f) - ((float) getLeft()));
    }

    private final float getToTransX() {
        int i;
        if (C80471gb.m139483a(getContext())) {
            int width = getWidth();
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            i = width + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            int width2 = getWidth();
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            i = -(width2 + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin);
        }
        return (float) i;
    }

    public final void setCollapsed(boolean z) {
        this.f91566d = z;
    }

    public final void setExpanded(boolean z) {
        this.f91565c = z;
    }

    public final void setUseZOrder(boolean z) {
        this.f91567f = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer$g */
    public static final class C38779g implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageContainer f91575a;

        static {
            Covode.recordClassIndex(46323);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C38779g(AdHalfWebPageContainer adHalfWebPageContainer) {
            this.f91575a = adHalfWebPageContainer;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f91575a.f91563a = false;
        }

        public final void onAnimationStart(Animator animator) {
            this.f91575a.f91563a = true;
        }
    }

    public final void setInCleanMode(boolean z) {
        int i;
        this.f91564b = z;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        setVisibility(i);
    }

    /* renamed from: a */
    public final void mo67313a(Runnable runnable) {
        this.f91566d = true;
        animate().translationY((float) (getScreenHeight() - getTop())).withStartAction(new RunnableC38774b(this)).withEndAction(new RunnableC38775c(this, runnable)).setDuration(400).start();
    }

    /* renamed from: b */
    public final void mo67318b(boolean z) {
        if (z) {
            animate().alpha(0.0f).translationY((float) C34728n.m70946a(15.0d)).withStartAction(new RunnableC38780h(this)).setDuration(290).withEndAction(new RunnableC38781i(this)).start();
        } else {
            animate().alpha(0.0f).translationX(getToTransX()).withStartAction(new RunnableC38782j(this)).setDuration(200).withEndAction(new RunnableC38783k(this)).start();
        }
    }

    /* renamed from: a */
    public final void mo67314a(boolean z) {
        if (!this.f91564b) {
            m78700g();
        }
        if (z) {
            setTranslationX(0.0f);
            setTranslationY((float) C34728n.m70946a(15.0d));
            animate().alpha(1.0f).translationY(0.0f).withStartAction(new RunnableC38784l(this)).setInterpolator(new LinearInterpolator()).setDuration(290).withEndAction(new RunnableC38785m(this)).start();
            return;
        }
        setTranslationX(getToTransX());
        setTranslationY(0.0f);
        animate().alpha(1.0f).translationX(0.0f).withStartAction(new RunnableC38786n(this)).setDuration(200).withEndAction(new RunnableC38787o(this)).start();
    }

    /* renamed from: b */
    public final void mo67317b(int i, int i2) {
        m78699a(i, i2, 0);
    }

    /* renamed from: a */
    public final void mo67312a(int i, int i2) {
        this.f91565c = true;
        this.f91566d = false;
        m78699a(i, i2, 100);
        float screenWidth = (((((float) (getScreenWidth() - i)) / 2.0f) - ((float) getLeft())) + ((float) i)) - ((float) getWidth());
        animate().translationX(screenWidth).translationY((((((float) (getScreenHeight() - i2)) / 2.0f) - ((float) getTop())) + ((float) i2)) - ((float) getHeight())).withStartAction(new RunnableC38777e(this)).withEndAction(new RunnableC38778f(this)).setDuration(100).start();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ AdHalfWebPageContainer(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AdHalfWebPageContainer(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        setAlpha(0.0f);
        setRadius(C34728n.m70946a(4.0d));
        this.f91568g = C89250i.m154773a((AbstractC89171a) new C38776d(context));
    }

    /* renamed from: a */
    private void m78699a(int i, int i2, long j) {
        ViewWrapper viewWrapper = new ViewWrapper(this);
        if (j == 0) {
            if (i > 0 && viewWrapper.getWidth() != i) {
                viewWrapper.setWidth(i);
            }
            if (i2 > 0 && viewWrapper.getHeight() != i2) {
                viewWrapper.setHeight(i2);
            }
        } else if (j > 0) {
            ArrayList arrayList = new ArrayList();
            if (i > 0 && viewWrapper.getWidth() != i) {
                ObjectAnimator ofInt = ObjectAnimator.ofInt(viewWrapper, "width", viewWrapper.getWidth(), i);
                C89219l.m154716b(ofInt, "");
                arrayList.add(ofInt);
            }
            if (i2 > 0 && viewWrapper.getHeight() != i2) {
                ObjectAnimator ofInt2 = ObjectAnimator.ofInt(viewWrapper, "height", viewWrapper.getHeight(), i2);
                C89219l.m154716b(ofInt2, "");
                arrayList.add(ofInt2);
            }
            if (!arrayList.isEmpty()) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                animatorSet.setDuration(j);
                animatorSet.addListener(new C38779g(this));
                animatorSet.start();
            }
        }
    }
}
