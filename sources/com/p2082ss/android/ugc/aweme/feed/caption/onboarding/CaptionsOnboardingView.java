package com.p2082ss.android.ugc.aweme.feed.caption.onboarding;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p2082ss.android.ugc.aweme.p2929fe.method.C47959j;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.caption.onboarding.CaptionsOnboardingView */
public final class CaptionsOnboardingView extends FrameLayout implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public static final String f113569a = "cla_crowdsourcing_close_opt_in_half_sheet";

    /* renamed from: b */
    public static final C49415a f113570b = new C49415a((byte) 0);

    /* renamed from: c */
    private final AbstractC89244h f113571c;

    /* renamed from: d */
    private final AbstractC89171a<C89391z> f113572d;

    private final CrossPlatformWebView getCPWebView() {
        return (CrossPlatformWebView) this.f113571c.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(58, new RunnableC90250g(CaptionsOnboardingView.class, "onJsBroadCastEvent", C47959j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.onboarding.CaptionsOnboardingView$a */
    public static final class C49415a {
        static {
            Covode.recordClassIndex(58228);
        }

        private C49415a() {
        }

        public /* synthetic */ C49415a(byte b) {
            this();
        }
    }

    public final AbstractC89171a<C89391z> getOnHalfsheetBroadcastEventReceived() {
        return this.f113572d;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.onboarding.CaptionsOnboardingView$b */
    static final class C49416b extends AbstractC89220m implements AbstractC89171a<CrossPlatformWebView> {

        /* renamed from: a */
        final /* synthetic */ CaptionsOnboardingView f113573a;

        static {
            Covode.recordClassIndex(58229);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49416b(CaptionsOnboardingView captionsOnboardingView) {
            super(0);
            this.f113573a = captionsOnboardingView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ CrossPlatformWebView invoke() {
            return this.f113573a.findViewById(R.id.fii);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        EventBus.m156962a().mo145395b(this);
    }

    static {
        Covode.recordClassIndex(58227);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        EventBus.m156966a(EventBus.m156962a(), this);
        getCPWebView().mo69920a("https://www.tiktok.com/web-inapp/cla/crowdsourcing/opt-in?enter_from=caption_credit&enter_method=caption", false, false);
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C47959j jVar) {
        C89219l.m154721d(jVar, "");
        if (C89219l.m154714a((Object) jVar.f111077b.optString("eventName"), (Object) f113569a)) {
            this.f113572d.invoke();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CaptionsOnboardingView(Context context, AbstractC89171a<C89391z> aVar) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        MethodCollector.m26663i(3572);
        this.f113572d = aVar;
        this.f113571c = C89250i.m154773a((AbstractC89171a) new C49416b(this));
        FrameLayout.inflate(context, R.layout.rv, this);
        MethodCollector.m26664o(3572);
    }

    public /* synthetic */ CaptionsOnboardingView(Context context, AbstractC89171a aVar, byte b) {
        this(context, aVar);
    }
}
