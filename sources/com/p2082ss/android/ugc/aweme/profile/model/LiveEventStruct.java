package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.model.LiveEventStruct */
public final class LiveEventStruct implements Serializable {
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    private String f144671id = "";
    @AbstractC27891c(mo46611a = "is_paid_event")
    private boolean isPaidEvent;
    @AbstractC27891c(mo46611a = "start_time")
    private long startTime;
    @AbstractC27891c(mo46611a = "title")
    private String title = "";

    static {
        Covode.recordClassIndex(75187);
    }

    public final String getId() {
        return this.f144671id;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean isPaidEvent() {
        return this.isPaidEvent;
    }

    public final void setPaidEvent(boolean z) {
        this.isPaidEvent = z;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setId(String str) {
        C89219l.m154721d(str, "");
        this.f144671id = str;
    }

    public final void setTitle(String str) {
        C89219l.m154721d(str, "");
        this.title = str;
    }
}
