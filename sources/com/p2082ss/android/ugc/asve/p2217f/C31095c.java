package com.p2082ss.android.ugc.asve.p2217f;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.p2082ss.android.vesdk.ROTATE_DEGREE;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.f.c */
public final class C31095c {
    static {
        Covode.recordClassIndex(37734);
    }

    /* renamed from: a */
    public static final ROTATE_DEGREE[] m64296a(EditPreviewInfo editPreviewInfo) {
        ROTATE_DEGREE rotate_degree;
        C89219l.m154721d(editPreviewInfo, "");
        List<EditVideoSegment> videoList = editPreviewInfo.getVideoList();
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) videoList, 10));
        Iterator<T> it = videoList.iterator();
        while (it.hasNext()) {
            VideoCutInfo videoCutInfo = it.next().getVideoCutInfo();
            if (videoCutInfo != null) {
                int rotate = videoCutInfo.getRotate();
                if (rotate == 90) {
                    rotate_degree = ROTATE_DEGREE.ROTATE_90;
                } else if (rotate == 180) {
                    rotate_degree = ROTATE_DEGREE.ROTATE_180;
                } else if (rotate != 270) {
                    rotate_degree = ROTATE_DEGREE.ROTATE_NONE;
                } else {
                    rotate_degree = ROTATE_DEGREE.ROTATE_270;
                }
                if (rotate_degree != null) {
                    arrayList.add(rotate_degree);
                }
            }
            rotate_degree = ROTATE_DEGREE.ROTATE_NONE;
            arrayList.add(rotate_degree);
        }
        Object[] array = arrayList.toArray(new ROTATE_DEGREE[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (ROTATE_DEGREE[]) array;
    }
}
