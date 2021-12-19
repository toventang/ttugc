package com.bytedance.android.livesdk.util.rxutils.autodispose.p647a;

import android.os.Build;
import android.view.View;
import com.bytedance.android.livesdk.util.rxutils.autodispose.C11135aa;
import com.bytedance.android.livesdk.util.rxutils.autodispose.p647a.p648a.C11130a;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88427d;
import p4560f.p4561a.AbstractC88917f;
import p4560f.p4561a.p4562a.AbstractC88389a;

/* renamed from: com.bytedance.android.livesdk.util.rxutils.autodispose.a.b */
final class C11132b implements AbstractC88917f {

    /* renamed from: a */
    private final View f26753a;

    static {
        Covode.recordClassIndex(12759);
    }

    /* renamed from: com.bytedance.android.livesdk.util.rxutils.autodispose.a.b$a */
    static final class View$OnAttachStateChangeListenerC11133a extends AbstractC88389a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        private final View f26754a;

        /* renamed from: b */
        private final AbstractC88427d f26755b;

        static {
            Covode.recordClassIndex(12760);
        }

        public final void onViewAttachedToWindow(View view) {
        }

        @Override // p4560f.p4561a.p4562a.AbstractC88389a
        /* renamed from: a */
        public final void mo17923a() {
            this.f26754a.removeOnAttachStateChangeListener(this);
        }

        public final void onViewDetachedFromWindow(View view) {
            if (!isDisposed()) {
                this.f26755b.onComplete();
            }
        }

        View$OnAttachStateChangeListenerC11133a(View view, AbstractC88427d dVar) {
            this.f26754a = view;
            this.f26755b = dVar;
        }
    }

    C11132b(View view) {
        this.f26753a = view;
    }

    @Override // p4560f.p4561a.AbstractC88917f
    /* renamed from: a */
    public final void mo17931a(AbstractC88427d dVar) {
        View$OnAttachStateChangeListenerC11133a aVar = new View$OnAttachStateChangeListenerC11133a(this.f26753a, dVar);
        dVar.onSubscribe(aVar);
        if (!C11129a.m19768a(C11130a.f26751a)) {
            dVar.onError(new IllegalStateException("Views can only be bound to on the main thread!"));
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (this.f26753a.isAttachedToWindow() || this.f26753a.getWindowToken() != null) {
            this.f26753a.addOnAttachStateChangeListener(aVar);
            if (aVar.isDisposed()) {
                this.f26753a.removeOnAttachStateChangeListener(aVar);
                return;
            }
            return;
        }
        dVar.onError(new C11135aa("View is not attached!"));
    }
}
