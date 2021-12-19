package com.p2082ss.android.ugc.aweme.settingsrequest.api;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56256i;
import com.p2082ss.android.ugc.aweme.setting.model.C68174d;
import com.p2082ss.android.ugc.aweme.setting.serverpush.AbstractC68342a;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService */
public interface ISettingsRequestService {
    static {
        Covode.recordClassIndex(81044);
    }

    /* renamed from: a */
    C56256i mo57273a(SharedPreferences.Editor editor, IESSettingsProxy iESSettingsProxy);

    /* renamed from: a */
    List<AbstractC68342a> mo57274a();

    /* renamed from: a */
    void mo57275a(Activity activity);

    /* renamed from: a */
    void mo57276a(Context context);

    /* renamed from: a */
    void mo57277a(C28022o oVar);

    /* renamed from: a */
    void mo57278a(C68174d dVar);

    /* renamed from: a */
    void mo57279a(C68348f fVar);

    /* renamed from: a */
    void mo57280a(AbstractC68342a aVar);

    /* renamed from: a */
    void mo57281a(String str);

    /* renamed from: a */
    void mo57282a(Map<String, String> map);

    /* renamed from: b */
    C56256i mo57283b();

    /* renamed from: b */
    JSONObject mo57284b(String str);

    /* renamed from: c */
    boolean mo57285c();

    /* renamed from: d */
    int mo57286d();

    /* renamed from: e */
    int mo57287e();

    /* renamed from: f */
    int mo57288f();

    /* renamed from: g */
    boolean mo57289g();

    /* renamed from: h */
    boolean mo57290h();
}
