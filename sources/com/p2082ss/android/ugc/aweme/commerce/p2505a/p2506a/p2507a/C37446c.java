package com.p2082ss.android.ugc.aweme.commerce.p2505a.p2506a.p2507a;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.commerce.p2505a.p2506a.p2508b.C37452c;
import com.p2082ss.android.ugc.aweme.commerce.p2505a.p2506a.p2509c.C37454a;
import com.p2082ss.android.ugc.aweme.commerce.p2505a.p2506a.p2509c.C37455b;
import com.p2082ss.android.ugc.aweme.commerce.p2505a.p2506a.p2511e.C37459b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.commerce.a.a.a.c */
public final class C37446c extends AbstractC37444a {

    /* renamed from: a */
    public final ArrayList<WeakReference<View>> f88397a = new ArrayList<>();

    /* renamed from: b */
    public boolean f88398b = false;

    /* renamed from: c */
    public boolean f88399c = false;

    /* renamed from: d */
    public String f88400d;

    /* renamed from: e */
    public long f88401e;

    /* renamed from: f */
    private final AbstractC37445b f88402f;

    /* renamed from: g */
    private WeakReference<View> f88403g = new WeakReference<>(null);

    /* renamed from: h */
    private boolean f88404h = false;

    static {
        Covode.recordClassIndex(44831);
    }

    /* renamed from: f */
    private void m75526f() {
        if (!this.f88404h) {
            this.f88404h = true;
            this.f88402f.mo65158a();
        }
    }

    /* renamed from: c */
    public final View mo65159c() {
        return this.f88403g.get();
    }

    /* renamed from: d */
    public final boolean mo65160d() {
        if (!this.f88398b || this.f88399c) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final void mo65161e() {
        if (!this.f88404h && C37452c.f88416a.mo65165a(this.f88400d, this.f88401e)) {
            m75526f();
        }
        this.f88401e = Long.MAX_VALUE;
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce.p2505a.p2506a.p2507a.AbstractC37444a
    /* renamed from: a */
    public final void mo65153a() {
        if (!this.f88398b) {
            this.f88398b = true;
            this.f88404h = false;
            this.f88401e = System.nanoTime();
            C37454a aVar = C37454a.f88421a;
            boolean z = !aVar.f88423c.isEmpty();
            aVar.f88423c.add(this);
            if (!z) {
                C37459b.f88437a.mo65170a();
                C37455b bVar = C37455b.f88425a;
                bVar.f88427c = new BroadcastReceiver() {
                    /* class com.p2082ss.android.ugc.aweme.commerce.p2505a.p2506a.p2509c.C37455b.C374561 */

                    static {
                        Covode.recordClassIndex(44841);
                    }

                    /* renamed from: a */
                    private static Object m75544a(Context context, String str) {
                        Object obj;
                        MethodCollector.m26663i(4280);
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
                                    MethodCollector.m26664o(4280);
                                }
                            }
                        } else {
                            obj = context.getSystemService(str);
                        }
                        return obj;
                    }

                    public final void onReceive(Context context, Intent intent) {
                        KeyguardManager keyguardManager;
                        if (intent != null) {
                            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                                C37455b.this.mo65166a(true);
                            } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                                C37455b.this.mo65166a(false);
                            } else if ("android.intent.action.SCREEN_ON".equals(intent.getAction()) && (keyguardManager = (KeyguardManager) m75544a(context, "keyguard")) != null && !keyguardManager.inKeyguardRestrictedInputMode()) {
                                C37455b.this.mo65166a(false);
                            }
                        }
                    }
                };
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                if (bVar.f88426b.get() != null) {
                    C37455b.m75541a(bVar.f88426b.get(), bVar.f88427c, intentFilter);
                }
                bVar.f88428d = true;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce.p2505a.p2506a.p2507a.AbstractC37444a
    /* renamed from: b */
    public final void mo65155b() {
        if (!this.f88399c) {
            mo65161e();
            this.f88399c = true;
            this.f88403g.clear();
            if (!this.f88399c) {
                this.f88397a.clear();
            }
            C37454a aVar = C37454a.f88421a;
            boolean isEmpty = true ^ aVar.f88423c.isEmpty();
            aVar.f88422b.remove(this);
            aVar.f88423c.remove(this);
            if (isEmpty && aVar.f88423c.isEmpty()) {
                C37459b.f88437a.mo65172b();
                C37455b bVar = C37455b.f88425a;
                if (!(bVar.f88426b.get() == null || bVar.f88427c == null)) {
                    bVar.f88426b.get().unregisterReceiver(bVar.f88427c);
                    bVar.f88427c = null;
                }
                bVar.f88428d = false;
                bVar.f88429e = false;
            }
        }
    }

    /* renamed from: d */
    private void m75525d(View view) {
        this.f88403g = new WeakReference<>(view);
    }

    public C37446c(AbstractC37445b bVar) {
        this.f88402f = bVar;
        this.f88400d = UUID.randomUUID().toString();
        m75525d(null);
        C37454a.f88421a.f88422b.add(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce.p2505a.p2506a.p2507a.AbstractC37444a
    /* renamed from: a */
    public final void mo65154a(View view) {
        if (!this.f88399c && view != null && mo65159c() != view) {
            m75525d(view);
            Iterator<C37446c> it = C37454a.f88421a.f88422b.iterator();
            while (it.hasNext()) {
                C37446c next = it.next();
                if (next != this && next.mo65159c() == view) {
                    next.f88403g.clear();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce.p2505a.p2506a.p2507a.AbstractC37444a
    /* renamed from: b */
    public final void mo65156b(View view) {
        if (!this.f88399c && view != null) {
            Iterator<WeakReference<View>> it = this.f88397a.iterator();
            while (it.hasNext()) {
                if (it.next().get() == view) {
                    return;
                }
            }
            this.f88397a.add(new WeakReference<>(view));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce.p2505a.p2506a.p2507a.AbstractC37444a
    /* renamed from: c */
    public final void mo65157c(View view) {
        if (!this.f88399c && view != null) {
            WeakReference<View> weakReference = null;
            Iterator<WeakReference<View>> it = this.f88397a.iterator();
            while (it.hasNext()) {
                WeakReference<View> next = it.next();
                if (next.get() == view) {
                    weakReference = next;
                }
            }
            this.f88397a.remove(weakReference);
        }
    }
}
