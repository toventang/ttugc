package com.facebook.internal.p1894a.p1895a;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.C24006ab;
import com.facebook.C24915r;
import com.facebook.GraphRequest;
import com.facebook.internal.C24693ad;
import com.facebook.internal.p1894a.C24673b;
import com.facebook.internal.p1894a.C24686d;
import java.io.File;
import java.io.FilenameFilter;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.facebook.internal.a.a.a */
public class C24670a implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private static final String f58597a = C24670a.class.getCanonicalName();

    /* renamed from: b */
    private static C24670a f58598b;

    /* renamed from: c */
    private final Thread.UncaughtExceptionHandler f58599c;

    static {
        Covode.recordClassIndex(28823);
    }

    /* renamed from: a */
    public static synchronized void m47199a() {
        File[] fileArr;
        synchronized (C24670a.class) {
            MethodCollector.m26663i(6887);
            if (C24006ab.m45407b() && !C24693ad.m47288g()) {
                File a = C24686d.m47215a();
                int i = 0;
                if (a == null || (fileArr = a.listFiles(new FilenameFilter() {
                    /* class com.facebook.internal.p1894a.C24686d.C246882 */

                    static {
                        Covode.recordClassIndex(28841);
                    }

                    public final boolean accept(File file, String str) {
                        return str.matches(C1764a.m5928a("^(%s|%s|%s)[0-9]+.json$", new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}));
                    }
                })) == null) {
                    fileArr = new File[0];
                }
                final ArrayList arrayList = new ArrayList();
                for (File file : fileArr) {
                    C24673b a2 = C24673b.C24675a.m47206a(file);
                    if (a2.mo40502a()) {
                        arrayList.add(a2);
                    }
                }
                Collections.sort(arrayList, new Comparator<C24673b>() {
                    /* class com.facebook.internal.p1894a.p1895a.C24670a.C246711 */

                    static {
                        Covode.recordClassIndex(28824);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    @Override // java.util.Comparator
                    public final /* synthetic */ int compare(C24673b bVar, C24673b bVar2) {
                        C24673b bVar3 = bVar;
                        C24673b bVar4 = bVar2;
                        if (bVar3.f58601a == null) {
                            return -1;
                        }
                        if (bVar4.f58601a == null) {
                            return 1;
                        }
                        return bVar4.f58601a.compareTo(bVar3.f58601a);
                    }
                });
                JSONArray jSONArray = new JSONArray();
                while (i < arrayList.size() && i < 5) {
                    jSONArray.put(arrayList.get(i));
                    i++;
                }
                C24686d.m47220a("crash_reports", jSONArray, new GraphRequest.AbstractC23858b() {
                    /* class com.facebook.internal.p1894a.p1895a.C24670a.C246722 */

                    static {
                        Covode.recordClassIndex(28825);
                    }

                    @Override // com.facebook.GraphRequest.AbstractC23858b
                    /* renamed from: a */
                    public final void mo39350a(C24915r rVar) {
                        try {
                            if (rVar.f59155d == null && rVar.f59153b.getBoolean("success")) {
                                for (int i = 0; arrayList.size() > i; i++) {
                                    ((C24673b) arrayList.get(i)).mo40504c();
                                }
                            }
                        } catch (JSONException unused) {
                        }
                    }
                });
            }
            if (f58598b != null) {
                MethodCollector.m26664o(6887);
                return;
            }
            C24670a aVar = new C24670a(Thread.getDefaultUncaughtExceptionHandler());
            f58598b = aVar;
            Thread.setDefaultUncaughtExceptionHandler(aVar);
            MethodCollector.m26664o(6887);
        }
    }

    private C24670a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f58599c = uncaughtExceptionHandler;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        r5 = r5.getCause();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        if (r5 == null) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void uncaughtException(java.lang.Thread r7, java.lang.Throwable r8) {
        /*
            r6 = this;
            r0 = 0
            if (r8 == 0) goto L_0x0027
            r0 = 0
            r5 = r8
        L_0x0005:
            java.lang.StackTraceElement[] r4 = r5.getStackTrace()
            int r3 = r4.length
            r2 = 0
        L_0x000b:
            if (r2 >= r3) goto L_0x0032
            r0 = r4[r2]
            java.lang.String r1 = r0.getClassName()
            java.lang.String r0 = "com.facebook"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x002f
            com.facebook.internal.p1894a.C24668a.m47197a(r8)
            com.facebook.internal.a.b$b r0 = com.facebook.internal.p1894a.C24673b.EnumC24676b.CrashReport
            com.facebook.internal.a.b r0 = com.facebook.internal.p1894a.C24673b.C24675a.m47207a(r8, r0)
            r0.mo40503b()
        L_0x0027:
            java.lang.Thread$UncaughtExceptionHandler r0 = r6.f58599c
            if (r0 == 0) goto L_0x002e
            r0.uncaughtException(r7, r8)
        L_0x002e:
            return
        L_0x002f:
            int r2 = r2 + 1
            goto L_0x000b
        L_0x0032:
            java.lang.Throwable r1 = r5.getCause()
            r0 = r5
            r5 = r1
            if (r5 == 0) goto L_0x0027
            if (r5 == r0) goto L_0x0027
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.p1894a.p1895a.C24670a.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
