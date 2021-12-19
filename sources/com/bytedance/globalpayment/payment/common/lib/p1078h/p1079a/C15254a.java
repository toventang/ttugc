package com.bytedance.globalpayment.payment.common.lib.p1078h.p1079a;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.common.utility.C13624l;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.payment.common.lib.p1072b.C15240a;
import com.bytedance.globalpayment.payment.common.lib.p1072b.C15242b;
import com.bytedance.globalpayment.payment.common.lib.p1072b.C15243c;
import com.bytedance.globalpayment.payment.common.lib.p1072b.C15245d;
import com.bytedance.globalpayment.payment.common.lib.p1074d.EnumC15247a;
import com.bytedance.globalpayment.payment.common.lib.p1076f.C15251a;
import com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b.AbstractC15269a;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: com.bytedance.globalpayment.payment.common.lib.h.a.a */
public final class C15254a implements AbstractC15269a {

    /* renamed from: a */
    private C15240a f37253a;

    static {
        Covode.recordClassIndex(17454);
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b.AbstractC15269a
    /* renamed from: c */
    public final C15240a mo24714c() {
        return this.f37253a;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b.AbstractC15269a
    /* renamed from: a */
    public final boolean mo24712a() {
        return this.f37253a.f37178j;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b.AbstractC15269a
    /* renamed from: b */
    public final Context mo24713b() {
        return this.f37253a.f37169a;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b.AbstractC15269a
    /* renamed from: d */
    public final C15243c mo24715d() {
        return this.f37253a.f37185q;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b.AbstractC15269a
    /* renamed from: e */
    public final C15251a mo24716e() {
        return this.f37253a.f37170b;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b.AbstractC15269a
    /* renamed from: g */
    public final String mo24718g() {
        return this.f37253a.f37182n;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b.AbstractC15269a
    /* renamed from: f */
    public final Map<String, String> mo24717f() {
        HashMap hashMap = new HashMap();
        AppLog.getSSIDs(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("sdk_version_code", "1");
        hashMap2.put("sdk_version_name", "1.0");
        String str = (String) hashMap.get("install_id");
        if (!C13627m.m24498a(str)) {
            hashMap2.put("iid", str);
        }
        String str2 = (String) hashMap.get("device_id");
        if (!C13627m.m24498a(str2)) {
            hashMap2.put("device_id", str2);
        }
        Application application = this.f37253a.f37169a;
        if (TextUtils.isEmpty(C58029j.f132249a) || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132249a = C13624l.m24481a(C13624l.m24479a(application));
        }
        String str3 = C58029j.f132249a;
        if (!C13627m.m24498a(str3)) {
            hashMap2.put("ac", str3);
        }
        String str4 = this.f37253a.f37170b.f37237e;
        if (str4 != null) {
            hashMap2.put("channel", str4);
        }
        hashMap2.put("aid", String.valueOf(this.f37253a.f37170b.f37233a));
        hashMap2.put("app_name", this.f37253a.f37170b.f37238f);
        hashMap2.put("version_code", String.valueOf(this.f37253a.f37170b.f37235c));
        hashMap2.put("version_name", this.f37253a.f37170b.f37234b);
        hashMap2.put("update_version_code", String.valueOf(this.f37253a.f37170b.f37236d));
        hashMap2.put("device_type", Build.MODEL);
        hashMap2.put("device_brand", Build.BRAND);
        hashMap2.put("device_manufacturer", Build.MANUFACTURER);
        hashMap2.put("language", Locale.getDefault().getLanguage());
        hashMap2.put("os_api", String.valueOf(Build.VERSION.SDK_INT));
        try {
            String str5 = Build.VERSION.RELEASE;
            if (str5 != null && str5.length() > 10) {
                str5 = str5.substring(0, 10);
            }
            hashMap2.put("os_version", str5);
        } catch (Exception unused) {
        }
        hashMap2.put("os", "android");
        hashMap2.put("package", this.f37253a.f37169a.getPackageName());
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        if (timeZone != null) {
            hashMap2.put("tz_offset", String.valueOf(timeZone.getOffset(System.currentTimeMillis()) / 1000));
            hashMap2.put("tz_name", timeZone.getID());
        }
        String language = Locale.getDefault().getLanguage();
        if (!C13627m.m24498a(language)) {
            hashMap2.put("language", language);
        }
        String country = Locale.getDefault().getCountry();
        if (!C13627m.m24498a(country)) {
            hashMap2.put("region", country.toLowerCase());
        }
        EnumC15247a aVar = this.f37253a.f37174f;
        if (aVar != null) {
            hashMap2.put("app_region", aVar.name());
        }
        return hashMap2;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b.AbstractC15269a
    /* renamed from: a */
    public final void mo24711a(C15240a aVar) {
        if (aVar != null) {
            if (this.f37253a == null) {
                this.f37253a = aVar;
            }
            C15240a aVar2 = this.f37253a;
            if (aVar2.f37169a == null && aVar.f37169a != null) {
                aVar2.f37169a = aVar.f37169a;
            }
            if (aVar2.f37170b == null && aVar.f37170b != null) {
                aVar2.f37170b = aVar.f37170b;
            }
            if (aVar2.f37171c == null && aVar.f37171c != null) {
                aVar2.f37171c = aVar.f37171c;
            }
            if (TextUtils.isEmpty(aVar2.f37172d) && !TextUtils.isEmpty(aVar.f37172d)) {
                aVar2.f37172d = aVar.f37172d;
            }
            if (TextUtils.isEmpty(aVar2.f37173e) && !TextUtils.isEmpty(aVar.f37173e)) {
                aVar2.f37173e = aVar.f37173e;
            }
            if (aVar2.f37174f == null && aVar.f37174f != null) {
                aVar2.f37174f = aVar.f37174f;
            }
            if (TextUtils.isEmpty(aVar2.f37175g) && !TextUtils.isEmpty(aVar.f37175g)) {
                aVar2.f37175g = aVar.f37175g;
            }
            if (!aVar2.f37176h && aVar.f37176h) {
                aVar2.f37176h = true;
            }
            if (!aVar2.f37177i && aVar.f37177i) {
                aVar2.f37177i = true;
            }
            if (!aVar2.f37178j && aVar.f37178j) {
                aVar2.f37178j = true;
            }
            if (TextUtils.isEmpty(aVar2.f37179k) && !TextUtils.isEmpty(aVar.f37179k)) {
                aVar2.f37179k = aVar.f37179k;
            }
            if (TextUtils.isEmpty(aVar2.f37180l) && !TextUtils.isEmpty(aVar.f37180l)) {
                aVar2.f37180l = aVar.f37180l;
            }
            if (aVar2.f37181m == null && aVar.f37181m != null) {
                aVar2.f37181m = aVar.f37181m;
            }
            if (aVar2.f37183o == null && aVar.f37183o != null) {
                aVar2.f37183o = aVar.f37183o;
            }
            if (TextUtils.isEmpty(aVar2.f37182n) && !TextUtils.isEmpty(aVar.f37182n)) {
                aVar2.f37182n = aVar.f37182n;
            }
            if (aVar2.f37184p == null) {
                aVar2.f37184p = aVar.f37184p;
            } else {
                C15242b bVar = aVar2.f37184p;
                C15242b bVar2 = aVar.f37184p;
                if (bVar2 != null) {
                    if (!((bVar.f37206a != null && bVar.f37207b != null && bVar.f37208c != null) || bVar2.f37206a == null || bVar2.f37207b == null || bVar2.f37208c == null)) {
                        bVar.f37206a = bVar2.f37206a;
                        bVar.f37207b = bVar2.f37207b;
                        bVar.f37208c = bVar2.f37208c;
                    }
                    if (TextUtils.isEmpty(bVar.f37209d) && !TextUtils.isEmpty(bVar2.f37209d)) {
                        bVar.f37209d = bVar2.f37209d;
                    }
                    if (bVar.f37210e == null) {
                        bVar.f37210e = bVar2.f37210e;
                    } else {
                        C15245d dVar = bVar.f37210e;
                        C15245d dVar2 = bVar2.f37210e;
                        if (dVar2 != null && TextUtils.isEmpty(dVar.f37229a) && !TextUtils.isEmpty(dVar2.f37229a)) {
                            dVar.f37229a = dVar2.f37229a;
                        }
                    }
                    if (TextUtils.isEmpty(bVar.f37211f) && !TextUtils.isEmpty(bVar2.f37211f)) {
                        bVar.f37211f = bVar2.f37211f;
                    }
                    if (TextUtils.isEmpty(bVar.f37212g) && !TextUtils.isEmpty(bVar2.f37212g)) {
                        bVar.f37212g = bVar2.f37212g;
                    }
                }
            }
            if (aVar2.f37185q == null) {
                aVar2.f37185q = aVar.f37185q;
            } else {
                C15243c cVar = aVar2.f37185q;
                C15243c cVar2 = aVar.f37185q;
                if (TextUtils.isEmpty(cVar.f37214b) && !TextUtils.isEmpty(cVar2.f37214b)) {
                    cVar.f37214b = cVar2.f37214b;
                }
                if (TextUtils.isEmpty(cVar.f37213a) && !TextUtils.isEmpty(cVar2.f37213a)) {
                    cVar.f37213a = cVar2.f37213a;
                }
                if (cVar.f37215c == 0 && cVar2.f37215c != 0) {
                    cVar.f37215c = cVar2.f37215c;
                }
                if (TextUtils.isEmpty(cVar.f37216d) && !TextUtils.isEmpty(cVar2.f37216d)) {
                    cVar.f37216d = cVar2.f37216d;
                }
                if (cVar.f37217e == null && cVar2.f37217e != null) {
                    cVar.f37217e = cVar2.f37217e;
                }
                cVar.f37218f = cVar2.f37218f;
                if (!cVar.f37219g && cVar2.f37219g) {
                    cVar.f37219g = true;
                }
                if (!cVar.f37220h && cVar2.f37220h) {
                    cVar.f37220h = true;
                }
            }
            if (aVar2.f37186r == null && aVar.f37186r != null) {
                aVar2.f37186r = aVar.f37186r;
            }
        }
    }
}
