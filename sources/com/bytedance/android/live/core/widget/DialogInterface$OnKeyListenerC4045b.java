package com.bytedance.android.live.core.widget;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.core.widget.b */
public final /* synthetic */ class DialogInterface$OnKeyListenerC4045b implements DialogInterface.OnKeyListener {

    /* renamed from: a */
    private final C4031a f11183a;

    static {
        Covode.recordClassIndex(4586);
    }

    DialogInterface$OnKeyListenerC4045b(C4031a aVar) {
        this.f11183a = aVar;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (4 != i) {
            return false;
        }
        keyEvent.getAction();
        return false;
    }
}
