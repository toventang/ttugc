package com.ttnet.org.chromium.base.p4497a;

import android.content.pm.PackageInfo;
import android.net.LinkProperties;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ttnet.org.chromium.base.a.b */
public final class C87443b {
    static {
        Covode.recordClassIndex(103372);
    }

    /* renamed from: a */
    public static long m151774a(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    /* renamed from: b */
    public static String m151776b(LinkProperties linkProperties) {
        return linkProperties.getPrivateDnsServerName();
    }

    /* renamed from: a */
    public static boolean m151775a(LinkProperties linkProperties) {
        return linkProperties.isPrivateDnsActive();
    }
}
