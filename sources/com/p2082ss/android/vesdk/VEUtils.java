package com.p2082ss.android.vesdk;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ttve.model.C30680h;
import com.p2082ss.android.ttve.model.VEMVAudioAlgorithmResult;
import com.p2082ss.android.ttve.model.VEMusicWaveBean;
import com.p2082ss.android.ttve.monitor.C30689e;
import com.p2082ss.android.ttve.monitor.C30695h;
import com.p2082ss.android.ttve.monitor.TEMonitorInvoker;
import com.p2082ss.android.ttve.nativePort.TEAudioUtilsCallback;
import com.p2082ss.android.ttve.nativePort.TEEffectUtils;
import com.p2082ss.android.ttve.nativePort.TEImageFactory;
import com.p2082ss.android.ttve.nativePort.TEVideoUtils;
import com.p2082ss.android.ttve.nativePort.TEVideoUtilsCallback;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.VERecordData;
import com.p2082ss.android.vesdk.p4391g.C85509a;
import com.p2082ss.android.vesdk.utils.BitmapLoader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.vesdk.VEUtils */
public class VEUtils {
    static AbstractC85281h dumpInfoCallback;

    /* renamed from: com.ss.android.vesdk.VEUtils$e */
    public static class C85278e {

        /* renamed from: a */
        public int f190824a;

        /* renamed from: b */
        public int f190825b;

        /* renamed from: c */
        public C85283j f190826c = new C85283j();

        /* renamed from: d */
        public int f190827d;

        /* renamed from: e */
        public C85280g[] f190828e = new C85280g[4];

        /* renamed from: f */
        public int f190829f;

        /* renamed from: g */
        public int f190830g;

        static {
            Covode.recordClassIndex(99378);
        }
    }

    /* renamed from: com.ss.android.vesdk.VEUtils$g */
    public static class C85280g {

        /* renamed from: a */
        public int f190836a;

        /* renamed from: b */
        public int f190837b;

        /* renamed from: c */
        public int f190838c;

        /* renamed from: d */
        public int f190839d;

        /* renamed from: e */
        public int f190840e;

        static {
            Covode.recordClassIndex(99380);
        }
    }

    /* renamed from: com.ss.android.vesdk.VEUtils$h */
    public interface AbstractC85281h {
        static {
            Covode.recordClassIndex(99381);
        }
    }

    /* renamed from: com.ss.android.vesdk.VEUtils$i */
    public interface AbstractC85282i {
        static {
            Covode.recordClassIndex(99382);
        }

        /* renamed from: a */
        void mo79408a(int i);
    }

    /* renamed from: com.ss.android.vesdk.VEUtils$j */
    public static class C85283j {

        /* renamed from: a */
        public int f190841a;

        /* renamed from: b */
        public int f190842b;

        /* renamed from: c */
        public int f190843c;

        /* renamed from: d */
        public int f190844d;

        /* renamed from: e */
        public float f190845e;

        /* renamed from: f */
        public float f190846f;

        /* renamed from: g */
        public int f190847g;

        /* renamed from: h */
        public int f190848h;

        /* renamed from: i */
        public int f190849i;

        static {
            Covode.recordClassIndex(99383);
        }
    }

    /* renamed from: com.ss.android.vesdk.VEUtils$k */
    public static final class C85284k {

        /* renamed from: a */
        public String f190850a;

        /* renamed from: b */
        public String f190851b;

        /* renamed from: c */
        public String f190852c;

        /* renamed from: d */
        public String f190853d;

        /* renamed from: e */
        public int f190854e = -1;

        /* renamed from: f */
        public float f190855f = 0.4f;

        /* renamed from: g */
        public int f190856g = 8;

        /* renamed from: h */
        public int f190857h = LiveFeedRefreshTimeSetting.DEFAULT;

        /* renamed from: i */
        public int f190858i;

        /* renamed from: j */
        public int f190859j;

        /* renamed from: k */
        public int f190860k;

        /* renamed from: l */
        public int f190861l;

        /* renamed from: m */
        public int f190862m;

        static {
            Covode.recordClassIndex(99384);
        }
    }

    static {
        Covode.recordClassIndex(99367);
    }

    public static String getVideoEncodeTypeByID(int i) {
        return i != 2 ? i != 5 ? i != 13 ? i != 28 ? i != 140 ? i != 168 ? i != 174 ? "unknown" : "bytevc1" : "vp9" : "vp8" : "h264" : "mpeg4" : "h263" : "mpeg2";
    }

    /* renamed from: com.ss.android.vesdk.VEUtils$a */
    public enum EnumC85274a {
        type_Unknown(-1),
        type_AudioVideo(0),
        type_Video(1),
        type_Audio(2),
        type_Image(3),
        type_Camera(4),
        type_Color(5),
        type_ImageVideo(6);
        

        /* renamed from: a */
        private int f190820a;

        public final int getValue() {
            return this.f190820a;
        }

        static {
            Covode.recordClassIndex(99374);
        }

        private EnumC85274a(int i) {
            this.f190820a = i;
        }
    }

    public static boolean isSupportGLES3() {
        return TEVideoUtils.isSupportGLES3();
    }

    public static int releaseGetFramesReader() {
        return TEVideoUtils.releaseGetFramesReader();
    }

    /* renamed from: com.ss.android.vesdk.VEUtils$b */
    public enum EnumC85275b {
        Legacy,
        Skip_invalid,
        Fill_silence;

        static {
            Covode.recordClassIndex(99375);
        }
    }

    /* renamed from: com.ss.android.vesdk.VEUtils$c */
    public enum EnumC85276c {
        Img_png,
        Img_jpeg;

        static {
            Covode.recordClassIndex(99376);
        }
    }

    /* renamed from: com.ss.android.vesdk.VEUtils$d */
    public enum EnumC85277d {
        RES_RANDOM,
        RES_720P,
        RES_1080P,
        RES_4K;

        static {
            Covode.recordClassIndex(99377);
        }
    }

    /* renamed from: com.ss.android.vesdk.VEUtils$VEVideoFileInfo */
    public static class VEVideoFileInfo {
        public boolean bHDR;
        public int bitDepth;
        public int bitrate;
        public int codec;
        public int duration;
        public String formatName;
        public int fps;
        public int height;
        public int isSupportImport = -1;
        public int keyFrameCount;
        public int maxDuration;
        public int rotation;
        public int width;

        static {
            Covode.recordClassIndex(99373);
        }

        public String toString() {
            return "width = " + this.width + ", height = " + this.height + ", rotation = " + this.rotation + ", duration = " + this.duration + ", bitrate = " + this.bitrate + ", fps = " + this.fps + ", codec = " + this.codec + ", keyFrameCount = " + this.keyFrameCount + ", maxDuration = " + this.maxDuration + ", formatName = " + this.formatName;
        }
    }

    /* renamed from: com.ss.android.vesdk.VEUtils$f */
    public static class C85279f {

        /* renamed from: a */
        public int f190831a;

        /* renamed from: b */
        public int f190832b;

        /* renamed from: c */
        public int f190833c;

        /* renamed from: d */
        public int f190834d;

        /* renamed from: e */
        public int f190835e;

        static {
            Covode.recordClassIndex(99379);
        }

        public String toString() {
            return "VEAudioFileInfo{sampleRate=" + this.f190831a + ", channelSize=" + this.f190832b + ", sampleFormat=" + this.f190833c + ", duration=" + this.f190834d + ", bitRate=" + this.f190835e + '}';
        }
    }

    public static boolean isSupportHDRCapability() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            C85315al.m146641c("VEUtils", "eglGetDisplay() returned error 0x" + EGL14.eglGetError());
            return false;
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            String eglQueryString = EGL14.eglQueryString(eglGetDisplay, 12373);
            EGL14.eglTerminate(eglGetDisplay);
            String[] strArr = {"EGL_KHR_gl_colorspace", "EGL_EXT_gl_colorspace_bt2020_pq"};
            int i = 0;
            while (eglQueryString.contains(strArr[i])) {
                i++;
                if (i >= 2) {
                    C85315al.m146637a("VEUtils", "This device supports the HDR capability");
                    return true;
                }
            }
            return false;
        }
        C85315al.m146641c("VEUtils", "eglInitialize() returned error 0x" + EGL14.eglGetError());
        throw new RuntimeException("eglInitialize failed");
    }

    public static void setVEExecFFmpegAndDumpInfoCommandCallback(AbstractC85281h hVar) {
        dumpInfoCallback = hVar;
    }

    public static int checkAudioFile(String str) {
        return TEVideoUtils.checkAudioFile(str);
    }

    public static int checkMVResourceIntegrity(String str) {
        return TEVideoUtils.checkMVResourceIntegrity(str);
    }

    public static int checkMp3File(String str) {
        return TEVideoUtils.checkMp3File(str);
    }

    public static String findBestRemuxSuffix(String str) {
        return TEVideoUtils.findBestRemuxSuffix(str);
    }

    public static int getFileType(String str) {
        return TEVideoUtils.getFileType(str);
    }

    public static String getInfostickerConvertTotemplate(String str) {
        return TEVideoUtils.getInfostickerConvertTotemplate(str);
    }

    public static int isCanImport(String str) {
        C30689e.m63052a("iesve_veutils_if_video_support_import", 1, (C85509a) null);
        return TEVideoUtils.isCanImport(str);
    }

    public static VEVideoFileInfo getVEVideoFileInfo(String str) {
        VEVideoFileInfo vEVideoFileInfo = (VEVideoFileInfo) TEVideoUtils.getVEVideoFileInfo(str);
        if (vEVideoFileInfo != null) {
            return vEVideoFileInfo;
        }
        C85315al.m146642d("VEUtils", "getVideoFileInfo error!!!");
        return null;
    }

    public static VEVideoFileInfo getVideoFileInfo(String str) {
        VEVideoFileInfo vEVideoFileInfo = (VEVideoFileInfo) TEVideoUtils.getVideoFileInfo(str, null);
        if (vEVideoFileInfo != null) {
            return vEVideoFileInfo;
        }
        C85315al.m146642d("VEUtils", "getVideoFileInfo error!!!");
        return null;
    }

    public static long getVideoReverseSize(String str) {
        VEVideoFileInfo videoFileInfo = getVideoFileInfo(str);
        if (videoFileInfo == null) {
            return -1;
        }
        return (((long) (videoFileInfo.duration / 1000)) * 5000) / 1024;
    }

    public static C85279f getAudioFileInfo(String str) {
        int[] iArr = new int[16];
        int audioFileInfo = TEVideoUtils.getAudioFileInfo(str, iArr);
        if (audioFileInfo == 0) {
            C85279f fVar = new C85279f();
            fVar.f190831a = iArr[0];
            fVar.f190832b = iArr[1];
            fVar.f190833c = iArr[2];
            fVar.f190834d = iArr[3];
            fVar.f190835e = iArr[4];
            return fVar;
        }
        C85315al.m146642d("VEUtils", "getAudioFileInfo error with code=".concat(String.valueOf(audioFileInfo)));
        return null;
    }

    /* renamed from: com_ss_android_vesdk_VEUtils_com_ss_android_ugc_aweme_storage_FileLancet_delete */
    public static boolean m146582x2efbc5fc(File file) {
        MethodCollector.m26663i(4431);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(4431);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(4431);
        return delete;
    }

    public static List<C85279f> getAudioFileInfoForAllTracks(String str) {
        int[][] iArr = (int[][]) Array.newInstance(int.class, 32, 4);
        int audioFileInfoForAllTracks = TEVideoUtils.getAudioFileInfoForAllTracks(str, iArr);
        if (audioFileInfoForAllTracks >= 0) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < audioFileInfoForAllTracks; i++) {
                C85279f fVar = new C85279f();
                fVar.f190831a = iArr[i][0];
                fVar.f190832b = iArr[i][1];
                fVar.f190833c = iArr[i][2];
                fVar.f190834d = iArr[i][3];
                arrayList.add(fVar);
            }
            return arrayList;
        }
        C85315al.m146642d("VEUtils", "getAudioFileInfoForAllTracks error with code=".concat(String.valueOf(audioFileInfoForAllTracks)));
        return new ArrayList(0);
    }

    public static int isByteVC110Bit(String str) {
        try {
            MediaExtractor mediaExtractor = new MediaExtractor();
            mediaExtractor.setDataSource(str);
            for (int i = 0; i < mediaExtractor.getTrackCount(); i++) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
                if (TextUtils.equals(trackFormat.getString("mime"), "video/hevc") && trackFormat.containsKey("csd-0")) {
                    ByteBuffer byteBuffer = trackFormat.getByteBuffer("csd-0");
                    byte[] bArr = new byte[byteBuffer.capacity()];
                    byteBuffer.get(bArr);
                    mediaExtractor.release();
                    return TEVideoUtils.isByteVC110Bit(bArr);
                }
            }
            mediaExtractor.release();
            return -200;
        } catch (Exception e) {
            e.printStackTrace();
            return -200;
        }
    }

    private static String ms2TimeFormat(int i) {
        long j = (long) i;
        return C1764a.m5929a(Locale.ENGLISH, "%02d:%02d:%02d.%03d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j))), Long.valueOf(j - TimeUnit.SECONDS.toMillis(TimeUnit.MILLISECONDS.toSeconds(j)))});
    }

    public static C85278e getAVFileInfoFromXml(String str) {
        int[] iArr = new int[36];
        int aVFileInfoFromXml = TEVideoUtils.getAVFileInfoFromXml(str, iArr);
        if (aVFileInfoFromXml == 0) {
            C85278e eVar = new C85278e();
            int i = 0;
            eVar.f190824a = iArr[0];
            eVar.f190825b = iArr[1];
            eVar.f190826c.f190841a = iArr[2];
            eVar.f190826c.f190842b = iArr[3];
            eVar.f190826c.f190843c = iArr[4];
            eVar.f190826c.f190844d = iArr[5];
            eVar.f190826c.f190845e = ((float) iArr[6]) / ((float) iArr[7]);
            eVar.f190826c.f190846f = ((float) iArr[8]) / ((float) iArr[9]);
            eVar.f190826c.f190847g = iArr[10];
            eVar.f190826c.f190848h = iArr[11];
            eVar.f190826c.f190849i = iArr[12];
            int i2 = 14;
            eVar.f190827d = iArr[13];
            do {
                eVar.f190828e[i] = new C85280g();
                int i3 = i2 + 1;
                eVar.f190828e[i].f190836a = iArr[i2];
                int i4 = i3 + 1;
                eVar.f190828e[i].f190837b = iArr[i3];
                int i5 = i4 + 1;
                eVar.f190828e[i].f190838c = iArr[i4];
                int i6 = i5 + 1;
                eVar.f190828e[i].f190839d = iArr[i5];
                i2 = i6 + 1;
                eVar.f190828e[i].f190840e = iArr[i6];
                i++;
            } while (i < 4);
            eVar.f190829f = iArr[34];
            eVar.f190830g = iArr[35];
            return eVar;
        }
        C85315al.m146642d("VEUtils", "getAVFileInfoFromXml error with code=".concat(String.valueOf(aVFileInfoFromXml)));
        return null;
    }

    public static int ConvertBitmapToRGBA(Bitmap bitmap, String str) {
        return TEVideoUtils.ConverBitmapToRGBA(bitmap, str);
    }

    public static int concatVideo(String[] strArr, String str) {
        return TEVideoUtils.concat(strArr, str);
    }

    public static int getAudioFileInfoForAllTracks(String str, int[][] iArr) {
        return TEVideoUtils.getAudioFileInfoForAllTracks(str, iArr);
    }

    public static int execFFmpegCommand(String str, final AbstractC85282i iVar) {
        AbstractC85281h hVar = dumpInfoCallback;
        if (hVar == null) {
            return TEVideoUtils.executeFFmpegCommand(str, new TEVideoUtils.ExecuteCommandListener() {
                /* class com.p2082ss.android.vesdk.VEUtils.C852691 */

                static {
                    Covode.recordClassIndex(99368);
                }

                @Override // com.p2082ss.android.ttve.nativePort.TEVideoUtils.ExecuteCommandListener
                public final void onProgressChanged(int i) {
                    AbstractC85282i iVar = iVar;
                    if (iVar != null) {
                        iVar.mo79408a(i);
                    }
                }
            });
        }
        int execFFmpegCommandAndDumpInfo = execFFmpegCommandAndDumpInfo(str, iVar, hVar);
        dumpInfoCallback = null;
        return execFFmpegCommandAndDumpInfo;
    }

    public static VEMVAlgorithmConfig getMVAlgorithmConfigs(String str, List<String> list) {
        if (TextUtils.isEmpty(str) || list == null || list.size() <= 0) {
            return null;
        }
        return (VEMVAlgorithmConfig) TEVideoUtils.getMVAlgorithmConfigs(str, list);
    }

    public static int getQREncodedData(String str, final VEListener.AbstractC85255x xVar) {
        return TEEffectUtils.getQREncodedData(str, null, new TEEffectUtils.ImageListener() {
            /* class com.p2082ss.android.vesdk.VEUtils.C852724 */

            static {
                Covode.recordClassIndex(99371);
            }

            @Override // com.p2082ss.android.ttve.nativePort.TEEffectUtils.ImageListener
            public final void onData(int[] iArr, int i, int i2, int i3) {
            }
        });
    }

    public static int extractVideo(String str, String str2) {
        C85315al.m146637a("VEUtils", "extractVideo... inFile:" + str + ", outFile:" + str2);
        int isCanImport = isCanImport(str);
        if (isCanImport == 0) {
            return TEVideoUtils.extractVideo(str, str2);
        }
        C85315al.m146641c("VEUtils", "input file is not supported!");
        return isCanImport;
    }

    public static String getFileBestStreamAudio(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        int fileAudio = TEVideoUtils.getFileAudio(str, str2, arrayList, true);
        if (fileAudio != 0) {
            C85315al.m146642d("VEUtils", "getFileBestStreamAudio error ".concat(String.valueOf(fileAudio)));
            return null;
        } else if (arrayList.size() > 0) {
            if (arrayList.size() > 1) {
                C85315al.m146641c("VEUtils", "getFileBestStreamAudio, find more than one stream");
            }
            return (String) arrayList.get(0);
        } else {
            C85315al.m146642d("VEUtils", "getFileBestStreamAudio error, outFiles.size == 0 ");
            return null;
        }
    }

    public static int getMusicDefaultAlgorithm(String str, String str2) {
        if (str == null || str2 == null) {
            C85315al.m146642d("VEUtils", "getMusicDefaultAlgorithm failed path is wrong");
            return -100;
        }
        C85315al.m146637a("VEUtils", "getMusicDefaultAlgorithm musicPath: " + str + " algorithmPath: " + str2);
        return TEVideoUtils.getMusicDefaultAlgorithm(str, str2);
    }

    public static int reverseAudio(String str, String str2) {
        if (str.contains(" ")) {
            str = str.replace(" ", "\\ ");
        }
        return execFFmpegCommand("ffmpeg -i " + str + " -af areverse " + str2, null);
    }

    public static int extractVideoByCommand(String str, String str2) {
        C85315al.m146637a("VEUtils", "extractVideoByCommand... inFile:" + str + ", outFile:" + str2);
        int isCanImport = isCanImport(str);
        if (isCanImport != 0) {
            C85315al.m146641c("VEUtils", "input file is not supported!");
            return isCanImport;
        }
        if (str.contains(" ")) {
            str = str.replace(" ", "\\ ");
        }
        return execFFmpegCommand("ffmpeg -i " + str + " -vcodec copy -an " + str2, null);
    }

    public static int getAudioFileInfo(String str, int[] iArr) {
        C30689e.m63052a("iesve_veutils_get_audio_info", 1, (C85509a) null);
        int audioFileInfo = TEVideoUtils.getAudioFileInfo(str, iArr);
        if (str.endsWith(".aac")) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(12);
            if (extractMetadata != null && extractMetadata.startsWith("audio/aac")) {
                C85315al.m146641c("VEUtils", "getAudioFileInfo use Android sys to get aac duration because ffmpeg is not accurate");
                iArr[3] = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
            }
            mediaMetadataRetriever.release();
        }
        return audioFileInfo;
    }

    public static int getVideoFileInfo(String str, int[] iArr) {
        C30689e.m63052a("iesve_veutils_get_video_info", 1, (C85509a) null);
        VEVideoFileInfo vEVideoFileInfo = (VEVideoFileInfo) TEVideoUtils.getVideoFileInfo(str, null);
        if (vEVideoFileInfo == null) {
            C85315al.m146642d("VEUtils", "getVideoFileInfo2 error!!!");
            return -1;
        }
        switch (Math.min(iArr.length, 12)) {
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                iArr[11] = vEVideoFileInfo.bitDepth;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                iArr[10] = vEVideoFileInfo.maxDuration;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                iArr[9] = vEVideoFileInfo.keyFrameCount;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                iArr[8] = vEVideoFileInfo.codec;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                iArr[7] = vEVideoFileInfo.fps;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                iArr[6] = vEVideoFileInfo.bitrate;
            case 4:
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                iArr[3] = vEVideoFileInfo.duration;
            case 3:
                iArr[2] = vEVideoFileInfo.rotation;
            case 2:
                iArr[1] = vEVideoFileInfo.height;
            case 1:
                iArr[0] = vEVideoFileInfo.width;
                break;
        }
        return 0;
    }

    public static int reverseAudioSafe(String str, String str2) {
        if (str.contains(" ")) {
            str = str.replace(" ", "\\ ");
        }
        String str3 = str + ".wav";
        int execFFmpegCommand = execFFmpegCommand("ffmpeg -i " + str + " " + str3, null);
        if (execFFmpegCommand == 0) {
            return execFFmpegCommand("ffmpeg -i " + str3 + " -af areverse " + str2, null);
        }
        return execFFmpegCommand;
    }

    public static int convertVideo2Webp(C85284k kVar, AbstractC85282i iVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("ffmpeg");
        if (kVar.f190861l > 0 || kVar.f190862m > 0) {
            sb.append(" -accurate_seek");
            sb.append(" -ss ").append(ms2TimeFormat(kVar.f190861l));
            sb.append(" -t ").append(ms2TimeFormat(kVar.f190862m));
        }
        if (kVar.f190850a.contains(" ")) {
            kVar.f190850a = kVar.f190850a.replace(" ", "\\ ");
        }
        sb.append(" -y -i ").append(kVar.f190850a);
        sb.append(" -vf scale=").append(kVar.f190857h).append(":").append(kVar.f190858i);
        sb.append(" -r ").append(kVar.f190856g).append(" -loop 0 ");
        sb.append(kVar.f190851b);
        return execFFmpegCommand(sb.toString(), iVar);
    }

    public static int convertVideo2Gif(C85284k kVar, AbstractC85282i iVar) {
        int i;
        String a;
        if (kVar.f190850a.contains(" ")) {
            kVar.f190850a = kVar.f190850a.replace(" ", "\\ ");
        }
        int execFFmpegCommand = execFFmpegCommand(C1764a.m5929a(Locale.US, "ffmpeg -y -i %s -vf fps=%d,scale=%d:-1:flags=lanczos,palettegen %s", new Object[]{kVar.f190850a, Integer.valueOf(kVar.f190856g), Integer.valueOf(kVar.f190857h), kVar.f190852c}), null);
        if (execFFmpegCommand != 0) {
            return execFFmpegCommand;
        }
        VEVideoFileInfo videoFileInfo = getVideoFileInfo(kVar.f190850a);
        if (videoFileInfo == null) {
            return -1;
        }
        int i2 = videoFileInfo.width;
        if (kVar.f190854e < 0) {
            TEImageFactory.ImageInfo imageInfo = TEImageFactory.getImageInfo(null, kVar.f190853d);
            int i3 = 278;
            float f = ((float) i2) / 540.0f;
            if (imageInfo != null && imageInfo.getWidth() > 0) {
                i3 = imageInfo.getWidth();
            }
            i = (int) (((float) i3) * f);
        } else {
            i = kVar.f190854e;
        }
        if (TextUtils.isEmpty(kVar.f190853d)) {
            a = C1764a.m5929a(Locale.US, "ffmpeg -y -i %s -i %s -filter_complex setpts=%f*PTS,fps=%d,scale=%d:-1:flags=lanczos[x];[x][1:v]paletteuse %s", new Object[]{kVar.f190850a, kVar.f190852c, Float.valueOf(kVar.f190855f), Integer.valueOf(kVar.f190856g), Integer.valueOf(kVar.f190857h), kVar.f190851b});
        } else {
            a = C1764a.m5929a(Locale.US, "ffmpeg -y -i %s -i %s -i %s -filter_complex [1:v]scale=%d:-1[o1];[0:v]setpts=%f*PTS,fps=%d[o0];[o0][o1]overlay=x=%d:y=H-h-%d,scale=%d:-1:flags=lanczos[x];[x][2:v]paletteuse %s", new Object[]{kVar.f190850a, kVar.f190853d, kVar.f190852c, Integer.valueOf(i), Float.valueOf(kVar.f190855f), Integer.valueOf(kVar.f190856g), Integer.valueOf(kVar.f190859j), Integer.valueOf(kVar.f190860k), Integer.valueOf(kVar.f190857h), kVar.f190851b});
        }
        int execFFmpegCommand2 = execFFmpegCommand(a, iVar);
        m146582x2efbc5fc(new File(kVar.f190852c));
        return execFFmpegCommand2;
    }

    public static int ConvertRGBAToPNG(String str, String str2, EnumC85277d dVar) {
        return ConvertRGBAToIMG(str, str2, dVar, EnumC85276c.Img_png);
    }

    public static int getFileAudio(String str, String str2, ArrayList<String> arrayList) {
        return TEVideoUtils.getFileAudio(str, str2, arrayList, false);
    }

    public static void saveBitmapToPath(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) {
        saveBitmapToPath(bitmap, str, compressFormat, 100);
    }

    public static int execFFmpegCommandAndDumpInfo(String str, final AbstractC85282i iVar, final AbstractC85281h hVar) {
        return TEVideoUtils.executeFFmpegCommandAndDumpInfo(str, new TEVideoUtils.ExecuteCommandListener() {
            /* class com.p2082ss.android.vesdk.VEUtils.C852702 */

            static {
                Covode.recordClassIndex(99369);
            }

            @Override // com.p2082ss.android.ttve.nativePort.TEVideoUtils.ExecuteCommandListener
            public final void onProgressChanged(int i) {
                AbstractC85282i iVar = iVar;
                if (iVar != null) {
                    iVar.mo79408a(i);
                }
            }
        }, new TEVideoUtils.ExecuteCommandAndDumpInfoListener() {
            /* class com.p2082ss.android.vesdk.VEUtils.C852713 */

            static {
                Covode.recordClassIndex(99370);
            }

            @Override // com.p2082ss.android.ttve.nativePort.TEVideoUtils.ExecuteCommandAndDumpInfoListener
            public final void updateFFmpegInfo(String str) {
            }
        });
    }

    public static VEMusicWaveBean getMusicWaveData(String str, int i, int i2) {
        return getMusicWaveData(str, i, i2, 10, 0, 0);
    }

    public static VEMusicWaveBean getResampleMusicWaveData(float[] fArr, int i, int i2) {
        if (fArr.length == 0) {
            return null;
        }
        return TEVideoUtils.getResampleMusicWaveData(fArr, i, i2);
    }

    public static int isCanTransCode(String str, int i, int i2) {
        int isCanTransCode = TEVideoUtils.isCanTransCode(str, i, i2);
        if (isCanTransCode != 0) {
            C85315al.m146641c("VEUtils", "isCanTransCode not supported!  path=".concat(String.valueOf(str)));
        }
        return isCanTransCode;
    }

    public static int mixAudio(ArrayList<String> arrayList, String str, AbstractC85319ao aoVar) {
        MethodCollector.m26663i(4371);
        TEAudioUtilsCallback tEAudioUtilsCallback = new TEAudioUtilsCallback();
        tEAudioUtilsCallback.setListener(aoVar);
        int mixAudio = TEVideoUtils.mixAudio(arrayList, str, tEAudioUtilsCallback);
        C30695h.m63062a(4, "te_composition_audio_ret", (long) mixAudio);
        TEMonitorInvoker.nativeMonitorPerfWithType(4);
        MethodCollector.m26664o(4371);
        return mixAudio;
    }

    public static int getVideoFrames(String str, int[] iArr, AbstractC85304ab abVar) {
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        tEVideoUtilsCallback.setListener(abVar);
        C30689e.m63052a("iesve_veutils_extract_video_frames", 1, (C85509a) null);
        return TEVideoUtils.getVideoFrames(str, iArr, 0, 0, false, tEVideoUtilsCallback, ROTATE_DEGREE.ROTATE_NONE.ordinal());
    }

    public static int mux(String str, String str2, String str3) {
        String str4;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return -100;
        }
        C30689e.m63052a("iesve_veutils_combine_audio_and_video_start", 1, (C85509a) null);
        int mux = TEVideoUtils.mux(str, str2, str3);
        C85509a aVar = new C85509a();
        if (mux == 0) {
            str4 = "succ";
        } else {
            str4 = "fail";
        }
        aVar.mo131335a("iesve_veutils_combine_audio_and_video_finish_result", str4);
        aVar.mo131335a("iesve_veutils_combine_audio_and_video_finish_reason", "");
        C30689e.m63052a("iesve_veutils_combine_audio_and_video_finish", 1, aVar);
        return mux;
    }

    private static int concatRecordData(VERecordData vERecordData, String str, String str2) {
        int size = vERecordData.f190794b.size();
        if (size <= 0) {
            C85315al.m146642d("VEUtils", "frag count is 0");
            return -100;
        }
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        long[] jArr = new long[size];
        long[] jArr2 = new long[size];
        float[] fArr = new float[size];
        int i = 0;
        do {
            strArr[i] = vERecordData.f190794b.get(i).f190798a;
            jArr2[i] = vERecordData.f190794b.get(i).f190800c;
            strArr2[i] = vERecordData.f190794b.get(i).f190799b;
            jArr[i] = vERecordData.f190794b.get(i).f190801d;
            fArr[i] = vERecordData.f190794b.get(i).f190802e;
            i++;
        } while (i < size);
        vERecordData.f190796d = str;
        vERecordData.f190797e = str2;
        return TEVideoUtils.concatRecordFrag(strArr, jArr2, strArr2, jArr, vERecordData.f190795c, 0, null, null, vERecordData.f190796d, vERecordData.f190797e);
    }

    public static int splitVideo(String str, String[] strArr, int[] iArr, boolean z) {
        return TEVideoUtils.splitVideo(str, strArr, iArr, z);
    }

    public static int trimToDraft(String str, int[] iArr, String str2, int[] iArr2) {
        return TEVideoUtils.trimVideoFile(str, iArr, str2, iArr2);
    }

    public static int ConvertRGBAToIMG(String str, String str2, EnumC85277d dVar, EnumC85276c cVar) {
        return TEVideoUtils.ConverRGBAToIMG(str, str2, dVar.ordinal(), cVar.ordinal());
    }

    public static int getQREncodedData(String str, int i, int i2, final VEListener.AbstractC85227af afVar) {
        return TEEffectUtils.getQREncodedData(str, i, i2, null, new TEEffectUtils.QrImageListener() {
            /* class com.p2082ss.android.vesdk.VEUtils.C852735 */

            static {
                Covode.recordClassIndex(99372);
            }

            @Override // com.p2082ss.android.ttve.nativePort.TEEffectUtils.QrImageListener
            public final void onData(int[] iArr, int i, int i2, int i3) {
            }
        });
    }

    public static int transCodeAudio(String str, String str2, int i, int i2) {
        return TEVideoUtils.transCodeAudioFile(str, 0, -1, str2, i, i2, -1);
    }

    public static int convertJpegToMp4(String str, String str2, int i, boolean z) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return -100;
        }
        return TEVideoUtils.convertJpegToMp4(str, str2, i, z);
    }

    public static int isCanTransCodeWithResult(String str, int i, int i2, String[] strArr) {
        int isCanTransCodeWithResult = TEVideoUtils.isCanTransCodeWithResult(str, i, i2, strArr);
        if (isCanTransCodeWithResult != 0) {
            C85315al.m146641c("VEUtils", "isCanTransCodeWithResult not supported!  path=".concat(String.valueOf(str)));
        }
        return isCanTransCodeWithResult;
    }

    public static int cropAudio(String str, String str2, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        if (str.contains(" ")) {
            str = str.replace(" ", "\\ ");
        }
        sb.append("ffmpeg -i ").append(str).append(" -ss ").append(j / 1000).append(" -t ").append(j2 / 1000).append(" -c copy ").append(str2);
        C85315al.m146637a("VEUtils", sb.toString());
        return execFFmpegCommand(sb.toString(), null);
    }

    public static int cutVideo(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        sb.append("ffmpeg");
        if (str.contains(" ")) {
            str = str.replace(" ", "\\ ");
        }
        sb.append(" -i ").append(str);
        sb.append(" -ss ").append(str3);
        sb.append(" -t ").append(str4);
        sb.append(" -acodec copy -vcodec copy ");
        sb.append(str2);
        return execFFmpegCommand(sb.toString(), null);
    }

    public static void dumpNV21(String str, int i, int i2, byte[] bArr) {
        MethodCollector.m26663i(4539);
        YuvImage yuvImage = new YuvImage(bArr, 17, i, i2, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(new Rect(0, 0, i, i2), 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            fileOutputStream.write(byteArray);
            fileOutputStream.flush();
            fileOutputStream.close();
            byteArrayOutputStream.close();
            MethodCollector.m26664o(4539);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            MethodCollector.m26664o(4539);
        } catch (IOException e2) {
            e2.printStackTrace();
            MethodCollector.m26664o(4539);
        }
    }

    public static VESize calcTargetRes(int[] iArr, int[] iArr2, ROTATE_DEGREE[] rotate_degreeArr, int i) {
        int length;
        int min;
        int i2;
        VESize vESize = new VESize(-1, -1);
        if (iArr2 == null || iArr == null || rotate_degreeArr == null || (length = iArr.length) <= 0) {
            return vESize;
        }
        float f = 0.0f;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        do {
            int i6 = iArr2[i3];
            int i7 = iArr[i3];
            if (rotate_degreeArr[i3] == ROTATE_DEGREE.ROTATE_90 || rotate_degreeArr[i3] == ROTATE_DEGREE.ROTATE_270) {
                i7 = iArr2[i3];
                i6 = iArr[i3];
            }
            f = Math.max(f, ((float) i6) / ((float) i7));
            i4 = Math.max(i4, i7);
            i5 = Math.max(i5, i6);
            i3++;
        } while (i3 < length);
        if (length != 1) {
            f = Math.min(f, 1.7777778f);
        }
        if (f >= 1.0f) {
            i2 = Math.min(i4, i);
            min = (int) (((float) i2) * f);
        } else {
            min = Math.min(i5, i);
            i2 = (int) (((float) min) / f);
        }
        int i8 = 16;
        if (((Boolean) C85568t.m147473a().mo131557a("ve_enable_render_encode_resolution_align4", (Object) false)).booleanValue()) {
            i8 = 4;
        }
        int i9 = -i8;
        vESize.width = ((i2 + i8) - 1) & i9;
        vESize.height = ((min + i8) - 1) & i9;
        return vESize;
    }

    public static int curVideo(String str, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3) {
        if (!(arrayList.size() == arrayList2.size() && arrayList.size() == arrayList3.size() && arrayList2.size() == arrayList3.size())) {
            return -100;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ffmpeg");
        if (str.contains(" ")) {
            str = str.replace(" ", "\\ ");
        }
        sb.append(" -i ").append(str);
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append(" -ss ").append(arrayList2.get(i));
            sb.append(" -t ").append(arrayList3.get(i));
            sb.append(" -acodec copy -vcodec copy ");
            sb.append(arrayList.get(i));
        }
        return execFFmpegCommand(sb.toString(), null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0089, code lost:
        if (r4 == null) goto L_0x0093;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006e A[SYNTHETIC, Splitter:B:28:0x006e] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0078 A[SYNTHETIC, Splitter:B:33:0x0078] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void saveBitmapToPath(android.graphics.Bitmap r7, java.lang.String r8, android.graphics.Bitmap.CompressFormat r9, int r10) {
        /*
        // Method dump skipped, instructions count: 163
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.vesdk.VEUtils.saveBitmapToPath(android.graphics.Bitmap, java.lang.String, android.graphics.Bitmap$CompressFormat, int):void");
    }

    public static C85327as createRTAudioWaveformMgr(int i, int i2, int i3, float f, int i4) {
        return new C85327as(i, i2, i3, f, i4);
    }

    public static int findAudioSegmentStartTimeInOrigin(String str, int i, String str2, int i2, int i3) {
        return TEVideoUtils.findAudioSegmentStartTimeInOrigin(str, i, str2, i2, i3);
    }

    public static int getAudioFromRecordData(String str, VERecordData vERecordData, int i, int i2, int i3) {
        return getAudioFromRecordData(str, vERecordData, i, i2, i3, EnumC85275b.Legacy);
    }

    public static VEMusicWaveBean getMusicWaveData(String str, int i, int i2, int i3, int i4) {
        return getMusicWaveData(str, i, i2, 10, i3, i4);
    }

    public static int concatJpegWithMp4(String str, String str2, String str3, int i, boolean z) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || i < 33) {
            return -100;
        }
        int convertJpegToMp4 = convertJpegToMp4(str, str3, i, z);
        if (convertJpegToMp4 != 0) {
            C85315al.m146642d("VEUtils", "concatJpegWithMp4 error, convert failed ".concat(String.valueOf(convertJpegToMp4)));
            return convertJpegToMp4;
        }
        int concatVideo = concatVideo(new String[]{str3, str2}, str3);
        if (concatVideo != 0) {
            C85315al.m146642d("VEUtils", "concatJpegWithMp4 error, concatVideo failed ".concat(String.valueOf(concatVideo)));
        }
        return concatVideo;
    }

    public static VEMVAudioAlgorithmResult getAudioBeatAlgorithmResult(String str, String str2, int i, int i2, int i3) {
        C85315al.m146642d("VEUtils", "getAudioBeatAlgorithmResult trimIn " + i + ", trimOut " + i2 + ", mvTime " + i3);
        VEMVAudioAlgorithmResult vEMVAudioAlgorithmResult = (VEMVAudioAlgorithmResult) TEVideoUtils.getAudioAlgorithmResult(str, str2, i, i2);
        vEMVAudioAlgorithmResult.resizeBeatTrackingNum(i2 - i, i3);
        C85315al.m146639b("VEUtils", "getAudioBeatAlgorithmResult time = " + Arrays.toString(vEMVAudioAlgorithmResult.bitsTime));
        C85315al.m146639b("VEUtils", "getAudioBeatAlgorithmResult value = " + Arrays.toString(vEMVAudioAlgorithmResult.bitsValue));
        return vEMVAudioAlgorithmResult;
    }

    public static int saveCompressedImage(String str, String str2, int i, int i2, int i3) {
        boolean z;
        String str3;
        Bitmap.CompressFormat compressFormat;
        if (i <= 0 || i2 <= 0) {
            z = true;
        } else {
            z = false;
        }
        Bitmap loadBitmap = BitmapLoader.loadBitmap(str, i, i2, BitmapLoader.EnumC85576a.INVALID, true, true, z);
        if (loadBitmap != null) {
            if (i3 == 0) {
                str3 = str2 + "0.png";
                compressFormat = Bitmap.CompressFormat.PNG;
            } else if (i3 == 1) {
                str3 = str2 + "0.jpeg";
                compressFormat = Bitmap.CompressFormat.JPEG;
            } else {
                C85315al.m146642d("VEUtils", "Target format is wrongly configured, generate compressed image failed!");
                return 1;
            }
            saveBitmapToPath(loadBitmap, str3, compressFormat);
            return 0;
        }
        C85315al.m146642d("VEUtils", "Bitmap is empty, generate compressed image failed!");
        return 1;
    }

    public static int transCodeAudio(String str, String str2, int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append("ffmpeg");
        if (str.contains(" ")) {
            str = str.replace(" ", "\\ ");
        }
        sb.append(" -i ").append(str);
        if (i != -1) {
            sb.append(" -ac ").append(i);
        }
        if (i2 != -1) {
            sb.append(" -ab ").append(i2);
        }
        if (i3 != -1) {
            sb.append(" -ar ").append(i3);
        }
        sb.append(" ".concat(String.valueOf(str2)));
        C85315al.m146637a("VEUtils", sb.toString());
        return execFFmpegCommand(sb.toString(), null);
    }

    public static int getVideoFrames(String str, int[] iArr, int i, int i2, boolean z, AbstractC85304ab abVar) {
        return getVideoFrames(str, iArr, i, i2, z, abVar, ROTATE_DEGREE.ROTATE_NONE);
    }

    public static int getVideoFrames2(String str, int[] iArr, int i, int i2, boolean z, AbstractC85304ab abVar) {
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        tEVideoUtilsCallback.setListener(abVar);
        C30689e.m63052a("iesve_veutils_extract_video_frames", 1, (C85509a) null);
        return TEVideoUtils.getVideoFrames2(str, iArr, i, i2, z, tEVideoUtilsCallback);
    }

    public static int getVideoFrames3(String str, int[] iArr, int i, int i2, boolean z, AbstractC85304ab abVar) {
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        tEVideoUtilsCallback.setListener(abVar);
        C30689e.m63052a("iesve_veutils_extract_video_frames", 1, (C85509a) null);
        return TEVideoUtils.getVideoFrames3(str, iArr, i, i2, z, tEVideoUtilsCallback);
    }

    public static VEMusicWaveBean getMusicWaveData(String str, int i, int i2, int i3, int i4, int i5) {
        if (i == 0) {
            i = C30680h.f73385f;
        }
        VEMusicWaveBean audioWaveData = TEVideoUtils.getAudioWaveData(str, i, i2, i3, i4, i5);
        if (audioWaveData == null || audioWaveData.getWaveBean().length == 0) {
            return null;
        }
        return audioWaveData;
    }

    public static int transCodeAudio(String str, int i, int i2, String str2, int i3, int i4) {
        MethodCollector.m26663i(4316);
        int transCodeAudioFile = TEVideoUtils.transCodeAudioFile(str, i, i2, str2, i3, i4, -1);
        C30695h.m63062a(4, "te_edit_get_audio_frame_ret", (long) transCodeAudioFile);
        TEMonitorInvoker.nativeMonitorPerfWithType(4);
        MethodCollector.m26664o(4316);
        return transCodeAudioFile;
    }

    public static int getVideoThumb(VERecordData vERecordData, int i, int i2, int i3, boolean z, AbstractC85304ab abVar) {
        ROTATE_DEGREE rotate_degree = ROTATE_DEGREE.ROTATE_NONE;
        String str = "";
        int i4 = 0;
        int i5 = 0;
        for (VERecordData.VERecordSegmentData vERecordSegmentData : vERecordData.f190794b) {
            if (vERecordSegmentData.f190807j) {
                str = vERecordSegmentData.f190798a;
                rotate_degree = vERecordSegmentData.f190804g;
                int i6 = (int) ((vERecordSegmentData.f190809l - vERecordSegmentData.f190808k) / 1000);
                i5 = Math.min(i6, ((int) (vERecordSegmentData.f190808k / 1000)) + (i - i4));
                if (i >= i4 && i <= i4 + i6) {
                    break;
                }
                i4 += i6;
            }
        }
        if (TextUtils.isEmpty(str) || i5 < 0) {
            C85315al.m146642d("VEUtils", "Timestamp is not in the valid time range!");
            return -100;
        }
        return getVideoFrames(str, new int[]{i5}, i2, i3, z, abVar, rotate_degree);
    }

    public static int transCodeAudio(String str, String str2, float f, int i, int i2, int i3) {
        MethodCollector.m26663i(4163);
        int detachAudioFromVideos = TEVideoUtils.detachAudioFromVideos(str, new String[]{str2}, new long[]{-1}, new long[]{-1}, -1, -1, new float[]{f}, i, i2, i3);
        C30695h.m63062a(4, "te_edit_get_audio_frame_ret", (long) detachAudioFromVideos);
        TEMonitorInvoker.nativeMonitorPerfWithType(4);
        MethodCollector.m26664o(4163);
        return detachAudioFromVideos;
    }

    public static int getAudioFromRecordData(String str, VERecordData vERecordData, int i, int i2, int i3, EnumC85275b bVar) {
        if (vERecordData == null || vERecordData.f190794b.size() <= 0) {
            C85315al.m146642d("VEUtils", "Get AudioFromRecordData parameter error!");
            return -100;
        }
        int size = vERecordData.f190794b.size();
        String[] strArr = new String[size];
        long[] jArr = new long[size];
        long[] jArr2 = new long[size];
        long[] jArr3 = new long[size];
        long[] jArr4 = new long[size];
        float[] fArr = new float[size];
        int i4 = 0;
        long j = 0;
        for (VERecordData.VERecordSegmentData vERecordSegmentData : vERecordData.f190794b) {
            if (vERecordSegmentData.f190807j) {
                strArr[i4] = vERecordSegmentData.f190799b;
                jArr[i4] = (long) ((int) (vERecordSegmentData.f190808k / 1000));
                jArr2[i4] = (long) ((int) (vERecordSegmentData.f190809l / 1000));
                fArr[i4] = vERecordSegmentData.f190802e;
                jArr3[i4] = (long) ((int) (((float) jArr[i4]) * fArr[i4]));
                jArr4[i4] = (long) ((int) (((float) jArr2[i4]) * fArr[i4]));
                j += jArr4[i4] - jArr3[i4];
                i4++;
            }
        }
        if (i4 != 0) {
            return detachAudioFromVideos(str, (String[]) Arrays.copyOf(strArr, i4), Arrays.copyOf(jArr3, i4), Arrays.copyOf(jArr4, i4), 0, j, Arrays.copyOf(fArr, i4), i, i2, i3, bVar);
        }
        C85315al.m146642d("VEUtils", "getAudioFromRecordData There are no valid clips!");
        return -100;
    }

    public static int processAudioTuning(String[] strArr, int[] iArr, int[] iArr2, float f, float f2, String str, String str2) {
        return TEVideoUtils.processAudioTuning(strArr, iArr, iArr2, f, f2, str, str2);
    }

    public static int getVideoFrameData(String str, int i, int i2, int i3, int i4, TEVideoUtils.EnumC30710a aVar, AbstractC85305ac acVar) {
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        tEVideoUtilsCallback.setFrameDataListener(acVar);
        return TEVideoUtils.getVideoFrameData(str, i, i2, i3, i4, aVar, tEVideoUtilsCallback);
    }

    public static int getVideoFrames(String str, int[] iArr, int i, int i2, boolean z, AbstractC85304ab abVar, ROTATE_DEGREE rotate_degree) {
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        tEVideoUtilsCallback.setListener(abVar);
        C30689e.m63052a("iesve_veutils_extract_video_frames", 1, (C85509a) null);
        return TEVideoUtils.getVideoFrames(str, iArr, i, i2, z, tEVideoUtilsCallback, rotate_degree.ordinal());
    }

    public static int concatRecordFrag(String[] strArr, String[] strArr2, boolean z, int i, String str, String str2, String str3, String str4) {
        long[] jArr = new long[strArr.length];
        Arrays.fill(jArr, -1L);
        long[] jArr2 = new long[strArr2.length];
        Arrays.fill(jArr2, -1L);
        return concatRecordFrag(strArr, jArr, strArr2, jArr2, z, i, str, str2, str3, str4);
    }

    public static int getVideoThumb(String str, int i, AbstractC85304ab abVar, boolean z, int i2, int i3, long j, int i4) {
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        tEVideoUtilsCallback.setListener(abVar);
        C30689e.m63052a("iesve_veutils_extract_video_thumb", 1, (C85509a) null);
        return TEVideoUtils.getVideoThumb(str, i, tEVideoUtilsCallback, z, i2, i3, j, i4);
    }

    public static int saveVideoFrames(String str, int[] iArr, int i, int i2, boolean z, String str2, String str3, int i3) {
        MethodCollector.m26663i(3981);
        int saveVideoFrames = TEVideoUtils.saveVideoFrames(str, iArr, i, i2, z, str2 + str3, i3, 70);
        C30695h.m63062a(4, "te_edit_save_frame_without_effect_ret", (long) saveVideoFrames);
        TEMonitorInvoker.nativeMonitorPerfWithType(4);
        MethodCollector.m26664o(3981);
        return saveVideoFrames;
    }

    public static int getVideoFrames(String str, int[] iArr, int i, int i2, boolean z, boolean z2, int i3, boolean z3, AbstractC85304ab abVar) {
        return TEVideoUtils.getVideoFramesMore(str, iArr, i, i2, z, z2, i3, z3, abVar);
    }

    public static int saveVideoFrames(String str, int[] iArr, int i, int i2, boolean z, String str2, String str3, int i3, int i4) {
        MethodCollector.m26663i(3974);
        int saveVideoFrames = TEVideoUtils.saveVideoFrames(str, iArr, i, i2, z, str2 + str3, i3, i4);
        if (saveVideoFrames != 0 && getFileType(str) == EnumC85274a.type_Image.getValue()) {
            saveVideoFrames = saveCompressedImage(str, str2 + str3, i, i2, i3);
        }
        C30695h.m63062a(4, "te_edit_save_frame_without_effect_ret", (long) saveVideoFrames);
        TEMonitorInvoker.nativeMonitorPerfWithType(4);
        MethodCollector.m26664o(3974);
        return saveVideoFrames;
    }

    public static int detachAudioFromVideos(String str, String[] strArr, long[] jArr, long[] jArr2, long j, long j2, float[] fArr, int i, int i2, int i3) {
        return detachAudioFromVideos(str, strArr, jArr, jArr2, j, j2, fArr, i, i2, i3, EnumC85275b.Legacy);
    }

    public static int concatRecordFrag(String[] strArr, long[] jArr, String[] strArr2, long[] jArr2, boolean z, int i, String str, String str2, String str3, String str4) {
        for (String str5 : strArr) {
            if (!new File(str5).exists()) {
                return -114;
            }
        }
        for (String str6 : strArr2) {
            if (!new File(str6).exists()) {
                return -114;
            }
        }
        return TEVideoUtils.concatRecordFrag(strArr, jArr, strArr2, jArr2, z, i, str, str2, str3, str4);
    }

    public static int detachAudioFromVideos(String str, String[] strArr, long[] jArr, long[] jArr2, long j, long j2, float[] fArr, int i, int i2, int i3, EnumC85275b bVar) {
        MethodCollector.m26663i(4098);
        int detachAudioFromVideos = TEVideoUtils.detachAudioFromVideos(str, strArr, jArr, jArr2, j, j2, fArr, i, i2, i3, bVar.ordinal());
        C30695h.m63062a(4, "te_edit_get_audio_frame_ret", (long) detachAudioFromVideos);
        TEMonitorInvoker.nativeMonitorPerfWithType(4);
        MethodCollector.m26664o(4098);
        return detachAudioFromVideos;
    }
}
