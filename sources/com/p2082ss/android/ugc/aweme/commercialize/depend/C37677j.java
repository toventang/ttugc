package com.p2082ss.android.ugc.aweme.commercialize.depend;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.common.applog.C29803q;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.depend.j */
public final class C37677j implements IAppLogDepend {
    static {
        Covode.recordClassIndex(45110);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IAppLogDepend
    public final String getCategory(boolean z) {
        return z ? "event_v3" : "event_v1";
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IAppLogDepend
    public final ExecutorService getLogThreadPool() {
        return C39162r.m79452a();
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IAppLogDepend
    public final void appendCommonParams(StringBuilder sb, boolean z) {
        C89219l.m154721d(sb, "");
        AppLog.appendCommonParams(sb, z);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IAppLogDepend
    public final void onEventV3Bundle(String str, Bundle bundle) {
        C89219l.m154721d(str, "");
        C39162r.m79453a(str, bundle);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IAppLogDepend
    public final void onEventV3Json(String str, JSONObject jSONObject) {
        C89219l.m154721d(str, "");
        C39162r.m79461a(str, jSONObject);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IAppLogDepend
    public final void onEventV3Map(String str, Map<String, String> map) {
        C89219l.m154721d(str, "");
        C39162r.m79460a(str, map);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IAppLogDepend
    public final void putCommonParams(Map<String, String> map, boolean z) {
        C89219l.m154721d(map, "");
        C29803q.m60034a(map, z);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IAppLogDepend
    public final void onEventV1(Context context, String str, String str2, String str3, String str4, long j, JSONObject jSONObject) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        if (TextUtils.isEmpty(str2)) {
            C39162r.m79456a(str, str3, str4, j, jSONObject);
        } else {
            C39162r.m79458a(str2, str, str3, str4, j, jSONObject);
        }
    }
}
