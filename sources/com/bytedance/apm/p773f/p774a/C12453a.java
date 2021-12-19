package com.bytedance.apm.p773f.p774a;

import com.bytedance.apm.C12397c;
import com.bytedance.apm.internal.C12508a;
import com.bytedance.apm.p767c.p768a.C12401a;
import com.bytedance.apm.p767c.p769b.C12410d;
import com.bytedance.apm.p773f.C12451a;
import com.bytedance.apm.p788p.C12560b;
import com.bytedance.apm.p789q.C12598r;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.collector.BinderMonitor;
import com.bytedance.monitor.collector.C21501k;
import com.bytedance.p802b.p831i.p832a.C13099c;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.f.a.a */
public final class C12453a {
    static {
        Covode.recordClassIndex(14263);
    }

    /* renamed from: a */
    public static long m22419a() {
        List<BinderMonitor.C21460a> d;
        long j = 0;
        if (C12451a.C12452a.f30248a.mo20284b().f30664c && C12508a.m22479b(2) && C21501k.m40384a().f51030h != null && (d = BinderMonitor.m40315d()) != null && !d.isEmpty()) {
            for (BinderMonitor.C21460a aVar : d) {
                final long j2 = aVar.f50873b - aVar.f50872a;
                j += j2;
                final StackTraceElement[] stackTraceElementArr = aVar.f50875d;
                if (!(stackTraceElementArr == null || stackTraceElementArr.length == 0)) {
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= stackTraceElementArr.length) {
                            break;
                        } else if ("saveBinderInfo".equals(stackTraceElementArr[i2].getMethodName())) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    int i3 = i + 1;
                    if (i3 <= stackTraceElementArr.length) {
                        stackTraceElementArr = (StackTraceElement[]) Arrays.copyOfRange(stackTraceElementArr, i3, stackTraceElementArr.length);
                    }
                }
                C12560b.C12564a.f30567a.mo20387a(new Runnable() {
                    /* class com.bytedance.apm.p773f.p774a.C12453a.RunnableC124541 */

                    static {
                        Covode.recordClassIndex(14264);
                    }

                    public final void run() {
                        try {
                            String a = C12598r.m22722a(stackTraceElementArr);
                            if (j2 == 0) {
                                return;
                            }
                            if (!a.isEmpty()) {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("timestamp", System.currentTimeMillis());
                                jSONObject.put("crash_time", System.currentTimeMillis());
                                jSONObject.put("is_main_process", C12397c.m22285b());
                                jSONObject.put("process_name", C12397c.m22278a());
                                jSONObject.put("block_duration", j2);
                                StringBuilder sb = new StringBuilder("BinderInfo:\n");
                                sb.append("-Binder Time ").append(j2).append("ms\n-Binder Stack\n").append(a).append("\n");
                                jSONObject.put("stack", sb.toString());
                                jSONObject.put("event_type", "lag");
                                JSONObject c = C13099c.m23558a().mo20939c();
                                c.put("block_stack_type", "stack");
                                c.put("is_launch_binder", "true");
                                jSONObject.put("filters", c);
                                C12401a.m22303b().mo20179a(new C12410d("block_monitor", jSONObject));
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        }
        return j;
    }
}
