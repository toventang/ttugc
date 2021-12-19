package com.twitter.sdk.android.core.internal;

import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.C87795l;
import com.twitter.sdk.android.core.C87814u;
import com.twitter.sdk.android.core.internal.scribe.C87754a;
import com.twitter.sdk.android.core.internal.scribe.C87760ad;
import com.twitter.sdk.android.core.internal.scribe.C87764e;
import com.twitter.sdk.android.core.services.AccountService;
import java.io.IOException;

/* renamed from: com.twitter.sdk.android.core.internal.r */
public final class C87751r implements AbstractC87738o<C87814u> {

    /* renamed from: a */
    private final C87752a f199303a = new C87752a();

    /* renamed from: b */
    private final C87754a f199304b = C87760ad.f199335a;

    static {
        Covode.recordClassIndex(103747);
    }

    /* renamed from: com.twitter.sdk.android.core.internal.r$a */
    protected static class C87752a {
        static {
            Covode.recordClassIndex(103748);
        }

        protected C87752a() {
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.twitter.sdk.android.core.i] */
    @Override // com.twitter.sdk.android.core.internal.AbstractC87738o
    /* renamed from: a */
    public final /* synthetic */ void mo142185a(C87814u uVar) {
        C87795l lVar = new C87795l(uVar);
        if (!lVar.f199427a.contains(AccountService.class)) {
            lVar.f199427a.putIfAbsent(AccountService.class, lVar.f199428b.mo144318a(AccountService.class));
        }
        AccountService accountService = (AccountService) lVar.f199427a.get(AccountService.class);
        try {
            if (this.f199304b != null) {
                C87764e.C87765a aVar = new C87764e.C87765a();
                aVar.f199348a = "android";
                aVar.f199349b = "credentials";
                aVar.f199350c = "";
                aVar.f199351d = "";
                aVar.f199352e = "";
                aVar.f199353f = "impression";
                C87764e a = aVar.mo142219a();
                this.f199304b.mo142208a(a);
            }
            accountService.verifyCredentials(true, false, false).mo144267a();
        } catch (IOException | RuntimeException unused) {
        }
    }
}
