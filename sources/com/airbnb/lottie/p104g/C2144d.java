package com.airbnb.lottie.p104g;

import android.content.Context;
import android.os.Handler;
import com.airbnb.lottie.C2122g;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.p099e.p102c.C2091b;
import com.bytedance.covode.number.Covode;
import java.util.Random;

/* renamed from: com.airbnb.lottie.g.d */
public final class C2144d {

    /* renamed from: a */
    public static boolean f6474a;

    /* renamed from: b */
    public static String f6475b = "LOTTIE.TRACE";

    /* renamed from: c */
    public static boolean f6476c;

    /* renamed from: d */
    public static Handler f6477d = null;

    /* renamed from: e */
    public static Random f6478e;

    /* renamed from: com.airbnb.lottie.g.d$c */
    public interface AbstractC2147c {
        static {
            Covode.recordClassIndex(2342);
        }

        /* renamed from: a */
        void mo5890a(boolean z);
    }

    /* renamed from: com.airbnb.lottie.g.d$d */
    public interface AbstractC2148d {
        static {
            Covode.recordClassIndex(2343);
        }

        /* renamed from: a */
        void mo6049a(C2091b bVar);
    }

    /* renamed from: com.airbnb.lottie.g.d$a */
    public static class C2145a {

        /* renamed from: a */
        public static boolean f6479a;

        /* renamed from: b */
        public static boolean f6480b;

        /* renamed from: c */
        public static boolean f6481c;

        /* renamed from: d */
        public static boolean f6482d;

        /* renamed from: e */
        public static boolean f6483e;

        /* renamed from: f */
        public static boolean f6484f;

        /* renamed from: g */
        public static boolean f6485g;

        /* renamed from: h */
        public static boolean f6486h;

        /* renamed from: i */
        public static boolean f6487i;

        /* renamed from: j */
        public static boolean f6488j;

        /* renamed from: k */
        public static boolean f6489k = true;

        static {
            Covode.recordClassIndex(2340);
        }
    }

    /* renamed from: com.airbnb.lottie.g.d$e */
    public static class C2149e {

        /* renamed from: a */
        public static boolean f6504a;

        /* renamed from: b */
        public static int f6505b = 2;

        /* renamed from: c */
        public static boolean f6506c;

        /* renamed from: d */
        private static boolean f6507d;

        static {
            Covode.recordClassIndex(2344);
        }

        /* renamed from: a */
        public static void m6700a(Context context) {
            if (!f6507d && context != null && context.getResources() != null && context.getResources().getDisplayMetrics() != null) {
                float f = context.getResources().getDisplayMetrics().density;
                if (f < 2.0f && f > 0.01f) {
                    f6506c = true;
                } else if (C2145a.f6485g && f6504a) {
                    f6506c = true;
                }
                f6507d = true;
            }
        }
    }

    static {
        Covode.recordClassIndex(2339);
        C2150e.m6701a();
    }

    /* renamed from: a */
    public static void m6678a() {
        if (f6476c) {
            new Throwable("FOR LOTTIE DEBUG");
        }
    }

    /* renamed from: com.airbnb.lottie.g.d$b */
    public static class C2146b {

        /* renamed from: a */
        protected boolean f6490a;

        /* renamed from: b */
        protected boolean f6491b;

        /* renamed from: c */
        protected boolean f6492c;

        /* renamed from: d */
        protected boolean f6493d;

        /* renamed from: e */
        protected boolean f6494e;

        /* renamed from: f */
        protected boolean f6495f;

        /* renamed from: g */
        protected boolean f6496g;

        /* renamed from: h */
        protected boolean f6497h;

        /* renamed from: i */
        protected boolean f6498i;

        /* renamed from: j */
        protected boolean f6499j;

        /* renamed from: k */
        protected boolean f6500k;

        /* renamed from: l */
        protected boolean f6501l;

        /* renamed from: m */
        protected boolean f6502m;

        /* renamed from: n */
        protected int f6503n = 2;

        static {
            Covode.recordClassIndex(2341);
        }

        /* renamed from: a */
        public final C2146b mo6064a() {
            this.f6501l = false;
            return this;
        }

        /* renamed from: b */
        public final C2146b mo6066b() {
            this.f6502m = false;
            return this;
        }

        public final String toString() {
            return "Builder{optSwitch=" + this.f6490a + ", optInit=" + this.f6491b + ", optFrameRate=" + this.f6492c + ", optAsyncDraw=" + this.f6493d + ", optAutoRenderMode=" + this.f6494e + ", optSafeMode=" + this.f6495f + ", optMemory=" + this.f6496g + ", optMemoryInLowDevice=" + this.f6498i + ", optBitmapDrawFlagInLowDevice=" + this.f6499j + ", optClearCache=" + this.f6497h + ", isLowDevice=" + this.f6500k + ", maxAsyncDrawThreads=" + this.f6503n + '}';
        }

        /* renamed from: c */
        public final C2146b mo6068c(boolean z) {
            this.f6492c = z;
            return this;
        }

        /* renamed from: d */
        public final C2146b mo6069d(boolean z) {
            this.f6493d = z;
            return this;
        }

        /* renamed from: e */
        public final C2146b mo6070e(boolean z) {
            this.f6494e = z;
            return this;
        }

        /* renamed from: f */
        public final C2146b mo6071f(boolean z) {
            this.f6495f = z;
            return this;
        }

        /* renamed from: g */
        public final C2146b mo6072g(boolean z) {
            this.f6496g = z;
            return this;
        }

        /* renamed from: h */
        public final C2146b mo6073h(boolean z) {
            this.f6498i = z;
            return this;
        }

        /* renamed from: i */
        public final C2146b mo6074i(boolean z) {
            this.f6499j = z;
            return this;
        }

        /* renamed from: j */
        public final C2146b mo6075j(boolean z) {
            this.f6497h = z;
            return this;
        }

        /* renamed from: a */
        public final C2146b mo6065a(boolean z) {
            this.f6490a = z;
            return this;
        }

        /* renamed from: b */
        public final C2146b mo6067b(boolean z) {
            this.f6491b = z;
            return this;
        }
    }

    /* renamed from: b */
    public static void m6682b(C2122g gVar) {
        if (f6474a) {
            gVar.hashCode();
            gVar.isVisible();
            m6678a();
        }
    }

    /* renamed from: c */
    public static void m6683c(C2122g gVar) {
        if (f6474a) {
            gVar.hashCode();
            gVar.isVisible();
            m6678a();
        }
    }

    /* renamed from: d */
    public static void m6684d(C2122g gVar) {
        if (f6474a) {
            gVar.hashCode();
            gVar.isVisible();
            m6678a();
        }
    }

    /* renamed from: a */
    public static void m6681a(C2122g gVar) {
        if (f6474a) {
            gVar.hashCode();
            gVar.isVisible();
            m6678a();
        }
    }

    /* renamed from: e */
    public static void m6685e(C2122g gVar) {
        if (f6474a) {
            if (f6478e == null) {
                f6478e = new Random();
            }
            if (((double) f6478e.nextFloat()) < 0.01d) {
                gVar.hashCode();
                gVar.isVisible();
            }
        }
    }

    /* renamed from: a */
    public static void m6680a(C2146b bVar) {
        if (bVar.f6501l) {
            f6474a = true;
        }
        if (bVar.f6502m) {
            f6476c = true;
        }
        if (bVar.f6490a) {
            C2145a.f6479a = true;
            C2145a.f6480b = bVar.f6491b;
            C2145a.f6481c = bVar.f6492c;
            C2145a.f6482d = bVar.f6493d;
            C2145a.f6483e = bVar.f6494e;
            C2145a.f6488j = bVar.f6495f;
            C2145a.f6484f = bVar.f6496g;
            C2145a.f6485g = bVar.f6498i;
            C2145a.f6486h = bVar.f6499j;
            C2145a.f6487i = bVar.f6497h;
            C2149e.f6504a = bVar.f6500k;
            C2149e.f6505b = Math.max(bVar.f6503n, 1);
            return;
        }
        C2145a.f6479a = false;
        C2145a.f6480b = false;
        C2145a.f6481c = false;
        C2145a.f6482d = false;
        C2145a.f6483e = false;
        C2145a.f6488j = false;
        C2145a.f6484f = false;
        C2145a.f6485g = false;
        C2145a.f6486h = false;
        C2145a.f6487i = false;
        C2149e.f6504a = false;
    }

    /* renamed from: a */
    public static void m6679a(LottieAnimationView lottieAnimationView, C2122g gVar, Object obj) {
        Integer num;
        if (f6474a) {
            StringBuilder append = new StringBuilder("traceLottieViewSetAnimation  {value=").append(obj).append("  view=").append(lottieAnimationView.hashCode()).append(" visibility:").append(lottieAnimationView.getVisibility()).append(" drawable=");
            if (gVar != null) {
                num = Integer.valueOf(gVar.hashCode());
            } else {
                num = null;
            }
            append.append(num).append(" visible:").append(lottieAnimationView.isShown()).append("}");
            m6678a();
        }
    }
}
