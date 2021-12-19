package com.p2082ss.android.ugc.aweme.feed;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.ttnet.p1703d.C22940b;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.newmedia.C30147h;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.BuildConfigAllServiceImpl;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.p2082ss.android.ugc.aweme.base.p2377h.C34597d;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.commercialize.LegacyCommercializeServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.p2538c.AbstractC37636a;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38699bq;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38740e;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.feed.cache.C49324h;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p2082ss.android.ugc.aweme.feed.p2936ab.C48026f;
import com.p2082ss.android.ugc.aweme.feed.p2948h.C49610a;
import com.p2082ss.android.ugc.aweme.feed.p2952k.C49719c;
import com.p2082ss.android.ugc.aweme.feed.p2959p.C49783b;
import com.p2082ss.android.ugc.aweme.feed.p2959p.p2961b.C49806f;
import com.p2082ss.android.ugc.aweme.feed.p2968t.C49935d;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.metrics.p3438b.C59227a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.utils.C80313cs;
import com.p2082ss.android.ugc.aweme.utils.C80361dw;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.k */
public final class C49710k {

    /* renamed from: a */
    public static Boolean f114393a;

    /* renamed from: b */
    public static long f114394b = -1;

    /* renamed from: c */
    static volatile Boolean f114395c;

    /* renamed from: d */
    public static boolean f114396d;

    /* renamed from: e */
    public static long f114397e = -1;

    /* renamed from: f */
    public static long f114398f = -1;

    /* renamed from: g */
    public static long f114399g = -1;

    /* renamed from: h */
    public static boolean f114400h = true;

    /* renamed from: i */
    public static volatile boolean f114401i;

    /* renamed from: j */
    public static HandlerC49715b f114402j;

    /* renamed from: k */
    public static Queue<Runnable> f114403k;

    /* renamed from: l */
    static boolean f114404l;

    /* renamed from: m */
    public static String f114405m;

    /* renamed from: n */
    public static Throwable f114406n;

    /* renamed from: o */
    public static long f114407o;

    /* renamed from: p */
    public static C22940b f114408p;

    /* renamed from: q */
    public static JSONObject f114409q;

    /* renamed from: r */
    private static final long f114410r = TimeUnit.SECONDS.toMillis(3);

    /* renamed from: com.ss.android.ugc.aweme.feed.k$c */
    static class HandlerC49716c extends Handler {
        static {
            Covode.recordClassIndex(58565);
        }

        HandlerC49716c() {
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.obj == null) {
                C49710k.m93122a("load_empty_feed", "");
                C49710k.m93125b("no_response", "fake_failed");
            } else if (message.obj instanceof Exception) {
                C49710k.m93122a("exec_failed", "");
                C49710k.m93125b("no_response", "fake_failed");
            } else if (C49710k.m93126b()) {
                C49710k.f114402j.f114417b = true;
                C49710k.f114402j.f114416a.sendMessage(Message.obtain(message));
                C49710k.f114393a = false;
                C49710k.f114402j = null;
                C49710k.m93122a("fake_response", "");
                C49710k.m93125b("no_response", "fake_response");
            } else {
                C49710k.m93122a("valid_response_received_after_do_fake", "");
                C49710k.m93125b("no_response", "valid_response");
            }
        }
    }

    /* renamed from: e */
    public static boolean m93129e() {
        if (C34597d.m70636c().mo61048a("cold_start_times", 0) <= 1) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private static boolean m93130f() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    static {
        Covode.recordClassIndex(58559);
    }

    /* renamed from: b */
    public static boolean m93126b() {
        Boolean bool = f114393a;
        if (bool == null || !bool.booleanValue() || f114402j == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m93124a() {
        C17867d.m33078a();
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = m93130f();
        }
        return C58029j.f132256h;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.k$a */
    static class CallableC49714a implements Callable {

        /* renamed from: a */
        private Callable f114415a;

        static {
            Covode.recordClassIndex(58563);
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            if (BuildConfigAllServiceImpl.m65220b().mo57028a()) {
                return C49710k.m93128d();
            }
            AwemeService.m70060b();
            C49610a.m93030a();
            Object b = C49935d.f115106a.mo84986a(4).mo84983b();
            C58945a.C58947b.f134185a.mo96429b("feed_api_to_ui_response", false);
            C58945a.C58947b.f134185a.mo96425a("feed_ui_response_to_post_msg", false);
            if (b == null) {
                C49710k.m93120a((Object) null, false, 0L);
            } else if (!((FeedItemList) b).isFromLocalCache) {
                return b;
            } else {
                long a = C34597d.m70634a().mo61049a("key_feed_cache_time");
                if (System.currentTimeMillis() - a <= 0) {
                    C49710k.m93120a(b, false, a);
                    return b;
                }
                C49710k.m93120a(b, true, a);
            }
            return this.f114415a.call();
        }

        CallableC49714a(Callable callable) {
            this.f114415a = callable;
        }
    }

    /* renamed from: c */
    public static FeedItemList m93127c() {
        String a = C49719c.m93133a();
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        FeedItemList feedItemList = (FeedItemList) C80361dw.m139333a(a, FeedItemList.class);
        if (feedItemList == null || feedItemList.getItems() == null) {
            return feedItemList;
        }
        ArrayList<Aweme> arrayList = new ArrayList(2);
        int size = feedItemList.getItems().size();
        int nextInt = new Random().nextInt(size);
        int nextInt2 = new Random().nextInt(size);
        if (nextInt2 == nextInt) {
            nextInt2 = (nextInt + 1) % size;
        }
        arrayList.add(feedItemList.getItems().get(nextInt));
        arrayList.add(feedItemList.getItems().get(nextInt2));
        for (Aweme aweme : arrayList) {
            aweme.setFakeResponse(true);
            aweme.setItemSourceCategory(2);
        }
        feedItemList.items = arrayList;
        return feedItemList;
    }

    /* renamed from: d */
    public static FeedItemList m93128d() {
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        MethodCollector.m26663i(5485);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            inputStream = C17867d.m33078a().getAssets().open("feed_response.json");
            try {
                byte[] bArr = new byte[1024];
                byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    } catch (Throwable unused) {
                        C80313cs.m139228a(inputStream);
                        C80313cs.m139228a(byteArrayOutputStream);
                        MethodCollector.m26664o(5485);
                        return null;
                    }
                }
                FeedItemList feedItemList = (FeedItemList) GsonHolder.m138943c().mo123620b().mo46670a(new String(byteArrayOutputStream.toByteArray()), FeedItemList.class);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                long j = f114410r;
                if (currentTimeMillis2 < j) {
                    Thread.sleep(j - currentTimeMillis2);
                }
                C80313cs.m139228a(inputStream);
                C80313cs.m139228a(byteArrayOutputStream);
                MethodCollector.m26664o(5485);
                return feedItemList;
            } catch (Throwable unused2) {
                byteArrayOutputStream = null;
                C80313cs.m139228a(inputStream);
                C80313cs.m139228a(byteArrayOutputStream);
                MethodCollector.m26664o(5485);
                return null;
            }
        } catch (Throwable unused3) {
            inputStream = null;
            byteArrayOutputStream = null;
            C80313cs.m139228a(inputStream);
            C80313cs.m139228a(byteArrayOutputStream);
            MethodCollector.m26664o(5485);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.k$b */
    public static class HandlerC49715b extends Handler {

        /* renamed from: a */
        public Handler f114416a;

        /* renamed from: b */
        boolean f114417b;

        static {
            Covode.recordClassIndex(58564);
        }

        private HandlerC49715b(Handler handler) {
            this.f114416a = handler;
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            C49710k.f114393a = false;
            C49710k.f114402j = null;
            if (this.f114417b && message.obj != null && (message.obj instanceof FeedItemList)) {
                ((FeedItemList) message.obj).setReplaceFake();
            }
            this.f114416a.handleMessage(message);
        }

        /* synthetic */ HandlerC49715b(Handler handler, byte b) {
            this(handler);
        }
    }

    /* renamed from: a */
    private static void m93121a(Runnable runnable) {
        if (f114398f != -1) {
            C29339a.m58752a(runnable);
            return;
        }
        if (f114403k == null) {
            f114403k = new LinkedBlockingQueue();
        }
        f114403k.offer(runnable);
    }

    /* renamed from: a */
    public static String m93117a(FeedItemList feedItemList) {
        StringBuilder sb = new StringBuilder();
        if (!C13603b.m24435a((Collection) feedItemList.getItems())) {
            for (Aweme aweme : feedItemList.getItems()) {
                sb.append(aweme.getAid()).append(",");
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m93122a(final String str, final String str2) {
        m93121a(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.feed.C49710k.RunnableC497111 */

            static {
                Covode.recordClassIndex(58560);
            }

            public final void run() {
                C33830n.m70668a("aweme_feed_0vv", new C33743c().mo59976a("message", str).mo59971a("network_connected", Boolean.valueOf(C49710k.m93124a())).mo59975a("mainCreate2ResumeDuration", Long.valueOf(C49710k.f114398f)).mo59975a("sMainActivityCreate2FeedRequestDuration", Long.valueOf(C49710k.f114399g)).mo59976a("requestId", str2).mo59977a());
            }
        });
    }

    /* renamed from: b */
    public static void m93125b(final String str, final String str2) {
        m93121a(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.feed.C49710k.RunnableC497122 */

            static {
                Covode.recordClassIndex(58561);
            }

            public final void run() {
                JSONObject a = new C33743c().mo59976a("fake_reason", str).mo59976a("fake_type", str2).mo59976a("has_network", String.valueOf(C49710k.m93124a())).mo59975a("mainCreate2ResumeDuration", Long.valueOf(C49710k.f114398f)).mo59975a("sMainActivityCreate2FeedRequestDuration", Long.valueOf(C49710k.f114399g)).mo59977a();
                C39162r.onEvent(MobClick.obtain().setEventName("fake_feed_response").setLabelName("perf_monitor").setJsonObject(a));
                C39162r.m79461a("fake_feed_response", a);
                C59227a.m108848a("fake_feed_response", a);
            }
        });
    }

    /* renamed from: a */
    static void m93119a(FeedItemList feedItemList, int i) {
        Long creativeId;
        MethodCollector.m26663i(5481);
        List<Aweme> items = feedItemList.getItems();
        AbstractC37636a aVar = C49765o.f114510a;
        if (!C13603b.m24435a((Collection) items)) {
            int size = items.size();
            for (int i2 = 0; i2 < size; i2++) {
                Aweme aweme = items.get(i2);
                if (C37699a.m76314s(aweme)) {
                    aVar.mo65536a(aweme);
                    C18129a.m33746a("draw_ad", "receive", aweme.getAwemeRawAd()).mo28902c();
                }
            }
        }
        LegacyCommercializeServiceImpl.m75830l().mo65455i().mo65925a(feedItemList);
        List<Aweme> items2 = feedItemList.getItems();
        AbstractC37636a aVar2 = C49771p.f114515a;
        if (!C13603b.m24435a((Collection) items2)) {
            for (int size2 = items2.size() - 1; size2 >= 0; size2--) {
                Aweme aweme2 = items2.get(size2);
                if (aweme2 != null && aweme2.isAd()) {
                    AwemeRawAd awemeRawAd = aweme2.getAwemeRawAd();
                    if (!(awemeRawAd != null && awemeRawAd.isHideIfExists() && awemeRawAd.isAppAd() && C29843f.m60133b(C17867d.m33078a(), awemeRawAd.getPackageName()))) {
                        break;
                    }
                    aVar2.mo65536a(awemeRawAd, "feed_download_ad");
                    C18129a.m33746a("feed_download_ad", "hide_app", awemeRawAd).mo28902c();
                    items2.remove(size2);
                }
            }
        }
        m93123a(feedItemList.getItems(), feedItemList.getRequestId(), i);
        List<Aweme> items3 = feedItemList.getItems();
        if (items3 != null) {
            for (Aweme aweme3 : items3) {
                if (!(aweme3 == null || aweme3.getAid() == null)) {
                    Set<String> set = C38740e.f91484a;
                    String aid = aweme3.getAid();
                    C89219l.m154716b(aid, "");
                    set.add(aid);
                    if (aweme3.isAd()) {
                        try {
                            AwemeRawAd awemeRawAd2 = aweme3.getAwemeRawAd();
                            if (!(awemeRawAd2 == null || (creativeId = awemeRawAd2.getCreativeId()) == null)) {
                                C38740e.f91485b.add(Long.valueOf(creativeId.longValue()));
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            C38699bq.m78509a(C38740e.f91485b);
        }
        if (C30147h.f71913a && feedItemList.localExtra != null) {
            String str = feedItemList.localExtra.get("aweme_id");
            C49610a a = C49610a.m93030a();
            List<Aweme> items4 = feedItemList.getItems();
            if (items4 != null) {
                synchronized (a) {
                    try {
                        a.mo81404b();
                        Iterator<Aweme> it = items4.iterator();
                        while (it.hasNext()) {
                            Aweme next = it.next();
                            if (next != null && !C13627m.m24499a(str, next.getAid())) {
                                for (C49610a.C49613a aVar3 : a.f114156a) {
                                    if (aVar3 != null && C13627m.m24499a(aVar3.f114160a, next.getAid())) {
                                        it.remove();
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(5481);
                        throw th;
                    }
                }
            }
        }
        List<Aweme> items5 = feedItemList.getItems();
        if (items5 != null) {
            int size3 = items5.size();
            for (int i3 = 0; i3 < size3; i3++) {
                items5.get(i3).getUploadMiscInfoStruct();
            }
        }
        MethodCollector.m26664o(5481);
    }

    /* renamed from: a */
    public static void m93120a(Object obj, boolean z, long j) {
        C33744d dVar = new C33744d();
        String str = "0";
        if (obj == null || !(obj instanceof FeedItemList)) {
            dVar.mo59983a("is_cache", str).mo59983a("is_timeout", str).mo59980a("cache_num", 0).mo59983a("group_id_list", "").mo59981a("cache_time", j);
        } else {
            C33744d a = dVar.mo59983a("is_cache", "1");
            if (z) {
                str = "1";
            }
            FeedItemList feedItemList = (FeedItemList) obj;
            a.mo59983a("is_timeout", str).mo59980a("cache_num", feedItemList.getItems().size()).mo59983a("group_id_list", m93117a(feedItemList)).mo59981a("cache_time", j).mo59983a("from_type", C49324h.m92411f());
        }
        C39162r.m79460a("pull_out_cache_video", dVar.f79943a);
    }

    /* renamed from: a */
    public static void m93123a(List<Aweme> list, String str, int i) {
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Aweme aweme = list.get(i2);
                aweme.setRequestId(str);
                if (!aweme.isLiveNoDeduplicate() || !C48026f.m91035a()) {
                    aweme = AwemeService.m70060b().mo60677a(aweme);
                }
                RequestIdService.m70076a().mo60694a(aweme.getAid() + (i + 0), str, i2);
                list.set(i2, aweme);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v2, resolved type: com.ss.android.ugc.aweme.feed.k$b */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m93118a(int i, int i2, WeakHandler weakHandler, Callable callable, int i3, boolean z, Lock lock) {
        WeakHandler weakHandler2;
        Callable callable2;
        MethodCollector.m26663i(5478);
        if (!z || i != 0 || (!(f114393a == null || i2 == 0) || weakHandler == null)) {
            weakHandler2 = weakHandler;
            callable2 = callable;
        } else {
            f114393a = true;
            if (f114397e != -1) {
                f114399g = SystemClock.elapsedRealtime() - f114397e;
            }
            HandlerC49715b bVar = new HandlerC49715b(weakHandler, (byte) 0);
            f114402j = bVar;
            callable2 = new CallableC49714a(callable);
            weakHandler2 = bVar;
        }
        if (C49783b.m93234a() && C49783b.m93235a(i, 1) && C49783b.m93234a()) {
            synchronized (C49806f.f114575e) {
                try {
                    C49806f.f114574d = new C49806f.HandlerC49807a(weakHandler, (byte) 0);
                } catch (Throwable th) {
                    MethodCollector.m26664o(5478);
                    throw th;
                }
            }
        }
        C1731i.m5640b(new CallableC49743n(new RunnableC49738m(callable2, weakHandler2, i, i3, lock)), C40780g.m82241a());
        MethodCollector.m26664o(5478);
    }
}
