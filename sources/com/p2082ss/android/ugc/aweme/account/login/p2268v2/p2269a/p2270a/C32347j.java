package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.p2270a;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.p2082ss.android.ugc.aweme.AbstractC34817bf;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.account.login.p2262g.C31937c;
import com.p2082ss.android.ugc.aweme.account.login.p2263h.C31940a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32581c;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32582d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.a.j */
public final class C32347j extends AbstractC32581c {

    /* renamed from: b */
    public final AbstractC32572b f77152b;

    /* renamed from: c */
    public final String f77153c;

    static {
        Covode.recordClassIndex(39115);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32581c
    /* renamed from: a */
    public final boolean mo58399a() {
        C17197a.C17200a aVar = new C17197a.C17200a(this.f77152b.getActivity());
        aVar.f41071b = this.f77152b.getString(R.string.apb);
        C17197a.C17200a b = aVar.mo27192a(this.f77152b.getString(R.string.ap_), (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC32348a(this), false).mo27196b(this.f77152b.getString(R.string.apa), (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC32349b(this), false);
        C89219l.m154716b(b, "");
        m67057a(b);
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.a.j$b */
    static final class DialogInterface$OnClickListenerC32349b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32347j f77155a;

        static {
            Covode.recordClassIndex(39117);
        }

        DialogInterface$OnClickListenerC32349b(C32347j jVar) {
            this.f77155a = jVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            ActivityC0945e activity = this.f77155a.f77733a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32347j(AbstractC32572b bVar, String str) {
        super(bVar);
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(str, "");
        this.f77152b = bVar;
        this.f77153c = str;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.a.j$a */
    static final class DialogInterface$OnClickListenerC32348a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C32347j f77154a;

        static {
            Covode.recordClassIndex(39116);
        }

        DialogInterface$OnClickListenerC32348a(C32347j jVar) {
            this.f77154a = jVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (TextUtils.isEmpty(this.f77154a.f77153c)) {
                AbstractC32572b bVar = this.f77154a.f77733a;
                String string = this.f77154a.f77733a.getString(R.string.dcq);
                C89219l.m154716b(string, "");
                bVar.mo57442a(0, string);
                return;
            }
            C39162r.m79460a("click_sign_up", new C31376a().mo57399a("enter_method", "login").f75156a);
            Bundle arguments = this.f77154a.f77733a.getArguments();
            if (arguments == null || !arguments.getBoolean("age_gate_block")) {
                Object a = C31291a.m65463a(AbstractC34817bf.class);
                C89219l.m154716b(a, "");
                int d = ((AbstractC34817bf) a).mo60103d();
                if (d != 0) {
                    C39162r.m79460a("tns_phone_not_registered_age_gate_action", new C31376a().mo57397a("register_age_gate_action", d).mo57397a("show", 1).f75156a);
                    AbstractC32572b bVar2 = this.f77154a.f77152b;
                    Bundle arguments2 = this.f77154a.f77733a.getArguments();
                    if (arguments2 == null) {
                        arguments2 = new Bundle();
                    }
                    arguments2.putInt("next_page", EnumC32594j.AGE_GATE_LOGIN.getValue());
                    arguments2.putString("sms_code_key", this.f77154a.f77153c);
                    arguments2.putInt("age_gate_register_action", d);
                    C89219l.m154716b(arguments2, "");
                    bVar2.mo58461a(arguments2);
                    return;
                }
                C39162r.m79460a("tns_phone_not_registered_age_gate_action", new C31376a().mo57397a("register_age_gate_action", d).mo57397a("show", 0).f75156a);
                if (C31937c.m66302a()) {
                    AbstractC32572b bVar3 = this.f77154a.f77152b;
                    Bundle arguments3 = this.f77154a.f77733a.getArguments();
                    if (arguments3 == null) {
                        arguments3 = new Bundle();
                    }
                    arguments3.putInt("next_page", EnumC32594j.TERMS_CONSENT_NEW_PHONE_USER.getValue());
                    arguments3.putString("sms_code_key", this.f77154a.f77153c);
                    C89219l.m154716b(arguments3, "");
                    bVar3.mo58461a(arguments3);
                    return;
                }
                C31940a.C31941a b = C32582d.m67066b(this.f77154a.f77152b);
                AbstractC32572b bVar4 = this.f77154a.f77733a;
                String a2 = C31940a.m66306a(b);
                C89219l.m154716b(a2, "");
                C32407x.m66800a(bVar4, a2, this.f77154a.f77153c, EnumC32592i.SIGN_UP, this.f77154a.f77152b.mo58460Z_()).mo143246c();
                return;
            }
            AbstractC32572b bVar5 = this.f77154a.f77152b;
            Bundle arguments4 = this.f77154a.f77733a.getArguments();
            if (arguments4 == null) {
                arguments4 = new Bundle();
            }
            arguments4.putInt("next_page", EnumC32594j.FTC_CREATE_ACCOUNT.getValue());
            C89219l.m154716b(arguments4, "");
            bVar5.mo58461a(arguments4);
        }
    }
}
