package com.facebook.p1814a.p1815a;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.p1814a.C23998m;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.a.a.d */
public final class ViewTreeObserver$OnGlobalFocusChangeListenerC23872d implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: a */
    public static final Map<Integer, ViewTreeObserver$OnGlobalFocusChangeListenerC23872d> f56501a = new HashMap();

    /* renamed from: e */
    private static final String f56502e = ViewTreeObserver$OnGlobalFocusChangeListenerC23872d.class.getCanonicalName();

    /* renamed from: b */
    final Set<String> f56503b = new HashSet();

    /* renamed from: c */
    public WeakReference<Activity> f56504c;

    /* renamed from: d */
    public AtomicBoolean f56505d;

    /* renamed from: f */
    private final Handler f56506f;

    static {
        Covode.recordClassIndex(27993);
    }

    /* renamed from: a */
    private void m45137a(final View view) {
        if (!C24677a.m47209a(this)) {
            try {
                m45138a(new Runnable() {
                    /* class com.facebook.p1814a.p1815a.ViewTreeObserver$OnGlobalFocusChangeListenerC23872d.RunnableC238731 */

                    static {
                        Covode.recordClassIndex(27994);
                    }

                    public final void run() {
                        if (!C24677a.m47209a(this)) {
                            try {
                                View view = view;
                                if (view instanceof EditText) {
                                    ViewTreeObserver$OnGlobalFocusChangeListenerC23872d dVar = ViewTreeObserver$OnGlobalFocusChangeListenerC23872d.this;
                                    if (!C24677a.m47209a(ViewTreeObserver$OnGlobalFocusChangeListenerC23872d.class)) {
                                        try {
                                            if (!C24677a.m47209a(dVar)) {
                                                try {
                                                    String lowerCase = ((EditText) view).getText().toString().trim().toLowerCase();
                                                    if (!(lowerCase.isEmpty() || dVar.f56503b.contains(lowerCase))) {
                                                        if (lowerCase.length() <= 100) {
                                                            dVar.f56503b.add(lowerCase);
                                                            HashMap hashMap = new HashMap();
                                                            List<String> a = C23870b.m45124a(view);
                                                            List<String> list = null;
                                                            for (C23871c cVar : C23871c.m45130a()) {
                                                                String a2 = ViewTreeObserver$OnGlobalFocusChangeListenerC23872d.m45136a(cVar.mo39376b(), lowerCase);
                                                                if (cVar.mo39378d().isEmpty() || C23870b.m45125a(a2, cVar.mo39378d())) {
                                                                    if (C23870b.m45127a(a, cVar.mo39377c())) {
                                                                        ViewTreeObserver$OnGlobalFocusChangeListenerC23872d.m45139a(hashMap, cVar.mo39376b(), a2);
                                                                    } else {
                                                                        if (list == null) {
                                                                            list = C23870b.m45128b(view);
                                                                        }
                                                                        if (C23870b.m45127a(list, cVar.mo39377c())) {
                                                                            ViewTreeObserver$OnGlobalFocusChangeListenerC23872d.m45139a(hashMap, cVar.mo39376b(), a2);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            C23998m.m45380a(hashMap);
                                                        }
                                                    }
                                                } catch (Throwable th) {
                                                    C24677a.m47208a(th, dVar);
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            C24677a.m47208a(th2, ViewTreeObserver$OnGlobalFocusChangeListenerC23872d.class);
                                        }
                                    }
                                }
                            } catch (Throwable th3) {
                                C24677a.m47208a(th3, this);
                            }
                        }
                    }
                });
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
            }
        }
    }

    public ViewTreeObserver$OnGlobalFocusChangeListenerC23872d(Activity activity) {
        this.f56504c = new WeakReference<>(activity);
        this.f56506f = new Handler(Looper.getMainLooper());
        this.f56505d = new AtomicBoolean(false);
    }

    /* renamed from: a */
    private void m45138a(Runnable runnable) {
        if (!C24677a.m47209a(this)) {
            try {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    runnable.run();
                } else {
                    this.f56506f.post(runnable);
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
            }
        }
    }

    public final void onGlobalFocusChanged(View view, View view2) {
        if (!C24677a.m47209a(this)) {
            if (view != null) {
                try {
                    m45137a(view);
                } catch (Throwable th) {
                    C24677a.m47208a(th, this);
                    return;
                }
            }
            if (view2 != null) {
                m45137a(view2);
            }
        }
    }

    /* renamed from: a */
    static String m45136a(String str, String str2) {
        if (C24677a.m47209a(ViewTreeObserver$OnGlobalFocusChangeListenerC23872d.class)) {
            return null;
        }
        try {
            if ("r2".equals(str)) {
                return str2.replaceAll("[^\\d.]", "");
            }
            return str2;
        } catch (Throwable th) {
            C24677a.m47208a(th, ViewTreeObserver$OnGlobalFocusChangeListenerC23872d.class);
            return null;
        }
    }

    /* renamed from: a */
    static void m45139a(Map<String, String> map, String str, String str2) {
        if (!C24677a.m47209a(ViewTreeObserver$OnGlobalFocusChangeListenerC23872d.class)) {
            char c = 65535;
            try {
                switch (str.hashCode()) {
                    case 3585:
                        if (str.equals("r3")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3586:
                        if (str.equals("r4")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3587:
                        if (str.equals("r5")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 3588:
                        if (str.equals("r6")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                if (c != 0) {
                    if (c == 1 || c == 2) {
                        str2 = str2.replaceAll("[^a-z]+", "");
                    } else if (c == 3 && str2.contains("-")) {
                        str2 = str2.split("-")[0];
                    }
                } else if (str2.startsWith("m") || str2.startsWith("b") || str2.startsWith("ge")) {
                    str2 = "m";
                } else {
                    str2 = "f";
                }
                map.put(str, str2);
            } catch (Throwable th) {
                C24677a.m47208a(th, ViewTreeObserver$OnGlobalFocusChangeListenerC23872d.class);
            }
        }
    }
}
