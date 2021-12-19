package com.p2082ss.android.ugc.aweme.video.simplayer.p4228tt;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84240h;
import com.p2082ss.ttvideoengine.p4417j.C86539s;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.video.simplayer.tt.h */
public final class C81041h {
    static {
        Covode.recordClassIndex(94360);
    }

    /* renamed from: a */
    public static String m140706a(C86539s sVar) {
        return String.valueOf(sVar.f194949c.hashCode());
    }

    /* renamed from: a */
    static C86539s m140705a(C84240h hVar) {
        if (hVar == null || hVar.getVideoThumbs() == null || hVar.getVideoThumbs().size() <= 0) {
            return null;
        }
        try {
            C86539s sVar = new C86539s();
            sVar.mo137802a(new JSONObject(hVar.getVideoThumbs().get(0).toString()));
            return sVar;
        } catch (Throwable unused) {
            return null;
        }
    }
}
