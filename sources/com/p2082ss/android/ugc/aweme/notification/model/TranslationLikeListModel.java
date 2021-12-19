package com.p2082ss.android.ugc.aweme.notification.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.notification.api.NoticeApiManager;
import com.p2082ss.android.ugc.aweme.notification.bean.C61889s;
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

/* renamed from: com.ss.android.ugc.aweme.notification.model.TranslationLikeListModel */
public final class TranslationLikeListModel extends AbstractC39085b<C61889s> {
    public boolean isLoadMore;
    private final String itemId;
    private final long lastReadTimestamp;
    private final String subtitleId;

    static {
        Covode.recordClassIndex(72974);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        C89219l.m154721d(objArr, "");
        return true;
    }

    public final void refresh() {
        this.isLoadMore = false;
        fetchTranslationLikeList$default(this, 0, 0, 3, null);
    }

    public final void loadMore() {
        long j;
        this.isLoadMore = true;
        T t = this.mData;
        long j2 = 0;
        if (t != null) {
            j = t.f140516d;
        } else {
            j = 0;
        }
        T t2 = this.mData;
        if (t2 != null) {
            j2 = t2.f140515c;
        }
        fetchTranslationLikeList(j, j2);
    }

    /* access modifiers changed from: protected */
    public final void handleData(C61889s sVar) {
        int i;
        List<User> list;
        if (sVar == null) {
            this.mData = null;
            return;
        }
        List<User> list2 = sVar.f140518f;
        int i2 = 0;
        if (list2 == null || list2.isEmpty()) {
            sVar.f140513a = 0;
        } else {
            List<User> list3 = sVar.f140518f;
            if (list3 != null) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (T t : list3) {
                    if (hashSet.add(t.getUid())) {
                        arrayList.add(t);
                    }
                }
                list3 = C89070n.m154585g((Collection) arrayList);
            }
            sVar.f140518f = list3;
            if (this.lastReadTimestamp <= 0 || (list = sVar.f140518f) == null || ((list instanceof Collection) && list.isEmpty())) {
                i = 0;
            } else {
                i = 0;
                for (T t2 : list) {
                    List<User> list4 = ((C61889s) this.mData).f140518f;
                    if (list4 != null) {
                        Iterator<T> it = list4.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            T next = it.next();
                            if (C89219l.m154714a((Object) t2.getUid(), (Object) next.getUid())) {
                                if (next != null) {
                                }
                            }
                        }
                    }
                    i++;
                    if (i < 0) {
                        C89070n.m154523b();
                    }
                }
            }
            C61889s sVar2 = (C61889s) this.mData;
            if (sVar2 != null) {
                i2 = sVar2.f140517e;
            }
            sVar.f140517e = i2 + i;
        }
        this.mData = sVar;
    }

    private final void fetchTranslationLikeList(long j, long j2) {
        NoticeApiManager.f140433a.fetchTranslationLikeList(this.subtitleId, this.itemId, j, j2).mo5534a(new TranslationLikeListModel$fetchTranslationLikeList$1(this), C1731i.f5564c, null);
    }

    public TranslationLikeListModel(String str, String str2, long j) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.subtitleId = str;
        this.itemId = str2;
        this.lastReadTimestamp = j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TranslationLikeListModel(String str, String str2, long j, int i, C89214g gVar) {
        this(str, str2, (i & 4) != 0 ? 0 : j);
    }

    static /* synthetic */ void fetchTranslationLikeList$default(TranslationLikeListModel translationLikeListModel, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = 0;
        }
        translationLikeListModel.fetchTranslationLikeList(j, j2);
    }
}
