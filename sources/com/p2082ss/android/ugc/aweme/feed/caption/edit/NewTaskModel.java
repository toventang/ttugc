package com.p2082ss.android.ugc.aweme.feed.caption.edit;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.NewTaskModel */
public final class NewTaskModel extends BaseResponse {
    @AbstractC27891c(mo46611a = "candidates")
    private final List<TaskCandidate> candidates;

    static {
        Covode.recordClassIndex(58180);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.feed.caption.edit.NewTaskModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewTaskModel copy$default(NewTaskModel newTaskModel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = newTaskModel.candidates;
        }
        return newTaskModel.copy(list);
    }

    public final List<TaskCandidate> component1() {
        return this.candidates;
    }

    public final NewTaskModel copy(List<TaskCandidate> list) {
        return new NewTaskModel(list);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof NewTaskModel) && C89219l.m154714a(this.candidates, ((NewTaskModel) obj).candidates);
        }
        return true;
    }

    public final int hashCode() {
        List<TaskCandidate> list = this.candidates;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "NewTaskModel(candidates=" + this.candidates + ")";
    }

    public final List<TaskCandidate> getCandidates() {
        return this.candidates;
    }

    public NewTaskModel(List<TaskCandidate> list) {
        this.candidates = list;
    }
}
