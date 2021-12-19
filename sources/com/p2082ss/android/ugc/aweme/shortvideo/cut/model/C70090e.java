package com.p2082ss.android.ugc.aweme.shortvideo.cut.model;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.model.e */
public final class C70090e implements Serializable {

    /* renamed from: a */
    private long f156751a;

    /* renamed from: b */
    private float f156752b = 1.0f;

    /* renamed from: c */
    private int f156753c;

    /* renamed from: d */
    private long f156754d;

    /* renamed from: e */
    private long f156755e;

    /* renamed from: f */
    private long f156756f;

    static {
        Covode.recordClassIndex(82513);
    }

    public final float getSpeed() {
        return this.f156752b;
    }

    public final long getVideoDuration() {
        return this.f156756f;
    }

    public final long getVideoEnd() {
        return this.f156751a;
    }

    public final int getVideoIndex() {
        return this.f156753c;
    }

    public final long getVideoRange() {
        return this.f156755e;
    }

    public final long getVideoStart() {
        return this.f156754d;
    }

    @Override // java.lang.Object
    public final C70090e clone() {
        return new C70090e(this.f156753c, this.f156754d, this.f156755e, this.f156756f);
    }

    public final void setSpeed(float f) {
        this.f156752b = f;
    }

    public final void setVideoDuration(long j) {
        this.f156756f = j;
    }

    public final void setVideoEnd(long j) {
        this.f156751a = j;
    }

    public final void setVideoIndex(int i) {
        this.f156753c = i;
    }

    public final void setVideoRange(long j) {
        this.f156755e = j;
    }

    public final void setVideoStart(long j) {
        this.f156754d = j;
    }

    public final void updateVideoStartTime(long j) {
        if (j > 0 && this.f156755e > 0) {
            this.f156755e = j;
            long j2 = (this.f156751a / 2) - (j / 2);
            if (j2 > 0) {
                this.f156754d = j2;
            } else {
                this.f156754d = 0;
            }
            this.f156751a = this.f156754d + j;
        }
    }

    public final void resetVideoStartTime(long j, long j2) {
        this.f156754d = j;
        this.f156755e = j2;
        this.f156751a = j + j2;
    }

    public C70090e(int i, long j, long j2, long j3) {
        this.f156753c = i;
        this.f156754d = j;
        this.f156755e = j2;
        this.f156756f = j3;
        this.f156751a = j + j2;
    }
}
