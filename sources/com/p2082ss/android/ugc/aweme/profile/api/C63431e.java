package com.p2082ss.android.ugc.aweme.profile.api;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;

/* renamed from: com.ss.android.ugc.aweme.profile.api.e */
public final class C63431e {

    /* renamed from: a */
    private static C63431e f144029a;

    static {
        Covode.recordClassIndex(74736);
    }

    /* renamed from: a */
    public static C63431e m115024a() {
        if (f144029a == null) {
            f144029a = new C63431e();
        }
        return f144029a;
    }

    /* renamed from: a */
    public static void m115025a(Handler handler, String str) {
        m115028c(handler, C63429c.m115019a(null, str, null, 0, true));
    }

    /* renamed from: b */
    public static void m115027b(Handler handler, String str) {
        C63434h.m115029a(str);
        C34608n.m70658a().mo61083a(handler, new CallableC63433g(str), 0);
    }

    /* renamed from: c */
    private static void m115028c(Handler handler, String str) {
        C63434h.m115029a(str);
        C34608n.m70658a().mo61083a(handler, new CallableC63432f(str), 0);
    }

    /* renamed from: a */
    public static void m115026a(Handler handler, String str, String str2, String str3, int i, Boolean bool) {
        m115027b(handler, C63429c.m115019a(str2, str, str3, i, bool));
    }
}
