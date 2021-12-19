package com.p2082ss.android.ugc.aweme.account.loginsetting;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.api.AccountApiInModule;
import com.p2082ss.android.ugc.aweme.utils.C80214ai;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.loginsetting.d */
public final class C32833d {

    /* renamed from: a */
    public static final C32833d f78199a = new C32833d();

    /* renamed from: b */
    private static final boolean f78200b = false;

    private C32833d() {
    }

    static {
        Covode.recordClassIndex(39617);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.loginsetting.d$a */
    public static final class C32834a<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ AbstractC32830a f78201a;

        static {
            Covode.recordClassIndex(39618);
        }

        C32834a(AbstractC32830a aVar) {
            this.f78201a = aVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            if (!C80214ai.m139043a(iVar)) {
                AbstractC32830a aVar = this.f78201a;
                if (aVar != null) {
                    aVar.mo58523a(false);
                }
            } else {
                C89219l.m154716b(iVar, "");
                C32831b bVar = (C32831b) iVar.mo5545d();
                AbstractC32830a aVar2 = this.f78201a;
                if (aVar2 != null) {
                    aVar2.mo58523a(bVar.f78196a.f78198a);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final void m67400a(String str, AbstractC32830a aVar) {
        if (TextUtils.isEmpty(str)) {
            aVar.mo58523a(false);
            return;
        }
        C1731i<C32831b> a = AccountApiInModule.m65852a(str);
        if (a == null) {
            aVar.mo58523a(false);
        } else {
            a.mo5532a(new C32834a(aVar));
        }
    }
}
