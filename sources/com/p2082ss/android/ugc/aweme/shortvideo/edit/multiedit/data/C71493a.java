package com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70504v;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.C70090e;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.vesdk.C85391be;
import com.p2082ss.android.vesdk.ROTATE_DEGREE;
import com.p2082ss.android.vesdk.VERecordData;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.a */
public final class C71493a {
    static {
        Covode.recordClassIndex(84033);
    }

    /* renamed from: a */
    public static final void m126278a(MultiEditVideoStatusRecordData multiEditVideoStatusRecordData, long j, long j2) {
        C89219l.m154721d(multiEditVideoStatusRecordData, "");
        ArrayList<TimeSpeedModelExtension> arrayList = multiEditVideoStatusRecordData.editSegments;
        int i = 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Iterator<TimeSpeedModelExtension> it = multiEditVideoStatusRecordData.editSegments.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                TimeSpeedModelExtension next = it.next();
                arrayList2.add(Integer.valueOf(i2));
                C89219l.m154716b(next, "");
                i2 += next.getDuration();
                arrayList3.add(Integer.valueOf(i2));
            }
            int size = arrayList3.size();
            int size2 = arrayList3.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size2) {
                    break;
                } else if (((Number) arrayList3.get(i3)).longValue() >= j) {
                    i = i3;
                    break;
                } else {
                    i3++;
                }
            }
            int size3 = arrayList2.size();
            while (true) {
                size3--;
                if (size3 >= 0) {
                    if (((Number) arrayList2.get(size3)).longValue() <= j2) {
                        size = size3;
                        break;
                    }
                } else {
                    break;
                }
            }
            ArrayList<TimeSpeedModelExtension> arrayList4 = multiEditVideoStatusRecordData.editSegments;
            if (arrayList4 == null) {
                C89219l.m154715b();
            }
            if (size <= arrayList4.size() - 1) {
                size++;
            }
            ArrayList<TimeSpeedModelExtension> arrayList5 = multiEditVideoStatusRecordData.editSegments;
            if (arrayList5 == null) {
                C89219l.m154715b();
            }
            multiEditVideoStatusRecordData.editCutSegments = new ArrayList<>(arrayList5.subList(i, size));
        }
    }

    /* renamed from: a */
    public static final void m126277a(MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData, VideoSegment videoSegment) {
        C70090e eVar;
        C89219l.m154721d(multiEditVideoSegmentRecordData, "");
        C89219l.m154721d(videoSegment, "");
        MusicSyncData musicSyncData = null;
        if (videoSegment.mo110583g() && (eVar = videoSegment.f156722n) != null) {
            musicSyncData = new MusicSyncData(eVar.getVideoStart(), eVar.getVideoEnd(), eVar.getVideoDuration());
        }
        multiEditVideoSegmentRecordData.musicSyncData = musicSyncData;
        multiEditVideoSegmentRecordData.enable = !videoSegment.f156717i;
        multiEditVideoSegmentRecordData.setStartTime(videoSegment.mo110578d());
        multiEditVideoSegmentRecordData.setEndTime(videoSegment.mo110580e());
    }

    /* renamed from: a */
    private static VERecordData.VERecordSegmentData m126272a(MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData) {
        C89219l.m154721d(multiEditVideoSegmentRecordData, "");
        VERecordData.VERecordSegmentData vERecordSegmentData = new VERecordData.VERecordSegmentData(m126274a(multiEditVideoSegmentRecordData.videoPath, multiEditVideoSegmentRecordData.draftVideoPath), multiEditVideoSegmentRecordData.videoLength, m126274a(multiEditVideoSegmentRecordData.audioPath, multiEditVideoSegmentRecordData.draftAudioPath), multiEditVideoSegmentRecordData.audioLength, multiEditVideoSegmentRecordData.audioSpeed, multiEditVideoSegmentRecordData.getStartTime() * 1000, multiEditVideoSegmentRecordData.getEndTime() * 1000, multiEditVideoSegmentRecordData.enable);
        vERecordSegmentData.f190804g = C70504v.C70505a.m124383a(multiEditVideoSegmentRecordData.rotate);
        vERecordSegmentData.f190803f = multiEditVideoSegmentRecordData.getVideoSpeed();
        return vERecordSegmentData;
    }

    /* renamed from: d */
    public static final List<MultiEditVideoSegmentRecordData> m126281d(MultiEditVideoRecordData multiEditVideoRecordData) {
        C89219l.m154721d(multiEditVideoRecordData, "");
        List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData.segmentDataList;
        C89219l.m154716b(list, "");
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (t.enable) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final C85391be m126279b(MultiEditVideoRecordData multiEditVideoRecordData) {
        C89219l.m154721d(multiEditVideoRecordData, "");
        int size = multiEditVideoRecordData.segmentDataList.size();
        String[] strArr = new String[size];
        double[] dArr = new double[size];
        ROTATE_DEGREE[] rotate_degreeArr = new ROTATE_DEGREE[size];
        boolean[] zArr = new boolean[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            zArr[i2] = true;
        }
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData.segmentDataList;
        C89219l.m154716b(list, "");
        for (T t : list) {
            int i3 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            T t2 = t;
            strArr[i] = t2.videoPath.toString();
            C89219l.m154716b(t2, "");
            dArr[i] = (double) t2.getVideoSpeed();
            rotate_degreeArr[i] = C70504v.C70505a.m124383a(t2.rotate);
            zArr[i] = t2.enable;
            iArr[i] = (int) t2.getStartTime();
            iArr2[i] = (int) t2.getEndTime();
            i = i3;
        }
        C85391be beVar = new C85391be(strArr);
        beVar.f191156i = dArr;
        beVar.f191158k = rotate_degreeArr;
        beVar.f191157j = zArr;
        beVar.f191152e = iArr;
        beVar.f191153f = iArr2;
        return beVar;
    }

    /* renamed from: a */
    private static MultiEditVideoSegmentRecordData m126271a(VERecordData.VERecordSegmentData vERecordSegmentData) {
        if (vERecordSegmentData == null) {
            return null;
        }
        MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = new MultiEditVideoSegmentRecordData();
        multiEditVideoSegmentRecordData.videoPath = vERecordSegmentData.f190798a;
        multiEditVideoSegmentRecordData.audioPath = vERecordSegmentData.f190799b;
        multiEditVideoSegmentRecordData.setStartTime(vERecordSegmentData.f190805h / 1000);
        multiEditVideoSegmentRecordData.setEndTime(vERecordSegmentData.f190806i / 1000);
        if (TextUtils.isEmpty(multiEditVideoSegmentRecordData.draftVideoPath)) {
            multiEditVideoSegmentRecordData.draftVideoPath = vERecordSegmentData.f190798a;
        }
        if (TextUtils.isEmpty(multiEditVideoSegmentRecordData.draftAudioPath)) {
            multiEditVideoSegmentRecordData.draftAudioPath = vERecordSegmentData.f190799b;
        }
        multiEditVideoSegmentRecordData.videoLength = vERecordSegmentData.f190800c;
        multiEditVideoSegmentRecordData.audioLength = vERecordSegmentData.f190801d;
        multiEditVideoSegmentRecordData.setVideoSpeed(vERecordSegmentData.f190803f);
        multiEditVideoSegmentRecordData.audioSpeed = vERecordSegmentData.f190802e;
        multiEditVideoSegmentRecordData.rotate = C70504v.C70505a.m124382a(vERecordSegmentData.f190804g);
        return multiEditVideoSegmentRecordData;
    }

    /* renamed from: c */
    public static final List<VideoSegment> m126280c(MultiEditVideoRecordData multiEditVideoRecordData) {
        long originStartTime;
        long originEndTime;
        boolean z;
        boolean z2;
        C89219l.m154721d(multiEditVideoRecordData, "");
        List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData.segmentDataList;
        int i = 0;
        if (list == null || list.isEmpty()) {
            return C89086z.INSTANCE;
        }
        List<MultiEditVideoSegmentRecordData> list2 = multiEditVideoRecordData.segmentDataList;
        C89219l.m154716b(list2, "");
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
        for (T t : list2) {
            C89219l.m154716b(t, "");
            C89219l.m154721d(t, "");
            VideoSegment videoSegment = new VideoSegment(t.videoPath, t.width, t.height, (int) (t.videoLength / 1000));
            videoSegment.mo110572a(t.getVideoSpeed());
            videoSegment.f156718j = t.rotate;
            MultiEditTrimState multiEditTrimState = t.multiEditTrimState;
            if (multiEditTrimState != null) {
                originStartTime = multiEditTrimState.getStartTime();
            } else {
                originStartTime = t.getOriginStartTime();
            }
            videoSegment.mo110573a(originStartTime);
            MultiEditTrimState multiEditTrimState2 = t.multiEditTrimState;
            if (multiEditTrimState2 != null) {
                originEndTime = multiEditTrimState2.getEndTime();
            } else {
                originEndTime = t.getOriginEndTime();
            }
            videoSegment.mo110576b(originEndTime);
            MultiEditTrimState multiEditTrimState3 = t.multiEditTrimState;
            if (multiEditTrimState3 != null) {
                z = multiEditTrimState3.getEnable();
            } else {
                z = t.enable;
            }
            videoSegment.f156717i = !z;
            videoSegment.f156709a = t.videoKey;
            if (t.musicSyncData != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            videoSegment.f156723o = z2;
            MusicSyncData musicSyncData = t.musicSyncData;
            if (musicSyncData != null) {
                videoSegment.f156722n = new C70090e(t.videoKey, musicSyncData.getVideoStart(), musicSyncData.getVideoEnd() - musicSyncData.getVideoStart(), t.videoLength / 1000);
            }
            arrayList.add(videoSegment);
        }
        ArrayList arrayList2 = arrayList;
        for (Object obj : arrayList2) {
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            ((VideoSegment) obj).f156709a = i;
            i = i2;
        }
        return arrayList2;
    }

    /* renamed from: a */
    public static final VERecordData m126273a(MultiEditVideoRecordData multiEditVideoRecordData) {
        C89219l.m154721d(multiEditVideoRecordData, "");
        ArrayList arrayList = new ArrayList();
        List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData.segmentDataList;
        C89219l.m154716b(list, "");
        ArrayList<MultiEditVideoSegmentRecordData> arrayList2 = new ArrayList();
        for (T t : list) {
            if (t.enable) {
                arrayList2.add(t);
            }
        }
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : arrayList2) {
            C89219l.m154716b(multiEditVideoSegmentRecordData, "");
            arrayList.add(m126272a(multiEditVideoSegmentRecordData));
        }
        VERecordData vERecordData = new VERecordData(arrayList, multiEditVideoRecordData.useMusic);
        vERecordData.f190796d = multiEditVideoRecordData.concatVideo;
        vERecordData.f190797e = multiEditVideoRecordData.concatAudio;
        return vERecordData;
    }

    /* renamed from: a */
    public static final MultiEditVideoRecordData m126270a(VERecordData vERecordData, String str) {
        C89219l.m154721d(str, "");
        if (vERecordData == null) {
            return null;
        }
        MultiEditVideoRecordData multiEditVideoRecordData = new MultiEditVideoRecordData();
        multiEditVideoRecordData.useMusic = vERecordData.f190795c;
        multiEditVideoRecordData.concatAudio = vERecordData.f190797e;
        multiEditVideoRecordData.concatVideo = vERecordData.f190796d;
        multiEditVideoRecordData.startTime = 0;
        if (vERecordData.f190794b != null && !vERecordData.f190794b.isEmpty()) {
            multiEditVideoRecordData.segmentDataList = new ArrayList(vERecordData.f190794b.size());
            for (VERecordData.VERecordSegmentData vERecordSegmentData : vERecordData.f190794b) {
                multiEditVideoRecordData.segmentDataList.add(m126271a(vERecordSegmentData));
                multiEditVideoRecordData.endTime += vERecordSegmentData.f190800c / 1000;
            }
        }
        multiEditVideoRecordData.curRecordingDir = str;
        return multiEditVideoRecordData;
    }

    /* renamed from: a */
    private static String m126274a(String str, String str2) {
        C84911q.m145921a("record path:" + str + ", draft path:" + str2);
        if (!C84902i.m145892a(str2)) {
            C84911q.m145926b("draft video path:".concat(String.valueOf(str2)));
            return str;
        }
        long length = new File(str2).length();
        long length2 = new File(str).length();
        C84911q.m145921a("record length:" + length2 + ", draft length" + length);
        if (length2 < length) {
            return str2;
        }
        return str;
    }

    /* renamed from: a */
    public static final void m126276a(MultiEditVideoRecordData multiEditVideoRecordData, List<? extends VideoSegment> list) {
        C89219l.m154721d(multiEditVideoRecordData, "");
        C89219l.m154721d(list, "");
        List<MultiEditVideoSegmentRecordData> list2 = multiEditVideoRecordData.segmentDataList;
        C89219l.m154716b(list2, "");
        int i = 0;
        for (T t : list2) {
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            T t2 = t;
            C89219l.m154716b(t2, "");
            m126277a(t2, (VideoSegment) list.get(i));
            i = i2;
        }
    }

    /* renamed from: a */
    public static final void m126275a(MultiEditVideoRecordData multiEditVideoRecordData, long j, long j2) {
        C89219l.m154721d(multiEditVideoRecordData, "");
        if (j2 > j) {
            long j3 = 0;
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : multiEditVideoRecordData.segmentDataList) {
                if (multiEditVideoSegmentRecordData.enable) {
                    boolean z = multiEditVideoSegmentRecordData.enable;
                    C89219l.m154716b(multiEditVideoSegmentRecordData, "");
                    multiEditVideoSegmentRecordData.multiEditTrimState = new MultiEditTrimState(z, multiEditVideoSegmentRecordData.getOriginStartTime(), multiEditVideoSegmentRecordData.getOriginEndTime());
                    long endTime = multiEditVideoSegmentRecordData.getEndTime() - multiEditVideoSegmentRecordData.getStartTime();
                    if (j3 < j || j3 + endTime > j2) {
                        if (j3 + endTime <= j || j3 >= j2) {
                            multiEditVideoSegmentRecordData.enable = false;
                        } else {
                            long startTime = (j - j3) + multiEditVideoSegmentRecordData.getStartTime();
                            long startTime2 = (j2 - j3) + multiEditVideoSegmentRecordData.getStartTime();
                            if (startTime <= multiEditVideoSegmentRecordData.getStartTime()) {
                                startTime = multiEditVideoSegmentRecordData.getStartTime();
                            }
                            multiEditVideoSegmentRecordData.setStartTime(startTime);
                            if (startTime2 > multiEditVideoSegmentRecordData.getEndTime()) {
                                startTime2 = multiEditVideoSegmentRecordData.getEndTime();
                            }
                            multiEditVideoSegmentRecordData.setEndTime(startTime2);
                        }
                    }
                    j3 += endTime;
                }
            }
        }
    }
}
