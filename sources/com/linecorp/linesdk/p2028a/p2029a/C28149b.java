package com.linecorp.linesdk.p2028a.p2029a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.linecorp.linesdk.p2028a.C28157b;
import com.linecorp.linesdk.p2028a.C28160d;
import com.linecorp.linesdk.p2028a.C28161e;
import com.linecorp.linesdk.p2028a.C28162f;
import com.linecorp.linesdk.p2028a.C28163g;
import com.linecorp.linesdk.p2028a.p2029a.p2030a.AbstractC28146c;
import com.linecorp.linesdk.p2028a.p2029a.p2030a.C28144a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.linecorp.linesdk.a.a.b */
public final class C28149b {

    /* renamed from: a */
    public static final AbstractC28146c<C28162f> f65874a = new C28151b((byte) 0);

    /* renamed from: b */
    public static final AbstractC28146c<C28161e> f65875b = new C28150a((byte) 0);

    /* renamed from: c */
    public static final AbstractC28146c<C28157b> f65876c = new C28153d((byte) 0);

    /* renamed from: d */
    public static final AbstractC28146c<C28163g> f65877d = new C28152c((byte) 0);

    /* renamed from: e */
    public static final AbstractC28146c<?> f65878e = new C28154c();

    /* renamed from: f */
    public final Uri f65879f;

    /* renamed from: g */
    public final C28144a f65880g;

    /* renamed from: com.linecorp.linesdk.a.a.b$a */
    static class C28150a extends AbstractC28143a<C28161e> {
        static {
            Covode.recordClassIndex(34091);
        }

        private C28150a() {
        }

        /* synthetic */ C28150a(byte b) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: package-private */
        @Override // com.linecorp.linesdk.p2028a.p2029a.AbstractC28143a
        /* renamed from: a */
        public final /* synthetic */ C28161e mo48132a(JSONObject jSONObject) {
            List asList;
            String string = jSONObject.getString("token_type");
            if ("Bearer".equals(string)) {
                String optString = jSONObject.optString("scope");
                C28160d dVar = new C28160d(jSONObject.getString("access_token"), jSONObject.getLong("expires_in") * 1000, System.currentTimeMillis(), jSONObject.getString("refresh_token"));
                if (TextUtils.isEmpty(optString)) {
                    asList = Collections.emptyList();
                } else {
                    asList = Arrays.asList(optString.split(" "));
                }
                return new C28161e(dVar, asList);
            }
            throw new JSONException("Illegal token type. token_type=".concat(String.valueOf(string)));
        }
    }

    /* renamed from: com.linecorp.linesdk.a.a.b$b */
    static class C28151b extends AbstractC28143a<C28162f> {
        static {
            Covode.recordClassIndex(34092);
        }

        private C28151b() {
        }

        /* synthetic */ C28151b(byte b) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: package-private */
        @Override // com.linecorp.linesdk.p2028a.p2029a.AbstractC28143a
        /* renamed from: a */
        public final /* synthetic */ C28162f mo48132a(JSONObject jSONObject) {
            return new C28162f(jSONObject.getString("otpId"), jSONObject.getString("otp"));
        }
    }

    /* renamed from: com.linecorp.linesdk.a.a.b$c */
    static class C28152c extends AbstractC28143a<C28163g> {
        static {
            Covode.recordClassIndex(34093);
        }

        private C28152c() {
        }

        /* synthetic */ C28152c(byte b) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: package-private */
        @Override // com.linecorp.linesdk.p2028a.p2029a.AbstractC28143a
        /* renamed from: a */
        public final /* synthetic */ C28163g mo48132a(JSONObject jSONObject) {
            String string = jSONObject.getString("token_type");
            if ("Bearer".equals(string)) {
                return new C28163g(jSONObject.getString("access_token"), jSONObject.getLong("expires_in") * 1000, jSONObject.optString("refresh_token"));
            }
            throw new JSONException("Illegal token type. token_type=".concat(String.valueOf(string)));
        }
    }

    /* renamed from: com.linecorp.linesdk.a.a.b$d */
    static class C28153d extends AbstractC28143a<C28157b> {
        static {
            Covode.recordClassIndex(34094);
        }

        private C28153d() {
        }

        /* synthetic */ C28153d(byte b) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: package-private */
        @Override // com.linecorp.linesdk.p2028a.p2029a.AbstractC28143a
        /* renamed from: a */
        public final /* synthetic */ C28157b mo48132a(JSONObject jSONObject) {
            List asList;
            String optString = jSONObject.optString("scope");
            String string = jSONObject.getString("client_id");
            long j = jSONObject.getLong("expires_in") * 1000;
            if (TextUtils.isEmpty(optString)) {
                asList = Collections.emptyList();
            } else {
                asList = Arrays.asList(optString.split(" "));
            }
            return new C28157b(string, j, asList);
        }
    }

    static {
        Covode.recordClassIndex(34090);
    }

    private C28149b(Uri uri, C28144a aVar) {
        this.f65879f = uri;
        this.f65880g = aVar;
    }

    public C28149b(Context context, Uri uri) {
        this(uri, new C28144a(context, "4.0.8"));
    }
}
