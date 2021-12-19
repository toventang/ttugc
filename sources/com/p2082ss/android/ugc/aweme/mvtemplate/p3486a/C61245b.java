package com.p2082ss.android.ugc.aweme.mvtemplate.p3486a;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.p2082ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import com.p2082ss.android.ugc.aweme.mvtemplate.api.MovieDetailAPi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mvtemplate.a.b */
public final class C61245b extends AbstractC39100a<Aweme, C61247c> {

    /* renamed from: a */
    private int f139068a;

    static {
        Covode.recordClassIndex(71858);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        C89219l.m154721d(objArr, "");
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final List<Aweme> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((C61247c) this.mData).f139071a;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean isHasMore() {
        Boolean bool;
        if (this.mData == null || (bool = ((C61247c) this.mData).f139073c) == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.mvtemplate.a.b$a */
    public static final class CallableC61246a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f139069a;

        /* renamed from: b */
        final /* synthetic */ long f139070b;

        static {
            Covode.recordClassIndex(71859);
        }

        CallableC61246a(String str, long j) {
            this.f139069a = str;
            this.f139070b = j;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            String str = this.f139069a;
            long j = this.f139070b;
            C89219l.m154721d(str, "");
            String str2 = MovieDetailAPi.f139100e;
            C89219l.m154716b(str2, "");
            C61247c cVar = ((MovieDetailAPi.MvDetail) C18097a.m33696a().mo28816a(str2).mo28858a(MovieDetailAPi.MvDetail.class)).getMvDetailList(str, j).get();
            C89219l.m154716b(cVar, "");
            return cVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean isDataEmpty() {
        if (this.mData == null) {
            return true;
        }
        if (!C89219l.m154714a((Object) ((C61247c) this.mData).f139073c, (Object) false) || !C13603b.m24435a((Collection) getItems())) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final /* synthetic */ boolean deleteItem(Aweme aweme) {
        Aweme aweme2 = aweme;
        C89219l.m154721d(aweme2, "");
        return C50545m.m94763a(getItems(), aweme2, this.mNotifyListeners);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme>] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void setItems(List<Aweme> list) {
        if (this.mData == null) {
            this.mData = new C61247c();
        }
        ((C61247c) this.mData).f139073c = true;
        ((C61247c) this.mData).f139071a = (ArrayList) list;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void loadMoreList(Object... objArr) {
        long j;
        C89219l.m154721d(objArr, "");
        Object obj = objArr[1];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        if (isDataEmpty()) {
            j = 0;
        } else {
            j = ((C61247c) this.mData).f139072b;
        }
        Object obj2 = objArr[2];
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Int");
        m110904a(str, j, ((Integer) obj2).intValue());
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void refreshList(Object... objArr) {
        C89219l.m154721d(objArr, "");
        Object obj = objArr[1];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
        Object obj2 = objArr[2];
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Int");
        m110904a((String) obj, 0, ((Integer) obj2).intValue());
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        ArrayList<Aweme> arrayList;
        int i;
        Aweme aweme;
        Aweme aweme2;
        C61247c cVar = (C61247c) obj;
        boolean z2 = false;
        if (cVar == null || (C13603b.m24435a((Collection) cVar.f139071a) && C89219l.m154714a((Object) cVar.f139073c, (Object) false))) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            if (cVar == null) {
                C89219l.m154715b();
            }
            ArrayList<Aweme> arrayList2 = cVar.f139071a;
            if (arrayList2 != null) {
                Integer valueOf = Integer.valueOf(arrayList2.size());
                int i2 = 0;
                while (true) {
                    if (valueOf != null) {
                        i = valueOf.intValue();
                    } else {
                        i = 0;
                    }
                    if (i2 >= i) {
                        break;
                    }
                    ArrayList<Aweme> arrayList3 = cVar.f139071a;
                    if (arrayList3 != null) {
                        aweme = arrayList3.get(i2);
                    } else {
                        aweme = null;
                    }
                    Aweme a = AwemeService.m70060b().mo60677a(aweme);
                    ArrayList<Aweme> arrayList4 = cVar.f139071a;
                    if (!(arrayList4 == null || (aweme2 = arrayList4.get(i2)) == null)) {
                        int isTop = aweme2.getIsTop();
                        if (a == null) {
                            C89219l.m154715b();
                        }
                        a.setIsTop(isTop);
                    }
                    IRequestIdService a2 = RequestIdService.m70076a();
                    StringBuilder sb = new StringBuilder();
                    C89219l.m154716b(a, "");
                    a2.mo60694a(sb.append(a.getAid()).append(this.f139068a + 11000).toString(), cVar.f139074d, i2);
                    ArrayList<Aweme> arrayList5 = cVar.f139071a;
                    if (arrayList5 != null) {
                        arrayList5.set(i2, a);
                    }
                    if (cVar.f139075e != null) {
                        C48027ac.C48028a.f111257a.mo80056a(cVar.f139074d, cVar.f139075e);
                    }
                    i2++;
                }
            }
            int i3 = this.mListQueryType;
            if (i3 == 1) {
                this.mData = cVar;
            } else if (i3 == 4) {
                ArrayList<Aweme> arrayList6 = cVar.f139071a;
                if (!(arrayList6 == null || (arrayList = ((C61247c) this.mData).f139071a) == null)) {
                    arrayList.addAll(arrayList6);
                }
                ((C61247c) this.mData).f139072b = cVar.f139072b;
                C61247c cVar2 = (C61247c) this.mData;
                Boolean bool = cVar.f139073c;
                if (bool != null) {
                    z2 = bool.booleanValue();
                }
                cVar2.f139073c = Boolean.valueOf(z2);
            }
        } else if (this.mData != null) {
            ((C61247c) this.mData).f139073c = false;
        }
    }

    /* renamed from: a */
    private final void m110904a(String str, long j, int i) {
        this.f139068a = i;
        C34608n.m70658a().mo61083a(this.mHandler, new CallableC61246a(str, j), 0);
    }
}
