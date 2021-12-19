package com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b;

import android.app.Application;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.draft.C43213k;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.C70637di;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.utils.C84891c;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d */
public final class C71429d {

    /* renamed from: a */
    public static final C71429d f160050a = new C71429d();

    /* renamed from: b */
    private static final String f160051b;

    private C71429d() {
    }

    /* renamed from: b */
    public static void m126159b() {
        String str = C70637di.f158102e;
        if (C80720e.m139927b(str)) {
            C80720e.m139938e(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d$a */
    public static final class CallableC71430a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C43223c f160052a;

        static {
            Covode.recordClassIndex(83964);
        }

        public CallableC71430a(C43223c cVar) {
            this.f160052a = cVar;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            if (!C80720e.m139927b(this.f160052a.mo73718p())) {
                return null;
            }
            m126162a(new File(this.f160052a.mo73718p()));
            return null;
        }

        /* renamed from: a */
        private static boolean m126162a(File file) {
            MethodCollector.m26663i(5764);
            try {
                C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
                if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
                }
                if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                    MethodCollector.m26664o(5764);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.m26664o(5764);
            return delete;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d$b */
    public static final class CallableC71431b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f160053a;

        /* renamed from: b */
        final /* synthetic */ Bitmap f160054b;

        static {
            Covode.recordClassIndex(83965);
        }

        CallableC71431b(String str, Bitmap bitmap) {
            this.f160053a = str;
            this.f160054b = bitmap;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            BufferedOutputStream bufferedOutputStream;
            Throwable th;
            Exception e;
            MethodCollector.m26663i(5494);
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(this.f160053a)));
                try {
                    this.f160054b.compress(Bitmap.CompressFormat.PNG, 100, bufferedOutputStream);
                    bufferedOutputStream.flush();
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                bufferedOutputStream = null;
                try {
                    e.printStackTrace();
                    C84891c.m145847a(bufferedOutputStream);
                    MethodCollector.m26664o(5494);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    C84891c.m145847a(bufferedOutputStream);
                    MethodCollector.m26664o(5494);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = null;
                C84891c.m145847a(bufferedOutputStream);
                MethodCollector.m26664o(5494);
                throw th;
            }
            C84891c.m145847a(bufferedOutputStream);
            MethodCollector.m26664o(5494);
            return null;
        }
    }

    /* renamed from: a */
    public static String m126154a() {
        String str = f160051b;
        if (!C80720e.m139927b(str)) {
            new File(str).mkdirs();
        }
        return str + System.currentTimeMillis() + "_cover_img.png";
    }

    static {
        Covode.recordClassIndex(83963);
        StringBuilder sb = new StringBuilder();
        Application application = C63247i.f143610a;
        C89219l.m154716b(application, "");
        File filesDir = application.getFilesDir();
        C89219l.m154716b(filesDir, "");
        f160051b = sb.append(filesDir.getAbsolutePath()).append(File.separator).append("multi_edit").append(File.separator).toString();
    }

    /* renamed from: a */
    public static void m126155a(Bitmap bitmap, String str) {
        C89219l.m154721d(str, "");
        if (bitmap != null && !bitmap.isRecycled()) {
            C1731i.m5640b(new CallableC71431b(str, bitmap), C1731i.f5562a);
        }
    }

    /* renamed from: a */
    public static MultiEditVideoRecordData m126153a(MultiEditVideoRecordData multiEditVideoRecordData, MultiEditVideoRecordData multiEditVideoRecordData2) {
        if (multiEditVideoRecordData == null) {
            return new MultiEditVideoRecordData();
        }
        if (multiEditVideoRecordData2 == null) {
            MultiEditVideoRecordData cloneData = multiEditVideoRecordData.cloneData();
            C89219l.m154716b(cloneData, "");
            return cloneData;
        }
        multiEditVideoRecordData2.concatVideo = multiEditVideoRecordData.concatVideo;
        multiEditVideoRecordData2.concatAudio = multiEditVideoRecordData.concatAudio;
        multiEditVideoRecordData2.useMusic = multiEditVideoRecordData.useMusic;
        multiEditVideoRecordData2.startTime = multiEditVideoRecordData.startTime;
        multiEditVideoRecordData2.endTime = multiEditVideoRecordData.endTime;
        multiEditVideoRecordData2.leftSlideX = multiEditVideoRecordData.leftSlideX;
        multiEditVideoRecordData2.rightSlideX = multiEditVideoRecordData.rightSlideX;
        multiEditVideoRecordData2.curRecordingDir = multiEditVideoRecordData.curRecordingDir;
        multiEditVideoRecordData2.segmentDataList = new ArrayList();
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : multiEditVideoRecordData.segmentDataList) {
            multiEditVideoRecordData2.segmentDataList.add(multiEditVideoSegmentRecordData.cloneData());
        }
        multiEditVideoRecordData2.musicPath = multiEditVideoRecordData.musicPath;
        multiEditVideoRecordData2.originVolume = multiEditVideoRecordData.originVolume;
        multiEditVideoRecordData2.musicVolume = multiEditVideoRecordData.musicVolume;
        multiEditVideoRecordData2.hasRetake = multiEditVideoRecordData.hasRetake;
        multiEditVideoRecordData2.musicTrimIn = multiEditVideoRecordData.musicTrimIn;
        multiEditVideoRecordData2.musicDuration = multiEditVideoRecordData.musicDuration;
        multiEditVideoRecordData2.preVideoDuration = multiEditVideoRecordData.preVideoDuration;
        multiEditVideoRecordData2.coverPath = multiEditVideoRecordData.coverPath;
        return multiEditVideoRecordData2;
    }

    /* renamed from: b */
    public static MultiEditVideoRecordData m126158b(MultiEditVideoRecordData multiEditVideoRecordData, MultiEditVideoRecordData multiEditVideoRecordData2) {
        if (multiEditVideoRecordData == null || multiEditVideoRecordData2 == null || C84904k.m145909a(multiEditVideoRecordData2.segmentDataList) || C84904k.m145909a(multiEditVideoRecordData.segmentDataList)) {
            return multiEditVideoRecordData;
        }
        multiEditVideoRecordData.copyData(multiEditVideoRecordData2);
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : multiEditVideoRecordData2.segmentDataList) {
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData2 : multiEditVideoRecordData.segmentDataList) {
                if (multiEditVideoSegmentRecordData != null && !TextUtils.isEmpty(multiEditVideoSegmentRecordData.videoPath) && C89219l.m154714a((Object) multiEditVideoSegmentRecordData.videoPath, (Object) multiEditVideoSegmentRecordData2.videoPath)) {
                    multiEditVideoSegmentRecordData2.copyData(multiEditVideoSegmentRecordData);
                }
            }
        }
        return multiEditVideoRecordData;
    }

    /* renamed from: b */
    private static void m126160b(MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData, String str, String str2) {
        if (multiEditVideoSegmentRecordData != null) {
            if (!TextUtils.isEmpty(multiEditVideoSegmentRecordData.audioPath)) {
                String str3 = multiEditVideoSegmentRecordData.audioPath;
                C89219l.m154716b(str3, "");
                multiEditVideoSegmentRecordData.draftAudioPath = C89361p.m154869a(str3, str, str2, false);
            }
            if (!TextUtils.isEmpty(multiEditVideoSegmentRecordData.videoPath)) {
                String str4 = multiEditVideoSegmentRecordData.videoPath;
                C89219l.m154716b(str4, "");
                multiEditVideoSegmentRecordData.draftVideoPath = C89361p.m154869a(str4, str, str2, false);
            }
        }
    }

    /* renamed from: a */
    private static void m126156a(MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData, String str, String str2) {
        if (multiEditVideoSegmentRecordData != null) {
            if (!TextUtils.isEmpty(multiEditVideoSegmentRecordData.draftAudioPath)) {
                String str3 = multiEditVideoSegmentRecordData.draftAudioPath;
                C89219l.m154716b(str3, "");
                multiEditVideoSegmentRecordData.audioPath = C89361p.m154869a(str3, str, str2, false);
            }
            if (!TextUtils.isEmpty(multiEditVideoSegmentRecordData.draftVideoPath)) {
                String str4 = multiEditVideoSegmentRecordData.draftVideoPath;
                C89219l.m154716b(str4, "");
                multiEditVideoSegmentRecordData.videoPath = C89361p.m154869a(str4, str, str2, false);
            }
        }
    }

    /* renamed from: b */
    public static final void m126161b(String str, String str2, MultiEditVideoStatusRecordData multiEditVideoStatusRecordData) {
        List<MultiEditVideoSegmentRecordData> list;
        List<MultiEditVideoSegmentRecordData> list2;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (multiEditVideoStatusRecordData != null) {
            MultiEditVideoRecordData multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData;
            if (!(multiEditVideoRecordData == null || (list2 = multiEditVideoRecordData.segmentDataList) == null)) {
                for (T t : list2) {
                    m126156a(t, str, str2);
                    C43213k.m86181a("[setMultiRecordVideoPath]: video path = " + t.videoPath + " draft video path = " + t.draftVideoPath);
                }
            }
            MultiEditVideoRecordData multiEditVideoRecordData2 = multiEditVideoStatusRecordData.restoreMultiEditVideoRecordData;
            if (!(multiEditVideoRecordData2 == null || (list = multiEditVideoRecordData2.segmentDataList) == null)) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    m126156a(it.next(), str, str2);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m126157a(String str, String str2, MultiEditVideoStatusRecordData multiEditVideoStatusRecordData) {
        List<MultiEditVideoSegmentRecordData> list;
        List<MultiEditVideoSegmentRecordData> list2;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (multiEditVideoStatusRecordData != null) {
            MultiEditVideoRecordData multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData;
            if (!(multiEditVideoRecordData == null || (list2 = multiEditVideoRecordData.segmentDataList) == null)) {
                for (T t : list2) {
                    m126160b(t, str, str2);
                    C43213k.m86181a("[setMultiRecordDraftPath]: video path = " + t.videoPath + " draft video path = " + t.draftVideoPath);
                }
            }
            MultiEditVideoRecordData multiEditVideoRecordData2 = multiEditVideoStatusRecordData.restoreMultiEditVideoRecordData;
            if (!(multiEditVideoRecordData2 == null || (list = multiEditVideoRecordData2.segmentDataList) == null)) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    m126160b(it.next(), str, str2);
                }
            }
        }
    }
}
