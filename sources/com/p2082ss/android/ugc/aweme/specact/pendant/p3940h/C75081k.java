package com.p2082ss.android.ugc.aweme.specact.pendant.p3940h;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75077j;
import java.util.Calendar;
import java.util.Date;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.pendant.h.k */
public final class C75081k {

    /* renamed from: a */
    public static final C75081k f168742a = new C75081k();

    private C75081k() {
    }

    static {
        Covode.recordClassIndex(87953);
    }

    /* renamed from: a */
    public static int m131844a() {
        if (C75077j.C75078a.m131843a().mo118185a()) {
            return (int) (System.currentTimeMillis() / 1000);
        }
        return NetworkUtils.getServerTime();
    }

    /* renamed from: b */
    public static long m131846b() {
        Calendar instance = Calendar.getInstance();
        Date date = new Date((((long) m131844a()) * 1000) + 0);
        C89219l.m154716b(instance, "");
        instance.setTime(date);
        instance.set(11, 0);
        instance.set(13, 0);
        instance.set(12, 0);
        instance.set(14, 0);
        return instance.getTimeInMillis() / 1000;
    }

    /* renamed from: a */
    public static boolean m131845a(long j) {
        if (m131846b() == j) {
            return true;
        }
        return false;
    }
}
