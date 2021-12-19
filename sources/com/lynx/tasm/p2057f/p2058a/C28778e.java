package com.lynx.tasm.p2057f.p2058a;

import android.graphics.Canvas;
import android.view.HardwareCanvas;
import android.view.RenderNode;
import android.view.View;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;

/* renamed from: com.lynx.tasm.f.a.e */
public final class C28778e extends AbstractC28774a {

    /* renamed from: c */
    private static Method f67865c;

    /* renamed from: b */
    private RenderNode f67866b;

    static {
        Covode.recordClassIndex(34877);
    }

    /* access modifiers changed from: package-private */
    @Override // com.lynx.tasm.p2057f.p2058a.AbstractC28774a
    /* renamed from: a */
    public final void mo49891a() {
        this.f67866b = RenderNode.create("", (View) null);
    }

    @Override // com.lynx.tasm.p2057f.p2058a.AbstractC28774a
    /* renamed from: b */
    public final boolean mo49896b() {
        return this.f67866b.isValid();
    }

    @Override // com.lynx.tasm.p2057f.p2058a.AbstractC28774a
    /* renamed from: b */
    public final void mo49895b(Canvas canvas) {
        this.f67866b.end((HardwareCanvas) canvas);
    }

    @Override // com.lynx.tasm.p2057f.p2058a.AbstractC28774a
    /* renamed from: a */
    public final void mo49893a(Canvas canvas) {
        ((HardwareCanvas) canvas).drawRenderNode(this.f67866b);
    }

    @Override // com.lynx.tasm.p2057f.p2058a.AbstractC28774a
    /* renamed from: a */
    public final void mo49892a(int i, int i2) {
        this.f67866b.setLeftTopRightBottom(0, 0, i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public HardwareCanvas mo49894b(int i, int i2) {
        try {
            if (f67865c == null) {
                Method declaredMethod = RenderNode.class.getDeclaredMethod("start", Integer.TYPE, Integer.TYPE);
                f67865c = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            return (HardwareCanvas) f67865c.invoke(this.f67866b, Integer.valueOf(i), Integer.valueOf(i2));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
