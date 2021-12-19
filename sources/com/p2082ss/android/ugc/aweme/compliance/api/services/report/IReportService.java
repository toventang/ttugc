package com.p2082ss.android.ugc.aweme.compliance.api.services.report;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.services.report.IReportService */
public interface IReportService {
    static {
        Covode.recordClassIndex(46957);
    }

    /* renamed from: a */
    String mo68686a(Aweme aweme);

    /* renamed from: a */
    String mo68687a(String str);

    /* renamed from: a */
    void mo68688a(Activity activity, Uri.Builder builder);

    /* renamed from: a */
    void mo68689a(Activity activity, Uri.Builder builder, Bundle bundle);

    /* renamed from: a */
    void mo68690a(Activity activity, Aweme aweme);

    /* renamed from: a */
    void mo68691a(String str, String str2, String str3, String str4, String str5, String str6, String str7);

    /* renamed from: a */
    void mo68692a(String str, String str2, String str3, String str4, String str5, String str6, String str7, Aweme aweme);

    /* renamed from: a */
    void mo68693a(Map<String, String> map);

    /* renamed from: b */
    void mo68694b(Activity activity, Uri.Builder builder);
}
