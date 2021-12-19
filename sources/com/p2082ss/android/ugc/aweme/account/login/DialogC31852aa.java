package com.p2082ss.android.ugc.aweme.account.login;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p2082ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2247f.C31667a;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.aa */
public final class DialogC31852aa extends AbstractDialogC31909e {

    /* renamed from: l */
    public static final C31853a f76115l = new C31853a((byte) 0);

    /* renamed from: a */
    public boolean f76116a = true;

    /* renamed from: k */
    public final TPLoginMethod f76117k;

    static {
        Covode.recordClassIndex(38594);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.aa$a */
    public static final class C31853a {
        static {
            Covode.recordClassIndex(38595);
        }

        private C31853a() {
        }

        public /* synthetic */ C31853a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.AbstractDialogC31909e
    public final void dismiss() {
        super.dismiss();
        C31667a.m65986b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.aa$d */
    static final class View$OnClickListenerC31856d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC31852aa f76122a;

        /* renamed from: b */
        final /* synthetic */ Context f76123b;

        static {
            Covode.recordClassIndex(38598);
        }

        View$OnClickListenerC31856d(DialogC31852aa aaVar, Context context) {
            this.f76122a = aaVar;
            this.f76123b = context;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f76122a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.aa$e */
    static final class DialogInterface$OnDismissListenerC31857e implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ DialogC31852aa f76124a;

        static {
            Covode.recordClassIndex(38599);
        }

        DialogInterface$OnDismissListenerC31857e(DialogC31852aa aaVar) {
            this.f76124a = aaVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            if (this.f76124a.f76116a) {
                C31975q.m66354b(new BaseLoginMethod(null, null, null, null, null, null, null, null, null, 511, null));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.aa$b */
    static final class View$OnClickListenerC31854b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC31852aa f76118a;

        /* renamed from: b */
        final /* synthetic */ Context f76119b;

        static {
            Covode.recordClassIndex(38596);
        }

        View$OnClickListenerC31854b(DialogC31852aa aaVar, Context context) {
            this.f76118a = aaVar;
            this.f76119b = context;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f76118a.f76116a = false;
            this.f76118a.f76234g = true;
            if (this.f76118a.isShowing()) {
                this.f76118a.dismiss();
            }
            DialogC31852aa aaVar = this.f76118a;
            aaVar.mo57837a(aaVar.f76117k.getPlatform());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.aa$c */
    static final class View$OnClickListenerC31855c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC31852aa f76120a;

        /* renamed from: b */
        final /* synthetic */ Context f76121b;

        static {
            Covode.recordClassIndex(38597);
        }

        View$OnClickListenerC31855c(DialogC31852aa aaVar, Context context) {
            this.f76120a = aaVar;
            this.f76121b = context;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f76120a.f76234g = true;
            this.f76120a.f76116a = false;
            C39162r.m79460a("switch_login_account", new C31376a().mo57399a("enter_method", this.f76120a.f76232e).mo57399a("enter_from", this.f76120a.f76231d).f75156a);
            this.f76120a.dismiss();
            C36085cj.m73553g().retryLogin(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.AbstractDialogC31909e
    /* renamed from: a */
    public final void mo57760a(Context context) {
        MethodCollector.m26663i(10438);
        C89219l.m154721d(context, "");
        if (this.f76117k == null) {
            MethodCollector.m26664o(10438);
            return;
        }
        this.f76236i = getLayoutInflater().inflate(R.layout.fz, (ViewGroup) null);
        View view = this.f76236i;
        if (view != null) {
            C34577e.m70608b((RemoteImageView) view.findViewById(R.id.nz), this.f76117k.getUserInfo().getAvatarUrl(), -1, -1);
            View findViewById = view.findViewById(R.id.cgm);
            C89219l.m154716b(findViewById, "");
            ((TextView) findViewById).setText(context.getString(R.string.ao3, this.f76117k.getUserInfo().getUserName()));
            view.findViewById(R.id.cgm).setOnClickListener(new View$OnClickListenerC31854b(this, context));
            view.findViewById(R.id.edq).setOnClickListener(new View$OnClickListenerC31855c(this, context));
            view.findViewById(R.id.e1u).setOnClickListener(new View$OnClickListenerC31856d(this, context));
        }
        setContentView(this.f76236i);
        C31667a.m65984a(this);
        setOnDismissListener(new DialogInterface$OnDismissListenerC31857e(this));
        MethodCollector.m26664o(10438);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC31852aa(Activity activity, Bundle bundle, TPLoginMethod tPLoginMethod) {
        super(activity, bundle);
        C89219l.m154721d(activity, "");
        C89219l.m154721d(bundle, "");
        this.f76117k = tPLoginMethod;
        mo57760a(activity);
    }
}
