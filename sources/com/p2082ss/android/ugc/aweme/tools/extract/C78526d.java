package com.p2082ss.android.ugc.aweme.tools.extract;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.sticker.model.C75439a;
import com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78550l;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.vesdk.VEUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.d */
public final class C78526d extends AbstractC78487a {

    /* renamed from: e */
    public final VideoPublishEditModel f176469e;

    /* renamed from: f */
    private int f176470f;

    static {
        Covode.recordClassIndex(91658);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78550l
    /* renamed from: e */
    public final String mo122447e() {
        return "extract_bgv";
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78487a
    /* renamed from: d */
    public final List<C78595z> mo122412d() {
        return C78506aa.m137068a(this.f176469e);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.extract.d$a */
    static final class CallableC78527a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C78526d f176471a;

        static {
            Covode.recordClassIndex(91659);
        }

        CallableC78527a(C78526d dVar) {
            this.f176471a = dVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            ArrayList<TimeSpeedModelExtension> a = CameraComponentModel.m123137a(this.f176471a.f176469e.mVideoSegmentsDesc);
            C78553n nVar = this.f176471a.f176393c;
            C89219l.m154716b(nVar, "");
            String str = nVar.f176546b;
            C89219l.m154716b(str, "");
            String str2 = File.separator;
            C89219l.m154716b(str2, "");
            if (!C89361p.m154876c(str, str2, false)) {
                str = str + File.separator;
            }
            C78526d dVar = this.f176471a;
            C89219l.m154716b(a, "");
            ArrayList arrayList = new ArrayList();
            for (T t : a) {
                T t2 = t;
                C89219l.m154716b(t2, "");
                if (t2.getBackgroundVideo() != null) {
                    arrayList.add(t);
                }
            }
            int i = 0;
            for (Map.Entry<String, Long> entry : dVar.mo122456a(arrayList).entrySet()) {
                VEUtils.saveVideoFrames(entry.getKey(), this.f176471a.mo122457a((int) entry.getValue().longValue()), C78549k.f176544a[0], -1, false, str, i + "_extract_frame", 1);
                i++;
            }
            String extractFramesDir = this.f176471a.f176469e.extractFramesModel.getExtractFramesDir();
            String str3 = File.separator;
            C89219l.m154716b(str3, "");
            if (!C89361p.m154876c(extractFramesDir, str3, false)) {
                extractFramesDir = extractFramesDir + File.separator;
            }
            File[] listFiles = new File(str).listFiles();
            if (!(listFiles == null || listFiles.length == 0)) {
                for (File file : listFiles) {
                    StringBuilder append = new StringBuilder().append(extractFramesDir);
                    C89219l.m154716b(file, "");
                    String sb = append.append(file.getName()).toString();
                    C80720e.m139932c(file.getAbsolutePath(), sb);
                    this.f176471a.f176469e.extractFramesModel.addFrameAtLastSegment(new FrameItem(sb, 0, 0, 6, null));
                }
            }
            C80720e.m139938e(str);
            C80720e.m139931c(str);
            return null;
        }
    }

    public C78526d(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        this.f176469e = videoPublishEditModel;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.extract.d$b */
    static final class C78528b<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C78526d f176472a;

        /* renamed from: b */
        final /* synthetic */ AbstractC78550l.AbstractC78551a f176473b;

        static {
            Covode.recordClassIndex(91660);
        }

        C78528b(C78526d dVar, AbstractC78550l.AbstractC78551a aVar) {
            this.f176472a = dVar;
            this.f176473b = aVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            AbstractC78550l.AbstractC78551a aVar = this.f176473b;
            C89219l.m154716b(iVar, "");
            aVar.mo122481a(iVar.mo5535a());
            this.f176472a.mo122410a(true);
            this.f176472a.mo122408a();
            return null;
        }
    }

    /* renamed from: a */
    public final int[] mo122457a(int i) {
        int i2 = i / 500;
        this.f176470f = i2;
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = i3 * 500;
        }
        return iArr;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78487a
    /* renamed from: a */
    public final void mo122409a(AbstractC78550l.AbstractC78551a aVar) {
        C89219l.m154721d(aVar, "");
        super.mo122409a(aVar);
        if (m137043b()) {
            C1731i.m5640b(new CallableC78527a(this), C1731i.f5562a).mo5532a((AbstractC1729g) new C78528b(this, aVar));
        }
    }

    /* renamed from: a */
    public final Map<String, Long> mo122456a(List<? extends TimeSpeedModelExtension> list) {
        String videoPath;
        long j;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t : list) {
            C75439a backgroundVideo = t.getBackgroundVideo();
            if (!(backgroundVideo == null || (videoPath = backgroundVideo.getVideoPath()) == null)) {
                String str = File.separator;
                C89219l.m154716b(str, "");
                Objects.requireNonNull(videoPath, "null cannot be cast to non-null type java.lang.String");
                String substring = videoPath.substring(C89361p.m154885a((CharSequence) videoPath, str) + 1);
                C89219l.m154716b(substring, "");
                String str2 = this.f176469e.uniqueVideoSessionDir(C70638dj.f158106i) + File.separator + substring;
                if (C84902i.m145892a(str2)) {
                    videoPath = str2;
                }
                if (C84902i.m145892a(videoPath)) {
                    Long l = (Long) linkedHashMap.get(String.valueOf(videoPath));
                    if (t.getSpeed() > 0.0d) {
                        String valueOf = String.valueOf(videoPath);
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
}
