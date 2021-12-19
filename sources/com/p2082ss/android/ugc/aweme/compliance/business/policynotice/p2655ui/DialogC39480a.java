package com.p2082ss.android.ugc.aweme.compliance.business.policynotice.p2655ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.Window;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39248i;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39249j;
import com.p2082ss.android.ugc.aweme.compliance.business.policynotice.C39456a;
import com.p2082ss.android.ugc.aweme.p2929fe.method.C47959j;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.aweme.views.DialogC81459o;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.ui.a */
public final class DialogC39480a extends DialogC81459o implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public boolean f93149a;

    /* renamed from: b */
    public final C39248i f93150b;

    /* renamed from: c */
    private final Handler f93151c = new Handler();

    static {
        Covode.recordClassIndex(47172);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(58, new RunnableC90250g(DialogC39480a.class, "onJsBroadCastEvent", C47959j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.ui.a$b */
    static final class C39482b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ DialogC39480a f93153a;

        static {
            Covode.recordClassIndex(47174);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39482b(DialogC39480a aVar) {
            super(0);
            this.f93153a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f93153a.dismiss();
            return C89391z.f203057a;
        }
    }

    public final void dismiss() {
        EventBus.m156962a().mo145395b(this);
        super.dismiss();
        if (this.f93149a) {
            C81079v.m140776O().mo123950y();
            this.f93149a = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.ui.a$d */
    public static final class RunnableC39486d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DialogC39480a f93158a;

        static {
            Covode.recordClassIndex(47178);
        }

        RunnableC39486d(DialogC39480a aVar) {
            this.f93158a = aVar;
        }

        public final void run() {
            if (this.f93158a.isShowing()) {
                AbstractC80747i O = C81079v.m140776O();
                C89219l.m154716b(O, "");
                if (O.mo123892o()) {
                    C81079v.m140776O().mo123908B();
                    this.f93158a.f93149a = true;
                    return;
                }
                this.f93158a.mo68926a();
            }
        }
    }

    /* renamed from: a */
    public final void mo68926a() {
        AbstractC80747i O = C81079v.m140776O();
        C89219l.m154716b(O, "");
        if (O.mo123892o()) {
            C81079v.m140776O().mo123908B();
            this.f93149a = true;
            return;
        }
        this.f93151c.postDelayed(new RunnableC39486d(this), 1000);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.ui.a$a */
    static final class C39481a extends AbstractC89220m implements AbstractC89172b<C39249j, C89391z> {

        /* renamed from: a */
        final /* synthetic */ DialogC39480a f93152a;

        static {
            Covode.recordClassIndex(47173);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39481a(DialogC39480a aVar) {
            super(1);
            this.f93152a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C39249j jVar) {
            C39249j jVar2 = jVar;
            C89219l.m154721d(jVar2, "");
            this.f93152a.mo68927a(jVar2);
            return C89391z.f203057a;
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            mo68926a();
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 2
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    /* renamed from: a */
    public final void mo68927a(com.p2082ss.android.ugc.aweme.compliance.api.model.C39249j r2) {
        /*
            r1 = this;
            com.ss.android.ugc.aweme.compliance.api.model.i r0 = r1.f93150b
            com.p2082ss.android.ugc.aweme.compliance.business.policynotice.C39456a.m80153a(r0, r2)
            com.p2082ss.android.ugc.aweme.compliance.business.policynotice.C39456a.m80159b()
            r1.dismiss()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.business.policynotice.p2655ui.DialogC39480a.mo68927a(com.ss.android.ugc.aweme.compliance.api.model.j):void");
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C47959j jVar) {
        C89219l.m154721d(jVar, "");
        if (TextUtils.equals(jVar.f111077b.optString("eventName"), "cancel_post_success")) {
            dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.ui.a$c */
    public static final class View$OnClickListenerC39483c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC39480a f93154a;

        /* renamed from: b */
        final /* synthetic */ C39249j f93155b;

        static {
            Covode.recordClassIndex(47175);
        }

        View$OnClickListenerC39483c(DialogC39480a aVar, C39249j jVar) {
            this.f93154a = aVar;
            this.f93155b = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C39249j jVar = this.f93155b;
            Context context = this.f93154a.getContext();
            C89219l.m154716b(context, "");
            C39456a.m80155a(jVar, context, new AbstractC89172b<C39249j, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.compliance.business.policynotice.p2655ui.DialogC39480a.View$OnClickListenerC39483c.C394841 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC39483c f93156a;

                static {
                    Covode.recordClassIndex(47176);
                }

                {
                    this.f93156a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C39249j jVar) {
                    C39249j jVar2 = jVar;
                    C89219l.m154721d(jVar2, "");
                    this.f93156a.f93154a.mo68927a(jVar2);
                    return C89391z.f203057a;
                }
            }, new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.compliance.business.policynotice.p2655ui.DialogC39480a.View$OnClickListenerC39483c.C394852 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC39483c f93157a;

                static {
                    Covode.recordClassIndex(47177);
                }

                {
                    this.f93157a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    this.f93157a.f93154a.dismiss();
                    return C89391z.f203057a;
                }
            });
            C39456a.m80158a(this.f93155b.f92716a, this.f93154a.f93150b.getBusiness(), this.f93154a.f93150b.getStyle());
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        View decorView;
        super.onCreate(bundle);
        setContentView(R.layout.ul);
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
        if (!C89219l.m154714a((Object) this.f93150b.isSubPopUp(), (Object) true)) {
            setCancelable(false);
            setCanceledOnTouchOutside(false);
        }
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.title);
        tuxTextView.setText(this.f93150b.getTitle());
        tuxTextView.setTuxFont(23);
        TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.acq);
        Context context = tuxTextView2.getContext();
        C89219l.m154716b(context, "");
        tuxTextView2.setText(C39456a.m80150a(context, this.f93150b.getBody(), this.f93150b.getPolicyLinkList(), new C39481a(this), new C39482b(this)));
        tuxTextView2.setHighlightColor(C0643b.m2378c(tuxTextView2.getContext(), R.color.c9));
        tuxTextView2.setMovementMethod(LinkMovementMethod.getInstance());
        C39456a.m80157a(this.f93150b.getBusiness(), this.f93150b.getStyle());
        TuxTextView tuxTextView3 = (TuxTextView) findViewById(R.id.zz);
        tuxTextView3.setTuxFont(43);
        m80168a(tuxTextView3, this.f93150b.getActions().get(0));
        if (this.f93150b.getActions().size() > 1) {
            TuxTextView tuxTextView4 = (TuxTextView) findViewById(R.id.a00);
            tuxTextView4.setVisibility(0);
            m80168a(tuxTextView4, this.f93150b.getActions().get(1));
        } else {
            TuxTextView tuxTextView5 = (TuxTextView) findViewById(R.id.a00);
            C89219l.m154716b(tuxTextView5, "");
            tuxTextView5.setVisibility(8);
        }
        EventBus.m156966a(EventBus.m156962a(), this);
    }

    /* renamed from: a */
    private final void m80168a(TuxTextView tuxTextView, C39249j jVar) {
        if (tuxTextView != null) {
            tuxTextView.setText(jVar.f92716a);
            tuxTextView.setOnClickListener(new View$OnClickListenerC39483c(this, jVar));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC39480a(Context context, C39248i iVar) {
        super(context, R.style.zn, true, true, false);
        C89219l.m154721d(context, "");
        C89219l.m154721d(iVar, "");
        this.f93150b = iVar;
    }
}
