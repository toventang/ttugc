package dmt.p4542av.video.p4545b;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.editor.preview.AbstractC14088a;
import com.p2082ss.android.ugc.asve.editor.AbstractC31077h;
import com.p2082ss.android.ugc.asve.editor.C31079j;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.ROTATE_DEGREE;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: dmt.av.video.b.i */
public final class C88180i implements AbstractC88174d {
    static {
        Covode.recordClassIndex(104215);
    }

    @Override // dmt.p4542av.video.p4545b.AbstractC88174d
    /* renamed from: a */
    public final AbstractC31077h mo142717a(AbstractC14088a aVar) {
        ROTATE_DEGREE rotate_degree;
        C89219l.m154721d(aVar, "");
        ROTATE_DEGREE[] rotate_degreeArr = null;
        if (aVar.getVTrimIn() == null || aVar.getVTrimOut() == null) {
            return null;
        }
        int[] rotateArray = aVar.getRotateArray();
        if (rotateArray != null) {
            int length = rotateArray.length;
            rotate_degreeArr = new ROTATE_DEGREE[length];
            for (int i = 0; i < length; i++) {
                int i2 = (rotateArray[i] + 360) % 360;
                if (i2 == 90) {
                    rotate_degree = ROTATE_DEGREE.ROTATE_90;
                } else if (i2 == 180) {
                    rotate_degree = ROTATE_DEGREE.ROTATE_180;
                } else if (i2 != 270) {
                    rotate_degree = ROTATE_DEGREE.ROTATE_NONE;
                } else {
                    rotate_degree = ROTATE_DEGREE.ROTATE_270;
                }
                rotate_degreeArr[i] = rotate_degree;
            }
        }
        C31079j jVar = new C31079j(aVar.getVideoPaths());
        jVar.f74439a = aVar.getVTrimIn();
        jVar.f74440b = aVar.getVTrimOut();
        jVar.f74442d = aVar.getAudioPaths();
        jVar.f74445g = aVar.getSpeedArray();
        jVar.f74446h = rotate_degreeArr;
        jVar.mo56409a(C85581w.EnumC85613l.VIDEO_OUT_RATIO_ORIGINAL);
        return jVar;
    }
}
