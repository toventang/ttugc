package com.p2082ss.android.ugc.aweme.services.video;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.C85615x;
import com.p2082ss.android.vesdk.VESize;
import com.p2082ss.android.vesdk.VEVideoEncodeSettings;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.services.video.ImVideoCompileService$compileVideo$1 */
public final class ImVideoCompileService$compileVideo$1<T> implements AbstractC88983w {
    final /* synthetic */ IAVProcessService.CompileParam $compileParam;
    final /* synthetic */ IAVProcessService.CompileResult $result;
    final /* synthetic */ ImVideoCompileService this$0;

    static {
        Covode.recordClassIndex(80022);
    }

    ImVideoCompileService$compileVideo$1(ImVideoCompileService imVideoCompileService, IAVProcessService.CompileParam compileParam, IAVProcessService.CompileResult compileResult) {
        this.this$0 = imVideoCompileService;
        this.$compileParam = compileParam;
        this.$result = compileResult;
    }

    /* renamed from: com_ss_android_ugc_aweme_services_video_ImVideoCompileService$compileVideo$1_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m120134x9d7e4be2(String str, String str2) {
        return 0;
    }

    @Override // p4560f.p4561a.AbstractC88983w
    public final void subscribe(AbstractC88982v<Boolean> vVar) {
        C89219l.m154721d(vVar, "");
        C85581w createVEEditor = this.this$0.createVEEditor();
        ImVideoCompileService$compileVideo$1$onCompileErrorCallback$1 imVideoCompileService$compileVideo$1$onCompileErrorCallback$1 = new ImVideoCompileService$compileVideo$1$onCompileErrorCallback$1(this, createVEEditor, vVar);
        ImVideoCompileService$compileVideo$1$onCompileInfoCallback$1 imVideoCompileService$compileVideo$1$onCompileInfoCallback$1 = new ImVideoCompileService$compileVideo$1$onCompileInfoCallback$1(this, createVEEditor, vVar);
        try {
            int initVEEditor = this.this$0.initVEEditor(createVEEditor, this.$compileParam.getRawVideoPath());
            if (initVEEditor != 0) {
                C40970e.m82485a("ImVideoCompileService VEEditor init error: ".concat(String.valueOf(initVEEditor)));
                this.this$0.safeOnError(vVar, new IllegalStateException("VEEditor init error: ".concat(String.valueOf(initVEEditor))));
                return;
            }
            createVEEditor.mo131644a(imVideoCompileService$compileVideo$1$onCompileErrorCallback$1);
            createVEEditor.mo131665b(imVideoCompileService$compileVideo$1$onCompileInfoCallback$1);
            VEVideoEncodeSettings createEncodeSettings = this.this$0.createEncodeSettings(this.$compileParam);
            VESize videoRes = createEncodeSettings.getVideoRes();
            this.$result.setVideoWidth(videoRes.width);
            this.$result.setVideoHeight(videoRes.height);
            this.$result.setVideoPath(this.this$0.getOutputVideoFilePath());
            m120134x9d7e4be2("ImVideoCompileService", "compileVideo: settings=".concat(String.valueOf(createEncodeSettings)));
            createVEEditor.mo131648a(this.$result.getVideoPath(), (String) null, createEncodeSettings);
        } catch (C85615x e) {
            C40970e.m82487a((Throwable) e);
            this.this$0.safeOnError(vVar, new IllegalStateException("VEEditor init error", e));
        }
    }
}
