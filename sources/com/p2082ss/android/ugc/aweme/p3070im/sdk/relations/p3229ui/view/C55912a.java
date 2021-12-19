package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.view;

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
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.view.a */
public final class C55912a extends RecyclerView.AbstractC1361h {

    /* renamed from: a */
    public int f127499a;

    /* renamed from: b */
    public int f127500b = -1;

    /* renamed from: c */
    public boolean f127501c;

    /* renamed from: d */
    private Context f127502d;

    /* renamed from: e */
    private Resources f127503e;

    /* renamed from: f */
    private float f127504f;

    /* renamed from: g */
    private Paint f127505g;

    /* renamed from: h */
    private Paint f127506h;

    /* renamed from: i */
    private int f127507i;

    /* renamed from: j */
    private int f127508j;

    /* renamed from: k */
    private float f127509k;

    /* renamed from: l */
    private float f127510l;

    /* renamed from: m */
    private float f127511m;

    /* renamed from: n */
    private Rect f127512n;

    /* renamed from: o */
    private Rect f127513o;

    /* renamed from: p */
    private boolean f127514p;

    /* renamed from: q */
    private String f127515q;

    /* renamed from: r */
    private List<String> f127516r;

    /* renamed from: s */
    private List<Integer> f127517s;

    static {
        Covode.recordClassIndex(65704);
    }

    /* renamed from: a */
    private String m101712a(int i) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= this.f127517s.size()) {
                i2 = -1;
                break;
            }
            i3 += this.f127517s.get(i2).intValue();
            if (i < i3) {
                break;
            }
            i2++;
        }
        String str = null;
        if (i2 != -1) {
            str = this.f127516r.get(i2);
        }
        if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.f127515q)) {
            str = this.f127515q;
        }
        if ("recent".equals(str)) {
            str = this.f127502d.getString(R.string.cgc);
        } else if ("Friend".equals(str)) {
            str = this.f127502d.getString(R.string.cfi);
        } else if (i == 0) {
            int i4 = this.f127500b;
            if (i4 == 0) {
                str = this.f127502d.getString(R.string.cdw);
            } else if (i4 == -1 || i4 == 1) {
                str = this.f127502d.getString(R.string.cfh);
            }
        }
        this.f127515q = str;
        return str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        super.onDraw(canvas, recyclerView, sVar);
    }

    public C55912a(Context context, List<String> list, List<Integer> list2) {
        this.f127502d = context;
        this.f127503e = context.getResources();
        this.f127504f = C13628n.m24520b(context, 32.0f);
        Paint paint = new Paint();
        this.f127505g = paint;
        paint.setColor(this.f127503e.getColor(R.color.an));
        Paint paint2 = new Paint(1);
        this.f127506h = paint2;
        paint2.setColor(this.f127503e.getColor(R.color.c5));
        this.f127506h.setTextSize(C13628n.m24520b(this.f127502d, 13.0f));
        this.f127506h.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41573g));
        Paint.FontMetrics fontMetrics = this.f127506h.getFontMetrics();
        this.f127507i = (int) (fontMetrics.bottom - fontMetrics.top);
        this.f127508j = ((int) fontMetrics.bottom) - ((int) C13628n.m24520b(this.f127502d, 8.0f));
        this.f127509k = C13628n.m24520b(this.f127502d, 16.0f);
        this.f127512n = new Rect();
        this.f127510l = C13628n.m24520b(this.f127502d, 2.0f);
        this.f127511m = C13628n.m24520b(this.f127502d, 16.0f);
        float f = this.f127511m;
        this.f127513o = new Rect(0, 0, (int) f, (int) f);
        this.f127516r = list;
        this.f127517s = list2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
        int k;
        RecyclerView.ViewHolder f;
        super.onDrawOver(canvas, recyclerView, sVar);
        this.f127501c = false;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (linearLayoutManager != null && (k = linearLayoutManager.mo4371k()) != -1 && k >= this.f127499a && (f = recyclerView.mo4451f(k)) != null) {
            int i = k - this.f127499a;
            View view = f.itemView;
            String a = m101712a(i);
            if (!TextUtils.isEmpty(a)) {
                boolean z = true;
                this.f127501c = true;
                this.f127514p = false;
                if (TextUtils.equals(this.f127502d.getString(R.string.cfi), a)) {
                    this.f127514p = true;
                }
                int i2 = i + 1;
                if (m101712a(i2) == null || TextUtils.equals(m101712a(i2), a) || ((float) (view.getHeight() + view.getTop())) >= this.f127504f) {
                    z = false;
                } else {
                    canvas.save();
                    canvas.translate(0.0f, ((float) (view.getHeight() + view.getTop())) - this.f127504f);
                }
                this.f127512n.set(0, 0, recyclerView.getRight() - recyclerView.getPaddingRight(), (int) (((float) recyclerView.getPaddingTop()) + this.f127504f));
                this.f127505g.setColor(this.f127503e.getColor(R.color.l));
                canvas.drawRect((float) recyclerView.getPaddingLeft(), (float) recyclerView.getPaddingTop(), (float) (recyclerView.getRight() - recyclerView.getPaddingRight()), ((float) recyclerView.getPaddingTop()) + this.f127504f, this.f127505g);
                float f2 = this.f127504f;
                canvas.drawText(a, ((float) view.getPaddingLeft()) + this.f127509k, ((((float) recyclerView.getPaddingTop()) + f2) - ((f2 - ((float) this.f127507i)) / 2.0f)) - ((float) this.f127508j), this.f127506h);
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
