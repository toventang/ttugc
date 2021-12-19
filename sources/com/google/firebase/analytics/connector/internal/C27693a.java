package com.google.firebase.analytics.connector.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.util.C25600b;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.firebase.analytics.connector.internal.a */
public final class C27693a {

    /* renamed from: a */
    public static final List<String> f65093a = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: b */
    public static final List<String> f65094b = Arrays.asList("_r", "_dbg");

    /* renamed from: c */
    public static final List<String> f65095c = Arrays.asList(C25600b.m49404a(AppMeasurement.C26236a.f62087a, AppMeasurement.C26236a.f62088b));

    /* renamed from: d */
    public static final List<String> f65096d = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    /* renamed from: e */
    private static final Set<String> f65097e = new HashSet(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));

    /* renamed from: f */
    private static final List<String> f65098f = Arrays.asList("auto", "app", "am");

    static {
        Covode.recordClassIndex(33275);
    }

    /* renamed from: a */
    public static boolean m55371a(String str) {
        if (!f65098f.contains(str)) {
            return true;
        }
        return false;
    }
}
