package com.p2082ss.android.ugc.aweme.comment.viewmodel;

import android.util.Log;
import android.util.LruCache;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.comment.api.AbstractC36272e;
import com.p2082ss.android.ugc.aweme.comment.api.LikeApi;
import com.p2082ss.android.ugc.aweme.comment.model.LikeListResponse;
import com.p2082ss.android.ugc.aweme.comment.util.C37199i;
import com.p2082ss.android.ugc.aweme.common.C39077ac;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3568b.C63494a;
import com.p2082ss.android.ugc.aweme.utils.C80298cg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4589j.C88934a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.LikeListVM */
public final class LikeListVM extends AbstractC1174ac implements AbstractC36272e, AbstractC90252i, AbstractC90253j {

    /* renamed from: c */
    public static final C37250a f87803c = new C37250a((byte) 0);

    /* renamed from: a */
    public BubbleBridge f87804a;

    /* renamed from: b */
    public String f87805b = "";

    /* renamed from: d */
    private final AbstractC89244h f87806d = C89250i.m154773a((AbstractC89171a) C37255f.f87829a);

    /* renamed from: e */
    private final AbstractC89244h f87807e = C89250i.m154773a((AbstractC89171a) C37252c.f87826a);

    /* renamed from: f */
    private final AbstractC89244h f87808f = C89250i.m154773a((AbstractC89171a) C37254e.f87828a);

    /* renamed from: g */
    private final AbstractC89244h f87809g = C89250i.m154773a((AbstractC89171a) C37253d.f87827a);

    /* renamed from: h */
    private final AbstractC89244h f87810h = C89250i.m154773a((AbstractC89171a) C37256g.f87830a);

    /* renamed from: i */
    private final AbstractC89244h f87811i = C89250i.m154773a((AbstractC89171a) C37257h.f87831a);

    /* renamed from: j */
    private final AbstractC89244h f87812j = C89250i.m154773a((AbstractC89171a) C37261l.f87836a);

    /* renamed from: k */
    private final AbstractC89244h f87813k = C89250i.m154773a((AbstractC89171a) C37258i.f87832a);

    static {
        Covode.recordClassIndex(44611);
    }

    /* renamed from: c */
    public final LruCache<String, Boolean> mo64806c() {
        return (LruCache) this.f87806d.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final LruCache<String, LikeListResponse> mo64807d() {
        return (LruCache) this.f87807e.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final Map<String, Long> mo64808e() {
        return (Map) this.f87808f.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C33943c<C89378p<String, Long>> mo64809f() {
        return (C33943c) this.f87809g.getValue();
    }

    /* renamed from: g */
    public final C33943c<User> mo64810g() {
        return (C33943c) this.f87810h.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(35, new RunnableC90250g(LikeListVM.class, "onBlockUserEvent", C63494a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: h */
    public final C88411a mo64811h() {
        return (C88411a) this.f87811i.getValue();
    }

    /* renamed from: i */
    public final Set<String> mo64812i() {
        return (Set) this.f87812j.getValue();
    }

    /* renamed from: j */
    public final C33943c<Boolean> mo64813j() {
        return (C33943c) this.f87813k.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.LikeListVM$a */
    public static final class C37250a {
        static {
            Covode.recordClassIndex(44615);
        }

        private C37250a() {
        }

        public /* synthetic */ C37250a(byte b) {
            this();
        }

        /* renamed from: a */
        public static LikeListVM m75257a(ActivityC0945e eVar) {
            C89219l.m154721d(eVar, "");
            AbstractC1174ac a = C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(LikeListVM.class);
            C89219l.m154716b(a, "");
            LikeListVM likeListVM = (LikeListVM) a;
            likeListVM.mo64802a(eVar);
            return likeListVM;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.LikeListVM$c */
    static final class C37252c extends AbstractC89220m implements AbstractC89171a<LruCache<String, LikeListResponse>> {

        /* renamed from: a */
        public static final C37252c f87826a = new C37252c();

        static {
            Covode.recordClassIndex(44617);
        }

        C37252c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LruCache<String, LikeListResponse> invoke() {
            return new LruCache(3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.LikeListVM$d */
    static final class C37253d extends AbstractC89220m implements AbstractC89171a<C33943c<C89378p<? extends String, ? extends Long>>> {

        /* renamed from: a */
        public static final C37253d f87827a = new C37253d();

        static {
            Covode.recordClassIndex(44618);
        }

        C37253d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C33943c<C89378p<? extends String, ? extends Long>> invoke() {
            return new C33943c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.LikeListVM$e */
    static final class C37254e extends AbstractC89220m implements AbstractC89171a<Map<String, Long>> {

        /* renamed from: a */
        public static final C37254e f87828a = new C37254e();

        static {
            Covode.recordClassIndex(44619);
        }

        C37254e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<String, Long> invoke() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.LikeListVM$f */
    static final class C37255f extends AbstractC89220m implements AbstractC89171a<LruCache<String, Boolean>> {

        /* renamed from: a */
        public static final C37255f f87829a = new C37255f();

        static {
            Covode.recordClassIndex(44620);
        }

        C37255f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LruCache<String, Boolean> invoke() {
            return new LruCache(3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.LikeListVM$g */
    static final class C37256g extends AbstractC89220m implements AbstractC89171a<C33943c<User>> {

        /* renamed from: a */
        public static final C37256g f87830a = new C37256g();

        static {
            Covode.recordClassIndex(44621);
        }

        C37256g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C33943c<User> invoke() {
            return new C33943c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.LikeListVM$h */
    static final class C37257h extends AbstractC89220m implements AbstractC89171a<C88411a> {

        /* renamed from: a */
        public static final C37257h f87831a = new C37257h();

        static {
            Covode.recordClassIndex(44622);
        }

        C37257h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C88411a invoke() {
            return new C88411a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.LikeListVM$i */
    static final class C37258i extends AbstractC89220m implements AbstractC89171a<C33943c<Boolean>> {

        /* renamed from: a */
        public static final C37258i f87832a = new C37258i();

        static {
            Covode.recordClassIndex(44623);
        }

        C37258i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C33943c<Boolean> invoke() {
            return new C33943c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.LikeListVM$l */
    static final class C37261l extends AbstractC89220m implements AbstractC89171a<Set<String>> {

        /* renamed from: a */
        public static final C37261l f87836a = new C37261l();

        static {
            Covode.recordClassIndex(44626);
        }

        C37261l() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Set<String> invoke() {
            return new LinkedHashSet();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.api.AbstractC36272e
    /* renamed from: a */
    public final C33943c<C89378p<String, Long>> mo63460a() {
        return mo64809f();
    }

    /* renamed from: b */
    public final BubbleBridge mo64805b() {
        BubbleBridge bubbleBridge = this.f87804a;
        if (bubbleBridge == null) {
            C89219l.m154710a("bubbleBridge");
        }
        return bubbleBridge;
    }

    /* renamed from: k */
    public final LikeListResponse mo64814k() {
        return mo64807d().get(this.f87805b);
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        super.onCleared();
        mo64811h().mo142944a();
        C80298cg.m139205b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.LikeListVM$b */
    public static final class C37251b {

        /* renamed from: a */
        public final String f87821a;

        /* renamed from: b */
        public final boolean f87822b;

        /* renamed from: c */
        public final LikeApi.EnumC36265a f87823c;

        /* renamed from: d */
        public final int f87824d;

        /* renamed from: e */
        public final String f87825e;

        static {
            Covode.recordClassIndex(44616);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37251b)) {
                return false;
            }
            C37251b bVar = (C37251b) obj;
            return C89219l.m154714a(this.f87821a, bVar.f87821a) && this.f87822b == bVar.f87822b && C89219l.m154714a(this.f87823c, bVar.f87823c) && this.f87824d == bVar.f87824d && C89219l.m154714a(this.f87825e, bVar.f87825e);
        }

        public final int hashCode() {
            String str = this.f87821a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            boolean z = this.f87822b;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = (hashCode + i2) * 31;
            LikeApi.EnumC36265a aVar = this.f87823c;
            int hashCode2 = (((i5 + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.f87824d) * 31;
            String str2 = this.f87825e;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }

        public final String toString() {
            return "Request{aid:" + this.f87821a + ", isRefresh:" + this.f87822b + ", scenario:" + this.f87823c + '}';
        }

        private C37251b(String str, boolean z, LikeApi.EnumC36265a aVar, int i, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(aVar, "");
            this.f87821a = str;
            this.f87822b = z;
            this.f87823c = aVar;
            this.f87824d = i;
            this.f87825e = str2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C37251b(String str, boolean z, LikeApi.EnumC36265a aVar, int i, String str2, int i2) {
            this(str, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? LikeApi.EnumC36265a.NORMAL : aVar, (i2 & 8) != 0 ? 20 : i, (i2 & 16) != 0 ? null : str2);
        }
    }

    public LikeListVM() {
        C80298cg.m139204a(this);
    }

    /* renamed from: a */
    public final void mo64802a(ActivityC0945e eVar) {
        if (this.f87804a == null) {
            this.f87804a = new BubbleBridge(this, eVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.LikeListVM$BubbleBridge */
    public static final class BubbleBridge extends ILikedListViewModel {

        /* renamed from: d */
        private final LikeListVM f87814d;

        static {
            Covode.recordClassIndex(44612);
        }

        /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.LikeListVM$BubbleBridge$b */
        static final class C37249b<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ BubbleBridge f87818a;

            /* renamed from: b */
            final /* synthetic */ boolean f87819b;

            /* renamed from: c */
            final /* synthetic */ String f87820c;

            static {
                Covode.recordClassIndex(44614);
            }

            C37249b(BubbleBridge bubbleBridge, boolean z, String str) {
                this.f87818a = bubbleBridge;
                this.f87819b = z;
                this.f87820c = str;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                if (this.f87819b) {
                    this.f87818a.mo60191a("REFRESH_LIKED_LIST_FAIL", this.f87820c);
                } else {
                    this.f87818a.mo60191a("LOAD_MORE_LIKED_LIST_FAIL", this.f87820c);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.LikeListVM$BubbleBridge$a */
        static final class C37248a<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ BubbleBridge f87815a;

            /* renamed from: b */
            final /* synthetic */ boolean f87816b;

            /* renamed from: c */
            final /* synthetic */ String f87817c;

            static {
                Covode.recordClassIndex(44613);
            }

            C37248a(BubbleBridge bubbleBridge, boolean z, String str) {
                this.f87815a = bubbleBridge;
                this.f87816b = z;
                this.f87817c = str;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                if (this.f87816b) {
                    this.f87815a.mo60191a("REFRESH_LIKED_LIST_SUCCESS", new C89378p(this.f87817c, obj));
                } else {
                    this.f87815a.mo60191a("LOAD_MORE_LIKED_LIST_SUCCESS", new C89378p(this.f87817c, obj));
                }
            }
        }

        public BubbleBridge(LikeListVM likeListVM, AbstractC1204m mVar) {
            C89219l.m154721d(likeListVM, "");
            C89219l.m154721d(mVar, "");
            this.f87814d = likeListVM;
            this.f80259a = mVar;
        }

        /* renamed from: a */
        public final void mo64816a(String str, long j) {
            boolean z;
            C89219l.m154721d(str, "");
            if (j == 0) {
                z = true;
            } else {
                z = false;
            }
            AbstractC88412b a = LikeApi.Api.C36264a.m73907a(LikeApi.m73906a(), str, j, LikeApi.EnumC36265a.BULLET.getValue()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C37248a(this, z, str), new C37249b(this, z, str));
            C89219l.m154716b(a, "");
            C88934a.m154195a(a, this.f87814d.mo64811h());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.LikeListVM$j */
    public static final class C37259j<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ LikeListVM f87833a;

        static {
            Covode.recordClassIndex(44624);
        }

        public C37259j(LikeListVM likeListVM) {
            this.f87833a = likeListVM;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<LikeListResponse> vVar) {
            C89219l.m154721d(vVar, "");
            this.f87833a.mo64804a(new C37251b(this.f87833a.f87805b, false, null, 0, null, 28), vVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.LikeListVM$k */
    public static final class C37260k<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ LikeListVM f87834a;

        /* renamed from: b */
        final /* synthetic */ String f87835b;

        static {
            Covode.recordClassIndex(44625);
        }

        public C37260k(LikeListVM likeListVM, String str) {
            this.f87834a = likeListVM;
            this.f87835b = str;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<LikeListResponse> vVar) {
            C89219l.m154721d(vVar, "");
            this.f87834a.mo64804a(new C37251b(this.f87834a.f87805b, true, null, 0, this.f87835b, 12), vVar);
        }
    }

    /* renamed from: a */
    public final void mo64803a(String str) {
        C89219l.m154721d(str, "");
        if (!C89219l.m154714a((Object) this.f87805b, (Object) str)) {
            this.f87805b = str;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.LikeListVM$m */
    public static final class C37262m<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C37262m f87837a = new C37262m();

        static {
            Covode.recordClassIndex(44627);
        }

        C37262m() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            String str;
            String recType;
            LikeListResponse likeListResponse = (LikeListResponse) obj;
            C89219l.m154721d(likeListResponse, "");
            List<User> likeList = likeListResponse.getLikeList();
            if (likeList != null) {
                for (T t : likeList) {
                    MatchedFriendStruct matchedFriendStruct = t.getMatchedFriendStruct();
                    if (!(matchedFriendStruct == null || (recType = matchedFriendStruct.getRecType()) == null)) {
                        t.setRecType(recType);
                    }
                    BaseResponse.ServerTimeExtra serverTimeExtra = likeListResponse.extra;
                    if (serverTimeExtra == null || (str = serverTimeExtra.logid) == null) {
                        str = "";
                    }
                    t.setRequestId(str);
                }
            }
            return likeListResponse;
        }
    }

    /* renamed from: a */
    public final long mo64801a(Aweme aweme) {
        AwemeStatistics statistics;
        if (aweme == null) {
            return 0;
        }
        Long l = mo64808e().get(aweme.getAid());
        if (l == null && ((statistics = aweme.getStatistics()) == null || (l = Long.valueOf(statistics.getDiggCount())) == null)) {
            return 0;
        }
        return l.longValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.LikeListVM$o */
    public static final class C37264o<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ LikeListVM f87842a;

        /* renamed from: b */
        final /* synthetic */ String f87843b;

        /* renamed from: c */
        final /* synthetic */ AbstractC88982v f87844c;

        /* renamed from: d */
        final /* synthetic */ C37251b f87845d;

        static {
            Covode.recordClassIndex(44629);
        }

        C37264o(LikeListVM likeListVM, String str, AbstractC88982v vVar, C37251b bVar) {
            this.f87842a = likeListVM;
            this.f87843b = str;
            this.f87844c = vVar;
            this.f87845d = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            this.f87842a.mo64806c().put(this.f87843b, false);
            AbstractC88982v vVar = this.f87844c;
            if (vVar != null) {
                C89219l.m154716b(th, "");
                C39077ac.m79343a(vVar, th);
            }
            String str = "request error, req:" + this.f87845d;
            C89219l.m154716b(th, "");
            C89219l.m154721d("LikeListVM", "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(th, "");
            if (C37199i.m75174a()) {
                C51423a.m95791b(6, "LikeListVM", str + ": " + Log.getStackTraceString(th));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.comment.viewmodel.LikeListVM$n */
    public static final class C37263n<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ LikeListVM f87838a;

        /* renamed from: b */
        final /* synthetic */ C37251b f87839b;

        /* renamed from: c */
        final /* synthetic */ String f87840c;

        /* renamed from: d */
        final /* synthetic */ AbstractC88982v f87841d;

        static {
            Covode.recordClassIndex(44628);
        }

        C37263n(LikeListVM likeListVM, C37251b bVar, String str, AbstractC88982v vVar) {
            this.f87838a = likeListVM;
            this.f87839b = bVar;
            this.f87840c = str;
            this.f87841d = vVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            LikeListResponse likeListResponse;
            long j;
            LikeListResponse likeListResponse2 = (LikeListResponse) obj;
            C37199i.m75173a("LikeListVM", "request success: req:" + this.f87839b + ", resp:" + likeListResponse2);
            this.f87838a.mo64806c().put(this.f87840c, false);
            AbstractC88982v vVar = this.f87841d;
            if (vVar != null) {
                LikeListVM likeListVM = this.f87838a;
                C37251b bVar = this.f87839b;
                C89219l.m154716b(likeListResponse2, "");
                LikeListResponse likeListResponse3 = likeListVM.mo64807d().get(bVar.f87821a);
                if (likeListResponse3 == null || bVar.f87822b) {
                    likeListResponse = likeListResponse2;
                } else {
                    ArrayList arrayList = new ArrayList();
                    List<User> likeList = likeListResponse3.getLikeList();
                    if (likeList != null) {
                        arrayList.addAll(likeList);
                    }
                    List<User> likeList2 = likeListResponse2.getLikeList();
                    if (likeList2 != null) {
                        arrayList.addAll(likeList2);
                    }
                    likeListResponse = LikeListResponse.copy$default(likeListResponse2, false, 0, arrayList, false, 11, null);
                }
                likeListVM.mo64807d().put(bVar.f87821a, likeListResponse);
                if (bVar.f87822b && !likeListResponse2.getHasMore()) {
                    List<User> likeList3 = likeListResponse2.getLikeList();
                    if (likeList3 != null) {
                        j = (long) likeList3.size();
                    } else {
                        j = 0;
                    }
                    Long l = likeListVM.mo64808e().get(bVar.f87821a);
                    if (l == null || j != l.longValue()) {
                        likeListVM.mo64808e().put(bVar.f87821a, Long.valueOf(j));
                        likeListVM.mo64809f().setValue(C89387v.m154943a(bVar.f87821a, Long.valueOf(j)));
                    }
                }
                C39077ac.m79342a(vVar, likeListResponse);
            }
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onBlockUserEvent(C63494a aVar) {
        User user;
        String uid;
        LikeListResponse k;
        List<User> likeList;
        if (aVar != null && (user = aVar.f144112a) != null && (uid = user.getUid()) != null && (k = mo64814k()) != null && (likeList = k.getLikeList()) != null) {
            ListIterator<User> listIterator = likeList.listIterator();
            boolean z = false;
            while (listIterator.hasNext()) {
                if (C89219l.m154714a((Object) listIterator.next().getUid(), (Object) uid)) {
                    listIterator.remove();
                    z = true;
                }
            }
            if (z) {
                C89378p<String, Long> value = mo64809f().getValue();
                if (value != null && C89219l.m154714a((Object) this.f87805b, (Object) value.getFirst()) && value.getSecond().longValue() > 0) {
                    mo64809f().setValue(C89387v.m154943a(value.getFirst(), Long.valueOf(value.getSecond().longValue() - 1)));
                }
                Long l = mo64808e().get(this.f87805b);
                if (l != null && l.longValue() > 0) {
                    mo64808e().put(this.f87805b, Long.valueOf(l.longValue() - 1));
                }
            }
            mo64810g().setValue(aVar.f144112a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.api.AbstractC36272e
    /* renamed from: a */
    public final void mo63461a(String str, long j) {
        if (str != null && str.length() != 0) {
            mo64808e().put(str, Long.valueOf(j));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006b, code lost:
        if (r7 <= 0) goto L_0x006d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo64804a(com.p2082ss.android.ugc.aweme.comment.viewmodel.LikeListVM.C37251b r13, p4560f.p4561a.AbstractC88982v<com.p2082ss.android.ugc.aweme.comment.model.LikeListResponse> r14) {
        /*
        // Method dump skipped, instructions count: 191
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.comment.viewmodel.LikeListVM.mo64804a(com.ss.android.ugc.aweme.comment.viewmodel.LikeListVM$b, f.a.v):boolean");
    }
}
