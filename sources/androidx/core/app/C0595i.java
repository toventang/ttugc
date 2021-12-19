package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.C0614m;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.p035f.C0671a;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.core.app.i */
public final class C0595i {

    /* renamed from: androidx.core.app.i$d */
    public static final class C0599d {

        /* renamed from: a */
        public PendingIntent f2493a;

        /* renamed from: b */
        public PendingIntent f2494b;

        /* renamed from: c */
        public IconCompat f2495c;

        /* renamed from: d */
        public int f2496d;

        /* renamed from: e */
        public int f2497e;

        /* renamed from: f */
        int f2498f;

        static {
            Covode.recordClassIndex(677);
        }
    }

    static {
        Covode.recordClassIndex(673);
    }

    /* renamed from: androidx.core.app.i$e */
    public static class C0600e {

        /* renamed from: A */
        boolean f2499A;

        /* renamed from: B */
        public String f2500B;

        /* renamed from: C */
        Bundle f2501C;

        /* renamed from: D */
        public int f2502D;

        /* renamed from: E */
        public int f2503E;

        /* renamed from: F */
        Notification f2504F;

        /* renamed from: G */
        public RemoteViews f2505G;

        /* renamed from: H */
        public RemoteViews f2506H;

        /* renamed from: I */
        public RemoteViews f2507I;

        /* renamed from: J */
        public String f2508J;

        /* renamed from: K */
        int f2509K;

        /* renamed from: L */
        String f2510L;

        /* renamed from: M */
        long f2511M;

        /* renamed from: N */
        int f2512N;

        /* renamed from: O */
        boolean f2513O;

        /* renamed from: P */
        public C0599d f2514P;

        /* renamed from: Q */
        Notification f2515Q;

        /* renamed from: R */
        boolean f2516R;

        /* renamed from: S */
        public ArrayList<String> f2517S;

        /* renamed from: a */
        public Context f2518a;

        /* renamed from: b */
        public ArrayList<C0596a> f2519b;

        /* renamed from: c */
        ArrayList<C0596a> f2520c;

        /* renamed from: d */
        CharSequence f2521d;

        /* renamed from: e */
        CharSequence f2522e;

        /* renamed from: f */
        public PendingIntent f2523f;

        /* renamed from: g */
        public PendingIntent f2524g;

        /* renamed from: h */
        RemoteViews f2525h;

        /* renamed from: i */
        Bitmap f2526i;

        /* renamed from: j */
        CharSequence f2527j;

        /* renamed from: k */
        public int f2528k;

        /* renamed from: l */
        public int f2529l;

        /* renamed from: m */
        public boolean f2530m;

        /* renamed from: n */
        boolean f2531n;

        /* renamed from: o */
        boolean f2532o;

        /* renamed from: p */
        AbstractC0604h f2533p;

        /* renamed from: q */
        CharSequence f2534q;

        /* renamed from: r */
        CharSequence[] f2535r;

        /* renamed from: s */
        int f2536s;

        /* renamed from: t */
        int f2537t;

        /* renamed from: u */
        boolean f2538u;

        /* renamed from: v */
        public String f2539v;

        /* renamed from: w */
        public boolean f2540w;

        /* renamed from: x */
        String f2541x;

        /* renamed from: y */
        public boolean f2542y;

        /* renamed from: z */
        boolean f2543z;

        static {
            Covode.recordClassIndex(678);
        }

        /* renamed from: a */
        public final C0600e mo2604a() {
            this.f2530m = false;
            return this;
        }

        /* renamed from: c */
        public final C0600e mo2623c() {
            this.f2503E = 1;
            return this;
        }

        /* renamed from: a */
        public final C0600e mo2616a(long[] jArr) {
            this.f2515Q.vibrate = jArr;
            return this;
        }

        /* renamed from: a */
        public final C0600e mo2615a(boolean z) {
            mo2617a(2, z);
            return this;
        }

        /* renamed from: a */
        public final void mo2617a(int i, boolean z) {
            if (z) {
                Notification notification = this.f2515Q;
                notification.flags = i | notification.flags;
                return;
            }
            Notification notification2 = this.f2515Q;
            notification2.flags = (i ^ -1) & notification2.flags;
        }

        /* renamed from: a */
        public final C0600e mo2614a(String str) {
            this.f2539v = str;
            return this;
        }

        /* renamed from: b */
        public final Bundle mo2618b() {
            if (this.f2501C == null) {
                this.f2501C = new Bundle();
            }
            return this.f2501C;
        }

        /* renamed from: e */
        public final long mo2628e() {
            if (this.f2530m) {
                return this.f2515Q.when;
            }
            return 0;
        }

        /* renamed from: d */
        public final Notification mo2626d() {
            RemoteViews remoteViews;
            Notification build;
            Bundle a;
            RemoteViews b;
            C0605j jVar = new C0605j(this);
            AbstractC0604h hVar = jVar.f2560b.f2533p;
            if (hVar != null) {
                hVar.mo2599a(jVar);
                remoteViews = hVar.mo2633a();
            } else {
                remoteViews = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                build = jVar.f2559a.build();
            } else if (Build.VERSION.SDK_INT >= 24) {
                build = jVar.f2559a.build();
                if (jVar.f2565g != 0) {
                    if (!(build.getGroup() == null || (build.flags & 512) == 0 || jVar.f2565g != 2)) {
                        C0605j.m2283a(build);
                    }
                    if (build.getGroup() != null && (build.flags & 512) == 0 && jVar.f2565g == 1) {
                        C0605j.m2283a(build);
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 21) {
                jVar.f2559a.setExtras(jVar.f2564f);
                build = jVar.f2559a.build();
                if (jVar.f2561c != null) {
                    build.contentView = jVar.f2561c;
                }
                if (jVar.f2562d != null) {
                    build.bigContentView = jVar.f2562d;
                }
                if (jVar.f2566h != null) {
                    build.headsUpContentView = jVar.f2566h;
                }
                if (jVar.f2565g != 0) {
                    if (!(build.getGroup() == null || (build.flags & 512) == 0 || jVar.f2565g != 2)) {
                        C0605j.m2283a(build);
                    }
                    if (build.getGroup() != null && (build.flags & 512) == 0 && jVar.f2565g == 1) {
                        C0605j.m2283a(build);
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 20) {
                jVar.f2559a.setExtras(jVar.f2564f);
                build = jVar.f2559a.build();
                if (jVar.f2561c != null) {
                    build.contentView = jVar.f2561c;
                }
                if (jVar.f2562d != null) {
                    build.bigContentView = jVar.f2562d;
                }
                if (jVar.f2565g != 0) {
                    if (!(build.getGroup() == null || (build.flags & 512) == 0 || jVar.f2565g != 2)) {
                        C0605j.m2283a(build);
                    }
                    if (build.getGroup() != null && (build.flags & 512) == 0 && jVar.f2565g == 1) {
                        C0605j.m2283a(build);
                    }
                }
            } else {
                int i = Build.VERSION.SDK_INT;
                SparseArray<Bundle> a2 = C0606k.m2287a(jVar.f2563e);
                if (a2 != null) {
                    jVar.f2564f.putSparseParcelableArray("android.support.actionExtras", a2);
                }
                jVar.f2559a.setExtras(jVar.f2564f);
                build = jVar.f2559a.build();
                if (jVar.f2561c != null) {
                    build.contentView = jVar.f2561c;
                }
                if (jVar.f2562d != null) {
                    build.bigContentView = jVar.f2562d;
                }
            }
            if (remoteViews != null) {
                build.contentView = remoteViews;
            } else if (jVar.f2560b.f2505G != null) {
                build.contentView = jVar.f2560b.f2505G;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (!(hVar == null || (b = hVar.mo2636b()) == null)) {
                build.bigContentView = b;
            }
            int i3 = Build.VERSION.SDK_INT;
            if (!(hVar == null || (a = C0595i.m2230a(build)) == null)) {
                hVar.mo2632a(a);
            }
            return build;
        }

        public C0600e(Context context) {
            this(context, null);
        }

        /* renamed from: a */
        public final C0600e mo2605a(int i) {
            this.f2515Q.icon = i;
            return this;
        }

        /* renamed from: b */
        public final C0600e mo2620b(PendingIntent pendingIntent) {
            this.f2515Q.deleteIntent = pendingIntent;
            return this;
        }

        /* renamed from: c */
        public final C0600e mo2625c(CharSequence charSequence) {
            this.f2534q = m2240e(charSequence);
            return this;
        }

        /* renamed from: d */
        public final C0600e mo2627d(CharSequence charSequence) {
            this.f2515Q.tickerText = m2240e(charSequence);
            return this;
        }

        /* renamed from: e */
        protected static CharSequence m2240e(CharSequence charSequence) {
            if (charSequence != null && charSequence.length() > 5120) {
                return charSequence.subSequence(0, 5120);
            }
            return charSequence;
        }

        /* renamed from: a */
        public final C0600e mo2608a(long j) {
            this.f2515Q.when = j;
            return this;
        }

        /* renamed from: b */
        public final C0600e mo2619b(int i) {
            this.f2536s = 100;
            this.f2537t = i;
            this.f2538u = false;
            return this;
        }

        /* renamed from: c */
        public final C0600e mo2624c(int i) {
            this.f2515Q.defaults = i;
            if ((i & 4) != 0) {
                this.f2515Q.flags |= 1;
            }
            return this;
        }

        /* renamed from: b */
        public final C0600e mo2621b(CharSequence charSequence) {
            this.f2522e = m2240e(charSequence);
            return this;
        }

        /* renamed from: a */
        public final C0600e mo2609a(PendingIntent pendingIntent) {
            this.f2523f = pendingIntent;
            return this;
        }

        /* renamed from: b */
        public final C0600e mo2622b(boolean z) {
            mo2617a(16, z);
            return this;
        }

        /* renamed from: a */
        public final C0600e mo2610a(Bitmap bitmap) {
            if (bitmap != null && Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f2518a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.gd);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.gc);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double d = (double) dimensionPixelSize;
                    double max = (double) Math.max(1, bitmap.getWidth());
                    Double.isNaN(d);
                    Double.isNaN(max);
                    double d2 = d / max;
                    double d3 = (double) dimensionPixelSize2;
                    double max2 = (double) Math.max(1, bitmap.getHeight());
                    Double.isNaN(d3);
                    Double.isNaN(max2);
                    double min = Math.min(d2, d3 / max2);
                    double width = (double) bitmap.getWidth();
                    Double.isNaN(width);
                    int ceil = (int) Math.ceil(width * min);
                    double height = (double) bitmap.getHeight();
                    Double.isNaN(height);
                    bitmap = Bitmap.createScaledBitmap(bitmap, ceil, (int) Math.ceil(height * min), true);
                }
            }
            this.f2526i = bitmap;
            return this;
        }

        /* renamed from: a */
        public final C0600e mo2611a(Uri uri) {
            this.f2515Q.sound = uri;
            this.f2515Q.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                this.f2515Q.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        /* renamed from: a */
        public final C0600e mo2612a(AbstractC0604h hVar) {
            if (this.f2533p != hVar) {
                this.f2533p = hVar;
                if (hVar != null) {
                    hVar.mo2635a(this);
                }
            }
            return this;
        }

        /* renamed from: a */
        public final C0600e mo2613a(CharSequence charSequence) {
            this.f2521d = m2240e(charSequence);
            return this;
        }

        public C0600e(Context context, String str) {
            this.f2519b = new ArrayList<>();
            this.f2520c = new ArrayList<>();
            this.f2530m = true;
            this.f2542y = false;
            this.f2502D = 0;
            this.f2503E = 0;
            this.f2509K = 0;
            this.f2512N = 0;
            Notification notification = new Notification();
            this.f2515Q = notification;
            this.f2518a = context;
            this.f2508J = str;
            notification.when = System.currentTimeMillis();
            this.f2515Q.audioStreamType = -1;
            this.f2529l = 0;
            this.f2517S = new ArrayList<>();
            this.f2513O = true;
        }

        /* renamed from: a */
        public final C0600e mo2607a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f2519b.add(new C0596a(i, charSequence, pendingIntent));
            return this;
        }

        /* renamed from: a */
        public final C0600e mo2606a(int i, int i2, int i3) {
            int i4;
            this.f2515Q.ledARGB = i;
            this.f2515Q.ledOnMS = i2;
            this.f2515Q.ledOffMS = i3;
            if (this.f2515Q.ledOnMS == 0 || this.f2515Q.ledOffMS == 0) {
                i4 = 0;
            } else {
                i4 = 1;
            }
            Notification notification = this.f2515Q;
            notification.flags = i4 | (notification.flags & -2);
            return this;
        }
    }

    /* renamed from: androidx.core.app.i$g */
    public static class C0602g extends AbstractC0604h {

        /* renamed from: a */
        public final List<C0603a> f2545a = new ArrayList();

        /* renamed from: b */
        public C0614m f2546b;

        /* renamed from: c */
        public CharSequence f2547c;

        /* renamed from: h */
        private Boolean f2548h;

        static {
            Covode.recordClassIndex(680);
        }

        private C0602g() {
        }

        /* renamed from: c */
        private C0603a m2272c() {
            for (int size = this.f2545a.size() - 1; size >= 0; size--) {
                C0603a aVar = this.f2545a.get(size);
                if (!(aVar.f2551c == null || TextUtils.isEmpty(aVar.f2551c.f2598a))) {
                    return aVar;
                }
            }
            if (this.f2545a.isEmpty()) {
                return null;
            }
            List<C0603a> list = this.f2545a;
            return list.get(list.size() - 1);
        }

        /* renamed from: d */
        private boolean m2273d() {
            for (int size = this.f2545a.size() - 1; size >= 0; size--) {
                C0603a aVar = this.f2545a.get(size);
                if (aVar.f2551c != null && aVar.f2551c.f2598a == null) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        private static TextAppearanceSpan m2270a(int i) {
            return new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i), null);
        }

        public C0602g(CharSequence charSequence) {
            C0614m.C0615a aVar = new C0614m.C0615a();
            aVar.f2604a = charSequence;
            this.f2546b = aVar.mo2649a();
        }

        /* renamed from: a */
        private CharSequence m2271a(C0603a aVar) {
            boolean z;
            int i;
            CharSequence charSequence;
            C0671a a = C0671a.m2407a();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (Build.VERSION.SDK_INT >= 21) {
                z = true;
                i = -16777216;
            } else {
                z = false;
                i = -1;
            }
            CharSequence charSequence2 = "";
            if (aVar.f2551c == null) {
                charSequence = charSequence2;
            } else {
                charSequence = aVar.f2551c.f2598a;
            }
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = this.f2546b.f2598a;
                if (z && this.f2555d.f2502D != 0) {
                    i = this.f2555d.f2502D;
                }
            }
            CharSequence a2 = a.mo2694a(charSequence);
            spannableStringBuilder.append(a2);
            spannableStringBuilder.setSpan(m2270a(i), spannableStringBuilder.length() - a2.length(), spannableStringBuilder.length(), 33);
            if (aVar.f2549a != null) {
                charSequence2 = aVar.f2549a;
            }
            spannableStringBuilder.append((CharSequence) "  ").append(a.mo2694a(charSequence2));
            return spannableStringBuilder;
        }

        @Override // androidx.core.app.C0595i.AbstractC0604h
        /* renamed from: a */
        public final void mo2632a(Bundle bundle) {
            super.mo2632a(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.f2546b.f2598a);
            bundle.putBundle("android.messagingStyleUser", this.f2546b.mo2647a());
            bundle.putCharSequence("android.hiddenConversationTitle", this.f2547c);
            if (this.f2547c != null && this.f2548h.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.f2547c);
            }
            if (!this.f2545a.isEmpty()) {
                List<C0603a> list = this.f2545a;
                Parcelable[] parcelableArr = new Bundle[list.size()];
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    C0603a aVar = list.get(i);
                    Bundle bundle2 = new Bundle();
                    if (aVar.f2549a != null) {
                        bundle2.putCharSequence("text", aVar.f2549a);
                    }
                    bundle2.putLong("time", aVar.f2550b);
                    if (aVar.f2551c != null) {
                        bundle2.putCharSequence("sender", aVar.f2551c.f2598a);
                        if (Build.VERSION.SDK_INT >= 28) {
                            bundle2.putParcelable("sender_person", aVar.f2551c.mo2648b());
                        } else {
                            bundle2.putBundle("person", aVar.f2551c.mo2647a());
                        }
                    }
                    if (aVar.f2553e != null) {
                        bundle2.putString(StringSet.type, aVar.f2553e);
                    }
                    if (aVar.f2554f != null) {
                        bundle2.putParcelable("uri", aVar.f2554f);
                    }
                    if (aVar.f2552d != null) {
                        bundle2.putBundle("extras", aVar.f2552d);
                    }
                    parcelableArr[i] = bundle2;
                }
                bundle.putParcelableArray("android.messages", parcelableArr);
            }
            Boolean bool = this.f2548h;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00db, code lost:
            if (r3 != null) goto L_0x00dd;
         */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x0109  */
        @Override // androidx.core.app.C0595i.AbstractC0604h
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo2599a(androidx.core.app.AbstractC0594h r11) {
            /*
            // Method dump skipped, instructions count: 351
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.C0595i.C0602g.mo2599a(androidx.core.app.h):void");
        }

        /* renamed from: androidx.core.app.i$g$a */
        public static final class C0603a {

            /* renamed from: a */
            public final CharSequence f2549a;

            /* renamed from: b */
            public final long f2550b;

            /* renamed from: c */
            public final C0614m f2551c;

            /* renamed from: d */
            public Bundle f2552d = new Bundle();

            /* renamed from: e */
            public String f2553e;

            /* renamed from: f */
            public Uri f2554f;

            static {
                Covode.recordClassIndex(681);
            }

            public C0603a(CharSequence charSequence, long j, C0614m mVar) {
                this.f2549a = charSequence;
                this.f2550b = j;
                this.f2551c = mVar;
            }
        }
    }

    /* renamed from: androidx.core.app.i$a */
    public static class C0596a {

        /* renamed from: a */
        public final Bundle f2478a;

        /* renamed from: b */
        public final C0616n[] f2479b;

        /* renamed from: c */
        public final C0616n[] f2480c;

        /* renamed from: d */
        public boolean f2481d;

        /* renamed from: e */
        public boolean f2482e;

        /* renamed from: f */
        public final int f2483f;

        /* renamed from: g */
        public final boolean f2484g;

        /* renamed from: h */
        public int f2485h;

        /* renamed from: i */
        public CharSequence f2486i;

        /* renamed from: j */
        public PendingIntent f2487j;

        /* renamed from: k */
        private IconCompat f2488k;

        static {
            Covode.recordClassIndex(674);
        }

        /* renamed from: a */
        public final IconCompat mo2596a() {
            int i;
            if (this.f2488k == null && (i = this.f2485h) != 0) {
                this.f2488k = IconCompat.m2484a("", i);
            }
            return this.f2488k;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C0596a(int r2, java.lang.CharSequence r3, android.app.PendingIntent r4) {
            /*
                r1 = this;
                if (r2 != 0) goto L_0x0007
                r0 = 0
            L_0x0003:
                r1.<init>(r0, r3, r4)
                return
            L_0x0007:
                java.lang.String r0 = ""
                androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.m2484a(r0, r2)
                goto L_0x0003
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.C0595i.C0596a.<init>(int, java.lang.CharSequence, android.app.PendingIntent):void");
        }

        private C0596a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle());
        }

        private C0596a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
            int i;
            this.f2482e = true;
            this.f2488k = iconCompat;
            if (iconCompat != null) {
                if (iconCompat.f2769a != -1 || Build.VERSION.SDK_INT < 23) {
                    i = iconCompat.f2769a;
                } else {
                    i = IconCompat.m2482a((Icon) iconCompat.f2770b);
                }
                if (i == 2) {
                    this.f2485h = iconCompat.mo2733a();
                }
            }
            this.f2486i = C0600e.m2240e(charSequence);
            this.f2487j = pendingIntent;
            this.f2478a = bundle;
            this.f2479b = null;
            this.f2480c = null;
            this.f2481d = true;
            this.f2483f = 0;
            this.f2482e = true;
            this.f2484g = false;
        }
    }

    /* renamed from: androidx.core.app.i$b */
    public static class C0597b extends AbstractC0604h {

        /* renamed from: a */
        public Bitmap f2489a;

        /* renamed from: b */
        private Bitmap f2490b;

        /* renamed from: c */
        private boolean f2491c;

        static {
            Covode.recordClassIndex(675);
        }

        /* renamed from: a */
        public final C0597b mo2597a(Bitmap bitmap) {
            this.f2490b = bitmap;
            this.f2491c = true;
            return this;
        }

        /* renamed from: a */
        public final C0597b mo2598a(CharSequence charSequence) {
            this.f2556e = C0600e.m2240e(charSequence);
            return this;
        }

        /* renamed from: b */
        public final C0597b mo2600b(CharSequence charSequence) {
            this.f2557f = C0600e.m2240e(charSequence);
            this.f2558g = true;
            return this;
        }

        @Override // androidx.core.app.C0595i.AbstractC0604h
        /* renamed from: a */
        public final void mo2599a(AbstractC0594h hVar) {
            int i = Build.VERSION.SDK_INT;
            Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(hVar.mo2595a()).setBigContentTitle(this.f2556e).bigPicture(this.f2489a);
            if (this.f2491c) {
                bigPicture.bigLargeIcon(this.f2490b);
            }
            if (this.f2558g) {
                bigPicture.setSummaryText(this.f2557f);
            }
        }
    }

    /* renamed from: androidx.core.app.i$c */
    public static class C0598c extends AbstractC0604h {

        /* renamed from: a */
        private CharSequence f2492a;

        static {
            Covode.recordClassIndex(676);
        }

        /* renamed from: a */
        public final C0598c mo2601a(CharSequence charSequence) {
            this.f2556e = C0600e.m2240e(charSequence);
            return this;
        }

        /* renamed from: c */
        public final C0598c mo2603c(CharSequence charSequence) {
            this.f2492a = C0600e.m2240e(charSequence);
            return this;
        }

        /* renamed from: b */
        public final C0598c mo2602b(CharSequence charSequence) {
            this.f2557f = C0600e.m2240e(charSequence);
            this.f2558g = true;
            return this;
        }

        @Override // androidx.core.app.C0595i.AbstractC0604h
        /* renamed from: a */
        public final void mo2599a(AbstractC0594h hVar) {
            int i = Build.VERSION.SDK_INT;
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(hVar.mo2595a()).setBigContentTitle(this.f2556e).bigText(this.f2492a);
            if (this.f2558g) {
                bigText.setSummaryText(this.f2557f);
            }
        }
    }

    /* renamed from: androidx.core.app.i$f */
    public static class C0601f extends AbstractC0604h {

        /* renamed from: a */
        private ArrayList<CharSequence> f2544a = new ArrayList<>();

        static {
            Covode.recordClassIndex(679);
        }

        /* renamed from: a */
        public final C0601f mo2629a(CharSequence charSequence) {
            this.f2556e = C0600e.m2240e(charSequence);
            return this;
        }

        /* renamed from: b */
        public final C0601f mo2630b(CharSequence charSequence) {
            this.f2557f = C0600e.m2240e(charSequence);
            this.f2558g = true;
            return this;
        }

        /* renamed from: c */
        public final C0601f mo2631c(CharSequence charSequence) {
            this.f2544a.add(C0600e.m2240e(charSequence));
            return this;
        }

        @Override // androidx.core.app.C0595i.AbstractC0604h
        /* renamed from: a */
        public final void mo2599a(AbstractC0594h hVar) {
            int i = Build.VERSION.SDK_INT;
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(hVar.mo2595a()).setBigContentTitle(this.f2556e);
            if (this.f2558g) {
                bigContentTitle.setSummaryText(this.f2557f);
            }
            Iterator<CharSequence> it = this.f2544a.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine(it.next());
            }
        }
    }

    /* renamed from: a */
    public static Bundle m2230a(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        return notification.extras;
    }

    /* renamed from: androidx.core.app.i$h */
    public static abstract class AbstractC0604h {

        /* renamed from: d */
        protected C0600e f2555d;

        /* renamed from: e */
        CharSequence f2556e;

        /* renamed from: f */
        CharSequence f2557f;

        /* renamed from: g */
        boolean f2558g;

        static {
            Covode.recordClassIndex(682);
        }

        /* renamed from: a */
        public RemoteViews mo2633a() {
            return null;
        }

        /* renamed from: a */
        public void mo2632a(Bundle bundle) {
        }

        /* renamed from: a */
        public void mo2599a(AbstractC0594h hVar) {
        }

        /* renamed from: b */
        public RemoteViews mo2636b() {
            return null;
        }

        /* renamed from: a */
        public final void mo2635a(C0600e eVar) {
            if (this.f2555d != eVar) {
                this.f2555d = eVar;
                if (eVar != null) {
                    eVar.mo2612a(this);
                }
            }
        }

        /* renamed from: a */
        private static int m2276a(Resources resources) {
            ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(R.integer.bh);
            if (matchConfig == null) {
                return resources.getInteger(R.integer.bh);
            }
            try {
                if (!matchConfig.mockCrash) {
                    return resources.getInteger(R.integer.bh);
                }
                throw new Resources.NotFoundException("unknown resource from mocked");
            } catch (Throwable th) {
                StackTraceElement[] stackTrace = th.getStackTrace();
                int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
                for (int i = 0; i < min; i++) {
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (stackTraceElement != null) {
                        if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                            if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                                return matchConfig.mReturnIdWhenException;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                return resources.getInteger(R.integer.bh);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x009e  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00e2  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0122  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x012f  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x0132  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0147  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.widget.RemoteViews mo2634a(int r19, boolean r20) {
            /*
            // Method dump skipped, instructions count: 409
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.C0595i.AbstractC0604h.mo2634a(int, boolean):android.widget.RemoteViews");
        }
    }
}
