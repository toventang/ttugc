package com.p2082ss.avframework.livestreamv2.core;

import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.buffer.VideoFrame;
import com.p2082ss.avframework.livestreamv2.core.LayerControl;
import com.p2082ss.avframework.mixer.VideoMixer;
import com.p2082ss.avframework.utils.AVLog;

/* renamed from: com.ss.avframework.livestreamv2.core.FrameAnimationBase */
public class FrameAnimationBase {
    protected long mAnimationTimeMs;
    protected boolean mContinue;
    protected int mCurrentAnimationFrameIndex;
    protected VideoMixer.VideoMixerDescription mCurrentDescription;
    protected RectF mCurrentRect = new RectF(this.mCurrentDescription.left, this.mCurrentDescription.top, this.mCurrentDescription.right, this.mCurrentDescription.bottom);
    protected int mFps;
    protected LayerControl.Layer mLayer;
    protected RectF mTargetRect;
    protected int mTotalFrames;
    protected int mType;

    static {
        Covode.recordClassIndex(100194);
    }

    public int getType() {
        return this.mType;
    }

    public boolean valid() {
        return this.mContinue;
    }

    /* access modifiers changed from: protected */
    public void calculation() {
        this.mTotalFrames = (int) ((((float) this.mAnimationTimeMs) / 1000.0f) * ((float) this.mFps));
    }

    public void restore() {
        VideoMixer.VideoMixerDescription videoMixerDescription = new VideoMixer.VideoMixerDescription();
        videoMixerDescription.copy(this.mCurrentDescription);
        videoMixerDescription.left = this.mTargetRect.left;
        videoMixerDescription.top = this.mTargetRect.top;
        videoMixerDescription.right = this.mTargetRect.right;
        videoMixerDescription.bottom = this.mTargetRect.bottom;
        updateDescription(videoMixerDescription);
    }

    public void update(VideoMixer.VideoMixerTexture videoMixerTexture) {
        update((VideoFrame) null);
    }

    public void update(VideoFrame videoFrame) {
        int i = this.mCurrentAnimationFrameIndex + 1;
        this.mCurrentAnimationFrameIndex = i;
        if (i >= this.mTotalFrames) {
            this.mContinue = false;
        }
    }

    /* access modifiers changed from: protected */
    public void updateDescription(VideoMixer.VideoMixerDescription videoMixerDescription) {
        videoMixerDescription.setMode(2).setzOrder(2147483646);
        AVLog.m147809w("FrameAnimationBase", this.mCurrentRect.toShortString());
        this.mLayer.updateDescription(videoMixerDescription);
    }

    public FrameAnimationBase(int i, LayerControl.Layer layer, long j, RectF rectF, int i2) {
        this.mType = i;
        this.mLayer = layer;
        this.mAnimationTimeMs = j;
        this.mFps = i2;
        VideoMixer.VideoMixerDescription videoMixerDescription = new VideoMixer.VideoMixerDescription();
        this.mCurrentDescription = videoMixerDescription;
        videoMixerDescription.copy(this.mLayer.getLayerDescription());
        this.mTargetRect = rectF;
        calculation();
    }
}
