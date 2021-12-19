package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifpanel;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1183ag;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1182af;
import androidx.p025c.C0484a;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.aweme.emoji.emojichoose.AbstractC46519p;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46447a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifpanel.GiphyViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifsearch.giphy.p3114a.C54186b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.p3107a.C54081a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55059b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55216l;
import com.p2082ss.android.ugc.trill.R;
import dagger.hilt.p4541b.C88120a;
import java.util.HashMap;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.a */
public final class C54157a extends AbstractC54180h {

    /* renamed from: i */
    public static final C54160c f124094i = new C54160c((byte) 0);

    /* renamed from: e */
    public AbstractC46519p f124095e;

    /* renamed from: f */
    EpoxyRecyclerView f124096f;

    /* renamed from: g */
    ProgressBar f124097g;

    /* renamed from: h */
    TuxTextView f124098h;

    /* renamed from: j */
    private View f124099j;

    /* renamed from: k */
    private TuxIconView f124100k;

    /* renamed from: l */
    private final AbstractC89244h f124101l = C89250i.m154773a((AbstractC89171a) new C54164e(this));

    /* renamed from: m */
    private final AbstractC89244h f124102m = C88120a.m153193a(this, C89204ab.m154669a(GiphyViewModel.class), new C54159b(new C54158a(this)));

    /* renamed from: n */
    private HashMap f124103n;

    static {
        Covode.recordClassIndex(63839);
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: a */
    public final View mo27715a(int i) {
        if (this.f124103n == null) {
            this.f124103n = new HashMap();
        }
        View view = (View) this.f124103n.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f124103n.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    public final void bx_() {
        HashMap hashMap = this.f124103n;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: c */
    public final GifController mo64296c() {
        return (GifController) this.f124101l.getValue();
    }

    /* renamed from: d */
    public final GiphyViewModel mo91268d() {
        return (GiphyViewModel) this.f124102m.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        bx_();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.a$a */
    public static final class C54158a extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ Fragment f124104a;

        static {
            Covode.recordClassIndex(63840);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54158a(Fragment fragment) {
            super(0);
            this.f124104a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            return this.f124104a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.a$c */
    public static final class C54160c {
        static {
            Covode.recordClassIndex(63842);
        }

        private C54160c() {
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.a$c$a */
        public static final class C54161a implements AbstractC46519p {

            /* renamed from: a */
            final /* synthetic */ AbstractC89187q f124106a;

            static {
                Covode.recordClassIndex(63843);
            }

            @Override // com.p2082ss.android.ugc.aweme.emoji.emojichoose.AbstractC46519p
            /* renamed from: a */
            public final void mo79015a() {
            }

            @Override // com.p2082ss.android.ugc.aweme.emoji.emojichoose.AbstractC46519p
            /* renamed from: a */
            public final void mo79017a(String str) {
                C89219l.m154721d(str, "");
            }

            @Override // com.p2082ss.android.ugc.aweme.emoji.emojichoose.AbstractC46519p
            /* renamed from: b */
            public final void mo79018b() {
            }

            @Override // com.p2082ss.android.ugc.aweme.emoji.emojichoose.AbstractC46519p
            /* renamed from: c */
            public final void mo79019c() {
            }

            C54161a(AbstractC89187q qVar) {
                this.f124106a = qVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.emoji.emojichoose.AbstractC46519p
            /* renamed from: a */
            public final void mo79016a(View view, C46447a aVar, int i) {
                C89219l.m154721d(view, "");
                C89219l.m154721d(aVar, "");
                this.f124106a.invoke(view, aVar, Integer.valueOf(i));
            }
        }

        public /* synthetic */ C54160c(byte b) {
            this();
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.a$c$b */
        static final class DialogInterface$OnDismissListenerC54162b implements DialogInterface.OnDismissListener {

            /* renamed from: a */
            final /* synthetic */ C54157a f124107a;

            static {
                Covode.recordClassIndex(63844);
            }

            DialogInterface$OnDismissListenerC54162b(C54157a aVar) {
                this.f124107a = aVar;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                C54157a aVar = this.f124107a;
                C89219l.m154716b(dialogInterface, "");
                C89219l.m154721d(dialogInterface, "");
                GiphyViewModel d = aVar.mo91268d();
                Long l = d.f124080h;
                if (l != null) {
                    d.f124082j.mo91265a(d.f124082j.mo91264a() - l.longValue());
                }
            }
        }

        /* renamed from: a */
        public static void m99418a(ActivityC0945e eVar, AbstractC89187q<? super View, ? super C46447a, ? super Integer, C89391z> qVar) {
            C89219l.m154721d(eVar, "");
            C89219l.m154721d(qVar, "");
            if (eVar.getSupportFragmentManager().mo3551a("gifChoosePanelBottomSheet") == null) {
                C54157a aVar = new C54157a();
                Resources resources = eVar.getResources();
                C89219l.m154716b(resources, "");
                C23226a aVar2 = new C23226a.C23227a().mo37819a(true).mo37812a(1).mo37821b(C89241a.m154730a(((float) resources.getDisplayMetrics().heightPixels) * 0.8f)).mo37823c().mo37822b(false).mo37815a(new DialogInterface$OnDismissListenerC54162b(aVar)).mo37817a(aVar).f55057a;
                aVar.mo91267a(new C54161a(qVar));
                aVar2.show(eVar.getSupportFragmentManager(), "gifChoosePanelBottomSheet");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.a$d */
    public static final class C54163d implements GiphyViewModel.AbstractC54147a {
        static {
            Covode.recordClassIndex(63845);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifpanel.GiphyViewModel.AbstractC54147a
        /* renamed from: a */
        public final long mo91264a() {
            return System.currentTimeMillis();
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifpanel.GiphyViewModel.AbstractC54147a
        /* renamed from: a */
        public final void mo91266a(boolean z) {
            C54081a.C54083b bVar = C54081a.C54083b.f123945a;
            C89219l.m154721d(bVar, "");
            C0484a aVar = new C0484a();
            aVar.put("success", String.valueOf(z));
            bVar.invoke("gif_analytics", aVar);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifpanel.GiphyViewModel.AbstractC54147a
        /* renamed from: a */
        public final void mo91265a(long j) {
            C54081a.C54084c cVar = C54081a.C54084c.f123946a;
            C89219l.m154721d(cVar, "");
            C0484a aVar = new C0484a();
            aVar.put("enter_from", C54081a.C54082a.f123942a);
            aVar.put("process_id", C55059b.f126008b);
            aVar.put("duration", String.valueOf(j));
            cVar.invoke("gif_stay_time", aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.a$b */
    public static final class C54159b extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f124105a;

        static {
            Covode.recordClassIndex(63841);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54159b(AbstractC89171a aVar) {
            super(0);
            this.f124105a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            C1182af viewModelStore = ((AbstractC1183ag) this.f124105a.invoke()).getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        GiphyViewModel d = mo91268d();
        d.f124080h = Long.valueOf(d.f124082j.mo91264a());
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.a$e */
    static final class C54164e extends AbstractC89220m implements AbstractC89171a<GifController> {

        /* renamed from: a */
        final /* synthetic */ C54157a f124108a;

        static {
            Covode.recordClassIndex(63846);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54164e(C54157a aVar) {
            super(0);
            this.f124108a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ GifController invoke() {
            Context requireContext = this.f124108a.requireContext();
            C89219l.m154716b(requireContext, "");
            AbstractC46519p pVar = this.f124108a.f124095e;
            if (pVar == null) {
                C89219l.m154710a("inputBridge");
            }
            return new GifController(requireContext, pVar, this.f124108a.mo91268d());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.a$g */
    public static final class C54166g extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ C54157a f124110a;

        static {
            Covode.recordClassIndex(63848);
        }

        C54166g(C54157a aVar) {
            this.f124110a = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            super.mo4753a(recyclerView, i);
            if (i == 1) {
                C55216l.m100963a(this.f124110a.requireActivity(), recyclerView);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.a$k */
    static final class C54170k<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C54157a f124114a;

        static {
            Covode.recordClassIndex(63852);
        }

        C54170k(C54157a aVar) {
            this.f124114a = aVar;
        }

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
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(java.lang.Object r2) {
            /*
                r1 = this;
                com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.a r0 = r1.f124114a
                com.bytedance.tux.sheet.sheet.C23226a.C23228b.m43788a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifpanel.C54157a.C54170k.onChanged(java.lang.Object):void");
        }
    }

    /* renamed from: a */
    public final void mo91267a(AbstractC46519p pVar) {
        C89219l.m154721d(pVar, "");
        this.f124095e = pVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.a$f */
    static final class View$OnClickListenerC54165f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C54157a f124109a;

        static {
            Covode.recordClassIndex(63847);
        }

        View$OnClickListenerC54165f(C54157a aVar) {
            this.f124109a = aVar;
        }

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
        public final void onClick(android.view.View r2) {
            /*
                r1 = this;
                com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent.onClick(r2)
                com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.a r0 = r1.f124109a
                com.bytedance.tux.sheet.sheet.C23226a.C23228b.m43788a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifpanel.C54157a.View$OnClickListenerC54165f.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.a$i */
    static final class C54168i<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C54157a f124112a;

        static {
            Covode.recordClassIndex(63850);
        }

        C54168i(C54157a aVar) {
            this.f124112a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            List<C54186b> list = (List) obj;
            C89219l.m154721d(list, "");
            this.f124112a.mo64296c().setData(list);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.a$h */
    static final class C54167h<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C54157a f124111a;

        static {
            Covode.recordClassIndex(63849);
        }

        C54167h(C54157a aVar) {
            this.f124111a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            if (C89219l.m154714a(obj, (Object) true)) {
                C54157a aVar = this.f124111a;
                ProgressBar progressBar = aVar.f124097g;
                if (progressBar == null) {
                    C89219l.m154710a("progressBar");
                }
                progressBar.setVisibility(0);
                TuxTextView tuxTextView = aVar.f124098h;
                if (tuxTextView == null) {
                    C89219l.m154710a("statusTextView");
                }
                tuxTextView.setVisibility(8);
                EpoxyRecyclerView epoxyRecyclerView = aVar.f124096f;
                if (epoxyRecyclerView == null) {
                    C89219l.m154710a("recyclerView");
                }
                epoxyRecyclerView.setVisibility(4);
            } else if (C89219l.m154714a(obj, (Object) false)) {
                C54157a aVar2 = this.f124111a;
                ProgressBar progressBar2 = aVar2.f124097g;
                if (progressBar2 == null) {
                    C89219l.m154710a("progressBar");
                }
                progressBar2.setVisibility(8);
                TuxTextView tuxTextView2 = aVar2.f124098h;
                if (tuxTextView2 == null) {
                    C89219l.m154710a("statusTextView");
                }
                tuxTextView2.setVisibility(8);
                EpoxyRecyclerView epoxyRecyclerView2 = aVar2.f124096f;
                if (epoxyRecyclerView2 == null) {
                    C89219l.m154710a("recyclerView");
                }
                epoxyRecyclerView2.setVisibility(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.a$j */
    static final class C54169j<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C54157a f124113a;

        static {
            Covode.recordClassIndex(63851);
        }

        C54169j(C54157a aVar) {
            this.f124113a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            List<C54186b> value;
            Integer value2 = this.f124113a.mo91268d().f124074b.getValue();
            if (value2 != null && value2.intValue() == 0 && (value = this.f124113a.mo91268d().f124077e.getValue()) != null && value.size() == 0) {
                C54157a aVar = this.f124113a;
                ProgressBar progressBar = aVar.f124097g;
                if (progressBar == null) {
                    C89219l.m154710a("progressBar");
                }
                progressBar.setVisibility(8);
                TuxTextView tuxTextView = aVar.f124098h;
                if (tuxTextView == null) {
                    C89219l.m154710a("statusTextView");
                }
                tuxTextView.setVisibility(0);
                aVar.mo64296c().setData(C89086z.INSTANCE);
            }
        }
    }

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
    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
        // Method dump skipped, instructions count: 237
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifpanel.C54157a.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.a6z, viewGroup, false);
    }
}
