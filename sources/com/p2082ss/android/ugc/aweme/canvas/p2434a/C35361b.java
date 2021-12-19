package com.p2082ss.android.ugc.aweme.canvas.p2434a;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.SparseBooleanArray;
import androidx.core.graphics.C0699a;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.canvas.a.b */
public final class C35361b {

    /* renamed from: c */
    static final AbstractC35364b f83416c = new AbstractC35364b() {
        /* class com.p2082ss.android.ugc.aweme.canvas.p2434a.C35361b.C353621 */

        static {
            Covode.recordClassIndex(42533);
        }

        @Override // com.p2082ss.android.ugc.aweme.canvas.p2434a.C35361b.AbstractC35364b
        /* renamed from: a */
        public final boolean mo62274a(float[] fArr) {
            if (fArr[2] < 0.95f && fArr[2] > 0.05f && (fArr[0] < 10.0f || fArr[0] > 37.0f || fArr[1] > 0.82f)) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: a */
    public final List<C35365c> f83417a;

    /* renamed from: b */
    public final C35365c f83418b = m72383b();

    /* renamed from: d */
    private final List<C35366c> f83419d;

    /* renamed from: e */
    private final Map<C35366c, C35365c> f83420e = new C0484a();

    /* renamed from: f */
    private final SparseBooleanArray f83421f = new SparseBooleanArray();

    /* renamed from: com.ss.android.ugc.aweme.canvas.a.b$b */
    public interface AbstractC35364b {
        static {
            Covode.recordClassIndex(42535);
        }

        /* renamed from: a */
        boolean mo62274a(float[] fArr);
    }

    /* renamed from: com.ss.android.ugc.aweme.canvas.a.b$c */
    public static final class C35365c {

        /* renamed from: a */
        public final int f83430a;

        /* renamed from: b */
        public final int f83431b;

        /* renamed from: c */
        private final int f83432c;

        /* renamed from: d */
        private final int f83433d;

        /* renamed from: e */
        private final int f83434e;

        /* renamed from: f */
        private boolean f83435f;

        /* renamed from: g */
        private int f83436g;

        /* renamed from: h */
        private int f83437h;

        /* renamed from: i */
        private float[] f83438i;

        static {
            Covode.recordClassIndex(42536);
        }

        public final int hashCode() {
            return (this.f83430a * 31) + this.f83431b;
        }

        /* renamed from: a */
        public final float[] mo62276a() {
            if (this.f83438i == null) {
                this.f83438i = new float[3];
            }
            C0699a.m2463a(this.f83432c, this.f83433d, this.f83434e, this.f83438i);
            return this.f83438i;
        }

        /* renamed from: b */
        private void m72388b() {
            int b;
            int b2;
            if (!this.f83435f) {
                int a = C0699a.m2461a(-1, this.f83430a, 4.5f);
                int a2 = C0699a.m2461a(-1, this.f83430a, 3.0f);
                if (a == -1 || a2 == -1) {
                    int a3 = C0699a.m2461a(-16777216, this.f83430a, 4.5f);
                    int a4 = C0699a.m2461a(-16777216, this.f83430a, 3.0f);
                    if (a3 == -1 || a4 == -1) {
                        if (a != -1) {
                            b = C0699a.m2464b(-1, a);
                        } else {
                            b = C0699a.m2464b(-16777216, a3);
                        }
                        this.f83437h = b;
                        if (a2 != -1) {
                            b2 = C0699a.m2464b(-1, a2);
                        } else {
                            b2 = C0699a.m2464b(-16777216, a4);
                        }
                        this.f83436g = b2;
                        this.f83435f = true;
                        return;
                    }
                    this.f83437h = C0699a.m2464b(-16777216, a3);
                    this.f83436g = C0699a.m2464b(-16777216, a4);
                    this.f83435f = true;
                    return;
                }
                this.f83437h = C0699a.m2464b(-1, a);
                this.f83436g = C0699a.m2464b(-1, a2);
                this.f83435f = true;
            }
        }

        public final String toString() {
            StringBuilder append = new StringBuilder(getClass().getSimpleName()).append(" [RGB: #").append(Integer.toHexString(this.f83430a)).append(']').append(" [HSL: ").append(Arrays.toString(mo62276a())).append(']').append(" [Population: ").append(this.f83431b).append(']').append(" [Title Text: #");
            m72388b();
            StringBuilder append2 = append.append(Integer.toHexString(this.f83436g)).append(']').append(" [Body Text: #");
            m72388b();
            return append2.append(Integer.toHexString(this.f83437h)).append(']').toString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                C35365c cVar = (C35365c) obj;
                if (this.f83431b == cVar.f83431b && this.f83430a == cVar.f83430a) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public C35365c(int i, int i2) {
            this.f83432c = Color.red(i);
            this.f83433d = Color.green(i);
            this.f83434e = Color.blue(i);
            this.f83430a = i;
            this.f83431b = i2;
        }
    }

    static {
        Covode.recordClassIndex(42532);
    }

    /* renamed from: b */
    private C35365c m72383b() {
        int size = this.f83417a.size();
        int i = Integer.MIN_VALUE;
        C35365c cVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            C35365c cVar2 = this.f83417a.get(i2);
            if (cVar2.f83431b > i) {
                i = cVar2.f83431b;
                cVar = cVar2;
            }
        }
        return cVar;
    }

    /* renamed from: a */
    public final void mo62273a() {
        int i;
        float f;
        float f2;
        float f3;
        int size = this.f83419d.size();
        char c = 0;
        int i2 = 0;
        while (i2 < size) {
            C35366c cVar = this.f83419d.get(i2);
            int length = cVar.f83447i.length;
            float f4 = 0.0f;
            float f5 = 0.0f;
            for (int i3 = 0; i3 < length; i3++) {
                float f6 = cVar.f83447i[i3];
                if (f6 > 0.0f) {
                    f5 += f6;
                }
            }
            if (f5 != 0.0f) {
                int length2 = cVar.f83447i.length;
                for (int i4 = 0; i4 < length2; i4++) {
                    if (cVar.f83447i[i4] > 0.0f) {
                        float[] fArr = cVar.f83447i;
                        fArr[i4] = fArr[i4] / f5;
                    }
                }
            }
            Map<C35366c, C35365c> map = this.f83420e;
            C35365c cVar2 = null;
            int size2 = this.f83417a.size();
            int i5 = 0;
            float f7 = 0.0f;
            while (i5 < size2) {
                C35365c cVar3 = this.f83417a.get(i5);
                float[] a = cVar3.mo62276a();
                if (a[1] >= cVar.f83445g[c] && a[1] <= cVar.f83445g[2] && a[2] >= cVar.f83446h[c] && a[2] <= cVar.f83446h[2] && !this.f83421f.get(cVar3.f83430a)) {
                    float[] a2 = cVar3.mo62276a();
                    C35365c cVar4 = this.f83418b;
                    if (cVar4 != null) {
                        i = cVar4.f83431b;
                    } else {
                        i = 1;
                    }
                    if (cVar.f83447i[c] > f4) {
                        f = cVar.f83447i[c] * (1.0f - Math.abs(a2[1] - cVar.f83445g[1]));
                    } else {
                        f = 0.0f;
                    }
                    if (cVar.f83447i[1] > f4) {
                        f2 = cVar.f83447i[1] * (1.0f - Math.abs(a2[2] - cVar.f83446h[1]));
                    } else {
                        f2 = 0.0f;
                    }
                    if (cVar.f83447i[2] > 0.0f) {
                        f3 = cVar.f83447i[2] * (((float) cVar3.f83431b) / ((float) i));
                    } else {
                        f3 = 0.0f;
                    }
                    float f8 = f + f2 + f3;
                    if (cVar2 == null || f8 > f7) {
                        cVar2 = cVar3;
                        f7 = f8;
                    }
                }
                i5++;
                c = 0;
                f4 = 0.0f;
            }
            if (cVar2 != null && cVar.f83448j) {
                this.f83421f.append(cVar2.f83430a, true);
            }
            map.put(cVar, cVar2);
            i2++;
            c = 0;
        }
        this.f83421f.clear();
    }

    /* renamed from: com.ss.android.ugc.aweme.canvas.a.b$a */
    public static final class C35363a {

        /* renamed from: a */
        public final List<C35365c> f83422a;

        /* renamed from: b */
        public final Bitmap f83423b;

        /* renamed from: c */
        public final List<C35366c> f83424c;

        /* renamed from: d */
        public int f83425d = 16;

        /* renamed from: e */
        public int f83426e = 12544;

        /* renamed from: f */
        public int f83427f = -1;

        /* renamed from: g */
        public final List<AbstractC35364b> f83428g;

        /* renamed from: h */
        public Rect f83429h;

        static {
            Covode.recordClassIndex(42534);
        }

        /* renamed from: a */
        public final int[] mo62275a(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[(width * height)];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.f83429h;
            if (rect == null) {
                return iArr;
            }
            int width2 = rect.width();
            int height2 = this.f83429h.height();
            int[] iArr2 = new int[(width2 * height2)];
            for (int i = 0; i < height2; i++) {
                System.arraycopy(iArr, ((this.f83429h.top + i) * width) + this.f83429h.left, iArr2, i * width2, width2);
            }
            return iArr2;
        }

        public C35363a(Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.f83424c = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f83428g = arrayList2;
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            arrayList2.add(C35361b.f83416c);
            this.f83423b = bitmap;
            this.f83422a = null;
            arrayList.add(C35366c.f83439a);
            arrayList.add(C35366c.f83440b);
            arrayList.add(C35366c.f83441c);
            arrayList.add(C35366c.f83442d);
            arrayList.add(C35366c.f83443e);
            arrayList.add(C35366c.f83444f);
        }
    }

    public C35361b(List<C35365c> list, List<C35366c> list2) {
        this.f83417a = list;
        this.f83419d = list2;
    }
}
