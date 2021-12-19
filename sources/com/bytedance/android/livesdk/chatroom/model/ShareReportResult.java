package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class ShareReportResult {
    @AbstractC27891c(mo46611a = "delta_intimacy")
    private long deltaIntimacy;
    @AbstractC27891c(mo46611a = "display_text")
    private C9698b displayText;

    static {
        Covode.recordClassIndex(8432);
    }

    public long getDeltaIntimacy() {
        return this.deltaIntimacy;
    }

    public C9698b getDisplayText() {
        return this.displayText;
    }

    @AbstractC27891c(mo46611a = "delta_intimacy")
    public void setDeltaIntimacy(long j) {
        this.deltaIntimacy = j;
    }

    @AbstractC27891c(mo46611a = "display_text")
    public void setDisplayText(C9698b bVar) {
        this.displayText = bVar;
    }
}
