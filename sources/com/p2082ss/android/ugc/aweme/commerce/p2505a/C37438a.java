package com.p2082ss.android.ugc.aweme.commerce.p2505a;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.p1777x.p1779b.C23683b;
import com.bytedance.p1777x.p1779b.C23686e;
import com.bytedance.p1777x.p1779b.C23687f;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.AbstractC23771b;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.C23766a;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.C23780k;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.p1801a.C23768b;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.p1801a.C23770d;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.p1801a.EnumC23767a;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.p1801a.EnumC23769c;
import com.p1795d.p1796a.p1797a.p1798a.p1804e.C23801d;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.commerce.AbstractC37498i;
import com.p2082ss.android.ugc.aweme.commerce.p2505a.C37476l;
import com.p2082ss.android.ugc.aweme.commerce.p2505a.p2506a.p2507a.AbstractC37444a;
import com.p2082ss.android.ugc.aweme.commerce.p2505a.p2506a.p2507a.C37447d;
import com.p2082ss.android.ugc.aweme.commerce.p2505a.p2506a.p2510d.C37457a;
import com.p2082ss.android.ugc.aweme.commerce.p2505a.p2506a.p2511e.C37459b;
import com.p2082ss.android.ugc.aweme.commerce.p2505a.p2512b.C37466a;
import com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37872ay;
import com.p2082ss.android.ugc.aweme.commercialize.feed.C37889c;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38164aj;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38222ai;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.p2562f.C37842a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38701br;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38703bs;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49493a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33208e;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.C33205b;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4621l.AbstractC89306h;
import p4600h.p4621l.C89297c;
import p4600h.p4621l.C89309k;

/* renamed from: com.ss.android.ugc.aweme.commerce.a.a */
public class C37438a implements AbstractC37498i {

    /* renamed from: a */
    public static final String f88362a = C37438a.class.getSimpleName();

    /* renamed from: l */
    private static volatile C37438a f88363l;

    /* renamed from: b */
    public Map<String, String> f88364b = Collections.synchronizedMap(new HashMap());

    /* renamed from: c */
    public boolean f88365c;

    /* renamed from: d */
    public boolean f88366d;

    /* renamed from: e */
    public boolean f88367e;

    /* renamed from: f */
    public int f88368f = 0;

    /* renamed from: g */
    public boolean f88369g = true;

    /* renamed from: h */
    public long f88370h = -1;

    /* renamed from: i */
    public Aweme f88371i = null;

    /* renamed from: j */
    public AbstractC37442a f88372j;

    /* renamed from: k */
    public Handler f88373k = new Handler(Looper.getMainLooper());

    /* renamed from: m */
    private Map<String, C23768b> f88374m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n */
    private Map<String, C37447d> f88375n = Collections.synchronizedMap(new HashMap());

    /* renamed from: o */
    private Map<String, AbstractC23771b> f88376o = Collections.synchronizedMap(new HashMap());

    /* renamed from: p */
    private Map<String, AbstractC37444a> f88377p = Collections.synchronizedMap(new HashMap());

    /* renamed from: q */
    private C37476l f88378q;

    /* renamed from: r */
    private Handler f88379r = new Handler(Looper.getMainLooper());

    /* renamed from: s */
    private boolean f88380s = false;

    /* renamed from: t */
    private boolean f88381t = false;

    /* renamed from: u */
    private boolean f88382u = false;

    /* renamed from: v */
    private boolean f88383v = false;

    /* renamed from: w */
    private WeakReference<View> f88384w = null;

    /* renamed from: x */
    private long f88385x = -1;

    /* renamed from: y */
    private Runnable f88386y = new Runnable() {
        /* class com.p2082ss.android.ugc.aweme.commerce.p2505a.C37438a.RunnableC374413 */

        static {
            Covode.recordClassIndex(44826);
        }

        public final void run() {
            long c = C37438a.this.mo65140c();
            long b = C37438a.this.mo65134b();
            if (b != 0 && C37438a.this.f88372j != null) {
                C37438a.this.mo65127a(c, b);
                C37438a.this.f88373k.postDelayed(this, 200);
            }
        }
    };

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commerce.a.a$a */
    public interface AbstractC37442a {
        static {
            Covode.recordClassIndex(44827);
        }

        /* renamed from: a */
        void mo65146a();

        /* renamed from: a */
        void mo65147a(long j, long j2, long j3);

        /* renamed from: b */
        void mo65148b();

        /* renamed from: c */
        void mo65149c();
    }

    /* renamed from: a */
    public final void mo65129a(View view, Aweme aweme) {
        this.f88384w = new WeakReference<>(view);
        this.f88371i = aweme;
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce.AbstractC37498i
    /* renamed from: a */
    public final void mo65133a(Aweme aweme, Context context, View view, String str) {
        this.f88381t = C37699a.m76251aW(aweme);
        this.f88380s = C37699a.m76277aw(aweme);
        if (aweme != null) {
            this.f88364b.put(C37474j.m75563d(aweme), str);
        }
        C37466a.f88448a = aweme;
        C37466a.m75553a("sessionStart");
        if (C49493a.m92732a() || SharePrefCache.inst().getEnableBindItemCallOMSDK().mo59941c().intValue() != 0) {
            mo65125a(context, aweme, view);
            mo65135b(context, aweme, view);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce.AbstractC37498i
    /* renamed from: a */
    public final void mo65131a(Aweme aweme, Context context, View view) {
        C37466a.m75553a("skipped");
        if (!this.f88382u) {
            C23768b a = mo65125a(context, aweme, view);
            if (a != null) {
                a.mo39232g();
                this.f88382u = true;
            }
            C37447d b = mo65135b(context, aweme, view);
            if (b != null) {
                b.mo65162a();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce.AbstractC37498i
    /* renamed from: a */
    public final void mo65132a(Aweme aweme, Context context, View view, int i) {
        C51423a.m95784a(3, null, "AdOM onPlayComplete ");
        if (i == 1) {
            C37466a.m75553a("complete");
            String d = C37474j.m75563d(aweme);
            C23768b bVar = this.f88374m.get(d);
            if (bVar != null) {
                bVar.mo39229d();
            }
            C37447d b = mo65135b(context, aweme, view);
            if (b != null) {
                C37457a.m75545a(b.f88405a);
                b.f88405a.mo65161e();
            }
            AbstractC23771b bVar2 = this.f88376o.get(d);
            this.f88383v = true;
            m75480a(d, aweme);
            AbstractC37444a aVar = this.f88377p.get(d);
            if (aVar != null) {
                aVar.mo65155b();
            }
            m75479a(d, bVar2);
            long b2 = mo65134b();
            mo65127a(b2, b2);
        }
        C38703bs.m78527a("complete", aweme, "play_over");
        this.f88368f++;
        this.f88365c = false;
        this.f88366d = false;
        this.f88367e = false;
    }

    /* renamed from: e */
    public final void mo65144e() {
        this.f88373k.removeCallbacks(this.f88386y);
    }

    static {
        Covode.recordClassIndex(44823);
    }

    /* renamed from: a */
    public final View mo65124a() {
        WeakReference<View> weakReference = this.f88384w;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: d */
    public static C37438a m75484d() {
        MethodCollector.m26663i(3907);
        if (f88363l == null) {
            synchronized (C37438a.class) {
                try {
                    if (f88363l == null) {
                        f88363l = new C37438a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3907);
                    throw th;
                }
            }
        }
        C37438a aVar = f88363l;
        MethodCollector.m26664o(3907);
        return aVar;
    }

    /* renamed from: b */
    public final long mo65134b() {
        AbstractC33208e a = C33205b.m68071a();
        AbstractC37872ay a2 = C37889c.C37890a.m76706a();
        if (this.f88381t && a != null) {
            return a.mo59103g();
        }
        if (!this.f88380s || a2 == null) {
            return C81079v.m140776O().mo123887j();
        }
        return a2.mo65912c();
    }

    /* renamed from: c */
    public final long mo65140c() {
        AbstractC33208e a = C33205b.m68071a();
        AbstractC37872ay a2 = C37889c.C37890a.m76706a();
        if (this.f88381t && a != null) {
            return a.mo59102f();
        }
        if (!this.f88380s || a2 == null) {
            return C81079v.m140776O().mo123891n();
        }
        return a2.mo65913d();
    }

    private C37438a() {
        C37476l lVar = new C37476l(C17867d.m33078a());
        this.f88378q = lVar;
        lVar.f88461c = new C37476l.C37477a(lVar);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
        intentFilter.addAction("android.media.STREAM_MUTE_CHANGED_ACTION");
        C37476l.m75567a(lVar.f88459a, lVar.f88461c, intentFilter);
        lVar.f88460b = true;
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce.AbstractC37498i
    /* renamed from: a */
    public final void mo65130a(Aweme aweme) {
        m75486f(aweme);
    }

    /* renamed from: b */
    private static Context m75481b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: c */
    public static void m75483c(Aweme aweme) {
        if (C38703bs.m78530b(aweme) && C38701br.m78512a(aweme, 3)) {
            C38703bs.m78527a("start", aweme, "play");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce.AbstractC37498i
    /* renamed from: b */
    public final void mo65136b(Aweme aweme) {
        if (C37699a.m76314s(aweme)) {
            m75486f(aweme);
        }
    }

    /* renamed from: d */
    public final void mo65142d(Aweme aweme) {
        this.f88381t = C37699a.m76251aW(aweme);
        this.f88380s = C37699a.m76277aw(aweme);
        C37466a.f88448a = aweme;
        this.f88373k.removeCallbacks(this.f88386y);
        this.f88373k.postDelayed(this.f88386y, 200);
    }

    /* renamed from: a */
    static float m75477a(Context context) {
        int i;
        AudioManager audioManager = (AudioManager) m75478a(m75481b(context), DataType.AUDIO);
        int i2 = -1;
        if (audioManager != null) {
            i = audioManager.getStreamVolume(3);
            i2 = audioManager.getStreamMaxVolume(3);
        } else {
            i = -1;
        }
        float f = 0.0f;
        if (i > 0 && i2 > 0) {
            f = ((float) i) / ((float) i2);
        }
        return ((float) ((int) (f * 1000.0f))) * 0.001f;
    }

    /* renamed from: e */
    private static List<C23780k> m75485e(Aweme aweme) {
        if (TextUtils.isEmpty(C37474j.m75558a(aweme)) || TextUtils.isEmpty(C37474j.m75560b(aweme))) {
            return Collections.emptyList();
        }
        try {
            URL url = new URL(C37474j.m75558a(aweme));
            String b = C37474j.m75560b(aweme);
            String c = C37474j.m75562c(aweme);
            if (TextUtils.isEmpty(c)) {
                c = "placementId=1&placementName=test";
            }
            if (c.contains("{TS}") || c.contains("__TS__")) {
                String valueOf = String.valueOf(System.currentTimeMillis());
                c = c.replace("{TS}", valueOf).replace("__TS__", valueOf);
            }
            return Collections.singletonList(C23780k.m44938a(b, url, c));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    /* renamed from: f */
    private void m75486f(Aweme aweme) {
        this.f88368f = 0;
        this.f88372j = null;
        this.f88378q.f88462d = null;
        C37466a.m75553a("sessionFinish");
        String d = C37474j.m75563d(aweme);
        AbstractC23771b bVar = this.f88376o.get(d);
        m75480a(d, aweme);
        AbstractC37444a aVar = this.f88377p.get(d);
        if (aVar != null) {
            aVar.mo65155b();
        }
        m75479a(C37474j.m75563d(aweme), bVar);
        this.f88373k.removeCallbacks(this.f88386y);
        this.f88365c = false;
        this.f88366d = false;
        this.f88367e = false;
        this.f88382u = false;
        this.f88383v = false;
    }

    /* renamed from: a */
    private static Object m75478a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(4948);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(4948);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: b */
    public final void mo65137b(Aweme aweme, Context context) {
        AwemeRawAd awemeRawAd;
        C38222ai omVast;
        C23687f fVar;
        Set<String> set;
        if (this.f88368f == 0 && C38703bs.m78530b(aweme)) {
            if (!(aweme == null || !aweme.isAd() || !C38701br.m78512a(aweme, 3) || (awemeRawAd = aweme.getAwemeRawAd()) == null || (omVast = awemeRawAd.getOmVast()) == null || (fVar = omVast.vast) == null || (set = fVar.viewableSet) == null)) {
                C38703bs.m78525a(C89070n.m154598r(set), "viewable", aweme);
            }
            C38189j.m77510b(context, "viewable", aweme, C38189j.m77468a(context, aweme, false, C38189j.m77463a(this.f88368f + 1)));
            C18129a.m33746a("draw_ad", "viewable", aweme.getAwemeRawAd()).mo28897a("play_order", Integer.valueOf(this.f88368f + 1)).mo28902c();
        }
    }

    /* renamed from: a */
    private void m75479a(String str, AbstractC23771b bVar) {
        this.f88376o.remove(str);
        this.f88374m.remove(str);
        this.f88377p.remove(str);
        this.f88375n.remove(str);
        this.f88364b.remove(str);
        this.f88379r.postDelayed(new RunnableC37465b(new AbstractC23771b[]{bVar}), InteractFirstFrameTimeOutDurationSetting.DEFAULT);
    }

    /* renamed from: a */
    private void m75480a(String str, Aweme aweme) {
        int a = C37842a.m76507a();
        AbstractC23771b bVar = this.f88376o.get(str);
        if (a > 0 && bVar != null) {
            if (!this.f88383v) {
                mo65131a(aweme, (Context) null, (View) null);
            }
            this.f88379r.postDelayed(new RunnableC37472h(bVar), (long) (a * 1000));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e1 A[Catch:{ all -> 0x0118 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p1795d.p1796a.p1797a.p1798a.p1800b.AbstractC23771b mo65126a(com.p2082ss.android.ugc.aweme.feed.model.Aweme r16, android.content.Context r17) {
        /*
        // Method dump skipped, instructions count: 364
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commerce.p2505a.C37438a.mo65126a(com.ss.android.ugc.aweme.feed.model.Aweme, android.content.Context):com.d.a.a.a.b.b");
    }

    /* renamed from: a */
    public final void mo65127a(long j, long j2) {
        long j3 = this.f88385x;
        if (j != j3 && j2 != 0) {
            AbstractC37442a aVar = this.f88372j;
            if (aVar != null) {
                float f = (float) j2;
                float f2 = ((float) j) / f;
                float f3 = ((float) j3) / f;
                if (f2 >= 0.25f && f3 < 0.25f && f3 > 0.0f) {
                    aVar.mo65146a();
                }
                if (f2 >= 0.5f && f3 < 0.5f && f3 > 0.0f) {
                    this.f88372j.mo65148b();
                }
                if (f2 >= 0.75f && f3 < 0.75f && f3 > 0.0f) {
                    this.f88372j.mo65149c();
                }
                this.f88372j.mo65147a(this.f88385x, j, j2);
            }
            this.f88385x = j;
        }
    }

    /* renamed from: a */
    public final C23768b mo65125a(Context context, Aweme aweme, View view) {
        String d = C37474j.m75563d(aweme);
        C23768b bVar = this.f88374m.get(d);
        if (bVar == null && (bVar = m75482c(aweme, context, view)) != null) {
            this.f88374m.put(d, bVar);
        }
        return bVar;
    }

    /* renamed from: c */
    private C23768b m75482c(Aweme aweme, Context context, View view) {
        AbstractC23771b a;
        if (!this.f88369g || (a = mo65126a(aweme, context)) == null || view == null) {
            return null;
        }
        C23768b a2 = C23768b.m44917a(a);
        a.mo39236a(view);
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            View findViewById = activity.getWindow().getDecorView().findViewById(16908290);
            int b = C13628n.m24521b(context);
            int a3 = C13628n.m24504a(context);
            List<View> a4 = C37474j.m75559a(findViewById, b, a3);
            a4.remove(view);
            for (View view2 : a4) {
                a.mo39238b(view2);
            }
            View findViewById2 = activity.findViewById(R.id.dnh);
            if (findViewById2 != null) {
                for (View view3 : C37474j.m75559a(findViewById2, b, a3)) {
                    a.mo39239c(view3);
                }
            }
        }
        a.mo39235a();
        C23766a a5 = C23766a.m44914a(a);
        a5.mo39222a(C23770d.m44927a(EnumC23769c.STANDALONE));
        a5.mo39221a();
        return a2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        if (r4 != null) goto L_0x0031;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p2082ss.android.ugc.aweme.commerce.p2505a.p2506a.p2507a.C37447d mo65135b(android.content.Context r8, com.p2082ss.android.ugc.aweme.feed.model.Aweme r9, android.view.View r10) {
        /*
        // Method dump skipped, instructions count: 207
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commerce.p2505a.C37438a.mo65135b(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, android.view.View):com.ss.android.ugc.aweme.commerce.a.a.a.d");
    }

    /* renamed from: b */
    public final void mo65138b(Aweme aweme, Context context, View view) {
        C23768b a;
        if (aweme != null && !this.f88383v && (a = mo65125a(context, aweme, view)) != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                a.mo39226a(EnumC23767a.CLICK);
            } else {
                this.f88379r.post(new RunnableC37468d(a));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce.AbstractC37498i
    /* renamed from: c */
    public final void mo65141c(Aweme aweme, Context context, View view, int i) {
        if (aweme != null) {
            if (i == 0) {
                C37466a.m75553a("bufferFinish");
                C23768b a = mo65125a(context, aweme, view);
                if (a != null) {
                    C23801d.m44994b(a.f56223a);
                    a.f56223a.f56260c.mo39269a("bufferFinish");
                }
                C37447d b = mo65135b(context, aweme, view);
                if (b != null) {
                    C37457a.m75545a(b.f88405a);
                    b.f88405a.f88401e = System.nanoTime();
                }
            }
            C38703bs.m78527a("bufferEnd", aweme, (String) null);
            C38189j.m77510b(context, "buffer_end", aweme, C38189j.m77468a(context, aweme, false, C38189j.m77463a(this.f88368f + 1)));
            C18129a.m33746a("draw_ad", "buffer_end", aweme.getAwemeRawAd()).mo28897a("play_order", Integer.valueOf(this.f88368f + 1)).mo28902c();
        }
    }

    /* renamed from: e */
    public final void mo65145e(Aweme aweme, Context context, View view, int i) {
        if (aweme != null) {
            C51423a.m95784a(3, null, "AdOM onPlayResume ");
            if (i == 0) {
                C37466a.m75553a("resume");
                C23768b a = mo65125a(context, aweme, view);
                if (a != null) {
                    a.mo39231f();
                }
                C37447d b = mo65135b(context, aweme, view);
                if (b != null) {
                    C37457a.m75545a(b.f88405a);
                    b.f88405a.f88401e = System.nanoTime();
                    C37459b.f88437a.mo65170a();
                }
            }
            C38703bs.m78527a("resume", aweme, (String) null);
            C38189j.m77510b(context, "resume", aweme, C38189j.m77468a(context, aweme, false, C38189j.m77463a(this.f88368f + 1)));
            C18129a.m33746a("draw_ad", "resume", aweme.getAwemeRawAd()).mo28897a("play_order", Integer.valueOf(this.f88368f + 1)).mo28902c();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c8  */
    @Override // com.p2082ss.android.ugc.aweme.commerce.AbstractC37498i
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo65143d(com.p2082ss.android.ugc.aweme.feed.model.Aweme r9, android.content.Context r10, android.view.View r11, int r12) {
        /*
        // Method dump skipped, instructions count: 275
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commerce.p2505a.C37438a.mo65143d(com.ss.android.ugc.aweme.feed.model.Aweme, android.content.Context, android.view.View, int):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce.AbstractC37498i
    /* renamed from: b */
    public final void mo65139b(Aweme aweme, Context context, View view, int i) {
        if (aweme != null) {
            if (i == 0) {
                C37466a.m75553a("bufferStart");
                C23768b a = mo65125a(context, aweme, view);
                if (a != null) {
                    C23801d.m44994b(a.f56223a);
                    a.f56223a.f56260c.mo39269a("bufferStart");
                }
                C37447d b = mo65135b(context, aweme, view);
                if (b != null) {
                    C37457a.m75545a(b.f88405a);
                    b.f88405a.mo65161e();
                }
            }
            C38703bs.m78527a("bufferStart", aweme, (String) null);
            C38189j.m77510b(context, "buffer_start", aweme, C38189j.m77468a(context, aweme, false, C38189j.m77463a(this.f88368f + 1)));
            C18129a.m33746a("draw_ad", "buffer_start", aweme.getAwemeRawAd()).mo28897a("play_order", Integer.valueOf(this.f88368f + 1)).mo28902c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce.AbstractC37498i
    /* renamed from: a */
    public final void mo65128a(final Context context, final Aweme aweme, final View view, boolean z) {
        aweme.getDesc();
        if (z) {
            this.f88372j = new AbstractC37442a() {
                /* class com.p2082ss.android.ugc.aweme.commerce.p2505a.C37438a.C374391 */

                static {
                    Covode.recordClassIndex(44824);
                }

                @Override // com.p2082ss.android.ugc.aweme.commerce.p2505a.C37438a.AbstractC37442a
                /* renamed from: a */
                public final void mo65146a() {
                    C23768b a;
                    if (!C37438a.this.f88365c) {
                        C37438a aVar = C37438a.this;
                        Aweme aweme = aweme;
                        Context context = context;
                        View view = view;
                        if (aVar.f88368f == 0 && (a = aVar.mo65125a(context, aweme, view)) != null) {
                            a.mo39224a();
                        }
                        C38703bs.m78527a("firstQuartile", aweme, "play_25");
                        if (!(aweme == null || aweme.getAwemeRawAd() == null)) {
                            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                            C38164aj.m77370a("play_25", aweme.getRawAdPlayNodeTrackUrlList(25), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new C37469e(aweme));
                            C38189j.m77510b(context, "first_quartile", aweme, C38189j.m77468a(context, aweme, false, C38189j.m77463a(aVar.f88368f + 1)));
                            C18129a.m33746a("draw_ad", "first_quartile", awemeRawAd).mo28897a("play_order", Integer.valueOf(aVar.f88368f + 1)).mo28902c();
                        }
                    }
                    C37438a.this.f88365c = true;
                }

                @Override // com.p2082ss.android.ugc.aweme.commerce.p2505a.C37438a.AbstractC37442a
                /* renamed from: b */
                public final void mo65148b() {
                    C23768b a;
                    if (!C37438a.this.f88366d) {
                        C37438a aVar = C37438a.this;
                        Aweme aweme = aweme;
                        Context context = context;
                        View view = view;
                        C51423a.m95784a(3, null, "trackSecondQuartile");
                        if (aVar.f88368f == 0 && (a = aVar.mo65125a(context, aweme, view)) != null) {
                            a.mo39227b();
                        }
                        C38703bs.m78527a("midpoint", aweme, "play_50");
                        if (!(aweme == null || aweme.getAwemeRawAd() == null)) {
                            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                            C38164aj.m77370a("play_50", aweme.getRawAdPlayNodeTrackUrlList(50), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new C37470f(aweme));
                            C38189j.m77510b(context, "midpoint", aweme, C38189j.m77468a(context, aweme, false, C38189j.m77463a(aVar.f88368f + 1)));
                            C18129a.m33746a("draw_ad", "midpoint", awemeRawAd).mo28897a("play_order", Integer.valueOf(aVar.f88368f + 1)).mo28902c();
                        }
                    }
                    C37438a.this.f88366d = true;
                }

                @Override // com.p2082ss.android.ugc.aweme.commerce.p2505a.C37438a.AbstractC37442a
                /* renamed from: c */
                public final void mo65149c() {
                    C23768b a;
                    if (!C37438a.this.f88367e) {
                        C37438a aVar = C37438a.this;
                        Aweme aweme = aweme;
                        Context context = context;
                        View view = view;
                        if (aVar.f88368f == 0 && (a = aVar.mo65125a(context, aweme, view)) != null) {
                            a.mo39228c();
                        }
                        C38703bs.m78527a("thirdQuartile", aweme, "play_75");
                        if (!(aweme == null || aweme.getAwemeRawAd() == null)) {
                            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                            C38164aj.m77370a("play_75", aweme.getRawAdPlayNodeTrackUrlList(75), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new C37471g(aweme));
                            C38189j.m77510b(context, "third_quartile", aweme, C38189j.m77468a(context, aweme, false, C38189j.m77463a(aVar.f88368f + 1)));
                            C18129a.m33746a("draw_ad", "third_quartile", awemeRawAd).mo28897a("play_order", Integer.valueOf(aVar.f88368f + 1)).mo28902c();
                        }
                    }
                    C37438a.this.f88367e = true;
                }

                @Override // com.p2082ss.android.ugc.aweme.commerce.p2505a.C37438a.AbstractC37442a
                /* renamed from: a */
                public final void mo65147a(long j, long j2, long j3) {
                    long j4;
                    AbstractC89306h hVar;
                    AwemeRawAd awemeRawAd;
                    C38222ai omVast;
                    C23687f fVar;
                    List<C23683b> list;
                    Aweme aweme = aweme;
                    if (C38701br.m78512a(aweme, 3) && j != j2) {
                        if (j < j2) {
                            j4 = j;
                        } else {
                            j4 = -1;
                        }
                        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (omVast = awemeRawAd.getOmVast()) == null || (fVar = omVast.vast) == null || (list = fVar.creativeList) == null) {
                            hVar = C89297c.f202938a;
                        } else {
                            hVar = C89309k.m154807d(C89070n.m154598r(list), new C38703bs.C38732z());
                        }
                        Iterator a = C89309k.m154799a(hVar, (AbstractC89172b) new C38703bs.C38705aa(j3, j2, j4)).mo2926a();
                        while (a.hasNext()) {
                            C23686e eVar = (C23686e) a.next();
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            String str = eVar.offset;
                            C89219l.m154716b(str, "");
                            C38703bs.m78525a(C89309k.m154796a(eVar.url), "cpv_" + timeUnit.toSeconds(C38703bs.m78516a(j3, str)) + 's', aweme);
                        }
                    }
                    if (C37438a.this.f88368f == 0 && j < InteractFirstFrameTimeOutDurationSetting.DEFAULT && j2 >= InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
                        C37438a.this.mo65137b(aweme, context);
                    }
                }
            };
            this.f88378q.f88462d = new C37476l.AbstractC37478b() {
                /* class com.p2082ss.android.ugc.aweme.commerce.p2505a.C37438a.C374402 */

                static {
                    Covode.recordClassIndex(44825);
                }

                @Override // com.p2082ss.android.ugc.aweme.commerce.p2505a.C37476l.AbstractC37478b
                /* renamed from: a */
                public final void mo65150a() {
                    C37438a aVar = C37438a.this;
                    Aweme aweme = aweme;
                    Context context = context;
                    if (aweme != null) {
                        C38703bs.m78527a("unmute", aweme, (String) null);
                        C38189j.m77522d(context, aweme, aVar.f88368f + 1);
                        C18129a.m33746a("draw_ad", "unmute", aweme.getAwemeRawAd()).mo28897a("play_order", Integer.valueOf(aVar.f88368f + 1)).mo28897a("playervol", Float.valueOf(C37438a.m75477a(context))).mo28902c();
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.commerce.p2505a.C37476l.AbstractC37478b
                /* renamed from: b */
                public final void mo65151b() {
                    C37438a aVar = C37438a.this;
                    Aweme aweme = aweme;
                    Context context = context;
                    if (aweme != null) {
                        C51423a.m95784a(3, null, "AdOM playerMute ");
                        C38703bs.m78527a("mute", aweme, (String) null);
                        C38189j.m77517c(context, aweme, aVar.f88368f + 1);
                        C18129a.m33746a("draw_ad", "mute", aweme.getAwemeRawAd()).mo28897a("play_order", Integer.valueOf(aVar.f88368f + 1)).mo28897a("playervol", Float.valueOf(0.0f)).mo28902c();
                    }
                }
            };
            return;
        }
        m75486f(aweme);
    }
}
