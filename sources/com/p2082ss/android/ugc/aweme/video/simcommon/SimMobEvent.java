package com.p2082ss.android.ugc.aweme.video.simcommon;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.playerkit.simapicommon.reporter.IEvent;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.video.simcommon.SimMobEvent */
public class SimMobEvent implements IEvent {
    static {
        Covode.recordClassIndex(94246);
    }

    @Override // com.p2082ss.android.ugc.playerkit.simapicommon.reporter.IEvent
    public void onEvent(String str, JSONObject jSONObject) {
        C39162r.m79461a(str, jSONObject);
    }

    public void onEvent(String str, String str2, long j) {
        C39162r.onEvent(MobClick.obtain().setEventName(str).setLabelName(str2).setExtValueLong(j));
    }

    public void onEvent(String str, String str2, String str3) {
        C39162r.onEvent(MobClick.obtain().setEventName(str).setLabelName(str2).setExtValueString(str3));
    }
}
