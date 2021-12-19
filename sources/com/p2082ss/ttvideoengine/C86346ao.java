package com.p2082ss.ttvideoengine;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ttvideoengine.p4418k.AbstractC86561j;
import java.util.HashMap;

/* renamed from: com.ss.ttvideoengine.ao */
public final class C86346ao {

    /* renamed from: a */
    public static boolean f193424a;

    /* renamed from: b */
    public static AbstractC86561j f193425b;

    /* renamed from: c */
    private static AbstractC86506i f193426c;

    /* renamed from: d */
    private static HashMap<Integer, ClassLoader> f193427d;

    static {
        Covode.recordClassIndex(101574);
    }

    /* renamed from: a */
    public static ClassLoader m148881a(int i) {
        ClassLoader classLoader;
        HashMap<Integer, ClassLoader> hashMap = f193427d;
        if (hashMap != null && (classLoader = hashMap.get(Integer.valueOf(i))) != null) {
            return classLoader;
        }
        AbstractC86506i iVar = f193426c;
        if (iVar != null) {
            return iVar.mo137720a();
        }
        return null;
    }
}
