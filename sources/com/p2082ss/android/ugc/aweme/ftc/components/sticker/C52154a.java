package com.p2082ss.android.ugc.aweme.ftc.components.sticker;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.ftc.components.sticker.info.C52263h;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.p3813a.C71034a;
import com.p2082ss.android.ugc.tools.utils.C84908o;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.a */
public final class C52154a implements AbstractC45904h<C71034a>, Cloneable {

    /* renamed from: m */
    private static final float f120148m = C13628n.m24520b(C63247i.f143610a, 44.0f);

    /* renamed from: n */
    private static final int f120149n = ((int) C13628n.m24520b(C63247i.f143610a, 12.0f));

    /* renamed from: a */
    public float f120150a;

    /* renamed from: b */
    public StickerItemModel f120151b;

    /* renamed from: c */
    public boolean f120152c;

    /* renamed from: d */
    public Paint f120153d;

    /* renamed from: e */
    public RectF f120154e;

    /* renamed from: f */
    public RectF f120155f;

    /* renamed from: g */
    public Matrix f120156g;

    /* renamed from: h */
    public long f120157h;

    /* renamed from: i */
    public boolean f120158i;

    /* renamed from: j */
    public PointF[] f120159j;

    /* renamed from: k */
    public float f120160k;

    /* renamed from: l */
    public boolean f120161l;

    /* renamed from: o */
    private final C52263h f120162o;

    /* renamed from: p */
    private PointF[] f120163p;

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h
    /* renamed from: d */
    public final int mo65022d() {
        return this.f120151b.uiStartTime;
    }

    public final int hashCode() {
        return this.f120151b.hashCode();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C52154a clone() {
        try {
            return (C52154a) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    static {
        Covode.recordClassIndex(61535);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C71034a mo65021c() {
        return new C71034a(this.f120151b.startTime, this.f120151b.endTime, this.f120151b.rotateAngle, this.f120151b.scale, this.f120151b.currentOffsetX, this.f120151b.currentOffsetY);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h
    /* renamed from: a */
    public final int mo65014a(int i) {
        return this.f120151b.startTime;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h
    /* renamed from: b */
    public final int mo65018b(int i) {
        return this.f120151b.endTime;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h
    /* renamed from: c */
    public final int mo65020c(int i) {
        return this.f120151b.uiEndTime;
    }

    /* renamed from: a */
    public final void mo87875a(float f) {
        if (f != 0.0f) {
            this.f120156g.postRotate(f, this.f120154e.centerX(), this.f120154e.centerY());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C52154a)) {
            return false;
        }
        return this.f120151b.equals(((C52154a) obj).f120151b);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45897c
    public final void setAlpha(boolean z) {
        if (z) {
            this.f120162o.f120401d.mo56336c(this.f120151b.getId(), 1.0f);
        } else {
            this.f120162o.f120401d.mo56336c(this.f120151b.getId(), 0.3137255f);
        }
    }

    /* renamed from: b */
    public final void mo87877b(float f) {
        float f2 = this.f120154e.right;
        float f3 = this.f120154e.left;
        float f4 = this.f120154e.bottom;
        float f5 = this.f120154e.top;
        this.f120160k *= f;
        this.f120156g.postScale(f, f, this.f120154e.centerX(), this.f120154e.centerY());
        C84908o.m145918a(this.f120154e, f);
        this.f120155f.set(this.f120154e);
        RectF rectF = this.f120155f;
        float f6 = rectF.left;
        int i = f120149n;
        rectF.left = f6 - ((float) i);
        this.f120155f.right += (float) i;
        this.f120155f.top -= (float) i;
        this.f120155f.bottom += (float) i;
    }

    /* renamed from: c */
    public final PointF[] mo87878c(float f) {
        this.f120163p[0].x = this.f120154e.left;
        this.f120163p[0].y = this.f120154e.top;
        this.f120163p[1].x = this.f120154e.right;
        this.f120163p[1].y = this.f120154e.top;
        this.f120163p[2].x = this.f120154e.right;
        this.f120163p[2].y = this.f120154e.bottom;
        this.f120163p[3].x = this.f120154e.left;
        this.f120163p[3].y = this.f120154e.bottom;
        for (PointF pointF : this.f120163p) {
            C84908o.m145916a(pointF, this.f120154e.centerX(), this.f120154e.centerY(), (float) Math.toRadians((double) this.f120151b.rotateAngle));
        }
        this.f120163p[0].x -= f;
        this.f120163p[1].x -= f;
        this.f120163p[2].x -= f;
        this.f120163p[3].x -= f;
        return this.f120163p;
    }

    /* renamed from: a */
    public final void mo87876a(float f, float f2) {
        this.f120156g.postTranslate(f, f2);
        this.f120154e.offset(f, f2);
        this.f120155f.offset(f, f2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.sticker.data.e, int, int] */
    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h
    /* renamed from: a */
    public final /* synthetic */ void mo65017a(C71034a aVar, int i, int i2) {
        C71034a aVar2 = aVar;
        C52263h hVar = this.f120162o;
        hVar.mo88004a(this, aVar2.f159031a, aVar2.f159032b);
        C71034a b = mo65021c();
        hVar.mo88003a(this, (aVar2.f159035e - b.f159035e) * ((float) i), (aVar2.f159036f - b.f159036f) * ((float) i2));
        hVar.mo88002a(this, aVar2.f159033c - b.f159033c);
        hVar.mo88008b(this, aVar2.f159034d / b.f159034d);
    }
}
