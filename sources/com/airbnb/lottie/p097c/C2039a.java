package com.airbnb.lottie.p097c;

import android.graphics.Bitmap;
import com.airbnb.lottie.C2122g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.airbnb.lottie.c.a */
public final class C2039a {

    /* renamed from: a */
    public static final ConcurrentHashMap<Integer, ArrayList<Bitmap>> f6116a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public static final C2039a f6117b = new C2039a();

    private C2039a() {
    }

    static {
        Covode.recordClassIndex(2234);
    }

    /* renamed from: a */
    public static void m6458a(C2122g gVar) {
        C89219l.m154719c(gVar, "");
        int hashCode = gVar.hashCode();
        ConcurrentHashMap<Integer, ArrayList<Bitmap>> concurrentHashMap = f6116a;
        if (concurrentHashMap.get(Integer.valueOf(hashCode)) != null) {
            concurrentHashMap.remove(Integer.valueOf(hashCode));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005b, code lost:
        if (r2.getHeight() != r6) goto L_0x005d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m6457a(com.airbnb.lottie.C2122g r10, android.graphics.Bitmap.Config r11, android.util.DisplayMetrics r12) {
        /*
        // Method dump skipped, instructions count: 191
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p097c.C2039a.m6457a(com.airbnb.lottie.g, android.graphics.Bitmap$Config, android.util.DisplayMetrics):android.graphics.Bitmap");
    }
}
