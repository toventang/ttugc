package com.p4496tt.appbrandimpl;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.tt.appbrandimpl.a */
public final class C87419a extends AbstractC39100a<Aweme, FeedItemList> {

    /* renamed from: a */
    private int f198204a;

    /* renamed from: b */
    private int f198205b;

    static {
        Covode.recordClassIndex(103319);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final List<Aweme> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((FeedItemList) this.mData).getItems();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean isHasMore() {
        if (this.mData == null || !((FeedItemList) this.mData).isHasMore()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 5) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void refreshList(Object... objArr) {
        m151712a((String) objArr[1], (String) objArr[2], 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void loadMoreList(Object... objArr) {
        m151712a((String) objArr[1], (String) objArr[2], ((FeedItemList) this.mData).cursor);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r10 != null) goto L_0x000b;
     */
    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void handleData(java.lang.Object r10) {
        /*
        // Method dump skipped, instructions count: 293
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p4496tt.appbrandimpl.C87419a.handleData(java.lang.Object):void");
    }

    /* renamed from: a */
    private static List<Aweme> m151711a(List<Aweme> list, List<Aweme> list2) {
        if (list == null || list2 == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme : list) {
            arrayList.add(aweme);
            Iterator<Aweme> it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (TextUtils.equals(aweme.getAid(), it.next().getAid())) {
                        arrayList.remove(aweme);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m151712a(final String str, final String str2, final long j) {
        C34608n.m70658a().mo61083a(this.mHandler, new Callable() {
            /* class com.p4496tt.appbrandimpl.C87419a.CallableC874201 */

            /* renamed from: c */
            final /* synthetic */ int f198208c = 10;

            static {
                Covode.recordClassIndex(103320);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, 0);
    }
}
