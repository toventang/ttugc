package com.p2082ss.android.ugc.aweme.tools.extract;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.sticker.model.C75439a;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo.C75926c;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.aa */
public final class C78506aa {

    /* renamed from: a */
    public static final C78506aa f176422a = new C78506aa();

    private C78506aa() {
    }

    static {
        Covode.recordClassIndex(91638);
    }

    /* renamed from: a */
    public static final ArrayList<C78595z> m137068a(VideoPublishEditModel videoPublishEditModel) {
        ArrayList<TimeSpeedModelExtension> a = CameraComponentModel.m123137a(videoPublishEditModel != null ? videoPublishEditModel.mVideoSegmentsDesc : null);
        if (C84904k.m145909a(a)) {
            return null;
        }
        C89219l.m154716b(a, "");
        ArrayList arrayList = new ArrayList();
        for (T t : a) {
            T t2 = t;
            C89219l.m154716b(t2, "");
            if (t2.getBackgroundVideo() != null) {
                arrayList.add(t);
            }
        }
        Map<String, Long> a2 = m137070a(videoPublishEditModel, arrayList);
        ArrayList<C78595z> arrayList2 = new ArrayList<>(a.size());
        for (Map.Entry<String, Long> entry : a2.entrySet()) {
            long longValue = entry.getValue().longValue();
            C78595z zVar = new C78595z();
            zVar.f176632a = entry.getKey();
            zVar.f176634c = longValue;
            arrayList2.add(zVar);
        }
        return arrayList2;
    }

    /* renamed from: a */
    public static final ArrayList<C78595z> m137069a(List<? extends EditVideoSegment> list) {
        if (C84904k.m145909a(list)) {
            return null;
        }
        if (list == null) {
            C89219l.m154715b();
        }
        ArrayList<C78595z> arrayList = new ArrayList<>(list.size());
        for (EditVideoSegment editVideoSegment : list) {
            C78595z zVar = new C78595z();
            if (editVideoSegment == null) {
                C89219l.m154715b();
            }
            zVar.f176632a = editVideoSegment.getVideoPath();
            if (editVideoSegment.getVideoCutInfo() != null) {
                VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
                if (videoCutInfo == null) {
                    C89219l.m154715b();
                }
                zVar.f176633b = videoCutInfo.getStart();
                VideoCutInfo videoCutInfo2 = editVideoSegment.getVideoCutInfo();
                if (videoCutInfo2 == null) {
                    C89219l.m154715b();
                }
                long end = videoCutInfo2.getEnd();
                VideoCutInfo videoCutInfo3 = editVideoSegment.getVideoCutInfo();
                if (videoCutInfo3 == null) {
                    C89219l.m154715b();
                }
                zVar.f176634c = end - videoCutInfo3.getStart();
            } else {
                zVar.f176633b = 0;
                zVar.f176634c = editVideoSegment.getVideoFileInfo().getDuration();
            }
            arrayList.add(zVar);
        }
        return arrayList;
    }

    /* renamed from: a */
    private static Map<String, Long> m137070a(VideoPublishEditModel videoPublishEditModel, List<? extends TimeSpeedModelExtension> list) {
        String videoPath;
        String str;
        long j;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t : list) {
            C75439a backgroundVideo = t.getBackgroundVideo();
            if (!(backgroundVideo == null || (videoPath = backgroundVideo.getVideoPath()) == null)) {
                if (!C84902i.m145892a(videoPath)) {
                    C89219l.m154721d(videoPath, "");
                    String a = C75926c.m133131a(videoPublishEditModel);
                    String str2 = File.separator;
                    C89219l.m154716b(str2, "");
                    videoPath = C89219l.m154704a(a, C89070n.m154586h(C89361p.m154921c(videoPath, new String[]{str2})));
                }
                Application application = C63247i.f143610a;
                C89219l.m154716b(application, "");
                String a2 = C84896h.m145859a(application, videoPath);
                String str3 = null;
                if (a2 != null) {
                    String str4 = File.separator;
                    C89219l.m154716b(str4, "");
                    Objects.requireNonNull(a2, "null cannot be cast to non-null type java.lang.String");
                    str = a2.substring(C89361p.m154885a((CharSequence) a2, str4) + 1);
                    C89219l.m154716b(str, "");
                } else {
                    str = null;
                }
                if (videoPublishEditModel != null) {
                    str3 = videoPublishEditModel.uniqueVideoSessionDir(C70638dj.f158106i);
                }
                String str5 = str3 + File.separator + str;
                if (C80720e.m139927b(str5)) {
                    a2 = str5;
                }
                if (C84902i.m145892a(a2)) {
                    Long l = (Long) linkedHashMap.get(String.valueOf(a2));
                    if (t.getSpeed() > 0.0d) {
                        String valueOf = String.valueOf(a2);
                        if (l != null) {
                            j = l.longValue();
                        } else {
                            j = 0;
                        }
                        linkedHashMap.put(valueOf, Long.valueOf(j + ((long) TimeSpeedModelExtension.calculateRealTime(t.getDuration(), t.getSpeed()))));
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00af A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m137071a(com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r10, com.p2082ss.android.ugc.aweme.tools.extract.p4116a.C78505j r11) {
        /*
        // Method dump skipped, instructions count: 310
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.extract.C78506aa.m137071a(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.ss.android.ugc.aweme.tools.extract.a.j):void");
    }
}
