package com.p2082ss.android.ugc.aweme.compliance.protection.antiaddiction.p2672b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.compliance.protection.antiaddiction.AbstractC40044a;
import com.p2082ss.android.ugc.aweme.compliance.protection.antiaddiction.C40046b;
import com.p2082ss.android.ugc.aweme.compliance.protection.antiaddiction.p2671a.C40045a;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.antiaddiction.b.b */
public final class C40051b extends AbstractC40044a {

    /* renamed from: a */
    public final C40045a f94087a = new C40045a();

    /* renamed from: b */
    private final int f94088b = 60000;

    static {
        Covode.recordClassIndex(47822);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.protection.antiaddiction.AbstractC40044a, com.p2082ss.android.ugc.aweme.compliance.protection.antiaddiction.AbstractC40057d
    /* renamed from: a */
    public final boolean mo69199a(long j, long j2) {
        C40045a aVar = this.f94087a;
        long a = C40045a.m81003a();
        if (a >= 0) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j);
            instance.set(11, aVar.f94069a);
            instance.set(12, aVar.f94070b);
            instance.set(13, 0);
            long timeInMillis = instance.getTimeInMillis();
            long longValue = SharePrefCache.inst().getLastHintToastTime().mo59941c().longValue();
            Calendar instance2 = Calendar.getInstance();
            instance2.setTimeInMillis(longValue);
            new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(instance2.getTime());
            if (longValue >= timeInMillis || j < timeInMillis) {
                timeInMillis = longValue;
            } else {
                SharePrefCache.inst().getLastHintToastTime().mo59940b(Long.valueOf(timeInMillis));
                aVar.f94071c = 0;
            }
            if (j - timeInMillis > a && j2 > C40045a.m81003a() && C40045a.m81003a() > 0) {
                C40045a aVar2 = this.f94087a;
                SharePrefCache.inst().getLastHintToastTime().mo59940b(Long.valueOf(System.currentTimeMillis()));
                aVar2.f94071c++;
                C40046b.m81004a().f94081f = String.valueOf((C40045a.m81003a() * ((long) this.f94087a.f94071c)) / 60000);
            }
        }
        return false;
    }
}
