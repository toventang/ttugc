package com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.p3207b;

import android.os.Bundle;
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
import com.bytedance.assem.arch.extensions.AbstractC12779c;
import com.bytedance.assem.arch.extensions.C12780d;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.EnumC55388a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.viewmodel.C55619b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.viewmodel.ContactListViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b */
public final class C55539b extends AbstractC34586a {

    /* renamed from: b */
    public static final C55554o f126776b = new C55554o((byte) 0);

    /* renamed from: a */
    public C55555p f126777a;

    /* renamed from: c */
    private final C12814b f126778c;

    /* renamed from: d */
    private HashMap f126779d;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b$g */
    public static final class C55546g extends AbstractC89220m implements AbstractC89172b<C55619b, C55619b> {
        public static final C55546g INSTANCE = new C55546g();

        static {
            Covode.recordClassIndex(65317);
        }

        public C55546g() {
            super(1);
        }

        public final C55619b invoke(C55619b bVar) {
            C89219l.m154719c(bVar, "");
            return bVar;
        }
    }

    static {
        Covode.recordClassIndex(65310);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b$b */
    public static final class C55541b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ Fragment f126781a;

        static {
            Covode.recordClassIndex(65312);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55541b(Fragment fragment) {
            super(0);
            this.f126781a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            return this.f126781a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b$o */
    public static final class C55554o {
        static {
            Covode.recordClassIndex(65325);
        }

        private C55554o() {
        }

        public /* synthetic */ C55554o(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b$p */
    public static final class C55555p implements AbstractC12779c, Serializable {

        /* renamed from: a */
        private final Collection<IMUser> f126789a;

        /* renamed from: b */
        private final Collection<IMUser> f126790b;

        /* renamed from: c */
        private final EnumC55388a f126791c;

        /* renamed from: d */
        private final String f126792d;

        static {
            Covode.recordClassIndex(65326);
        }

        public C55555p() {
            this(null, null, null, null, 15, null);
        }

        public final String getConversationId() {
            return this.f126792d;
        }

        public final EnumC55388a getEntry() {
            return this.f126791c;
        }

        public final Collection<IMUser> getGroupMembers() {
            return this.f126790b;
        }

        public final Collection<IMUser> getSelectedContacts() {
            return this.f126789a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Collection<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Collection<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
        /* JADX WARN: Multi-variable type inference failed */
        public C55555p(Collection<? extends IMUser> collection, Collection<? extends IMUser> collection2, EnumC55388a aVar, String str) {
            C89219l.m154721d(collection, "");
            C89219l.m154721d(collection2, "");
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(str, "");
            this.f126789a = collection;
            this.f126790b = collection2;
            this.f126791c = aVar;
            this.f126792d = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C55555p(Collection collection, Collection collection2, EnumC55388a aVar, String str, int i, C89214g gVar) {
            this((i & 1) != 0 ? C89086z.INSTANCE : collection, (i & 2) != 0 ? C89086z.INSTANCE : collection2, (i & 4) != 0 ? EnumC55388a.CREATE_GROUP : aVar, (i & 8) != 0 ? "" : str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b$d */
    public static final class C55543d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C55543d INSTANCE = new C55543d();

        static {
            Covode.recordClassIndex(65314);
        }

        public C55543d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b$h */
    public static final class C55547h extends AbstractC89220m implements AbstractC89171a<C12874b<C55619b>> {
        public static final C55547h INSTANCE = new C55547h();

        static {
            Covode.recordClassIndex(65318);
        }

        public C55547h() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C55619b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b$k */
    public static final class C55550k extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C55550k INSTANCE = new C55550k();

        static {
            Covode.recordClassIndex(65321);
        }

        public C55550k() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b$n */
    public static final class C55553n extends AbstractC89220m implements AbstractC89171a<C12874b<C55619b>> {
        public static final C55553n INSTANCE = new C55553n();

        static {
            Covode.recordClassIndex(65324);
        }

        public C55553n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C55619b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b$c */
    public static final class C55542c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f126782a;

        static {
            Covode.recordClassIndex(65313);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55542c(Fragment fragment) {
            super(0);
            this.f126782a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            C1182af viewModelStore = this.f126782a.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b$i */
    public static final class C55548i extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f126785a;

        static {
            Covode.recordClassIndex(65319);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55548i(Fragment fragment) {
            super(0);
            this.f126785a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e requireActivity = this.f126785a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return requireActivity;
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f126779d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b$a */
    public static final class C55540a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f126780a;

        static {
            Covode.recordClassIndex(65311);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55540a(AbstractC89277c cVar) {
            super(0);
            this.f126780a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f126780a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b$e */
    public static final class C55544e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ Fragment f126783a;

        static {
            Covode.recordClassIndex(65315);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55544e(Fragment fragment) {
            super(0);
            this.f126783a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e requireActivity = this.f126783a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20583b(this.f126783a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b$f */
    public static final class C55545f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f126784a;

        static {
            Covode.recordClassIndex(65316);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55545f(Fragment fragment) {
            super(0);
            this.f126784a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e requireActivity = this.f126784a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20584c(this.f126784a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b$j */
    public static final class C55549j extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f126786a;

        static {
            Covode.recordClassIndex(65320);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55549j(Fragment fragment) {
            super(0);
            this.f126786a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e requireActivity = this.f126786a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            C1182af viewModelStore = requireActivity.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b$l */
    public static final class C55551l extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ Fragment f126787a;

        static {
            Covode.recordClassIndex(65322);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55551l(Fragment fragment) {
            super(0);
            this.f126787a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e requireActivity = this.f126787a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20583b(this.f126787a.getActivity());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b$m */
    public static final class C55552m extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f126788a;

        static {
            Covode.recordClassIndex(65323);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55552m(Fragment fragment) {
            super(0);
            this.f126788a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e requireActivity = this.f126788a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20584c(this.f126788a.getActivity());
        }
    }

    public C55539b() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a = C89204ab.m154669a(ContactListViewModel.class);
        C55540a aVar = new C55540a(a);
        C55546g gVar = C55546g.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C55547h.INSTANCE, new C55548i(this), new C55549j(this), C55550k.INSTANCE, gVar, new C55551l(this), new C55552m(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C55553n.INSTANCE, new C55541b(this), new C55542c(this), C55543d.INSTANCE, gVar, new C55544e(this), new C55545f(this));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.f126778c = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b$q */
    static final class C55556q extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C55539b f126793a;

        static {
            Covode.recordClassIndex(65327);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55556q(C55539b bVar) {
            super(1);
            this.f126793a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            C89219l.m154721d(assembler2, "");
            assembler2.mo20576a(this.f126793a, (AbstractC89172b<? super C12759i<AbstractC12779c>, C89391z>) new AbstractC89172b<C12759i<AbstractC12779c>, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.p3207b.C55539b.C55556q.C555571 */

                /* renamed from: a */
                final /* synthetic */ C55556q f126794a;

                static {
                    Covode.recordClassIndex(65328);
                }

                {
                    this.f126794a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12759i<AbstractC12779c> iVar) {
                    C12759i<AbstractC12779c> iVar2 = iVar;
                    C89219l.m154721d(iVar2, "");
                    C55555p pVar = this.f126794a.f126793a.f126777a;
                    if (pVar == null) {
                        C89219l.m154710a("config");
                    }
                    iVar2.mo20617a(pVar);
                    iVar2.f31027b = "init_config";
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f126793a, C555582.f126795a);
            assembler2.mo20582b(this.f126793a, C555593.f126796a);
            assembler2.mo20582b(this.f126793a, C555604.f126797a);
            assembler2.mo20582b(this.f126793a, C555615.f126798a);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("init_config");
        } else {
            serializable = null;
        }
        C55555p pVar = (C55555p) serializable;
        if (pVar == null) {
            pVar = new C55555p(null, null, null, null, 15, null);
        }
        this.f126777a = pVar;
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        ((ContactListViewModel) this.f126778c.getValue()).mo92519j().mo92621g();
        C55555p pVar = this.f126777a;
        if (pVar == null) {
            C89219l.m154710a("config");
        }
        EnumC55388a entry = pVar.getEntry();
        if (this.f126779d == null) {
            this.f126779d = new HashMap();
        }
        View view2 = (View) this.f126779d.get(Integer.valueOf((int) R.id.eiz));
        if (view2 == null) {
            View view3 = getView();
            if (view3 == null) {
                view2 = null;
            } else {
                view2 = view3.findViewById(R.id.eiz);
                this.f126779d.put(Integer.valueOf((int) R.id.eiz), view2);
            }
        }
        ImTextTitleBar imTextTitleBar = (ImTextTitleBar) view2;
        C89219l.m154716b(imTextTitleBar, "");
        entry.setupTitleBar(imTextTitleBar, this);
        C12780d.m23005a(this, new C55556q(this));
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.a4o, viewGroup, false);
    }
}
