package com.p2082ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1204e.p1205a.C17305a;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.search.model.C67679e;
import com.p2082ss.android.ugc.aweme.search.model.C67681g;
import com.p2082ss.android.ugc.aweme.search.model.C67683h;
import com.p2082ss.android.ugc.aweme.search.service.ISearchUserService;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.model.SummonFriendSearchModelV2 */
public final class SummonFriendSearchModelV2 extends AbstractC39085b<C67683h> {
    private static final Companion Companion = new Companion(null);
    public static final int TOTAL_PARAMS_SIZE = 2;
    public boolean forceRefresh;
    private C67681g lastRequest;
    private final AbstractC89244h searchUserService$delegate = C89250i.m154773a((AbstractC89171a) SummonFriendSearchModelV2$searchUserService$2.INSTANCE);

    static {
        Covode.recordClassIndex(60923);
    }

    public final ISearchUserService getSearchUserService() {
        return (ISearchUserService) this.searchUserService$delegate.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.model.SummonFriendSearchModelV2$Companion */
    static final class Companion {
        static {
            Covode.recordClassIndex(60924);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }
    }

    public final String getKeyword() {
        String str;
        C67681g gVar = this.lastRequest;
        if (gVar == null || (str = gVar.f151684c) == null) {
            return "";
        }
        return str;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        C89219l.m154721d(objArr, "");
        if (objArr.length == 2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void handleData(C67683h hVar) {
        C67683h hVar2;
        List<? extends C67679e> list;
        List<String> list2;
        if (hVar != null) {
            if (this.mData == null) {
                this.mData = hVar;
            } else {
                C67683h hVar3 = (C67683h) this.mData;
                hVar3.f151689b = hVar.f151689b;
                hVar3.f151690c = hVar.f151690c;
                hVar3.f151691d = hVar.f151691d;
            }
            C67681g gVar = this.lastRequest;
            if (gVar == null || (list2 = gVar.f151687f) == null || !list2.isEmpty()) {
                List<? extends C67679e> list3 = hVar.f151688a;
                if (list3 != null) {
                    List<? extends C67679e> list4 = null;
                    if ((!list3.isEmpty()) && (hVar2 = (C67683h) this.mData) != null) {
                        C67683h hVar4 = (C67683h) this.mData;
                        if (!(hVar4 == null || (list = hVar4.f151688a) == null)) {
                            list4 = C89070n.m154572d((Collection) list, (Iterable) list3);
                        }
                        hVar2.f151688a = list4;
                        return;
                    }
                    return;
                }
                return;
            }
            C67683h hVar5 = (C67683h) this.mData;
            if (hVar5 != null) {
                hVar5.f151688a = hVar.f151688a;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean sendRequest(Object... objArr) {
        boolean z;
        C89219l.m154721d(objArr, "");
        if (!super.sendRequest(Arrays.copyOf(objArr, objArr.length))) {
            return false;
        }
        Object safeGet = safeGet(objArr, 0);
        C67681g gVar = null;
        if (!(safeGet instanceof Boolean)) {
            safeGet = null;
        }
        Boolean bool = (Boolean) safeGet;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.forceRefresh = z;
        Object safeGet2 = safeGet(objArr, 1);
        if (safeGet2 instanceof C67681g) {
            gVar = safeGet2;
        }
        C67681g gVar2 = gVar;
        if (gVar2 == null) {
            return false;
        }
        if (this.forceRefresh) {
            this.mIsLoading = false;
        }
        this.lastRequest = gVar2;
        C17305a.m32043a().mo27615a(this.mHandler, new SummonFriendSearchModelV2$sendRequest$1(this, gVar2), 0);
        return true;
    }

    private final <T> Object safeGet(T[] tArr, int i) {
        if (i < tArr.length) {
            return tArr[i];
        }
        return null;
    }
}
