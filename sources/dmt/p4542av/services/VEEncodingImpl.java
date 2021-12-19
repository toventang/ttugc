package dmt.p4542av.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.tools.draft.ftc.services.IVEEncodingSetting;
import com.p2082ss.android.vesdk.VEVideoEncodeSettings;
import com.p2082ss.android.vesdk.VEWatermarkParam;
import dmt.p4542av.video.C88278m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: dmt.av.services.VEEncodingImpl */
public final class VEEncodingImpl implements IVEEncodingSetting {
    static {
        Covode.recordClassIndex(104171);
    }

    /* renamed from: a */
    public static IVEEncodingSetting m153216a() {
        MethodCollector.m26663i(10439);
        Object a = C81908b.m141854a(IVEEncodingSetting.class, false);
        if (a != null) {
            IVEEncodingSetting iVEEncodingSetting = (IVEEncodingSetting) a;
            MethodCollector.m26664o(10439);
            return iVEEncodingSetting;
        }
        if (C81908b.f183370eN == null) {
            synchronized (IVEEncodingSetting.class) {
                try {
                    if (C81908b.f183370eN == null) {
                        C81908b.f183370eN = new VEEncodingImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10439);
                    throw th;
                }
            }
        }
        VEEncodingImpl vEEncodingImpl = (VEEncodingImpl) C81908b.f183370eN;
        MethodCollector.m26664o(10439);
        return vEEncodingImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.draft.ftc.services.IVEEncodingSetting
    /* renamed from: a */
    public final VEVideoEncodeSettings mo122198a(VideoPublishEditModel videoPublishEditModel, SynthetiseResult synthetiseResult, AbstractC31071f fVar, String str) {
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(synthetiseResult, "");
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(str, "");
        return C88278m.m153398a(videoPublishEditModel, synthetiseResult, (VEWatermarkParam) null, fVar, str);
    }
}
