package com.p2082ss.android.ugc.aweme.feed.cache;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.p995g.C14759i;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.p1121b.p1122a.C16105a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.ugc.aweme.network.AbstractC18099f;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.ttnet.INetworkApi;
import com.p2082ss.android.common.p2132c.C29819a;
import com.p2082ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.p2082ss.android.ugc.aweme.feed.FeedApiService;
import com.p2082ss.android.ugc.aweme.feed.cache.C49326i;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49522n;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.BitRate;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.utils.C80313cs;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import com.p2082ss.android.ugc.aweme.utils.GsonProvider;
import com.p2082ss.android.ugc.aweme.video.C80662ac;
import com.p2082ss.android.ugc.aweme.video.C80780p;
import com.p2082ss.android.ugc.aweme.video.preload.C80860b;
import com.p2082ss.android.ugc.aweme.video.preload.C80933o;
import com.p2082ss.android.ugc.aweme.video.preload.C80937s;
import com.p2082ss.android.ugc.aweme.video.preload.p4213a.AbstractC80807a;
import com.p2082ss.android.ugc.aweme.video.simcommon.C80942a;
import com.p2082ss.android.ugc.playerkit.model.C84199c;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p077b.C1731i;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89338d;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.feed.cache.e */
public final class C49301e {

    /* renamed from: a */
    static volatile FeedItemList f113313a;

    /* renamed from: b */
    public static volatile FeedItemList f113314b;

    /* renamed from: c */
    public static volatile String f113315c = "";

    /* renamed from: d */
    static volatile boolean f113316d;

    /* renamed from: e */
    static volatile boolean f113317e;

    /* renamed from: f */
    public static volatile boolean f113318f;

    /* renamed from: g */
    static Object f113319g = new Object();

    /* renamed from: h */
    static volatile boolean f113320h = true;

    /* renamed from: i */
    static volatile int f113321i = 48;

    /* renamed from: j */
    public static volatile boolean f113322j;

    /* renamed from: k */
    public static volatile boolean f113323k;

    /* renamed from: l */
    public static final AbstractC89244h f113324l = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C49302a.f113333a);

    /* renamed from: m */
    static boolean f113325m;

    /* renamed from: n */
    static FeedItemList f113326n;

    /* renamed from: o */
    public static final C49301e f113327o = new C49301e();

    /* renamed from: p */
    private static volatile boolean f113328p;

    /* renamed from: q */
    private static CountDownLatch f113329q = new CountDownLatch(1);

    /* renamed from: r */
    private static volatile boolean f113330r;

    /* renamed from: s */
    private static boolean f113331s;

    /* renamed from: t */
    private static volatile boolean f113332t = true;

    private C49301e() {
    }

    /* renamed from: a */
    public final void mo80895a(boolean z) {
        String str;
        StringBuilder sb = new StringBuilder("call startCache from ");
        if (z) {
            str = "background";
        } else {
            str = "foreground";
        }
        String.valueOf(sb.append(str).append(" isCaching:").append(f113316d).toString());
        if (!f113316d) {
            long b = C49324h.m92402b();
            String d = C49324h.m92407d();
            long c = C49324h.m92405c();
            String e = C49324h.m92409e();
            long j = (long) (f113321i * 3600000);
            boolean z2 = System.currentTimeMillis() - b >= j || TextUtils.isEmpty(d);
            boolean z3 = System.currentTimeMillis() - c >= j || TextUtils.isEmpty(e);
            if (z2) {
                C49324h.m92401a("");
            }
            if (z3) {
                C49324h.m92404b("");
            }
            if (!z2 && !z3 && m92372d()) {
                String d2 = C49324h.m92407d();
                String e2 = C49324h.m92409e();
                boolean b2 = m92368b(d2);
                boolean b3 = m92368b(e2);
                if (!b2) {
                    C49324h.m92401a("");
                }
                if (!b3) {
                    C49324h.m92404b("");
                }
                if (b2 || b3) {
                    return;
                }
            }
            if (C49326i.f113365a == null) {
                f113316d = true;
                f113320h = z;
                C40780g.m82241a().execute(RunnableC49313k.f113344a);
            }
        }
    }

    /* renamed from: a */
    public static boolean m92364a(File file) {
        MethodCollector.m26663i(5136);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(5136);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(5136);
        return delete;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.cache.e$a */
    static final class C49302a extends AbstractC89220m implements AbstractC89171a<AbstractC88412b> {

        /* renamed from: a */
        public static final C49302a f113333a = new C49302a();

        static {
            Covode.recordClassIndex(58103);
        }

        C49302a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC88412b invoke() {
            return C17873f.m33097e().mo143289d(C493031.f113334a);
        }
    }

    /* renamed from: k */
    public static void m92380k() {
        f113328p = true;
        f113329q.countDown();
    }

    /* renamed from: m */
    public static void m92382m() {
        if (f113318f) {
            C49324h.m92403b(0);
        } else {
            C49324h.m92400a(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.cache.e$b */
    public static final class CallableC49304b<V> implements Callable {

        /* renamed from: a */
        public static final CallableC49304b f113335a = new CallableC49304b();

        static {
            Covode.recordClassIndex(58105);
        }

        CallableC49304b() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_success", 1);
                C29819a.m60077a("cache_video_request_response", jSONObject);
            } catch (Exception unused) {
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.cache.e$c */
    public static final class CallableC49305c<V> implements Callable {

        /* renamed from: a */
        public static final CallableC49305c f113336a = new CallableC49305c();

        static {
            Covode.recordClassIndex(58106);
        }

        CallableC49305c() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_success", 0);
                jSONObject.put("errorCode", 200);
                C29819a.m60077a("cache_video_request_response", jSONObject);
            } catch (Exception unused) {
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.cache.e$e */
    public static final class CallableC49307e<V> implements Callable {

        /* renamed from: a */
        public static final CallableC49307e f113338a = new CallableC49307e();

        static {
            Covode.recordClassIndex(58108);
        }

        CallableC49307e() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_success", 1);
                C29819a.m60077a("cache_feed_request", jSONObject);
            } catch (Exception unused) {
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.cache.e$g */
    public static final class CallableC49309g<V> implements Callable {

        /* renamed from: a */
        public static final CallableC49309g f113340a = new CallableC49309g();

        static {
            Covode.recordClassIndex(58110);
        }

        CallableC49309g() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_success", 1);
                C29819a.m60077a("cache_video_request", jSONObject);
            } catch (Exception unused) {
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.cache.e$h */
    public static final class CallableC49310h<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ Exception f113341a;

        static {
            Covode.recordClassIndex(58111);
        }

        CallableC49310h(Exception exc) {
            this.f113341a = exc;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_success", 0);
                jSONObject.put("errorCode", C16105a.m29903a(this.f113341a, (String[]) null));
                C29819a.m60077a("cache_video_request_response", jSONObject);
            } catch (Exception unused) {
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.cache.e$l */
    public static final class CallableC49314l<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ int f113345a;

        static {
            Covode.recordClassIndex(58115);
        }

        CallableC49314l(int i) {
            this.f113345a = i;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_cache", 0);
                jSONObject.put("is_timeout", this.f113345a);
                C29819a.m60077a("pull_out_cache_video", jSONObject);
            } catch (Exception unused) {
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    static String m92365b() {
        Context a = C17867d.m33078a();
        if (C58016d.f132221b == null || !C58016d.f132224e) {
            C58016d.f132221b = a.getCacheDir();
        }
        File file = C58016d.f132221b;
        C89219l.m154716b(file, "");
        return file.getAbsolutePath();
    }

    /* renamed from: g */
    static void m92376g() {
        User b = C80580in.m139683b();
        C89219l.m154716b(b, "");
        C49324h.m92410e(b.getSecUid());
    }

    /* renamed from: j */
    public static void m92379j() {
        if (!f113331s) {
            f113331s = true;
            C40780g.m82241a().execute(RunnableC49311i.f113342a);
        }
    }

    /* renamed from: l */
    public static void m92381l() {
        if (!f113328p) {
            try {
                f113329q.await(500, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.cache.e$d */
    public static final class RunnableC49306d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f113337a;

        static {
            Covode.recordClassIndex(58107);
        }

        public RunnableC49306d(boolean z) {
            this.f113337a = z;
        }

        public final void run() {
            File file;
            File file2;
            try {
                if (C49301e.f113318f) {
                    C49324h.m92404b("");
                    file = C49301e.m92356a("feed2.pb");
                    file2 = C49301e.m92356a("feed2.json");
                } else {
                    C49324h.m92401a("");
                    file = C49301e.m92356a("feed.pb");
                    file2 = C49301e.m92356a("feed.json");
                }
                if (file != null) {
                    C49301e.m92364a(file);
                }
                if (file2 != null) {
                    C49301e.m92364a(file2);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.cache.e$f */
    public static final class CallableC49308f<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f113339a;

        static {
            Covode.recordClassIndex(58109);
        }

        CallableC49308f(C89233z.C89238e eVar) {
            this.f113339a = eVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                if (this.f113339a.element == null) {
                    jSONObject.put("is_success", 1);
                } else {
                    jSONObject.put("is_success", 0);
                    jSONObject.put("errorCode", this.f113339a.element.intValue());
                }
                C29819a.m60077a("cache_feed_request_response", jSONObject);
            } catch (Exception unused) {
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.cache.e$m */
    public static final class CallableC49315m<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ int f113346a;

        /* renamed from: b */
        final /* synthetic */ int f113347b;

        /* renamed from: c */
        final /* synthetic */ Integer f113348c;

        static {
            Covode.recordClassIndex(58116);
        }

        CallableC49315m(int i, int i2, Integer num) {
            this.f113346a = i;
            this.f113347b = i2;
            this.f113348c = num;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_cache", this.f113346a);
                jSONObject.put("is_timeout", this.f113347b);
                jSONObject.put("cache_num", this.f113348c);
                jSONObject.put("from_type", C49324h.m92411f());
                C29819a.m60077a("pull_out_cache_video", jSONObject);
            } catch (Exception unused) {
            }
            return C89391z.f203057a;
        }
    }

    static {
        Covode.recordClassIndex(58102);
    }

    /* renamed from: d */
    static boolean m92372d() {
        if (m92356a("feed.pb") == null && m92356a("feed.json") == null && m92356a("feed2.pb") == null && m92356a("feed2.json") == null) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    static int m92373e() {
        long b;
        String d;
        int i = f113321i * 3600000;
        if (f113318f) {
            b = C49324h.m92405c();
            d = C49324h.m92409e();
        } else {
            b = C49324h.m92402b();
            d = C49324h.m92407d();
        }
        if (i <= 0) {
            return 4;
        }
        if (TextUtils.isEmpty(d)) {
            return 2;
        }
        if (System.currentTimeMillis() - b >= ((long) i)) {
            return 3;
        }
        return 1;
    }

    /* renamed from: h */
    static void m92377h() {
        if (f113317e) {
            C49324h.m92403b(System.currentTimeMillis());
            C49324h.m92404b("");
        } else {
            C49324h.m92400a(System.currentTimeMillis());
            C49324h.m92401a("");
        }
        C49324h.m92412f("def");
    }

    /* renamed from: a */
    public static boolean m92360a() {
        boolean z = f113330r;
        if (f113330r) {
            f113330r = false;
        }
        return z;
    }

    /* renamed from: i */
    public static FeedItemList m92378i() {
        FeedItemList feedItemList;
        List<Aweme> items;
        MethodCollector.m26663i(5722);
        synchronized (f113319g) {
            try {
                feedItemList = f113313a;
            } finally {
                MethodCollector.m26664o(5722);
            }
        }
        if (feedItemList != null) {
            f113330r = true;
            f113323k = true;
        }
        f113313a = null;
        if (!(feedItemList == null || (items = feedItemList.getItems()) == null || items.isEmpty())) {
            try {
                User b = C80580in.m139683b();
                C89219l.m154716b(b, "");
                String secUid = b.getSecUid();
                if (secUid == null) {
                    secUid = "";
                }
                String string = C49324h.m92399a().getString("feed_video_cache_current_uid", "");
                if (string == null) {
                    string = "";
                }
                if (true ^ C89219l.m154714a((Object) string, (Object) secUid)) {
                    List<Aweme> items2 = feedItemList.getItems();
                    if (items2 != null) {
                        items2.clear();
                    }
                    f113315c = "";
                }
            } catch (Exception e) {
                C51423a.m95791b(6, "filterCacheByUid", "filter error:" + e.getMessage());
            }
        }
        return feedItemList;
    }

    /* renamed from: n */
    public static boolean m92383n() {
        String str;
        List c;
        String d = C49324h.m92407d();
        if (!(d == null || d.length() == 0 || (m92356a("feed.pb") == null && m92356a("feed.json") == null))) {
            String a = C80860b.m140276a(C49324h.m92407d());
            if (a == null || (c = C89361p.m154921c(a, new String[]{","})) == null || (str = (String) c.get(0)) == null) {
                str = "";
            }
            if (new File(str).exists()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final FeedItemList mo80896c() {
        List<Aweme> items;
        boolean g = SettingsRequestServiceImpl.m65417i().mo57289g();
        FeedItemList d = m92371d(g);
        if (d == null) {
            d = m92374e(g);
        }
        if (f113318f) {
            if (!g) {
                C49324h.m92404b("");
            }
        } else if (!g) {
            C49324h.m92401a("");
        }
        if (!(d == null || (items = d.getItems()) == null)) {
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) items, 10));
            for (T t : items) {
                C89219l.m154716b(t, "");
                t.setItemSourceCategory(1);
                arrayList.add(C89391z.f203057a);
            }
        }
        return d;
    }

    /* renamed from: f */
    static FeedItemList m92375f() {
        FeedItemList feedItemList;
        Exception e;
        if (C49522n.m92756a() > 0 && f113314b != null) {
            FeedItemList feedItemList2 = f113314b;
            if (feedItemList2 == null) {
                C89219l.m154715b();
            }
            if (feedItemList2.getItems() != null) {
                FeedItemList feedItemList3 = f113314b;
                if (feedItemList3 == null) {
                    C89219l.m154715b();
                }
                List<Aweme> items = feedItemList3.getItems();
                if (items == null) {
                    C89219l.m154715b();
                }
                if (items.size() > 0) {
                    return f113314b;
                }
            }
        }
        C1731i.m5640b(CallableC49307e.f113338a, C1731i.f5562a);
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = null;
        try {
            feedItemList = FeedApiService.m91022a().fetchFeedList(0, 0, 0, 0, null, null, 8, 0, "", null, null, 0, null, null, false);
            if (feedItemList != null) {
                try {
                    if (!C13603b.m24435a((Collection) feedItemList.getItems())) {
                        Iterator<Aweme> it = feedItemList.getItems().iterator();
                        while (it.hasNext()) {
                            Aweme next = it.next();
                            if (next != null && (next.isLive() || C76706a.m134281g(next))) {
                                it.remove();
                            }
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    eVar.element = (T) Integer.valueOf(C16105a.m29903a(e, (String[]) null));
                    C1731i.m5640b(new CallableC49308f(eVar), C1731i.f5562a);
                    return feedItemList;
                }
            }
            if (!(f113320h || feedItemList == null || feedItemList.getItems() == null)) {
                if (feedItemList.getItems().size() > 1) {
                    List<Aweme> items2 = feedItemList.getItems();
                    C89219l.m154716b(items2, "");
                    List<Aweme> items3 = feedItemList.getItems();
                    items3.clear();
                    items3.add((Aweme) C89070n.m154579f((List) items2));
                }
            }
        } catch (Exception e3) {
            e = e3;
            feedItemList = null;
            eVar.element = (T) Integer.valueOf(C16105a.m29903a(e, (String[]) null));
            C1731i.m5640b(new CallableC49308f(eVar), C1731i.f5562a);
            return feedItemList;
        }
        C1731i.m5640b(new CallableC49308f(eVar), C1731i.f5562a);
        return feedItemList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.cache.e$i */
    public static final class RunnableC49311i implements Runnable {

        /* renamed from: a */
        public static final RunnableC49311i f113342a = new RunnableC49311i();

        static {
            Covode.recordClassIndex(58112);
        }

        RunnableC49311i() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x007b, code lost:
            if (r1 != false) goto L_0x007d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0054 A[Catch:{ all -> 0x01e5 }] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0060 A[Catch:{ all -> 0x01e5 }] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x006d A[Catch:{ all -> 0x01e5 }] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0081 A[Catch:{ all -> 0x01e5 }] */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x0140 A[Catch:{ all -> 0x01e5 }] */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x0192 A[Catch:{ all -> 0x01e5 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 499
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.cache.C49301e.RunnableC49311i.run():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.cache.e$k */
    public static final class RunnableC49313k implements Runnable {

        /* renamed from: a */
        public static final RunnableC49313k f113344a = new RunnableC49313k();

        static {
            Covode.recordClassIndex(58114);
        }

        RunnableC49313k() {
        }

        public final void run() {
            Throwable th;
            File file;
            FileOutputStream fileOutputStream;
            Throwable th2;
            File[] listFiles;
            String str;
            int i = 5730;
            MethodCollector.m26663i(5730);
            try {
                boolean z = true;
                if (C17867d.m33078a() != null && !TextUtils.isEmpty(C49301e.f113315c) && (!SettingsRequestServiceImpl.m65417i().mo57289g() || C58945a.C58947b.f134185a.f134177d)) {
                    C17867d.m33078a();
                    String d = C49324h.m92407d();
                    String e = C49324h.m92409e();
                    String b = C49301e.m92365b();
                    if (b != null) {
                        File file2 = new File(b + File.separator + "feedCache");
                        if (!(!file2.exists() || (listFiles = file2.listFiles()) == null || listFiles.length == 0)) {
                            ArrayList arrayList = new ArrayList(listFiles.length);
                            for (File file3 : listFiles) {
                                String str2 = C49301e.f113315c;
                                if (str2 == null) {
                                    C89219l.m154715b();
                                }
                                C89219l.m154716b(file3, "");
                                String name = file3.getName();
                                C89219l.m154716b(name, "");
                                if (!C89361p.m154929e((CharSequence) str2, (CharSequence) name)) {
                                    if (d == null) {
                                        C89219l.m154715b();
                                    }
                                    String name2 = file3.getName();
                                    C89219l.m154716b(name2, "");
                                    if (!C89361p.m154929e((CharSequence) d, (CharSequence) name2)) {
                                        if (e == null) {
                                            C89219l.m154715b();
                                        }
                                        String name3 = file3.getName();
                                        C89219l.m154716b(name3, "");
                                        if (!C89361p.m154929e((CharSequence) e, (CharSequence) name3)) {
                                            String name4 = file3.getName();
                                            C89219l.m154716b(name4, "");
                                            if (!C89361p.m154929e((CharSequence) "feed2.pb", (CharSequence) name4)) {
                                                String name5 = file3.getName();
                                                C89219l.m154716b(name5, "");
                                                if (!C89361p.m154929e((CharSequence) "feed.pb", (CharSequence) name5)) {
                                                    String name6 = file3.getName();
                                                    C89219l.m154716b(name6, "");
                                                    if (!C89361p.m154929e((CharSequence) "feed2.json", (CharSequence) name6)) {
                                                        String name7 = file3.getName();
                                                        C89219l.m154716b(name7, "");
                                                        if (!C89361p.m154929e((CharSequence) "feed.json", (CharSequence) name7)) {
                                                            if (!TextUtils.isEmpty(file3.getName())) {
                                                                String name8 = file3.getName();
                                                                C89219l.m154716b(name8, "");
                                                                if (C89361p.m154929e((CharSequence) name8, (CharSequence) ".mdl")) {
                                                                    String name9 = file3.getName();
                                                                    C89219l.m154716b(name9, "");
                                                                    List c = C89361p.m154921c(name9, new String[]{"."});
                                                                    if (c != null) {
                                                                        str = (String) c.get(0);
                                                                    } else {
                                                                        str = null;
                                                                    }
                                                                    if (!TextUtils.isEmpty(str)) {
                                                                        String str3 = C49301e.f113315c;
                                                                        if (str3 == null) {
                                                                            C89219l.m154715b();
                                                                        }
                                                                        if (str == null) {
                                                                            C89219l.m154715b();
                                                                        }
                                                                        try {
                                                                            if (!C89361p.m154929e((CharSequence) str3, (CharSequence) str)) {
                                                                                if (d == null) {
                                                                                    C89219l.m154715b();
                                                                                }
                                                                                if (!C89361p.m154929e((CharSequence) d, (CharSequence) str)) {
                                                                                    if (e == null) {
                                                                                        C89219l.m154715b();
                                                                                    }
                                                                                    if (!C89361p.m154929e((CharSequence) e, (CharSequence) str)) {
                                                                                        file3.getName();
                                                                                        C49301e.m92364a(file3);
                                                                                    }
                                                                                }
                                                                            }
                                                                            file3.getName();
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            i = 5730;
                                                                            C49301e.f113316d = false;
                                                                            MethodCollector.m26664o(i);
                                                                            throw th;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            file3.getName();
                                                            C49301e.m92364a(file3);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                arrayList.add(C89391z.f203057a);
                            }
                        }
                    }
                }
                FeedItemList f = C49301e.m92375f();
                if (!(f == null || f.getItems() == null || f.getItems().size() <= 0 || C17867d.m33078a() == null)) {
                    String b2 = C49301e.m92365b();
                    if (b2 != null) {
                        String str4 = b2 + File.separator + "feedCache";
                        File file4 = new File(str4);
                        if (!file4.exists()) {
                            file4.mkdir();
                        }
                        String d2 = C49324h.m92407d();
                        String e2 = C49324h.m92409e();
                        if (!C16048b.m29633a().mo25421a(true, "feed_cache_fore_backup", false)) {
                            if (TextUtils.isEmpty(d2) || !TextUtils.isEmpty(e2) || !C49301e.f113320h) {
                                z = false;
                            }
                            C49301e.f113317e = z;
                        } else {
                            if (TextUtils.isEmpty(d2) || !TextUtils.isEmpty(e2)) {
                                z = false;
                            }
                            C49301e.f113317e = z;
                        }
                        if (!C49301e.m92363a(f, str4)) {
                            if (C49301e.f113317e) {
                                file = new File(str4 + File.separator + "feed2.json");
                            } else {
                                file = new File(str4 + File.separator + "feed.json");
                            }
                            if (C49301e.m92367b(file)) {
                                GsonProvider c2 = GsonHolder.m138943c();
                                C89219l.m154716b(c2, "");
                                String b3 = c2.mo123620b().mo46674b(f);
                                if (!TextUtils.isEmpty(b3)) {
                                    try {
                                        fileOutputStream = new FileOutputStream(file);
                                        try {
                                            C89219l.m154716b(b3, "");
                                            Charset charset = C89338d.f202990a;
                                            if (b3 != null) {
                                                byte[] bytes = b3.getBytes(charset);
                                                C89219l.m154716b(bytes, "");
                                                fileOutputStream.write(bytes);
                                                C49301e.m92377h();
                                                C49301e.m92376g();
                                                C80313cs.m139228a(fileOutputStream);
                                            } else {
                                                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                                MethodCollector.m26664o(5730);
                                                throw nullPointerException;
                                            }
                                        } catch (Exception unused) {
                                            C80313cs.m139228a(fileOutputStream);
                                            C49301e.m92359a(f);
                                            C49301e.f113316d = false;
                                            MethodCollector.m26664o(5730);
                                        } catch (Throwable th4) {
                                            th2 = th4;
                                            C80313cs.m139228a(fileOutputStream);
                                            MethodCollector.m26664o(5730);
                                            throw th2;
                                        }
                                    } catch (Exception unused2) {
                                        fileOutputStream = null;
                                        C80313cs.m139228a(fileOutputStream);
                                        C49301e.m92359a(f);
                                        C49301e.f113316d = false;
                                        MethodCollector.m26664o(5730);
                                    } catch (Throwable th5) {
                                        th2 = th5;
                                        fileOutputStream = null;
                                        C80313cs.m139228a(fileOutputStream);
                                        MethodCollector.m26664o(5730);
                                        throw th2;
                                    }
                                }
                            }
                        }
                    }
                }
                C49301e.m92359a(f);
                C49301e.f113316d = false;
                MethodCollector.m26664o(5730);
            } catch (Throwable th6) {
                th = th6;
                C49301e.f113316d = false;
                MethodCollector.m26664o(i);
                throw th;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.cache.e$j */
    static final class C49312j extends AbstractC89220m implements AbstractC89172b<Aweme, CharSequence> {

        /* renamed from: a */
        public static final C49312j f113343a = new C49312j();

        static {
            Covode.recordClassIndex(58113);
        }

        C49312j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CharSequence invoke(Aweme aweme) {
            Aweme aweme2 = aweme;
            C89219l.m154716b(aweme2, "");
            String aid = aweme2.getAid();
            C89219l.m154716b(aid, "");
            return aid;
        }
    }

    /* renamed from: a */
    static void m92357a(int i) {
        C1731i.m5640b(new CallableC49314l(i), C1731i.f5562a);
    }

    /* renamed from: b */
    static boolean m92367b(File file) {
        if (file.exists()) {
            return true;
        }
        try {
            file.createNewFile();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m92370c(String str) {
        String str2;
        Boolean valueOf;
        if (str == null || f113315c == null || (str2 = f113315c) == null || (valueOf = Boolean.valueOf(C89361p.m154908a((CharSequence) str2, (CharSequence) str, false))) == null) {
            return false;
        }
        return valueOf.booleanValue();
    }

    /* renamed from: a */
    static File m92356a(String str) {
        if (C17867d.m33078a() == null) {
            return null;
        }
        File file = new File(m92365b() + File.separator + "feedCache" + File.separator + str);
        if (!file.exists()) {
            return null;
        }
        return file;
    }

    /* renamed from: b */
    public static void m92366b(boolean z) {
        if (!C49319g.f113355b) {
            C49319g.f113355b = true;
            C49319g.f113356c = z;
            FeedItemList feedItemList = f113326n;
            if (feedItemList != null && z) {
                C49319g.m92397a(feedItemList);
            }
            f113326n = null;
        }
    }

    /* renamed from: a */
    static void m92359a(FeedItemList feedItemList) {
        List<Aweme> items;
        Video video;
        VideoUrlModel playAddr;
        VideoUrlModel playAddr2;
        if (!(feedItemList == null || feedItemList.getItems() == null)) {
            feedItemList.getItems().size();
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (!(feedItemList == null || (items = feedItemList.getItems()) == null)) {
            ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) items, 10));
            for (T t : items) {
                if (!(t == null || t.getVideo() == null)) {
                    Video video2 = t.getVideo();
                    List<String> list = null;
                    if (!(video2 == null || video2.getPlayAddr() == null || (video = t.getVideo()) == null || (playAddr = video.getPlayAddr()) == null || playAddr.getUrlList() == null)) {
                        Video video3 = t.getVideo();
                        if (video3 == null || (playAddr2 = video3.getPlayAddr()) == null || (list = playAddr2.getUrlList()) == null) {
                            C89219l.m154715b();
                        }
                        if (list.size() > 0 && i < 2 && m92362a((Aweme) t, t.getAid())) {
                            i++;
                            arrayList.add(t.getAid());
                            String aid = t.getAid();
                            if (C17867d.m33078a() != null && !TextUtils.isEmpty(aid)) {
                                if (f113317e) {
                                    String e = C49324h.m92409e();
                                    if (!TextUtils.isEmpty(e)) {
                                        aid = e + ',' + aid;
                                    }
                                    C49324h.m92404b(aid);
                                } else {
                                    String d = C49324h.m92407d();
                                    if (!TextUtils.isEmpty(d)) {
                                        aid = d + ',' + aid;
                                    }
                                    C49324h.m92401a(aid);
                                }
                            }
                        }
                    }
                }
                arrayList2.add(C89391z.f203057a);
            }
        }
    }

    /* renamed from: c */
    static void m92369c(boolean z) {
        String b;
        File[] listFiles;
        if (C17867d.m33078a() != null && (b = m92365b()) != null) {
            File file = new File(b + File.separator + "feedCache");
            int i = 0;
            if (!(!file.exists() || (listFiles = file.listFiles()) == null || listFiles.length == 0)) {
                ArrayList arrayList = new ArrayList(listFiles.length);
                int length = listFiles.length;
                int i2 = 0;
                while (i < length) {
                    File file2 = listFiles[i];
                    if (z) {
                        C89219l.m154716b(file2, "");
                        if ("feed.pb".equals(file2.getName()) || "feed.json".equals(file2.getName())) {
                            m92364a(file2);
                            file2.getName();
                        } else {
                            arrayList.add(C89391z.f203057a);
                            i++;
                        }
                    } else {
                        C89219l.m154716b(file2, "");
                        if ("feed2.pb".equals(file2.getName()) || "feed2.json".equals(file2.getName())) {
                            m92364a(file2);
                            file2.getName();
                        } else {
                            arrayList.add(C89391z.f203057a);
                            i++;
                        }
                    }
                    i2++;
                    arrayList.add(C89391z.f203057a);
                    i++;
                }
                i = i2;
            }
            m92358a(1, m92373e(), Integer.valueOf(i));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009c, code lost:
        if (0 == 0) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ae, code lost:
        if (r4.getItems().size() > 0) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c0, code lost:
        if (r4.getItems().size() > 0) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c2, code lost:
        m92358a(-2, 0, java.lang.Integer.valueOf(r4.getItems().size()));
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d6  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.p2082ss.android.ugc.aweme.feed.model.FeedItemList m92371d(boolean r9) {
        /*
        // Method dump skipped, instructions count: 230
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.cache.C49301e.m92371d(boolean):com.ss.android.ugc.aweme.feed.model.FeedItemList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0067, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        r6 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        r1 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0067 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:9:0x0021] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0087  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.p2082ss.android.ugc.aweme.feed.model.FeedItemList m92374e(boolean r7) {
        /*
        // Method dump skipped, instructions count: 139
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.cache.C49301e.m92374e(boolean):com.ss.android.ugc.aweme.feed.model.FeedItemList");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:35|36|37|38|51) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00e3 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m92368b(java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 300
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.cache.C49301e.m92368b(java.lang.String):boolean");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:45|44|46|47|(1:49)|50|59|61) */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d4, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d5, code lost:
        if (r2 == null) goto L_0x00da;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x00c4 */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00cd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m92361a(com.bytedance.retrofit2.C22099u<com.bytedance.retrofit2.mime.TypedInput> r12, java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 229
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.cache.C49301e.m92361a(com.bytedance.retrofit2.u, java.lang.String):boolean");
    }

    /* renamed from: a */
    private static boolean m92362a(Aweme aweme, String str) {
        String str2;
        VideoUrlModel playAddr;
        List<String> urlList;
        VideoUrlModel h264PlayAddr;
        List<String> urlList2;
        VideoUrlModel playAddr2;
        List<String> urlList3;
        C84241i a;
        if (aweme == null) {
            return false;
        }
        C84241i iVar = null;
        if (!f113320h) {
            C1731i.m5640b(C49326i.CallableC49327a.f113369a, C1731i.f5562a);
            if (!C49522n.m92757b()) {
                C80662ac.m139882a(aweme, Integer.MAX_VALUE);
            } else if (!(aweme.isLive() || aweme.getVideo() == null || aweme.getVideo().getProperPlayAddr() == null || C80937s.m140453b() == null || C80933o.m140451a() == null)) {
                Aweme clone = aweme.clone();
                CopyOnWriteArrayList<BitRate> copyOnWriteArrayList = new CopyOnWriteArrayList(clone.getVideo().getBitRate());
                ArrayList arrayList = new ArrayList();
                if (copyOnWriteArrayList.size() > 0) {
                    for (BitRate bitRate : copyOnWriteArrayList) {
                        if (bitRate != null && bitRate.isBytevc1() == 0) {
                            arrayList.add(bitRate);
                        }
                    }
                    if (copyOnWriteArrayList.size() > 0) {
                        clone.getVideo().setBitRate(arrayList);
                    }
                }
                if (AbstractC80807a.f180735a) {
                    a = C80780p.m140117a(C80942a.m140477a(clone.getVideo()), C84199c.f187979a.getPlayerType());
                } else {
                    a = C80942a.m140478a(clone.getVideo().getProperPlayAddr());
                }
                if (a != null) {
                    a.setSourceId(clone.getAid());
                    a.setRatio(clone.getVideo().getRatio());
                    if (!TextUtils.isEmpty(clone.getVideo().getVideoModelStr())) {
                        a.setDashVideoModelStr(clone.getVideo().getVideoModelStr());
                    }
                    iVar = a;
                }
                C80937s.m140453b().mo124072a(iVar, Integer.MAX_VALUE, C80662ac.m139897d(aweme), C80662ac.m139894c(aweme), 102400);
            }
            C49326i.f113365a = aweme;
            return true;
        }
        if (!C49522n.m92757b()) {
            Video video = aweme.getVideo();
            if (!(video == null || (playAddr2 = video.getPlayAddr()) == null || (urlList3 = playAddr2.getUrlList()) == null)) {
                str2 = urlList3.get(0);
            }
            str2 = null;
        } else {
            Video video2 = aweme.getVideo();
            str2 = (video2 == null || (h264PlayAddr = video2.getH264PlayAddr()) == null || (urlList2 = h264PlayAddr.getUrlList()) == null) ? null : urlList2.get(0);
            if (TextUtils.isEmpty(str2)) {
                Video video3 = aweme.getVideo();
                if (!(video3 == null || (playAddr = video3.getPlayAddr()) == null || (urlList = playAddr.getUrlList()) == null)) {
                    str2 = urlList.get(0);
                }
                str2 = null;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> a2 = C14759i.m27066a(str2, linkedHashMap);
        String str3 = (String) a2.first;
        String str4 = (String) a2.second;
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            return false;
        }
        C1731i.m5640b(CallableC49309g.f113340a, C1731i.f5562a);
        C89219l.m154716b(str3, "");
        AbstractC18099f d = C18097a.m33699b(str3).mo28823a().mo28832d();
        C89219l.m154716b(d, "");
        try {
            C22099u<TypedInput> execute = ((INetworkApi) d.mo28858a(INetworkApi.class)).downloadFile(false, -1, str4, linkedHashMap).execute();
            if (execute == null) {
                return false;
            }
            return m92361a(execute, str);
        } catch (Exception e) {
            C1731i.m5640b(new CallableC49310h(e), C1731i.f5562a);
        }
    }

    /* renamed from: a */
    static boolean m92363a(FeedItemList feedItemList, String str) {
        File file;
        MethodCollector.m26663i(5473);
        if (!(feedItemList == null || feedItemList.pbData == null)) {
            if (f113317e) {
                file = new File(str + File.separator + "feed2.pb");
            } else {
                file = new File(str + File.separator + "feed.pb");
            }
            if (m92367b(file)) {
                FileOutputStream fileOutputStream = null;
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        feedItemList.pbData.encode(fileOutputStream2);
                        m92377h();
                        String requestId = feedItemList.getRequestId();
                        if (!TextUtils.isEmpty(requestId)) {
                            if (f113317e) {
                                C49324h.m92408d(requestId);
                            } else {
                                C49324h.m92406c(requestId);
                            }
                        }
                        m92376g();
                        C80313cs.m139228a(fileOutputStream2);
                        MethodCollector.m26664o(5473);
                        return true;
                    } catch (Throwable unused) {
                        fileOutputStream = fileOutputStream2;
                        C80313cs.m139228a(fileOutputStream);
                        MethodCollector.m26664o(5473);
                        return false;
                    }
                } catch (Throwable unused2) {
                    C80313cs.m139228a(fileOutputStream);
                    MethodCollector.m26664o(5473);
                    return false;
                }
            }
        }
        MethodCollector.m26664o(5473);
        return false;
    }

    /* renamed from: a */
    static void m92358a(int i, int i2, Integer num) {
        C1731i.m5640b(new CallableC49315m(i, i2, num), C1731i.f5562a);
    }
}
