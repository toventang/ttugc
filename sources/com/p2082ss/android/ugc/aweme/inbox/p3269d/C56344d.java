package com.p2082ss.android.ugc.aweme.inbox.p3269d;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.notice.api.count.NoticeCountService;
import com.p2082ss.android.ugc.aweme.notice.api.services.C61611b;
import com.p2082ss.android.ugc.aweme.notification.service.NoticeCountServiceImpl;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.d.d */
public final class C56344d {

    /* renamed from: a */
    public static long f128526a;

    /* renamed from: b */
    public static long f128527b;

    /* renamed from: c */
    public static final C56344d f128528c = new C56344d();

    /* renamed from: d */
    private static int f128529d = -1;

    /* renamed from: e */
    private static boolean f128530e;

    private C56344d() {
    }

    static {
        Covode.recordClassIndex(66164);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.inbox.d.d$a */
    public static final class CallableC56345a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ long f128531a;

        /* renamed from: b */
        final /* synthetic */ int f128532b;

        /* renamed from: c */
        final /* synthetic */ long f128533c;

        static {
            Covode.recordClassIndex(66165);
        }

        CallableC56345a(long j, int i, long j2) {
            this.f128531a = j;
            this.f128532b = i;
            this.f128533c = j2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            int i;
            if (C56359f.m102344a("inbox_badge_perf", 0.15f)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("latency", this.f128531a);
                    jSONObject.put("unread_count", this.f128532b);
                    jSONObject.put("popup_latency", this.f128533c);
                    NoticeCountService d = NoticeCountServiceImpl.m112552d();
                    C89219l.m154716b(d, "");
                    Map<Integer, Integer> c = d.mo99308c();
                    jSONObject.put("unread_map", c.toString());
                    boolean containsKey = c.containsKey(99);
                    Map d2 = C89041ag.m154431d(c);
                    d2.remove(99);
                    if (d2.size() > 0) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if (containsKey) {
                        i |= 2;
                    }
                    C89379q.m157068constructorimpl(jSONObject.put("unread_type", i));
                } catch (Throwable th) {
                    C89379q.m157068constructorimpl(C89382r.m154941a(th));
                }
                C39162r.m79461a("inbox_badge_perf", jSONObject);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static void m102331a(int i) {
        f128529d = i;
        C61611b.f139811a.mo99373a(i);
        if (!f128530e) {
            f128530e = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = f128526a;
            long j2 = uptimeMillis - j;
            long j3 = f128527b;
            long j4 = 0;
            if (j3 != 0) {
                j4 = j3 - j;
            }
            m102330a(i, j2, j4);
        }
    }

    /* renamed from: a */
    private static C1731i<C89391z> m102330a(int i, long j, long j2) {
        return C1731i.m5640b(new CallableC56345a(j, i, j2), C1731i.f5562a);
    }
}
