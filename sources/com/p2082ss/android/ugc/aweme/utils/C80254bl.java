package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.p2082ss.android.ugc.aweme.p4171u.C79488a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.utils.bl */
public final class C80254bl implements AttachUserData {
    static {
        Covode.recordClassIndex(93522);
    }

    @Override // com.bytedance.crash.AttachUserData
    public final Map<? extends String, ? extends String> getUserData(CrashType crashType) {
        HashMap hashMap = new HashMap();
        hashMap.put("abtest/settings", C79488a.m138200a());
        return hashMap;
    }
}
