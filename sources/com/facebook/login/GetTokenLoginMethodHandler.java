package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.facebook.C24798j;
import com.facebook.EnumC24020c;
import com.facebook.internal.AbstractServiceConnectionC24795z;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24699ae;
import com.facebook.internal.C24786y;
import com.facebook.login.LoginClient;
import com.p2082ss.android.ugc.aweme.push.downgrade.C65713d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class GetTokenLoginMethodHandler extends LoginMethodHandler {
    public static final Parcelable.Creator<GetTokenLoginMethodHandler> CREATOR = new Parcelable.Creator() {
        /* class com.facebook.login.GetTokenLoginMethodHandler.C248293 */

        static {
            Covode.recordClassIndex(29008);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new GetTokenLoginMethodHandler[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new GetTokenLoginMethodHandler(parcel);
        }
    };

    /* renamed from: a */
    private C24863c f58913a;

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: a */
    public final String mo40629a() {
        return "get_token";
    }

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(29005);
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: v_ */
    public final void mo40669v_() {
        C24863c cVar = this.f58913a;
        if (cVar != null) {
            cVar.f58829c = false;
            this.f58913a.f58828b = null;
            this.f58913a = null;
        }
    }

    GetTokenLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    GetTokenLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: a */
    public final int mo40628a(final LoginClient.Request request) {
        Intent a;
        C24863c cVar = new C24863c(this.f58965c.f58921c.getActivity(), request.f58934d);
        this.f58913a = cVar;
        if (cVar.f58829c || C24786y.m47476b(cVar.f58831e) == -1 || (a = C24786y.m47460a(cVar.f58827a)) == null) {
            return 0;
        }
        cVar.f58829c = true;
        Context context = cVar.f58827a;
        if (context == null || !(context instanceof Context)) {
            context.bindService(a, cVar, 1);
        } else if (!C65713d.m117625a(context, a)) {
            context.bindService(a, cVar, 1);
        }
        this.f58965c.mo40680d();
        this.f58913a.f58828b = new AbstractServiceConnectionC24795z.AbstractC24797a() {
            /* class com.facebook.login.GetTokenLoginMethodHandler.C248271 */

            static {
                Covode.recordClassIndex(29006);
            }

            @Override // com.facebook.internal.AbstractServiceConnectionC24795z.AbstractC24797a
            /* renamed from: a */
            public final void mo40609a(Bundle bundle) {
                GetTokenLoginMethodHandler.this.mo40666a(request, bundle);
            }
        };
        return 1;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo40667b(LoginClient.Request request, Bundle bundle) {
        this.f58965c.mo40676a(LoginClient.Result.m47587a(this.f58965c.f58925g, m47612a(bundle, EnumC24020c.FACEBOOK_APPLICATION_SERVICE, request.f58934d)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo40666a(final LoginClient.Request request, final Bundle bundle) {
        C24863c cVar = this.f58913a;
        if (cVar != null) {
            cVar.f58828b = null;
        }
        this.f58913a = null;
        LoginClient loginClient = this.f58965c;
        if (loginClient.f58923e != null) {
            loginClient.f58923e.mo40695b();
        }
        if (bundle != null) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            Set<String> set = request.f58932b;
            if (stringArrayList == null || (set != null && !stringArrayList.containsAll(set))) {
                HashSet hashSet = new HashSet();
                for (String str : set) {
                    if (!stringArrayList.contains(str)) {
                        hashSet.add(str);
                    }
                }
                if (!hashSet.isEmpty()) {
                    mo40707a("new_permissions", TextUtils.join(",", hashSet));
                }
                C24699ae.m47301a((Object) hashSet, "permissions");
                request.f58932b = hashSet;
            } else {
                String string = bundle.getString("com.facebook.platform.extra.USER_ID");
                if (string == null || string.isEmpty()) {
                    this.f58965c.mo40680d();
                    C24693ad.m47254a(bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN"), (C24693ad.AbstractC24696a) new C24693ad.AbstractC24696a() {
                        /* class com.facebook.login.GetTokenLoginMethodHandler.C248282 */

                        static {
                            Covode.recordClassIndex(29007);
                        }

                        @Override // com.facebook.internal.C24693ad.AbstractC24696a
                        /* renamed from: a */
                        public final void mo39364a(C24798j jVar) {
                            GetTokenLoginMethodHandler.this.f58965c.mo40677b(LoginClient.Result.m47589a(GetTokenLoginMethodHandler.this.f58965c.f58925g, "Caught exception", jVar.getMessage(), null));
                        }

                        @Override // com.facebook.internal.C24693ad.AbstractC24696a
                        /* renamed from: a */
                        public final void mo39365a(JSONObject jSONObject) {
                            try {
                                bundle.putString("com.facebook.platform.extra.USER_ID", jSONObject.getString("id"));
                                GetTokenLoginMethodHandler.this.mo40667b(request, bundle);
                            } catch (JSONException e) {
                                GetTokenLoginMethodHandler.this.f58965c.mo40677b(LoginClient.Result.m47589a(GetTokenLoginMethodHandler.this.f58965c.f58925g, "Caught exception", e.getMessage(), null));
                            }
                        }
                    });
                    return;
                }
                mo40667b(request, bundle);
                return;
            }
        }
        this.f58965c.mo40679c();
    }
}
