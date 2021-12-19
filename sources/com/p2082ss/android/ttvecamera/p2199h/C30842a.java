package com.p2082ss.android.ttvecamera.p2199h;

import android.media.MediaCodec;
import android.media.MediaMetadataRetriever;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.Surface;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ttvecamera.C30969o;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;

/* renamed from: com.ss.android.ttvecamera.h.a */
public final class C30842a {

    /* renamed from: k */
    private static final SparseIntArray f73868k;

    /* renamed from: a */
    public MediaRecorder f73869a = new MediaRecorder();

    /* renamed from: b */
    public String f73870b;

    /* renamed from: c */
    public HandlerThread f73871c;

    /* renamed from: d */
    public Handler f73872d;

    /* renamed from: e */
    public Size f73873e = new Size(1280, 720);

    /* renamed from: f */
    public int f73874f = 30;

    /* renamed from: g */
    public int f73875g = 10000000;

    /* renamed from: h */
    public AbstractC30843a f73876h;

    /* renamed from: i */
    private int f73877i = -1;

    /* renamed from: j */
    private Surface f73878j;

    /* renamed from: l */
    private int f73879l = 0;

    /* renamed from: com.ss.android.ttvecamera.h.a$a */
    public interface AbstractC30843a {
        static {
            Covode.recordClassIndex(37468);
        }

        /* renamed from: a */
        void mo55865a();
    }

    /* renamed from: b */
    public final Surface mo55864b() {
        if (this.f73878j == null) {
            this.f73878j = MediaCodec.createPersistentInputSurface();
        }
        return this.f73878j;
    }

    static {
        Covode.recordClassIndex(37467);
        SparseIntArray sparseIntArray = new SparseIntArray();
        f73868k = sparseIntArray;
        sparseIntArray.append(0, 90);
        sparseIntArray.append(1, 0);
        sparseIntArray.append(2, 270);
        sparseIntArray.append(3, LiveFeedRefreshTimeSetting.DEFAULT);
    }

    public C30842a() {
        HandlerThread handlerThread = new HandlerThread("MediaRecorderBackground");
        this.f73871c = handlerThread;
        handlerThread.start();
        this.f73872d = new Handler(this.f73871c.getLooper());
    }

    /* renamed from: a */
    public final void mo55863a() {
        String str = this.f73870b;
        if (str != null && !str.isEmpty()) {
            File file = new File(this.f73870b);
            C30969o.m63687b("TEMediaRecorder", "file length = " + file.length());
            if (!file.exists() || file.length() != 0) {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    mediaMetadataRetriever.setDataSource(this.f73870b);
                    Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
                } catch (IllegalArgumentException unused) {
                    String str2 = this.f73870b;
                    if (str2 != null && !str2.isEmpty()) {
                        File file2 = new File(this.f73870b);
                        C30969o.m63687b("TEMediaRecorder", "file length = " + file2.length());
                        if (file2.exists()) {
                            m63548a(file2);
                            this.f73870b = "";
                            C30969o.m63687b("TEMediaRecorder", "invalid video file deleted!");
                        }
                    }
                    C30969o.m63689d("TEMediaRecorder", "cannot access the file");
                }
                mediaMetadataRetriever.release();
                return;
            }
            m63548a(file);
            this.f73870b = "";
            C30969o.m63687b("TEMediaRecorder", "invalid video file deleted!");
        }
    }

    /* renamed from: a */
    private static boolean m63548a(File file) {
        MethodCollector.m26663i(13392);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(13392);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(13392);
        return delete;
    }
}
