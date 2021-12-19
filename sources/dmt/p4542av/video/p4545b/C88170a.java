package dmt.p4542av.video.p4545b;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.SurfaceView;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.editor.preview.AbstractC14088a;
import com.p2082ss.android.ttve.nativePort.TEInterface;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.asve.editor.C31081l;
import com.p2082ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.p2082ss.android.ugc.aweme.canvas.PhotoCanvasBackground;
import com.p2082ss.android.ugc.aweme.canvas.PhotoCanvasTransformFilterParam;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CanvasVideoEditorTrackViewModel;
import com.p2082ss.android.vesdk.C85315al;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.p2082ss.android.vesdk.filterparam.VECanvasFilterParam;
import com.p2082ss.android.vesdk.filterparam.VEVideoTransformFilterParam;
import dmt.p4542av.video.C88273h;
import dmt.p4542av.video.SingleImageCoverBitmapData;
import dmt.p4542av.video.VEPreviewParams;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: dmt.av.video.b.a */
public final class C88170a extends AbstractC88181j {
    static {
        Covode.recordClassIndex(104205);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C88170a(dmt.p4542av.video.p4545b.C88238s r3) {
        /*
            r2 = this;
            java.util.concurrent.ScheduledExecutorService r1 = com.p2082ss.android.ugc.aweme.p2719cv.C40780g.m82247d()
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
            r2.<init>(r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dmt.p4542av.video.p4545b.C88170a.<init>(dmt.av.video.b.s):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C88170a(C88238s sVar, ScheduledExecutorService scheduledExecutorService) {
        super(sVar, scheduledExecutorService);
        C89219l.m154721d(sVar, "");
        C89219l.m154721d(scheduledExecutorService, "");
    }

    @Override // dmt.p4542av.video.p4545b.AbstractC88181j
    /* renamed from: a */
    public final int mo142714a(Context context, AbstractC14088a aVar, SurfaceView surfaceView, AbstractC1204m mVar) {
        VEPreviewParams vEPreviewParams;
        CanvasVideoData canvasVideoData;
        List<String> sourceInfo;
        PhotoCanvasBackground photoCanvasBackground;
        List<String> list;
        Bitmap b;
        C89219l.m154721d(aVar, "");
        super.mo142714a(context, aVar, surfaceView, mVar);
        AbstractC31071f c = mo142743c();
        if (c == null || !(aVar instanceof VEPreviewParams) || (canvasVideoData = (vEPreviewParams = (VEPreviewParams) aVar).canvasVideoPreviewData) == null || (sourceInfo = canvasVideoData.getSourceInfo()) == null || sourceInfo.isEmpty()) {
            return -1;
        }
        CanvasVideoData canvasVideoData2 = vEPreviewParams.canvasVideoPreviewData;
        if (canvasVideoData2 == null) {
            C89219l.m154715b();
        }
        ArrayList arrayList = new ArrayList();
        CanvasVideoData canvasVideoData3 = vEPreviewParams.canvasVideoPreviewData;
        if (canvasVideoData3 == null || (photoCanvasBackground = canvasVideoData3.getBackground()) == null) {
            photoCanvasBackground = PhotoCanvasBackground.C35356a.m72363a(-16777216);
        }
        String[] videoPaths = vEPreviewParams.getVideoPaths();
        C89219l.m154716b(videoPaths, "");
        int length = videoPaths.length;
        for (int i = 0; i < length; i++) {
            VECanvasFilterParam vECanvasFilterParam = new VECanvasFilterParam();
            int type = photoCanvasBackground.getType();
            if (type == 2) {
                vECanvasFilterParam.sourceType = VECanvasFilterParam.EnumC85488a.GRADIENT_COLOR.ordinal();
                vECanvasFilterParam.gradientTopColor = photoCanvasBackground.getStartColor();
                vECanvasFilterParam.gradientBottomColor = photoCanvasBackground.getEndColor();
            } else if (type != 3) {
                vECanvasFilterParam.sourceType = VECanvasFilterParam.EnumC85488a.COLOR.ordinal();
                vECanvasFilterParam.color = photoCanvasBackground.getStartColor();
            } else {
                vECanvasFilterParam.sourceType = VECanvasFilterParam.EnumC85488a.IMAGE.ordinal();
                vECanvasFilterParam.imagePath = photoCanvasBackground.getFilePath();
            }
            vECanvasFilterParam.enableAntialiasing = true;
            vECanvasFilterParam.width = vEPreviewParams.getCanvasWidth();
            vECanvasFilterParam.height = vEPreviewParams.getCanvasHeight();
            arrayList.add(vECanvasFilterParam);
        }
        CanvasVideoData canvasVideoData4 = vEPreviewParams.canvasVideoPreviewData;
        if (canvasVideoData4 == null || (list = canvasVideoData4.getSourceInfo()) == null) {
            list = C89086z.INSTANCE;
        }
        Object[] array = list.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        int[] vTrimOut = vEPreviewParams.getVTrimOut();
        C89219l.m154716b(vTrimOut, "");
        int[] vTrimIn = vEPreviewParams.getVTrimIn();
        C89219l.m154716b(vTrimIn, "");
        float[] speedArray = vEPreviewParams.getSpeedArray();
        C89219l.m154716b(speedArray, "");
        Object[] array2 = arrayList.toArray(new VECanvasFilterParam[0]);
        Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
        int a = c.mo56274a(new C31081l((String[]) array, vTrimIn, vTrimOut, speedArray, (VECanvasFilterParam[]) array2, C85581w.EnumC85613l.VIDEO_OUT_RATIO_ORIGINAL, C85581w.EnumC85612k.CENTER_IN_PARENT, C85581w.EnumC85614m.CENTER));
        if (a != 0) {
            return a;
        }
        if (vEPreviewParams.singleImageCoverBitmapData != null) {
            C85581w.m147504c(4194432);
        }
        C85315al.m146637a("VEEditor", "setEnableEffectCanvas: true");
        TEInterface.setEnableEffectCanvas(true);
        c.mo56381p();
        if (!C88273h.m153392a(vEPreviewParams.singleImageCoverBitmapData)) {
            SingleImageCoverBitmapData singleImageCoverBitmapData = vEPreviewParams.singleImageCoverBitmapData;
            C89219l.m154721d(c, "");
            if (!(singleImageCoverBitmapData == null || singleImageCoverBitmapData.getItemCoverWidth() <= 0 || (b = C88273h.m153393b(singleImageCoverBitmapData)) == null)) {
                c.mo56304a(b);
            }
        }
        c.mo56379o();
        c.mo56250K();
        if (!arrayList.isEmpty()) {
            int a2 = c.mo56258a(0, 0, (VEBaseFilterParam) C89070n.m154579f((List) arrayList));
            CanvasVideoEditorTrackViewModel canvasVideoEditorTrackViewModel = CanvasVideoEditorTrackViewModel.Companion.get(context);
            if (canvasVideoEditorTrackViewModel != null) {
                canvasVideoEditorTrackViewModel.filterIndex = a2;
            }
            List<PhotoCanvasTransformFilterParam> transformInfo = canvasVideoData2.getTransformInfo();
            if (transformInfo != null) {
                for (T t : transformInfo) {
                    if (t.isValid()) {
                        int clipIndex = t.getClipIndex();
                        C89219l.m154721d(t, "");
                        VEVideoTransformFilterParam vEVideoTransformFilterParam = new VEVideoTransformFilterParam();
                        vEVideoTransformFilterParam.scaleFactor = t.getScaleFactor();
                        vEVideoTransformFilterParam.transX = t.getTransX();
                        vEVideoTransformFilterParam.transY = t.getTransY();
                        vEVideoTransformFilterParam.degree = t.getDegree();
                        c.mo56324b(clipIndex, a2, vEVideoTransformFilterParam);
                    }
                }
            }
        }
        return a;
    }
}
