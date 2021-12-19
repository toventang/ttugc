package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.signin.internal.C25301a;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.AbstractC25350d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C25569b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInOptions extends AbstractSafeParcelable implements AbstractC25350d, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new C25298f();

    /* renamed from: a */
    public static final Scope f59998a = new Scope("profile");

    /* renamed from: b */
    public static final Scope f59999b = new Scope("email");

    /* renamed from: c */
    public static final Scope f60000c = new Scope("openid");

    /* renamed from: d */
    public static final Scope f60001d;

    /* renamed from: e */
    public static final Scope f60002e = new Scope("https://www.googleapis.com/auth/games");

    /* renamed from: f */
    public static final GoogleSignInOptions f60003f = new C25292a().mo41374a().mo41377b().mo41378c();

    /* renamed from: g */
    public static final GoogleSignInOptions f60004g;

    /* renamed from: s */
    private static Comparator<Scope> f60005s = new C25297e();

    /* renamed from: h */
    final ArrayList<Scope> f60006h;

    /* renamed from: i */
    public Account f60007i;

    /* renamed from: j */
    public boolean f60008j;

    /* renamed from: k */
    public final boolean f60009k;

    /* renamed from: l */
    public final boolean f60010l;

    /* renamed from: m */
    public String f60011m;

    /* renamed from: n */
    String f60012n;

    /* renamed from: o */
    public ArrayList<GoogleSignInOptionsExtensionParcelable> f60013o;

    /* renamed from: p */
    public String f60014p;

    /* renamed from: q */
    private final int f60015q;

    /* renamed from: r */
    private Map<Integer, GoogleSignInOptionsExtensionParcelable> f60016r;

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions$a */
    public static final class C25292a {

        /* renamed from: a */
        public Set<Scope> f60017a = new HashSet();

        /* renamed from: b */
        public boolean f60018b;

        /* renamed from: c */
        public boolean f60019c;

        /* renamed from: d */
        public boolean f60020d;

        /* renamed from: e */
        public String f60021e;

        /* renamed from: f */
        public String f60022f;

        /* renamed from: g */
        private Account f60023g;

        /* renamed from: h */
        private String f60024h;

        /* renamed from: i */
        private Map<Integer, GoogleSignInOptionsExtensionParcelable> f60025i = new HashMap();

        static {
            Covode.recordClassIndex(30677);
        }

        /* renamed from: a */
        public final C25292a mo41374a() {
            this.f60017a.add(GoogleSignInOptions.f60000c);
            return this;
        }

        /* renamed from: b */
        public final C25292a mo41377b() {
            this.f60017a.add(GoogleSignInOptions.f59998a);
            return this;
        }

        public C25292a() {
        }

        /* renamed from: c */
        public final GoogleSignInOptions mo41378c() {
            if (this.f60017a.contains(GoogleSignInOptions.f60002e) && this.f60017a.contains(GoogleSignInOptions.f60001d)) {
                this.f60017a.remove(GoogleSignInOptions.f60001d);
            }
            if (this.f60020d && (this.f60023g == null || !this.f60017a.isEmpty())) {
                mo41374a();
            }
            return new GoogleSignInOptions(new ArrayList(this.f60017a), this.f60023g, this.f60020d, this.f60018b, this.f60019c, this.f60021e, this.f60024h, this.f60025i, this.f60022f);
        }

        /* renamed from: a */
        public final String mo41376a(String str) {
            boolean z;
            C25565r.m49316a(str);
            String str2 = this.f60021e;
            if (str2 == null || str2.equals(str)) {
                z = true;
            } else {
                z = false;
            }
            C25565r.m49325b(z, "two different server client ids provided");
            return str;
        }

        public C25292a(GoogleSignInOptions googleSignInOptions) {
            C25565r.m49314a(googleSignInOptions);
            this.f60017a = new HashSet(googleSignInOptions.f60006h);
            this.f60018b = googleSignInOptions.f60009k;
            this.f60019c = googleSignInOptions.f60010l;
            this.f60020d = googleSignInOptions.f60008j;
            this.f60021e = googleSignInOptions.f60011m;
            this.f60023g = googleSignInOptions.f60007i;
            this.f60024h = googleSignInOptions.f60012n;
            this.f60025i = GoogleSignInOptions.m48624b(googleSignInOptions.f60013o);
            this.f60022f = googleSignInOptions.f60014p;
        }

        /* renamed from: a */
        public final C25292a mo41375a(Scope scope, Scope... scopeArr) {
            this.f60017a.add(scope);
            this.f60017a.addAll(Arrays.asList(scopeArr));
            return this;
        }
    }

    /* renamed from: a */
    public final ArrayList<Scope> mo41369a() {
        return new ArrayList<>(this.f60006h);
    }

    static {
        Covode.recordClassIndex(30676);
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f60001d = scope;
        f60004g = new C25292a().mo41375a(scope, new Scope[0]).mo41378c();
    }

    /* renamed from: b */
    public final JSONObject mo41370b() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f60006h, f60005s);
            ArrayList<Scope> arrayList = this.f60006h;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Scope scope = arrayList.get(i);
                i++;
                jSONArray.put(scope.f60098a);
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f60007i;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f60008j);
            jSONObject.put("forceCodeForRefreshToken", this.f60010l);
            jSONObject.put("serverAuthRequested", this.f60009k);
            if (!TextUtils.isEmpty(this.f60011m)) {
                jSONObject.put("serverClientId", this.f60011m);
            }
            if (!TextUtils.isEmpty(this.f60012n)) {
                jSONObject.put("hostedDomain", this.f60012n);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.f60006h;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Scope scope = arrayList2.get(i);
            i++;
            arrayList.add(scope.f60098a);
        }
        Collections.sort(arrayList);
        return new C25301a().mo41398a(arrayList).mo41398a(this.f60007i).mo41398a(this.f60011m).mo41399a(this.f60010l).mo41399a(this.f60008j).mo41399a(this.f60009k).mo41398a(this.f60014p).f60045a;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Map<Integer, GoogleSignInOptionsExtensionParcelable> m48624b(List<GoogleSignInOptionsExtensionParcelable> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable : list) {
            hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.f60032a), googleSignInOptionsExtensionParcelable);
        }
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r4.f60007i == null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        if (android.text.TextUtils.isEmpty(r4.f60011m) != false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
        // Method dump skipped, instructions count: 128
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C25569b.m49347a(parcel, 20293);
        C25569b.m49360b(parcel, 1, this.f60015q);
        C25569b.m49361b(parcel, 2, mo41369a());
        C25569b.m49352a(parcel, 3, this.f60007i, i);
        C25569b.m49355a(parcel, 4, this.f60008j);
        C25569b.m49355a(parcel, 5, this.f60009k);
        C25569b.m49355a(parcel, 6, this.f60010l);
        C25569b.m49353a(parcel, 7, this.f60011m);
        C25569b.m49353a(parcel, 8, this.f60012n);
        C25569b.m49361b(parcel, 9, this.f60013o);
        C25569b.m49353a(parcel, 10, this.f60014p);
        C25569b.m49359b(parcel, a);
    }

    /* synthetic */ GoogleSignInOptions(ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3) {
        this(3, arrayList, account, z, z2, z3, str, str2, map, str3);
    }

    GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList2, String str3) {
        this(i, arrayList, account, z, z2, z3, str, str2, m48624b(arrayList2), str3);
    }

    public GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, GoogleSignInOptionsExtensionParcelable> map, String str3) {
        this.f60015q = i;
        this.f60006h = arrayList;
        this.f60007i = account;
        this.f60008j = z;
        this.f60009k = z2;
        this.f60010l = z3;
        this.f60011m = str;
        this.f60012n = str2;
        this.f60013o = new ArrayList<>(map.values());
        this.f60016r = map;
        this.f60014p = str3;
    }
}
