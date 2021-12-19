package com.p2082ss.android.ugc.aweme.shortvideo.sticker.comment;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.comment.p3862a.C72861a;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C72890c;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72921b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3869e.AbstractC72926g;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3870f.AbstractC72927a;
import com.p2082ss.android.ugc.aweme.sticker.C75391j;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.comment.b */
public final class C72862b extends AbstractC72927a {

    /* renamed from: a */
    public float[] f163486a;

    /* renamed from: b */
    private final AbstractC72926g f163487b;

    static {
        Covode.recordClassIndex(85554);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3870f.AbstractC72927a
    /* renamed from: a */
    public final List<NormalTrackTimeStamp> mo115231a(long j, InteractStickerStruct interactStickerStruct) {
        C89219l.m154721d(interactStickerStruct, "");
        return C72890c.m128723b(j, interactStickerStruct);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3870f.AbstractC72927a
    /* renamed from: a */
    public final void mo115232a(float f, float f2, AbstractC72921b bVar) {
        C89219l.m154721d(bVar, "");
        if (C72861a.f163483b) {
            bVar.mo115309a(this.f163646d.mo115355a(f, f2));
        } else {
            bVar.mo115309a(this.f163646d.mo115356b(f, f2));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72862b(Context context, C72854a aVar, InteractStickerStruct interactStickerStruct, C75391j jVar, AbstractC72926g gVar) {
        super(context, aVar, interactStickerStruct, jVar);
        long j;
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(interactStickerStruct, "");
        this.f163487b = gVar;
        if (gVar != null) {
            j = gVar.mo80204ay();
        } else {
            j = 0;
        }
        List<NormalTrackTimeStamp> a = mo115231a(j, this.f163647e);
        float[] fArr = null;
        if (!(a == null || a.isEmpty() || a.get(0) == null)) {
            NormalTrackTimeStamp normalTrackTimeStamp = a.get(0);
            if (normalTrackTimeStamp == null) {
                C89219l.m154715b();
            }
            RectF a2 = mo115320a(normalTrackTimeStamp);
            fArr = new float[]{a2.left, a2.top, a2.right, a2.top, a2.left, a2.bottom, a2.right, a2.bottom};
            Matrix matrix = new Matrix();
            NormalTrackTimeStamp normalTrackTimeStamp2 = a.get(0);
            if (normalTrackTimeStamp2 == null) {
                C89219l.m154715b();
            }
            matrix.postRotate(normalTrackTimeStamp2.getRotation(), ((fArr[2] - fArr[0]) / 2.0f) + fArr[0], ((fArr[5] - fArr[3]) / 2.0f) + fArr[3]);
            matrix.mapPoints(fArr);
        }
        this.f163486a = fArr;
    }
}
