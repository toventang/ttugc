package com.p2082ss.android.ugc.aweme.p2307ai;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ai.b */
public final class C33469b extends RecyclerView.AbstractC1361h {

    /* renamed from: c */
    public static final C33470a f79528c = new C33470a((byte) 0);

    /* renamed from: a */
    public int f79529a;

    /* renamed from: b */
    public int f79530b;

    /* renamed from: d */
    private Drawable f79531d;

    /* renamed from: e */
    private int f79532e;

    /* renamed from: f */
    private final Rect f79533f = new Rect();

    static {
        Covode.recordClassIndex(40326);
    }

    /* renamed from: com.ss.android.ugc.aweme.ai.b$a */
    public static final class C33470a {
        static {
            Covode.recordClassIndex(40327);
        }

        private C33470a() {
        }

        public /* synthetic */ C33470a(byte b) {
            this();
        }
    }

    public C33469b(Drawable drawable) {
        C89219l.m154721d(drawable, "");
        this.f79531d = drawable;
        this.f79532e = 1;
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
            if (this.f79532e == 1) {
                canvas.save();
                if (recyclerView.getClipToPadding()) {
                    i2 = recyclerView.getPaddingLeft();
                    width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    canvas.clipRect(i2, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                } else {
                    width = recyclerView.getWidth();
                    i2 = 0;
                }
                int i4 = i2 + this.f79529a;
                int i5 = width - this.f79530b;
                int childCount = recyclerView.getChildCount() - 1;
                while (i3 < childCount) {
                    View childAt = recyclerView.getChildAt(i3);
                    RecyclerView.m4262a(childAt, this.f79533f);
                    int i6 = this.f79533f.bottom;
                    C89219l.m154716b(childAt, "");
                    int round = i6 + Math.round(childAt.getTranslationY());
                    this.f79531d.setBounds(i4, round - this.f79531d.getIntrinsicHeight(), i5, round);
                    this.f79531d.draw(canvas);
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
            int i7 = i + this.f79529a;
            int i8 = height - this.f79530b;
            int childCount2 = recyclerView.getChildCount() - 1;
            while (i3 < childCount2) {
                View childAt2 = recyclerView.getChildAt(i3);
                if (recyclerView.getLayoutManager() == null) {
                    C89219l.m154715b();
                }
                RecyclerView.m4262a(childAt2, this.f79533f);
                int i9 = this.f79533f.right;
                C89219l.m154716b(childAt2, "");
                int round2 = i9 + Math.round(childAt2.getTranslationX());
                this.f79531d.setBounds(round2 - this.f79531d.getIntrinsicWidth(), i7, round2, i8);
                this.f79531d.draw(canvas);
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
        if (this.f79532e == 1) {
            rect.set(0, 0, 0, this.f79531d.getIntrinsicHeight());
        } else {
            rect.set(0, 0, this.f79531d.getIntrinsicWidth(), 0);
        }
    }
}
