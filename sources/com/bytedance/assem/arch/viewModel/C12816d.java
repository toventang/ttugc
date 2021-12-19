package com.bytedance.assem.arch.viewModel;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.assem.arch.viewModel.d */
public final class C12816d implements Closeable, AbstractC89516am {

    /* renamed from: a */
    private final AbstractC89127f f31184a;

    static {
        Covode.recordClassIndex(14648);
    }

    @Override // kotlinx.coroutines.AbstractC89516am
    /* renamed from: a */
    public final AbstractC89127f mo20678a() {
        return this.f31184a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC89568bz bzVar = (AbstractC89568bz) this.f31184a.get(AbstractC89568bz.f203287c);
        if (bzVar != null) {
            bzVar.mo143985a((CancellationException) null);
        }
    }

    public C12816d(AbstractC89127f fVar) {
        C89219l.m154719c(fVar, "");
        this.f31184a = fVar;
    }
}
