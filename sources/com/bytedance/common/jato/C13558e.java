package com.bytedance.common.jato;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.framwork.core.sdkmonitor.C14827k;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import org.json.JSONObject;

/* renamed from: com.bytedance.common.jato.e */
public final class C13558e {

    /* renamed from: a */
    public static boolean f32990a;

    /* renamed from: b */
    static ExecutorService f32991b;

    static {
        Covode.recordClassIndex(15572);
        ThreadFactoryC135591 r2 = new ThreadFactory() {
            /* class com.bytedance.common.jato.C13558e.ThreadFactoryC135591 */

            static {
                Covode.recordClassIndex(15573);
            }

            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setName("jato_monitor");
                return thread;
            }
        };
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        a.f95509g = r2;
        f32991b = C40780g.m82242a(a.mo70028a());
    }

    /* renamed from: a */
    public static synchronized C14827k m24360a() {
        C14827k a;
        synchronized (C13558e.class) {
            MethodCollector.m26663i(12899);
            a = SDKMonitorUtils.m27201a("2021");
            MethodCollector.m26664o(12899);
        }
        return a;
    }

    /* renamed from: b */
    public static synchronized ExecutorService m24362b() {
        ExecutorService executorService;
        synchronized (C13558e.class) {
            MethodCollector.m26663i(12990);
            executorService = f32991b;
            MethodCollector.m26664o(12990);
        }
        return executorService;
    }

    /* renamed from: a */
    public static synchronized void m24361a(final Context context, final C13523a aVar) {
        synchronized (C13558e.class) {
            MethodCollector.m26663i(12898);
            f32991b.execute(new Runnable() {
                /* class com.bytedance.common.jato.C13558e.RunnableC135602 */

                static {
                    Covode.recordClassIndex(15574);
                }

                public final void run() {
                    if (!C13558e.f32990a && context != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("host_aid", aVar.f32900a);
                            jSONObject.put("update_version_code", aVar.f32901b);
                            jSONObject.put("app_version", aVar.f32902c);
                            jSONObject.put("package_name", aVar.f32903d);
                            jSONObject.put("device_id", aVar.f32904e);
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(aVar.f32906g);
                            SDKMonitorUtils.m27204a("2021", arrayList);
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(aVar.f32905f);
                            SDKMonitorUtils.m27205b("2021", arrayList2);
                            Context context = context;
                            if (!(context instanceof Application)) {
                                context = context.getApplicationContext();
                                if (C58003a.f132201c) {
                                    if (context == null) {
                                        context = C58003a.f132199a;
                                    }
                                }
                            }
                            SDKMonitorUtils.m27203a(context, "2021", jSONObject, new C14827k.AbstractC14835a() {
                                /* class com.bytedance.common.jato.C13558e.RunnableC135602.C135611 */

                                static {
                                    Covode.recordClassIndex(15575);
                                }

                                @Override // com.bytedance.framwork.core.sdkmonitor.C14827k.AbstractC14835a
                                /* renamed from: a */
                                public final Map<String, String> mo21830a() {
                                    return null;
                                }
                            });
                        } catch (Throwable th) {
                            th.getLocalizedMessage();
                        } finally {
                            C13558e.f32990a = true;
                        }
                    }
                }
            });
            MethodCollector.m26664o(12898);
        }
    }
}
