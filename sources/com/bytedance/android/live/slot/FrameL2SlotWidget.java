package com.bytedance.android.live.slot;

import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.p408u.C6203g;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq;
import com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8095br;
import com.bytedance.android.livesdk.p453ap.C6808a;
import com.bytedance.android.livesdk.p453ap.C6812e;
import com.bytedance.android.livesdk.p561j.C9096dh;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;

public class FrameL2SlotWidget extends LiveRecyclableWidget implements IFrameSlot.AbstractC6145a, AbstractC8094bq, WeakHandler.IHandler, AbstractC33974au {

    /* renamed from: a */
    FrameSlotController f15288a;

    /* renamed from: b */
    public IFrameSlot f15289b;

    /* renamed from: c */
    IFrameSlot.SlotViewModel f15290c;

    /* renamed from: d */
    View f15291d;

    /* renamed from: e */
    boolean f15292e;

    /* renamed from: f */
    AbstractC88412b f15293f;

    static {
        Covode.recordClassIndex(6824);
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot.AbstractC6145a
    /* renamed from: a */
    public final void mo12018a(IFrameSlot.EnumC6147c cVar) {
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq
    /* renamed from: a */
    public final void mo10546a(Throwable th) {
        AbstractC8095br.m16255a(this, th);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return 0;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq
    /* renamed from: g */
    public final String mo10549g() {
        return getClass().getName();
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
        IFrameSlot.SlotViewModel slotViewModel = this.f15290c;
        if (slotViewModel != null) {
            slotViewModel.mo12054a(this);
        }
        AbstractC88412b bVar = this.f15293f;
        if (bVar != null) {
            bVar.dispose();
        }
        if (this.dataChannel != null) {
            this.dataChannel.mo28315b(C6812e.class, (Object) 0);
            this.dataChannel.mo28315b(C6808a.class, (Object) false);
        }
        this.f15292e = false;
        if (this.f15288a != null) {
            getLifecycle().mo4013b(this.f15288a);
            this.f15288a.onDestroy();
        }
        if (this.dataChannel != null) {
            this.dataChannel.mo28315b(C6812e.class, (Object) 0);
            this.dataChannel.mo28315b(C6808a.class, (Object) false);
            this.dataChannel.mo28316b(this);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object[] objArr) {
        hide();
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object[] objArr) {
        if (this.dataChannel.mo28318b(C9096dh.class) != null) {
            C6203g.m13467b(new RunnableC6174h(this), this);
        }
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot.AbstractC6145a
    /* renamed from: a */
    public final void mo12019a(C6165ah ahVar, IFrameSlot.SlotViewModel slotViewModel) {
        final AbstractC6157ab abVar = ahVar.f15398b;
        this.f15289b = (IFrameSlot) abVar.mo12079f();
        this.f15290c = slotViewModel;
        slotViewModel.f15346a.observe(this, new AbstractC1214u<Pair<Boolean, String>>() {
            /* class com.bytedance.android.live.slot.FrameL2SlotWidget.C61292 */

            static {
                Covode.recordClassIndex(6826);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Pair<Boolean, String> pair) {
                MethodCollector.m26663i(14214);
                Pair<Boolean, String> pair2 = pair;
                if (FrameL2SlotWidget.this.getView() == null || pair2 == null) {
                    MethodCollector.m26664o(14214);
                    return;
                }
                if (Boolean.TRUE.equals(pair2.first)) {
                    if ((FrameL2SlotWidget.this.getView() instanceof ViewGroup) && (!FrameL2SlotWidget.this.isShowing() || ((ViewGroup) Objects.requireNonNull(FrameL2SlotWidget.this.getView())).getChildCount() <= 0)) {
                        ((ViewGroup) FrameL2SlotWidget.this.getView()).removeAllViews();
                        FrameL2SlotWidget frameL2SlotWidget = FrameL2SlotWidget.this;
                        frameL2SlotWidget.f15291d = frameL2SlotWidget.f15289b.mo12051a(FrameL2SlotWidget.this.getContext());
                        if (FrameL2SlotWidget.this.f15291d != null) {
                            ((ViewGroup) FrameL2SlotWidget.this.getView()).addView(FrameL2SlotWidget.this.f15291d);
                            if (!FrameL2SlotWidget.this.f15292e) {
                                abVar.mo12073a("during_live");
                                FrameL2SlotWidget.this.show();
                                if (FrameL2SlotWidget.this.dataChannel != null) {
                                    FrameL2SlotWidget.this.dataChannel.mo28315b(C6808a.class, (Object) true);
                                }
                                Animation a = FrameL2SlotWidget.this.f15289b.mo12052a();
                                if (a != null) {
                                    FrameL2SlotWidget.this.f15291d.startAnimation(a);
                                }
                                if (!FrameL2SlotWidget.this.f15291d.hasOnClickListeners()) {
                                    FrameL2SlotWidget.this.f15291d.setOnClickListener(new View.OnClickListener() {
                                        /* class com.bytedance.android.live.slot.FrameL2SlotWidget.C61292.View$OnClickListenerC61301 */

                                        static {
                                            Covode.recordClassIndex(6827);
                                        }

                                        public final void onClick(View view) {
                                            if (!TextUtils.isEmpty(null)) {
                                                ((IHostAction) C6193a.m13435a(IHostAction.class)).openLiveBrowser((String) null, new Bundle(), FrameL2SlotWidget.this.getContext());
                                            }
                                        }
                                    });
                                }
                                FrameL2SlotWidget.this.f15291d.post(new Runnable() {
                                    /* class com.bytedance.android.live.slot.FrameL2SlotWidget.C61292.RunnableC61312 */

                                    static {
                                        Covode.recordClassIndex(6828);
                                    }

                                    public final void run() {
                                        if (FrameL2SlotWidget.this.dataChannel != null) {
                                            FrameL2SlotWidget.this.dataChannel.mo28315b(C6812e.class, Integer.valueOf(FrameL2SlotWidget.this.f15291d.getHeight()));
                                        }
                                    }
                                });
                                MethodCollector.m26664o(14214);
                                return;
                            }
                        }
                    }
                } else if (FrameL2SlotWidget.this.f15291d != null && FrameL2SlotWidget.this.isShowing()) {
                    Animation b = FrameL2SlotWidget.this.f15289b.mo12053b();
                    if (b == null || "visibility_reason_conflict".equals(pair2.second) || "visibility_reason_dispose".equals(pair2.second)) {
                        if (FrameL2SlotWidget.this.getView() instanceof ViewGroup) {
                            ((ViewGroup) FrameL2SlotWidget.this.getView()).removeAllViews();
                            FrameL2SlotWidget.this.hide();
                        }
                        if (FrameL2SlotWidget.this.dataChannel != null) {
                            FrameL2SlotWidget.this.dataChannel.mo28315b(C6812e.class, (Object) 0);
                            FrameL2SlotWidget.this.dataChannel.mo28315b(C6808a.class, (Object) false);
                            MethodCollector.m26664o(14214);
                            return;
                        }
                    } else {
                        b.setAnimationListener(new Animation.AnimationListener() {
                            /* class com.bytedance.android.live.slot.FrameL2SlotWidget.C61292.animationAnimation$AnimationListenerC61323 */

                            static {
                                Covode.recordClassIndex(6829);
                            }

                            public final void onAnimationRepeat(Animation animation) {
                            }

                            public final void onAnimationStart(Animation animation) {
                            }

                            public final void onAnimationEnd(Animation animation) {
                                View view = FrameL2SlotWidget.this.getView();
                                if (view != null) {
                                    view.post(new RunnableC6178l(this, view));
                                }
                                if (FrameL2SlotWidget.this.dataChannel != null) {
                                    FrameL2SlotWidget.this.dataChannel.mo28315b(C6812e.class, (Object) 0);
                                    FrameL2SlotWidget.this.dataChannel.mo28315b(C6808a.class, (Object) false);
                                }
                            }
                        });
                        FrameL2SlotWidget.this.f15291d.startAnimation(b);
                    }
                }
                MethodCollector.m26664o(14214);
            }
        });
    }
}
