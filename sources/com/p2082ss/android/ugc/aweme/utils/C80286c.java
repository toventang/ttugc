package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.utils.c */
public final class C80286c {

    /* renamed from: a */
    public static boolean f179804a;

    /* renamed from: b */
    public static ArrayList<Object> f179805b = new ArrayList<>();

    /* renamed from: c */
    public static boolean f179806c = false;

    static {
        Covode.recordClassIndex(93554);
    }

    /* renamed from: a */
    public static void m139191a() {
        MethodCollector.m26663i(13351);
        f179806c = true;
        int size = f179805b.size();
        if (size > 0) {
            synchronized (f179805b) {
                int i = 0;
                while (true) {
                    try {
                        f179805b.get(i);
                        i++;
                        if (i < size) {
                        }
                    } finally {
                        MethodCollector.m26664o(13351);
                    }
                }
            }
            return;
        }
        MethodCollector.m26664o(13351);
    }
}
