package com.p2082ss.android.ugc.aweme.crossplatform;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.CrossPlatformLegacyServiceImpl;
import com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40739d;
import com.p2082ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.search.jsbridge.C42917a;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.a */
public final class C40517a implements AbstractC40739d, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public boolean f94791a;

    /* renamed from: b */
    public final CrossPlatformWebView f94792b;

    static {
        Covode.recordClassIndex(48333);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(175, new RunnableC90250g(C40517a.class, "onH5ComponentDidMount", C42917a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public C40517a(CrossPlatformWebView crossPlatformWebView) {
        C89219l.m154721d(crossPlatformWebView, "");
        this.f94792b = crossPlatformWebView;
        C89219l.m154721d(this, "");
        crossPlatformWebView.f95345b.add(this);
        EventBus.m156966a(EventBus.m156962a(), this);
    }

    @AbstractC90264r
    public final void onH5ComponentDidMount(C42917a aVar) {
        C89219l.m154721d(aVar, "");
        this.f94791a = true;
        CrossPlatformLegacyServiceImpl.m65225f();
        this.f94792b.getDisplayed();
    }
}
