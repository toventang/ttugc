package com.squareup.p2081b;

import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.squareup.p2081b.C29299t;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.squareup.b.w */
public final class C29312w {

    /* renamed from: s */
    private static final long f69558s = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: a */
    int f69559a;

    /* renamed from: b */
    long f69560b;

    /* renamed from: c */
    int f69561c;

    /* renamed from: d */
    public final Uri f69562d;

    /* renamed from: e */
    public final int f69563e;

    /* renamed from: f */
    public final String f69564f;

    /* renamed from: g */
    public final List<AbstractC29259ac> f69565g;

    /* renamed from: h */
    public final int f69566h;

    /* renamed from: i */
    public final int f69567i;

    /* renamed from: j */
    public final boolean f69568j;

    /* renamed from: k */
    public final boolean f69569k;

    /* renamed from: l */
    public final boolean f69570l;

    /* renamed from: m */
    public final float f69571m;

    /* renamed from: n */
    public final float f69572n;

    /* renamed from: o */
    public final float f69573o;

    /* renamed from: p */
    public final boolean f69574p;

    /* renamed from: q */
    public final Bitmap.Config f69575q;

    /* renamed from: r */
    public final C29299t.EnumC29306e f69576r;

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo51128e() {
        if (this.f69565g != null) {
            return true;
        }
        return false;
    }

    /* renamed from: com.squareup.b.w$a */
    public static final class C29313a {

        /* renamed from: a */
        private Uri f69577a;

        /* renamed from: b */
        private int f69578b = 0;

        /* renamed from: c */
        private String f69579c;

        /* renamed from: d */
        private int f69580d;

        /* renamed from: e */
        private int f69581e;

        /* renamed from: f */
        private boolean f69582f;

        /* renamed from: g */
        private boolean f69583g;

        /* renamed from: h */
        private boolean f69584h;

        /* renamed from: i */
        private float f69585i;

        /* renamed from: j */
        private float f69586j;

        /* renamed from: k */
        private float f69587k;

        /* renamed from: l */
        private boolean f69588l;

        /* renamed from: m */
        private List<AbstractC29259ac> f69589m;

        /* renamed from: n */
        private Bitmap.Config f69590n;

        /* renamed from: o */
        private C29299t.EnumC29306e f69591o;

        static {
            Covode.recordClassIndex(35662);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo51131a() {
            if (this.f69577a == null && this.f69578b == 0) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final boolean mo51132b() {
            if (this.f69580d == 0 && this.f69581e == 0) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public final C29312w mo51133c() {
            boolean z = this.f69583g;
            if (z && this.f69582f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            } else if (this.f69582f && this.f69580d == 0 && this.f69581e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            } else if (z && this.f69580d == 0 && this.f69581e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            } else {
                if (this.f69591o == null) {
                    this.f69591o = C29299t.EnumC29306e.NORMAL;
                }
                return new C29312w(this.f69577a, this.f69578b, this.f69579c, this.f69589m, this.f69580d, this.f69581e, this.f69582f, this.f69583g, this.f69584h, this.f69585i, this.f69586j, this.f69587k, this.f69588l, this.f69590n, this.f69591o, (byte) 0);
            }
        }

        C29313a(Uri uri, Bitmap.Config config) {
            this.f69577a = uri;
            this.f69590n = config;
        }

        /* renamed from: a */
        public final C29313a mo51130a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            } else if (i2 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            } else if (i2 == 0 && i == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            } else {
                this.f69580d = i;
                this.f69581e = i2;
                return this;
            }
        }
    }

    /* renamed from: c */
    public final boolean mo51126c() {
        if (this.f69566h == 0 && this.f69567i == 0) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(35661);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo51125b() {
        return "[R" + this.f69559a + ']';
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo51127d() {
        if (mo51126c() || this.f69571m != 0.0f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo51124a() {
        long nanoTime = System.nanoTime() - this.f69560b;
        if (nanoTime > f69558s) {
            return mo51125b() + '+' + TimeUnit.NANOSECONDS.toSeconds(nanoTime) + 's';
        }
        return mo51125b() + '+' + TimeUnit.NANOSECONDS.toMillis(nanoTime) + "ms";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i = this.f69563e;
        if (i > 0) {
            sb.append(i);
        } else {
            sb.append(this.f69562d);
        }
        List<AbstractC29259ac> list = this.f69565g;
        if (list != null && !list.isEmpty()) {
            for (AbstractC29259ac acVar : this.f69565g) {
                sb.append(' ').append(acVar.mo51056b());
            }
        }
        if (this.f69564f != null) {
            sb.append(" stableKey(").append(this.f69564f).append(')');
        }
        if (this.f69566h > 0) {
            sb.append(" resize(").append(this.f69566h).append(',').append(this.f69567i).append(')');
        }
        if (this.f69568j) {
            sb.append(" centerCrop");
        }
        if (this.f69569k) {
            sb.append(" centerInside");
        }
        if (this.f69571m != 0.0f) {
            sb.append(" rotation(").append(this.f69571m);
            if (this.f69574p) {
                sb.append(" @ ").append(this.f69572n).append(',').append(this.f69573o);
            }
            sb.append(')');
        }
        if (this.f69575q != null) {
            sb.append(' ').append(this.f69575q);
        }
        sb.append('}');
        return sb.toString();
    }

    private C29312w(Uri uri, int i, String str, List<AbstractC29259ac> list, int i2, int i3, boolean z, boolean z2, boolean z3, float f, float f2, float f3, boolean z4, Bitmap.Config config, C29299t.EnumC29306e eVar) {
        this.f69562d = uri;
        this.f69563e = i;
        this.f69564f = str;
        if (list == null) {
            this.f69565g = null;
        } else {
            this.f69565g = Collections.unmodifiableList(list);
        }
        this.f69566h = i2;
        this.f69567i = i3;
        this.f69568j = z;
        this.f69569k = z2;
        this.f69570l = z3;
        this.f69571m = f;
        this.f69572n = f2;
        this.f69573o = f3;
        this.f69574p = z4;
        this.f69575q = config;
        this.f69576r = eVar;
    }

    /* synthetic */ C29312w(Uri uri, int i, String str, List list, int i2, int i3, boolean z, boolean z2, boolean z3, float f, float f2, float f3, boolean z4, Bitmap.Config config, C29299t.EnumC29306e eVar, byte b) {
        this(uri, i, str, list, i2, i3, z, z2, z3, f, f2, f3, z4, config, eVar);
    }
}
