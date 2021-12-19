package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;

public final class CurrentAccessTokenExpirationBroadcastReceiver extends BroadcastReceiver {
    static {
        Covode.recordClassIndex(27960);
    }

    public final void onReceive(Context context, Intent intent) {
        if ("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED".equals(intent.getAction()) && C24872m.m47685a()) {
            C24012b a = C24012b.m45437a();
            a.mo39533a(a.f56861b, a.f56861b);
        }
    }
}
