package com.bytedance.lobby.google;

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
import com.bytedance.lobby.p1493b.C20890a;
import com.google.android.gms.auth.api.C25253a;
import com.google.android.gms.auth.api.signin.C25294b;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.AbstractC25357i;
import com.google.android.gms.common.api.AbstractC25486q;
import com.google.android.gms.common.api.C25335a;
import com.google.android.gms.common.api.C25351e;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C25525b;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.p1940d.AbstractC25631h;
import com.google.android.gms.p1940d.C25635k;
import java.lang.ref.WeakReference;
import java.util.List;

public class GoogleAuth extends GoogleProvider<AuthResult> implements AbstractC20888d, AbstractC25357i.AbstractC25359b {

    /* renamed from: b */
    static final boolean f49414b = C20879a.f49364a;

    /* renamed from: d */
    private int f49415d;

    /* renamed from: e */
    private Bundle f49416e;

    /* renamed from: f */
    private WeakReference<ActivityC0945e> f49417f;

    /* renamed from: g */
    private boolean f49418g;

    /* renamed from: h */
    private AbstractC25357i f49419h;

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: a */
    public final void mo34324a(int i) {
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: b */
    public final String mo34327b() {
        return null;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25449e
    /* renamed from: b */
    public final void mo34349b(int i) {
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: a */
    public final void mo34323a() {
        if (this.f49419h != null) {
            this.f49419h = null;
        }
    }

    static {
        Covode.recordClassIndex(24495);
    }

    @Override // com.bytedance.lobby.internal.AbstractC20915b, com.bytedance.lobby.internal.BaseProvider
    /* renamed from: t_ */
    public final boolean mo34350t_() {
        boolean z;
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(LobbyCore.getApplication()) == 0) {
                z = true;
                if (super.mo34350t_() || !z) {
                    return false;
                }
                return true;
            }
        } catch (Exception unused) {
        }
        z = false;
        if (super.mo34350t_()) {
        }
        return false;
    }

    public GoogleAuth(C20892d dVar) {
        super(LobbyCore.getApplication(), dVar);
    }

    /* renamed from: b */
    private GoogleSignInOptions m39271b(Bundle bundle) {
        GoogleSignInOptions.C25292a aVar = new GoogleSignInOptions.C25292a(GoogleSignInOptions.f60003f);
        if (bundle.getBoolean("google_request_profile", true)) {
            aVar.mo41377b();
        }
        if (bundle.getBoolean("google_request_id", true)) {
            aVar.mo41374a();
        }
        if (bundle.getBoolean("google_request_email", true)) {
            aVar.f60017a.add(GoogleSignInOptions.f59999b);
        }
        if (bundle.getBoolean("google_request_id_token", true)) {
            String str = this.f49454c.f49403c;
            aVar.f60020d = true;
            aVar.f60021e = aVar.mo41376a(str);
        }
        if (bundle.getBoolean("google_request_server_auth_code", false)) {
            boolean z = bundle.getBoolean("google_force_refresh_token", false);
            String str2 = this.f49454c.f49403c;
            aVar.f60018b = true;
            aVar.f60021e = aVar.mo41376a(str2);
            aVar.f60019c = z;
        }
        return aVar.mo41378c();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25449e
    /* renamed from: a */
    public final void mo34348a(Bundle bundle) {
        ActivityC0945e eVar;
        WeakReference<ActivityC0945e> weakReference = this.f49417f;
        if (weakReference != null) {
            eVar = weakReference.get();
        } else {
            eVar = null;
        }
        if (this.f49418g && eVar != null) {
            this.f49418g = false;
            AbstractC25357i a = m39268a(eVar, m39271b(this.f49416e));
            m39270a(a, new C20911d(this, eVar, a));
        }
    }

    /* renamed from: a */
    static void m39269a(ActivityC0945e eVar, AbstractC25357i iVar) {
        eVar.startActivityForResult(C25253a.f59872h.mo41382a(iVar), 101);
    }

    /* renamed from: a */
    private static void m39270a(AbstractC25357i iVar, AbstractC25486q<Status> qVar) {
        if (iVar.mo41533g()) {
            C25253a.f59872h.mo41383b(iVar).mo41543a(new C20909b(qVar));
        }
    }

    /* renamed from: a */
    private AbstractC25357i m39268a(ActivityC0945e eVar, GoogleSignInOptions googleSignInOptions) {
        if (this.f49419h == null) {
            AbstractC25357i.C25358a aVar = new AbstractC25357i.C25358a(eVar);
            C25335a<GoogleSignInOptions> aVar2 = C25253a.f59869e;
            C25565r.m49315a(aVar2, "Api must not be null");
            C25565r.m49315a(googleSignInOptions, "Null options are not permitted for this Api");
            aVar.f60135c.put(aVar2, googleSignInOptions);
            List<Scope> a = aVar2.f60111a.mo41327a(googleSignInOptions);
            aVar.f60134b.addAll(a);
            aVar.f60133a.addAll(a);
            this.f49419h = aVar.mo41536a(this).mo41537a();
        }
        return this.f49419h;
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: a */
    public final void mo34326a(ActivityC0945e eVar, Bundle bundle) {
        LobbyViewModel a = LobbyViewModel.m39332a(eVar);
        if (!mo34350t_()) {
            C20885b.m39241a(a, "google", 1);
            return;
        }
        this.f49417f = new WeakReference<>(eVar);
        this.f49416e = bundle;
        AbstractC25357i a2 = m39268a(eVar, m39271b(bundle));
        if (bundle.getBoolean("google_force_sign_out", true)) {
            a2.mo41531e();
            if (a2.mo41533g()) {
                m39270a(a2, new C20908a(this, eVar, a2));
            } else {
                this.f49418g = true;
            }
        } else {
            m39269a(eVar, a2);
        }
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: b */
    public final void mo34328b(ActivityC0945e eVar, Bundle bundle) {
        LobbyViewModel a = LobbyViewModel.m39332a(eVar);
        if (!mo34350t_()) {
            C20885b.m39241a(a, "google", 2);
            return;
        }
        AbstractC25357i a2 = m39268a(eVar, m39271b(bundle));
        if (a2.mo41533g()) {
            m39270a(a2, new C20910c(a));
            return;
        }
        AuthResult.C20883a aVar = new AuthResult.C20883a("google", 2);
        aVar.f49377a = false;
        aVar.f49378b = new C20891c(new IllegalStateException("GoogleApiClient is not connected yet"));
        a.mo34361b(aVar.mo34319a());
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: a */
    public final void mo34325a(ActivityC0945e eVar, int i, int i2, Intent intent) {
        C25294b bVar;
        AbstractC25631h hVar;
        C25351e e;
        C20891c cVar;
        this.f49417f = new WeakReference<>(eVar);
        GoogleSignInAccount googleSignInAccount = null;
        if (intent == null) {
            bVar = new C25294b(null, Status.f60102c);
        } else {
            Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
            GoogleSignInAccount googleSignInAccount2 = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
            if (googleSignInAccount2 == null) {
                if (status == null) {
                    status = Status.f60102c;
                }
                bVar = new C25294b(null, status);
            } else {
                bVar = new C25294b(googleSignInAccount2, Status.f60100a);
            }
        }
        GoogleSignInAccount googleSignInAccount3 = bVar.f60030b;
        if (!bVar.f60029a.mo41477c() || googleSignInAccount3 == null) {
            hVar = C25635k.m49511a((Exception) C25525b.m49218a(bVar.f60029a));
        } else {
            hVar = C25635k.m49512a(googleSignInAccount3);
        }
        try {
            e = null;
            googleSignInAccount = (GoogleSignInAccount) hVar.mo41877a(C25351e.class);
        } catch (C25351e e2) {
            e = e2;
        }
        if (googleSignInAccount == null) {
            if (e != null) {
                int statusCode = e.getStatusCode();
                if (statusCode == 7 || statusCode == 8) {
                    int i3 = this.f49415d + 1;
                    this.f49415d = i3;
                    if (i3 <= 3) {
                        mo34326a(eVar, this.f49416e);
                        return;
                    }
                }
                if (statusCode == 5) {
                    cVar = new C20891c(3, statusCode, "The client attempted to connect to the service with an invalid account name specified");
                } else if (statusCode == 6) {
                    cVar = new C20891c(3, statusCode, "Completing the operation requires some form of resolution");
                } else if (statusCode == 7) {
                    cVar = new C20891c(5, statusCode, "Google network error occurred. Retrying should resolve the problem");
                } else if (statusCode == 8) {
                    cVar = new C20891c(3, statusCode, "Google internal error occurred. Retrying should resolve the problem");
                } else if (statusCode == 13) {
                    cVar = new C20891c(7, statusCode, "The operation failed with no more detailed information from Google");
                } else if (statusCode == 15) {
                    cVar = new C20891c(-999, statusCode, "Timed out while awaiting the result");
                } else if (statusCode != 16) {
                    switch (statusCode) {
                        case 12500:
                            cVar = new C20891c(3, statusCode, "Sign in failed with the selected Google account. There is nothing user can do to recover from the sign in failure. Switching to another account may or may not help. Check adb log to see details if any");
                            break;
                        case 12501:
                            cVar = new C20891c(4, statusCode, "The sign in was cancelled by the user. i.e. user cancelled some of the sign in resolutions, e.g. account picking or OAuth consent");
                            break;
                        case 12502:
                            cVar = new C20891c(-999, statusCode, "A sign in process is currently in progress and the current one cannot continue. e.g. the user clicks the SignInButton multiple times and more than one sign in intent was launched");
                            break;
                        default:
                            cVar = new C20891c(7, statusCode, "Unknown error code = " + statusCode + ", check documentation");
                            break;
                    }
                } else {
                    cVar = new C20891c(4, statusCode, "The result was canceled either due to client disconnect or cancel()");
                }
            } else {
                cVar = new C20891c(6, "GoogleSignInAccount and ApiException are both null");
            }
            AuthResult.C20883a aVar = new AuthResult.C20883a("google", 1);
            aVar.f49377a = false;
            aVar.f49378b = cVar;
            LobbyViewModel.m39332a(eVar).mo34361b(aVar.mo34319a());
            return;
        }
        AuthResult.C20883a aVar2 = new AuthResult.C20883a("google", 1);
        aVar2.f49377a = true;
        aVar2.f49380d = googleSignInAccount.f59978b;
        aVar2.f49385i = new C20890a().mo34330a("email", googleSignInAccount.f59980d).mo34330a("display_name", googleSignInAccount.f59981e).mo34330a("code", googleSignInAccount.f59983g).mo34329a();
        aVar2.f49381e = googleSignInAccount.f59979c;
        LobbyViewModel.m39332a(eVar).mo34361b(aVar2.mo34319a());
    }
}
