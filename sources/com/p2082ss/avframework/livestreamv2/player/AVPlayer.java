package com.p2082ss.avframework.livestreamv2.player;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.engine.AudioDeviceModule;
import com.p2082ss.avframework.engine.Receiver;
import com.p2082ss.avframework.livestreamv2.core.AudioDeviceControl;
import com.p2082ss.avframework.livestreamv2.core.IAudioDeviceControl;
import com.p2082ss.avframework.player.AVPlayerBase;
import com.p2082ss.avframework.player.IAVPlayer;
import com.p2082ss.avframework.receiver.NativeReceiver;
import com.p2082ss.avframework.utils.AVLog;
import com.p2082ss.avframework.utils.MiscUtils;
import com.p2082ss.avframework.utils.SafeHandlerThread;
import com.p2082ss.avframework.utils.SafeHandlerThreadPoolExecutor;
import com.p2082ss.avframework.utils.TEBundle;
import com.p2082ss.avframework.utils.ThreadUtils;
import com.p2082ss.avframework.utils.TimeUtils;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.livestreamv2.player.AVPlayer */
public class AVPlayer extends AVPlayerBase {
    private final int STATUS_ERROR;
    private final int STATUS_INIT;
    private final int STATUS_PAUSE;
    private final int STATUS_PREPARED;
    private final int STATUS_RELEASE;
    private final int STATUS_STARTED;
    private final int STATUS_STOP;
    private int mAudioBufferSize;
    public IAudioDeviceControl.IAudioTrack mAudioTrack;
    private ByteBuffer mBuffer;
    private ByteBuffer mBufferMute;
    private int mChannels;
    private long mConnectTimeoutMs;
    public Runnable mConsumerAudioBufferRunnable;
    private IAudioDeviceControl mControl;
    private boolean mHaveControl;
    public long mPauseCostTimeMs;
    public SafeHandlerThread mPlayerThread;
    public long mProgressMs;
    public Receiver mReceiver;
    private int mReconnectCounts;
    private long mReconnectDelayMaxMs;
    private int mSampleHz;
    public long mStartPlayerTimeMs;
    public int mStatus;
    public ThreadUtils.ThreadChecker mThreadCheck;
    private long mTotalDurationMs;
    public String mUrl;

    static {
        Covode.recordClassIndex(100585);
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer, com.p2082ss.avframework.player.AVPlayerBase
    public float getVolume() {
        IAudioDeviceControl.IAudioTrack iAudioTrack = this.mAudioTrack;
        if (iAudioTrack != null) {
            return iAudioTrack.getVolume();
        }
        return 0.0f;
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer, com.p2082ss.avframework.player.AVPlayerBase
    public boolean isPlaying() {
        if (this.mStatus == 3) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer, com.p2082ss.avframework.player.AVPlayerBase
    public void pause() {
        this.mPlayerThread.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.player.AVPlayer.RunnableC860099 */

            static {
                Covode.recordClassIndex(100596);
            }

            public void run() {
                if (AVPlayer.this.mStatus == 3) {
                    AVPlayer.this.mStatus = 5;
                    AVPlayer.this.mPauseCostTimeMs = System.currentTimeMillis();
                    AVPlayer.this.mPlayerThread.removeCallbacks(AVPlayer.this.mConsumerAudioBufferRunnable);
                    AVPlayer.this.onPause(null, 0);
                }
            }
        });
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer, com.p2082ss.avframework.player.AVPlayerBase
    public void prepare() {
        ThreadUtils.invokeAtFrontUninterruptibly(this.mPlayerThread.getHandler(), new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.player.AVPlayer.RunnableC860066 */

            static {
                Covode.recordClassIndex(100593);
            }

            public void run() {
                AVPlayer.this.prepareOnThread();
            }
        });
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer, com.p2082ss.avframework.player.AVPlayerBase
    public void prepareAsync() {
        this.mPlayerThread.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.player.AVPlayer.RunnableC860044 */

            static {
                Covode.recordClassIndex(100591);
            }

            public void run() {
                AVPlayer.this.prepare();
            }
        });
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer, com.p2082ss.avframework.player.AVPlayerBase
    public void start() {
        this.mPlayerThread.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.player.AVPlayer.RunnableC860077 */

            static {
                Covode.recordClassIndex(100594);
            }

            public void run() {
                if (AVPlayer.this.mStatus == 2 || AVPlayer.this.mStatus == 5) {
                    if (AVPlayer.this.mStatus == 5 && AVPlayer.this.mPauseCostTimeMs != 0) {
                        AVPlayer.this.mStartPlayerTimeMs += System.currentTimeMillis() - AVPlayer.this.mPauseCostTimeMs;
                        AVPlayer.this.mPauseCostTimeMs = 0;
                    }
                    AVPlayer.this.mStatus = 3;
                    AVPlayer.this.mPlayerThread.post(AVPlayer.this.mConsumerAudioBufferRunnable);
                    AVPlayer.this.onStarted(null, 0);
                    AVLog.m147806e(AVPlayer.TAG, "will Sleep  vs " + (System.currentTimeMillis() - AVPlayer.this.mStartPlayerTimeMs) + " progressMs " + AVPlayer.this.mProgressMs);
                }
            }
        });
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer, com.p2082ss.avframework.player.AVPlayerBase
    public void stop() {
        this.mPlayerThread.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.player.AVPlayer.RunnableC860088 */

            static {
                Covode.recordClassIndex(100595);
            }

            public void run() {
                if (AVPlayer.this.mStatus != 6) {
                    AVPlayer.this.mStatus = 4;
                    AVPlayer.this.mPlayerThread.removeCallbacks(AVPlayer.this.mConsumerAudioBufferRunnable);
                    if (AVPlayer.this.mReceiver != null) {
                        AVPlayer.this.mReceiver.closeStream();
                        AVPlayer.this.onStop(null, 0);
                    }
                }
            }
        });
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer, com.p2082ss.avframework.player.AVPlayerBase
    public IAVPlayer.MetaData getMetaData() {
        Receiver receiver = this.mReceiver;
        if (receiver == null) {
            return null;
        }
        IAVPlayer.MetaData metaData = new IAVPlayer.MetaData();
        if (receiver.getStreamInfo(metaData) == 0) {
            return metaData;
        }
        return null;
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer, com.p2082ss.avframework.player.AVPlayerBase
    public synchronized void release() {
        AudioDeviceControl audioDeviceControl;
        MethodCollector.m26663i(985);
        AVLog.iod(TAG, "release this ".concat(String.valueOf(this)));
        if (this.mStatus == 6) {
            MethodCollector.m26664o(985);
            return;
        }
        stop();
        this.mPlayerThread.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.player.AVPlayer.RunnableC8600111 */

            static {
                Covode.recordClassIndex(100588);
            }

            public void run() {
                if (AVPlayer.this.mAudioTrack != null) {
                    AVPlayer.this.mAudioTrack.dispose();
                    AVPlayer.this.mAudioTrack = null;
                }
                AVPlayer.this.mStatus = 6;
            }
        });
        if (this.mHaveControl && (audioDeviceControl = (AudioDeviceControl) this.mControl) != null) {
            audioDeviceControl.release();
        }
        this.mControl = null;
        SafeHandlerThreadPoolExecutor.unlockThread(this.mPlayerThread);
        MethodCollector.m26664o(985);
    }

    public void consumerAudioBuffer() {
        if (this.mBuffer == null) {
            this.mBuffer = ByteBuffer.allocateDirect(this.mAudioBufferSize);
        }
        if (this.mProgressMs == 0) {
            this.mStartPlayerTimeMs = System.currentTimeMillis();
        }
        if (this.mReceiver.readAudioBuffer(this.mBuffer, false) != 0) {
            onCompletion(null);
            pause();
            return;
        }
        IAudioDeviceControl.IAudioTrack iAudioTrack = this.mAudioTrack;
        ByteBuffer byteBuffer = this.mBuffer;
        int i = this.mSampleHz;
        iAudioTrack.onData(byteBuffer, i, this.mChannels, i / 100, TimeUtils.nanoTime());
        this.mProgressMs += 10;
        onProgress(null, this.mReceiver.getCurrentPos(true));
        long currentTimeMillis = (System.currentTimeMillis() - this.mStartPlayerTimeMs) - this.mProgressMs;
        if (currentTimeMillis > 0) {
            this.mPlayerThread.post(this.mConsumerAudioBufferRunnable);
            return;
        }
        long abs = Math.abs(currentTimeMillis);
        AVLog.m147806e(TAG, "Sleep " + abs + " vs " + (System.currentTimeMillis() - this.mStartPlayerTimeMs) + " progressMs " + this.mProgressMs);
        this.mPlayerThread.postDelayed(this.mConsumerAudioBufferRunnable, abs);
    }

    public void prepareOnThread() {
        int i = this.mStatus;
        if ((i == 1 || i == 4) && this.mUrl != null) {
            Receiver receiver = this.mReceiver;
            if (receiver != null) {
                receiver.closeStream();
            }
            if (this.mReceiver == null) {
                this.mReceiver = new NativeReceiver(null, null);
            }
            setupReceiverOpt(this.mReceiver);
            int openStream = this.mReceiver.openStream(this.mUrl);
            if (openStream != 0) {
                onError(this, openStream, new Exception("OpenStream error ret ".concat(String.valueOf(openStream))));
                this.mStatus = 7;
                return;
            }
            this.mReceiver.getStreamInfo(this.mMetaData);
            this.mTotalDurationMs = this.mMetaData.getLong("receiver_total_duration");
            this.mProgressMs = 0;
            AVLog.iod(TAG, "AVPlayer at " + this.mUrl);
            AVLog.iod(TAG, this.mMetaData.toString());
            if (this.mAudioTrack == null) {
                IAudioDeviceControl iAudioDeviceControl = this.mControl;
                if (iAudioDeviceControl == null) {
                    onError(this, 0, new Exception("Create AudioTrack failed and not found AudioDeviceControl."));
                    this.mStatus = 7;
                } else {
                    IAudioDeviceControl.IAudioTrack createTrack = iAudioDeviceControl.createTrack(MiscUtils.getUUID("avplayer"), this.mSampleHz, this.mChannels, 16);
                    this.mAudioTrack = createTrack;
                    if (createTrack == null) {
                        onError(this, 0, new Exception("Create AudioTrack failed."));
                        this.mStatus = 7;
                    }
                }
            }
            this.mStatus = 2;
            onPrepared(this, 0);
        }
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer, com.p2082ss.avframework.player.AVPlayerBase
    public void setVolume(float f) {
        IAudioDeviceControl.IAudioTrack iAudioTrack = this.mAudioTrack;
        if (iAudioTrack != null) {
            iAudioTrack.setVolume(f);
        }
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer, com.p2082ss.avframework.player.AVPlayerBase
    public void seekTo(final long j) {
        this.mPlayerThread.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.player.AVPlayer.RunnableC8600010 */

            static {
                Covode.recordClassIndex(100587);
            }

            public void run() {
                if (AVPlayer.this.mReceiver != null) {
                    boolean z = true;
                    int seek = AVPlayer.this.mReceiver.seek(j, true);
                    AVPlayer aVPlayer = AVPlayer.this;
                    long j = j;
                    if (seek != 0) {
                        z = false;
                    }
                    aVPlayer.onSeeked(null, j, z);
                }
            }
        });
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer, com.p2082ss.avframework.player.AVPlayerBase
    public void setConnectTimeoutMs(long j) {
        if (j <= 0) {
            j = 0;
        }
        this.mConnectTimeoutMs = j;
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer, com.p2082ss.avframework.player.AVPlayerBase
    public void setLoop(boolean z) {
        super.setLoop(z);
        ThreadUtils.invokeAtFrontUninterruptibly(this.mPlayerThread.getHandler(), new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.player.AVPlayer.RunnableC860055 */

            static {
                Covode.recordClassIndex(100592);
            }

            public void run() {
                int i;
                if (AVPlayer.this.mStatus == 3 || AVPlayer.this.mStatus == 5) {
                    TEBundle option = AVPlayer.this.mReceiver.getOption();
                    if (AVPlayer.this.isLoop()) {
                        i = -1;
                    } else {
                        i = 1;
                    }
                    option.setInt("decode_stream_loop", i);
                    AVPlayer.this.mReceiver.setOption(option);
                }
            }
        });
    }

    private void setupReceiverOpt(Receiver receiver) {
        int i;
        TEBundle option = receiver.getOption();
        option.setInt("decode_stream_audio_channel", this.mChannels);
        option.setInt("decode_stream_audio_sample", this.mSampleHz);
        if (isLoop()) {
            i = -1;
        } else {
            i = 1;
        }
        option.setInt("decode_stream_loop", i);
        if (this.mConnectTimeoutMs > 0 || this.mReconnectCounts >= 0) {
            TEBundle tEBundle = new TEBundle();
            long j = this.mConnectTimeoutMs;
            if (j > 0) {
                tEBundle.setLong("timeout", j * 1000);
            }
            int i2 = this.mReconnectCounts;
            if (i2 >= 0) {
                tEBundle.setInt("reconnect_count", i2);
                long j2 = this.mReconnectDelayMaxMs;
                if (j2 > 0) {
                    tEBundle.setLong("reconnect_delay_max", j2 * 1000);
                }
            }
            option.setBundle("ff_open_params", tEBundle);
            tEBundle.release();
        }
        receiver.setOption(option);
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer, com.p2082ss.avframework.player.AVPlayerBase
    public void setDataSource(Context context, final String str) {
        this.mPlayerThread.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.player.AVPlayer.RunnableC860033 */

            static {
                Covode.recordClassIndex(100590);
            }

            public void run() {
                AVPlayer.this.mUrl = str;
            }
        });
    }

    private AVPlayer(int i, int i2) {
        this.STATUS_INIT = 1;
        this.STATUS_PREPARED = 2;
        this.STATUS_STARTED = 3;
        this.STATUS_STOP = 4;
        this.STATUS_PAUSE = 5;
        this.STATUS_RELEASE = 6;
        this.STATUS_ERROR = 7;
        this.mStatus = 1;
        this.mConnectTimeoutMs = 4000;
        this.mReconnectCounts = -1;
        this.mSampleHz = i;
        this.mChannels = i2;
        this.mAudioBufferSize = ((i2 * 2) * i) / 100;
        SafeHandlerThread lockThread = SafeHandlerThreadPoolExecutor.lockThread("AVAudioPLayerThread");
        this.mPlayerThread = lockThread;
        lockThread.start();
        this.mPlayerThread.post(new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.player.AVPlayer.RunnableC859991 */

            static {
                Covode.recordClassIndex(100586);
            }

            public void run() {
                AVPlayer.this.mThreadCheck = new ThreadUtils.ThreadChecker();
                AVPlayer.this.mThreadCheck.checkIsOnValidThread();
            }
        });
        this.mConsumerAudioBufferRunnable = new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.player.AVPlayer.RunnableC860022 */

            static {
                Covode.recordClassIndex(100589);
            }

            public void run() {
                AVPlayer.this.mPlayerThread.removeCallbacks(this);
                if (AVPlayer.this.mStatus == 3 || AVPlayer.this.mStatus == 5) {
                    AVPlayer.this.consumerAudioBuffer();
                }
            }
        };
    }

    public AVPlayer(IAudioDeviceControl.IAudioTrack iAudioTrack, int i, int i2) {
        this(i, i2);
        this.mAudioTrack = iAudioTrack;
    }

    public AVPlayer(AudioDeviceModule audioDeviceModule, int i, int i2) {
        this(i, i2);
        this.mControl = new AudioDeviceControl(audioDeviceModule);
        this.mHaveControl = true;
    }

    public AVPlayer(IAudioDeviceControl iAudioDeviceControl, int i, int i2) {
        this(i, i2);
        this.mControl = iAudioDeviceControl;
    }
}
