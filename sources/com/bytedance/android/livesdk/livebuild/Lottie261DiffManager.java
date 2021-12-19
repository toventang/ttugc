package com.bytedance.android.livesdk.livebuild;

import android.content.Context;
import com.airbnb.lottie.AbstractC1988a;
import com.airbnb.lottie.AbstractC2212n;
import com.airbnb.lottie.C2044e;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public class Lottie261DiffManager extends AbstractC9307c {
    static {
        Covode.recordClassIndex(10233);
    }

    @Override // com.bytedance.android.livesdk.livebuild.AbstractC9307c
    public AbstractC1988a fromJson(Context context, String str, AbstractC2212n nVar) {
        try {
            return C2044e.C2045a.m6473a(str, nVar);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.android.livesdk.livebuild.AbstractC9307c
    public AbstractC1988a fromJson(Context context, JSONObject jSONObject, AbstractC2212n nVar) {
        try {
            return C2044e.C2045a.m6473a(jSONObject.toString(), nVar);
        } catch (Exception unused) {
            return null;
        }
    }
}
