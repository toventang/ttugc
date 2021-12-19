package com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.view;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.view.a */
public final class C44621a extends RecyclerView.AbstractC1361h {

    /* renamed from: a */
    public static final C44622a f104090a = new C44622a((byte) 0);

    /* renamed from: b */
    private final Rect f104091b;

    /* renamed from: c */
    private final int f104092c = 1;

    /* renamed from: d */
    private final Drawable f104093d;

    static {
        Covode.recordClassIndex(52999);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.view.a$a */
    public static final class C44622a {
        static {
            Covode.recordClassIndex(53000);
        }

        private C44622a() {
        }

        public /* synthetic */ C44622a(byte b) {
            this();
        }
    }

    public C44621a(Drawable drawable) {
        C89219l.m154721d(drawable, "");
        this.f104093d = drawable;
        this.f104091b = new Rect();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        int height;
        int i;
        int width;
        int i2;
        C89219l.m154721d(canvas, "");
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(sVar, "");
        if (recyclerView.getLayoutManager() != null) {
            int i3 = 0;
            if (this.f104092c == 1) {
                canvas.save();
                if (recyclerView.getClipToPadding()) {
                    i2 = recyclerView.getPaddingLeft();
                    width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    canvas.clipRect(i2, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                } else {
                    width = recyclerView.getWidth();
                    i2 = 0;
                }
                int childCount = recyclerView.getChildCount() - 1;
                while (i3 < childCount) {
                    View childAt = recyclerView.getChildAt(i3);
                    RecyclerView.m4262a(childAt, this.f104091b);
                    int i4 = this.f104091b.bottom;
                    C89219l.m154716b(childAt, "");
                    int a = i4 + C89241a.m154730a(childAt.getTranslationY());
                    this.f104093d.setBounds(i2, a - this.f104093d.getIntrinsicHeight(), width, a);
                    this.f104093d.draw(canvas);
                    i3++;
                }
                canvas.restore();
                return;
            }
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                i = recyclerView.getPaddingTop();
                height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                canvas.clipRect(recyclerView.getPaddingLeft(), i, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
            } else {
                height = recyclerView.getHeight();
                i = 0;
            }
            int childCount2 = recyclerView.getChildCount() - 1;
            while (i3 < childCount2) {
                View childAt2 = recyclerView.getChildAt(i3);
                if (recyclerView.getLayoutManager() == null) {
                    C89219l.m154715b();
                }
                RecyclerView.m4262a(childAt2, this.f104091b);
                int i5 = this.f104091b.right;
                C89219l.m154716b(childAt2, "");
                int a2 = i5 + C89241a.m154730a(childAt2.getTranslationX());
                this.f104093d.setBounds(a2 - this.f104093d.getIntrinsicWidth(), i, a2, height);
                this.f104093d.draw(canvas);
                i3++;
            }
            canvas.restore();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        C89219l.m154721d(rect, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(sVar, "");
        if (this.f104092c == 1) {
            rect.set(0, 0, 0, this.f104093d.getIntrinsicHeight());
        } else {
            rect.set(0, 0, this.f104093d.getIntrinsicWidth(), 0);
        }
    }
}
