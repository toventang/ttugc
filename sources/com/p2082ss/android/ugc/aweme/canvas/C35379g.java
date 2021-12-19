package com.p2082ss.android.ugc.aweme.canvas;

import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.canvas.PhotoCanvasBackground;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.canvas.g */
public final class C35379g {
    static {
        Covode.recordClassIndex(42550);
    }

    /* renamed from: a */
    public static final CanvasVideoData m72408a(C35413x xVar, List<String> list) {
        PhotoCanvasBackground photoCanvasBackground;
        List<String> list2 = list;
        C89219l.m154721d(xVar, "");
        if (xVar.f83572b.getFirst().intValue() == xVar.f83572b.getSecond().intValue()) {
            photoCanvasBackground = PhotoCanvasBackground.C35356a.m72363a(xVar.f83572b.getFirst().intValue());
        } else {
            int intValue = xVar.f83572b.getFirst().intValue();
            int intValue2 = xVar.f83572b.getSecond().intValue();
            photoCanvasBackground = new PhotoCanvasBackground(2);
            photoCanvasBackground.setStartColor(intValue);
            photoCanvasBackground.setEndColor(intValue2);
        }
        if (list2 == null || list2.isEmpty()) {
            list2 = C89070n.m154516a(xVar.f83571a);
        }
        CanvasVideoData canvasVideoData = new CanvasVideoData(C89070n.m154516a(xVar.f83571a), list2, photoCanvasBackground, null, 8, null);
        if (xVar.f83573c != 1.0f) {
            PhotoCanvasTransformFilterParam photoCanvasTransformFilterParam = new PhotoCanvasTransformFilterParam();
            photoCanvasTransformFilterParam.setScaleFactor(xVar.f83573c);
            photoCanvasTransformFilterParam.setClipIndex(0);
            canvasVideoData.putTransform(photoCanvasTransformFilterParam);
        }
        return canvasVideoData;
    }

    /* renamed from: a */
    public static final float m72407a(int i, int i2, int i3, int i4, boolean z) {
        return C35411v.m72430a(new PointF((float) i3, (float) i4), new PointF((float) i, (float) i2), z);
    }
}
