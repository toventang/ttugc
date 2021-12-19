package com.p2082ss.android.common.applog;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.common.applog.p2129b.C29784d;
import com.p2082ss.android.deviceregister.p2134a.C29866a;
import com.p2082ss.android.deviceregister.p2134a.C29869d;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.i18n.language.C53438a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.lancet.I18nLancet;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.common.applog.o */
public class C29801o extends Thread {

    /* renamed from: a */
    public int f71092a = 1;

    /* renamed from: b */
    public volatile JSONObject f71093b = null;

    /* renamed from: c */
    private final SimpleDateFormat f71094c = new SimpleDateFormat("yyyy-MM-dd", Locale.US);

    /* renamed from: d */
    private final LinkedList<AbstractC29798l> f71095d;

    /* renamed from: e */
    private final Context f71096e;

    /* renamed from: f */
    private final JSONObject f71097f;

    /* renamed from: g */
    private final AtomicBoolean f71098g;

    /* renamed from: h */
    private final List<AppLog.AbstractC29762h> f71099h;

    /* renamed from: i */
    private long f71100i = 0;

    /* renamed from: j */
    private long f71101j = 0;

    /* renamed from: k */
    private C29802p f71102k;

    /* renamed from: l */
    private volatile long f71103l;

    /* renamed from: m */
    private long f71104m = 0;

    /* renamed from: n */
    private AtomicLong f71105n = new AtomicLong();

    /* renamed from: o */
    private volatile long f71106o = 120000;

    /* renamed from: p */
    private final ConcurrentHashMap<String, String> f71107p;

    /* renamed from: q */
    private final ConcurrentHashMap<String, String> f71108q;

    /* renamed from: r */
    private final C29788e f71109r;

    static {
        Covode.recordClassIndex(36206);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo52076a(JSONObject jSONObject) {
        MethodCollector.m26663i(11871);
        try {
            String[] strArr = C29785c.f71033a;
            for (String str : strArr) {
                this.f71097f.put(str, jSONObject.opt(str));
            }
            MethodCollector.m26664o(11871);
        } catch (Exception unused) {
            MethodCollector.m26664o(11871);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        if (r1 == 200) goto L_0x0038;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m60019a(java.lang.String r7, long r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f71096e
            com.ss.android.common.applog.d r5 = com.p2082ss.android.common.applog.C29786d.m59984a(r0)
            boolean r0 = m60023b()
            if (r0 == 0) goto L_0x003c
            r4 = 0
            java.lang.String[] r0 = com.p2082ss.android.common.applog.AppLog.APPLOG_URL()     // Catch:{ all -> 0x0039 }
            r3 = 200(0xc8, float:2.8E-43)
            if (r0 == 0) goto L_0x0039
            java.lang.String[] r0 = com.p2082ss.android.common.applog.AppLog.APPLOG_URL()     // Catch:{ all -> 0x0039 }
            int r0 = r0.length     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0039
            r2 = 0
            r1 = 0
        L_0x001e:
            java.lang.String[] r0 = com.p2082ss.android.common.applog.AppLog.APPLOG_URL()     // Catch:{ all -> 0x0039 }
            int r0 = r0.length     // Catch:{ all -> 0x0039 }
            if (r2 >= r0) goto L_0x0032
            java.lang.String[] r0 = com.p2082ss.android.common.applog.AppLog.APPLOG_URL()     // Catch:{ all -> 0x0039 }
            int r1 = m60013a(r6, r2, r0, r7)     // Catch:{ all -> 0x0039 }
            if (r1 == r3) goto L_0x0038
            int r2 = r2 + 1
            goto L_0x001e
        L_0x0032:
            r0 = -1
            if (r1 != r0) goto L_0x0036
            return
        L_0x0036:
            if (r1 != r3) goto L_0x0039
        L_0x0038:
            r4 = 1
        L_0x0039:
            r5.mo52061a(r8, r4, r7)
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.common.applog.C29801o.m60019a(java.lang.String, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0037, code lost:
        if (0 == 0) goto L_0x0043;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m60021a(com.p2082ss.android.common.applog.C29795i r18) {
        /*
        // Method dump skipped, instructions count: 261
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.common.applog.C29801o.m60021a(com.ss.android.common.applog.i):boolean");
    }

    /* renamed from: d */
    private void m60026d() {
        C29786d.m59984a(this.f71096e).mo52059a();
    }

    /* renamed from: a */
    private static boolean m60020a() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    private boolean m60025c() {
        try {
            if (!C13627m.m24498a(this.f71097f.optString("device_id", ""))) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static boolean m60023b() {
        if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132253e;
        }
        boolean a = m60020a();
        C58029j.f132253e = a;
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00c7  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m60027e() {
        /*
        // Method dump skipped, instructions count: 224
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.common.applog.C29801o.m60027e():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        if (r23.f71095d.isEmpty() != false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        r7 = r23.f71095d.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        if (r7 == null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        m60015a(r7);
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r0 = r23.f71105n.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        if (r0 >= 10000) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (r0 > 0) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        r6 = r23.f71102k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        if (r6 == null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        if (r6.f71118i != false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005e, code lost:
        r2 = r6.f71110a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0060, code lost:
        r4 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0066, code lost:
        if (r0 <= 0) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006a, code lost:
        if (r2 > 0) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001a, code lost:
        if (r7 == null) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006c, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0072, code lost:
        if (m60027e() == false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0078, code lost:
        if (com.p2082ss.android.common.applog.AppLog.getLogRecoverySwitch() == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007a, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007d, code lost:
        if (r9 <= 4) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007f, code lost:
        r23.f71100i = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0083, code lost:
        r3 = r23.f71095d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0085, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        r1 = r23.f71095d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008d, code lost:
        if ((r4 - r23.f71104m) <= r0) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0093, code lost:
        if (m60023b() == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0095, code lost:
        r23.f71104m = r4;
        m60018a(r6, null, true, 0, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a7, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00aa, code lost:
        r0 = 10000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b3, code lost:
        if (r23.f71095d.isEmpty() == false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001e, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b7, code lost:
        if (r0 <= 0) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r9 = java.lang.System.currentTimeMillis();
        r4 = r23.f71104m;
        r9 = r9 - r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c2, code lost:
        if (r4 != 0) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c7, code lost:
        if (r9 >= r0) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00cb, code lost:
        if (r9 >= 0) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00cf, code lost:
        if (r0 == 0) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d2, code lost:
        r0 = r0 - r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00d4, code lost:
        r23.f71095d.wait(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00da, code lost:
        r23.f71095d.wait();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00e9, code lost:
        r7 = r23.f71095d.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00f7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00f8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00fa, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(12022);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00fd, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        if (r23.f71098g.get() == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0102, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0104, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(12022);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0107, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        monitor-exit(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        // Method dump skipped, instructions count: 264
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.common.applog.C29801o.run():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo52075a(long j) {
        this.f71105n.set(j);
    }

    /* renamed from: b */
    private static String m60022b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optJSONObject("header") != null) {
                return jSONObject.toString();
            }
            return str;
        } catch (JSONException e) {
            e.printStackTrace();
            return str;
        }
    }

    /* renamed from: a */
    static List<String> m60014a(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            try {
                JSONArray optJSONArray = new JSONObject(str).optJSONArray("terminate");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        String optString = optJSONArray.getJSONObject(i).optString("session_id", "");
                        if (!TextUtils.isEmpty(optString)) {
                            arrayList.add(optString);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private static List<Long> m60024c(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONArray optJSONArray = jSONObject.optJSONArray("event_v3");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        arrayList.add(Long.valueOf(optJSONArray.getJSONObject(i).getLong("tea_event_index")));
                    }
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("event");
                if (optJSONArray2 != null) {
                    int length2 = optJSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        arrayList.add(Long.valueOf(optJSONArray2.getJSONObject(i2).getLong("tea_event_index")));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private synchronized void m60015a(AbstractC29798l lVar) {
        C29784d dVar;
        C29802p b;
        MethodCollector.m26663i(11873);
        if (lVar == null) {
            MethodCollector.m26664o(11873);
        } else if (lVar instanceof C29800n) {
            C29800n nVar = (C29800n) lVar;
            m60017a(nVar.f71088a, nVar.f71089b, nVar.f71090c, nVar.f71091d);
            m60016a(nVar.f71089b);
            this.f71104m = System.currentTimeMillis();
            MethodCollector.m26664o(11873);
        } else if (lVar instanceof C29797k) {
            long j = ((C29797k) lVar).f71086a;
            if (j <= 0 || (b = C29786d.m59984a(this.f71096e).mo52062b(j)) == null) {
                MethodCollector.m26664o(11873);
                return;
            }
            m60017a(b, (C29802p) null, false, 0L);
            C29797k kVar = new C29797k();
            kVar.f71086a = b.f71110a;
            synchronized (this.f71095d) {
                try {
                    this.f71095d.add(kVar);
                } finally {
                    MethodCollector.m26664o(11873);
                }
            }
        } else {
            if ((lVar instanceof C29799m) && (dVar = ((C29799m) lVar).f71087a) != null) {
                JSONObject jSONObject = new JSONObject();
                C29869d.m60194a(this.f71097f, jSONObject);
                Pair<Long, String> a = C29806r.m60039a(this.f71096e).mo52079a(dVar, jSONObject);
                if (a != null) {
                    long longValue = ((Long) a.first).longValue();
                    String str = (String) a.second;
                    if (longValue > 0) {
                        m60019a(str, longValue);
                    }
                }
            }
            MethodCollector.m26664o(11873);
        }
    }

    /* renamed from: a */
    private void m60016a(C29802p pVar) {
        this.f71102k = pVar;
        SharedPreferences a = C34822d.m71158a(this.f71096e, C29866a.f71244a, 0);
        this.f71103l = a.getLong("latest_forground_session_time", 0);
        if (pVar != null && !pVar.f71118i) {
            this.f71103l = pVar.f71112c;
            a.edit().putLong("latest_forground_session_time", this.f71103l).apply();
        }
    }

    /* renamed from: a */
    private void m60017a(C29802p pVar, C29802p pVar2, boolean z, long j) {
        m60018a(pVar, pVar2, z, j, true);
    }

    /* renamed from: a */
    private static int m60013a(C29801o oVar, int i, String[] strArr, String str) {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = jSONObject.getJSONObject("header");
        try {
            String language = C53438a.m98619a((String) null, (String) null, C17867d.m33078a()).getLanguage();
            if ("zh".equals(language)) {
                language = "zh-Hant";
            }
            I18nLancet.m104816a(jSONObject2, "app_language", language);
            I18nLancet.m104816a(jSONObject2, "region", SettingServiceImpl.m120782v().mo108878n());
            I18nLancet.m104816a(jSONObject2, "sys_region", SettingServiceImpl.m120782v().mo108876l());
            I18nLancet.m104816a(jSONObject2, "carrier_region", C58071d.m104914h());
            I18nLancet.m104816a(jSONObject2, "timezone_name", TimeZone.getDefault().getDisplayName());
            I18nLancet.m104816a(jSONObject2, "timezone_offset", String.valueOf(TimeZone.getDefault().getRawOffset() / 1000));
        } catch (Exception e) {
            e.printStackTrace();
        }
        jSONObject.put("header", jSONObject2);
        return oVar.m60012a(i, strArr, jSONObject.toString(), true);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:9|(4:15|16|(8:22|(1:30)(3:26|27|(1:29))|31|32|(2:34|(5:36|37|(3:41|(3:43|(2:45|80)(1:81)|46)|79)|47|(3:51|(3:53|(2:55|83)(1:84)|56)|82))(4:57|(1:59)|60|(1:62)))|63|(1:68)|(1:70))|71)|17|20|22|(1:24)|30|31|32|(0)|63|66|68|(1:71)(0)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00a3 */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a9 A[Catch:{ all -> 0x0121 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0132 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m60012a(int r12, java.lang.String[] r13, java.lang.String r14, boolean r15) {
        /*
        // Method dump skipped, instructions count: 327
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.common.applog.C29801o.m60012a(int, java.lang.String[], java.lang.String, boolean):int");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d8, code lost:
        if (r6 == 200) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00da, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00db, code lost:
        if (r26 == null) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e1, code lost:
        if (m60025c() == false) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e3, code lost:
        r26.f71119j = true;
        r14.mo52064c(r26.f71110a);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m60018a(com.p2082ss.android.common.applog.C29802p r25, com.p2082ss.android.common.applog.C29802p r26, boolean r27, long r28, boolean r30) {
        /*
        // Method dump skipped, instructions count: 501
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.common.applog.C29801o.m60018a(com.ss.android.common.applog.p, com.ss.android.common.applog.p, boolean, long, boolean):void");
    }

    C29801o(Context context, JSONObject jSONObject, LinkedList<AbstractC29798l> linkedList, AtomicBoolean atomicBoolean, List<AppLog.AbstractC29762h> list, C29802p pVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        super("LogReaper");
        this.f71096e = context;
        this.f71097f = jSONObject;
        this.f71095d = linkedList;
        this.f71098g = atomicBoolean;
        this.f71099h = list;
        m60016a(pVar);
        this.f71107p = concurrentHashMap;
        this.f71108q = concurrentHashMap2;
        this.f71109r = new C29788e(context);
        for (String str : AppLog.APPLOG_URL()) {
            this.f71109r.f71047b.mo52070a(str);
        }
    }
}
