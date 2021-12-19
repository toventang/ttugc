package com.p2082ss.android.ugc.aweme.qrcode.presenter.p3658a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.p2082ss.android.ugc.aweme.qrcode.presenter.AbstractC66451d;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.qrcode.presenter.a.m */
public final class C66446m {
    static {
        Covode.recordClassIndex(77980);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.qrcode.presenter.a.m$a */
    public static final class C66447a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ ActivityC17312a f149370a;

        static {
            Covode.recordClassIndex(77981);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66447a(ActivityC17312a aVar) {
            super(0);
            this.f149370a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(!this.f149370a.isDestroyed());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.qrcode.presenter.a.m$b */
    public static final class C66448b extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC66451d f149371a;

        static {
            Covode.recordClassIndex(77982);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66448b(AbstractC66451d dVar) {
            super(1);
            this.f149371a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            int intValue = num.intValue();
            this.f149371a.mo105370b();
            this.f149371a.mo105369a(intValue);
            return C89391z.f203057a;
        }
    }
}
