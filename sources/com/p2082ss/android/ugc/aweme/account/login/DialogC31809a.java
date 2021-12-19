package com.p2082ss.android.ugc.aweme.account.login;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.account.login.I18nSignUpActivity;
import com.p2082ss.android.ugc.aweme.account.p2247f.C31667a;
import com.p2082ss.android.ugc.aweme.account.p2274n.C32867m;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.a */
public final class DialogC31809a extends AbstractDialogC31909e {

    /* renamed from: a */
    public static final C31810a f76038a = new C31810a((byte) 0);

    static {
        Covode.recordClassIndex(38551);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.a$a */
    public static final class C31810a {
        static {
            Covode.recordClassIndex(38552);
        }

        private C31810a() {
        }

        public /* synthetic */ C31810a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.a$d */
    static final class View$OnClickListenerC31814d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC31809a f76042a;

        static {
            Covode.recordClassIndex(38556);
        }

        View$OnClickListenerC31814d(DialogC31809a aVar) {
            this.f76042a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f76042a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.a$b */
    static final class View$OnClickListenerC31811b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC31809a f76039a;

        static {
            Covode.recordClassIndex(38553);
        }

        View$OnClickListenerC31811b(DialogC31809a aVar) {
            this.f76039a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Activity activity = this.f76039a.f76229b;
            C89219l.m154716b(activity, "");
            C32867m.m67466a(activity).withParam(this.f76039a.f76230c).open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.a$c */
    static final class View$OnClickListenerC31812c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC31809a f76040a;

        static {
            Covode.recordClassIndex(38554);
        }

        View$OnClickListenerC31812c(DialogC31809a aVar) {
            this.f76040a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            new Handler().postDelayed(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.account.login.DialogC31809a.View$OnClickListenerC31812c.RunnableC318131 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC31812c f76041a;

                static {
                    Covode.recordClassIndex(38555);
                }

                {
                    this.f76041a = r1;
                }

                public final void run() {
                    Activity activity = this.f76041a.f76040a.f76229b;
                    C89219l.m154716b(activity, "");
                    I18nSignUpActivity.C31771a.m66132a(activity, this.f76041a.f76040a.f76230c, true, false, false);
                }
            }, 300);
            this.f76040a.f76235h = true;
            this.f76040a.dismiss();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.AbstractDialogC31909e
    /* renamed from: a */
    public final void mo57760a(Context context) {
        MethodCollector.m26663i(10639);
        C89219l.m154721d(context, "");
        this.f76236i = getLayoutInflater().inflate(R.layout.fx, (ViewGroup) null);
        View view = this.f76236i;
        if (view != null) {
            this.f76230c.putBoolean("age_gate_block", true);
            view.findViewById(R.id.ae2).setOnClickListener(new View$OnClickListenerC31811b(this));
            view.findViewById(R.id.cgn).setOnClickListener(new View$OnClickListenerC31812c(this));
            view.findViewById(R.id.e1u).setOnClickListener(new View$OnClickListenerC31814d(this));
        }
        setContentView(this.f76236i);
        C31667a.m65984a(this);
        MethodCollector.m26664o(10639);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC31809a(Activity activity, Bundle bundle) {
        super(activity, bundle);
        C89219l.m154721d(activity, "");
        C89219l.m154721d(bundle, "");
        mo57760a(activity);
    }
}
