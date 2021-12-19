package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.C0552c;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.widget.b */
public class C0550b {

    /* renamed from: a */
    static final int[] f2299a = {0, 4, 8};

    /* renamed from: c */
    static SparseIntArray f2300c;

    /* renamed from: b */
    HashMap<Integer, C0551a> f2301b = new HashMap<>();

    /* renamed from: e */
    private static String m2093e(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return "baseline";
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return "start";
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                return "end";
            default:
                return "undefined";
        }
    }

    /* renamed from: a */
    public final void mo2451a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f2301b.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.C0547a aVar = (ConstraintLayout.C0547a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                if (!this.f2301b.containsKey(Integer.valueOf(id))) {
                    this.f2301b.put(Integer.valueOf(id), new C0551a((byte) 0));
                }
                C0551a aVar2 = this.f2301b.get(Integer.valueOf(id));
                aVar2.mo2458a(id, aVar);
                aVar2.f2311J = childAt.getVisibility();
                int i2 = Build.VERSION.SDK_INT;
                aVar2.f2322U = childAt.getAlpha();
                aVar2.f2325X = childAt.getRotation();
                aVar2.f2326Y = childAt.getRotationX();
                aVar2.f2327Z = childAt.getRotationY();
                aVar2.f2329aa = childAt.getScaleX();
                aVar2.f2330ab = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                    aVar2.f2331ac = pivotX;
                    aVar2.f2332ad = pivotY;
                }
                aVar2.f2333ae = childAt.getTranslationX();
                aVar2.f2334af = childAt.getTranslationY();
                if (Build.VERSION.SDK_INT >= 21) {
                    aVar2.f2335ag = childAt.getTranslationZ();
                    if (aVar2.f2323V) {
                        aVar2.f2324W = childAt.getElevation();
                    }
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar2.f2346ar = barrier.f2201a.f1947b;
                    aVar2.f2349au = barrier.getReferencedIds();
                    aVar2.f2347as = barrier.getType();
                }
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: a */
    public final void mo2450a(int i, String str) {
        mo2457d(i).f2372w = str;
    }

    /* renamed from: a */
    public final void mo2443a() {
        mo2457d(R.id.d6d).f2352c = -2;
    }

    /* renamed from: androidx.constraintlayout.widget.b$a */
    public static class C0551a {

        /* renamed from: A */
        public int f2302A;

        /* renamed from: B */
        public int f2303B;

        /* renamed from: C */
        public int f2304C;

        /* renamed from: D */
        public int f2305D;

        /* renamed from: E */
        public int f2306E;

        /* renamed from: F */
        public int f2307F;

        /* renamed from: G */
        public int f2308G;

        /* renamed from: H */
        public int f2309H;

        /* renamed from: I */
        public int f2310I;

        /* renamed from: J */
        public int f2311J;

        /* renamed from: K */
        public int f2312K;

        /* renamed from: L */
        public int f2313L;

        /* renamed from: M */
        public int f2314M;

        /* renamed from: N */
        public int f2315N;

        /* renamed from: O */
        public int f2316O;

        /* renamed from: P */
        public int f2317P;

        /* renamed from: Q */
        public float f2318Q;

        /* renamed from: R */
        public float f2319R;

        /* renamed from: S */
        public int f2320S;

        /* renamed from: T */
        public int f2321T;

        /* renamed from: U */
        public float f2322U;

        /* renamed from: V */
        public boolean f2323V;

        /* renamed from: W */
        public float f2324W;

        /* renamed from: X */
        public float f2325X;

        /* renamed from: Y */
        public float f2326Y;

        /* renamed from: Z */
        public float f2327Z;

        /* renamed from: a */
        boolean f2328a;

        /* renamed from: aa */
        public float f2329aa;

        /* renamed from: ab */
        public float f2330ab;

        /* renamed from: ac */
        public float f2331ac;

        /* renamed from: ad */
        public float f2332ad;

        /* renamed from: ae */
        public float f2333ae;

        /* renamed from: af */
        public float f2334af;

        /* renamed from: ag */
        public float f2335ag;

        /* renamed from: ah */
        public boolean f2336ah;

        /* renamed from: ai */
        public boolean f2337ai;

        /* renamed from: aj */
        public int f2338aj;

        /* renamed from: ak */
        public int f2339ak;

        /* renamed from: al */
        public int f2340al;

        /* renamed from: am */
        public int f2341am;

        /* renamed from: an */
        public int f2342an;

        /* renamed from: ao */
        public int f2343ao;

        /* renamed from: ap */
        public float f2344ap;

        /* renamed from: aq */
        public float f2345aq;

        /* renamed from: ar */
        public boolean f2346ar;

        /* renamed from: as */
        public int f2347as;

        /* renamed from: at */
        public int f2348at;

        /* renamed from: au */
        public int[] f2349au;

        /* renamed from: av */
        public String f2350av;

        /* renamed from: b */
        public int f2351b;

        /* renamed from: c */
        public int f2352c;

        /* renamed from: d */
        int f2353d;

        /* renamed from: e */
        public int f2354e;

        /* renamed from: f */
        public int f2355f;

        /* renamed from: g */
        public float f2356g;

        /* renamed from: h */
        public int f2357h;

        /* renamed from: i */
        public int f2358i;

        /* renamed from: j */
        public int f2359j;

        /* renamed from: k */
        public int f2360k;

        /* renamed from: l */
        public int f2361l;

        /* renamed from: m */
        public int f2362m;

        /* renamed from: n */
        public int f2363n;

        /* renamed from: o */
        public int f2364o;

        /* renamed from: p */
        public int f2365p;

        /* renamed from: q */
        public int f2366q;

        /* renamed from: r */
        public int f2367r;

        /* renamed from: s */
        public int f2368s;

        /* renamed from: t */
        public int f2369t;

        /* renamed from: u */
        public float f2370u;

        /* renamed from: v */
        public float f2371v;

        /* renamed from: w */
        public String f2372w;

        /* renamed from: x */
        public int f2373x;

        /* renamed from: y */
        public int f2374y;

        /* renamed from: z */
        public float f2375z;

        static {
            Covode.recordClassIndex(624);
        }

        private C0551a() {
            this.f2354e = -1;
            this.f2355f = -1;
            this.f2356g = -1.0f;
            this.f2357h = -1;
            this.f2358i = -1;
            this.f2359j = -1;
            this.f2360k = -1;
            this.f2361l = -1;
            this.f2362m = -1;
            this.f2363n = -1;
            this.f2364o = -1;
            this.f2365p = -1;
            this.f2366q = -1;
            this.f2367r = -1;
            this.f2368s = -1;
            this.f2369t = -1;
            this.f2370u = 0.5f;
            this.f2371v = 0.5f;
            this.f2373x = -1;
            this.f2302A = -1;
            this.f2303B = -1;
            this.f2304C = -1;
            this.f2305D = -1;
            this.f2306E = -1;
            this.f2307F = -1;
            this.f2308G = -1;
            this.f2309H = -1;
            this.f2310I = -1;
            this.f2312K = -1;
            this.f2313L = -1;
            this.f2314M = -1;
            this.f2315N = -1;
            this.f2316O = -1;
            this.f2317P = -1;
            this.f2322U = 1.0f;
            this.f2329aa = 1.0f;
            this.f2330ab = 1.0f;
            this.f2331ac = Float.NaN;
            this.f2332ad = Float.NaN;
            this.f2340al = -1;
            this.f2341am = -1;
            this.f2342an = -1;
            this.f2343ao = -1;
            this.f2344ap = 1.0f;
            this.f2345aq = 1.0f;
            this.f2347as = -1;
            this.f2348at = -1;
        }

        public final /* synthetic */ Object clone() {
            C0551a aVar = new C0551a();
            aVar.f2328a = this.f2328a;
            aVar.f2351b = this.f2351b;
            aVar.f2352c = this.f2352c;
            aVar.f2354e = this.f2354e;
            aVar.f2355f = this.f2355f;
            aVar.f2356g = this.f2356g;
            aVar.f2357h = this.f2357h;
            aVar.f2358i = this.f2358i;
            aVar.f2359j = this.f2359j;
            aVar.f2360k = this.f2360k;
            aVar.f2361l = this.f2361l;
            aVar.f2362m = this.f2362m;
            aVar.f2363n = this.f2363n;
            aVar.f2364o = this.f2364o;
            aVar.f2365p = this.f2365p;
            aVar.f2366q = this.f2366q;
            aVar.f2367r = this.f2367r;
            aVar.f2368s = this.f2368s;
            aVar.f2369t = this.f2369t;
            aVar.f2370u = this.f2370u;
            aVar.f2371v = this.f2371v;
            aVar.f2372w = this.f2372w;
            aVar.f2302A = this.f2302A;
            aVar.f2303B = this.f2303B;
            aVar.f2370u = this.f2370u;
            aVar.f2370u = this.f2370u;
            aVar.f2370u = this.f2370u;
            aVar.f2370u = this.f2370u;
            aVar.f2370u = this.f2370u;
            aVar.f2304C = this.f2304C;
            aVar.f2305D = this.f2305D;
            aVar.f2306E = this.f2306E;
            aVar.f2307F = this.f2307F;
            aVar.f2308G = this.f2308G;
            aVar.f2309H = this.f2309H;
            aVar.f2310I = this.f2310I;
            aVar.f2311J = this.f2311J;
            aVar.f2312K = this.f2312K;
            aVar.f2313L = this.f2313L;
            aVar.f2314M = this.f2314M;
            aVar.f2315N = this.f2315N;
            aVar.f2316O = this.f2316O;
            aVar.f2317P = this.f2317P;
            aVar.f2318Q = this.f2318Q;
            aVar.f2319R = this.f2319R;
            aVar.f2320S = this.f2320S;
            aVar.f2321T = this.f2321T;
            aVar.f2322U = this.f2322U;
            aVar.f2323V = this.f2323V;
            aVar.f2324W = this.f2324W;
            aVar.f2325X = this.f2325X;
            aVar.f2326Y = this.f2326Y;
            aVar.f2327Z = this.f2327Z;
            aVar.f2329aa = this.f2329aa;
            aVar.f2330ab = this.f2330ab;
            aVar.f2331ac = this.f2331ac;
            aVar.f2332ad = this.f2332ad;
            aVar.f2333ae = this.f2333ae;
            aVar.f2334af = this.f2334af;
            aVar.f2335ag = this.f2335ag;
            aVar.f2336ah = this.f2336ah;
            aVar.f2337ai = this.f2337ai;
            aVar.f2338aj = this.f2338aj;
            aVar.f2339ak = this.f2339ak;
            aVar.f2340al = this.f2340al;
            aVar.f2341am = this.f2341am;
            aVar.f2342an = this.f2342an;
            aVar.f2343ao = this.f2343ao;
            aVar.f2344ap = this.f2344ap;
            aVar.f2345aq = this.f2345aq;
            aVar.f2347as = this.f2347as;
            aVar.f2348at = this.f2348at;
            int[] iArr = this.f2349au;
            if (iArr != null) {
                aVar.f2349au = Arrays.copyOf(iArr, iArr.length);
            }
            aVar.f2373x = this.f2373x;
            aVar.f2374y = this.f2374y;
            aVar.f2375z = this.f2375z;
            aVar.f2346ar = this.f2346ar;
            return aVar;
        }

        /* synthetic */ C0551a(byte b) {
            this();
        }

        /* renamed from: a */
        public final void mo2460a(ConstraintLayout.C0547a aVar) {
            aVar.f2266d = this.f2357h;
            aVar.f2267e = this.f2358i;
            aVar.f2268f = this.f2359j;
            aVar.f2269g = this.f2360k;
            aVar.f2270h = this.f2361l;
            aVar.f2271i = this.f2362m;
            aVar.f2272j = this.f2363n;
            aVar.f2273k = this.f2364o;
            aVar.f2274l = this.f2365p;
            aVar.f2278p = this.f2366q;
            aVar.f2279q = this.f2367r;
            aVar.f2280r = this.f2368s;
            aVar.f2281s = this.f2369t;
            aVar.leftMargin = this.f2305D;
            aVar.rightMargin = this.f2306E;
            aVar.topMargin = this.f2307F;
            aVar.bottomMargin = this.f2308G;
            aVar.f2286x = this.f2317P;
            aVar.f2287y = this.f2316O;
            aVar.f2288z = this.f2370u;
            aVar.f2224A = this.f2371v;
            aVar.f2275m = this.f2373x;
            aVar.f2276n = this.f2374y;
            aVar.f2277o = this.f2375z;
            aVar.f2225B = this.f2372w;
            aVar.f2240Q = this.f2302A;
            aVar.f2241R = this.f2303B;
            aVar.f2229F = this.f2318Q;
            aVar.f2228E = this.f2319R;
            aVar.f2231H = this.f2321T;
            aVar.f2230G = this.f2320S;
            aVar.f2243T = this.f2336ah;
            aVar.f2244U = this.f2337ai;
            aVar.f2232I = this.f2338aj;
            aVar.f2233J = this.f2339ak;
            aVar.f2236M = this.f2340al;
            aVar.f2237N = this.f2341am;
            aVar.f2234K = this.f2342an;
            aVar.f2235L = this.f2343ao;
            aVar.f2238O = this.f2344ap;
            aVar.f2239P = this.f2345aq;
            aVar.f2242S = this.f2304C;
            aVar.f2265c = this.f2356g;
            aVar.f2250a = this.f2354e;
            aVar.f2264b = this.f2355f;
            aVar.width = this.f2351b;
            aVar.height = this.f2352c;
            int i = Build.VERSION.SDK_INT;
            aVar.setMarginStart(this.f2310I);
            aVar.setMarginEnd(this.f2309H);
            aVar.mo2422a();
        }

        /* renamed from: a */
        public final void mo2459a(int i, C0552c.C0553a aVar) {
            mo2458a(i, (ConstraintLayout.C0547a) aVar);
            this.f2322U = aVar.f2377an;
            this.f2325X = aVar.f2380aq;
            this.f2326Y = aVar.f2381ar;
            this.f2327Z = aVar.f2382as;
            this.f2329aa = aVar.f2383at;
            this.f2330ab = aVar.f2384au;
            this.f2331ac = aVar.f2385av;
            this.f2332ad = aVar.f2386aw;
            this.f2333ae = aVar.f2387ax;
            this.f2334af = aVar.f2388ay;
            this.f2335ag = aVar.f2389az;
            this.f2324W = aVar.f2379ap;
            this.f2323V = aVar.f2378ao;
        }

        /* renamed from: a */
        public final void mo2458a(int i, ConstraintLayout.C0547a aVar) {
            this.f2353d = i;
            this.f2357h = aVar.f2266d;
            this.f2358i = aVar.f2267e;
            this.f2359j = aVar.f2268f;
            this.f2360k = aVar.f2269g;
            this.f2361l = aVar.f2270h;
            this.f2362m = aVar.f2271i;
            this.f2363n = aVar.f2272j;
            this.f2364o = aVar.f2273k;
            this.f2365p = aVar.f2274l;
            this.f2366q = aVar.f2278p;
            this.f2367r = aVar.f2279q;
            this.f2368s = aVar.f2280r;
            this.f2369t = aVar.f2281s;
            this.f2370u = aVar.f2288z;
            this.f2371v = aVar.f2224A;
            this.f2372w = aVar.f2225B;
            this.f2373x = aVar.f2275m;
            this.f2374y = aVar.f2276n;
            this.f2375z = aVar.f2277o;
            this.f2302A = aVar.f2240Q;
            this.f2303B = aVar.f2241R;
            this.f2304C = aVar.f2242S;
            this.f2356g = aVar.f2265c;
            this.f2354e = aVar.f2250a;
            this.f2355f = aVar.f2264b;
            this.f2351b = aVar.width;
            this.f2352c = aVar.height;
            this.f2305D = aVar.leftMargin;
            this.f2306E = aVar.rightMargin;
            this.f2307F = aVar.topMargin;
            this.f2308G = aVar.bottomMargin;
            this.f2318Q = aVar.f2229F;
            this.f2319R = aVar.f2228E;
            this.f2321T = aVar.f2231H;
            this.f2320S = aVar.f2230G;
            this.f2336ah = aVar.f2243T;
            this.f2337ai = aVar.f2244U;
            this.f2338aj = aVar.f2232I;
            this.f2339ak = aVar.f2233J;
            this.f2336ah = aVar.f2243T;
            this.f2340al = aVar.f2236M;
            this.f2341am = aVar.f2237N;
            this.f2342an = aVar.f2234K;
            this.f2343ao = aVar.f2235L;
            this.f2344ap = aVar.f2238O;
            this.f2345aq = aVar.f2239P;
            int i2 = Build.VERSION.SDK_INT;
            this.f2309H = aVar.getMarginEnd();
            this.f2310I = aVar.getMarginStart();
        }
    }

    static {
        Covode.recordClassIndex(623);
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2300c = sparseIntArray;
        sparseIntArray.append(55, 25);
        f2300c.append(56, 26);
        f2300c.append(58, 29);
        f2300c.append(59, 30);
        f2300c.append(64, 36);
        f2300c.append(63, 35);
        f2300c.append(37, 4);
        f2300c.append(36, 3);
        f2300c.append(34, 1);
        f2300c.append(72, 6);
        f2300c.append(73, 7);
        f2300c.append(44, 17);
        f2300c.append(45, 18);
        f2300c.append(46, 19);
        f2300c.append(0, 27);
        f2300c.append(60, 32);
        f2300c.append(61, 33);
        f2300c.append(43, 10);
        f2300c.append(42, 9);
        f2300c.append(76, 13);
        f2300c.append(79, 16);
        f2300c.append(77, 14);
        f2300c.append(74, 11);
        f2300c.append(78, 15);
        f2300c.append(75, 12);
        f2300c.append(67, 40);
        f2300c.append(53, 39);
        f2300c.append(52, 41);
        f2300c.append(66, 42);
        f2300c.append(51, 20);
        f2300c.append(65, 37);
        f2300c.append(41, 5);
        f2300c.append(54, 75);
        f2300c.append(62, 75);
        f2300c.append(57, 75);
        f2300c.append(35, 75);
        f2300c.append(33, 75);
        f2300c.append(5, 24);
        f2300c.append(7, 28);
        f2300c.append(23, 31);
        f2300c.append(24, 8);
        f2300c.append(6, 34);
        f2300c.append(8, 2);
        f2300c.append(3, 23);
        f2300c.append(4, 21);
        f2300c.append(2, 22);
        f2300c.append(13, 43);
        f2300c.append(26, 44);
        f2300c.append(21, 45);
        f2300c.append(22, 46);
        f2300c.append(20, 60);
        f2300c.append(18, 47);
        f2300c.append(19, 48);
        f2300c.append(14, 49);
        f2300c.append(15, 50);
        f2300c.append(16, 51);
        f2300c.append(17, 52);
        f2300c.append(25, 53);
        f2300c.append(68, 54);
        f2300c.append(47, 55);
        f2300c.append(69, 56);
        f2300c.append(48, 57);
        f2300c.append(70, 58);
        f2300c.append(49, 59);
        f2300c.append(38, 61);
        f2300c.append(40, 62);
        f2300c.append(39, 63);
        f2300c.append(1, 38);
        f2300c.append(71, 69);
        f2300c.append(50, 70);
        f2300c.append(29, 71);
        f2300c.append(28, 72);
        f2300c.append(30, 73);
        f2300c.append(27, 74);
    }

    /* renamed from: c */
    public final void mo2455c(int i) {
        mo2457d(i).f2320S = 1;
    }

    /* renamed from: b */
    public final void mo2452b(int i) {
        mo2457d(R.id.d6d).f2351b = i;
    }

    /* renamed from: b */
    public final void mo2454b(ConstraintLayout constraintLayout) {
        mo2456c(constraintLayout);
        constraintLayout.setConstraintSet(null);
    }

    /* renamed from: a */
    public final void mo2444a(int i) {
        this.f2301b.remove(Integer.valueOf(i));
    }

    /* renamed from: d */
    public final C0551a mo2457d(int i) {
        if (!this.f2301b.containsKey(Integer.valueOf(i))) {
            this.f2301b.put(Integer.valueOf(i), new C0551a((byte) 0));
        }
        return this.f2301b.get(Integer.valueOf(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo2456c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f2301b.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (id != -1) {
                if (this.f2301b.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C0551a aVar = this.f2301b.get(Integer.valueOf(id));
                    if (childAt instanceof Barrier) {
                        aVar.f2348at = 1;
                    }
                    if (aVar.f2348at != -1 && aVar.f2348at == 1) {
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id);
                        barrier.setType(aVar.f2347as);
                        barrier.setAllowsGoneWidget(aVar.f2346ar);
                        if (aVar.f2349au != null) {
                            barrier.setReferencedIds(aVar.f2349au);
                        } else if (aVar.f2350av != null) {
                            aVar.f2349au = m2092a(barrier, aVar.f2350av);
                            barrier.setReferencedIds(aVar.f2349au);
                        }
                    }
                    ConstraintLayout.C0547a aVar2 = (ConstraintLayout.C0547a) childAt.getLayoutParams();
                    aVar.mo2460a(aVar2);
                    childAt.setLayoutParams(aVar2);
                    childAt.setVisibility(aVar.f2311J);
                    int i2 = Build.VERSION.SDK_INT;
                    childAt.setAlpha(aVar.f2322U);
                    childAt.setRotation(aVar.f2325X);
                    childAt.setRotationX(aVar.f2326Y);
                    childAt.setRotationY(aVar.f2327Z);
                    childAt.setScaleX(aVar.f2329aa);
                    childAt.setScaleY(aVar.f2330ab);
                    if (!Float.isNaN(aVar.f2331ac)) {
                        childAt.setPivotX(aVar.f2331ac);
                    }
                    if (!Float.isNaN(aVar.f2332ad)) {
                        childAt.setPivotY(aVar.f2332ad);
                    }
                    childAt.setTranslationX(aVar.f2333ae);
                    childAt.setTranslationY(aVar.f2334af);
                    if (Build.VERSION.SDK_INT >= 21) {
                        childAt.setTranslationZ(aVar.f2335ag);
                        if (aVar.f2323V) {
                            childAt.setElevation(aVar.f2324W);
                        }
                    }
                }
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0551a aVar3 = this.f2301b.get(num);
            if (aVar3.f2348at != -1 && aVar3.f2348at == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                if (aVar3.f2349au != null) {
                    barrier2.setReferencedIds(aVar3.f2349au);
                } else if (aVar3.f2350av != null) {
                    aVar3.f2349au = m2092a(barrier2, aVar3.f2350av);
                    barrier2.setReferencedIds(aVar3.f2349au);
                }
                barrier2.setType(aVar3.f2347as);
                ConstraintLayout.C0547a bu_ = ConstraintLayout.bu_();
                barrier2.mo2437a();
                aVar3.mo2460a(bu_);
                constraintLayout.addView(barrier2, bu_);
            }
            if (aVar3.f2328a) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.C0547a bu_2 = ConstraintLayout.bu_();
                aVar3.mo2460a(bu_2);
                constraintLayout.addView(guideline, bu_2);
            }
        }
    }

    /* renamed from: a */
    public final void mo2445a(int i, float f) {
        mo2457d(i).f2370u = f;
    }

    /* renamed from: b */
    public final void mo2453b(int i, int i2) {
        mo2457d(i).f2340al = i2;
    }

    /* renamed from: a */
    private static int[] m2092a(View view, String str) {
        int i;
        Object a;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = R$id.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (a = ((ConstraintLayout) view.getParent()).mo2396a(trim)) != null && (a instanceof Integer)) {
                i = ((Integer) a).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        if (i3 != split.length) {
            return Arrays.copyOf(iArr, i3);
        }
        return iArr;
    }

    /* renamed from: a */
    public final void mo2446a(int i, int i2) {
        if (this.f2301b.containsKey(Integer.valueOf(i))) {
            C0551a aVar = this.f2301b.get(Integer.valueOf(i));
            switch (i2) {
                case 1:
                    aVar.f2358i = -1;
                    aVar.f2357h = -1;
                    aVar.f2305D = -1;
                    aVar.f2312K = -1;
                    return;
                case 2:
                    aVar.f2360k = -1;
                    aVar.f2359j = -1;
                    aVar.f2306E = -1;
                    aVar.f2314M = -1;
                    return;
                case 3:
                    aVar.f2362m = -1;
                    aVar.f2361l = -1;
                    aVar.f2307F = -1;
                    aVar.f2313L = -1;
                    return;
                case 4:
                    aVar.f2363n = -1;
                    aVar.f2364o = -1;
                    aVar.f2308G = -1;
                    aVar.f2315N = -1;
                    return;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    aVar.f2365p = -1;
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    aVar.f2366q = -1;
                    aVar.f2367r = -1;
                    aVar.f2310I = -1;
                    aVar.f2317P = -1;
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    aVar.f2368s = -1;
                    aVar.f2369t = -1;
                    aVar.f2309H = -1;
                    aVar.f2316O = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    /* renamed from: a */
    static int m2091a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        if (resourceId == -1) {
            return typedArray.getInt(i, -1);
        }
        return resourceId;
    }

    /* renamed from: a */
    public final void mo2447a(int i, int i2, int i3) {
        C0551a d = mo2457d(i);
        switch (i2) {
            case 1:
                d.f2305D = i3;
                return;
            case 2:
                d.f2306E = i3;
                return;
            case 3:
                d.f2307F = i3;
                return;
            case 4:
                d.f2308G = i3;
                return;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                throw new IllegalArgumentException("baseline does not support margins");
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                d.f2310I = i3;
                return;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                d.f2309H = i3;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    /* renamed from: a */
    public final void mo2448a(int i, int i2, int i3, int i4) {
        if (!this.f2301b.containsKey(Integer.valueOf(i))) {
            this.f2301b.put(Integer.valueOf(i), new C0551a((byte) 0));
        }
        C0551a aVar = this.f2301b.get(Integer.valueOf(i));
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    aVar.f2357h = i3;
                    aVar.f2358i = -1;
                    return;
                } else if (i4 == 2) {
                    aVar.f2358i = i3;
                    aVar.f2357h = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + m2093e(i4) + " undefined");
                }
            case 2:
                if (i4 == 1) {
                    aVar.f2359j = i3;
                    aVar.f2360k = -1;
                    return;
                } else if (i4 == 2) {
                    aVar.f2360k = i3;
                    aVar.f2359j = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m2093e(i4) + " undefined");
                }
            case 3:
                if (i4 == 3) {
                    aVar.f2361l = i3;
                    aVar.f2362m = -1;
                    aVar.f2365p = -1;
                    return;
                } else if (i4 == 4) {
                    aVar.f2362m = i3;
                    aVar.f2361l = -1;
                    aVar.f2365p = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m2093e(i4) + " undefined");
                }
            case 4:
                if (i4 == 4) {
                    aVar.f2364o = i3;
                    aVar.f2363n = -1;
                    aVar.f2365p = -1;
                    return;
                } else if (i4 == 3) {
                    aVar.f2363n = i3;
                    aVar.f2364o = -1;
                    aVar.f2365p = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m2093e(i4) + " undefined");
                }
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                if (i4 == 5) {
                    aVar.f2365p = i3;
                    aVar.f2364o = -1;
                    aVar.f2363n = -1;
                    aVar.f2361l = -1;
                    aVar.f2362m = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + m2093e(i4) + " undefined");
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                if (i4 == 6) {
                    aVar.f2367r = i3;
                    aVar.f2366q = -1;
                    return;
                } else if (i4 == 7) {
                    aVar.f2366q = i3;
                    aVar.f2367r = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m2093e(i4) + " undefined");
                }
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                if (i4 == 7) {
                    aVar.f2369t = i3;
                    aVar.f2368s = -1;
                    return;
                } else if (i4 == 6) {
                    aVar.f2368s = i3;
                    aVar.f2369t = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m2093e(i4) + " undefined");
                }
            default:
                throw new IllegalArgumentException(m2093e(i2) + " to " + m2093e(i4) + " unknown");
        }
    }

    /* renamed from: a */
    public final void mo2449a(int i, int i2, int i3, int i4, int i5) {
        if (!this.f2301b.containsKey(Integer.valueOf(i))) {
            this.f2301b.put(Integer.valueOf(i), new C0551a((byte) 0));
        }
        C0551a aVar = this.f2301b.get(Integer.valueOf(i));
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    aVar.f2357h = i3;
                    aVar.f2358i = -1;
                } else if (i4 == 2) {
                    aVar.f2358i = i3;
                    aVar.f2357h = -1;
                } else {
                    throw new IllegalArgumentException("Left to " + m2093e(i4) + " undefined");
                }
                aVar.f2305D = i5;
                return;
            case 2:
                if (i4 == 1) {
                    aVar.f2359j = i3;
                    aVar.f2360k = -1;
                } else if (i4 == 2) {
                    aVar.f2360k = i3;
                    aVar.f2359j = -1;
                } else {
                    throw new IllegalArgumentException("right to " + m2093e(i4) + " undefined");
                }
                aVar.f2306E = i5;
                return;
            case 3:
                if (i4 == 3) {
                    aVar.f2361l = i3;
                    aVar.f2362m = -1;
                    aVar.f2365p = -1;
                } else if (i4 == 4) {
                    aVar.f2362m = i3;
                    aVar.f2361l = -1;
                    aVar.f2365p = -1;
                } else {
                    throw new IllegalArgumentException("right to " + m2093e(i4) + " undefined");
                }
                aVar.f2307F = i5;
                return;
            case 4:
                if (i4 == 4) {
                    aVar.f2364o = i3;
                    aVar.f2363n = -1;
                    aVar.f2365p = -1;
                } else if (i4 == 3) {
                    aVar.f2363n = i3;
                    aVar.f2364o = -1;
                    aVar.f2365p = -1;
                } else {
                    throw new IllegalArgumentException("right to " + m2093e(i4) + " undefined");
                }
                aVar.f2308G = i5;
                return;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                if (i4 == 5) {
                    aVar.f2365p = i3;
                    aVar.f2364o = -1;
                    aVar.f2363n = -1;
                    aVar.f2361l = -1;
                    aVar.f2362m = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + m2093e(i4) + " undefined");
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                if (i4 == 6) {
                    aVar.f2367r = i3;
                    aVar.f2366q = -1;
                } else if (i4 == 7) {
                    aVar.f2366q = i3;
                    aVar.f2367r = -1;
                } else {
                    throw new IllegalArgumentException("right to " + m2093e(i4) + " undefined");
                }
                aVar.f2310I = i5;
                return;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                if (i4 == 7) {
                    aVar.f2369t = i3;
                    aVar.f2368s = -1;
                } else if (i4 == 6) {
                    aVar.f2368s = i3;
                    aVar.f2369t = -1;
                } else {
                    throw new IllegalArgumentException("right to " + m2093e(i4) + " undefined");
                }
                aVar.f2309H = i5;
                return;
            default:
                throw new IllegalArgumentException(m2093e(i2) + " to " + m2093e(i4) + " unknown");
        }
    }
}
