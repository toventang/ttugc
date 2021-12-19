package com.p2082ss.android.ugc.aweme.discover.p2775j;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.discover.helper.C42047s;
import com.p2082ss.android.ugc.aweme.discover.jedi.viewmodel.C42174f;
import com.p2082ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.p2082ss.android.ugc.aweme.discover.model.SearchMix;
import com.p2082ss.android.ugc.aweme.discover.p2767c.C41902e;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67437b;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.j.d */
public class C42077d extends AbstractC42081f<Aweme, SearchMix> {

    /* renamed from: c */
    public static final String f98098c = "video_search";

    /* renamed from: d */
    public static final String f98099d = "guide_search";

    /* renamed from: e */
    public static final C42078a f98100e = new C42078a((byte) 0);

    /* renamed from: r */
    private static final int f98101r = 10;

    /* renamed from: a */
    public String f98102a = "";

    /* renamed from: b */
    public String f98103b;

    /* renamed from: f */
    private int f98104f;

    /* renamed from: g */
    private String f98105g = f98098c;

    @Override // com.p2082ss.android.ugc.aweme.discover.p2775j.AbstractC42081f
    /* renamed from: c */
    public final int mo71277c() {
        return 4;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.j.d$a */
    public static final class C42078a {
        static {
            Covode.recordClassIndex(50012);
        }

        private C42078a() {
        }

        public /* synthetic */ C42078a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(50011);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public boolean isHasMore() {
        if (this.mData == null) {
            return false;
        }
        Object obj = this.mData;
        C89219l.m154716b(obj, "");
        if (((SearchMix) obj).hasMore) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.j.d$b */
    public final class C42079b extends AbstractCallableC42074b {

        /* renamed from: b */
        public final C42174f f98106b;

        /* renamed from: c */
        final /* synthetic */ C42077d f98107c;

        static {
            Covode.recordClassIndex(50013);
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00a0  */
        @Override // com.p2082ss.android.ugc.aweme.discover.p2775j.AbstractCallableC42074b
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo71270a() {
            /*
            // Method dump skipped, instructions count: 166
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.p2775j.C42077d.C42079b.mo71270a():java.lang.Object");
        }

        public C42079b(C42077d dVar, C42174f fVar) {
            C89219l.m154721d(fVar, "");
            this.f98107c = dVar;
            this.f98106b = fVar;
        }
    }

    /* renamed from: a */
    public final void mo71275a(String str) {
        C89219l.m154721d(str, "");
        this.f98105g = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2775j.AbstractC42081f
    /* renamed from: a_ */
    public final void mo71276a_(List<? extends Aweme> list) {
        int i;
        super.mo71276a_(list);
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        this.f98104f = i;
    }

    /* renamed from: a */
    private void m84232a(C42174f fVar) {
        C89219l.m154721d(fVar, "");
        this.f98112h = fVar.f98295l;
        C42079b bVar = new C42079b(this, fVar);
        bVar.f98096a = fVar.f98301r;
        this.f98114j = bVar;
        C34608n.m70658a().mo61083a(this.mHandler, bVar, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(SearchMix searchMix) {
        boolean z;
        boolean z2;
        int i;
        super.handleData((SearchApiResult) searchMix);
        boolean z3 = false;
        if (searchMix == null || C13603b.m24435a((Collection) searchMix.awemeList)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            if (searchMix == null) {
                C89219l.m154715b();
            }
            List<Aweme> list = searchMix.awemeList;
            if (this.mListQueryType == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f98104f = C41902e.m83943a(z2, list, this.f98104f);
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Aweme a = AwemeService.m70060b().mo60677a(searchMix.awemeList.get(i2));
                if (this.mData != null) {
                    Object obj = this.mData;
                    C89219l.m154716b(obj, "");
                    if (((SearchMix) obj).awemeList != null) {
                        Object obj2 = this.mData;
                        C89219l.m154716b(obj2, "");
                        i = ((SearchMix) obj2).awemeList.size();
                        C89219l.m154716b(a, "");
                        a.setRequestId(this.f98119o);
                        RequestIdService.m70076a().mo60694a(a.getAid() + 9, this.f98119o, i + i2);
                        list.set(i2, a);
                        a.setAwemePosition(i2);
                    }
                }
                i = 0;
                C89219l.m154716b(a, "");
                a.setRequestId(this.f98119o);
                RequestIdService.m70076a().mo60694a(a.getAid() + 9, this.f98119o, i + i2);
                list.set(i2, a);
                a.setAwemePosition(i2);
            }
            int i3 = this.mListQueryType;
            if (i3 == 1) {
                this.mData = searchMix;
                mo71276a_(list);
            } else if (i3 == 4) {
                mo71281b(list);
                Object obj3 = this.mData;
                C89219l.m154716b(obj3, "");
                SearchMix searchMix2 = (SearchMix) obj3;
                if (searchMix.hasMore) {
                    Object obj4 = this.mData;
                    C89219l.m154716b(obj4, "");
                    if (((SearchMix) obj4).hasMore) {
                        z3 = true;
                    }
                }
                searchMix2.hasMore = z3;
                Object obj5 = this.mData;
                C89219l.m154716b(obj5, "");
                ((SearchMix) obj5).cursor = searchMix.cursor;
            }
        } else {
            if (this.mListQueryType == 1) {
                this.mData = searchMix;
                mo71283d();
            }
            if (this.mData != null) {
                Object obj6 = this.mData;
                C89219l.m154716b(obj6, "");
                ((SearchMix) obj6).hasMore = false;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public void loadMoreList(Object... objArr) {
        C42174f fVar;
        String str = "";
        C89219l.m154721d(objArr, str);
        int i = 0;
        if (objArr.length == 1) {
            String a = mo71278a(objArr);
            if (!isDataEmpty()) {
                Object obj = this.mData;
                C89219l.m154716b(obj, str);
                i = ((SearchMix) obj).cursor;
            }
            long j = (long) i;
            int i2 = f98101r;
            String str2 = this.f98120p;
            if (str2 != null) {
                str = str2;
            }
            C67437b bVar = this.f98112h;
            String i3 = mo71288i();
            int i4 = this.f98118n;
            fVar = new C42174f(a, 0, mo71284e(), this.f98105g, i4, 1, str, this.f98121q, j, i2, i3, bVar, this.f98102a, null, null, null, 0, null, null, 1040386);
        } else {
            String a2 = mo71278a(objArr);
            if (!isDataEmpty()) {
                Object obj2 = this.mData;
                C89219l.m154716b(obj2, str);
                i = ((SearchMix) obj2).cursor;
            }
            long j2 = (long) i;
            int i5 = f98101r;
            String str3 = this.f98120p;
            if (str3 != null) {
                str = str3;
            }
            Object obj3 = objArr[3];
            Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Int");
            String i6 = mo71288i();
            int i7 = this.f98118n;
            String e = mo71284e();
            String str4 = this.f98105g;
            String str5 = this.f98102a;
            fVar = new C42174f(a2, 0, e, str4, i7, ((Integer) obj3).intValue(), str, this.f98121q, j2, i5, i6, (C67437b) objArr[4], str5, null, null, null, 0, null, null, 1040386);
        }
        m84232a(fVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public void refreshList(Object... objArr) {
        C42174f fVar;
        C89219l.m154721d(objArr, "");
        if (objArr.length == 1) {
            String a = mo71278a(objArr);
            int i = f98101r;
            C67437b bVar = this.f98112h;
            String i2 = mo71288i();
            int i3 = this.f98118n;
            fVar = new C42174f(a, 0, mo71284e(), this.f98105g, i3, 1, "", this.f98121q, 0, i, i2, bVar, this.f98102a, this.f98103b, null, null, 0, null, C42047s.C42048a.m84150a().mo71202a(), 507906);
        } else {
            String a2 = mo71278a(objArr);
            int i4 = f98101r;
            Object obj = objArr[3];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
            String i5 = mo71288i();
            int i6 = this.f98118n;
            String e = mo71284e();
            String str = this.f98105g;
            String str2 = this.f98102a;
            String str3 = this.f98103b;
            fVar = new C42174f(a2, 0, e, str, i6, ((Integer) obj).intValue(), "", this.f98121q, 0, i4, i5, (C67437b) objArr[4], str2, str3, null, null, 0, null, C42047s.C42048a.m84150a().mo71202a(), 507906);
        }
        m84232a(fVar);
    }
}
