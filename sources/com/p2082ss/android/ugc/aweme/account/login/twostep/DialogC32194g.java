package com.p2082ss.android.ugc.aweme.account.login.twostep;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC0216c;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.C17205a;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.DialogContext;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.base.utils.C34727m;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.login.DialogC58952a;
import com.p2082ss.android.ugc.aweme.user.C80061e;
import com.p2082ss.android.ugc.aweme.user.C80064f;
import com.p2082ss.android.ugc.trill.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.g */
public final class DialogC32194g extends DialogInterfaceC0216c {

    /* renamed from: d */
    public static boolean f76838d;

    /* renamed from: e */
    public static DialogC32194g f76839e;

    /* renamed from: f */
    public static final C32195a f76840f = new C32195a((byte) 0);

    /* renamed from: b */
    public final Activity f76841b;

    /* renamed from: c */
    public final boolean f76842c;

    static {
        Covode.recordClassIndex(38959);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.g$a */
    public static final class C32195a {
        static {
            Covode.recordClassIndex(38960);
        }

        private C32195a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.g$a$b */
        public static final class CallableC32198b<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ Activity f76845a;

            /* renamed from: b */
            final /* synthetic */ boolean f76846b;

            static {
                Covode.recordClassIndex(38963);
            }

            CallableC32198b(Activity activity, boolean z) {
                this.f76845a = activity;
                this.f76846b = z;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                C17205a aVar = C17205a.C17206a.f41116a;
                Activity activity = this.f76845a;
                Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                DialogContext.C17204a aVar2 = new DialogContext.C17204a((ActivityC0945e) activity);
                aVar2.f41106a = AbstractC17207b.EnumC17208a.TWO_FACTOR_AUTH;
                aVar.mo27209a(aVar2.mo27207a(new AbstractC17207b.AbstractC17211c(this) {
                    /* class com.p2082ss.android.ugc.aweme.account.login.twostep.DialogC32194g.C32195a.CallableC32198b.C321991 */

                    /* renamed from: a */
                    final /* synthetic */ CallableC32198b f76847a;

                    static {
                        Covode.recordClassIndex(38964);
                    }

                    @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
                    /* renamed from: a */
                    public final void mo27202a(List<Integer> list) {
                    }

                    @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
                    /* renamed from: a */
                    public final void mo27203a(List<Integer> list, int i) {
                    }

                    @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
                    /* renamed from: a */
                    public final void mo27201a() {
                        if (((ActivityC0945e) this.f76847a.f76845a).isFinishing()) {
                            C17205a.C17206a.f41116a.mo27210a(AbstractC17207b.EnumC17208a.TERMS_PRIVACY_COOKIE);
                            return;
                        }
                        DialogC32194g gVar = new DialogC32194g(this.f76847a.f76845a, this.f76847a.f76846b);
                        DialogC32194g.f76839e = gVar;
                        gVar.show();
                        DialogC32194g gVar2 = DialogC32194g.f76839e;
                        if (gVar2 == null) {
                            C89219l.m154715b();
                        }
                        gVar2.setOnDismissListener(DialogInterface$OnDismissListenerC32200a.f76848a);
                    }

                    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.g$a$b$1$a */
                    static final class DialogInterface$OnDismissListenerC32200a implements DialogInterface.OnDismissListener {

                        /* renamed from: a */
                        public static final DialogInterface$OnDismissListenerC32200a f76848a = new DialogInterface$OnDismissListenerC32200a();

                        static {
                            Covode.recordClassIndex(38965);
                        }

                        DialogInterface$OnDismissListenerC32200a() {
                        }

                        public final void onDismiss(DialogInterface dialogInterface) {
                            C17205a.C17206a.f41116a.mo27210a(AbstractC17207b.EnumC17208a.TERMS_PRIVACY_COOKIE);
                        }
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f76847a = r1;
                    }
                }));
                return C89391z.f203057a;
            }
        }

        public /* synthetic */ C32195a(byte b) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.g$a$a */
        public static final class C32196a<TTaskResult, TContinuationResult> implements AbstractC1729g {

            /* renamed from: a */
            final /* synthetic */ Activity f76843a;

            static {
                Covode.recordClassIndex(38961);
            }

            C32196a(Activity activity) {
                this.f76843a = activity;
            }

            @Override // p077b.AbstractC1729g
            public final /* synthetic */ Object then(C1731i iVar) {
                C89219l.m154716b(iVar, "");
                if (C89219l.m154714a(iVar.mo5545d(), (Object) false)) {
                    C34727m.m70944a(new Runnable(this) {
                        /* class com.p2082ss.android.ugc.aweme.account.login.twostep.DialogC32194g.C32195a.C32196a.RunnableC321971 */

                        /* renamed from: a */
                        final /* synthetic */ C32196a f76844a;

                        static {
                            Covode.recordClassIndex(38962);
                        }

                        {
                            this.f76844a = r1;
                        }

                        public final void run() {
                            C32195a.m66564b(this.f76844a.f76843a);
                        }
                    });
                }
                return C89391z.f203057a;
            }
        }

        /* renamed from: a */
        public static void m66562a(Activity activity) {
            C89219l.m154721d(activity, "");
            try {
                if (C80064f.m138815a(C80061e.f179403k.mo123508a())) {
                    int twoStepVerificationStatusFromLocal = C36085cj.f85262b.mo57077m().getTwoStepVerificationStatusFromLocal();
                    if (twoStepVerificationStatusFromLocal == -1) {
                        C36085cj.f85262b.mo57077m().getTwoStepVerificationStatusFromNetwork().mo5532a(new C32196a(activity));
                    } else if (twoStepVerificationStatusFromLocal == 0) {
                        m66564b(activity);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: b */
        public static void m66564b(Activity activity) {
            C89219l.m154721d(activity, "");
            if (C80064f.m138815a(C80061e.f179403k.mo123508a()) && !DialogC32194g.f76838d) {
                DialogC32194g gVar = DialogC32194g.f76839e;
                if (gVar == null || !gVar.isShowing()) {
                    String f = C80064f.m138822f();
                    if (!TextUtils.isEmpty(f)) {
                        Date parse = new SimpleDateFormat("yyyy-MM-dd").parse(f);
                        C89219l.m154716b(parse, "");
                        boolean z = false;
                        if (System.currentTimeMillis() > parse.getTime()) {
                            z = true;
                        } else if (System.currentTimeMillis() - C80064f.m138824h() <= 86400000 || !C80064f.m138823g()) {
                            return;
                        }
                        m66563a(z, activity);
                    }
                }
            }
        }

        /* renamed from: a */
        private static void m66563a(boolean z, Activity activity) {
            C89219l.m154721d(activity, "");
            C1731i.m5640b(new CallableC32198b(activity, z), C1731i.f5564c);
        }
    }

    public final void cancel() {
        super.cancel();
        f76838d = false;
    }

    public final void show() {
        super.show();
        f76838d = true;
    }

    public final void dismiss() {
        super.dismiss();
        f76838d = false;
        f76839e = null;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.g$b */
    static final class View$OnClickListenerC32201b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC32194g f76849a;

        static {
            Covode.recordClassIndex(38966);
        }

        View$OnClickListenerC32201b(DialogC32194g gVar) {
            this.f76849a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C31376a aVar = new C31376a();
            aVar.mo57399a("enter_methods", "turn_on");
            C39162r.m79460a("show_twosv_nudge_popup", aVar.f75156a);
            C36085cj.f85262b.mo57077m().openTwoStepVerificationManageActivity(this.f76849a.f76841b, "mandatory_popup");
            if (!this.f76849a.f76842c) {
                this.f76849a.dismiss();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.g$c */
    static final class View$OnClickListenerC32202c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC32194g f76850a;

        static {
            Covode.recordClassIndex(38967);
        }

        View$OnClickListenerC32202c(DialogC32194g gVar) {
            this.f76850a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C31376a aVar = new C31376a();
            if (this.f76850a.f76842c) {
                aVar.mo57399a("enter_methods", "logout");
                C39162r.m79460a("show_twosv_nudge_popup", aVar.f75156a);
                new DialogC58952a(this.f76850a.f76841b).show();
                C31575b.m65860b().logout("user_logout", "user_logout");
                return;
            }
            this.f76850a.dismiss();
            aVar.mo57399a("enter_methods", "not_now");
            C39162r.m79460a("show_twosv_nudge_popup", aVar.f75156a);
        }
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0216c, androidx.appcompat.app.DialogC0240h
    public final void onCreate(Bundle bundle) {
        MethodCollector.m26663i(10041);
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.fv, (ViewGroup) null);
        if (inflate != null) {
            ((TextView) inflate.findViewById(R.id.f6i)).setOnClickListener(new View$OnClickListenerC32201b(this));
            ((TextView) inflate.findViewById(R.id.f09)).setOnClickListener(new View$OnClickListenerC32202c(this));
            TextView textView = (TextView) inflate.findViewById(R.id.f63);
            TextView textView2 = (TextView) inflate.findViewById(R.id.eu6);
            TextView textView3 = (TextView) inflate.findViewById(R.id.f09);
            C89219l.m154716b(textView, "");
            textView.setText(this.f76841b.getString(R.string.cax));
            C89219l.m154716b(textView2, "");
            textView2.setText(this.f76841b.getString(R.string.cas, new Object[]{C80064f.m138822f()}) + "\n\n" + this.f76841b.getString(R.string.cat));
            if (this.f76842c) {
                textView2.setText(this.f76841b.getString(R.string.cau));
                C89219l.m154716b(textView3, "");
                textView3.setText(this.f76841b.getString(R.string.cav));
            }
        }
        setContentView(inflate);
        C80064f.m138816b().edit().putLong("last_show_hpas_dialog_time", System.currentTimeMillis()).apply();
        setCanceledOnTouchOutside(false);
        setCancelable(!this.f76842c);
        C39162r.m79460a("show_twosv_nudge_popup", new C31376a().f75156a);
        MethodCollector.m26664o(10041);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC32194g(Activity activity, boolean z) {
        super(activity, R.style.ue);
        C89219l.m154721d(activity, "");
        this.f76841b = activity;
        this.f76842c = z;
    }
}
