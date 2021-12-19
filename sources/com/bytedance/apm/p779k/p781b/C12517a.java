package com.bytedance.apm.p779k.p781b;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.C12397c;
import com.bytedance.apm.config.C12415a;
import com.bytedance.apm.p767c.p768a.C12401a;
import com.bytedance.apm.p767c.p769b.C12409c;
import com.bytedance.apm.p779k.p781b.p782a.C12522a;
import com.bytedance.apm.p779k.p781b.p782a.C12523b;
import com.bytedance.apm.p779k.p781b.p782a.C12524c;
import com.bytedance.apm.p786n.C12556c;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.p1546a.p1548b.AbstractC21450d;
import com.bytedance.monitor.p1546a.p1548b.AbstractRunnableC21452e;
import com.bytedance.monitor.p1546a.p1548b.C21435a;
import com.bytedance.monitor.p1546a.p1548b.C21448c;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.k.b.a */
public final class C12517a {

    /* renamed from: g */
    private static C12517a f30419g = new C12517a();

    /* renamed from: h */
    private static boolean f30420h = false;

    /* renamed from: a */
    public ReferenceQueue<Object> f30421a;

    /* renamed from: b */
    public Set<String> f30422b;

    /* renamed from: c */
    public C12415a f30423c;

    /* renamed from: d */
    long f30424d;

    /* renamed from: e */
    volatile AbstractC21450d f30425e;

    /* renamed from: f */
    private Handler f30426f;

    static {
        Covode.recordClassIndex(14333);
    }

    /* renamed from: a */
    public final void mo20346a() {
        while (true) {
            C12523b bVar = (C12523b) this.f30421a.poll();
            if (bVar != null) {
                this.f30422b.remove(bVar.f30435a);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo20348a(C12523b bVar) {
        if (!this.f30422b.contains(bVar.f30435a)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m22505a(Application application) {
        this.f30426f = new Handler(Looper.getMainLooper());
        this.f30421a = new ReferenceQueue<>();
        this.f30422b = new CopyOnWriteArraySet();
        application.registerActivityLifecycleCallbacks(new C12524c() {
            /* class com.bytedance.apm.p779k.p781b.C12517a.C125181 */

            static {
                Covode.recordClassIndex(14334);
            }

            @Override // com.bytedance.apm.p779k.p781b.p782a.C12524c
            public final void onActivityDestroyed(Activity activity) {
                boolean b = C12556c.m22587b("activity_leak_switch");
                if (C12397c.m22288e()) {
                    String[] strArr = new String[1];
                    "activity_leak_switch : ".concat(String.valueOf(b));
                }
                if (b) {
                    String uuid = UUID.randomUUID().toString();
                    C12517a.this.f30422b.add(uuid);
                    C12523b bVar = new C12523b(activity, uuid, "", C12517a.this.f30421a);
                    String localClassName = activity.getLocalClassName();
                    if (C12397c.m22288e()) {
                        String[] strArr2 = new String[1];
                        "Wait Check Leak:".concat(String.valueOf(localClassName));
                    }
                    C12517a aVar = C12517a.this;
                    if (aVar.f30425e == null) {
                        aVar.f30425e = C21435a.C21439a.f50832a;
                    }
                    if (aVar.f30425e != null) {
                        AbstractC21450d dVar = aVar.f30425e;
                        AbstractRunnableC21452e a = C21448c.m40280a("LeakCheck-Thread", new Runnable(bVar, localClassName) {
                            /* class com.bytedance.apm.p779k.p781b.C12517a.RunnableC125192 */

                            /* renamed from: a */
                            final /* synthetic */ C12523b f30428a;

                            /* renamed from: b */
                            final /* synthetic */ String f30429b;

                            static {
                                Covode.recordClassIndex(14335);
                            }

                            public final void run() {
                                try {
                                    C12517a.this.mo20346a();
                                    if (C12517a.this.mo20348a(this.f30428a)) {
                                        if (C12397c.m22288e()) {
                                            String[] strArr = new String[1];
                                            String str = "No Leak First Check:" + this.f30429b;
                                        }
                                    } else if (C12517a.this.f30423c.f30023a) {
                                        long currentTimeMillis = System.currentTimeMillis();
                                        Runtime.getRuntime().gc();
                                        try {
                                            Thread.sleep(100);
                                            System.runFinalization();
                                            if (C12397c.m22288e()) {
                                                String[] strArr2 = new String[1];
                                                String str2 = "GC time done, cost: " + (System.currentTimeMillis() - currentTimeMillis) + " ms.";
                                            }
                                            C12517a.this.mo20346a();
                                            if (!C12517a.this.mo20348a(this.f30428a)) {
                                                C12517a.this.mo20347a(this.f30428a, this.f30429b);
                                            } else if (C12397c.m22288e()) {
                                                String[] strArr3 = new String[1];
                                                String str3 = "No Leak:" + this.f30429b;
                                            }
                                        } catch (InterruptedException unused) {
                                            throw new AssertionError();
                                        }
                                    } else {
                                        C12517a.this.mo20347a(this.f30428a, this.f30429b);
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }

                            {
                                this.f30428a = r2;
                                this.f30429b = r3;
                            }
                        });
                        if (aVar.f30424d <= 0) {
                            aVar.f30424d = 60000;
                        }
                        dVar.mo35035a(a, aVar.f30424d);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public static void m22506a(Application application, C12415a aVar) {
        if (application != null && aVar != null && !f30420h) {
            f30420h = true;
            f30419g.m22507b(application, aVar);
        }
    }

    /* renamed from: b */
    private void m22507b(Application application, C12415a aVar) {
        this.f30423c = aVar;
        this.f30424d = aVar.f30024b;
        long currentTimeMillis = System.currentTimeMillis();
        m22505a(application);
        if (C12397c.m22288e()) {
            String[] strArr = new String[1];
            String str = "initActivityLeakCheck done, cost: " + (System.currentTimeMillis() - currentTimeMillis) + " ms.";
        }
    }

    /* renamed from: a */
    public final void mo20347a(C12523b bVar, String str) {
        if (C12397c.m22288e()) {
            String[] strArr = new String[1];
            "Leak:".concat(String.valueOf(str));
        }
        final Activity activity = (Activity) bVar.get();
        if (activity != null) {
            if (this.f30423c.f30026d) {
                this.f30426f.post(new Runnable() {
                    /* class com.bytedance.apm.p779k.p781b.C12517a.RunnableC125203 */

                    static {
                        Covode.recordClassIndex(14336);
                    }

                    public final void run() {
                        Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler(activity) {
                            /* class com.bytedance.apm.p779k.p781b.C12517a.C125214 */

                            /* renamed from: a */
                            final /* synthetic */ Activity f30433a;

                            static {
                                Covode.recordClassIndex(14337);
                            }

                            public final boolean queueIdle() {
                                Activity activity = this.f30433a;
                                long currentTimeMillis = System.currentTimeMillis();
                                if (activity != null && activity.getWindow() != null && activity.getWindow().peekDecorView() != null) {
                                    try {
                                        int i = Build.VERSION.SDK_INT;
                                        if (!activity.isDestroyed()) {
                                            return false;
                                        }
                                        if (activity.getWindow().getContext() == activity) {
                                            View rootView = activity.getWindow().peekDecorView().getRootView();
                                            ViewGroup viewGroup = (ViewGroup) rootView.findViewById(16908290);
                                            if (viewGroup.getChildCount() > 0 && viewGroup.getChildAt(0).getContext() == activity) {
                                                C12522a.m22512a(rootView, activity);
                                            }
                                        }
                                    } catch (Throwable th) {
                                        if (C12397c.m22288e()) {
                                            String[] strArr = new String[2];
                                            th.getMessage();
                                        }
                                    }
                                } else if (C12397c.m22288e()) {
                                    new String[]{"unbindDrawables, ui or ui's window is null, skip rest works."};
                                }
                                if (C12397c.m22288e()) {
                                    String[] strArr2 = new String[1];
                                    String str = "unbindDrawables done, cost: " + (System.currentTimeMillis() - currentTimeMillis) + " ms.";
                                }
                                return false;
                            }

                            {
                                this.f30433a = r2;
                            }
                        });
                    }
                });
            }
            if (this.f30423c.f30025c) {
                String name = activity.getClass().getName();
                boolean b = C12556c.m22587b("activity_leak_event");
                if (C12397c.m22288e()) {
                    String[] strArr2 = new String[1];
                    "activity_leak_event : ".concat(String.valueOf(b));
                }
                if (b && !TextUtils.isEmpty(name)) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(name, 1);
                        C12401a.m22303b().mo20179a(new C12409c("activity_leak_event", 0, (JSONObject) null, jSONObject, (JSONObject) null, (JSONObject) null));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (C12397c.m22288e()) {
                    String[] strArr3 = new String[1];
                    String str2 = "upload leak activity:" + activity.getLocalClassName();
                }
            }
            this.f30422b.remove(bVar.f30435a);
            AbstractC12525b bVar2 = this.f30423c.f30027e;
            if (bVar2 != null) {
                bVar2.mo20359a(activity);
            }
        }
    }
}
