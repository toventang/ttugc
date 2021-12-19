package com.bytedance.tiktok.homepage.mainpagefragment;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.friends.model.BackFromSettingEvent;
import com.p2082ss.android.ugc.aweme.friends.model.SyncContactStatusEvent;
import com.p2082ss.android.ugc.aweme.friends.p3019i.C51526g;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tiktok.homepage.mainpagefragment.d */
public final class C22813d implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public String f53860a = "";

    static {
        Covode.recordClassIndex(26709);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(287, new RunnableC90250g(C22813d.class, "onSyncContactStatusEvent", SyncContactStatusEvent.class, ThreadMode.MAIN, 0, false));
        hashMap.put(386, new RunnableC90250g(C22813d.class, "onBackFromSettingEvent", BackFromSettingEvent.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    public C22813d() {
        EventBus.m156966a(EventBus.m156962a(), this);
    }

    /* renamed from: a */
    public static void m43035a() {
        C51526g.m95988a("facebook_friend_list", C51526g.m95989a() ? 1 : 0);
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onBackFromSettingEvent(BackFromSettingEvent backFromSettingEvent) {
        C89219l.m154721d(backFromSettingEvent, "");
        this.f53860a = backFromSettingEvent.enterFrom;
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onSyncContactStatusEvent(SyncContactStatusEvent syncContactStatusEvent) {
        C89219l.m154721d(syncContactStatusEvent, "");
        if (C89219l.m154714a((Object) this.f53860a, (Object) syncContactStatusEvent.enterFrom)) {
            m43035a();
            if (syncContactStatusEvent.isSuccess && !syncContactStatusEvent.lastValue) {
                C51526g.m95991b();
            }
        }
    }
}
