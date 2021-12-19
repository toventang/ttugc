package com.bytedance.android.live.slot;

import com.bytedance.android.livesdk.chatroom.p488c.C7401r;
import com.bytedance.android.livesdk.p453ap.C6808a;
import com.bytedance.android.livesdk.p453ap.C6812e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.live.slot.k */
final /* synthetic */ class C6177k implements AbstractC88433f {

    /* renamed from: a */
    private final FrameL2SlotWidget f15419a;

    static {
        Covode.recordClassIndex(6883);
    }

    C6177k(FrameL2SlotWidget frameL2SlotWidget) {
        this.f15419a = frameL2SlotWidget;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        FrameL2SlotWidget frameL2SlotWidget = this.f15419a;
        C7401r rVar = (C7401r) obj;
        frameL2SlotWidget.f15292e = rVar.f18339b;
        if (frameL2SlotWidget.getView() != null && frameL2SlotWidget.f15291d != null && frameL2SlotWidget.f15290c != null && frameL2SlotWidget.f15290c.f15346a.getValue() != null && ((Boolean) frameL2SlotWidget.f15290c.f15346a.getValue().first).booleanValue()) {
            if (rVar.f18339b) {
                frameL2SlotWidget.hide();
            } else {
                frameL2SlotWidget.show();
            }
            frameL2SlotWidget.dataChannel.mo28315b(C6808a.class, Boolean.valueOf(!rVar.f18339b));
            frameL2SlotWidget.f15291d.post(new Runnable(rVar) {
                /* class com.bytedance.android.live.slot.FrameL2SlotWidget.RunnableC61281 */

                /* renamed from: a */
                final /* synthetic */ C7401r f15294a;

                static {
                    Covode.recordClassIndex(6825);
                }

                public final void run() {
                    int height;
                    if (FrameL2SlotWidget.this.dataChannel != null) {
                        DataChannel dataChannel = FrameL2SlotWidget.this.dataChannel;
                        if (this.f15294a.f18339b) {
                            height = 0;
                        } else {
                            height = FrameL2SlotWidget.this.f15291d.getHeight();
                        }
                        dataChannel.mo28315b(C6812e.class, Integer.valueOf(height));
                    }
                }

                {
                    this.f15294a = r2;
                }
            });
        }
    }
}
