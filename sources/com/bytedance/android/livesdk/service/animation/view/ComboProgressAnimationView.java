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
import android.os.Vibrator;
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

public final class ComboProgressAnimationView extends FrameLayout {

    /* renamed from: b */
    public static final C10662a f25673b = new C10662a((byte) 0);

    /* renamed from: a */
    public boolean f25674a;

    /* renamed from: c */
    private int f25675c;

    /* renamed from: d */
    private AnimatorSet f25676d;

    /* renamed from: e */
    private AnimatorSet f25677e;

    /* renamed from: f */
    private HashMap f25678f;

    static {
        Covode.recordClassIndex(12254);
    }

    public ComboProgressAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    public final View mo17577a(int i) {
        if (this.f25678f == null) {
            this.f25678f = new HashMap();
        }
        View view = (View) this.f25678f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f25678f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: com.bytedance.android.livesdk.service.animation.view.ComboProgressAnimationView$a */
    public static final class C10662a {
        static {
            Covode.recordClassIndex(12255);
        }

        private C10662a() {
        }

        public /* synthetic */ C10662a(byte b) {
            this();
        }
    }

    /* renamed from: d */
    public final void mo17581d() {
        this.f25675c = 0;
        m19231f();
        m19232g();
    }

    /* renamed from: f */
    private final void m19231f() {
        AnimatorSet animatorSet = this.f25676d;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.f25676d;
            if (animatorSet2 != null) {
                animatorSet2.removeAllListeners();
            }
            AnimatorSet animatorSet3 = this.f25676d;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
        }
        this.f25676d = null;
    }

    /* renamed from: g */
    private final void m19232g() {
        AnimatorSet animatorSet = this.f25677e;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.f25677e;
            if (animatorSet2 != null) {
                animatorSet2.removeAllListeners();
            }
            AnimatorSet animatorSet3 = this.f25677e;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
        }
        this.f25677e = null;
    }

    /* renamed from: e */
    private final void m19230e() {
        m19232g();
        float a = C11227ap.m19885a(getContext(), 38.0f) * 0.01f;
        ConstraintLayout constraintLayout = (ConstraintLayout) mo17577a(R.id.a8i);
        if (constraintLayout != null) {
            constraintLayout.setTranslationY(-a);
        }
    }

    /* renamed from: c */
    public final void mo17580c() {
        AnimatorSet animatorSet;
        m19232g();
        this.f25677e = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mo17577a(R.id.a8i), "translationY", C11227ap.m19885a(getContext(), 32.0f));
        AnimatorSet animatorSet2 = this.f25677e;
        if (animatorSet2 != null) {
            animatorSet2.playTogether(ofFloat);
        }
        if (Build.VERSION.SDK_INT >= 21 && (animatorSet = this.f25677e) != null) {
            animatorSet.setInterpolator(new PathInterpolator(0.66f, 0.0f, 0.86f, 0.0f));
        }
        AnimatorSet animatorSet3 = this.f25677e;
        if (animatorSet3 != null) {
            animatorSet3.setDuration(1800L);
        }
        AnimatorSet animatorSet4 = this.f25677e;
        if (animatorSet4 != null) {
            animatorSet4.start();
        }
    }

    /* renamed from: a */
    public final void mo17578a() {
        AnimatorSet animatorSet;
        if (this.f25674a) {
            this.f25675c++;
        } else {
            this.f25675c = 1;
            this.f25674a = true;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) mo17577a(R.id.a8r);
        if (constraintLayout != null) {
            constraintLayout.setScaleY(1.0f);
        }
        LiveTextView liveTextView = (LiveTextView) mo17577a(R.id.a8j);
        if (liveTextView != null) {
            liveTextView.setText(String.valueOf(this.f25675c));
        }
        LiveTextView liveTextView2 = (LiveTextView) mo17577a(R.id.a8k);
        if (liveTextView2 != null) {
            liveTextView2.setText(String.valueOf(this.f25675c));
        }
        LiveTextView liveTextView3 = (LiveTextView) mo17577a(R.id.a8l);
        if (liveTextView3 != null) {
            liveTextView3.setText(String.valueOf(this.f25675c));
        }
        if (this.f25675c == 1) {
            m19230e();
            m19231f();
            this.f25676d = new AnimatorSet();
            ConstraintLayout constraintLayout2 = (ConstraintLayout) mo17577a(R.id.a8r);
            if (constraintLayout2 != null) {
                constraintLayout2.setPivotY(C11227ap.m19885a(getContext(), 110.0f));
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mo17577a(R.id.a8r), "scaleY", 0.2f, 1.0f);
            AnimatorSet animatorSet2 = this.f25676d;
            if (animatorSet2 != null) {
                animatorSet2.playTogether(ofFloat);
            }
            AnimatorSet animatorSet3 = this.f25676d;
            if (animatorSet3 != null) {
                animatorSet3.setDuration(200L);
            }
            if (Build.VERSION.SDK_INT >= 21 && (animatorSet = this.f25676d) != null) {
                animatorSet.setInterpolator(new PathInterpolator(0.0f, 0.0f, 0.58f, 1.0f));
            }
            AnimatorSet animatorSet4 = this.f25676d;
            if (animatorSet4 != null) {
                animatorSet4.addListener(new C10663b(this));
            }
            AnimatorSet animatorSet5 = this.f25676d;
            if (animatorSet5 != null) {
                animatorSet5.start();
            }
        } else {
            m19230e();
            mo17579b();
            mo17580c();
        }
        try {
            Object a = m19229a(getContext(), "vibrator");
            if (a != null) {
                ((Vibrator) a).vibrate(50);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Vibrator");
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public final void mo17579b() {
        AnimatorSet animatorSet;
        float f;
        m19231f();
        this.f25676d = new AnimatorSet();
        ConstraintLayout constraintLayout = (ConstraintLayout) mo17577a(R.id.a8r);
        if (constraintLayout != null) {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) mo17577a(R.id.a8r);
            if (constraintLayout2 != null) {
                f = (float) constraintLayout2.getHeight();
            } else {
                f = 0.0f;
            }
            constraintLayout.setPivotY(f);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mo17577a(R.id.a8r), "scaleY", 1.0f, 0.2f);
        AnimatorSet animatorSet2 = this.f25676d;
        if (animatorSet2 != null) {
            animatorSet2.playTogether(ofFloat);
        }
        AnimatorSet animatorSet3 = this.f25676d;
        if (animatorSet3 != null) {
            animatorSet3.addListener(new C10664c(this));
        }
        if (Build.VERSION.SDK_INT >= 21 && (animatorSet = this.f25676d) != null) {
            animatorSet.setInterpolator(new PathInterpolator(0.66f, 0.0f, 0.86f, 0.0f));
        }
        AnimatorSet animatorSet4 = this.f25676d;
        if (animatorSet4 != null) {
            animatorSet4.setDuration(1800L);
        }
        AnimatorSet animatorSet5 = this.f25676d;
        if (animatorSet5 != null) {
            animatorSet5.start();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.service.animation.view.ComboProgressAnimationView$b */
    public static final class C10663b extends C10651a {

        /* renamed from: a */
        final /* synthetic */ ComboProgressAnimationView f25679a;

        static {
            Covode.recordClassIndex(12256);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C10663b(ComboProgressAnimationView comboProgressAnimationView) {
            this.f25679a = comboProgressAnimationView;
        }

        @Override // com.bytedance.android.livesdk.service.animation.p623b.C10651a
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f25679a.mo17579b();
            this.f25679a.mo17580c();
        }

        @Override // com.bytedance.android.livesdk.service.animation.p623b.C10651a
        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ConstraintLayout constraintLayout = (ConstraintLayout) this.f25679a.mo17577a(R.id.a8r);
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.service.animation.view.ComboProgressAnimationView$c */
    public static final class C10664c implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ ComboProgressAnimationView f25680a;

        static {
            Covode.recordClassIndex(12257);
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
        C10664c(ComboProgressAnimationView comboProgressAnimationView) {
            this.f25680a = comboProgressAnimationView;
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154721d(animator, "");
            this.f25680a.f25674a = false;
        }
    }

    /* renamed from: a */
    private static Object m19229a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(7071);
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
                    MethodCollector.m26664o(7071);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private /* synthetic */ ComboProgressAnimationView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ComboProgressAnimationView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(7074);
        LayoutInflater.from(context).inflate(R.layout.b4g, this);
        try {
            Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), "font/ttlive_base_gift_combo_font.ttf");
            LiveTextView liveTextView = (LiveTextView) mo17577a(R.id.a8j);
            if (liveTextView != null) {
                liveTextView.setTypeface(createFromAsset);
            }
            LiveTextView liveTextView2 = (LiveTextView) mo17577a(R.id.a8k);
            if (liveTextView2 != null) {
                liveTextView2.setTypeface(createFromAsset);
            }
            LiveTextView liveTextView3 = (LiveTextView) mo17577a(R.id.a8l);
            if (liveTextView3 != null) {
                liveTextView3.setTypeface(createFromAsset);
                MethodCollector.m26664o(7074);
                return;
            }
            MethodCollector.m26664o(7074);
        } catch (Exception e) {
            e.printStackTrace();
            C3854a.m9453a(6, "ComboProgressAnimationView", "load font asset exception: " + e.getMessage());
            MethodCollector.m26664o(7074);
        }
    }
}
