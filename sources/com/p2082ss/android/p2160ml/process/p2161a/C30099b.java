package com.p2082ss.android.p2160ml.process.p2161a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2160ml.C30073b;
import com.p2082ss.android.p2160ml.C30078e;
import com.p2082ss.android.p2160ml.C30088k;
import com.p2082ss.android.p2160ml.process.AbstractC30113c;
import com.p2082ss.android.p2160ml.process.AbstractC30115e;
import com.p2082ss.android.p2160ml.process.C30114d;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.ml.process.a.b */
public final class C30099b implements AbstractC30115e {
    static {
        Covode.recordClassIndex(36595);
    }

    @Override // com.p2082ss.android.p2160ml.process.AbstractC30115e
    /* renamed from: a */
    public final void mo53485a(C30114d dVar) {
        HashMap<String, Object> hashMap = dVar.f71841a;
        AbstractC30113c cVar = dVar.f71844d;
        String feature = cVar.getFeature();
        int length = cVar.getLength();
        String type = cVar.getType();
        Float[] fArr = new Float[length];
        for (int i = 0; i < length; i++) {
            fArr[i] = Float.valueOf(0.0f);
        }
        try {
            String str = (String) C30078e.m60836a(hashMap, "server_feature_embedding_map");
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString(feature);
                if (!TextUtils.isEmpty(optString) && type != null && TextUtils.equals(type.toLowerCase(), "float16_hex")) {
                    C30073b.m60831a(optString, fArr, length);
                }
            }
        } catch (Throwable th) {
            C30088k.m60845a("ml#evaluator", "embedding evaluate error: ", th);
        }
        hashMap.put(feature, fArr);
    }
}
