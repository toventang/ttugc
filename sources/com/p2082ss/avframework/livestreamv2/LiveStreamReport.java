package com.p2082ss.avframework.livestreamv2;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.statics.StaticsReport;

/* renamed from: com.ss.avframework.livestreamv2.LiveStreamReport */
public class LiveStreamReport extends StaticsReport {
    static {
        Covode.recordClassIndex(100093);
    }

    public int getADMMicVolumedB() {
        return getInt("adm_mic_rec_db");
    }

    public double getAudioMixerCostTimePerFrameMs() {
        return getDouble("audio_mixer_cost_time_per_frame_ms");
    }

    public double getMiniGameRenderFps() {
        return getDouble("mini_game_render_fps");
    }

    public long getTransportAdjustBitrate() {
        return getLong("trans_adjust_bps");
    }

    public double getVideoMixerCostTimePerFrameMs() {
        return getDouble("video_mixer_cost_time_per_frame_ms");
    }

    public void setADMMicVolumedB(int i) {
        setInt("adm_mic_rec_db", i);
    }

    public void setAudioMixerCostTimePerFrameMs(double d) {
        setDouble("audio_mixer_cost_time_per_frame_ms", d);
    }

    public void setMiniGameRenderFps(double d) {
        setDouble("mini_game_render_fps", d);
    }

    public void setTransportAdjustBps(long j) {
        setLong("trans_adjust_bps", j);
    }

    public void setVideoMixerCostTimePerFrameMs(double d) {
        setDouble("video_mixer_cost_time_per_frame_ms", d);
    }
}
