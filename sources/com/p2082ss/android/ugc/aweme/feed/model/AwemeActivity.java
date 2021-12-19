package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeActivity */
public final class AwemeActivity implements Serializable {
    @AbstractC27891c(mo46611a = "activity_id")
    public String activityId;
    @AbstractC27891c(mo46611a = "content")
    public AwemeActivityContent content;
    @AbstractC27891c(mo46611a = "primary_btn")
    public AwemeActivityButton primaryBtn;
    @AbstractC27891c(mo46611a = "schema_url")
    public String schemaUrl;
    @AbstractC27891c(mo46611a = "show_delay_time")
    public Long showDelayTime;

    static {
        Covode.recordClassIndex(58618);
    }

    public AwemeActivity() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ AwemeActivity copy$default(AwemeActivity awemeActivity, String str, Long l, String str2, AwemeActivityContent awemeActivityContent, AwemeActivityButton awemeActivityButton, int i, Object obj) {
        if ((i & 1) != 0) {
            str = awemeActivity.activityId;
        }
        if ((i & 2) != 0) {
            l = awemeActivity.showDelayTime;
        }
        if ((i & 4) != 0) {
            str2 = awemeActivity.schemaUrl;
        }
        if ((i & 8) != 0) {
            awemeActivityContent = awemeActivity.content;
        }
        if ((i & 16) != 0) {
            awemeActivityButton = awemeActivity.primaryBtn;
        }
        return awemeActivity.copy(str, l, str2, awemeActivityContent, awemeActivityButton);
    }

    public final String component1() {
        return this.activityId;
    }

    public final Long component2() {
        return this.showDelayTime;
    }

    public final String component3() {
        return this.schemaUrl;
    }

    public final AwemeActivityContent component4() {
        return this.content;
    }

    public final AwemeActivityButton component5() {
        return this.primaryBtn;
    }

    public final AwemeActivity copy(String str, Long l, String str2, AwemeActivityContent awemeActivityContent, AwemeActivityButton awemeActivityButton) {
        return new AwemeActivity(str, l, str2, awemeActivityContent, awemeActivityButton);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeActivity)) {
            return false;
        }
        AwemeActivity awemeActivity = (AwemeActivity) obj;
        return C89219l.m154714a(this.activityId, awemeActivity.activityId) && C89219l.m154714a(this.showDelayTime, awemeActivity.showDelayTime) && C89219l.m154714a(this.schemaUrl, awemeActivity.schemaUrl) && C89219l.m154714a(this.content, awemeActivity.content) && C89219l.m154714a(this.primaryBtn, awemeActivity.primaryBtn);
    }

    public final int hashCode() {
        String str = this.activityId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Long l = this.showDelayTime;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str2 = this.schemaUrl;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        AwemeActivityContent awemeActivityContent = this.content;
        int hashCode4 = (hashCode3 + (awemeActivityContent != null ? awemeActivityContent.hashCode() : 0)) * 31;
        AwemeActivityButton awemeActivityButton = this.primaryBtn;
        if (awemeActivityButton != null) {
            i = awemeActivityButton.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "AwemeActivity(activityId=" + this.activityId + ", showDelayTime=" + this.showDelayTime + ", schemaUrl=" + this.schemaUrl + ", content=" + this.content + ", primaryBtn=" + this.primaryBtn + ")";
    }

    public final String getActivityId() {
        return this.activityId;
    }

    public final AwemeActivityContent getContent() {
        return this.content;
    }

    public final AwemeActivityButton getPrimaryBtn() {
        return this.primaryBtn;
    }

    public final String getSchemaUrl() {
        return this.schemaUrl;
    }

    public final Long getShowDelayTime() {
        return this.showDelayTime;
    }

    public AwemeActivity(String str, Long l, String str2, AwemeActivityContent awemeActivityContent, AwemeActivityButton awemeActivityButton) {
        this.activityId = str;
        this.showDelayTime = l;
        this.schemaUrl = str2;
        this.content = awemeActivityContent;
        this.primaryBtn = awemeActivityButton;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AwemeActivity(String str, Long l, String str2, AwemeActivityContent awemeActivityContent, AwemeActivityButton awemeActivityButton, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : awemeActivityContent, (i & 16) == 0 ? awemeActivityButton : null);
    }
}
