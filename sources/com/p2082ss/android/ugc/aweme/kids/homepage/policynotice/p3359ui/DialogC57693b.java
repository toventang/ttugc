package com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.p3359ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.C57646a;
import com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.p3355a.DialogC57652a;
import com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.p3357c.C57656a;
import com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.response.C57663a;
import com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.response.C57664b;
import com.p2082ss.android.ugc.aweme.utils.C80298cg;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.b */
public final class DialogC57693b extends DialogC57652a implements AbstractC90252i, AbstractC90253j {

    /* renamed from: d */
    public boolean f131660d;

    /* renamed from: e */
    private final Handler f131661e = new Handler();

    /* renamed from: f */
    private final C57663a f131662f;

    static {
        Covode.recordClassIndex(67662);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(83, new RunnableC90250g(DialogC57693b.class, "onJsBroadCastEvent", C57656a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.b$b */
    static final class C57695b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ DialogC57693b f131664a;

        static {
            Covode.recordClassIndex(67664);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57695b(DialogC57693b bVar) {
            super(0);
            this.f131664a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f131664a.dismiss();
            return C89391z.f203057a;
        }
    }

    public final void dismiss() {
        C80298cg.m139205b(this);
        super.dismiss();
        if (this.f131660d) {
            C81079v.m140776O().mo123950y();
            this.f131660d = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.b$d */
    public static final class RunnableC57699d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DialogC57693b f131669a;

        static {
            Covode.recordClassIndex(67668);
        }

        RunnableC57699d(DialogC57693b bVar) {
            this.f131669a = bVar;
        }

        public final void run() {
            if (this.f131669a.isShowing()) {
                AbstractC80747i O = C81079v.m140776O();
                C89219l.m154716b(O, "");
                if (O.mo123892o()) {
                    C81079v.m140776O().mo123908B();
                    this.f131669a.f131660d = true;
                    return;
                }
                this.f131669a.mo95023a();
            }
        }
    }

    /* renamed from: a */
    public final void mo95023a() {
        AbstractC80747i O = C81079v.m140776O();
        C89219l.m154716b(O, "");
        if (O.mo123892o()) {
            C81079v.m140776O().mo123908B();
            this.f131660d = true;
            return;
        }
        this.f131661e.postDelayed(new RunnableC57699d(this), 1000);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.b$a */
    static final class C57694a extends AbstractC89220m implements AbstractC89172b<C57664b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ DialogC57693b f131663a;

        static {
            Covode.recordClassIndex(67663);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57694a(DialogC57693b bVar) {
            super(1);
            this.f131663a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C57664b bVar) {
            C57664b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            this.f131663a.mo95024a(bVar2);
            return C89391z.f203057a;
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            mo95023a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.b$c */
    public static final class View$OnClickListenerC57696c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC57693b f131665a;

        /* renamed from: b */
        final /* synthetic */ C57664b f131666b;

        static {
            Covode.recordClassIndex(67665);
        }

        View$OnClickListenerC57696c(DialogC57693b bVar, C57664b bVar2) {
            this.f131665a = bVar;
            this.f131666b = bVar2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C57664b bVar = this.f131666b;
            Context context = this.f131665a.getContext();
            C89219l.m154716b(context, "");
            C57646a.m104378a(bVar, context, new AbstractC89172b<C57664b, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.p3359ui.DialogC57693b.View$OnClickListenerC57696c.C576971 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC57696c f131667a;

                static {
                    Covode.recordClassIndex(67666);
                }

                {
                    this.f131667a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C57664b bVar) {
                    C57664b bVar2 = bVar;
                    C89219l.m154721d(bVar2, "");
                    this.f131667a.f131665a.mo95024a(bVar2);
                    return C89391z.f203057a;
                }
            }, new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.p3359ui.DialogC57693b.View$OnClickListenerC57696c.C576982 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC57696c f131668a;

                static {
                    Covode.recordClassIndex(67667);
                }

                {
                    this.f131668a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    this.f131668a.f131665a.dismiss();
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo95024a(C57664b bVar) {
        C57646a.m104377a(this.f131662f, bVar);
        Context context = getContext();
        C89219l.m154716b(context, "");
        C57646a.m104375a(context);
        dismiss();
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C57656a aVar) {
        C89219l.m154721d(aVar, "");
        if (TextUtils.equals(aVar.f131590b.optString("eventName"), "cancel_post_success")) {
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        View decorView;
        super.onCreate(bundle);
        setContentView(R.layout.ac0);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = getWindow();
        if (!(window2 == null || (decorView = window2.getDecorView()) == null)) {
            decorView.setPadding(0, 0, 0, 0);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setGravity(80);
        }
        if (!C89219l.m154714a((Object) this.f131662f.isSubPopUp(), (Object) true)) {
            setCancelable(false);
            setCanceledOnTouchOutside(false);
        }
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.title);
        tuxTextView.setText(this.f131662f.getTitle());
        tuxTextView.setTuxFont(23);
        TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.acq);
        Context context = tuxTextView2.getContext();
        C89219l.m154716b(context, "");
        tuxTextView2.setText(C57646a.m104374a(context, this.f131662f.getBody(), this.f131662f.getPolicyLinkList(), new C57694a(this), new C57695b(this)));
        tuxTextView2.setHighlightColor(C0643b.m2378c(tuxTextView2.getContext(), R.color.c9));
        tuxTextView2.setMovementMethod(LinkMovementMethod.getInstance());
        TuxTextView tuxTextView3 = (TuxTextView) findViewById(R.id.zz);
        tuxTextView3.setTuxFont(43);
        m104395a(tuxTextView3, this.f131662f.getActions().get(0));
        if (this.f131662f.getActions().size() > 1) {
            TuxTextView tuxTextView4 = (TuxTextView) findViewById(R.id.a00);
            tuxTextView4.setVisibility(0);
            m104395a(tuxTextView4, this.f131662f.getActions().get(1));
        } else {
            TuxTextView tuxTextView5 = (TuxTextView) findViewById(R.id.a00);
            C89219l.m154716b(tuxTextView5, "");
            tuxTextView5.setVisibility(8);
        }
        C80298cg.m139204a(this);
    }

    /* renamed from: a */
    private final void m104395a(TextView textView, C57664b bVar) {
        if (textView != null) {
            textView.setText(bVar.f131608a);
            textView.setOnClickListener(new View$OnClickListenerC57696c(this, bVar));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC57693b(Context context, C57663a aVar) {
        super(context);
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        this.f131662f = aVar;
    }
}
