package com.p2082ss.android.ugc.aweme.ecommerce.gallery.transfer;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.appcompat.app.DialogInterfaceC0216c;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.gallery.transfer.C44507e;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.transfer.g */
public final class DialogInterface$OnKeyListenerC44515g implements DialogInterface.OnKeyListener, DialogInterface.OnShowListener, C44507e.AbstractC44513a {

    /* renamed from: a */
    public Dialog f103809a;

    /* renamed from: b */
    public C44507e f103810b;

    /* renamed from: c */
    public C44503d f103811c;

    /* renamed from: d */
    public boolean f103812d;

    /* renamed from: e */
    private Context f103813e;

    static {
        Covode.recordClassIndex(52865);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.gallery.transfer.C44507e.AbstractC44513a
    /* renamed from: a */
    public final void mo75546a() {
        try {
            this.f103809a.dismiss();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f103812d = false;
    }

    public final void onShow(DialogInterface dialogInterface) {
        this.f103810b.mo75525b();
    }

    /* renamed from: a */
    private static void m87227a(View view) {
        while (true) {
            view.setFitsSystemWindows(false);
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                view = (View) parent;
            } else {
                return;
            }
        }
    }

    public DialogInterface$OnKeyListenerC44515g(Context context) {
        this.f103813e = context;
        C44507e eVar = new C44507e(this.f103813e);
        this.f103810b = eVar;
        eVar.setOnLayoutResetListener(this);
        DialogInterfaceC0216c.C0217a aVar = new DialogInterfaceC0216c.C0217a(this.f103813e, R.style.vq);
        aVar.f645a.f619z = this.f103810b;
        aVar.f645a.f618y = 0;
        aVar.f645a.f583E = false;
        DialogInterfaceC0216c a = aVar.mo453a();
        this.f103809a = a;
        a.setOnShowListener(this);
        this.f103809a.setOnKeyListener(this);
        m87227a(this.f103810b);
    }

    /* renamed from: a */
    public final void mo75549a(List<ImageView> list) {
        int size = this.f103811c.f103754j.size();
        for (int i = 0; i < size; i++) {
            list.add(null);
        }
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 1 && !keyEvent.isCanceled() && this.f103812d && this.f103810b.mo75524a(this.f103811c.f103745a)) {
            this.f103812d = false;
        }
        return true;
    }
}
