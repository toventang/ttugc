package com.p2082ss.android.ugc.aweme.homepage.story.sidebar;

import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.C14515a;
import com.bytedance.ies.powerlist.page.AbstractC17700f;
import com.p2082ss.android.ugc.aweme.detail.p2755vm.BaseDetailShareVM;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.homepage.story.IHomepageStoryApi;
import com.p2082ss.android.ugc.aweme.homepage.story.p3054c.C53031b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.api.AbstractC76443a;
import com.p2082ss.android.ugc.aweme.story.p4055i.C77283a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89110d;
import p4600h.p4603c.p4605b.p4606a.C89108b;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarListVM */
public final class StorySidebarListVM extends BaseDetailShareVM<C53297m, C53296l, Long> implements AbstractC76443a {

    /* renamed from: p */
    public static final C53205a f122235p = new C53205a((byte) 0);

    /* renamed from: m */
    long f122236m;

    /* renamed from: n */
    public StorySidebarListCell f122237n;

    /* renamed from: o */
    public final Set<String> f122238o = new LinkedHashSet();

    /* renamed from: q */
    private List<Long> f122239q = C89086z.INSTANCE;

    /* renamed from: r */
    private List<? extends Aweme> f122240r = C89086z.INSTANCE;

    /* renamed from: s */
    private final Set<String> f122241s = new HashSet();

    /* renamed from: t */
    private boolean f122242t;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarListVM$d */
    public static final class C53208d extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f122245a;

        /* renamed from: b */
        int f122246b;

        /* renamed from: c */
        final /* synthetic */ StorySidebarListVM f122247c;

        /* renamed from: d */
        Object f122248d;

        /* renamed from: e */
        Object f122249e;

        static {
            Covode.recordClassIndex(62758);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53208d(StorySidebarListVM storySidebarListVM, AbstractC89124d dVar) {
            super(dVar);
            this.f122247c = storySidebarListVM;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f122245a = obj;
            this.f122246b |= Integer.MIN_VALUE;
            return this.f122247c.mo89684a(0, this);
        }
    }

    static {
        Covode.recordClassIndex(62754);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2755vm.BaseDetailShareVM
    /* renamed from: a */
    public final int mo70711a(String str) {
        C89219l.m154721d(str, "");
        return -1;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa
    public final int getPageType(int i) {
        return 40;
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarListVM$a */
    public static final class C53205a {
        static {
            Covode.recordClassIndex(62755);
        }

        private C53205a() {
        }

        public /* synthetic */ C53205a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ AbstractC12853j mo20674f() {
        return new C53297m();
    }

    /* renamed from: j */
    public final boolean mo89688j() {
        if (this.f122236m < ((long) this.f122239q.size())) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private final List<String> m98200k() {
        int i = (int) this.f122236m;
        List<Long> subList = this.f122239q.subList(i, Math.min(IHomepageStoryApi.C52994a.f121861a + i, this.f122239q.size()));
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) subList, 10));
        Iterator<T> it = subList.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().longValue()));
        }
        return arrayList;
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarListVM$c */
    static final class C53207c extends AbstractC89220m implements AbstractC89172b<C53297m, C53297m> {

        /* renamed from: a */
        final /* synthetic */ int f122244a;

        static {
            Covode.recordClassIndex(62757);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53207c(int i) {
            super(1);
            this.f122244a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C53297m invoke(C53297m mVar) {
            C53297m mVar2 = mVar;
            C89219l.m154721d(mVar2, "");
            return C53297m.m98245a(mVar2, null, null, this.f122244a, 3);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2755vm.BaseDetailShareVM
    /* renamed from: a */
    public final /* synthetic */ Long mo70712a(C49812b bVar) {
        C89219l.m154721d(bVar, "");
        return Long.valueOf(this.f122236m);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2755vm.BaseDetailShareVM
    /* renamed from: b */
    public final /* synthetic */ Aweme mo70713b(C53296l lVar) {
        C53296l lVar2 = lVar;
        C89219l.m154721d(lVar2, "");
        return lVar2.f122331a;
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarListVM$b */
    static final class C53206b extends AbstractC89220m implements AbstractC89172b<C53297m, C53297m> {

        /* renamed from: a */
        final /* synthetic */ C14515a f122243a;

        static {
            Covode.recordClassIndex(62756);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53206b(C14515a aVar) {
            super(1);
            this.f122243a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C53297m invoke(C53297m mVar) {
            C53297m mVar2 = mVar;
            C89219l.m154721d(mVar2, "");
            return C53297m.m98245a(mVar2, this.f122243a, null, 0, 6);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarListVM$e */
    public static final class C53209e extends AbstractC89220m implements AbstractC89172b<C53297m, C53297m> {

        /* renamed from: a */
        final /* synthetic */ List f122250a;

        static {
            Covode.recordClassIndex(62759);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53209e(List list) {
            super(1);
            this.f122250a = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C53297m invoke(C53297m mVar) {
            C53297m mVar2 = mVar;
            C89219l.m154721d(mVar2, "");
            return C53297m.m98245a(mVar2, null, new C12776a(Integer.valueOf(this.f122250a.size())), 0, 5);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarListVM$f */
    static final class C53210f extends AbstractC89220m implements AbstractC89172b<C53297m, C53297m> {

        /* renamed from: a */
        final /* synthetic */ List f122251a;

        static {
            Covode.recordClassIndex(62760);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53210f(List list) {
            super(1);
            this.f122251a = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C53297m invoke(C53297m mVar) {
            int i;
            C53297m mVar2 = mVar;
            C89219l.m154721d(mVar2, "");
            List<ITEM> list = mVar2.f122332a.f35099d;
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            return C53297m.m98245a(mVar2, null, new C12776a(Integer.valueOf(this.f122251a.size() - i)), 0, 5);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.api.AbstractC76443a
    /* renamed from: b */
    public final void mo89687b(int i) {
        mo20662a((AbstractC89172b) new C53207c(i));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* renamed from: a */
    public final Object mo23330a(AbstractC89124d<? super AbstractC17700f<Long>> dVar) {
        this.f122241s.clear();
        List<C53296l> a = m98198a(this.f122240r);
        C77283a.m135111b("SidebarListVM", "onRefresh, preload list size: " + this.f122240r.size() + ", actual size: " + a.size() + ", next cursor: " + this.f122236m);
        if (!mo89688j()) {
            return AbstractC17700f.C17701a.m32838a(a);
        }
        if (a.isEmpty()) {
            return mo89684a(this.f122236m, dVar);
        }
        mo20662a((AbstractC89172b) new C53210f(a));
        return AbstractC17700f.C17701a.m32841a(null, C89108b.m154611a(this.f122236m), a, 1);
    }

    /* renamed from: a */
    private final List<C53296l> m98198a(List<? extends Aweme> list) {
        String str;
        String uid;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (!C53031b.m97956a((Aweme) t)) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            User author = ((Aweme) obj).getAuthor();
            if (!(author == null || (uid = author.getUid()) == null || uid.length() == 0 || this.f122241s.contains(uid))) {
                arrayList2.add(obj);
            }
        }
        ArrayList<Aweme> arrayList3 = arrayList2;
        ArrayList arrayList4 = new ArrayList(C89070n.m154526a((Iterable) arrayList3, 10));
        for (Aweme aweme : arrayList3) {
            Set<String> set = this.f122241s;
            User author2 = aweme.getAuthor();
            if (author2 == null || (str = author2.getUid()) == null) {
                str = "";
            }
            set.add(str);
            arrayList4.add(new C53296l(aweme));
        }
        return arrayList4;
    }

    /* renamed from: a */
    public final void mo89685a(float f) {
        if (((double) f) < 0.9d) {
            this.f122242t = false;
            StorySidebarListCell storySidebarListCell = this.f122237n;
            if (storySidebarListCell != null) {
                storySidebarListCell.onAnimateUpdate(f);
            }
        } else if (!this.f122242t) {
            this.f122242t = true;
            StorySidebarListCell storySidebarListCell2 = this.f122237n;
            if (storySidebarListCell2 != null) {
                storySidebarListCell2.onAnimateFinish();
            }
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* renamed from: a */
    public final void mo23334a(C14515a<C53296l> aVar) {
        C89219l.m154721d(aVar, "");
        mo20662a((AbstractC89172b) new C53206b(aVar));
    }

    /* renamed from: b */
    private void m98199b(List<Long> list, List<? extends Aweme> list2) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        this.f122236m = (long) list2.size();
        this.f122240r = list2;
        this.f122239q = list;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* renamed from: a */
    public final /* synthetic */ Object mo23331a(Object obj, AbstractC89124d dVar) {
        return mo89684a(((Number) obj).longValue(), dVar);
    }

    /* renamed from: a */
    private final AbstractC17700f<Long> m98197a(int i, List<C53296l> list) {
        this.f122236m += (long) i;
        mo20662a((AbstractC89172b) new C53209e(list));
        if (mo89688j()) {
            return AbstractC17700f.C17701a.m32841a(null, Long.valueOf(this.f122236m), list, 1);
        }
        C77283a.m135111b("SidebarListVM", "on loadmore complete");
        return AbstractC17700f.C17701a.m32838a(list);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0090 A[Catch:{ Exception -> 0x00c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo89684a(long r8, p4600h.p4603c.AbstractC89124d<? super com.bytedance.ies.powerlist.page.AbstractC17700f<java.lang.Long>> r10) {
        /*
        // Method dump skipped, instructions count: 248
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarListVM.mo89684a(long, h.c.d):java.lang.Object");
    }

    /* renamed from: a */
    public final void mo89686a(List<Long> list, List<? extends Aweme> list2) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        m98199b(list, list2);
        mo23342g();
        C77283a.m135111b("SidebarListVM", "manually refresh called with uidList size: " + list.size() + ", cache size: " + list2.size());
    }
}
