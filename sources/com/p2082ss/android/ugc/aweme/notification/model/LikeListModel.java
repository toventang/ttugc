package com.p2082ss.android.ugc.aweme.notification.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.notification.api.NoticeApiManager;
import com.p2082ss.android.ugc.aweme.notification.bean.C61868c;
import com.p2082ss.android.ugc.aweme.notification.bean.C61870e;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p077b.C1731i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.model.LikeListModel */
public final class LikeListModel extends AbstractC39085b<C61870e> {
    public static final Companion Companion = new Companion(null);
    private final int diggType;
    public boolean isLoadMore;
    private final boolean isNew;
    private final long lastReadTimestamp;
    private final HashSet<String> mLoadedIds;
    private final String refId;

    static {
        Covode.recordClassIndex(72965);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        C89219l.m154721d(objArr, "");
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.model.LikeListModel$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(72966);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }
    }

    public final void refresh() {
        this.isLoadMore = false;
        fetchLikeList$default(this, 0, 0, 3, null);
    }

    public final void loadMore() {
        long j;
        this.isLoadMore = true;
        T t = this.mData;
        long j2 = 0;
        if (t != null) {
            j = t.f140458c;
        } else {
            j = 0;
        }
        T t2 = this.mData;
        if (t2 != null) {
            j2 = t2.f140459d;
        }
        fetchLikeList(j, j2);
    }

    /* access modifiers changed from: protected */
    public final void handleData(C61870e eVar) {
        int i;
        List<C61868c> list;
        if (eVar == null) {
            this.mData = null;
            return;
        }
        List<C61868c> list2 = eVar.f140461f;
        int i2 = 0;
        if (list2 == null || list2.isEmpty()) {
            eVar.f140456a = 0;
        } else {
            List<C61868c> list3 = eVar.f140461f;
            if (list3 != null) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (T t : list3) {
                    User user = t.f140452a;
                    if (hashSet.add(user != null ? user.getUid() : null)) {
                        arrayList.add(t);
                    }
                }
                list3 = C89070n.m154585g((Collection) arrayList);
            }
            eVar.f140461f = list3;
            if (this.lastReadTimestamp <= 0 || (list = eVar.f140461f) == null || ((list instanceof Collection) && list.isEmpty())) {
                i = 0;
            } else {
                Iterator<T> it = list.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (it.next().f140453b >= this.lastReadTimestamp && (i = i + 1) < 0) {
                        C89070n.m154523b();
                    }
                }
            }
            C61870e eVar2 = (C61870e) this.mData;
            if (eVar2 != null) {
                i2 = eVar2.f140460e;
            }
            eVar.f140460e = i2 + i;
        }
        this.mData = eVar;
    }

    private final void fetchLikeList(long j, long j2) {
        NoticeApiManager.f140433a.fetchLikeList(j, j2, 20, this.isNew, this.diggType, this.refId).mo5534a(new LikeListModel$fetchLikeList$1(this), C1731i.f5564c, null);
    }

    public LikeListModel(String str, boolean z, int i, long j) {
        C89219l.m154721d(str, "");
        this.refId = str;
        this.isNew = z;
        this.diggType = i;
        this.lastReadTimestamp = j;
        this.mLoadedIds = new HashSet<>();
    }

    static /* synthetic */ void fetchLikeList$default(LikeListModel likeListModel, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = 0;
        }
        likeListModel.fetchLikeList(j, j2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LikeListModel(String str, boolean z, int i, long j, int i2, C89214g gVar) {
        this(str, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? 1 : i, (i2 & 8) != 0 ? 0 : j);
    }
}
