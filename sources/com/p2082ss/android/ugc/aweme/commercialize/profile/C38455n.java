package com.p2082ss.android.ugc.aweme.commercialize.profile;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.n */
public final class C38455n extends AbstractC39100a<Aweme, FeedItemList> {
    static {
        Covode.recordClassIndex(45963);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void loadMoreList(Object... objArr) {
        C89219l.m154721d(objArr, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void refreshList(Object... objArr) {
        C89219l.m154721d(objArr, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final List<Aweme> getItems() {
        if (this.mData == null) {
            return null;
        }
        Object obj = this.mData;
        C89219l.m154716b(obj, "");
        return ((FeedItemList) obj).getItems();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean isHasMore() {
        if (this.mData == null) {
            return false;
        }
        Object obj = this.mData;
        C89219l.m154716b(obj, "");
        if (((FeedItemList) obj).isHasMore()) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.n$a */
    static final class CallableC38456a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f90836a;

        /* renamed from: b */
        final /* synthetic */ String f90837b;

        /* renamed from: c */
        final /* synthetic */ long f90838c;

        /* renamed from: d */
        final /* synthetic */ long f90839d;

        /* renamed from: e */
        final /* synthetic */ int f90840e;

        /* renamed from: f */
        final /* synthetic */ String f90841f;

        /* renamed from: g */
        final /* synthetic */ String f90842g;

        static {
            Covode.recordClassIndex(45964);
        }

        CallableC38456a(String str, String str2, long j, long j2, int i, String str3, String str4) {
            this.f90836a = str;
            this.f90837b = str2;
            this.f90838c = j;
            this.f90839d = j2;
            this.f90840e = i;
            this.f90841f = str3;
            this.f90842g = str4;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            return ((FakeUserAwemeApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(C29736b.f70924e).create(FakeUserAwemeApi.class)).getFakeUserAwemeList(this.f90836a, this.f90837b, this.f90838c, this.f90839d, this.f90840e, this.f90841f, this.f90842g).execute().f52262b;
        }
    }

    /* renamed from: a */
    public final void mo67017a() {
        if (this.mData != null) {
            Object obj = this.mData;
            C89219l.m154716b(obj, "");
            if (((FeedItemList) obj).getItems() != null) {
                Object obj2 = this.mData;
                C89219l.m154716b(obj2, "");
                if (((FeedItemList) obj2).getItems().size() != 0) {
                    Object obj3 = this.mData;
                    C89219l.m154716b(obj3, "");
                    List<Aweme> items = ((FeedItemList) obj3).getItems();
                    C89219l.m154716b(items, "");
                    int size = items.size();
                    for (int i = 0; i < size; i++) {
                        Object obj4 = this.mData;
                        C89219l.m154716b(obj4, "");
                        List<Aweme> items2 = ((FeedItemList) obj4).getItems();
                        IAwemeService b = AwemeService.m70060b();
                        Object obj5 = this.mData;
                        C89219l.m154716b(obj5, "");
                        items2.set(i, b.mo60677a(((FeedItemList) obj5).getItems().get(i)));
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        C89219l.m154721d(objArr, "");
        if (objArr.length < 8 || !(objArr[0] instanceof String) || !(objArr[1] instanceof String) || !(objArr[2] instanceof Long) || !(objArr[3] instanceof Long) || !(objArr[4] instanceof Integer) || !(objArr[5] instanceof Integer) || !(objArr[6] instanceof String) || !(objArr[7] instanceof String)) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final /* synthetic */ void handleData(Object obj) {
        int i;
        List<Aweme> items;
        FeedItemList feedItemList = (FeedItemList) obj;
        if (this.mData == null) {
            super.handleData(feedItemList);
        } else if (feedItemList != null && feedItemList.getItems() != null) {
            List<Aweme> items2 = feedItemList.getItems();
            FeedItemList feedItemList2 = (FeedItemList) this.mData;
            if (feedItemList2 == null || (items = feedItemList2.getItems()) == null) {
                i = 0;
            } else {
                i = items.size();
            }
            insertItemList(items2, i);
            Object obj2 = this.mData;
            C89219l.m154716b(obj2, "");
            List<Aweme> items3 = ((FeedItemList) obj2).getItems();
            super.handleData(feedItemList);
            Object obj3 = this.mData;
            C89219l.m154716b(obj3, "");
            ((FeedItemList) obj3).items = items3;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b, com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean sendRequest(Object... objArr) {
        C89219l.m154721d(objArr, "");
        if (checkParams(objArr)) {
            return false;
        }
        Object obj = objArr[0];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
        Object obj2 = objArr[1];
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = objArr[2];
        Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Long");
        long longValue = ((Long) obj3).longValue();
        Object obj4 = objArr[3];
        Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.Long");
        long longValue2 = ((Long) obj4).longValue();
        Object obj5 = objArr[4];
        Objects.requireNonNull(obj5, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj5).intValue();
        Object obj6 = objArr[5];
        Objects.requireNonNull(obj6, "null cannot be cast to non-null type kotlin.Int");
        int intValue2 = ((Integer) obj6).intValue();
        Object obj7 = objArr[6];
        Objects.requireNonNull(obj7, "null cannot be cast to non-null type kotlin.String");
        Object obj8 = objArr[7];
        Objects.requireNonNull(obj8, "null cannot be cast to non-null type kotlin.String");
        this.mListQueryType = intValue2;
        C34608n.m70658a().mo61083a(this.mHandler, new CallableC38456a((String) obj, (String) obj2, longValue, longValue2, intValue, (String) obj7, (String) obj8), 0);
        return true;
    }
}
