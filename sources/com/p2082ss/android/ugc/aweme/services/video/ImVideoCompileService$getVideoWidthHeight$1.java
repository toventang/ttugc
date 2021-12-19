package com.p2082ss.android.ugc.aweme.services.video;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70503u;
import com.p2082ss.android.vesdk.VEUtils;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.video.ImVideoCompileService$getVideoWidthHeight$1 */
final class ImVideoCompileService$getVideoWidthHeight$1<T> implements AbstractC88983w {
    final /* synthetic */ IAVProcessService.CompileParam $compileParam;
    final /* synthetic */ ImVideoCompileService this$0;

    static {
        Covode.recordClassIndex(80027);
    }

    ImVideoCompileService$getVideoWidthHeight$1(ImVideoCompileService imVideoCompileService, IAVProcessService.CompileParam compileParam) {
        this.this$0 = imVideoCompileService;
        this.$compileParam = compileParam;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.services.video.ImVideoCompileService */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p4560f.p4561a.AbstractC88983w
    public final void subscribe(AbstractC88982v<Boolean> vVar) {
        C89219l.m154721d(vVar, "");
        if (this.$compileParam.getVideoWidth() <= 0 || this.$compileParam.getVideoHeight() <= 0) {
            AVExternalServiceImpl.m113114a();
            int[] iArr = new int[11];
            VEUtils.VEVideoFileInfo a = C70503u.m124367a(this.$compileParam.getRawVideoPath());
            if (a != null) {
                iArr[0] = a.width;
                iArr[1] = a.height;
                iArr[2] = a.rotation;
                iArr[3] = a.rotation;
                iArr[4] = 0;
                iArr[5] = 0;
                iArr[6] = a.bitrate;
                iArr[7] = a.fps;
                iArr[8] = a.codec;
                iArr[9] = a.keyFrameCount;
                iArr[10] = a.maxDuration;
            }
            this.$compileParam.setVideoWidth(iArr[0]);
            this.$compileParam.setVideoHeight(iArr[1]);
            C40970e.m82485a("ImVideoCompileService resize compileParam success: " + this.$compileParam.getVideoWidth() + ", " + this.$compileParam.getVideoHeight());
        }
        this.this$0.safeOnSingleNext(vVar, true);
    }
}
