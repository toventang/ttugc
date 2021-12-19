package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C72890c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.c */
public final class C72970c extends View {

    /* renamed from: a */
    private List<float[]> f163740a;

    /* renamed from: b */
    private final Paint f163741b = new Paint();

    /* renamed from: c */
    private final Path f163742c = new Path();

    static {
        Covode.recordClassIndex(85673);
    }

    public final List<float[]> getPoints() {
        return this.f163740a;
    }

    public final void setPoints(List<float[]> list) {
        this.f163740a = list;
    }

    public C72970c(Context context) {
        super(context);
        MethodCollector.m26663i(6662);
        MethodCollector.m26664o(6662);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        List<float[]> list;
        MethodCollector.m26663i(6511);
        super.onDraw(canvas);
        Context context = getContext();
        C89219l.m154716b(context, "");
        if (!C72890c.m128720a(context) || (list = this.f163740a) == null) {
            MethodCollector.m26664o(6511);
            return;
        }
        for (float[] fArr : list) {
            if (fArr != null) {
                this.f163742c.reset();
                this.f163742c.moveTo(fArr[0], fArr[1]);
                this.f163742c.lineTo(fArr[2], fArr[3]);
                this.f163742c.lineTo(fArr[6], fArr[7]);
                this.f163742c.lineTo(fArr[4], fArr[5]);
                this.f163742c.close();
                if (canvas != null) {
                    canvas.drawPath(this.f163742c, this.f163741b);
                }
            }
        }
        MethodCollector.m26664o(6511);
    }
}
