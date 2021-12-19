package com.p2082ss.android.ugc.aweme.feed.caption.edit;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.TaskCandidate */
public final class TaskCandidate implements Serializable {
    @AbstractC27891c(mo46611a = "cover_url")
    private final String coverUrl;
    @AbstractC27891c(mo46611a = "subtitle_id")
    private final String subtitleId;

    static {
        Covode.recordClassIndex(58181);
    }

    public TaskCandidate() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ TaskCandidate copy$default(TaskCandidate taskCandidate, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taskCandidate.coverUrl;
        }
        if ((i & 2) != 0) {
            str2 = taskCandidate.subtitleId;
        }
        return taskCandidate.copy(str, str2);
    }

    public final String component1() {
        return this.coverUrl;
    }

    public final String component2() {
        return this.subtitleId;
    }

    public final TaskCandidate copy(String str, String str2) {
        return new TaskCandidate(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaskCandidate)) {
            return false;
        }
        TaskCandidate taskCandidate = (TaskCandidate) obj;
        return C89219l.m154714a(this.coverUrl, taskCandidate.coverUrl) && C89219l.m154714a(this.subtitleId, taskCandidate.subtitleId);
    }

    public final int hashCode() {
        String str = this.coverUrl;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.subtitleId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "TaskCandidate(coverUrl=" + this.coverUrl + ", subtitleId=" + this.subtitleId + ")";
    }

    public final String getCoverUrl() {
        return this.coverUrl;
    }

    public final String getSubtitleId() {
        return this.subtitleId;
    }

    public TaskCandidate(String str, String str2) {
        this.coverUrl = str;
        this.subtitleId = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TaskCandidate(String str, String str2, int i, C89214g gVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
