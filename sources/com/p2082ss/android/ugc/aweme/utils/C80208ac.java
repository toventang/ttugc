package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.utils.ac */
public final class C80208ac implements AttachUserData {

    /* renamed from: a */
    public static String f179675a = "";

    static {
        Covode.recordClassIndex(93476);
    }

    @Override // com.bytedance.crash.AttachUserData
    public final Map<? extends String, ? extends String> getUserData(CrashType crashType) {
        HashMap hashMap = new HashMap();
        hashMap.put("BaseCanvasRecycleCrashDataImpl", f179675a);
        return hashMap;
    }
}
