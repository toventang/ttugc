package com.p2082ss.android.ugc.aweme.feed.model;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.feed.api.C48336j;
import com.p2082ss.android.ugc.aweme.feed.api.FollowFeedApi;
import com.p2082ss.android.ugc.aweme.feed.p2951j.C49709b;
import java.util.Iterator;
import java.util.List;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.feed.model.FollowingFeedListModel */
public final class FollowingFeedListModel extends AbstractC39100a<Aweme, C48336j> {
    private final List<String> blueDotList;
    public int footerNextCursor;
    public String footerUid = "";
    public boolean hasMoreFooter;
    public boolean hasMoreHeader;
    public int headerNextCursor;
    public String headerUid = "";
    public final List<String> uidList;

    static {
        Covode.recordClassIndex(58691);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        C89219l.m154721d(objArr, "");
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean isHasMore() {
        return this.hasMoreFooter;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final List<Aweme> getItems() {
        C48336j jVar = (C48336j) this.mData;
        if (jVar != null) {
            return jVar.getAwemeList();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void loadMoreList(Object... objArr) {
        C89219l.m154721d(objArr, "");
        if (this.hasMoreFooter) {
            loadList(this.footerNextCursor, this.footerUid, 2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void refreshList(Object... objArr) {
        C89219l.m154721d(objArr, "");
        Object obj = objArr[1];
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str = (String) obj;
        if (str != null) {
            loadList(0, str, 1);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void loadLatestList(Object... objArr) {
        C89219l.m154721d(objArr, "");
        if (!this.hasMoreHeader) {
            Message obtainMessage = this.mHandler.obtainMessage(0);
            C89219l.m154716b(obtainMessage, "");
            obtainMessage.obj = new C49709b();
            this.mHandler.sendMessage(obtainMessage);
            return;
        }
        loadList(this.headerNextCursor, this.headerUid, 3);
    }

    public FollowingFeedListModel(List<String> list, List<String> list2) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        this.uidList = list;
        this.blueDotList = list2;
    }

    private final void loadList(int i, String str, int i2) {
        int i3;
        boolean z;
        if (i2 != 3) {
            i3 = 2;
        } else {
            i3 = 1;
        }
        Iterator<String> it = this.uidList.iterator();
        int i4 = 0;
        while (true) {
            if (!it.hasNext()) {
                i4 = -1;
                break;
            } else if (C89361p.m154872a(it.next(), str, true)) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= this.blueDotList.size() || !C89361p.m154872a(this.blueDotList.get(i4), "true", true)) {
            z = false;
        } else {
            z = true;
        }
        FollowFeedApi.C48326a.m91784a().getFollowingInterestFeed(i, 8, str, i3, 2, z).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new FollowingFeedListModel$loadList$1(this, i2, str, z, i), new FollowingFeedListModel$loadList$2(this));
    }
}
