package com.bytedance.android.livesdk.util.rxutils.p646a;

import android.os.Looper;
import android.view.View;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.AbstractC88389a;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.util.rxutils.a.b */
public final class C11123b extends AbstractC88979t<Object> {

    /* renamed from: a */
    private final View f26736a;

    static {
        Covode.recordClassIndex(12748);
    }

    /* renamed from: com.bytedance.android.livesdk.util.rxutils.a.b$a */
    static final class View$OnClickListenerC11124a extends AbstractC88389a implements View.OnClickListener {

        /* renamed from: a */
        private final View f26737a;

        /* renamed from: b */
        private final AbstractC88986z<? super Object> f26738b;

        static {
            Covode.recordClassIndex(12749);
        }

        @Override // p4560f.p4561a.p4562a.AbstractC88389a
        /* renamed from: a */
        public final void mo17923a() {
            this.f26737a.setOnClickListener(null);
        }

        public final void onClick(View view) {
            if (!isDisposed()) {
                this.f26738b.onNext(C11122a.f26735a);
            }
        }

        View$OnClickListenerC11124a(View view, AbstractC88986z<? super Object> zVar) {
            this.f26737a = view;
            this.f26738b = zVar;
        }
    }

    C11123b(View view) {
        this.f26736a = view;
    }

    @Override // p4560f.p4561a.AbstractC88979t
    /* renamed from: a */
    public final void mo17922a(AbstractC88986z<? super Object> zVar) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            zVar.onError(new IllegalStateException("Expected to be called on the main thread but was " + Thread.currentThread().getName()));
            return;
        }
        View$OnClickListenerC11124a aVar = new View$OnClickListenerC11124a(this.f26736a, zVar);
        zVar.onSubscribe(aVar);
        this.f26736a.setOnClickListener(aVar);
    }
}
