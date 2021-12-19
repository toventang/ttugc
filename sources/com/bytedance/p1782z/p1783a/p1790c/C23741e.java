package com.bytedance.p1782z.p1783a.p1790c;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1782z.p1783a.p1785b.p1788c.C23734d;
import com.bytedance.p1782z.p1783a.p1791d.C23751b;
import java.io.BufferedReader;
import java.io.File;
import java.util.LinkedHashMap;

/* renamed from: com.bytedance.z.a.c.e */
public final class C23741e extends AbstractC23737a {
    static {
        Covode.recordClassIndex(27846);
    }

    public C23741e() {
        this("/proc/self/time_in_state");
    }

    private C23741e(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1782z.p1783a.p1790c.AbstractC23737a
    /* renamed from: a */
    public final AbstractC23738b mo39193a(File file) {
        return m44886b(file);
    }

    public C23741e(int i) {
        super("/proc/self/task/" + i + "/time_in_state");
    }

    /* renamed from: b */
    private static AbstractC23738b m44886b(File file) {
        MethodCollector.m26663i(1016);
        BufferedReader a = C23751b.m44896a(file);
        LinkedHashMap<Long, Long> linkedHashMap = null;
        if (a == null) {
            MethodCollector.m26664o(1016);
            return null;
        }
        C23734d dVar = new C23734d();
        long j = 0;
        while (true) {
            try {
                String readLine = a.readLine();
                if (readLine != null) {
                    if (!readLine.isEmpty() && !readLine.contains("cpu")) {
                        String[] split = readLine.split("\\s+");
                        if (split.length <= 1) {
                            break;
                        }
                        long parseLong = Long.parseLong(split[0]);
                        long parseLong2 = Long.parseLong(split[1]) * 10;
                        if (j == 0 || parseLong >= j) {
                            if (linkedHashMap == null) {
                            }
                            linkedHashMap.put(Long.valueOf(parseLong), Long.valueOf(parseLong2));
                            j = parseLong;
                        } else {
                            dVar.mo39188a(linkedHashMap);
                        }
                        linkedHashMap = new LinkedHashMap<>();
                        linkedHashMap.put(Long.valueOf(parseLong), Long.valueOf(parseLong2));
                        j = parseLong;
                    }
                } else {
                    break;
                }
            } catch (Exception e) {
                Log.getStackTraceString(e);
            } catch (Throwable unused) {
            }
        }
        dVar.mo39188a(linkedHashMap);
        C23751b.m44897a(a);
        MethodCollector.m26664o(1016);
        return dVar;
    }
}
