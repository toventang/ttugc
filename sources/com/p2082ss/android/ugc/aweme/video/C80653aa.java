package com.p2082ss.android.ugc.aweme.video;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j;
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84292h;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.video.aa */
public final class C80653aa {
    static {
        Covode.recordClassIndex(93932);
    }

    /* renamed from: a */
    private static AbstractC63042j.C63049g m139871a(AbstractC84292h hVar) {
        AbstractC63042j.C63049g j;
        if (hVar == null || (j = hVar.mo80281j()) == null) {
            return null;
        }
        return j;
    }

    /* renamed from: a */
    public static String m139873a(AbstractC84292h hVar, String str) {
        return m139872a(m139871a(hVar), str);
    }

    /* renamed from: a */
    static String m139872a(AbstractC63042j.C63049g gVar, String str) {
        if (gVar != null && gVar.f143223b == null && !TextUtils.isEmpty(gVar.f143222a)) {
            try {
                return new JSONObject(gVar.f143222a).getString(str);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
