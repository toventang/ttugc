package com.p2082ss.android.push.window.oppo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.push.window.oppo.ScreenReceiver */
public class ScreenReceiver extends BroadcastReceiver {
    static {
        Covode.recordClassIndex(36701);
    }

    public void onReceive(Context context, Intent intent) {
        try {
            String action = intent.getAction();
            Logger.debug();
            if ("android.intent.action.USER_PRESENT".equals(action) && C30198c.m61083a(context).mo53627b() && C30198c.m61083a(context).f72028k) {
                C30198c.m61083a(context).mo53628c();
            }
        } catch (Exception e) {
            if (Logger.debug()) {
                e.printStackTrace();
            }
        }
    }
}
