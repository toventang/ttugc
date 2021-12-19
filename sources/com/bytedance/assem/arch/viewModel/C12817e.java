package com.bytedance.assem.arch.viewModel;

import com.bytedance.assem.arch.extensions.C12787j;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Executor;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89703z;
import kotlinx.coroutines.C89560br;
import kotlinx.coroutines.C89599cu;
import kotlinx.coroutines.ExecutorC89545be;
import p4600h.AbstractC89244h;
import p4600h.p4603c.AbstractC89127f;

/* renamed from: com.bytedance.assem.arch.viewModel.e */
public final class C12817e implements AbstractC89244h<AbstractC89516am> {

    /* renamed from: a */
    private AbstractC89516am f31185a;

    static {
        Covode.recordClassIndex(14649);
    }

    @Override // p4600h.AbstractC89244h
    public final boolean isInitialized() {
        return true;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // p4600h.AbstractC89244h
    public final /* synthetic */ AbstractC89516am getValue() {
        Executor executor;
        AbstractC89127f fVar;
        AbstractC89516am amVar = this.f31185a;
        if (amVar == null) {
            AbstractC89703z a = C89599cu.m155531a();
            Executor a2 = C12787j.m23009a();
            if (!(a2 instanceof ExecutorC89545be)) {
                executor = null;
            } else {
                executor = a2;
            }
            ExecutorC89545be beVar = (ExecutorC89545be) executor;
            if (beVar == null || (fVar = beVar.f203265a) == null) {
                fVar = new C89560br(a2);
            }
            amVar = new C12816d(a.plus(fVar));
            this.f31185a = amVar;
        }
        return amVar;
    }
}
