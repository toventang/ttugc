package com.lynx.tasm.p2057f.p2058a;

import android.graphics.Canvas;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.lynx.tasm.f.a.f */
public final class C28779f extends AbstractC28774a {

    /* renamed from: b */
    private RenderNode f67867b;

    static {
        Covode.recordClassIndex(34878);
    }

    /* access modifiers changed from: package-private */
    @Override // com.lynx.tasm.p2057f.p2058a.AbstractC28774a
    /* renamed from: a */
    public final void mo49891a() {
        this.f67867b = RenderNode.create("", (View) null);
    }

    @Override // com.lynx.tasm.p2057f.p2058a.AbstractC28774a
    /* renamed from: b */
    public final boolean mo49896b() {
        return this.f67867b.isValid();
    }

    @Override // com.lynx.tasm.p2057f.p2058a.AbstractC28774a
    /* renamed from: b */
    public final void mo49895b(Canvas canvas) {
        this.f67867b.end((DisplayListCanvas) canvas);
    }

    @Override // com.lynx.tasm.p2057f.p2058a.AbstractC28774a
    /* renamed from: a */
    public final void mo49893a(Canvas canvas) {
        ((DisplayListCanvas) canvas).drawRenderNode(this.f67867b);
    }

    @Override // com.lynx.tasm.p2057f.p2058a.AbstractC28774a
    /* renamed from: a */
    public final void mo49892a(int i, int i2) {
        this.f67867b.setLeftTopRightBottom(0, 0, i, i2);
    }

    @Override // com.lynx.tasm.p2057f.p2058a.AbstractC28774a
    /* renamed from: b */
    public final /* synthetic */ Canvas mo49894b(int i, int i2) {
        return this.f67867b.start(i, i2);
    }
}
