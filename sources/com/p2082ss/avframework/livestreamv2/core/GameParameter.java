package com.p2082ss.avframework.livestreamv2.core;

import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.mixer.VideoMixer;

/* renamed from: com.ss.avframework.livestreamv2.core.GameParameter */
public class GameParameter extends GameLauncherParameter {
    private VideoMixer.VideoMixerDescription mCameraLayerDescription;
    private VideoMixer.VideoMixerDescription mGameLayerDescription;

    static {
        Covode.recordClassIndex(100200);
    }

    public GameParameter() {
    }

    public VideoMixer.VideoMixerDescription getCameraLayerDescritionOnPublish() {
        return this.mCameraLayerDescription;
    }

    public VideoMixer.VideoMixerDescription getGameLayerDescritionOnPublish() {
        return this.mGameLayerDescription;
    }

    public int getCameraFpsWhenPublish() {
        return getInt("game-publish-camera-fps");
    }

    public int getCameraHeightWhenPublish() {
        return getInt("game-publish-camera-height");
    }

    public int getCameraWidthWhenPublish() {
        return getInt("game-publish-camera-width");
    }

    public int getPublishBitrate() {
        return getInt("rtmp_init_video_bitrate");
    }

    public int getPublishFps() {
        return getInt("video_fps");
    }

    public int getPublishMaxBitrate() {
        return getInt("rtmp_max_video_bitrate");
    }

    public int getPublishMinBitrate() {
        return getInt("rtmp_min_video_bitrate");
    }

    public boolean isPublishLeftRightWindow() {
        return getBool("game-publish-win-lrw");
    }

    public GameParameter setCameraLayerDescritionOnPublish(VideoMixer.VideoMixerDescription videoMixerDescription) {
        this.mCameraLayerDescription = videoMixerDescription;
        return this;
    }

    public GameParameter setGameLayerDescritionOnPublish(VideoMixer.VideoMixerDescription videoMixerDescription) {
        this.mGameLayerDescription = videoMixerDescription;
        return this;
    }

    public GameParameter setCameraFpsWhenPublish(int i) {
        setInt("game-publish-camera-fps", i);
        return this;
    }

    public GameParameter setCameraHeightWhenPublish(int i) {
        setInt("game-publish-camera-height", i);
        return this;
    }

    public GameParameter setCameraWidthWhenPublish(int i) {
        setInt("game-publish-camera-width", i);
        return this;
    }

    public GameParameter setPublishBitrate(int i) {
        setInt("rtmp_init_video_bitrate", i);
        return this;
    }

    public GameParameter setPublishFps(int i) {
        setInt("video_fps", i);
        return this;
    }

    public void setPublishLeftRightWindowMode(boolean z) {
        setBool("game-publish-win-lrw", z);
    }

    public GameParameter setPublishMaxBitrate(int i) {
        setInt("rtmp_max_video_bitrate", i);
        return this;
    }

    public GameParameter setPublishMinBitrate(int i) {
        setInt("rtmp_min_video_bitrate", i);
        return this;
    }

    public GameParameter(GameParameter gameParameter) {
        super(gameParameter);
        if (gameParameter.getCameraLayerDescritionOnPublish() != null) {
            VideoMixer.VideoMixerDescription videoMixerDescription = new VideoMixer.VideoMixerDescription();
            this.mCameraLayerDescription = videoMixerDescription;
            videoMixerDescription.copy(gameParameter.getCameraLayerDescritionOnPublish());
        }
        if (gameParameter.getGameLayerDescritionOnPublish() != null) {
            VideoMixer.VideoMixerDescription videoMixerDescription2 = new VideoMixer.VideoMixerDescription();
            this.mGameLayerDescription = videoMixerDescription2;
            videoMixerDescription2.copy(gameParameter.getGameLayerDescritionOnPublish());
        }
    }
}
