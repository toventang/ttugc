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
import com.bytedance.android.livesdk.p453ap.C6811d;
import com.bytedance.android.livesdk.p561j.C9096dh;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class FrameSlotWidget extends LiveRecyclableWidget implements IFrameSlot.AbstractC6145a, AbstractC8094bq, WeakHandler.IHandler, AbstractC33974au {

    /* renamed from: a */
    FrameSlotController f15333a;

    /* renamed from: b */
    View f15334b;

    /* renamed from: c */
    IFrameSlot.EnumC6147c f15335c;

    /* renamed from: d */
    Queue<C6165ah> f15336d;

    /* renamed from: e */
    Map<C6165ah, IFrameSlot.SlotViewModel> f15337e;

    /* renamed from: f */
    private IFrameSlot.SlotViewModel f15338f;

    static {
        Covode.recordClassIndex(6840);
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
        IFrameSlot.SlotViewModel slotViewModel = this.f15338f;
        if (slotViewModel != null) {
            slotViewModel.mo12054a(this);
        }
        Map<C6165ah, IFrameSlot.SlotViewModel> map = this.f15337e;
        if (map != null) {
            for (IFrameSlot.SlotViewModel slotViewModel2 : map.values()) {
                slotViewModel2.mo12054a(this);
            }
            this.f15337e.clear();
        }
        if (this.f15333a != null) {
            getLifecycle().mo4013b(this.f15333a);
            this.f15333a.onDestroy();
        }
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot.AbstractC6145a
    /* renamed from: a */
    public final void mo12018a(IFrameSlot.EnumC6147c cVar) {
        this.f15335c = cVar;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object[] objArr) {
        hide();
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object[] objArr) {
        if (this.dataChannel.mo28318b(C9096dh.class) != null) {
            this.f15336d = new PriorityBlockingQueue(3, new Comparator<C6165ah>() {
                /* class com.bytedance.android.live.slot.FrameSlotWidget.C61411 */

                static {
                    Covode.recordClassIndex(6841);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // java.util.Comparator
                public final /* bridge */ /* synthetic */ int compare(C6165ah ahVar, C6165ah ahVar2) {
                    return ahVar.f15397a - ahVar2.f15397a;
                }
            });
            this.f15337e = new HashMap();
            C6203g.m13467b(new RunnableC6185s(this), this);
        }
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot.AbstractC6145a
    /* renamed from: a */
    public final void mo12019a(final C6165ah ahVar, final IFrameSlot.SlotViewModel slotViewModel) {
        this.f15336d.add(ahVar);
        this.f15337e.put(ahVar, slotViewModel);
        final IFrameSlot iFrameSlot = (IFrameSlot) ahVar.f15398b.mo12079f();
        if (this.f15335c == IFrameSlot.EnumC6147c.LAST) {
            slotViewModel.f15346a.observe(this, new AbstractC1214u<Pair<Boolean, String>>() {
                /* class com.bytedance.android.live.slot.FrameSlotWidget.C61422 */

                static {
                    Covode.recordClassIndex(6842);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.AbstractC1214u
                public final /* synthetic */ void onChanged(Pair<Boolean, String> pair) {
                    MethodCollector.m26663i(12180);
                    Pair<Boolean, String> pair2 = pair;
                    if (FrameSlotWidget.this.getView() == null || pair2 == null) {
                        MethodCollector.m26664o(12180);
                        return;
                    }
                    if (Boolean.TRUE.equals(slotViewModel.f15347b.getValue()) || Boolean.TRUE.equals(pair2.first)) {
                        if (!Boolean.TRUE.equals(slotViewModel.f15347b.getValue()) && Boolean.TRUE.equals(pair2.first)) {
                            for (C6165ah ahVar : FrameSlotWidget.this.f15336d) {
                                IFrameSlot.SlotViewModel slotViewModel = FrameSlotWidget.this.f15337e.get(ahVar);
                                if (ahVar != ahVar && Boolean.TRUE.equals(slotViewModel.f15347b.getValue())) {
                                    slotViewModel.f15347b.setValue(false);
                                }
                            }
                            slotViewModel.f15347b.setValue(true);
                        }
                        if (Boolean.TRUE.equals(pair2.first)) {
                            if (FrameSlotWidget.this.dataChannel != null) {
                                FrameSlotWidget.this.dataChannel.mo28315b(C6811d.class, (Object) true);
                            }
                            ahVar.f15398b.mo12073a("during_live");
                            FrameSlotWidget.this.show();
                            if (FrameSlotWidget.this.getView() instanceof ViewGroup) {
                                ((ViewGroup) FrameSlotWidget.this.getView()).removeAllViews();
                            }
                            FrameSlotWidget frameSlotWidget = FrameSlotWidget.this;
                            frameSlotWidget.f15334b = iFrameSlot.mo12051a(frameSlotWidget.getContext());
                            if (FrameSlotWidget.this.getView() instanceof ViewGroup) {
                                ((ViewGroup) FrameSlotWidget.this.getView()).addView(FrameSlotWidget.this.f15334b);
                            }
                            Animation a = iFrameSlot.mo12052a();
                            if (a != null) {
                                FrameSlotWidget.this.f15334b.startAnimation(a);
                            }
                            if (FrameSlotWidget.this.f15334b != null && !FrameSlotWidget.this.f15334b.hasOnClickListeners()) {
                                FrameSlotWidget.this.f15334b.setOnClickListener(new View.OnClickListener() {
                                    /* class com.bytedance.android.live.slot.FrameSlotWidget.C61422.View$OnClickListenerC61431 */

                                    static {
                                        Covode.recordClassIndex(6843);
                                    }

                                    public final void onClick(View view) {
                                        if (!TextUtils.isEmpty(null)) {
                                            ((IHostAction) C6193a.m13435a(IHostAction.class)).openLiveBrowser((String) null, new Bundle(), FrameSlotWidget.this.getContext());
                                        }
                                    }
                                });
                            }
                            MethodCollector.m26664o(12180);
                            return;
                        } else if (FrameSlotWidget.this.f15334b != null) {
                            if (FrameSlotWidget.this.dataChannel != null) {
                                FrameSlotWidget.this.dataChannel.mo28315b(C6811d.class, (Object) false);
                            }
                            Animation b = iFrameSlot.mo12053b();
                            if (b == null || "visibility_reason_conflict".equals(pair2.second) || "visibility_reason_dispose".equals(pair2.second)) {
                                if (FrameSlotWidget.this.getView() instanceof ViewGroup) {
                                    ((ViewGroup) FrameSlotWidget.this.getView()).removeAllViews();
                                }
                                FrameSlotWidget.this.hide();
                                MethodCollector.m26664o(12180);
                                return;
                            }
                            b.setAnimationListener(new Animation.AnimationListener() {
                                /* class com.bytedance.android.live.slot.FrameSlotWidget.C61422.animationAnimation$AnimationListenerC61442 */

                                static {
                                    Covode.recordClassIndex(6844);
                                }

                                public final void onAnimationRepeat(Animation animation) {
                                }

                                public final void onAnimationStart(Animation animation) {
                                }

                                public final void onAnimationEnd(Animation animation) {
                                    View view = FrameSlotWidget.this.getView();
                                    if (view != null) {
                                        view.post(new RunnableC6186t(this, view));
                                    }
                                }
                            });
                            FrameSlotWidget.this.f15334b.startAnimation(b);
                        }
                    }
                    MethodCollector.m26664o(12180);
                }
            });
        }
    }
}
