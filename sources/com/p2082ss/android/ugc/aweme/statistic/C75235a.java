package com.p2082ss.android.ugc.aweme.statistic;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.statistic.a */
public final class C75235a implements AttachUserData {

    /* renamed from: a */
    public static String f169147a = "";

    /* renamed from: b */
    public static int f169148b;

    static {
        Covode.recordClassIndex(88128);
    }

    public final String toString() {
        return f169148b + " bytes| thread name =" + f169147a;
    }

    @Override // com.bytedance.crash.AttachUserData
    public final Map<? extends String, ? extends String> getUserData(CrashType crashType) {
        HashMap hashMap = new HashMap();
        hashMap.put("fresco-bitmap-alloc", toString());
        return hashMap;
    }
}
