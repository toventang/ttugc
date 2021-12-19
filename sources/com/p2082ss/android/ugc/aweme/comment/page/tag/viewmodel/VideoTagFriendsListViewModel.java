package com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel;

import android.text.TextUtils;
import com.C1764a;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.p794a.AbstractC12644a;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.comment.page.tag.VideoTagPage;
import com.p2082ss.android.ugc.aweme.comment.page.tag.api.AbstractC36857g;
import com.p2082ss.android.ugc.aweme.comment.page.tag.api.C36852b;
import com.p2082ss.android.ugc.aweme.comment.page.tag.api.C36853c;
import com.p2082ss.android.ugc.aweme.comment.page.tag.api.C36854d;
import com.p2082ss.android.ugc.aweme.comment.page.tag.api.EnumC36851a;
import com.p2082ss.android.ugc.aweme.comment.page.tag.api.EnumC36856f;
import com.p2082ss.android.ugc.aweme.comment.page.tag.api.VideoTagApi;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel */
public final class VideoTagFriendsListViewModel extends AssemViewModel<C36943d> {

    /* renamed from: q */
    public static final C36906b f86914q = new C36906b((byte) 0);

    /* renamed from: j */
    public final IMUser f86915j;

    /* renamed from: k */
    public boolean f86916k;

    /* renamed from: l */
    public List<String> f86917l;

    /* renamed from: m */
    public final HashMap<Integer, Set<String>> f86918m;

    /* renamed from: n */
    public C36940a f86919n;

    /* renamed from: o */
    public final Set<String> f86920o;

    /* renamed from: p */
    public final AbstractC12644a<AbstractC36857g> f86921p;

    /* renamed from: r */
    private final C12786i f86922r = new C12786i(true, new C36905a(this, null));

    /* renamed from: s */
    private final AbstractC89244h f86923s = C89250i.m154773a((AbstractC89171a) new C36921m(this));

    /* renamed from: t */
    private final AbstractC89244h f86924t = C89250i.m154773a((AbstractC89171a) new C36927q(this));

    /* renamed from: u */
    private final AbstractC89244h f86925u;

    /* renamed from: v */
    private final AbstractC89244h f86926v;

    /* renamed from: w */
    private final AbstractC89244h f86927w;

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel$o */
    public static final class C36923o<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C36923o f86947a = new C36923o();

        static {
            Covode.recordClassIndex(44264);
        }

        C36923o() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(44245);
    }

    /* renamed from: n */
    private final VideoTagPage.C36641b m74525n() {
        return (VideoTagPage.C36641b) this.f86922r.getValue();
    }

    /* renamed from: o */
    private boolean m74526o() {
        return ((Boolean) this.f86926v.getValue()).booleanValue();
    }

    /* renamed from: h */
    public final int mo23343h() {
        return ((Number) this.f86923s.getValue()).intValue();
    }

    /* renamed from: i */
    public final LinkedHashSet<IMUser> mo64388i() {
        return (LinkedHashSet) this.f86924t.getValue();
    }

    /* renamed from: j */
    public final boolean mo64389j() {
        return ((Boolean) this.f86925u.getValue()).booleanValue();
    }

    /* renamed from: k */
    public final IIMService mo64390k() {
        return (IIMService) this.f86927w.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel$b */
    public static final class C36906b {
        static {
            Covode.recordClassIndex(44247);
        }

        private C36906b() {
        }

        public /* synthetic */ C36906b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel$c */
    static final class C36907c extends AbstractC89220m implements AbstractC89171a<IIMService> {

        /* renamed from: a */
        public static final C36907c f86930a = new C36907c();

        static {
            Covode.recordClassIndex(44248);
        }

        C36907c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IIMService invoke() {
            return IMService.createIIMServicebyMonsterPlugin(false);
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ C36943d mo20674f() {
        return new C36943d();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel$d */
    static final class C36908d extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ VideoTagFriendsListViewModel f86931a;

        static {
            Covode.recordClassIndex(44249);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36908d(VideoTagFriendsListViewModel videoTagFriendsListViewModel) {
            super(0);
            this.f86931a = videoTagFriendsListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(this.f86931a.f86915j.isSecret());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel$e */
    static final class C36909e extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C36909e f86932a = new C36909e();

        static {
            Covode.recordClassIndex(44250);
        }

        C36909e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C58071d.m104909c());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel$m */
    static final class C36921m extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ VideoTagFriendsListViewModel f86945a;

        static {
            Covode.recordClassIndex(44262);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36921m(VideoTagFriendsListViewModel videoTagFriendsListViewModel) {
            super(0);
            this.f86945a = videoTagFriendsListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(this.f86945a.mo23342g().getPermission());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel$q */
    static final class C36927q extends AbstractC89220m implements AbstractC89171a<LinkedHashSet<IMUser>> {

        /* renamed from: a */
        final /* synthetic */ VideoTagFriendsListViewModel f86951a;

        static {
            Covode.recordClassIndex(44268);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36927q(VideoTagFriendsListViewModel videoTagFriendsListViewModel) {
            super(0);
            this.f86951a = videoTagFriendsListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LinkedHashSet<IMUser> invoke() {
            return new LinkedHashSet(this.f86951a.mo23342g().getTagged());
        }
    }

    /* renamed from: m */
    public final boolean mo64392m() {
        if (mo64388i().size() >= 15) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel$a */
    public static final class C36905a extends AbstractC89220m implements AbstractC89171a<VideoTagPage.C36641b> {

        /* renamed from: a */
        final /* synthetic */ AssemViewModel f86928a;

        /* renamed from: b */
        final /* synthetic */ String f86929b;

        static {
            Covode.recordClassIndex(44246);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36905a(AssemViewModel assemViewModel, String str) {
            super(0);
            this.f86928a = assemViewModel;
            this.f86929b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.ss.android.ugc.aweme.comment.page.tag.VideoTagPage$b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.comment.page.tag.VideoTagPage.C36641b invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.f86928a
                com.bytedance.assem.arch.core.d r2 = r0.f31150d
                if (r2 == 0) goto L_0x000f
                java.lang.Class<com.ss.android.ugc.aweme.comment.page.tag.VideoTagPage$b> r1 = com.p2082ss.android.ugc.aweme.comment.page.tag.VideoTagPage.C36641b.class
                java.lang.String r0 = r3.f86929b
                java.lang.Object r0 = r2.mo20606b(r1, r0)
                return r0
            L_0x000f:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel.C36905a.invoke():java.lang.Object");
        }
    }

    /* renamed from: g */
    public final VideoTagPage.C36641b mo23342g() {
        VideoTagPage.C36641b n = m74525n();
        if (n == null) {
            return new VideoTagPage.C36641b(null, null, 0, null, 15, null);
        }
        return n;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel$f */
    public static final class CallableC36910f<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ VideoTagFriendsListViewModel f86933a;

        static {
            Covode.recordClassIndex(44251);
        }

        public CallableC36910f(VideoTagFriendsListViewModel videoTagFriendsListViewModel) {
            this.f86933a = videoTagFriendsListViewModel;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: java.util.HashMap */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: private */
        /* renamed from: a */
        public C36940a call() {
            Iterable<IMUser> iterable;
            IIMService k;
            List<IMUser> recentIMUsers;
            long j;
            List<IMUser> allFollowIMUsers;
            IIMService k2 = this.f86933a.mo64390k();
            if (k2 == null || (allFollowIMUsers = k2.getAllFollowIMUsers()) == null) {
                iterable = C89086z.INSTANCE;
            } else {
                ArrayList arrayList = new ArrayList();
                for (T t : allFollowIMUsers) {
                    if (!C89219l.m154714a((Object) t.getUid(), (Object) this.f86933a.f86915j.getUid())) {
                        arrayList.add(t);
                    }
                }
                iterable = C89070n.m154585g((Collection) arrayList);
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                T t2 = VideoTagApi.C36850a.m74491a().mentionRecentContactQuery(EnumC36856f.VIDEO_TAG.getType(), 0, false).execute().f52262b;
                C89219l.m154716b(t2, "");
                T t3 = t2;
                HashMap hashMap = new HashMap();
                ArrayList<C36853c> arrayList3 = t3.f86841b;
                if (arrayList3 != null) {
                    for (T t4 : arrayList3) {
                        ArrayList<C36854d> tagUpdateStatus = t4.getTagUpdateStatus();
                        if (tagUpdateStatus != null) {
                            for (T t5 : tagUpdateStatus) {
                                if (t5.getMentionType() == EnumC36856f.VIDEO_TAG.getType()) {
                                    hashMap.put(String.valueOf(t4.getUid()), Long.valueOf((long) t5.getBlockType()));
                                }
                            }
                        }
                    }
                }
                ArrayList<User> arrayList4 = t3.f86840a;
                if (arrayList4 != null) {
                    for (T t6 : arrayList4) {
                        if (arrayList2.size() < 10) {
                            IMUser fromUser = IMUser.fromUser(t6);
                            Long l = (Long) hashMap.get(fromUser.getUid());
                            if (l != null) {
                                j = l.longValue();
                            } else {
                                j = 0;
                            }
                            fromUser.setVideoTagBlockStatus(j);
                            C89219l.m154716b(fromUser, "");
                            arrayList2.add(fromUser);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (!(arrayList2.size() >= 10 || (k = this.f86933a.mo64390k()) == null || (recentIMUsers = k.getRecentIMUsers()) == null)) {
                for (T t7 : recentIMUsers) {
                    if (arrayList2.size() < 10 && !arrayList2.contains(t7) && (!C89219l.m154714a((Object) t7.getUid(), (Object) this.f86933a.f86915j.getUid()))) {
                        arrayList2.add(t7);
                    }
                }
            }
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            for (IMUser iMUser : iterable) {
                if (!arrayList2.contains(iMUser)) {
                    if (iMUser.getFollowStatus() == 2) {
                        arrayList5.add(iMUser);
                    } else {
                        arrayList6.add(iMUser);
                    }
                }
            }
            ArrayList arrayList7 = new ArrayList();
            arrayList7.addAll(arrayList2);
            arrayList7.addAll(arrayList5);
            arrayList7.addAll(arrayList6);
            this.f86933a.f86919n = new C36940a(arrayList2, arrayList5, arrayList6, arrayList7);
            return this.f86933a.f86919n;
        }
    }

    /* renamed from: l */
    public final void mo64391l() {
        long j;
        String aid;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (C13603b.m24435a((Collection) mo23342g().getTagged())) {
            for (T t : mo64388i()) {
                if (!TextUtils.isEmpty(t.getUid())) {
                    String uid = t.getUid();
                    C89219l.m154716b(uid, "");
                    arrayList.add(uid);
                }
            }
        } else if (C13603b.m24435a((Collection) mo64388i())) {
            for (T t2 : mo23342g().getTagged()) {
                if (!TextUtils.isEmpty(t2.getUid())) {
                    String uid2 = t2.getUid();
                    C89219l.m154716b(uid2, "");
                    arrayList2.add(uid2);
                }
            }
        } else {
            for (T t3 : mo23342g().getTagged()) {
                if (!mo64388i().contains(t3)) {
                    String uid3 = t3.getUid();
                    C89219l.m154716b(uid3, "");
                    arrayList2.add(uid3);
                }
            }
            for (T t4 : mo64388i()) {
                if (!mo23342g().getTagged().contains(t4)) {
                    String uid4 = t4.getUid();
                    C89219l.m154716b(uid4, "");
                    arrayList.add(uid4);
                }
            }
        }
        if (!C13603b.m24435a((Collection) arrayList) || !C13603b.m24435a((Collection) arrayList2)) {
            AbstractC36857g a = this.f86921p.mo20458a();
            String obj = arrayList.toString();
            String obj2 = arrayList2.toString();
            Aweme aweme = mo23342g().getAweme();
            if (aweme == null || (aid = aweme.getAid()) == null) {
                j = 0;
            } else {
                j = Long.parseLong(aid);
            }
            a.mo64355a(obj, obj2, j).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143254a(new C36929s(this), new C36931t(this));
            return;
        }
        mo20662a(C36928r.f86952a);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel$l */
    public static final class C36919l<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ VideoTagFriendsListViewModel f86943a;

        static {
            Covode.recordClassIndex(44260);
        }

        public C36919l(VideoTagFriendsListViewModel videoTagFriendsListViewModel) {
            this.f86943a = videoTagFriendsListViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f86943a.mo20662a(C369201.f86944a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel$s */
    public static final class C36929s<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ VideoTagFriendsListViewModel f86953a;

        static {
            Covode.recordClassIndex(44270);
        }

        C36929s(VideoTagFriendsListViewModel videoTagFriendsListViewModel) {
            this.f86953a = videoTagFriendsListViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f86953a.mo20662a(C369301.f86954a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel$t */
    public static final class C36931t<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ VideoTagFriendsListViewModel f86955a;

        static {
            Covode.recordClassIndex(44272);
        }

        C36931t(VideoTagFriendsListViewModel videoTagFriendsListViewModel) {
            this.f86955a = videoTagFriendsListViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f86955a.mo20662a(C369321.f86956a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel$k */
    public static final class C36915k<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ VideoTagFriendsListViewModel f86938a;

        /* renamed from: b */
        final /* synthetic */ boolean f86939b;

        static {
            Covode.recordClassIndex(44256);
        }

        public C36915k(VideoTagFriendsListViewModel videoTagFriendsListViewModel, boolean z) {
            this.f86938a = videoTagFriendsListViewModel;
            this.f86939b = z;
        }

        /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel$k$b */
        static final class C36917b extends AbstractC89220m implements AbstractC89172b<C36943d, C36943d> {

            /* renamed from: a */
            final /* synthetic */ String f86941a;

            static {
                Covode.recordClassIndex(44258);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C36917b(String str) {
                super(1);
                this.f86941a = str;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C36943d invoke(C36943d dVar) {
                C36943d dVar2 = dVar;
                C89219l.m154721d(dVar2, "");
                return C36943d.m74558a(dVar2, null, null, null, null, new C12776a(this.f86941a), 15);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel$k$c */
        static final class C36918c extends AbstractC89220m implements AbstractC89172b<C36943d, C36943d> {

            /* renamed from: a */
            public static final C36918c f86942a = new C36918c();

            static {
                Covode.recordClassIndex(44259);
            }

            C36918c() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C36943d invoke(C36943d dVar) {
                C36943d dVar2 = dVar;
                C89219l.m154721d(dVar2, "");
                return C36943d.m74558a(dVar2, null, null, null, new C12776a(EnumC36941b.CHECK_FAILED), null, 23);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel$k$a */
        static final class C36916a extends AbstractC89220m implements AbstractC89172b<C36943d, C36943d> {

            /* renamed from: a */
            final /* synthetic */ C36915k f86940a;

            static {
                Covode.recordClassIndex(44257);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C36916a(C36915k kVar) {
                super(1);
                this.f86940a = kVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C36943d invoke(C36943d dVar) {
                EnumC36941b bVar;
                C36943d dVar2 = dVar;
                C89219l.m154721d(dVar2, "");
                if (this.f86940a.f86939b) {
                    bVar = EnumC36941b.CHECK_SUCCEED;
                } else {
                    bVar = EnumC36941b.DONE_SUCCEED;
                }
                return C36943d.m74558a(dVar2, null, null, null, new C12776a(bVar), null, 23);
            }
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C36854d dVar;
            this.f86938a.f86916k = false;
            ArrayList<C36853c> arrayList = ((C36852b) obj).f86835a;
            if (arrayList == null || !(!C13603b.m24435a((Collection) arrayList))) {
                this.f86938a.mo20662a(C36918c.f86942a);
                return;
            }
            VideoTagFriendsListViewModel videoTagFriendsListViewModel = this.f86938a;
            HashMap hashMap = new HashMap();
            hashMap.put(Integer.valueOf(EnumC36851a.BLOCK_SELF_REMOVAL.getType()), new LinkedHashSet());
            hashMap.put(Integer.valueOf(EnumC36851a.BLOCK_RELATION.getType()), new LinkedHashSet());
            hashMap.put(Integer.valueOf(EnumC36851a.PRIVACY_SETTING.getType()), new LinkedHashSet());
            hashMap.put(Integer.valueOf(EnumC36851a.PASS.getType()), new LinkedHashSet());
            for (T t : arrayList) {
                ArrayList<C36854d> tagUpdateStatus = t.getTagUpdateStatus();
                if (!(tagUpdateStatus == null || (dVar = tagUpdateStatus.get(0)) == null)) {
                    int blockType = dVar.getBlockType();
                    Set set = (Set) hashMap.get(Integer.valueOf(blockType));
                    if (set != null) {
                        set.add(String.valueOf(t.getUid()));
                    }
                    Set<String> set2 = videoTagFriendsListViewModel.f86918m.get(Integer.valueOf(blockType));
                    if (set2 != null) {
                        set2.add(String.valueOf(t.getUid()));
                    }
                }
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet<T> linkedHashSet2 = new LinkedHashSet();
            Set set3 = (Set) hashMap.get(Integer.valueOf(EnumC36851a.BLOCK_SELF_REMOVAL.getType()));
            if (set3 != null) {
                for (T t2 : set3) {
                    LinkedHashSet<IMUser> i = videoTagFriendsListViewModel.mo64388i();
                    ArrayList arrayList2 = new ArrayList();
                    for (T t3 : i) {
                        if (C89219l.m154714a((Object) t3.getUid(), (Object) t2)) {
                            arrayList2.add(t3);
                        }
                    }
                    for (T t4 : arrayList2) {
                        linkedHashSet.add(videoTagFriendsListViewModel.mo64382a((IMUser) t4));
                        linkedHashSet2.add(t4);
                    }
                }
            }
            Set set4 = (Set) hashMap.get(Integer.valueOf(EnumC36851a.BLOCK_RELATION.getType()));
            String str = "";
            if (set4 != null) {
                for (T t5 : set4) {
                    LinkedHashSet<IMUser> i2 = videoTagFriendsListViewModel.mo64388i();
                    ArrayList arrayList3 = new ArrayList();
                    for (T t6 : i2) {
                        if (C89219l.m154714a((Object) t6.getUid(), (Object) t5)) {
                            arrayList3.add(t6);
                        }
                    }
                    for (T t7 : arrayList3) {
                        linkedHashSet.add(videoTagFriendsListViewModel.mo64382a((IMUser) t7));
                        C89219l.m154721d(t7, str);
                        videoTagFriendsListViewModel.mo64388i().remove(t7);
                        videoTagFriendsListViewModel.mo20662a(new C36911g(t7));
                    }
                }
            }
            Set set5 = (Set) hashMap.get(Integer.valueOf(EnumC36851a.PRIVACY_SETTING.getType()));
            if (set5 != null) {
                for (T t8 : set5) {
                    LinkedHashSet<IMUser> i3 = videoTagFriendsListViewModel.mo64388i();
                    ArrayList arrayList4 = new ArrayList();
                    for (T t9 : i3) {
                        if (C89219l.m154714a((Object) t9.getUid(), (Object) t8)) {
                            arrayList4.add(t9);
                        }
                    }
                    for (T t10 : arrayList4) {
                        linkedHashSet.add(videoTagFriendsListViewModel.mo64382a((IMUser) t10));
                        linkedHashSet2.add(t10);
                    }
                }
            }
            for (T t11 : linkedHashSet2) {
                videoTagFriendsListViewModel.mo64384a((IMUser) t11, false);
            }
            if (linkedHashSet.size() > 0) {
                String obj2 = linkedHashSet.toString();
                if (obj2.length() >= 2) {
                    String string = C17867d.m33078a().getString(R.string.g_f);
                    C89219l.m154716b(string, str);
                    Objects.requireNonNull(obj2, "null cannot be cast to non-null type java.lang.String");
                    String substring = obj2.substring(1, obj2.length() - 1);
                    C89219l.m154716b(substring, str);
                    String a = C1764a.m5928a(string, Arrays.copyOf(new Object[]{substring}, 1));
                    C89219l.m154716b(a, str);
                    str = a;
                }
            }
            if (TextUtils.isEmpty(str)) {
                VideoTagFriendsListViewModel.m74524a(0);
                this.f86938a.mo20662a(new C36916a(this));
                return;
            }
            VideoTagFriendsListViewModel.m74524a(1);
            this.f86938a.mo20662a(new C36917b(str));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel$g */
    static final class C36911g extends AbstractC89220m implements AbstractC89172b<C36943d, C36943d> {

        /* renamed from: a */
        final /* synthetic */ IMUser f86934a;

        static {
            Covode.recordClassIndex(44252);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36911g(IMUser iMUser) {
            super(1);
            this.f86934a = iMUser;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C36943d invoke(C36943d dVar) {
            C36943d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            return C36943d.m74558a(dVar2, null, null, new C12776a(this.f86934a), null, null, 27);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel$h */
    public static final class C36912h extends AbstractC89220m implements AbstractC89172b<C36943d, C36943d> {

        /* renamed from: a */
        final /* synthetic */ IMUser f86935a;

        static {
            Covode.recordClassIndex(44253);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36912h(IMUser iMUser) {
            super(1);
            this.f86935a = iMUser;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C36943d invoke(C36943d dVar) {
            C36943d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            return C36943d.m74558a(dVar2, null, new C12776a(this.f86935a), null, null, null, 29);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel$i */
    public static final class C36913i extends AbstractC89220m implements AbstractC89172b<C36943d, C36943d> {

        /* renamed from: a */
        public static final C36913i f86936a = new C36913i();

        static {
            Covode.recordClassIndex(44254);
        }

        C36913i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C36943d invoke(C36943d dVar) {
            C36943d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            return C36943d.m74558a(dVar2, null, null, null, new C12776a(EnumC36941b.CHECK_SKIPPED), null, 23);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel$r */
    public static final class C36928r extends AbstractC89220m implements AbstractC89172b<C36943d, C36943d> {

        /* renamed from: a */
        public static final C36928r f86952a = new C36928r();

        static {
            Covode.recordClassIndex(44269);
        }

        C36928r() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C36943d invoke(C36943d dVar) {
            C36943d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            return C36943d.m74558a(dVar2, null, null, null, new C12776a(EnumC36941b.DONE_SUCCEED), null, 23);
        }
    }

    /* renamed from: a */
    public static void m74524a(int i) {
        C39162r.m79460a("tag_block_check_result", new C33744d().mo59980a("has_blocked_account", i).f79943a);
    }

    /* renamed from: b */
    public final String mo64385b(IMUser iMUser) {
        C89219l.m154721d(iMUser, "");
        if (m74526o()) {
            String uniqueId = iMUser.getUniqueId();
            C89219l.m154716b(uniqueId, "");
            return uniqueId;
        }
        String nickName = iMUser.getNickName();
        C89219l.m154716b(nickName, "");
        return nickName;
    }

    /* renamed from: c */
    public final boolean mo64386c(IMUser iMUser) {
        C89219l.m154721d(iMUser, "");
        if (mo64388i().size() == 0 || !mo64388i().contains(iMUser)) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel$j */
    public static final class C36914j extends AbstractC89220m implements AbstractC89172b<C36943d, C36943d> {

        /* renamed from: a */
        final /* synthetic */ boolean f86937a;

        static {
            Covode.recordClassIndex(44255);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36914j(boolean z) {
            super(1);
            this.f86937a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C36943d invoke(C36943d dVar) {
            EnumC36941b bVar;
            C36943d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            if (this.f86937a) {
                bVar = EnumC36941b.CHECK_SUCCEED;
            } else {
                bVar = EnumC36941b.DONE_SUCCEED;
            }
            return C36943d.m74558a(dVar2, null, null, null, new C12776a(bVar), null, 23);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel$p */
    public static final class C36924p<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ VideoTagFriendsListViewModel f86948a;

        static {
            Covode.recordClassIndex(44265);
        }

        public C36924p(VideoTagFriendsListViewModel videoTagFriendsListViewModel) {
            this.f86948a = videoTagFriendsListViewModel;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(final C1731i iVar) {
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            C89219l.m154716b(iVar, "");
            if (!iVar.mo5539b() && !iVar.mo5544c()) {
                C89219l.m154716b(createIUserServicebyMonsterPlugin, "");
                if (createIUserServicebyMonsterPlugin.isLogin()) {
                    this.f86948a.mo20662a(new AbstractC89172b<C36943d, C36943d>() {
                        /* class com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel.C36924p.C369262 */

                        static {
                            Covode.recordClassIndex(44267);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                        public final /* synthetic */ C36943d invoke(C36943d dVar) {
                            C36943d dVar2 = dVar;
                            C89219l.m154721d(dVar2, "");
                            C1731i iVar = iVar;
                            C89219l.m154716b(iVar, "");
                            return C36943d.m74558a(dVar2, new C12776a(iVar.mo5545d()), null, null, null, null, 30);
                        }
                    });
                    return null;
                }
            }
            this.f86948a.mo20662a(C369251.f86949a);
            return null;
        }
    }

    /* renamed from: a */
    public final String mo64382a(IMUser iMUser) {
        C89219l.m154721d(iMUser, "");
        if (m74526o()) {
            String nickName = iMUser.getNickName();
            C89219l.m154716b(nickName, "");
            return nickName;
        }
        String uniqueId = iMUser.getUniqueId();
        C89219l.m154716b(uniqueId, "");
        return uniqueId;
    }

    /* renamed from: d */
    public final String mo64387d(IMUser iMUser) {
        List<IMUser> list;
        List<IMUser> list2;
        C36940a aVar = this.f86919n;
        List<IMUser> list3 = null;
        if (aVar != null) {
            list = aVar.f86976a;
        } else {
            list = null;
        }
        if (list.contains(iMUser)) {
            return "recent";
        }
        C36940a aVar2 = this.f86919n;
        if (aVar2 != null) {
            list2 = aVar2.f86977b;
        } else {
            list2 = null;
        }
        if (list2.contains(iMUser)) {
            return "friends";
        }
        C36940a aVar3 = this.f86919n;
        if (aVar3 != null) {
            list3 = aVar3.f86978c;
        }
        if (list3.contains(iMUser)) {
            return "following";
        }
        return "";
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel$n */
    public static final class C36922n<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ VideoTagFriendsListViewModel f86946a;

        static {
            Covode.recordClassIndex(44263);
        }

        public C36922n(VideoTagFriendsListViewModel videoTagFriendsListViewModel) {
            this.f86946a = videoTagFriendsListViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            ArrayList<C36853c> arrayList = ((C36852b) obj).f86835a;
            if (arrayList != null) {
                for (T t : arrayList) {
                    ArrayList<C36854d> tagUpdateStatus = t.getTagUpdateStatus();
                    if (tagUpdateStatus != null) {
                        for (T t2 : tagUpdateStatus) {
                            if (t2.getMentionType() == EnumC36856f.VIDEO_TAG.getType() && t2.getBlockType() == EnumC36851a.BLOCK_SELF_REMOVAL.getType()) {
                                this.f86946a.f86917l.add(String.valueOf(t.getUid()));
                            }
                        }
                    }
                }
            }
        }
    }

    public VideoTagFriendsListViewModel(AbstractC12644a<AbstractC36857g> aVar) {
        C89219l.m154721d(aVar, "");
        this.f86921p = aVar;
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        C89219l.m154716b(createIUserServicebyMonsterPlugin, "");
        IMUser fromUser = IMUser.fromUser(createIUserServicebyMonsterPlugin.getCurrentUser());
        C89219l.m154716b(fromUser, "");
        this.f86915j = fromUser;
        this.f86925u = C89250i.m154773a((AbstractC89171a) new C36908d(this));
        this.f86926v = C89250i.m154773a((AbstractC89171a) C36909e.f86932a);
        this.f86927w = C89250i.m154773a((AbstractC89171a) C36907c.f86930a);
        this.f86917l = new ArrayList();
        HashMap<Integer, Set<String>> hashMap = new HashMap<>();
        hashMap.put(Integer.valueOf(EnumC36851a.BLOCK_SELF_REMOVAL.getType()), new LinkedHashSet());
        hashMap.put(Integer.valueOf(EnumC36851a.BLOCK_RELATION.getType()), new LinkedHashSet());
        hashMap.put(Integer.valueOf(EnumC36851a.PRIVACY_SETTING.getType()), new LinkedHashSet());
        hashMap.put(Integer.valueOf(EnumC36851a.PASS.getType()), new LinkedHashSet());
        this.f86918m = hashMap;
        this.f86919n = new C36940a(C89086z.INSTANCE, C89086z.INSTANCE, C89086z.INSTANCE, C89086z.INSTANCE);
        this.f86920o = new LinkedHashSet();
    }

    /* renamed from: a */
    public final void mo64383a(IMUser iMUser, String str) {
        C89219l.m154721d(iMUser, "");
        C89219l.m154721d(str, "");
        C39162r.m79460a("tag_mention_head_click", new C33744d().mo59983a("previous_page", mo23342g().getEnterFrom()).mo59983a("to_user_id", iMUser.getUid()).mo59983a("click_type", str).mo59983a("user_type", mo64387d(iMUser)).mo59983a("search_keyword", "").mo59983a("function", "tag").f79943a);
    }

    /* renamed from: a */
    public final void mo64384a(IMUser iMUser, boolean z) {
        C89219l.m154721d(iMUser, "");
        if (!this.f86916k && z != mo64388i().contains(iMUser)) {
            if (z) {
                mo64388i().add(iMUser);
            } else {
                mo64388i().remove(iMUser);
            }
            mo20662a(new C36912h(iMUser));
        }
    }
}
