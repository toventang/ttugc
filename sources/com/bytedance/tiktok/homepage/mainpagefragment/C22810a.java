package com.bytedance.tiktok.homepage.mainpagefragment;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2335aq.p2337b.C33922a;
import com.p2082ss.android.ugc.aweme.p2335aq.p2337b.C33923b;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3255f.p3256a.AbstractC56223a;
import com.p2082ss.android.ugc.aweme.shortvideo.festival.C71839e;
import com.p2082ss.android.ugc.aweme.shortvideo.festival.C71841f;
import com.p2082ss.android.ugc.aweme.shortvideo.festival.C71849n;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.a */
public class C22810a implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    AbstractC56223a f53856a;

    /* renamed from: b */
    ActivityC0945e f53857b;

    static {
        Covode.recordClassIndex(26706);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(286, new RunnableC90250g(C22810a.class, "onFestivalDataEvent", C33922a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: a */
    public final void mo37118a() {
        C33923b.m69462a().mo60161a(new C22811b(this));
    }

    @AbstractC90264r
    public void onFestivalDataEvent(C33922a aVar) {
        mo37118a();
        C71841f.f161004a = new C71839e();
        C71849n.m126865a().mo113496b();
    }

    public C22810a(AbstractC56223a aVar, ActivityC0945e eVar) {
        this.f53857b = eVar;
        this.f53856a = aVar;
        EventBus.m156966a(EventBus.m156962a(), this);
    }
}
