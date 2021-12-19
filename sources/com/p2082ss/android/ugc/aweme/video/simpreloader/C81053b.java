package com.p2082ss.android.ugc.aweme.video.simpreloader;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80828a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.video.simpreloader.b */
public final class C81053b implements AbstractC80828a {
    static {
        Covode.recordClassIndex(94374);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80828a
    /* renamed from: a */
    public final String mo124193a() {
        return AppLog.getServerDeviceId();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80828a
    /* renamed from: b */
    public final String mo124195b() {
        return AppLog.getCurrentSessionId();
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80828a
    /* renamed from: a */
    public final void mo124194a(Context context, String str, JSONObject jSONObject) {
        AppLog.recordMiscLog(context, str, jSONObject);
    }
}
