package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.invite;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.fragment.C17372a;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20380ar;
import com.bytedance.jedi.arch.AbstractC20468h;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20527q;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.data.model.AcceptInviteCardResponse;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.data.model.InviteCardDetailInnerResponse;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.invite.p3203a.C55371a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.invite.p3203a.C55373c;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56201b;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.b */
public final class C54017b extends C17372a implements AbstractC20380ar<C54046h>, AbstractC20527q {

    /* renamed from: f */
    public static final C54022d f123850f = new C54022d((byte) 0);

    /* renamed from: e */
    public Long f123851e;

    /* renamed from: g */
    private C54046h f123852g = new C54046h();

    /* renamed from: h */
    private final lifecycleAwareLazy f123853h;

    /* renamed from: i */
    private HashMap f123854i;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.b$b */
    public static final class C54019b extends AbstractC89220m implements AbstractC89183m<GroupInviteState, Bundle, GroupInviteState> {
        public static final C54019b INSTANCE = new C54019b();

        static {
            Covode.recordClassIndex(63692);
        }

        public C54019b() {
            super(2);
        }

        public final GroupInviteState invoke(GroupInviteState groupInviteState, Bundle bundle) {
            C89219l.m154719c(groupInviteState, "");
            return groupInviteState;
        }
    }

    static {
        Covode.recordClassIndex(63690);
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: a */
    public final View mo27715a(int i) {
        if (this.f123854i == null) {
            this.f123854i = new HashMap();
        }
        View view = (View) this.f123854i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f123854i.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    public final void bx_() {
        HashMap hashMap = this.f123854i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: c */
    public final GroupInviteViewModel mo64296c() {
        return (GroupInviteViewModel) this.f123853h.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        bx_();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.b$d */
    public static final class C54022d {
        static {
            Covode.recordClassIndex(63695);
        }

        private C54022d() {
        }

        public /* synthetic */ C54022d(byte b) {
            this();
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.b$a */
    public static final class C54018a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f123855a;

        static {
            Covode.recordClassIndex(63691);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54018a(AbstractC89277c cVar) {
            super(0);
            this.f123855a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            String name = C89170a.m154665a(this.f123855a).getName();
            C89219l.m154709a((Object) name, "");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.b$c */
    public static final class C54020c extends AbstractC89220m implements AbstractC89171a<GroupInviteViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f123856a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f123857b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f123858c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89183m f123859d;

        static {
            Covode.recordClassIndex(63693);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54020c(Fragment fragment, AbstractC89171a aVar, AbstractC89277c cVar, AbstractC89183m mVar) {
            super(0);
            this.f123856a = fragment;
            this.f123857b = aVar;
            this.f123858c = cVar;
            this.f123859d = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.GroupInviteViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.invite.GroupInviteViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r1 = r3.f123856a
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.AbstractC20380ar) r0
                androidx.lifecycle.ad$b r0 = r0.mo33721d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3879a(r1, r0)
                h.f.a.a r0 = r3.f123857b
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.f123858c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r2 = m99241xe5748f84(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f48234j
                java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.GroupInviteViewModel> r0 = com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.invite.GroupInviteViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.mo33696a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.b$c$1 r0 = new com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.b$c$1
                r0.<init>(r3)
                r2.mo33686a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.invite.C54017b.C54020c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_im_sdk_chat_feature_group_invite_GroupInviteFragment$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m99241xe5748f84(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    public C54017b() {
        AbstractC89277c a = C89204ab.m154669a(GroupInviteViewModel.class);
        C54018a aVar = new C54018a(a);
        this.f123853h = new lifecycleAwareLazy(this, aVar, new C54020c(this, aVar, a, C54019b.INSTANCE));
    }

    /* renamed from: f */
    private final int m99234f() {
        if (C55197c.m100919b().equals(String.valueOf(this.f123851e))) {
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            return C89241a.m154730a(TypedValue.applyDimension(1, 216.0f, system.getDisplayMetrics()));
        }
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        return C89241a.m154730a(TypedValue.applyDimension(1, 342.0f, system2.getDisplayMetrics()));
    }

    /* renamed from: g */
    private final void m99235g() {
        String str;
        TuxButton tuxButton = (TuxButton) mo27715a(R.id.xj);
        C89219l.m154716b(tuxButton, "");
        Context context = getContext();
        if (context != null) {
            str = context.getString(R.string.c88);
        } else {
            str = null;
        }
        tuxButton.setText(str);
        TuxButton tuxButton2 = (TuxButton) mo27715a(R.id.xj);
        C89219l.m154716b(tuxButton2, "");
        tuxButton2.setEnabled(true);
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20380ar
    /* renamed from: d */
    public final /* synthetic */ C54046h mo33721d() {
        String str;
        Serializable serializable;
        Bundle arguments = getArguments();
        C55371a aVar = null;
        if (arguments != null) {
            str = arguments.getString("arg_invite_id");
        } else {
            str = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable = arguments2.getSerializable("arg_default_group");
        } else {
            serializable = null;
        }
        if (serializable instanceof C55371a) {
            aVar = serializable;
        }
        return new C54046h(str, aVar);
    }

    /* renamed from: e */
    public final void mo91142e() {
        FrameLayout frameLayout = (FrameLayout) mo27715a(R.id.acq);
        C89219l.m154716b(frameLayout, "");
        frameLayout.getLayoutParams().height = m99234f();
        TuxDualBallView tuxDualBallView = (TuxDualBallView) mo27715a(R.id.ap9);
        tuxDualBallView.setVisibility(8);
        tuxDualBallView.mo37885c();
        LinearLayout linearLayout = (LinearLayout) mo27715a(R.id.adu);
        C89219l.m154716b(linearLayout, "");
        linearLayout.setVisibility(8);
        LinearLayout linearLayout2 = (LinearLayout) mo27715a(R.id.awv);
        C89219l.m154716b(linearLayout2, "");
        linearLayout2.setVisibility(0);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.b$k */
    static final class View$OnClickListenerC54029k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C54017b f123867a;

        static {
            Covode.recordClassIndex(63702);
        }

        View$OnClickListenerC54029k(C54017b bVar) {
            this.f123867a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f123867a.mo64296c().mo91139g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.b$e */
    static final class View$OnClickListenerC54023e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C54017b f123861a;

        static {
            Covode.recordClassIndex(63696);
        }

        View$OnClickListenerC54023e(C54017b bVar) {
            this.f123861a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Context context = this.f123861a.getContext();
            if (context != null) {
                GroupInviteViewModel c = this.f123861a.mo64296c();
                C89219l.m154716b(context, "");
                c.mo91136a(context);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.b$f */
    static final class C54024f extends AbstractC89220m implements AbstractC89172b<AbstractC20477i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C54017b f123862a;

        static {
            Covode.recordClassIndex(63697);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54024f(C54017b bVar) {
            super(1);
            this.f123862a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar) {
            C89219l.m154721d(iVar, "");
            ((TuxButton) this.f123862a.mo27715a(R.id.wv)).setLoading(true);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.b$j */
    static final class View$OnClickListenerC54028j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C54017b f123866a;

        static {
            Covode.recordClassIndex(63701);
        }

        View$OnClickListenerC54028j(C54017b bVar) {
            this.f123866a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f123866a.mo64296c().mo91138b();
            this.f123866a.mo64296c().mo91137a("close", "in_app");
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Long l;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            l = Long.valueOf(arguments.getLong("arg_invite_sender"));
        } else {
            l = null;
        }
        this.f123851e = l;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.b$m */
    static final class C54031m extends AbstractC89220m implements AbstractC89172b<AbstractC20477i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C54017b f123869a;

        static {
            Covode.recordClassIndex(63704);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54031m(C54017b bVar) {
            super(1);
            this.f123869a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar) {
            C89219l.m154721d(iVar, "");
            TuxDualBallView tuxDualBallView = (TuxDualBallView) this.f123869a.mo27715a(R.id.ap9);
            tuxDualBallView.setVisibility(0);
            tuxDualBallView.mo37884b();
            LinearLayout linearLayout = (LinearLayout) this.f123869a.mo27715a(R.id.adu);
            C89219l.m154716b(linearLayout, "");
            linearLayout.setVisibility(8);
            LinearLayout linearLayout2 = (LinearLayout) this.f123869a.mo27715a(R.id.awv);
            C89219l.m154716b(linearLayout2, "");
            linearLayout2.setVisibility(8);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.b$p */
    public static final class View$OnClickListenerC54034p implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C54017b f123872a;

        static {
            Covode.recordClassIndex(63707);
        }

        View$OnClickListenerC54034p(C54017b bVar) {
            this.f123872a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!C56201b.m102110a()) {
                new C23144b(this.f123872a).mo37640e(R.string.cni).mo37637b();
                ((AppCompatImageView) this.f123872a.mo27715a(R.id.bu5)).performClick();
                return;
            }
            this.f123872a.mo64296c().mo91135a();
            this.f123872a.mo64296c().mo91137a("join", "in_app");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.b$o */
    static final class C54033o extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C54017b f123871a;

        static {
            Covode.recordClassIndex(63706);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54033o(C54017b bVar) {
            super(2);
            this.f123871a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Throwable th) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(th, "");
            this.f123871a.mo91142e();
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.b$h */
    static final class C54026h extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C54017b f123864a;

        static {
            Covode.recordClassIndex(63699);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54026h(C54017b bVar) {
            super(2);
            this.f123864a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Throwable th) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(th, "");
            ((TuxButton) this.f123864a.mo27715a(R.id.wv)).setLoading(false);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.b$i */
    static final class C54027i extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C54017b f123865a;

        static {
            Covode.recordClassIndex(63700);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54027i(C54017b bVar) {
            super(2);
            this.f123865a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
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
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ p4600h.C89391z invoke(com.bytedance.jedi.arch.AbstractC20477i r3, java.lang.Boolean r4) {
            /*
                r2 = this;
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r1 = r4.booleanValue()
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r3, r0)
                if (r1 == 0) goto L_0x0012
                com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.b r0 = r2.f123865a
                com.bytedance.tux.sheet.sheet.C23226a.C23228b.m43788a(r0)
            L_0x0012:
                h.z r0 = p4600h.C89391z.f203057a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.invite.C54017b.C54027i.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.b$g */
    static final class C54025g extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, AcceptInviteCardResponse, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C54017b f123863a;

        static {
            Covode.recordClassIndex(63698);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54025g(C54017b bVar) {
            super(2);
            this.f123863a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, AcceptInviteCardResponse acceptInviteCardResponse) {
            AcceptInviteCardResponse acceptInviteCardResponse2 = acceptInviteCardResponse;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(acceptInviteCardResponse2, "");
            ((TuxButton) this.f123863a.mo27715a(R.id.wv)).setLoading(false);
            Integer inviteeGroupStatus = acceptInviteCardResponse2.getInviteeGroupStatus();
            if (inviteeGroupStatus != null && inviteeGroupStatus.intValue() == 3) {
                Context context = this.f123863a.getContext();
                if (context != null) {
                    GroupInviteViewModel c = this.f123863a.mo64296c();
                    C89219l.m154716b(context, "");
                    c.mo91136a(context);
                }
            } else {
                this.f123863a.mo91141a(acceptInviteCardResponse2.getInviteeGroupStatus(), acceptInviteCardResponse2.getInviteError());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.b$l */
    static final class C54030l extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C55371a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C54017b f123868a;

        static {
            Covode.recordClassIndex(63703);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54030l(C54017b bVar) {
            super(2);
            this.f123868a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C55371a aVar) {
            String str;
            Resources resources;
            int i;
            int i2;
            C55371a aVar2 = aVar;
            C89219l.m154721d(iVar, "");
            if (aVar2 != null) {
                C34577e.m70608b((RemoteImageView) this.f123868a.mo27715a(R.id.nz), aVar2.getAvatarUrl(), -1, -1);
                TuxTextView tuxTextView = (TuxTextView) this.f123868a.mo27715a(R.id.ewt);
                C89219l.m154716b(tuxTextView, "");
                tuxTextView.setText(aVar2.getName());
                TuxTextView tuxTextView2 = (TuxTextView) this.f123868a.mo27715a(R.id.ews);
                C89219l.m154716b(tuxTextView2, "");
                Context context = this.f123868a.getContext();
                if (context == null || (resources = context.getResources()) == null) {
                    str = null;
                } else {
                    Integer groupSize = aVar2.getGroupSize();
                    if (groupSize != null) {
                        i = groupSize.intValue();
                    } else {
                        i = 0;
                    }
                    Object[] objArr = new Object[1];
                    Integer groupSize2 = aVar2.getGroupSize();
                    if (groupSize2 != null) {
                        i2 = groupSize2.intValue();
                    } else {
                        i2 = 0;
                    }
                    objArr[0] = Integer.valueOf(i2);
                    str = resources.getQuantityString(R.plurals.cu, i, objArr);
                }
                tuxTextView2.setText(str);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.b$n */
    static final class C54032n extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, InviteCardDetailInnerResponse, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C54017b f123870a;

        static {
            Covode.recordClassIndex(63705);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54032n(C54017b bVar) {
            super(2);
            this.f123870a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, InviteCardDetailInnerResponse inviteCardDetailInnerResponse) {
            String str;
            InviteCardDetailInnerResponse inviteCardDetailInnerResponse2 = inviteCardDetailInnerResponse;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(inviteCardDetailInnerResponse2, "");
            Integer inviteeGroupStatus = inviteCardDetailInnerResponse2.getInviteeGroupStatus();
            if ((inviteeGroupStatus != null && inviteeGroupStatus.intValue() == 0) || inviteCardDetailInnerResponse2.getInviteeGroupStatus() == null) {
                if (C55197c.m100919b().equals(String.valueOf(this.f123870a.f123851e))) {
                    this.f123870a.mo91142e();
                    return C89391z.f203057a;
                }
            }
            TuxTextView tuxTextView = (TuxTextView) this.f123870a.mo27715a(R.id.exa);
            C89219l.m154716b(tuxTextView, "");
            Context context = this.f123870a.getContext();
            if (context != null) {
                str = context.getString(R.string.c6q, String.valueOf(inviteCardDetailInnerResponse2.getInviterName()));
            } else {
                str = null;
            }
            tuxTextView.setText(str);
            this.f123870a.mo91141a(inviteCardDetailInnerResponse2.getInviteeGroupStatus(), inviteCardDetailInnerResponse2.getInviteError());
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        FrameLayout frameLayout = (FrameLayout) mo27715a(R.id.acq);
        C89219l.m154716b(frameLayout, "");
        frameLayout.getLayoutParams().height = m99234f();
        ((TuxButton) mo27715a(R.id.xj)).setOnClickListener(new View$OnClickListenerC54023e(this));
        ((AppCompatImageView) mo27715a(R.id.bu5)).setOnClickListener(new View$OnClickListenerC54028j(this));
        ((TuxButton) mo27715a(R.id.yp)).setOnClickListener(new View$OnClickListenerC54029k(this));
        AbstractC88412b unused = selectSubscribe(mo64296c(), C54037e.f123875a, new C20370ah(), new C54030l(this));
        AbstractC20468h.C20469a.m38667a(this, mo64296c(), C54038f.f123876a, (C20370ah) null, new C54033o(this), new C54031m(this), new C54032n(this), 2);
        AbstractC20468h.C20469a.m38667a(this, mo64296c(), C54035c.f123873a, (C20370ah) null, new C54026h(this), new C54024f(this), new C54025g(this), 2);
        AbstractC88412b unused2 = selectSubscribe(mo64296c(), C54036d.f123874a, new C20370ah(), new C54027i(this));
    }

    /* renamed from: a */
    public final void mo91141a(Integer num, C55373c cVar) {
        EnumC54047i iVar;
        boolean z;
        boolean z2;
        int i;
        int i2;
        FrameLayout frameLayout = (FrameLayout) mo27715a(R.id.acq);
        C89219l.m154716b(frameLayout, "");
        frameLayout.getLayoutParams().height = -2;
        TuxDualBallView tuxDualBallView = (TuxDualBallView) mo27715a(R.id.ap9);
        int i3 = 8;
        tuxDualBallView.setVisibility(8);
        tuxDualBallView.mo37885c();
        LinearLayout linearLayout = (LinearLayout) mo27715a(R.id.adu);
        C89219l.m154716b(linearLayout, "");
        linearLayout.setVisibility(0);
        LinearLayout linearLayout2 = (LinearLayout) mo27715a(R.id.awv);
        C89219l.m154716b(linearLayout2, "");
        linearLayout2.setVisibility(8);
        String str = null;
        boolean z3 = true;
        if (C55197c.m100919b().equals(String.valueOf(this.f123851e))) {
            if (num != null && num.intValue() == 3) {
                m99235g();
            } else {
                TuxButton tuxButton = (TuxButton) mo27715a(R.id.xj);
                C89219l.m154716b(tuxButton, "");
                Context context = getContext();
                if (context != null) {
                    str = context.getString(R.string.c8d);
                }
                tuxButton.setText(str);
                TuxButton tuxButton2 = (TuxButton) mo27715a(R.id.xj);
                C89219l.m154716b(tuxButton2, "");
                tuxButton2.setEnabled(false);
            }
            iVar = EnumC54047i.ENTER;
        } else if (cVar == null) {
            if (num != null) {
                if (num.intValue() == 3) {
                    m99235g();
                    iVar = EnumC54047i.ENTER;
                } else if (num != null) {
                    if (num.intValue() == 2) {
                        TuxButton tuxButton3 = (TuxButton) mo27715a(R.id.wv);
                        C89219l.m154716b(tuxButton3, "");
                        Context context2 = getContext();
                        if (context2 != null) {
                            str = context2.getString(R.string.c5i);
                        }
                        tuxButton3.setText(str);
                        TuxButton tuxButton4 = (TuxButton) mo27715a(R.id.wv);
                        C89219l.m154716b(tuxButton4, "");
                        tuxButton4.setEnabled(false);
                        iVar = EnumC54047i.INVITE;
                    } else if (num.intValue() == 1 || num.intValue() == 0) {
                        TuxButton tuxButton5 = (TuxButton) mo27715a(R.id.wv);
                        C89219l.m154716b(tuxButton5, "");
                        Context context3 = getContext();
                        if (context3 != null) {
                            str = context3.getString(R.string.c5g);
                        }
                        tuxButton5.setText(str);
                        ((TuxButton) mo27715a(R.id.wv)).setButtonVariant(0);
                        ((LinearLayout) mo27715a(R.id.cdj)).setOnClickListener(new View$OnClickListenerC54034p(this));
                        iVar = EnumC54047i.INVITE;
                    }
                }
            }
            iVar = EnumC54047i.INVITE;
        } else {
            String str2 = cVar.f126610c;
            TuxTextView tuxTextView = (TuxTextView) mo27715a(R.id.evy);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setText(str2);
            iVar = EnumC54047i.EXPIRE;
        }
        if (iVar == EnumC54047i.ENTER) {
            z = true;
        } else {
            z = false;
        }
        if (iVar == EnumC54047i.INVITE) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (iVar != EnumC54047i.EXPIRE) {
            z3 = false;
        }
        TuxTextView tuxTextView2 = (TuxTextView) mo27715a(R.id.evy);
        C89219l.m154716b(tuxTextView2, "");
        if (z3) {
            i = 0;
        } else {
            i = 8;
        }
        tuxTextView2.setVisibility(i);
        LinearLayout linearLayout3 = (LinearLayout) mo27715a(R.id.cdj);
        C89219l.m154716b(linearLayout3, "");
        if (z2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        linearLayout3.setVisibility(i2);
        TuxButton tuxButton6 = (TuxButton) mo27715a(R.id.xj);
        C89219l.m154716b(tuxButton6, "");
        if (z) {
            i3 = 0;
        }
        tuxButton6.setVisibility(i3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.a4n, viewGroup, false);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38708a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38709a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20527q.C20528a.m38711a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20527q.C20528a.m38710a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20527q.C20528a.m38712a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(sVar, "");
        return AbstractC20527q.C20528a.m38713a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
