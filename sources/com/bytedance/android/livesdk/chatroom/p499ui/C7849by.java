package com.bytedance.android.livesdk.chatroom.p499ui;

import android.widget.FrameLayout;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.p261b.C4420i;
import com.bytedance.android.live.liveinteract.api.p261b.C4423l;
import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.android.livesdk.chatroom.p499ui.C7822br;
import com.bytedance.android.livesdkapi.view.AbstractC11877e;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.by */
final /* synthetic */ class C7849by implements AbstractC89172b {

    /* renamed from: a */
    private final C7822br f19569a;

    static {
        Covode.recordClassIndex(8644);
    }

    C7849by(C7822br brVar) {
        this.f19569a = brVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        C7822br brVar = this.f19569a;
        C4423l lVar = (C4423l) obj;
        if (!lVar.f12026d && brVar.isViewValid() && !brVar.mStatusDestroyed) {
            brVar.f19471as = lVar.f12023a != EnumC4422k.NORMAL;
            int i = C7822br.C78409.f19545a[lVar.f12023a.ordinal()];
            if (i != 1) {
                if (i == 2 || i == 3) {
                    if (brVar.f19404C != null && (brVar.f19404C.f19173a instanceof AbstractC11877e) && lVar.f12025c) {
                        brVar.f19404C.f19173a.post(new Runnable(lVar) {
                            /* class com.bytedance.android.livesdk.chatroom.p499ui.C7822br.RunnableC783116 */

                            /* renamed from: a */
                            final /* synthetic */ C4423l f19533a;

                            static {
                                Covode.recordClassIndex(8626);
                            }

                            public final void run() {
                                C7822br.this.mo14129m();
                                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) C7822br.this.f19404C.mo13987b();
                                layoutParams.width = C7822br.this.f19404C.f19173a.getWidth();
                                layoutParams.height = C7822br.this.f19404C.f19173a.getHeight();
                                int min = Math.min(C3966y.m9664c(), C3966y.m9662b());
                                if (C7822br.this.f19404C.f19173a.getWidth() < min) {
                                    layoutParams.gravity = 48;
                                    layoutParams.leftMargin = (min - C7822br.this.f19404C.f19173a.getWidth()) / 2;
                                    C7822br.this.f19423V.mo28320c(C4420i.class, Integer.valueOf(C7822br.this.f19404C.f19173a.getWidth()));
                                } else {
                                    layoutParams.gravity = 49;
                                    layoutParams.leftMargin = 0;
                                }
                                if (this.f19533a.f12024b == null || !this.f19533a.f12031i) {
                                    layoutParams.topMargin = 0;
                                } else {
                                    double top = (double) (this.f19533a.f12024b.getTop() + this.f19533a.f12024b.getHeight());
                                    double height = (double) C7822br.this.f19404C.f19173a.getHeight();
                                    Double.isNaN(height);
                                    Double.isNaN(top);
                                    layoutParams.topMargin = (int) (top - (height * 0.5d));
                                }
                                C7822br.this.f19404C.mo13986a(layoutParams);
                            }

                            {
                                this.f19533a = r2;
                            }
                        });
                    }
                } else if (i != 4) {
                    brVar.mo14129m();
                } else {
                    brVar.mo14129m();
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) brVar.f19404C.mo13987b();
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                    layoutParams.gravity = 85;
                    layoutParams.rightMargin = 0;
                    layoutParams.bottomMargin = 0;
                    brVar.f19404C.mo13986a(layoutParams);
                }
            } else if (!(lVar.f12027e == 0 || lVar.f12028f == 0)) {
                brVar.f19404C.f19173a.post(new Runnable(lVar) {
                    /* class com.bytedance.android.livesdk.chatroom.p499ui.C7822br.RunnableC783015 */

                    /* renamed from: a */
                    final /* synthetic */ C4423l f19531a;

                    static {
                        Covode.recordClassIndex(8625);
                    }

                    public final void run() {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) C7822br.this.f19404C.mo13987b();
                        layoutParams.width = this.f19531a.f12027e;
                        layoutParams.height = this.f19531a.f12028f;
                        layoutParams.gravity = 85;
                        layoutParams.rightMargin = this.f19531a.f12030h;
                        layoutParams.bottomMargin = this.f19531a.f12029g;
                        C7822br.this.f19404C.mo13986a(layoutParams);
                    }

                    {
                        this.f19531a = r2;
                    }
                });
            }
        }
        return C89391z.f203057a;
    }
}
