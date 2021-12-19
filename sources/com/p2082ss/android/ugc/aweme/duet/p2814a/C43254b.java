package com.p2082ss.android.ugc.aweme.duet.p2814a;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.duet.api.API;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.duet.a.b */
public final class C43254b extends AbstractC39100a<Aweme, C43253a> {
    static {
        Covode.recordClassIndex(51456);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        C89219l.m154721d(objArr, "");
        return true;
    }

    /* renamed from: a */
    public final void mo73781a() {
        resetLoadingStatus(null);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final List<Aweme> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((C43253a) this.mData).f100977a;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean isHasMore() {
        if (this.mData == null || ((C43253a) this.mData).f100979c == 0) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean isDataEmpty() {
        if (this.mData == null) {
            return true;
        }
        if (((C43253a) this.mData).f100979c != 0 || !C13603b.m24435a((Collection) getItems())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.duet.a.b$a */
    public static final class CallableC43255a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f100981a;

        /* renamed from: b */
        final /* synthetic */ long f100982b;

        /* renamed from: c */
        final /* synthetic */ int f100983c = 20;

        /* renamed from: d */
        final /* synthetic */ String f100984d;

        static {
            Covode.recordClassIndex(51457);
        }

        CallableC43255a(String str, long j, String str2) {
            this.f100981a = str;
            this.f100982b = j;
            this.f100984d = str2;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            String str = this.f100981a;
            long j = this.f100982b;
            long j2 = (long) this.f100983c;
            String str2 = this.f100984d;
            C89219l.m154721d(str, "");
            String str3 = Api.f79771d;
            C89219l.m154716b(str3, "");
            C43253a aVar = ((API) C18097a.m33696a().mo28816a(str3).mo28858a(API.class)).getDuetDetailList(str, j, j2, str2, 37).get();
            C89219l.m154716b(aVar, "");
            return aVar;
        }
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
            j = ((C43253a) this.mData).f100978b;
        }
        m86363a(str, j, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void refreshList(Object... objArr) {
        String str = "";
        C89219l.m154721d(objArr, str);
        if (C89064i.m154495b(objArr, 4) instanceof String) {
            Object b = C89064i.m154495b(objArr, 4);
            Objects.requireNonNull(b, "null cannot be cast to non-null type kotlin.String");
            str = (String) b;
        }
        Object obj = objArr[1];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
        m86363a((String) obj, 0, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        ArrayList<Aweme> arrayList;
        int i;
        Aweme aweme;
        Aweme aweme2;
        C43253a aVar = (C43253a) obj;
        if (aVar == null || (C13603b.m24435a((Collection) aVar.f100977a) && aVar.f100979c != 1)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            if (aVar == null) {
                C89219l.m154715b();
            }
            ArrayList<Aweme> arrayList2 = aVar.f100977a;
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
                    ArrayList<Aweme> arrayList3 = aVar.f100977a;
                    if (arrayList3 != null) {
                        aweme = arrayList3.get(i2);
                    } else {
                        aweme = null;
                    }
                    Aweme a = AwemeService.m70060b().mo60677a(aweme);
                    ArrayList<Aweme> arrayList4 = aVar.f100977a;
                    if (!(arrayList4 == null || (aweme2 = arrayList4.get(i2)) == null)) {
                        int isTop = aweme2.getIsTop();
                        if (a == null) {
                            C89219l.m154715b();
                        }
                        a.setIsTop(isTop);
                    }
                    ArrayList<Aweme> arrayList5 = aVar.f100977a;
                    if (arrayList5 != null) {
                        arrayList5.set(i2, a);
                    }
                    i2++;
                }
            }
            int i3 = this.mListQueryType;
            if (i3 == 1) {
                this.mData = aVar;
            } else if (i3 == 4) {
                ArrayList<Aweme> arrayList6 = aVar.f100977a;
                if (!(arrayList6 == null || (arrayList = ((C43253a) this.mData).f100977a) == null)) {
                    arrayList.addAll(arrayList6);
                }
                ((C43253a) this.mData).f100978b = aVar.f100978b;
                ((C43253a) this.mData).f100979c = aVar.f100979c;
            }
        } else if (this.mData != null) {
            ((C43253a) this.mData).f100979c = 0;
        }
    }

    /* renamed from: a */
    private final void m86363a(String str, long j, String str2) {
        if (!C80580in.m139687c()) {
            C34608n.m70658a().mo61083a(this.mHandler, new CallableC43255a(str, j, str2), 0);
        }
    }
}
