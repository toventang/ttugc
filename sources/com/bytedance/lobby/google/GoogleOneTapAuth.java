package com.bytedance.lobby.google;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Base64;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.C20891c;
import com.bytedance.lobby.C20892d;
import com.bytedance.lobby.auth.AbstractC20888d;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.C20885b;
import com.bytedance.lobby.internal.LobbyCore;
import com.bytedance.lobby.internal.LobbyViewModel;
import com.google.android.gms.auth.api.identity.AbstractC25282a;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.C25287f;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.C25351e;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.internal.p1942authapi.C25683e;
import com.google.android.gms.p1940d.AbstractC25627d;
import com.google.android.gms.p1940d.AbstractC25628e;
import java.security.SecureRandom;

public class GoogleOneTapAuth extends GoogleOneTapProvider<AuthResult> implements AbstractC20888d {

    /* renamed from: b */
    AbstractC25282a f49420b;

    /* renamed from: d */
    private BeginSignInRequest f49421d;

    /* renamed from: e */
    private final int f49422e = 1;

    /* renamed from: f */
    private LobbyViewModel f49423f;

    static {
        Covode.recordClassIndex(24496);
    }

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

    public GoogleOneTapAuth(C20892d dVar) {
        super(LobbyCore.getApplication(), dVar);
    }

    /* renamed from: a */
    public final void mo34352a(C20891c cVar) {
        AuthResult.C20883a aVar = new AuthResult.C20883a(this.f49454c.f49402b, 1);
        aVar.f49377a = false;
        aVar.f49378b = cVar;
        this.f49423f.mo34361b(aVar.mo34319a());
    }

    /* renamed from: a */
    public static C20891c m39281a(String str) {
        int parseInt = Integer.parseInt(str.replaceAll("[^0-9]", ""));
        if (!(parseInt == 5 || parseInt == 6)) {
            if (parseInt == 7) {
                return new C20891c(5, parseInt, str);
            }
            if (parseInt != 8) {
                if (parseInt != 15) {
                    if (parseInt != 16) {
                        switch (parseInt) {
                            case 12500:
                                break;
                            case 12501:
                                break;
                            case 12502:
                                break;
                            default:
                                return new C20891c(3, 8, str);
                        }
                    }
                    return new C20891c(4, parseInt, str);
                }
                return new C20891c(-999, parseInt, str);
            }
        }
        return new C20891c(3, parseInt, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final BeginSignInRequest mo34351a(Boolean bool) {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        String encodeToString = Base64.encodeToString(bArr, 10);
        BeginSignInRequest.C25281a aVar = new BeginSignInRequest.C25281a();
        BeginSignInRequest.GoogleIdTokenRequestOptions.C25279a aVar2 = new BeginSignInRequest.GoogleIdTokenRequestOptions.C25279a();
        aVar2.f59957a = true;
        aVar2.f59959c = encodeToString;
        aVar2.f59958b = C25565r.m49316a(this.f49454c.f49403c);
        aVar2.f59960d = bool.booleanValue();
        BeginSignInRequest.C25281a a = aVar.mo41338a(aVar2.mo41334a());
        a.f59965c = false;
        BeginSignInRequest a2 = a.mo41339a();
        this.f49421d = a2;
        return a2;
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: b */
    public final void mo34328b(ActivityC0945e eVar, Bundle bundle) {
        if (!mo34350t_()) {
            C20885b.m39241a(this.f49423f, "google_onetap", 2);
        } else {
            this.f49420b.mo41345a();
        }
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: a */
    public final void mo34326a(final ActivityC0945e eVar, Bundle bundle) {
        this.f49423f = LobbyViewModel.m39332a(eVar);
        if (!mo34350t_()) {
            C20885b.m39241a(this.f49423f, "google_onetap", 1);
            return;
        }
        this.f49420b = new C25683e((Activity) C25565r.m49314a(eVar), new C25287f.C25288a((byte) 0).mo41358a());
        this.f49420b.mo41346a(mo34351a((Boolean) true)).mo41868a(eVar, new AbstractC25628e<BeginSignInResult>() {
            /* class com.bytedance.lobby.google.GoogleOneTapAuth.C209052 */

            static {
                Covode.recordClassIndex(24498);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.google.android.gms.p1940d.AbstractC25628e
            /* renamed from: a */
            public final /* synthetic */ void mo34354a(BeginSignInResult beginSignInResult) {
                try {
                    eVar.startIntentSenderForResult(beginSignInResult.f59967a.getIntentSender(), 1, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e) {
                    GoogleOneTapAuth.this.mo34352a(GoogleOneTapAuth.m39281a(e.getLocalizedMessage()));
                }
            }
        }).mo41867a(eVar, new AbstractC25627d() {
            /* class com.bytedance.lobby.google.GoogleOneTapAuth.C209041 */

            static {
                Covode.recordClassIndex(24497);
            }

            @Override // com.google.android.gms.p1940d.AbstractC25627d
            /* renamed from: a */
            public final void mo34353a(Exception exc) {
                GoogleOneTapAuth googleOneTapAuth = GoogleOneTapAuth.this;
                ActivityC0945e eVar = eVar;
                googleOneTapAuth.f49420b.mo41346a(googleOneTapAuth.mo34351a((Boolean) false)).mo41868a(eVar, new AbstractC25628e<BeginSignInResult>(eVar) {
                    /* class com.bytedance.lobby.google.GoogleOneTapAuth.C209074 */

                    /* renamed from: a */
                    final /* synthetic */ ActivityC0945e f49429a;

                    static {
                        Covode.recordClassIndex(24500);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.google.android.gms.p1940d.AbstractC25628e
                    /* renamed from: a */
                    public final /* synthetic */ void mo34354a(BeginSignInResult beginSignInResult) {
                        try {
                            this.f49429a.startIntentSenderForResult(beginSignInResult.f59967a.getIntentSender(), 1, null, 0, 0, 0, null);
                        } catch (IntentSender.SendIntentException e) {
                            GoogleOneTapAuth.this.mo34352a(GoogleOneTapAuth.m39281a(e.getLocalizedMessage()));
                        }
                    }

                    {
                        this.f49429a = r2;
                    }
                }).mo41867a(eVar, new AbstractC25627d() {
                    /* class com.bytedance.lobby.google.GoogleOneTapAuth.C209063 */

                    static {
                        Covode.recordClassIndex(24499);
                    }

                    @Override // com.google.android.gms.p1940d.AbstractC25627d
                    /* renamed from: a */
                    public final void mo34353a(Exception exc) {
                        GoogleOneTapAuth.this.mo34352a(GoogleOneTapAuth.m39281a(exc.getLocalizedMessage()));
                    }
                });
            }
        });
    }

    @Override // com.bytedance.lobby.auth.AbstractC20888d
    /* renamed from: a */
    public final void mo34325a(ActivityC0945e eVar, int i, int i2, Intent intent) {
        C20891c cVar;
        if (i == 1) {
            try {
                SignInCredential a = this.f49420b.mo41344a(intent);
                String str = a.f59974g;
                String str2 = a.f59968a;
                if (str != null) {
                    AuthResult.C20883a aVar = new AuthResult.C20883a(this.f49454c.f49402b, 1);
                    aVar.f49377a = true;
                    aVar.f49381e = str;
                    aVar.f49380d = str2;
                    this.f49423f.mo34361b(aVar.mo34319a());
                    return;
                }
                mo34352a(new C20891c(6, -1, "No ID token or password!"));
            } catch (C25351e e) {
                int statusCode = e.getStatusCode();
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
                mo34352a(cVar);
            }
        }
    }
}
