package com.p2082ss.android.ugc.aweme.search.model;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.search.model.f */
public final class C67680f implements Serializable {

    /* renamed from: a */
    private long f151677a;

    /* renamed from: b */
    private long f151678b;

    /* renamed from: c */
    private long f151679c;

    /* renamed from: d */
    private long f151680d;

    static {
        Covode.recordClassIndex(79325);
    }

    public final long getClickMagnifyingGlassTime() {
        return this.f151677a;
    }

    public final long getGuessWordsRequestTime() {
        return this.f151678b;
    }

    public final long getGussWordsResponseTime() {
        return this.f151679c;
    }

    public final long getLoadSuccessTime() {
        return this.f151680d;
    }

    public final void setClickMagnifyingGlassTime(long j) {
        this.f151677a = j;
    }

    public final void setGuessWordsRequestTime(long j) {
        this.f151678b = j;
    }

    public final void setGussWordsResponseTime(long j) {
        this.f151679c = j;
    }

    public final void setLoadSuccessTime(long j) {
        this.f151680d = j;
    }
}
