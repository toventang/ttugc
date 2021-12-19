package okhttp3;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;

/* renamed from: okhttp3.d */
public final class C90047d {

    /* renamed from: a */
    public static final C90047d f204177a;

    /* renamed from: b */
    public static final C90047d f204178b;

    /* renamed from: c */
    public final boolean f204179c;

    /* renamed from: d */
    public final boolean f204180d;

    /* renamed from: e */
    public final int f204181e;

    /* renamed from: f */
    public final int f204182f;

    /* renamed from: g */
    public final boolean f204183g;

    /* renamed from: h */
    public final boolean f204184h;

    /* renamed from: i */
    public final boolean f204185i;

    /* renamed from: j */
    public final int f204186j;

    /* renamed from: k */
    public final int f204187k;

    /* renamed from: l */
    public final boolean f204188l;

    /* renamed from: m */
    public final boolean f204189m;

    /* renamed from: n */
    public final boolean f204190n;

    /* renamed from: o */
    String f204191o;

    /* renamed from: okhttp3.d$a */
    public static final class C90048a {

        /* renamed from: a */
        boolean f204192a;

        /* renamed from: b */
        public boolean f204193b;

        /* renamed from: c */
        int f204194c = -1;

        /* renamed from: d */
        int f204195d = -1;

        /* renamed from: e */
        int f204196e = -1;

        /* renamed from: f */
        boolean f204197f;

        /* renamed from: g */
        boolean f204198g;

        /* renamed from: h */
        boolean f204199h;

        static {
            Covode.recordClassIndex(106220);
        }

        /* renamed from: a */
        public final C90047d mo144766a() {
            return new C90047d(this);
        }

        /* renamed from: a */
        public final C90048a mo144765a(int i, TimeUnit timeUnit) {
            int i2;
            if (i >= 0) {
                long seconds = timeUnit.toSeconds((long) i);
                if (seconds > 2147483647L) {
                    i2 = Integer.MAX_VALUE;
                } else {
                    i2 = (int) seconds;
                }
                this.f204195d = i2;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: ".concat(String.valueOf(i)));
        }
    }

    static {
        Covode.recordClassIndex(106219);
        C90048a aVar = new C90048a();
        aVar.f204192a = true;
        f204177a = aVar.mo144766a();
        C90048a aVar2 = new C90048a();
        aVar2.f204197f = true;
        f204178b = aVar2.mo144765a(Integer.MAX_VALUE, TimeUnit.SECONDS).mo144766a();
    }

    public final String toString() {
        String sb;
        String str = this.f204191o;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f204179c) {
            sb2.append("no-cache, ");
        }
        if (this.f204180d) {
            sb2.append("no-store, ");
        }
        if (this.f204181e != -1) {
            sb2.append("max-age=").append(this.f204181e).append(", ");
        }
        if (this.f204182f != -1) {
            sb2.append("s-maxage=").append(this.f204182f).append(", ");
        }
        if (this.f204183g) {
            sb2.append("private, ");
        }
        if (this.f204184h) {
            sb2.append("public, ");
        }
        if (this.f204185i) {
            sb2.append("must-revalidate, ");
        }
        if (this.f204186j != -1) {
            sb2.append("max-stale=").append(this.f204186j).append(", ");
        }
        if (this.f204187k != -1) {
            sb2.append("min-fresh=").append(this.f204187k).append(", ");
        }
        if (this.f204188l) {
            sb2.append("only-if-cached, ");
        }
        if (this.f204189m) {
            sb2.append("no-transform, ");
        }
        if (this.f204190n) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            sb = "";
        } else {
            sb2.delete(sb2.length() - 2, sb2.length());
            sb = sb2.toString();
        }
        this.f204191o = sb;
        return sb;
    }

    C90047d(C90048a aVar) {
        this.f204179c = aVar.f204192a;
        this.f204180d = aVar.f204193b;
        this.f204181e = aVar.f204194c;
        this.f204182f = -1;
        this.f204186j = aVar.f204195d;
        this.f204187k = aVar.f204196e;
        this.f204188l = aVar.f204197f;
        this.f204189m = aVar.f204198g;
        this.f204190n = aVar.f204199h;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0038  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static okhttp3.C90047d m156288a(okhttp3.C90198s r21) {
        /*
        // Method dump skipped, instructions count: 340
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.C90047d.m156288a(okhttp3.s):okhttp3.d");
    }

    private C90047d(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f204179c = z;
        this.f204180d = z2;
        this.f204181e = i;
        this.f204182f = i2;
        this.f204183g = z3;
        this.f204184h = z4;
        this.f204185i = z5;
        this.f204186j = i3;
        this.f204187k = i4;
        this.f204188l = z6;
        this.f204189m = z7;
        this.f204190n = z8;
        this.f204191o = str;
    }
}
