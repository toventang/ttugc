package com.p2082ss.android.ugc.aweme.simkit.impl.p3910a;

import android.app.Application;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a;
import com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper;
import com.p2082ss.android.ugc.aweme.simkit.AbstractC74608c;
import com.p2082ss.android.ugc.aweme.simkit.AbstractC74616d;
import com.p2082ss.android.ugc.aweme.simkit.ISimKitConfig;
import com.p2082ss.android.ugc.aweme.simkit.api.AbstractC74605d;
import com.p2082ss.android.ugc.aweme.simkit.api.ICommonConfig;
import com.p2082ss.android.ugc.aweme.simkit.model.p3913b.C74677b;
import com.p2082ss.android.ugc.playerkit.simapicommon.C84231a;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.simkit.impl.a.c */
public final class C74623c implements AbstractC74605d {

    /* renamed from: a */
    private final String f167763a = "SrStrategyV2";

    /* renamed from: b */
    private volatile long f167764b;

    /* renamed from: c */
    private volatile double f167765c = 0.2d;

    /* renamed from: d */
    private final LinkedList<Boolean> f167766d = new LinkedList<>();

    /* renamed from: e */
    private volatile float f167767e;

    /* renamed from: f */
    private final Object f167768f = new Object();

    /* renamed from: g */
    private volatile int f167769g;

    /* renamed from: h */
    private final AbstractC89244h f167770h = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C74626c.f167777a);

    /* renamed from: i */
    private final Queue<C74624a> f167771i = new ConcurrentLinkedQueue();

    /* renamed from: j */
    private final Map<String, Boolean> f167772j;

    static {
        Covode.recordClassIndex(87444);
    }

    /* renamed from: c */
    private final C74677b m131049c() {
        return (C74677b) this.f167770h.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.api.AbstractC74605d
    /* renamed from: b */
    public final void mo117330b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.simkit.impl.a.c$b */
    public static final class C74625b extends LinkedHashMap<String, Boolean> {
        static {
            Covode.recordClassIndex(87446);
        }

        C74625b() {
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<Map.Entry<String, Boolean>> entrySet() {
            return getEntries();
        }

        public final Set getEntries() {
            return super.entrySet();
        }

        public final Set getKeys() {
            return super.keySet();
        }

        public final int getSize() {
            return super.size();
        }

        public final Collection getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<String> keySet() {
            return getKeys();
        }

        public final int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Collection<Boolean> values() {
            return getValues();
        }

        public final /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        public final /* bridge */ boolean containsValue(Boolean bool) {
            return super.containsValue((Object) bool);
        }

        public final /* bridge */ Boolean get(String str) {
            return (Boolean) super.get((Object) str);
        }

        public final /* bridge */ Boolean remove(String str) {
            return (Boolean) super.remove((Object) str);
        }

        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return containsKey((String) obj);
        }

        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof Boolean)) {
                return false;
            }
            return containsValue((Boolean) obj);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Boolean get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Object remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Boolean> entry) {
            if (size() > 200) {
                return true;
            }
            return false;
        }

        public final /* bridge */ Boolean getOrDefault(String str, Boolean bool) {
            return (Boolean) super.getOrDefault((Object) str, (Object) bool);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.LinkedHashMap, java.util.Map, java.util.HashMap
        public final /* bridge */ Boolean getOrDefault(Object obj, Boolean bool) {
            if (!(obj instanceof String)) {
                return bool;
            }
            return getOrDefault((String) obj, bool);
        }

        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj != null && !(obj instanceof String)) {
                return false;
            }
            if (obj2 == null || (obj2 instanceof Boolean)) {
                return remove((String) obj, (Boolean) obj2);
            }
            return false;
        }

        public final /* bridge */ boolean remove(String str, Boolean bool) {
            return super.remove((Object) str, (Object) bool);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.simkit.impl.a.c$c */
    static final class C74626c extends AbstractC89220m implements AbstractC89171a<C74677b> {

        /* renamed from: a */
        public static final C74626c f167777a = new C74626c();

        static {
            Covode.recordClassIndex(87447);
        }

        C74626c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C74677b invoke() {
            ICommonConfig commonConfig;
            AbstractC74608c a = AbstractC74616d.m131036a();
            C89219l.m154709a((Object) a, "");
            ISimKitConfig b = a.mo117290b();
            if (b == null || (commonConfig = b.getCommonConfig()) == null) {
                return null;
            }
            return commonConfig.getSuperResolutionStrategyConfigV2();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.simkit.impl.a.c$a */
    static final class C74624a {

        /* renamed from: a */
        public final String f167773a;

        /* renamed from: b */
        public final boolean f167774b;

        /* renamed from: c */
        public final long f167775c;

        /* renamed from: d */
        public final int f167776d;

        static {
            Covode.recordClassIndex(87445);
        }

        public final String toString() {
            return "awemeId " + this.f167773a + " isSr " + this.f167774b + " duration " + this.f167775c + " srFailReason " + this.f167776d;
        }
    }

    public C74623c() {
        Map<String, Boolean> synchronizedMap = Collections.synchronizedMap(new C74625b());
        C89219l.m154709a((Object) synchronizedMap, "");
        this.f167772j = synchronizedMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.api.AbstractC74605d
    /* renamed from: a */
    public final void mo117329a() {
        if (m131049c() != null && System.currentTimeMillis() - this.f167764b >= 300000) {
            Intent b = m131048b(C84231a.f188309a, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (b != null) {
                double intExtra = (double) b.getIntExtra("level", -1);
                double intExtra2 = (double) b.getIntExtra("scale", -1);
                Double.isNaN(intExtra);
                Double.isNaN(intExtra2);
                Double valueOf = Double.valueOf(intExtra / intExtra2);
                if (valueOf != null) {
                    this.f167765c = valueOf.doubleValue();
                }
            }
            this.f167764b = System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    private static Intent m131047a(Application application, IntentFilter intentFilter) {
        try {
            return application.registerReceiver(null, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(null, intentFilter);
            }
            throw e;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private static Intent m131048b(Application application, IntentFilter intentFilter) {
        SecurityException securityException;
        C58039a.m104863a(C17879g.m33104a());
        try {
            return m131047a(application, intentFilter);
        } catch (Exception unused) {
            try {
                return ReceiverRegisterLancetHelper.registerReceiver(null, intentFilter);
            } catch (SecurityException e) {
                securityException = e;
                C13468b.m24211a(securityException, "Register Receiver Exception");
                return null;
            } catch (IllegalArgumentException e2) {
                String message = e2.getMessage();
                securityException = e2;
                if (message != null) {
                    boolean contains = e2.getMessage().contains("regist too many Broadcast Receivers");
                    securityException = e2;
                    if (contains) {
                        throw e2;
                    }
                }
                C13468b.m24211a(securityException, "Register Receiver Exception");
                return null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0196, code lost:
        if (r17 < (r0.longValue() * 1000)) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ee, code lost:
        if (r17 < (r0.longValue() * 1000)) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x010f, code lost:
        if (r17 > (r0.longValue() * 1000)) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0134, code lost:
        if (r17 < (r0.longValue() * 1000)) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0155, code lost:
        if (r17 > (r0.longValue() * 1000)) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0175, code lost:
        if (r17 < (r0.longValue() * 1000)) goto L_0x00f0;
     */
    @Override // com.p2082ss.android.ugc.aweme.simkit.api.AbstractC74605d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo117328a(java.lang.String r15, boolean r16, long r17, int r19, java.lang.String r20, float r21) {
        /*
        // Method dump skipped, instructions count: 641
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.simkit.impl.p3910a.C74623c.mo117328a(java.lang.String, boolean, long, int, java.lang.String, float):int");
    }
}
