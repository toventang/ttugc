package com.p2082ss.android.newmedia.redbadge.p2171c;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.ss.android.newmedia.redbadge.c.a */
public final class C30186a {
    static {
        Covode.recordClassIndex(36688);
    }

    /* renamed from: a */
    public static boolean m61058a(Context context, Intent intent) {
        PackageManager packageManager;
        List<ResolveInfo> queryBroadcastReceivers;
        if (context == null || (packageManager = context.getPackageManager()) == null || (queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0)) == null || queryBroadcastReceivers.size() <= 0) {
            return false;
        }
        return true;
    }
}
