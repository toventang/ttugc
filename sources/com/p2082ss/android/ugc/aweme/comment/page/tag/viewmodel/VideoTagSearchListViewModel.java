package com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel;

import android.text.TextUtils;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.C14515a;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.ies.powerlist.page.AbstractC17700f;
import com.p2082ss.android.ugc.aweme.comment.page.tag.VideoTagPage;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.search.service.ISearchUserService;
import com.p2082ss.android.ugc.aweme.search.service.SearchUserService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.p4601a.C89086z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagSearchListViewModel */
public final class VideoTagSearchListViewModel extends AssemListViewModel<C36942c, AbstractC17641a, Boolean> {

    /* renamed from: o */
    public static final C36934b f86957o = new C36934b((byte) 0);

    /* renamed from: k */
    public List<? extends IMUser> f86958k = C89086z.INSTANCE;

    /* renamed from: l */
    public List<? extends AbstractC17641a> f86959l = C89086z.INSTANCE;

    /* renamed from: m */
    public String f86960m = "";

    /* renamed from: n */
    public final Set<String> f86961n = new LinkedHashSet();

    /* renamed from: p */
    private final C12786i f86962p = new C12786i(true, new C36933a(this, null));

    /* renamed from: q */
    private final AbstractC89244h f86963q = C89250i.m154773a((AbstractC89171a) C36939g.f86975a);

    /* renamed from: r */
    private final AbstractC89244h f86964r = C89250i.m154773a((AbstractC89171a) C36936d.f86970a);

    /* renamed from: s */
    private final AbstractC89244h f86965s = C89250i.m154773a((AbstractC89171a) C36935c.f86969a);

    /* renamed from: t */
    private int f86966t;

    static {
        Covode.recordClassIndex(44274);
    }

    /* renamed from: k */
    private final VideoTagPage.C36641b m74544k() {
        return (VideoTagPage.C36641b) this.f86962p.getValue();
    }

    /* renamed from: l */
    private final HashSet<String> m74545l() {
        return (HashSet) this.f86965s.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagSearchListViewModel$b */
    public static final class C36934b {
        static {
            Covode.recordClassIndex(44276);
        }

        private C36934b() {
        }

        public /* synthetic */ C36934b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagSearchListViewModel$c */
    static final class C36935c extends AbstractC89220m implements AbstractC89171a<HashSet<String>> {

        /* renamed from: a */
        public static final C36935c f86969a = new C36935c();

        static {
            Covode.recordClassIndex(44277);
        }

        C36935c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashSet<String> invoke() {
            return new HashSet();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagSearchListViewModel$d */
    static final class C36936d extends AbstractC89220m implements AbstractC89171a<IIMService> {

        /* renamed from: a */
        public static final C36936d f86970a = new C36936d();

        static {
            Covode.recordClassIndex(44278);
        }

        C36936d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IIMService invoke() {
            return IMService.createIIMServicebyMonsterPlugin(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagSearchListViewModel$g */
    static final class C36939g extends AbstractC89220m implements AbstractC89171a<ISearchUserService> {

        /* renamed from: a */
        public static final C36939g f86975a = new C36939g();

        static {
            Covode.recordClassIndex(44281);
        }

        C36939g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ISearchUserService invoke() {
            return SearchUserService.m119898b();
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ AbstractC12853j mo20674f() {
        return new C36942c(new C89378p(C89086z.INSTANCE, ""));
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagSearchListViewModel$a */
    public static final class C36933a extends AbstractC89220m implements AbstractC89171a<VideoTagPage.C36641b> {

        /* renamed from: a */
        final /* synthetic */ AssemViewModel f86967a;

        /* renamed from: b */
        final /* synthetic */ String f86968b;

        static {
            Covode.recordClassIndex(44275);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36933a(AssemViewModel assemViewModel, String str) {
            super(0);
            this.f86967a = assemViewModel;
            this.f86968b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.ss.android.ugc.aweme.comment.page.tag.VideoTagPage$b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.comment.page.tag.VideoTagPage.C36641b invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.f86967a
                com.bytedance.assem.arch.core.d r2 = r0.f31150d
                if (r2 == 0) goto L_0x000f
                java.lang.Class<com.ss.android.ugc.aweme.comment.page.tag.VideoTagPage$b> r1 = com.p2082ss.android.ugc.aweme.comment.page.tag.VideoTagPage.C36641b.class
                java.lang.String r0 = r3.f86968b
                java.lang.Object r0 = r2.mo20606b(r1, r0)
                return r0
            L_0x000f:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagSearchListViewModel.C36933a.invoke():java.lang.Object");
        }
    }

    /* renamed from: j */
    public final VideoTagPage.C36641b mo64395j() {
        VideoTagPage.C36641b k = m74544k();
        if (k == null) {
            return new VideoTagPage.C36641b(null, null, 0, null, 15, null);
        }
        return k;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagSearchListViewModel$e */
    static final class C36937e extends AbstractC89220m implements AbstractC89172b<C36942c, C36942c> {

        /* renamed from: a */
        final /* synthetic */ C14515a f86971a;

        static {
            Covode.recordClassIndex(44279);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36937e(C14515a aVar) {
            super(1);
            this.f86971a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C36942c invoke(C36942c cVar) {
            C36942c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            return C36942c.m74552a(cVar2, null, this.f86971a, 1);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* renamed from: a */
    public final Object mo23330a(AbstractC89124d<? super AbstractC17700f<Boolean>> dVar) {
        m74545l().clear();
        return m74542a(true);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagSearchListViewModel$f */
    static final class C36938f extends AbstractC89220m implements AbstractC89172b<C36942c, C36942c> {

        /* renamed from: a */
        final /* synthetic */ List f86972a;

        /* renamed from: b */
        final /* synthetic */ VideoTagSearchListViewModel f86973b;

        /* renamed from: c */
        final /* synthetic */ String f86974c;

        static {
            Covode.recordClassIndex(44280);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36938f(List list, VideoTagSearchListViewModel videoTagSearchListViewModel, String str) {
            super(1);
            this.f86972a = list;
            this.f86973b = videoTagSearchListViewModel;
            this.f86974c = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C36942c invoke(C36942c cVar) {
            C36942c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            return C36942c.m74552a(cVar2, new C89378p(this.f86972a, this.f86974c), null, 2);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* renamed from: a */
    public final void mo23334a(C14515a<AbstractC17641a> aVar) {
        C89219l.m154721d(aVar, "");
        mo20662a((AbstractC89172b) new C36937e(aVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.bytedance.ies.powerlist.page.AbstractC17700f<java.lang.Boolean> m74542a(boolean r14) {
        /*
        // Method dump skipped, instructions count: 366
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagSearchListViewModel.m74542a(boolean):com.bytedance.ies.powerlist.page.f");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, h.c.d] */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* renamed from: a */
    public final /* synthetic */ Object mo23331a(Boolean bool, AbstractC89124d<? super AbstractC17700f<Boolean>> dVar) {
        bool.booleanValue();
        return m74542a(false);
    }

    /* renamed from: a */
    private static boolean m74543a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Locale locale = Locale.getDefault();
        C89219l.m154716b(locale, "");
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = str.toLowerCase(locale);
        C89219l.m154716b(lowerCase, "");
        if (C89361p.m154929e((CharSequence) lowerCase, (CharSequence) str2)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo64394a(String str, List<? extends IMUser> list) {
        List<IMUser> list2;
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        this.f86960m = str;
        IIMService iIMService = (IIMService) this.f86964r.getValue();
        if (iIMService == null || (list2 = iIMService.searchFollowIMUser(list, str)) == null) {
            list2 = C89086z.INSTANCE;
        } else {
            Locale locale = Locale.getDefault();
            C89219l.m154716b(locale, "");
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = str.toLowerCase(locale);
            C89219l.m154716b(lowerCase, "");
            for (T t : list) {
                String uniqueId = t.getUniqueId();
                if (uniqueId == null || uniqueId.length() == 0) {
                    String nickName = t.getNickName();
                    C89219l.m154716b(nickName, "");
                    if (m74543a(nickName, lowerCase)) {
                        t.setSearchType(1);
                        list2.add(t);
                    }
                } else {
                    String uniqueId2 = t.getUniqueId();
                    C89219l.m154716b(uniqueId2, "");
                    if (m74543a(uniqueId2, lowerCase)) {
                        t.setSearchType(1);
                        list2.add(t);
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t2 : list2) {
            if (hashSet.add(t2.getUid())) {
                arrayList.add(t2);
            }
        }
        this.f86958k = arrayList;
        mo20662a((AbstractC89172b) new C36938f(arrayList, this, str));
    }
}
