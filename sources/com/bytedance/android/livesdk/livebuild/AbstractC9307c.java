package com.bytedance.android.livesdk.livebuild;

import android.content.Context;
import com.airbnb.lottie.AbstractC1988a;
import com.airbnb.lottie.AbstractC2212n;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.livebuild.c */
public abstract class AbstractC9307c {
    static {
        Covode.recordClassIndex(10236);
    }

    public abstract AbstractC1988a fromJson(Context context, String str, AbstractC2212n nVar);

    public abstract AbstractC1988a fromJson(Context context, JSONObject jSONObject, AbstractC2212n nVar);

    public static void load() {
        C93081 r1 = new AbstractC9306b<AbstractC9307c>() {
            /* class com.bytedance.android.livesdk.livebuild.AbstractC9307c.C93081 */

            static {
                Covode.recordClassIndex(10237);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.android.livesdk.livebuild.AbstractC9306b
            /* renamed from: a */
            public final /* synthetic */ AbstractC9307c mo15441a() {
                return m17582b();
            }

            /* renamed from: b */
            private static AbstractC9307c m17582b() {
                try {
                    return (AbstractC9307c) Class.forName("com.bytedance.android.livesdk.livebuild.Lottie261DiffManager").newInstance();
                } catch (Throwable unused) {
                    return null;
                }
            }
        };
        if (C9305a.f22743a == null) {
            C9305a.f22743a = new HashMap();
        }
        C9305a.f22743a.put(AbstractC9307c.class, r1);
    }
}
