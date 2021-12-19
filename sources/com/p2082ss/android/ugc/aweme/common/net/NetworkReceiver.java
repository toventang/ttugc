package com.p2082ss.android.ugc.aweme.common.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.p3008c.C51426a;
import com.p2082ss.android.ugc.aweme.utils.C80422fe;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;

/* renamed from: com.ss.android.ugc.aweme.common.net.NetworkReceiver */
public class NetworkReceiver extends BroadcastReceiver {
    static {
        Covode.recordClassIndex(46768);
    }

    public void onReceive(Context context, Intent intent) {
        C80422fe.EnumC80423a b = C80422fe.m139426b(context);
        C51426a.f118502b = b;
        if (C51426a.f118501a != null) {
            C51426a.f118501a = b;
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            return;
        }
        if (!C80422fe.m139425a(context)) {
            AbstractC81915c.m141874a(new C39151f(0));
        } else if (C80422fe.m139427c(context)) {
            AbstractC81915c.m141874a(new C39151f(2));
        } else if (C80422fe.m139428d(context)) {
            AbstractC81915c.m141874a(new C39151f(1));
        }
    }
}
