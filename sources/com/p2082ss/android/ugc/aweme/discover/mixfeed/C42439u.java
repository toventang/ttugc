package com.p2082ss.android.ugc.aweme.discover.mixfeed;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41238k;
import com.p2082ss.android.ugc.aweme.discover.api.C41854a;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42427n;
import com.p2082ss.android.ugc.aweme.discover.p2775j.AbstractC42081f;
import com.p2082ss.android.ugc.aweme.discover.p2775j.C42097l;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67437b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p077b.C1731i;
import p4600h.C89378p;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.u */
public class C42439u extends AbstractC42081f<C42411h, C42426m> implements AbstractC41238k {

    /* renamed from: a */
    private int f98908a;

    /* renamed from: f */
    protected String f98909f;

    /* renamed from: g */
    protected int f98910g;

    static {
        Covode.recordClassIndex(50385);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2775j.AbstractC42081f
    /* renamed from: b */
    public final boolean mo71282b() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2775j.AbstractC42081f
    /* renamed from: c */
    public final int mo71277c() {
        return 3;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2750i.AbstractC41238k
    /* renamed from: a */
    public final List<Aweme> mo70559a() {
        return m84813a(getItems());
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public boolean isHasMore() {
        if (this.mData == null || !((C42426m) this.mData).f98849b) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0017  */
    /* JADX WARNING: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo71643c(com.p2082ss.android.ugc.aweme.discover.mixfeed.C42426m r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x0010
            java.lang.String r0 = r2.getRequestId()
            r1.f98119o = r0
            java.util.List<com.ss.android.ugc.aweme.discover.mixfeed.h> r0 = r2.f98850c
            boolean r0 = com.bytedance.common.utility.collection.C13603b.m24435a(r0)
            if (r0 == 0) goto L_0x001d
        L_0x0010:
            r0 = 1
        L_0x0011:
            r1.mIsNewDataEmpty = r0
            boolean r0 = r1.mIsNewDataEmpty
            if (r0 != 0) goto L_0x001c
            com.ss.android.ugc.aweme.discover.c.e r0 = com.p2082ss.android.ugc.aweme.discover.p2767c.C41902e.f97765b
            r0.mo71063a(r2)
        L_0x001c:
            return
        L_0x001d:
            r0 = 0
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.mixfeed.C42439u.mo71643c(com.ss.android.ugc.aweme.discover.mixfeed.m):void");
    }

    /* renamed from: a */
    public static List<Aweme> m84813a(List<C42411h> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C42411h hVar : list) {
            if (hVar.getFeedType() == 65280) {
                arrayList.add(hVar.getAweme());
            }
        }
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public void loadMoreList(Object... objArr) {
        int i;
        if (C13603b.m24435a((Collection) getItems())) {
            i = 0;
        } else {
            i = ((C42426m) this.mData).f98848a;
        }
        if (objArr.length == 1) {
            m84814a(mo71278a(objArr), i, this.f98120p, mo71288i(), this.f98121q);
        } else {
            mo71610a(mo71278a(objArr), i, 10, 0, this.f98120p, ((Integer) objArr[5]).intValue(), (C67437b) objArr[6], mo71288i(), this.f98121q);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public void refreshList(Object... objArr) {
        if (objArr.length == 2) {
            m84814a(mo71278a(objArr), 0, "", mo71288i(), this.f98121q);
        } else {
            mo71610a(mo71278a(objArr), 0, C42434p.f98892c, ((Integer) objArr[2]).intValue(), "", ((Integer) objArr[5]).intValue(), (C67437b) objArr[6], mo71288i(), this.f98121q);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0168  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleData(com.p2082ss.android.ugc.aweme.discover.mixfeed.C42426m r11) {
        /*
        // Method dump skipped, instructions count: 507
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.mixfeed.C42439u.handleData(com.ss.android.ugc.aweme.discover.mixfeed.m):void");
    }

    /* renamed from: a */
    private void m84814a(String str, int i, String str2, String str3, String str4) {
        mo71610a(str, i, 10, 0, str2, this.f98910g, this.f98112h, str3, str4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo71610a(String str, int i, int i2, int i3, String str2, int i4, C67437b bVar, String str3, String str4) {
        C89378p<C42427n, C1731i<C42426m>> b;
        C1731i<C42426m> iVar = null;
        if (!(i == 0 || this.mData == null)) {
            C1731i<C42426m> iVar2 = ((C42426m) this.mData).f98853g;
            ((C42426m) this.mData).f98853g = null;
            if (iVar2 != null) {
                iVar2.mo5532a(new C42366e(this.mHandler));
                return;
            }
        }
        String str5 = "";
        if (!(this.f98113i == null || this.f98113i.getSugUserId() == null || this.f98113i.getSugUserId().equals(str5))) {
            str5 = this.f98113i.getSugUserId();
        }
        this.f98910g = i4;
        this.f98112h = bVar;
        C42427n a = new C42427n.C42428a().mo71624a(str).mo71621a(i).mo71626b(i2).mo71628c(i3).mo71627b(str2).mo71630d(i4).mo71622a(this.f98112h).mo71631d(mo71284e()).mo71632e(this.f98118n).mo71623a(this.f98113i).mo71633e(str3).mo71636h(str5).mo71634f(C41854a.m83837a()).mo71629c(str4).mo71625a();
        if (i == 0 && (b = C42097l.m84312b(a)) != null) {
            a = b.getFirst();
            iVar = b.getSecond();
        }
        mo71279a(1, "topMixModel new request");
        this.mIsLoading = true;
        if (iVar == null) {
            iVar = a.mo71616a();
        }
        this.f98114j = a;
        iVar.mo5537b(C42443v.f98916a).mo5537b(C42444w.f98917a).mo5532a(new C42366e(this.mHandler));
    }
}
