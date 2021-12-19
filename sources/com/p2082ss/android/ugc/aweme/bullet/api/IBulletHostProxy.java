package com.p2082ss.android.ugc.aweme.bullet.api;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.sdk.webview.AbstractC30269m;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.bullet.api.IBulletHostProxy */
public interface IBulletHostProxy {
    static {
        Covode.recordClassIndex(41990);
    }

    /* renamed from: a */
    AbstractC30269m mo61834a();

    /* renamed from: a */
    List<AbstractC16183k> mo61835a(C16248b bVar);

    /* renamed from: a */
    JSONObject mo61836a(String str);

    /* renamed from: a */
    boolean mo61837a(Context context, String str);
}
