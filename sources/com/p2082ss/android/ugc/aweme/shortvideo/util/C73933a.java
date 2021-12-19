package com.p2082ss.android.ugc.aweme.shortvideo.util;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.tools.utils.C84905l;
import java.lang.reflect.Field;
import java.util.HashMap;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.a */
public final class C73933a {

    /* renamed from: f */
    public static HashMap<String, C73933a> f166004f = new HashMap<>();

    /* renamed from: g */
    public static final C73934a f166005g = new C73934a((byte) 0);

    /* renamed from: a */
    public C73935b f166006a;

    /* renamed from: b */
    int f166007b;

    /* renamed from: c */
    boolean f166008c;

    /* renamed from: d */
    public final Context f166009d;

    /* renamed from: e */
    public final String f166010e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.a$b */
    public static final class C73935b {

        /* renamed from: a */
        public long f166011a;

        /* renamed from: b */
        public long f166012b;

        /* renamed from: c */
        public long f166013c;

        static {
            Covode.recordClassIndex(86685);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.a$a */
    public static final class C73934a {
        static {
            Covode.recordClassIndex(86684);
        }

        private C73934a() {
        }

        public /* synthetic */ C73934a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C89378p<Integer, Integer> m130028a(String str) {
            C73935b bVar;
            C89219l.m154721d(str, "");
            C73933a aVar = C73933a.f166004f.get(str);
            if (aVar == null || (bVar = aVar.f166006a) == null) {
                return new C89378p<>(-1, -1);
            }
            return new C89378p<>(Integer.valueOf((int) bVar.f166011a), Integer.valueOf((int) bVar.f166013c));
        }
    }

    static {
        Covode.recordClassIndex(86683);
    }

    private C73933a(Context context, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        this.f166009d = context;
        this.f166010e = str;
    }

    /* renamed from: b */
    public static final C73933a m130025b(Context context, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        if (f166004f.get(str) == null) {
            f166004f.put(str, new C73933a(context, str));
        }
        C73933a aVar = f166004f.get(str);
        if (aVar == null) {
            C89219l.m154715b();
        }
        return aVar;
    }

    /* renamed from: c */
    private static Object m130026c(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(6032);
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
                    MethodCollector.m26664o(6032);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C73935b mo116383a(Context context, String str) {
        ActivityManager activityManager;
        if (context == null || (activityManager = (ActivityManager) m130026c(context, "activity")) == null) {
            return null;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        C73935b bVar = new C73935b();
        C73964ar arVar = C73964ar.f166038a;
        C89219l.m154716b(arVar, "");
        bVar.f166011a = arVar.f166042e / 1024;
        bVar.f166012b = C84905l.m145911a(memoryInfo.totalMem - memoryInfo.availMem);
        bVar.f166013c = C84905l.m145911a(memoryInfo.availMem);
        C73991bj.m130133d("\n".concat(String.valueOf("av-performance\nmonitor instant value => \nscene = " + this.f166010e + ", action = " + str + "\ncurrent memory snapshot: app memory usage = " + bVar.f166011a + " Mb, system memory usage = " + bVar.f166012b + " Mb, available memory = " + bVar.f166013c + " Mb. ")));
        return bVar;
    }
}
