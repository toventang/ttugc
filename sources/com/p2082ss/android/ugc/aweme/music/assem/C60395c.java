package com.p2082ss.android.ugc.aweme.music.assem;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1182af;
import com.C1764a;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12759i;
import com.bytedance.assem.arch.extensions.AbstractC12779c;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12780d;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.arg.RouteArgExtension;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.experiment.C46936fm;
import com.p2082ss.android.ugc.aweme.music.AbstractC60708b;
import com.p2082ss.android.ugc.aweme.music.assem.LegacyCommunicateViewModel;
import com.p2082ss.android.ugc.aweme.music.assem.list.AbstractC60618p;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63985aq;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63990as;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64118co;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.music.assem.c */
public final class C60395c extends AbstractC64118co implements AbstractC60416h, AbstractC60708b, AbstractC63990as {

    /* renamed from: a */
    private final AbstractC89244h f137584a = RouteArgExtension.INSTANCE.navArg(this);

    /* renamed from: b */
    private final C12814b f137585b;

    /* renamed from: c */
    private String f137586c;

    /* renamed from: d */
    private AbstractC63985aq.AbstractC63987b f137587d;

    /* renamed from: e */
    private SparseArray f137588e;

    /* renamed from: com.ss.android.ugc.aweme.music.assem.c$b */
    public static final class C60397b extends AbstractC89220m implements AbstractC89172b<C60343a, C60343a> {
        public static final C60397b INSTANCE = new C60397b();

        static {
            Covode.recordClassIndex(70946);
        }

        public C60397b() {
            super(1);
        }

        public final C60343a invoke(C60343a aVar) {
            C89219l.m154719c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(70944);
    }

    /* renamed from: c */
    private final LegacyCommunicateViewModel m110062c() {
        return (LegacyCommunicateViewModel) this.f137585b.getValue();
    }

    /* renamed from: a */
    public final OriginMusicArg mo98046a() {
        return (OriginMusicArg) this.f137584a.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64118co
    /* renamed from: g */
    public final void mo65254g() {
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.c$d */
    public static final class C60399d extends AbstractC89220m implements AbstractC89171a<C60395c> {

        /* renamed from: a */
        final /* synthetic */ Fragment f137590a;

        static {
            Covode.recordClassIndex(70948);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60399d(Fragment fragment) {
            super(0);
            this.f137590a = fragment;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.music.assem.c] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.music.assem.C60395c invoke() {
            /*
                r1 = this;
                androidx.fragment.app.Fragment r0 = r1.f137590a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.music.assem.C60395c.C60399d.invoke():androidx.fragment.app.Fragment");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.c$c */
    public static final class C60398c extends AbstractC89220m implements AbstractC89171a<C12874b<C60343a>> {
        public static final C60398c INSTANCE = new C60398c();

        static {
            Covode.recordClassIndex(70947);
        }

        public C60398c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C60343a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.c$f */
    public static final class C60401f extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C60401f INSTANCE = new C60401f();

        static {
            Covode.recordClassIndex(70950);
        }

        public C60401f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.c$e */
    public static final class C60400e extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f137591a;

        static {
            Covode.recordClassIndex(70949);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60400e(Fragment fragment) {
            super(0);
            this.f137591a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            C1182af viewModelStore = this.f137591a.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64118co
    public final void aC_() {
        this.f145458N = true;
        if (isAdded()) {
            m110062c().f137515l = true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f137588e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.c$a */
    public static final class C60396a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f137589a;

        static {
            Covode.recordClassIndex(70945);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60396a(AbstractC89277c cVar) {
            super(0);
            this.f137589a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f137589a).getName();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3569c.AbstractC63505a
    public final void bS_() {
        if (af_()) {
            m110062c().mo20662a(LegacyCommunicateViewModel.C60336a.f137516a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3569c.AbstractC63505a
    public final boolean ci_() {
        AbstractC60618p pVar = (AbstractC60618p) C12801d.m23027d(this, C89204ab.m154669a(AbstractC60618p.class));
        if (pVar != null) {
            return pVar.mo98068E();
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.AbstractC60708b
    /* renamed from: f */
    public final void mo98051f() {
        if (af_()) {
            m110062c().mo20662a(LegacyCommunicateViewModel.C60337b.f137517a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63990as
    /* renamed from: k */
    public final boolean mo98052k() {
        AbstractC60618p pVar = (AbstractC60618p) C12801d.m23027d(this, C89204ab.m154669a(AbstractC60618p.class));
        if (pVar != null) {
            return pVar.mo98067D();
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.C39211a.AbstractC39212a
    /* renamed from: m */
    public final View mo62680m() {
        AbstractC60618p pVar = (AbstractC60618p) C12801d.m23027d(this, C89204ab.m154669a(AbstractC60618p.class));
        if (pVar != null) {
            return pVar.mo98069F();
        }
        return null;
    }

    public C60395c() {
        AbstractC89277c a = C89204ab.m154669a(LegacyCommunicateViewModel.class);
        this.f137585b = new C12814b(a, new C60396a(a), C60398c.INSTANCE, new C60399d(this), new C60400e(this), C60401f.INSTANCE, C60397b.INSTANCE);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.service.a' to match base method */
    @Override // com.bytedance.assem.arch.service.AbstractC12799b
    /* renamed from: e */
    public final /* synthetic */ C60394b mo20658e() {
        String str;
        boolean z;
        boolean z2;
        OriginMusicArg a = mo98046a();
        String str2 = null;
        if (a != null) {
            str = a.getUserId();
        } else {
            str = null;
        }
        OriginMusicArg a2 = mo98046a();
        if (a2 != null) {
            str2 = a2.getSecUserID();
        }
        OriginMusicArg a3 = mo98046a();
        if (a3 != null) {
            z = a3.isMe();
        } else {
            z = false;
        }
        OriginMusicArg a4 = mo98046a();
        if (a4 != null && a4.isMe() && C46936fm.m90230a().getEnablePin()) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            User curUser = g.getCurUser();
            C89219l.m154716b(curUser, "");
            if (curUser.getAccountType() != 3) {
                z2 = true;
                return new C60394b(str, str2, z, z2, false, null, 192);
            }
        }
        z2 = false;
        return new C60394b(str, str2, z, z2, false, null, 192);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.c$i */
    static final class C60409i extends AbstractC89220m implements AbstractC89172b<C60394b, C60394b> {

        /* renamed from: a */
        final /* synthetic */ boolean f137599a;

        static {
            Covode.recordClassIndex(70958);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60409i(boolean z) {
            super(1);
            this.f137599a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C60394b invoke(C60394b bVar) {
            C60394b bVar2 = bVar;
            if (bVar2 != null) {
                return C60394b.m110061a(bVar2, null, null, this.f137599a, false, false, false, null, null, 251);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.c$j */
    static final class C60410j extends AbstractC89220m implements AbstractC89172b<C60394b, C60394b> {

        /* renamed from: a */
        final /* synthetic */ String f137600a;

        /* renamed from: b */
        final /* synthetic */ String f137601b;

        static {
            Covode.recordClassIndex(70959);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60410j(String str, String str2) {
            super(1);
            this.f137600a = str;
            this.f137601b = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C60394b invoke(C60394b bVar) {
            C60394b bVar2 = bVar;
            if (bVar2 != null) {
                return C60394b.m110061a(bVar2, this.f137600a, this.f137601b, false, false, false, false, null, null, 252);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.c$k */
    static final class C60411k extends AbstractC89220m implements AbstractC89172b<C60394b, C60394b> {

        /* renamed from: a */
        final /* synthetic */ boolean f137602a;

        static {
            Covode.recordClassIndex(70960);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60411k(boolean z) {
            super(1);
            this.f137602a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C60394b invoke(C60394b bVar) {
            C60394b bVar2 = bVar;
            if (bVar2 != null) {
                return C60394b.m110061a(bVar2, null, null, false, false, false, false, new C12776a(Boolean.valueOf(this.f137602a)), null, 191);
            }
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.AbstractC60708b
    /* renamed from: a */
    public final void mo98047a(AbstractC63985aq.AbstractC63987b bVar) {
        this.f137587d = bVar;
        if (isAdded()) {
            m110062c().f137513j = bVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.AbstractC60708b
    /* renamed from: b */
    public final void mo98049b(String str) {
        this.f137586c = str;
        if (isAdded()) {
            m110062c().f137514k = this.f137586c;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        m110062c().f137513j = this.f137587d;
        m110062c().f137515l = this.f145458N;
        m110062c().f137514k = this.f137586c;
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.c$g */
    static final class C60402g extends AbstractC89220m implements AbstractC89172b<C60394b, C60394b> {

        /* renamed from: a */
        final /* synthetic */ boolean f137592a;

        static {
            Covode.recordClassIndex(70951);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60402g(boolean z) {
            super(1);
            this.f137592a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C60394b invoke(C60394b bVar) {
            C60394b bVar2 = bVar;
            if (bVar2 != null) {
                return C60394b.m110061a(bVar2, null, null, false, false, false, false, new C12776a(Boolean.valueOf(!this.f137592a)), null, 191);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.assem.c$h */
    static final class C60403h extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60395c f137593a;

        static {
            Covode.recordClassIndex(70952);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60403h(C60395c cVar) {
            super(1);
            this.f137593a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            C89219l.m154721d(assembler2, "");
            assembler2.mo20576a(this.f137593a, (AbstractC89172b<? super C12759i<AbstractC12779c>, C89391z>) new AbstractC89172b<C12759i<AbstractC12779c>, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.music.assem.C60395c.C60403h.C604041 */

                /* renamed from: a */
                final /* synthetic */ C60403h f137594a;

                static {
                    Covode.recordClassIndex(70953);
                }

                {
                    this.f137594a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12759i<AbstractC12779c> iVar) {
                    C12759i<AbstractC12779c> iVar2 = iVar;
                    C89219l.m154721d(iVar2, "");
                    OriginMusicArg a = this.f137594a.f137593a.mo98046a();
                    if (a == null) {
                        a = new OriginMusicArg(false, null, null, 0, null, 31, null);
                    }
                    iVar2.mo20617a(a);
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f137593a, C604052.f137595a);
            assembler2.mo20582b(this.f137593a, C604063.f137596a);
            assembler2.mo20582b(this.f137593a, C604074.f137597a);
            assembler2.mo20582b(this.f137593a, C604085.f137598a);
            return C89391z.f203057a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0107, code lost:
        if (r8.f31016a.containsKey(new com.bytedance.assem.arch.core.C12765o(r2, null)) == false) goto L_0x0109;
     */
    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64118co
    /* renamed from: c_ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo98050c_(boolean r15) {
        /*
        // Method dump skipped, instructions count: 353
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.music.assem.C60395c.mo98050c_(boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0111, code lost:
        if (r4.f31016a.containsKey(new com.bytedance.assem.arch.core.C12765o(r2, null)) == false) goto L_0x0113;
     */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onHiddenChanged(boolean r15) {
        /*
        // Method dump skipped, instructions count: 363
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.music.assem.C60395c.onHiddenChanged(boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0111, code lost:
        if (r4.f31016a.containsKey(new com.bytedance.assem.arch.core.C12765o(r2, null)) == false) goto L_0x0113;
     */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setUserVisibleHint(boolean r15) {
        /*
        // Method dump skipped, instructions count: 363
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.music.assem.C60395c.setUserVisibleHint(boolean):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C12780d.m23005a(this, new C60403h(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x010c, code lost:
        if (r4.f31016a.containsKey(new com.bytedance.assem.arch.core.C12765o(r2, null)) == false) goto L_0x010e;
     */
    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64118co
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo65249a(java.lang.String r15, java.lang.String r16) {
        /*
        // Method dump skipped, instructions count: 358
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.music.assem.C60395c.mo65249a(java.lang.String, java.lang.String):void");
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.apb, viewGroup, false);
    }
}
