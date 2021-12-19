package com.p2082ss.avframework.livestreamv2.core.interact.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.model.Region */
public class Region {
    private double mHeight = 1.0d;
    private String mInteractId;
    private int mMediaType;
    private boolean mMuteAudio;
    private boolean mMuteVideo;
    private boolean mNeedWriteToSei = true;
    private int mStatus;
    private boolean mTalking;
    private long mUserId;
    private double mWidth = 1.0d;

    /* renamed from: mX */
    private double f191989mX;

    /* renamed from: mY */
    private double f191990mY;
    private int mZorder;

    static {
        Covode.recordClassIndex(100407);
    }

    public double getHeight() {
        return this.mHeight;
    }

    public String getInteractId() {
        return this.mInteractId;
    }

    public int getMediaType() {
        return this.mMediaType;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public long getUserId() {
        return this.mUserId;
    }

    public double getWidth() {
        return this.mWidth;
    }

    public double getX() {
        return this.f191989mX;
    }

    public double getY() {
        return this.f191990mY;
    }

    public int getZorder() {
        return this.mZorder;
    }

    public boolean isMuteAudio() {
        return this.mMuteAudio;
    }

    public boolean isMuteVideo() {
        return this.mMuteVideo;
    }

    public boolean isTalking() {
        return this.mTalking;
    }

    public boolean needWriteToSei() {
        return this.mNeedWriteToSei;
    }

    public Region interactId(String str) {
        this.mInteractId = str;
        return this;
    }

    public Region mediaType(int i) {
        this.mMediaType = i;
        return this;
    }

    public Region muteAudio(boolean z) {
        this.mMuteAudio = z;
        return this;
    }

    public Region muteVideo(boolean z) {
        this.mMuteVideo = z;
        return this;
    }

    public Region status(int i) {
        this.mStatus = i;
        return this;
    }

    public Region talking(boolean z) {
        this.mTalking = z;
        return this;
    }

    public Region userId(long j) {
        this.mUserId = j;
        return this;
    }

    public Region writeToSei(boolean z) {
        this.mNeedWriteToSei = z;
        return this;
    }

    public Region zOrder(int i) {
        this.mZorder = i;
        return this;
    }

    public Region position(double d, double d2) {
        this.f191989mX = d;
        this.f191990mY = d2;
        return this;
    }

    public Region size(double d, double d2) {
        this.mWidth = d;
        this.mHeight = d2;
        return this;
    }
}
