package com.p2082ss.android.p2160ml.process.p2161a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2160ml.C30073b;
import com.p2082ss.android.p2160ml.C30078e;
import com.p2082ss.android.p2160ml.C30088k;
import com.p2082ss.android.p2160ml.C30120t;
import com.p2082ss.android.p2160ml.process.AbstractC30113c;
import com.p2082ss.android.p2160ml.process.AbstractC30115e;
import com.p2082ss.android.p2160ml.process.C30114d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.ml.process.a.c */
public final class C30100c implements AbstractC30115e {
    static {
        Covode.recordClassIndex(36596);
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
            ArrayList arrayList = (ArrayList) C30078e.m60836a(hashMap, "server_feature_embedding_vector");
            if (arrayList != null && !arrayList.isEmpty()) {
                int vectorLength = cVar.getVectorLength();
                int vectorNum = cVar.getVectorNum();
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < vectorNum && i2 < size) {
                    String str = (String) arrayList.get(i2);
                    if (!TextUtils.isEmpty(str)) {
                        String optString = new JSONObject(str).optString(feature);
                        if (!TextUtils.isEmpty(optString) && type != null && TextUtils.equals(type.toLowerCase(), "float16_hex")) {
                            Float[] fArr2 = new Float[vectorLength];
                            for (int i3 = 0; i3 < vectorLength; i3++) {
                                fArr2[i3] = Float.valueOf(0.0f);
                            }
                            C30073b.m60831a(optString, fArr2, vectorLength);
                            for (int i4 = 0; i4 < vectorLength; i4++) {
                                fArr[(i2 * vectorLength) + i4] = fArr2[i4];
                            }
                        }
                    }
                    i2++;
                }
            }
        } catch (Throwable th) {
            C30088k.m60845a("ml#evaluator", "embedding vector evaluate error: ", th);
        }
        if (C30120t.f71860a) {
            Arrays.toString(fArr);
        }
        hashMap.put(feature, fArr);
    }
}
