package com.facebook;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.C24690aa;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24699ae;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class AccessToken implements Parcelable {
    public static final Parcelable.Creator<AccessToken> CREATOR = new Parcelable.Creator() {
        /* class com.facebook.AccessToken.C238461 */

        static {
            Covode.recordClassIndex(27958);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AccessToken[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AccessToken(parcel);
        }
    };

    /* renamed from: l */
    private static final Date f56396l;

    /* renamed from: m */
    private static final Date f56397m;

    /* renamed from: n */
    private static final Date f56398n = new Date();

    /* renamed from: o */
    private static final EnumC24020c f56399o = EnumC24020c.FACEBOOK_APPLICATION_WEB;

    /* renamed from: a */
    public final Date f56400a;

    /* renamed from: b */
    public final Set<String> f56401b;

    /* renamed from: c */
    public final Set<String> f56402c;

    /* renamed from: d */
    public final Set<String> f56403d;

    /* renamed from: e */
    public final String f56404e;

    /* renamed from: f */
    public final EnumC24020c f56405f;

    /* renamed from: g */
    public final Date f56406g;

    /* renamed from: h */
    public final String f56407h;

    /* renamed from: i */
    public final String f56408i;

    /* renamed from: j */
    public final Date f56409j;

    /* renamed from: k */
    public final String f56410k;

    /* renamed from: com.facebook.AccessToken$a */
    public interface AbstractC23847a {
        static {
            Covode.recordClassIndex(27959);
        }
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: b */
    public final boolean mo39308b() {
        return new Date().after(this.f56400a);
    }

    static {
        Covode.recordClassIndex(27957);
        Date date = new Date(Long.MAX_VALUE);
        f56396l = date;
        f56397m = date;
    }

    /* renamed from: a */
    public static boolean m45056a() {
        AccessToken accessToken = C24012b.m45437a().f56861b;
        if (accessToken == null || accessToken.mo39308b()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final JSONObject mo39309c() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.f56404e);
        jSONObject.put("expires_at", this.f56400a.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.f56401b));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.f56402c));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.f56403d));
        jSONObject.put("last_refresh", this.f56406g.getTime());
        jSONObject.put("source", this.f56405f.name());
        jSONObject.put("application_id", this.f56407h);
        jSONObject.put("user_id", this.f56408i);
        jSONObject.put("data_access_expiration_time", this.f56409j.getTime());
        String str = this.f56410k;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((((((((((((this.f56400a.hashCode() + 527) * 31) + this.f56401b.hashCode()) * 31) + this.f56402c.hashCode()) * 31) + this.f56403d.hashCode()) * 31) + this.f56404e.hashCode()) * 31) + this.f56405f.hashCode()) * 31) + this.f56406g.hashCode()) * 31;
        String str = this.f56407h;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((((hashCode2 + hashCode) * 31) + this.f56408i.hashCode()) * 31) + this.f56409j.hashCode()) * 31;
        String str2 = this.f56410k;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("{AccessToken");
        StringBuilder append = sb.append(" token:");
        if (this.f56404e == null) {
            str = "null";
        } else if (C24872m.m47686a(EnumC25029u.INCLUDE_ACCESS_TOKENS)) {
            str = this.f56404e;
        } else {
            str = "ACCESS_TOKEN_REMOVED";
        }
        append.append(str);
        sb.append(" permissions:");
        if (this.f56401b == null) {
            sb.append("null");
        } else {
            sb.append("[");
            sb.append(TextUtils.join(", ", this.f56401b));
            sb.append("]");
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public static void m45055a(AccessToken accessToken) {
        C24012b.m45437a().mo39534a(accessToken, true);
    }

    AccessToken(Parcel parcel) {
        this.f56400a = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.f56401b = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.f56402c = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.f56403d = Collections.unmodifiableSet(new HashSet(arrayList));
        this.f56404e = parcel.readString();
        this.f56405f = EnumC24020c.valueOf(parcel.readString());
        this.f56406g = new Date(parcel.readLong());
        this.f56407h = parcel.readString();
        this.f56408i = parcel.readString();
        this.f56409j = new Date(parcel.readLong());
        this.f56410k = parcel.readString();
    }

    /* renamed from: a */
    static AccessToken m45053a(Bundle bundle) {
        EnumC24020c cVar;
        List<String> a = m45054a(bundle, "com.facebook.TokenCachingStrategy.Permissions");
        List<String> a2 = m45054a(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
        List<String> a3 = m45054a(bundle, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
        C24699ae.m47301a(bundle, "bundle");
        String string = bundle.getString("com.facebook.TokenCachingStrategy.ApplicationId");
        if (C24693ad.m47261a(string)) {
            C24699ae.m47299a();
            string = C24872m.f59041a;
        }
        C24699ae.m47301a(bundle, "bundle");
        String string2 = bundle.getString("com.facebook.TokenCachingStrategy.Token");
        JSONObject a4 = C24690aa.m47223a(string2);
        if (a4 == null) {
            C24915r a5 = GraphRequest.m45069a(C24693ad.m47285f(string2));
            if (a5.f59155d != null) {
                a4 = null;
            } else {
                a4 = a5.f59153b;
            }
        }
        try {
            String string3 = a4.getString("id");
            C24699ae.m47301a(bundle, "bundle");
            if (bundle.containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource")) {
                cVar = (EnumC24020c) bundle.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource");
            } else if (bundle.getBoolean("com.facebook.TokenCachingStrategy.IsSSO")) {
                cVar = EnumC24020c.FACEBOOK_APPLICATION_WEB;
            } else {
                cVar = EnumC24020c.WEB_VIEW;
            }
            return new AccessToken(string2, string, string3, a, a2, a3, cVar, C25028t.m47990a(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate"), C25028t.m47990a(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate"), null);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) obj;
        if (this.f56400a.equals(accessToken.f56400a) && this.f56401b.equals(accessToken.f56401b) && this.f56402c.equals(accessToken.f56402c) && this.f56403d.equals(accessToken.f56403d) && this.f56404e.equals(accessToken.f56404e) && this.f56405f == accessToken.f56405f && this.f56406g.equals(accessToken.f56406g) && ((str = this.f56407h) != null ? str.equals(accessToken.f56407h) : accessToken.f56407h == null) && this.f56408i.equals(accessToken.f56408i) && this.f56409j.equals(accessToken.f56409j)) {
            String str2 = this.f56410k;
            String str3 = accessToken.f56410k;
            if (str2 != null ? !str2.equals(str3) : str3 != null) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static List<String> m45054a(Bundle bundle, String str) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
        if (stringArrayList == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(new ArrayList(stringArrayList));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f56400a.getTime());
        parcel.writeStringList(new ArrayList(this.f56401b));
        parcel.writeStringList(new ArrayList(this.f56402c));
        parcel.writeStringList(new ArrayList(this.f56403d));
        parcel.writeString(this.f56404e);
        parcel.writeString(this.f56405f.name());
        parcel.writeLong(this.f56406g.getTime());
        parcel.writeString(this.f56407h);
        parcel.writeString(this.f56408i);
        parcel.writeLong(this.f56409j.getTime());
        parcel.writeString(this.f56410k);
    }

    public AccessToken(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, EnumC24020c cVar, Date date, Date date2, Date date3) {
        this(str, str2, str3, collection, collection2, collection3, cVar, date, date2, date3, null);
    }

    public AccessToken(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, EnumC24020c cVar, Date date, Date date2, Date date3, String str4) {
        HashSet hashSet;
        HashSet hashSet2;
        HashSet hashSet3;
        C24699ae.m47302a(str, "accessToken");
        C24699ae.m47302a(str2, "applicationId");
        C24699ae.m47302a(str3, "userId");
        this.f56400a = date == null ? f56397m : date;
        if (collection == null) {
            hashSet = new HashSet();
        }
        this.f56401b = Collections.unmodifiableSet(hashSet);
        if (collection2 == null) {
            hashSet2 = new HashSet();
        }
        this.f56402c = Collections.unmodifiableSet(hashSet2);
        if (collection3 == null) {
            hashSet3 = new HashSet();
        }
        this.f56403d = Collections.unmodifiableSet(hashSet3);
        this.f56404e = str;
        this.f56405f = cVar == null ? f56399o : cVar;
        this.f56406g = date2 == null ? f56398n : date2;
        this.f56407h = str2;
        this.f56408i = str3;
        this.f56409j = (date3 == null || date3.getTime() == 0) ? f56397m : date3;
        this.f56410k = str4;
    }
}
