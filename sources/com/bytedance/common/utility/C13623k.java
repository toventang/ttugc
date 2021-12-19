package com.bytedance.common.utility;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.common.utility.C13624l;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;

/* renamed from: com.bytedance.common.utility.k */
public final class C13623k extends BroadcastReceiver {
    static {
        Covode.recordClassIndex(15650);
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) || "android.net.wifi.WIFI_STATE_CHANGED".equals(intent.getAction()) || "android.net.wifi.STATE_CHANGE".equals(intent.getAction())) {
            if (C58029j.f132251c == C13624l.EnumC13625a.UNKNOWN || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132251c = C13624l.m24488d(context);
            }
            C13624l.f33104b = C58029j.f132251c;
        }
    }
}
