package com.p2082ss.android.ugc.aweme.forward.statistics;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.forward.statistics.IForwardStatisticsService */
public interface IForwardStatisticsService {
    static {
        Covode.recordClassIndex(60636);
    }

    /* renamed from: a */
    C33743c mo86841a(C33743c cVar, Aweme aweme, String str);

    /* renamed from: a */
    String mo86842a();

    /* renamed from: a */
    HashMap<String, String> mo86843a(Aweme aweme, String str);

    /* renamed from: a */
    HashMap<String, String> mo86844a(String str, Aweme aweme);

    /* renamed from: a */
    JSONObject mo86845a(JSONObject jSONObject, Aweme aweme, String str);

    /* renamed from: a */
    void mo86846a(String str, Aweme aweme, String str2, String str3);

    /* renamed from: b */
    C33743c mo86847b(C33743c cVar, Aweme aweme, String str);
}
