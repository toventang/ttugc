package com.bytedance.lobby.instagram;

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

public class InstagramAuth extends InstagramProvider<AuthResult> implements AbstractC20888d {

    /* renamed from: b */
    private static final boolean f49441b = C20879a.f49364a;

    /* renamed from: d */
    private LobbyViewModel f49442d;

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: a */
    public final void mo34323a() {
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

    static {
        Covode.recordClassIndex(24510);
    }

    public InstagramAuth(C20892d dVar) {
        super(LobbyCore.getApplication(), dVar);
    }

    /* renamed from: a */
    private static String m39311a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: b */
    public final void mo34328b(ActivityC0945e eVar, Bundle bundle) {
        C20885b.m39240a(this.f49442d, this.f49454c.f49402b);
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: a */
    public final void mo34326a(ActivityC0945e eVar, Bundle bundle) {
        this.f49442d = LobbyViewModel.m39332a(eVar);
        if (!mo34350t_()) {
            C20885b.m39241a(this.f49442d, "instagram", 1);
            return;
        }
        String str = this.f49454c.f49403c;
        String string = this.f49454c.f49404d.getString("ig_login_auth_url");
        String string2 = this.f49454c.f49404d.getString("ig_redirect_url");
        String string3 = this.f49454c.f49404d.getString("ig_scope", "basic");
        String string4 = this.f49454c.f49404d.getString("ig_response_type", "code");
        Intent intent = new Intent(eVar, InstagramAuthActivity.class);
        intent.putExtra("client_id", str);
        intent.putExtra("login_auth_url", string);
        intent.putExtra("redirect_url", string2);
        intent.putExtra("response_type", string4);
        intent.putExtra("scope", string3);
        eVar.startActivityForResult(intent, 458);
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: a */
    public final void mo34325a(ActivityC0945e eVar, int i, int i2, Intent intent) {
        AuthResult.C20883a aVar = new AuthResult.C20883a(this.f49454c.f49402b, 1);
        if (intent == null) {
            aVar.f49377a = false;
            aVar.f49378b = new C20891c(1, "No intent data received after launching InstagramAuthActivity", "redirect_and_get_token");
            this.f49442d.mo34361b(aVar.mo34319a());
            return;
        }
        if (i2 == -1) {
            String a = m39311a(intent, "ig_result_error_info");
            String a2 = m39311a(intent, "error_stage");
            aVar.f49377a = false;
            aVar.f49378b = new C20891c(4, a, a2);
        } else if (i2 == 0) {
            String a3 = m39311a(intent, "ig_result_error_info");
            String a4 = m39311a(intent, "error_stage");
            aVar.f49377a = false;
            aVar.f49378b = new C20891c(3, a3, a4);
        } else if (i2 != 1) {
            aVar.f49377a = false;
            aVar.f49378b = new C20891c(7, "Unidentified result code in InstagramAuthActivity", "redirect_and_get_token");
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("code", m39311a(intent, "ig_result_code"));
            aVar.f49377a = true;
            aVar.f49385i = bundle;
        }
        this.f49442d.mo34361b(aVar.mo34319a());
    }
}
