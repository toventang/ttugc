package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.p4614a.AbstractC89196a;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.b */
public final class C44173b extends RecyclerView.AbstractC1361h {

    /* renamed from: b */
    public static final C44174a f103007b = new C44174a((byte) 0);

    /* renamed from: a */
    public final int f103008a;

    /* renamed from: c */
    private final Paint f103009c = new Paint();

    static {
        Covode.recordClassIndex(52484);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.b$a */
    public static final class C44174a {
        static {
            Covode.recordClassIndex(52485);
        }

        private C44174a() {
        }

        public /* synthetic */ C44174a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m86963a(View view, C44175b bVar) {
            C89219l.m154721d(view, "");
            view.setTag(R.id.aaf, bVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.b$c */
    public static final class C44176c implements AbstractC89196a, Iterable<View> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f103016a;

        static {
            Covode.recordClassIndex(52487);
        }

        /* Return type fixed from 'java.util.Iterator' to match base method */
        @Override // java.lang.Iterable
        public final /* synthetic */ Iterator<View> iterator() {
            return new Object(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.C44173b.C44176c.C441771 */

                /* renamed from: a */
                public int f103017a;

                /* renamed from: b */
                final /* synthetic */ C44176c f103018b;

                static {
                    Covode.recordClassIndex(52488);
                }

                public final void remove() {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final boolean hasNext() {
                    if (this.f103017a < this.f103018b.f103016a.getChildCount()) {
                        return true;
                    }
                    return false;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.Iterator
                public final /* synthetic */ View next() {
                    ViewGroup viewGroup = this.f103018b.f103016a;
                    int i = this.f103017a;
                    this.f103017a = i + 1;
                    return viewGroup.getChildAt(i);
                }

                {
                    this.f103018b = r1;
                }
            };
        }

        public C44176c(ViewGroup viewGroup) {
            this.f103016a = viewGroup;
        }
    }

    public C44173b(int i) {
        this.f103008a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        int bottom;
        int bottom2;
        C89219l.m154721d(canvas, "");
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(sVar, "");
        super.onDraw(canvas, recyclerView, sVar);
        for (View view : new C44176c(recyclerView)) {
            C89219l.m154721d(view, "");
            if (view.getTag(R.id.aaf) != null) {
                Object tag = view.getTag(R.id.aaf);
                if (!(tag instanceof C44175b)) {
                    tag = null;
                }
                C44175b bVar = (C44175b) tag;
                if (bVar != null) {
                    int left = view.getLeft();
                    int right = view.getRight();
                    if (bVar.f103015f) {
                        if (bVar.f103012c == 48) {
                            bottom2 = view.getTop() - bVar.f103010a;
                        } else {
                            bottom2 = view.getBottom();
                        }
                        this.f103009c.setColor(0);
                        canvas.drawRect((float) left, (float) bottom2, (float) right, (float) (bVar.f103010a + bottom2), this.f103009c);
                    }
                    if (bVar.f103014e) {
                        if (bVar.f103011b == 48) {
                            bottom = view.getTop() - bVar.f103013d;
                        } else {
                            bottom = view.getBottom();
                        }
                        this.f103009c.setColor(this.f103008a);
                        canvas.drawRect((float) left, (float) bottom, (float) right, (float) (bVar.f103013d + bottom), this.f103009c);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getItemOffsets(android.graphics.Rect r7, android.view.View r8, androidx.recyclerview.widget.RecyclerView r9, androidx.recyclerview.widget.RecyclerView.C1378s r10) {
        /*
            r6 = this;
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r7, r0)
            p4600h.p4611f.p4613b.C89219l.m154721d(r8, r0)
            p4600h.p4611f.p4613b.C89219l.m154721d(r9, r0)
            p4600h.p4611f.p4613b.C89219l.m154721d(r10, r0)
            r0 = 2131363205(0x7f0a0585, float:1.8346212E38)
            java.lang.Object r5 = r8.getTag(r0)
            boolean r0 = r5 instanceof com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.C44173b.C44175b
            if (r0 != 0) goto L_0x001a
            r5 = 0
        L_0x001a:
            com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.b$b r5 = (com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.C44173b.C44175b) r5
            if (r5 != 0) goto L_0x001f
            return
        L_0x001f:
            boolean r0 = r5.f103015f
            r2 = 48
            r4 = 0
            if (r0 == 0) goto L_0x004f
            int r0 = r5.f103012c
            if (r0 != r2) goto L_0x004b
            int r3 = r5.f103010a
        L_0x002c:
            r0 = 0
        L_0x002d:
            boolean r1 = r5.f103014e
            if (r1 == 0) goto L_0x0047
            int r1 = r5.f103011b
            if (r1 != r2) goto L_0x003b
            int r1 = r5.f103013d
            if (r3 >= r1) goto L_0x003b
            int r3 = r5.f103013d
        L_0x003b:
            int r2 = r5.f103011b
            r1 = 80
            if (r2 != r1) goto L_0x0047
            int r1 = r5.f103013d
            if (r0 >= r1) goto L_0x0047
            int r0 = r5.f103013d
        L_0x0047:
            r7.set(r4, r3, r4, r0)
            return
        L_0x004b:
            int r0 = r5.f103010a
            r3 = 0
            goto L_0x002d
        L_0x004f:
            r3 = 0
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.C44173b.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$s):void");
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.b$b */
    public static final class C44175b {

        /* renamed from: a */
        public final int f103010a;

        /* renamed from: b */
        public final int f103011b;

        /* renamed from: c */
        public final int f103012c;

        /* renamed from: d */
        public final int f103013d;

        /* renamed from: e */
        public final boolean f103014e;

        /* renamed from: f */
        public final boolean f103015f;

        static {
            Covode.recordClassIndex(52486);
        }

        public C44175b() {
            this(0, 0, 0, 0, false, false, 63);
        }

        private C44175b(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            this.f103010a = i;
            this.f103011b = i2;
            this.f103012c = i3;
            this.f103013d = i4;
            this.f103014e = z;
            this.f103015f = z2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C44175b(int i, int i2, int i3, int i4, boolean z, boolean z2, int i5) {
            this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 80 : i2, (i5 & 4) == 0 ? i3 : 80, (i5 & 8) != 0 ? 1 : i4, (i5 & 16) != 0 ? false : z, (i5 & 32) != 0 ? false : z2);
        }
    }
}
