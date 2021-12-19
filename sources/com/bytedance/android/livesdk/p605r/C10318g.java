package com.bytedance.android.livesdk.p605r;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.android.livesdk.r.g */
public class C10318g extends AbstractC10311a {

    /* renamed from: a */
    private final Context f24922a;

    /* renamed from: b */
    private final WindowManager.LayoutParams f24923b;

    /* renamed from: c */
    private boolean f24924c = true;

    /* renamed from: e */
    public final WindowManager f24925e;

    /* renamed from: f */
    public View f24926f;

    /* renamed from: g */
    public int f24927g;

    /* renamed from: h */
    public int f24928h;

    static {
        Covode.recordClassIndex(11884);
    }

    /* renamed from: a */
    private static void m18779a(WindowManager windowManager, View view) {
        if (!((Boolean) C15346a.m28238a(windowManager, new Object[]{view}, 102801, "void", false, null).first).booleanValue()) {
            windowManager.removeView(view);
            C15346a.m28240a(null, windowManager, new Object[]{view}, 102801, "com_bytedance_android_livesdk_floatwindow_LiveFloatView_android_view_WindowManager_removeView(Landroid/view/WindowManager;Landroid/view/View;)V");
        }
    }

    @Override // com.bytedance.android.livesdk.p605r.AbstractC10311a
    /* renamed from: d */
    public final View mo17081d() {
        return this.f24926f;
    }

    /* renamed from: f */
    public final void mo17097f() {
        if (!this.f24924c) {
            m18779a(this.f24925e, this.f24926f);
            this.f24924c = true;
        }
    }

    /* renamed from: e */
    public final void mo17096e() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f24923b.type = 2038;
        } else {
            this.f24923b.type = 2002;
        }
        WindowManager windowManager = this.f24925e;
        View view = this.f24926f;
        WindowManager.LayoutParams layoutParams = this.f24923b;
        if (!((Boolean) C15346a.m28238a(windowManager, new Object[]{view, layoutParams}, 102800, "void", false, null).first).booleanValue()) {
            windowManager.addView(view, layoutParams);
            C15346a.m28240a(null, windowManager, new Object[]{view, layoutParams}, 102800, "com_bytedance_android_livesdk_floatwindow_LiveFloatView_android_view_WindowManager_addView(Landroid/view/WindowManager;Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V");
        }
        this.f24924c = false;
    }

    @Override // com.bytedance.android.livesdk.p605r.AbstractC10311a
    /* renamed from: a */
    public final void mo17078a(int i) {
        if (!this.f24924c) {
            this.f24923b.x = i;
            this.f24927g = i;
            this.f24925e.updateViewLayout(this.f24926f, this.f24923b);
        }
    }

    @Override // com.bytedance.android.livesdk.p605r.AbstractC10311a
    /* renamed from: b */
    public final void mo17080b(int i) {
        if (!this.f24924c) {
            this.f24923b.y = i;
            this.f24928h = i;
            this.f24925e.updateViewLayout(this.f24926f, this.f24923b);
        }
    }

    public C10318g(Context context) {
        this.f24922a = context;
        this.f24925e = (WindowManager) m18778a(context, "window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f24923b = layoutParams;
        layoutParams.format = 1;
        layoutParams.flags = 552;
        layoutParams.windowAnimations = 0;
    }

    /* renamed from: b */
    public final void mo17094b(int i, int i2) {
        this.f24923b.width = i;
        this.f24923b.height = i2;
    }

    /* renamed from: c */
    public final void mo17095c(int i, int i2) {
        this.f24923b.width = i;
        this.f24923b.height = i2;
        this.f24925e.updateViewLayout(this.f24926f, this.f24923b);
    }

    /* renamed from: a */
    private static Object m18778a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(11496);
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
                    MethodCollector.m26664o(11496);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // com.bytedance.android.livesdk.p605r.AbstractC10311a
    /* renamed from: a */
    public final void mo17079a(int i, int i2) {
        if (!this.f24924c) {
            this.f24923b.x = i;
            this.f24927g = i;
            this.f24923b.y = i2;
            this.f24928h = i2;
            this.f24925e.updateViewLayout(this.f24926f, this.f24923b);
        }
    }

    /* renamed from: a */
    public final void mo17093a(int i, int i2, int i3) {
        this.f24923b.gravity = i;
        this.f24923b.x = i2;
        this.f24927g = i2;
        this.f24923b.y = i3;
        this.f24928h = i3;
    }
}
