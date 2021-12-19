package com.p2082ss.avframework.livestreamv2.core;

import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.buffer.VideoFrame;
import com.p2082ss.avframework.livestreamv2.core.LayerControl;
import com.p2082ss.avframework.mixer.VideoMixer;
import com.p2082ss.avframework.utils.AVLog;

/* renamed from: com.ss.avframework.livestreamv2.core.FrameAnimationMove */
class FrameAnimationMove extends FrameAnimationBase {
    protected float mDeltaXPerFrame;
    protected float mDeltaYPerFrame;

    static {
        Covode.recordClassIndex(100197);
    }

    /* access modifiers changed from: protected */
    public void updateRect(RectF rectF) {
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.FrameAnimationBase
    public void restore() {
        VideoMixer.VideoMixerDescription videoMixerDescription = new VideoMixer.VideoMixerDescription();
        videoMixerDescription.copy(this.mCurrentDescription);
        videoMixerDescription.left = this.mTargetRect.left;
        videoMixerDescription.top = this.mTargetRect.top;
        videoMixerDescription.right = this.mTargetRect.right;
        videoMixerDescription.bottom = this.mTargetRect.bottom;
        updateDescription(videoMixerDescription);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.avframework.livestreamv2.core.FrameAnimationBase
    public void calculation() {
        float centerX = this.mTargetRect.centerX() - this.mCurrentRect.centerX();
        float centerY = this.mTargetRect.centerY() - this.mCurrentRect.centerY();
        if (!((centerX == 0.0f && centerY == 0.0f) || this.mTotalFrames == 0)) {
            this.mDeltaXPerFrame = centerX / ((float) this.mTotalFrames);
            this.mDeltaYPerFrame = centerY / ((float) this.mTotalFrames);
            this.mContinue = true;
        }
        AVLog.ioi("FrameAnimationMove", "mDeltaXPerFrame " + this.mDeltaXPerFrame + " mDeltaYPerFrame " + this.mDeltaYPerFrame + " deltaX " + centerX + " deltaY " + centerY + " fps " + this.mFps + " totalFrames " + this.mTotalFrames + " continue " + this.mContinue);
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.FrameAnimationBase
    public void update(VideoMixer.VideoMixerTexture videoMixerTexture) {
        update((VideoFrame) null);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.avframework.livestreamv2.core.FrameAnimationBase
    public void updateDescription(VideoMixer.VideoMixerDescription videoMixerDescription) {
        videoMixerDescription.setMode(2);
        AVLog.m147809w("FrameAnimationMove", this.mCurrentRect.toShortString());
        this.mLayer.updateDescription(videoMixerDescription);
    }

    @Override // com.p2082ss.avframework.livestreamv2.core.FrameAnimationBase
    public void update(VideoFrame videoFrame) {
        this.mCurrentAnimationFrameIndex++;
        if (valid()) {
            this.mCurrentRect.offset(this.mDeltaXPerFrame, this.mDeltaYPerFrame);
            VideoMixer.VideoMixerDescription videoMixerDescription = new VideoMixer.VideoMixerDescription();
            updateRect(this.mCurrentRect);
            videoMixerDescription.copy(this.mCurrentDescription);
            videoMixerDescription.left = this.mCurrentRect.left;
            videoMixerDescription.top = this.mCurrentRect.top;
            videoMixerDescription.right = this.mCurrentRect.right;
            videoMixerDescription.bottom = this.mCurrentRect.bottom;
            updateDescription(videoMixerDescription);
        }
        if (this.mCurrentAnimationFrameIndex >= this.mTotalFrames) {
            this.mContinue = false;
        }
    }

    public FrameAnimationMove(int i, LayerControl.Layer layer, long j, RectF rectF, int i2) {
        super(i, layer, j, rectF, i2);
    }
}
