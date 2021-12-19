package com.p2082ss.android.ugc.aweme.services.edit;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.services.edit.IReplaceMusicService */
public interface IReplaceMusicService {
    static {
        Covode.recordClassIndex(79769);
    }

    void doRequest(String str, ReplaceMusicRequest replaceMusicRequest, ActivityC0945e eVar);

    boolean getClickPost();

    String getCover();

    ReplaceMusicRequest getReplaceMusicRequest();

    boolean isInPublish();

    void setClickPost(boolean z);

    void setCover(String str);

    void setReplaceMusicRequest(ReplaceMusicRequest replaceMusicRequest);

    void showWindow(JSONObject jSONObject, boolean z);

    void showWindow(boolean z, String str, ReplaceMusicRequest replaceMusicRequest);
}
