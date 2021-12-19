package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.core.graphics.drawable.C0705a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.C16041a;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgBubble;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgProfileTabGuide;
import com.p2082ss.android.ugc.aweme.money.growth.C60180e;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.bb */
public final class C50099bb extends PopupWindow {

    /* renamed from: i */
    public static boolean f115642i;

    /* renamed from: j */
    public static String f115643j = "";

    /* renamed from: k */
    public static int f115644k = 5000;

    /* renamed from: l */
    public static final long f115645l = 300;

    /* renamed from: m */
    public static final C50100a f115646m = new C50100a((byte) 0);

    /* renamed from: a */
    public final View f115647a;

    /* renamed from: b */
    public final String f115648b;

    /* renamed from: c */
    public final Runnable f115649c = new RunnableC50102c(this);

    /* renamed from: d */
    public int f115650d;

    /* renamed from: e */
    public final FrameLayout f115651e;

    /* renamed from: f */
    public final int f115652f;

    /* renamed from: g */
    public int f115653g;

    /* renamed from: h */
    public final Context f115654h;

    /* renamed from: n */
    private int f115655n;

    /* renamed from: o */
    private final TextView f115656o;

    /* renamed from: p */
    private final ImageView f115657p;

    /* renamed from: q */
    private final ImageView f115658q;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.bb$a */
    public static final class C50100a {
        static {
            Covode.recordClassIndex(59226);
        }

        private C50100a() {
        }

        public /* synthetic */ C50100a(byte b) {
            this();
        }

        /* renamed from: b */
        private static boolean m94053b(UgAwemeActivitySetting ugAwemeActivitySetting) {
            try {
                Boolean isNewUser = ugAwemeActivitySetting.getIsNewUser();
                if (isNewUser == null) {
                    C89219l.m154715b();
                }
                if (isNewUser.booleanValue()) {
                    return true;
                }
                return false;
            } catch (C16041a e) {
                e.printStackTrace();
                return false;
            }
        }

        /* renamed from: c */
        private static boolean m94054c(UgAwemeActivitySetting ugAwemeActivitySetting) {
            try {
                UgProfileTabGuide profileTabGuide = ugAwemeActivitySetting.getProfileTabGuide();
                C89219l.m154716b(profileTabGuide, "");
                UgBubble bubble = profileTabGuide.getBubble();
                C89219l.m154716b(bubble, "");
                C50099bb.f115643j = bubble.getText();
                UgBubble bubble2 = profileTabGuide.getBubble();
                C89219l.m154716b(bubble2, "");
                C50099bb.f115644k = bubble2.getSeconds().intValue() * 1000;
                if (!TextUtils.isEmpty(C50099bb.f115643j)) {
                    return true;
                }
                return false;
            } catch (C16041a e) {
                e.printStackTrace();
                return false;
            }
        }

        /* renamed from: a */
        public static boolean m94052a(UgAwemeActivitySetting ugAwemeActivitySetting) {
            boolean z;
            if (ugAwemeActivitySetting == null || C60180e.f137181g.f137184b.f137177b || !m94054c(ugAwemeActivitySetting)) {
                return false;
            }
            try {
                if (!ugAwemeActivitySetting.getOverallSwitch().booleanValue()) {
                    return false;
                }
                if (m94053b(ugAwemeActivitySetting)) {
                    C49907s.m93685a();
                    if (C50099bb.f115642i) {
                        C50099bb.f115642i = false;
                        z = true;
                    } else {
                        z = false;
                    }
                    Boolean a = C49907s.m93685a();
                    C89219l.m154716b(a, "");
                    if (!a.booleanValue() || z) {
                        return true;
                    }
                    return false;
                }
                return true;
            } catch (C16041a e) {
                e.printStackTrace();
                return false;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.bb$c */
    static final class RunnableC50102c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C50099bb f115660a;

        static {
            Covode.recordClassIndex(59228);
        }

        RunnableC50102c(C50099bb bbVar) {
            this.f115660a = bbVar;
        }

        public final void run() {
            this.f115660a.dismiss();
        }
    }

    static {
        Covode.recordClassIndex(59225);
    }

    /* renamed from: a */
    public final void mo85236a() {
        Context context = this.f115654h;
        if (context != null && (context instanceof Activity) && !((Activity) context).isFinishing()) {
            super.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.bb$d */
    public static final class RunnableC50103d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C50099bb f115661a;

        static {
            Covode.recordClassIndex(59229);
        }

        public RunnableC50103d(C50099bb bbVar) {
            this.f115661a = bbVar;
        }

        public final void run() {
            C50099bb bbVar = this.f115661a;
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(bbVar.f115651e, "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat(bbVar.f115651e, "scaleY", 0.0f, 1.0f), ObjectAnimator.ofFloat(bbVar.f115651e, "alpha", 0.0f, 1.0f));
            animatorSet.setDuration(C50099bb.f115645l);
            animatorSet.start();
        }
    }

    public final void dismiss() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f115651e, "scaleX", 1.0f, 0.0f), ObjectAnimator.ofFloat(this.f115651e, "scaleY", 1.0f, 0.0f), ObjectAnimator.ofFloat(this.f115651e, "alpha", 1.0f, 0.0f));
        animatorSet.setDuration(f115645l);
        animatorSet.addListener(new C50101b(this));
        animatorSet.start();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.bb$b */
    public static final class C50101b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C50099bb f115659a;

        static {
            Covode.recordClassIndex(59227);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C50101b(C50099bb bbVar) {
            this.f115659a = bbVar;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f115659a.mo85236a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C50099bb(Context context, View view, String str) {
        super(context);
        C89219l.m154721d(context, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(str, "");
        MethodCollector.m26663i(6846);
        this.f115654h = context;
        this.f115647a = view;
        this.f115648b = str;
        this.f115652f = (int) C13628n.m24520b(context, -8.0f);
        View inflate = LayoutInflater.from(context).inflate(R.layout.mk, (ViewGroup) null);
        View findViewById = inflate.findViewById(R.id.eu6);
        C89219l.m154716b(findViewById, "");
        TextView textView = (TextView) findViewById;
        this.f115656o = textView;
        textView.setText(str);
        textView.setTextColor(context.getResources().getColor(R.color.l));
        View findViewById2 = inflate.findViewById(R.id.b59);
        C89219l.m154716b(findViewById2, "");
        FrameLayout frameLayout = (FrameLayout) findViewById2;
        this.f115651e = frameLayout;
        View findViewById3 = inflate.findViewById(R.id.bsz);
        C89219l.m154716b(findViewById3, "");
        ImageView imageView = (ImageView) findViewById3;
        this.f115657p = imageView;
        View findViewById4 = inflate.findViewById(R.id.bt0);
        C89219l.m154716b(findViewById4, "");
        ImageView imageView2 = (ImageView) findViewById4;
        this.f115658q = imageView2;
        Drawable a = C0643b.m2369a(context, (int) R.drawable.w0);
        if (a != null) {
            Drawable.ConstantState constantState = a.getConstantState();
            if (constantState != null) {
                a = constantState.newDrawable();
                C89219l.m154716b(a, "");
            }
            Drawable mutate = C0705a.m2506e(a).mutate();
            C89219l.m154716b(mutate, "");
            C0705a.m2494a(mutate, context.getResources().getColor(R.color.bm));
            imageView.setImageDrawable(mutate);
        }
        Drawable a2 = C0643b.m2369a(context, (int) R.drawable.w1);
        if (a2 != null) {
            Drawable.ConstantState constantState2 = a2.getConstantState();
            if (constantState2 != null) {
                a2 = constantState2.newDrawable();
                C89219l.m154716b(a2, "");
            }
            Drawable mutate2 = C0705a.m2506e(a2).mutate();
            C89219l.m154716b(mutate2, "");
            C0705a.m2494a(mutate2, context.getResources().getColor(R.color.bm));
            imageView2.setImageDrawable(mutate2);
        }
        setContentView(inflate);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(new ColorDrawable(0));
        inflate.measure(0, 0);
        C89219l.m154716b(inflate, "");
        this.f115650d = inflate.getMeasuredHeight();
        this.f115655n = inflate.getMeasuredWidth();
        float b = C13628n.m24520b(context, 10.0f);
        View contentView = getContentView();
        C89219l.m154716b(contentView, "");
        int measuredWidth = contentView.getMeasuredWidth();
        View contentView2 = getContentView();
        C89219l.m154716b(contentView2, "");
        int measuredHeight = contentView2.getMeasuredHeight();
        ImageView imageView3 = (ImageView) getContentView().findViewById(R.id.bsz);
        ImageView imageView4 = (ImageView) getContentView().findViewById(R.id.bt0);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int a3 = C13628n.m24504a(context);
        int width = iArr[0] + (view.getWidth() / 2);
        this.f115653g = 0;
        int i = measuredWidth / 2;
        float f = (float) width;
        if (((float) i) + b > f) {
            this.f115653g = (int) (b - ((float) iArr[0]));
            C89219l.m154716b(imageView3, "");
            imageView3.getLayoutParams().width = (int) (f - b);
            C89219l.m154716b(imageView4, "");
            imageView4.getLayoutParams().width = measuredWidth - imageView3.getLayoutParams().width;
        } else {
            float f2 = ((float) a3) - b;
            if (((float) (width + i)) > f2) {
                this.f115653g = (int) (f2 - ((float) (iArr[0] + measuredWidth)));
                C89219l.m154716b(imageView4, "");
                imageView4.getLayoutParams().width = (int) (f2 - f);
                C89219l.m154716b(imageView3, "");
                imageView3.getLayoutParams().width = measuredWidth - imageView4.getLayoutParams().width;
            } else {
                this.f115653g = (view.getWidth() - measuredWidth) / 2;
                C89219l.m154716b(imageView3, "");
                imageView3.getLayoutParams().width = i;
                C89219l.m154716b(imageView4, "");
                imageView4.getLayoutParams().width = i;
            }
        }
        imageView3.getLayoutParams().height = measuredHeight;
        imageView4.getLayoutParams().height = measuredHeight;
        getContentView().measure(0, 0);
        View contentView3 = getContentView();
        C89219l.m154716b(contentView3, "");
        this.f115650d = contentView3.getMeasuredHeight();
        View contentView4 = getContentView();
        C89219l.m154716b(contentView4, "");
        this.f115655n = contentView4.getMeasuredWidth();
        frameLayout.setPivotX((float) imageView3.getMeasuredWidth());
        frameLayout.setPivotY((float) measuredHeight);
        frameLayout.getPivotX();
        frameLayout.getPivotY();
        MethodCollector.m26664o(6846);
    }
}
