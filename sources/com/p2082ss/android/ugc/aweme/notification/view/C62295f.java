package com.p2082ss.android.ugc.aweme.notification.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1197c.C17167b;
import com.bytedance.ies.dmt.p1194ui.p1197c.C17168c;
import com.bytedance.tux.input.TuxCompoundIconTextView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23001b;
import com.bytedance.tux.p1710c.C23005c;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.inbox.p3266a.C56297a;
import com.p2082ss.android.ugc.aweme.inbox.p3269d.C56344d;
import com.p2082ss.android.ugc.aweme.main.AbstractC59042b;
import com.p2082ss.android.ugc.aweme.notice.api.C61542b;
import com.p2082ss.android.ugc.aweme.upvote.p4188b.C79706b;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.notification.view.f */
public final class C62295f extends AbstractC59042b {

    /* renamed from: d */
    public static final C62296a f141400d = new C62296a((byte) 0);

    /* renamed from: b */
    public ViewGroup f141401b;

    /* renamed from: c */
    public final Activity f141402c;

    /* renamed from: e */
    private int[] f141403e;

    /* renamed from: f */
    private final AbstractC89244h f141404f;

    /* renamed from: g */
    private Integer[] f141405g;

    /* renamed from: h */
    private TuxTextView[] f141406h;

    /* renamed from: i */
    private ImageView f141407i;

    /* renamed from: j */
    private AnimatorSet f141408j;

    static {
        Covode.recordClassIndex(73075);
    }

    /* renamed from: b */
    private final List<Integer> m112701b() {
        return (List) this.f141404f.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.view.f$a */
    public static final class C62296a {
        static {
            Covode.recordClassIndex(73076);
        }

        private C62296a() {
        }

        public /* synthetic */ C62296a(byte b) {
            this();
        }
    }

    /* renamed from: d */
    private final boolean m112705d() {
        for (int i : this.f141403e) {
            if (i > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.view.f$k */
    static final class C62306k extends AbstractC89220m implements AbstractC89171a<List<Integer>> {

        /* renamed from: a */
        public static final C62306k f141418a = new C62306k();

        static {
            Covode.recordClassIndex(73086);
        }

        C62306k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<Integer> invoke() {
            List c = C89070n.m154524c(3, 2, 6, 7, 99, 228);
            C56297a.m102298a(c);
            return c;
        }
    }

    /* renamed from: c */
    private final void m112703c() {
        int a;
        Iterator<T> it = m112701b().iterator();
        int i = 0;
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            int[] iArr = this.f141403e;
            if (intValue == 2) {
                a = C61542b.m111458a(2, 219);
            } else if (intValue == 6) {
                a = C61542b.m111458a(6, 14);
            } else if (intValue != 7) {
                a = C61542b.m111458a(intValue);
            } else {
                a = C61542b.m111458a(7, 12);
            }
            iArr[i] = a;
            int[] iArr2 = this.f141403e;
            if (iArr2[i] > 0) {
                m112700a(this.f141406h[i], iArr2[i]);
            }
            i++;
        }
    }

    /* renamed from: f */
    private static void m112707f() {
        C39162r.m79460a("message_pop_notice_show", new C33744d().mo59980a("like_cnt", C61542b.m111458a(3)).mo59980a("comment_cnt", C61542b.m111458a(2)).mo59980a("mention_cnt", C61542b.m111458a(6)).mo59980a("follower_cnt", C61542b.m111458a(7)).mo59980a("message_cnt", C61542b.m111458a(99)).mo59980a("upvote_cnt", C61542b.m111458a(228)).f79943a);
    }

    /* renamed from: a */
    public final void mo100288a() {
        Activity activity;
        if (this.f141408j != null && (activity = this.f141402c) != null && !activity.isFinishing() && isShowing()) {
            ViewGroup viewGroup = this.f141401b;
            if (viewGroup == null) {
                C89219l.m154710a("mRootView");
            }
            viewGroup.clearAnimation();
            AnimatorSet animatorSet = this.f141408j;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            try {
                dismiss();
            } catch (Exception e) {
                e.printStackTrace();
                C51423a.m95790a((Throwable) e);
            }
        }
    }

    /* renamed from: e */
    private final void m112706e() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        C89219l.m154716b(ofFloat, "");
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new C17168c());
        ofFloat.addUpdateListener(new C62297b(this));
        ofFloat.addListener(new C62298c(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, -10.0f);
        C89219l.m154716b(ofFloat2, "");
        ofFloat2.setDuration(200L);
        ofFloat2.addUpdateListener(new C62299d(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(-10.0f, 0.0f);
        C89219l.m154716b(ofFloat3, "");
        ofFloat3.setDuration(500L);
        ofFloat3.addUpdateListener(new C62300e(this));
        ofFloat3.setStartDelay(200);
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(0.0f, -10.0f);
        C89219l.m154716b(ofFloat4, "");
        ofFloat4.setDuration(150L);
        ofFloat4.setStartDelay(5700);
        ofFloat4.addUpdateListener(new C62301f(this));
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(-10.0f, 0.0f);
        C89219l.m154716b(ofFloat5, "");
        ofFloat5.setDuration(300L);
        ofFloat5.setStartDelay(5850);
        ofFloat5.addUpdateListener(new C62302g(this));
        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(1.0f, 0.0f);
        C89219l.m154716b(ofFloat6, "");
        ofFloat6.setDuration(300L);
        ofFloat6.setStartDelay(5850);
        ofFloat6.setInterpolator(new C17167b());
        ofFloat6.addUpdateListener(new C62303h(this));
        ofFloat6.addListener(new C62304i(this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f141408j = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6);
        AnimatorSet animatorSet2 = this.f141408j;
        if (animatorSet2 != null) {
            animatorSet2.start();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.view.f$c */
    public static final class C62298c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C62295f f141410a;

        static {
            Covode.recordClassIndex(73078);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62298c(C62295f fVar) {
            this.f141410a = fVar;
        }

        public final void onAnimationStart(Animator animator) {
            C89219l.m154721d(animator, "");
            C62295f.m112698a(this.f141410a).setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.view.f$i */
    public static final class C62304i extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C62295f f141416a;

        static {
            Covode.recordClassIndex(73084);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C62304i(C62295f fVar) {
            this.f141416a = fVar;
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154721d(animator, "");
            this.f141416a.mo100288a();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ ViewGroup m112698a(C62295f fVar) {
        ViewGroup viewGroup = fVar.f141401b;
        if (viewGroup == null) {
            C89219l.m154710a("mRootView");
        }
        return viewGroup;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.view.f$d */
    public static final class C62299d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C62295f f141411a;

        static {
            Covode.recordClassIndex(73079);
        }

        C62299d(C62295f fVar) {
            this.f141411a = fVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup a = C62295f.m112698a(this.f141411a);
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            a.setTranslationY(((Float) animatedValue).floatValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.view.f$e */
    public static final class C62300e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C62295f f141412a;

        static {
            Covode.recordClassIndex(73080);
        }

        C62300e(C62295f fVar) {
            this.f141412a = fVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup a = C62295f.m112698a(this.f141412a);
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            a.setTranslationY(((Float) animatedValue).floatValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.view.f$f */
    public static final class C62301f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C62295f f141413a;

        static {
            Covode.recordClassIndex(73081);
        }

        C62301f(C62295f fVar) {
            this.f141413a = fVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup a = C62295f.m112698a(this.f141413a);
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            a.setTranslationY(((Float) animatedValue).floatValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.view.f$g */
    public static final class C62302g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C62295f f141414a;

        static {
            Covode.recordClassIndex(73082);
        }

        C62302g(C62295f fVar) {
            this.f141414a = fVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup a = C62295f.m112698a(this.f141414a);
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            a.setTranslationY(((Float) animatedValue).floatValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.view.f$b */
    public static final class C62297b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C62295f f141409a;

        static {
            Covode.recordClassIndex(73077);
        }

        C62297b(C62295f fVar) {
            this.f141409a = fVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup a = C62295f.m112698a(this.f141409a);
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            a.setScaleX(((Float) animatedValue).floatValue());
            ViewGroup a2 = C62295f.m112698a(this.f141409a);
            Object animatedValue2 = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
            a2.setScaleY(((Float) animatedValue2).floatValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.view.f$h */
    public static final class C62303h implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C62295f f141415a;

        static {
            Covode.recordClassIndex(73083);
        }

        C62303h(C62295f fVar) {
            this.f141415a = fVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup a = C62295f.m112698a(this.f141415a);
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            a.setScaleX(((Float) animatedValue).floatValue());
            ViewGroup a2 = C62295f.m112698a(this.f141415a);
            Object animatedValue2 = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
            a2.setScaleY(((Float) animatedValue2).floatValue());
        }
    }

    /* renamed from: a */
    private final void m112699a(int i) {
        ImageView imageView = this.f141407i;
        if (imageView == null) {
            C89219l.m154710a("mIvArrow");
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = i;
        ImageView imageView2 = this.f141407i;
        if (imageView2 == null) {
            C89219l.m154710a("mIvArrow");
        }
        imageView2.setLayoutParams(marginLayoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.view.f$j */
    public static final class C62305j extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ int f141417a;

        static {
            Covode.recordClassIndex(73085);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62305j(int i) {
            super(1);
            this.f141417a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = this.f141417a;
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            aVar2.f54432b = C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            aVar2.f54433c = C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system2.getDisplayMetrics()));
            aVar2.f54435e = Integer.valueOf((int) R.attr.aa);
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: com.bytedance.tux.input.TuxTextView[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private final void m112702b(View view) {
        Integer[] numArr = this.f141405g;
        int length = numArr.length;
        for (int i = 0; i < length; i++) {
            int intValue = numArr[i].intValue();
            this.f141406h[i] = view.findViewById(intValue);
            if (intValue == R.id.cn9) {
                TuxTextView tuxTextView = this.f141406h[i];
                if (!(tuxTextView instanceof TuxCompoundIconTextView)) {
                    tuxTextView = null;
                }
                TuxCompoundIconTextView tuxCompoundIconTextView = (TuxCompoundIconTextView) tuxTextView;
                if (tuxCompoundIconTextView != null) {
                    C23001b a = C23005c.m43393a(new C62305j(((Number) C79706b.m138537a(Integer.valueOf((int) R.raw.icon_raising_star), Integer.valueOf((int) R.raw.icon_repost))).intValue())).mo37368a(this.f141402c);
                    if (C80471gb.m139482a()) {
                        tuxCompoundIconTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, a, (Drawable) null);
                    } else {
                        tuxCompoundIconTextView.setCompoundDrawablesWithIntrinsicBounds(a, (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                }
            }
        }
        View findViewById = view.findViewById(R.id.cn3);
        C89219l.m154716b(findViewById, "");
        this.f141401b = (ViewGroup) findViewById;
        View findViewById2 = view.findViewById(R.id.cn2);
        C89219l.m154716b(findViewById2, "");
        this.f141407i = (ImageView) findViewById2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62295f(Activity activity) {
        super(activity);
        C89219l.m154721d(activity, "");
        this.f141402c = activity;
        int[] iArr = new int[6];
        int i = 0;
        do {
            iArr[i] = 0;
            i++;
        } while (i < 6);
        this.f141403e = iArr;
        this.f141404f = C89250i.m154773a((AbstractC89171a) C62306k.f141418a);
        this.f141405g = new Integer[]{Integer.valueOf((int) R.id.cn7), Integer.valueOf((int) R.id.cn5), Integer.valueOf((int) R.id.cn4), Integer.valueOf((int) R.id.cn6), Integer.valueOf((int) R.id.cn8), Integer.valueOf((int) R.id.cn9)};
        this.f141406h = new TuxTextView[6];
        View a = C1870c.m6045a(this.f141402c, (int) R.layout.ld);
        C89219l.m154716b(a, "");
        setContentView(a);
        setBackgroundDrawable(new ColorDrawable(C0643b.m2378c(this.f141402c, R.color.c9)));
        setOutsideTouchable(false);
        setWidth(-2);
        setHeight(-2);
        update();
        m112702b(a);
    }

    /* renamed from: c */
    private final void m112704c(View view) {
        boolean a = C80471gb.m139483a(this.f141402c);
        ViewGroup viewGroup = this.f141401b;
        if (viewGroup == null) {
            C89219l.m154710a("mRootView");
        }
        int measuredWidth = viewGroup.getMeasuredWidth();
        ViewGroup viewGroup2 = this.f141401b;
        if (viewGroup2 == null) {
            C89219l.m154710a("mRootView");
        }
        int measuredHeight = viewGroup2.getMeasuredHeight();
        int a2 = C13628n.m24504a(this.f141402c);
        ImageView imageView = this.f141407i;
        if (imageView == null) {
            C89219l.m154710a("mIvArrow");
        }
        int measuredWidth2 = imageView.getMeasuredWidth();
        int measuredWidth3 = view.getMeasuredWidth();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        float f = (float) measuredWidth;
        float f2 = f / 2.0f;
        float f3 = ((float) iArr[0]) + (((float) measuredWidth3) / 2.0f);
        if (!a) {
            float f4 = (float) a2;
            if (((float) (measuredWidth / 2)) + f3 >= f4) {
                f2 = f - (f4 - f3);
            }
        } else if (f3 - ((float) (measuredWidth / 2)) <= 0.0f) {
            f2 = f3;
        }
        m112699a((int) (f2 - (((float) measuredWidth2) / 2.0f)));
        update((int) (f3 - f2), (int) ((((float) iArr[1]) - ((float) view.getHeight())) - C13628n.m24520b(this.f141402c, 8.0f)), measuredWidth, measuredHeight);
        ViewGroup viewGroup3 = this.f141401b;
        if (viewGroup3 == null) {
            C89219l.m154710a("mRootView");
        }
        viewGroup3.setPivotX(f2);
        ViewGroup viewGroup4 = this.f141401b;
        if (viewGroup4 == null) {
            C89219l.m154710a("mRootView");
        }
        viewGroup4.setPivotY((float) measuredHeight);
    }

    /* renamed from: a */
    public final boolean mo100289a(View view) {
        C89219l.m154721d(view, "");
        m112703c();
        if (!m112705d()) {
            dismiss();
            Runnable runnable = this.f134414a;
            if (runnable != null) {
                runnable.run();
            }
            return false;
        }
        if (this.f141402c != null && !isShowing() && !this.f141402c.isFinishing()) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            showAtLocation(view, 51, iArr[0], iArr[1] - view.getHeight());
            ViewGroup viewGroup = this.f141401b;
            if (viewGroup == null) {
                C89219l.m154710a("mRootView");
            }
            viewGroup.measure(0, 0);
            m112704c(view);
            m112707f();
            C56344d.f128527b = SystemClock.uptimeMillis();
        }
        m112706e();
        return true;
    }

    /* renamed from: a */
    private static void m112700a(TuxTextView tuxTextView, int i) {
        if (i <= 0) {
            if (tuxTextView != null) {
                tuxTextView.setVisibility(8);
            }
        } else if (tuxTextView != null) {
            tuxTextView.setVisibility(0);
            tuxTextView.setText(C53437b.m98615a((long) i));
        }
    }
}
