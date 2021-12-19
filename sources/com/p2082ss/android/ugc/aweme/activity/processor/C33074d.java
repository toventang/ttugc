package com.p2082ss.android.ugc.aweme.activity.processor;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.foundation.base.AbstractC17371f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.activity.processor.d */
public final class C33074d implements AbstractC17371f {

    /* renamed from: a */
    public final AbstractC33100u f78633a;

    /* renamed from: b */
    public final ActivityC17312a f78634b;

    static {
        Covode.recordClassIndex(39886);
    }

    /* renamed from: com.ss.android.ugc.aweme.activity.processor.d$a */
    public static final class C33075a extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C33074d f78635a;

        static {
            Covode.recordClassIndex(39887);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33075a(C33074d dVar) {
            super(1);
            this.f78635a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.getConfiguration().mo27699b().remove(this.f78635a);
            return C89391z.f203057a;
        }
    }

    private C33074d(ActivityC17312a aVar, AbstractC33100u uVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(uVar, "");
        this.f78634b = aVar;
        this.f78633a = uVar;
    }

    public /* synthetic */ C33074d(ActivityC17312a aVar, AbstractC33100u uVar, byte b) {
        this(aVar, uVar);
    }
}
