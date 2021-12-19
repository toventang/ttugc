package com.p2082ss.android.ugc.aweme.feed.widget;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.view.View;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.k */
public final class C50519k {

    /* renamed from: a */
    public float[] f116755a = new float[8];

    /* renamed from: b */
    public Path f116756b;

    /* renamed from: c */
    public Paint f116757c;

    /* renamed from: d */
    public boolean f116758d;

    /* renamed from: e */
    public int f116759e;

    /* renamed from: f */
    public int f116760f;

    /* renamed from: g */
    public ColorStateList f116761g;

    /* renamed from: h */
    public int f116762h;

    /* renamed from: i */
    public boolean f116763i;

    /* renamed from: j */
    public Region f116764j;

    /* renamed from: k */
    public RectF f116765k;

    static {
        Covode.recordClassIndex(59666);
    }

    /* renamed from: a */
    public final void mo85840a(View view) {
        float width;
        C89219l.m154721d(view, "");
        RectF rectF = this.f116765k;
        if (rectF == null) {
            C89219l.m154710a("mLayer");
        }
        int width2 = (int) rectF.width();
        RectF rectF2 = this.f116765k;
        if (rectF2 == null) {
            C89219l.m154710a("mLayer");
        }
        int height = (int) rectF2.height();
        RectF rectF3 = new RectF();
        rectF3.left = (float) view.getPaddingLeft();
        rectF3.top = (float) view.getPaddingTop();
        float f = (float) width2;
        rectF3.right = f - ((float) view.getPaddingRight());
        float f2 = (float) height;
        rectF3.bottom = f2 - ((float) view.getPaddingBottom());
        Path path = this.f116756b;
        if (path == null) {
            C89219l.m154710a("mClipPath");
        }
        path.reset();
        if (this.f116758d) {
            if (rectF3.width() >= rectF3.height()) {
                width = rectF3.height();
            } else {
                width = rectF3.width();
            }
            float f3 = width / 2.0f;
            float f4 = (float) (width2 / 2);
            float f5 = (float) (height / 2);
            PointF pointF = new PointF(f4, f5);
            if (Build.VERSION.SDK_INT <= 27) {
                Path path2 = this.f116756b;
                if (path2 == null) {
                    C89219l.m154710a("mClipPath");
                }
                path2.addCircle(pointF.x, pointF.y, f3, Path.Direction.CW);
                Path path3 = this.f116756b;
                if (path3 == null) {
                    C89219l.m154710a("mClipPath");
                }
                path3.moveTo(0.0f, 0.0f);
                Path path4 = this.f116756b;
                if (path4 == null) {
                    C89219l.m154710a("mClipPath");
                }
                path4.moveTo(f, f2);
            } else {
                float f6 = f5 - f3;
                Path path5 = this.f116756b;
                if (path5 == null) {
                    C89219l.m154710a("mClipPath");
                }
                path5.moveTo(rectF3.left, f6);
                Path path6 = this.f116756b;
                if (path6 == null) {
                    C89219l.m154710a("mClipPath");
                }
                path6.addCircle(pointF.x, f6 + f3, f3, Path.Direction.CW);
            }
        } else {
            Path path7 = this.f116756b;
            if (path7 == null) {
                C89219l.m154710a("mClipPath");
            }
            path7.addRoundRect(rectF3, this.f116755a, Path.Direction.CW);
        }
        Region region = new Region((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
        Region region2 = this.f116764j;
        if (region2 == null) {
            C89219l.m154710a("mAreaRegion");
        }
        Path path8 = this.f116756b;
        if (path8 == null) {
            C89219l.m154710a("mClipPath");
        }
        region2.setPath(path8, region);
    }
}
