package com.p2082ss.android.ugc.aweme.canvas.p2434a;

import android.graphics.Color;
import androidx.core.graphics.C0699a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.canvas.p2434a.C35361b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: com.ss.android.ugc.aweme.canvas.a.a */
public final class C35358a {

    /* renamed from: f */
    private static final Comparator<C35360a> f83400f = new Comparator<C35360a>() {
        /* class com.p2082ss.android.ugc.aweme.canvas.p2434a.C35358a.C353591 */

        static {
            Covode.recordClassIndex(42530);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(C35360a aVar, C35360a aVar2) {
            return aVar2.mo62268a() - aVar.mo62268a();
        }
    };

    /* renamed from: a */
    final int[] f83401a;

    /* renamed from: b */
    final int[] f83402b;

    /* renamed from: c */
    public final List<C35361b.C35365c> f83403c;

    /* renamed from: d */
    final C35361b.AbstractC35364b[] f83404d;

    /* renamed from: e */
    private final float[] f83405e = new float[3];

    /* renamed from: b */
    private static int m72376b(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.canvas.a.a$a */
    public class C35360a {

        /* renamed from: a */
        int f83406a;

        /* renamed from: c */
        private int f83408c;

        /* renamed from: d */
        private int f83409d;

        /* renamed from: e */
        private int f83410e;

        /* renamed from: f */
        private int f83411f;

        /* renamed from: g */
        private int f83412g;

        /* renamed from: h */
        private int f83413h;

        /* renamed from: i */
        private int f83414i;

        /* renamed from: j */
        private int f83415j;

        static {
            Covode.recordClassIndex(42531);
        }

        /* renamed from: f */
        private int m72377f() {
            return (this.f83406a + 1) - this.f83408c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final boolean mo62269b() {
            if (m72377f() > 1) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final int mo62268a() {
            return ((this.f83411f - this.f83410e) + 1) * ((this.f83413h - this.f83412g) + 1) * ((this.f83415j - this.f83414i) + 1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo62270c() {
            int[] iArr = C35358a.this.f83401a;
            int[] iArr2 = C35358a.this.f83402b;
            int i = Integer.MAX_VALUE;
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MIN_VALUE;
            int i7 = 0;
            for (int i8 = this.f83408c; i8 <= this.f83406a; i8++) {
                int i9 = iArr[i8];
                i7 += iArr2[i9];
                int i10 = (i9 >> 10) & 31;
                int i11 = (i9 >> 5) & 31;
                int i12 = i9 & 31;
                if (i10 > i4) {
                    i4 = i10;
                }
                if (i10 < i) {
                    i = i10;
                }
                if (i11 > i5) {
                    i5 = i11;
                }
                if (i11 < i2) {
                    i2 = i11;
                }
                if (i12 > i6) {
                    i6 = i12;
                }
                if (i12 < i3) {
                    i3 = i12;
                }
            }
            this.f83410e = i;
            this.f83411f = i4;
            this.f83412g = i2;
            this.f83413h = i5;
            this.f83414i = i3;
            this.f83415j = i6;
            this.f83409d = i7;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final int mo62271d() {
            int i;
            int i2 = this.f83411f - this.f83410e;
            int i3 = this.f83413h - this.f83412g;
            int i4 = this.f83415j - this.f83414i;
            if (i2 >= i3 && i2 >= i4) {
                i = -3;
            } else if (i3 < i2 || i3 < i4) {
                i = -1;
            } else {
                i = -2;
            }
            int[] iArr = C35358a.this.f83401a;
            int[] iArr2 = C35358a.this.f83402b;
            C35358a.m72374a(iArr, i, this.f83408c, this.f83406a);
            Arrays.sort(iArr, this.f83408c, this.f83406a + 1);
            C35358a.m72374a(iArr, i, this.f83408c, this.f83406a);
            int i5 = this.f83409d / 2;
            int i6 = this.f83408c;
            int i7 = 0;
            while (true) {
                int i8 = this.f83406a;
                if (i6 > i8) {
                    return this.f83408c;
                }
                i7 += iArr2[iArr[i6]];
                if (i7 >= i5) {
                    return Math.min(i8 - 1, i6);
                }
                i6++;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public final C35361b.C35365c mo62272e() {
            int[] iArr = C35358a.this.f83401a;
            int[] iArr2 = C35358a.this.f83402b;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = this.f83408c; i5 <= this.f83406a; i5++) {
                int i6 = iArr[i5];
                int i7 = iArr2[i6];
                i2 += i7;
                i += ((i6 >> 10) & 31) * i7;
                i3 += ((i6 >> 5) & 31) * i7;
                i4 += i7 * (i6 & 31);
            }
            float f = (float) i2;
            return new C35361b.C35365c(C35358a.m72371a(Math.round(((float) i) / f), Math.round(((float) i3) / f), Math.round(((float) i4) / f)), i2);
        }

        C35360a(int i, int i2) {
            this.f83408c = i;
            this.f83406a = i2;
            mo62270c();
        }
    }

    static {
        Covode.recordClassIndex(42529);
    }

    /* renamed from: a */
    private static int m72370a(int i) {
        return m72371a((i >> 10) & 31, (i >> 5) & 31, i & 31);
    }

    /* renamed from: a */
    private List<C35361b.C35365c> m72372a(Collection<C35360a> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (C35360a aVar : collection) {
            C35361b.C35365c e = aVar.mo62272e();
            if (!m72375a(e.mo62276a())) {
                arrayList.add(e);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private boolean m72375a(float[] fArr) {
        C35361b.AbstractC35364b[] bVarArr = this.f83404d;
        if (bVarArr != null && bVarArr.length > 0) {
            int length = bVarArr.length;
            for (int i = 0; i < length; i++) {
                if (!this.f83404d[i].mo62274a(fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static void m72373a(PriorityQueue<C35360a> priorityQueue, int i) {
        C35360a poll;
        while (priorityQueue.size() < i && (poll = priorityQueue.poll()) != null && poll.mo62269b()) {
            if (poll.mo62269b()) {
                int d = poll.mo62271d();
                C35360a aVar = new C35360a(d + 1, poll.f83406a);
                poll.f83406a = d;
                poll.mo62270c();
                priorityQueue.offer(aVar);
                priorityQueue.offer(poll);
            } else {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
        }
    }

    /* renamed from: a */
    static int m72371a(int i, int i2, int i3) {
        return Color.rgb(m72376b(i, 5, 8), m72376b(i2, 5, 8), m72376b(i3, 5, 8));
    }

    public C35358a(int[] iArr, int i, C35361b.AbstractC35364b[] bVarArr) {
        this.f83404d = bVarArr;
        int[] iArr2 = new int[32768];
        this.f83402b = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (((iArr[i2] >> 24) & 255) == 255) {
                int i3 = iArr[i2];
                int b = m72376b(Color.blue(i3), 8, 5) | (m72376b(Color.red(i3), 8, 5) << 10) | (m72376b(Color.green(i3), 8, 5) << 5);
                iArr[i2] = b;
                iArr2[b] = iArr2[b] + 1;
            }
        }
        int i4 = 0;
        int i5 = 0;
        do {
            if (iArr2[i4] > 0) {
                int a = m72370a(i4);
                C0699a.m2463a(Color.red(a), Color.green(a), Color.blue(a), this.f83405e);
                if (m72375a(this.f83405e)) {
                    iArr2[i4] = 0;
                }
            }
            i5 = iArr2[i4] > 0 ? i5 + 1 : i5;
            i4++;
        } while (i4 < 32768);
        int[] iArr3 = new int[i5];
        this.f83401a = iArr3;
        int i6 = 0;
        int i7 = 0;
        do {
            if (iArr2[i6] > 0) {
                iArr3[i7] = i6;
                i7++;
            }
            i6++;
        } while (i6 < 32768);
        if (i5 <= i) {
            this.f83403c = new ArrayList();
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = iArr3[i8];
                this.f83403c.add(new C35361b.C35365c(m72370a(i9), iArr2[i9]));
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i, f83400f);
        priorityQueue.offer(new C35360a(0, this.f83401a.length - 1));
        m72373a(priorityQueue, i);
        this.f83403c = m72372a(priorityQueue);
    }

    /* renamed from: a */
    static void m72374a(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = (i4 & 31) | (((i4 >> 5) & 31) << 10) | (((i4 >> 10) & 31) << 5);
                i2++;
            }
        } else if (i == -1) {
            while (i2 <= i3) {
                int i5 = iArr[i2];
                iArr[i2] = ((i5 >> 10) & 31) | ((i5 & 31) << 10) | (((i5 >> 5) & 31) << 5);
                i2++;
            }
        }
    }
}
