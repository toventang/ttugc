package com.bytedance.lobby.p1494vk;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import androidx.core.p036g.C0692e;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.C20879a;
import com.bytedance.lobby.C20891c;
import com.bytedance.lobby.C20892d;
import com.bytedance.lobby.auth.AbstractC20888d;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.C20885b;
import com.bytedance.lobby.internal.LobbyViewModel;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p4501vk.api.sdk.C87816VK;
import com.p4501vk.api.sdk.C87831b;
import com.p4501vk.api.sdk.C87860d;
import com.p4501vk.api.sdk.p4502a.AbstractC87823b;
import com.p4501vk.api.sdk.p4502a.C87821a;
import com.p4501vk.api.sdk.p4502a.C87825c;
import com.p4501vk.api.sdk.p4502a.C87827d;
import com.p4501vk.api.sdk.p4502a.C87829e;
import com.p4501vk.api.sdk.p4502a.EnumC87830f;
import com.p4501vk.api.sdk.p4507f.C87893g;
import com.p4501vk.api.sdk.p4509ui.VKWebViewAuthActivity;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lobby.vk.VkAuth */
public class VkAuth extends VkProvider<AuthResult> implements AbstractC20888d, AbstractC87823b {

    /* renamed from: b */
    private static final boolean f49498b = C20879a.f49364a;

    /* renamed from: d */
    private static final EnumC87830f[] f49499d = {EnumC87830f.OFFLINE, EnumC87830f.FRIENDS};

    /* renamed from: e */
    private LobbyViewModel f49500e;

    /* renamed from: f */
    private final Application f49501f;

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: a */
    public final void mo34323a() {
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: a */
    public final void mo34324a(int i) {
    }

    static {
        Covode.recordClassIndex(24540);
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: b */
    public final String mo34327b() {
        if (C87816VK.m152827a() && m39372i() != null) {
            return m39372i().f2750a;
        }
        return null;
    }

    /* renamed from: i */
    private C0692e<String, String> m39372i() {
        Application application = this.f49501f;
        if (application == null) {
            return null;
        }
        SharedPreferences a = C34822d.m71158a(application, "com.bytedance.lobby.vk", 0);
        try {
            String string = a.getString("accessToken", null);
            String string2 = a.getString("uid", null);
            if (!(string == null || TextUtils.isEmpty(string) || string2 == null)) {
                if (!TextUtils.isEmpty(string2)) {
                    return new C0692e<>(string, string2);
                }
            }
        } catch (ClassCastException unused) {
        }
        return null;
    }

    @Override // com.p4501vk.api.sdk.p4502a.AbstractC87823b
    /* renamed from: h */
    public final void mo34389h() {
        AuthResult.C20883a aVar = new AuthResult.C20883a(this.f49454c.f49402b, 1);
        aVar.f49377a = false;
        aVar.f49378b = new C20891c(3, new StringBuilder("Error code: 1. See vk.com/dev/errors").toString());
        this.f49500e.mo34361b(aVar.mo34319a());
    }

    /* renamed from: a */
    private boolean m39371a(EnumC87830f[] fVarArr) {
        if (!C87816VK.m152827a()) {
            return false;
        }
        try {
            Application application = this.f49501f;
            if (application == null) {
                return false;
            }
            String string = C34822d.m71158a(application, "com.bytedance.lobby.vk", 0).getString("VkScopes", "");
            if (string == null) {
                return false;
            }
            if (string.length() == 0) {
                return false;
            }
            for (EnumC87830f fVar : fVarArr) {
                if (!string.contains(fVar.name())) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p4501vk.api.sdk.p4502a.AbstractC87823b
    /* renamed from: a */
    public final void mo34388a(C87821a aVar) {
        if (TextUtils.isEmpty(aVar.f199495b)) {
            AuthResult.C20883a aVar2 = new AuthResult.C20883a(this.f49454c.f49402b, 1);
            aVar2.f49377a = false;
            aVar2.f49378b = new C20891c(3, "accessToken == null");
            this.f49500e.mo34361b(aVar2.mo34319a());
            return;
        }
        Application application = this.f49501f;
        int i = aVar.f199494a;
        String str = aVar.f199495b;
        String str2 = aVar.f199496c;
        C89219l.m154719c(application, "");
        C89219l.m154719c(str, "");
        C89219l.m154719c(application, "");
        C89219l.m154719c(str, "");
        C87821a aVar3 = new C87821a(i, str, str2);
        C87831b bVar = C87816VK.f199480a;
        if (bVar == null) {
            C89219l.m154710a("config");
        }
        aVar3.mo142297a(bVar.f199531q);
        C87860d dVar = C87816VK.f199481b;
        if (dVar == null) {
            C89219l.m154710a("apiManager");
        }
        dVar.mo142340a(str, str2);
        if (this.f49501f != null) {
            StringBuilder sb = new StringBuilder();
            for (EnumC87830f fVar : f49499d) {
                sb.append(fVar.name());
            }
            SharedPreferences.Editor edit = C34822d.m71158a(this.f49501f, "com.bytedance.lobby.vk", 0).edit();
            edit.putString("VkScopes", sb.toString());
            edit.apply();
        }
        Application application2 = this.f49501f;
        if (application2 != null) {
            SharedPreferences.Editor edit2 = C34822d.m71158a(application2, "com.bytedance.lobby.vk", 0).edit();
            edit2.putString("accessToken", aVar.f199495b);
            edit2.putString("uid", new StringBuilder().append(aVar.f199494a).toString());
            edit2.apply();
        }
        m39370a(aVar.f199495b, new StringBuilder().append(aVar.f199494a).toString());
    }

    public VkAuth(C20892d dVar, Application application) {
        super(dVar);
        this.f49501f = application;
    }

    /* renamed from: a */
    private void m39370a(String str, String str2) {
        AuthResult.C20883a aVar = new AuthResult.C20883a(this.f49454c.f49402b, 1);
        aVar.f49377a = true;
        aVar.f49381e = str;
        aVar.f49380d = str2;
        this.f49500e.mo34361b(aVar.mo34319a());
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: a */
    public final void mo34326a(ActivityC0945e eVar, Bundle bundle) {
        List<ResolveInfo> queryIntentActivities;
        this.f49500e = LobbyViewModel.m39332a(eVar);
        if (!mo34350t_()) {
            C20885b.m39241a(this.f49500e, this.f49454c.f49402b, 1);
            return;
        }
        C0692e<String, String> i = m39372i();
        EnumC87830f[] fVarArr = f49499d;
        if (!m39371a(fVarArr) || i == null) {
            List asList = Arrays.asList(fVarArr);
            C89219l.m154719c(eVar, "");
            C89219l.m154719c(asList, "");
            if (C87816VK.f199482c == null) {
                C89219l.m154710a("authManager");
            }
            C89219l.m154719c(eVar, "");
            C89219l.m154719c(asList, "");
            C87827d dVar = new C87827d(C87816VK.m152828b(eVar), asList);
            if (C87893g.m152898a(eVar, "com.vkontakte.android")) {
                C89219l.m154719c(eVar, "");
                C89219l.m154719c("com.vkontakte.android.action.SDK_AUTH", "");
                PackageManager packageManager = eVar.getPackageManager();
                if (!(packageManager == null || (queryIntentActivities = packageManager.queryIntentActivities(new Intent("com.vkontakte.android.action.SDK_AUTH"), 65536)) == null)) {
                    C89219l.m154721d(queryIntentActivities, "");
                    if (!(queryIntentActivities instanceof Collection) ? queryIntentActivities.iterator().hasNext() : !queryIntentActivities.isEmpty()) {
                        Intent intent = new Intent("com.vkontakte.android.action.SDK_AUTH", (Uri) null);
                        intent.setPackage("com.vkontakte.android");
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("client_id", dVar.f199509b);
                        bundle2.putBoolean("revoke", true);
                        bundle2.putString("scope", C89070n.m154551a(dVar.f199508a, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62));
                        bundle2.putString("redirect_url", dVar.f199510c);
                        intent.putExtras(bundle2);
                        eVar.startActivityForResult(intent, 282);
                        return;
                    }
                }
            }
            C89219l.m154719c(eVar, "");
            C89219l.m154719c(dVar, "");
            Intent putExtra = new Intent(eVar, VKWebViewAuthActivity.class).putExtra("vk_auth_params", dVar.mo142300a());
            C89219l.m154709a((Object) putExtra, "");
            eVar.startActivityForResult(putExtra, 282);
            return;
        }
        m39370a((String) i.f2750a, (String) i.f2751b);
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: b */
    public final void mo34328b(ActivityC0945e eVar, Bundle bundle) {
        Application application = this.f49501f;
        if (application != null) {
            C34822d.m71158a(application, "com.bytedance.lobby.vk", 0).edit().remove("accessToken").remove("uid").remove("VkScopes").apply();
        }
        C89219l.m154719c(this.f49501f, "");
        C87825c cVar = C87816VK.f199482c;
        if (cVar == null) {
            C89219l.m154710a("authManager");
        }
        C87821a.C87822a.m152833a(cVar.f199506a);
        C87825c cVar2 = C87816VK.f199482c;
        if (cVar2 == null) {
            C89219l.m154710a("authManager");
        }
        C87821a.C87822a.m152833a(cVar2.f199506a);
        C87831b bVar = C87816VK.f199480a;
        if (bVar == null) {
            C89219l.m154710a("config");
        }
        Context context = bVar.f199515a;
        C89219l.m154719c(context, "");
        CookieManager instance = CookieManager.getInstance();
        if (Build.VERSION.SDK_INT >= 21) {
            instance.removeAllCookies(null);
        } else {
            CookieSyncManager createInstance = CookieSyncManager.createInstance(context);
            createInstance.startSync();
            instance.removeAllCookie();
            createInstance.stopSync();
        }
        AuthResult.C20883a aVar = new AuthResult.C20883a(this.f49454c.f49402b, 2);
        aVar.f49377a = true;
        this.f49500e.mo34361b(aVar.mo34319a());
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: a */
    public final void mo34325a(ActivityC0945e eVar, int i, int i2, Intent intent) {
        C89219l.m154719c(this, "");
        C87825c cVar = C87816VK.f199482c;
        if (cVar == null) {
            C89219l.m154710a("authManager");
        }
        C89219l.m154719c(this, "");
        if (i == 282) {
            if (intent == null) {
                mo34389h();
            } else {
                C87829e a = C87825c.m152837a(intent);
                if (i2 == -1 && a != null && a.f199512b == 0) {
                    C87821a aVar = a.f199511a;
                    if (aVar == null) {
                        C89219l.m154707a();
                    }
                    aVar.mo142297a(cVar.f199506a);
                    C87860d dVar = C87816VK.f199481b;
                    if (dVar == null) {
                        C89219l.m154710a("apiManager");
                    }
                    dVar.mo142340a(a.f199511a.f199495b, a.f199511a.f199496c);
                    mo34388a(a.f199511a);
                } else {
                    mo34389h();
                }
            }
            if (C87816VK.m152827a()) {
                C87816VK.m152829b();
            }
        }
    }
}
