package com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.p3359ui;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.C57646a;
import com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.p3357c.C57656a;
import com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.response.C57663a;
import com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.response.C57664b;
import com.p2082ss.android.ugc.aweme.utils.C80298cg;
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

/* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.PolicyNoticeToast */
public final class PolicyNoticeToast extends LinearLayout implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    private C57663a f131632a;

    /* renamed from: b */
    private TuxTextView f131633b;

    /* renamed from: c */
    private TuxTextView f131634c;

    /* renamed from: d */
    private TuxTextView f131635d;

    /* renamed from: e */
    private TextView f131636e;

    static {
        Covode.recordClassIndex(67643);
    }

    public PolicyNoticeToast(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(83, new RunnableC90250g(PolicyNoticeToast.class, "onJsBroadCastEvent", C57656a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.PolicyNoticeToast$c */
    static final class C57679c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ PolicyNoticeToast f131642a;

        static {
            Covode.recordClassIndex(67648);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57679c(PolicyNoticeToast policyNoticeToast) {
            super(0);
            this.f131642a = policyNoticeToast;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f131642a.mo95006a();
            return C89391z.f203057a;
        }
    }

    public final int getToastVisibility() {
        return getVisibility();
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.PolicyNoticeToast$d */
    static final class RunnableC57680d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PolicyNoticeToast f131643a;

        static {
            Covode.recordClassIndex(67649);
        }

        RunnableC57680d(PolicyNoticeToast policyNoticeToast) {
            this.f131643a = policyNoticeToast;
        }

        public final void run() {
            PolicyNoticeToast policyNoticeToast = this.f131643a;
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
            animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, (float) this.f131643a.getHeight(), 0.0f));
            animationSet.setDuration(300);
            policyNoticeToast.startAnimation(animationSet);
            this.f131643a.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final void mo95006a() {
        C80298cg.m139205b(this);
        setVisibility(8);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
        animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) getHeight()));
        animationSet.setDuration(300);
        startAnimation(animationSet);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.PolicyNoticeToast$b */
    static final class C57678b extends AbstractC89220m implements AbstractC89172b<C57664b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PolicyNoticeToast f131641a;

        static {
            Covode.recordClassIndex(67647);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57678b(PolicyNoticeToast policyNoticeToast) {
            super(1);
            this.f131641a = policyNoticeToast;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C57664b bVar) {
            C57664b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            this.f131641a.mo95007a(bVar2);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.PolicyNoticeToast$a */
    public static final class View$OnClickListenerC57675a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PolicyNoticeToast f131637a;

        /* renamed from: b */
        final /* synthetic */ C57664b f131638b;

        static {
            Covode.recordClassIndex(67644);
        }

        View$OnClickListenerC57675a(PolicyNoticeToast policyNoticeToast, C57664b bVar) {
            this.f131637a = policyNoticeToast;
            this.f131638b = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C57664b bVar = this.f131638b;
            Context context = this.f131637a.getContext();
            C89219l.m154716b(context, "");
            C57646a.m104378a(bVar, context, new AbstractC89172b<C57664b, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.p3359ui.PolicyNoticeToast.View$OnClickListenerC57675a.C576761 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC57675a f131639a;

                static {
                    Covode.recordClassIndex(67645);
                }

                {
                    this.f131639a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C57664b bVar) {
                    C57664b bVar2 = bVar;
                    C89219l.m154721d(bVar2, "");
                    this.f131639a.f131637a.mo95007a(bVar2);
                    return C89391z.f203057a;
                }
            }, new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.p3359ui.PolicyNoticeToast.View$OnClickListenerC57675a.C576772 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC57675a f131640a;

                static {
                    Covode.recordClassIndex(67646);
                }

                {
                    this.f131640a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    this.f131640a.f131637a.mo95006a();
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo95007a(C57664b bVar) {
        C57663a aVar = this.f131632a;
        if (aVar == null) {
            C89219l.m154710a("mPolicyNotice");
        }
        C57646a.m104377a(aVar, bVar);
        Context context = getContext();
        C89219l.m154716b(context, "");
        C57646a.m104375a(context);
        mo95006a();
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C57656a aVar) {
        C89219l.m154721d(aVar, "");
        if (TextUtils.equals(aVar.f131590b.optString("eventName"), "cancel_post_success")) {
            mo95006a();
        }
    }

    public final void setValues(C57663a aVar) {
        MethodCollector.m26663i(3142);
        C89219l.m154721d(aVar, "");
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.ac3, (ViewGroup) null);
        View findViewById = inflate.findViewById(R.id.eu6);
        C89219l.m154716b(findViewById, "");
        this.f131633b = (TuxTextView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.zz);
        C89219l.m154716b(findViewById2, "");
        this.f131634c = (TuxTextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.a00);
        C89219l.m154716b(findViewById3, "");
        this.f131635d = (TuxTextView) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.eyj);
        C89219l.m154716b(findViewById4, "");
        this.f131636e = (TextView) findViewById4;
        addView(inflate);
        C80298cg.m139204a(this);
        this.f131632a = aVar;
        TuxTextView tuxTextView = this.f131633b;
        if (tuxTextView == null) {
            C89219l.m154710a("mContent");
        }
        Context context = tuxTextView.getContext();
        C89219l.m154716b(context, "");
        C57663a aVar2 = this.f131632a;
        if (aVar2 == null) {
            C89219l.m154710a("mPolicyNotice");
        }
        String body = aVar2.getBody();
        C57663a aVar3 = this.f131632a;
        if (aVar3 == null) {
            C89219l.m154710a("mPolicyNotice");
        }
        tuxTextView.setText(C57646a.m104374a(context, body, aVar3.getPolicyLinkList(), new C57678b(this), new C57679c(this)));
        tuxTextView.setHighlightColor(C0643b.m2378c(tuxTextView.getContext(), R.color.c9));
        tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
        TuxTextView tuxTextView2 = this.f131634c;
        if (tuxTextView2 == null) {
            C89219l.m154710a("mButton1");
        }
        C57663a aVar4 = this.f131632a;
        if (aVar4 == null) {
            C89219l.m154710a("mPolicyNotice");
        }
        m104385a(tuxTextView2, aVar4.getActions().get(0));
        C57663a aVar5 = this.f131632a;
        if (aVar5 == null) {
            C89219l.m154710a("mPolicyNotice");
        }
        if (aVar5.getActions().size() > 1) {
            TextView textView = this.f131636e;
            if (textView == null) {
                C89219l.m154710a("mLine");
            }
            textView.setVisibility(0);
            TuxTextView tuxTextView3 = this.f131635d;
            if (tuxTextView3 == null) {
                C89219l.m154710a("mButton2");
            }
            tuxTextView3.setVisibility(0);
            TuxTextView tuxTextView4 = this.f131635d;
            if (tuxTextView4 == null) {
                C89219l.m154710a("mButton2");
            }
            C57663a aVar6 = this.f131632a;
            if (aVar6 == null) {
                C89219l.m154710a("mPolicyNotice");
            }
            m104385a(tuxTextView4, aVar6.getActions().get(1));
        } else {
            TextView textView2 = this.f131636e;
            if (textView2 == null) {
                C89219l.m154710a("mLine");
            }
            textView2.setVisibility(8);
            TuxTextView tuxTextView5 = this.f131635d;
            if (tuxTextView5 == null) {
                C89219l.m154710a("mButton2");
            }
            tuxTextView5.setVisibility(8);
        }
        setVisibility(4);
        post(new RunnableC57680d(this));
        MethodCollector.m26664o(3142);
    }

    /* renamed from: a */
    private final void m104385a(TuxTextView tuxTextView, C57664b bVar) {
        if (tuxTextView != null) {
            tuxTextView.setText(bVar.f131608a);
        }
        if (bVar.f131609b) {
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
        tuxTextView.setOnClickListener(new View$OnClickListenerC57675a(this, bVar));
    }

    private /* synthetic */ PolicyNoticeToast(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private PolicyNoticeToast(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(3166);
        MethodCollector.m26664o(3166);
    }
}
