package com.p2082ss.android.ugc.aweme.discover.helper;

import com.bytedance.android.live.base.p177a.C2954a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.p2787m.C42300d;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.ae */
public final class C41985ae extends C42300d implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public static final C41985ae f97915a = new C41985ae();

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(174, new RunnableC90250g(C41985ae.class, "onFollowStatusEvent", FollowStatusEvent.class, ThreadMode.POSTING, 0, false));
        hashMap.put(306, new RunnableC90250g(C41985ae.class, "onReceiveRoomStatusEvent", C2954a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(37, new RunnableC90250g(C41985ae.class, "onReceiveVideoEvent", C49672ag.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    private C41985ae() {
    }

    static {
        Covode.recordClassIndex(49915);
    }

    @AbstractC90264r
    public final void onFollowStatusEvent(FollowStatusEvent followStatusEvent) {
        C89219l.m154721d(followStatusEvent, "");
        mo71488a(followStatusEvent.status);
    }

    @AbstractC90264r
    public final void onReceiveRoomStatusEvent(C2954a aVar) {
        C89219l.m154721d(aVar, "");
        mo71488a(aVar);
    }

    @AbstractC90264r
    public final void onReceiveVideoEvent(C49672ag agVar) {
        C89219l.m154721d(agVar, "");
        mo71488a(agVar);
    }
}
