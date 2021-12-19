package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.p3813a.C71034a;
import com.p2082ss.android.ugc.tools.utils.C84908o;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.aj */
public final class C71044aj implements AbstractC45904h<C71034a>, Cloneable {

    /* renamed from: n */
    private static final float f159050n = C13628n.m24520b(C63247i.f143610a, 44.0f);

    /* renamed from: o */
    private static final int f159051o = ((int) C13628n.m24520b(C63247i.f143610a, 12.0f));

    /* renamed from: a */
    public float f159052a = 0.15f;

    /* renamed from: b */
    public float f159053b = 3.0f;

    /* renamed from: c */
    public StickerItemModel f159054c;

    /* renamed from: d */
    public boolean f159055d;

    /* renamed from: e */
    Paint f159056e = new Paint();

    /* renamed from: f */
    public RectF f159057f;

    /* renamed from: g */
    public RectF f159058g;

    /* renamed from: h */
    public Matrix f159059h;

    /* renamed from: i */
    public long f159060i;

    /* renamed from: j */
    public boolean f159061j = true;

    /* renamed from: k */
    PointF[] f159062k = new PointF[4];

    /* renamed from: l */
    public float f159063l = 1.0f;

    /* renamed from: m */
    public boolean f159064m = false;

    /* renamed from: p */
    private final C71050c f159065p;

    /* renamed from: q */
    private PointF[] f159066q = {new PointF(), new PointF(), new PointF(), new PointF()};

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h
    /* renamed from: d */
    public final int mo65022d() {
        return this.f159054c.uiStartTime;
    }

    public final int hashCode() {
        return this.f159054c.hashCode();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public C71044aj clone() {
        try {
            return (C71044aj) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    static {
        Covode.recordClassIndex(83542);
    }

    /* renamed from: b */
    private void m125439b() {
        int i = 0;
        do {
            this.f159062k[i] = new PointF();
            i++;
        } while (i < 4);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public C71034a mo65021c() {
        return new C71034a(this.f159054c.startTime, this.f159054c.endTime, this.f159054c.rotateAngle, this.f159054c.scale, this.f159054c.currentOffsetX, this.f159054c.currentOffsetY);
    }

    /* renamed from: a */
    private void m125438a() {
        RectF rectF = this.f159058g;
        float f = rectF.left;
        int i = f159051o;
        rectF.left = f - ((float) i);
        this.f159058g.right += (float) i;
        this.f159058g.top -= (float) i;
        this.f159058g.bottom += (float) i;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h
    /* renamed from: a */
    public final int mo65014a(int i) {
        return this.f159054c.startTime;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h
    /* renamed from: b */
    public final int mo65018b(int i) {
        return this.f159054c.endTime;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h
    /* renamed from: c */
    public final int mo65020c(int i) {
        return this.f159054c.uiEndTime;
    }

    /* renamed from: a */
    public final void mo112208a(float f) {
        if (f != 0.0f) {
            this.f159059h.postRotate(f, this.f159057f.centerX(), this.f159057f.centerY());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C71044aj)) {
            return false;
        }
        return this.f159054c.equals(((C71044aj) obj).f159054c);
    }

    /* renamed from: b */
    public final void mo112211b(float f) {
        float f2 = this.f159057f.right;
        float f3 = this.f159057f.left;
        float f4 = this.f159057f.bottom;
        float f5 = this.f159057f.top;
        this.f159063l *= f;
        this.f159059h.postScale(f, f, this.f159057f.centerX(), this.f159057f.centerY());
        C84908o.m145918a(this.f159057f, f);
        this.f159058g.set(this.f159057f);
        m125438a();
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45897c
    public final void setAlpha(boolean z) {
        if (z) {
            this.f159065p.f159077e.mo56336c(this.f159054c.getId(), 1.0f);
        } else {
            this.f159065p.f159077e.mo56336c(this.f159054c.getId(), 0.3137255f);
        }
    }

    /* renamed from: c */
    public final PointF[] mo112212c(float f) {
        this.f159066q[0].x = this.f159057f.left;
        this.f159066q[0].y = this.f159057f.top;
        this.f159066q[1].x = this.f159057f.right;
        this.f159066q[1].y = this.f159057f.top;
        this.f159066q[2].x = this.f159057f.right;
        this.f159066q[2].y = this.f159057f.bottom;
        this.f159066q[3].x = this.f159057f.left;
        this.f159066q[3].y = this.f159057f.bottom;
        for (PointF pointF : this.f159066q) {
            C84908o.m145916a(pointF, this.f159057f.centerX(), this.f159057f.centerY(), (float) Math.toRadians((double) this.f159054c.rotateAngle));
        }
        this.f159066q[0].x -= f;
        this.f159066q[1].x -= f;
        this.f159066q[2].x -= f;
        this.f159066q[3].x -= f;
        return this.f159066q;
    }

    /* renamed from: a */
    public final void mo112209a(float f, float f2) {
        this.f159059h.postTranslate(f, f2);
        this.f159057f.offset(f, f2);
        this.f159058g.offset(f, f2);
    }

    public C71044aj(Context context, StickerItemModel stickerItemModel, C71050c cVar) {
        this.f159054c = stickerItemModel;
        this.f159065p = cVar;
        this.f159056e.setColor(C0643b.m2378c(context, R.color.l));
        this.f159056e.setStyle(Paint.Style.STROKE);
        this.f159056e.setAntiAlias(true);
        this.f159056e.setStrokeWidth(2.0f);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.sticker.data.e, int, int] */
    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h
    /* renamed from: a */
    public final /* synthetic */ void mo65017a(C71034a aVar, int i, int i2) {
        C71034a aVar2 = aVar;
        C71050c cVar = this.f159065p;
        cVar.mo112229a(this, aVar2.f159031a, aVar2.f159032b);
        C71034a f = mo65021c();
        cVar.mo112228a(this, (aVar2.f159035e - f.f159035e) * ((float) i), (aVar2.f159036f - f.f159036f) * ((float) i2));
        cVar.mo112227a(this, aVar2.f159033c - f.f159033c);
        cVar.mo112233b(this, aVar2.f159034d / f.f159034d);
    }

    /* renamed from: a */
    public final boolean mo112210a(int i, int i2, int i3, int i4) {
        float f = (float) i;
        float f2 = ((f * 0.5f) - (this.f159054c.initWidth / 2.0f)) + ((float) i3);
        float f3 = ((((float) i2) * 0.5f) - (this.f159054c.initHeight / 2.0f)) + ((float) i4);
        this.f159057f = new RectF(f2, f3, this.f159054c.initWidth + f2, this.f159054c.initHeight + f3);
        this.f159059h = new Matrix();
        float f4 = f159050n;
        this.f159052a = Math.max(f4 / this.f159054c.initWidth, f4 / this.f159054c.initHeight);
        if (this.f159054c.isMagnifier()) {
            this.f159052a = Math.max(f4 / this.f159054c.initWidth, f4 / this.f159054c.initHeight);
            this.f159053b = f / this.f159054c.initWidth;
        } else {
            this.f159052a = Math.max(f4 / this.f159054c.initWidth, f4 / this.f159054c.initHeight);
        }
        this.f159058g = new RectF(this.f159057f);
        m125438a();
        m125439b();
        return true;
    }
}
