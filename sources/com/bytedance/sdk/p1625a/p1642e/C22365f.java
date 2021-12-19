package com.bytedance.sdk.p1625a.p1642e;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.C25253a;
import com.google.android.gms.auth.api.credentials.C25268d;
import com.google.android.gms.auth.api.credentials.C25269e;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.C25351e;
import com.google.android.gms.common.api.C25483n;
import com.google.android.gms.common.internal.C25562q;
import com.google.android.gms.p1940d.AbstractC25626c;
import com.google.android.gms.p1940d.AbstractC25631h;

/* renamed from: com.bytedance.sdk.a.e.f */
final class C22365f extends AbstractC22360b {

    /* renamed from: e */
    public C22359a f52851e;

    static {
        Covode.recordClassIndex(26181);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.sdk.p1625a.p1642e.AbstractC22360b
    /* renamed from: c */
    public final String mo36720c() {
        return "passport_google_smart_lock_save_result";
    }

    /* renamed from: d */
    public final void mo36731d() {
        C22359a aVar = this.f52851e;
        if (aVar == null || TextUtils.isEmpty(aVar.f52836a) || TextUtils.isEmpty(this.f52851e.f52838c)) {
            mo36715a(201, "account info check fail");
            return;
        }
        Credential.C25261a aVar2 = new Credential.C25261a(this.f52851e.f52836a);
        aVar2.f59898b = this.f52851e.f52837b;
        aVar2.f59901e = this.f52851e.f52838c;
        if (!TextUtils.isEmpty(this.f52851e.f52839d)) {
            aVar2.f59899c = Uri.parse(this.f52851e.f52839d);
        }
        C25562q.m49310a(C25253a.f59871g.mo41313a(this.f52840a.f60124g, new Credential(aVar2.f59897a, aVar2.f59898b, aVar2.f59899c, aVar2.f59900d, aVar2.f59901e, aVar2.f59902f, aVar2.f59903g, aVar2.f59904h))).mo41869a(new AbstractC25626c() {
            /* class com.bytedance.sdk.p1625a.p1642e.C22365f.C223661 */

            static {
                Covode.recordClassIndex(26182);
            }

            @Override // com.google.android.gms.p1940d.AbstractC25626c
            /* renamed from: a */
            public final void mo36732a(AbstractC25631h hVar) {
                String message;
                if (hVar.mo41882b()) {
                    C22365f fVar = C22365f.this;
                    fVar.mo36716a(fVar.f52851e);
                    return;
                }
                Exception e = hVar.mo41887e();
                if (e instanceof C25483n) {
                    C25483n nVar = (C25483n) e;
                    try {
                        if (C22365f.this.f52841b == null) {
                            return;
                        }
                        if (C22365f.this.f52841b.get() != null) {
                            nVar.startResolutionForResult((Activity) C22365f.this.f52841b.get(), 102);
                            if (C22365f.this.f52843d != null) {
                                C22365f.this.f52843d.mo36733a("passport_google_smart_lock_dialog_show", new Bundle());
                            }
                        }
                    } catch (IntentSender.SendIntentException e2) {
                        C22365f.this.mo36714a(202, nVar.getStatusCode(), "Failed to send resolution, " + e2.getMessage());
                    }
                } else if (e instanceof C25351e) {
                    C22365f.this.mo36714a(203, ((C25351e) e).getStatusCode(), e.getMessage());
                } else {
                    C22365f fVar2 = C22365f.this;
                    if (e == null) {
                        message = "unknown";
                    } else {
                        message = e.getMessage();
                    }
                    fVar2.mo36715a(205, message);
                }
            }
        });
    }

    C22365f(Activity activity) {
        super(activity);
        this.f52840a = new C25268d((Activity) this.f52841b.get(), new C25269e.C25270a().mo41315b().mo41297a());
    }

    @Override // com.bytedance.sdk.p1625a.p1642e.AbstractC22369h
    /* renamed from: a */
    public final void mo36728a(int i, Intent intent) {
        if (i == -1) {
            mo36716a(this.f52851e);
        } else {
            mo36715a(204, "SAVE: Canceled by user");
        }
    }
}
