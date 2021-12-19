package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24699ae;
import com.facebook.internal.C24752l;
import com.facebook.internal.C24768q;
import com.facebook.internal.C24770r;
import com.kakao.usermgmt.StringSet;
import java.net.HttpURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public final class FacebookRequestError implements Parcelable {
    public static final Parcelable.Creator<FacebookRequestError> CREATOR = new Parcelable.Creator<FacebookRequestError>() {
        /* class com.facebook.FacebookRequestError.C238501 */

        static {
            Covode.recordClassIndex(27968);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ FacebookRequestError[] newArray(int i) {
            return new FacebookRequestError[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FacebookRequestError createFromParcel(Parcel parcel) {
            return new FacebookRequestError(parcel, (byte) 0);
        }
    };

    /* renamed from: a */
    static final C23852b f56429a = new C23852b((byte) 0);

    /* renamed from: b */
    public final EnumC23851a f56430b;

    /* renamed from: c */
    public final int f56431c;

    /* renamed from: d */
    public final int f56432d;

    /* renamed from: e */
    public final int f56433e;

    /* renamed from: f */
    public final String f56434f;

    /* renamed from: g */
    public final String f56435g;

    /* renamed from: h */
    public final String f56436h;

    /* renamed from: i */
    public final String f56437i;

    /* renamed from: j */
    public final JSONObject f56438j;

    /* renamed from: k */
    public final JSONObject f56439k;

    /* renamed from: l */
    public final Object f56440l;

    /* renamed from: m */
    public final HttpURLConnection f56441m;

    /* renamed from: n */
    public final C24798j f56442n;

    /* renamed from: o */
    private final String f56443o;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.FacebookRequestError$b */
    public static class C23852b {

        /* renamed from: a */
        final int f56445a;

        /* renamed from: b */
        final int f56446b;

        static {
            Covode.recordClassIndex(27970);
        }

        private C23852b() {
            this.f56445a = 200;
            this.f56446b = 299;
        }

        /* synthetic */ C23852b(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo39341a() {
        String str = this.f56443o;
        if (str != null) {
            return str;
        }
        return this.f56442n.getLocalizedMessage();
    }

    static {
        Covode.recordClassIndex(27967);
    }

    /* renamed from: com.facebook.FacebookRequestError$a */
    public enum EnumC23851a {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT;

        static {
            Covode.recordClassIndex(27969);
        }
    }

    /* renamed from: b */
    private static synchronized C24752l m45065b() {
        synchronized (FacebookRequestError.class) {
            MethodCollector.m26663i(7038);
            C24699ae.m47299a();
            C24768q a = C24770r.m47425a(C24872m.f59041a);
            if (a == null) {
                C24752l a2 = C24752l.m47398a();
                MethodCollector.m26664o(7038);
                return a2;
            }
            C24752l lVar = a.f58760h;
            MethodCollector.m26664o(7038);
            return lVar;
        }
    }

    public final String toString() {
        return "{HttpStatus: " + this.f56431c + ", errorCode: " + this.f56432d + ", subErrorCode: " + this.f56433e + ", errorType: " + this.f56434f + ", errorMessage: " + mo39341a() + "}";
    }

    private FacebookRequestError(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), false, null, null, null, null, null);
    }

    /* synthetic */ FacebookRequestError(Parcel parcel, byte b) {
        this(parcel);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f56431c);
        parcel.writeInt(this.f56432d);
        parcel.writeInt(this.f56433e);
        parcel.writeString(this.f56434f);
        parcel.writeString(this.f56443o);
        parcel.writeString(this.f56435g);
        parcel.writeString(this.f56436h);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    FacebookRequestError(java.net.HttpURLConnection r15, java.lang.Exception r16) {
        /*
            r14 = this;
            r13 = r16
            boolean r0 = r13 instanceof com.facebook.C24798j
            if (r0 == 0) goto L_0x0019
            com.facebook.j r13 = (com.facebook.C24798j) r13
        L_0x0008:
            r1 = -1
            r2 = -1
            r3 = -1
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r0 = r14
            r12 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x0019:
            com.facebook.j r0 = new com.facebook.j
            r0.<init>(r13)
            r13 = r0
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookRequestError.<init>(java.net.HttpURLConnection, java.lang.Exception):void");
    }

    public FacebookRequestError(int i, String str, String str2) {
        this(-1, i, -1, str, str2, null, null, false, null, null, null, null, null);
    }

    /* renamed from: a */
    static FacebookRequestError m45064a(JSONObject jSONObject, Object obj, HttpURLConnection httpURLConnection) {
        JSONObject jSONObject2;
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        int i2;
        try {
            if (jSONObject.has("code")) {
                int i3 = jSONObject.getInt("code");
                Object a = C24693ad.m47231a(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
                if (a != null && (a instanceof JSONObject)) {
                    JSONObject jSONObject3 = (JSONObject) a;
                    if (jSONObject3.has("error")) {
                        JSONObject jSONObject4 = (JSONObject) C24693ad.m47231a(jSONObject3, "error", (String) null);
                        str4 = jSONObject4.optString(StringSet.type, null);
                        str3 = jSONObject4.optString("message", null);
                        i2 = jSONObject4.optInt("code", -1);
                        i = jSONObject4.optInt("error_subcode", -1);
                        str = jSONObject4.optString("error_user_msg", null);
                        str2 = jSONObject4.optString("error_user_title", null);
                        z = jSONObject4.optBoolean("is_transient", false);
                    } else if (jSONObject3.has("error_code") || jSONObject3.has("error_msg") || jSONObject3.has("error_reason")) {
                        str4 = jSONObject3.optString("error_reason", null);
                        str3 = jSONObject3.optString("error_msg", null);
                        i2 = jSONObject3.optInt("error_code", -1);
                        i = jSONObject3.optInt("error_subcode", -1);
                        str2 = null;
                        str = null;
                        z = false;
                    }
                    return new FacebookRequestError(i3, i2, i, str4, str3, str2, str, z, jSONObject3, jSONObject, obj, httpURLConnection, null);
                }
                C23852b bVar = f56429a;
                if (bVar.f56445a > i3 || i3 > bVar.f56446b) {
                    if (jSONObject.has("body")) {
                        jSONObject2 = (JSONObject) C24693ad.m47231a(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
                    } else {
                        jSONObject2 = null;
                    }
                    return new FacebookRequestError(i3, -1, -1, null, null, null, null, false, jSONObject2, jSONObject, obj, httpURLConnection, null);
                }
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private FacebookRequestError(int r5, int r6, int r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, boolean r12, org.json.JSONObject r13, org.json.JSONObject r14, java.lang.Object r15, java.net.HttpURLConnection r16, com.facebook.C24798j r17) {
        /*
        // Method dump skipped, instructions count: 220
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookRequestError.<init>(int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, org.json.JSONObject, org.json.JSONObject, java.lang.Object, java.net.HttpURLConnection, com.facebook.j):void");
    }
}
