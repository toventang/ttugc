package com.p2082ss.avframework.livestreamv2.recorder;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.buffer.SurfaceTextureHelper;
import com.p2082ss.avframework.buffer.VideoFrame;
import com.p2082ss.avframework.capture.audio.AudioCapturer;
import com.p2082ss.avframework.capture.video.ScreenVideoCapturer;
import com.p2082ss.avframework.capture.video.VideoCapturer;
import com.p2082ss.avframework.codec.DefaultAudioEncoderFactory;
import com.p2082ss.avframework.codec.DefaultVideoEncoderFactory;
import com.p2082ss.avframework.engine.AudioEncoderFactory;
import com.p2082ss.avframework.engine.AudioTrack;
import com.p2082ss.avframework.engine.MediaEncodeStream;
import com.p2082ss.avframework.engine.MediaEngineFactory;
import com.p2082ss.avframework.engine.Transport;
import com.p2082ss.avframework.engine.VideoEncoderFactory;
import com.p2082ss.avframework.engine.VideoProcessor;
import com.p2082ss.avframework.engine.VideoSink;
import com.p2082ss.avframework.engine.VideoTrack;
import com.p2082ss.avframework.livestreamv2.LiveStreamBuilder;
import com.p2082ss.avframework.livestreamv2.capture.LiveStreamVideoCapture;
import com.p2082ss.avframework.livestreamv2.recorder.IRecorderManager;
import com.p2082ss.avframework.mixer.AudioMixer;
import com.p2082ss.avframework.opengl.GLThread;
import com.p2082ss.avframework.opengl.GlUtil;
import com.p2082ss.avframework.recorder.MediaRecorder;
import com.p2082ss.avframework.recorder.NativeMp4Recorder;
import com.p2082ss.avframework.recorder.SystemMediaRecorder;
import com.p2082ss.avframework.utils.AVLog;
import com.p2082ss.avframework.utils.SafeHandlerThread;
import com.p2082ss.avframework.utils.SafeHandlerThreadPoolExecutor;
import com.p2082ss.avframework.utils.TEBundle;
import com.p2082ss.avframework.utils.ThreadUtils;
import com.p2082ss.avframework.utils.TimeUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.avframework.livestreamv2.recorder.RecorderManager */
public class RecorderManager implements VideoCapturer.VideoCapturerObserver, MediaEncodeStream.Observer, Transport.EventObserver, IRecorderManager {
    private final int STAT_ERROR;
    private final int STAT_RELEASE;
    private final int STAT_START;
    private final int STAT_STOP;
    private AudioEncoderFactory mAudioEncoderFactory;
    private int mAudioRecordIdx;
    private AudioTrack mAudioTrack;
    public List<AudioTrack> mAudioTrackList;
    public IRecorderManager.Config mConfig;
    private boolean mEnableAccelera;
    public TEBundle mEncodeOpt;
    private Transport mEncodeStreamCallback;
    public IRecorderManager mExternRecordMgr;
    private String mFile;
    public Handler mGLHandler;
    private GLThread mGLThread;
    public IRecorderManager.IRecorderListener mListener;
    public MediaEncodeStream mMediaEncodeStream;
    private MediaEngineFactory mMediaEngineFactory;
    private ArrayList<Transport.MediaPacket> mMediaPacketsCache;
    public int mMode;
    public long mReceiveAudioFrameCounts;
    public long mReceiveVideoFrameCounts;
    private SafeHandlerThread mRecordThread;
    private MediaRecorder mRecorder;
    private Context mScreenContext;
    private Intent mScreenIntent;
    private AudioCapturer mSharedAudioCapture;
    private RecordVideoSink mSharedCaptureSink;
    private VideoCapturer mSharedVideoCapture;
    public AtomicInteger mState;
    public SurfaceTextureSharedHandler mSurfaceTextureSharedHandler;
    private boolean mUseByteVC0SoftEncoder;
    private VideoCapturer mVideoCapturer;
    private VideoEncoderFactory mVideoEncoderFactory;
    private int mVideoRecordIdx;
    private VideoTrack mVideoTrack;
    private WaterMarkProcess mWaterMarkProcess;
    private long mWriteAudioFrameCounts;
    private long mWriteVideoFrameCounts;

    static {
        Covode.recordClassIndex(100602);
    }

    @Override // com.p2082ss.avframework.capture.video.VideoCapturer.VideoCapturerObserver
    public void onVideoCapturerStarted() {
    }

    @Override // com.p2082ss.avframework.capture.video.VideoCapturer.VideoCapturerObserver
    public void onVideoCapturerStoped() {
    }

    public int pushVideoFrame(int i, boolean z, int i2, int i3, float[] fArr, long j) {
        return -1;
    }

    public IRecorderManager getExternRecordMgr() {
        return this.mExternRecordMgr;
    }

    @Override // com.p2082ss.avframework.livestreamv2.recorder.IRecorderManager
    public IRecorderManager.Config getConfig() {
        return this.mConfig.dump();
    }

    public VideoSink getSharedSink() {
        RecordVideoSink recordVideoSink = this.mSharedCaptureSink;
        if (recordVideoSink != null) {
            return recordVideoSink.getVideoSink();
        }
        return null;
    }

    public void onClearCache() {
        while (!this.mMediaPacketsCache.isEmpty()) {
            onWriteFile(this.mMediaPacketsCache.remove(0));
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.recorder.IRecorderManager
    public void stop() {
        if (this.mState.get() != 4) {
            this.mRecordThread.post(new Runnable() {
                /* class com.p2082ss.avframework.livestreamv2.recorder.RecorderManager.RunnableC860177 */

                static {
                    Covode.recordClassIndex(100609);
                }

                public void run() {
                    if (RecorderManager.this.mExternRecordMgr == null || RecorderManager.this.mMode != 2) {
                        RecorderManager.this.onStop();
                    } else {
                        RecorderManager.this.mExternRecordMgr.stop();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.livestreamv2.recorder.RecorderManager$WaterMarkProcess */
    public class WaterMarkProcess extends VideoProcessor implements SurfaceTexture.OnFrameAvailableListener {
        private Handler mHandler;
        private Surface mSurface;
        private SurfaceTexture mSurfaceTexture = new SurfaceTexture(this.mTex);
        private int mTex = GlUtil.generateTexture(36197);
        private boolean mUpdateFrame;

        static {
            Covode.recordClassIndex(100615);
        }

        @Override // com.p2082ss.avframework.engine.NativeObject
        public synchronized void release() {
            MethodCollector.m26663i(2215);
            this.mSurface.release();
            this.mSurfaceTexture.release();
            GLES20.glDeleteTextures(1, new int[]{this.mTex}, 0);
            super.release();
            MethodCollector.m26664o(2215);
        }

        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            this.mUpdateFrame = true;
        }

        public Canvas lock(Rect rect) {
            return this.mSurface.lockCanvas(rect);
        }

        @Override // com.p2082ss.avframework.engine.VideoProcessor
        public VideoFrame process(VideoFrame videoFrame) {
            if (this.mUpdateFrame) {
                this.mUpdateFrame = false;
            }
            return videoFrame;
        }

        public void unlockAndPost(Canvas canvas) {
            this.mSurface.unlockCanvasAndPost(canvas);
        }

        public WaterMarkProcess(Handler handler) {
            this.mHandler = handler;
            int i = Build.VERSION.SDK_INT;
            this.mSurfaceTexture.setDefaultBufferSize(RecorderManager.this.mConfig.videoWidth, RecorderManager.this.mConfig.videoHeight);
            if (Build.VERSION.SDK_INT >= 21) {
                this.mSurfaceTexture.setOnFrameAvailableListener(this, this.mHandler);
            } else {
                this.mSurfaceTexture.setOnFrameAvailableListener(this);
            }
            this.mSurface = new Surface(this.mSurfaceTexture);
        }
    }

    private void onCreateEncodeStream() {
        if (this.mMediaEncodeStream == null) {
            this.mVideoEncoderFactory = new DefaultVideoEncoderFactory();
            this.mAudioEncoderFactory = new DefaultAudioEncoderFactory();
            MediaRecorder mediaRecorder = this.mRecorder;
            if (mediaRecorder instanceof Transport) {
                this.mEncodeStreamCallback = (Transport) mediaRecorder;
            } else {
                this.mEncodeStreamCallback = new EncodeStreamCallback();
            }
            MediaEncodeStream createMediaEncodeStream = this.mMediaEngineFactory.createMediaEncodeStream(this.mVideoEncoderFactory, this.mAudioEncoderFactory, this.mEncodeStreamCallback);
            this.mMediaEncodeStream = createMediaEncodeStream;
            createMediaEncodeStream.registerObserver(this);
            this.mMediaEncodeStream.stop();
        }
    }

    private void onStartCamera() {
        boolean z;
        if (this.mConfig.havaVideo) {
            if (this.mSharedVideoCapture == null) {
                this.mSharedVideoCapture = this.mSharedCaptureSink;
                z = true;
            } else {
                z = false;
            }
            onCreateVideoTrack();
            if (z) {
                this.mSharedCaptureSink.start(this.mConfig.videoWidth, this.mConfig.videoHeight, this.mConfig.videoFps);
            }
        }
        onStartAudio();
    }

    public synchronized void release() {
        MethodCollector.m26663i(3209);
        stop();
        SafeHandlerThread safeHandlerThread = this.mRecordThread;
        if (safeHandlerThread != null) {
            SafeHandlerThreadPoolExecutor.unlockThread(safeHandlerThread);
            this.mRecordThread = null;
        }
        this.mMediaEngineFactory = null;
        GLThread gLThread = this.mGLThread;
        if (gLThread != null) {
            SafeHandlerThreadPoolExecutor.unlockThread(gLThread);
            this.mGLThread = null;
        }
        RecordVideoSink recordVideoSink = this.mSharedCaptureSink;
        if (recordVideoSink != null) {
            recordVideoSink.release();
            this.mSharedCaptureSink = null;
        }
        this.mScreenContext = null;
        this.mState.set(4);
        MethodCollector.m26664o(3209);
    }

    private void onStartAudio() {
        if (this.mConfig.haveAudio) {
            if (this.mSharedAudioCapture == null) {
                this.mState.set(3);
                this.mListener.onRecorderError(-4, new Exception("Not found shared audio capture."));
                return;
            }
            onCreateAudioTrack();
        }
        AudioCapturer audioCapturer = this.mSharedAudioCapture;
        if (audioCapturer != null) {
            audioCapturer.resume();
        }
        AVLog.iod("RecorderManager", "encoderStream cfg:" + this.mEncodeOpt.toString());
    }

    private void onStartRecorder() {
        int start;
        if (!this.mConfig.havaVideo && !this.mConfig.haveAudio) {
            return;
        }
        if ((this.mConfig.havaVideo && this.mVideoRecordIdx >= 0) || !this.mConfig.havaVideo) {
            if (((this.mConfig.haveAudio && this.mAudioRecordIdx >= 0) || !this.mConfig.haveAudio) && (start = this.mRecorder.start()) < 0) {
                this.mState.set(3);
                this.mListener.onRecorderError(-7, new Exception("Start recorder error (" + start + ")"));
            }
        }
    }

    private void onStartScreen() {
        if (this.mConfig.havaVideo) {
            ScreenSourceWrapper screenSourceWrapper = new ScreenSourceWrapper(this.mScreenIntent, this);
            if (this.mGLHandler == null) {
                GLThread lockGLThread = SafeHandlerThreadPoolExecutor.lockGLThread("RecorderProcessThread");
                this.mGLThread = lockGLThread;
                lockGLThread.start();
                this.mGLHandler = this.mGLThread.getHandler();
            }
            ThreadUtils.invokeAtFrontUninterruptibly(this.mGLHandler, new Runnable() {
                /* class com.p2082ss.avframework.livestreamv2.recorder.RecorderManager.RunnableC860166 */

                static {
                    Covode.recordClassIndex(100608);
                }

                public void run() {
                    RecorderManager recorderManager = RecorderManager.this;
                    RecorderManager recorderManager2 = RecorderManager.this;
                    recorderManager.mSurfaceTextureSharedHandler = new SurfaceTextureSharedHandler(recorderManager2.mGLHandler);
                }
            });
            screenSourceWrapper.initialize(this.mSurfaceTextureSharedHandler, this.mScreenContext);
            screenSourceWrapper.setOutputFormat(this.mConfig.videoWidth, this.mConfig.videoHeight, this.mConfig.videoFps);
            this.mVideoCapturer = screenSourceWrapper;
            onCreateVideoTrack();
        }
        onStartAudio();
        if (this.mVideoCapturer != null && this.mState.get() != 3) {
            this.mVideoCapturer.start(this.mConfig.videoWidth, this.mConfig.videoHeight, this.mConfig.videoFps);
        }
    }

    public void onStop() {
        int i;
        String str;
        onDestroyTrack();
        int i2 = this.mState.get();
        this.mState.set(2);
        MediaRecorder mediaRecorder = this.mRecorder;
        if (mediaRecorder != null) {
            i = mediaRecorder.stop();
            this.mRecorder.release();
            this.mRecorder = null;
        } else {
            i = -1;
        }
        this.mVideoRecordIdx = -1;
        this.mAudioRecordIdx = -1;
        this.mWriteAudioFrameCounts = 0;
        this.mWriteVideoFrameCounts = 0;
        this.mReceiveAudioFrameCounts = 0;
        this.mReceiveVideoFrameCounts = 0;
        this.mMediaPacketsCache.clear();
        IRecorderManager.IRecorderListener iRecorderListener = this.mListener;
        if (iRecorderListener != null) {
            if (i < 0 || i2 == 3) {
                str = "";
            } else {
                str = this.mFile;
            }
            iRecorderListener.onRecorderStoped(str);
        }
    }

    private void onCreateAudioTrack() {
        onCreateEncodeStream();
        this.mAudioTrack = this.mMediaEngineFactory.createAudioTrack(this.mSharedAudioCapture);
        if (this.mEncodeOpt == null) {
            this.mEncodeOpt = this.mMediaEncodeStream.getParameter();
        }
        this.mEncodeOpt.setString("audio_type", "audio/faac");
        this.mEncodeOpt.setInt("audio_sample", this.mConfig.audioSample);
        this.mEncodeOpt.setInt("audio_channels", this.mConfig.audioChannel);
        this.mEncodeOpt.setLong("audio_bit_rate", this.mConfig.audioBitrate);
        this.mMediaEncodeStream.setParameter(this.mEncodeOpt);
        this.mMediaEncodeStream.addTrack(this.mAudioTrack);
        this.mMediaEncodeStream.getAudioMixer().setEnable(true);
        this.mMediaEncodeStream.setOriginAudioTrack(this.mAudioTrack.mo132293id());
        this.mMediaEncodeStream.setAudioMixerDescription(this.mAudioTrack.mo132293id(), new AudioMixer.AudioMixerDescription());
        for (AudioTrack audioTrack : this.mAudioTrackList) {
            this.mMediaEncodeStream.addTrack(audioTrack);
            this.mMediaEncodeStream.setAudioMixerDescription(audioTrack.mo132293id(), new AudioMixer.AudioMixerDescription());
            AVLog.iod("RecorderManager", " add audio track to encode stream " + audioTrack.mo132293id());
        }
    }

    private void onCreateVideoTrack() {
        String str;
        onCreateEncodeStream();
        MediaEngineFactory mediaEngineFactory = this.mMediaEngineFactory;
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer == null) {
            videoCapturer = this.mSharedVideoCapture;
        }
        VideoTrack createVideoTrack = mediaEngineFactory.createVideoTrack(videoCapturer);
        this.mVideoTrack = createVideoTrack;
        WaterMarkProcess waterMarkProcess = this.mWaterMarkProcess;
        if (waterMarkProcess != null) {
            createVideoTrack.setVideoProcessor(waterMarkProcess);
        }
        if (this.mEncodeOpt == null) {
            this.mEncodeOpt = this.mMediaEncodeStream.getParameter();
        }
        if (this.mEnableAccelera) {
            str = "video/avc";
        } else if (this.mUseByteVC0SoftEncoder) {
            str = "video/bytevc0";
        } else {
            str = "video/x264";
        }
        this.mEncodeOpt.setString("video_type", str);
        this.mEncodeOpt.setBool("video_enable_accelera", this.mEnableAccelera);
        this.mEncodeOpt.setInt("video_width", this.mConfig.videoWidth);
        this.mEncodeOpt.setInt("video_height", this.mConfig.videoHeight);
        this.mEncodeOpt.setLong("video_bitrate", this.mConfig.videoBitrate);
        this.mEncodeOpt.setInt("video_fps", this.mConfig.videoFps);
        this.mEncodeOpt.setBool("video_enable_bframe", false);
        this.mEncodeOpt.setInt("configuration_type", 1);
        if (this.mConfig.videoProfileHigh) {
            this.mEncodeOpt.setInt("video_profileLevel", 3);
        } else {
            this.mEncodeOpt.setInt("video_profileLevel", 1);
        }
        if (this.mEnableAccelera) {
            this.mEncodeOpt.setInt("video_profileLevel", 1);
        }
        this.mMediaEncodeStream.setParameter(this.mEncodeOpt);
        this.mMediaEncodeStream.addTrack(this.mVideoTrack);
    }

    private void onDestroyTrack() {
        AudioTrack audioTrack;
        VideoTrack videoTrack;
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if (mediaEncodeStream != null) {
            mediaEncodeStream.stop();
        }
        RecordVideoSink recordVideoSink = this.mSharedCaptureSink;
        if (recordVideoSink != null) {
            recordVideoSink.stop();
        }
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer != null) {
            videoCapturer.stop();
        }
        MediaEncodeStream mediaEncodeStream2 = this.mMediaEncodeStream;
        if (!(mediaEncodeStream2 == null || (videoTrack = this.mVideoTrack) == null)) {
            mediaEncodeStream2.removeTrack(videoTrack);
        }
        MediaEncodeStream mediaEncodeStream3 = this.mMediaEncodeStream;
        if (!(mediaEncodeStream3 == null || (audioTrack = this.mAudioTrack) == null)) {
            mediaEncodeStream3.removeTrack(audioTrack);
            for (AudioTrack audioTrack2 : this.mAudioTrackList) {
                this.mMediaEncodeStream.removeTrack(audioTrack2);
            }
        }
        MediaEncodeStream mediaEncodeStream4 = this.mMediaEncodeStream;
        if (mediaEncodeStream4 != null) {
            mediaEncodeStream4.release();
            this.mMediaEncodeStream = null;
        }
        VideoTrack videoTrack2 = this.mVideoTrack;
        if (videoTrack2 != null) {
            videoTrack2.release();
            this.mVideoTrack = null;
        }
        AudioTrack audioTrack3 = this.mAudioTrack;
        if (audioTrack3 != null) {
            audioTrack3.release();
            this.mAudioTrack = null;
        }
        VideoCapturer videoCapturer2 = this.mVideoCapturer;
        if (videoCapturer2 != null) {
            videoCapturer2.release();
            this.mVideoCapturer = null;
        }
        SurfaceTextureSharedHandler surfaceTextureSharedHandler = this.mSurfaceTextureSharedHandler;
        if (surfaceTextureSharedHandler != null) {
            surfaceTextureSharedHandler.dispose();
            this.mSurfaceTextureSharedHandler = null;
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
        Transport transport = this.mEncodeStreamCallback;
        if (transport != null) {
            if (!(transport instanceof MediaRecorder)) {
                transport.release();
            }
            this.mEncodeStreamCallback = null;
        }
    }

    public void setupAudioSource(AudioCapturer audioCapturer) {
        this.mSharedAudioCapture = audioCapturer;
    }

    public void setupVideoSource(VideoCapturer videoCapturer) {
        this.mSharedVideoCapture = videoCapturer;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.livestreamv2.recorder.RecorderManager$EncodeStreamCallback */
    public class EncodeStreamCallback extends Transport {
        static {
            Covode.recordClassIndex(100612);
        }

        @Override // com.p2082ss.avframework.engine.Transport
        public void registerFeedbackObserber(Transport.FeedbackObserver feedbackObserver) {
        }

        @Override // com.p2082ss.avframework.engine.Transport
        public void unRegisterFeedbackObserber(Transport.FeedbackObserver feedbackObserver) {
        }

        private EncodeStreamCallback() {
        }

        @Override // com.p2082ss.avframework.engine.Transport
        public void sendPacket(Transport.MediaPacket mediaPacket) {
            if (mediaPacket.isVideo) {
                RecorderManager.this.mReceiveVideoFrameCounts++;
            } else {
                RecorderManager.this.mReceiveAudioFrameCounts++;
            }
            RecorderManager.this.receiverPacket(mediaPacket);
        }
    }

    public void onWriteCache(Transport.MediaPacket mediaPacket) {
        this.mMediaPacketsCache.add(mediaPacket);
    }

    @Override // com.p2082ss.avframework.livestreamv2.recorder.IRecorderManager
    public void unlockAndPost(Canvas canvas) {
        WaterMarkProcess waterMarkProcess = this.mWaterMarkProcess;
        if (waterMarkProcess != null) {
            waterMarkProcess.unlockAndPost(canvas);
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.recorder.IRecorderManager
    public Canvas lock(Rect rect) {
        WaterMarkProcess waterMarkProcess = this.mWaterMarkProcess;
        if (waterMarkProcess != null) {
            return waterMarkProcess.lock(rect);
        }
        return null;
    }

    @Override // com.p2082ss.avframework.livestreamv2.recorder.IRecorderManager
    public void addAudioTrack(final AudioTrack audioTrack) {
        SafeHandlerThread safeHandlerThread = this.mRecordThread;
        if (safeHandlerThread != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(safeHandlerThread.getHandler(), new Runnable() {
                /* class com.p2082ss.avframework.livestreamv2.recorder.RecorderManager.RunnableC860188 */

                static {
                    Covode.recordClassIndex(100610);
                }

                public void run() {
                    if (audioTrack != null) {
                        AVLog.iod("RecorderManager", "add tract " + audioTrack.mo132293id());
                        if (RecorderManager.this.mMediaEncodeStream != null) {
                            RecorderManager.this.mMediaEncodeStream.addTrack(audioTrack);
                        }
                        RecorderManager.this.mAudioTrackList.remove(audioTrack);
                        RecorderManager.this.mAudioTrackList.add(audioTrack);
                    }
                }
            });
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.recorder.IRecorderManager
    public void removeAudioTrack(final AudioTrack audioTrack) {
        SafeHandlerThread safeHandlerThread = this.mRecordThread;
        if (safeHandlerThread != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(safeHandlerThread.getHandler(), new Runnable() {
                /* class com.p2082ss.avframework.livestreamv2.recorder.RecorderManager.RunnableC860199 */

                static {
                    Covode.recordClassIndex(100611);
                }

                public void run() {
                    if (audioTrack != null) {
                        AVLog.iod("RecorderManager", "remove tract " + audioTrack.mo132293id());
                        if (RecorderManager.this.mMediaEncodeStream != null) {
                            RecorderManager.this.mMediaEncodeStream.removeTrack(audioTrack);
                        }
                        RecorderManager.this.mAudioTrackList.remove(audioTrack);
                    }
                }
            });
        }
    }

    private Transport.MediaPacket copyPacket(Transport.MediaPacket mediaPacket) {
        Transport.MediaPacket mediaPacket2 = new Transport.MediaPacket();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(mediaPacket.size);
        mediaPacket.buffer.position(mediaPacket.offset);
        mediaPacket.buffer.limit(mediaPacket.size);
        allocateDirect.put(mediaPacket.buffer);
        mediaPacket2.set(allocateDirect, mediaPacket.isVideo, 0, mediaPacket.size, mediaPacket.presentationTimeUs, mediaPacket.flags);
        return mediaPacket2;
    }

    private int findNextNal(ByteBuffer byteBuffer) {
        int i;
        int position = byteBuffer.position();
        int position2 = byteBuffer.position();
        if (byteBuffer.get(position2) == 0 && byteBuffer.get(position2 + 1) == 0 && byteBuffer.get(position2 + 2) == 0 && byteBuffer.get(position2 + 3) == 1) {
            position2 += 4;
            i = 4;
        } else if (byteBuffer.get(position2) == 0 && byteBuffer.get(position2 + 1) == 0 && byteBuffer.get(position2 + 2) == 1) {
            position2 += 3;
            i = 3;
        } else {
            i = 0;
        }
        int i2 = -1;
        while (i + position < byteBuffer.capacity() - 3) {
            byte b = byteBuffer.get(position2);
            position2++;
            i2 = (i2 << 8) | b;
            i++;
            if (i2 == 1) {
                return i - 4;
            }
            if ((16777215 & i2) == 1) {
                return i - 3;
            }
        }
        return 0;
    }

    private boolean onUpdateConfig(IRecorderManager.Config config) {
        if (config.havaVideo && (config.videoFps <= 0 || config.videoWidth <= 0 || config.videoHeight <= 0 || config.videoBitrate < 1)) {
            this.mListener.onRecorderError(-2, new IllegalArgumentException("video parameter invalid."));
            return false;
        } else if (!config.haveAudio || (config.audioBitrate >= 1 && config.audioSample > 0 && config.audioChannel >= 0)) {
            this.mConfig = config;
            config.videoHeight = align(config.videoHeight, 16);
            IRecorderManager.Config config2 = this.mConfig;
            config2.videoWidth = align(config2.videoWidth, 16);
            return true;
        } else {
            this.mListener.onRecorderError(-3, new IllegalArgumentException("Audio parameter invalid"));
            return false;
        }
    }

    private void setupParameter(LiveStreamBuilder liveStreamBuilder) {
        boolean z;
        IRecorderManager.Config config = new IRecorderManager.Config();
        this.mConfig = config;
        config.videoBitrate = (long) liveStreamBuilder.getVideoBitrate();
        this.mConfig.videoFps = liveStreamBuilder.getVideoFps();
        this.mConfig.videoHeight = liveStreamBuilder.getVideoHeight();
        this.mConfig.videoWidth = liveStreamBuilder.getVideoWidth();
        IRecorderManager.Config config2 = this.mConfig;
        if (liveStreamBuilder.getVideoProfile() == 3) {
            z = true;
        } else {
            z = false;
        }
        config2.videoProfileHigh = z;
        this.mConfig.audioBitrate = (long) liveStreamBuilder.getAudioBitrate();
        this.mConfig.audioChannel = liveStreamBuilder.getAudioChannel();
        this.mConfig.audioSample = liveStreamBuilder.getAudioSampleHZ();
        this.mScreenIntent = liveStreamBuilder.getScreenCaptureIntent();
        this.mScreenContext = liveStreamBuilder.getContext();
        this.mEnableAccelera = liveStreamBuilder.isEnableVideoEncodeAccelera();
        this.mUseByteVC0SoftEncoder = liveStreamBuilder.isSelfInnovateSoftEncode();
    }

    public void onWriteFile(Transport.MediaPacket mediaPacket) {
        int i;
        String str;
        String str2;
        int i2;
        MediaRecorder mediaRecorder;
        int i3;
        MediaRecorder mediaRecorder2;
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int i4 = 1;
        if ((mediaPacket.flags & 1) != 0) {
            i = 2;
        } else {
            i = 0;
        }
        bufferInfo.flags = i;
        int i5 = bufferInfo.flags;
        if ((2 & mediaPacket.flags) == 0) {
            i4 = 0;
        }
        bufferInfo.flags = i5 | i4;
        bufferInfo.presentationTimeUs = mediaPacket.presentationTimeUs;
        bufferInfo.offset = mediaPacket.offset;
        bufferInfo.size = mediaPacket.size;
        if (mediaPacket.isVideo && (i3 = this.mVideoRecordIdx) >= 0 && (mediaRecorder2 = this.mRecorder) != null) {
            this.mWriteVideoFrameCounts++;
            mediaRecorder2.writeSampleData(i3, mediaPacket.buffer, bufferInfo);
        } else if (mediaPacket.isVideo || (i2 = this.mAudioRecordIdx) < 0 || (mediaRecorder = this.mRecorder) == null) {
            StringBuilder sb = new StringBuilder("Maybe we are receiver a ");
            if (mediaPacket.isVideo) {
                str = "video";
            } else {
                str = DataType.AUDIO;
            }
            StringBuilder append = sb.append(str).append("frame and size ").append(mediaPacket.size).append(", but the recorder no config it or have a internal error (statue:").append(this.mState).append(",v/a:");
            String str3 = "y";
            if (this.mConfig.havaVideo) {
                str2 = str3;
            } else {
                str2 = "n";
            }
            StringBuilder append2 = append.append(str2).append("/");
            if (!this.mConfig.haveAudio) {
                str3 = "n";
            }
            AVLog.m147809w("RecorderManager", append2.append(str3).append(",idx v/a:").append(this.mVideoRecordIdx).append("/").append(this.mAudioRecordIdx).toString());
        } else {
            this.mWriteAudioFrameCounts++;
            mediaRecorder.writeSampleData(i2, mediaPacket.buffer, bufferInfo);
        }
        mediaPacket.buffer = null;
    }

    public void receiverPacket(Transport.MediaPacket mediaPacket) {
        boolean z;
        boolean z2;
        final boolean z3 = true;
        if (this.mState.get() == 1) {
            if ((mediaPacket.flags & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!mediaPacket.isVideo || (mediaPacket.flags & 2) == 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (this.mRecorder == null) {
                this.mState.set(3);
                this.mListener.onRecorderError(-1, new Exception("Recorder is null"));
                return;
            }
            if (z) {
                if (mediaPacket.isVideo) {
                    if (this.mConfig.havaVideo && this.mVideoRecordIdx < 0) {
                        createRecordVideoTrack(mediaPacket, true);
                        return;
                    }
                } else if (!mediaPacket.isVideo && this.mConfig.haveAudio && this.mAudioRecordIdx < 0) {
                    createRecordAudioTrack(mediaPacket, true);
                    return;
                }
            }
            if (z2 && this.mVideoRecordIdx < 0) {
                createRecordVideoTrack(mediaPacket, false);
            }
            if ((!this.mConfig.havaVideo && !this.mConfig.haveAudio) || (((!this.mConfig.havaVideo || this.mVideoRecordIdx < 0) && this.mConfig.havaVideo) || ((!this.mConfig.haveAudio || this.mAudioRecordIdx < 0) && this.mConfig.haveAudio))) {
                z3 = false;
            }
            final Transport.MediaPacket copyPacket = copyPacket(mediaPacket);
            SafeHandlerThread safeHandlerThread = this.mRecordThread;
            if (safeHandlerThread != null) {
                safeHandlerThread.post(new Runnable() {
                    /* class com.p2082ss.avframework.livestreamv2.recorder.RecorderManager.RunnableC860144 */

                    static {
                        Covode.recordClassIndex(100606);
                    }

                    public void run() {
                        if (z3) {
                            RecorderManager.this.onClearCache();
                            RecorderManager.this.onWriteFile(copyPacket);
                            return;
                        }
                        RecorderManager.this.onWriteCache(copyPacket);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.livestreamv2.recorder.RecorderManager$SurfaceTextureSharedHandler */
    public class SurfaceTextureSharedHandler extends SurfaceTextureHelper {
        static {
            Covode.recordClassIndex(100614);
        }

        @Override // com.p2082ss.avframework.buffer.SurfaceTextureHelper
        public void handlerExit() {
        }

        public SurfaceTextureSharedHandler(Handler handler) {
            super(handler);
        }
    }

    public RecorderManager(LiveStreamBuilder liveStreamBuilder, MediaEngineFactory mediaEngineFactory) {
        this(liveStreamBuilder, mediaEngineFactory, null);
    }

    private int align(int i, int i2) {
        if (i2 <= 0) {
            return i;
        }
        return (((i + i2) - 1) / i2) * i2;
    }

    @Override // com.p2082ss.avframework.capture.video.VideoCapturer.VideoCapturerObserver
    public void onVideoCapturerError(final int i, final Exception exc) {
        SafeHandlerThread safeHandlerThread = this.mRecordThread;
        if (safeHandlerThread != null) {
            safeHandlerThread.post(new Runnable() {
                /* class com.p2082ss.avframework.livestreamv2.recorder.RecorderManager.RunnableC860111 */

                static {
                    Covode.recordClassIndex(100603);
                }

                public void run() {
                    RecorderManager.this.mState.set(3);
                    RecorderManager.this.mListener.onRecorderError(i, exc);
                }
            });
        }
    }

    private void createRecordAudioTrack(Transport.MediaPacket mediaPacket, boolean z) {
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", this.mConfig.audioSample, this.mConfig.audioChannel);
        mediaPacket.buffer.position(mediaPacket.offset);
        mediaPacket.buffer.limit(mediaPacket.size);
        createAudioFormat.setByteBuffer("csd-0", mediaPacket.buffer);
        this.mAudioRecordIdx = this.mRecorder.addTrack(createAudioFormat);
        onStartRecorder();
    }

    private void createRecordVideoTrack(Transport.MediaPacket mediaPacket, boolean z) {
        int i;
        mediaPacket.buffer.position(mediaPacket.offset);
        mediaPacket.buffer.limit(mediaPacket.size);
        ByteBuffer slice = mediaPacket.buffer.slice();
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", this.mConfig.videoWidth, this.mConfig.videoHeight);
        slice.position(0);
        slice.position(0);
        int findNextNal = findNextNal(slice);
        if (findNextNal > 0 && findNextNal < slice.capacity()) {
            slice.position(findNextNal);
            int findNextNal2 = findNextNal(slice);
            if (findNextNal2 > 0) {
                i = findNextNal2 + findNextNal;
            } else if (slice.capacity() < 50) {
                i = slice.limit();
            } else {
                AVLog.m147809w("RecorderManager", "Not found spspps");
                return;
            }
            if (i > 0) {
                slice.position(0);
                slice.limit(findNextNal);
                ByteBuffer slice2 = slice.slice();
                slice.limit(i);
                slice.position(findNextNal);
                ByteBuffer slice3 = slice.slice();
                createVideoFormat.setByteBuffer("csd-0", slice2);
                createVideoFormat.setByteBuffer("csd-1", slice3);
                createVideoFormat.setInteger("color-format", 19);
                this.mVideoRecordIdx = this.mRecorder.addTrack(createVideoFormat);
                onStartRecorder();
                return;
            }
        }
        AVLog.m147809w("RecorderManager", "Not found spspps on recorder.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.livestreamv2.recorder.RecorderManager$ScreenSourceWrapper */
    public class ScreenSourceWrapper extends ScreenVideoCapturer {
        private long mBaseTime;
        private long mLastTime;

        static {
            Covode.recordClassIndex(100613);
        }

        public ScreenSourceWrapper(Intent intent, VideoCapturer.VideoCapturerObserver videoCapturerObserver) {
            super(intent, videoCapturerObserver);
        }

        public void setOutputFormat(int i, int i2, int i3) {
            nativeAdaptedOutputFormat(i, i2, i3, false);
        }

        @Override // com.p2082ss.avframework.capture.video.VideoCapturer
        public int onFrame(VideoFrame.Buffer buffer, int i, int i2, int i3, long j) {
            if (this.mLastTime == 0) {
                this.mLastTime = j;
            }
            if (this.mBaseTime == 0) {
                this.mBaseTime = TimeUtils.nanoTime() / 1000;
                long guessFrameTimestampDiffUs = LiveStreamVideoCapture.guessFrameTimestampDiffUs(j);
                if (guessFrameTimestampDiffUs > 0) {
                    this.mBaseTime -= guessFrameTimestampDiffUs;
                }
            }
            long j2 = this.mBaseTime + (j - this.mLastTime);
            this.mBaseTime = j2;
            this.mLastTime = j;
            return super.onFrame(buffer, i, i2, i3, j2);
        }
    }

    public RecorderManager(LiveStreamBuilder liveStreamBuilder, MediaEngineFactory mediaEngineFactory, IRecorderManager iRecorderManager) {
        this.STAT_START = 1;
        this.STAT_STOP = 2;
        this.STAT_ERROR = 3;
        this.STAT_RELEASE = 4;
        this.mAudioRecordIdx = -1;
        this.mVideoRecordIdx = -1;
        this.mAudioTrackList = new ArrayList();
        this.mMediaEngineFactory = mediaEngineFactory;
        SafeHandlerThread lockThread = SafeHandlerThreadPoolExecutor.lockThread("RecorderThread");
        this.mRecordThread = lockThread;
        lockThread.start();
        this.mState = new AtomicInteger(2);
        this.mMediaPacketsCache = new ArrayList<>();
        this.mSharedCaptureSink = new RecordVideoSink();
        setupParameter(liveStreamBuilder);
        this.mExternRecordMgr = iRecorderManager;
    }

    @Override // com.p2082ss.avframework.engine.MediaEncodeStream.Observer
    public void onMediaEncodeStreamEvent(final int i, int i2, long j, String str) {
        SafeHandlerThread safeHandlerThread = this.mRecordThread;
        if (safeHandlerThread != null) {
            safeHandlerThread.post(new Runnable() {
                /* class com.p2082ss.avframework.livestreamv2.recorder.RecorderManager.RunnableC860122 */

                static {
                    Covode.recordClassIndex(100604);
                }

                public void run() {
                    if (2 == i) {
                        boolean bool = RecorderManager.this.mEncodeOpt.getBool("video_enable_accelera");
                        String string = RecorderManager.this.mEncodeOpt.getString("video_type");
                        if (bool || !string.equalsIgnoreCase("video/x264")) {
                            RecorderManager.this.mEncodeOpt.setString("video_type", "video/x264");
                            RecorderManager.this.mEncodeOpt.setBool("video_enable_accelera", false);
                            if (RecorderManager.this.mMediaEncodeStream != null) {
                                RecorderManager.this.mMediaEncodeStream.setParameter(RecorderManager.this.mEncodeOpt);
                            }
                            AVLog.m147805d("RecorderManager", "Update recorder encoder to soft.");
                            return;
                        }
                        RecorderManager.this.mState.set(3);
                        RecorderManager.this.mListener.onRecorderError(-1, new Exception("Not found video encoder (" + string + "/" + "w" + ")"));
                    }
                }
            });
        }
    }

    @Override // com.p2082ss.avframework.engine.Transport.EventObserver
    public void onTransportEvent(final int i, final int i2, final long j, String str) {
        SafeHandlerThread safeHandlerThread = this.mRecordThread;
        if (safeHandlerThread != null) {
            safeHandlerThread.post(new Runnable() {
                /* class com.p2082ss.avframework.livestreamv2.recorder.RecorderManager.RunnableC860133 */

                static {
                    Covode.recordClassIndex(100605);
                }

                public void run() {
                    int i = i;
                    if (i == 1) {
                        AVLog.m147805d("RecorderManager", "Recording on native.");
                    } else if (i == 2) {
                        AVLog.m147805d("RecorderManager", "Recorded on native.");
                    } else if (i == 3) {
                        RecorderManager.this.mState.set(3);
                        RecorderManager.this.mListener.onRecorderError(i, new Exception("Recorder have an internal error (" + i2 + ", " + j + ")"));
                        if (RecorderManager.this.mMediaEncodeStream != null) {
                            RecorderManager.this.mMediaEncodeStream.stop();
                        }
                    }
                }
            });
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.recorder.IRecorderManager
    public void start(final String str, final IRecorderManager.IRecorderListener iRecorderListener, final IRecorderManager.Config config, final int i) {
        if (this.mState.get() != 4) {
            this.mRecordThread.post(new Runnable() {
                /* class com.p2082ss.avframework.livestreamv2.recorder.RecorderManager.RunnableC860155 */

                static {
                    Covode.recordClassIndex(100607);
                }

                public void run() {
                    int i;
                    if (RecorderManager.this.mExternRecordMgr == null || (i = i) != 2) {
                        RecorderManager.this.onStart(str, iRecorderListener, config, i);
                        return;
                    }
                    RecorderManager.this.mMode = i;
                    RecorderManager.this.mExternRecordMgr.start(str, iRecorderListener, config, i);
                }
            });
        }
    }

    public void onStart(String str, IRecorderManager.IRecorderListener iRecorderListener, IRecorderManager.Config config, int i) {
        if (this.mState.get() == 1) {
            iRecorderListener.onRecorderError(-1, new IllegalStateException("Already start"));
        }
        if (this.mState.get() == 3) {
            iRecorderListener.onRecorderError(-1, new IllegalStateException("Error status call and no stop."));
            return;
        }
        this.mListener = iRecorderListener;
        if (onUpdateConfig(config)) {
            this.mFile = str;
            this.mMode = i;
            if (this.mConfig.useMediaMuxer) {
                int i2 = Build.VERSION.SDK_INT;
                this.mRecorder = new SystemMediaRecorder(this.mFile, 0);
            } else {
                NativeMp4Recorder nativeMp4Recorder = new NativeMp4Recorder(this.mConfig.havaVideo, this.mConfig.haveAudio);
                nativeMp4Recorder.setEventObserver(this);
                TEBundle parameter = nativeMp4Recorder.getParameter();
                parameter.dump();
                parameter.setInt("mp4_video_height", this.mConfig.videoHeight);
                parameter.setInt("mp4_video_width", this.mConfig.videoWidth);
                parameter.setInt("mp4_fps", this.mConfig.videoFps);
                parameter.setBool("mp4_enable_BFrame", false);
                parameter.setString("mp4_file_name", this.mFile);
                parameter.dump();
                nativeMp4Recorder.setParameter(parameter);
                this.mRecorder = nativeMp4Recorder;
                nativeMp4Recorder.start();
            }
            if (this.mRecorder == null) {
                this.mState.set(3);
                iRecorderListener.onRecorderError(-6, new UnsupportedOperationException("Not found MediaRecorder"));
                return;
            }
            if (this.mMode == 1) {
                onStartScreen();
            } else {
                onStartCamera();
            }
            if (this.mState.get() != 3) {
                this.mState.set(1);
                this.mMediaEncodeStream.start();
                this.mListener.onRecorderStarted();
            }
        }
    }
}
