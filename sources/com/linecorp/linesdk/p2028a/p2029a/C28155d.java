package com.linecorp.linesdk.p2028a.p2029a;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.linecorp.linesdk.LineProfile;
import com.linecorp.linesdk.p2028a.p2029a.p2030a.AbstractC28146c;
import com.linecorp.linesdk.p2028a.p2029a.p2030a.C28144a;
import org.json.JSONObject;

/* renamed from: com.linecorp.linesdk.a.a.d */
public final class C28155d {

    /* renamed from: a */
    public static final AbstractC28146c<LineProfile> f65882a = new C28156a();

    /* renamed from: b */
    public final Uri f65883b;

    /* renamed from: c */
    public final C28144a f65884c;

    /* renamed from: com.linecorp.linesdk.a.a.d$a */
    static class C28156a extends AbstractC28143a<LineProfile> {
        static {
            Covode.recordClassIndex(34097);
        }

        C28156a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: package-private */
        @Override // com.linecorp.linesdk.p2028a.p2029a.AbstractC28143a
        /* renamed from: a */
        public final /* synthetic */ LineProfile mo48132a(JSONObject jSONObject) {
            Uri parse;
            String optString = jSONObject.optString("pictureUrl", null);
            String string = jSONObject.getString("userId");
            String string2 = jSONObject.getString("displayName");
            if (optString == null) {
                parse = null;
            } else {
                parse = Uri.parse(optString);
            }
            return new LineProfile(string, string2, parse, jSONObject.optString("statusMessage", null));
        }
    }

    static {
        Covode.recordClassIndex(34096);
    }

    private C28155d(Uri uri, C28144a aVar) {
        this.f65883b = uri;
        this.f65884c = aVar;
    }

    public C28155d(Context context, Uri uri) {
        this(uri, new C28144a(context, "4.0.8"));
    }
}
