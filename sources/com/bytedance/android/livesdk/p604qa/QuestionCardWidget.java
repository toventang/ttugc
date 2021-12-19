package com.bytedance.android.livesdk.p604qa;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.AbstractC0952i;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.C4450t;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.api.p261b.C4419h;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p378m.C5762c;
import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.android.livesdk.chatroom.p488c.C7398o;
import com.bytedance.android.livesdk.chatroom.p488c.C7401r;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.model.message.C9676bi;
import com.bytedance.android.livesdk.model.message.C9677bj;
import com.bytedance.android.livesdk.model.message.C9679bl;
import com.bytedance.android.livesdk.model.message.C9680bm;
import com.bytedance.android.livesdk.model.message.C9681bn;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p453ap.C6808a;
import com.bytedance.android.livesdk.p453ap.C6810c;
import com.bytedance.android.livesdk.p453ap.C6812e;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9021ao;
import com.bytedance.android.livesdk.p561j.C9052br;
import com.bytedance.android.livesdk.p561j.C9068cg;
import com.bytedance.android.livesdk.p561j.C9086cy;
import com.bytedance.android.livesdk.p561j.C9096dh;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.p561j.C9144z;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.qa.QuestionCardWidget */
public final class QuestionCardWidget extends LiveRecyclableWidget implements AbstractC33974au, OnMessageListener {

    /* renamed from: e */
    public static final C10151a f24617e = new C10151a((byte) 0);

    /* renamed from: a */
    public boolean f24618a;

    /* renamed from: b */
    Dialog f24619b;

    /* renamed from: c */
    public C9676bi f24620c;

    /* renamed from: d */
    public C10220at f24621d;

    /* renamed from: f */
    private boolean f24622f;

    /* renamed from: g */
    private long f24623g;

    /* renamed from: h */
    private IMessageManager f24624h;

    /* renamed from: i */
    private long f24625i;

    /* renamed from: j */
    private long f24626j;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.qa.QuestionCardWidget$b */
    public static final class C10152b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C10152b f24627a = new C10152b();

        static {
            Covode.recordClassIndex(11717);
        }

        C10152b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.qa.QuestionCardWidget$c */
    public static final class C10153c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C10153c f24628a = new C10153c();

        static {
            Covode.recordClassIndex(11718);
        }

        C10153c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.QuestionCardWidget$q */
    static final class C10167q<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C10167q f24642a = new C10167q();

        static {
            Covode.recordClassIndex(11732);
        }

        C10167q() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(11715);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bgp;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.bytedance.android.livesdk.qa.QuestionCardWidget$a */
    public static final class C10151a {
        static {
            Covode.recordClassIndex(11716);
        }

        private C10151a() {
        }

        public /* synthetic */ C10151a(byte b) {
            this();
        }
    }

    /* renamed from: c */
    public final void mo17002c() {
        if (C5762c.m12633b(this.dataChannel)) {
            m18660e();
        } else {
            mo16998a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.qa.QuestionCardWidget$t */
    public static final class RunnableC10170t implements Runnable {

        /* renamed from: a */
        final /* synthetic */ QuestionCardWidget f24649a;

        /* renamed from: b */
        final /* synthetic */ View f24650b;

        static {
            Covode.recordClassIndex(11735);
        }

        RunnableC10170t(QuestionCardWidget questionCardWidget, View view) {
            this.f24649a = questionCardWidget;
            this.f24650b = view;
        }

        public final void run() {
            DataChannel dataChannel = this.f24649a.dataChannel;
            if (dataChannel != null) {
                dataChannel.mo28315b(C6812e.class, Integer.valueOf(this.f24650b.getHeight()));
            }
        }
    }

    /* renamed from: d */
    private final void m18659d() {
        if (isShowing()) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.mo28320c(C9086cy.class, false);
            }
            hide();
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null) {
                dataChannel2.mo28315b(C6812e.class, (Object) 0);
            }
        }
    }

    /* renamed from: e */
    private final void m18660e() {
        View view;
        if (C5762c.m12633b(this.dataChannel) && !this.f24622f && this.f24620c != null && (view = getView()) != null) {
            C89219l.m154716b(view, "");
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.mo28320c(C9086cy.class, true);
            }
            show();
            view.post(new RunnableC10170t(this, view));
        }
    }

    /* renamed from: a */
    public final void mo16998a() {
        if (this.f24620c != null) {
            m18661f();
        }
        this.f24620c = null;
        this.f24623g = 0;
        m18659d();
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        C11279p.m20014b(this.f24619b);
        C10220at atVar = this.f24621d;
        if (atVar != null) {
            atVar.dismiss();
        }
        if (this.f24620c != null) {
            m18661f();
        }
        this.f24620c = null;
        this.f24623g = 0;
        IMessageManager iMessageManager = this.f24624h;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
    }

    /* renamed from: f */
    private final void m18661f() {
        long uptimeMillis = SystemClock.uptimeMillis();
        this.f24626j = uptimeMillis;
        int i = (int) (uptimeMillis - this.f24625i);
        Long l = null;
        if (this.f24618a) {
            C6501b a = C6501b.C6502a.m13948a("livesdk_anchor_qa_card_show_duration").mo12646a("question_like", this.f24623g);
            C9676bi biVar = this.f24620c;
            if (biVar != null) {
                l = Long.valueOf(biVar.f23546a);
            }
            a.mo12650a("question_id", (Number) l).mo12645a("duration", i).mo12639a().mo12655b();
            return;
        }
        C6501b a2 = C6501b.C6502a.m13948a("livesdk_qa_card_show_duration");
        C9676bi biVar2 = this.f24620c;
        if (biVar2 != null) {
            l = Long.valueOf(biVar2.f23546a);
        }
        a2.mo12650a("question_id", (Number) l).mo12645a("duration", i).mo12639a().mo12655b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (r0 == null) goto L_0x0022;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17000b() {
        /*
            r6 = this;
            boolean r0 = r6.f24618a
            if (r0 == 0) goto L_0x003f
            com.bytedance.android.livesdk.model.message.bi r5 = r6.f24620c
            if (r5 == 0) goto L_0x003f
            com.bytedance.android.live.network.e r1 = com.bytedance.android.live.network.C5805e.m12718a()
            java.lang.Class<com.bytedance.android.livesdk.qa.QAApi> r0 = com.bytedance.android.livesdk.p604qa.QAApi.class
            java.lang.Object r4 = r1.mo11572a(r0)
            com.bytedance.android.livesdk.qa.QAApi r4 = (com.bytedance.android.livesdk.p604qa.QAApi) r4
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r6.dataChannel
            if (r1 == 0) goto L_0x0043
            java.lang.Class<com.bytedance.android.livesdk.j.dh> r0 = com.bytedance.android.livesdk.p561j.C9096dh.class
            java.lang.Object r0 = r1.mo28318b(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 != 0) goto L_0x0025
        L_0x0022:
            p4600h.p4611f.p4613b.C89219l.m154715b()
        L_0x0025:
            long r2 = r0.longValue()
            long r0 = r5.f23546a
            f.a.t r1 = r4.endAnswer(r2, r0)
            com.bytedance.android.livesdk.util.rxutils.f r0 = new com.bytedance.android.livesdk.util.rxutils.f
            r0.<init>()
            f.a.t r2 = r1.mo143271a(r0)
            com.bytedance.android.livesdk.qa.QuestionCardWidget$b r1 = com.bytedance.android.livesdk.p604qa.QuestionCardWidget.C10152b.f24627a
            com.bytedance.android.livesdk.qa.QuestionCardWidget$c r0 = com.bytedance.android.livesdk.p604qa.QuestionCardWidget.C10153c.f24628a
            r2.mo143254a(r1, r0)
        L_0x003f:
            r6.mo16998a()
            return
        L_0x0043:
            r0 = 0
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.p604qa.QuestionCardWidget.mo17000b():void");
    }

    /* renamed from: com.bytedance.android.livesdk.qa.QuestionCardWidget$e */
    static final class View$OnClickListenerC10155e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ QuestionCardWidget f24630a;

        static {
            Covode.recordClassIndex(11720);
        }

        View$OnClickListenerC10155e(QuestionCardWidget questionCardWidget) {
            this.f24630a = questionCardWidget;
        }

        public final void onClick(View view) {
            C10175aa.m18671a(this.f24630a.dataChannel, "qa_card");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.QuestionCardWidget$g */
    static final class C10157g extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ QuestionCardWidget f24632a;

        static {
            Covode.recordClassIndex(11722);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10157g(QuestionCardWidget questionCardWidget) {
            super(1);
            this.f24632a = questionCardWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                this.f24632a.mo16998a();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.QuestionCardWidget$h */
    static final class C10158h extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ QuestionCardWidget f24633a;

        static {
            Covode.recordClassIndex(11723);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10158h(QuestionCardWidget questionCardWidget) {
            super(1);
            this.f24633a = questionCardWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                this.f24633a.mo16998a();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.QuestionCardWidget$i */
    static final class C10159i extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ QuestionCardWidget f24634a;

        static {
            Covode.recordClassIndex(11724);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10159i(QuestionCardWidget questionCardWidget) {
            super(1);
            this.f24634a = questionCardWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            this.f24634a.mo16999a(false);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.QuestionCardWidget$j */
    static final class C10160j<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ QuestionCardWidget f24635a;

        static {
            Covode.recordClassIndex(11725);
        }

        C10160j(QuestionCardWidget questionCardWidget) {
            this.f24635a = questionCardWidget;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f24635a.mo16999a(!((C7401r) obj).f18339b);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.QuestionCardWidget$n */
    static final class C10164n extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ QuestionCardWidget f24639a;

        static {
            Covode.recordClassIndex(11729);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10164n(QuestionCardWidget questionCardWidget) {
            super(1);
            this.f24639a = questionCardWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            this.f24639a.mo17002c();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.qa.QuestionCardWidget$r */
    public static final class View$OnClickListenerC10168r implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ QuestionCardWidget f24643a;

        /* renamed from: b */
        final /* synthetic */ C9676bi f24644b;

        /* renamed from: c */
        final /* synthetic */ long f24645c;

        static {
            Covode.recordClassIndex(11733);
        }

        View$OnClickListenerC10168r(QuestionCardWidget questionCardWidget, C9676bi biVar, long j) {
            this.f24643a = questionCardWidget;
            this.f24644b = biVar;
            this.f24645c = j;
        }

        public final void onClick(View view) {
            User user = this.f24644b.f23550e;
            C89219l.m154716b(user, "");
            QuestionCardWidget.m18657a(user, "head");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.qa.QuestionCardWidget$s */
    public static final class View$OnClickListenerC10169s implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ QuestionCardWidget f24646a;

        /* renamed from: b */
        final /* synthetic */ C9676bi f24647b;

        /* renamed from: c */
        final /* synthetic */ long f24648c;

        static {
            Covode.recordClassIndex(11734);
        }

        View$OnClickListenerC10169s(QuestionCardWidget questionCardWidget, C9676bi biVar, long j) {
            this.f24646a = questionCardWidget;
            this.f24647b = biVar;
            this.f24648c = j;
        }

        public final void onClick(View view) {
            User user = this.f24647b.f23550e;
            C89219l.m154716b(user, "");
            QuestionCardWidget.m18657a(user, StringSet.name);
        }
    }

    /* renamed from: a */
    public final void mo16999a(boolean z) {
        if (z) {
            m18660e();
        } else {
            m18659d();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.QuestionCardWidget$k */
    static final class C10161k<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ QuestionCardWidget f24636a;

        static {
            Covode.recordClassIndex(11726);
        }

        C10161k(QuestionCardWidget questionCardWidget) {
            this.f24636a = questionCardWidget;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C4419h hVar = (C4419h) obj;
            int a = C4384b.C4385a.m10496a().mo10147a();
            if (a == 2 || a == 0) {
                QuestionCardWidget questionCardWidget = this.f24636a;
                C89219l.m154716b(hVar, "");
                questionCardWidget.mo17001b(hVar.f12018a);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.QuestionCardWidget$l */
    static final class C10162l extends AbstractC89220m implements AbstractC89172b<C7398o, C89391z> {

        /* renamed from: a */
        final /* synthetic */ QuestionCardWidget f24637a;

        static {
            Covode.recordClassIndex(11727);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10162l(QuestionCardWidget questionCardWidget) {
            super(1);
            this.f24637a = questionCardWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C7398o oVar) {
            C7398o oVar2 = oVar;
            C89219l.m154721d(oVar2, "");
            QuestionCardWidget questionCardWidget = this.f24637a;
            if (oVar2 != null) {
                if (oVar2.f18328a == 1) {
                    questionCardWidget.mo17001b(false);
                } else if (oVar2.f18328a == 0) {
                    questionCardWidget.mo17001b(true);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.QuestionCardWidget$m */
    static final class C10163m extends AbstractC89220m implements AbstractC89172b<C10188af, C89391z> {

        /* renamed from: a */
        final /* synthetic */ QuestionCardWidget f24638a;

        static {
            Covode.recordClassIndex(11728);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10163m(QuestionCardWidget questionCardWidget) {
            super(1);
            this.f24638a = questionCardWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C10188af afVar) {
            C10188af afVar2 = afVar;
            C89219l.m154721d(afVar2, "");
            this.f24638a.mo16997a(afVar2.f24694a, afVar2.f24695b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.QuestionCardWidget$o */
    static final class C10165o extends AbstractC89220m implements AbstractC89172b<C10188af, C89391z> {

        /* renamed from: a */
        final /* synthetic */ QuestionCardWidget f24640a;

        static {
            Covode.recordClassIndex(11730);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10165o(QuestionCardWidget questionCardWidget) {
            super(1);
            this.f24640a = questionCardWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C10188af afVar) {
            C10188af afVar2 = afVar;
            C89219l.m154721d(afVar2, "");
            long j = afVar2.f24694a.f23546a;
            C9676bi biVar = this.f24640a.f24620c;
            if (biVar != null && j == biVar.f23546a) {
                this.f24640a.mo17000b();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.QuestionCardWidget$p */
    static final class C10166p<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ QuestionCardWidget f24641a;

        static {
            Covode.recordClassIndex(11731);
        }

        C10166p(QuestionCardWidget questionCardWidget) {
            this.f24641a = questionCardWidget;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f24641a.mo16997a(((C10191ai) ((C5832d) obj).data).f24701c.f24694a, 0);
        }
    }

    /* renamed from: b */
    public final void mo17001b(boolean z) {
        this.f24622f = z;
        mo16999a(!z);
        m18658c(!z);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.mo28319c(C9052br.class);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.QuestionCardWidget$f */
    static final class View$OnLongClickListenerC10156f implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ QuestionCardWidget f24631a;

        static {
            Covode.recordClassIndex(11721);
        }

        View$OnLongClickListenerC10156f(QuestionCardWidget questionCardWidget) {
            this.f24631a = questionCardWidget;
        }

        public final boolean onLongClick(View view) {
            AbstractC0952i iVar;
            C10220at atVar;
            C9676bi biVar = this.f24631a.f24620c;
            if (biVar == null) {
                return true;
            }
            this.f24631a.dataChannel.mo28311a(C10178ad.class, biVar);
            this.f24631a.dataChannel.mo28311a(C10225au.class, "qa_card");
            this.f24631a.f24621d = new C10220at();
            DataChannel dataChannel = this.f24631a.dataChannel;
            if (dataChannel == null || (iVar = (AbstractC0952i) dataChannel.mo28318b(C9021ao.class)) == null || (atVar = this.f24631a.f24621d) == null) {
                return true;
            }
            atVar.show(iVar, "QuestionCardWidget");
            return true;
        }
    }

    /* renamed from: c */
    private final void m18658c(boolean z) {
        if (this.context != null) {
            if (z) {
                EnumC5847l lVar = EnumC5847l.QUESTION;
                DataChannel dataChannel = this.dataChannel;
                Context context = this.context;
                C89219l.m154716b(context, "");
                lVar.load(dataChannel, new C10227aw(context));
                EnumC5847l.QUESTION.setEnableClick(this.dataChannel, true);
                return;
            }
            EnumC5847l.QUESTION.unload(this.dataChannel);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.QuestionCardWidget$d */
    static final class View$OnClickListenerC10154d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ QuestionCardWidget f24629a;

        static {
            Covode.recordClassIndex(11719);
        }

        View$OnClickListenerC10154d(QuestionCardWidget questionCardWidget) {
            this.f24629a = questionCardWidget;
        }

        public final void onClick(View view) {
            if (this.f24629a.f24618a) {
                C6501b.C6502a.m13948a("livesdk_anchor_qa_card_close").mo12639a().mo12655b();
            } else {
                C6501b.C6502a.m13948a("livesdk_audience_qa_card_close").mo12639a().mo12655b();
            }
            C6805b<Boolean> bVar = AbstractC6804a.f16917aS;
            C89219l.m154716b(bVar, "");
            Boolean a = bVar.mo13066a();
            C89219l.m154716b(a, "");
            if (!a.booleanValue() || !this.f24629a.f24618a) {
                this.f24629a.mo17000b();
                return;
            }
            C6805b<Boolean> bVar2 = AbstractC6804a.f16917aS;
            C89219l.m154716b(bVar2, "");
            C6806c.m14603a((C6800c) bVar2, (Object) false);
            QuestionCardWidget questionCardWidget = this.f24629a;
            questionCardWidget.f24619b = C11279p.m19997a(new DialogC9148b.C9149a(questionCardWidget.context).mo15243a(R.string.ds6).mo15248b(R.string.ds7).mo15244a(R.string.ds8, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC10171u(questionCardWidget), false).mo15249b(R.string.dw2, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC10172v.f24652a, false).mo15247a());
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (!(iMessage instanceof AbstractC6571a)) {
            iMessage = null;
        }
        AbstractC6571a aVar = (AbstractC6571a) iMessage;
        if (aVar != null) {
            if (aVar instanceof C9680bm) {
                long j = ((C9680bm) aVar).f23556a;
                C9676bi biVar = this.f24620c;
                if (biVar != null && j == biVar.f23546a) {
                    mo16998a();
                }
            } else if (aVar instanceof C9677bj) {
                C9677bj bjVar = (C9677bj) aVar;
                long j2 = bjVar.f23551a;
                C9676bi biVar2 = this.f24620c;
                if (biVar2 != null && j2 == biVar2.f23546a) {
                    mo16998a();
                }
                long j3 = bjVar.f23552f;
                AbstractC6872f b = C11115u.m19743a().mo17915b();
                C89219l.m154716b(b, "");
                if (j3 == b.mo13161c()) {
                    C11226ao.m19882a(C3966y.m9669e(), (int) R.string.ej7);
                }
            } else if (aVar instanceof C9681bn) {
                C9681bn bnVar = (C9681bn) aVar;
                Boolean valueOf = Boolean.valueOf(bnVar.f23557a);
                C89219l.m154716b(valueOf, "");
                C10175aa.m18672a(this.dataChannel, valueOf.booleanValue());
                C6779a a = C6779a.m14563a();
                Boolean valueOf2 = Boolean.valueOf(bnVar.f23557a);
                C89219l.m154716b(valueOf2, "");
                a.mo13053a(new C10258e(valueOf2.booleanValue()));
                Boolean valueOf3 = Boolean.valueOf(bnVar.f23557a);
                C89219l.m154716b(valueOf3, "");
                m18658c(valueOf3.booleanValue());
                mo17002c();
            } else if (aVar instanceof C9679bl) {
                C9676bi biVar3 = ((C9679bl) aVar).f23555a;
                C89219l.m154716b(biVar3, "");
                mo16997a(biVar3, 0);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        boolean z;
        IMessageManager iMessageManager;
        ImageView imageView;
        DataChannel dataChannel;
        Boolean bool;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 == null || (bool = (Boolean) dataChannel2.mo28318b(C9119ed.class)) == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        this.f24618a = z;
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.mo28309a((AbstractC1204m) this, C9144z.class, (AbstractC89172b) new C10159i(this));
        }
        ((AbstractC11181z) C6779a.m14563a().mo13052a(C7401r.class).mo143271a(new C11191f()).mo143274a(WidgetExtendsKt.autoDispose(this))).mo17949a(new C10160j(this));
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            dataChannel4.mo28309a((AbstractC1204m) this, C10259f.class, (AbstractC89172b) new C10163m(this));
        }
        DataChannel dataChannel5 = this.dataChannel;
        if (dataChannel5 != null) {
            dataChannel5.mo28309a((AbstractC1204m) this, C10174a.class, (AbstractC89172b) new C10164n(this));
        }
        if (this.f24618a && (dataChannel = this.dataChannel) != null) {
            dataChannel.mo28309a((AbstractC1204m) this, C10203an.class, (AbstractC89172b) new C10165o(this));
        }
        ((AbstractC11181z) C6779a.m14563a().mo13052a(C4419h.class).mo143271a(new C11191f()).mo143274a(WidgetExtendsKt.autoDispose(this))).mo17949a(new C10161k(this));
        DataChannel dataChannel6 = this.dataChannel;
        if (dataChannel6 != null) {
            dataChannel6.mo28313b((AbstractC1204m) this, C4450t.class, (AbstractC89172b) new C10162l(this));
        }
        DataChannel dataChannel7 = this.dataChannel;
        if (dataChannel7 != null) {
            dataChannel7.mo28313b((AbstractC1204m) this, C6808a.class, (AbstractC89172b) new C10157g(this));
        }
        DataChannel dataChannel8 = this.dataChannel;
        if (dataChannel8 != null) {
            dataChannel8.mo28313b((AbstractC1204m) this, C6810c.class, (AbstractC89172b) new C10158h(this));
        }
        DataChannel dataChannel9 = this.dataChannel;
        Long l = null;
        if (dataChannel9 == null || (iMessageManager = (IMessageManager) dataChannel9.mo28318b(C9068cg.class)) == null) {
            iMessageManager = null;
        } else {
            if (!this.f24618a) {
                iMessageManager.addMessageListener(EnumC9596a.QUESTION_SLIDE_DOWN_MESSAGE.getIntType(), this);
                iMessageManager.addMessageListener(EnumC9596a.QUESTION_SELECT_MESSAGE.getIntType(), this);
                iMessageManager.addMessageListener(EnumC9596a.QUESTION_SWITCH_MESSAGE.getIntType(), this);
            }
            iMessageManager.addMessageListener(EnumC9596a.QUESTION_DELETE_MESSAGE.getIntType(), this);
        }
        this.f24624h = iMessageManager;
        if (!this.f24618a) {
            QAApi qAApi = (QAApi) C5805e.m12718a().mo11572a(QAApi.class);
            DataChannel dataChannel10 = this.dataChannel;
            if (dataChannel10 == null || (l = (Long) dataChannel10.mo28318b(C9096dh.class)) == null) {
                C89219l.m154715b();
            }
            qAApi.queryQuestion(l.longValue(), 0, 0, 0).mo143271a(new C11191f()).mo143254a(new C10166p(this), C10167q.f24642a);
        }
        View view = getView();
        if (view != null && (imageView = (ImageView) view.findViewById(R.id.a7_)) != null) {
            if (!this.f24618a) {
                imageView.setImageResource(2131234705);
            }
            imageView.setOnClickListener(new View$OnClickListenerC10154d(this));
            View view2 = getView();
            if (view2 != null) {
                view2.setOnClickListener(new View$OnClickListenerC10155e(this));
                view2.setOnLongClickListener(new View$OnLongClickListenerC10156f(this));
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.QuestionCardWidget$v */
    static final class DialogInterface$OnClickListenerC10172v implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC10172v f24652a = new DialogInterface$OnClickListenerC10172v();

        static {
            Covode.recordClassIndex(11737);
        }

        DialogInterface$OnClickListenerC10172v() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.QuestionCardWidget$u */
    static final class DialogInterface$OnClickListenerC10171u implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ QuestionCardWidget f24651a;

        static {
            Covode.recordClassIndex(11736);
        }

        DialogInterface$OnClickListenerC10171u(QuestionCardWidget questionCardWidget) {
            this.f24651a = questionCardWidget;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f24651a.mo17000b();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: a */
    public static void m18657a(User user, String str) {
        C6779a a = C6779a.m14563a();
        UserProfileEvent userProfileEvent = new UserProfileEvent(user.getId(), str);
        userProfileEvent.setClickUserPosition("qa_card");
        a.mo13053a(userProfileEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00dd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p4600h.C89391z mo16997a(com.bytedance.android.livesdk.model.message.C9676bi r9, long r10) {
        /*
        // Method dump skipped, instructions count: 292
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.p604qa.QuestionCardWidget.mo16997a(com.bytedance.android.livesdk.model.message.bi, long):h.z");
    }
}
