package com.p2082ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ar */
public final class C73964ar implements Handler.Callback {

    /* renamed from: a */
    public static C73964ar f166038a = new C73964ar();

    /* renamed from: b */
    public TextView f166039b;

    /* renamed from: c */
    public volatile long f166040c;

    /* renamed from: d */
    public volatile long f166041d;

    /* renamed from: e */
    public volatile long f166042e;

    /* renamed from: f */
    public volatile long f166043f;

    /* renamed from: g */
    private Context f166044g;

    /* renamed from: h */
    private Handler f166045h = new Handler(Looper.getMainLooper());

    /* renamed from: i */
    private Handler f166046i;

    /* renamed from: j */
    private ViewGroup f166047j;

    /* renamed from: k */
    private volatile long f166048k = 2500;

    /* renamed from: l */
    private int f166049l = 0;

    /* renamed from: m */
    private volatile boolean f166050m = false;

    static {
        Covode.recordClassIndex(86714);
    }

    /* renamed from: d */
    private static long m130088d() {
        try {
            return Runtime.getRuntime().maxMemory();
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public final void mo116392a() {
        this.f166044g = null;
        this.f166039b = null;
        this.f166046i.sendEmptyMessage(1);
    }

    private C73964ar() {
        C63244g.m114602a();
        this.f166048k = 2500;
        this.f166050m = false;
        this.f166046i = new Handler(C74040v.m130196a(), this);
    }

    /* renamed from: c */
    private void m130087c() {
        C69840ar arVar = new C69840ar();
        arVar.mo110188a("dalvikPss", Long.valueOf(this.f166040c));
        arVar.mo110188a("nativePss", Long.valueOf(this.f166041d));
        arVar.mo110188a("otherPss", Long.valueOf(this.f166043f));
        arVar.mo110188a("totalPss", Long.valueOf(this.f166042e));
        C40982q.m82522a("av_video_memory", arVar.mo110191a());
    }

    /* renamed from: b */
    public final void mo116394b() {
        MethodCollector.m26663i(4890);
        if (!(this.f166039b == null || this.f166047j == null || !this.f166050m)) {
            this.f166047j.removeView(this.f166039b);
            this.f166039b = null;
            this.f166047j = null;
        }
        MethodCollector.m26664o(4890);
    }

    /* renamed from: a */
    private static Context m130085a(Activity activity) {
        Context applicationContext = activity.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            try {
                if (Thread.currentThread().isInterrupted()) {
                    if (this.f166049l > 3) {
                        m130087c();
                    }
                    this.f166049l = 0;
                    return false;
                }
                Context context = this.f166044g;
                if (context != null) {
                    try {
                        ActivityManager activityManager = (ActivityManager) m130086a(context, "activity");
                        if (activityManager != null) {
                            final Debug.MemoryInfo[] processMemoryInfo = activityManager.getProcessMemoryInfo(new int[]{Process.myPid()});
                            this.f166040c = (long) processMemoryInfo[0].dalvikPss;
                            this.f166041d = (long) processMemoryInfo[0].nativePss;
                            this.f166043f = (long) processMemoryInfo[0].otherPss;
                            this.f166042e = (long) processMemoryInfo[0].getTotalPss();
                            C73991bj.m130133d("dalvikPss=" + (processMemoryInfo[0].dalvikPss / 1000) + " nativePss=" + (processMemoryInfo[0].nativePss / 1000) + " otherPss=" + (processMemoryInfo[0].otherPss / 1000) + " totalPss=" + (processMemoryInfo[0].getTotalPss() / 1000) + " MaxMemory=" + (m130088d() / 1000000));
                            if (this.f166050m) {
                                this.f166045h.post(new Runnable() {
                                    /* class com.p2082ss.android.ugc.aweme.shortvideo.util.C73964ar.RunnableC739651 */

                                    static {
                                        Covode.recordClassIndex(86715);
                                    }

                                    public final void run() {
                                        if (C73964ar.this.f166039b != null) {
                                            C73964ar.this.f166039b.setText("dalvikPss:" + (processMemoryInfo[0].dalvikPss / 1000) + "\nnativePss:" + (processMemoryInfo[0].nativePss / 1000) + "\notherPss:" + (processMemoryInfo[0].otherPss / 1000) + "\ntotalPss:" + (processMemoryInfo[0].getTotalPss() / 1000));
                                        }
                                    }
                                });
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                this.f166049l++;
                this.f166046i.sendEmptyMessageDelayed(0, this.f166048k);
            } catch (Exception e) {
                e.printStackTrace();
                if (this.f166049l > 3) {
                    m130087c();
                }
                this.f166049l = 0;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static Object m130086a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(6198);
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
                    MethodCollector.m26664o(6198);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public final void mo116393a(Activity activity, ViewGroup viewGroup) {
        MethodCollector.m26663i(6359);
        if (activity == null || activity.isFinishing() || viewGroup == null || !this.f166050m) {
            MethodCollector.m26664o(6359);
            return;
        }
        this.f166047j = viewGroup;
        this.f166039b = new TextView(m130085a(activity));
        this.f166039b.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.f166039b.setTextSize(15.0f);
        TextView textView = this.f166039b;
        textView.setTextColor(textView.getResources().getColor(R.color.a2));
        viewGroup.addView(this.f166039b);
        MethodCollector.m26664o(6359);
    }
}
