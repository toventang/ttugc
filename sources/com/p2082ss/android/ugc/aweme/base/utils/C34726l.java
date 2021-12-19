package com.p2082ss.android.ugc.aweme.base.utils;

import android.content.Context;
import com.bytedance.common.utility.p909d.C13609b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.utils.C80276bw;
import java.io.File;
import java.io.ObjectInputStream;

/* renamed from: com.ss.android.ugc.aweme.base.utils.l */
public final class C34726l {

    /* renamed from: a */
    public static C80276bw f82015a;

    static {
        Covode.recordClassIndex(41718);
    }

    /* renamed from: a */
    public static File m70941a(Context context) {
        if (C58016d.f132220a != null && C58016d.f132224e) {
            return C58016d.f132220a;
        }
        File externalCacheDir = context.getExternalCacheDir();
        C58016d.f132220a = externalCacheDir;
        return externalCacheDir;
    }

    /* renamed from: a */
    public static Runnable m70942a(String str) {
        Throwable th;
        ObjectInputStream objectInputStream;
        Exception e;
        MethodCollector.m26663i(11849);
        C80276bw bwVar = f82015a;
        Runnable runnable = null;
        ObjectInputStream objectInputStream2 = null;
        if (bwVar == null) {
            MethodCollector.m26664o(11849);
            return null;
        }
        try {
            objectInputStream = new ObjectInputStream(bwVar.mo123669a(str).f179799a[0]);
            try {
                Runnable runnable2 = (Runnable) objectInputStream.readObject();
                C13609b.m24451a(objectInputStream);
                runnable = runnable2;
            } catch (Exception e2) {
                e = e2;
                try {
                    e.printStackTrace();
                    C13609b.m24451a(objectInputStream);
                    MethodCollector.m26664o(11849);
                    return runnable;
                } catch (Throwable th2) {
                    th = th2;
                    objectInputStream2 = objectInputStream;
                    C13609b.m24451a(objectInputStream2);
                    MethodCollector.m26664o(11849);
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            objectInputStream = null;
            e.printStackTrace();
            C13609b.m24451a(objectInputStream);
            MethodCollector.m26664o(11849);
            return runnable;
        } catch (Throwable th3) {
            th = th3;
            C13609b.m24451a(objectInputStream2);
            MethodCollector.m26664o(11849);
            throw th;
        }
        MethodCollector.m26664o(11849);
        return runnable;
    }
}
