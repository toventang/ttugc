package com.p2082ss.android.ugc.aweme.friends.p3011a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.friends.a.h */
public final class C51460h extends RecyclerView.AbstractC1361h {

    /* renamed from: a */
    private final boolean f118607a;

    /* renamed from: b */
    private Context f118608b;

    /* renamed from: c */
    private Resources f118609c;

    /* renamed from: d */
    private float f118610d;

    /* renamed from: e */
    private Paint f118611e;

    /* renamed from: f */
    private Paint f118612f;

    /* renamed from: g */
    private int f118613g;

    /* renamed from: h */
    private int f118614h;

    /* renamed from: i */
    private float f118615i;

    /* renamed from: j */
    private Rect f118616j;

    /* renamed from: k */
    private String f118617k;

    /* renamed from: l */
    private C51452c f118618l;

    static {
        Covode.recordClassIndex(60719);
    }

    /* renamed from: a */
    private String m95846a(int i) {
        String str;
        int a = this.f118618l.mo86933a(i);
        if (a != -1) {
            str = (String) this.f118618l.getSections()[a];
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.f118617k)) {
            str = this.f118617k;
        }
        this.f118617k = str;
        return str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        super.onDraw(canvas, recyclerView, sVar);
    }

    public C51460h(Context context, C51452c cVar, boolean z) {
        this.f118608b = context;
        this.f118609c = context.getResources();
        this.f118610d = C13628n.m24520b(context, 32.0f);
        Paint paint = new Paint();
        this.f118611e = paint;
        paint.setColor(this.f118609c.getColor(R.color.l));
        Paint paint2 = new Paint();
        this.f118612f = paint2;
        paint2.setColor(this.f118609c.getColor(R.color.bx));
        this.f118612f.setTextSize(C13628n.m24520b(this.f118608b, 14.0f));
        if (C80471gb.m139482a()) {
            this.f118612f.setTextAlign(Paint.Align.RIGHT);
        }
        this.f118612f.setAntiAlias(true);
        Paint.FontMetrics fontMetrics = this.f118612f.getFontMetrics();
        this.f118613g = (int) (fontMetrics.bottom - fontMetrics.top);
        this.f118614h = (int) fontMetrics.bottom;
        this.f118615i = C13628n.m24520b(this.f118608b, 16.0f);
        this.f118616j = new Rect();
        this.f118618l = cVar;
        this.f118607a = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        RecyclerView.ViewHolder f;
        super.onDrawOver(canvas, recyclerView, sVar);
        int k = ((LinearLayoutManager) recyclerView.getLayoutManager()).mo4371k();
        int l = ((LinearLayoutManager) recyclerView.getLayoutManager()).mo4372l() - (this.f118607a ? 1 : 0);
        if (k != -1 && l > 0 && (f = recyclerView.mo4451f(k)) != null) {
            if (this.f118607a) {
                k--;
            }
            View view = f.itemView;
            String a = m95846a(k);
            if (!TextUtils.isEmpty(a)) {
                boolean z = true;
                int i = k + 1;
                if (m95846a(i) == null || TextUtils.equals(m95846a(i), a) || ((float) (view.getHeight() + view.getTop())) >= this.f118610d) {
                    z = false;
                } else {
                    canvas.save();
                    canvas.translate(0.0f, ((float) (view.getHeight() + view.getTop())) - this.f118610d);
                }
                this.f118616j.set(0, 0, recyclerView.getRight() - recyclerView.getPaddingRight(), (int) (((float) recyclerView.getPaddingTop()) + this.f118610d));
                this.f118611e.setColor(this.f118609c.getColor(R.color.l));
                if (C80471gb.m139482a()) {
                    canvas.drawRect((float) recyclerView.getPaddingEnd(), (float) recyclerView.getPaddingTop(), (float) (recyclerView.getRight() - recyclerView.getPaddingStart()), ((float) recyclerView.getPaddingTop()) + this.f118610d, this.f118611e);
                    float f2 = this.f118610d;
                    canvas.drawText(a, ((float) (view.getRight() - view.getPaddingStart())) - this.f118615i, ((((float) recyclerView.getPaddingTop()) + f2) - ((f2 - ((float) this.f118613g)) / 2.0f)) - ((float) this.f118614h), this.f118612f);
                } else {
                    canvas.drawRect((float) recyclerView.getPaddingLeft(), (float) recyclerView.getPaddingTop(), (float) (recyclerView.getRight() - recyclerView.getPaddingRight()), ((float) recyclerView.getPaddingTop()) + this.f118610d, this.f118611e);
                    float f3 = this.f118610d;
                    canvas.drawText(a, ((float) view.getPaddingLeft()) + this.f118615i, ((((float) recyclerView.getPaddingTop()) + f3) - ((f3 - ((float) this.f118613g)) / 2.0f)) - ((float) this.f118614h), this.f118612f);
                }
                if (z) {
                    canvas.restore();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        super.getItemOffsets(rect, view, recyclerView, sVar);
    }
}
