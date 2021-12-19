package com.p2082ss.android.ugc.aweme.friends.p3011a;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.a.e */
public class C51454e extends RecyclerView.AbstractC1361h {

    /* renamed from: b */
    public static final C51455a f118598b = new C51455a((byte) 0);

    /* renamed from: a */
    private final Drawable f118599a;

    /* renamed from: c */
    private int f118600c;

    /* renamed from: d */
    private int f118601d;

    /* renamed from: e */
    private final Rect f118602e;

    /* renamed from: f */
    private final int f118603f;

    /* renamed from: g */
    private final int f118604g;

    /* renamed from: h */
    private final int f118605h = 1;

    static {
        Covode.recordClassIndex(60713);
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.a.e$a */
    public static final class C51455a {
        static {
            Covode.recordClassIndex(60714);
        }

        private C51455a() {
        }

        public /* synthetic */ C51455a(byte b) {
            this();
        }
    }

    public C51454e(int i, int i2, int i3) {
        this.f118603f = i2;
        this.f118604g = i3;
        this.f118599a = new ColorDrawable(i);
        this.f118602e = new Rect();
        this.f118601d = 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        int height;
        int i;
        int width;
        int i2;
        C89219l.m154721d(canvas, "");
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(sVar, "");
        if (recyclerView.getLayoutManager() != null) {
            int i3 = 0;
            if (this.f118601d == 1) {
                canvas.save();
                if (recyclerView.getClipToPadding()) {
                    i2 = recyclerView.getPaddingLeft();
                    width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    canvas.clipRect(i2, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                } else {
                    width = recyclerView.getWidth();
                    i2 = 0;
                }
                int childCount = recyclerView.getChildCount();
                while (i3 < childCount) {
                    View childAt = recyclerView.getChildAt(i3);
                    RecyclerView.m4262a(childAt, this.f118602e);
                    int i4 = this.f118602e.bottom;
                    C89219l.m154716b(childAt, "");
                    int round = i4 + Math.round(childAt.getTranslationY());
                    this.f118599a.setBounds(this.f118603f + i2, round - this.f118605h, width - this.f118604g, round);
                    this.f118599a.draw(canvas);
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
            int childCount2 = recyclerView.getChildCount();
            while (i3 < childCount2) {
                View childAt2 = recyclerView.getChildAt(i3);
                if (recyclerView.getLayoutManager() == null) {
                    C89219l.m154715b();
                }
                RecyclerView.m4262a(childAt2, this.f118602e);
                int i5 = this.f118602e.right;
                C89219l.m154716b(childAt2, "");
                int round2 = i5 + Math.round(childAt2.getTranslationX());
                this.f118599a.setBounds(round2 - this.f118599a.getIntrinsicWidth(), i, round2, height);
                this.f118599a.draw(canvas);
                i3++;
            }
            canvas.restore();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        C89219l.m154721d(rect, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(sVar, "");
        if (this.f118601d == 1) {
            rect.set(0, 0, 0, this.f118600c);
        } else {
            rect.set(0, 0, this.f118605h, 0);
        }
    }
}
