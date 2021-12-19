package com.bytedance.ies.bullet.p1184ui.common.p1188d;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13846c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import p4600h.C89388w;

/* renamed from: com.bytedance.ies.bullet.ui.common.d.c */
public final class C17036c {

    /* renamed from: c */
    public static final C17037a f40570c = new C17037a((byte) 0);

    /* renamed from: a */
    public int f40571a;

    /* renamed from: b */
    public ViewTreeObserver.OnGlobalLayoutListener f40572b;

    static {
        Covode.recordClassIndex(19485);
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.d.c$a */
    public static final class C17037a {
        static {
            Covode.recordClassIndex(19486);
        }

        private C17037a() {
        }

        public /* synthetic */ C17037a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.d.c$b */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC17038b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ C17036c f40573a;

        /* renamed from: b */
        final /* synthetic */ View f40574b;

        /* renamed from: c */
        final /* synthetic */ Rect f40575c;

        /* renamed from: d */
        final /* synthetic */ int f40576d;

        /* renamed from: e */
        final /* synthetic */ View f40577e;

        static {
            Covode.recordClassIndex(19487);
        }

        public ViewTreeObserver$OnGlobalLayoutListenerC17038b(C17036c cVar, View view, Rect rect, int i, View view2) {
            this.f40573a = cVar;
            this.f40574b = view;
            this.f40575c = rect;
            this.f40576d = i;
            this.f40577e = view2;
        }

        public final void onGlobalLayout() {
            this.f40574b.getWindowVisibleDisplayFrame(this.f40575c);
            if (this.f40573a.f40571a == 0) {
                this.f40573a.f40571a = this.f40575c.bottom;
            }
            if (this.f40573a.f40571a != this.f40575c.bottom && this.f40576d == 1) {
                int max = Math.max(0, this.f40573a.f40571a - this.f40575c.bottom);
                ViewGroup.LayoutParams layoutParams = this.f40577e.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = max;
                    this.f40577e.setLayoutParams(marginLayoutParams);
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            }
            this.f40573a.f40571a = this.f40575c.bottom;
        }
    }

    /* renamed from: a */
    public static Object m31495a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(5673);
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
                            C13846c.m25011a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(5673);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
