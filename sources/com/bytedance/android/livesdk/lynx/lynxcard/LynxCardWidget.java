package com.bytedance.android.livesdk.lynx.lynxcard;

import android.animation.Animator;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.C6803ao;
import com.bytedance.android.livesdk.C6887ax;
import com.bytedance.android.livesdk.C6910bj;
import com.bytedance.android.livesdk.browser.C7021g;
import com.bytedance.android.livesdk.container.p513j.C8273c;
import com.bytedance.android.livesdk.livesetting.hybrid.LynxCardConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.lynx.tasm.LynxView;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class LynxCardWidget extends LiveRecyclableWidget implements AbstractC33974au {

    /* renamed from: c */
    public static final C9362a f22846c = new C9362a((byte) 0);

    /* renamed from: a */
    final List<C9370d> f22847a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public LinearLayout f22848b;

    static {
        Covode.recordClassIndex(10868);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bbm;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.bytedance.android.livesdk.lynx.lynxcard.LynxCardWidget$a */
    public static final class C9362a {
        static {
            Covode.recordClassIndex(10869);
        }

        private C9362a() {
        }

        public /* synthetic */ C9362a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        View a;
        MethodCollector.m26663i(7315);
        for (C9370d dVar : this.f22847a) {
            String str = dVar.f22859a;
            if (!TextUtils.isEmpty(str) && (a = C7021g.C7023b.f17618a.mo13328a(str)) != null) {
                LinearLayout linearLayout = this.f22848b;
                if (linearLayout == null) {
                    C89219l.m154710a("container");
                }
                linearLayout.removeView(a);
            }
        }
        C7021g.C7023b.f17618a.f17617a.clear();
        this.f22847a.clear();
        MethodCollector.m26664o(7315);
    }

    /* renamed from: com.bytedance.android.livesdk.lynx.lynxcard.LynxCardWidget$e */
    public static final class C9366e implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ LynxCardWidget f22852a;

        /* renamed from: b */
        final /* synthetic */ View f22853b;

        static {
            Covode.recordClassIndex(10873);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
            View view = this.f22853b;
            Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.android.livesdk.container.ui.LynxCardView");
            ((C8273c) view).setAnimatorFinished(false);
        }

        public final void onAnimationEnd(Animator animator) {
            MethodCollector.m26663i(7160);
            View view = this.f22853b;
            if (view != null) {
                ((C8273c) view).setAnimatorFinished(true);
                LinearLayout linearLayout = this.f22852a.f22848b;
                if (linearLayout == null) {
                    C89219l.m154710a("container");
                }
                linearLayout.removeView(this.f22853b);
                MethodCollector.m26664o(7160);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.bytedance.android.livesdk.container.ui.LynxCardView");
            MethodCollector.m26664o(7160);
            throw nullPointerException;
        }

        C9366e(LynxCardWidget lynxCardWidget, View view) {
            this.f22852a = lynxCardWidget;
            this.f22853b = view;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.lynx.lynxcard.LynxCardWidget$d */
    static final class C9365d extends AbstractC89220m implements AbstractC89172b<C9375h, C89391z> {

        /* renamed from: a */
        final /* synthetic */ LynxCardWidget f22851a;

        static {
            Covode.recordClassIndex(10872);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9365d(LynxCardWidget lynxCardWidget) {
            super(1);
            this.f22851a = lynxCardWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C9375h hVar) {
            C9375h hVar2 = hVar;
            C89219l.m154721d(hVar2, "");
            String str = hVar2.f22866a;
            Map<String, Object> map = hVar2.f22867b;
            View a = C7021g.C7023b.f17618a.mo13328a(str);
            if (a != null) {
                View f = ((C8273c) a).getHybridView().getComponent().mo14496f();
                Objects.requireNonNull(f, "null cannot be cast to non-null type com.lynx.tasm.LynxView");
                ((LynxView) f).updateData(map);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        this.dataChannel.mo28309a((AbstractC1204m) this, C6803ao.class, (AbstractC89172b) new C9363b(this));
        DataChannelGlobal.f42558d.mo28322a(this, this, C6887ax.class, new C9364c(this));
        DataChannelGlobal.f42558d.mo28322a(this, this, C6910bj.class, new C9365d(this));
    }

    /* renamed from: com.bytedance.android.livesdk.lynx.lynxcard.LynxCardWidget$c */
    static final class C9364c extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ LynxCardWidget f22850a;

        static {
            Covode.recordClassIndex(10871);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9364c(LynxCardWidget lynxCardWidget) {
            super(1);
            this.f22850a = lynxCardWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0056  */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(java.lang.String r9) {
            /*
            // Method dump skipped, instructions count: 210
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.lynx.lynxcard.LynxCardWidget.C9364c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        ViewGroup.LayoutParams layoutParams;
        View view = getView();
        ViewParent viewParent = null;
        if (!(view == null || (layoutParams = view.getLayoutParams()) == null)) {
            layoutParams.width = C3966y.m9653a((float) LynxCardConfig.INSTANCE.getWidgetWidth());
            layoutParams.height = C3966y.m9653a((float) LynxCardConfig.INSTANCE.getWidgetHeight());
        }
        View view2 = getView();
        if (view2 != null) {
            viewParent = view2.getParent();
        }
        Objects.requireNonNull(viewParent, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup.LayoutParams layoutParams2 = ((ViewGroup) viewParent).getLayoutParams();
        Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams.topMargin = C3966y.m9653a((float) LynxCardConfig.INSTANCE.getWidgetTopMargin());
        marginLayoutParams.setMarginStart(C3966y.m9653a((float) LynxCardConfig.INSTANCE.getWidgetStartMargin()));
        marginLayoutParams.setMarginEnd(C3966y.m9653a((float) LynxCardConfig.INSTANCE.getWidgetEndMargin()));
        View view3 = getView();
        if (view3 == null) {
            C89219l.m154715b();
        }
        View findViewById = view3.findViewById(R.id.acf);
        C89219l.m154716b(findViewById, "");
        this.f22848b = (LinearLayout) findViewById;
    }

    /* renamed from: com.bytedance.android.livesdk.lynx.lynxcard.LynxCardWidget$b */
    static final class C9363b extends AbstractC89220m implements AbstractC89172b<C9369c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ LynxCardWidget f22849a;

        static {
            Covode.recordClassIndex(10870);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9363b(LynxCardWidget lynxCardWidget) {
            super(1);
            this.f22849a = lynxCardWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C9369c cVar) {
            MethodCollector.m26663i(7479);
            C9369c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            LynxCardWidget lynxCardWidget = this.f22849a;
            C8273c cVar3 = cVar2.f22857a;
            int i = cVar2.f22858b;
            if (!cVar3.getInitFinished()) {
                cVar3.mo14606a();
            }
            if (cVar3.getParent() == null || !(cVar3.getParent() instanceof ViewGroup)) {
                HashMap hashMap = new HashMap();
                hashMap.put("list_size", Integer.valueOf(lynxCardWidget.f22847a.size()));
                String stackTraceString = Log.getStackTraceString(new Throwable(""));
                C89219l.m154716b(stackTraceString, "");
                hashMap.put("stack_trace", stackTraceString);
                int i2 = 0;
                C3868c.m9491a("ttlive_lynx_card_widget_success_message", 0, hashMap);
                if (lynxCardWidget.f22847a.isEmpty()) {
                    lynxCardWidget.f22847a.add(new C9370d(cVar3.getContainerId(), i));
                    LinearLayout linearLayout = lynxCardWidget.f22848b;
                    if (linearLayout == null) {
                        C89219l.m154710a("container");
                    }
                    linearLayout.addView(cVar3);
                } else {
                    int size = lynxCardWidget.f22847a.size();
                    while (true) {
                        if (i2 >= size) {
                            lynxCardWidget.f22847a.add(new C9370d(cVar3.getContainerId(), i));
                            LinearLayout linearLayout2 = lynxCardWidget.f22848b;
                            if (linearLayout2 == null) {
                                C89219l.m154710a("container");
                            }
                            linearLayout2.addView(cVar3);
                        } else if (i <= lynxCardWidget.f22847a.get(i2).f22860b) {
                            lynxCardWidget.f22847a.add(i2, new C9370d(cVar3.getContainerId(), i));
                            LinearLayout linearLayout3 = lynxCardWidget.f22848b;
                            if (linearLayout3 == null) {
                                C89219l.m154710a("container");
                            }
                            linearLayout3.addView(cVar3, i2);
                        } else {
                            i2++;
                        }
                    }
                }
            } else {
                HashMap hashMap2 = new HashMap();
                String name = cVar3.getParent().getClass().getName();
                C89219l.m154716b(name, "");
                hashMap2.put("old_parent", name);
                LinearLayout linearLayout4 = lynxCardWidget.f22848b;
                if (linearLayout4 == null) {
                    C89219l.m154710a("container");
                }
                String name2 = linearLayout4.getClass().getName();
                C89219l.m154716b(name2, "");
                hashMap2.put("container", name2);
                ViewParent parent = cVar3.getParent();
                LinearLayout linearLayout5 = lynxCardWidget.f22848b;
                if (linearLayout5 == null) {
                    C89219l.m154710a("container");
                }
                hashMap2.put("is_equal", Boolean.valueOf(C89219l.m154714a(parent, linearLayout5)));
                hashMap2.put("list_size", Integer.valueOf(lynxCardWidget.f22847a.size()));
                String stackTraceString2 = Log.getStackTraceString(new Throwable(""));
                C89219l.m154716b(stackTraceString2, "");
                hashMap2.put("stack_trace", stackTraceString2);
                C3868c.m9491a("ttlive_lynx_card_widget_error_message", 1, hashMap2);
            }
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(7479);
            return zVar;
        }
    }
}
