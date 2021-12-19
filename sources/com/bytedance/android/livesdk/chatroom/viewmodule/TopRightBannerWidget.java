package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.banner.InRoomBannerManager;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.broadcast.p196e.C3227a;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.liveinteract.api.p261b.C4415e;
import com.bytedance.android.live.liveinteract.api.p261b.C4417f;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p379n.C5789u;
import com.bytedance.android.live.p379n.C5794z;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6953a;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6956d;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6963e;
import com.bytedance.android.livesdk.chatroom.p488c.C7410z;
import com.bytedance.android.livesdk.chatroom.p490e.C7498p;
import com.bytedance.android.livesdk.event.C8461n;
import com.bytedance.android.livesdk.livesetting.LiveBannerExperiment;
import com.bytedance.android.livesdk.livesetting.banner.LiveUseBannerAnimationSetting;
import com.bytedance.android.livesdk.model.C9589i;
import com.bytedance.android.livesdk.model.message.C9603ag;
import com.bytedance.android.livesdk.model.message.C9695c;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9034ba;
import com.bytedance.android.livesdk.p561j.C9077cp;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9116ea;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.C11116a;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11180y;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdk.util.rxutils.autodispose.C11152e;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.bytedance.ies.web.jsbridge2.C18364w;
import com.google.gson.AbstractC28019l;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

public final class TopRightBannerWidget extends LiveRecyclableWidget implements C7498p.AbstractC7499a, AbstractC33974au {

    /* renamed from: o */
    private static final C7993b f19919o = new C7993b((byte) 0);

    /* renamed from: a */
    AbstractC6956d.C6962f f19920a;

    /* renamed from: b */
    public LinearLayout f19921b;

    /* renamed from: c */
    Room f19922c;

    /* renamed from: d */
    public ImageView f19923d;

    /* renamed from: e */
    AnimatorSet f19924e;

    /* renamed from: f */
    public C9695c.C9696a f19925f;

    /* renamed from: g */
    private EnumC7992a f19926g;

    /* renamed from: h */
    private EnumC7992a f19927h;

    /* renamed from: i */
    private WebView f19928i;

    /* renamed from: j */
    private boolean f19929j;

    /* renamed from: k */
    private boolean f19930k;

    /* renamed from: l */
    private C7498p f19931l;

    /* renamed from: m */
    private final boolean f19932m = LiveBannerExperiment.isNewBannerEnable();

    /* renamed from: n */
    private boolean f19933n;

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget$a */
    enum EnumC7992a {
        NORMAL,
        PK;

        static {
            Covode.recordClassIndex(8799);
        }
    }

    static {
        Covode.recordClassIndex(8798);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq
    /* renamed from: a */
    public final void mo10546a(Throwable th) {
        AbstractC8095br.m16255a(this, th);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bgv;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget$b */
    static final class C7993b {
        static {
            Covode.recordClassIndex(8800);
        }

        private C7993b() {
        }

        public /* synthetic */ C7993b(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        this.f19930k = true;
    }

    @Override // com.bytedance.android.widget.Widget
    public final void show() {
        if (this.f19925f != null) {
            super.show();
        }
    }

    public TopRightBannerWidget() {
        EnumC7992a aVar = EnumC7992a.NORMAL;
        this.f19926g = aVar;
        this.f19927h = aVar;
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq
    /* renamed from: g */
    public final String mo10549g() {
        return getClass().getName();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
        try {
            AbstractC6956d.C6962f fVar = this.f19920a;
            if (fVar != null) {
                fVar.mo13267a("container_disappear", new JSONObject());
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(StringSet.type, "app");
                jSONObject.put("args", new JSONObject().put("foreground", false));
                fVar.mo13267a("H5_appStateChange", jSONObject);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        try {
            AbstractC6956d.C6962f fVar = this.f19920a;
            if (fVar != null) {
                fVar.mo13267a("container_appear", new JSONObject());
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(StringSet.type, "app");
                jSONObject.put("args", new JSONObject().put("foreground", true));
                fVar.mo13267a("H5_appStateChange", jSONObject);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        MethodCollector.m26663i(5376);
        m16187b(false);
        C7498p pVar = this.f19931l;
        if (pVar == null) {
            C89219l.m154710a("mPresenter");
        }
        pVar.mo8577b();
        LinearLayout linearLayout = this.f19921b;
        if (linearLayout == null) {
            C89219l.m154710a("staticContainer");
        }
        linearLayout.removeView(this.f19928i);
        ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager().mo13250a(this.f19920a);
        m16185a(this.f19924e);
        MethodCollector.m26664o(5376);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget$l */
    public static final class C8003l implements C3951p.AbstractC3953a {

        /* renamed from: a */
        final /* synthetic */ TopRightBannerWidget f19946a;

        static {
            Covode.recordClassIndex(8810);
        }

        @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
        /* renamed from: a */
        public final void mo9301a(ImageModel imageModel) {
            C89219l.m154721d(imageModel, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C8003l(TopRightBannerWidget topRightBannerWidget) {
            this.f19946a = topRightBannerWidget;
        }

        @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
        /* renamed from: a */
        public final void mo9303a(ImageModel imageModel, Exception exc) {
            C89219l.m154721d(imageModel, "");
            C89219l.m154721d(exc, "");
            TopRightBannerWidget.m16184a(this.f19946a).setVisibility(0);
            TopRightBannerWidget.m16186b(this.f19946a).setVisibility(8);
        }

        @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
        /* renamed from: a */
        public final void mo9302a(ImageModel imageModel, int i, int i2) {
            C89219l.m154721d(imageModel, "");
            TopRightBannerWidget topRightBannerWidget = this.f19946a;
            ImageView imageView = topRightBannerWidget.f19923d;
            if (imageView == null) {
                C89219l.m154710a("mAnimateView");
            }
            ViewParent parent = imageView.getParent();
            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
            int width = ((View) parent).getWidth();
            ImageView imageView2 = topRightBannerWidget.f19923d;
            if (imageView2 == null) {
                C89219l.m154710a("mAnimateView");
            }
            float width2 = (((float) (width - imageView2.getWidth())) * 0.5f) + ((float) C3966y.m9653a(10.0f));
            ImageView imageView3 = topRightBannerWidget.f19923d;
            if (imageView3 == null) {
                C89219l.m154710a("mAnimateView");
            }
            float height = (((float) imageView3.getHeight()) * 0.8f) + ((float) C3966y.m9653a(10.0f));
            ImageView imageView4 = topRightBannerWidget.f19923d;
            if (imageView4 == null) {
                C89219l.m154710a("mAnimateView");
            }
            ViewParent parent2 = imageView4.getParent();
            Objects.requireNonNull(parent2, "null cannot be cast to non-null type android.view.View");
            float height2 = height - ((float) ((View) parent2).getHeight());
            TopRightBannerWidget.m16185a(topRightBannerWidget.f19924e);
            ImageView imageView5 = topRightBannerWidget.f19923d;
            if (imageView5 == null) {
                C89219l.m154710a("mAnimateView");
            }
            C8004m mVar = new C8004m(topRightBannerWidget);
            AnimatorSet animatorSet = new AnimatorSet();
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(ObjectAnimator.ofFloat(imageView5, "scaleX", 0.0f, 1.1f).setDuration(400L), ObjectAnimator.ofFloat(imageView5, "scaleY", 0.0f, 1.1f).setDuration(400L), ObjectAnimator.ofFloat(imageView5, "alpha", 0.0f, 1.0f).setDuration(400L));
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(ObjectAnimator.ofFloat(imageView5, "scaleX", 1.1f, 1.0f).setDuration(400L), ObjectAnimator.ofFloat(imageView5, "scaleY", 1.1f, 1.0f).setDuration(400L));
            animatorSet.playSequentially(animatorSet2, animatorSet3);
            AnimatorSet animatorSet4 = new AnimatorSet();
            AnimatorSet animatorSet5 = new AnimatorSet();
            animatorSet5.playTogether(ObjectAnimator.ofFloat(imageView5, "scaleX", 1.0f, 0.6f).setDuration(800L), ObjectAnimator.ofFloat(imageView5, "scaleY", 1.0f, 0.6f).setDuration(800L), ObjectAnimator.ofFloat(imageView5, "translationX", 0.0f, width2).setDuration(800L), ObjectAnimator.ofFloat(imageView5, "translationY", 0.0f, height2).setDuration(800L));
            AnimatorSet animatorSet6 = new AnimatorSet();
            ObjectAnimator duration = ObjectAnimator.ofFloat(imageView5, "rotation", 0.0f, 8.0f).setDuration(120L);
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(imageView5, "rotation", 8.0f, -8.0f).setDuration(120L);
            ObjectAnimator duration3 = ObjectAnimator.ofFloat(imageView5, "rotation", -8.0f, 0.0f).setDuration(120L);
            animatorSet6.setStartDelay(1000);
            animatorSet6.playSequentially(duration, duration2, duration3);
            AnimatorSet animatorSet7 = new AnimatorSet();
            animatorSet7.playTogether(ObjectAnimator.ofFloat(imageView5, "scaleX", 0.6f, 0.5f).setDuration(400L), ObjectAnimator.ofFloat(imageView5, "scaleY", 0.6f, 0.5f).setDuration(400L), ObjectAnimator.ofFloat(imageView5, "alpha", 1.0f, 0.0f).setDuration(400L));
            animatorSet7.setStartDelay(2200);
            animatorSet4.playTogether(animatorSet5, animatorSet6, animatorSet7);
            AnimatorSet animatorSet8 = new AnimatorSet();
            animatorSet8.playSequentially(animatorSet, animatorSet4);
            animatorSet8.addListener(mVar);
            topRightBannerWidget.f19924e = animatorSet8;
            AnimatorSet animatorSet9 = topRightBannerWidget.f19924e;
            if (animatorSet9 != null) {
                animatorSet9.start();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget$m */
    public static final class C8004m implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ TopRightBannerWidget f19947a;

        static {
            Covode.recordClassIndex(8811);
        }

        public final void onAnimationCancel(Animator animator) {
            C89219l.m154721d(animator, "");
        }

        public final void onAnimationRepeat(Animator animator) {
            C89219l.m154721d(animator, "");
        }

        public final void onAnimationStart(Animator animator) {
            C89219l.m154721d(animator, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C8004m(TopRightBannerWidget topRightBannerWidget) {
            this.f19947a = topRightBannerWidget;
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154721d(animator, "");
            TopRightBannerWidget.m16186b(this.f19947a).setVisibility(8);
            TopRightBannerWidget.m16184a(this.f19947a).setVisibility(0);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ LinearLayout m16184a(TopRightBannerWidget topRightBannerWidget) {
        LinearLayout linearLayout = topRightBannerWidget.f19921b;
        if (linearLayout == null) {
            C89219l.m154710a("staticContainer");
        }
        return linearLayout;
    }

    /* renamed from: b */
    public static final /* synthetic */ ImageView m16186b(TopRightBannerWidget topRightBannerWidget) {
        ImageView imageView = topRightBannerWidget.f19923d;
        if (imageView == null) {
            C89219l.m154710a("mAnimateView");
        }
        return imageView;
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget$f */
    static final class C7997f extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ TopRightBannerWidget f19941a;

        static {
            Covode.recordClassIndex(8804);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7997f(TopRightBannerWidget topRightBannerWidget) {
            super(1);
            this.f19941a = topRightBannerWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            boolean z;
            Boolean bool2 = bool;
            TopRightBannerWidget topRightBannerWidget = this.f19941a;
            if (bool2 != null) {
                z = bool2.booleanValue();
            } else {
                z = false;
            }
            topRightBannerWidget.mo14294a(z);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget$g */
    static final class C7998g extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ TopRightBannerWidget f19942a;

        static {
            Covode.recordClassIndex(8805);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7998g(TopRightBannerWidget topRightBannerWidget) {
            super(1);
            this.f19942a = topRightBannerWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            boolean z;
            Boolean bool2 = bool;
            TopRightBannerWidget topRightBannerWidget = this.f19942a;
            if (bool2 != null) {
                z = bool2.booleanValue();
            } else {
                z = false;
            }
            topRightBannerWidget.mo14294a(z);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget$i */
    static final /* synthetic */ class C8000i extends C89217j implements AbstractC89172b<Boolean, C89391z> {
        static {
            Covode.recordClassIndex(8807);
        }

        C8000i(TopRightBannerWidget topRightBannerWidget) {
            super(1, topRightBannerWidget, TopRightBannerWidget.class, "onMicRoomHostToChange", "onMicRoomHostToChange(Z)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            AbstractC6956d.C6962f fVar;
            boolean booleanValue = bool.booleanValue();
            TopRightBannerWidget topRightBannerWidget = (TopRightBannerWidget) this.receiver;
            if (booleanValue && (fVar = topRightBannerWidget.f19920a) != null) {
                fVar.mo13267a("H5_micRoomStateChanged", new JSONObject());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget$j */
    static final class C8001j<T> implements AbstractC88438k {

        /* renamed from: a */
        public static final C8001j f19944a = new C8001j();

        static {
            Covode.recordClassIndex(8808);
        }

        C8001j() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final /* synthetic */ boolean mo7718a(Object obj) {
            C8461n nVar = (C8461n) obj;
            C89219l.m154721d(nVar, "");
            if (nVar.f20915a == AbstractC2994b.EnumC2995a.Login) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    static void m16185a(Animator animator) {
        if (animator != null) {
            animator.removeAllListeners();
            animator.end();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        View findViewById = findViewById(R.id.e71);
        C89219l.m154716b(findViewById, "");
        this.f19921b = (LinearLayout) findViewById;
        View findViewById2 = findViewById(R.id.bsi);
        C89219l.m154716b(findViewById2, "");
        this.f19923d = (ImageView) findViewById2;
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget$h */
    static final class C7999h extends AbstractC89220m implements AbstractC89172b<C4415e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ TopRightBannerWidget f19943a;

        static {
            Covode.recordClassIndex(8806);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7999h(TopRightBannerWidget topRightBannerWidget) {
            super(1);
            this.f19943a = topRightBannerWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C4415e eVar) {
            C4415e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            TopRightBannerWidget topRightBannerWidget = this.f19943a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", eVar2.f12015a);
            AbstractC6956d.C6962f fVar = topRightBannerWidget.f19920a;
            if (fVar != null) {
                fVar.mo13267a("H5_linkMicStatusChanged", jSONObject);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    private final void m16187b(boolean z) {
        boolean z2 = this.f19933n;
        if (z2 != z) {
            if (z2) {
                C3227a.m8721a("task_banner");
            } else {
                C3227a.m8722b("activity_banner");
            }
            this.f19933n = z;
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.mo28315b(C9116ea.class, Boolean.valueOf(this.f19933n));
            }
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null) {
                dataChannel2.mo28320c(C5794z.class, Boolean.valueOf(this.f19933n));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List<C9589i> mo14291a(List<? extends C9589i> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            T t2 = t;
            if (this.f19929j || t2.f23262s == null || t2.f23262s.longValue() - 3 != 0) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget$k */
    static final class C8002k<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ TopRightBannerWidget f19945a;

        static {
            Covode.recordClassIndex(8809);
        }

        C8002k(TopRightBannerWidget topRightBannerWidget) {
            this.f19945a = topRightBannerWidget;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC6953a aVar;
            C18364w a;
            String str;
            C8461n nVar = (C8461n) obj;
            TopRightBannerWidget topRightBannerWidget = this.f19945a;
            if (nVar != null) {
                try {
                    AbstractC6956d.C6962f fVar = topRightBannerWidget.f19920a;
                    if (fVar != null && (aVar = fVar.f17424b) != null && (a = aVar.mo13236a()) != null) {
                        JSONObject jSONObject = new JSONObject();
                        JSONObject jSONObject2 = new JSONObject();
                        AbstractC2994b.EnumC2995a aVar2 = nVar.f20915a;
                        if (aVar2 != null) {
                            int i = C8099bu.f20109a[aVar2.ordinal()];
                            if (i == 1) {
                                str = "1";
                            } else if (i == 2) {
                                str = "2";
                            } else if (i == 3) {
                                str = "3";
                            }
                            a.mo29404a("H5_loginStatus", jSONObject.put("args", jSONObject2.put("code", str)));
                        }
                        str = "0";
                        a.mo29404a("H5_loginStatus", jSONObject.put("args", jSONObject2.put("code", str)));
                    }
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget$d */
    public static final class View$OnClickListenerC7995d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C9589i f19938a;

        /* renamed from: b */
        final /* synthetic */ TopRightBannerWidget f19939b;

        static {
            Covode.recordClassIndex(8802);
        }

        View$OnClickListenerC7995d(C9589i iVar, TopRightBannerWidget topRightBannerWidget) {
            this.f19938a = iVar;
            this.f19939b = topRightBannerWidget;
        }

        public final void onClick(View view) {
            Context context = this.f19939b.context;
            C9589i iVar = this.f19938a;
            int i = iVar.f23251h;
            if (i == 2) {
                AbstractC6956d webViewManager = ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager();
                AbstractC6956d.C6957a b = AbstractC6963e.m14872b(iVar.f23249f);
                b.f17378b = iVar.f23245b;
                webViewManager.mo13248a(context, b);
            } else if (i != 3) {
                C29844g gVar = new C29844g(iVar.f23249f);
                gVar.mo52130a("title", iVar.f23245b);
                ((IActionHandlerService) C6193a.m13435a(IActionHandlerService.class)).handle(context, Uri.parse(gVar.mo52126a()));
            } else {
                C29844g gVar2 = new C29844g(iVar.f23249f);
                AbstractC2994b a = C11115u.m19743a().mo17915b().mo13147a();
                int i2 = 0;
                if (a.getUserHonor() != null && a.getUserHonor().mo16482l() == 0) {
                    i2 = 1;
                }
                gVar2.mo52130a("is_first_consume", String.valueOf(i2));
                C6779a.m14563a().mo13053a(new C7410z(gVar2.mo52126a(), "banner"));
            }
            this.f19939b.mo14293a(String.valueOf(this.f19938a.f23244a), "live_banner_click");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget$e */
    static final class C7996e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ TopRightBannerWidget f19940a;

        static {
            Covode.recordClassIndex(8803);
        }

        C7996e(TopRightBannerWidget topRightBannerWidget) {
            this.f19940a = topRightBannerWidget;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            EnumC11728i iVar;
            MethodCollector.m26663i(5172);
            C9695c cVar = ((InRoomBannerManager.C2944a) obj).f8691b;
            TopRightBannerWidget topRightBannerWidget = this.f19940a;
            C9695c.C9696a aVar = cVar.f23629b;
            topRightBannerWidget.f19925f = aVar;
            if (aVar == null) {
                topRightBannerWidget.hide();
                ImageView imageView = topRightBannerWidget.f19923d;
                if (imageView == null) {
                    C89219l.m154710a("mAnimateView");
                }
                imageView.setVisibility(8);
                LinearLayout linearLayout = topRightBannerWidget.f19921b;
                if (linearLayout == null) {
                    C89219l.m154710a("staticContainer");
                }
                linearLayout.setVisibility(8);
                LinearLayout linearLayout2 = topRightBannerWidget.f19921b;
                if (linearLayout2 == null) {
                    C89219l.m154710a("staticContainer");
                }
                linearLayout2.removeAllViews();
                MethodCollector.m26664o(5172);
                return;
            }
            if (aVar.f23637c != null && LiveUseBannerAnimationSetting.INSTANCE.enable()) {
                Room room = topRightBannerWidget.f19922c;
                if (room != null) {
                    iVar = room.getStreamType();
                } else {
                    iVar = null;
                }
                if (iVar == EnumC11728i.VIDEO) {
                    ImageView imageView2 = topRightBannerWidget.f19923d;
                    if (imageView2 == null) {
                        C89219l.m154710a("mAnimateView");
                    }
                    imageView2.setVisibility(0);
                    LinearLayout linearLayout3 = topRightBannerWidget.f19921b;
                    if (linearLayout3 == null) {
                        C89219l.m154710a("staticContainer");
                    }
                    linearLayout3.setVisibility(8);
                    topRightBannerWidget.mo14292a(aVar);
                    ImageView imageView3 = topRightBannerWidget.f19923d;
                    if (imageView3 == null) {
                        C89219l.m154710a("mAnimateView");
                    }
                    C3951p.m9627a(imageView3, aVar.f23637c, 0, new C8003l(topRightBannerWidget));
                    MethodCollector.m26664o(5172);
                    return;
                }
            }
            topRightBannerWidget.mo14292a(aVar);
            MethodCollector.m26664o(5172);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.p490e.C7498p.AbstractC7499a
    /* renamed from: a */
    public final void mo13746a(C9603ag agVar) {
        String str;
        String str2;
        Long l;
        String str3;
        C89219l.m154721d(agVar, "");
        String a = C4139e.C4140a.f11575b.mo46672a((AbstractC28019l) agVar.f23310a);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(StringSet.type, "refresh");
        jSONObject.put("data", a);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject put = jSONObject2.put("enter_from_merge", C6544e.m13987a()).put("enter_method", C6544e.m13990d());
        if (this.f19929j) {
            str = "live_take_detail";
        } else {
            str = "live_detail";
        }
        JSONObject put2 = put.put("event_page", str);
        Room room = this.f19922c;
        String str4 = null;
        if (room != null) {
            str2 = String.valueOf(room.getId());
        } else {
            str2 = null;
        }
        JSONObject put3 = put2.put("room_id", str2);
        Room room2 = this.f19922c;
        if (room2 != null) {
            l = Long.valueOf(room2.getOwnerUserId());
        } else {
            l = null;
        }
        JSONObject put4 = put3.put("anchor_id", String.valueOf(l));
        Room room3 = this.f19922c;
        if (room3 != null) {
            str3 = room3.getRequestId();
        } else {
            str3 = null;
        }
        JSONObject put5 = put4.put("request_id", str3);
        Room room4 = this.f19922c;
        if (room4 != null) {
            str4 = room4.getLog_pb();
        }
        put5.put("log_pb", str4);
        jSONObject.put("log", jSONObject2);
        AbstractC6956d.C6962f fVar = this.f19920a;
        if (fVar != null) {
            fVar.mo13267a("H5_roomStatusChange", jSONObject);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room;
        boolean z;
        Room room2;
        Boolean bool;
        DataChannel dataChannel = this.dataChannel;
        Long l = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.mo28318b(C9093de.class);
        } else {
            room = null;
        }
        this.f19922c = room;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 == null || (bool = (Boolean) dataChannel2.mo28318b(C9119ed.class)) == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        this.f19929j = z;
        C7498p pVar = new C7498p(this.f19922c, this.f19929j);
        this.f19931l = pVar;
        pVar.mo10297a((C7498p.AbstractC7499a) this);
        DataChannel dataChannel3 = this.dataChannel;
        if (!(dataChannel3 == null || (room2 = (Room) dataChannel3.mo28318b(C9093de.class)) == null)) {
            l = Long.valueOf(room2.getId());
        }
        AbstractC11181z zVar = (AbstractC11181z) InRoomBannerManager.m8277a(l).mo143274a(WidgetExtendsKt.autoDispose(this));
        if (zVar != null) {
            zVar.mo17949a(new C7996e(this));
        }
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            dataChannel4.mo28309a((AbstractC1204m) this, C9034ba.class, (AbstractC89172b) new C7997f(this)).mo28309a((AbstractC1204m) this, C9077cp.class, (AbstractC89172b) new C7998g(this)).mo28309a((AbstractC1204m) this, C4417f.class, (AbstractC89172b) new C7999h(this)).mo28309a((AbstractC1204m) this, C5789u.class, (AbstractC89172b) new C8000i(this));
        }
        ((AbstractC11180y) C11115u.m19743a().mo17915b().mo13168h().mo143206c().mo143199a(C8001j.f19944a).mo143200a(C11152e.m19790a(this))).mo17947a(new C8002k(this));
    }

    /* renamed from: a */
    public final void mo14294a(boolean z) {
        WebView webView;
        AbstractC6956d.C6962f fVar = this.f19920a;
        if (fVar != null && (webView = fVar.f17423a) != null) {
            webView.setFocusable(!z);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c2, code lost:
        r11 = false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14292a(com.bytedance.android.livesdk.model.message.C9695c.C9696a r15) {
        /*
        // Method dump skipped, instructions count: 546
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget.mo14292a(com.bytedance.android.livesdk.model.message.c$a):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget$c */
    public static final class C7994c implements AbstractC6956d.AbstractC6961e {

        /* renamed from: a */
        final /* synthetic */ TopRightBannerWidget f19937a;

        static {
            Covode.recordClassIndex(8801);
        }

        C7994c(TopRightBannerWidget topRightBannerWidget) {
            this.f19937a = topRightBannerWidget;
        }

        @Override // com.bytedance.android.livesdk.browser.p462c.AbstractC6956d.AbstractC6961e
        /* renamed from: a */
        public final void mo13231a(WebView webView, String str) {
            TopRightBannerWidget topRightBannerWidget = this.f19937a;
            C9695c.C9696a aVar = topRightBannerWidget.f19925f;
            if (topRightBannerWidget.isViewValid() && webView != null) {
                webView.setVisibility(0);
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (aVar != null) {
                        jSONObject.put("data", C11116a.m19747a(topRightBannerWidget.mo14291a(aVar.f23636b)));
                        jSONObject.put(StringSet.type, "init");
                        AbstractC6956d.C6962f fVar = topRightBannerWidget.f19920a;
                        if (fVar != null) {
                            fVar.mo13267a("H5_roomStatusChange", jSONObject);
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo14293a(String str, String str2) {
        String str3;
        HashMap hashMap = new HashMap();
        hashMap.put("banner_id", str);
        hashMap.put("request_page", "topright");
        C6501b b = C6501b.C6502a.m13948a(str2).mo12652a((Map<String, String>) hashMap).mo12643a(this.dataChannel).mo12654b("live_function");
        if (this.f19929j) {
            str3 = "live_take_detail";
        } else {
            str3 = "live_detail";
        }
        b.mo12658d(str3).mo12655b();
    }
}
