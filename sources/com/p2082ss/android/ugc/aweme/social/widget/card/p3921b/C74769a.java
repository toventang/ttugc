package com.p2082ss.android.ugc.aweme.social.widget.card.p3921b;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.b.a */
public final class C74769a extends RecyclerView.AbstractC1361h {

    /* renamed from: a */
    private final AbstractC89244h f168068a = C89250i.m154773a((AbstractC89171a) C74770a.f168069a);

    static {
        Covode.recordClassIndex(87614);
    }

    /* renamed from: a */
    private final Paint m131278a() {
        return (Paint) this.f168068a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.b.a$a */
    static final class C74770a extends AbstractC89220m implements AbstractC89171a<Paint> {

        /* renamed from: a */
        public static final C74770a f168069a = new C74770a();

        static {
            Covode.recordClassIndex(87615);
        }

        C74770a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Paint invoke() {
            Paint paint = new Paint(1);
            paint.setColor(0);
            paint.setStyle(Paint.Style.FILL);
            return paint;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        C89219l.m154721d(canvas, "");
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(sVar, "");
        float measuredHeight = (float) recyclerView.getMeasuredHeight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int d = RecyclerView.m4277d(childAt);
            int childCount2 = recyclerView.getChildCount();
            if (d >= 0 && childCount2 >= d) {
                C89219l.m154716b(childAt, "");
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                float right = (float) (childAt.getRight() + ((RecyclerView.C1367j) layoutParams).leftMargin);
                float f = right - C74771b.f168070a;
                canvas.drawRect(f, 0.0f, f, 0.0f, m131278a());
                canvas.drawRect(right, measuredHeight, right, measuredHeight, m131278a());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        C89219l.m154721d(rect, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(sVar, "");
        rect.set(0, 0, (int) C74771b.f168070a, 0);
    }
}
