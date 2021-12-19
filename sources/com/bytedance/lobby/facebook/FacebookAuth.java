package com.bytedance.lobby.facebook;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.C20879a;
import com.bytedance.lobby.C20891c;
import com.bytedance.lobby.C20892d;
import com.bytedance.lobby.auth.AbstractC20888d;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.C20885b;
import com.bytedance.lobby.internal.LobbyCore;
import com.bytedance.lobby.internal.LobbyViewModel;
import com.facebook.AbstractC24265e;
import com.facebook.AbstractC24311h;
import com.facebook.AccessToken;
import com.facebook.C24012b;
import com.facebook.C24798j;
import com.facebook.internal.C24739e;
import com.facebook.login.C24870g;

public class FacebookAuth extends FacebookProvider<AuthResult> implements AbstractC20888d, AbstractC24311h<C24870g> {

    /* renamed from: b */
    private static final boolean f49409b = C20879a.f49364a;

    /* renamed from: d */
    private AbstractC24265e f49410d;

    /* renamed from: e */
    private LobbyViewModel f49411e;

    /* renamed from: f */
    private C20903a f49412f;

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: a */
    public final void mo34324a(int i) {
    }

    static {
        Covode.recordClassIndex(24491);
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: b */
    public final String mo34327b() {
        if (C24012b.m45437a().f56861b != null) {
            return C24012b.m45437a().f56861b.f56404e;
        }
        return null;
    }

    @Override // com.facebook.AbstractC24311h
    /* renamed from: c */
    public final void mo34345c() {
        AuthResult.C20883a aVar = new AuthResult.C20883a("facebook", 1);
        aVar.f49377a = false;
        aVar.f49378b = new C20891c(4, "Facebook login cancelled");
        this.f49411e.mo34361b(aVar.mo34319a());
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: a */
    public final void mo34323a() {
        C20903a aVar = this.f49412f;
        if (aVar != null) {
            AbstractC24265e eVar = this.f49410d;
            aVar.getLoginManager();
            if (eVar instanceof C24739e) {
                ((C24739e) eVar).f58712a.remove(Integer.valueOf(C24739e.EnumC24741b.Login.toRequestCode()));
                this.f49412f.onDetachedFromWindow();
                this.f49412f = null;
                return;
            }
            throw new C24798j("Unexpected CallbackManager, please use the provided Factory.");
        }
    }

    public FacebookAuth(C20892d dVar) {
        super(LobbyCore.getApplication(), dVar);
    }

    @Override // com.facebook.AbstractC24311h
    /* renamed from: a */
    public final void mo34343a(C24798j jVar) {
        AuthResult.C20883a aVar = new AuthResult.C20883a("facebook", 1);
        aVar.f49377a = false;
        aVar.f49378b = new C20891c(jVar);
        this.f49411e.mo34361b(aVar.mo34319a());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.facebook.AbstractC24311h
    /* renamed from: a */
    public final /* synthetic */ void mo34344a(C24870g gVar) {
        C24870g gVar2 = gVar;
        AccessToken accessToken = gVar2.f59038a;
        String str = accessToken.f56404e;
        Bundle bundle = new Bundle();
        bundle.putStringArray("fb_granted_permissions", (String[]) accessToken.f56401b.toArray(new String[0]));
        AuthResult.C20883a aVar = new AuthResult.C20883a("facebook", 1);
        aVar.f49377a = true;
        aVar.f49381e = str;
        aVar.f49383g = gVar2.f59038a.f56400a.getTime();
        aVar.f49380d = gVar2.f59038a.f56408i;
        aVar.f49385i = bundle;
        this.f49411e.mo34361b(aVar.mo34319a());
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: b */
    public final void mo34328b(ActivityC0945e eVar, Bundle bundle) {
        C20885b.m39240a(this.f49411e, this.f49454c.f49402b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003a, code lost:
        if (android.text.TextUtils.isEmpty(r3) != false) goto L_0x003c;
     */
    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34326a(androidx.fragment.app.ActivityC0945e r6, android.os.Bundle r7) {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lobby.facebook.FacebookAuth.mo34326a(androidx.fragment.app.e, android.os.Bundle):void");
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: a */
    public final void mo34325a(ActivityC0945e eVar, int i, int i2, Intent intent) {
        AbstractC24265e eVar2 = this.f49410d;
        if (eVar2 != null) {
            eVar2.mo40035a(i, i2, intent);
            return;
        }
        AuthResult.C20883a aVar = new AuthResult.C20883a("facebook", 1);
        aVar.f49377a = false;
        aVar.f49378b = new C20891c(3, "Facebook CallbackManager is null");
        this.f49411e.mo34361b(aVar.mo34319a());
    }
}
