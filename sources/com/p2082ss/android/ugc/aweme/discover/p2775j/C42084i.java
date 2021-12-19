package com.p2082ss.android.ugc.aweme.discover.p2775j;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.discover.api.SearchApi;
import com.p2082ss.android.ugc.aweme.discover.helper.C42047s;
import com.p2082ss.android.ugc.aweme.discover.helper.C42056w;
import com.p2082ss.android.ugc.aweme.discover.jedi.viewmodel.C42174f;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.p2082ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.p2082ss.android.ugc.aweme.discover.model.SearchChallengeList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.j.i */
public final class C42084i extends AbstractC42081f<SearchChallenge, SearchChallengeList> {

    /* renamed from: a */
    public static final C42085a f98125a = new C42085a((byte) 0);

    /* renamed from: b */
    private static final int f98126b = 20;

    @Override // com.p2082ss.android.ugc.aweme.discover.p2775j.AbstractC42081f
    /* renamed from: c */
    public final int mo71277c() {
        return 2;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.j.i$a */
    public static final class C42085a {
        static {
            Covode.recordClassIndex(50019);
        }

        private C42085a() {
        }

        public /* synthetic */ C42085a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.j.i$b */
    public final class C42086b extends AbstractCallableC42074b {

        /* renamed from: b */
        public final C42174f f98127b;

        /* renamed from: c */
        final /* synthetic */ C42084i f98128c;

        static {
            Covode.recordClassIndex(50020);
        }

        /* access modifiers changed from: protected */
        @Override // com.p2082ss.android.ugc.aweme.discover.p2775j.AbstractCallableC42074b
        /* renamed from: a */
        public final Object mo71270a() {
            return SearchApi.m83823b(this.f98127b);
        }

        public C42086b(C42084i iVar, C42174f fVar) {
            C89219l.m154721d(fVar, "");
            this.f98128c = iVar;
            this.f98127b = fVar;
        }
    }

    static {
        Covode.recordClassIndex(50018);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean isHasMore() {
        if (this.mData == null) {
            return false;
        }
        Object obj = this.mData;
        C89219l.m154716b(obj, "");
        if (((SearchChallengeList) obj).hasMore) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m84275a(C42174f fVar) {
        C89219l.m154721d(fVar, "");
        C42086b bVar = new C42086b(this, fVar);
        bVar.f98096a = fVar.f98301r;
        this.f98114j = bVar;
        C34608n.m70658a().mo61083a(this.mHandler, bVar, 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void loadMoreList(Object... objArr) {
        String str = "";
        C89219l.m154721d(objArr, str);
        int i = 0;
        String a = mo71278a(objArr);
        if (!isDataEmpty()) {
            Object obj = this.mData;
            C89219l.m154716b(obj, str);
            i = ((SearchChallengeList) obj).cursor;
        }
        long j = (long) i;
        int i2 = f98126b;
        String str2 = this.f98120p;
        if (str2 != null) {
            str = str2;
        }
        Object obj2 = objArr[3];
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj2).intValue();
        String i3 = mo71288i();
        m84275a(new C42174f(a, 0, mo71284e(), null, this.f98118n, intValue, str, this.f98121q, j, i2, i3, null, null, null, null, null, 0, null, null, 1046538));
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void refreshList(Object... objArr) {
        C89219l.m154721d(objArr, "");
        String a = mo71278a(objArr);
        int i = f98126b;
        Object obj = objArr[3];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj).intValue();
        String i2 = mo71288i();
        m84275a(new C42174f(a, 0, mo71284e(), null, this.f98118n, intValue, "", this.f98121q, 0, i, i2, null, null, null, null, null, 0, null, C42047s.C42048a.m84150a().mo71202a(), 522250));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(SearchChallengeList searchChallengeList) {
        super.handleData((SearchApiResult) searchChallengeList);
        if (searchChallengeList == null) {
            C89219l.m154715b();
        }
        List<SearchChallenge> list = searchChallengeList.challengeList;
        C42056w.m84171a(list);
        this.mIsNewDataEmpty = C13603b.m24435a((Collection) list);
        boolean z = false;
        if (!this.mIsNewDataEmpty) {
            for (SearchChallenge searchChallenge : list) {
                C89219l.m154716b(searchChallenge, "");
                if (searchChallenge.getChallenge() != null) {
                    Challenge challenge = searchChallenge.getChallenge();
                    C89219l.m154716b(challenge, "");
                    challenge.setRequestId(this.f98119o);
                }
                searchChallenge.setRequestId(searchChallengeList.getRequestId());
                searchChallenge.logPbBean = searchChallengeList.logPb;
            }
            int i = this.mListQueryType;
            if (i == 1) {
                this.mData = searchChallengeList;
                Object obj = this.mData;
                C89219l.m154716b(obj, "");
                ((SearchChallengeList) obj).challengeList = new ArrayList();
                mo71276a_(list);
            } else if (i == 4) {
                mo71281b(list);
                Object obj2 = this.mData;
                C89219l.m154716b(obj2, "");
                SearchChallengeList searchChallengeList2 = (SearchChallengeList) obj2;
                if (searchChallengeList.hasMore) {
                    Object obj3 = this.mData;
                    C89219l.m154716b(obj3, "");
                    if (((SearchChallengeList) obj3).hasMore) {
                        z = true;
                    }
                }
                searchChallengeList2.hasMore = z;
                Object obj4 = this.mData;
                C89219l.m154716b(obj4, "");
                ((SearchChallengeList) obj4).cursor = searchChallengeList.cursor;
            }
        } else {
            if (this.mListQueryType == 1) {
                this.mData = searchChallengeList;
                mo71283d();
            }
            if (this.mData != null) {
                Object obj5 = this.mData;
                C89219l.m154716b(obj5, "");
                ((SearchChallengeList) obj5).hasMore = false;
            }
        }
    }
}
