package com.bytedance.tux.dialog.internal;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.Window;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.Window$CallbackC23058f;
import com.bytedance.tux.dialog.internal.AbstractC23064b;
import com.bytedance.tux.dialog.internal.C23068d;
import p4600h.C89379q;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.dialog.internal.a */
public abstract class AbstractDialogInterfaceC23060a<T extends AbstractC23064b<T, ?>> implements DialogInterface {

    /* renamed from: a */
    private final Window$CallbackC23058f.AbstractC23059a f54570a;

    /* renamed from: b */
    private AbstractC89124d<Object> f54571b;

    /* renamed from: e */
    public final C23068d f54572e;

    /* renamed from: f */
    public final Context f54573f;

    /* renamed from: g */
    public final DialogInterface.OnDismissListener f54574g;

    /* renamed from: h */
    public final DialogInterface.OnCancelListener f54575h;

    /* renamed from: i */
    public final DialogInterface.OnShowListener f54576i;

    /* renamed from: j */
    public Object f54577j;

    static {
        Covode.recordClassIndex(26980);
    }

    /* renamed from: b */
    public abstract Dialog mo37396b();

    public void cancel() {
        mo37396b().cancel();
    }

    public void dismiss() {
        mo37470a(null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo37471c() {
        Window window;
        mo37396b().setOnDismissListener(new DialogInterface$OnDismissListenerC23061a(this));
        mo37396b().setOnCancelListener(new DialogInterface$OnCancelListenerC23062b(this));
        if (this.f54576i != null) {
            mo37396b().setOnShowListener(new DialogInterface$OnShowListenerC23063c(this));
        }
        Window$CallbackC23058f.AbstractC23059a aVar = this.f54570a;
        if (aVar != null && (window = mo37396b().getWindow()) != null) {
            Window.Callback callback = window.getCallback();
            C89219l.m154709a((Object) callback, "");
            Window$CallbackC23058f fVar = new Window$CallbackC23058f(callback);
            fVar.f54568a = aVar;
            window.setCallback(fVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tux.dialog.internal.a$a */
    public static final class DialogInterface$OnDismissListenerC23061a implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ AbstractDialogInterfaceC23060a f54578a;

        static {
            Covode.recordClassIndex(26981);
        }

        DialogInterface$OnDismissListenerC23061a(AbstractDialogInterfaceC23060a aVar) {
            this.f54578a = aVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            DialogInterface.OnDismissListener onDismissListener = this.f54578a.f54574g;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(this.f54578a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tux.dialog.internal.a$b */
    public static final class DialogInterface$OnCancelListenerC23062b implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ AbstractDialogInterfaceC23060a f54579a;

        static {
            Covode.recordClassIndex(26982);
        }

        DialogInterface$OnCancelListenerC23062b(AbstractDialogInterfaceC23060a aVar) {
            this.f54579a = aVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            DialogInterface.OnCancelListener onCancelListener = this.f54579a.f54575h;
            if (onCancelListener != null) {
                onCancelListener.onCancel(this.f54579a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tux.dialog.internal.a$c */
    public static final class DialogInterface$OnShowListenerC23063c implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ AbstractDialogInterfaceC23060a f54580a;

        static {
            Covode.recordClassIndex(26983);
        }

        DialogInterface$OnShowListenerC23063c(AbstractDialogInterfaceC23060a aVar) {
            this.f54580a = aVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            this.f54580a.f54576i.onShow(this.f54580a);
        }
    }

    /* renamed from: a */
    public final void mo37470a(Object obj) {
        this.f54577j = obj;
        try {
            mo37396b().dismiss();
        } catch (Exception unused) {
            AbstractC89124d<Object> dVar = this.f54571b;
            if (dVar != null) {
                dVar.resumeWith(C89379q.m157068constructorimpl(null));
            }
        }
    }

    public AbstractDialogInterfaceC23060a(T t) {
        C89219l.m154719c(t, "");
        this.f54572e = C23068d.C23069a.m43492a(t.f54592n);
        this.f54573f = t.f54592n;
        this.f54570a = t.f54590l;
        this.f54574g = t.f54587i;
        this.f54575h = t.f54588j;
        this.f54576i = t.f54589k;
    }
}
