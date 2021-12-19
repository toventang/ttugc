package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32582d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.recover.C32034f;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39110a;
import com.p2082ss.android.ugc.aweme.p2307ai.View$OnTouchListenerC33468a;
import com.p2082ss.android.ugc.aweme.utils.C80273bt;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.e */
public final class C32780e {

    /* renamed from: a */
    public static final C32780e f78116a = new C32780e();

    private C32780e() {
    }

    static {
        Covode.recordClassIndex(39559);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.e$a */
    static final class View$OnClickListenerC32781a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f78117a;

        /* renamed from: b */
        final /* synthetic */ String f78118b;

        /* renamed from: c */
        final /* synthetic */ boolean f78119c;

        static {
            Covode.recordClassIndex(39560);
        }

        View$OnClickListenerC32781a(AbstractC32572b bVar, String str, boolean z) {
            this.f78117a = bVar;
            this.f78118b = str;
            this.f78119c = z;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC32572b bVar = this.f78117a;
            String str = this.f78118b;
            boolean z = this.f78119c;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(str, "");
            C39110a aVar = new C39110a(bVar.getContext());
            String string = bVar.getString(R.string.d8x);
            C89219l.m154716b(string, "");
            String string2 = bVar.getString(R.string.d6j);
            C89219l.m154716b(string2, "");
            aVar.mo67871a(new String[]{string, string2}, new DialogInterface$OnClickListenerC32782b(str, bVar, z));
            C80273bt.m139145a(aVar.f92306a.mo453a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.e$b */
    static final class DialogInterface$OnClickListenerC32782b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f78120a;

        /* renamed from: b */
        final /* synthetic */ AbstractC32572b f78121b;

        /* renamed from: c */
        final /* synthetic */ boolean f78122c;

        static {
            Covode.recordClassIndex(39561);
        }

        DialogInterface$OnClickListenerC32782b(String str, AbstractC32572b bVar, boolean z) {
            this.f78120a = str;
            this.f78121b = bVar;
            this.f78122c = z;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            int value;
            Serializable serializable;
            boolean z = true;
            if (i == 1) {
                C39162r.m79460a("click_forget_password", new C31376a().mo57399a("platform", "email").mo57399a("enter_from", this.f78120a).mo57399a("enter_method", this.f78121b.mo58467x()).f75156a);
            } else if (i == 0) {
                C39162r.m79460a("click_forget_password", new C31376a().mo57399a("platform", "phone").mo57399a("enter_from", this.f78120a).mo57399a("enter_method", this.f78121b.mo58467x()).f75156a);
            }
            AbstractC32572b bVar = this.f78121b;
            Bundle arguments = bVar.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            if (i == 1) {
                value = EnumC32594j.INPUT_EMAIL_FIND_PASSWORD.getValue();
            } else {
                value = EnumC32594j.INPUT_PHONE_FIND_PASSWORD.getValue();
            }
            arguments.putInt("next_page", value);
            if (this.f78122c) {
                Bundle arguments2 = this.f78121b.getArguments();
                C32034f.C32036b bVar2 = null;
                if (arguments2 != null) {
                    serializable = arguments2.getSerializable("recover_account_data");
                } else {
                    serializable = null;
                }
                if (serializable instanceof C32034f.C32036b) {
                    bVar2 = serializable;
                }
                C32034f.C32036b bVar3 = bVar2;
                if (bVar3 != null) {
                    bVar3.setNeedStoreLastMethod(true);
                    z = !bVar3.getSafe();
                }
                arguments.putInt("current_scene", EnumC32592i.RECOVER_ACCOUNT.getValue());
            } else {
                arguments.putInt("current_scene", EnumC32592i.SET_OR_RESET_PASSWORD.getValue());
            }
            AbstractC32572b bVar4 = this.f78121b;
            if ((bVar4 instanceof AbstractC32779d) && z) {
                C32582d.m67063a(bVar4, ((AbstractC32779d) bVar4).mo57965e());
            }
            C89219l.m154716b(arguments, "");
            bVar.mo58461a(arguments);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: a */
    public static void m67379a(View view, AbstractC32572b bVar, String str, boolean z) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(str, "");
        view.setOnTouchListener(new View$OnTouchListenerC33468a(0.5f));
        view.setOnClickListener(new View$OnClickListenerC32781a(bVar, str, z));
    }
}
