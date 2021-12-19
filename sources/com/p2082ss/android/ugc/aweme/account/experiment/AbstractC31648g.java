package com.p2082ss.android.ugc.aweme.account.experiment;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IGuestModeService;
import com.p2082ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.account.experiment.g */
public abstract class AbstractC31648g {

    /* renamed from: a */
    private final AbstractC89244h f75703a = C89250i.m154773a((AbstractC89171a) C31649a.f75704a);

    static {
        Covode.recordClassIndex(38379);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.experiment.g$a */
    static final class C31649a extends AbstractC89220m implements AbstractC89171a<IGuestModeService> {

        /* renamed from: a */
        public static final C31649a f75704a = new C31649a();

        static {
            Covode.recordClassIndex(38380);
        }

        C31649a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IGuestModeService invoke() {
            return GuestModeServiceImpl.m65990d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo57652c() {
        if (((IGuestModeService) this.f75703a.getValue()).mo57219c()) {
            return false;
        }
        return true;
    }
}
