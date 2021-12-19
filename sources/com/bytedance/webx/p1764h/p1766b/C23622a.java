package com.bytedance.webx.p1764h.p1766b;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.webx.p1764h.p1765a.AbstractC23619a;
import com.bytedance.webx.p1764h.p1765a.AbstractC23620b;
import com.bytedance.webx.p1764h.p1767c.C23625a;
import com.bytedance.webx.p1764h.p1768d.C23627a;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.webx.h.b.a */
public final class C23622a implements AbstractC23619a {

    /* renamed from: f */
    private static boolean f55894f = true;

    /* renamed from: a */
    public final Object f55895a = new Object();

    /* renamed from: b */
    public final Context f55896b;

    /* renamed from: c */
    public MessageQueue f55897c;

    /* renamed from: d */
    private final Map<String, C23625a> f55898d = new HashMap();

    /* renamed from: e */
    private AbstractC23620b f55899e;

    static {
        Covode.recordClassIndex(27721);
    }

    public C23622a(Context context) {
        this.f55896b = context;
    }

    /* renamed from: b */
    private void m44661b(final C23625a aVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f55897c = Looper.getMainLooper().getQueue();
            mo39039a(aVar);
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            this.f55897c = Looper.myQueue();
            mo39039a(aVar);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                /* class com.bytedance.webx.p1764h.p1766b.C23622a.RunnableC236242 */

                static {
                    Covode.recordClassIndex(27723);
                }

                public final void run() {
                    C23622a.this.f55897c = Looper.myQueue();
                    C23622a.this.mo39039a(aVar);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo39039a(final C23625a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            MessageQueue messageQueue = this.f55897c;
            if (messageQueue != null) {
                messageQueue.addIdleHandler(new MessageQueue.IdleHandler() {
                    /* class com.bytedance.webx.p1764h.p1766b.C23622a.C236231 */

                    static {
                        Covode.recordClassIndex(27722);
                    }

                    public final boolean queueIdle() {
                        MethodCollector.m26663i(3812);
                        synchronized (C23622a.this.f55895a) {
                            try {
                                if (aVar.f55905b.size() < aVar.f55907d) {
                                    WebView a = aVar.f55906c.mo26664a(new MutableContextWrapper(C23622a.this.f55896b));
                                    aVar.f55905b.add(new SoftReference<>(a));
                                    C23627a.m44671a(a, true);
                                }
                            } catch (Throwable th) {
                                MethodCollector.m26664o(3812);
                                throw th;
                            }
                        }
                        MethodCollector.m26664o(3812);
                        return false;
                    }
                });
            } else {
                m44661b(aVar);
            }
        }
    }

    @Override // com.bytedance.webx.p1764h.p1765a.AbstractC23619a
    /* renamed from: a */
    public final AbstractC23619a mo39038a(String str, C23625a aVar) {
        if (!this.f55898d.containsKey(str) && aVar != null) {
            aVar.f55904a = str;
            this.f55898d.put(str, aVar);
            if (aVar.f55908e) {
                m44660a(str, aVar.f55907d);
            }
        }
        return this;
    }

    /* renamed from: a */
    private void m44660a(String str, int i) {
        MethodCollector.m26663i(99);
        synchronized (this.f55895a) {
            try {
                C23625a aVar = this.f55898d.get(str);
                if (aVar != null) {
                    int size = aVar.f55905b.size();
                    aVar.f55907d = i;
                    int i2 = 0;
                    if (size < i) {
                        while (i2 < i - size) {
                            mo39039a(aVar);
                            i2++;
                        }
                    } else {
                        while (i2 < size - i) {
                            C23627a.m44669a(aVar.f55905b.remove((size - 1) - i2).get(), this.f55896b);
                            i2++;
                        }
                    }
                    MethodCollector.m26664o(99);
                }
            } finally {
                MethodCollector.m26664o(99);
            }
        }
    }

    @Override // com.bytedance.webx.p1764h.p1765a.AbstractC23619a
    /* renamed from: a */
    public final WebView mo39037a(Context context, String str) {
        WebView webView;
        MethodCollector.m26663i(69);
        SystemClock.uptimeMillis();
        C23625a aVar = this.f55898d.get(str);
        if (aVar == null) {
            webView = null;
        } else if (!aVar.f55905b.isEmpty()) {
            synchronized (this.f55895a) {
                try {
                    webView = aVar.f55905b.remove(0).get();
                    if (webView != null) {
                        C23627a.m44673b(webView, context);
                    }
                    if (aVar.f55905b.size() < aVar.f55907d) {
                        mo39039a(aVar);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(69);
                    throw th;
                }
            }
        } else {
            webView = aVar.f55906c.mo26664a(new MutableContextWrapper(context));
            C23627a.m44671a(webView, false);
            m44660a(str, aVar.f55907d);
        }
        if (!(aVar == null || this.f55899e == null)) {
            SystemClock.uptimeMillis();
            f55894f = false;
        }
        MethodCollector.m26664o(69);
        return webView;
    }
}
