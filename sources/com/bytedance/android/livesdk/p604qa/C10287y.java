package com.bytedance.android.livesdk.p604qa;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Spannable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.p012a.p013a.p014a.C0175a;
import androidx.p053i.AbstractC1036i;
import androidx.p053i.C1024f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.C3018a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p215e.C3884b;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.p378m.C5762c;
import com.bytedance.android.live.p378m.C5763d;
import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.chatroom.p491f.C7557c;
import com.bytedance.android.livesdk.event.C8448b;
import com.bytedance.android.livesdk.model.C9542az;
import com.bytedance.android.livesdk.model.message.C9871g;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p561j.C9021ao;
import com.bytedance.android.livesdk.p561j.C9052br;
import com.bytedance.android.livesdk.p561j.C9068cg;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9101dm;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.p561j.C9120ee;
import com.bytedance.android.livesdk.utils.C11221ak;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p700m.C11831d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.qa.y */
public final class C10287y extends AbstractC11293v implements OnMessageListener {

    /* renamed from: i */
    public static final C10288a f24877i = new C10288a((byte) 0);

    /* renamed from: a */
    public C10262i f24878a;

    /* renamed from: b */
    public int f24879b;

    /* renamed from: c */
    public int f24880c;

    /* renamed from: d */
    int f24881d;

    /* renamed from: e */
    public boolean f24882e;

    /* renamed from: f */
    public boolean f24883f;

    /* renamed from: g */
    public boolean f24884g;

    /* renamed from: h */
    public String f24885h = "";

    /* renamed from: j */
    private final AbstractC89244h f24886j = C11831d.m20835a(new C10307s(this));

    /* renamed from: k */
    private C88411a f24887k;

    /* renamed from: l */
    private Runnable f24888l;

    /* renamed from: m */
    private final C11221ak.EnumC11222a f24889m = C11221ak.EnumC11222a.PANEL_QA;

    /* renamed from: n */
    private HashMap f24890n;

    static {
        Covode.recordClassIndex(11853);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f24890n;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f24890n == null) {
            this.f24890n = new HashMap();
        }
        View view = (View) this.f24890n.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f24890n.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final QuestionViewModel mo9929d() {
        return (QuestionViewModel) this.f24886j.getValue();
    }

    /* renamed from: com.bytedance.android.livesdk.qa.y$a */
    public static final class C10288a {
        static {
            Covode.recordClassIndex(11854);
        }

        private C10288a() {
        }

        public /* synthetic */ C10288a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: c_ */
    public final C11221ak.EnumC11222a mo9928c_() {
        return this.f24889m;
    }

    /* renamed from: com.bytedance.android.livesdk.qa.y$c */
    static final class View$OnClickListenerC10290c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10287y f24892a;

        static {
            Covode.recordClassIndex(11856);
        }

        View$OnClickListenerC10290c(C10287y yVar) {
            this.f24892a = yVar;
        }

        /* renamed from: com.bytedance.android.livesdk.qa.y$c$a */
        static final class C10291a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ AbstractC0952i f24893a;

            /* renamed from: b */
            final /* synthetic */ View$OnClickListenerC10290c f24894b;

            static {
                Covode.recordClassIndex(11857);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10291a(AbstractC0952i iVar, View$OnClickListenerC10290c cVar) {
                super(0);
                this.f24893a = iVar;
                this.f24894b = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f24894b.f24892a.dismiss();
                return C89391z.f203057a;
            }
        }

        public final void onClick(View view) {
            C8448b bVar;
            AbstractC0952i iVar;
            DataChannel dataChannel = this.f24892a.f27010p;
            if (dataChannel == null || (bVar = (C8448b) dataChannel.mo28318b(C9120ee.class)) == null) {
                bVar = new C8448b(false);
            }
            if (!bVar.f20888a) {
                DataChannel dataChannel2 = this.f24892a.f27010p;
                if (dataChannel2 != null && (iVar = (AbstractC0952i) dataChannel2.mo28318b(C9021ao.class)) != null) {
                    DataChannel dataChannel3 = this.f24892a.f27010p;
                    if (dataChannel3 != null) {
                        dataChannel3.mo28311a(C10240b.class, new C10257d(this.f24892a.f24880c, this.f24892a.f24879b, this.f24892a.f24882e, this.f24892a.f24885h));
                    }
                    C10241c cVar = new C10241c();
                    C10291a aVar = new C10291a(iVar, this);
                    C89219l.m154721d(aVar, "");
                    cVar.f24778f = aVar;
                    cVar.show(iVar, "QADialog");
                }
            } else if (bVar.f20889b) {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.enr);
            } else {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.enq);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.y$s */
    static final class C10307s extends AbstractC89220m implements AbstractC89171a<QuestionViewModel> {

        /* renamed from: a */
        final /* synthetic */ C10287y f24911a;

        static {
            Covode.recordClassIndex(11873);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10307s(C10287y yVar) {
            super(0);
            this.f24911a = yVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ QuestionViewModel invoke() {
            return C1181ae.m3879a(this.f24911a, (C1175ad.AbstractC1177b) null).mo3983a(QuestionViewModel.class);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.y$r */
    static final class RunnableC10306r implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C9871g f24909a;

        /* renamed from: b */
        final /* synthetic */ C10287y f24910b;

        static {
            Covode.recordClassIndex(11872);
        }

        RunnableC10306r(C9871g gVar, C10287y yVar) {
            this.f24909a = gVar;
            this.f24910b = yVar;
        }

        public final void run() {
            LinearLayout linearLayout = (LinearLayout) this.f24910b.mo8166a_(R.id.fi6);
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.b6z);
        bVar.f27014a = 0;
        bVar.f27015b = R.style.a2l;
        bVar.f27020g = 80;
        double b = (double) C3966y.m9662b();
        Double.isNaN(b);
        bVar.f27022i = (int) (b * 0.73d);
        return bVar;
    }

    /* renamed from: e */
    public final void mo17073e() {
        QuestionViewModel d = mo9929d();
        C89219l.m154716b(d, "");
        C1024f fVar = new C1024f(d.f24656k, d.f24657l);
        fVar.f3601b = C0175a.f467c;
        d.f24654i = fVar.mo3732a();
        d.f24654i.observe(this, new C10308t(this));
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        IMessageManager iMessageManager;
        IMessageManager iMessageManager2;
        super.onDestroyView();
        View view = getView();
        if (view != null) {
            view.removeCallbacks(this.f24888l);
        }
        DataChannel dataChannel = this.f27010p;
        if (!(dataChannel == null || (iMessageManager2 = (IMessageManager) dataChannel.mo28318b(C9068cg.class)) == null)) {
            iMessageManager2.removeMessageListener(this);
        }
        DataChannel dataChannel2 = this.f27010p;
        if (!(dataChannel2 == null || (iMessageManager = (IMessageManager) dataChannel2.mo28318b(C9068cg.class)) == null)) {
            C10262i iVar = this.f24878a;
            if (iVar == null) {
                C89219l.m154710a("mAdapter");
            }
            iMessageManager.removeMessageListener(iVar);
        }
        mo8165a();
    }

    /* renamed from: com.bytedance.android.livesdk.qa.y$b */
    static final class View$OnClickListenerC10289b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10287y f24891a;

        static {
            Covode.recordClassIndex(11855);
        }

        View$OnClickListenerC10289b(C10287y yVar) {
            this.f24891a = yVar;
        }

        public final void onClick(View view) {
            this.f24891a.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.y$f */
    static final class C10294f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C10287y f24897a;

        static {
            Covode.recordClassIndex(11860);
        }

        C10294f(C10287y yVar) {
            this.f24897a = yVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (!((C10258e) obj).f24814a) {
                this.f24897a.dismiss();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.y$g */
    static final class C10295g extends AbstractC89220m implements AbstractC89172b<C10188af, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10287y f24898a;

        static {
            Covode.recordClassIndex(11861);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10295g(C10287y yVar) {
            super(1);
            this.f24898a = yVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C10188af afVar) {
            C89219l.m154721d(afVar, "");
            this.f24898a.dismiss();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.y$j */
    static final class C10298j<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C10287y f24901a;

        static {
            Covode.recordClassIndex(11864);
        }

        C10298j(C10287y yVar) {
            this.f24901a = yVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C10287y.m18747a(this.f24901a).mo3759a((AbstractC1036i) ((AbstractC1036i) obj));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.y$k */
    static final class C10299k extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10287y f24902a;

        static {
            Covode.recordClassIndex(11865);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10299k(C10287y yVar) {
            super(1);
            this.f24902a = yVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            this.f24902a.mo17073e();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.y$o */
    static final class C10303o extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10287y f24906a;

        static {
            Covode.recordClassIndex(11869);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10303o(C10287y yVar) {
            super(1);
            this.f24906a = yVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            this.f24906a.dismiss();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.qa.y$t */
    public static final class C10308t<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C10287y f24912a;

        static {
            Covode.recordClassIndex(11874);
        }

        C10308t(C10287y yVar) {
            this.f24912a = yVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C10287y.m18747a(this.f24912a).mo3759a((AbstractC1036i) ((AbstractC1036i) obj));
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C10262i m18747a(C10287y yVar) {
        C10262i iVar = yVar.f24878a;
        if (iVar == null) {
            C89219l.m154710a("mAdapter");
        }
        return iVar;
    }

    /* renamed from: com.bytedance.android.livesdk.qa.y$h */
    static final class C10296h extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10287y f24899a;

        static {
            Covode.recordClassIndex(11862);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10296h(C10287y yVar) {
            super(1);
            this.f24899a = yVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            if (C5762c.m12633b(this.f24899a.f27010p)) {
                this.f24899a.mo17073e();
            } else {
                this.f24899a.dismiss();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.y$i */
    static final class View$OnClickListenerC10297i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10287y f24900a;

        static {
            Covode.recordClassIndex(11863);
        }

        View$OnClickListenerC10297i(C10287y yVar) {
            this.f24900a = yVar;
        }

        public final void onClick(View view) {
            AbstractC0952i iVar;
            DataChannel dataChannel = this.f24900a.f27010p;
            if (dataChannel != null && (iVar = (AbstractC0952i) dataChannel.mo28318b(C9021ao.class)) != null) {
                new C10229ax().show(iVar, "QADialog");
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.y$m */
    static final class C10301m extends AbstractC89220m implements AbstractC89172b<C10188af, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10287y f24904a;

        static {
            Covode.recordClassIndex(11867);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10301m(C10287y yVar) {
            super(1);
            this.f24904a = yVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C10188af afVar) {
            C10188af afVar2 = afVar;
            C89219l.m154721d(afVar2, "");
            C10287y.m18747a(this.f24904a).mo17057a(afVar2.f24694a.f23546a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.y$n */
    static final class C10302n extends AbstractC89220m implements AbstractC89172b<Long, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10287y f24905a;

        static {
            Covode.recordClassIndex(11868);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10302n(C10287y yVar) {
            super(1);
            this.f24905a = yVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Long l) {
            C10287y.m18747a(this.f24905a).mo17058b(l.longValue());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.y$p */
    static final class C10304p extends AbstractC89220m implements AbstractC89172b<C10188af, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10287y f24907a;

        static {
            Covode.recordClassIndex(11870);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10304p(C10287y yVar) {
            super(1);
            this.f24907a = yVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C10188af afVar) {
            C10188af afVar2 = afVar;
            C89219l.m154721d(afVar2, "");
            C10287y.m18747a(this.f24907a).mo17057a(afVar2.f24694a.f23546a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.y$q */
    static final class C10305q extends AbstractC89220m implements AbstractC89172b<Long, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10287y f24908a;

        static {
            Covode.recordClassIndex(11871);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10305q(C10287y yVar) {
            super(1);
            this.f24908a = yVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Long l) {
            C10287y.m18747a(this.f24908a).mo17058b(l.longValue());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.y$l */
    static final class C10300l extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C10287y f24903a;

        static {
            Covode.recordClassIndex(11866);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10300l(C10287y yVar) {
            super(1);
            this.f24903a = yVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            this.f24903a.dismiss();
            if (C10287y.m18747a(this.f24903a).f24821p != null) {
                C10287y.m18747a(this.f24903a).f24821p.dismiss();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (!(iMessage instanceof C9871g)) {
            iMessage = null;
        }
        C9871g gVar = (C9871g) iMessage;
        if (gVar != null) {
            Spannable a = C7557c.m15538a(gVar.f28134O.f28144j, "");
            if (C11279p.m20013a(a) && a != null) {
                View view = getView();
                if (view != null) {
                    view.removeCallbacks(this.f24888l);
                }
                LinearLayout linearLayout = (LinearLayout) mo8166a_(R.id.fi6);
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                LiveTextView liveTextView = (LiveTextView) mo8166a_(R.id.fi8);
                if (liveTextView != null) {
                    liveTextView.setText(a);
                }
                this.f24888l = new RunnableC10306r(gVar, this);
                View view2 = getView();
                if (view2 != null) {
                    view2.postDelayed(this.f24888l, TimeUnit.SECONDS.toMillis(gVar.f23848h));
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.y$d */
    static final class C10292d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C10287y f24895a;

        static {
            Covode.recordClassIndex(11858);
        }

        C10292d(C10287y yVar) {
            this.f24895a = yVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            String str;
            List<C10188af> list;
            List<C10188af> list2;
            int i2 = 0;
            if (obj == C3884b.f10739c) {
                LiveLoadingView liveLoadingView = (LiveLoadingView) this.f24895a.mo8166a_(R.id.e7i);
                C89219l.m154716b(liveLoadingView, "");
                liveLoadingView.setVisibility(0);
                return;
            }
            LiveLoadingView liveLoadingView2 = (LiveLoadingView) this.f24895a.mo8166a_(R.id.e7i);
            C89219l.m154716b(liveLoadingView2, "");
            liveLoadingView2.setVisibility(8);
            C10287y yVar = this.f24895a;
            C10179ae aeVar = yVar.mo9929d().f24655j;
            if (aeVar == null || (list2 = aeVar.f24671n) == null) {
                i = 0;
            } else {
                i = list2.size();
            }
            yVar.f24879b = i;
            C10179ae aeVar2 = yVar.mo9929d().f24655j;
            if (!(aeVar2 == null || (list = aeVar2.f24670m) == null)) {
                i2 = list.size();
            }
            yVar.f24880c = i2;
            yVar.f24881d = yVar.f24879b + yVar.f24880c;
            if (yVar.f24883f) {
                C6501b a = C6501b.C6502a.m13948a("livesdk_anchor_qa_list_show").mo12645a("show_answered_question_cnt", yVar.f24879b).mo12645a("show_not_answered_question_cnt", yVar.f24880c).mo12645a("show_question_cnt", yVar.f24881d).mo12651a("enter_from", yVar.f24885h);
                if (yVar.f24882e) {
                    str = "1";
                } else {
                    str = "0";
                }
                a.mo12651a("is_qa_list_end", str).mo12655b();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.qa.y$e */
    static final class C10293e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C10287y f24896a;

        static {
            Covode.recordClassIndex(11859);
        }

        C10293e(C10287y yVar) {
            this.f24896a = yVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC0952i iVar;
            AbstractC0952i iVar2;
            if (!((Boolean) obj).booleanValue()) {
                if (this.f24896a.f24883f) {
                    C6805b<Boolean> bVar = AbstractC6804a.f17029cc;
                    C89219l.m154716b(bVar, "");
                    Boolean a = bVar.mo13066a();
                    C89219l.m154716b(a, "");
                    if (a.booleanValue()) {
                        DataChannel dataChannel = this.f24896a.f27010p;
                        if (!(dataChannel == null || (iVar2 = (AbstractC0952i) dataChannel.mo28318b(C9021ao.class)) == null)) {
                            new C10237ay().show(iVar2, "QADialog");
                        }
                        C6805b<Boolean> bVar2 = AbstractC6804a.f17029cc;
                        C89219l.m154716b(bVar2, "");
                        C6806c.m14603a((C6800c) bVar2, (Object) false);
                        return;
                    }
                }
                if (this.f24896a.f24884g) {
                    C6805b<Boolean> bVar3 = AbstractC6804a.f17030cd;
                    C89219l.m154716b(bVar3, "");
                    Boolean a2 = bVar3.mo13066a();
                    C89219l.m154716b(a2, "");
                    if (a2.booleanValue()) {
                        DataChannel dataChannel2 = this.f24896a.f27010p;
                        if (!(dataChannel2 == null || (iVar = (AbstractC0952i) dataChannel2.mo28318b(C9021ao.class)) == null)) {
                            new C10237ay().show(iVar, "QADialog");
                        }
                        C6805b<Boolean> bVar4 = AbstractC6804a.f17030cd;
                        C89219l.m154716b(bVar4, "");
                        C6806c.m14603a((C6800c) bVar4, (Object) false);
                    }
                }
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v
    public final void onDismiss(DialogInterface dialogInterface) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        String str;
        List<C10188af> list;
        List<C10188af> list2;
        super.onDismiss(dialogInterface);
        DataChannel dataChannel = this.f27010p;
        boolean z3 = false;
        if (dataChannel != null) {
            dataChannel.mo28315b(C5763d.class, (Object) false);
        }
        C88411a aVar = this.f24887k;
        if (aVar != null) {
            aVar.mo142944a();
        }
        if (this.f24883f) {
            EnumC5847l.QUESTION.hideRedDot(this.f27010p);
        }
        C10179ae aeVar = mo9929d().f24655j;
        if (aeVar == null || (list2 = aeVar.f24671n) == null) {
            i = 0;
        } else {
            i = list2.size();
        }
        this.f24879b = i;
        C10179ae aeVar2 = mo9929d().f24655j;
        if (aeVar2 == null || (list = aeVar2.f24670m) == null) {
            i2 = 0;
        } else {
            i2 = list.size();
        }
        this.f24880c = i2;
        this.f24881d = this.f24879b + i2;
        C10179ae aeVar3 = mo9929d().f24655j;
        if (aeVar3 != null) {
            z = aeVar3.f24675r;
        } else {
            z = false;
        }
        C10179ae aeVar4 = mo9929d().f24655j;
        if (aeVar4 != null) {
            z2 = aeVar4.f24674q;
        } else {
            z2 = false;
        }
        if (z && z2) {
            z3 = true;
        }
        this.f24882e = z3;
        C6501b a = C6501b.C6502a.m13948a("livesdk_qa_list_show").mo12643a(this.f27010p).mo12645a("answered_question_cnt", this.f24879b).mo12645a("not_answered_question_cnt", this.f24880c).mo12645a("question_cnt", this.f24881d).mo12651a("qa_list_enter_from", this.f24885h);
        if (this.f24882e) {
            str = "1";
        } else {
            str = "0";
        }
        a.mo12651a("is_qa_list_end", str).mo12655b();
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        boolean z;
        boolean z2;
        Room room;
        IMessageManager iMessageManager;
        IMessageManager iMessageManager2;
        IMessageManager iMessageManager3;
        User user;
        C9542az userAttr;
        Boolean bool;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        DataChannel dataChannel = this.f27010p;
        if (dataChannel == null || (str = (String) dataChannel.mo28318b(C10225au.class)) == null) {
            str = "";
        }
        this.f24885h = str;
        DataChannel dataChannel2 = this.f27010p;
        if (dataChannel2 == null || (bool = (Boolean) dataChannel2.mo28318b(C9119ed.class)) == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        this.f24883f = z;
        DataChannel dataChannel3 = this.f27010p;
        if (dataChannel3 == null || (user = (User) dataChannel3.mo28318b(C9101dm.class)) == null || (userAttr = user.getUserAttr()) == null) {
            z2 = false;
        } else {
            z2 = userAttr.f23192b;
        }
        this.f24884g = z2;
        DataChannel dataChannel4 = this.f27010p;
        if (!(dataChannel4 == null || (room = (Room) dataChannel4.mo28318b(C9093de.class)) == null)) {
            C10262i iVar = new C10262i(this.f27010p, this.f24885h);
            iVar.mo9336a((PagingViewModel) mo9929d());
            iVar.f24815j = Boolean.valueOf(this.f24883f);
            iVar.f24816k = this.f24884g;
            iVar.f10889h = false;
            iVar.notifyDataSetChanged();
            iVar.mo9337a(false);
            this.f24878a = iVar;
            if (!this.f24883f) {
                ImageView imageView = (ImageView) mo8166a_(R.id.cld);
                C89219l.m154716b(imageView, "");
                imageView.setVisibility(8);
                C88411a aVar = new C88411a();
                aVar.mo142945a(C6779a.m14563a().mo13052a(C10258e.class).mo143289d(new C10294f(this)));
                this.f24887k = aVar;
                DataChannel dataChannel5 = this.f27010p;
                if (dataChannel5 != null) {
                    dataChannel5.mo28309a((AbstractC1204m) this, C10176ab.class, (AbstractC89172b) new C10299k(this)).mo28309a((AbstractC1204m) this, C9052br.class, (AbstractC89172b) new C10300l(this));
                }
                DataChannel dataChannel6 = this.f27010p;
                if (dataChannel6 != null) {
                    dataChannel6.mo28309a((AbstractC1204m) this, C10203an.class, (AbstractC89172b) new C10301m(this)).mo28309a((AbstractC1204m) this, C10177ac.class, (AbstractC89172b) new C10302n(this));
                }
                C3868c.m9491a("live_Q&A_audicence_show", 0, C89041ag.m154428c(C89387v.m154943a("isQAOPen", Boolean.valueOf(C5762c.m12633b(this.f27010p))), C89387v.m154943a("isQAReducedVersion", Boolean.valueOf(C10175aa.m18673a(this.f27010p)))));
            } else {
                DataChannel dataChannel7 = this.f27010p;
                if (dataChannel7 != null) {
                    dataChannel7.mo28309a((AbstractC1204m) this, C3018a.class, (AbstractC89172b) new C10303o(this)).mo28309a((AbstractC1204m) this, C10203an.class, (AbstractC89172b) new C10304p(this)).mo28309a((AbstractC1204m) this, C10177ac.class, (AbstractC89172b) new C10305q(this));
                }
                ConstraintLayout constraintLayout = (ConstraintLayout) mo8166a_(R.id.le);
                C89219l.m154716b(constraintLayout, "");
                constraintLayout.setVisibility(8);
                DataChannel dataChannel8 = this.f27010p;
                if (dataChannel8 != null) {
                    dataChannel8.mo28309a((AbstractC1204m) this, C10259f.class, (AbstractC89172b) new C10295g(this));
                }
                DataChannel dataChannel9 = this.f27010p;
                if (dataChannel9 != null) {
                    dataChannel9.mo28309a((AbstractC1204m) this, C10174a.class, (AbstractC89172b) new C10296h(this));
                }
            }
            mo9929d().mo17011a(room, this.f24883f, this.f24884g);
            C10262i iVar2 = this.f24878a;
            if (iVar2 == null) {
                C89219l.m154710a("mAdapter");
            }
            iVar2.f24817l = room;
            ((ImageView) mo8166a_(R.id.cld)).setOnClickListener(new View$OnClickListenerC10297i(this));
            QuestionViewModel d = mo9929d();
            C89219l.m154716b(d, "");
            if (d.f24654i == null) {
                d.f24654i = new C1024f(d.f24656k, d.f24657l).mo3732a();
            }
            d.f24654i.observe(this, new C10298j(this));
            RecyclerView recyclerView = (RecyclerView) mo8166a_(R.id.acw);
            C10262i iVar3 = this.f24878a;
            if (iVar3 == null) {
                C89219l.m154710a("mAdapter");
            }
            recyclerView.setAdapter(iVar3);
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            DataChannel dataChannel10 = this.f27010p;
            if (!(dataChannel10 == null || (iMessageManager3 = (IMessageManager) dataChannel10.mo28318b(C9068cg.class)) == null)) {
                iMessageManager3.addMessageListener(EnumC9596a.BOTTOM_MESSAGE.getIntType(), this);
            }
            DataChannel dataChannel11 = this.f27010p;
            if (!(dataChannel11 == null || (iMessageManager2 = (IMessageManager) dataChannel11.mo28318b(C9068cg.class)) == null)) {
                int intType = EnumC9596a.QUESTION_DELETE_MESSAGE.getIntType();
                C10262i iVar4 = this.f24878a;
                if (iVar4 == null) {
                    C89219l.m154710a("mAdapter");
                }
                iMessageManager2.addMessageListener(intType, iVar4);
            }
            DataChannel dataChannel12 = this.f27010p;
            if (!(dataChannel12 == null || (iMessageManager = (IMessageManager) dataChannel12.mo28318b(C9068cg.class)) == null)) {
                iMessageManager.addMessageListener(EnumC9596a.QUESTION_DELETE_MESSAGE.getIntType(), this);
            }
        }
        ((ImageView) mo8166a_(R.id.a6t)).setOnClickListener(new View$OnClickListenerC10289b(this));
        ((ConstraintLayout) mo8166a_(R.id.le)).setOnClickListener(new View$OnClickListenerC10290c(this));
        mo9929d().f10973c.observe(this, new C10292d(this));
        if (this.f24883f || this.f24884g) {
            QuestionViewModel d2 = mo9929d();
            C89219l.m154716b(d2, "");
            d2.f10974d.observe(this, new C10293e(this));
        }
    }
}
