package com.p2082ss.android.ugc.aweme.donation;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.donation.d */
public final class C43114d {

    /* renamed from: a */
    public static final C43114d f100464a = new C43114d();

    private C43114d() {
    }

    static {
        Covode.recordClassIndex(51285);
    }

    /* renamed from: a */
    public static C43113c m86018a() {
        try {
            C43113c cVar = (C43113c) SettingsManager.m29616a().mo25396a("donation_urls", C43113c.class);
            if (cVar == null) {
                return new C43113c();
            }
            return cVar;
        } catch (Throwable unused) {
            return new C43113c();
        }
    }
}
