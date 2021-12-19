package com.p2082ss.android.medialib.presenter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.medialib.RecordInvoker;
import com.p2082ss.android.medialib.presenter.AbstractC30029f;

/* renamed from: com.ss.android.medialib.presenter.i */
public final class C30049i implements AbstractC30029f {

    /* renamed from: a */
    private RecordInvoker f71738a;

    /* renamed from: com.ss.android.medialib.presenter.i$a */
    public interface AbstractC30050a {
        static {
            Covode.recordClassIndex(36536);
        }
    }

    /* renamed from: com.ss.android.medialib.presenter.i$b */
    public interface AbstractC30051b extends AbstractC30029f.AbstractC30030a {
        static {
            Covode.recordClassIndex(36537);
        }
    }

    static {
        Covode.recordClassIndex(36535);
    }

    @Override // com.p2082ss.android.medialib.presenter.AbstractC30029f
    /* renamed from: a */
    public final void mo53178a() {
        RecordInvoker recordInvoker = this.f71738a;
        if (recordInvoker != null) {
            recordInvoker.postDuetAction(0, 0);
        }
    }

    @Override // com.p2082ss.android.medialib.presenter.AbstractC30029f
    /* renamed from: b */
    public final void mo53181b() {
        RecordInvoker recordInvoker = this.f71738a;
        if (recordInvoker != null) {
            recordInvoker.postDuetAction(2, 0);
        }
    }

    C30049i(RecordInvoker recordInvoker) {
        this.f71738a = recordInvoker;
    }

    @Override // com.p2082ss.android.medialib.presenter.AbstractC30029f
    /* renamed from: a */
    public final void mo53180a(boolean z) {
        RecordInvoker recordInvoker = this.f71738a;
        if (recordInvoker != null) {
            recordInvoker.setEnableEffCtrl(z);
        }
    }

    @Override // com.p2082ss.android.medialib.presenter.AbstractC30029f
    /* renamed from: a */
    public final void mo53179a(AbstractC30029f.AbstractC30030a aVar) {
        RecordInvoker recordInvoker = this.f71738a;
        if (recordInvoker != null) {
            recordInvoker.setVEOnVideoEOFListener((AbstractC30051b) aVar);
        }
    }
}
