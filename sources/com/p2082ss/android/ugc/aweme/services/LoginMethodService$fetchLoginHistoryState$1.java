package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.trusted.C32087a;
import com.p2082ss.android.ugc.aweme.user.C80036a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.services.LoginMethodService$fetchLoginHistoryState$1 */
final class LoginMethodService$fetchLoginHistoryState$1 extends AbstractC89220m implements AbstractC89172b<C32087a, C89391z> {
    final /* synthetic */ AbstractC89172b $callback;
    final /* synthetic */ LoginMethodService this$0;

    static {
        Covode.recordClassIndex(79676);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LoginMethodService$fetchLoginHistoryState$1(LoginMethodService loginMethodService, AbstractC89172b bVar) {
        super(1);
        this.this$0 = loginMethodService;
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
        C32087a.C32088a aVar2;
        if (aVar == null || (aVar2 = aVar.f76575b) == null) {
            i = -1;
        } else {
            i = aVar2.f76576a;
        }
        String curSecUserId = this.this$0.getCurSecUserId();
        if (!(curSecUserId == null || i == -1 || i == 0)) {
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            C80036a.m138778a(curSecUserId, z);
        }
        AbstractC89172b bVar = this.$callback;
        if (bVar != null) {
            bVar.invoke(Integer.valueOf(i));
        }
    }
}
