package com.lynx.tasm.behavior.p2052ui.canvas;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.p2052ui.LynxUI;

/* renamed from: com.lynx.tasm.behavior.ui.canvas.LynxHeliumCanvas */
public class LynxHeliumCanvas extends LynxUI<LynxHeliumCanvasView> {
    private boolean mConsumeAllEvents = false;
    private Long mRuntimeId = this.mContext.mo49043c();

    static {
        Covode.recordClassIndex(34655);
    }

    public Long getRuntimeId() {
        return this.mRuntimeId;
    }

    @AbstractC28525m(mo49059a = "consume-android-events")
    public void setConsumeAllEvents(boolean z) {
        this.mConsumeAllEvents = z;
        if (this.mView != null) {
            ((LynxHeliumCanvasView) this.mView).setConsumeAllEvents(this.mConsumeAllEvents);
        }
    }

    public LynxHeliumCanvas(Context context) {
        super(context);
        LynxHelium.getInstance().onLynxCanvasUIInit(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public LynxHeliumCanvasView createView(Context context) {
        LynxHeliumCanvasView lynxHeliumCanvasView = new LynxHeliumCanvasView(context);
        lynxHeliumCanvasView.setCanvasUI(this);
        lynxHeliumCanvasView.setConsumeAllEvents(this.mConsumeAllEvents);
        this.mView = lynxHeliumCanvasView;
        ((LynxHeliumCanvasView) this.mView).setOpaque(false);
        return (LynxHeliumCanvasView) this.mView;
    }
}
