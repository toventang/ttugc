package com.bytedance.lobby.google;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.C20891c;
import com.bytedance.lobby.C20892d;
import com.bytedance.lobby.auth.AbstractC20888d;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.internal.LobbyCore;
import com.bytedance.lobby.internal.LobbyViewModel;
import com.bytedance.sdk.p1625a.p1652k.p1653a.AbstractC22464b;
import com.bytedance.sdk.p1625a.p1652k.p1656c.AbstractC22475b;
import com.bytedance.sdk.p1625a.p1652k.p1656c.C22476c;
import com.bytedance.sdk.p1625a.p1652k.p1656c.C22477d;
import com.bytedance.sdk.p1625a.p1652k.p1656c.C22479f;
import java.util.HashSet;
import net.openid.appauth.C89982e;
import net.openid.appauth.p4649a.C89969d;

public class GoogleWebAuth extends GoogleWebAuthProvider implements AbstractC20888d, AbstractC22475b {

    /* renamed from: b */
    private AbstractC22464b.AbstractC22465a f49431b;

    /* renamed from: d */
    private LobbyViewModel f49432d;

    static {
        Covode.recordClassIndex(24504);
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: a */
    public final void mo34324a(int i) {
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: b */
    public final String mo34327b() {
        return null;
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: b */
    public final void mo34328b(ActivityC0945e eVar, Bundle bundle) {
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: a */
    public final void mo34323a() {
        AbstractC22464b.AbstractC22465a aVar = this.f49431b;
        if (aVar != null) {
            aVar.mo36761a();
        }
    }

    @Override // com.bytedance.lobby.internal.AbstractC20915b, com.bytedance.lobby.internal.BaseProvider
    /* renamed from: t_ */
    public final boolean mo34350t_() {
        if (C89969d.m156105a(LobbyCore.getApplication()) != null) {
            return true;
        }
        return false;
    }

    public GoogleWebAuth(C20892d dVar) {
        super(LobbyCore.getApplication(), dVar);
    }

    @Override // com.bytedance.sdk.p1625a.p1652k.p1656c.AbstractC22475b
    /* renamed from: a */
    public final void mo34355a(Bundle bundle) {
        AuthResult.C20883a aVar = new AuthResult.C20883a("google_web", 1);
        aVar.f49377a = true;
        aVar.f49381e = bundle.getString("access_token", "");
        aVar.f49382f = bundle.getString("id_token", "");
        this.f49432d.mo34361b(aVar.mo34319a());
    }

    @Override // com.bytedance.sdk.p1625a.p1652k.p1656c.AbstractC22475b
    /* renamed from: a */
    public final void mo34356a(C22476c cVar) {
        String str;
        if (cVar.f53132c != null) {
            boolean z = true;
            AuthResult.C20883a aVar = new AuthResult.C20883a("google_web", 1);
            aVar.f49377a = false;
            if (TextUtils.isEmpty(cVar.f53132c)) {
                str = "-1";
            } else {
                str = cVar.f53132c;
            }
            C20891c cVar2 = new C20891c(Integer.parseInt(str), cVar.f53133d);
            if (!cVar.f53131b && Integer.parseInt(cVar.f53132c) != C89982e.C89984b.f203901b.code) {
                z = false;
            }
            aVar.f49378b = cVar2.setCancelled(z);
            this.f49432d.mo34361b(aVar.mo34319a());
        }
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: a */
    public final void mo34326a(ActivityC0945e eVar, Bundle bundle) {
        this.f49432d = (LobbyViewModel) C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(LobbyViewModel.class);
        C22479f fVar = new C22479f();
        fVar.f53139c = "code";
        HashSet hashSet = new HashSet();
        hashSet.add("profile");
        fVar.f53137a = hashSet;
        fVar.f53138b = "app_auth";
        fVar.f53140d = Uri.parse(this.f49454c.f49404d.getString("google_auth_redirect_uri", null));
        this.f49431b = ((AbstractC22464b) C22477d.m42420a(AbstractC22464b.class)).mo36760a(eVar, fVar, this);
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: a */
    public final void mo34325a(ActivityC0945e eVar, int i, int i2, Intent intent) {
        AbstractC22464b.AbstractC22465a aVar = this.f49431b;
        if (aVar != null) {
            aVar.mo36765a(i, intent);
        }
    }
}
