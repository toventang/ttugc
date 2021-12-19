package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3870f;

import android.content.Context;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72921b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72922c;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.AbstractC72946a;
import com.p2082ss.android.ugc.aweme.sticker.C75391j;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.f.a */
public abstract class AbstractC72927a implements AbstractC72922c {

    /* renamed from: a */
    private final String f163644a = "BaseStickerPresenter";

    /* renamed from: c */
    public final Context f163645c;

    /* renamed from: d */
    public final AbstractC72946a f163646d;

    /* renamed from: e */
    public final InteractStickerStruct f163647e;

    /* renamed from: f */
    public C75391j f163648f;

    static {
        Covode.recordClassIndex(85627);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract List<NormalTrackTimeStamp> mo115231a(long j, InteractStickerStruct interactStickerStruct);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo115232a(float f, float f2, AbstractC72921b bVar);

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72922c
    /* renamed from: a */
    public final void mo115236a(C75391j jVar) {
        C89219l.m154721d(jVar, "");
        this.f163648f = jVar;
    }

    /* renamed from: a */
    public final RectF mo115320a(NormalTrackTimeStamp normalTrackTimeStamp) {
        float f;
        float f2;
        C89219l.m154721d(normalTrackTimeStamp, "");
        C75391j jVar = this.f163648f;
        float f3 = 0.0f;
        if (jVar == null) {
            return new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        }
        float width = jVar.f169446a * normalTrackTimeStamp.getWidth();
        C75391j jVar2 = this.f163648f;
        if (jVar2 != null) {
            f = jVar2.f169447b;
        } else {
            f = 0.0f;
        }
        float height = f * normalTrackTimeStamp.getHeight();
        C75391j jVar3 = this.f163648f;
        if (jVar3 != null) {
            f2 = jVar3.f169446a;
        } else {
            f2 = 0.0f;
        }
        float x = (f2 * normalTrackTimeStamp.getX()) - (width / 2.0f);
        C75391j jVar4 = this.f163648f;
        if (jVar4 != null) {
            f3 = jVar4.f169447b;
        }
        float y = (f3 * normalTrackTimeStamp.getY()) - (height / 2.0f);
        return new RectF(x, y, width + x, height + y);
    }

    public AbstractC72927a(Context context, AbstractC72946a aVar, InteractStickerStruct interactStickerStruct, C75391j jVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(interactStickerStruct, "");
        this.f163645c = context;
        this.f163646d = aVar;
        this.f163647e = interactStickerStruct;
        this.f163648f = jVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72922c
    /* renamed from: a */
    public boolean mo115224a(long j, int i, float f, float f2) {
        boolean contains;
        List<NormalTrackTimeStamp> a = mo115231a(j, this.f163647e);
        if (a == null) {
            return false;
        }
        ArrayList<RectF> arrayList = new ArrayList();
        for (T t : a) {
            if (t == null) {
                C89219l.m154715b();
            }
            arrayList.add(mo115320a((NormalTrackTimeStamp) t));
        }
        int i2 = 0;
        for (RectF rectF : arrayList) {
            if (a.get(i2) != null) {
                NormalTrackTimeStamp normalTrackTimeStamp = a.get(i2);
                if (normalTrackTimeStamp == null) {
                    C89219l.m154715b();
                }
                float rotation = normalTrackTimeStamp.getRotation();
                if (Math.abs(rotation) <= 0.0f) {
                    contains = rectF.contains(f, f2);
                } else {
                    float centerX = rectF.centerX();
                    float centerY = rectF.centerY();
                    double d = (double) (-rotation);
                    float sin = (float) Math.sin(Math.toRadians(d));
                    float cos = (float) Math.cos(Math.toRadians(d));
                    float f3 = f - centerX;
                    float f4 = f2 - centerY;
                    contains = rectF.contains((centerX + (f3 * cos)) - (f4 * sin), centerY + (f4 * cos) + (f3 * sin));
                }
                if (contains) {
                    return true;
                }
            }
            i2++;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72922c
    /* renamed from: a */
    public final boolean mo115225a(long j, int i, float f, float f2, AbstractC72921b bVar) {
        C89219l.m154721d(bVar, "");
        if (!mo115224a(j, i, f, f2)) {
            return false;
        }
        mo115232a(f, f2, bVar);
        return true;
    }
}
