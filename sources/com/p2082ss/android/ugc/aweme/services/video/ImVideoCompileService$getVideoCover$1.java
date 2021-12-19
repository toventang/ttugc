package com.p2082ss.android.ugc.aweme.services.video;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.vesdk.AbstractC85304ab;
import com.p2082ss.android.vesdk.VEUtils;
import java.nio.ByteBuffer;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.services.video.ImVideoCompileService$getVideoCover$1 */
public final class ImVideoCompileService$getVideoCover$1<T> implements AbstractC88983w {
    final /* synthetic */ int $maxHeight;
    final /* synthetic */ int $maxWidth;
    final /* synthetic */ String $videoFilePath;
    final /* synthetic */ ImVideoCompileService this$0;

    static {
        Covode.recordClassIndex(80025);
    }

    ImVideoCompileService$getVideoCover$1(ImVideoCompileService imVideoCompileService, String str, int i, int i2) {
        this.this$0 = imVideoCompileService;
        this.$videoFilePath = str;
        this.$maxWidth = i;
        this.$maxHeight = i2;
    }

    @Override // p4560f.p4561a.AbstractC88983w
    public final void subscribe(final AbstractC88982v<String> vVar) {
        C89219l.m154721d(vVar, "");
        VEUtils.getVideoFrames(this.$videoFilePath, new int[]{0}, new AbstractC85304ab(this) {
            /* class com.p2082ss.android.ugc.aweme.services.video.ImVideoCompileService$getVideoCover$1.C678811 */
            final /* synthetic */ ImVideoCompileService$getVideoCover$1 this$0;

            static {
                Covode.recordClassIndex(80026);
            }

            {
                this.this$0 = r1;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: com.ss.android.ugc.aweme.services.video.ImVideoCompileService */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.p2082ss.android.vesdk.AbstractC85304ab
            public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
                MethodCollector.m26663i(10605);
                C89219l.m154721d(byteBuffer, "");
                Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(byteBuffer.array()));
                this.this$0.this$0.scaleBitmap(createBitmap, this.this$0.$maxWidth, this.this$0.$maxHeight);
                String str = this.this$0.$videoFilePath + "_video_cover";
                this.this$0.this$0.saveBitmapToLocal(createBitmap, str);
                ImVideoCompileService imVideoCompileService = this.this$0.this$0;
                AbstractC88982v vVar = vVar;
                C89219l.m154716b(vVar, "");
                imVideoCompileService.safeOnSingleNext(vVar, str);
                MethodCollector.m26664o(10605);
                return false;
            }
        });
    }
}
