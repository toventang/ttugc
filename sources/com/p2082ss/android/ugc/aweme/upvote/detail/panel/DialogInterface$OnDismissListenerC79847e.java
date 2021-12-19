package com.p2082ss.android.ugc.aweme.upvote.detail.panel;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1182af;
import com.C1764a;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.core.C12759i;
import com.bytedance.assem.arch.core.C12767q;
import com.bytedance.assem.arch.extensions.AbstractC12779c;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.fragment.C17372a;
import com.bytedance.tux.navigation.AbstractC23185a;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.bytedance.tux.sheet.AbstractC23218b;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.aweme.upvote.detail.UpvoteListViewModel;
import com.p2082ss.android.ugc.aweme.upvote.detail.panel.UpvoteDetailPanelViewModel;
import com.p2082ss.android.ugc.aweme.upvote.p4188b.C79706b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.e */
public final class DialogInterface$OnDismissListenerC79847e extends C17372a implements DialogInterface.OnDismissListener, AbstractC23185a, AbstractC23218b {

    /* renamed from: e */
    public static final C79848a f179072e = new C79848a((byte) 0);

    /* renamed from: f */
    private UpvoteDetailPanelViewModel f179073f;

    /* renamed from: g */
    private UpvoteListViewModel f179074g;

    /* renamed from: h */
    private SparseArray f179075h;

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.e$j */
    public static final class C79861j extends AbstractC89220m implements AbstractC89172b<C79884l, C79884l> {
        public static final C79861j INSTANCE = new C79861j();

        static {
            Covode.recordClassIndex(93086);
        }

        public C79861j() {
            super(1);
        }

        public final C79884l invoke(C79884l lVar) {
            C89219l.m154719c(lVar, "");
            return lVar;
        }
    }

    static {
        Covode.recordClassIndex(93072);
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: a */
    public final View mo27715a(int i) {
        if (this.f179075h == null) {
            this.f179075h = new SparseArray();
        }
        View view = (View) this.f179075h.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f179075h.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.tux.sheet.AbstractC23218b
    /* renamed from: a */
    public final void mo37806a(C23226a aVar, int i) {
        C89219l.m154721d(aVar, "");
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    public final void bx_() {
        SparseArray sparseArray = this.f179075h;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        bx_();
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.e$a */
    public static final class C79848a {
        static {
            Covode.recordClassIndex(93073);
        }

        private C79848a() {
        }

        public /* synthetic */ C79848a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.e$e */
    public static final class C79856e extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ Fragment f179087a;

        static {
            Covode.recordClassIndex(93081);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79856e(Fragment fragment) {
            super(0);
            this.f179087a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            return this.f179087a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.e$b */
    static final class C79849b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ DialogInterface$OnDismissListenerC79847e f179076a;

        static {
            Covode.recordClassIndex(93074);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79849b(DialogInterface$OnDismissListenerC79847e eVar) {
            super(0);
            this.f179076a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
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
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ p4600h.C89391z invoke() {
            /*
                r1 = this;
                com.ss.android.ugc.aweme.upvote.detail.panel.e r0 = r1.f179076a
                com.bytedance.tux.sheet.sheet.C23226a.C23228b.m43788a(r0)
                h.z r0 = p4600h.C89391z.f203057a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.upvote.detail.panel.DialogInterface$OnDismissListenerC79847e.C79849b.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.e$g */
    public static final class C79858g extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C79858g INSTANCE = new C79858g();

        static {
            Covode.recordClassIndex(93083);
        }

        public C79858g() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.e$k */
    public static final class C79862k extends AbstractC89220m implements AbstractC89171a<C12874b<C79884l>> {
        public static final C79862k INSTANCE = new C79862k();

        static {
            Covode.recordClassIndex(93087);
        }

        public C79862k() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C79884l> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.e$n */
    public static final class C79865n extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C79865n INSTANCE = new C79865n();

        static {
            Covode.recordClassIndex(93090);
        }

        public C79865n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.e$q */
    public static final class C79868q extends AbstractC89220m implements AbstractC89171a<C12874b<C79884l>> {
        public static final C79868q INSTANCE = new C79868q();

        static {
            Covode.recordClassIndex(93093);
        }

        public C79868q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C79884l> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.e$f */
    public static final class C79857f extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f179088a;

        static {
            Covode.recordClassIndex(93082);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79857f(Fragment fragment) {
            super(0);
            this.f179088a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            C1182af viewModelStore = this.f179088a.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.e$l */
    public static final class C79863l extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f179091a;

        static {
            Covode.recordClassIndex(93088);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79863l(Fragment fragment) {
            super(0);
            this.f179091a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e requireActivity = this.f179091a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return requireActivity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.e$d */
    public static final class C79855d extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f179086a;

        static {
            Covode.recordClassIndex(93080);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79855d(AbstractC89277c cVar) {
            super(0);
            this.f179086a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f179086a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.e$h */
    public static final class C79859h extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ Fragment f179089a;

        static {
            Covode.recordClassIndex(93084);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79859h(Fragment fragment) {
            super(0);
            this.f179089a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e requireActivity = this.f179089a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20583b(this.f179089a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.e$i */
    public static final class C79860i extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f179090a;

        static {
            Covode.recordClassIndex(93085);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79860i(Fragment fragment) {
            super(0);
            this.f179090a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e requireActivity = this.f179090a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20584c(this.f179090a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.e$m */
    public static final class C79864m extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f179092a;

        static {
            Covode.recordClassIndex(93089);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79864m(Fragment fragment) {
            super(0);
            this.f179092a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e requireActivity = this.f179092a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            C1182af viewModelStore = requireActivity.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.e$o */
    public static final class C79866o extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ Fragment f179093a;

        static {
            Covode.recordClassIndex(93091);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79866o(Fragment fragment) {
            super(0);
            this.f179093a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e requireActivity = this.f179093a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20583b(this.f179093a.getActivity());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.e$p */
    public static final class C79867p extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f179094a;

        static {
            Covode.recordClassIndex(93092);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79867p(Fragment fragment) {
            super(0);
            this.f179094a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e requireActivity = this.f179094a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20584c(this.f179094a.getActivity());
        }
    }

    @Override // com.bytedance.tux.navigation.AbstractC23185a
    /* renamed from: a */
    public final TuxNavBar.C23179a mo37737a() {
        TuxNavBar.C23179a aVar = new TuxNavBar.C23179a();
        C23194g gVar = new C23194g();
        String string = getString(((Number) C79706b.m138537a(Integer.valueOf((int) R.string.f68), Integer.valueOf((int) R.string.fao))).intValue());
        C89219l.m154716b(string, "");
        TuxNavBar.C23179a a = aVar.mo37731a(gVar.mo37753a(string));
        C23187b a2 = new C23187b().mo37738a(R.raw.icon_x_mark_small);
        a2.f54930b = true;
        TuxNavBar.C23179a b = a.mo37733b(a2.mo37741a((AbstractC89171a<C89391z>) new C79849b(this)));
        b.f54919d = true;
        return b;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        UpvoteListViewModel.f178878e = false;
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.e$c */
    static final class C79850c extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ DialogInterface$OnDismissListenerC79847e f179077a;

        /* renamed from: b */
        final /* synthetic */ String f179078b;

        /* renamed from: c */
        final /* synthetic */ String f179079c;

        /* renamed from: d */
        final /* synthetic */ String f179080d;

        /* renamed from: e */
        final /* synthetic */ boolean f179081e;

        static {
            Covode.recordClassIndex(93075);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79850c(DialogInterface$OnDismissListenerC79847e eVar, String str, String str2, String str3, boolean z) {
            super(1);
            this.f179077a = eVar;
            this.f179078b = str;
            this.f179079c = str2;
            this.f179080d = str3;
            this.f179081e = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            C89219l.m154721d(assembler2, "");
            assembler2.mo20576a(this.f179077a, (AbstractC89172b<? super C12759i<AbstractC12779c>, C89391z>) new AbstractC89172b<C12759i<AbstractC12779c>, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.upvote.detail.panel.DialogInterface$OnDismissListenerC79847e.C79850c.C798511 */

                /* renamed from: a */
                final /* synthetic */ C79850c f179082a;

                static {
                    Covode.recordClassIndex(93076);
                }

                {
                    this.f179082a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12759i<AbstractC12779c> iVar) {
                    C12759i<AbstractC12779c> iVar2 = iVar;
                    C89219l.m154721d(iVar2, "");
                    iVar2.mo20617a(new C79869f(this.f179082a.f179078b, this.f179082a.f179079c, this.f179082a.f179080d, this.f179082a.f179081e));
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f179077a, C798522.f179083a);
            assembler2.mo20582b(this.f179077a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.upvote.detail.panel.DialogInterface$OnDismissListenerC79847e.C79850c.C798533 */

                /* renamed from: a */
                final /* synthetic */ C79850c f179084a;

                static {
                    Covode.recordClassIndex(93078);
                }

                {
                    this.f179084a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.f31053e = this.f179084a.f179077a.getView();
                    qVar2.mo20632a(C89204ab.m154669a(C79837b.class));
                    qVar2.f31050b = new C79837b();
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f179077a, C798544.f179085a);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.tux.sheet.AbstractC23218b
    /* renamed from: a */
    public final void mo37805a(C23226a aVar, float f) {
        C89219l.m154721d(aVar, "");
        UpvoteDetailPanelViewModel upvoteDetailPanelViewModel = this.f179073f;
        if (upvoteDetailPanelViewModel == null) {
            C89219l.m154710a("panelVM");
        }
        upvoteDetailPanelViewModel.mo20662a(new UpvoteDetailPanelViewModel.C79807l(f));
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
    public final void onViewCreated(android.view.View r17, android.os.Bundle r18) {
        /*
        // Method dump skipped, instructions count: 207
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.upvote.detail.panel.DialogInterface$OnDismissListenerC79847e.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.bhb, viewGroup, false);
    }
}
