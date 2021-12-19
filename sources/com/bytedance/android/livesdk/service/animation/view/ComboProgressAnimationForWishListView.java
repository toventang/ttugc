package com.bytedance.android.livesdk.service.animation.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.service.animation.p623b.C10651a;
import com.bytedance.android.livesdk.utils.C11227ap;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

public final class ComboProgressAnimationForWishListView extends FrameLayout {

    /* renamed from: d */
    public static final C10659a f25665d = new C10659a((byte) 0);

    /* renamed from: a */
    public int f25666a;

    /* renamed from: b */
    public AnimatorSet f25667b;

    /* renamed from: c */
    public boolean f25668c;

    /* renamed from: e */
    private AnimatorSet f25669e;

    /* renamed from: f */
    private HashMap f25670f;

    static {
        Covode.recordClassIndex(12250);
    }

    public ComboProgressAnimationForWishListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    public final View mo17568a(int i) {
        if (this.f25670f == null) {
            this.f25670f = new HashMap();
        }
        View view = (View) this.f25670f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f25670f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: com.bytedance.android.livesdk.service.animation.view.ComboProgressAnimationForWishListView$a */
    public static final class C10659a {
        static {
            Covode.recordClassIndex(12251);
        }

        private C10659a() {
        }

        public /* synthetic */ C10659a(byte b) {
            this();
        }
    }

    /* renamed from: e */
    private final void m19223e() {
        AnimatorSet animatorSet = this.f25669e;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.f25669e;
            if (animatorSet2 != null) {
                animatorSet2.removeAllListeners();
            }
            AnimatorSet animatorSet3 = this.f25669e;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
        }
        this.f25669e = null;
    }

    /* renamed from: d */
    public final void mo17572d() {
        AnimatorSet animatorSet = this.f25667b;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.f25667b;
            if (animatorSet2 != null) {
                animatorSet2.removeAllListeners();
            }
            AnimatorSet animatorSet3 = this.f25667b;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
        }
        this.f25667b = null;
    }

    /* renamed from: b */
    public final void mo17570b() {
        m19223e();
        float a = C11227ap.m19885a(getContext(), 38.0f) * 0.01f;
        ConstraintLayout constraintLayout = (ConstraintLayout) mo17568a(R.id.a8i);
        if (constraintLayout != null) {
            constraintLayout.setTranslationY(-a);
        }
    }

    /* renamed from: c */
    public final void mo17571c() {
        AnimatorSet animatorSet;
        m19223e();
        this.f25669e = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mo17568a(R.id.a8i), "translationY", C11227ap.m19885a(getContext(), 32.0f));
        AnimatorSet animatorSet2 = this.f25669e;
        if (animatorSet2 != null) {
            animatorSet2.playTogether(ofFloat);
        }
        if (Build.VERSION.SDK_INT >= 21 && (animatorSet = this.f25669e) != null) {
            animatorSet.setInterpolator(new PathInterpolator(0.66f, 0.0f, 0.86f, 0.0f));
        }
        AnimatorSet animatorSet3 = this.f25669e;
        if (animatorSet3 != null) {
            animatorSet3.setDuration(1800L);
        }
        AnimatorSet animatorSet4 = this.f25669e;
        if (animatorSet4 != null) {
            animatorSet4.start();
        }
    }

    /* renamed from: a */
    public final void mo17569a() {
        AnimatorSet animatorSet;
        float f;
        mo17572d();
        this.f25667b = new AnimatorSet();
        ConstraintLayout constraintLayout = (ConstraintLayout) mo17568a(R.id.a8r);
        if (constraintLayout != null) {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) mo17568a(R.id.a8r);
            if (constraintLayout2 != null) {
                f = (float) constraintLayout2.getHeight();
            } else {
                f = 0.0f;
            }
            constraintLayout.setPivotY(f);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mo17568a(R.id.a8r), "scaleY", 1.0f, 0.2f);
        AnimatorSet animatorSet2 = this.f25667b;
        if (animatorSet2 != null) {
            animatorSet2.playTogether(ofFloat);
        }
        AnimatorSet animatorSet3 = this.f25667b;
        if (animatorSet3 != null) {
            animatorSet3.addListener(new C10661c(this));
        }
        if (Build.VERSION.SDK_INT >= 21 && (animatorSet = this.f25667b) != null) {
            animatorSet.setInterpolator(new PathInterpolator(0.66f, 0.0f, 0.86f, 0.0f));
        }
        AnimatorSet animatorSet4 = this.f25667b;
        if (animatorSet4 != null) {
            animatorSet4.setDuration(1800L);
        }
        AnimatorSet animatorSet5 = this.f25667b;
        if (animatorSet5 != null) {
            animatorSet5.start();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.service.animation.view.ComboProgressAnimationForWishListView$b */
    public static final class C10660b extends C10651a {

        /* renamed from: a */
        final /* synthetic */ ComboProgressAnimationForWishListView f25671a;

        static {
            Covode.recordClassIndex(12252);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C10660b(ComboProgressAnimationForWishListView comboProgressAnimationForWishListView) {
            this.f25671a = comboProgressAnimationForWishListView;
        }

        @Override // com.bytedance.android.livesdk.service.animation.p623b.C10651a
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f25671a.mo17569a();
            this.f25671a.mo17571c();
        }

        @Override // com.bytedance.android.livesdk.service.animation.p623b.C10651a
        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ConstraintLayout constraintLayout = (ConstraintLayout) this.f25671a.mo17568a(R.id.a8r);
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.service.animation.view.ComboProgressAnimationForWishListView$c */
    public static final class C10661c implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ ComboProgressAnimationForWishListView f25672a;

        static {
            Covode.recordClassIndex(12253);
        }

        public final void onAnimationCancel(Animator animator) {
            C89219l.m154721d(animator, "");
        }

        public final void onAnimationRepeat(Animator animator) {
            C89219l.m154721d(animator, "");
        }

        public final void onAnimationStart(Animator animator) {
            C89219l.m154721d(animator, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C10661c(ComboProgressAnimationForWishListView comboProgressAnimationForWishListView) {
            this.f25672a = comboProgressAnimationForWishListView;
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154721d(animator, "");
            this.f25672a.f25668c = false;
        }
    }

    /* renamed from: a */
    public static Object m19222a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(6764);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(6764);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private /* synthetic */ ComboProgressAnimationForWishListView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ComboProgressAnimationForWishListView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(6915);
        LayoutInflater.from(context).inflate(R.layout.b4h, this);
        try {
            Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), "font/ttlive_base_gift_combo_font.ttf");
            LiveTextView liveTextView = (LiveTextView) mo17568a(R.id.a8j);
            if (liveTextView != null) {
                liveTextView.setTypeface(createFromAsset);
            }
            LiveTextView liveTextView2 = (LiveTextView) mo17568a(R.id.a8k);
            if (liveTextView2 != null) {
                liveTextView2.setTypeface(createFromAsset);
            }
            LiveTextView liveTextView3 = (LiveTextView) mo17568a(R.id.a8l);
            if (liveTextView3 != null) {
                liveTextView3.setTypeface(createFromAsset);
                MethodCollector.m26664o(6915);
                return;
            }
            MethodCollector.m26664o(6915);
        } catch (Exception e) {
            e.printStackTrace();
            C3854a.m9453a(6, "ComboProgressAnimationView", "load font asset exception: " + e.getMessage());
            MethodCollector.m26664o(6915);
        }
    }
}
