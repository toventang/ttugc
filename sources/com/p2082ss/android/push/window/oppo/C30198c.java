package com.p2082ss.android.push.window.oppo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.push.window.oppo.C30202d;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.push.window.oppo.c */
public final class C30198c {

    /* renamed from: a */
    public static AbstractC30196a f72017a;

    /* renamed from: p */
    private static C30198c f72018p;

    /* renamed from: b */
    public WindowManager f72019b;

    /* renamed from: c */
    public View f72020c;

    /* renamed from: d */
    public Context f72021d;

    /* renamed from: e */
    public Handler f72022e = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    public String f72023f;

    /* renamed from: g */
    public boolean f72024g = false;

    /* renamed from: h */
    public int f72025h = 2005;

    /* renamed from: i */
    public int f72026i;

    /* renamed from: j */
    public int f72027j = 2;

    /* renamed from: k */
    public boolean f72028k;

    /* renamed from: l */
    public boolean f72029l = false;

    /* renamed from: m */
    public boolean f72030m = false;

    /* renamed from: n */
    public boolean f72031n = false;

    /* renamed from: o */
    public int f72032o = 0;

    /* renamed from: q */
    private int f72033q;

    /* renamed from: r */
    private boolean f72034r = true;

    /* renamed from: s */
    private Runnable f72035s = new Runnable() {
        /* class com.p2082ss.android.push.window.oppo.C30198c.RunnableC302013 */

        static {
            Covode.recordClassIndex(36707);
        }

        public final void run() {
            C30198c cVar = C30198c.this;
            cVar.f72031n = true;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cVar.f72020c, "translationY", (float) cVar.f72032o, (float) (-cVar.f72020c.getMeasuredHeight()));
            ofFloat.addListener(new AnimatorListenerAdapter() {
                /* class com.p2082ss.android.push.window.oppo.C30198c.C302002 */

                static {
                    Covode.recordClassIndex(36706);
                }

                public final void onAnimationCancel(Animator animator) {
                    super.onAnimationCancel(animator);
                    try {
                        C30198c.this.f72031n = false;
                        C30198c.this.f72029l = false;
                        C30198c.this.f72019b.removeViewImmediate(C30198c.this.f72020c);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    try {
                        C30198c.this.f72031n = false;
                        C30198c.this.f72029l = false;
                        C30198c.this.f72019b.removeViewImmediate(C30198c.this.f72020c);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            ofFloat.setDuration(200L);
            ofFloat.start();
        }
    };

    static {
        Covode.recordClassIndex(36704);
    }

    /* renamed from: b */
    public final boolean mo53627b() {
        if (!this.f72024g || C30204e.m61091a(this.f72021d) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final C30202d.C30203a mo53628c() {
        C30202d a = C30202d.m61089a(this.f72021d);
        LinkedList linkedList = new LinkedList();
        if (!m61083a(a.f72040a).f72028k) {
            a.f72041b.mo53623a();
        } else {
            Map<Integer, C30202d.C30203a> b = a.f72041b.mo53624b();
            if (!b.isEmpty()) {
                for (Map.Entry<Integer, C30202d.C30203a> entry : b.entrySet()) {
                    if (entry != null) {
                        linkedList.add(entry.getValue());
                    }
                }
            }
        }
        Logger.debug();
        if (!linkedList.isEmpty()) {
            return (C30202d.C30203a) linkedList.get(0);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo53626a() {
        boolean z;
        boolean z2;
        if (!TextUtils.isEmpty(this.f72023f)) {
            try {
                JSONObject jSONObject = new JSONObject(this.f72023f);
                boolean z3 = false;
                if (jSONObject.optInt("is_show", 0) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                this.f72024g = z;
                if (jSONObject.optInt("is_cache_message", 1) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f72028k = z2;
                this.f72033q = jSONObject.optInt("show_time_mill", 5000);
                if (jSONObject.optInt("is_auto_dismiss", 1) == 1) {
                    z3 = true;
                }
                this.f72034r = z3;
                this.f72027j = jSONObject.optInt("cache_size", 2);
                this.f72025h = jSONObject.optInt(StringSet.type, 2005);
                this.f72026i = jSONObject.optInt("flag", 1160);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static synchronized C30198c m61083a(Context context) {
        C30198c cVar;
        synchronized (C30198c.class) {
            MethodCollector.m26663i(10533);
            if (f72017a != null) {
                if (f72018p == null) {
                    f72018p = new C30198c(context);
                }
                cVar = f72018p;
                MethodCollector.m26664o(10533);
            } else {
                RuntimeException runtimeException = new RuntimeException("should call init(context, pushWindowDepend) in Application");
                MethodCollector.m26664o(10533);
                throw runtimeException;
            }
        }
        return cVar;
    }

    private C30198c(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f72021d = applicationContext;
        this.f72019b = (WindowManager) m61085a(context, "window");
        this.f72022e.postDelayed(new Runnable() {
            /* class com.p2082ss.android.push.window.oppo.C30198c.RunnableC301991 */

            static {
                Covode.recordClassIndex(36705);
            }

            public final void run() {
                if (C30198c.this.mo53627b() && C30198c.this.f72028k) {
                    C30198c.m61083a(C30198c.this.f72021d).mo53628c();
                }
            }
        }, 10000);
    }

    /* renamed from: a */
    public static synchronized C30198c m61084a(Context context, AbstractC30196a aVar) {
        C30198c a;
        synchronized (C30198c.class) {
            MethodCollector.m26663i(12862);
            f72017a = aVar;
            a = m61083a(context);
            MethodCollector.m26664o(12862);
        }
        return a;
    }

    /* renamed from: a */
    private static Object m61085a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(10697);
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
                    MethodCollector.m26664o(10697);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
