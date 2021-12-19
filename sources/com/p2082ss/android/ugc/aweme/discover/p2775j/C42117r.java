package com.p2082ss.android.ugc.aweme.discover.p2775j;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.discover.api.SearchApi;
import com.p2082ss.android.ugc.aweme.discover.helper.C42047s;
import com.p2082ss.android.ugc.aweme.discover.jedi.viewmodel.C42174f;
import com.p2082ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.p2082ss.android.ugc.aweme.discover.model.SearchUser;
import com.p2082ss.android.ugc.aweme.discover.model.SearchUserList;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.j.r */
public final class C42117r extends AbstractC42081f<SearchUser, SearchUserList> {

    /* renamed from: a */
    public static final C42118a f98184a = new C42118a((byte) 0);

    /* renamed from: b */
    private static final int f98185b = 10;

    @Override // com.p2082ss.android.ugc.aweme.discover.p2775j.AbstractC42081f
    /* renamed from: c */
    public final int mo71277c() {
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.j.r$a */
    public static final class C42118a {
        static {
            Covode.recordClassIndex(50052);
        }

        private C42118a() {
        }

        public /* synthetic */ C42118a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.j.r$b */
    public final class C42119b extends AbstractCallableC42074b {

        /* renamed from: b */
        public final C42174f f98186b;

        /* renamed from: c */
        final /* synthetic */ C42117r f98187c;

        static {
            Covode.recordClassIndex(50053);
        }

        /* access modifiers changed from: protected */
        @Override // com.p2082ss.android.ugc.aweme.discover.p2775j.AbstractCallableC42074b
        /* renamed from: a */
        public final Object mo71270a() {
            return SearchApi.m83822a(this.f98186b);
        }

        public C42119b(C42117r rVar, C42174f fVar) {
            C89219l.m154721d(fVar, "");
            this.f98187c = rVar;
            this.f98186b = fVar;
        }
    }

    static {
        Covode.recordClassIndex(50051);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean isHasMore() {
        if (this.mData == null) {
            return false;
        }
        Object obj = this.mData;
        C89219l.m154716b(obj, "");
        if (((SearchUserList) obj).hasMore) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m84341a(C42174f fVar) {
        C89219l.m154721d(fVar, "");
        C42119b bVar = new C42119b(this, fVar);
        bVar.f98096a = fVar.f98301r;
        this.f98114j = bVar;
        C34608n.m70658a().mo61083a(this.mHandler, bVar, 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void loadMoreList(Object... objArr) {
        int i;
        String str = "";
        C89219l.m154721d(objArr, str);
        int i2 = 0;
        if (objArr.length > 3) {
            Object obj = objArr[3];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
            i = ((Integer) obj).intValue();
        } else {
            i = 0;
        }
        String a = mo71278a(objArr);
        if (!isDataEmpty()) {
            Object obj2 = this.mData;
            C89219l.m154716b(obj2, str);
            i2 = ((SearchUserList) obj2).cursor;
        }
        long j = (long) i2;
        int i3 = f98185b;
        String str2 = this.f98120p;
        if (str2 != null) {
            str = str2;
        }
        String i4 = mo71288i();
        int i5 = this.f98118n;
        m84341a(new C42174f(a, 0, mo71284e(), null, i5, i, str, this.f98121q, j, i3, i4, null, null, null, mo71289j(), mo71290k(), 0, null, null, 997386));
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void refreshList(Object... objArr) {
        int i;
        C89219l.m154721d(objArr, "");
        if (objArr.length > 3) {
            Object obj = objArr[3];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
            i = ((Integer) obj).intValue();
        } else {
            i = 0;
        }
        String a = mo71278a(objArr);
        int i2 = f98185b;
        String i3 = mo71288i();
        int i4 = this.f98118n;
        m84341a(new C42174f(a, 0, mo71284e(), null, i4, i, "", this.f98121q, 0, i2, i3, null, null, null, mo71289j(), mo71290k(), 0, null, C42047s.C42048a.m84150a().mo71202a(), 473098));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(SearchUserList searchUserList) {
        super.handleData((SearchApiResult) searchUserList);
        if (searchUserList == null) {
            C89219l.m154715b();
        }
        List<SearchUser> list = searchUserList.userList;
        this.mIsNewDataEmpty = C13603b.m24435a((Collection) list);
        boolean z = false;
        if (!this.mIsNewDataEmpty) {
            for (SearchUser searchUser : list) {
                C89219l.m154716b(searchUser, "");
                searchUser.mGlobalDoodleConfig = searchUserList.globalDoodleConfig;
                if (!searchUser.isDynamicCard()) {
                    User user = searchUser.user;
                    C89219l.m154716b(user, "");
                    user.setRequestId(this.f98119o);
                }
                searchUser.logPb = searchUserList.logPb;
            }
            int i = this.mListQueryType;
            if (i == 1) {
                this.mData = searchUserList;
                Object obj = this.mData;
                C89219l.m154716b(obj, "");
                ((SearchUserList) obj).userList = new ArrayList();
                mo71276a_(list);
            } else if (i == 4) {
                mo71281b(list);
                Object obj2 = this.mData;
                C89219l.m154716b(obj2, "");
                SearchUserList searchUserList2 = (SearchUserList) obj2;
                if (searchUserList.hasMore) {
                    Object obj3 = this.mData;
                    C89219l.m154716b(obj3, "");
                    if (((SearchUserList) obj3).hasMore) {
                        z = true;
                    }
                }
                searchUserList2.hasMore = z;
                Object obj4 = this.mData;
                C89219l.m154716b(obj4, "");
                ((SearchUserList) obj4).cursor = searchUserList.cursor;
            }
        } else {
            int i2 = this.mListQueryType;
            if (i2 == 1) {
                this.mData = searchUserList;
                mo71283d();
                if (this.mData != null) {
                    Object obj5 = this.mData;
                    C89219l.m154716b(obj5, "");
                    ((SearchUserList) obj5).hasMore = false;
                }
            } else if (i2 == 4 && this.mData != null) {
                Object obj6 = this.mData;
                C89219l.m154716b(obj6, "");
                SearchUserList searchUserList3 = (SearchUserList) obj6;
                if (searchUserList.hasMore) {
                    Object obj7 = this.mData;
                    C89219l.m154716b(obj7, "");
                    if (((SearchUserList) obj7).hasMore) {
                        z = true;
                    }
                }
                searchUserList3.hasMore = z;
                Object obj8 = this.mData;
                C89219l.m154716b(obj8, "");
                if (((SearchUserList) obj8).hasMore) {
                    Object obj9 = this.mData;
                    C89219l.m154716b(obj9, "");
                    ((SearchUserList) obj9).cursor = searchUserList.cursor;
                }
            }
        }
    }
}
