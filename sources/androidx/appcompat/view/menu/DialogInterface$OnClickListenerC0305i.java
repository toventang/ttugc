package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.DialogInterfaceC0216c;
import androidx.appcompat.view.menu.AbstractC0318o;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.appcompat.view.menu.i */
final class DialogInterface$OnClickListenerC0305i implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener, DialogInterface.OnKeyListener, AbstractC0318o.AbstractC0319a {

    /* renamed from: a */
    C0302h f1114a;

    /* renamed from: b */
    DialogInterfaceC0216c f1115b;

    /* renamed from: c */
    C0299f f1116c;

    /* renamed from: d */
    public AbstractC0318o.AbstractC0319a f1117d;

    static {
        Covode.recordClassIndex(342);
    }

    public DialogInterface$OnClickListenerC0305i(C0302h hVar) {
        this.f1114a = hVar;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o.AbstractC0319a
    /* renamed from: a */
    public final boolean mo560a(C0302h hVar) {
        AbstractC0318o.AbstractC0319a aVar = this.f1117d;
        if (aVar != null) {
            return aVar.mo560a(hVar);
        }
        return false;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f1116c.mo892a(this.f1114a, true);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o.AbstractC0319a
    /* renamed from: a */
    public final void mo559a(C0302h hVar, boolean z) {
        DialogInterfaceC0216c cVar;
        if ((z || hVar == this.f1114a) && (cVar = this.f1115b) != null) {
            cVar.dismiss();
        }
        AbstractC0318o.AbstractC0319a aVar = this.f1117d;
        if (aVar != null) {
            aVar.mo559a(hVar, z);
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f1114a.mo957a((C0306j) this.f1116c.mo932c().getItem(i), (AbstractC0318o) null, 0);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1115b.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1115b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1114a.mo956a(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1114a.performShortcut(i, keyEvent, 0);
    }
}
