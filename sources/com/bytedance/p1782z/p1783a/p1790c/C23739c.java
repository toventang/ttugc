package com.bytedance.p1782z.p1783a.p1790c;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1782z.p1783a.p1785b.p1788c.C23733c;
import com.bytedance.p1782z.p1783a.p1791d.C23751b;
import java.io.BufferedReader;
import java.io.File;

/* renamed from: com.bytedance.z.a.c.c */
public class C23739c extends AbstractC23737a {
    static {
        Covode.recordClassIndex(27844);
    }

    public C23739c() {
        this("proc/self/stat");
    }

    public C23739c(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1782z.p1783a.p1790c.AbstractC23737a
    /* renamed from: a */
    public AbstractC23738b mo39193a(File file) {
        return m44882a(file, null);
    }

    /* renamed from: a */
    private static AbstractC23738b m44882a(File file, C23733c cVar) {
        Exception e;
        MethodCollector.m26663i(2861);
        BufferedReader a = C23751b.m44896a(file);
        C23733c cVar2 = null;
        if (a == null) {
            MethodCollector.m26664o(2861);
            return null;
        }
        try {
            String readLine = a.readLine();
            if (readLine != null) {
                if (!readLine.isEmpty()) {
                    String[] split = readLine.split("\\s+");
                    if (split.length > 16) {
                        cVar2 = new C23733c();
                        try {
                            cVar2.f56182b = Integer.parseInt(split[0]);
                            cVar2.f56181a = split[1].substring(1, split[1].length() - 1);
                            cVar2.f56183c = (long) ((Integer.parseInt(split[13]) + Integer.parseInt(split[14]) + Integer.parseInt(split[15]) + Integer.parseInt(split[16])) * 10);
                        } catch (Exception e2) {
                            e = e2;
                            try {
                                Log.getStackTraceString(e);
                                C23751b.m44897a(a);
                                MethodCollector.m26664o(2861);
                                return cVar2;
                            } catch (Throwable unused) {
                                cVar = cVar2;
                                C23751b.m44897a(a);
                                MethodCollector.m26664o(2861);
                                return cVar;
                            }
                        }
                    }
                }
            }
        } catch (Exception e3) {
            e = e3;
            cVar2 = cVar;
            Log.getStackTraceString(e);
            C23751b.m44897a(a);
            MethodCollector.m26664o(2861);
            return cVar2;
        } catch (Throwable unused2) {
            C23751b.m44897a(a);
            MethodCollector.m26664o(2861);
            return cVar;
        }
        C23751b.m44897a(a);
        MethodCollector.m26664o(2861);
        return cVar2;
    }
}
