package dmt.p4542av.video;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.p2082ss.android.vesdk.VEUtils;

/* renamed from: dmt.av.video.aj */
public final class C88168aj {
    static {
        Covode.recordClassIndex(104203);
    }

    /* renamed from: a */
    public static int[] m153237a(String str) {
        int[] iArr = new int[10];
        if (VEUtils.getVideoFileInfo(str, iArr) == 0) {
            return iArr;
        }
        return null;
    }

    /* renamed from: c */
    public static int m153239c(String str) {
        VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(str);
        if (videoFileInfo == null) {
            return 0;
        }
        return videoFileInfo.bitrate;
    }

    /* renamed from: b */
    public static VideoFileInfo m153238b(String str) {
        int[] a = m153237a(str);
        if (a == null) {
            return null;
        }
        return new VideoFileInfo(a[0], a[1], (long) a[3], a[7], a[6], a[8], a[9]);
    }
}
