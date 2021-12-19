package com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.c */
public final class C51393c {

    /* renamed from: a */
    public List<IMUser> f118454a = new ArrayList();

    static {
        Covode.recordClassIndex(60609);
    }

    /* renamed from: a */
    public final void mo86789a() {
        C1731i.m5640b(new CallableC51394a(this), C1731i.f5562a);
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.c$a */
    static final class CallableC51394a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C51393c f118455a;

        static {
            Covode.recordClassIndex(60610);
        }

        CallableC51394a(C51393c cVar) {
            this.f118455a = cVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f118455a.f118454a = C89070n.m154585g((Collection) IMService.createIIMServicebyMonsterPlugin(false).getAllFollowIMUsers());
            return C89391z.f203057a;
        }
    }
}
