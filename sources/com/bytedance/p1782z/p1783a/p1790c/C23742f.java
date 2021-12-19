package com.bytedance.p1782z.p1783a.p1790c;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1782z.p1783a.p1785b.p1788c.C23732b;
import com.bytedance.p1782z.p1783a.p1791d.C23743a;
import com.bytedance.p1782z.p1783a.p1791d.C23751b;
import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.bytedance.z.a.c.f */
public final class C23742f extends AbstractC23737a {

    /* renamed from: b */
    private int f56198b = C23743a.m44891a();

    /* renamed from: c */
    private List<File> f56199c = new ArrayList();

    static {
        Covode.recordClassIndex(27847);
    }

    public C23742f() {
        super("");
    }

    @Override // com.bytedance.p1782z.p1783a.p1790c.AbstractC23737a
    /* renamed from: a */
    public final AbstractC23738b mo39192a() {
        if (this.f56199c.isEmpty()) {
            for (int i = 0; i != this.f56198b; i++) {
                this.f56199c.add(new File("/sys/devices/system/cpu/cpu" + i + "/cpufreq/stats/time_in_state"));
            }
        }
        this.f56195a = m44888a(this.f56199c);
        return this.f56195a;
    }

    /* renamed from: a */
    private static AbstractC23738b m44888a(List<File> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        C23732b bVar = new C23732b();
        for (File file : list) {
            LinkedHashMap<Long, Long> b = m44889b(file);
            if (b != null) {
                bVar.f56177a.add(b);
            }
        }
        return bVar;
    }

    /* renamed from: b */
    private static LinkedHashMap<Long, Long> m44889b(File file) {
        MethodCollector.m26663i(1134);
        BufferedReader a = C23751b.m44896a(file);
        LinkedHashMap<Long, Long> linkedHashMap = null;
        if (a == null) {
            MethodCollector.m26664o(1134);
            return null;
        }
        while (true) {
            try {
                String readLine = a.readLine();
                if (readLine == null || readLine.isEmpty()) {
                    break;
                }
                String[] split = readLine.split("\\s+");
                if (split.length <= 1) {
                    break;
                }
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap<>();
                }
                linkedHashMap.put(Long.valueOf(Long.parseLong(split[0])), Long.valueOf(Long.parseLong(split[1]) * 10));
            } catch (Exception e) {
                Log.getStackTraceString(e);
            } catch (Throwable unused) {
            }
        }
        C23751b.m44897a(a);
        MethodCollector.m26664o(1134);
        return linkedHashMap;
    }
}
