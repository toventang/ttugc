package com.bytedance.push.p1597h;

import android.app.Application;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.common.utility.C13624l;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.C21767c;
import com.bytedance.push.p1600k.C21858d;
import com.p2082ss.android.message.p2159a.C30062a;
import com.p2082ss.android.pushmanager.setting.C30220a;
import com.p2082ss.android.pushmanager.setting.C30221b;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.lancet.I18nLancet;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: com.bytedance.push.h.a */
public final class C21835a {

    /* renamed from: a */
    private final C21767c f51733a;

    static {
        Covode.recordClassIndex(25487);
    }

    /* renamed from: a */
    public final Map<String, String> mo35512a() {
        String a;
        String str;
        Map<String, String> a2;
        HashMap hashMap = new HashMap();
        C30221b.m61148b();
        C30220a.m61144a().mo53664a(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("push_sdk_version", "30203");
        hashMap2.put("push_sdk_version_name", "3.2.3-alpha.16-tiktok");
        String str2 = (String) hashMap.get("install_id");
        if (!C13627m.m24498a(str2)) {
            hashMap2.put("iid", str2);
        }
        String str3 = (String) hashMap.get("device_id");
        if (!C13627m.m24498a(str3)) {
            hashMap2.put("device_id", str3);
        }
        Application application = this.f51733a.f51581a;
        if (TextUtils.isEmpty(C58029j.f132249a) || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132249a = C13624l.m24481a(C13624l.m24479a(application));
        }
        String str4 = C58029j.f132249a;
        if (!C13627m.m24498a(str4)) {
            hashMap2.put("ac", str4);
        }
        String str5 = this.f51733a.f51587g;
        if (str5 != null) {
            hashMap2.put("channel", str5);
        }
        hashMap2.put("aid", String.valueOf(this.f51733a.f51582b));
        String str6 = this.f51733a.f51589i;
        if (str6 != null) {
            hashMap2.put("app_name", str6);
        }
        hashMap2.put("version_code", String.valueOf(this.f51733a.f51583c));
        hashMap2.put("version_name", this.f51733a.f51585e);
        hashMap2.put("update_version_code", String.valueOf(this.f51733a.f51584d));
        hashMap2.put("device_type", Build.MODEL);
        hashMap2.put("device_brand", Build.BRAND);
        hashMap2.put("os_api", String.valueOf(Build.VERSION.SDK_INT));
        try {
            String str7 = Build.VERSION.RELEASE;
            if (str7 != null && str7.length() > 10) {
                str7 = str7.substring(0, 10);
            }
            hashMap2.put("os_version", str7);
        } catch (Exception unused) {
        }
        int d = C13628n.m24524d(this.f51733a.f51581a);
        if (d > 0) {
            hashMap2.put("dpi", String.valueOf(d));
        }
        if (!TextUtils.isEmpty(I18nLancet.f132194a)) {
            a = I18nLancet.f132194a;
        } else {
            a = C30062a.m60800a();
            I18nLancet.f132194a = a;
        }
        hashMap2.put("rom", a);
        hashMap2.put("os", "android");
        hashMap2.put("package", this.f51733a.f51581a.getPackageName());
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
        try {
            String country2 = Resources.getSystem().getConfiguration().locale.getCountry();
            if (!TextUtils.isEmpty(country2)) {
                str = country2.toUpperCase();
            } else {
                str = "";
            }
            hashMap2.put("country", str);
            if (!(this.f51733a.f51598r == null || (a2 = this.f51733a.f51598r.mo35417a()) == null)) {
                hashMap2.putAll(a2);
            }
            hashMap2.put("rom_version", C21858d.f51781a);
        } catch (Exception unused2) {
        }
        return hashMap2;
    }

    public C21835a(C21767c cVar) {
        this.f51733a = cVar;
    }
}
