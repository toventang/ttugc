package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.live.broadcast.model.C3260f;
import com.bytedance.android.live.broadcast.preview.C3561v;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.broadcast.preview.y */
final /* synthetic */ class RunnableC3651y implements Runnable {

    /* renamed from: a */
    private final C3561v f10072a;

    /* renamed from: b */
    private final C3260f f10073b;

    static {
        Covode.recordClassIndex(4163);
    }

    RunnableC3651y(C3561v vVar, C3260f fVar) {
        this.f10072a = vVar;
        this.f10073b = fVar;
    }

    public final void run() {
        C3561v vVar = this.f10072a;
        C3260f fVar = this.f10073b;
        vVar.f9877g = new C3561v.C3562a(vVar.f9871a, vVar.f9872b, vVar.f9874d, IIconSlot.EnumC6149b.SLOT_BROADCAST_PREVIEW_PROMOTE, IIconSlot.EnumC6150c.PRIORITY);
        vVar.f9877g.f9881d.mo12060a("param_broadcast_preview_promote_bool", Boolean.valueOf(fVar.f9328c));
        vVar.f9877g.f9881d.mo12059a(vVar.f9871a, IIconSlot.EnumC6149b.SLOT_BROADCAST_PREVIEW_PROMOTE);
        vVar.f9872b.getLifecycle().mo4012a(vVar.f9877g.f9881d);
    }
}
