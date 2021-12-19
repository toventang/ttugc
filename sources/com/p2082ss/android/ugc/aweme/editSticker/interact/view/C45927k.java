package com.p2082ss.android.ugc.aweme.editSticker.interact.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45899e;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.editSticker.interact.view.k */
public final class C45927k extends FrameLayout implements AbstractC45899e {

    /* renamed from: b */
    private ImageView f106979b;

    /* renamed from: c */
    private View f106980c;

    /* renamed from: d */
    private View f106981d;

    /* renamed from: e */
    private View f106982e;

    /* renamed from: f */
    private boolean f106983f;

    /* renamed from: g */
    private boolean f106984g;

    /* renamed from: h */
    private boolean f106985h;

    /* renamed from: i */
    private boolean f106986i;

    /* renamed from: j */
    private Vibrator f106987j;

    /* renamed from: k */
    private int f106988k;

    static {
        Covode.recordClassIndex(54453);
    }

    public final View getContentView() {
        return this;
    }

    /* renamed from: e */
    private void m88685e() {
        this.f106983f = false;
        this.f106984g = false;
        this.f106986i = false;
        this.f106985h = false;
    }

    /* renamed from: f */
    private void m88686f() {
        if (this.f106982e.getVisibility() == 0) {
            m88682a(this.f106982e, false, true);
        }
    }

    /* renamed from: g */
    private void m88687g() {
        if (this.f106986i) {
            this.f106986i = false;
            m88682a(this.f106980c, false, true);
        }
    }

    /* renamed from: h */
    private void m88688h() {
        Vibrator vibrator = this.f106987j;
        if (vibrator != null) {
            try {
                vibrator.vibrate(10);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45899e
    /* renamed from: b */
    public final void mo77277b() {
        m88686f();
        m88684d();
        this.f106983f = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45899e
    /* renamed from: a */
    public final void mo77276a() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.topMargin = C70636dh.m124833c(getContext());
        setLayoutParams(layoutParams);
    }

    public final Rect getDeleteRect() {
        return new Rect(getLeft(), getTop(), getRight(), getBottom());
    }

    /* renamed from: c */
    private void m88683c() {
        if (!this.f106985h) {
            this.f106981d.setVisibility(0);
            this.f106985h = true;
            m88682a(this.f106981d, true, false);
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -20.0f, 10.0f, 30.0f);
            rotateAnimation.setDuration(300);
            rotateAnimation.setFillAfter(true);
            this.f106979b.startAnimation(rotateAnimation);
        }
    }

    /* renamed from: d */
    private void m88684d() {
        if (this.f106985h) {
            this.f106985h = false;
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 0.0f, 10.0f, 30.0f);
            rotateAnimation.setFillAfter(true);
            rotateAnimation.setDuration(300);
            this.f106979b.startAnimation(rotateAnimation);
            m88682a(this.f106981d, false, false);
        }
    }

    public C45927k(Context context) {
        this(context, (byte) 0);
    }

    private C45927k(Context context, byte b) {
        super(context, null);
        MethodCollector.m26663i(11641);
        View inflate = LayoutInflater.from(context).inflate(R.layout.za, (ViewGroup) null);
        this.f106979b = (ImageView) inflate.findViewById(R.id.ele);
        this.f106980c = inflate.findViewById(R.id.aj7);
        this.f106982e = inflate.findViewById(R.id.cz7);
        this.f106981d = inflate.findViewById(R.id.sa);
        addView(inflate);
        this.f106981d.setVisibility(8);
        this.f106982e.setVisibility(8);
        this.f106987j = (Vibrator) m88681a(context, "vibrator");
        MethodCollector.m26664o(11641);
    }

    /* renamed from: a */
    private static Object m88681a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(11802);
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
                    MethodCollector.m26664o(11802);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    private void m88682a(final View view, boolean z, final boolean z2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = new float[2];
        float f6 = 0.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        fArr[1] = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
        float[] fArr2 = new float[2];
        if (z) {
            f3 = 0.0f;
        } else {
            f3 = 1.0f;
        }
        fArr2[0] = f3;
        if (z) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        fArr2[1] = f4;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleX", fArr2);
        float[] fArr3 = new float[2];
        if (z) {
            f5 = 0.0f;
        } else {
            f5 = 1.0f;
        }
        fArr3[0] = f5;
        if (z) {
            f6 = 1.0f;
        }
        fArr3[1] = f6;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "scaleY", fArr3);
        animatorSet.setDuration(300L);
        animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            /* class com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45927k.C459281 */

            static {
                Covode.recordClassIndex(54454);
            }

            public final void onAnimationEnd(Animator animator) {
                if (z2) {
                    view.setVisibility(8);
                }
                super.onAnimationEnd(animator);
            }
        });
        animatorSet.start();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        if (r10.f106988k == 1) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        if (r10.f106988k == 1) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001d  */
    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45899e
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo77275a(int r11, int r12, boolean r13, boolean r14) {
        /*
        // Method dump skipped, instructions count: 184
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.editSticker.interact.view.C45927k.mo77275a(int, int, boolean, boolean):int");
    }
}
