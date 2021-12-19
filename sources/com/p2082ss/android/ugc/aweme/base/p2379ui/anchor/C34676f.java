package com.p2082ss.android.ugc.aweme.base.p2379ui.anchor;

import android.content.DialogInterface;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.p995g.C14759i;
import com.p2082ss.android.ugc.aweme.crossplatform.p2707b.C40565d;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.f */
public class C34676f extends C34672b implements AbstractC90252i, AbstractC90253j {

    /* renamed from: c */
    public static final C34677a f81930c = new C34677a((byte) 0);

    /* renamed from: d */
    private String f81931d;

    static {
        Covode.recordClassIndex(41663);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(156, new RunnableC90250g(C34676f.class, "onWebViewFinish", C40565d.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.f$a */
    public static final class C34677a {
        static {
            Covode.recordClassIndex(41664);
        }

        private C34677a() {
        }

        public /* synthetic */ C34677a(byte b) {
            this();
        }

        /* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.f$a$a */
        public static final class DialogInterface$OnDismissListenerC34678a implements DialogInterface.OnDismissListener {

            /* renamed from: a */
            final /* synthetic */ long f81932a;

            static {
                Covode.recordClassIndex(41665);
            }

            public DialogInterface$OnDismissListenerC34678a(long j) {
                this.f81932a = j;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                AbstractC81915c.m141874a(new C40565d(System.currentTimeMillis() - this.f81932a));
            }
        }

        /* renamed from: a */
        public static String m70844a(String str) {
            String str2;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair<String, String> a = C14759i.m27066a(str, linkedHashMap);
            String str3 = (String) a.first;
            if (str3 == null || !str3.equals("aweme://webDialog") || (str2 = (String) a.second) == null || !str2.equals("/eventDetail")) {
                return null;
            }
            return (String) linkedHashMap.get("event_id");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0097, code lost:
        if (r1 == null) goto L_0x0099;
     */
    @org.greenrobot.eventbus.AbstractC90264r
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onWebViewFinish(com.p2082ss.android.ugc.aweme.crossplatform.p2707b.C40565d r10) {
        /*
        // Method dump skipped, instructions count: 195
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.C34676f.onWebViewFinish(com.ss.android.ugc.aweme.crossplatform.b.d):void");
    }
}
