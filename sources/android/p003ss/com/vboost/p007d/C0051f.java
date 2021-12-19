package android.p003ss.com.vboost.p007d;

import android.p003ss.com.vboost.C0026c;
import android.p003ss.com.vboost.CapabilityType;
import android.p003ss.com.vboost.VboostListener;
import android.p003ss.com.vboost.p008e.C0059a;
import android.util.SparseBooleanArray;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* renamed from: android.ss.com.vboost.d.f */
public class C0051f {

    /* renamed from: a */
    public static final String f190a = C0051f.class.getSimpleName();

    /* renamed from: i */
    public static boolean f191i = false;

    /* renamed from: j */
    public static volatile boolean f192j = true;

    /* renamed from: b */
    public Map<CapabilityType, TreeSet<C0048d>> f193b;

    /* renamed from: c */
    public final transient ReentrantLock f194c;

    /* renamed from: d */
    public final Condition f195d;

    /* renamed from: e */
    public Map<CapabilityType, C0048d> f196e;

    /* renamed from: f */
    public ScheduledExecutorService f197f;

    /* renamed from: g */
    ConcurrentHashMap<C0048d, C0026c> f198g;

    /* renamed from: h */
    public SparseBooleanArray f199h;

    /* renamed from: k */
    public WeakReference<VboostListener.AbstractC0003a> f200k;

    /* renamed from: l */
    public C0059a.AbstractC0060a f201l;

    /* renamed from: m */
    private ConcurrentHashMap<C0026c, C0048d> f202m;

    /* renamed from: android.ss.com.vboost.d.f$a */
    public static class C0054a {

        /* renamed from: a */
        public static final C0051f f206a = new C0051f((byte) 0);

        static {
            Covode.recordClassIndex(57);
        }
    }

    static {
        Covode.recordClassIndex(54);
    }

    private C0051f() {
        this.f193b = new HashMap();
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f194c = reentrantLock;
        this.f195d = reentrantLock.newCondition();
        this.f196e = new HashMap();
        this.f197f = null;
        this.f198g = new ConcurrentHashMap<>();
        this.f202m = new ConcurrentHashMap<>();
        this.f199h = new SparseBooleanArray();
        this.f201l = new C0059a.AbstractC0060a() {
            /* class android.p003ss.com.vboost.p007d.C0051f.C00521 */

            static {
                Covode.recordClassIndex(55);
            }

            @Override // android.p003ss.com.vboost.p008e.C0059a.AbstractC0060a
            /* renamed from: a */
            public final void mo43a(String str, JSONObject jSONObject) {
                if (C0051f.this.f200k != null && C0051f.this.f200k.get() != null) {
                    C0051f.this.f200k.get().mo3a(str, jSONObject);
                }
            }
        };
        this.f197f = new ScheduledThreadPoolExecutor(2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.ss.com.vboost.d.f$2 */
    public static /* synthetic */ class C00532 {

        /* renamed from: a */
        static final /* synthetic */ int[] f204a;

        /* renamed from: b */
        static final /* synthetic */ int[] f205b;

        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|(3:45|46|48)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(41:0|(2:1|2)|3|5|6|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|48) */
        /* JADX WARNING: Can't wrap try/catch for region: R(43:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|48) */
        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|48) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0053 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0067 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0072 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0088 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0094 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00a0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00ac */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00b8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00c4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00d0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00dc */
        static {
            /*
            // Method dump skipped, instructions count: 233
            */
            throw new UnsupportedOperationException("Method not decompiled: android.p003ss.com.vboost.p007d.C0051f.C00532.<clinit>():void");
        }
    }

    /* synthetic */ C0051f(byte b) {
        this();
    }

    /* renamed from: a */
    public final Object mo41a(C0026c cVar) {
        Object obj = null;
        if (!f192j || !f191i) {
            return null;
        }
        C0048d b = m89b(cVar);
        if (b != null) {
            obj = m87a(b);
            this.f198g.put(b, cVar);
            if (b.f177j) {
                this.f202m.put(cVar, b);
            }
        }
        return obj;
    }

    /* renamed from: a */
    private Object m87a(C0048d dVar) {
        Object obj;
        this.f194c.lock();
        try {
            if (dVar.f179l == EnumC0047c.ASYNC) {
                TreeSet<C0048d> treeSet = this.f193b.get(dVar.f168a);
                if (treeSet == null) {
                    treeSet = new TreeSet<>();
                    this.f193b.put(dVar.f168a, treeSet);
                }
                boolean add = treeSet.add(dVar);
                obj = dVar;
                if (add) {
                    boolean b = m90b(dVar);
                    obj = dVar;
                    if (b) {
                        m88a(dVar.f168a);
                        obj = dVar;
                    }
                }
            } else {
                this.f196e.put(dVar.f168a, dVar);
                obj = C0045a.m84a(dVar);
            }
            return obj;
        } finally {
            this.f194c.unlock();
        }
    }

    /* renamed from: b */
    private boolean m90b(C0048d dVar) {
        C0048d dVar2 = this.f196e.get(dVar.f168a);
        boolean z = true;
        if (!(this.f196e == null || dVar2 == null)) {
            if ((r1 = C00532.f205b[dVar.f181n.ordinal()]) != 1) {
            }
            z = false;
            if ((dVar.f178k == EnumC0055g.USE_OURS || dVar.f178k == EnumC0055g.USE_PROVIDERS) && dVar.mo38a() <= 50) {
                return false;
            }
        }
        return z;
    }

    /* renamed from: a */
    private void m88a(CapabilityType capabilityType) {
        C0048d pollFirst;
        while (true) {
            TreeSet<C0048d> treeSet = this.f193b.get(capabilityType);
            if (treeSet != null && !treeSet.isEmpty()) {
                pollFirst = treeSet.pollFirst();
                pollFirst.f183p = System.currentTimeMillis();
                if (pollFirst.f178k == EnumC0055g.USE_OURS && pollFirst.mo38a() > 50) {
                    CallableC0056h hVar = new CallableC0056h(pollFirst);
                    hVar.f208a = this.f197f.schedule(hVar, pollFirst.mo38a(), TimeUnit.MILLISECONDS);
                    pollFirst.f184q = hVar;
                    pollFirst.f170c = pollFirst.mo38a();
                }
                if (!m90b(pollFirst)) {
                    return;
                }
                if (pollFirst.f178k != EnumC0055g.USE_OURS || pollFirst.mo38a() > 50) {
                    this.f197f.submit(new CallableC0046b(pollFirst));
                    this.f196e.put(pollFirst.f168a, pollFirst);
                } else {
                    capabilityType = pollFirst.f168a;
                }
            } else {
                return;
            }
        }
        this.f197f.submit(new CallableC0046b(pollFirst));
        this.f196e.put(pollFirst.f168a, pollFirst);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009e, code lost:
        r10.f102g.getDesc();
        r5.f174g = r10.f102g;
        r5.f179l = android.p003ss.com.vboost.p007d.EnumC0047c.ASYNC;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ad, code lost:
        if (r10.f103h == false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00af, code lost:
        r5.f174g.getDesc();
        r5.f176i = true;
        r5.f177j = false;
        r5.f179l = android.p003ss.com.vboost.p007d.EnumC0047c.DIRECT;
        r5.f178k = android.p003ss.com.vboost.p007d.EnumC0055g.ONE_TIME;
        r0 = r5.f184q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c2, code lost:
        if (r0 == null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c4, code lost:
        r0.f208a.cancel(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d0, code lost:
        if (r10.f98c <= 0) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d2, code lost:
        r5.f176i = false;
        r5.f170c = r10.f98c;
        r5.f177j = false;
        r5.f178k = android.p003ss.com.vboost.p007d.EnumC0055g.USE_OURS;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00df, code lost:
        r5.f176i = false;
        r5.f177j = true;
        r5.f170c = 30000;
        r5.f178k = android.p003ss.com.vboost.p007d.EnumC0055g.USE_OURS;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.p003ss.com.vboost.p007d.C0048d m89b(android.p003ss.com.vboost.C0026c r10) {
        /*
        // Method dump skipped, instructions count: 614
        */
        throw new UnsupportedOperationException("Method not decompiled: android.p003ss.com.vboost.p007d.C0051f.m89b(android.ss.com.vboost.c):android.ss.com.vboost.d.d");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo42a(C0048d dVar, boolean z) {
        this.f194c.lock();
        if (z) {
            try {
                this.f202m.remove(dVar.f185r);
            } catch (Throwable th) {
                this.f194c.unlock();
                throw th;
            }
        }
        if (dVar.f184q == null || z) {
            this.f198g.remove(dVar);
            this.f196e.remove(dVar.f168a);
            TreeSet<C0048d> treeSet = this.f193b.get(dVar.f168a);
            if (treeSet != null && !treeSet.isEmpty()) {
                m88a(dVar.f168a);
            }
        }
        this.f194c.unlock();
    }
}
