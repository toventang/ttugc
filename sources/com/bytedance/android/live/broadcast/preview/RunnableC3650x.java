package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.live.broadcast.model.C3260f;
import com.bytedance.android.live.broadcast.preview.C3561v;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.broadcast.preview.x */
final /* synthetic */ class RunnableC3650x implements Runnable {

    /* renamed from: a */
    private final C3561v f10070a;

    /* renamed from: b */
    private final C3260f f10071b;

    static {
        Covode.recordClassIndex(4162);
    }

    RunnableC3650x(C3561v vVar, C3260f fVar) {
        this.f10070a = vVar;
        this.f10071b = fVar;
    }

    public final void run() {
        C3561v vVar = this.f10070a;
        C3260f fVar = this.f10071b;
        vVar.f9876f = new C3561v.C3562a(vVar.f9871a, vVar.f9872b, vVar.f9874d, IIconSlot.EnumC6149b.SLOT_BROADCAST_PREVIEW_TOOLBAR, IIconSlot.EnumC6150c.AGGREGATE);
        vVar.f9876f.f9881d.mo12060a("param_live_commercial", Boolean.valueOf(fVar.f9327b));
        vVar.f9876f.f9881d.mo12060a("param_live_ba_link", Boolean.valueOf(fVar.f9329d));
        vVar.f9876f.f9881d.mo12059a(vVar.f9871a, IIconSlot.EnumC6149b.SLOT_BROADCAST_PREVIEW_TOOLBAR);
        vVar.f9872b.getLifecycle().mo4012a(vVar.f9876f.f9881d);
    }
}
