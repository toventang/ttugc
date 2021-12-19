package com.p2082ss.android.ugc.aweme.tools.extract.video;

import com.bytedance.covode.number.Covode;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.video.m */
public final class C78578m {
    static {
        Covode.recordClassIndex(91712);
    }

    /* renamed from: a */
    public static final JSONArray m137188a(C78582p pVar) {
        C89219l.m154721d(pVar, "");
        JSONArray jSONArray = new JSONArray();
        for (T t : pVar.f176610a) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("aweme_id", t.f176586a);
            jSONObject.put("video_id", t.f176587b);
            jSONObject.put("vframe_uri", t.f176588c);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }
}
