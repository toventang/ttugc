package com.lynx.tasm.p2057f.p2058a;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import com.bytedance.covode.number.Covode;

/* renamed from: com.lynx.tasm.f.a.g */
public final class C28780g extends AbstractC28774a {

    /* renamed from: b */
    private RenderNode f67868b;

    static {
        Covode.recordClassIndex(34879);
    }

    /* access modifiers changed from: package-private */
    @Override // com.lynx.tasm.p2057f.p2058a.AbstractC28774a
    /* renamed from: a */
    public final void mo49891a() {
        this.f67868b = new RenderNode("");
    }

    @Override // com.lynx.tasm.p2057f.p2058a.AbstractC28774a
    /* renamed from: b */
    public final boolean mo49896b() {
        return this.f67868b.hasDisplayList();
    }

    @Override // com.lynx.tasm.p2057f.p2058a.AbstractC28774a
    /* renamed from: b */
    public final void mo49895b(Canvas canvas) {
        this.f67868b.endRecording();
    }

    @Override // com.lynx.tasm.p2057f.p2058a.AbstractC28774a
    /* renamed from: a */
    public final void mo49893a(Canvas canvas) {
        ((RecordingCanvas) canvas).drawRenderNode(this.f67868b);
    }

    @Override // com.lynx.tasm.p2057f.p2058a.AbstractC28774a
    /* renamed from: a */
    public final void mo49892a(int i, int i2) {
        this.f67868b.setPosition(0, 0, i, i2);
    }

    @Override // com.lynx.tasm.p2057f.p2058a.AbstractC28774a
    /* renamed from: b */
    public final /* synthetic */ Canvas mo49894b(int i, int i2) {
        return this.f67868b.beginRecording();
    }
}
