package com.p2082ss.android.ugc.aweme.util;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.p4173ug.AbstractC79589c;
import com.p2082ss.android.ugc.aweme.p4173ug.UgCommonServiceImpl;
import com.p2082ss.android.ugc.aweme.user.C80061e;
import com.p2082ss.android.ugc.aweme.user.C80064f;
import com.p2082ss.android.ugc.aweme.util.p4199a.C80122a;
import java.util.Calendar;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.util.t */
public final /* synthetic */ class CallableC80162t implements Callable {

    /* renamed from: a */
    public static final Callable f179602a = new CallableC80162t();

    static {
        Covode.recordClassIndex(93406);
    }

    private CallableC80162t() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (!C80122a.m138890c()) {
            int i = C80122a.m138887a().getInt("many_days_viewed_count", 0);
            AbstractC79589c a = UgCommonServiceImpl.m138290j().mo123092a();
            int i2 = i + 1;
            if (i2 == 1) {
                a.mo123114a("F1", null, null);
                a.mo123117b("F1", null, null);
            } else if (i2 == 10) {
                a.mo123114a("F10", null, null);
                a.mo123117b("F10", null, null);
            }
            C80122a.m138889b().putInt("many_days_viewed_count", i2).apply();
            if (i2 >= 30 && !C80122a.m138887a().getBoolean("has_reported_viewed_30_many_days", false)) {
                if (C58071d.m104915i()) {
                    a.mo123118c("af_vvfinish_allday30");
                }
                C80122a.m138889b().putBoolean("has_reported_viewed_30_many_days", true).apply();
                a.mo123114a("F30", null, null);
                a.mo123117b("F30", null, null);
            }
            if (i2 >= 50 && !C80122a.m138890c()) {
                if (C58071d.m104915i()) {
                    a.mo123118c("af_vvfinish_allday50");
                }
                C80122a.m138889b().putBoolean("has_reported_viewed_50_many_days", true).apply();
                a.mo123114a("F50", null, null);
                a.mo123117b("F50", null, null);
            }
        }
        if (C58071d.m104915i() || C58071d.m104911e()) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(System.currentTimeMillis());
            instance.set(11, 0);
            instance.set(12, 0);
            instance.set(13, 0);
            instance.set(14, 0);
            String sb = new StringBuilder().append(instance.getTimeInMillis()).toString();
            String string = C80122a.m138887a().getString("current_data", "");
            int i3 = C80122a.m138887a().getInt("one_day_viewed_count", 0);
            if (!TextUtils.equals(sb, string)) {
                C80122a.m138888a(0);
                C80122a.m138889b().putString("current_data", sb).apply();
                i3 = 0;
            }
            int i4 = i3 + 1;
            C80122a.m138888a(i4);
            AbstractC79589c a2 = UgCommonServiceImpl.m138290j().mo123092a();
            if (C58071d.m104911e() && i4 >= 10 && !C80122a.m138887a().getBoolean("has_reported_viewed_10_one_day", false)) {
                a2.mo123118c("af_vvfinish_aday10");
                C80122a.m138889b().putBoolean("has_reported_viewed_10_one_day", true).apply();
            }
            if (C58071d.m104911e() && i4 >= 20 && !C80122a.m138887a().getBoolean("has_reported_viewed_20_one_day", false)) {
                a2.mo123118c("af_vvfinish_aday20");
                C80122a.m138889b().putBoolean("has_reported_viewed_20_one_day", true).apply();
            }
            if (C80064f.m138815a(C80061e.f179403k.mo123508a()) && C58071d.m104911e() && i4 >= 10 && !C80122a.m138887a().getBoolean("has_reported_viewed_10_one_day_login", false)) {
                a2.mo123118c("af_vvfinish_aday10_login");
                C80122a.m138889b().putBoolean("has_reported_viewed_10_one_day_login", true).apply();
            }
            if (C80064f.m138815a(C80061e.f179403k.mo123508a()) && C58071d.m104911e() && i4 >= 20 && !C80122a.m138887a().getBoolean("has_reported_viewed_20_one_day_login", false)) {
                a2.mo123118c("af_vvfinish_aday20_login");
                C80122a.m138889b().putBoolean("has_reported_viewed_20_one_day_login", true).apply();
            }
            if (C80064f.m138815a(C80061e.f179403k.mo123508a()) && C58071d.m104911e() && i4 >= 30 && !C80122a.m138887a().getBoolean("has_reported_viewed_30_one_day_login", false)) {
                a2.mo123118c("af_vvfinish_aday30_login");
                C80122a.m138889b().putBoolean("has_reported_viewed_30_one_day_login", true).apply();
            }
            if (C80064f.m138815a(C80061e.f179403k.mo123508a()) && C58071d.m104911e() && i4 >= 50 && !C80122a.m138887a().getBoolean("has_reported_viewed_50_one_day_login", false)) {
                a2.mo123118c("af_vvfinish_aday50_login");
                C80122a.m138889b().putBoolean("has_reported_viewed_50_one_day_login", true).apply();
            }
            if (i4 >= 30 && !C80122a.m138887a().getBoolean("has_reported_viewed_30_one_day", false)) {
                a2.mo123118c("af_vvfinish_aday30");
                C80122a.m138889b().putBoolean("has_reported_viewed_30_one_day", true).apply();
            }
            if (i4 >= 50 && !C80122a.m138887a().getBoolean("has_reported_viewed_50_one_day", false)) {
                a2.mo123118c("af_vvfinish_aday50");
                C80122a.m138889b().putBoolean("has_reported_viewed_50_one_day", true).apply();
            }
        }
        return null;
    }
}
