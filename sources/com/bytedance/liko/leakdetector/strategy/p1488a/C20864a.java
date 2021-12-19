package com.bytedance.liko.leakdetector.strategy.p1488a;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13846c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.liko.leakdetector.AbstractC20851a;
import com.bytedance.liko.leakdetector.AbstractC20856b;
import com.bytedance.liko.leakdetector.p1487a.C20855d;
import com.bytedance.liko.leakdetector.strategy.p1488a.p1489a.C20868a;
import com.bytedance.liko.leakdetector.strategy.p1488a.p1489a.C20869b;
import com.bytedance.liko.leakdetector.strategy.p1488a.p1489a.C20870c;
import com.bytedance.liko.leakdetector.strategy.p1488a.p1489a.C20871d;
import com.bytedance.liko.memoryexplorer.MemoryConfig;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.tailor.Tailor;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.AbstractC90025ab;
import okhttp3.C90200t;
import okhttp3.C90204w;
import okhttp3.C90205x;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.liko.leakdetector.strategy.a.a */
public final class C20864a {

    /* renamed from: a */
    public static final C20865a f49331a = new C20865a((byte) 0);

    static {
        Covode.recordClassIndex(24443);
    }

    /* renamed from: com.bytedance.liko.leakdetector.strategy.a.a$a */
    public static final class C20865a {
        static {
            Covode.recordClassIndex(24444);
        }

        private C20865a() {
        }

        public /* synthetic */ C20865a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.liko.leakdetector.strategy.a.a$b */
    public static final class C20866b extends AbstractC90025ab {

        /* renamed from: a */
        final /* synthetic */ C90204w f49332a;

        /* renamed from: b */
        final /* synthetic */ File f49333b;

        static {
            Covode.recordClassIndex(24445);
        }

        @Override // okhttp3.AbstractC90025ab
        public final C90204w contentType() {
            return this.f49332a;
        }

        @Override // okhttp3.AbstractC90025ab
        public final long contentLength() {
            return this.f49333b.length();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
            p4600h.p4610e.C89146c.m154636a(r9, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
            throw r0;
         */
        @Override // okhttp3.AbstractC90025ab
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void writeTo(p4632k.AbstractC89425g r11) {
            /*
                r10 = this;
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154719c(r11, r0)
                java.io.File r0 = r10.f49333b     // Catch:{ Exception -> 0x0036 }
                k.aa r9 = p4632k.C89436q.m155168c(r0)     // Catch:{ Exception -> 0x0036 }
                r8 = r9
                k.aa r8 = (p4632k.AbstractC89408aa) r8     // Catch:{ all -> 0x002f }
                k.f r7 = new k.f     // Catch:{ all -> 0x002f }
                r7.<init>()     // Catch:{ all -> 0x002f }
                r3 = 2048(0x800, double:1.0118E-320)
                long r1 = r8.read(r7, r3)     // Catch:{ all -> 0x002f }
            L_0x0019:
                r5 = -1
                int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r0 == 0) goto L_0x0027
                r11.mo22060a(r7, r1)     // Catch:{ all -> 0x002f }
                long r1 = r8.read(r7, r3)     // Catch:{ all -> 0x002f }
                goto L_0x0019
            L_0x0027:
                r11.flush()     // Catch:{ all -> 0x002f }
                r0 = 0
                p4600h.p4610e.C89146c.m154636a(r9, r0)
                return
            L_0x002f:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x0031 }
            L_0x0031:
                r0 = move-exception
                p4600h.p4610e.C89146c.m154636a(r9, r1)
                throw r0
            L_0x0036:
                r0 = move-exception
                r0.printStackTrace()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.liko.leakdetector.strategy.p1488a.C20864a.C20866b.writeTo(k.g):void");
        }

        C20866b(C90204w wVar, File file) {
            this.f49332a = wVar;
            this.f49333b = file;
        }
    }

    /* renamed from: a */
    private static Map<String, String> m39220a() {
        MemoryConfig memoryConfig = MemoryConfig.getMemoryConfig();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("aid", String.valueOf(memoryConfig.aid));
        String str = memoryConfig.channel;
        C89219l.m154709a((Object) str, "");
        linkedHashMap.put("channel", str);
        String str2 = memoryConfig.device_id;
        C89219l.m154709a((Object) str2, "");
        linkedHashMap.put("device_id", str2);
        String str3 = memoryConfig.app_version;
        C89219l.m154709a((Object) str3, "");
        linkedHashMap.put("app_version", str3);
        String str4 = memoryConfig.update_versioncode;
        C89219l.m154709a((Object) str4, "");
        linkedHashMap.put("update_version_code", str4);
        String str5 = memoryConfig.update_versioncode;
        C89219l.m154709a((Object) str5, "");
        linkedHashMap.put("current_update_version_code", str5);
        String str6 = memoryConfig.os_version;
        C89219l.m154709a((Object) str6, "");
        linkedHashMap.put("os_version", str6);
        linkedHashMap.put("os_api", String.valueOf(memoryConfig.os_api));
        String str7 = memoryConfig.device_model;
        C89219l.m154709a((Object) str7, "");
        linkedHashMap.put("device_model", str7);
        String str8 = memoryConfig.device_brand;
        C89219l.m154709a((Object) str8, "");
        linkedHashMap.put("device_brand", str8);
        String str9 = memoryConfig.device_manufacturer;
        C89219l.m154709a((Object) str9, "");
        linkedHashMap.put("device_manufacturer", str9);
        String str10 = memoryConfig.packageName;
        C89219l.m154709a((Object) str10, "");
        linkedHashMap.put("process_name", str10);
        String str11 = memoryConfig.versionName;
        C89219l.m154709a((Object) str11, "");
        linkedHashMap.put("version_name", str11);
        linkedHashMap.put("version_code", String.valueOf(memoryConfig.versioncode));
        String str12 = memoryConfig.region;
        C89219l.m154709a((Object) str12, "");
        linkedHashMap.put("region", str12);
        String str13 = memoryConfig.release_build;
        C89219l.m154709a((Object) str13, "");
        linkedHashMap.put("release_build", str13);
        return linkedHashMap;
    }

    /* renamed from: com.bytedance.liko.leakdetector.strategy.a.a$c */
    public static final class C20867c implements AbstractC20851a<String> {

        /* renamed from: a */
        final /* synthetic */ File f49334a;

        static {
            Covode.recordClassIndex(24446);
        }

        C20867c(File file) {
            this.f49334a = file;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.liko.leakdetector.AbstractC20851a
        /* renamed from: a */
        public final /* synthetic */ void mo34283a(String str) {
            C89219l.m154719c("onResponse:".concat(String.valueOf(str)), "");
            if (this.f49334a.exists()) {
                m39228a(this.f49334a);
            }
        }

        @Override // com.bytedance.liko.leakdetector.AbstractC20851a
        /* renamed from: a */
        public final void mo34284a(Throwable th) {
            if (th != null) {
                th.printStackTrace();
            }
            C89219l.m154719c("onFailure:".concat(String.valueOf(th)), "");
        }

        /* renamed from: a */
        private static boolean m39228a(File file) {
            MethodCollector.m26663i(12818);
            try {
                C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
                if (C40353e.m81548b(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
                }
                if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                    MethodCollector.m26664o(12818);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.m26664o(12818);
            return delete;
        }
    }

    /* renamed from: a */
    private static NetworkInfo m39219a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return C61338a.m111034a();
        }
    }

    /* renamed from: a */
    private static boolean m39222a(Context context) {
        if (context != null) {
            try {
                Object b = m39224b(context, "connectivity");
                if (b != null) {
                    NetworkInfo a = m39219a((ConnectivityManager) b);
                    if (a != null) {
                        if (a.isAvailable()) {
                            if (1 == a.getType()) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
            } catch (Exception unused) {
                return false;
            }
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    /* renamed from: b */
    private static void m39225b(File file) {
        C89219l.m154719c(file, "");
        C89219l.m154719c("shouldUpload:" + C20871d.m39232a().mo34298a(), "");
        if (C20871d.m39232a().mo34298a()) {
            m39226c(file);
        }
    }

    /* renamed from: a */
    private static boolean m39223a(File file) {
        MethodCollector.m26663i(13813);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81548b(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(13813);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(13813);
        return delete;
    }

    /* renamed from: c */
    private static void m39226c(File file) {
        C90200t f = C90200t.m156802f("https://api-va.tiktokv.com/monitor/collect/c/mom_dump_collect/");
        if (file.exists() && file.length() != 0 && f != null) {
            C20868a aVar = new C20868a("memory_object_monitor", System.currentTimeMillis());
            C20869b a = C20870c.m39231a(m39220a());
            ArrayList arrayList = new ArrayList();
            String name = file.getName();
            C90204w wVar = C90205x.f204885e;
            C89219l.m154709a((Object) wVar, "");
            C90205x.C90207b a2 = C90205x.C90207b.m156854a("file", name, m39221a(wVar, file));
            C89219l.m154709a((Object) a2, "");
            arrayList.add(a2);
            C90205x.C90207b a3 = C90205x.C90207b.m156853a("header", new C27910f().mo46674b(a));
            C89219l.m154709a((Object) a3, "");
            arrayList.add(a3);
            C90205x.C90207b a4 = C90205x.C90207b.m156853a("data", new C27910f().mo46674b(aVar));
            C89219l.m154709a((Object) a4, "");
            arrayList.add(a4);
            AbstractC20856b.C20857a.m39211a().mo34285a("https://api-va.tiktokv.com/monitor/collect/c/mom_dump_collect/", arrayList, new C20867c(file));
        }
    }

    /* renamed from: a */
    private static AbstractC90025ab m39221a(C90204w wVar, File file) {
        return new C20866b(wVar, file);
    }

    /* renamed from: b */
    private static Object m39224b(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(13816);
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
                    MethodCollector.m26664o(13816);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public final void mo34291a(Context context, String str) {
        MethodCollector.m26663i(13761);
        C89219l.m154719c(str, "");
        if (!m39222a(context)) {
            MethodCollector.m26664o(13761);
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(13761);
        } else {
            try {
                File file = new File(str);
                if (!file.exists() || !Tailor.isHprofValid(str)) {
                    MethodCollector.m26664o(13761);
                    return;
                }
                String parent = file.getParent();
                String str2 = parent + "/.mini.hprof";
                Tailor.tailorHprof(str, str2);
                File file2 = new File(str2);
                if (file2.exists()) {
                    m39223a(new File(str));
                }
                ArrayList arrayList = new ArrayList(4);
                if (file2.exists()) {
                    arrayList.add(str2);
                } else {
                    arrayList.add(str);
                }
                if (new File(parent + "/.maps").exists()) {
                    arrayList.add(parent + "/.maps");
                    arrayList.add(parent + "/.fds");
                    arrayList.add(parent + "/.threads");
                    arrayList.add(parent + "/.stacks");
                }
                C20855d.m39208a(parent, "dump.xzip", arrayList);
                if (file.exists()) {
                    m39223a(file);
                }
                if (file2.exists()) {
                    m39223a(file2);
                }
                if (TextUtils.isEmpty(parent)) {
                    MethodCollector.m26664o(13761);
                    return;
                }
                File file3 = new File(parent + "/dump.xzip");
                if (!file3.exists()) {
                    MethodCollector.m26664o(13761);
                    return;
                }
                m39225b(file3);
                MethodCollector.m26664o(13761);
            } catch (Exception e) {
                e.printStackTrace();
                MethodCollector.m26664o(13761);
            }
        }
    }
}
