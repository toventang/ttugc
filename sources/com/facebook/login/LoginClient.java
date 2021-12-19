package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.facebook.AccessToken;
import com.facebook.C24012b;
import com.facebook.C24798j;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24699ae;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class LoginClient implements Parcelable {
    public static final Parcelable.Creator<LoginClient> CREATOR = new Parcelable.Creator<LoginClient>() {
        /* class com.facebook.login.LoginClient.C248311 */

        static {
            Covode.recordClassIndex(29013);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LoginClient[] newArray(int i) {
            return new LoginClient[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LoginClient createFromParcel(Parcel parcel) {
            return new LoginClient(parcel);
        }
    };

    /* renamed from: a */
    LoginMethodHandler[] f58919a;

    /* renamed from: b */
    int f58920b = -1;

    /* renamed from: c */
    public Fragment f58921c;

    /* renamed from: d */
    public AbstractC24836b f58922d;

    /* renamed from: e */
    public AbstractC24835a f58923e;

    /* renamed from: f */
    boolean f58924f;

    /* renamed from: g */
    public Request f58925g;

    /* renamed from: h */
    Map<String, String> f58926h;

    /* renamed from: i */
    Map<String, String> f58927i;

    /* renamed from: j */
    int f58928j;

    /* renamed from: k */
    int f58929k;

    /* renamed from: l */
    private C24868f f58930l;

    /* renamed from: com.facebook.login.LoginClient$a */
    interface AbstractC24835a {
        static {
            Covode.recordClassIndex(29019);
        }

        /* renamed from: a */
        void mo40694a();

        /* renamed from: b */
        void mo40695b();
    }

    /* renamed from: com.facebook.login.LoginClient$b */
    public interface AbstractC24836b {
        static {
            Covode.recordClassIndex(29020);
        }

        /* renamed from: a */
        void mo40696a(Result result);
    }

    public int describeContents() {
        return 0;
    }

    public static class Request implements Parcelable {
        public static final Parcelable.Creator<Request> CREATOR = new Parcelable.Creator<Request>() {
            /* class com.facebook.login.LoginClient.Request.C248321 */

            static {
                Covode.recordClassIndex(29015);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Request[] newArray(int i) {
                return new Request[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Request createFromParcel(Parcel parcel) {
                return new Request(parcel, (byte) 0);
            }
        };

        /* renamed from: a */
        public final EnumC24864d f58931a;

        /* renamed from: b */
        public Set<String> f58932b;

        /* renamed from: c */
        public final EnumC24862b f58933c;

        /* renamed from: d */
        public final String f58934d;

        /* renamed from: e */
        public final String f58935e;

        /* renamed from: f */
        public boolean f58936f;

        /* renamed from: g */
        public String f58937g;

        /* renamed from: h */
        public String f58938h;

        /* renamed from: i */
        public String f58939i;

        public int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(29014);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo40685a() {
            for (String str : this.f58932b) {
                if (LoginManager.m47597a(str)) {
                    return true;
                }
            }
            return false;
        }

        private Request(Parcel parcel) {
            EnumC24864d dVar;
            boolean z;
            String readString = parcel.readString();
            EnumC24862b bVar = null;
            if (readString != null) {
                dVar = EnumC24864d.valueOf(readString);
            } else {
                dVar = null;
            }
            this.f58931a = dVar;
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.f58932b = new HashSet(arrayList);
            String readString2 = parcel.readString();
            this.f58933c = readString2 != null ? EnumC24862b.valueOf(readString2) : bVar;
            this.f58934d = parcel.readString();
            this.f58935e = parcel.readString();
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f58936f = z;
            this.f58937g = parcel.readString();
            this.f58938h = parcel.readString();
            this.f58939i = parcel.readString();
        }

        /* synthetic */ Request(Parcel parcel, byte b) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            String str;
            EnumC24864d dVar = this.f58931a;
            String str2 = null;
            if (dVar != null) {
                str = dVar.name();
            } else {
                str = null;
            }
            parcel.writeString(str);
            parcel.writeStringList(new ArrayList(this.f58932b));
            EnumC24862b bVar = this.f58933c;
            if (bVar != null) {
                str2 = bVar.name();
            }
            parcel.writeString(str2);
            parcel.writeString(this.f58934d);
            parcel.writeString(this.f58935e);
            parcel.writeByte(this.f58936f ? (byte) 1 : 0);
            parcel.writeString(this.f58937g);
            parcel.writeString(this.f58938h);
            parcel.writeString(this.f58939i);
        }

        Request(EnumC24864d dVar, Set<String> set, EnumC24862b bVar, String str, String str2, String str3) {
            this.f58931a = dVar;
            this.f58932b = set == null ? new HashSet<>() : set;
            this.f58933c = bVar;
            this.f58938h = str;
            this.f58934d = str2;
            this.f58935e = str3;
        }
    }

    public static class Result implements Parcelable {
        public static final Parcelable.Creator<Result> CREATOR = new Parcelable.Creator<Result>() {
            /* class com.facebook.login.LoginClient.Result.C248331 */

            static {
                Covode.recordClassIndex(29017);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Result[] newArray(int i) {
                return new Result[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Result createFromParcel(Parcel parcel) {
                return new Result(parcel, (byte) 0);
            }
        };

        /* renamed from: a */
        final EnumC24834a f58940a;

        /* renamed from: b */
        final AccessToken f58941b;

        /* renamed from: c */
        final String f58942c;

        /* renamed from: d */
        final String f58943d;

        /* renamed from: e */
        final Request f58944e;

        /* renamed from: f */
        public Map<String, String> f58945f;

        /* renamed from: g */
        public Map<String, String> f58946g;

        public int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(29016);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.facebook.login.LoginClient$Result$a */
        public enum EnumC24834a {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");
            

            /* renamed from: d */
            public final String f58951d;

            static {
                Covode.recordClassIndex(29018);
            }

            private EnumC24834a(String str) {
                this.f58951d = str;
            }
        }

        private Result(Parcel parcel) {
            this.f58940a = EnumC24834a.valueOf(parcel.readString());
            this.f58941b = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.f58942c = parcel.readString();
            this.f58943d = parcel.readString();
            this.f58944e = (Request) parcel.readParcelable(Request.class.getClassLoader());
            this.f58945f = C24693ad.m47245a(parcel);
            this.f58946g = C24693ad.m47245a(parcel);
        }

        /* synthetic */ Result(Parcel parcel, byte b) {
            this(parcel);
        }

        /* renamed from: a */
        static Result m47587a(Request request, AccessToken accessToken) {
            return new Result(request, EnumC24834a.SUCCESS, accessToken, null, null);
        }

        /* renamed from: a */
        static Result m47588a(Request request, String str) {
            return new Result(request, EnumC24834a.CANCEL, null, str, null);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f58940a.name());
            parcel.writeParcelable(this.f58941b, i);
            parcel.writeString(this.f58942c);
            parcel.writeString(this.f58943d);
            parcel.writeParcelable(this.f58944e, i);
            C24693ad.m47250a(parcel, this.f58945f);
            C24693ad.m47250a(parcel, this.f58946g);
        }

        /* renamed from: a */
        static Result m47589a(Request request, String str, String str2, String str3) {
            return new Result(request, EnumC24834a.ERROR, null, TextUtils.join(": ", C24693ad.m47244a(str, str2)), str3);
        }

        private Result(Request request, EnumC24834a aVar, AccessToken accessToken, String str, String str2) {
            C24699ae.m47301a(aVar, "code");
            this.f58944e = request;
            this.f58941b = accessToken;
            this.f58942c = str;
            this.f58940a = aVar;
            this.f58943d = str2;
        }
    }

    static {
        Covode.recordClassIndex(29012);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo40680d() {
        AbstractC24835a aVar = this.f58923e;
        if (aVar != null) {
            aVar.mo40694a();
        }
    }

    /* renamed from: e */
    static String m47578e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final LoginMethodHandler mo40675a() {
        int i = this.f58920b;
        if (i >= 0) {
            return this.f58919a[i];
        }
        return null;
    }

    /* renamed from: f */
    private C24868f m47579f() {
        C24868f fVar = this.f58930l;
        if (fVar == null || !fVar.mo40764a().equals(this.f58925g.f58934d)) {
            this.f58930l = new C24868f(this.f58921c.getActivity(), this.f58925g.f58934d);
        }
        return this.f58930l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo40678b() {
        if (this.f58924f) {
            return true;
        }
        if (this.f58921c.getActivity().checkCallingOrSelfPermission("android.permission.INTERNET") != 0) {
            ActivityC0945e activity = this.f58921c.getActivity();
            mo40677b(Result.m47589a(this.f58925g, activity.getString(R.string.ahf), activity.getString(R.string.ahe), null));
            return false;
        }
        this.f58924f = true;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo40679c() {
        int i;
        if (this.f58920b >= 0) {
            m47574a(mo40675a().mo40629a(), "skipped", null, null, mo40675a().f58964b);
        }
        while (true) {
            LoginMethodHandler[] loginMethodHandlerArr = this.f58919a;
            if (loginMethodHandlerArr == null || (i = this.f58920b) >= loginMethodHandlerArr.length - 1) {
                Request request = this.f58925g;
            } else {
                this.f58920b = i + 1;
                LoginMethodHandler a = mo40675a();
                if (!a.mo40709f() || mo40678b()) {
                    int a2 = a.mo40628a(this.f58925g);
                    this.f58928j = 0;
                    if (a2 > 0) {
                        C24868f f = m47579f();
                        String str = this.f58925g.f58935e;
                        String a3 = a.mo40629a();
                        if (!C24677a.m47209a(f)) {
                            try {
                                C24868f.m47673a(str).putString("3_method", a3);
                                f.f59033a.mo39478d();
                            } catch (Throwable th) {
                                C24677a.m47208a(th, f);
                            }
                        }
                        this.f58929k = a2;
                        return;
                    }
                    C24868f f2 = m47579f();
                    String str2 = this.f58925g.f58935e;
                    String a4 = a.mo40629a();
                    if (!C24677a.m47209a(f2)) {
                        try {
                            C24868f.m47673a(str2).putString("3_method", a4);
                            f2.f59033a.mo39478d();
                        } catch (Throwable th2) {
                            C24677a.m47208a(th2, f2);
                        }
                    }
                    m47575a("not_tried", a.mo40629a(), true);
                } else {
                    m47575a("no_internet_permission", "1", false);
                }
            }
        }
        Request request2 = this.f58925g;
        if (request2 != null) {
            mo40677b(Result.m47589a(request2, "Login attempt failed.", null, null));
        }
    }

    /* renamed from: d */
    private void m47577d(Result result) {
        AbstractC24836b bVar = this.f58922d;
        if (bVar != null) {
            bVar.mo40696a(result);
        }
    }

    public LoginClient(Fragment fragment) {
        this.f58921c = fragment;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo40677b(Result result) {
        LoginMethodHandler a = mo40675a();
        if (a != null) {
            m47573a(a.mo40629a(), result, a.f58964b);
        }
        Map<String, String> map = this.f58926h;
        if (map != null) {
            result.f58945f = map;
        }
        Map<String, String> map2 = this.f58927i;
        if (map2 != null) {
            result.f58946g = map2;
        }
        this.f58919a = null;
        this.f58920b = -1;
        this.f58925g = null;
        this.f58926h = null;
        this.f58928j = 0;
        this.f58929k = 0;
        m47577d(result);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.facebook.login.LoginMethodHandler[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: com.facebook.login.FacebookLiteLoginMethodHandler */
    /* JADX WARN: Multi-variable type inference failed */
    public LoginClient(Parcel parcel) {
        Parcelable[] readParcelableArray = parcel.readParcelableArray(LoginMethodHandler.class.getClassLoader());
        this.f58919a = new LoginMethodHandler[readParcelableArray.length];
        for (int i = 0; i < readParcelableArray.length; i++) {
            LoginMethodHandler[] loginMethodHandlerArr = this.f58919a;
            loginMethodHandlerArr[i] = readParcelableArray[i];
            loginMethodHandlerArr[i].mo40706a(this);
        }
        this.f58920b = parcel.readInt();
        this.f58925g = (Request) parcel.readParcelable(Request.class.getClassLoader());
        this.f58926h = C24693ad.m47245a(parcel);
        this.f58927i = C24693ad.m47245a(parcel);
    }

    /* renamed from: c */
    private void m47576c(Result result) {
        Result result2;
        if (result.f58941b != null) {
            AccessToken accessToken = C24012b.m45437a().f56861b;
            AccessToken accessToken2 = result.f58941b;
            if (!(accessToken == null || accessToken2 == null)) {
                try {
                    if (accessToken.f56408i.equals(accessToken2.f56408i)) {
                        result2 = Result.m47587a(this.f58925g, result.f58941b);
                        mo40677b(result2);
                        return;
                    }
                } catch (Exception e) {
                    mo40677b(Result.m47589a(this.f58925g, "Caught exception", e.getMessage(), null));
                    return;
                }
            }
            result2 = Result.m47589a(this.f58925g, "User logged in as different Facebook user.", null, null);
            mo40677b(result2);
            return;
        }
        throw new C24798j("Can't validate without a token");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo40676a(Result result) {
        if (result.f58941b == null || !AccessToken.m45056a()) {
            mo40677b(result);
        } else {
            m47576c(result);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelableArray(this.f58919a, i);
        parcel.writeInt(this.f58920b);
        parcel.writeParcelable(this.f58925g, i);
        C24693ad.m47250a(parcel, this.f58926h);
        C24693ad.m47250a(parcel, this.f58927i);
    }

    /* renamed from: a */
    private void m47573a(String str, Result result, Map<String, String> map) {
        m47574a(str, result.f58940a.f58951d, result.f58942c, result.f58943d, map);
    }

    /* renamed from: a */
    private void m47575a(String str, String str2, boolean z) {
        if (this.f58926h == null) {
            this.f58926h = new HashMap();
        }
        if (this.f58926h.containsKey(str) && z) {
            str2 = this.f58926h.get(str) + "," + str2;
        }
        this.f58926h.put(str, str2);
    }

    /* renamed from: a */
    private void m47574a(String str, String str2, String str3, String str4, Map<String, String> map) {
        if (this.f58925g == null) {
            m47579f().mo40767a("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
        } else {
            m47579f().mo40768a(this.f58925g.f58935e, str, str2, str3, str4, map);
        }
    }
}
