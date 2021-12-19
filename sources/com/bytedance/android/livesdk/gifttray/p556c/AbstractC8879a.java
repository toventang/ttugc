package com.bytedance.android.livesdk.gifttray.p556c;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.gifttray.p554a.C8871a;
import com.bytedance.android.livesdk.service.animation.AbstractC10652c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.gifttray.c.a */
public abstract class AbstractC8879a extends FrameLayout {

    /* renamed from: a */
    private int f21881a = 1;

    static {
        Covode.recordClassIndex(9763);
    }

    /* renamed from: a */
    public void mo15136a() {
    }

    /* renamed from: a */
    public void mo15138a(AbstractC10652c cVar) {
    }

    /* renamed from: a */
    public void mo15139a(AbstractC10652c cVar, Boolean bool) {
    }

    /* renamed from: a */
    public abstract void mo15140a(DataChannel dataChannel);

    /* renamed from: b */
    public void mo15141b() {
    }

    public abstract void setGiftMessage(C8871a aVar);

    /* access modifiers changed from: protected */
    public final int getMIndex() {
        return this.f21881a;
    }

    /* access modifiers changed from: protected */
    public final void setMIndex(int i) {
        this.f21881a = i;
    }

    public final void setTrackNum(int i) {
        this.f21881a = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC8879a(Context context) {
        super(context);
        C89219l.m154721d(context, "");
    }

    /* renamed from: a */
    public final void mo15137a(int i, int i2) {
        setX((float) i);
        setY((float) i2);
    }
}
