package com.bytedance.android.livesdk.container.p513j;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.ActivityC0945e;
import com.C1764a;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.core.p218f.C3907ag;
import com.bytedance.android.live.core.widget.C4031a;
import com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p176b.AbstractC2936j;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.browser.C6952c;
import com.bytedance.android.livesdk.browser.p466g.C7024a;
import com.bytedance.android.livesdk.container.AbstractC8241e;
import com.bytedance.android.livesdk.container.config.base.PopupConfig;
import com.bytedance.android.livesdk.container.config.live.LivePopupConfig;
import com.bytedance.android.livesdk.container.custom.ContainerCoordinatorLayout;
import com.bytedance.android.livesdk.container.custom.p506a.AbstractC8234b;
import com.bytedance.android.livesdk.container.p505c.AbstractC8221a;
import com.bytedance.android.livesdk.container.p507d.EnumC8236a;
import com.bytedance.android.livesdk.container.p508e.C8242a;
import com.bytedance.android.livesdk.container.p509f.C8243a;
import com.bytedance.android.livesdk.container.p510g.C8247a;
import com.bytedance.android.livesdk.container.p513j.C8258a;
import com.bytedance.android.livesdk.container.type.HColor;
import com.bytedance.android.livesdk.container.util.C8299b;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.android.livesdkapi.p700m.C11831d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.container.j.e */
public final class C8286e extends C4031a implements AbstractC8241e {

    /* renamed from: i */
    public static final C8287a f20544i = new C8287a((byte) 0);

    /* renamed from: e */
    public ContainerCoordinatorLayout f20545e;

    /* renamed from: f */
    public C8258a f20546f;

    /* renamed from: g */
    public ImageView f20547g;

    /* renamed from: h */
    public List<View.OnClickListener> f20548h = new ArrayList();

    /* renamed from: j */
    private boolean f20549j;

    /* renamed from: k */
    private FrameLayout f20550k;

    /* renamed from: l */
    private ViewGroup f20551l;

    /* renamed from: m */
    private View f20552m;

    /* renamed from: n */
    private final AbstractC89244h f20553n = C11831d.m20835a(new C8294h(this));

    /* renamed from: o */
    private final AbstractC89244h f20554o = C11831d.m20835a(new C8296j(this));

    /* renamed from: p */
    private HashMap f20555p;

    static {
        Covode.recordClassIndex(9121);
    }

    /* renamed from: e */
    private final String m16439e() {
        return (String) this.f20554o.getValue();
    }

    /* renamed from: d */
    public final PopupConfig mo14628d() {
        return (PopupConfig) this.f20553n.getValue();
    }

    /* renamed from: com.bytedance.android.livesdk.container.j.e$a */
    public static final class C8287a {
        static {
            Covode.recordClassIndex(9122);
        }

        private C8287a() {
        }

        public /* synthetic */ C8287a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C8286e m16450a(PopupConfig popupConfig) {
            C89219l.m154721d(popupConfig, "");
            C8286e eVar = new C8286e();
            C7024a.m14981a(popupConfig.getUrl());
            Bundle bundle = new Bundle();
            bundle.putSerializable("argument_key_config", popupConfig);
            eVar.setArguments(bundle);
            return eVar;
        }
    }

    @Override // com.bytedance.android.livesdk.container.AbstractC8212b
    /* renamed from: b */
    public final void mo14465b() {
        dismissAllowingStateLoss();
    }

    @Override // com.bytedance.android.livesdk.container.AbstractC8241e
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ View mo14594c() {
        return this.f20545e;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.live.C2907a
    public final void dismiss() {
        dismissAllowingStateLoss();
    }

    /* renamed from: com.bytedance.android.livesdk.container.j.e$i */
    static final class C8295i extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C8286e f20563a;

        static {
            Covode.recordClassIndex(9130);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8295i(C8286e eVar) {
            super(0);
            this.f20563a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C8286e.super.dismissAllowingStateLoss();
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.livesdk.container.custom.p506a.AbstractC8233a
    /* renamed from: a */
    public final void mo14580a() {
        ContainerCoordinatorLayout containerCoordinatorLayout = this.f20545e;
        if (containerCoordinatorLayout != null) {
            containerCoordinatorLayout.mo14580a();
        }
    }

    @Override // com.bytedance.android.livesdk.container.AbstractC8212b
    public final String getHybridContainerId() {
        return m16439e();
    }

    @Override // com.bytedance.android.live.core.widget.C4031a
    /* renamed from: j_ */
    public final String mo9425j_() {
        return m16439e();
    }

    /* renamed from: com.bytedance.android.livesdk.container.j.e$k */
    public static final class DialogC8297k extends Dialog {

        /* renamed from: a */
        final /* synthetic */ C8286e f20565a;

        static {
            Covode.recordClassIndex(9132);
        }

        public final void onBackPressed() {
            if (this.f20565a.mCancelable) {
                this.f20565a.dismissAllowingStateLoss();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        DialogC8297k(C8286e eVar, Context context, int i) {
            super(context, i);
            this.f20565a = eVar;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment, com.bytedance.android.live.core.widget.C4031a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f20555p;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.container.j.e$h */
    static final class C8294h extends AbstractC89220m implements AbstractC89171a<PopupConfig> {

        /* renamed from: a */
        final /* synthetic */ C8286e f20562a;

        static {
            Covode.recordClassIndex(9129);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8294h(C8286e eVar) {
            super(0);
            this.f20562a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PopupConfig invoke() {
            Bundle arguments = this.f20562a.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            Serializable serializable = arguments.getSerializable("argument_key_config");
            Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.bytedance.android.livesdk.container.config.base.PopupConfig");
            return serializable;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.container.j.e$j */
    static final class C8296j extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C8286e f20564a;

        static {
            Covode.recordClassIndex(9131);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8296j(C8286e eVar) {
            super(0);
            this.f20564a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            if (this.f20564a.mo14628d().getEngineType() == EnumC8236a.LYNX) {
                return C6952c.m14838b();
            }
            return C6952c.m14837a();
        }
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.android.live.core.widget.C4031a
    public final void onDestroy() {
        super.onDestroy();
        PopupConfig d = mo14628d();
        C89219l.m154721d(d, "");
        C89219l.m154721d(this, "");
        LivePopupConfig extraConfig = d.getExtraConfig();
        if (extraConfig != null && extraConfig.getMinMarginTop() > 0) {
            mo14580a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.container.j.e$g */
    static final class RunnableC8293g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C8286e f20561a;

        static {
            Covode.recordClassIndex(9128);
        }

        RunnableC8293g(C8286e eVar) {
            this.f20561a = eVar;
        }

        public final void run() {
            LiveLoadingView liveLoadingView;
            AbstractC8221a aVar;
            View f;
            C8258a aVar2 = this.f20561a.f20546f;
            if (!(aVar2 == null || (aVar = aVar2.f20491a) == null || (f = aVar.mo14496f()) == null)) {
                C8242a.m16384a(f, this.f20561a.mo14628d().getHeight());
            }
            C8258a aVar3 = this.f20561a.f20546f;
            if (aVar3 != null && (liveLoadingView = aVar3.f20492b) != null) {
                C8242a.m16384a(liveLoadingView, this.f20561a.mo14628d().getHeight());
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.live.C2907a
    public final void dismissAllowingStateLoss() {
        int i;
        MethodCollector.m26663i(7001);
        C8295i iVar = new C8295i(this);
        String gravity = mo14628d().getGravity();
        int hashCode = gravity.hashCode();
        if (hashCode != -1383228885) {
            if (hashCode == -1364013995 && gravity.equals("center")) {
                ContainerCoordinatorLayout containerCoordinatorLayout = this.f20545e;
                String dialogAnimation = mo14628d().getDialogAnimation();
                C89219l.m154721d(dialogAnimation, "");
                if (containerCoordinatorLayout == null) {
                    MethodCollector.m26664o(7001);
                    return;
                } else if (containerCoordinatorLayout.getAnimation() == null) {
                    int hashCode2 = dialogAnimation.hashCode();
                    if (hashCode2 != -1383228885) {
                        if (hashCode2 != -1364013995) {
                            if (hashCode2 == 3387192) {
                                dialogAnimation.equals("none");
                            }
                        } else if (dialogAnimation.equals("center")) {
                            i = R.anim.eg;
                            Animation loadAnimation = AnimationUtils.loadAnimation(containerCoordinatorLayout.getContext(), i);
                            loadAnimation.setAnimationListener(new C8299b.animationAnimation$AnimationListenerC8301b(iVar));
                            containerCoordinatorLayout.startAnimation(loadAnimation);
                        }
                    } else if (dialogAnimation.equals("bottom")) {
                        i = R.anim.eo;
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(containerCoordinatorLayout.getContext(), i);
                        loadAnimation2.setAnimationListener(new C8299b.animationAnimation$AnimationListenerC8301b(iVar));
                        containerCoordinatorLayout.startAnimation(loadAnimation2);
                    }
                    iVar.invoke();
                    MethodCollector.m26664o(7001);
                    return;
                }
            }
        } else if (gravity.equals("bottom")) {
            C8299b.m16456a(this.f20545e, mo14628d().getAnimation(), this.f20549j, iVar);
            MethodCollector.m26664o(7001);
            return;
        }
        MethodCollector.m26664o(7001);
    }

    /* renamed from: com.bytedance.android.livesdk.container.j.e$c */
    static final class View$OnClickListenerC8289c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C8286e f20557a;

        static {
            Covode.recordClassIndex(9124);
        }

        View$OnClickListenerC8289c(C8286e eVar) {
            this.f20557a = eVar;
        }

        public final void onClick(View view) {
            this.f20557a.dismissAllowingStateLoss();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.container.j.e$d */
    public static final class C8290d extends C8247a {

        /* renamed from: a */
        final /* synthetic */ C8286e f20558a;

        static {
            Covode.recordClassIndex(9125);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C8290d(C8286e eVar) {
            this.f20558a = eVar;
        }

        @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior.AbstractC4107a, com.bytedance.android.livesdk.container.p510g.C8247a
        /* renamed from: a */
        public final void mo9572a(View view, int i) {
            C89219l.m154721d(view, "");
            if (i == 5) {
                this.f20558a.dismissAllowingStateLoss();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.container.j.e$e */
    public static final class C8291e extends C8247a {

        /* renamed from: a */
        final /* synthetic */ C8286e f20559a;

        static {
            Covode.recordClassIndex(9126);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C8291e(C8286e eVar) {
            this.f20559a = eVar;
        }

        @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior.AbstractC4107a, com.bytedance.android.livesdk.container.p510g.C8247a
        /* renamed from: a */
        public final void mo9572a(View view, int i) {
            ImageView imageView;
            C89219l.m154721d(view, "");
            if (i == 3) {
                ImageView imageView2 = this.f20559a.f20547g;
                if (imageView2 != null) {
                    imageView2.setImageResource(2131234832);
                }
            } else if (i == 4 && (imageView = this.f20559a.f20547g) != null) {
                imageView.setImageResource(2131234833);
            }
        }

        @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior.AbstractC4107a, com.bytedance.android.livesdk.container.p510g.C8247a
        /* renamed from: a */
        public final void mo9571a(View view, float f) {
            AbstractC8221a aVar;
            View f2;
            C89219l.m154721d(view, "");
            super.mo9571a(view, f);
            LivePopupConfig extraConfig = this.f20559a.mo14628d().getExtraConfig();
            if (extraConfig != null) {
                int height = this.f20559a.mo14628d().getHeight() + ((int) (((float) (extraConfig.getVariableHeight() - this.f20559a.mo14628d().getHeight())) * f));
                C8258a aVar2 = this.f20559a.f20546f;
                if (aVar2 != null && (aVar = aVar2.f20491a) != null && (f2 = aVar.mo14496f()) != null) {
                    C8242a.m16384a(f2, height);
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.container.AbstractC8241e
    /* renamed from: a */
    public final void mo14590a(View.OnClickListener onClickListener) {
        C89219l.m154721d(onClickListener, "");
        this.f20548h.add(onClickListener);
    }

    /* renamed from: com.bytedance.android.livesdk.container.j.e$f */
    static final class View$OnClickListenerC8292f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C8286e f20560a;

        static {
            Covode.recordClassIndex(9127);
        }

        View$OnClickListenerC8292f(C8286e eVar) {
            this.f20560a = eVar;
        }

        public final void onClick(View view) {
            Iterator<T> it = this.f20560a.f20548h.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.container.AbstractC8241e
    /* renamed from: a */
    public final void mo14591a(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        C4031a.m9839a(eVar, this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        boolean z;
        super.onAttach(activity);
        if (activity == null || activity.getRequestedOrientation() != 0) {
            z = false;
        } else {
            z = true;
        }
        this.f20549j = z;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment, com.bytedance.android.live.core.widget.C4031a
    public final void onCreate(Bundle bundle) {
        AbstractC2936j hybridDialogManager;
        super.onCreate(bundle);
        AbstractC2928f fVar = (AbstractC2928f) C6193a.m13435a(AbstractC2928f.class);
        if (fVar != null && (hybridDialogManager = fVar.getHybridDialogManager()) != null) {
            hybridDialogManager.mo7675a("ungroup", this);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final Dialog onCreateDialog(Bundle bundle) {
        Context context = getContext();
        if (context == null) {
            C89219l.m154715b();
        }
        DialogC8297k kVar = new DialogC8297k(this, context, getTheme());
        kVar.requestWindowFeature(1);
        return kVar;
    }

    @Override // com.bytedance.android.livesdk.container.AbstractC8241e
    /* renamed from: a */
    public final void mo14592a(LiveBottomSheetBehavior.AbstractC4107a aVar) {
        C89219l.m154721d(aVar, "");
        FrameLayout frameLayout = this.f20550k;
        if (frameLayout != null) {
            LiveBottomSheetBehavior a = LiveBottomSheetBehavior.m9940a(frameLayout);
            C89219l.m154716b(a, "");
            a.mo9574a(aVar);
        }
    }

    @Override // com.bytedance.android.livesdk.container.custom.p506a.AbstractC8233a
    /* renamed from: a */
    public final void mo14581a(AbstractC8234b bVar) {
        C89219l.m154721d(bVar, "");
        ContainerCoordinatorLayout containerCoordinatorLayout = this.f20545e;
        if (containerCoordinatorLayout != null) {
            containerCoordinatorLayout.mo14581a(bVar);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        WindowManager.LayoutParams attributes;
        View decorView;
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        C89219l.m154716b(dialog, "");
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable());
        }
        Dialog dialog2 = getDialog();
        C89219l.m154716b(dialog2, "");
        Window window2 = dialog2.getWindow();
        if (window2 != null && (attributes = window2.getAttributes()) != null) {
            Dialog dialog3 = getDialog();
            C89219l.m154716b(dialog3, "");
            Window window3 = dialog3.getWindow();
            if (!(window3 == null || (decorView = window3.getDecorView()) == null)) {
                decorView.setPadding(0, 0, 0, 0);
            }
            attributes.width = -1;
            attributes.height = -1;
            attributes.gravity = 80;
            attributes.dimAmount = 0.0f;
            Dialog dialog4 = getDialog();
            C89219l.m154716b(dialog4, "");
            Window window4 = dialog4.getWindow();
            if (window4 != null) {
                window4.setAttributes(attributes);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.container.AbstractC8241e
    /* renamed from: a */
    public final void mo14593a(String str) {
        C89219l.m154721d(str, "");
        String gravity = mo14628d().getGravity();
        int hashCode = gravity.hashCode();
        if (hashCode != -1383228885) {
            if (hashCode == -1364013995 && gravity.equals("center")) {
                mo14628d().setDialogAnimation(str);
            }
        } else if (gravity.equals("bottom")) {
            mo14628d().setAnimation(str);
        }
    }

    @Override // androidx.fragment.app.Fragment, com.bytedance.android.live.core.widget.C4031a
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        int height;
        View view2;
        JSONArray pullDownCloseIds;
        int length;
        int i2;
        MethodCollector.m26663i(6705);
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        String gravity = mo14628d().getGravity();
        int hashCode = gravity.hashCode();
        if (hashCode != -1383228885) {
            if (hashCode == -1364013995 && gravity.equals("center")) {
                ContainerCoordinatorLayout containerCoordinatorLayout = this.f20545e;
                String dialogAnimation = mo14628d().getDialogAnimation();
                C89219l.m154721d(dialogAnimation, "");
                if (containerCoordinatorLayout != null) {
                    int hashCode2 = dialogAnimation.hashCode();
                    if (hashCode2 != -1383228885) {
                        if (hashCode2 != -1364013995) {
                            if (hashCode2 == 3387192) {
                                dialogAnimation.equals("none");
                            }
                        } else if (dialogAnimation.equals("center")) {
                            i2 = R.anim.ef;
                        }
                    } else if (dialogAnimation.equals("bottom")) {
                        i2 = R.anim.ek;
                    }
                    containerCoordinatorLayout.startAnimation(AnimationUtils.loadAnimation(containerCoordinatorLayout.getContext(), i2));
                }
            }
        } else if (gravity.equals("bottom")) {
            C8299b.m16455a(this.f20545e, mo14628d().getAnimation(), this.f20549j);
        }
        ContainerCoordinatorLayout containerCoordinatorLayout2 = this.f20545e;
        Integer num = null;
        ViewGroup.LayoutParams layoutParams = containerCoordinatorLayout2 != null ? containerCoordinatorLayout2.getLayoutParams() : null;
        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            layoutParams = null;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            LivePopupConfig extraConfig = mo14628d().getExtraConfig();
            if (extraConfig != null) {
                i = extraConfig.getVariableHeight();
                if (i > 0) {
                    LivePopupConfig extraConfig2 = mo14628d().getExtraConfig();
                    if (extraConfig2 == null || (num = Integer.valueOf(extraConfig2.getVariableHeight())) == null) {
                        C89219l.m154715b();
                    }
                    height = num.intValue();
                }
                height = mo14628d().getHeight();
            } else {
                i = 0;
                height = mo14628d().getHeight();
            }
            layoutParams2.height = height;
            layoutParams2.width = mo14628d().getWidth();
            if (i > 0 && (view2 = getView()) != null) {
                view2.post(new RunnableC8293g(this));
            }
            String gravity2 = mo14628d().getGravity();
            if (gravity2.hashCode() == -1364013995 && gravity2.equals("center")) {
                layoutParams2.gravity = 17;
                C3907ag.m9541a(this.f20545e, mo14628d().getRadius());
            } else {
                layoutParams2.gravity = 81;
                C3907ag.m9542b(this.f20545e, mo14628d().getRadius());
            }
        }
        if (!mo14628d().getDisableMaskClose()) {
            mo14590a(new View$OnClickListenerC8289c(this));
        }
        FrameLayout frameLayout = this.f20550k;
        if (frameLayout != null) {
            LiveBottomSheetBehavior a = LiveBottomSheetBehavior.m9940a(frameLayout);
            C89219l.m154716b(a, "");
            a.mo9578b(mo14628d().getHeight());
            a.mo9575a(false);
            if (C89219l.m154714a((Object) mo14628d().getGravity(), (Object) "bottom")) {
                if (mo14628d().getPullDownClose()) {
                    a.mo9580b(true);
                    a.mo9574a(new C8290d(this));
                } else {
                    a.mo9580b(false);
                }
                LivePopupConfig extraConfig3 = mo14628d().getExtraConfig();
                if (extraConfig3 == null || extraConfig3.getVariableHeight() <= 0) {
                    ImageView imageView = this.f20547g;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                } else {
                    ImageView imageView2 = this.f20547g;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                    }
                    a.mo9574a(new C8291e(this));
                }
            } else {
                a.f11415m = false;
            }
        }
        ViewGroup viewGroup = this.f20551l;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new View$OnClickListenerC8292f(this));
        }
        if (!mo14628d().getShowMask()) {
            ViewGroup viewGroup2 = this.f20551l;
            if (viewGroup2 != null) {
                viewGroup2.setBackgroundColor(0);
            }
        } else {
            HColor maskBgColor = mo14628d().getMaskBgColor();
            if (maskBgColor != null) {
                Integer valueOf = Integer.valueOf(maskBgColor.getColor(getContext()));
                if (!(valueOf.intValue() == 0 || valueOf == null)) {
                    int intValue = valueOf.intValue();
                    ViewGroup viewGroup3 = this.f20551l;
                    if (viewGroup3 != null) {
                        viewGroup3.setBackgroundColor(intValue);
                    }
                }
            }
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnKeyListener(new DialogInterface$OnKeyListenerC8288b(this));
        }
        Dialog dialog2 = getDialog();
        C89219l.m154716b(dialog2, "");
        Window window = dialog2.getWindow();
        if (window != null) {
            C89219l.m154716b(window, "");
            ContainerCoordinatorLayout containerCoordinatorLayout3 = this.f20545e;
            if (containerCoordinatorLayout3 != null) {
                containerCoordinatorLayout3.setOwnerWindow(window);
            }
        }
        C8258a a2 = C8258a.C8259a.m16412a(mo14628d());
        a2.mo14601b(m16439e());
        this.f20546f = a2;
        getChildFragmentManager().mo3552a().mo3453a(R.id.bgb, a2).mo3473c();
        PopupConfig d = mo14628d();
        C89219l.m154721d(d, "");
        C89219l.m154721d(this, "");
        mo14590a(new C8243a.View$OnClickListenerC8244a(this));
        LivePopupConfig extraConfig4 = d.getExtraConfig();
        if (!(extraConfig4 == null || (pullDownCloseIds = extraConfig4.getPullDownCloseIds()) == null || (length = pullDownCloseIds.length()) == 0)) {
            AbstractC2953a a3 = C6193a.m13435a(AbstractC2928f.class);
            C89219l.m154716b(a3, "");
            AbstractC2936j hybridDialogManager = ((AbstractC2928f) a3).getHybridDialogManager();
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < length; i3++) {
                String optString = pullDownCloseIds.optString(i3, "unknown");
                C89219l.m154716b(optString, "");
                C4031a b = hybridDialogManager.mo7676b(optString);
                if (b instanceof AbstractC8241e) {
                    arrayList.add(b);
                }
            }
            mo14592a(new C8243a.C8246c(arrayList, this));
        }
        C8243a.m16385a(d);
        MethodCollector.m26664o(6705);
    }

    /* renamed from: com.bytedance.android.livesdk.container.j.e$b */
    static final class DialogInterface$OnKeyListenerC8288b implements DialogInterface.OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ C8286e f20556a;

        static {
            Covode.recordClassIndex(9123);
        }

        DialogInterface$OnKeyListenerC8288b(C8286e eVar) {
            this.f20556a = eVar;
        }

        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            AbstractC8221a aVar;
            AbstractC8221a aVar2;
            C89219l.m154716b(keyEvent, "");
            if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
                if (this.f20556a.mo14628d().getDisableBackPress()) {
                    return true;
                }
                C8258a aVar3 = this.f20556a.f20546f;
                if (!(aVar3 == null || (aVar = aVar3.f20491a) == null || !aVar.mo14497g())) {
                    C8258a aVar4 = this.f20556a.f20546f;
                    if (!(aVar4 == null || (aVar2 = aVar4.f20491a) == null)) {
                        aVar2.mo14498h();
                    }
                    return true;
                }
            }
            return false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        View a = C1764a.m5927a(getLayoutInflater(), R.layout.bcg, viewGroup, false);
        this.f20550k = (FrameLayout) a.findViewById(R.id.bg7);
        this.f20551l = (ViewGroup) a.findViewById(R.id.d4p);
        this.f20552m = a.findViewById(R.id.d4r);
        this.f20545e = (ContainerCoordinatorLayout) a.findViewById(R.id.ack);
        this.f20547g = (ImageView) a.findViewById(R.id.bg8);
        return a;
    }
}
