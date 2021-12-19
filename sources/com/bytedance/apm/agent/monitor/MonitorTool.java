package com.bytedance.apm.agent.monitor;

import com.bytedance.apm.p767c.p768a.C12401a;
import com.bytedance.apm.p767c.p768a.C12404d;
import com.bytedance.apm.p767c.p769b.C12407a;
import com.bytedance.apm.p767c.p769b.C12412f;
import com.bytedance.apm.p767c.p769b.C12413g;
import com.bytedance.apm.p788p.C12560b;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public class MonitorTool {
    static {
        Covode.recordClassIndex(14066);
    }

    public static void monitorUIAction(final String str, final String str2, final JSONObject jSONObject) {
        C12560b.C12564a.f30567a.mo20387a(new Runnable() {
            /* class com.bytedance.apm.agent.monitor.MonitorTool.RunnableC122771 */

            static {
                Covode.recordClassIndex(14067);
            }

            public final void run() {
                C12401a.m22303b().mo20179a(new C12413g(str, str2, jSONObject));
            }
        });
    }

    public static void reportTraceTime(final String str, final String str2, final long j) {
        C12560b.C12564a.f30567a.mo20387a(new Runnable() {
            /* class com.bytedance.apm.agent.monitor.MonitorTool.RunnableC122815 */

            static {
                Covode.recordClassIndex(14071);
            }

            public final void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(str2, j);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("scene", str);
                    C12401a.m22303b().mo20179a(new C12412f("page_load", "page_load", jSONObject, jSONObject2, null, (byte) 0));
                } catch (Exception unused) {
                }
            }
        });
    }

    public static void monitorStart(String str, long j, long j2) {
        if (j2 > j) {
            try {
                final JSONObject jSONObject = new JSONObject();
                jSONObject.put(str, j2 - j);
                final JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("begin_time", j);
                jSONObject2.put("end_time", j2);
                C12560b.C12564a.f30567a.mo20387a(new Runnable() {
                    /* class com.bytedance.apm.agent.monitor.MonitorTool.RunnableC122804 */

                    static {
                        Covode.recordClassIndex(14070);
                    }

                    public final void run() {
                        C12401a.m22303b().mo20179a(new C12412f("start", "", jSONObject, null, jSONObject2, (byte) 0));
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void monitorStart(final JSONObject jSONObject, long j, long j2) {
        try {
            final JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("begin_time", j);
            jSONObject2.put("end_time", j2);
            jSONObject2.put("from", "monitor-plugin");
            C12560b.C12564a.f30567a.mo20387a(new Runnable() {
                /* class com.bytedance.apm.agent.monitor.MonitorTool.RunnableC122793 */

                static {
                    Covode.recordClassIndex(14069);
                }

                public final void run() {
                    C12401a.m22303b().mo20179a(new C12412f("start", "", jSONObject, null, jSONObject2, (byte) 0));
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void monitorPerformance(final String str, final JSONObject jSONObject, final JSONObject jSONObject2, final JSONObject jSONObject3) {
        C12560b.C12564a.f30567a.mo20387a(new Runnable() {
            /* class com.bytedance.apm.agent.monitor.MonitorTool.RunnableC122782 */

            static {
                Covode.recordClassIndex(14068);
            }

            public final void run() {
                C12401a.m22303b().mo20179a(new C12412f(str, "", jSONObject, jSONObject2, jSONObject3, (byte) 0));
            }
        });
    }

    public static void monitorSLA(final long j, final long j2, final String str, final String str2, final String str3, final int i, final JSONObject jSONObject) {
        C12560b.C12564a.f30567a.mo20387a(new Runnable() {
            /* class com.bytedance.apm.agent.monitor.MonitorTool.RunnableC122826 */

            static {
                Covode.recordClassIndex(14072);
            }

            public final void run() {
                C12404d.C12405a.f29983a.mo20179a(new C12407a("api_all", j, j2, str, str2, str3, i, jSONObject));
            }
        });
    }
}
