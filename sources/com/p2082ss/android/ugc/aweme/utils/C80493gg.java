package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.utils.gg */
public final class C80493gg implements AttachUserData {

    /* renamed from: a */
    public static String f180088a = "";

    /* renamed from: b */
    public static String f180089b = "";

    static {
        Covode.recordClassIndex(93766);
    }

    @Override // com.bytedance.crash.AttachUserData
    public final Map<? extends String, ? extends String> getUserData(CrashType crashType) {
        HashMap hashMap = new HashMap();
        hashMap.put("RecylerViewHolder", f180088a + ":" + f180089b);
        return hashMap;
    }
}
