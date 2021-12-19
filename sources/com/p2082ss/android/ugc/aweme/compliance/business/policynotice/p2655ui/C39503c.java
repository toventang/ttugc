package com.p2082ss.android.ugc.aweme.compliance.business.policynotice.p2655ui;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39248i;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39249j;
import com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39235f;
import com.p2082ss.android.ugc.aweme.compliance.business.policynotice.C39456a;
import com.p2082ss.android.ugc.aweme.p2929fe.method.C47959j;
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

/* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.ui.c */
public final class C39503c extends LinearLayout implements AbstractC39235f, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public C39248i f93184a;

    /* renamed from: b */
    private TuxTextView f93185b;

    /* renamed from: c */
    private TuxTextView f93186c;

    /* renamed from: d */
    private TuxTextView f93187d;

    /* renamed from: e */
    private TuxTextView f93188e;

    static {
        Covode.recordClassIndex(47195);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(58, new RunnableC90250g(C39503c.class, "onJsBroadCastEvent", C47959j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.ui.c$c */
    static final class C39508c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C39503c f93194a;

        static {
            Covode.recordClassIndex(47200);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39508c(C39503c cVar) {
            super(0);
            this.f93194a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f93194a.mo68940a();
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39235f
    public final int getToastVisibility() {
        return getVisibility();
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.ui.c$d */
    static final class RunnableC39509d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C39503c f93195a;

        static {
            Covode.recordClassIndex(47201);
        }

        RunnableC39509d(C39503c cVar) {
            this.f93195a = cVar;
        }

        public final void run() {
            C39503c cVar = this.f93195a;
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
            animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, (float) this.f93195a.getHeight(), 0.0f));
            animationSet.setDuration(300);
            cVar.startAnimation(animationSet);
            this.f93195a.setVisibility(0);
            C39456a.m80157a(C39503c.m80178a(this.f93195a).getBusiness(), C39503c.m80178a(this.f93195a).getStyle());
        }
    }

    /* renamed from: a */
    public final void mo68940a() {
        EventBus.m156962a().mo145395b(this);
        setVisibility(8);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
        animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) getHeight()));
        animationSet.setDuration(300);
        startAnimation(animationSet);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.ui.c$b */
    static final class C39507b extends AbstractC89220m implements AbstractC89172b<C39249j, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C39503c f93193a;

        static {
            Covode.recordClassIndex(47199);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39507b(C39503c cVar) {
            super(1);
            this.f93193a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C39249j jVar) {
            C39249j jVar2 = jVar;
            C89219l.m154721d(jVar2, "");
            this.f93193a.mo68941a(jVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C39248i m80178a(C39503c cVar) {
        C39248i iVar = cVar.f93184a;
        if (iVar == null) {
            C89219l.m154710a("mPolicyNotice");
        }
        return iVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C39503c(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(10896);
        MethodCollector.m26664o(10896);
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
    public final void mo68941a(com.p2082ss.android.ugc.aweme.compliance.api.model.C39249j r3) {
        /*
            r2 = this;
            com.ss.android.ugc.aweme.compliance.api.model.i r1 = r2.f93184a
            if (r1 != 0) goto L_0x0009
            java.lang.String r0 = "mPolicyNotice"
            p4600h.p4611f.p4613b.C89219l.m154710a(r0)
        L_0x0009:
            com.p2082ss.android.ugc.aweme.compliance.business.policynotice.C39456a.m80153a(r1, r3)
            com.p2082ss.android.ugc.aweme.compliance.business.policynotice.C39456a.m80159b()
            r2.mo68940a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.business.policynotice.p2655ui.C39503c.mo68941a(com.ss.android.ugc.aweme.compliance.api.model.j):void");
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C47959j jVar) {
        C89219l.m154721d(jVar, "");
        if (TextUtils.equals(jVar.f111077b.optString("eventName"), "cancel_post_success")) {
            mo68940a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.ui.c$a */
    public static final class View$OnClickListenerC39504a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39503c f93189a;

        /* renamed from: b */
        final /* synthetic */ C39249j f93190b;

        static {
            Covode.recordClassIndex(47196);
        }

        View$OnClickListenerC39504a(C39503c cVar, C39249j jVar) {
            this.f93189a = cVar;
            this.f93190b = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C39249j jVar = this.f93190b;
            Context context = this.f93189a.getContext();
            C89219l.m154716b(context, "");
            C39456a.m80155a(jVar, context, new AbstractC89172b<C39249j, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.compliance.business.policynotice.p2655ui.C39503c.View$OnClickListenerC39504a.C395051 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC39504a f93191a;

                static {
                    Covode.recordClassIndex(47197);
                }

                {
                    this.f93191a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C39249j jVar) {
                    C39249j jVar2 = jVar;
                    C89219l.m154721d(jVar2, "");
                    this.f93191a.f93189a.mo68941a(jVar2);
                    return C89391z.f203057a;
                }
            }, new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.compliance.business.policynotice.p2655ui.C39503c.View$OnClickListenerC39504a.C395062 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC39504a f93192a;

                static {
                    Covode.recordClassIndex(47198);
                }

                {
                    this.f93192a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    this.f93192a.f93189a.mo68940a();
                    return C89391z.f203057a;
                }
            });
            C39456a.m80158a(this.f93190b.f92716a, C39503c.m80178a(this.f93189a).getBusiness(), C39503c.m80178a(this.f93189a).getStyle());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39235f
    public final void setValues(C39248i iVar) {
        MethodCollector.m26663i(10753);
        C89219l.m154721d(iVar, "");
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.uv, (ViewGroup) null);
        View findViewById = inflate.findViewById(R.id.eu6);
        C89219l.m154716b(findViewById, "");
        this.f93185b = (TuxTextView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.zz);
        C89219l.m154716b(findViewById2, "");
        this.f93186c = (TuxTextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.a00);
        C89219l.m154716b(findViewById3, "");
        this.f93187d = (TuxTextView) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.eyj);
        C89219l.m154716b(findViewById4, "");
        this.f93188e = (TuxTextView) findViewById4;
        addView(inflate);
        EventBus.m156966a(EventBus.m156962a(), this);
        this.f93184a = iVar;
        TuxTextView tuxTextView = this.f93185b;
        if (tuxTextView == null) {
            C89219l.m154710a("mContent");
        }
        Context context = tuxTextView.getContext();
        C89219l.m154716b(context, "");
        C39248i iVar2 = this.f93184a;
        if (iVar2 == null) {
            C89219l.m154710a("mPolicyNotice");
        }
        String body = iVar2.getBody();
        C39248i iVar3 = this.f93184a;
        if (iVar3 == null) {
            C89219l.m154710a("mPolicyNotice");
        }
        tuxTextView.setText(C39456a.m80150a(context, body, iVar3.getPolicyLinkList(), new C39507b(this), new C39508c(this)));
        tuxTextView.setHighlightColor(C0643b.m2378c(tuxTextView.getContext(), R.color.c9));
        tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
        TuxTextView tuxTextView2 = this.f93186c;
        if (tuxTextView2 == null) {
            C89219l.m154710a("mButton1");
        }
        C39248i iVar4 = this.f93184a;
        if (iVar4 == null) {
            C89219l.m154710a("mPolicyNotice");
        }
        m80179a(tuxTextView2, iVar4.getActions().get(0));
        C39248i iVar5 = this.f93184a;
        if (iVar5 == null) {
            C89219l.m154710a("mPolicyNotice");
        }
        if (iVar5.getActions().size() > 1) {
            TuxTextView tuxTextView3 = this.f93188e;
            if (tuxTextView3 == null) {
                C89219l.m154710a("mLine");
            }
            tuxTextView3.setVisibility(0);
            TuxTextView tuxTextView4 = this.f93187d;
            if (tuxTextView4 == null) {
                C89219l.m154710a("mButton2");
            }
            tuxTextView4.setVisibility(0);
            TuxTextView tuxTextView5 = this.f93187d;
            if (tuxTextView5 == null) {
                C89219l.m154710a("mButton2");
            }
            C39248i iVar6 = this.f93184a;
            if (iVar6 == null) {
                C89219l.m154710a("mPolicyNotice");
            }
            m80179a(tuxTextView5, iVar6.getActions().get(1));
        } else {
            TuxTextView tuxTextView6 = this.f93188e;
            if (tuxTextView6 == null) {
                C89219l.m154710a("mLine");
            }
            tuxTextView6.setVisibility(8);
            TuxTextView tuxTextView7 = this.f93187d;
            if (tuxTextView7 == null) {
                C89219l.m154710a("mButton2");
            }
            tuxTextView7.setVisibility(8);
        }
        setVisibility(4);
        post(new RunnableC39509d(this));
        MethodCollector.m26664o(10753);
    }

    public /* synthetic */ C39503c(Context context, byte b) {
        this(context);
    }

    /* renamed from: a */
    private final void m80179a(TuxTextView tuxTextView, C39249j jVar) {
        if (tuxTextView != null) {
            tuxTextView.setText(jVar.f92716a);
        }
        if (jVar.f92717b) {
            if (tuxTextView != null) {
                tuxTextView.setTuxFont(43);
                tuxTextView.setTextColorRes(R.attr.be);
            } else {
                return;
            }
        } else if (tuxTextView != null) {
            tuxTextView.setTuxFont(41);
        } else {
            return;
        }
        tuxTextView.setOnClickListener(new View$OnClickListenerC39504a(this, jVar));
    }
}
