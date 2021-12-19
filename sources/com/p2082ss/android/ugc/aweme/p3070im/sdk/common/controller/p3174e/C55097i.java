package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.i */
public final class C55097i {

    /* renamed from: a */
    static List<String> f126089a;

    /* renamed from: b */
    public static final C55097i f126090b = new C55097i();

    /* renamed from: c */
    private static Handler f126091c;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.i$a */
    public static final class HandlerC55098a extends Handler {
        static {
            Covode.recordClassIndex(64826);
        }

        HandlerC55098a() {
        }

        public final void handleMessage(Message message) {
            C89219l.m154721d(message, "");
            super.handleMessage(message);
            if (message.what == 220) {
                C55097i.m100774c();
            }
        }
    }

    private C55097i() {
    }

    static {
        Covode.recordClassIndex(64825);
    }

    /* renamed from: a */
    public static final void m100769a() {
        if (f126089a == null) {
            f126089a = new CopyOnWriteArrayList();
        }
        if (f126091c == null) {
            f126091c = new HandlerC55098a();
        }
    }

    /* renamed from: b */
    public static final void m100773b() {
        Handler handler = f126091c;
        if (handler != null) {
            handler.removeMessages(220);
            f126091c = null;
        }
        if (f126089a != null) {
            f126089a = null;
        }
    }

    /* renamed from: c */
    public static final void m100774c() {
        Integer valueOf;
        List<String> list = f126089a;
        if (list != null && (valueOf = Integer.valueOf(list.size())) != null && valueOf.intValue() > 0) {
            AbstractC17420a a = AbstractC17420a.C17421a.m32276a();
            List<String> list2 = f126089a;
            if (list2 == null) {
                C89219l.m154715b();
            }
            a.mo27726a(list2);
            List<String> list3 = f126089a;
            if (list3 == null) {
                C89219l.m154715b();
            }
            list3.clear();
            Handler handler = f126091c;
            if (handler != null) {
                handler.removeMessages(220);
            }
        }
    }

    /* renamed from: a */
    public static final void m100771a(List<? extends AbstractC56237a> list) {
        if (list != null && (!list.isEmpty())) {
            List<String> b = m100772b(list);
            if (!b.isEmpty()) {
                AbstractC17420a.C17421a.m32276a().mo27726a(b);
            }
        }
    }

    /* renamed from: a */
    public static final void m100770a(String str) {
        Handler handler;
        C89219l.m154721d(str, "");
        List<String> list = f126089a;
        if (list != null && !list.contains(str)) {
            List<String> list2 = f126089a;
            if (list2 == null) {
                C89219l.m154715b();
            }
            if (list2.isEmpty() && (handler = f126091c) != null) {
                handler.sendEmptyMessageDelayed(220, 5000);
            }
            List<String> list3 = f126089a;
            if (list3 == null) {
                C89219l.m154715b();
            }
            list3.add(str);
            List<String> list4 = f126089a;
            if (list4 == null) {
                C89219l.m154715b();
            }
            if (list4.size() == 25) {
                m100774c();
            }
        }
    }

    /* renamed from: b */
    private static List<String> m100772b(List<? extends AbstractC56237a> list) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC56237a aVar : list) {
            if (aVar.mo91860c() == 0) {
                IMUser b = C55085g.m100757b(String.valueOf(AbstractC17427b.C17428a.m32311c(aVar.bL_())), C55080c.m100730a(aVar.bL_()));
                if (b != null && TextUtils.isEmpty(b.getSecUid())) {
                    arrayList.add(aVar.bL_());
                }
                if (arrayList.size() == 25) {
                    break;
                }
            }
        }
        return arrayList;
    }
}
