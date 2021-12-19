package com.p2082ss.android.ugc.aweme.notification.p3525f;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.message.model.SimpleUser;
import com.p2082ss.android.ugc.aweme.notice.api.bean.C61556h;
import com.p2082ss.android.ugc.aweme.notice.api.bean.StrangerNoticeMessage;
import com.p2082ss.android.ugc.aweme.notification.model.MusNewNotificationModel;
import com.p2082ss.android.ugc.aweme.notification.redpoint.AbstractC62217b;
import com.p2082ss.android.ugc.aweme.notification.redpoint.C62232h;
import com.p2082ss.android.ugc.aweme.notification.service.C62239a;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3251b.C56195b;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.f.b */
public final class C62001b extends C39101b<MusNewNotificationModel> implements AbstractC62217b, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    private final int f140712a = 1;

    /* renamed from: b */
    private final int f140713b = 3;

    /* renamed from: c */
    private final int f140714c = 4;

    static {
        Covode.recordClassIndex(72750);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(334, new RunnableC90250g(C62001b.class, "onEvent", C56195b.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.p2633e.C39101b
    public final void ck_() {
        super.ck_();
        EventBus.m156962a().mo145395b(this);
        C62232h.m112535b().f141251b.remove(2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.common.m] */
    @Override // com.p2082ss.android.ugc.aweme.common.C39088c
    /* renamed from: a_ */
    public final /* synthetic */ void mo67839a_(AbstractC39102c cVar) {
        mo100052a((AbstractC39102c<?>) cVar);
    }

    /* renamed from: a */
    public final void mo100052a(AbstractC39102c<?> cVar) {
        C89219l.m154721d(cVar, "");
        super.mo67839a_(cVar);
        EventBus.m156966a(EventBus.m156962a(), this);
        C62232h.m112535b().f141251b.put(2, this);
    }

    @AbstractC90264r
    public final void onEvent(C56195b bVar) {
        C89219l.m154721d(bVar, "");
        IIMService a = C62239a.C62240a.m112592a();
        if (a != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("unread_count", C62232h.m112535b().mo99309a(11));
            a.onNewNoticeArrived(this.f140712a, bundle);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.redpoint.AbstractC62217b
    /* renamed from: a */
    public final void mo100053a(C61556h hVar) {
        C89219l.m154721d(hVar, "");
        if (hVar.f139718a == 11) {
            int i = hVar.f139722e;
            if (i == 0) {
                IIMService a = C62239a.C62240a.m112592a();
                if (a != null) {
                    Bundle bundle = new Bundle();
                    StrangerNoticeMessage strangerNoticeMessage = hVar.f139721d;
                    if (strangerNoticeMessage != null) {
                        bundle.putLong("last_create_time", strangerNoticeMessage.getCreateTime());
                        SimpleUser fromUser = strangerNoticeMessage.getFromUser();
                        C89219l.m154716b(fromUser, "");
                        bundle.putString("from_user_name", fromUser.getNickName());
                        bundle.putString("from_user_content", strangerNoticeMessage.getContent());
                        bundle.putInt("from_user_msg_type", strangerNoticeMessage.getMsgType());
                    }
                    bundle.putInt("unread_count", C62232h.m112535b().mo99309a(11));
                    a.onNewNoticeArrived(this.f140713b, bundle);
                }
            } else if (i == 1) {
                C62239a.C62240a.m112592a().onNewNoticeArrived(this.f140714c, new Bundle());
            }
        }
    }
}
