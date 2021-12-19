package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.trusted.C32087a;
import com.p2082ss.android.ugc.aweme.account.login.trusted.C32105h;
import com.p2082ss.android.ugc.aweme.account.login.trusted.C32106i;
import com.p2082ss.android.ugc.aweme.user.C80036a;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.services.LoginMethodService$updateLoginHistoryState$1 */
public final class LoginMethodService$updateLoginHistoryState$1 extends AbstractC89220m implements AbstractC89172b<C32087a, C89391z> {
    final /* synthetic */ AbstractC89172b $callback;
    final /* synthetic */ int $targetState;
    final /* synthetic */ LoginMethodService this$0;

    static {
        Covode.recordClassIndex(79677);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LoginMethodService$updateLoginHistoryState$1(LoginMethodService loginMethodService, int i, AbstractC89172b bVar) {
        super(1);
        this.this$0 = loginMethodService;
        this.$targetState = i;
        this.$callback = bVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final /* bridge */ /* synthetic */ C89391z invoke(C32087a aVar) {
        invoke(aVar);
        return C89391z.f203057a;
    }

    public final void invoke(C32087a aVar) {
        int i;
        String curSecUserId;
        C32087a.C32088a aVar2;
        if (aVar == null || (aVar2 = aVar.f76575b) == null) {
            i = -1;
        } else {
            i = aVar2.f76576a;
        }
        boolean z = false;
        if (i == this.$targetState && (curSecUserId = this.this$0.getCurSecUserId()) != null) {
            if (i == 1) {
                z = true;
            }
            C80036a.m138778a(curSecUserId, z);
            if (!z) {
                List<C32105h> b = C32106i.m66491b();
                Iterator<T> it = b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (C89219l.m154714a((Object) next.f76602b, (Object) curSecUserId)) {
                        if (next != null) {
                            b.remove(next);
                            C32106i.m66490a(b);
                        }
                    }
                }
            }
        }
        AbstractC89172b bVar = this.$callback;
        if (bVar != null) {
            bVar.invoke(Integer.valueOf(i));
        }
    }
}
