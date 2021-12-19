package com.p2082ss.android.ugc.aweme.report;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.p2929fe.p2930a.C47809e;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.report.b */
public final class C67105b {

    /* renamed from: a */
    public static final C67105b f150492a = new C67105b();

    private C67105b() {
    }

    static {
        Covode.recordClassIndex(78687);
    }

    /* renamed from: a */
    public static final HashMap<String, String> m118761a(Aweme aweme, String str) {
        Long groupId;
        String valueOf;
        String str2 = "";
        C89219l.m154721d(aweme, str2);
        C89219l.m154721d(str, str2);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("enter_from", str);
        hashMap.put("author_id", aweme.getAuthorUid());
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (!(awemeRawAd == null || (groupId = awemeRawAd.getGroupId()) == null || (valueOf = String.valueOf(groupId.longValue())) == null)) {
            str2 = valueOf;
        }
        hashMap.put("group_id", str2);
        return hashMap;
    }

    /* renamed from: a */
    public static final Uri.Builder m118760a(Aweme aweme, String str, String str2) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return m118757a(new Uri.Builder(), aweme, str, str2);
    }

    /* renamed from: a */
    public static final Uri.Builder m118759a(Aweme aweme, String str, long j, String str2) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("room_id", String.valueOf(j));
        return m118757a(builder, aweme, str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        if (r1 == null) goto L_0x0031;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.net.Uri.Builder m118757a(android.net.Uri.Builder r4, com.p2082ss.android.ugc.aweme.feed.model.Aweme r5, java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.String r3 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r4, r3)
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, r3)
            p4600h.p4611f.p4613b.C89219l.m154721d(r6, r3)
            p4600h.p4611f.p4613b.C89219l.m154721d(r7, r3)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r5.getAwemeRawAd()
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r0.getLogExtra()
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r5.getAwemeRawAd()
            if (r0 != 0) goto L_0x0028
            p4600h.p4611f.p4613b.C89219l.m154715b()
        L_0x0028:
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r3)
            java.lang.String r1 = r0.getLogExtra()
            if (r1 != 0) goto L_0x0032
        L_0x0031:
            r1 = r3
        L_0x0032:
            java.lang.String r0 = "log_extra"
            r2.put(r0, r1)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r5.getAwemeRawAd()
            if (r0 == 0) goto L_0x0043
            java.lang.String r1 = r0.getCreativeIdStr()
            if (r1 != 0) goto L_0x0044
        L_0x0043:
            r1 = r3
        L_0x0044:
            java.lang.String r0 = "cid"
            r2.put(r0, r1)
            com.google.gson.f r0 = new com.google.gson.f
            r0.<init>()
            java.lang.String r0 = r0.mo46674b(r2)
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r3)
            android.net.Uri$Builder r0 = m118758a(r4, r5, r6, r7, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.report.C67105b.m118757a(android.net.Uri$Builder, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String):android.net.Uri$Builder");
    }

    /* renamed from: a */
    public static final Uri.Builder m118758a(Uri.Builder builder, Aweme aweme, String str, String str2, String str3) {
        Long l;
        int reportAdType;
        C89219l.m154721d(builder, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C47809e.C47810a.f110762a.mo79874a("ies_ad_info_key_" + AppLog.getServerDeviceId(), (Object) str3);
        Uri.Builder appendQueryParameter = builder.appendQueryParameter("report_type", str2).appendQueryParameter("object_id", aweme.getAid()).appendQueryParameter("item_id", aweme.getAid()).appendQueryParameter("owner_id", aweme.getAuthorUid());
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("user_id", g.getCurUserId());
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            l = awemeRawAd.getGroupId();
        } else {
            l = null;
        }
        Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("group_id", String.valueOf(l)).appendQueryParameter("report_from", str).appendQueryParameter("app_language", SettingServiceImpl.m120782v().mo108872h()).appendQueryParameter("app_name", C17867d.m33081b()).appendQueryParameter("device_id", AppLog.getServerDeviceId()).appendQueryParameter("platform", "android").appendQueryParameter("version", C17867d.m33085f()).appendQueryParameter("install_id", AppLog.getInstallId());
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (!(awemeRawAd2 == null || (reportAdType = awemeRawAd2.getReportAdType()) == 0)) {
            builder.appendQueryParameter("report_ad_type", String.valueOf(reportAdType));
        }
        C89219l.m154716b(appendQueryParameter3, "");
        return appendQueryParameter3;
    }
}
