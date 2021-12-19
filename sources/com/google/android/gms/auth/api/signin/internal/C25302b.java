package com.google.android.gms.auth.api.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.system.p1357b.p1358a.p1360b.C18871a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C25565r;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.auth.api.signin.internal.b */
public final class C25302b {

    /* renamed from: c */
    private static final Lock f60046c = new ReentrantLock();

    /* renamed from: d */
    private static C25302b f60047d;

    /* renamed from: a */
    final Lock f60048a = new ReentrantLock();

    /* renamed from: b */
    final SharedPreferences f60049b;

    static {
        Covode.recordClassIndex(30692);
    }

    /* renamed from: a */
    public final GoogleSignInAccount mo41400a() {
        return m48643b(mo41401a("defaultGoogleSignInAccount"));
    }

    /* renamed from: b */
    public final GoogleSignInOptions mo41403b() {
        return m48645c(mo41401a("defaultGoogleSignInAccount"));
    }

    private C25302b(Context context) {
        this.f60049b = C34822d.m71158a(context, "com.google.android.gms.signin", 0);
    }

    /* renamed from: a */
    public final String mo41401a(String str) {
        this.f60048a.lock();
        try {
            return this.f60049b.getString(str, null);
        } finally {
            this.f60048a.unlock();
        }
    }

    /* renamed from: a */
    public static C25302b m48642a(Context context) {
        C25565r.m49314a(context);
        Lock lock = f60046c;
        lock.lock();
        try {
            if (f60047d == null) {
                Context applicationContext = context.getApplicationContext();
                if (C58003a.f132201c) {
                    if (applicationContext == null) {
                        applicationContext = C58003a.f132199a;
                    }
                }
                f60047d = new C25302b(applicationContext);
            }
            C25302b bVar = f60047d;
            lock.unlock();
            return bVar;
        } catch (Throwable th) {
            f60046c.unlock();
            throw th;
        }
    }

    /* renamed from: b */
    private final GoogleSignInAccount m48643b(String str) {
        String a;
        if (!TextUtils.isEmpty(str) && (a = mo41401a(m48644b("googleSignInAccount", str))) != null) {
            try {
                if (TextUtils.isEmpty(a)) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(a);
                String optString = jSONObject.optString("photoUrl", null);
                Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
                long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
                HashSet hashSet = new HashSet();
                JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    hashSet.add(new Scope(jSONArray.getString(i)));
                }
                String optString2 = jSONObject.optString("id");
                String optString3 = jSONObject.optString("tokenId", null);
                String optString4 = jSONObject.optString("email", null);
                String optString5 = jSONObject.optString("displayName", null);
                String optString6 = jSONObject.optString("givenName", null);
                String optString7 = jSONObject.optString("familyName", null);
                Long valueOf = Long.valueOf(parseLong);
                String string = jSONObject.getString("obfuscatedIdentifier");
                if (valueOf == null) {
                    valueOf = Long.valueOf(GoogleSignInAccount.f59977a.mo41857a() / 1000);
                }
                GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, valueOf.longValue(), C25565r.m49316a(string), new ArrayList((Collection) C25565r.m49314a(hashSet)), optString6, optString7);
                googleSignInAccount.f59983g = jSONObject.optString("serverAuthCode", null);
                return googleSignInAccount;
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    private final GoogleSignInOptions m48645c(String str) {
        String a;
        if (!TextUtils.isEmpty(str) && (a = mo41401a(m48644b("googleSignInOptions", str))) != null) {
            try {
                if (TextUtils.isEmpty(a)) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(a);
                HashSet hashSet = new HashSet();
                JSONArray jSONArray = jSONObject.getJSONArray("scopes");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    hashSet.add(new Scope(jSONArray.getString(i)));
                }
                String optString = jSONObject.optString("accountName", null);
                return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, C18871a.f44691d) : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.optString("serverClientId", null), jSONObject.optString("hostedDomain", null), new HashMap(), (String) null);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    static String m48644b(String str, String str2) {
        return new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length()).append(str).append(":").append(str2).toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo41402a(String str, String str2) {
        this.f60048a.lock();
        try {
            this.f60049b.edit().putString(str, str2).apply();
        } finally {
            this.f60048a.unlock();
        }
    }
}
