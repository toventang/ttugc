package com.facebook.common.p1839k;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.C24091i;
import java.io.InputStream;

/* renamed from: com.facebook.common.k.e */
public final class C24131e {
    static {
        Covode.recordClassIndex(28259);
    }

    /* renamed from: a */
    public static long m45733a(InputStream inputStream, long j) {
        boolean z;
        MethodCollector.m26663i(9420);
        C24091i.m45617a(inputStream);
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45620a(z);
        long j2 = j;
        while (j2 > 0) {
            long skip = inputStream.skip(j2);
            if (skip <= 0) {
                if (inputStream.read() != -1) {
                    skip = 1;
                } else {
                    long j3 = j - j2;
                    MethodCollector.m26664o(9420);
                    return j3;
                }
            }
            j2 -= skip;
        }
        MethodCollector.m26664o(9420);
        return j;
    }
}
