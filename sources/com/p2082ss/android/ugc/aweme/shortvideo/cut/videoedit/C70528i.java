package com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit;

import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70503u;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.i */
public final class C70528i {

    /* renamed from: a */
    public static final C70528i f157745a = new C70528i();

    /* renamed from: a */
    public static final ArrayList<VideoSegment> m124562a(List<? extends MediaModel> list) {
        return m124563a(list, false, null, 6);
    }

    private C70528i() {
    }

    static {
        Covode.recordClassIndex(82984);
    }

    /* renamed from: a */
    public static /* synthetic */ ArrayList m124563a(List list, boolean z, Map map, int i) {
        VEUtils.VEVideoFileInfo a;
        int i2 = 0;
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            map = C89041ag.m154415a();
        }
        C89219l.m154721d(list, "");
        C89219l.m154721d(map, "");
        ArrayList arrayList = new ArrayList();
        if (C13617h.m24466b(list)) {
            if (list.size() != 1) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    VideoSegment videoSegment = new VideoSegment((MediaModel) it.next());
                    videoSegment.f156709a = i2;
                    arrayList.add(videoSegment);
                    i2++;
                }
            } else if (z || C84896h.m145862a((MediaModel) list.get(0))) {
                arrayList.add(new VideoSegment((MediaModel) list.get(0)));
            } else {
                MediaModel mediaModel = (MediaModel) list.get(0);
                VideoSegment videoSegment2 = new VideoSegment(mediaModel);
                if (map.get(mediaModel.f134662b) != null) {
                    a = (VEUtils.VEVideoFileInfo) map.get(mediaModel.f134662b);
                } else {
                    String str = mediaModel.f134662b;
                    C89219l.m154716b(str, "");
                    a = C70503u.m124367a(str);
                }
                if (a != null) {
                    videoSegment2.f156714f = a.width;
                    videoSegment2.f156715g = a.height;
                    videoSegment2.f156710b = (long) a.duration;
                    if (videoSegment2.mo110580e() > videoSegment2.f156710b) {
                        videoSegment2.mo110576b(videoSegment2.f156710b);
                    }
                    videoSegment2.f156726r = a.fps;
                    videoSegment2.f156727s = a.bitrate;
                    videoSegment2.f156728t = a.keyFrameCount;
                    videoSegment2.f156729u = a.codec;
                }
                arrayList.add(videoSegment2);
            }
        }
        return arrayList;
    }
}
