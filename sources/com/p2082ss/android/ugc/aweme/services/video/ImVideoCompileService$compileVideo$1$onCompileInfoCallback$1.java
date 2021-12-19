package com.p2082ss.android.ugc.aweme.services.video;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.vesdk.AbstractC85541q;
import com.p2082ss.android.vesdk.C85581w;
import p4560f.p4561a.AbstractC88982v;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.video.ImVideoCompileService$compileVideo$1$onCompileInfoCallback$1 */
final class ImVideoCompileService$compileVideo$1$onCompileInfoCallback$1 implements AbstractC85541q {
    final /* synthetic */ C85581w $editor;
    final /* synthetic */ AbstractC88982v $it;
    final /* synthetic */ ImVideoCompileService$compileVideo$1 this$0;

    static {
        Covode.recordClassIndex(80024);
    }

    ImVideoCompileService$compileVideo$1$onCompileInfoCallback$1(ImVideoCompileService$compileVideo$1 imVideoCompileService$compileVideo$1, C85581w wVar, AbstractC88982v vVar) {
        this.this$0 = imVideoCompileService$compileVideo$1;
        this.$editor = wVar;
        this.$it = vVar;
    }

    @Override // com.p2082ss.android.vesdk.AbstractC85541q
    public final void onCallback(int i, int i2, float f, String str) {
        if (i == 4103) {
            this.$editor.mo131703j();
            StringBuilder sb = new StringBuilder("ImVideoCompileService compile success: ");
            AbstractC88982v vVar = this.$it;
            C89219l.m154716b(vVar, "");
            C40970e.m82485a(sb.append(vVar.isDisposed()).toString());
            ImVideoCompileService imVideoCompileService = this.this$0.this$0;
            AbstractC88982v vVar2 = this.$it;
            C89219l.m154716b(vVar2, "");
            imVideoCompileService.safeOnSingleNext(vVar2, true);
        }
    }
}
