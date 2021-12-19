package com.p2082ss.android.ugc.aweme.discover.p2775j;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.discover.api.SearchApi;
import com.p2082ss.android.ugc.aweme.discover.helper.AbstractC42023j;
import com.p2082ss.android.ugc.aweme.discover.helper.C41980ab;
import com.p2082ss.android.ugc.aweme.discover.helper.C42047s;
import com.p2082ss.android.ugc.aweme.discover.jedi.viewmodel.C42174f;
import com.p2082ss.android.ugc.aweme.discover.model.CardType;
import com.p2082ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.p2082ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.p2082ss.android.ugc.aweme.discover.model.SearchMusic;
import com.p2082ss.android.ugc.aweme.discover.model.SearchMusicList;
import com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41957c;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.search.C67446h;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67437b;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.j.n */
public final class C42102n extends AbstractC42081f<SearchMusic, SearchMusicList> {

    /* renamed from: a */
    public static final C42103a f98155a = new C42103a((byte) 0);

    /* renamed from: d */
    private static final int f98156d = 20;

    /* renamed from: b */
    private final AbstractC41957c f98157b = C67446h.f151111a.mo106217f().mo71108a();

    /* renamed from: c */
    private AbstractC42023j f98158c;

    @Override // com.p2082ss.android.ugc.aweme.discover.p2775j.AbstractC42081f
    /* renamed from: c */
    public final int mo71277c() {
        return 1;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.j.n$a */
    public static final class C42103a {
        static {
            Covode.recordClassIndex(50037);
        }

        private C42103a() {
        }

        public /* synthetic */ C42103a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.j.n$b */
    public final class C42104b extends AbstractCallableC42074b {

        /* renamed from: b */
        public final C42174f f98159b;

        /* renamed from: c */
        final /* synthetic */ C42102n f98160c;

        static {
            Covode.recordClassIndex(50038);
        }

        /* access modifiers changed from: protected */
        @Override // com.p2082ss.android.ugc.aweme.discover.p2775j.AbstractCallableC42074b
        /* renamed from: a */
        public final Object mo71270a() {
            return SearchApi.m83825d(this.f98159b);
        }

        public C42104b(C42102n nVar, C42174f fVar) {
            C89219l.m154721d(fVar, "");
            this.f98160c = nVar;
            this.f98159b = fVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.j.n$d */
    public static final class C42106d extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ SearchMusic f98163a;

        static {
            Covode.recordClassIndex(50040);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42106d(SearchMusic searchMusic) {
            super(0);
            this.f98163a = searchMusic;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            List<Music> musicList;
            if (this.f98163a.getCardType() == CardType.TYPE_MUSICIAN.getValue() && (musicList = this.f98163a.getMusicList()) != null) {
                musicList.size();
            }
            return 1;
        }
    }

    static {
        Covode.recordClassIndex(50036);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean isHasMore() {
        if (this.mData == null) {
            return false;
        }
        Object obj = this.mData;
        C89219l.m154716b(obj, "");
        if (((SearchMusicList) obj).hasMore) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.j.n$e */
    public static final class C42107e extends AbstractC89220m implements AbstractC89172b<Integer, Integer> {

        /* renamed from: a */
        final /* synthetic */ int f98164a;

        static {
            Covode.recordClassIndex(50041);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42107e(int i) {
            super(1);
            this.f98164a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Integer invoke(Integer num) {
            num.intValue();
            return Integer.valueOf(this.f98164a + 1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.j.n$f */
    public static final class C42108f extends AbstractC89220m implements AbstractC89172b<Integer, Integer> {

        /* renamed from: a */
        final /* synthetic */ Music f98165a;

        static {
            Covode.recordClassIndex(50042);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42108f(Music music) {
            super(1);
            this.f98165a = music;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Integer invoke(Integer num) {
            this.f98165a.getExtraParamFromPretreatment().put("rank", Integer.valueOf(num.intValue()));
            return 1;
        }
    }

    /* renamed from: a */
    private void m84323a(C42174f fVar) {
        C89219l.m154721d(fVar, "");
        C42104b bVar = new C42104b(this, fVar);
        bVar.f98096a = fVar.f98301r;
        this.f98114j = bVar;
        C34608n.m70658a().mo61083a(this.mHandler, bVar, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.j.n$c */
    public static final class C42105c extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ int f98161a;

        /* renamed from: b */
        final /* synthetic */ List f98162b;

        static {
            Covode.recordClassIndex(50039);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42105c(int i, List list) {
            super(1);
            this.f98161a = i;
            this.f98162b = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            int intValue = num.intValue();
            if (intValue >= 0 && intValue <= this.f98161a) {
                SearchMusic searchMusic = new SearchMusic();
                searchMusic.setCardType(CardType.TYPE_USER_NOTE.getValue());
                this.f98162b.add(intValue, searchMusic);
            }
            return C89391z.f203057a;
        }
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
            i = ((SearchMusicList) obj).cursor;
        }
        long j = (long) i;
        int i2 = f98156d;
        String str2 = this.f98120p;
        if (str2 != null) {
            str = str2;
        }
        Object obj2 = objArr[3];
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Int");
        int i3 = this.f98118n;
        m84323a(new C42174f(a, 0, mo71284e(), null, i3, ((Integer) obj2).intValue(), str, this.f98121q, j, i2, mo71288i(), (C67437b) objArr[4], null, null, null, null, 0, null, null, 1044490));
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void refreshList(Object... objArr) {
        C89219l.m154721d(objArr, "");
        String a = mo71278a(objArr);
        int i = f98156d;
        Object obj = objArr[3];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
        int i2 = this.f98118n;
        m84323a(new C42174f(a, 0, mo71284e(), null, i2, ((Integer) obj).intValue(), "", this.f98121q, 0, i, mo71288i(), (C67437b) objArr[4], null, null, null, null, 0, null, C42047s.C42048a.m84150a().mo71202a(), 520202));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(SearchMusicList searchMusicList) {
        boolean z;
        boolean z2;
        super.handleData((SearchApiResult) searchMusicList);
        if (searchMusicList == null) {
            C89219l.m154715b();
        }
        List<SearchMusic> list = searchMusicList.searchMusicList;
        this.mIsNewDataEmpty = C13603b.m24435a((Collection) list);
        boolean z3 = false;
        if (!this.mIsNewDataEmpty) {
            AbstractC41957c cVar = this.f98157b;
            if (this.mListQueryType == 1 && cVar != null) {
                cVar.mo71125b();
            }
            C89219l.m154716b(list, "");
            GlobalDoodleConfig globalDoodleConfig = searchMusicList.globalDoodleConfig;
            if (globalDoodleConfig == null || globalDoodleConfig.getSoundsListType() != 2) {
                z = false;
            } else {
                z = true;
            }
            AbstractC42023j jVar = this.f98158c;
            if (z) {
                if (jVar == null) {
                    jVar = new C41980ab();
                    this.f98158c = jVar;
                }
                if (this.mListQueryType == 1) {
                    SearchMusic searchMusic = new SearchMusic();
                    searchMusic.setCardType(CardType.TYPE_TRENDING_SOUNDS_TITLE.getValue());
                    list.add(0, searchMusic);
                    if (jVar == null) {
                        C89219l.m154715b();
                    }
                    jVar.mo71150a();
                }
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                SearchMusic searchMusic2 = list.get(i);
                searchMusic2.setRequestId(this.f98119o);
                searchMusic2.setLogPb(searchMusicList.logPb);
                C89219l.m154716b(searchMusic2, "");
                AbstractC41957c cVar2 = this.f98157b;
                if (cVar2 != null) {
                    boolean z4 = !searchMusicList.hasMore;
                    if (i == size - 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    cVar2.mo71124a(z4 & z2, new C42106d(searchMusic2), new C42107e(i));
                }
                GlobalDoodleConfig globalDoodleConfig2 = searchMusicList.globalDoodleConfig;
                Music music = searchMusic2.getMusic();
                AbstractC42023j jVar2 = this.f98158c;
                if (!(music == null || globalDoodleConfig2 == null)) {
                    music.setSoundsListType(globalDoodleConfig2.getSoundsListType());
                    if (jVar2 != null && searchMusic2.getCardType() == CardType.TYPE_NORMAL.getValue()) {
                        jVar2.mo71151a(new C42108f(music));
                    }
                }
            }
            AbstractC41957c cVar3 = this.f98157b;
            if (cVar3 != null) {
                cVar3.mo71123a(new C42105c(size, list));
            }
            int i2 = this.mListQueryType;
            if (i2 == 1) {
                this.mData = searchMusicList;
                mo71276a_(list);
            } else if (i2 == 4) {
                mo71281b(list);
                Object obj = this.mData;
                C89219l.m154716b(obj, "");
                SearchMusicList searchMusicList2 = (SearchMusicList) obj;
                if (searchMusicList.hasMore) {
                    Object obj2 = this.mData;
                    C89219l.m154716b(obj2, "");
                    if (((SearchMusicList) obj2).hasMore) {
                        z3 = true;
                    }
                }
                searchMusicList2.hasMore = z3;
                Object obj3 = this.mData;
                C89219l.m154716b(obj3, "");
                ((SearchMusicList) obj3).cursor = searchMusicList.cursor;
            }
        } else {
            if (this.mListQueryType == 1) {
                this.mData = searchMusicList;
                mo71283d();
            }
            if (this.mData != null) {
                Object obj4 = this.mData;
                C89219l.m154716b(obj4, "");
                ((SearchMusicList) obj4).hasMore = false;
            }
        }
    }
}
