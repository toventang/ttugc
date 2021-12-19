package com.p2082ss.android.ugc.aweme.donation.detail;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.donation.C43112b;
import com.p2082ss.android.ugc.aweme.donation.C43147e;
import com.p2082ss.android.ugc.aweme.donation.DonateApi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.donation.detail.d */
public final class C43139d extends AbstractC39100a<C43147e, C43112b> {

    /* renamed from: a */
    public final DonateApi f100518a = ((DonateApi) RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(DonateApi.class));

    /* renamed from: b */
    public final String f100519b;

    /* renamed from: c */
    public final Integer f100520c;

    /* renamed from: d */
    public final String f100521d;

    /* renamed from: e */
    public final Long f100522e;

    /* renamed from: f */
    public final Integer f100523f;

    /* renamed from: g */
    public final String f100524g;

    static {
        Covode.recordClassIndex(51311);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        C89219l.m154721d(objArr, "");
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final List<C43147e> getItems() {
        List<C43147e> list;
        C43112b bVar = (C43112b) this.mData;
        if (bVar == null || (list = bVar.f100458b) == null) {
            return null;
        }
        return C89070n.m154585g((Collection) list);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean isHasMore() {
        Boolean bool;
        C43112b bVar = (C43112b) this.mData;
        if (bVar != null) {
            bool = bVar.f100460d;
        } else {
            bool = null;
        }
        return C89219l.m154714a((Object) bool, (Object) true);
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.detail.d$a */
    public static final class CallableC43140a implements Callable<C43112b> {

        /* renamed from: a */
        final /* synthetic */ C43139d f100525a;

        /* renamed from: b */
        final /* synthetic */ int f100526b;

        static {
            Covode.recordClassIndex(51312);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ C43112b call() {
            C43112b bVar = this.f100525a.f100518a.getDonateDetail(this.f100525a.f100519b, Integer.valueOf(this.f100526b), this.f100525a.f100520c, this.f100525a.f100521d, this.f100525a.f100522e, this.f100525a.f100523f, this.f100525a.f100524g, true).get();
            C89219l.m154716b(bVar, "");
            return bVar;
        }

        CallableC43140a(C43139d dVar, int i) {
            this.f100525a = dVar;
            this.f100526b = i;
        }
    }

    /* renamed from: a */
    private final void m86048a(int i) {
        C34608n.m70658a().mo61083a(this.mHandler, new CallableC43140a(this, i), 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void refreshList(Object... objArr) {
        C89219l.m154721d(objArr, "");
        m86048a(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void loadMoreList(Object... objArr) {
        int i;
        C89219l.m154721d(objArr, "");
        Integer num = this.mData.f100459c;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        m86048a(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final /* synthetic */ void handleData(Object obj) {
        C43112b bVar = (C43112b) obj;
        if (this.mListQueryType != 4) {
            super.handleData(bVar);
        } else if (bVar == null) {
        } else {
            if (this.mData == null) {
                this.mData = bVar;
            } else if (bVar.f100458b != null) {
                Collection collection = ((C43112b) this.mData).f100458b;
                if (collection == null) {
                    collection = new ArrayList();
                }
                List g = C89070n.m154585g(collection);
                Collection collection2 = bVar.f100458b;
                if (collection2 == null) {
                    collection2 = C89086z.INSTANCE;
                }
                g.addAll(collection2);
                C43112b bVar2 = (C43112b) this.mData;
                this.mData = new C43112b(bVar2.f100457a, g, bVar.f100459c, bVar.f100460d, bVar2.f100461e, bVar2.f100462f);
            }
        }
    }

    public C43139d(String str, Integer num, String str2, Long l, Integer num2, String str3) {
        this.f100519b = str;
        this.f100520c = num;
        this.f100521d = str2;
        this.f100522e = l;
        this.f100523f = num2;
        this.f100524g = str3;
    }
}
