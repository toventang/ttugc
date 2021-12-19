package com.p2082ss.android.ugc.aweme.framework.p3009d;

import android.app.Dialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.framework.d.c */
public final class C51429c {

    /* renamed from: a */
    Dialog f118504a;

    /* renamed from: b */
    ImageView f118505b;

    /* renamed from: c */
    TextView f118506c;

    /* renamed from: d */
    View f118507d;

    /* renamed from: e */
    public boolean f118508e;

    /* renamed from: f */
    public boolean f118509f;

    /* renamed from: g */
    public boolean f118510g;

    /* renamed from: h */
    final Handler f118511h = new Handler();

    /* renamed from: i */
    final Runnable f118512i = new Runnable() {
        /* class com.p2082ss.android.ugc.aweme.framework.p3009d.C51429c.RunnableC514301 */

        static {
            Covode.recordClassIndex(60653);
        }

        public final void run() {
            C51429c.this.mo86856c();
        }
    };

    static {
        Covode.recordClassIndex(60652);
    }

    /* renamed from: d */
    private void m95805d() {
        int i = Build.VERSION.SDK_INT;
        this.f118504a.getWindow().getDecorView().setSystemUiVisibility(5380);
    }

    /* renamed from: a */
    public final void mo86850a() {
        if (!this.f118508e && !this.f118509f) {
            this.f118511h.removeCallbacks(this.f118512i);
            mo86856c();
            this.f118508e = true;
        }
    }

    /* renamed from: b */
    public final void mo86854b() {
        if (!this.f118508e && !this.f118509f) {
            this.f118511h.removeCallbacks(this.f118512i);
            mo86856c();
            this.f118509f = true;
        }
    }

    /* renamed from: c */
    public final void mo86856c() {
        if (!this.f118508e) {
            try {
                if (this.f118504a.isShowing()) {
                    this.f118504a.dismiss();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo86853a(String str) {
        mo86852a(0, str, LiveNetAdaptiveHurryTimeSetting.DEFAULT);
    }

    public C51429c(Context context) {
        MethodCollector.m26663i(8191);
        LayoutInflater from = LayoutInflater.from(context);
        this.f118504a = new Dialog(context, R.style.zv);
        try {
            View inflate = from.inflate(R.layout.am5, (ViewGroup) null);
            this.f118507d = inflate;
            this.f118505b = (ImageView) inflate.findViewById(R.id.bh1);
            this.f118506c = (TextView) inflate.findViewById(R.id.text);
            double width = (double) ((WindowManager) m95804a(context, "window")).getDefaultDisplay().getWidth();
            Double.isNaN(width);
            this.f118506c.setMaxWidth((int) ((width * 0.68d) - 80.0d));
            this.f118504a.setContentView(this.f118507d);
            this.f118504a.getWindow().setBackgroundDrawable(new ColorDrawable(C0643b.m2378c(context, R.color.c9)));
            this.f118504a.getWindow().addFlags(8);
            this.f118504a.getWindow().addFlags(32);
            this.f118504a.getWindow().addFlags(16);
            this.f118504a.getWindow().setLayout(-2, -2);
            this.f118504a.getWindow().setGravity(17);
            MethodCollector.m26664o(8191);
        } catch (Throwable unused) {
            MethodCollector.m26664o(8191);
        }
    }

    /* renamed from: a */
    public final void mo86851a(int i, String str) {
        mo86852a(i, str, 3500);
    }

    /* renamed from: b */
    public final void mo86855b(int i, String str) {
        mo86852a(i, str, LiveNetAdaptiveHurryTimeSetting.DEFAULT);
    }

    /* renamed from: a */
    private static Object m95804a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(8334);
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
                    MethodCollector.m26664o(8334);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public final void mo86852a(int i, String str, int i2) {
        if (!this.f118508e && i2 > 0) {
            boolean z = false;
            if (i > 0) {
                this.f118505b.setImageResource(i);
                this.f118505b.setVisibility(0);
                z = true;
            } else {
                this.f118505b.setVisibility(8);
            }
            if (!C13627m.m24498a(str)) {
                this.f118506c.setText(str);
            } else if (!z) {
                return;
            }
            this.f118511h.removeCallbacks(this.f118512i);
            mo86856c();
            try {
                this.f118504a.getWindow().setGravity(17);
                if (this.f118510g) {
                    m95805d();
                }
                this.f118504a.show();
                this.f118511h.postDelayed(this.f118512i, (long) i2);
            } catch (Exception unused) {
            }
        }
    }
}
