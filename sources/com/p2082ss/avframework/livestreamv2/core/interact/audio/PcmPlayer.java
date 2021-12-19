package com.p2082ss.avframework.livestreamv2.core.interact.audio;

import android.media.AudioTrack;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.audio.PcmPlayer */
public class PcmPlayer {
    private boolean inited;
    private AudioTrack mAudioTrack;

    static {
        Covode.recordClassIndex(100388);
    }

    /* renamed from: com_ss_avframework_livestreamv2_core_interact_audio_PcmPlayer_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m147782xd8e34bbe(String str, String str2) {
        return 0;
    }

    public boolean isInited() {
        return this.inited;
    }

    public void release() {
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            if (audioTrack.getState() == 1) {
                this.mAudioTrack.stop();
                this.mAudioTrack.release();
            }
            this.mAudioTrack = null;
        }
    }

    public void playPcmData(ByteBuffer byteBuffer) {
        if (this.inited && Build.VERSION.SDK_INT >= 21) {
            this.mAudioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
    }

    public PcmPlayer(int i, int i2) {
        int i3;
        String str;
        if (i2 == 1) {
            i3 = 4;
        } else if (i2 != 2) {
            m147782xd8e34bbe("PcmPlayer", "Channel count " + i2 + " not supported!");
            return;
        } else {
            i3 = 12;
        }
        try {
            AudioTrack audioTrack = new AudioTrack(3, i, i3, 2, AudioTrack.getMinBufferSize(i, i3, 2), 1);
            this.mAudioTrack = audioTrack;
            if (audioTrack.getState() != 1) {
                StringBuilder sb = new StringBuilder("Create AudioTrack failed");
                if (this.mAudioTrack == null) {
                    str = "!";
                } else {
                    str = ": state " + this.mAudioTrack.getState();
                }
                m147782xd8e34bbe("PcmPlayer", sb.append(str).toString());
                return;
            }
            this.mAudioTrack.play();
            this.inited = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void playPcmData(byte[] bArr, int i, int i2) {
        if (this.inited) {
            this.mAudioTrack.write(bArr, i, i2);
        }
    }
}
