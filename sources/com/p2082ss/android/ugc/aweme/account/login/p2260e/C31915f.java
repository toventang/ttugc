package com.p2082ss.android.ugc.aweme.account.login.p2260e;

import android.content.Context;
import android.content.IntentFilter;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.p1932a.AbstractC25256a;
import com.google.android.gms.internal.p1943b.C25712h;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2250i.C31686a;
import com.p2082ss.android.ugc.aweme.account.p2273m.C32835a;
import com.p2082ss.android.ugc.aweme.account.p2274n.C32856f;
import com.p2082ss.android.ugc.aweme.account.util.C33044m;
import com.p2082ss.android.ugc.aweme.common.C39162r;

/* renamed from: com.ss.android.ugc.aweme.account.login.e.f */
public final class C31915f {

    /* renamed from: a */
    static final boolean f76254a = false;

    /* renamed from: b */
    public C1213t<String> f76255b = new C1213t<>();

    /* renamed from: c */
    boolean f76256c;

    /* renamed from: d */
    int f76257d;

    /* renamed from: e */
    private Context f76258e;

    /* renamed from: f */
    private C31914e f76259f;

    /* renamed from: g */
    private AbstractC25256a f76260g;

    /* renamed from: h */
    private boolean f76261h;

    static {
        Covode.recordClassIndex(38659);
    }

    /* renamed from: d */
    private boolean m66288d() {
        this.f76257d = C32856f.m67456b(this.f76258e);
        boolean a = C33044m.m67681a(this.f76258e);
        this.f76256c = a;
        if (!a || this.f76257d != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo57850a() {
        if (!this.f76261h) {
            m66287a("Feature cannot be used", this.f76256c, this.f76257d);
        } else {
            this.f76260g.mo41298a().mo41869a(new C31916g(this));
        }
    }

    /* renamed from: c */
    public final void mo57852c() {
        C31914e eVar;
        if (m66288d() && (eVar = this.f76259f) != null) {
            try {
                eVar.f76252a.unregisterReceiver(eVar);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo57851b() {
        if (this.f76261h) {
            if (this.f76259f == null) {
                this.f76259f = new C31914e(this.f76258e, this.f76255b);
            }
            C31914e eVar = this.f76259f;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
            try {
                C31914e.m66282a(eVar.f76252a, eVar, intentFilter);
            } catch (Exception unused) {
            }
        }
    }

    public C31915f(Context context) {
        this.f76258e = context;
        this.f76260g = new C25712h(context);
        this.f76261h = m66288d();
    }

    /* renamed from: a */
    static void m66287a(String str, boolean z, int i) {
        C31686a.m66012b(false, str, z, i);
        C32835a.C32836a.m67402a(false, str, z, i);
        C39162r.m79460a("sms_auto_fill", new C31376a().mo57397a("is_successful", 0).mo57399a("error_desc", str).mo57397a("has_sim_card", z ? 1 : 0).mo57397a("google_availability", i).f75156a);
    }
}
