package com.p2082ss.avframework.livestreamv2.core.audiorecord;

import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.audiorecord.AudioRecordProcessor;
import com.p2082ss.avframework.capture.audio.AudioCapturer;
import com.p2082ss.avframework.effect.IVideoEffectProcessor;
import com.p2082ss.avframework.effect.VideoEffectUtilsWrapper;
import com.p2082ss.avframework.engine.AudioTrack;
import com.p2082ss.avframework.engine.MediaEngineFactory;
import com.p2082ss.avframework.livestreamv2.AudioOriginFrameSink;
import com.p2082ss.avframework.livestreamv2.ILiveStream;
import com.p2082ss.avframework.livestreamv2.core.audiorecord.IAudioRecordManager;
import com.p2082ss.avframework.livestreamv2.utils.TimerTaskUtils;
import com.p2082ss.avframework.utils.AVLog;
import com.p2082ss.avframework.utils.SafeHandlerThread;
import com.p2082ss.avframework.utils.SafeHandlerThreadPoolExecutor;
import java.io.File;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.core.audiorecord.AudioRecordManager */
public class AudioRecordManager implements IVideoEffectProcessor.EffectMsgListener, ILiveStream.IAudioFrameAvailableListener, IAudioRecordManager {
    private static final String TAG = AudioRecordManager.class.getSimpleName();
    private final AudioCapturer audioCapture;
    public AudioRecordProcessor audioRecordProcessor;

    /* renamed from: cb */
    private IAudioRecordManager.RecordStateCallback f191980cb;
    public CircularByteBuffer circularByteBuffer;
    private Handler copyHandler;
    private Runnable copyRunnable = new Runnable() {
        /* class com.p2082ss.avframework.livestreamv2.core.audiorecord.AudioRecordManager.RunnableC858171 */

        static {
            Covode.recordClassIndex(100279);
        }

        public void run() {
            int available;
            if (AudioRecordManager.this.circularByteBuffer != null && (available = AudioRecordManager.this.circularByteBuffer.available()) != 0) {
                byte[] bArr = new byte[available];
                AudioRecordManager.this.circularByteBuffer.get(bArr);
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(available);
                allocateDirect.put(bArr);
                if (AudioRecordManager.this.audioRecordProcessor != null) {
                    AudioRecordManager.this.audioRecordProcessor.writePcm(allocateDirect);
                }
            }
        }
    };
    private SafeHandlerThread copyThread;
    private int effectId;
    private boolean isRecord;
    private int maxDuration = 15;
    private final MediaEngineFactory mediaEngineFactory;
    private AudioTrack originAudioTrack;
    private AudioOriginFrameSink originFrameSink;
    private String recordPath = "";
    private final IVideoEffectProcessor videoEffectProcessor;
    private String wavFilePath;
    private HashMap<Integer, String> wavFiles = new HashMap<>();

    /* renamed from: com_ss_avframework_livestreamv2_core_audiorecord_AudioRecordManager_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m147780x53ef12d2(String str, String str2) {
        return 0;
    }

    public int getEffectId() {
        return this.effectId;
    }

    public String getWavFilePath() {
        return this.wavFilePath;
    }

    static {
        Covode.recordClassIndex(100277);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$onMessageReceived$0$AudioRecordManager() {
        AVLog.ioi(TAG, "timer up====" + this.maxDuration);
        stopAudioRecord(-1);
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.audiorecord.IAudioRecordManager
    public void release() {
        VideoEffectUtilsWrapper.removeMessageCenterListener(this);
        AudioTrack audioTrack = this.originAudioTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this.originAudioTrack = null;
        }
        Handler handler = this.copyHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.copyHandler = null;
        }
        SafeHandlerThreadPoolExecutor.unlockThread(this.copyThread);
        this.copyThread = null;
        HashMap<Integer, String> hashMap = this.wavFiles;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.audiorecord.IAudioRecordManager
    public void startAudioRecord() {
        if (TextUtils.isEmpty(this.recordPath)) {
            AVLog.ioe(TAG, "record path is null , why=======");
            return;
        }
        String format = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss").format(new Date(System.currentTimeMillis()));
        File file = new File(this.recordPath);
        if (!file.exists()) {
            AVLog.ioi(TAG, "create dir:" + this.recordPath);
            file.mkdirs();
        }
        this.wavFilePath = this.recordPath + "/" + format + ".wav";
        this.isRecord = true;
        if (this.originFrameSink == null) {
            this.originFrameSink = new AudioOriginFrameSink();
        }
        this.originFrameSink.setListener(this);
        if (this.originAudioTrack == null) {
            this.originAudioTrack = this.mediaEngineFactory.createAudioTrack(this.audioCapture);
        }
        this.originAudioTrack.addAudioSink(this.originFrameSink);
    }

    public void setEffectId(int i) {
        this.effectId = i;
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.audiorecord.IAudioRecordManager
    public void setRecordPath(String str) {
        this.recordPath = str;
    }

    private void sendWavFileToEffect(int i) {
        if (this.videoEffectProcessor != null && i > 0) {
            if (this.wavFiles.get(Integer.valueOf(i)) == null) {
                AVLog.ioe(TAG, "something wrong!!!!");
                return;
            }
            String a = C1764a.m5928a("{\"record_filename\":\"%s\"}", new Object[]{this.wavFiles.get(Integer.valueOf(i))});
            AVLog.ioi(TAG, "send effect msg:".concat(String.valueOf(a)));
            this.videoEffectProcessor.sendEffectMsg(43, 2, i, a);
        }
    }

    private void stopAudioRecord(int i) {
        if (!this.isRecord) {
            AVLog.ioi(TAG, "already call stopAudioRecord somewhere else");
            sendWavFileToEffect(i);
            return;
        }
        this.isRecord = false;
        this.maxDuration = 15;
        AudioOriginFrameSink audioOriginFrameSink = this.originFrameSink;
        if (audioOriginFrameSink != null) {
            audioOriginFrameSink.setListener(null);
            AudioRecordProcessor audioRecordProcessor2 = this.audioRecordProcessor;
            if (audioRecordProcessor2 != null) {
                audioRecordProcessor2.stopRecord();
            }
            AudioTrack audioTrack = this.originAudioTrack;
            if (audioTrack != null) {
                audioTrack.removeAudioSink(this.originFrameSink);
            }
            sendWavFileToEffect(i);
        }
        TimerTaskUtils.removeTask("effect audio record");
        Handler handler = this.copyHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        CircularByteBuffer circularByteBuffer2 = this.circularByteBuffer;
        if (circularByteBuffer2 != null) {
            circularByteBuffer2.clear();
        }
        this.audioRecordProcessor = null;
    }

    public AudioRecordManager(MediaEngineFactory mediaEngineFactory2, AudioCapturer audioCapturer, IVideoEffectProcessor iVideoEffectProcessor) {
        this.mediaEngineFactory = mediaEngineFactory2;
        this.videoEffectProcessor = iVideoEffectProcessor;
        this.audioCapture = audioCapturer;
        VideoEffectUtilsWrapper.addMessageCenterListener(this);
        String str = TAG;
        AVLog.ioi(str, "new AudioRecordManager");
        SafeHandlerThread lockThread = SafeHandlerThreadPoolExecutor.lockThread("AudioRecordThread");
        this.copyThread = lockThread;
        lockThread.start();
        AVLog.ioi(str, "new copy thread");
    }

    @Override // com.p2082ss.avframework.effect.IVideoEffectProcessor.EffectMsgListener
    public void onMessageReceived(int i, int i2, int i3, String str) {
        if (i == 43) {
            String str2 = TAG;
            AVLog.ioi(str2, C1764a.m5928a("effect message receive[type:%d, arg1:%d, arg2:%d, arg3:%s]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str}));
            setEffectId(i3);
            if (i2 == 0) {
                if (str != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        if (!jSONObject.isNull("max_recording_time")) {
                            int i4 = (int) jSONObject.getDouble("max_recording_time");
                            this.maxDuration = i4;
                            m147780x53ef12d2(str2, C1764a.m5928a("max_recording_time:%d from message", new Object[]{Integer.valueOf(i4)}));
                            TimerTaskUtils.removeTask("effect audio record");
                            TimerTaskUtils.addTask(new AudioRecordManager$$Lambda$0(this), this.maxDuration * 1000, "effect audio record");
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                setEffectId(i3);
                startAudioRecord();
            } else if (i2 == 1) {
                stopAudioRecord(i3);
            }
        }
    }

    @Override // com.p2082ss.avframework.livestreamv2.ILiveStream.IAudioFrameAvailableListener
    public void onAudioFrameAvailable(Buffer buffer, int i, int i2, int i3, long j) {
        if (!(buffer instanceof ByteBuffer) || !buffer.isDirect()) {
            throw new AndroidRuntimeException("Audio buffer should be a direct byte buffer!");
        } else if (this.isRecord) {
            if (this.audioRecordProcessor == null) {
                AudioRecordProcessor audioRecordProcessor2 = new AudioRecordProcessor();
                this.audioRecordProcessor = audioRecordProcessor2;
                if (audioRecordProcessor2.init(this.wavFilePath, i3, i2, this.maxDuration) < 0) {
                    IAudioRecordManager.RecordStateCallback recordStateCallback = this.f191980cb;
                    if (recordStateCallback != null) {
                        recordStateCallback.onError(-1, "init fail");
                        AVLog.ioe(TAG, "init fail");
                    }
                    this.isRecord = false;
                    this.audioRecordProcessor = null;
                } else {
                    this.wavFiles.put(Integer.valueOf(this.effectId), this.wavFilePath);
                }
            }
            if (this.copyHandler == null) {
                this.copyHandler = new Handler(this.copyThread.getLooper());
            }
            if (this.circularByteBuffer == null) {
                int i4 = i2 * i3 * 2;
                this.circularByteBuffer = new CircularByteBuffer(i4);
                AVLog.ioi(TAG, "circularByteBuffer size:".concat(String.valueOf(i4)));
            }
            buffer.rewind();
            byte[] bArr = new byte[buffer.remaining()];
            ((ByteBuffer) buffer).get(bArr);
            if (this.circularByteBuffer.put(bArr) == 0) {
                AVLog.ioi(TAG, "write full");
            }
            Handler handler = this.copyHandler;
            if (handler != null) {
                handler.post(this.copyRunnable);
            }
            buffer.rewind();
        }
    }
}
