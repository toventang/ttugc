package com.p2082ss.avframework.player;

import android.content.Context;
import android.media.MediaPlayer;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.player.IAVPlayer;

/* renamed from: com.ss.avframework.player.AVPlayerSystem */
public class AVPlayerSystem extends AVPlayerBase {
    private MediaPlayer mMediaPlayer = new MediaPlayer();

    static {
        Covode.recordClassIndex(100682);
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer, com.p2082ss.avframework.player.AVPlayerBase
    public void prepare() {
        super.prepare();
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer, com.p2082ss.avframework.player.AVPlayerBase
    public void prepareAsync() {
        super.prepareAsync();
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer, com.p2082ss.avframework.player.AVPlayerBase
    public IAVPlayer.MetaData getMetaData() {
        return super.getMetaData();
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer, com.p2082ss.avframework.player.AVPlayerBase
    public boolean isPlaying() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            return mediaPlayer.isPlaying();
        }
        return false;
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer, com.p2082ss.avframework.player.AVPlayerBase
    public void pause() {
        this.mMediaPlayer.pause();
        super.pause();
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer, com.p2082ss.avframework.player.AVPlayerBase
    public void release() {
        this.mMediaPlayer.release();
        super.release();
        this.mMediaPlayer = null;
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer, com.p2082ss.avframework.player.AVPlayerBase
    public void start() {
        this.mMediaPlayer.start();
        this.mMediaPlayer.setLooping(this.mLoop);
        super.start();
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer, com.p2082ss.avframework.player.AVPlayerBase
    public void stop() {
        this.mMediaPlayer.stop();
        super.stop();
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer, com.p2082ss.avframework.player.AVPlayerBase
    public void seekTo(long j) {
        this.mMediaPlayer.seekTo((int) j);
        super.seekTo(j);
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer, com.p2082ss.avframework.player.AVPlayerBase
    public void setLoop(boolean z) {
        super.setLoop(z);
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(z);
        }
    }

    @Override // com.p2082ss.avframework.player.IAVPlayer, com.p2082ss.avframework.player.AVPlayerBase
    public void setDataSource(Context context, String str) {
        try {
            this.mMediaPlayer.setDataSource(str);
        } catch (Exception e) {
            onError(this, -1, e);
        }
        this.mMediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() {
            /* class com.p2082ss.avframework.player.AVPlayerSystem.C860361 */

            static {
                Covode.recordClassIndex(100683);
            }

            public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                AVPlayerSystem.this.onError(null, i, new Exception("Error:".concat(String.valueOf(i2))));
                return false;
            }
        });
        this.mMediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            /* class com.p2082ss.avframework.player.AVPlayerSystem.C860372 */

            static {
                Covode.recordClassIndex(100684);
            }

            public void onPrepared(MediaPlayer mediaPlayer) {
                AVPlayerSystem.this.onPrepared(null, 0);
            }
        });
        this.mMediaPlayer.setOnInfoListener(new MediaPlayer.OnInfoListener() {
            /* class com.p2082ss.avframework.player.AVPlayerSystem.C860383 */

            static {
                Covode.recordClassIndex(100685);
            }

            public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
                if (i == 3) {
                    AVPlayerSystem.this.onStarted(null, i);
                    return false;
                } else if (i != 805) {
                    return false;
                } else {
                    AVPlayerSystem.this.onPause(null, i);
                    return false;
                }
            }
        });
        this.mMediaPlayer.setOnBufferingUpdateListener(new MediaPlayer.OnBufferingUpdateListener() {
            /* class com.p2082ss.avframework.player.AVPlayerSystem.C860394 */

            static {
                Covode.recordClassIndex(100686);
            }

            public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            }
        });
        this.mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            /* class com.p2082ss.avframework.player.AVPlayerSystem.C860405 */

            static {
                Covode.recordClassIndex(100687);
            }

            public void onCompletion(MediaPlayer mediaPlayer) {
                AVPlayerSystem.this.onCompletion(null);
            }
        });
        super.setDataSource(context, str);
    }
}
