package com.p2082ss.android.ugc.aweme.account.login.p2260e;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.C25253a;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC25357i;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2250i.C31686a;
import com.p2082ss.android.ugc.aweme.account.p2273m.C32837b;
import com.p2082ss.android.ugc.aweme.account.p2274n.C32852d;
import com.p2082ss.android.ugc.aweme.account.p2274n.C32856f;
import com.p2082ss.android.ugc.aweme.account.util.C33044m;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.utils.C80214ai;
import org.json.JSONObject;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.e.a */
public final class C31910a implements AbstractC25357i.AbstractC25359b, AbstractC25357i.AbstractC25360c {

    /* renamed from: b */
    private static final boolean f76238b = false;

    /* renamed from: a */
    public EditText f76239a;

    /* renamed from: c */
    private AbstractC25357i f76240c;

    /* renamed from: d */
    private Fragment f76241d;

    /* renamed from: e */
    private int f76242e = C32856f.m67456b(C31291a.f74991a);

    /* renamed from: f */
    private boolean f76243f;

    /* renamed from: g */
    private String f76244g;

    /* renamed from: h */
    private Exception f76245h;

    /* renamed from: i */
    private boolean f76246i;

    @Override // com.google.android.gms.common.api.internal.AbstractC25449e
    /* renamed from: a */
    public final void mo34348a(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25462m
    /* renamed from: a */
    public final void mo41581a(ConnectionResult connectionResult) {
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25449e
    /* renamed from: b */
    public final void mo34349b(int i) {
    }

    static {
        Covode.recordClassIndex(38654);
    }

    /* renamed from: b */
    public final void mo57846b() {
        AbstractC25357i iVar;
        if (this.f76246i && (iVar = this.f76240c) != null && iVar.mo41533g()) {
            this.f76240c.mo41520a(this.f76241d.getActivity());
            this.f76240c.mo41532f();
        }
    }

    /* renamed from: c */
    private void m66272c() {
        if (!this.f76246i) {
            m66270a(false, "Feature cannot be used", this.f76243f, this.f76242e);
        } else if (this.f76240c == null) {
            m66270a(false, "Failed to create GoogleApiClient, exception: " + C32852d.m67445a(this.f76245h), this.f76243f, this.f76242e);
        } else {
            Fragment fragment = this.f76241d;
            if (fragment == null || !fragment.isAdded()) {
                m66270a(false, "Unexpected error occurred, fragment: " + this.f76241d, this.f76243f, this.f76242e);
                return;
            }
            HintRequest.C25264a aVar = new HintRequest.C25264a();
            CredentialPickerConfig.C25262a aVar2 = new CredentialPickerConfig.C25262a();
            aVar2.f59911b = true;
            HintRequest.C25264a a = aVar.mo41307a(aVar2.mo41304a());
            a.f59938b = true;
            try {
                this.f76241d.startIntentSenderForResult(C25253a.f59871g.mo41312a(this.f76240c, a.mo41308a()).getIntentSender(), 1000, null, 0, 0, 0, null);
            } catch (IntentSender.SendIntentException e) {
                m66270a(false, "Error when calling startIntentSenderForResult: " + C32852d.m67445a(e), this.f76243f, this.f76242e);
            }
        }
    }

    /* renamed from: a */
    public final void mo57843a() {
        if (this.f76246i) {
            try {
                this.f76240c = new AbstractC25357i.C25358a(this.f76241d.getContext()).mo41536a(this).mo41534a(this.f76241d.getActivity(), this).mo41535a(C25253a.f59868d).mo41537a();
            } catch (Exception e) {
                this.f76245h = e;
            }
        }
    }

    /* renamed from: a */
    public final void mo57845a(EditText editText) {
        this.f76239a = editText;
        m66272c();
    }

    /* renamed from: b */
    private void m66271b(Intent intent) {
        C1731i.m5640b(new CallableC31911b(this, intent), C1731i.f5562a).mo5532a((AbstractC1729g) new C31912c(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Void mo57842a(C1731i iVar) {
        if (C80214ai.m139043a(iVar) && ((Boolean) iVar.mo5545d()).booleanValue()) {
            return null;
        }
        m66270a(false, "Bolts result error: " + C32852d.m67445a(iVar.mo5546e()), this.f76243f, this.f76242e);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Boolean mo57841a(Intent intent) {
        String str;
        Phonenumber.PhoneNumber phoneNumber;
        Credential credential = (Credential) intent.getParcelableExtra("com.google.android.gms.credentials.Credential");
        boolean z = false;
        if (credential == null) {
            str = "No \"Credential\" retrieved from Credential.EXTRA_KEY";
        } else {
            String str2 = credential.f59889a;
            str = null;
            try {
                phoneNumber = PhoneNumberUtil.getInstance().parse(str2, null);
            } catch (NumberParseException e) {
                phoneNumber = null;
                str = "NumberParseException: " + e.getMessage();
            }
            if (phoneNumber != null) {
                z = true;
            }
            if (phoneNumber != null) {
                str2 = String.valueOf(phoneNumber.getNationalNumber());
            }
            C80214ai.m139044b(new RunnableC31913d(this, str2), "BoltsUtils");
        }
        m66270a(TextUtils.isEmpty(str), str, this.f76243f, this.f76242e);
        return Boolean.valueOf(z);
    }

    public C31910a(Fragment fragment, String str) {
        boolean z;
        this.f76241d = fragment;
        this.f76244g = str;
        boolean a = C33044m.m67681a(C31291a.f74991a);
        this.f76243f = a;
        if (!a || this.f76242e != 0) {
            z = false;
        } else {
            z = true;
        }
        this.f76246i = z;
    }

    /* renamed from: a */
    public final void mo57844a(int i, int i2, Intent intent) {
        EditText editText;
        if (this.f76246i && i == 1000 && (editText = this.f76239a) != null) {
            if (i2 == -1) {
                m66271b(intent);
                return;
            }
            editText.requestFocus();
            m66270a(false, "onActivityResult result code: ".concat(String.valueOf(i2)), this.f76243f, this.f76242e);
        }
    }

    /* renamed from: a */
    private void m66270a(boolean z, String str, boolean z2, int i) {
        String str2;
        C31686a.m66011a(z, str, z2, i);
        C33743c a = new C33743c().mo59971a("success", Boolean.valueOf(z));
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        JSONObject a2 = a.mo59976a("error_desc", str2).mo59971a("has_sim_card", Boolean.valueOf(z2)).mo59974a("google_availability", Integer.valueOf(i)).mo59977a();
        int i2 = !z ? 1 : 0;
        C89219l.m154716b(a2, "");
        C32837b.m67403a("phone_auto_fill", i2, a2);
        C39162r.m79460a("phone_auto_fill", new C31376a().mo57399a("enter_method", this.f76244g).mo57397a("is_successful", z ? 1 : 0).mo57399a("error_desc", str).mo57397a("has_sim_card", z2 ? 1 : 0).mo57397a("google_availability", i).f75156a);
    }
}
