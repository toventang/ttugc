package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.utils.C11211ae;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.Random;
import java.util.WeakHashMap;

/* renamed from: com.bytedance.android.livesdk.widget.h */
public final class C11426h {

    /* renamed from: a */
    public static WeakHashMap<C11427a, Bitmap> f27388a = new WeakHashMap<>();

    /* renamed from: b */
    public static WeakReference<Bitmap> f27389b;

    /* renamed from: c */
    private static TypedArray f27390c = C3966y.m9655a().obtainTypedArray(R.array.av);

    /* renamed from: d */
    private static Random f27391d = new Random();

    /* renamed from: com.bytedance.android.livesdk.widget.h$a */
    public static final class C11427a {

        /* renamed from: a */
        public int f27392a;

        /* renamed from: b */
        public int f27393b;

        /* renamed from: c */
        public int f27394c;

        /* renamed from: d */
        public int f27395d = -1;

        static {
            Covode.recordClassIndex(13083);
        }

        public final int hashCode() {
            return ((((((this.f27392a + 629) * 37) + this.f27393b) * 37) + this.f27394c) * 37) + this.f27395d;
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof C11427a)) {
                C11427a aVar = (C11427a) obj;
                if (this.f27393b == aVar.f27393b && this.f27394c == aVar.f27394c && this.f27392a == aVar.f27392a && this.f27395d == aVar.f27395d) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public C11427a(int i, int i2, int i3) {
            this.f27393b = i2;
            this.f27394c = i3;
            this.f27392a = i;
        }
    }

    static {
        Covode.recordClassIndex(13082);
    }

    /* renamed from: a */
    public static Bitmap m20242a(Context context, String str) {
        int i;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.x2);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.x1);
        if (!TextUtils.isEmpty(str)) {
            try {
                i = Integer.valueOf(str).intValue();
            } catch (Exception e) {
                C3854a.m9455a(6, "HeartView", e.getStackTrace());
                i = f27391d.nextInt(f27390c.length());
            }
        } else {
            i = f27391d.nextInt(f27390c.length());
            C3854a.m9453a(3, "HeartView", "digg index is null, get random index!");
        }
        if (i < 0) {
            C3854a.m9453a(6, "HeartView", "the index from remote is negative number!");
            i = f27391d.nextInt(f27390c.length());
        }
        if (f27390c.length() <= 0) {
            return null;
        }
        TypedArray typedArray = f27390c;
        return C11211ae.m19868a(context, typedArray.getResourceId(i % typedArray.length(), 0), dimensionPixelSize, dimensionPixelSize2);
    }
}
