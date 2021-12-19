package com.p2082ss.android.ugc.aweme.ecommerce.jsb;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.service.C45376a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.jsb.b */
public final class C44557b {

    /* renamed from: a */
    public static final C44558a f103974a = new C44558a((byte) 0);

    static {
        Covode.recordClassIndex(52920);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.jsb.b$a */
    public static final class C44558a {
        static {
            Covode.recordClassIndex(52921);
        }

        private C44558a() {
        }

        public /* synthetic */ C44558a(byte b) {
            this();
        }

        /* renamed from: a */
        public static JSONObject m87306a(JSONObject jSONObject, Context context) {
            String str;
            if (jSONObject != null) {
                str = jSONObject.optString("schema");
            } else {
                str = null;
            }
            C45376a.m87949a().prefetchSchema(str, context);
            return new JSONObject();
        }
    }
}
