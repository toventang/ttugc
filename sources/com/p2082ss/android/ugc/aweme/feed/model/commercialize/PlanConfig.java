package com.p2082ss.android.ugc.aweme.feed.model.commercialize;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.commercialize.PlanConfig */
public final class PlanConfig implements Serializable {
    @AbstractC27891c(mo46611a = "tasks")
    private List<CommerceSmartUITasks> task;

    static {
        Covode.recordClassIndex(58784);
    }

    public final List<CommerceSmartUITasks> getTask() {
        return this.task;
    }

    public final void setTask(List<CommerceSmartUITasks> list) {
        this.task = list;
    }
}
