package com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.viewmodel;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3139a.C54603a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3172c.C55062b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55080c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.p3207b.C55539b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.AbstractC55815d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.C55845g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55764d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.p3223b.C55732c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3221b.C55718b;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89376n;
import p4600h.C89378p;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.ContactListViewModel */
public final class ContactListViewModel extends AssemViewModel<C55619b> implements AbstractC55764d<IMContact>, AbstractC55815d, AbstractC55815d {

    /* renamed from: l */
    public static final C55602b f126833l = new C55602b((byte) 0);

    /* renamed from: j */
    public final IMUser f126834j;

    /* renamed from: k */
    public boolean f126835k;

    /* renamed from: m */
    private final C12786i f126836m = new C12786i(true, new C55601a(this, "init_config"));

    /* renamed from: n */
    private final AbstractC89244h f126837n = C89250i.m154773a((AbstractC89171a) new C55605e(this));

    /* renamed from: o */
    private final AbstractC89244h f126838o = C89250i.m154773a((AbstractC89171a) new C55604d(this));

    /* renamed from: p */
    private final AbstractC89244h f126839p = C89250i.m154773a((AbstractC89171a) new C55612l(this));

    /* renamed from: q */
    private final AbstractC89244h f126840q = C89250i.m154773a((AbstractC89171a) new C55611k(this));

    /* renamed from: r */
    private final Comparator<IMUser> f126841r = C55603c.f126844a;

    static {
        Covode.recordClassIndex(65379);
    }

    /* renamed from: o */
    private final Set<IMUser> m101284o() {
        return (Set) this.f126837n.getValue();
    }

    /* renamed from: g */
    public final C55539b.C55555p mo23342g() {
        return (C55539b.C55555p) this.f126836m.getValue();
    }

    /* renamed from: h */
    public final C19638h mo23343h() {
        return (C19638h) this.f126838o.getValue();
    }

    /* renamed from: i */
    public final LinkedHashSet<IMUser> mo92518i() {
        return (LinkedHashSet) this.f126839p.getValue();
    }

    /* renamed from: j */
    public final C55845g mo92519j() {
        return (C55845g) this.f126840q.getValue();
    }

    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.ContactListViewModel$b */
    public static final class C55602b {
        static {
            Covode.recordClassIndex(65381);
        }

        private C55602b() {
        }

        public /* synthetic */ C55602b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.ContactListViewModel$e */
    static final class C55605e extends AbstractC89220m implements AbstractC89171a<Set<? extends IMUser>> {

        /* renamed from: a */
        final /* synthetic */ ContactListViewModel f126846a;

        static {
            Covode.recordClassIndex(65384);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55605e(ContactListViewModel contactListViewModel) {
            super(0);
            this.f126846a = contactListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Set<? extends IMUser> invoke() {
            return C89070n.m154592l(this.f126846a.mo23342g().getGroupMembers());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.ContactListViewModel$l */
    static final class C55612l extends AbstractC89220m implements AbstractC89171a<LinkedHashSet<IMUser>> {

        /* renamed from: a */
        final /* synthetic */ ContactListViewModel f126854a;

        static {
            Covode.recordClassIndex(65391);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55612l(ContactListViewModel contactListViewModel) {
            super(0);
            this.f126854a = contactListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LinkedHashSet<IMUser> invoke() {
            return new LinkedHashSet(this.f126854a.mo23342g().getSelectedContacts());
        }
    }

    /* renamed from: k */
    public final List<IMUser> mo92520k() {
        return C89070n.m154590j(mo92518i());
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        mo92519j().mo92618d();
        mo92519j().mo92712m();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.ContactListViewModel$d */
    static final class C55604d extends AbstractC89220m implements AbstractC89171a<C19638h> {

        /* renamed from: a */
        final /* synthetic */ ContactListViewModel f126845a;

        static {
            Covode.recordClassIndex(65383);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55604d(ContactListViewModel contactListViewModel) {
            super(0);
            this.f126845a = contactListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C19638h invoke() {
            return AbstractC17420a.C17421a.m32276a().mo27720a(this.f126845a.mo23342g().getConversationId());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.ContactListViewModel$k */
    static final class C55611k extends AbstractC89220m implements AbstractC89171a<C55845g> {

        /* renamed from: a */
        final /* synthetic */ ContactListViewModel f126853a;

        static {
            Covode.recordClassIndex(65390);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55611k(ContactListViewModel contactListViewModel) {
            super(0);
            this.f126853a = contactListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C55845g invoke() {
            C55732c cVar = new C55732c(true, 1);
            cVar.f127113d = true;
            C55845g gVar = new C55845g(cVar);
            gVar.mo92615a((AbstractC55764d<IMContact>) this.f126853a);
            gVar.mo92710a((AbstractC55815d) this.f126853a);
            return gVar;
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ C55619b mo20674f() {
        return new C55619b(new C12776a(C89086z.INSTANCE), null, new C89378p(C89086z.INSTANCE, ""));
    }

    /* renamed from: l */
    public final int mo92521l() {
        if (mo92518i().contains(this.f126834j)) {
            return mo92518i().size() - 1;
        }
        return mo92518i().size();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.ContactListViewModel$a */
    public static final class C55601a extends AbstractC89220m implements AbstractC89171a<C55539b.C55555p> {

        /* renamed from: a */
        final /* synthetic */ AssemViewModel f126842a;

        /* renamed from: b */
        final /* synthetic */ String f126843b;

        static {
            Covode.recordClassIndex(65380);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55601a(AssemViewModel assemViewModel, String str) {
            super(0);
            this.f126842a = assemViewModel;
            this.f126843b = str;
        }

        /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b$p] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.p3207b.C55539b.C55555p invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.f126842a
                com.bytedance.assem.arch.core.d r0 = r0.f31150d
                if (r0 == 0) goto L_0x0018
                com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.f126842a
                com.bytedance.assem.arch.core.d r2 = r0.f31150d
                if (r2 != 0) goto L_0x000f
                p4600h.p4611f.p4613b.C89219l.m154707a()
            L_0x000f:
                java.lang.Class<com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b$p> r1 = com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.p3207b.C55539b.C55555p.class
                java.lang.String r0 = r3.f126843b
                java.lang.Object r0 = r2.mo20603a(r1, r0)
                return r0
            L_0x0018:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r0 = "HierarchyData has not inject to "
                r1.<init>(r0)
                com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.f126842a
                java.lang.StringBuilder r1 = r1.append(r0)
                java.lang.String r0 = ", you can't get hierarchyData"
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r0 = r0.toString()
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.viewmodel.ContactListViewModel.C55601a.invoke():java.lang.Object");
        }
    }

    /* renamed from: p */
    private final void m101285p() {
        int i = C55618a.f126869d[mo23342g().getEntry().ordinal()];
        if (i == 1) {
            C54603a.m100108b();
        } else if (i == 2) {
            C54603a.m100112c();
        } else {
            throw new C89376n();
        }
    }

    /* renamed from: m */
    public final List<IMUser> mo92522m() {
        if (mo92518i().size() != 2 || !mo92518i().contains(this.f126834j)) {
            return C89070n.m154590j(mo92518i());
        }
        List<IMUser> g = C89070n.m154585g((Collection) mo92518i());
        g.remove(this.f126834j);
        return g;
    }

    public ContactListViewModel() {
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        C89219l.m154716b(createIUserServicebyMonsterPlugin, "");
        IMUser fromUser = IMUser.fromUser(createIUserServicebyMonsterPlugin.getCurrentUser());
        C89219l.m154716b(fromUser, "");
        this.f126834j = fromUser;
    }

    /* renamed from: n */
    public final boolean mo92523n() {
        int a;
        int i = C55618a.f126866a[mo23342g().getEntry().ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            int size = mo92518i().size() + m101284o().size();
            C19638h h = mo23343h();
            if (h != null) {
                a = C55080c.m100733d(h);
            } else {
                a = C55062b.m100702a();
            }
            if (size >= a) {
                return true;
            }
            return false;
        }
        throw new C89376n();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55764d
    /* renamed from: a */
    public final void mo92510a(Throwable th) {
        C89219l.m154721d(th, "");
        C56244a.m102187a("ContactListViewModel onLoadError", th);
        mo20662a(C55607g.f126848a);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.AbstractC55815d
    /* renamed from: b */
    public final void mo92514b(Throwable th) {
        C89219l.m154721d(th, "");
        C56244a.m102187a("ContactListViewModel onSearchError", th);
        mo20662a(C55609i.f126850a);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55764d
    /* renamed from: c */
    public final void mo92517c(Throwable th) {
        C89219l.m154721d(th, "");
        C89219l.m154721d(th, "");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.ContactListViewModel$f */
    public static final class C55606f extends AbstractC89220m implements AbstractC89172b<C55619b, C55619b> {

        /* renamed from: a */
        final /* synthetic */ IMUser f126847a;

        static {
            Covode.recordClassIndex(65385);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55606f(IMUser iMUser) {
            super(1);
            this.f126847a = iMUser;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C55619b invoke(C55619b bVar) {
            C55619b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return C55619b.m101312a(bVar2, null, new C12776a(this.f126847a), null, 5);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.ContactListViewModel$g */
    static final class C55607g extends AbstractC89220m implements AbstractC89172b<C55619b, C55619b> {

        /* renamed from: a */
        public static final C55607g f126848a = new C55607g();

        static {
            Covode.recordClassIndex(65386);
        }

        C55607g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C55619b invoke(C55619b bVar) {
            C55619b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return C55619b.m101312a(bVar2, new C12776a(C89086z.INSTANCE), null, null, 6);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.ContactListViewModel$h */
    static final class C55608h extends AbstractC89220m implements AbstractC89172b<C55619b, C55619b> {

        /* renamed from: a */
        final /* synthetic */ List f126849a;

        static {
            Covode.recordClassIndex(65387);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55608h(List list) {
            super(1);
            this.f126849a = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C55619b invoke(C55619b bVar) {
            C55619b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return C55619b.m101312a(bVar2, new C12776a(this.f126849a), null, null, 6);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.ContactListViewModel$i */
    static final class C55609i extends AbstractC89220m implements AbstractC89172b<C55619b, C55619b> {

        /* renamed from: a */
        public static final C55609i f126850a = new C55609i();

        static {
            Covode.recordClassIndex(65388);
        }

        C55609i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C55619b invoke(C55619b bVar) {
            C55619b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return C55619b.m101312a(bVar2, null, null, new C89378p(C89086z.INSTANCE, ""), 3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.ContactListViewModel$j */
    static final class C55610j extends AbstractC89220m implements AbstractC89172b<C55619b, C55619b> {

        /* renamed from: a */
        final /* synthetic */ List f126851a;

        /* renamed from: b */
        final /* synthetic */ String f126852b;

        static {
            Covode.recordClassIndex(65389);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55610j(List list, String str) {
            super(1);
            this.f126851a = list;
            this.f126852b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C55619b invoke(C55619b bVar) {
            C55619b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return C55619b.m101312a(bVar2, null, null, new C89378p(C89070n.m154544a((Iterable<?>) this.f126851a, IMUser.class), this.f126852b), 3);
        }
    }

    /* renamed from: b */
    public final boolean mo92516b(IMUser iMUser) {
        C89219l.m154721d(iMUser, "");
        return m101284o().contains(iMUser);
    }

    /* renamed from: a */
    public final boolean mo92513a(IMUser iMUser) {
        C89219l.m154721d(iMUser, "");
        if (mo92518i().contains(iMUser) || m101284o().contains(iMUser)) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.AbstractC55815d
    /* renamed from: a */
    public final void mo92511a(List<IMContact> list, String str) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(str, "");
        mo20662a(new C55610j(list, str));
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55764d
    /* renamed from: b */
    public final void mo92515b(List<IMContact> list, boolean z) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list, "");
    }

    /* renamed from: a */
    public final void mo92509a(IMUser iMUser, boolean z) {
        C89219l.m154721d(iMUser, "");
        if (!this.f126835k && z != mo92518i().contains(iMUser)) {
            if (z) {
                mo92518i().add(iMUser);
                m101285p();
            } else {
                mo92518i().remove(iMUser);
            }
            mo20662a(new C55606f(iMUser));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55764d
    /* renamed from: a */
    public final void mo92512a(List<IMContact> list, boolean z) {
        C89219l.m154721d(list, "");
        List<IMUser> a = C89070n.m154544a((Iterable<?>) list, IMUser.class);
        for (IMUser iMUser : a) {
            iMUser.setInitialLetter(C55718b.m101466a(iMUser.getDisplayName()));
        }
        mo20662a(new C55608h(C89070n.m154553a((Iterable) a, (Comparator) this.f126841r)));
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.ContactListViewModel$c */
    static final class C55603c<T> implements Comparator {

        /* renamed from: a */
        public static final C55603c f126844a = new C55603c();

        static {
            Covode.recordClassIndex(65382);
        }

        C55603c() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            boolean z;
            IMUser iMUser = (IMUser) obj;
            IMUser iMUser2 = (IMUser) obj2;
            C89219l.m154716b(iMUser, "");
            String initialLetter = iMUser.getInitialLetter();
            C89219l.m154716b(initialLetter, "");
            Character j = C89361p.m154826j((CharSequence) initialLetter);
            boolean z2 = false;
            if (j != null) {
                z = Character.isLetter(j.charValue());
            } else {
                z = false;
            }
            C89219l.m154716b(iMUser2, "");
            String initialLetter2 = iMUser2.getInitialLetter();
            C89219l.m154716b(initialLetter2, "");
            Character j2 = C89361p.m154826j((CharSequence) initialLetter2);
            if (j2 != null) {
                z2 = Character.isLetter(j2.charValue());
            }
            if (z) {
                if (!z2) {
                    return -1;
                }
            } else if (z2) {
                return 1;
            }
            if (C89219l.m154714a((Object) iMUser.getInitialLetter(), (Object) iMUser2.getInitialLetter())) {
                String displayName = iMUser.getDisplayName();
                C89219l.m154716b(displayName, "");
                Locale locale = Locale.ROOT;
                C89219l.m154716b(locale, "");
                Objects.requireNonNull(displayName, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = displayName.toLowerCase(locale);
                C89219l.m154716b(lowerCase, "");
                String displayName2 = iMUser2.getDisplayName();
                C89219l.m154716b(displayName2, "");
                Locale locale2 = Locale.ROOT;
                C89219l.m154716b(locale2, "");
                Objects.requireNonNull(displayName2, "null cannot be cast to non-null type java.lang.String");
                String lowerCase2 = displayName2.toLowerCase(locale2);
                C89219l.m154716b(lowerCase2, "");
                return lowerCase.compareTo(lowerCase2);
            }
            String initialLetter3 = iMUser.getInitialLetter();
            String initialLetter4 = iMUser2.getInitialLetter();
            C89219l.m154716b(initialLetter4, "");
            return initialLetter3.compareTo(initialLetter4);
        }
    }
}
