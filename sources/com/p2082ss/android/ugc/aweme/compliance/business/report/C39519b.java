package com.p2082ss.android.ugc.aweme.compliance.business.report;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.business.report.ReportWebPageDialogActivity;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76598h;
import com.p2082ss.android.ugc.aweme.upvote.event.C79900c;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.report.b */
public final class C39519b {
    static {
        Covode.recordClassIndex(47212);
    }

    /* renamed from: a */
    public static void m80206a(String str, Uri.Builder builder) {
        boolean z;
        User curUser = C31575b.m65865g().getCurUser();
        if (curUser == null || !curUser.isDisciplineMember()) {
            z = false;
        } else {
            z = true;
        }
        Uri parse = Uri.parse(str);
        builder.scheme(parse.getScheme());
        builder.authority(parse.getAuthority());
        builder.path(parse.getPath());
        if (SharePrefCache.inst().getIsFirstReportVideo().mo59941c().booleanValue() && !z) {
            builder.appendQueryParameter("isFirst", "1");
        }
    }

    /* renamed from: a */
    public static void m80205a(Activity activity, Uri.Builder builder, Bundle bundle) {
        m80206a("https://www.tiktok.com/falcon/communitysafety/page/reasons/index.html", builder);
        Uri build = builder.build();
        Bundle bundle2 = new Bundle();
        bundle2.putString("url", build.toString());
        bundle2.putBoolean("show_load_dialog", false);
        bundle2.putBoolean("hide_nav_bar", true);
        bundle2.putString("status_bar_color", activity.getResources().getString(R.color.nc).replace("#", ""));
        bundle2.putLong("enter_time", System.currentTimeMillis());
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        ReportWebPageDialogActivity.C39510a.m80186a(activity, bundle2, build.getQueryParameter("object_id"), build.getQueryParameter("enter_from"));
    }

    /* renamed from: a */
    public static void m80207a(String str, String str2, String str3, String str4, String str5, String str6, String str7, Aweme aweme) {
        C33744d a = new C33744d().mo59983a("author_id", str5).mo59983a("object_id", str4).mo59983a("object_type", str2).mo59983a("enter_from", str).mo59983a("enter_method", str7).mo59983a("group_id", str3);
        if (!TextUtils.isEmpty(str6)) {
            a.mo59983a("room_id", str6);
        }
        C76598h.m134177a(a, aweme);
        if (aweme != null) {
            C79900c.m138665a(a, aweme, str);
        }
        C39162r.m79460a("click_report", a.f79943a);
    }
}
