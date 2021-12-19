package com.p2082ss.avframework.livestreamv2.filter;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.avframework.buffer.VideoFrame;
import com.p2082ss.avframework.capture.video.ExternalVideoCapturer;
import com.p2082ss.avframework.capture.video.VideoCapturer;
import com.p2082ss.avframework.codec.DefaultAudioEncoderFactory;
import com.p2082ss.avframework.codec.DefaultVideoEncoderFactory;
import com.p2082ss.avframework.engine.AudioEncoderFactory;
import com.p2082ss.avframework.engine.MediaEncodeStream;
import com.p2082ss.avframework.engine.MediaEngineFactory;
import com.p2082ss.avframework.engine.Transport;
import com.p2082ss.avframework.engine.VideoEncoderFactory;
import com.p2082ss.avframework.engine.VideoTrack;
import com.p2082ss.avframework.opengl.RendererCommon;
import com.p2082ss.avframework.utils.AVLog;
import com.p2082ss.avframework.utils.SafeHandlerThread;
import com.p2082ss.avframework.utils.SafeHandlerThreadPoolExecutor;
import com.p2082ss.avframework.utils.TEBundle;
import com.p2082ss.avframework.utils.TimeUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.avframework.livestreamv2.filter.VideoCatcher */
public class VideoCatcher implements VideoCapturer.VideoCapturerObserver, MediaEncodeStream.Observer {
    private AudioEncoderFactory mAudioEncoderFactory;
    private String[] mAvailableVideoEncoders;
    public VideoCatcherCallback mCallback;
    private TEBundle mEncodeStreamOpt;
    private int mFps;
    private H264Dumper mH264Dumper;
    public Handler mHandler;
    private int mHeight;
    private MediaEncodeStream mMediaEncodeStream;
    private int mMode;
    public PngShotter mPngShotter;
    private AtomicBoolean mStarted = new AtomicBoolean(false);
    private boolean mUseHardwareEncoder = true;
    private ExternalVideoCapturer mVideoCapturer;
    private VideoEncoderFactory mVideoEncoderFactory;
    private VideoTrack mVideoTrack;
    private int mWidth;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.livestreamv2.filter.VideoCatcher$VideoCatcherCallback */
    public interface VideoCatcherCallback {
        static {
            Covode.recordClassIndex(100561);
        }

        void onCatchedBuffer(VideoCatcher videoCatcher);

        void onError(int i, String str);
    }

    static {
        Covode.recordClassIndex(100552);
    }

    private String getSoftEncoderCodec() {
        return "video/x264";
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getMode() {
        return this.mMode;
    }

    public int getWidth() {
        return this.mWidth;
    }

    @Override // com.p2082ss.avframework.capture.video.VideoCapturer.VideoCapturerObserver
    public void onVideoCapturerStarted() {
        AVLog.iod("VideoCatcher", "onVideoCapturerStarted");
    }

    @Override // com.p2082ss.avframework.capture.video.VideoCapturer.VideoCapturerObserver
    public void onVideoCapturerStoped() {
        AVLog.iod("VideoCatcher", "onVideoCapturerStoped");
    }

    public ByteBuffer getPixelBuffer() {
        PngShotter pngShotter = this.mPngShotter;
        if (pngShotter == null) {
            return null;
        }
        return pngShotter.copyBuffer();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.livestreamv2.filter.VideoCatcher$PngShotter */
    public class PngShotter {
        public Bitmap mBitmap;
        private ByteBuffer mBuffer;
        public int mCount;
        public Object mFence;
        public String mPngSaveDir;
        private SafeHandlerThread mShotThread;
        private ByteBuffer mTempBuffer;

        static {
            Covode.recordClassIndex(100557);
        }

        /* access modifiers changed from: package-private */
        public ByteBuffer copyBuffer() {
            this.mBuffer.position(0);
            this.mTempBuffer.rewind();
            this.mTempBuffer.limit(this.mBuffer.capacity());
            this.mTempBuffer.put(this.mBuffer);
            this.mTempBuffer.rewind();
            return this.mTempBuffer;
        }

        public void post(Runnable runnable) {
            SafeHandlerThread safeHandlerThread = this.mShotThread;
            if (safeHandlerThread != null) {
                safeHandlerThread.post(runnable);
            }
        }

        private PngShotter() {
            this.mPngSaveDir = "";
            this.mFence = new Object();
        }

        public void stop(final int i) {
            Handler handler = VideoCatcher.this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() {
                    /* class com.p2082ss.avframework.livestreamv2.filter.VideoCatcher.PngShotter.RunnableC859812 */

                    static {
                        Covode.recordClassIndex(100559);
                    }

                    public void run() {
                        if (!(i == 0 || TextUtils.isEmpty(PngShotter.this.mPngSaveDir))) {
                            File file = new File(PngShotter.this.mPngSaveDir);
                            if (file.exists() && file.isDirectory()) {
                                for (int i = 1; i <= PngShotter.this.mCount; i++) {
                                    try {
                                        File file2 = new File(PngShotter.this.mPngSaveDir + "/" + i + ".png");
                                        if (file2.exists() && file2.isFile()) {
                                            m147787x6f7a023d(file2);
                                        }
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                        }
                    }

                    /* renamed from: com_ss_avframework_livestreamv2_filter_VideoCatcher$PngShotter$2_com_ss_android_ugc_aweme_storage_FileLancet_delete */
                    public static boolean m147787x6f7a023d(File file) {
                        MethodCollector.m26663i(1039);
                        try {
                            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
                            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
                            }
                            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                                MethodCollector.m26664o(1039);
                                return false;
                            }
                        } catch (Throwable unused) {
                        }
                        boolean delete = file.delete();
                        MethodCollector.m26664o(1039);
                        return delete;
                    }
                });
                SafeHandlerThread safeHandlerThread = this.mShotThread;
                if (safeHandlerThread != null) {
                    SafeHandlerThreadPoolExecutor.unlockThread(safeHandlerThread);
                    this.mShotThread = null;
                }
                Bitmap bitmap = this.mBitmap;
                if (bitmap != null) {
                    if (!bitmap.isRecycled()) {
                        this.mBitmap.recycle();
                        System.gc();
                    }
                    this.mBitmap = null;
                }
                if (this.mBuffer != null) {
                    this.mBuffer = null;
                }
            }
        }

        public void initBitmapBuffer(int i, int i2) {
            MethodCollector.m26663i(195);
            Bitmap bitmap = this.mBitmap;
            if (!(bitmap != null && bitmap.getWidth() == i && this.mBitmap.getHeight() == i2)) {
                this.mBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            }
            ByteBuffer byteBuffer = this.mBuffer;
            if (byteBuffer == null || byteBuffer.capacity() < i * i2 * 4) {
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i * i2 * 4);
                this.mBuffer = allocateDirect;
                this.mTempBuffer = ByteBuffer.allocateDirect(allocateDirect.capacity());
            }
            ByteBuffer byteBuffer2 = this.mBuffer;
            if (byteBuffer2 != null) {
                byteBuffer2.clear();
            }
            MethodCollector.m26664o(195);
        }

        /* access modifiers changed from: package-private */
        public boolean readPixels(int i, int i2) {
            boolean z;
            MethodCollector.m26663i(564);
            try {
                synchronized (this.mBuffer) {
                    try {
                        VideoCatcher.this.mPngShotter.initBitmapBuffer(i, i2);
                        GLES20.glReadPixels(0, 0, i, i2, 6408, 5121, this.mBuffer);
                    } catch (Throwable th) {
                        MethodCollector.m26664o(564);
                        throw th;
                    }
                }
                z = true;
            } catch (Exception e) {
                e.printStackTrace();
                int glGetError = GLES20.glGetError();
                if (glGetError != 0) {
                    AVLog.logToIODevice2(6, "VideoCatcher", "glReadPixels error ".concat(String.valueOf(glGetError)), null, "VideoCatcher.PngShotter:onFrame", 10000);
                }
                z = false;
            }
            try {
                synchronized (this.mFence) {
                    try {
                        this.mBitmap.copyPixelsFromBuffer(this.mBuffer);
                    } catch (Throwable th2) {
                        MethodCollector.m26664o(564);
                        throw th2;
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (TextUtils.isEmpty(this.mPngSaveDir)) {
                MethodCollector.m26664o(564);
                return z;
            }
            this.mShotThread.post(new Runnable() {
                /* class com.p2082ss.avframework.livestreamv2.filter.VideoCatcher.PngShotter.RunnableC859823 */

                static {
                    Covode.recordClassIndex(100560);
                }

                public void run() {
                    MethodCollector.m26663i(3899);
                    StringBuilder append = new StringBuilder().append(PngShotter.this.mPngSaveDir).append("/");
                    PngShotter pngShotter = PngShotter.this;
                    int i = pngShotter.mCount + 1;
                    pngShotter.mCount = i;
                    try {
                        File file = new File(append.append(i).append(".png").toString());
                        if (file.exists()) {
                            m147788x9d529c9c(file);
                        }
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        synchronized (PngShotter.this.mFence) {
                            try {
                                PngShotter.this.mBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                            } catch (Throwable th) {
                                MethodCollector.m26664o(3899);
                                throw th;
                            }
                        }
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        MethodCollector.m26664o(3899);
                    } catch (Exception e) {
                        e.printStackTrace();
                        MethodCollector.m26664o(3899);
                    }
                }

                /* renamed from: com_ss_avframework_livestreamv2_filter_VideoCatcher$PngShotter$3_com_ss_android_ugc_aweme_storage_FileLancet_delete */
                public static boolean m147788x9d529c9c(File file) {
                    MethodCollector.m26663i(3904);
                    try {
                        C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
                        if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                            C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
                        }
                        if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                            C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                            MethodCollector.m26664o(3904);
                            return false;
                        }
                    } catch (Throwable unused) {
                    }
                    boolean delete = file.delete();
                    MethodCollector.m26664o(3904);
                    return delete;
                }
            });
            MethodCollector.m26664o(564);
            return z;
        }

        public void start(int i, int i2, String str) {
            initBitmapBuffer(i, i2);
            this.mPngSaveDir = str;
            SafeHandlerThread lockThread = SafeHandlerThreadPoolExecutor.lockThread("PngShotThread_".concat(String.valueOf(this)));
            this.mShotThread = lockThread;
            lockThread.start();
            if (!TextUtils.isEmpty(this.mPngSaveDir)) {
                this.mShotThread.post(new Runnable() {
                    /* class com.p2082ss.avframework.livestreamv2.filter.VideoCatcher.PngShotter.RunnableC859801 */

                    static {
                        Covode.recordClassIndex(100558);
                    }

                    public void run() {
                        try {
                            File file = new File(PngShotter.this.mPngSaveDir);
                            if (file.exists() && file.isFile()) {
                                m147786x41a167de(file);
                            }
                            if (!file.exists()) {
                                file.mkdirs();
                            }
                            if (!file.exists()) {
                                throw new Exception(file + " doesn't exist.");
                            } else if (!file.canWrite()) {
                                throw new Exception(file + " is forbidden to write.");
                            }
                        } catch (Exception e) {
                            if (VideoCatcher.this.mCallback != null) {
                                VideoCatcher.this.mCallback.onError(-5, e.toString());
                            }
                        }
                    }

                    /* renamed from: com_ss_avframework_livestreamv2_filter_VideoCatcher$PngShotter$1_com_ss_android_ugc_aweme_storage_FileLancet_delete */
                    public static boolean m147786x41a167de(File file) {
                        MethodCollector.m26663i(1150);
                        try {
                            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
                            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
                            }
                            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                                MethodCollector.m26664o(1150);
                                return false;
                            }
                        } catch (Throwable unused) {
                        }
                        boolean delete = file.delete();
                        MethodCollector.m26664o(1150);
                        return delete;
                    }
                });
            }
        }
    }

    private String chooseVideoEncode() {
        if (this.mAvailableVideoEncoders == null) {
            String GetSupportedFormats = this.mVideoEncoderFactory.GetSupportedFormats();
            if (GetSupportedFormats != null) {
                this.mAvailableVideoEncoders = GetSupportedFormats.split(":");
            } else {
                throw new AndroidRuntimeException("Not found any valid video encoder");
            }
        }
        String str = null;
        if (this.mUseHardwareEncoder) {
            String[] strArr = this.mAvailableVideoEncoders;
            for (String str2 : strArr) {
                if (str2.contains("video_enable_accelera=true") && str2.contains("video_type=video/avc")) {
                    str = "video/avc";
                }
            }
            if (str != null) {
                return str;
            }
        }
        String softEncoderCodec = getSoftEncoderCodec();
        AVLog.iow("VideoCatcher", C1764a.m5928a("Hardware video encoder not found, use %s instead.", new Object[]{softEncoderCodec}));
        this.mUseHardwareEncoder = false;
        return softEncoderCodec;
    }

    private void setupParameter() {
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if (mediaEncodeStream != null) {
            if (this.mEncodeStreamOpt == null) {
                this.mEncodeStreamOpt = mediaEncodeStream.getParameter();
            }
            this.mEncodeStreamOpt.setString("video_type", chooseVideoEncode());
            this.mEncodeStreamOpt.setBool("video_enable_accelera", this.mUseHardwareEncoder);
            this.mEncodeStreamOpt.setInt("video_width", this.mWidth);
            this.mEncodeStreamOpt.setInt("video_height", this.mHeight);
            this.mEncodeStreamOpt.setInt("video_profileLevel", 3);
            this.mEncodeStreamOpt.setInt("video_fps", this.mFps);
            this.mEncodeStreamOpt.setInt("video_gop", this.mFps * 2);
            this.mEncodeStreamOpt.setInt("video_is_cbr", 1);
            this.mEncodeStreamOpt.setInt("configuration_type", 1);
            this.mEncodeStreamOpt.setBool("video_lossless_encode", true);
            AVLog.iod("VideoCatcher", "Dump all encodeStream config:" + this.mEncodeStreamOpt.toString());
            this.mMediaEncodeStream.setParameter(this.mEncodeStreamOpt);
        }
    }

    public void onCreateEncoderError() {
        String string = this.mEncodeStreamOpt.getString("video_type");
        if (this.mMediaEncodeStream != null) {
            String string2 = this.mEncodeStreamOpt.getString("video_type");
            int i = this.mEncodeStreamOpt.getInt("video_profileLevel");
            if (this.mUseHardwareEncoder) {
                int i2 = 1;
                if (i == 1) {
                    this.mUseHardwareEncoder = false;
                    string2 = getSoftEncoderCodec();
                    i2 = 3;
                }
                AVLog.iow("VideoCatcher", "Video encoder switch to " + string2 + ", hardware " + this.mUseHardwareEncoder + ", profile " + i2);
                this.mEncodeStreamOpt.setString("video_type", string2);
                this.mEncodeStreamOpt.setBool("video_enable_accelera", this.mUseHardwareEncoder);
                this.mEncodeStreamOpt.setInt("video_profileLevel", i2);
                this.mMediaEncodeStream.setParameter(this.mEncodeStreamOpt);
                return;
            }
            String str = "Video encoder(" + string + ") created failed";
            AVLog.ioe("VideoCatcher", str);
            VideoCatcherCallback videoCatcherCallback = this.mCallback;
            if (videoCatcherCallback != null) {
                videoCatcherCallback.onError(-4, str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.livestreamv2.filter.VideoCatcher$H264Dumper */
    public class H264Dumper extends Transport {
        public int codeOnQuit;
        public Object mDumpFence;
        private Thread mDumpThread;
        public ConcurrentLinkedQueue<Transport.MediaPacket> mPacketQueue;
        public boolean mRunning;

        static {
            Covode.recordClassIndex(100555);
        }

        @Override // com.p2082ss.avframework.engine.Transport
        public void registerFeedbackObserber(Transport.FeedbackObserver feedbackObserver) {
        }

        @Override // com.p2082ss.avframework.engine.Transport
        public void unRegisterFeedbackObserber(Transport.FeedbackObserver feedbackObserver) {
        }

        private H264Dumper() {
            this.mPacketQueue = new ConcurrentLinkedQueue<>();
            this.mDumpFence = new Object();
            this.codeOnQuit = 0;
        }

        @Override // com.p2082ss.avframework.engine.Transport
        public void sendPacket(Transport.MediaPacket mediaPacket) {
            MethodCollector.m26663i(73);
            this.mPacketQueue.offer(mediaPacket);
            synchronized (this.mDumpFence) {
                try {
                    this.mDumpFence.notify();
                } finally {
                    MethodCollector.m26664o(73);
                }
            }
        }

        @Override // com.p2082ss.avframework.engine.Transport
        public boolean setupUrl(final String str) {
            Thread thread = new Thread(new Runnable() {
                /* class com.p2082ss.avframework.livestreamv2.filter.VideoCatcher.H264Dumper.RunnableC859791 */
                private String mH264OutputPath;
                private FileOutputStream mH264OutputStream;

                static {
                    Covode.recordClassIndex(100556);
                }

                private void onQuit() {
                    if (this.mH264OutputStream != null) {
                        while (!H264Dumper.this.mPacketQueue.isEmpty()) {
                            Transport.MediaPacket poll = H264Dumper.this.mPacketQueue.poll();
                            if (poll != null) {
                                try {
                                    this.mH264OutputStream.getChannel().write(poll.buffer);
                                } catch (Exception e) {
                                    if (VideoCatcher.this.mCallback != null) {
                                        VideoCatcher.this.mCallback.onError(-5, e.toString());
                                    }
                                }
                            }
                        }
                        try {
                            this.mH264OutputStream.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                        this.mH264OutputStream = null;
                    }
                    if (H264Dumper.this.codeOnQuit != 0) {
                        try {
                            File file = new File(this.mH264OutputPath);
                            if (file.exists() && file.isFile()) {
                                m147785x63a1f873(file);
                            }
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                    }
                }

                private boolean onStart() {
                    MethodCollector.m26663i(1495);
                    try {
                        File file = new File(this.mH264OutputPath);
                        String parent = file.getParent();
                        File file2 = new File(parent);
                        if (!file2.exists()) {
                            file2.mkdirs();
                        }
                        if (!file2.exists()) {
                            Exception exc = new Exception(parent + " doesn't exist.");
                            MethodCollector.m26664o(1495);
                            throw exc;
                        } else if (file2.canWrite()) {
                            if (file.exists() && file.isFile()) {
                                m147785x63a1f873(file);
                            }
                            this.mH264OutputStream = new FileOutputStream(file, false);
                            MethodCollector.m26664o(1495);
                            return true;
                        } else {
                            Exception exc2 = new Exception(parent + " is forbidden to write.");
                            MethodCollector.m26664o(1495);
                            throw exc2;
                        }
                    } catch (Exception e) {
                        FileOutputStream fileOutputStream = this.mH264OutputStream;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                            this.mH264OutputStream = null;
                        }
                        if (VideoCatcher.this.mCallback != null) {
                            VideoCatcher.this.mCallback.onError(-5, e.toString());
                        }
                        MethodCollector.m26664o(1495);
                        return false;
                    }
                }

                public void run() {
                    FileOutputStream fileOutputStream;
                    MethodCollector.m26663i(1403);
                    this.mH264OutputPath = str;
                    H264Dumper.this.mRunning = onStart();
                    while (H264Dumper.this.mRunning) {
                        if (H264Dumper.this.mPacketQueue.isEmpty()) {
                            try {
                                synchronized (H264Dumper.this.mDumpFence) {
                                    try {
                                        H264Dumper.this.mDumpFence.wait();
                                    } catch (Throwable th) {
                                        MethodCollector.m26664o(1403);
                                        throw th;
                                    }
                                }
                            } catch (Exception e) {
                                if (VideoCatcher.this.mCallback != null) {
                                    VideoCatcher.this.mCallback.onError(-5, e.toString());
                                }
                            }
                        }
                        Transport.MediaPacket poll = H264Dumper.this.mPacketQueue.poll();
                        if (!(poll == null || (fileOutputStream = this.mH264OutputStream) == null)) {
                            try {
                                fileOutputStream.getChannel().write(poll.buffer);
                            } catch (Exception e2) {
                                if (VideoCatcher.this.mCallback != null) {
                                    VideoCatcher.this.mCallback.onError(-5, e2.toString());
                                }
                            }
                        }
                    }
                    onQuit();
                    MethodCollector.m26664o(1403);
                }

                /* renamed from: com_ss_avframework_livestreamv2_filter_VideoCatcher$H264Dumper$1_com_ss_android_ugc_aweme_storage_FileLancet_delete */
                public static boolean m147785x63a1f873(File file) {
                    MethodCollector.m26663i(1503);
                    try {
                        C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
                        if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                            C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
                        }
                        if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                            C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                            MethodCollector.m26664o(1503);
                            return false;
                        }
                    } catch (Throwable unused) {
                    }
                    boolean delete = file.delete();
                    MethodCollector.m26664o(1503);
                    return delete;
                }
            });
            this.mDumpThread = thread;
            thread.setName("DumpH264Thread_" + this.mDumpThread);
            this.mDumpThread.start();
            return true;
        }

        public void stop(int i) {
            MethodCollector.m26663i(70);
            this.mRunning = false;
            this.codeOnQuit = i;
            synchronized (this.mDumpFence) {
                try {
                    this.mDumpFence.notifyAll();
                } catch (Throwable th) {
                    MethodCollector.m26664o(70);
                    throw th;
                }
            }
            try {
                this.mDumpThread.join(5000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.mDumpThread = null;
            MethodCollector.m26664o(70);
        }
    }

    /* access modifiers changed from: package-private */
    public void stop(int i) {
        VideoTrack videoTrack;
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if (mediaEncodeStream != null) {
            mediaEncodeStream.stop();
        }
        MediaEncodeStream mediaEncodeStream2 = this.mMediaEncodeStream;
        if (!(mediaEncodeStream2 == null || (videoTrack = this.mVideoTrack) == null)) {
            mediaEncodeStream2.removeTrack(videoTrack);
        }
        H264Dumper h264Dumper = this.mH264Dumper;
        if (h264Dumper != null) {
            h264Dumper.stop(i);
            this.mH264Dumper = null;
        }
        TEBundle tEBundle = this.mEncodeStreamOpt;
        if (tEBundle != null) {
            tEBundle.release();
            this.mEncodeStreamOpt = null;
        }
        MediaEncodeStream mediaEncodeStream3 = this.mMediaEncodeStream;
        if (mediaEncodeStream3 != null) {
            mediaEncodeStream3.registerObserver(null);
            this.mMediaEncodeStream.release();
            this.mMediaEncodeStream = null;
        }
        VideoEncoderFactory videoEncoderFactory = this.mVideoEncoderFactory;
        if (videoEncoderFactory != null) {
            videoEncoderFactory.release();
            this.mVideoEncoderFactory = null;
        }
        AudioEncoderFactory audioEncoderFactory = this.mAudioEncoderFactory;
        if (audioEncoderFactory != null) {
            audioEncoderFactory.release();
            this.mAudioEncoderFactory = null;
        }
        ExternalVideoCapturer externalVideoCapturer = this.mVideoCapturer;
        if (externalVideoCapturer != null) {
            externalVideoCapturer.stop();
            this.mVideoCapturer.release();
            this.mVideoCapturer = null;
        }
        VideoTrack videoTrack2 = this.mVideoTrack;
        if (videoTrack2 != null) {
            videoTrack2.release();
            this.mVideoTrack = null;
        }
        PngShotter pngShotter = this.mPngShotter;
        if (pngShotter != null) {
            pngShotter.stop(i);
            this.mPngShotter = null;
        }
        this.mStarted.set(false);
    }

    /* access modifiers changed from: package-private */
    public void onFrame(VideoFrame videoFrame) {
        boolean z;
        if (this.mMode == 0) {
            VideoFrame.Buffer buffer = videoFrame.getBuffer();
            if (!(buffer instanceof VideoFrame.TextureBuffer)) {
                VideoCatcherCallback videoCatcherCallback = this.mCallback;
                if (videoCatcherCallback != null) {
                    videoCatcherCallback.onError(-4, "Video frame type not supported.");
                    return;
                }
                return;
            }
            int width = buffer.getWidth();
            int height = buffer.getHeight();
            if (width != this.mWidth || height != this.mHeight) {
                VideoCatcherCallback videoCatcherCallback2 = this.mCallback;
                if (videoCatcherCallback2 != null) {
                    videoCatcherCallback2.onError(-4, "Video frame size (" + width + ", " + height + ") does not match the init size (" + this.mWidth + ", " + this.mHeight + ")");
                }
            } else if (this.mVideoCapturer != null) {
                VideoFrame.TextureBuffer textureBuffer = (VideoFrame.TextureBuffer) buffer;
                VideoFrame.TextureBuffer.Type type = textureBuffer.getType();
                float[] convertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(textureBuffer.getTransformMatrix());
                ExternalVideoCapturer externalVideoCapturer = this.mVideoCapturer;
                int textureId = textureBuffer.getTextureId();
                if (type == VideoFrame.TextureBuffer.Type.OES) {
                    z = true;
                } else {
                    z = false;
                }
                externalVideoCapturer.pushVideoFrame(textureId, z, width, height, 0, convertMatrixFromAndroidGraphicsMatrix, videoFrame.getTimestampNs() / 1000, null, TimeUtils.currentTimeMs());
            }
        }
    }

    @Override // com.p2082ss.avframework.capture.video.VideoCapturer.VideoCapturerObserver
    public void onVideoCapturerError(int i, Exception exc) {
        VideoCatcherCallback videoCatcherCallback = this.mCallback;
        if (videoCatcherCallback != null) {
            videoCatcherCallback.onError(-3, "onVideoCapturerError: " + i + ", " + exc.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public void readPixels(int i, int i2) {
        PngShotter pngShotter;
        if (this.mMode == 1 && (pngShotter = this.mPngShotter) != null) {
            this.mWidth = i;
            this.mHeight = i2;
            if (pngShotter.readPixels(i, i2) && this.mCallback != null) {
                this.mPngShotter.post(new Runnable() {
                    /* class com.p2082ss.avframework.livestreamv2.filter.VideoCatcher.RunnableC859771 */

                    static {
                        Covode.recordClassIndex(100553);
                    }

                    public void run() {
                        VideoCatcher.this.mCallback.onCatchedBuffer(VideoCatcher.this);
                    }
                });
            }
        }
    }

    public byte[] getCompressedStream(int i, int i2, float f) {
        MethodCollector.m26663i(1596);
        ByteBuffer pixelBuffer = getPixelBuffer();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i * i2 * 4);
        Bitmap createBitmap = Bitmap.createBitmap(this.mWidth, this.mHeight, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(pixelBuffer);
        Matrix matrix = new Matrix();
        matrix.postScale(((float) i) / ((float) this.mWidth), ((float) i2) / ((float) this.mHeight));
        Bitmap.createBitmap(createBitmap, 0, 0, this.mWidth, this.mHeight, matrix, true).compress(Bitmap.CompressFormat.JPEG, (int) (100.0f * f), byteArrayOutputStream);
        try {
            byteArrayOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            MethodCollector.m26664o(1596);
            return byteArray;
        } catch (IOException unused) {
            MethodCollector.m26664o(1596);
            return null;
        }
    }

    @Override // com.p2082ss.avframework.engine.MediaEncodeStream.Observer
    public void onMediaEncodeStreamEvent(final int i, final int i2, final long j, final String str) {
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.filter.VideoCatcher.RunnableC859782 */

            static {
                Covode.recordClassIndex(100554);
            }

            public void run() {
                int i = i;
                if (i == 1) {
                    AVLog.iod("VideoCatcher", "Video encoder created");
                } else if (i == 2) {
                    VideoCatcher.this.onCreateEncoderError();
                } else if (i == 5) {
                    AVLog.iow("VideoCatcher", "Video encoder format changed: code1 " + i + ", code2 " + i2 + ", code3 " + j + ", msg \"" + str + "\"");
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void start(int i, int i2, VideoCatcherCallback videoCatcherCallback, Handler handler) {
        start(1, i, i2, 0, false, null, videoCatcherCallback, null, handler);
    }

    /* access modifiers changed from: package-private */
    public void start(int i, int i2, int i3, int i4, boolean z, String str, VideoCatcherCallback videoCatcherCallback, MediaEngineFactory mediaEngineFactory, Handler handler) {
        if (!this.mStarted.get()) {
            this.mStarted.set(true);
            if (i2 > 0 && i3 > 0 && handler != null) {
                this.mMode = i;
                this.mWidth = i2;
                this.mHeight = i3;
                this.mFps = i4;
                this.mCallback = videoCatcherCallback;
                this.mHandler = handler;
                if (i != 0) {
                    PngShotter pngShotter = new PngShotter();
                    this.mPngShotter = pngShotter;
                    pngShotter.start(this.mWidth, this.mHeight, str);
                } else if (i4 > 0 && !TextUtils.isEmpty(str) && mediaEngineFactory != null) {
                    ExternalVideoCapturer externalVideoCapturer = new ExternalVideoCapturer(this, handler);
                    this.mVideoCapturer = externalVideoCapturer;
                    this.mVideoTrack = mediaEngineFactory.createVideoTrack(externalVideoCapturer);
                    this.mUseHardwareEncoder = z;
                    this.mVideoEncoderFactory = new DefaultVideoEncoderFactory();
                    this.mAudioEncoderFactory = new DefaultAudioEncoderFactory();
                    H264Dumper h264Dumper = new H264Dumper();
                    this.mH264Dumper = h264Dumper;
                    MediaEncodeStream createMediaEncodeStream = mediaEngineFactory.createMediaEncodeStream(this.mVideoEncoderFactory, this.mAudioEncoderFactory, h264Dumper);
                    this.mMediaEncodeStream = createMediaEncodeStream;
                    createMediaEncodeStream.registerObserver(this);
                    this.mMediaEncodeStream.start();
                    setupParameter();
                    this.mH264Dumper.setupUrl(str);
                    this.mMediaEncodeStream.addTrack(this.mVideoTrack);
                    this.mVideoCapturer.start(this.mWidth, this.mHeight, this.mFps);
                } else if (videoCatcherCallback != null) {
                    videoCatcherCallback.onError(-1, "Param error: mode " + i + ",fps " + i4 + ", outputPath " + str + ", MediaEngineFactory " + mediaEngineFactory);
                }
            } else if (videoCatcherCallback != null) {
                videoCatcherCallback.onError(-1, "Param error: mode " + i + ", width " + i2 + ", height " + i3 + ", handler " + handler);
            }
        } else if (videoCatcherCallback != null) {
            videoCatcherCallback.onError(-2, "Video catching already started.");
        }
    }
}
