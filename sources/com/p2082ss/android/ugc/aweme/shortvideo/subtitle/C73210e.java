package com.p2082ss.android.ugc.aweme.shortvideo.subtitle;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.e */
public final class C73210e {
    static {
        Covode.recordClassIndex(85928);
    }

    /* renamed from: a */
    public static final void m129263a(int i, C73208d dVar) {
        C89219l.m154721d(dVar, "");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", dVar.f164404a);
        jSONObject.put("get_config_duration", dVar.f164405b);
        jSONObject.put("extract_duration", dVar.f164406c);
        jSONObject.put("upload_duration", dVar.f164407d);
        jSONObject.put("submit_duration", dVar.f164408e);
        jSONObject.put("query_duration", dVar.f164409f);
        jSONObject.put("extract_duration_per_second", dVar.f164410g);
        jSONObject.put("upload_duration_per_second", dVar.f164411h);
        jSONObject.put("submit_duration_per_second", dVar.f164412i);
        jSONObject.put("query_duration_per_second", dVar.f164413j);
        jSONObject.put("recognize_duration_per_second", dVar.f164414k);
        jSONObject.put("perceived_get_config_duration", dVar.f164415l);
        jSONObject.put("perceived_extract_duration", dVar.f164416m);
        jSONObject.put("tos_key", dVar.f164417n);
        jSONObject.put("job_id", dVar.f164418o);
        jSONObject.put("failed_step", dVar.f164419p);
        jSONObject.put("failed_code", dVar.f164420q);
        jSONObject.put("failed_msg", dVar.f164421r);
        jSONObject.put("audio_file_size", dVar.f164422s);
        jSONObject.put("audio_upload_domain", dVar.f164423t);
        C40982q.f95822a.mo101630a("tt_recognize_caption_monitor", i, jSONObject, null);
        C73991bj.m130133d("monitor tt_recognize_caption_monitor status: " + i + " data: " + jSONObject);
    }
}
