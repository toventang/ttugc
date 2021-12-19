package com.p2082ss.android.ugc.aweme.compliance.business.serviceimpl;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import com.p2082ss.android.ugc.aweme.compliance.business.report.C39519b;
import com.p2082ss.android.ugc.aweme.compliance.business.report.ReportWebPageDialogActivity;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.serviceimpl.ReportServiceImpl */
public class ReportServiceImpl implements IReportService {
    static {
        Covode.recordClassIndex(47232);
    }

    /* renamed from: a */
    public static IReportService m80285a() {
        MethodCollector.m26663i(8851);
        Object a = C81908b.m141854a(IReportService.class, false);
        if (a != null) {
            IReportService iReportService = (IReportService) a;
            MethodCollector.m26664o(8851);
            return iReportService;
        }
        if (C81908b.f183152aH == null) {
            synchronized (IReportService.class) {
                try {
                    if (C81908b.f183152aH == null) {
                        C81908b.f183152aH = new ReportServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8851);
                    throw th;
                }
            }
        }
        ReportServiceImpl reportServiceImpl = (ReportServiceImpl) C81908b.f183152aH;
        MethodCollector.m26664o(8851);
        return reportServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.report.IReportService
    /* renamed from: a */
    public final String mo68687a(String str) {
        if (TextUtils.equals(str, "long_press_mask_layer")) {
            return "long_press";
        }
        return "click_share_button";
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.report.IReportService
    /* renamed from: a */
    public final String mo68686a(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.isForwardAweme()) {
            return "forward";
        }
        if (aweme.isImage()) {
            return "image";
        }
        return "video";
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.report.IReportService
    /* renamed from: a */
    public final void mo68693a(Map<String, String> map) {
        if (map != null) {
            C39162r.m79460a("tip_off", map);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.report.IReportService
    /* renamed from: a */
    public final void mo68688a(Activity activity, Uri.Builder builder) {
        mo68689a(activity, builder, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.report.IReportService
    /* renamed from: b */
    public final void mo68694b(Activity activity, Uri.Builder builder) {
        if (activity != null) {
            C39519b.m80206a("https://www.tiktok.com/falcon/communitysafety/page/reasons_ad/index.html", builder);
            Uri build = builder.build();
            Bundle bundle = new Bundle();
            bundle.putString("url", build.toString());
            bundle.putBoolean("show_load_dialog", false);
            bundle.putBoolean("hide_nav_bar", true);
            bundle.putString("status_bar_color", activity.getResources().getString(R.color.nc).replace("#", ""));
            bundle.putLong("enter_time", System.currentTimeMillis());
            ReportWebPageDialogActivity.C39510a.m80186a(activity, bundle, build.getQueryParameter("object_id"), build.getQueryParameter("enter_from"));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.report.IReportService
    /* renamed from: a */
    public final void mo68690a(Activity activity, Aweme aweme) {
        String str = "video";
        if (aweme.getAwemeType() == 13) {
            str = "forward";
        } else if (aweme.getAwemeType() == 2) {
            str = "image";
        } else if (!(aweme.getAwemeType() == 0 || aweme.getAwemeType() == 51 || aweme.getAwemeType() == 52 || aweme.getAwemeType() == 54 || aweme.getAwemeType() == 53 || aweme.getAwemeType() == 55 || aweme.getAwemeType() == 56 || aweme.getAwemeType() == 34)) {
            if (aweme.getAwemeRawAd() != null && aweme.getAwemeRawAd().getSystemOrigin() == 1) {
                str = "douplus";
            } else if (aweme.isAd()) {
                str = "ad";
            }
        }
        String aid = aweme.getAid();
        String authorUid = aweme.getAuthorUid();
        if (activity != null) {
            Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("object_id", aid).appendQueryParameter("owner_id", authorUid).appendQueryParameter("report_type", str).appendQueryParameter("locale", SettingServiceImpl.m120782v().mo108872h());
            if (!TextUtils.isEmpty("")) {
                appendQueryParameter.appendQueryParameter("video_owner_id", "");
            }
            C39519b.m80205a(activity, appendQueryParameter, null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.report.IReportService
    /* renamed from: a */
    public final void mo68689a(Activity activity, Uri.Builder builder, Bundle bundle) {
        if (activity != null) {
            C39519b.m80205a(activity, builder, bundle);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.report.IReportService
    /* renamed from: a */
    public final void mo68691a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C39519b.m80207a(str, str2, str3, str4, str5, str6, str7, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.report.IReportService
    /* renamed from: a */
    public final void mo68692a(String str, String str2, String str3, String str4, String str5, String str6, String str7, Aweme aweme) {
        C39519b.m80207a(str, str2, str3, str4, str5, str6, str7, aweme);
    }
}
