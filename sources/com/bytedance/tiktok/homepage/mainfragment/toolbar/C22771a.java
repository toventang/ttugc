package com.bytedance.tiktok.homepage.mainfragment.toolbar;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.experiment.C46720aw;
import com.p2082ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.p2082ss.android.ugc.aweme.notice.DmNoticeProxyImpl;
import com.p2082ss.android.ugc.aweme.notice.api.C61542b;
import com.p2082ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3251b.C56198e;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.bytedance.tiktok.homepage.mainfragment.toolbar.a */
public class C22771a extends AbstractC22773c implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public View f53782a;

    /* renamed from: b */
    public DmNoticeProxy f53783b = DmNoticeProxyImpl.m111428e();

    /* renamed from: c */
    public AbstractC22772b f53784c;

    static {
        Covode.recordClassIndex(26667);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.AbstractC22773c
    /* renamed from: a */
    public final boolean mo37085a() {
        return false;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.AbstractC22773c
    /* renamed from: c */
    public final int mo37087c() {
        return 8388613;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(82, new RunnableC90250g(C22771a.class, "onUnder16RefreshEvent", C56198e.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.AbstractC22773c
    /* renamed from: b */
    public final View mo37086b() {
        MethodCollector.m26663i(14186);
        if (this.f53784c.getActivity() == null) {
            MethodCollector.m26664o(14186);
            return null;
        }
        if (C46720aw.m90103b()) {
            View c = HomePageUIFrameServiceImpl.m108627e().mo89389c(this.f53784c.getActivity());
            this.f53782a = c;
            if (c == null) {
                MethodCollector.m26664o(14186);
                return null;
            }
            ViewGroup viewGroup = (ViewGroup) c.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f53782a);
            }
        } else {
            this.f53782a = HomePageUIFrameServiceImpl.m108627e().mo89394e(this.f53784c.getActivity());
        }
        View view = this.f53782a;
        MethodCollector.m26664o(14186);
        return view;
    }

    public C22771a(AbstractC22772b bVar) {
        this.f53784c = bVar;
        EventBus.m156966a(EventBus.m156962a(), this);
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onUnder16RefreshEvent(C56198e eVar) {
        if (this.f53782a != null && this.f53783b.mo99181b()) {
            this.f53782a.setVisibility(8);
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.AbstractC22773c
    /* renamed from: a */
    public final void mo37084a(View view) {
        if (C61542b.m111467b().shouldRedictToTipsPage()) {
            C61542b.m111467b().goToTipsPage();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("enter_from", this.f53784c.mo37091g());
        bundle.putString("enter_method", "button");
        bundle.putString("notice_type", this.f53783b.mo99182c());
        bundle.putInt("message_cnt", this.f53783b.mo99183d());
        HomePageUIFrameServiceImpl.m108627e().mo89382a(this.f53784c.getActivity(), bundle);
    }
}
