package com.fcm.p1909a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.C21798f;
import com.fcm.FcmPushAdapter;

/* renamed from: com.fcm.a.a */
public final class C25036a {
    static {
        Covode.recordClassIndex(30397);
    }

    /* renamed from: a */
    public static void m48006a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            C21798f.m40814b().mo35458a(context, FcmPushAdapter.getFcmPush(), str);
        } else {
            C21798f.m40816d().mo35422a(FcmPushAdapter.getFcmPush(), 102, "0", "token is empty");
        }
    }
}
