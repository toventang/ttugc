package com.p2082ss.android.ugc.aweme.video.simplayer;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.video.config.C80716a;
import com.p2082ss.android.ugc.playerkit.model.C84199c;
import com.p2082ss.android.ugc.playerkit.p4321a.AbstractC84177b;
import com.p2082ss.android.ugc.playerkit.simapicommon.C84231a;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.ss.android.ugc.aweme.video.simplayer.d */
public final class C81000d implements AbstractC84177b {
    static {
        Covode.recordClassIndex(94318);
    }

    @Override // com.p2082ss.android.ugc.playerkit.p4321a.AbstractC84177b
    public final void onEvent(JSONArray jSONArray) {
        boolean isEnabled = C84231a.m144838d().isEnabled();
        if (isEnabled) {
            C84231a.m144838d().mo124333e("video_playq", "to send video_playq log ");
        }
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    if (C84231a.m144834a().isDebug() || C80716a.C80717a.f180462a.mo123865b().playEventLogEnabled()) {
                        if (isEnabled) {
                            C84231a.m144838d().mo124333e("video_playq", "to send log before " + jSONArray.getJSONObject(i).toString());
                        }
                        C80716a.C80717a.f180462a.mo123864a().recordMiscLog(C84231a.f188309a, "video_playq", jSONArray.getJSONObject(i));
                        if (isEnabled) {
                            C84231a.m144838d().mo124333e("video_playq", "to send log after " + jSONArray.getJSONObject(i).toString());
                        }
                    }
                } catch (JSONException e) {
                    if (isEnabled) {
                        C84231a.m144838d().mo124333e("video_playq", "JSONException".concat(String.valueOf(e)));
                    }
                    e.printStackTrace();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.playerkit.p4321a.AbstractC84177b
    /* renamed from: a */
    public final void mo124440a(JSONArray jSONArray, String str) {
        boolean isEnabled = C84231a.m144838d().isEnabled();
        if (isEnabled) {
            C84231a.m144838d().mo124333e("video_playq", "to send video_playq logv2 ");
        }
        if (!(jSONArray == null || TextUtils.isEmpty(str) || !C84199c.f187979a.isEnablePlayerLogV2())) {
            for (int i = 0; i < jSONArray.length(); i++) {
                if (isEnabled) {
                    try {
                        C84231a.m144838d().mo124333e("video_playq", "to send video_playq logv2 before");
                    } catch (JSONException e) {
                        if (isEnabled) {
                            C84231a.m144838d().mo124333e("video_playq", "JSONException ".concat(String.valueOf(e)));
                        }
                        e.printStackTrace();
                    }
                }
                C84231a.m144837c().onEvent(str, jSONArray.getJSONObject(i));
                if (isEnabled) {
                    C84231a.m144838d().mo124333e("video_playq", "to send video_playq logv2 after");
                }
            }
        }
    }
}
