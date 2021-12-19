package com.bytedance.android.livesdk.lynx.lynxcard;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.core.p037h.p039b.C0767b;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.C6417a;
import com.bytedance.android.livesdk.C6803ao;
import com.bytedance.android.livesdk.browser.C7021g;
import com.bytedance.android.livesdk.container.p507d.C8237b;
import com.bytedance.android.livesdk.container.p513j.C8273c;
import com.bytedance.android.livesdk.livesetting.hybrid.LynxCardConfig;
import com.bytedance.android.livesdk.livesetting.hybrid.LynxCardPriority;
import com.bytedance.android.livesdk.lynx.lynxcard.C9371e;
import com.bytedance.android.livesdk.model.ShortTouchItem;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class LynxCardPreviewWidget extends LiveRecyclableWidget implements AbstractC33974au {

    /* renamed from: e */
    public static final C9356a f22829e = new C9356a((byte) 0);

    /* renamed from: a */
    public boolean f22830a;

    /* renamed from: b */
    public final Queue<C9367a> f22831b = new LinkedList();

    /* renamed from: c */
    public final Handler f22832c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    public LinearLayout f22833d;

    /* renamed from: f */
    private final Runnable f22834f = new RunnableC9361e(this);

    static {
        Covode.recordClassIndex(10861);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bbl;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.bytedance.android.livesdk.lynx.lynxcard.LynxCardPreviewWidget$a */
    public static final class C9356a {
        static {
            Covode.recordClassIndex(10862);
        }

        private C9356a() {
        }

        public /* synthetic */ C9356a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.lynx.lynxcard.LynxCardPreviewWidget$c */
    static final class RunnableC9358c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LynxCardPreviewWidget f22842a;

        static {
            Covode.recordClassIndex(10864);
        }

        RunnableC9358c(LynxCardPreviewWidget lynxCardPreviewWidget) {
            this.f22842a = lynxCardPreviewWidget;
        }

        public final void run() {
            this.f22842a.mo16245a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.lynx.lynxcard.LynxCardPreviewWidget$e */
    static final class RunnableC9361e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LynxCardPreviewWidget f22845a;

        static {
            Covode.recordClassIndex(10867);
        }

        RunnableC9361e(LynxCardPreviewWidget lynxCardPreviewWidget) {
            this.f22845a = lynxCardPreviewWidget;
        }

        public final void run() {
            this.f22845a.f22830a = false;
            this.f22845a.mo16245a();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        this.f22830a = false;
        this.f22831b.clear();
        this.f22832c.removeCallbacksAndMessages(null);
    }

    /* renamed from: b */
    public final void mo16247b() {
        this.f22832c.removeCallbacks(this.f22834f);
        this.f22832c.postDelayed(this.f22834f, 660);
    }

    /* renamed from: a */
    public final void mo16245a() {
        MethodCollector.m26663i(8271);
        if (this.f22830a) {
            MethodCollector.m26664o(8271);
            return;
        }
        this.f22830a = true;
        C9367a poll = this.f22831b.poll();
        if (poll == null) {
            this.f22830a = false;
            MethodCollector.m26664o(8271);
        } else if (C7021g.C7023b.f17618a.mo13328a(poll.f22854a.getContainerId()) == null) {
            if (poll.f22855b != null && (poll.f22855b instanceof C8273c)) {
                C7021g.C7023b.f17618a.mo13329a(poll.f22855b);
            }
            mo16247b();
            MethodCollector.m26664o(8271);
        } else if (poll.f22855b == null) {
            mo16246a(poll.f22854a, poll.f22856c);
            mo16247b();
            MethodCollector.m26664o(8271);
        } else {
            View view = poll.f22855b;
            if (view.getParent() == null || !(view.getParent() instanceof ViewGroup)) {
                HashMap hashMap = new HashMap();
                String stackTraceString = Log.getStackTraceString(new Throwable(""));
                C89219l.m154716b(stackTraceString, "");
                hashMap.put("stack_trace", stackTraceString);
                C3868c.m9491a("ttlive_lynx_card_preview_widget_success_message", 0, hashMap);
                LinearLayout linearLayout = this.f22833d;
                if (linearLayout == null) {
                    C89219l.m154710a("container");
                }
                linearLayout.addView(view);
                LinearLayout linearLayout2 = this.f22833d;
                if (linearLayout2 == null) {
                    C89219l.m154710a("container");
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout2, View.TRANSLATION_X, (float) C3966y.m9653a(-82.0f), 0.0f);
                ofFloat.setDuration(480L);
                ofFloat.setInterpolator(C0767b.m2680a(0.41f, 1.44f, 0.42f, 1.0f));
                LinearLayout linearLayout3 = this.f22833d;
                if (linearLayout3 == null) {
                    C89219l.m154710a("container");
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(linearLayout3, View.ALPHA, 1.0f, 1.0f);
                ofFloat2.setDuration(660L);
                LinearLayout linearLayout4 = this.f22833d;
                if (linearLayout4 == null) {
                    C89219l.m154710a("container");
                }
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(linearLayout4, View.SCALE_X, 1.0f, 0.0f);
                ofFloat3.setDuration(460L);
                ofFloat3.setInterpolator(C0767b.m2680a(1.0f, -0.62f, 0.63f, 0.9f));
                LinearLayout linearLayout5 = this.f22833d;
                if (linearLayout5 == null) {
                    C89219l.m154710a("container");
                }
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(linearLayout5, View.SCALE_Y, 1.0f, 0.0f);
                ofFloat4.setDuration(460L);
                ofFloat4.setInterpolator(C0767b.m2680a(1.0f, -0.62f, 0.63f, 0.9f));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.addListener(new C9357b(this, view, poll, ofFloat, ofFloat2, ofFloat3, ofFloat4));
                animatorSet.play(ofFloat).before(ofFloat2);
                animatorSet.play(ofFloat2).before(ofFloat3);
                animatorSet.play(ofFloat3).with(ofFloat4);
                animatorSet.start();
                MethodCollector.m26664o(8271);
                return;
            }
            HashMap hashMap2 = new HashMap();
            String name = view.getParent().getClass().getName();
            C89219l.m154716b(name, "");
            hashMap2.put("old_parent", name);
            LinearLayout linearLayout6 = this.f22833d;
            if (linearLayout6 == null) {
                C89219l.m154710a("container");
            }
            String name2 = linearLayout6.getClass().getName();
            C89219l.m154716b(name2, "");
            hashMap2.put("container", name2);
            ViewParent parent = view.getParent();
            LinearLayout linearLayout7 = this.f22833d;
            if (linearLayout7 == null) {
                C89219l.m154710a("container");
            }
            hashMap2.put("is_equal", Boolean.valueOf(C89219l.m154714a(parent, linearLayout7)));
            String stackTraceString2 = Log.getStackTraceString(new Throwable(""));
            C89219l.m154716b(stackTraceString2, "");
            hashMap2.put("stack_trace", stackTraceString2);
            C3868c.m9491a("ttlive_lynx_card_preview_widget_error_message", 1, hashMap2);
            mo16247b();
            MethodCollector.m26664o(8271);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ LinearLayout m17634a(LynxCardPreviewWidget lynxCardPreviewWidget) {
        LinearLayout linearLayout = lynxCardPreviewWidget.f22833d;
        if (linearLayout == null) {
            C89219l.m154710a("container");
        }
        return linearLayout;
    }

    /* renamed from: com.bytedance.android.livesdk.lynx.lynxcard.LynxCardPreviewWidget$b */
    public static final class C9357b implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ LynxCardPreviewWidget f22835a;

        /* renamed from: b */
        final /* synthetic */ View f22836b;

        /* renamed from: c */
        final /* synthetic */ C9367a f22837c;

        /* renamed from: d */
        final /* synthetic */ ObjectAnimator f22838d;

        /* renamed from: e */
        final /* synthetic */ ObjectAnimator f22839e;

        /* renamed from: f */
        final /* synthetic */ ObjectAnimator f22840f;

        /* renamed from: g */
        final /* synthetic */ ObjectAnimator f22841g;

        static {
            Covode.recordClassIndex(10863);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationCancel(Animator animator) {
            ViewParent parent = LynxCardPreviewWidget.m17634a(this.f22835a).getParent();
            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).setVisibility(8);
        }

        public final void onAnimationStart(Animator animator) {
            ViewParent parent = LynxCardPreviewWidget.m17634a(this.f22835a).getParent();
            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).setVisibility(0);
            LynxCardPreviewWidget.m17634a(this.f22835a).setAlpha(1.0f);
            LynxCardPreviewWidget.m17634a(this.f22835a).setScaleX(1.0f);
            LynxCardPreviewWidget.m17634a(this.f22835a).setScaleY(1.0f);
        }

        public final void onAnimationEnd(Animator animator) {
            MethodCollector.m26663i(7661);
            ViewParent parent = LynxCardPreviewWidget.m17634a(this.f22835a).getParent();
            if (parent != null) {
                ((ViewGroup) parent).setVisibility(8);
                LynxCardPreviewWidget.m17634a(this.f22835a).setAlpha(1.0f);
                LynxCardPreviewWidget.m17634a(this.f22835a).setScaleX(1.0f);
                LynxCardPreviewWidget.m17634a(this.f22835a).setScaleY(1.0f);
                LynxCardPreviewWidget.m17634a(this.f22835a).removeView(this.f22836b);
                if (this.f22836b instanceof C8273c) {
                    C7021g.C7023b.f17618a.mo13329a(this.f22836b);
                }
                this.f22835a.mo16246a(this.f22837c.f22854a, this.f22837c.f22856c);
                this.f22835a.mo16247b();
                MethodCollector.m26664o(7661);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            MethodCollector.m26664o(7661);
            throw nullPointerException;
        }

        C9357b(LynxCardPreviewWidget lynxCardPreviewWidget, View view, C9367a aVar, ObjectAnimator objectAnimator, ObjectAnimator objectAnimator2, ObjectAnimator objectAnimator3, ObjectAnimator objectAnimator4) {
            this.f22835a = lynxCardPreviewWidget;
            this.f22836b = view;
            this.f22837c = aVar;
            this.f22838d = objectAnimator;
            this.f22839e = objectAnimator2;
            this.f22840f = objectAnimator3;
            this.f22841g = objectAnimator4;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.lynx.lynxcard.LynxCardPreviewWidget$d */
    static final class C9359d extends AbstractC89220m implements AbstractC89172b<C9371e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ LynxCardPreviewWidget f22843a;

        static {
            Covode.recordClassIndex(10865);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9359d(LynxCardPreviewWidget lynxCardPreviewWidget) {
            super(1);
            this.f22843a = lynxCardPreviewWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C9371e eVar) {
            C9371e.AbstractC9372a aVar;
            C9371e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            if (TextUtils.equals(eVar2.f22861a.getHost(), C8237b.f20464f)) {
                Context context = this.f22843a.context;
                C89219l.m154716b(context, "");
                C8273c a = C8273c.C8274a.m16428a(context, eVar2.f22861a, eVar2.f22865e);
                if (!(eVar2.f22864d == null || (aVar = eVar2.f22864d) == null)) {
                    aVar.mo12783a(a.getContainerId());
                }
                this.f22843a.f22831b.offer(new C9367a(a, eVar2.f22862b, eVar2.f22863c));
                this.f22843a.f22832c.postDelayed(new Runnable(this) {
                    /* class com.bytedance.android.livesdk.lynx.lynxcard.LynxCardPreviewWidget.C9359d.RunnableC93601 */

                    /* renamed from: a */
                    final /* synthetic */ C9359d f22844a;

                    static {
                        Covode.recordClassIndex(10866);
                    }

                    {
                        this.f22844a = r1;
                    }

                    public final void run() {
                        this.f22844a.f22843a.mo16245a();
                    }
                }, 660);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        ViewGroup.LayoutParams layoutParams;
        View view = getView();
        ViewGroup.LayoutParams layoutParams2 = null;
        if (!(view == null || (layoutParams = view.getLayoutParams()) == null)) {
            layoutParams.width = C3966y.m9653a((float) LynxCardConfig.INSTANCE.getPreviewWidth());
            layoutParams.height = C3966y.m9653a((float) LynxCardConfig.INSTANCE.getPreviewHeight());
        }
        View view2 = getView();
        if (view2 != null) {
            layoutParams2 = view2.getLayoutParams();
        }
        Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams.topMargin = C3966y.m9653a((float) LynxCardConfig.INSTANCE.getPreviewTopMargin());
        marginLayoutParams.setMarginStart(C3966y.m9653a((float) LynxCardConfig.INSTANCE.getPreviewStartMargin()));
        View view3 = getView();
        if (view3 == null) {
            C89219l.m154715b();
        }
        View findViewById = view3.findViewById(R.id.acf);
        C89219l.m154716b(findViewById, "");
        LinearLayout linearLayout = (LinearLayout) findViewById;
        this.f22833d = linearLayout;
        if (linearLayout == null) {
            C89219l.m154710a("container");
        }
        ViewParent parent = linearLayout.getParent();
        Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) parent).setVisibility(8);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        List<ShortTouchItem> list;
        this.f22832c.removeCallbacksAndMessages(null);
        Room room = (Room) this.dataChannel.mo28318b(C9093de.class);
        if (!(room == null || (list = room.shortTouchItems) == null || list.size() <= 0)) {
            for (ShortTouchItem shortTouchItem : list) {
                if (shortTouchItem.schema != null) {
                    Uri parse = Uri.parse(shortTouchItem.schema);
                    C89219l.m154716b(parse, "");
                    if (TextUtils.equals(parse.getHost(), C8237b.f20464f)) {
                        Context context = this.context;
                        C89219l.m154716b(context, "");
                        Uri parse2 = Uri.parse(shortTouchItem.schema);
                        C89219l.m154716b(parse2, "");
                        C8273c a = C8273c.C8274a.m16428a(context, parse2, false);
                        if (shortTouchItem.previewSetting == null || shortTouchItem.previewSetting.f23174a == null) {
                            this.f22831b.offer(new C9367a(a, null, LynxCardPriority.INSTANCE.getPriority(shortTouchItem.name)));
                        } else {
                            Context context2 = this.context;
                            C89219l.m154716b(context2, "");
                            Uri parse3 = Uri.parse(shortTouchItem.previewSetting.f23174a);
                            C89219l.m154716b(parse3, "");
                            C8273c a2 = C8273c.C8274a.m16428a(context2, parse3, true);
                            a2.setLayoutParams(new LinearLayout.LayoutParams(C3966y.m9653a((float) LynxCardConfig.INSTANCE.getPreviewWidth()), C3966y.m9653a((float) LynxCardConfig.INSTANCE.getPreviewHeight())));
                            a2.setPreview(true);
                            this.f22831b.offer(new C9367a(a, a2, LynxCardPriority.INSTANCE.getPriority(shortTouchItem.name)));
                        }
                    }
                }
            }
        }
        this.f22832c.postDelayed(new RunnableC9358c(this), 660);
        DataChannelGlobal.f42558d.mo28322a(this, this, C6417a.class, new C9359d(this));
    }

    /* renamed from: a */
    public final void mo16246a(C8273c cVar, int i) {
        if (!this.isDestroyed) {
            this.dataChannel.mo28320c(C6803ao.class, new C9369c(cVar, i));
        }
    }
}
