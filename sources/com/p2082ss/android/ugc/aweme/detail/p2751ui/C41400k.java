package com.p2082ss.android.ugc.aweme.detail.p2751ui;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.detail.ui.k */
public final class C41400k {
    static {
        Covode.recordClassIndex(49295);
    }

    /* renamed from: a */
    private static String m83280a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m83281a(Activity activity, C49812b bVar, int i) {
        if (!"undefined".equalsIgnoreCase(bVar.getAid())) {
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            String a = m83280a(activity.getIntent(), "invitation_code");
            String a2 = m83280a(activity.getIntent(), "invitor");
            jSONObject.put("id", bVar.getAid());
            jSONObject.put("refer", bVar.getEventType());
            jSONObject.put("ids", bVar.getIds());
            jSONObject.put("userid", bVar.getUid());
            jSONObject.put("video_from", bVar.getFrom());
            jSONObject.put("page_type", i);
            jSONObject.put("music_id", bVar.getMusicId());
            jSONObject.put("sticker_id", bVar.getStickerId());
            jSONObject.put("movie_id", bVar.getMvId());
            jSONObject.put("challenge_id", bVar.getChallengeId());
            jSONObject.put("question_id", bVar.getQuestionId());
            jSONObject.put("invitation_code", a);
            jSONObject.put("invitor", a2);
            jSONObject.put("video_type", bVar.getVideoType());
            jSONObject.put("push_params", bVar.getPushParams());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C33830n.m70668a("aweme_detail_aid_undefined", jSONObject);
        activity.finish();
        return true;
    }
}
