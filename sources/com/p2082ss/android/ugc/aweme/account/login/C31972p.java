package com.p2082ss.android.ugc.aweme.account.login;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.router.SmartRouter;
import com.google.gson.AbstractC28019l;
import com.google.gson.C27910f;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.util.C33034d;
import com.p2082ss.android.ugc.aweme.account.util.C33045n;
import com.p2082ss.android.ugc.aweme.account.util.C33050s;
import com.p2082ss.android.ugc.aweme.account.util.C33051t;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import java.util.Locale;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.p */
public final class C31972p implements AbstractC31960l {

    /* renamed from: a */
    public String f76357a;

    /* renamed from: b */
    public final String f76358b;

    /* renamed from: c */
    public final boolean f76359c;

    /* renamed from: d */
    public final String f76360d;

    /* renamed from: e */
    private Boolean f76361e;

    /* renamed from: f */
    private final C33045n f76362f;

    static {
        Covode.recordClassIndex(38726);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.AbstractC31960l
    /* renamed from: a */
    public final boolean mo57878a() {
        if (!TextUtils.isEmpty(this.f76357a)) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.AbstractC31960l
    /* renamed from: a */
    public final void mo57877a(Activity activity) {
        C33034d dVar;
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = "";
        C89219l.m154721d(activity, str5);
        if (!C89219l.m154714a((Object) this.f76361e, (Object) true)) {
            SmartRouter.buildRoute(activity, this.f76357a).open();
            return;
        }
        C33045n nVar = this.f76362f;
        if (nVar != null) {
            dVar = nVar.f78595d;
        } else {
            dVar = null;
        }
        C17197a.C17200a aVar = new C17197a.C17200a(activity);
        if (dVar == null || (str = dVar.f78579a) == null) {
            str = str5;
        }
        aVar.f41070a = str;
        if (dVar == null || (str2 = dVar.f78580b) == null) {
            str2 = str5;
        }
        aVar.f41071b = str2;
        aVar.f41060F = true;
        aVar.f41059E = true;
        if (dVar == null || (str3 = dVar.f78581c) == null) {
            str3 = str5;
        }
        C17197a.C17200a a = aVar.mo27192a(str3, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC31973a(this, activity), false);
        if (!(dVar == null || (str4 = dVar.f78582d) == null)) {
            str5 = str4;
        }
        a.mo27196b(str5, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC31974b(activity), false).mo27193a().mo27185c();
        C39162r.m79460a("account_recover_notify", new C31376a().mo57399a("enter_from", this.f76360d).mo57399a("platform", this.f76358b).f75156a);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.p$b */
    static final class DialogInterface$OnClickListenerC31974b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f76365a;

        static {
            Covode.recordClassIndex(38728);
        }

        DialogInterface$OnClickListenerC31974b(Activity activity) {
            this.f76365a = activity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (!this.f76365a.isFinishing()) {
                dialogInterface.dismiss();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.p$a */
    static final class DialogInterface$OnClickListenerC31973a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31972p f76363a;

        /* renamed from: b */
        final /* synthetic */ Activity f76364b;

        static {
            Covode.recordClassIndex(38727);
        }

        DialogInterface$OnClickListenerC31973a(C31972p pVar, Activity activity) {
            this.f76363a = pVar;
            this.f76364b = activity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            SmartRouter.buildRoute(this.f76364b, this.f76363a.f76357a).open();
            C39162r.m79460a("account_recover_notify_confirm", new C31376a().mo57399a("enter_from", this.f76363a.f76360d).mo57399a("platform", this.f76363a.f76358b).f75156a);
            if (!this.f76364b.isFinishing()) {
                dialogInterface.dismiss();
            }
        }
    }

    public C31972p(String str, boolean z, String str2) {
        AbstractC28019l lVar;
        String str3;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f76358b = str;
        this.f76359c = z;
        this.f76360d = str2;
        C33050s a = C33051t.m67698a();
        C89219l.m154721d(str, "");
        C27910f a2 = NetworkProxyAccount.f78256b.mo58679a();
        C28022o oVar = a.f78605e;
        Boolean bool = null;
        if (oVar != null) {
            Locale locale = Locale.ENGLISH;
            C89219l.m154716b(locale, "");
            String upperCase = str.toUpperCase(locale);
            C89219l.m154716b(upperCase, "");
            lVar = oVar.mo46803c(upperCase);
        } else {
            lVar = null;
        }
        C33045n nVar = (C33045n) a2.mo46667a(lVar, C33045n.class);
        this.f76362f = nVar;
        if (z) {
            if (nVar != null) {
                str3 = nVar.f78593b;
            }
            str3 = null;
        } else {
            if (nVar != null) {
                str3 = nVar.f78594c;
            }
            str3 = null;
        }
        this.f76357a = str3;
        this.f76361e = nVar != null ? nVar.f78592a : bool;
    }
}
