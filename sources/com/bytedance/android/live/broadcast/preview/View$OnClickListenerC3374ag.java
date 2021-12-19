package com.bytedance.android.live.broadcast.preview;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.broadcast.preview.C3561v;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.slot.AbstractC6157ab;
import com.bytedance.android.live.slot.AbstractC6162ae;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.broadcast.preview.ag */
public final /* synthetic */ class View$OnClickListenerC3374ag implements View.OnClickListener {

    /* renamed from: a */
    private final C3561v.C3562a f9596a;

    /* renamed from: b */
    private final AbstractC6157ab f9597b;

    static {
        Covode.recordClassIndex(3858);
    }

    View$OnClickListenerC3374ag(C3561v.C3562a aVar, AbstractC6157ab abVar) {
        this.f9596a = aVar;
        this.f9597b = abVar;
    }

    public final void onClick(View view) {
        C3561v.C3562a aVar = this.f9596a;
        IIconSlot iIconSlot = (IIconSlot) this.f9597b.mo12079f();
        if (iIconSlot != null) {
            AbstractC6162ae a = iIconSlot.mo12055a();
            if (a != null) {
                a.mo12082a(aVar.f9880c, "before_live");
            } else if (!TextUtils.isEmpty(null)) {
                ((IActionHandlerService) C6193a.m13435a(IActionHandlerService.class)).handleWithoutHost(aVar.f9878a, Uri.parse(null).toString());
            }
        }
    }
}
