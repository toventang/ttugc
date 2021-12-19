package com.p2082ss.android.ugc.aweme.friends.p3022ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.v */
public final class C51753v extends RecyclerView.AbstractC1361h {

    /* renamed from: a */
    public volatile boolean f119265a;

    /* renamed from: b */
    private Context f119266b;

    /* renamed from: c */
    private Resources f119267c;

    /* renamed from: d */
    private float f119268d;

    /* renamed from: e */
    private Paint f119269e;

    /* renamed from: f */
    private Paint f119270f;

    /* renamed from: g */
    private int f119271g;

    /* renamed from: h */
    private int f119272h;

    /* renamed from: i */
    private float f119273i;

    /* renamed from: j */
    private float f119274j;

    /* renamed from: k */
    private float f119275k;

    /* renamed from: l */
    private Bitmap f119276l;

    /* renamed from: m */
    private Bitmap f119277m;

    /* renamed from: n */
    private Rect f119278n;

    /* renamed from: o */
    private Rect f119279o;

    /* renamed from: p */
    private boolean f119280p;

    /* renamed from: q */
    private String f119281q;

    /* renamed from: r */
    private List<String> f119282r = new ArrayList();

    /* renamed from: s */
    private List<Integer> f119283s = new ArrayList();

    static {
        Covode.recordClassIndex(61116);
    }

    /* renamed from: a */
    private String m96428a(int i) {
        String str = null;
        if (this.f119265a) {
            return null;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= this.f119283s.size()) {
                break;
            }
            i3 += this.f119283s.get(i2).intValue();
            if (i >= i3) {
                i2++;
            } else if (i2 != -1) {
                str = this.f119282r.get(i2);
            }
        }
        if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.f119281q)) {
            str = this.f119281q;
        }
        if ("Recent".equals(str)) {
            str = this.f119266b.getString(R.string.g8l);
        } else if ("Friend".equals(str)) {
            str = this.f119266b.getString(R.string.ggm);
        } else if (i == 0) {
            str = this.f119266b.getString(R.string.v_);
        }
        this.f119281q = str;
        return str;
    }

    public C51753v(Context context, List<String> list, List<Integer> list2) {
        this.f119266b = context;
        this.f119267c = context.getResources();
        this.f119268d = C13628n.m24520b(context, 32.0f);
        Paint paint = new Paint();
        this.f119269e = paint;
        paint.setColor(859328726);
        Paint paint2 = new Paint();
        this.f119270f = paint2;
        paint2.setColor(this.f119267c.getColor(R.color.bx));
        this.f119270f.setTextSize(C13628n.m24520b(this.f119266b, 13.0f));
        Paint.FontMetrics fontMetrics = this.f119270f.getFontMetrics();
        this.f119271g = (int) (fontMetrics.bottom - fontMetrics.top);
        this.f119272h = (int) fontMetrics.bottom;
        this.f119273i = C13628n.m24520b(this.f119266b, 16.0f);
        this.f119278n = new Rect();
        this.f119274j = C13628n.m24520b(this.f119266b, 2.0f);
        this.f119276l = ((BitmapDrawable) this.f119267c.getDrawable(2131232231)).getBitmap();
        this.f119277m = ((BitmapDrawable) this.f119267c.getDrawable(2131232310)).getBitmap();
        this.f119275k = C13628n.m24520b(this.f119266b, 16.0f);
        float f = this.f119275k;
        this.f119279o = new Rect(0, 0, (int) f, (int) f);
        this.f119282r = list;
        this.f119283s = list2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        RecyclerView.ViewHolder f;
        super.onDrawOver(canvas, recyclerView, sVar);
        int k = ((LinearLayoutManager) recyclerView.getLayoutManager()).mo4371k();
        if (k != -1 && (f = recyclerView.mo4451f(k)) != null) {
            View view = f.itemView;
            String a = m96428a(k);
            if (!TextUtils.isEmpty(a)) {
                this.f119280p = false;
                boolean z = true;
                if (TextUtils.equals(this.f119266b.getString(R.string.ggm), a)) {
                    this.f119280p = true;
                }
                int i = k + 1;
                if (m96428a(i) == null || TextUtils.equals(m96428a(i), a) || ((float) (view.getHeight() + view.getTop())) >= this.f119268d) {
                    z = false;
                } else {
                    canvas.save();
                    canvas.translate(0.0f, ((float) (view.getHeight() + view.getTop())) - this.f119268d);
                }
                this.f119278n.set(0, 0, recyclerView.getRight() - recyclerView.getPaddingRight(), (int) (((float) recyclerView.getPaddingTop()) + this.f119268d));
                this.f119269e.setColor(this.f119267c.getColor(R.color.l));
                canvas.drawRect((float) recyclerView.getPaddingLeft(), (float) recyclerView.getPaddingTop(), (float) (recyclerView.getRight() - recyclerView.getPaddingRight()), ((float) recyclerView.getPaddingTop()) + this.f119268d, this.f119269e);
                float f2 = this.f119268d;
                canvas.drawText(a, ((float) view.getPaddingLeft()) + this.f119273i, ((((float) recyclerView.getPaddingTop()) + f2) - ((f2 - ((float) this.f119271g)) / 2.0f)) - ((float) this.f119272h), this.f119270f);
                if (this.f119280p) {
                    this.f119270f.getTextBounds(a, 0, a.length(), this.f119278n);
                    canvas.drawBitmap(this.f119277m, ((float) recyclerView.getPaddingLeft()) + this.f119273i + ((float) this.f119278n.width()) + this.f119274j, ((float) recyclerView.getPaddingTop()) + ((this.f119268d - ((float) this.f119271g)) / 2.0f) + ((float) this.f119272h), this.f119270f);
                } else if (TextUtils.equals(this.f119266b.getString(R.string.g8l), a)) {
                    this.f119270f.getTextBounds(a, 0, a.length(), this.f119278n);
                    float paddingLeft = ((float) recyclerView.getPaddingLeft()) + this.f119273i + ((float) this.f119278n.width()) + this.f119274j;
                    float paddingTop = ((((float) recyclerView.getPaddingTop()) + ((this.f119268d - ((float) this.f119271g)) / 2.0f)) + ((float) this.f119272h)) - this.f119274j;
                    float f3 = this.f119275k;
                    this.f119279o.set((int) paddingLeft, (int) paddingTop, (int) (paddingLeft + f3), (int) (paddingTop + f3));
                    canvas.drawBitmap(this.f119276l, (Rect) null, this.f119279o, this.f119270f);
                }
                if (z) {
                    canvas.restore();
                }
            }
        }
    }
}
