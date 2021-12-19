package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.recyclerview.widget.k */
public class C1455k extends RecyclerView.AbstractC1361h {

    /* renamed from: b */
    private static final int[] f4787b = {16843284};

    /* renamed from: a */
    public Drawable f4788a;

    /* renamed from: c */
    private int f4789c;

    /* renamed from: d */
    private final Rect f4790d = new Rect();

    static {
        Covode.recordClassIndex(1593);
    }

    /* renamed from: a */
    public final void mo4960a(Drawable drawable) {
        if (drawable != null) {
            this.f4788a = drawable;
            return;
        }
        throw new IllegalArgumentException("Drawable cannot be null.");
    }

    public C1455k(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f4787b);
        this.f4788a = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        this.f4789c = 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        int height;
        int i;
        int width;
        int i2;
        if (recyclerView.getLayoutManager() != null && this.f4788a != null) {
            int i3 = 0;
            if (this.f4789c == 1) {
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
                    RecyclerView.m4262a(childAt, this.f4790d);
                    int round = this.f4790d.bottom + Math.round(childAt.getTranslationY());
                    this.f4788a.setBounds(i2, round - this.f4788a.getIntrinsicHeight(), width, round);
                    this.f4788a.draw(canvas);
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
                recyclerView.getLayoutManager();
                RecyclerView.m4262a(childAt2, this.f4790d);
                int round2 = this.f4790d.right + Math.round(childAt2.getTranslationX());
                this.f4788a.setBounds(round2 - this.f4788a.getIntrinsicWidth(), i, round2, height);
                this.f4788a.draw(canvas);
                i3++;
            }
            canvas.restore();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        Drawable drawable = this.f4788a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f4789c == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }
}
