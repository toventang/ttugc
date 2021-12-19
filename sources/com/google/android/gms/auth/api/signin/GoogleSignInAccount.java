package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.system.p1357b.p1358a.p1360b.C18871a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C25569b;
import com.google.android.gms.common.util.AbstractC25603e;
import com.google.android.gms.common.util.C25605g;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C25296d();

    /* renamed from: a */
    public static AbstractC25603e f59977a = C25605g.f60716a;

    /* renamed from: b */
    public String f59978b;

    /* renamed from: c */
    public String f59979c;

    /* renamed from: d */
    public String f59980d;

    /* renamed from: e */
    public String f59981e;

    /* renamed from: f */
    public Uri f59982f;

    /* renamed from: g */
    public String f59983g;

    /* renamed from: h */
    public String f59984h;

    /* renamed from: i */
    public String f59985i;

    /* renamed from: j */
    public String f59986j;

    /* renamed from: k */
    private final int f59987k;

    /* renamed from: l */
    private long f59988l;

    /* renamed from: m */
    private List<Scope> f59989m;

    /* renamed from: n */
    private Set<Scope> f59990n = new HashSet();

    /* renamed from: a */
    public final Account mo41361a() {
        if (this.f59980d == null) {
            return null;
        }
        return new Account(this.f59980d, C18871a.f44691d);
    }

    /* renamed from: b */
    public final Set<Scope> mo41362b() {
        HashSet hashSet = new HashSet(this.f59989m);
        hashSet.addAll(this.f59990n);
        return hashSet;
    }

    static {
        Covode.recordClassIndex(30672);
    }

    public int hashCode() {
        return ((this.f59984h.hashCode() + 527) * 31) + mo41362b().hashCode();
    }

    /* renamed from: c */
    public final JSONObject mo41363c() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f59978b;
            if (str != null) {
                jSONObject.put("id", str);
            }
            String str2 = this.f59979c;
            if (str2 != null) {
                jSONObject.put("tokenId", str2);
            }
            String str3 = this.f59980d;
            if (str3 != null) {
                jSONObject.put("email", str3);
            }
            String str4 = this.f59981e;
            if (str4 != null) {
                jSONObject.put("displayName", str4);
            }
            String str5 = this.f59985i;
            if (str5 != null) {
                jSONObject.put("givenName", str5);
            }
            String str6 = this.f59986j;
            if (str6 != null) {
                jSONObject.put("familyName", str6);
            }
            Uri uri = this.f59982f;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str7 = this.f59983g;
            if (str7 != null) {
                jSONObject.put("serverAuthCode", str7);
            }
            jSONObject.put("expirationTime", this.f59988l);
            jSONObject.put("obfuscatedIdentifier", this.f59984h);
            JSONArray jSONArray = new JSONArray();
            List<Scope> list = this.f59989m;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, C25295c.f60031a);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.f60098a);
            }
            jSONObject.put("grantedScopes", jSONArray);
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.f59984h.equals(this.f59984h) || !googleSignInAccount.mo41362b().equals(mo41362b())) {
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C25569b.m49347a(parcel, 20293);
        C25569b.m49360b(parcel, 1, this.f59987k);
        C25569b.m49353a(parcel, 2, this.f59978b);
        C25569b.m49353a(parcel, 3, this.f59979c);
        C25569b.m49353a(parcel, 4, this.f59980d);
        C25569b.m49353a(parcel, 5, this.f59981e);
        C25569b.m49352a(parcel, 6, this.f59982f, i);
        C25569b.m49353a(parcel, 7, this.f59983g);
        C25569b.m49349a(parcel, 8, this.f59988l);
        C25569b.m49353a(parcel, 9, this.f59984h);
        C25569b.m49361b(parcel, 10, this.f59989m);
        C25569b.m49353a(parcel, 11, this.f59985i);
        C25569b.m49353a(parcel, 12, this.f59986j);
        C25569b.m49359b(parcel, a);
    }

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.f59987k = i;
        this.f59978b = str;
        this.f59979c = str2;
        this.f59980d = str3;
        this.f59981e = str4;
        this.f59982f = uri;
        this.f59983g = str5;
        this.f59988l = j;
        this.f59984h = str6;
        this.f59989m = list;
        this.f59985i = str7;
        this.f59986j = str8;
    }
}
