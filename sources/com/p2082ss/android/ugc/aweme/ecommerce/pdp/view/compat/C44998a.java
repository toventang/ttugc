package com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45563h;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.p4614a.AbstractC89196a;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.a */
public final class C44998a extends RecyclerView.AbstractC1361h {

    /* renamed from: d */
    public static final C44999a f104980d = new C44999a((byte) 0);

    /* renamed from: a */
    public final int f104981a;

    /* renamed from: b */
    public final int f104982b;

    /* renamed from: c */
    public final float f104983c;

    /* renamed from: e */
    private final Paint f104984e;

    static {
        Covode.recordClassIndex(53422);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.a$a */
    public static final class C44999a {
        static {
            Covode.recordClassIndex(53423);
        }

        private C44999a() {
        }

        public /* synthetic */ C44999a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m87686a(View view) {
            C89219l.m154721d(view, "");
            if (view.getTag(R.id.aaf) != null) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public static void m87685a(View view, boolean z) {
            C89219l.m154721d(view, "");
            if (z) {
                view.setTag(R.id.aaf, C89391z.f203057a);
            } else {
                view.setTag(R.id.aaf, null);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.a$b */
    public static final class C45000b implements AbstractC89196a, Iterable<View> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f104985a;

        static {
            Covode.recordClassIndex(53424);
        }

        /* Return type fixed from 'java.util.Iterator' to match base method */
        @Override // java.lang.Iterable
        public final /* synthetic */ Iterator<View> iterator() {
            return new Object(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C44998a.C45000b.C450011 */

                /* renamed from: a */
                public int f104986a;

                /* renamed from: b */
                final /* synthetic */ C45000b f104987b;

                static {
                    Covode.recordClassIndex(53425);
                }

                public final void remove() {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final boolean hasNext() {
                    if (this.f104986a < this.f104987b.f104985a.getChildCount()) {
                        return true;
                    }
                    return false;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.Iterator
                public final /* synthetic */ View next() {
                    ViewGroup viewGroup = this.f104987b.f104985a;
                    int i = this.f104986a;
                    this.f104986a = i + 1;
                    return viewGroup.getChildAt(i);
                }

                {
                    this.f104987b = r1;
                }
            };
        }

        public C45000b(ViewGroup viewGroup) {
            this.f104985a = viewGroup;
        }
    }

    public C44998a(int i, int i2, float f) {
        this.f104981a = i;
        this.f104982b = i2;
        this.f104983c = f;
        Paint paint = new Paint();
        this.f104984e = paint;
        paint.setColor(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        C89219l.m154721d(canvas, "");
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(sVar, "");
        super.onDraw(canvas, recyclerView, sVar);
        for (View view : new C45000b(recyclerView)) {
            if (C44999a.m87686a(view)) {
                int left = view.getLeft();
                int right = view.getRight();
                int bottom = view.getBottom();
                int bottom2 = view.getBottom() + this.f104982b;
                float f = this.f104983c;
                canvas.drawRect(((float) left) + f, (float) bottom, ((float) right) - f, (float) bottom2, this.f104984e);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C44998a(int i, int i2, float f, int i3) {
        this(i, (i3 & 2) != 0 ? 1 : i2, (i3 & 4) != 0 ? (float) C45563h.f106109e : f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        C89219l.m154721d(rect, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(sVar, "");
        if (C44999a.m87686a(view)) {
            rect.set(0, 0, 0, this.f104982b);
        }
    }
}
