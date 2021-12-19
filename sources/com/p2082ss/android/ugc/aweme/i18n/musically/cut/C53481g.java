package com.p2082ss.android.ugc.aweme.i18n.musically.cut;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.i18n.musically.cut.AvatarCutActivity;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVTransformService;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.cut.g */
final /* synthetic */ class C53481g implements IAVTransformService.ITransformCallback {

    /* renamed from: a */
    private final AvatarCutActivity.RunnableC534631 f122771a;

    static {
        Covode.recordClassIndex(63054);
    }

    C53481g(AvatarCutActivity.RunnableC534631 r1) {
        this.f122771a = r1;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVTransformService.ITransformCallback
    public final void finish(Object obj) {
        AvatarCutActivity.RunnableC534631 r4 = this.f122771a;
        Integer num = (Integer) obj;
        C29339a.m58754b(AvatarCutActivity.this.f122749w);
        if (num.intValue() != 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errorCode", num);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C12290b.m22060a("aweme_video_clip_success_rate", 1, jSONObject);
        } else {
            C12290b.m22060a("aweme_video_clip_success_rate", 0, (JSONObject) null);
        }
        AvatarCutActivity.this.f122744r = true;
        AvatarCutActivity.this.f122745s = true;
    }
}
