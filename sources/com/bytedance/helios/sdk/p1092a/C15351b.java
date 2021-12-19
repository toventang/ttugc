package com.bytedance.helios.sdk.p1092a;

import android.app.AppOpsManager;
import android.app.AsyncNotedAppOp;
import android.app.SyncNotedAppOp;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13846c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.p1092a.C15348a;
import com.bytedance.helios.sdk.utils.HandlerThreadC15486g;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.lang.reflect.Field;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.sdk.a.b */
public final class C15351b {

    /* renamed from: c */
    public static C15351b f37445c;

    /* renamed from: d */
    public static final C15352a f37446d = new C15352a((byte) 0);

    /* renamed from: a */
    public AppOpsManager f37447a;

    /* renamed from: b */
    public final AppOpsManager$OnOpNotedCallbackC15353b f37448b;

    /* renamed from: e */
    private Context f37449e;

    /* renamed from: f */
    private final AppOpsManager.OnOpActiveChangedListener f37450f;

    static {
        Covode.recordClassIndex(17602);
    }

    /* renamed from: com.bytedance.helios.sdk.a.b$a */
    public static final class C15352a {
        static {
            Covode.recordClassIndex(17603);
        }

        private C15352a() {
        }

        public /* synthetic */ C15352a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C15351b m28249a(Context context) {
            MethodCollector.m26663i(5553);
            C89219l.m154719c(context, "");
            if (C15351b.f37445c == null) {
                synchronized (C15351b.class) {
                    try {
                        if (C15351b.f37445c == null) {
                            C15351b.f37445c = new C15351b(context, (byte) 0);
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(5553);
                        throw th;
                    }
                }
            }
            C15351b bVar = C15351b.f37445c;
            MethodCollector.m26664o(5553);
            return bVar;
        }
    }

    /* renamed from: com.bytedance.helios.sdk.a.b$b */
    public static final class AppOpsManager$OnOpNotedCallbackC15353b extends AppOpsManager.OnOpNotedCallback {
        static {
            Covode.recordClassIndex(17604);
        }

        AppOpsManager$OnOpNotedCallbackC15353b() {
        }

        public final void onAsyncNoted(AsyncNotedAppOp asyncNotedAppOp) {
            C89219l.m154719c(asyncNotedAppOp, "");
            String op = asyncNotedAppOp.getOp();
            C89219l.m154709a((Object) op, "");
            C15348a.m28246a(op, 2, new Throwable());
        }

        public final void onNoted(SyncNotedAppOp syncNotedAppOp) {
            C89219l.m154719c(syncNotedAppOp, "");
            String op = syncNotedAppOp.getOp();
            C89219l.m154709a((Object) op, "");
            C15348a.m28246a(op, 0, new Throwable());
        }

        public final void onSelfNoted(SyncNotedAppOp syncNotedAppOp) {
            C89219l.m154719c(syncNotedAppOp, "");
            String op = syncNotedAppOp.getOp();
            C89219l.m154709a((Object) op, "");
            C15348a.m28246a(op, 1, new Throwable());
        }
    }

    private C15351b(Context context) {
        this.f37450f = C15354c.f37451a;
        this.f37448b = new AppOpsManager$OnOpNotedCallbackC15353b();
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f37449e = applicationContext;
        Object a = m28248a(context, "appops");
        if (a != null) {
            this.f37447a = (AppOpsManager) a;
            return;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    public /* synthetic */ C15351b(Context context, byte b) {
        this(context);
    }

    /* renamed from: a */
    private static Object m28248a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(6458);
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
                    MethodCollector.m26664o(6458);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: com.bytedance.helios.sdk.a.b$c */
    static final class C15354c implements AppOpsManager.OnOpActiveChangedListener {

        /* renamed from: a */
        public static final C15354c f37451a = new C15354c();

        static {
            Covode.recordClassIndex(17605);
        }

        C15354c() {
        }

        public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
            C89219l.m154719c(str, "");
            C89219l.m154719c(str2, "");
            Throwable th = new Throwable();
            C89219l.m154719c(str, "");
            C89219l.m154719c(th, "");
            HandlerThreadC15486g.m28499b().post(new C15348a.RunnableC15349a(str, th, z));
        }
    }
}
