package com.p2082ss.android.ugc.aweme.base.p2379ui.anchor;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34500b;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AbstractC34684d;
import com.p2082ss.android.ugc.aweme.commerce.service.C37533a;
import com.p2082ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.p2082ss.android.ugc.aweme.commerce.service.p2521a.C37534a;
import com.p2082ss.android.ugc.aweme.crossplatform.p2707b.C40563b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.multi.C60211k;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.g */
public final class C34679g extends AbstractC34684d implements AbstractC90252i, AbstractC90253j {

    /* renamed from: c */
    public static final C34680a f81933c = new C34680a((byte) 0);

    /* renamed from: b */
    public final String f81934b;

    /* renamed from: d */
    private C60211k f81935d;

    static {
        Covode.recordClassIndex(41666);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(152, new RunnableC90250g(C34679g.class, "onEvent", C40563b.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.g$a */
    public static final class C34680a {
        static {
            Covode.recordClassIndex(41667);
        }

        private C34680a() {
        }

        public /* synthetic */ C34680a(byte b) {
            this();
        }
    }

    @AbstractC90264r
    public final void onEvent(C40563b bVar) {
        String str;
        String str2 = "";
        C89219l.m154721d(bVar, str2);
        ICommerceService a = C37533a.m75656a();
        C37534a aVar = new C37534a();
        String str3 = this.f81934b;
        if (str3 != null) {
            str2 = str3;
        }
        aVar.f88680b = str2;
        Aweme aweme = this.f81941a;
        String str4 = null;
        if (aweme != null) {
            str = aweme.getAuthorUid();
        } else {
            str = null;
        }
        aVar.f88682d = str;
        Aweme aweme2 = this.f81941a;
        if (aweme2 != null) {
            str4 = aweme2.getAid();
        }
        aVar.f88681c = str4;
        aVar.f88695q = this.f81935d.f137247b.f137257a;
        aVar.f88696r = String.valueOf(bVar.f94910a);
        aVar.f88703y = String.valueOf(this.f81935d.f137247b.f137265i);
        aVar.f88701w = this.f81935d.f137247b.f137268l;
        aVar.f88702x = this.f81935d.f137247b.f137267k;
        aVar.f88699u = "video";
        aVar.f88700v = "video_cart_tag";
        aVar.f88664I = C34500b.m70485a(this.f81941a);
        aVar.f88662G = "video_single_anchor";
        aVar.f88663H = "video";
        a.logCommerceEvents("product_stay_time", aVar);
        EventBus.m156962a().mo145395b(this);
    }
}
