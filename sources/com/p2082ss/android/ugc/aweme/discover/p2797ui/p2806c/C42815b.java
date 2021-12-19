package com.p2082ss.android.ugc.aweme.discover.p2797ui.p2806c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.discover.api.SearchApi;
import com.p2082ss.android.ugc.aweme.discover.model.SearchLiveList;
import com.p2082ss.android.ugc.aweme.discover.model.SearchLiveStruct;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p3668r.AbstractC66587b;
import com.p2082ss.android.ugc.aweme.utils.C80214ai;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.c.b */
public final class C42815b implements AbstractC66587b {

    /* renamed from: g */
    public static final C42816a f99853g = new C42816a((byte) 0);

    /* renamed from: a */
    public long f99854a;

    /* renamed from: b */
    public final String f99855b;

    /* renamed from: c */
    public final String f99856c;

    /* renamed from: d */
    public final String f99857d;

    /* renamed from: e */
    public final String f99858e;

    /* renamed from: f */
    public final AbstractC42817b f99859f;

    /* renamed from: h */
    private final long f99860h;

    /* renamed from: i */
    private Boolean f99861i;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.c.b$b */
    public interface AbstractC42817b {
        static {
            Covode.recordClassIndex(50921);
        }

        /* renamed from: a */
        void mo60374a(SearchLiveList searchLiveList, List<? extends Aweme> list, boolean z);

        /* renamed from: a */
        void mo60375a(String str);
    }

    static {
        Covode.recordClassIndex(50919);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.c.b$a */
    static final class C42816a {
        static {
            Covode.recordClassIndex(50920);
        }

        private C42816a() {
        }

        public /* synthetic */ C42816a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.c.b$c */
    static final class CallableC42818c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C42815b f99862a;

        static {
            Covode.recordClassIndex(50922);
        }

        CallableC42818c(C42815b bVar) {
            this.f99862a = bVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            SearchLiveList a = SearchApi.m83821a(this.f99862a.f99855b, this.f99862a.f99854a, this.f99862a.f99856c, "load_more_general_list", this.f99862a.f99857d, this.f99862a.f99858e);
            this.f99862a.f99854a = a.cursor;
            List<SearchLiveStruct> list = a.liveList;
            C89219l.m154716b(list, "");
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
            for (T t : list) {
                C89219l.m154716b(t, "");
                arrayList.add(t.getLiveAweme());
            }
            return new C89378p(a, arrayList);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3668r.AbstractC66587b
    /* renamed from: a */
    public final void mo73071a(Map<String, String> map) {
        String str = "";
        C89219l.m154721d(map, str);
        AbstractC42817b bVar = this.f99859f;
        if (bVar != null) {
            String str2 = map.get("roomId");
            if (str2 != null) {
                str = str2;
            }
            bVar.mo60375a(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3668r.AbstractC66587b
    /* renamed from: a */
    public final void mo73070a(AbstractC66587b.AbstractC66588a aVar) {
        C89219l.m154721d(aVar, "");
        if (!C89219l.m154714a((Object) this.f99861i, (Object) false)) {
            C1731i.m5640b(new CallableC42818c(this), C1731i.f5562a).mo5534a(new C42819d(this, aVar), C1731i.f5564c, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.c.b$d */
    static final class C42819d<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C42815b f99863a;

        /* renamed from: b */
        final /* synthetic */ AbstractC66587b.AbstractC66588a f99864b;

        static {
            Covode.recordClassIndex(50923);
        }

        C42819d(C42815b bVar, AbstractC66587b.AbstractC66588a aVar) {
            this.f99863a = bVar;
            this.f99864b = aVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            String str = "";
            if (C80214ai.m139043a(iVar)) {
                C89219l.m154716b(iVar, str);
                List<SearchLiveStruct> list = ((SearchLiveList) ((C89378p) iVar.mo5545d()).getFirst()).liveList;
                if (list != null && (!list.isEmpty())) {
                    SearchLiveList searchLiveList = (SearchLiveList) ((C89378p) iVar.mo5545d()).getFirst();
                    List<? extends Aweme> list2 = (List) ((C89378p) iVar.mo5545d()).getSecond();
                    list2.size();
                    AbstractC42817b bVar = this.f99863a.f99859f;
                    if (bVar != null) {
                        bVar.mo60374a(searchLiveList, list2, searchLiveList.hasMore);
                    }
                    this.f99864b.mo105597a(list2);
                    return C89391z.f203057a;
                }
            }
            C89219l.m154716b(iVar, str);
            Exception e = iVar.mo5546e();
            if (!(e instanceof C34485a)) {
                e = null;
            }
            C34485a aVar = (C34485a) e;
            if (aVar != null) {
                Integer.valueOf(aVar.getErrorCode());
                aVar.getErrorMsg();
            }
            iVar.mo5546e();
            AbstractC66587b.AbstractC66588a aVar2 = this.f99864b;
            if (aVar != null) {
                aVar.getErrorCode();
                String errorMsg = aVar.getErrorMsg();
                if (errorMsg != null) {
                    str = errorMsg;
                }
            }
            aVar2.mo105596a(str);
            return C89391z.f203057a;
        }
    }

    public /* synthetic */ C42815b(String str, long j, String str2, String str3, String str4, AbstractC42817b bVar) {
        this(str, j, str2, str3, str4, bVar, true);
    }

    public C42815b(String str, long j, String str2, String str3, String str4, AbstractC42817b bVar, Boolean bool) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        this.f99855b = str;
        this.f99860h = j;
        this.f99856c = str2;
        this.f99857d = str3;
        this.f99858e = str4;
        this.f99859f = bVar;
        this.f99861i = bool;
        this.f99854a = j;
    }
}
