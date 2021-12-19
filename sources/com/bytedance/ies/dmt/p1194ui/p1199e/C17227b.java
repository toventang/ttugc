package com.bytedance.ies.dmt.p1194ui.p1199e;

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
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.p1197c.C17168c;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.ies.dmt.ui.e.b */
public final class C17227b extends PopupWindow {

    /* renamed from: e */
    private static int f41147e;

    /* renamed from: a */
    public RelativeLayout f41148a;

    /* renamed from: b */
    private Context f41149b;

    /* renamed from: c */
    private ImageView f41150c;

    /* renamed from: d */
    private TextView f41151d;

    /* renamed from: f */
    private int f41152f;

    /* renamed from: g */
    private int f41153g;

    /* renamed from: h */
    private View f41154h;

    /* renamed from: i */
    private long f41155i;

    static {
        Covode.recordClassIndex(19688);
    }

    public final void dismiss() {
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private boolean m31800b() {
        if (this.f41153g == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m31799a() {
        Context context = this.f41149b;
        if (context == null || !(context instanceof Activity)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private void m31801c() {
        long j;
        try {
            if (this.f41149b != null && !isShowing()) {
                this.f41148a.setAlpha(0.0f);
                showAtLocation(((Activity) this.f41149b).getWindow().getDecorView(), 48, 0, f41147e + C13628n.m24525e(this.f41149b));
                mo27252a(true);
                int i = this.f41152f;
                if (i == 0) {
                    j = 1500;
                } else if (i == 1) {
                    j = InteractFirstFrameTimeOutDurationSetting.DEFAULT;
                } else {
                    j = this.f41155i;
                }
                new Handler().postDelayed(new Runnable() {
                    /* class com.bytedance.ies.dmt.p1194ui.p1199e.C17227b.RunnableC172281 */

                    static {
                        Covode.recordClassIndex(19689);
                    }

                    public final void run() {
                        C17227b.this.mo27252a(false);
                        new Handler().postDelayed(new Runnable() {
                            /* class com.bytedance.ies.dmt.p1194ui.p1199e.C17227b.RunnableC172281.RunnableC172291 */

                            static {
                                Covode.recordClassIndex(19690);
                            }

                            public final void run() {
                                C17227b.this.dismiss();
                            }
                        }, 1500);
                    }
                }, j);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static C17227b m31794a(Context context) {
        return new C17227b(context);
    }

    /* renamed from: a */
    private void m31796a(int i) {
        f41147e = ((int) C13628n.m24520b(this.f41149b, 52.0f)) + i;
    }

    /* renamed from: a */
    private static void m31797a(Toast toast) {
        if (Build.VERSION.SDK_INT == 25) {
            C80567ic.m139657a(toast);
        }
        toast.show();
    }

    private C17227b(Context context) {
        super(context);
        MethodCollector.m26663i(7549);
        this.f41149b = context;
        this.f41154h = ((LayoutInflater) m31795a(context, "layout_inflater")).inflate(R.layout.aie, (ViewGroup) null);
        if (m31799a()) {
            setContentView(this.f41154h);
            setWidth(C13628n.m24504a(this.f41149b));
            setHeight(-2);
            setBackgroundDrawable(new ColorDrawable(C0643b.m2378c(this.f41149b, R.color.c9)));
            setFocusable(false);
            setOutsideTouchable(true);
            setTouchable(false);
            setAnimationStyle(R.style.wc);
            update();
        }
        View view = this.f41154h;
        if (view != null) {
            this.f41148a = (RelativeLayout) view.findViewById(R.id.dlx);
            this.f41150c = (ImageView) view.findViewById(R.id.bwm);
            this.f41151d = (TextView) view.findViewById(R.id.eu6);
        }
        MethodCollector.m26664o(7549);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo27252a(final boolean z) {
        new Handler().postDelayed(new Runnable() {
            /* class com.bytedance.ies.dmt.p1194ui.p1199e.C17227b.RunnableC172302 */

            static {
                Covode.recordClassIndex(19691);
            }

            public final void run() {
                int i;
                float f;
                final int height = C17227b.this.f41148a.getHeight();
                if (z) {
                    i = 250;
                } else {
                    i = 150;
                }
                RelativeLayout relativeLayout = C17227b.this.f41148a;
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
                    /* class com.bytedance.ies.dmt.p1194ui.p1199e.C17227b.RunnableC172302.C172311 */

                    static {
                        Covode.recordClassIndex(19692);
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
                        C17227b.this.f41148a.setTranslationY((float) i);
                    }
                });
                ofFloat.setInterpolator(new C17168c());
                ofFloat.start();
            }
        }, 5);
    }

    /* renamed from: a */
    private static Object m31795a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(7551);
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
                    MethodCollector.m26664o(7551);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    private void m31798a(String str, int i, int i2) {
        if (C17232c.m31804a().mo27258a(str) || i2 != 2) {
            this.f41151d.setText(str);
            this.f41152f = i;
            int b = (int) C13628n.m24520b(this.f41149b, 16.0f);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f41148a.getLayoutParams();
            if (!m31800b()) {
                layoutParams.setMargins(b, 0, b, 0);
            } else {
                layoutParams.setMargins(0, 0, 0, 0);
            }
            if (m31799a()) {
                m31801c();
                return;
            }
            this.f41148a.setAlpha(1.0f);
            Toast toast = new Toast(this.f41149b);
            toast.setDuration(0);
            toast.setGravity(55, 0, f41147e);
            toast.setView(this.f41154h);
            m31797a(toast);
        }
    }

    /* renamed from: a */
    public final C17227b mo27251a(String str, int i, int i2, int i3, int i4, long j) {
        this.f41153g = i2;
        this.f41155i = j;
        m31796a(i3);
        if (m31800b()) {
            this.f41148a.setBackgroundColor(C0643b.m2378c(this.f41149b, R.color.c7));
        } else {
            this.f41148a.setBackgroundResource(R.drawable.cc_);
        }
        this.f41150c.setVisibility(8);
        m31798a(str, i, i4);
        return this;
    }
}
