package com.facebook.p1814a.p1824i;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.p1814a.p1816b.p1817a.C23886d;
import com.facebook.p1814a.p1816b.p1817a.C23888f;
import com.facebook.p1814a.p1820e.C23929b;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* access modifiers changed from: package-private */
/* renamed from: com.facebook.a.i.e */
public final class ViewTreeObserver$OnGlobalLayoutListenerC23990e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    private static final String f56780a = ViewTreeObserver$OnGlobalLayoutListenerC23990e.class.getCanonicalName();

    /* renamed from: e */
    private static final Map<Integer, ViewTreeObserver$OnGlobalLayoutListenerC23990e> f56781e = new HashMap();

    /* renamed from: b */
    private WeakReference<Activity> f56782b;

    /* renamed from: c */
    private final Handler f56783c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private AtomicBoolean f56784d = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(28111);
    }

    public final void onGlobalLayout() {
        if (!C24677a.m47209a(this)) {
            try {
                m45375c();
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
            }
        }
    }

    /* renamed from: a */
    private void m45371a() {
        View a;
        if (!C24677a.m47209a(this)) {
            try {
                if (!this.f56784d.getAndSet(true) && (a = C23929b.m45241a(this.f56782b.get())) != null) {
                    ViewTreeObserver viewTreeObserver = a.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(this);
                        m45375c();
                        this.f56782b.get();
                    }
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
            }
        }
    }

    /* renamed from: b */
    private void m45373b() {
        View a;
        if (!C24677a.m47209a(this)) {
            try {
                if (this.f56784d.getAndSet(false) && (a = C23929b.m45241a(this.f56782b.get())) != null) {
                    ViewTreeObserver viewTreeObserver = a.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        int i = Build.VERSION.SDK_INT;
                        viewTreeObserver.removeOnGlobalLayoutListener(this);
                    }
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
            }
        }
    }

    /* renamed from: c */
    private void m45375c() {
        if (!C24677a.m47209a(this)) {
            try {
                RunnableC239911 r2 = new Runnable() {
                    /* class com.facebook.p1814a.p1824i.ViewTreeObserver$OnGlobalLayoutListenerC23990e.RunnableC239911 */

                    static {
                        Covode.recordClassIndex(28112);
                    }

                    public final void run() {
                        Field field;
                        Object obj;
                        if (!C24677a.m47209a(this)) {
                            try {
                                View a = C23929b.m45241a((Activity) ViewTreeObserver$OnGlobalLayoutListenerC23990e.m45370a(ViewTreeObserver$OnGlobalLayoutListenerC23990e.this).get());
                                Activity activity = (Activity) ViewTreeObserver$OnGlobalLayoutListenerC23990e.m45370a(ViewTreeObserver$OnGlobalLayoutListenerC23990e.this).get();
                                if (!(a == null || activity == null)) {
                                    for (View view : C23987c.m45361a(a)) {
                                        if (!C23886d.m45147a(view)) {
                                            String b = C23987c.m45363b(view);
                                            if (!b.isEmpty() && b.length() <= 300) {
                                                String localClassName = activity.getLocalClassName();
                                                if (!C24677a.m47209a(View$OnClickListenerC23992f.class)) {
                                                    try {
                                                        int hashCode = view.hashCode();
                                                        if (!View$OnClickListenerC23992f.f56786a.contains(Integer.valueOf(hashCode))) {
                                                            View$OnClickListenerC23992f fVar = new View$OnClickListenerC23992f(view, a, localClassName);
                                                            if (!C24677a.m47209a(C23888f.class)) {
                                                                try {
                                                                    Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                                                                    try {
                                                                        field = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                                                                    } catch (ClassNotFoundException | NoSuchFieldException unused) {
                                                                        field = null;
                                                                    }
                                                                    if (!(declaredField == null || field == null)) {
                                                                        try {
                                                                            declaredField.setAccessible(true);
                                                                            field.setAccessible(true);
                                                                            try {
                                                                                declaredField.setAccessible(true);
                                                                                obj = declaredField.get(view);
                                                                            } catch (IllegalAccessException unused2) {
                                                                            }
                                                                            if (obj == null) {
                                                                                view.setOnClickListener(fVar);
                                                                            } else {
                                                                                field.set(obj, fVar);
                                                                            }
                                                                        } catch (Exception unused3) {
                                                                        } catch (Throwable th) {
                                                                            C24677a.m47208a(th, C23888f.class);
                                                                        }
                                                                    }
                                                                } catch (ClassNotFoundException | NoSuchFieldException unused4) {
                                                                }
                                                                view.setOnClickListener(fVar);
                                                            }
                                                            View$OnClickListenerC23992f.f56786a.add(Integer.valueOf(hashCode));
                                                        }
                                                    } catch (Throwable th2) {
                                                        C24677a.m47208a(th2, View$OnClickListenerC23992f.class);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Exception unused5) {
                            } catch (Throwable th3) {
                                C24677a.m47208a(th3, this);
                            }
                        }
                    }
                };
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    r2.run();
                } else {
                    this.f56783c.post(r2);
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
            }
        }
    }

    private ViewTreeObserver$OnGlobalLayoutListenerC23990e(Activity activity) {
        this.f56782b = new WeakReference<>(activity);
    }

    /* renamed from: a */
    static /* synthetic */ WeakReference m45370a(ViewTreeObserver$OnGlobalLayoutListenerC23990e eVar) {
        if (C24677a.m47209a(ViewTreeObserver$OnGlobalLayoutListenerC23990e.class)) {
            return null;
        }
        try {
            return eVar.f56782b;
        } catch (Throwable th) {
            C24677a.m47208a(th, ViewTreeObserver$OnGlobalLayoutListenerC23990e.class);
            return null;
        }
    }

    /* renamed from: a */
    static void m45372a(Activity activity) {
        if (!C24677a.m47209a(ViewTreeObserver$OnGlobalLayoutListenerC23990e.class)) {
            try {
                int hashCode = activity.hashCode();
                Map<Integer, ViewTreeObserver$OnGlobalLayoutListenerC23990e> map = f56781e;
                if (!map.containsKey(Integer.valueOf(hashCode))) {
                    ViewTreeObserver$OnGlobalLayoutListenerC23990e eVar = new ViewTreeObserver$OnGlobalLayoutListenerC23990e(activity);
                    map.put(Integer.valueOf(hashCode), eVar);
                    eVar.m45371a();
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, ViewTreeObserver$OnGlobalLayoutListenerC23990e.class);
            }
        }
    }

    /* renamed from: b */
    static void m45374b(Activity activity) {
        if (!C24677a.m47209a(ViewTreeObserver$OnGlobalLayoutListenerC23990e.class)) {
            try {
                int hashCode = activity.hashCode();
                Map<Integer, ViewTreeObserver$OnGlobalLayoutListenerC23990e> map = f56781e;
                if (map.containsKey(Integer.valueOf(hashCode))) {
                    map.remove(Integer.valueOf(hashCode));
                    map.get(Integer.valueOf(hashCode)).m45373b();
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, ViewTreeObserver$OnGlobalLayoutListenerC23990e.class);
            }
        }
    }
}
