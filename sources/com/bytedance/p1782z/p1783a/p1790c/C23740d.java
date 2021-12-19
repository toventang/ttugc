package com.bytedance.p1782z.p1783a.p1790c;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1782z.p1783a.p1785b.p1788c.C23735e;
import com.bytedance.p1782z.p1783a.p1791d.C23751b;
import java.io.BufferedReader;
import java.io.File;

/* renamed from: com.bytedance.z.a.c.d */
public final class C23740d extends C23739c {
    static {
        Covode.recordClassIndex(27845);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1782z.p1783a.p1790c.C23739c, com.bytedance.p1782z.p1783a.p1790c.AbstractC23737a
    /* renamed from: a */
    public final AbstractC23738b mo39193a(File file) {
        return m44884a(file, new C23735e());
    }

    public C23740d(long j) {
        super("proc/self/task/" + j + "/stat");
    }

    /* renamed from: a */
    private static AbstractC23738b m44884a(File file, C23735e eVar) {
        MethodCollector.m26663i(926);
        BufferedReader a = C23751b.m44896a(file);
        if (a == null) {
            MethodCollector.m26664o(926);
            return null;
        }
        try {
            String readLine = a.readLine();
            if (readLine != null) {
                if (!readLine.isEmpty()) {
                    String[] split = readLine.split("\\s+");
                    if (split.length > 16) {
                        eVar.f56182b = Integer.parseInt(split[0]);
                        eVar.f56181a = split[1].substring(1, split[1].length() - 1);
                        eVar.f56183c = (long) ((Integer.parseInt(split[13]) + Integer.parseInt(split[14])) * 10);
                    }
                }
            }
        } catch (Exception e) {
            Log.getStackTraceString(e);
        } catch (Throwable unused) {
        }
        C23751b.m44897a(a);
        MethodCollector.m26664o(926);
        return eVar;
    }
}
