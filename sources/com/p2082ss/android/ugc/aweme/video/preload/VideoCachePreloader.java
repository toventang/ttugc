package com.p2082ss.android.ugc.aweme.video.preload;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.p2441cf.p2442a.C35467b;
import com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g;
import com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i;
import com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80846e;
import com.p2082ss.android.ugc.aweme.video.preload.api.AbstractC80850i;
import com.p2082ss.android.ugc.aweme.video.preload.p4216c.RunnableC80869a;
import com.p2082ss.android.ugc.playerkit.model.C84199c;
import com.p2082ss.android.ugc.playerkit.model.C84201e;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import com.p2082ss.android.ugc.playerkit.model.C84227x;
import com.p2082ss.android.ugc.playerkit.p4324d.C84186a;
import com.p2082ss.android.ugc.playerkit.p4324d.C84187b;
import com.p2082ss.android.ugc.playerkit.simapicommon.C84231a;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;
import com.p2082ss.android.ugc.playerkit.videoview.p4326a.C84253c;
import com.toutiao.proxyserver.AbstractC87351l;
import com.toutiao.proxyserver.AbstractC87352m;
import com.toutiao.proxyserver.AbstractC87353n;
import com.toutiao.proxyserver.AbstractC87366o;
import com.toutiao.proxyserver.AbstractC87368q;
import com.toutiao.proxyserver.C87291ae;
import com.toutiao.proxyserver.C87331h;
import com.toutiao.proxyserver.C87348j;
import com.toutiao.proxyserver.C87370s;
import com.toutiao.proxyserver.C87371t;
import com.toutiao.proxyserver.C87383u;
import com.toutiao.proxyserver.C87385v;
import com.toutiao.proxyserver.net.C87360c;
import com.toutiao.proxyserver.p4490b.C87295a;
import com.toutiao.proxyserver.p4490b.C87296b;
import com.toutiao.proxyserver.p4491c.C87299a;
import com.toutiao.proxyserver.p4491c.C87301c;
import com.toutiao.proxyserver.p4493e.AbstractC87310a;
import com.toutiao.proxyserver.p4493e.AbstractC87311b;
import com.toutiao.proxyserver.p4493e.C87312c;
import com.toutiao.proxyserver.p4494f.C87318c;
import com.toutiao.proxyserver.p4495g.C87327a;
import com.toutiao.proxyserver.p4495g.C87328b;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.video.preload.VideoCachePreloader */
public class VideoCachePreloader implements AbstractC80806a {

    /* renamed from: a */
    public static final String f180659a = VideoCachePreloader.class.getSimpleName();

    /* renamed from: n */
    private static File f180660n;

    /* renamed from: o */
    private static final String f180661o = AbstractC80918i.EnumC80919a.VideoCache.getCacheDirName();

    /* renamed from: r */
    private static File f180662r;

    /* renamed from: b */
    public C80799e f180663b;

    /* renamed from: c */
    public boolean f180664c;

    /* renamed from: d */
    public final IVideoPreloadConfig f180665d = C80933o.m140451a();

    /* renamed from: e */
    public Map<String, C84224v> f180666e = Collections.synchronizedMap(new LinkedHashMap<String, C84224v>() {
        /* class com.p2082ss.android.ugc.aweme.video.preload.VideoCachePreloader.C807821 */

        static {
            Covode.recordClassIndex(94078);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map$Entry] */
        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, C84224v> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    });

    /* renamed from: f */
    public Map<String, List<C84224v>> f180667f = Collections.synchronizedMap(new LinkedHashMap<String, List<C84224v>>() {
        /* class com.p2082ss.android.ugc.aweme.video.preload.VideoCachePreloader.C807874 */

        static {
            Covode.recordClassIndex(94083);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map$Entry] */
        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, List<C84224v>> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    });

    /* renamed from: g */
    public Map<String, List<C87296b>> f180668g = Collections.synchronizedMap(new LinkedHashMap<String, List<C87296b>>() {
        /* class com.p2082ss.android.ugc.aweme.video.preload.VideoCachePreloader.C807885 */

        static {
            Covode.recordClassIndex(94084);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map$Entry] */
        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, List<C87296b>> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    });

    /* renamed from: h */
    HashMap<String, List<C84227x>> f180669h = new LinkedHashMap<String, List<C84227x>>() {
        /* class com.p2082ss.android.ugc.aweme.video.preload.VideoCachePreloader.C807896 */

        static {
            Covode.recordClassIndex(94085);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map$Entry] */
        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, List<C84227x>> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: i */
    public HashMap<String, C87295a> f180670i = new LinkedHashMap<String, C87295a>() {
        /* class com.p2082ss.android.ugc.aweme.video.preload.VideoCachePreloader.C807907 */

        static {
            Covode.recordClassIndex(94086);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map$Entry] */
        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, C87295a> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: j */
    public WeakReference<Object> f180671j;

    /* renamed from: k */
    public final List<WeakReference<AbstractC80914f>> f180672k = new CopyOnWriteArrayList();

    /* renamed from: l */
    public WeakReference<AbstractC80873e> f180673l;

    /* renamed from: m */
    public C84227x f180674m = null;

    /* renamed from: p */
    private C80794b f180675p;

    /* renamed from: q */
    private boolean f180676q;

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: a */
    public final void mo124008a(AbstractC80921k kVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: a */
    public final void mo124010a(Map<String, String> map) {
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: f */
    public final boolean mo124025f() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: e */
    public final File mo124023e() {
        return f180660n;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: a */
    public final boolean mo124014a(List<C84241i> list, int i, List<C84241i> list2, int i2) {
        if (!mo124011a()) {
            return false;
        }
        if (this.f180665d.isPlayerPreferchCaption() && list != null && !list.isEmpty()) {
            for (C84241i iVar : list) {
                if (iVar != null) {
                    this.f180675p.mo124054a(iVar, i);
                }
            }
        }
        if (!this.f180665d.isPlayerPreferchTtsAudio() || list2 == null || list2.isEmpty()) {
            return true;
        }
        if (this.f180665d.playerPreferchTtsAudioSize() > 0) {
            i2 = this.f180665d.playerPreferchTtsAudioSize();
        }
        for (C84241i iVar2 : list2) {
            if (iVar2 != null) {
                this.f180675p.mo124054a(iVar2, i2);
            }
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.video.preload.VideoCachePreloader$a */
    public static class C80793a {

        /* renamed from: a */
        public static final VideoCachePreloader f180688a = new VideoCachePreloader();

        static {
            Covode.recordClassIndex(94089);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: b */
    public final void mo124016b() {
        if (mo124011a()) {
            this.f180675p.mo124052a(2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: d */
    public final String mo124020d() {
        if (C87383u.f198092l) {
            return "ttnet";
        }
        return "okhttp";
    }

    static {
        Covode.recordClassIndex(94077);
    }

    /* renamed from: h */
    private void m140123h() {
        int i;
        if (C87383u.f198092l) {
            i = this.f180665d.getExperiment().VideoCacheTTnetPreloadTimeoutExperiment();
        } else {
            i = 30000;
        }
        C87371t.m151640a().mo141412a((long) i);
    }

    /* renamed from: i */
    private void m140124i() {
        int i;
        if (C87383u.f198092l) {
            i = this.f180665d.getExperiment().VideoCacheTTnetProxyTimeoutExperiment();
        } else {
            i = 10000;
        }
        C87385v.m151666a().mo141433a((long) i);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: a */
    public final boolean mo124011a() {
        if (this.f180675p != null) {
            return true;
        }
        mo124027g();
        try {
            C80794b bVar = new C80794b();
            this.f180675p = bVar;
            bVar.start();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: c */
    public final void mo124019c() {
        if (mo124011a()) {
            this.f180675p.mo124052a(3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.video.preload.VideoCachePreloader$b */
    public class C80794b extends Thread {

        /* renamed from: a */
        public Queue<C80796a> f180689a = new LinkedBlockingQueue();

        /* renamed from: b */
        public Queue<C80796a> f180690b = new LinkedBlockingQueue();

        /* renamed from: d */
        private boolean f180692d = true;

        /* renamed from: e */
        private final Queue<C80796a> f180693e = new ArrayBlockingQueue(10);

        /* renamed from: f */
        private C80797c f180694f = new C80797c(this);

        static {
            Covode.recordClassIndex(94090);
        }

        /* renamed from: a */
        private static void m140167a() {
            if (C84231a.m144834a().isDebug() && Thread.currentThread() == Looper.getMainLooper().getThread()) {
                throw new IllegalStateException("cannot run on the main thread!");
            }
        }

        public final void run() {
            MethodCollector.m26663i(13326);
            while (this.f180692d) {
                synchronized (this) {
                    try {
                        if (!this.f180690b.isEmpty() && VideoCachePreloader.this.f180665d.canPreload()) {
                            m140167a();
                            while (true) {
                                C80796a poll = this.f180690b.poll();
                                if (poll == null) {
                                    break;
                                } else if (VideoCachePreloader.this.f180664c) {
                                    final C84241i iVar = poll.f180706h;
                                    final int i = poll.f180702d;
                                    poll.f180705g = new AbstractC87368q() {
                                        /* class com.p2082ss.android.ugc.aweme.video.preload.VideoCachePreloader.C80794b.C807951 */

                                        /* renamed from: a */
                                        C84253c f180695a;

                                        static {
                                            Covode.recordClassIndex(94091);
                                        }

                                        @Override // com.toutiao.proxyserver.AbstractC87368q
                                        /* renamed from: c */
                                        public final String mo124058c() {
                                            if (this.f180695a == null) {
                                                mo124056a();
                                            }
                                            C84253c cVar = this.f180695a;
                                            if (cVar != null) {
                                                return cVar.f188432c;
                                            }
                                            return null;
                                        }

                                        @Override // com.toutiao.proxyserver.AbstractC87368q
                                        /* renamed from: a */
                                        public final String[] mo124056a() {
                                            if (this.f180695a == null) {
                                                this.f180695a = VideoCachePreloader.this.f180665d.createVideoUrlProcessor().mo124208a(iVar, C84199c.f187979a.getPlayerType());
                                            }
                                            C84253c cVar = this.f180695a;
                                            if (cVar != null) {
                                                return cVar.f188430a;
                                            }
                                            return null;
                                        }

                                        @Override // com.toutiao.proxyserver.AbstractC87368q
                                        /* renamed from: b */
                                        public final int mo124057b() {
                                            if (this.f180695a == null) {
                                                mo124056a();
                                            }
                                            int i = i;
                                            if (this.f180695a == null) {
                                                return i;
                                            }
                                            int PlayerAbPreloadSizeOffsetThresholdExp = VideoCachePreloader.this.f180665d.getExperiment().PlayerAbPreloadSizeOffsetThresholdExp();
                                            if (this.f180695a.f188433d != null) {
                                                if (this.f180695a.f188433d.getSize() <= i || this.f180695a.f188433d.getSize() - i > PlayerAbPreloadSizeOffsetThresholdExp) {
                                                    return i;
                                                }
                                                return this.f180695a.f188433d.getSize();
                                            } else if (iVar.getSize() <= ((long) i) || iVar.getSize() - ((long) i) > ((long) PlayerAbPreloadSizeOffsetThresholdExp)) {
                                                return i;
                                            } else {
                                                return (int) iVar.getSize();
                                            }
                                        }
                                    };
                                    m140169b(poll);
                                } else {
                                    C84253c a = VideoCachePreloader.this.f180665d.createVideoUrlProcessor().mo124208a(poll.f180706h, C84199c.f187979a.getPlayerType());
                                    if (a != null) {
                                        poll.f180701c = a.f188430a;
                                        poll.f180700b = a.f188432c;
                                        poll.f180706h = null;
                                        m140169b(poll);
                                    }
                                }
                            }
                        }
                        while (!this.f180689a.isEmpty()) {
                            C80796a poll2 = this.f180689a.poll();
                            if (poll2 != null) {
                                int i2 = poll2.f180699a;
                                if (i2 != 0) {
                                    if (i2 == 1) {
                                        C87371t.m151640a().mo141413a(poll2.f180700b);
                                    } else if (i2 == 2) {
                                        C87371t.m151640a().mo141417b();
                                    } else if (i2 == 3) {
                                        C87371t.m151640a().mo141417b();
                                        if (C87383u.f198081a != null) {
                                            C87328b.m151554a(new Runnable() {
                                                /* class com.toutiao.proxyserver.C87325g.RunnableC873261 */

                                                static {
                                                    Covode.recordClassIndex(103222);
                                                }

                                                public final void run() {
                                                    C87325g gVar = C87325g.this;
                                                    C87371t.m151640a().mo141417b();
                                                    Context context = C87383u.f198085e;
                                                    if (context != null) {
                                                        C87301c.m151508a(context).mo141335b(1);
                                                    }
                                                    for (File file : gVar.f197933a.listFiles()) {
                                                        try {
                                                            C87325g.m151536a(file);
                                                        } catch (Throwable unused) {
                                                        }
                                                    }
                                                }
                                            });
                                        }
                                        if (C87383u.f198082b != null) {
                                            C87331h hVar = C87383u.f198082b;
                                            C87371t.m151640a().mo141417b();
                                            Context context = C87383u.f198085e;
                                            if (context != null) {
                                                C87301c.m151508a(context).mo141335b(0);
                                            }
                                            hVar.f197951i.removeCallbacks(hVar.f197950h);
                                            hVar.f197949g.execute(new Runnable() {
                                                /* class com.toutiao.proxyserver.C87331h.RunnableC873386 */

                                                static {
                                                    Covode.recordClassIndex(103234);
                                                }

                                                public final void run() {
                                                    C87331h.this.mo141359a(0);
                                                }
                                            });
                                        }
                                    } else if (i2 == 4) {
                                        C87371t.m151640a().mo141417b();
                                        this.f180692d = false;
                                    }
                                } else if (poll2.f180705g == null) {
                                    if (poll2.f180701c != null && poll2.f180701c.length > 0) {
                                        ArrayList arrayList = new ArrayList();
                                        String[] strArr = poll2.f180701c;
                                        for (String str : strArr) {
                                            if (C87328b.m151558a(str)) {
                                                arrayList.add(str);
                                            }
                                        }
                                        String[] strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
                                        if (poll2.f180702d <= 0) {
                                            C87371t.m151640a().mo141416a(false, C87371t.f198041h.f198039b, poll2.f180700b, (List<C87360c>) null, strArr2);
                                        } else {
                                            int PlayerAbPreloadSizeOffsetThresholdExp = VideoCachePreloader.this.f180665d.getExperiment().PlayerAbPreloadSizeOffsetThresholdExp();
                                            if (poll2.f180703e > poll2.f180702d && poll2.f180703e - poll2.f180702d <= PlayerAbPreloadSizeOffsetThresholdExp) {
                                                poll2.f180702d = poll2.f180703e;
                                            }
                                            C87371t.C87381a f = C87371t.m151640a().mo141421f();
                                            f.f198069b = poll2.f180700b;
                                            f.f198068a = poll2.f180702d;
                                            f.f198070c = strArr2;
                                            f.mo141430a();
                                        }
                                    }
                                } else if (poll2.f180702d <= 0) {
                                    C87371t.m151640a().mo141414a(false, C87371t.f198041h.f198039b, poll2.f180700b, (List<C87360c>) null, poll2.f180705g);
                                } else {
                                    C87371t.C87381a f2 = C87371t.m151640a().mo141421f();
                                    f2.f198068a = poll2.f180702d;
                                    f2.f198071d = poll2.f180705g;
                                    f2.mo141430a();
                                }
                                m140167a();
                                poll2.f180701c = null;
                                poll2.f180700b = null;
                                poll2.f180699a = -1;
                                poll2.f180706h = null;
                                poll2.f180702d = -1;
                                poll2.f180704f = false;
                                this.f180693e.offer(poll2);
                            }
                        }
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(13326);
                        throw th;
                    }
                }
            }
            MethodCollector.m26664o(13326);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo124053a(C80796a aVar) {
            this.f180694f.mo124059a(aVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.video.preload.VideoCachePreloader$b$a */
        public class C80796a {

            /* renamed from: a */
            public int f180699a;

            /* renamed from: b */
            public String f180700b;

            /* renamed from: c */
            public String[] f180701c;

            /* renamed from: d */
            public int f180702d = -1;

            /* renamed from: e */
            public int f180703e = -1;

            /* renamed from: f */
            public boolean f180704f;

            /* renamed from: g */
            public AbstractC87368q f180705g;

            /* renamed from: h */
            public C84241i f180706h;

            static {
                Covode.recordClassIndex(94092);
            }

            C80796a() {
            }
        }

        /* renamed from: b */
        private void m140169b(C80796a aVar) {
            m140167a();
            if (aVar != null) {
                this.f180689a.offer(aVar);
                notify();
            }
        }

        /* renamed from: a */
        public final void mo124052a(int i) {
            C80796a b = m140168b(i);
            b.f180704f = true;
            this.f180694f.mo124059a(b);
        }

        C80794b() {
        }

        /* renamed from: b */
        private C80796a m140168b(int i) {
            C35467b.m72528a(VideoCachePreloader.f180659a, "pool: " + this.f180693e.size());
            C80796a poll = this.f180693e.poll();
            if (poll == null) {
                poll = new C80796a();
            }
            poll.f180700b = null;
            poll.f180699a = i;
            poll.f180701c = null;
            return poll;
        }

        /* renamed from: a */
        public final void mo124054a(C84241i iVar, int i) {
            if (iVar != null) {
                mo124053a(mo124051a(0, iVar, i));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C80796a mo124051a(int i, C84241i iVar, int i2) {
            C35467b.m72528a(VideoCachePreloader.f180659a, "pool: " + this.f180693e.size());
            C80796a poll = this.f180693e.poll();
            if (poll == null) {
                poll = new C80796a();
            }
            poll.f180699a = i;
            poll.f180706h = iVar;
            poll.f180702d = i2;
            if (iVar != null) {
                poll.f180703e = (int) iVar.getSize();
            }
            return poll;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.video.preload.VideoCachePreloader$d */
    public static class RunnableC80798d implements Runnable {

        /* renamed from: a */
        private final C80794b f180711a;

        /* renamed from: b */
        private C80794b.C80796a f180712b;

        static {
            Covode.recordClassIndex(94094);
        }

        public final void run() {
            MethodCollector.m26663i(11815);
            synchronized (this.f180711a) {
                try {
                    C80794b.C80796a aVar = this.f180712b;
                    if (!aVar.f180704f) {
                        this.f180711a.f180690b.add(aVar);
                    } else {
                        this.f180711a.f180690b.clear();
                        this.f180711a.f180689a.clear();
                        this.f180711a.f180689a.offer(aVar);
                    }
                    this.f180711a.notify();
                } finally {
                    MethodCollector.m26664o(11815);
                }
            }
        }

        public RunnableC80798d(C80794b bVar, C80794b.C80796a aVar) {
            this.f180711a = bVar;
            this.f180712b = aVar;
        }
    }

    /* renamed from: j */
    private C87331h m140125j() {
        long a;
        C87331h hVar;
        IOException e;
        File file;
        Application application = C84231a.f188309a;
        if (application == null) {
            return null;
        }
        File file2 = f180662r;
        if (file2 == null) {
            if (C58016d.f132221b == null || !C58016d.f132224e) {
                C58016d.f132221b = application.getCacheDir();
            }
            File file3 = C58016d.f132221b;
            if (this.f180665d.getStorageManager().mo124205a()) {
                file3 = this.f180665d.getStorageManager().mo124204a(application, AbstractC80850i.EnumC80851a.PREFER_PRIVATE);
            }
            if (C84231a.m144834a().isDebug()) {
                file3 = C84186a.m144765a(application);
            }
            if (file3 == null) {
                return null;
            }
            file2 = new File(file3, f180661o);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            f180662r = file2;
        }
        long j = 104857600;
        int VideoCacheMaxCacheSizeExperiment = this.f180665d.getExperiment().VideoCacheMaxCacheSizeExperiment();
        if (VideoCacheMaxCacheSizeExperiment > 0) {
            j = (long) (VideoCacheMaxCacheSizeExperiment * 1048576);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            a = j;
        } else {
            a = (C84187b.m144768a() * 1048576) / 8;
        }
        if (this.f180665d.getStorageManager().mo124205a() && (file = f180662r) != null) {
            a = file.getFreeSpace() / 8;
        }
        if (a <= j) {
            if (a < 10485760) {
                j = 10485760;
            } else {
                j = a;
            }
        }
        f180660n = file2;
        try {
            hVar = new C87331h(file2);
            try {
                hVar.f197947e = j;
                hVar.mo141358a();
            } catch (IOException e2) {
                e = e2;
            }
        } catch (IOException e3) {
            e = e3;
            hVar = null;
            e.printStackTrace();
            return hVar;
        }
        return hVar;
    }

    /* renamed from: g */
    public final void mo124027g() {
        C87331h j;
        boolean z;
        boolean z2;
        boolean z3;
        if (!this.f180676q && (j = m140125j()) != null) {
            if (this.f180665d.getExperiment().PlayerPreloadLazyGetUrlsExperiment().booleanValue() || C84231a.m144834a().isDebug()) {
                z = true;
            } else {
                z = false;
            }
            this.f180664c = z;
            int VideoSpeedQueueSizeExperiment = this.f180665d.getExperiment().VideoSpeedQueueSizeExperiment();
            if (this.f180665d.getSpeedManager().mo124209a() != VideoSpeedQueueSizeExperiment && VideoSpeedQueueSizeExperiment > 0) {
                this.f180665d.getSpeedManager().mo124211a(VideoSpeedQueueSizeExperiment);
                this.f180665d.getSpeedManager().mo124213b(VideoSpeedQueueSizeExperiment);
            }
            C87370s.f198038a = 1;
            C87371t.f198041h.f198040c = new LinkedBlockingQueue();
            C87383u.f198077B = C84231a.m144834a().isDebug();
            C87383u.f198095o = 10;
            C87383u.f198076A = this.f180665d.getExperiment().VideoCacheWriteAsynchronousExperiment().booleanValue();
            C87383u.f198104x = 1;
            C87383u.f198106z = this.f180665d.getExperiment().UseVideoCacheHttpDnsExperiment().booleanValue();
            C87383u.f198093m = this.f180665d.getPlayerCommonParamManager().mo124203b();
            C87383u.f198103w = this.f180665d.getPlayerCommonParamManager().mo124202a();
            C87383u.f198096p = this.f180665d.getExperiment().CheckVideoCacheRequestHeaderExperiment().booleanValue();
            C87383u.f198097q = this.f180665d.getExperiment().PreloadLocalCachePathVideoPlayExperiment().booleanValue();
            C87383u.f198100t = this.f180665d.getExperiment().VideoCacheAutoAdjustPreloadMaxExperiment().booleanValue();
            C87383u.f198094n = this.f180665d.getExperiment().VideoCacheReadBuffersizeExperiment();
            C87383u.f198098r = this.f180665d.getExperiment().PlayerAbUseLastIf403Exp().booleanValue();
            if (this.f180665d.getExperiment().PlayUse2UrlExperiment() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            C87383u.f198099s = z2;
            if (this.f180665d.getExperiment().PlayeAbUserHttp2Exp() == 1 || C84231a.m144834a().isDebug()) {
                z3 = true;
            } else {
                z3 = false;
            }
            C87383u.f198101u = z3;
            C87318c.f197918c = 300;
            if (this.f180665d.getExperiment().UseTTNetExperiment() == 1) {
                C87383u.f198092l = true;
            } else {
                C87383u.f198092l = false;
            }
            C87383u.f198102v = this.f180665d.getMusicService().mo124200a();
            C87312c.f197906a = new AbstractC87310a() {
                /* class com.p2082ss.android.ugc.aweme.video.preload.VideoCachePreloader.C807918 */

                static {
                    Covode.recordClassIndex(94087);
                }

                @Override // com.toutiao.proxyserver.p4493e.AbstractC87310a
                /* renamed from: a */
                public final void mo124047a(String str, String str2, String str3) {
                    if (!C84231a.m144834a().isDebug()) {
                        C35467b.m72528a(str, str2);
                    }
                    JSONObject a = VideoCachePreloader.m140122a(str, str2, str3);
                    if (a != null) {
                        C84231a.m144838d().mo124332d("VideoCache", a);
                    }
                }

                @Override // com.toutiao.proxyserver.p4493e.AbstractC87310a
                /* renamed from: b */
                public final void mo124048b(String str, String str2, String str3) {
                    if (!C84231a.m144834a().isDebug()) {
                        C35467b.m72528a(str, str2);
                    }
                    JSONObject a = VideoCachePreloader.m140122a(str, str2, str3);
                    if (a != null) {
                        C84231a.m144838d().mo124335i("VideoCache", a);
                    }
                }

                @Override // com.toutiao.proxyserver.p4493e.AbstractC87310a
                /* renamed from: c */
                public final void mo124049c(String str, String str2, String str3) {
                    if (!C84231a.m144834a().isDebug()) {
                        C35467b.m72528a(str, str2);
                    }
                    JSONObject a = VideoCachePreloader.m140122a(str, str2, str3);
                    if (a != null) {
                        C84231a.m144838d().mo124338w("VideoCache", a);
                    }
                }

                @Override // com.toutiao.proxyserver.p4493e.AbstractC87310a
                /* renamed from: d */
                public final void mo124050d(String str, String str2, String str3) {
                    if (!C84231a.m144834a().isDebug()) {
                        C35467b.m72528a(str, str2);
                    }
                    JSONObject a = VideoCachePreloader.m140122a(str, str2, str3);
                    if (a != null) {
                        C84231a.m144838d().mo124334e("VideoCache", a);
                    }
                }
            };
            C87383u.f198105y = new AbstractC87311b() {
                /* class com.p2082ss.android.ugc.aweme.video.preload.VideoCachePreloader.C807929 */

                static {
                    Covode.recordClassIndex(94088);
                }
            };
            C87312c.f197907b = true;
            C87383u.f198089i = new AbstractC87352m() {
                /* class com.p2082ss.android.ugc.aweme.video.preload.VideoCachePreloader.C8078310 */

                static {
                    Covode.recordClassIndex(94079);
                }

                @Override // com.toutiao.proxyserver.AbstractC87352m
                /* renamed from: a */
                public final void mo124030a(int i, String str, String str2) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("video_cache_error_code", i);
                        if (str.length() > 1500) {
                            str = str.substring(0, 1500);
                        }
                        jSONObject.put("video_cache_msg", str);
                        jSONObject.put("video_cache_use_ttnet", C87383u.f198092l);
                        C35467b.m72528a(str2, i + jSONObject.toString());
                        C84231a.m144836b().monitorCommonLog("video_cache_error_report", jSONObject);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
            C87383u.f198090j = new AbstractC87351l() {
                /* class com.p2082ss.android.ugc.aweme.video.preload.VideoCachePreloader.C8078411 */

                static {
                    Covode.recordClassIndex(94080);
                }

                @Override // com.toutiao.proxyserver.AbstractC87351l
                /* renamed from: a */
                public final void mo124031a(int i, String str) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", i);
                        jSONObject.put("url", str);
                        C84231a.m144836b().monitorCommonLog("aweme_media_play_video_data_download", "aweme_media_play_video_data_download", jSONObject);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
            C87383u.f198088h = new AbstractC87353n() {
                /* class com.p2082ss.android.ugc.aweme.video.preload.VideoCachePreloader.C807852 */

                static {
                    Covode.recordClassIndex(94081);
                }

                @Override // com.toutiao.proxyserver.AbstractC87353n
                /* renamed from: a */
                public final void mo124032a(C87295a aVar) {
                    if (aVar.f197858a != null && aVar.f197861d >= 0 && aVar.f197860c > 0) {
                        VideoCachePreloader.this.f180670i.put(aVar.f197858a, aVar);
                    }
                }
            };
            C87383u.f198087g = new AbstractC87366o() {
                /* class com.p2082ss.android.ugc.aweme.video.preload.VideoCachePreloader.C807863 */

                static {
                    Covode.recordClassIndex(94082);
                }

                @Override // com.toutiao.proxyserver.AbstractC87366o
                /* renamed from: a */
                public final void mo124041a(boolean z, String str, int i, int i2, String str2) {
                    C84231a.m144834a().isDebug();
                    C84231a.f188310b.execute(new RunnableC80935q(this, z, str, i, i2, str2));
                }

                @Override // com.toutiao.proxyserver.AbstractC87366o
                /* renamed from: a */
                public final void mo124033a() {
                    C84231a.m144834a().isDebug();
                }

                @Override // com.toutiao.proxyserver.AbstractC87366o
                /* renamed from: b */
                public final void mo124042b() {
                    if (VideoCachePreloader.this.f180671j != null) {
                        VideoCachePreloader.this.f180671j.get();
                    }
                }

                @Override // com.toutiao.proxyserver.AbstractC87366o
                /* renamed from: a */
                public final void mo124035a(C87296b bVar) {
                    List<C84227x> list;
                    if (bVar.f197862a != null && bVar.f197865d >= 0 && bVar.f197864c > 0) {
                        if (VideoCachePreloader.this.f180674m == null || !TextUtils.equals(VideoCachePreloader.this.f180674m.f188292a, bVar.f197862a)) {
                            VideoCachePreloader videoCachePreloader = VideoCachePreloader.this;
                            String str = bVar.f197862a;
                            C84227x xVar = null;
                            if (!TextUtils.isEmpty(str) && (list = videoCachePreloader.f180669h.get(str)) != null && list.size() > 0) {
                                xVar = list.get(list.size() - 1);
                            }
                            videoCachePreloader.f180674m = xVar;
                        }
                        if (VideoCachePreloader.this.f180674m != null) {
                            C84227x xVar2 = VideoCachePreloader.this.f180674m;
                            C84201e eVar = new C84201e();
                            eVar.f188006c = bVar.f197864c;
                            eVar.f188004a = bVar.f197862a;
                            eVar.f188007d = bVar.f197865d;
                            eVar.f188005b = bVar.f197863b;
                            C89219l.m154719c(eVar, "");
                            if (xVar2.f188294c == null) {
                                xVar2.f188294c = new ArrayList<>();
                            }
                            ArrayList<C84201e> arrayList = xVar2.f188294c;
                            if (arrayList != null) {
                                arrayList.add(eVar);
                            }
                            List<C87296b> list2 = VideoCachePreloader.this.f180668g.get(bVar.f197862a);
                            if (list2 == null) {
                                list2 = new ArrayList<>();
                                VideoCachePreloader.this.f180668g.put(bVar.f197862a, list2);
                            }
                            list2.add(bVar);
                        }
                    }
                }

                /* JADX WARNING: Removed duplicated region for block: B:13:0x0093  */
                /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
                @Override // com.toutiao.proxyserver.AbstractC87366o
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void mo124036a(com.toutiao.proxyserver.p4490b.C87297c r6) {
                    /*
                    // Method dump skipped, instructions count: 200
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.video.preload.VideoCachePreloader.C807863.mo124036a(com.toutiao.proxyserver.b.c):void");
                }

                @Override // com.toutiao.proxyserver.AbstractC87366o
                /* renamed from: a */
                public final void mo124040a(JSONObject jSONObject) {
                    C84231a.m144834a().isDebug();
                    C84231a.f188310b.execute(new RunnableC80934p(this, jSONObject));
                }

                @Override // com.toutiao.proxyserver.AbstractC87366o
                /* renamed from: a */
                public final void mo124037a(C87348j jVar, int i, String str) {
                    AbstractC80873e eVar;
                    C84231a.m144834a().isDebug();
                    if (VideoCachePreloader.this.f180673l != null && (eVar = VideoCachePreloader.this.f180673l.get()) != null) {
                        eVar.mo97991a(jVar, i, str);
                    }
                }

                @Override // com.toutiao.proxyserver.AbstractC87366o
                /* renamed from: a */
                public final void mo124038a(String str, int i, int i2) {
                    C84231a.m144834a().isDebug();
                    for (WeakReference<AbstractC80914f> weakReference : VideoCachePreloader.this.f180672k) {
                        AbstractC80914f fVar = weakReference.get();
                        if (fVar != null) {
                            fVar.mo84697a(str, (long) i, (long) i2);
                        }
                    }
                }

                @Override // com.toutiao.proxyserver.AbstractC87366o
                /* renamed from: a */
                public final void mo124039a(String str, int i, String str2) {
                    AbstractC80873e eVar;
                    C84231a.m144834a().isDebug();
                    if (VideoCachePreloader.this.f180673l != null && (eVar = VideoCachePreloader.this.f180673l.get()) != null) {
                        eVar.mo97992a(str, i, str2);
                    }
                }

                @Override // com.toutiao.proxyserver.AbstractC87366o
                /* renamed from: a */
                public final void mo124034a(int i, long j, long j2) {
                    long j3 = j;
                    if (i <= 0) {
                        return;
                    }
                    if (j3 <= 0 || VideoCachePreloader.this.f180665d.getExperiment().VideoNetworkSpeedAlgorithmExperiment() != 2) {
                        if (VideoCachePreloader.this.f180665d.getExperiment().VideoDownloadSpeedCostTimeExperiment() != 1) {
                            j3 = j2;
                        }
                        if (j3 > 0) {
                            double d = (double) i;
                            Double.isNaN(d);
                            double d2 = (double) j3;
                            Double.isNaN(d2);
                            VideoCachePreloader.this.f180665d.getSpeedManager().mo124210a((8.0d * d) / (d2 / 1000.0d), d, j3);
                            Integer a = VideoCachePreloader.this.f180665d.getMLServiceSpeedModel().mo124199a();
                            if (a != null) {
                                if (VideoCachePreloader.this.f180663b == null) {
                                    VideoCachePreloader.this.f180663b = new C80799e(VideoCachePreloader.this.f180665d.getSpeedManager(), a.intValue());
                                }
                                VideoCachePreloader.this.f180663b.mo124233a();
                            }
                            C84231a.m144834a().isDebug();
                            return;
                        }
                        return;
                    }
                    VideoCachePreloader.this.f180665d.getSpeedManager().mo124212b();
                }
            };
            C87385v.m151666a().mo141435b();
            C87383u.m151661a(j, C84231a.f188309a);
            m140123h();
            m140124i();
            this.f180676q = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.video.preload.VideoCachePreloader$c */
    public static class C80797c {

        /* renamed from: a */
        private final HandlerThread f180708a;

        /* renamed from: b */
        private final Handler f180709b;

        /* renamed from: c */
        private final C80794b f180710c;

        static {
            Covode.recordClassIndex(94093);
        }

        /* renamed from: a */
        public final void mo124059a(C80794b.C80796a aVar) {
            this.f180709b.post(new RunnableC80798d(this.f180710c, aVar));
        }

        C80797c(C80794b bVar) {
            HandlerThread handlerThread = new HandlerThread("preload-schedule-thread");
            this.f180708a = handlerThread;
            handlerThread.start();
            this.f180709b = new Handler(handlerThread.getLooper());
            this.f180710c = bVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: c */
    public final int mo124018c(C84241i iVar) {
        if (iVar != null) {
            return (int) C87291ae.C87293b.f197857a.mo141325a(iVar.getBitRatedRatioUri());
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: g */
    public final List<C84224v> mo124026g(C84241i iVar) {
        return this.f180667f.get(iVar.getBitRatedRatioUri());
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: h */
    public final List<C84227x> mo124028h(C84241i iVar) {
        return this.f180669h.get(iVar.getBitRatedRatioUri());
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: b */
    public final boolean mo124017b(C84241i iVar) {
        if (iVar == null) {
            return false;
        }
        return mo124012a(iVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: d */
    public final void mo124021d(C84241i iVar) {
        if (mo124011a()) {
            C80794b bVar = this.f180675p;
            bVar.mo124053a(bVar.mo124051a(1, iVar, -1));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: f */
    public final C84224v mo124024f(C84241i iVar) {
        try {
            return this.f180666e.get(iVar.getBitRatedRatioUri());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: b */
    public final long mo124015b(String str) {
        C87299a a;
        C87301c cVar = C87371t.m151640a().f198045c;
        if (cVar == null || TextUtils.isEmpty(str) || (a = cVar.mo141334a(C87327a.m151540a(str), 0)) == null) {
            return 0;
        }
        return (long) a.f197882c;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: a */
    public final long mo124005a(String str) {
        File e;
        C87331h hVar = C87371t.m151640a().f198046d;
        if (!(hVar == null || TextUtils.isEmpty(str) || (e = hVar.mo141331e(C87327a.m151540a(str))) == null)) {
            long length = e.length();
            if (length > 0) {
                return length;
            }
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: e */
    public final C80923m mo124022e(C84241i iVar) {
        try {
            List<C87296b> list = this.f180668g.get(iVar.getBitRatedRatioUri());
            if (list == null || list.size() <= 0) {
                return null;
            }
            C80923m mVar = new C80923m();
            mVar.f180921c = list.size();
            for (C87296b bVar : list) {
                if (bVar != null) {
                    mVar.f180919a += bVar.f197865d;
                    mVar.f180920b += bVar.f197864c;
                }
            }
            return mVar;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: a */
    public final void mo124007a(AbstractC80914f fVar) {
        Iterator<WeakReference<AbstractC80914f>> it = this.f180672k.iterator();
        if (!it.hasNext() || it.next().get() != fVar) {
            this.f180672k.add(new WeakReference<>(fVar));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: a */
    public final boolean mo124012a(C84241i iVar) {
        if (iVar == null || C87291ae.C87293b.f197857a.mo141325a(iVar.getBitRatedRatioUri()) <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.video.preload.VideoCachePreloader$e */
    static class C80799e extends RunnableC80869a {
        static {
            Covode.recordClassIndex(94095);
        }

        C80799e(AbstractC80846e eVar, int i) {
            super(new RunnableC80936r(eVar), i);
        }
    }

    /* renamed from: a */
    public static JSONObject m140122a(String str, String str2, String str3) {
        JSONObject jSONObject;
        if (!C84231a.m144838d().isEnabled()) {
            return null;
        }
        jSONObject = new JSONObject();
        try {
            jSONObject.put("tag", str);
            jSONObject.put("msg", str2);
            jSONObject.put("vid", str3);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: a */
    public final /* synthetic */ Object mo124006a(C84241i iVar, String str, String[] strArr) {
        if (this.f180665d.getCacheHelper().mo124197a()) {
            String a = this.f180665d.getCacheHelper().mo124196a(iVar.getSourceId());
            if (this.f180665d.getCacheHelper().mo124198b(a)) {
                iVar.getSourceId();
                return a;
            }
        }
        return C87385v.m151666a().mo141432a(str, false, strArr);
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: a */
    public final void mo124009a(C84241i iVar, String str, boolean z, AbstractC80872d dVar) {
        if (dVar != null) {
            dVar.mo115013a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g
    /* renamed from: a */
    public final boolean mo124013a(C84241i iVar, int i, AbstractC80929n nVar, AbstractC80915g.C80916a aVar) {
        if (!mo124011a()) {
            return false;
        }
        this.f180675p.mo124054a(iVar, i);
        return true;
    }
}
