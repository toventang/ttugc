package com.p2082ss.android.ugc.tools.view.widget;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.C0643b;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import com.p2082ss.android.ugc.tools.view.p4364c.C84952c;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.tools.view.widget.e */
public final class C85043e extends PopupWindow {

    /* renamed from: f */
    private static int f190313f;

    /* renamed from: a */
    public Context f190314a;

    /* renamed from: b */
    public RelativeLayout f190315b;

    /* renamed from: c */
    public ImageView f190316c;

    /* renamed from: d */
    public int f190317d;

    /* renamed from: e */
    private TextView f190318e;

    /* renamed from: g */
    private int f190319g;

    /* renamed from: h */
    private View f190320h;

    static {
        Covode.recordClassIndex(99064);
    }

    public final void dismiss() {
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private boolean m146235b() {
        Context context = this.f190314a;
        if (context == null || !(context instanceof Activity)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private void m146236c() {
        int b;
        try {
            if (this.f190314a != null && !isShowing()) {
                this.f190315b.setAlpha(0.0f);
                View decorView = ((Activity) this.f190314a).getWindow().getDecorView();
                if (mo129988a()) {
                    b = f190313f;
                } else {
                    b = (int) C13628n.m24520b(this.f190314a, 35.0f);
                }
                showAtLocation(decorView, 48, 0, b + C13628n.m24525e(this.f190314a));
                mo129987a(true);
                int i = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
                if (this.f190319g == 0) {
                    i = 1500;
                }
                new Handler().postDelayed(new Runnable() {
                    /* class com.p2082ss.android.ugc.tools.view.widget.C85043e.RunnableC850441 */

                    static {
                        Covode.recordClassIndex(99065);
                    }

                    public final void run() {
                        C85043e.this.mo129987a(false);
                        new Handler().postDelayed(new Runnable() {
                            /* class com.p2082ss.android.ugc.tools.view.widget.C85043e.RunnableC850441.RunnableC850451 */

                            static {
                                Covode.recordClassIndex(99066);
                            }

                            public final void run() {
                                C85043e.this.dismiss();
                            }
                        }, 1500);
                    }
                }, (long) i);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final boolean mo129988a() {
        if (this.f190317d == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C85043e m146232a(Context context) {
        return new C85043e(context);
    }

    /* renamed from: a */
    private static void m146234a(Toast toast) {
        if (Build.VERSION.SDK_INT == 25) {
            C80567ic.m139657a(toast);
        }
        toast.show();
    }

    /* renamed from: a */
    public final void mo129985a(int i) {
        f190313f = ((int) C13628n.m24520b(this.f190314a, 52.0f)) + i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo129987a(final boolean z) {
        new Handler().postDelayed(new Runnable() {
            /* class com.p2082ss.android.ugc.tools.view.widget.C85043e.RunnableC850462 */

            static {
                Covode.recordClassIndex(99067);
            }

            public final void run() {
                int i;
                float f;
                final int height = C85043e.this.f190315b.getHeight();
                if (z) {
                    i = 250;
                } else {
                    i = 150;
                }
                RelativeLayout relativeLayout = C85043e.this.f190315b;
                float[] fArr = new float[2];
                boolean z = z;
                float f2 = 0.0f;
                if (z) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                fArr[0] = f;
                if (z) {
                    f2 = 1.0f;
                }
                fArr[1] = f2;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(relativeLayout, "alpha", fArr);
                ofFloat.setDuration((long) i);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.p2082ss.android.ugc.tools.view.widget.C85043e.RunnableC850462.C850471 */

                    static {
                        Covode.recordClassIndex(99068);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int i;
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        if (z) {
                            int i2 = height;
                            i = (int) (-(((float) i2) - (((float) i2) * animatedFraction)));
                        } else {
                            i = -((int) (((float) height) * animatedFraction));
                        }
                        C85043e.this.f190315b.setTranslationY((float) i);
                    }
                });
                ofFloat.setInterpolator(new C84952c());
                ofFloat.start();
            }
        }, 5);
    }

    private C85043e(Context context) {
        super(context);
        MethodCollector.m26663i(1203);
        this.f190314a = context;
        this.f190320h = ((LayoutInflater) m146233a(context, "layout_inflater")).inflate(R.layout.b43, (ViewGroup) null);
        if (m146235b()) {
            setContentView(this.f190320h);
            setWidth(C13628n.m24504a(this.f190314a));
            setHeight(-2);
            setBackgroundDrawable(new ColorDrawable(C0643b.m2378c(this.f190314a, R.color.c9)));
            setFocusable(false);
            setOutsideTouchable(true);
            setTouchable(false);
            setAnimationStyle(R.style.a1v);
            update();
        }
        View view = this.f190320h;
        if (view != null) {
            this.f190315b = (RelativeLayout) view.findViewById(R.id.dlx);
            this.f190316c = (ImageView) view.findViewById(R.id.bwm);
            this.f190318e = (TextView) view.findViewById(R.id.eu6);
        }
        MethodCollector.m26664o(1203);
    }

    /* renamed from: a */
    private static Object m146233a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(1502);
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
                    MethodCollector.m26664o(1502);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public final void mo129986a(String str, int i) {
        int i2;
        if (C63244g.m114602a().mo73259E().mo93885a(str)) {
            this.f190318e.setText(str);
            this.f190319g = i;
            int b = (int) C13628n.m24520b(this.f190314a, 16.0f);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f190315b.getLayoutParams();
            if (!mo129988a()) {
                layoutParams.setMargins(b, f190313f - ((int) C13628n.m24520b(this.f190314a, 35.0f)), b, 0);
            } else {
                layoutParams.setMargins(0, 0, 0, 0);
            }
            if (m146235b()) {
                m146236c();
                return;
            }
            this.f190315b.setAlpha(1.0f);
            Toast toast = new Toast(this.f190314a);
            toast.setDuration(0);
            if (mo129988a()) {
                i2 = f190313f;
            } else {
                i2 = 0;
            }
            toast.setGravity(55, 0, i2);
            toast.setView(this.f190320h);
            m146234a(toast);
        }
    }
}
