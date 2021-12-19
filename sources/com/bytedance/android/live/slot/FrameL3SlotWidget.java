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
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.p408u.C6203g;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq;
import com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8095br;
import com.bytedance.android.livesdk.p453ap.C6809b;
import com.bytedance.android.livesdk.p453ap.C6810c;
import com.bytedance.android.livesdk.p561j.C9096dh;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4565b.AbstractC88412b;

public class FrameL3SlotWidget extends LiveRecyclableWidget implements IFrameSlot.AbstractC6145a, AbstractC8094bq, WeakHandler.IHandler, AbstractC33974au {

    /* renamed from: a */
    FrameSlotController f15301a;

    /* renamed from: b */
    public IFrameSlot f15302b;

    /* renamed from: c */
    IFrameSlot.SlotViewModel f15303c;

    /* renamed from: d */
    View f15304d;

    /* renamed from: e */
    AbstractC88412b f15305e;

    /* renamed from: f */
    AbstractC88412b f15306f;

    /* renamed from: g */
    boolean f15307g;

    /* renamed from: h */
    int f15308h;

    static {
        Covode.recordClassIndex(6830);
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

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12026a() {
        IFrameSlot.SlotViewModel slotViewModel;
        if (getView() != null && this.f15304d != null && (slotViewModel = this.f15303c) != null && slotViewModel.f15346a.getValue() != null && ((Boolean) this.f15303c.f15346a.getValue().first).booleanValue()) {
            final boolean z = true;
            if (this.f15308h > 1 || this.f15307g) {
                z = false;
                hide();
            } else {
                show();
            }
            this.dataChannel.mo28315b(C6810c.class, Boolean.valueOf(z));
            this.f15304d.post(new Runnable() {
                /* class com.bytedance.android.live.slot.FrameL3SlotWidget.RunnableC61331 */

                static {
                    Covode.recordClassIndex(6831);
                }

                public final void run() {
                    int i;
                    if (FrameL3SlotWidget.this.dataChannel != null) {
                        DataChannel dataChannel = FrameL3SlotWidget.this.dataChannel;
                        if (z) {
                            i = FrameL3SlotWidget.this.f15304d.getHeight();
                        } else {
                            i = 0;
                        }
                        dataChannel.mo28315b(C6809b.class, Integer.valueOf(i));
                    }
                }
            });
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
        IFrameSlot.SlotViewModel slotViewModel = this.f15303c;
        if (slotViewModel != null) {
            slotViewModel.mo12054a(this);
        }
        AbstractC88412b bVar = this.f15305e;
        if (bVar != null) {
            bVar.dispose();
        }
        AbstractC88412b bVar2 = this.f15306f;
        if (bVar2 != null) {
            bVar2.dispose();
        }
        if (this.dataChannel != null) {
            this.dataChannel.mo28315b(C6810c.class, (Object) false);
            this.dataChannel.mo28315b(C6809b.class, (Object) 0);
        }
        this.f15307g = false;
        this.f15308h = 0;
        if (this.f15301a != null) {
            getLifecycle().mo4013b(this.f15301a);
            this.f15301a.onDestroy();
        }
        if (this.dataChannel != null) {
            this.dataChannel.mo28315b(C6810c.class, (Object) false);
            this.dataChannel.mo28315b(C6809b.class, (Object) 0);
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
            C6203g.m13467b(new RunnableC6179m(this), this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12027a(int i) {
        if (getView() != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getView().getLayoutParams();
            marginLayoutParams.bottomMargin = Math.max(C3966y.m9667d(R.dimen.zc), i);
            getView().setLayoutParams(marginLayoutParams);
        }
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot.AbstractC6145a
    /* renamed from: a */
    public final void mo12019a(C6165ah ahVar, IFrameSlot.SlotViewModel slotViewModel) {
        final AbstractC6157ab abVar = ahVar.f15398b;
        this.f15302b = (IFrameSlot) abVar.mo12079f();
        this.f15303c = slotViewModel;
        slotViewModel.f15346a.observe(this, new AbstractC1214u<Pair<Boolean, String>>() {
            /* class com.bytedance.android.live.slot.FrameL3SlotWidget.C61342 */

            static {
                Covode.recordClassIndex(6832);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Pair<Boolean, String> pair) {
                MethodCollector.m26663i(9396);
                Pair<Boolean, String> pair2 = pair;
                if (FrameL3SlotWidget.this.getView() == null || pair2 == null) {
                    MethodCollector.m26664o(9396);
                    return;
                }
                if (Boolean.TRUE.equals(pair2.first)) {
                    if ((FrameL3SlotWidget.this.getView() instanceof ViewGroup) && (!FrameL3SlotWidget.this.isShowing() || ((ViewGroup) FrameL3SlotWidget.this.getView()).getChildCount() <= 0)) {
                        ((ViewGroup) FrameL3SlotWidget.this.getView()).removeAllViews();
                        FrameL3SlotWidget frameL3SlotWidget = FrameL3SlotWidget.this;
                        frameL3SlotWidget.f15304d = frameL3SlotWidget.f15302b.mo12051a(FrameL3SlotWidget.this.getContext());
                        if (FrameL3SlotWidget.this.f15304d != null) {
                            ((ViewGroup) FrameL3SlotWidget.this.getView()).addView(FrameL3SlotWidget.this.f15304d);
                            if (FrameL3SlotWidget.this.f15307g || FrameL3SlotWidget.this.f15308h > 1) {
                                MethodCollector.m26664o(9396);
                                return;
                            }
                            abVar.mo12073a("during_live");
                            FrameL3SlotWidget.this.show();
                            if (FrameL3SlotWidget.this.dataChannel != null) {
                                FrameL3SlotWidget.this.dataChannel.mo28315b(C6810c.class, (Object) true);
                            }
                            Animation a = FrameL3SlotWidget.this.f15302b.mo12052a();
                            if (a != null) {
                                FrameL3SlotWidget.this.f15304d.startAnimation(a);
                            }
                            if (!FrameL3SlotWidget.this.f15304d.hasOnClickListeners()) {
                                FrameL3SlotWidget.this.f15304d.setOnClickListener(new View.OnClickListener() {
                                    /* class com.bytedance.android.live.slot.FrameL3SlotWidget.C61342.View$OnClickListenerC61351 */

                                    static {
                                        Covode.recordClassIndex(6833);
                                    }

                                    public final void onClick(View view) {
                                        if (!TextUtils.isEmpty(null)) {
                                            ((IHostAction) C6193a.m13435a(IHostAction.class)).openLiveBrowser((String) null, new Bundle(), FrameL3SlotWidget.this.getContext());
                                        }
                                    }
                                });
                            }
                            FrameL3SlotWidget.this.f15304d.post(new Runnable() {
                                /* class com.bytedance.android.live.slot.FrameL3SlotWidget.C61342.RunnableC61362 */

                                static {
                                    Covode.recordClassIndex(6834);
                                }

                                public final void run() {
                                    if (FrameL3SlotWidget.this.dataChannel != null) {
                                        FrameL3SlotWidget.this.dataChannel.mo28315b(C6809b.class, Integer.valueOf(FrameL3SlotWidget.this.f15304d.getHeight()));
                                    }
                                }
                            });
                            MethodCollector.m26664o(9396);
                            return;
                        }
                    }
                } else if (FrameL3SlotWidget.this.isShowing() && FrameL3SlotWidget.this.f15304d != null) {
                    Animation b = FrameL3SlotWidget.this.f15302b.mo12053b();
                    if (b == null || "visibility_reason_conflict".equals(pair2.second) || "visibility_reason_dispose".equals(pair2.second)) {
                        if (FrameL3SlotWidget.this.getView() instanceof ViewGroup) {
                            ((ViewGroup) FrameL3SlotWidget.this.getView()).removeAllViews();
                            FrameL3SlotWidget.this.hide();
                        }
                        if (FrameL3SlotWidget.this.dataChannel != null) {
                            FrameL3SlotWidget.this.dataChannel.mo28315b(C6810c.class, (Object) false);
                            FrameL3SlotWidget.this.dataChannel.mo28315b(C6809b.class, (Object) 0);
                            MethodCollector.m26664o(9396);
                            return;
                        }
                    } else {
                        b.setAnimationListener(new Animation.AnimationListener() {
                            /* class com.bytedance.android.live.slot.FrameL3SlotWidget.C61342.animationAnimation$AnimationListenerC61373 */

                            static {
                                Covode.recordClassIndex(6835);
                            }

                            public final void onAnimationRepeat(Animation animation) {
                            }

                            public final void onAnimationStart(Animation animation) {
                            }

                            public final void onAnimationEnd(Animation animation) {
                                View view = FrameL3SlotWidget.this.getView();
                                if (view != null) {
                                    view.post(new RunnableC6184r(this, view));
                                }
                                if (FrameL3SlotWidget.this.dataChannel != null) {
                                    FrameL3SlotWidget.this.dataChannel.mo28315b(C6810c.class, (Object) false);
                                    FrameL3SlotWidget.this.dataChannel.mo28315b(C6809b.class, (Object) 0);
                                }
                            }
                        });
                        FrameL3SlotWidget.this.f15304d.startAnimation(b);
                    }
                }
                MethodCollector.m26664o(9396);
            }
        });
    }
}
