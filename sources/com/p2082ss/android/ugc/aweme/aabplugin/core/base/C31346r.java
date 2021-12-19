package com.p2082ss.android.ugc.aweme.aabplugin.core.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;

/* renamed from: com.ss.android.ugc.aweme.aabplugin.core.base.r */
public final class C31346r extends BroadcastReceiver {
    static {
        Covode.recordClassIndex(38046);
    }

    /* renamed from: a */
    private static boolean m65559a() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m65559a();
            }
            if (C58029j.f132256h) {
                C31310a.m65494a().mo57318b();
                if (NetworkUtils.isWifi(context)) {
                    C31310a.m65494a().f75031f.sendEmptyMessage(1024);
                }
            }
        }
    }
}
