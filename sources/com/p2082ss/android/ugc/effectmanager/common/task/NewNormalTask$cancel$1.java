package com.p2082ss.android.ugc.effectmanager.common.task;

import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.effectmanager.common.task.NewNormalTask$cancel$1 */
final class NewNormalTask$cancel$1 extends AbstractC89220m implements AbstractC89171a<C89391z> {
    final /* synthetic */ NewNormalTask this$0;

    static {
        Covode.recordClassIndex(95497);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NewNormalTask$cancel$1(NewNormalTask newNormalTask) {
        super(0);
        this.this$0 = newNormalTask;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89171a
    public final void invoke() {
        this.this$0.onCancel();
        this.this$0.setBaseListener(null);
    }
}
