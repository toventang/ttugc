package com.bytedance.sdk.p1625a.p1642e;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.C25253a;
import com.google.android.gms.auth.api.credentials.AbstractC25266b;
import com.google.android.gms.auth.api.credentials.C25265a;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.common.api.C25351e;
import com.google.android.gms.common.api.C25483n;
import com.google.android.gms.common.internal.C25562q;
import com.google.android.gms.common.internal.C25577z;
import com.google.android.gms.p1940d.AbstractC25626c;
import com.google.android.gms.p1940d.AbstractC25631h;

/* renamed from: com.bytedance.sdk.a.e.e */
final class C22363e extends AbstractC22360b {

    /* renamed from: e */
    public boolean f52849e;

    static {
        Covode.recordClassIndex(26179);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.sdk.p1625a.p1642e.AbstractC22360b
    /* renamed from: c */
    public final String mo36720c() {
        return "passport_google_smart_lock_query_result";
    }

    /* renamed from: d */
    public final void mo36731d() {
        if (!this.f52849e || mo36718a()) {
            CredentialRequest.C25263a aVar = new CredentialRequest.C25263a();
            aVar.f59922a = true;
            if (aVar.f59923b == null) {
                aVar.f59923b = new String[0];
            }
            if (aVar.f59922a || aVar.f59923b.length != 0) {
                C25562q.m49311a(C25253a.f59871g.mo41314a(this.f52840a.f60124g, new CredentialRequest(aVar, (byte) 0)), new C25577z(new C25265a())).mo41869a(new AbstractC25626c<C25265a>() {
                    /* class com.bytedance.sdk.p1625a.p1642e.C22363e.C223641 */

                    static {
                        Covode.recordClassIndex(26180);
                    }

                    @Override // com.google.android.gms.p1940d.AbstractC25626c
                    /* renamed from: a */
                    public final void mo36732a(AbstractC25631h<C25265a> hVar) {
                        String message;
                        if (hVar.mo41882b()) {
                            C25265a d = hVar.mo41886d();
                            if (d != null) {
                                C22363e.this.mo36729a(((AbstractC25266b) d.f60473a).mo41311a());
                            } else {
                                C22363e.this.mo36715a(102, "task result is null");
                            }
                        } else {
                            Exception e = hVar.mo41887e();
                            if (e instanceof C25483n) {
                                if (C22363e.this.f52849e) {
                                    C22363e.this.mo36730a((C25483n) e);
                                    return;
                                }
                                C22363e.this.mo36714a(103, ((C25351e) e).getStatusCode(), e.getMessage());
                            } else if (e instanceof C25351e) {
                                C22363e.this.mo36714a(104, ((C25351e) e).getStatusCode(), "Unsuccessful credential request, " + e.getMessage());
                            } else {
                                C22363e eVar = C22363e.this;
                                if (e == null) {
                                    message = "unknown";
                                } else {
                                    message = e.getMessage();
                                }
                                eVar.mo36715a(108, message);
                            }
                        }
                    }
                });
                return;
            }
            throw new IllegalStateException("At least one authentication method must be specified");
        }
        mo36715a(101, "activity destroyed");
    }

    C22363e(Activity activity) {
        super(activity);
    }

    /* renamed from: a */
    public final void mo36729a(Credential credential) {
        String uri;
        if (credential == null) {
            mo36715a(107, "credential result == null");
            return;
        }
        C22359a aVar = new C22359a();
        aVar.f52836a = credential.f59889a;
        aVar.f52838c = credential.f59893e;
        Uri uri2 = credential.f59891c;
        if (uri2 == null) {
            uri = "";
        } else {
            uri = uri2.toString();
        }
        aVar.f52839d = uri;
        mo36716a(aVar);
    }

    /* renamed from: a */
    public final void mo36730a(C25483n nVar) {
        try {
            if (this.f52841b == null) {
                return;
            }
            if (this.f52841b.get() != null) {
                nVar.startResolutionForResult((Activity) this.f52841b.get(), 101);
                if (this.f52843d != null) {
                    this.f52843d.mo36733a("passport_google_smart_lock_dialog_show", new Bundle());
                }
            }
        } catch (IntentSender.SendIntentException e) {
            mo36715a(105, "Failed to send resolution, " + e.getMessage());
        }
    }

    @Override // com.bytedance.sdk.p1625a.p1642e.AbstractC22369h
    /* renamed from: a */
    public final void mo36728a(int i, Intent intent) {
        if (i == -1) {
            mo36729a((Credential) intent.getParcelableExtra("com.google.android.gms.credentials.Credential"));
        } else {
            mo36715a(106, "Resolve result fail, maybe user cancel or choose nothing");
        }
    }
}
