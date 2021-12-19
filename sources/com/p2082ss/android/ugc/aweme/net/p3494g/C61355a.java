package com.p2082ss.android.ugc.aweme.net.p3494g;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.p2082ss.android.ugc.aweme.net.p3491d.C61336c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.net.g.a */
public final class C61355a {

    /* renamed from: a */
    static final Map<String, Long> f139339a = new LinkedHashMap();

    /* renamed from: b */
    static long f139340b;

    /* renamed from: c */
    static int f139341c;

    /* renamed from: d */
    public static final C61355a f139342d = new C61355a();

    /* renamed from: e */
    private static final AbstractC89244h f139343e = C89250i.m154774a(EnumC89331m.NONE, C61360e.f139352a);

    /* renamed from: f */
    private static final AbstractC89244h f139344f = C89250i.m154774a(EnumC89331m.NONE, C61357b.f139349a);

    /* renamed from: g */
    private static final AbstractC89244h f139345g = C89250i.m154774a(EnumC89331m.NONE, C61356a.f139348a);

    /* renamed from: h */
    private static final AbstractC89244h f139346h = C89250i.m154773a((AbstractC89171a) C61359d.f139351a);

    /* renamed from: i */
    private static final Runnable f139347i = RunnableC61358c.f139350a;

    /* renamed from: a */
    public static int m111094a() {
        return ((Number) f139343e.getValue()).intValue();
    }

    /* renamed from: c */
    private static String[] m111098c() {
        return (String[]) f139345g.getValue();
    }

    /* renamed from: d */
    private static Handler m111099d() {
        return (Handler) f139346h.getValue();
    }

    private C61355a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.net.g.a$a */
    static final class C61356a extends AbstractC89220m implements AbstractC89171a<String[]> {

        /* renamed from: a */
        public static final C61356a f139348a = new C61356a();

        static {
            Covode.recordClassIndex(71989);
        }

        C61356a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String[] invoke() {
            return C61336c.m111029a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.net.g.a$b */
    static final class C61357b extends AbstractC89220m implements AbstractC89171a<Long> {

        /* renamed from: a */
        public static final C61357b f139349a = new C61357b();

        static {
            Covode.recordClassIndex(71990);
        }

        C61357b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Long invoke() {
            return Long.valueOf((long) (C61355a.m111094a() << 1));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.net.g.a$d */
    static final class C61359d extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C61359d f139351a = new C61359d();

        static {
            Covode.recordClassIndex(71992);
        }

        C61359d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            HandlerThread handlerThread = new HandlerThread("RepeatRequestQuicklyMob");
            handlerThread.start();
            return new Handler(handlerThread.getLooper());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.net.g.a$e */
    static final class C61360e extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C61360e f139352a = new C61360e();

        static {
            Covode.recordClassIndex(71993);
        }

        C61360e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C16048b.m29633a().mo25412a(true, "repeat_request_quickly_time_limit", 0));
        }
    }

    /* renamed from: b */
    static void m111097b() {
        f139340b = System.currentTimeMillis();
        m111099d().postDelayed(f139347i, ((Number) f139344f.getValue()).longValue());
    }

    static {
        Covode.recordClassIndex(71988);
    }

    /* renamed from: com.ss.android.ugc.aweme.net.g.a$c */
    static final class RunnableC61358c implements Runnable {

        /* renamed from: a */
        public static final RunnableC61358c f139350a = new RunnableC61358c();

        static {
            Covode.recordClassIndex(71991);
        }

        RunnableC61358c() {
        }

        public final void run() {
            long currentTimeMillis = System.currentTimeMillis() - ((long) C61355a.m111094a());
            if (C61355a.f139340b <= currentTimeMillis || C61355a.f139341c >= 3) {
                C61355a.f139341c = 0;
                Iterator<Map.Entry<String, Long>> it = C61355a.f139339a.entrySet().iterator();
                while (it.hasNext()) {
                    if (it.next().getValue().longValue() < currentTimeMillis) {
                        it.remove();
                    }
                }
                if (!C61355a.f139339a.isEmpty()) {
                    C61355a.m111097b();
                    return;
                }
                return;
            }
            C61355a.f139341c++;
            C61355a.m111097b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.net.g.a$f */
    public static final class RunnableC61361f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f139353a;

        /* renamed from: b */
        final /* synthetic */ Request f139354b;

        /* renamed from: c */
        final /* synthetic */ long f139355c;

        /* renamed from: d */
        final /* synthetic */ String f139356d;

        /* renamed from: e */
        final /* synthetic */ String f139357e;

        static {
            Covode.recordClassIndex(71994);
        }

        RunnableC61361f(C89233z.C89238e eVar, Request request, long j, String str, String str2) {
            this.f139353a = eVar;
            this.f139354b = request;
            this.f139355c = j;
            this.f139356d = str;
            this.f139357e = str2;
        }

        public final void run() {
            T t = this.f139353a.element;
            C89219l.m154716b(t, "");
            String path = this.f139354b.getPath();
            C89219l.m154716b(path, "");
            String method = this.f139354b.getMethod();
            C89219l.m154716b(method, "");
            long j = this.f139355c;
            String str = this.f139356d;
            C89219l.m154716b(str, "");
            String str2 = this.f139357e;
            Long l = C61355a.f139339a.get(t);
            if (l != null) {
                long longValue = j - l.longValue();
                if (longValue < ((long) C61355a.m111094a())) {
                    C12290b.m22066a("repeat_request_quickly", new JSONObject().put("limitTime", C61355a.m111094a()).put("urlPath", path).put("method", method).put("activityName", str2), new JSONObject().put("passTime", (int) longValue), new JSONObject().put("logId", str));
                }
            }
            C61355a.f139339a.put(t, Long.valueOf(j));
            C61355a.m111097b();
        }
    }

    /* renamed from: a */
    public static boolean m111096a(Request request) {
        C89219l.m154721d(request, "");
        if (m111094a() == 0 || C89064i.m154489a(m111098c(), request.getPath())) {
            return true;
        }
        if (C89219l.m154714a((Object) "GET", (Object) request.getMethod())) {
            return false;
        }
        if (!C89219l.m154714a((Object) "POST", (Object) request.getMethod())) {
            return true;
        }
        String mimeType = request.getBody().mimeType();
        C89219l.m154716b(mimeType, "");
        if (C89361p.m154908a((CharSequence) mimeType, (CharSequence) "application/x-www-form-urlencoded", false) || C89361p.m154908a((CharSequence) mimeType, (CharSequence) "application/json", false)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m111095a(Request request, C22099u<?> uVar, long j, String str) {
        TypedOutput body;
        String md5Stub;
        C89219l.m154721d(request, "");
        C89219l.m154721d(uVar, "");
        C89219l.m154721d(str, "");
        for (C22027b bVar : uVar.f52261a.f52042d) {
            C89219l.m154716b(bVar, "");
            if (C89219l.m154714a((Object) "x-tt-logid", (Object) bVar.f52037a)) {
                String str2 = bVar.f52038b;
                C89233z.C89238e eVar = new C89233z.C89238e();
                eVar.element = (T) request.getUrl();
                if (!(!C89219l.m154714a((Object) request.getMethod(), (Object) "POST") || (body = request.getBody()) == null || (md5Stub = body.md5Stub()) == null)) {
                    eVar.element = (T) (((String) eVar.element) + "&postbodymd5=" + md5Stub);
                }
                m111099d().post(new RunnableC61361f(eVar, request, j, str2, str));
                return;
            }
        }
    }
}
