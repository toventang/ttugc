package com.p2082ss.android.ugc.aweme.discover.p2797ui.p2806c;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.discover.api.SearchApi;
import com.p2082ss.android.ugc.aweme.discover.jedi.viewmodel.C42174f;
import com.p2082ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.p2082ss.android.ugc.aweme.discover.model.SearchLiveList;
import com.p2082ss.android.ugc.aweme.discover.model.SearchLiveStruct;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41541n;
import com.p2082ss.android.ugc.aweme.discover.p2775j.AbstractC42081f;
import com.p2082ss.android.ugc.aweme.discover.p2775j.AbstractCallableC42074b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.c.f */
public final class C42826f extends AbstractC42081f<SearchLiveStruct, SearchLiveList> {

    /* renamed from: c */
    private static final C42827a f99881c = new C42827a((byte) 0);

    /* renamed from: a */
    public String f99882a;

    /* renamed from: b */
    public String f99883b;

    static {
        Covode.recordClassIndex(50930);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2775j.AbstractC42081f
    /* renamed from: c */
    public final int mo71277c() {
        return 7;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.c.f$a */
    static final class C42827a {
        static {
            Covode.recordClassIndex(50931);
        }

        private C42827a() {
        }

        public /* synthetic */ C42827a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.ui.c.f$c */
    public final class C42829c extends AbstractCallableC42074b {

        /* renamed from: b */
        public final C42174f f99885b;

        /* renamed from: c */
        final /* synthetic */ C42826f f99886c;

        static {
            Covode.recordClassIndex(50933);
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.p2775j.AbstractCallableC42074b
        /* renamed from: a */
        public final Object mo71270a() {
            return SearchApi.m83824c(this.f99885b);
        }

        public C42829c(C42826f fVar, C42174f fVar2) {
            C89219l.m154721d(fVar2, "");
            this.f99886c = fVar;
            this.f99885b = fVar2;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean isHasMore() {
        if (this.mData == null) {
            return false;
        }
        Object obj = this.mData;
        C89219l.m154716b(obj, "");
        if (((SearchLiveList) obj).hasMore) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final void m85536a(C42174f fVar) {
        C42829c cVar = new C42829c(this, fVar);
        cVar.f98096a = fVar.f98301r;
        this.f98114j = cVar;
        C34608n.m70658a().mo61083a(this.mHandler, cVar, 0);
    }

    /* renamed from: a */
    public final void mo73076a(SearchLiveList searchLiveList) {
        boolean z;
        C89219l.m154721d(searchLiveList, "");
        getItems().size();
        mo71281b(searchLiveList.liveList);
        getItems().size();
        C89219l.m154716b(this.mData, "");
        Object obj = this.mData;
        C89219l.m154716b(obj, "");
        SearchLiveList searchLiveList2 = (SearchLiveList) obj;
        if (searchLiveList.hasMore) {
            Object obj2 = this.mData;
            C89219l.m154716b(obj2, "");
            if (((SearchLiveList) obj2).hasMore) {
                z = true;
                searchLiveList2.hasMore = z;
                Object obj3 = this.mData;
                C89219l.m154716b(obj3, "");
                ((SearchLiveList) obj3).cursor = searchLiveList.cursor;
            }
        }
        z = false;
        searchLiveList2.hasMore = z;
        Object obj32 = this.mData;
        C89219l.m154716b(obj32, "");
        ((SearchLiveList) obj32).cursor = searchLiveList.cursor;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void loadMoreList(Object... objArr) {
        long j;
        C89219l.m154721d(objArr, "");
        String a = mo71278a(objArr);
        if (isDataEmpty()) {
            j = 0;
        } else {
            Object obj = this.mData;
            C89219l.m154716b(obj, "");
            j = ((SearchLiveList) obj).cursor;
        }
        String str = this.f98120p;
        if (str == null) {
            str = "";
        }
        String str2 = this.f99883b;
        if (str2 == null) {
            str2 = "";
        }
        m85536a(new C42174f(a, 0, mo71284e(), null, this.f98118n, 0, str, this.f98121q, j, 20, str2, null, null, null, null, null, 0, null, null, 1046570));
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void refreshList(Object... objArr) {
        C89219l.m154721d(objArr, "");
        String a = mo71278a(objArr);
        String str = this.f99883b;
        if (str == null) {
            str = "";
        }
        m85536a(new C42174f(a, 0, mo71284e(), null, this.f98118n, 0, "", this.f98121q, 0, 20, str, null, null, null, null, null, 0, this.f99882a, null, 784426));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void handleData(SearchLiveList searchLiveList) {
        boolean z;
        super.handleData((SearchApiResult) searchLiveList);
        List<SearchLiveStruct> list = searchLiveList != null ? searchLiveList.liveList : null;
        if (searchLiveList == null || C13603b.m24435a((Collection) list)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            if (list == null) {
                C89219l.m154715b();
            }
            for (SearchLiveStruct searchLiveStruct : list) {
                C89219l.m154716b(searchLiveStruct, "");
                if (searchLiveStruct.getLiveAweme() != null) {
                    Aweme liveAweme = searchLiveStruct.getLiveAweme();
                    C89219l.m154716b(liveAweme, "");
                    liveAweme.setRequestId(this.f98119o);
                    searchLiveStruct.setLogPbBean(searchLiveList != null ? searchLiveList.logPb : null);
                }
            }
            int i = this.mListQueryType;
            if (i == 1) {
                list.size();
                this.mData = searchLiveList;
                Object obj = this.mData;
                C89219l.m154716b(obj, "");
                ((SearchLiveList) obj).liveList = new ArrayList();
                mo71276a_(list);
                Object obj2 = this.mData;
                C89219l.m154716b(obj2, "");
                ((SearchLiveList) obj2).hasMore = C41541n.m83478a();
            } else if (i == 4) {
                mo73076a(searchLiveList);
            }
        } else {
            if (this.mListQueryType == 1) {
                this.mData = searchLiveList;
                mo71283d();
            }
            if (this.mData != null) {
                Object obj3 = this.mData;
                C89219l.m154716b(obj3, "");
                ((SearchLiveList) obj3).hasMore = false;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.c.f$b */
    public final class C42828b extends RuntimeException {

        /* renamed from: a */
        final /* synthetic */ C42826f f99884a;

        static {
            Covode.recordClassIndex(50932);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42828b(C42826f fVar, Throwable th) {
            super(th);
            C89219l.m154721d(th, "");
            this.f99884a = fVar;
        }
    }
}
