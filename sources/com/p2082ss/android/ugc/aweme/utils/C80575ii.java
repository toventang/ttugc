package com.p2082ss.android.ugc.aweme.utils;

import android.net.Uri;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;

/* renamed from: com.ss.android.ugc.aweme.utils.ii */
public final class C80575ii {
    static {
        Covode.recordClassIndex(93848);
    }

    /* renamed from: a */
    public static Uri m139669a() {
        Uri parse = Uri.parse("https://www.tiktokv.com/aweme/i18n/uninstall/");
        try {
            parse = parse.buildUpon().appendQueryParameter("app_id", String.valueOf(C17867d.f42590n)).appendQueryParameter("device_type", Build.MODEL).appendQueryParameter("device_id", AppLog.getServerDeviceId()).appendQueryParameter("language", SettingServiceImpl.m120782v().mo108875k()).build();
            return parse;
        } catch (Exception e) {
            e.printStackTrace();
            return parse;
        }
    }
}
