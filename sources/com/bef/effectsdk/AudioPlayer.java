package com.bef.effectsdk;

import android.media.MediaPlayer;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class AudioPlayer {
    public static final String TAG = AudioPlayer.class.getSimpleName();
    private String mFilename;
    public boolean mIsPrepared;
    public MediaPlayer mMediaPlayer;
    public long mNativePtr;

    /* renamed from: com_bef_effectsdk_AudioPlayer_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m7224xa5eb361c(String str, String str2) {
        return 0;
    }

    /* renamed from: com_bef_effectsdk_AudioPlayer_com_ss_android_ugc_aweme_lancet_LogLancet_i */
    public static int m7225xa5eb3620(String str, String str2) {
        return 0;
    }

    public native void nativeOnCompletion(long j);

    public native void nativeOnError(long j, int i, int i2);

    public native void nativeOnInfo(long j, int i, int i2);

    public native void nativeOnPrepared(long j);

    static {
        Covode.recordClassIndex(2658);
    }

    public float getCurrentPlayTime() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            return ((float) mediaPlayer.getCurrentPosition()) / 1000.0f;
        }
        m7224xa5eb361c(TAG, "MediaPlayer is null!");
        return 0.0f;
    }

    public float getTotalPlayTime() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            return ((float) mediaPlayer.getDuration()) / 1000.0f;
        }
        m7224xa5eb361c(TAG, "MediaPlayer is null!");
        return 0.0f;
    }

    public boolean pause() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            m7224xa5eb361c(TAG, "MediaPlayer is null!");
            return false;
        } else if (!this.mIsPrepared) {
            m7224xa5eb361c(TAG, "MediaPlayer is null!");
            return false;
        } else {
            mediaPlayer.pause();
            return true;
        }
    }

    public boolean resume() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            m7224xa5eb361c(TAG, "MediaPlayer is null!");
            return false;
        } else if (!this.mIsPrepared) {
            m7224xa5eb361c(TAG, "MediaPlayer is null!");
            return false;
        } else {
            mediaPlayer.start();
            return true;
        }
    }

    public int init() {
        this.mIsPrepared = false;
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.mMediaPlayer.release();
        }
        MediaPlayer mediaPlayer2 = new MediaPlayer();
        this.mMediaPlayer = mediaPlayer2;
        mediaPlayer2.setOnInfoListener(new MediaPlayer.OnInfoListener() {
            /* class com.bef.effectsdk.AudioPlayer.C23781 */

            static {
                Covode.recordClassIndex(2659);
            }

            /* renamed from: com_bef_effectsdk_AudioPlayer$1_com_ss_android_ugc_aweme_lancet_LogLancet_i */
            public static int m7226xa017156d(String str, String str2) {
                return 0;
            }

            public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
                MethodCollector.m26663i(4235);
                m7226xa017156d(AudioPlayer.TAG, "MediaPlayer onInfo: [what, extra] = [" + i + ", " + i2 + "]");
                AudioPlayer audioPlayer = AudioPlayer.this;
                audioPlayer.nativeOnInfo(audioPlayer.mNativePtr, i, i2);
                MethodCollector.m26664o(4235);
                return false;
            }
        });
        this.mMediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() {
            /* class com.bef.effectsdk.AudioPlayer.C23792 */

            static {
                Covode.recordClassIndex(2660);
            }

            /* renamed from: com_bef_effectsdk_AudioPlayer$2_com_ss_android_ugc_aweme_lancet_LogLancet_d */
            public static int m7227x3ab7d7e9(String str, String str2) {
                return 0;
            }

            /* renamed from: com_bef_effectsdk_AudioPlayer$2_com_ss_android_ugc_aweme_lancet_LogLancet_e */
            public static int m7228x3ab7d7ea(String str, String str2) {
                return 0;
            }

            public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                MethodCollector.m26663i(6138);
                m7227x3ab7d7e9(AudioPlayer.TAG, "MediaPlayer onError: [what, extra] = [" + i + ", " + i2 + "]");
                try {
                    AudioPlayer.this.mMediaPlayer.stop();
                    AudioPlayer.this.mMediaPlayer.release();
                } catch (Exception e) {
                    e.printStackTrace();
                    m7228x3ab7d7ea(AudioPlayer.TAG, "MediaPlayer stop exception on error " + e.toString());
                }
                AudioPlayer.this.mMediaPlayer = null;
                AudioPlayer audioPlayer = AudioPlayer.this;
                audioPlayer.nativeOnError(audioPlayer.mNativePtr, i, i2);
                MethodCollector.m26664o(6138);
                return false;
            }
        });
        this.mMediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            /* class com.bef.effectsdk.AudioPlayer.C23803 */

            static {
                Covode.recordClassIndex(2661);
            }

            /* renamed from: com_bef_effectsdk_AudioPlayer$3_com_ss_android_ugc_aweme_lancet_LogLancet_i */
            public static int m7229xd5589a6f(String str, String str2) {
                return 0;
            }

            public void onPrepared(MediaPlayer mediaPlayer) {
                MethodCollector.m26663i(6130);
                m7229xd5589a6f(AudioPlayer.TAG, "MediaPlayer onPrepared...");
                AudioPlayer.this.mIsPrepared = true;
                AudioPlayer audioPlayer = AudioPlayer.this;
                audioPlayer.nativeOnPrepared(audioPlayer.mNativePtr);
                MethodCollector.m26664o(6130);
            }
        });
        this.mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            /* class com.bef.effectsdk.AudioPlayer.C23814 */

            static {
                Covode.recordClassIndex(2662);
            }

            /* renamed from: com_bef_effectsdk_AudioPlayer$4_com_ss_android_ugc_aweme_lancet_LogLancet_i */
            public static int m7230x6ff95cf0(String str, String str2) {
                return 0;
            }

            public void onCompletion(MediaPlayer mediaPlayer) {
                MethodCollector.m26663i(3977);
                m7230x6ff95cf0(AudioPlayer.TAG, "MediaPlayer onCompletion...");
                AudioPlayer audioPlayer = AudioPlayer.this;
                audioPlayer.nativeOnCompletion(audioPlayer.mNativePtr);
                MethodCollector.m26664o(3977);
            }
        });
        return 0;
    }

    public boolean isPlaying() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        boolean z = false;
        if (mediaPlayer == null) {
            m7224xa5eb361c(TAG, "MediaPlayer is null!");
            return false;
        } else if (!this.mIsPrepared) {
            m7224xa5eb361c(TAG, "MediaPlayer is null!");
            return false;
        } else {
            try {
                z = mediaPlayer.isPlaying();
                return z;
            } catch (Exception e) {
                e.printStackTrace();
                m7224xa5eb361c(TAG, "MediaPlayer isPlaying exception. " + e.toString());
                return z;
            }
        }
    }

    public int release() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            return 0;
        }
        try {
            mediaPlayer.stop();
            this.mMediaPlayer.release();
        } catch (Exception e) {
            e.printStackTrace();
            m7224xa5eb361c(TAG, "MediaPlayer stop exception on release " + e.toString());
        }
        this.mMediaPlayer = null;
        return 0;
    }

    public void startPlay() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            try {
                if (!this.mIsPrepared) {
                    mediaPlayer.prepare();
                    this.mIsPrepared = true;
                }
                this.mMediaPlayer.start();
            } catch (Exception e) {
                e.printStackTrace();
                m7224xa5eb361c(TAG, "MediaPlayer setDataSource exception. " + e.toString());
            }
        }
    }

    public void stopPlay() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            m7224xa5eb361c(TAG, "MediaPlayer is null!");
        } else if (this.mIsPrepared) {
            try {
                mediaPlayer.stop();
                this.mMediaPlayer.release();
            } catch (Exception e) {
                e.printStackTrace();
                m7224xa5eb361c(TAG, "MediaPlayer stop exception on stop " + e.toString());
            }
            this.mMediaPlayer = null;
            this.mIsPrepared = false;
        }
    }

    public void setNativePtr(long j) {
        this.mNativePtr = j;
    }

    public boolean setVolume(float f) {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            m7224xa5eb361c(TAG, "MediaPlayer is null!");
            return false;
        } else if (!this.mIsPrepared) {
            m7224xa5eb361c(TAG, "MediaPlayer is null!");
            return false;
        } else {
            mediaPlayer.setVolume(f, f);
            return true;
        }
    }

    public boolean seek(int i) {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            m7224xa5eb361c(TAG, "MediaPlayer is null!");
            return false;
        } else if (!this.mIsPrepared) {
            m7224xa5eb361c(TAG, "MediaPlayer is null!");
            return false;
        } else {
            try {
                mediaPlayer.seekTo(i);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                m7224xa5eb361c(TAG, "MediaPlayer seek exception. " + e.toString());
                return true;
            }
        }
    }

    public boolean setLoop(boolean z) {
        if (this.mMediaPlayer == null) {
            m7224xa5eb361c(TAG, "MediaPlayer is null!");
            return false;
        }
        m7225xa5eb3620(TAG, "set isLoop ".concat(String.valueOf(z)));
        this.mMediaPlayer.setLooping(z);
        return true;
    }

    public void setDataSource(String str) {
        if (this.mMediaPlayer == null) {
            init();
        }
        if (!str.equals(this.mFilename) || !this.mIsPrepared || !this.mMediaPlayer.isPlaying()) {
            try {
                this.mMediaPlayer.reset();
                this.mMediaPlayer.setDataSource(str);
            } catch (Exception e) {
                e.printStackTrace();
                m7224xa5eb361c(TAG, "MediaPlayer setDataSource exception. " + e.toString());
            }
            this.mFilename = str;
        }
    }
}
