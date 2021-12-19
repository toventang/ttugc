package com.p2082ss.ttvideoengine.p4417j;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.j.g */
public final class C86526g {

    /* renamed from: a */
    public String f194747a;

    /* renamed from: b */
    public String f194748b;

    /* renamed from: c */
    public String[] f194749c;

    static {
        Covode.recordClassIndex(101754);
    }

    /* renamed from: a */
    public final void mo137777a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        String optString = jSONObject.optString("main_play_url");
        this.f194747a = optString;
        if (!TextUtils.isEmpty(optString)) {
            arrayList.add(this.f194747a);
        }
        String optString2 = jSONObject.optString("backup_play_url");
        this.f194748b = optString2;
        if (!TextUtils.isEmpty(optString2)) {
            arrayList.add(this.f194748b);
        }
        String[] strArr = new String[arrayList.size()];
        this.f194749c = strArr;
        arrayList.toArray(strArr);
    }
}
