package com.p2082ss.android.ugc.aweme.services.video;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.services.video.ImVideoCompileService$compileImVideo$1 */
public final class ImVideoCompileService$compileImVideo$1<T> implements AbstractC88983w {
    final /* synthetic */ IAVProcessService.CompileResult $result;
    final /* synthetic */ ImVideoCompileService this$0;

    static {
        Covode.recordClassIndex(80021);
    }

    ImVideoCompileService$compileImVideo$1(ImVideoCompileService imVideoCompileService, IAVProcessService.CompileResult compileResult) {
        this.this$0 = imVideoCompileService;
        this.$result = compileResult;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.services.video.ImVideoCompileService */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p4560f.p4561a.AbstractC88983w
    public final void subscribe(AbstractC88982v<IAVProcessService.CompileResult> vVar) {
        C89219l.m154721d(vVar, "");
        this.this$0.safeOnSingleNext(vVar, this.$result);
    }
}
