package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20524n;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishState */
public final class VideoPublishState implements AbstractC20368af {
    private final C20524n<Boolean, Boolean> backEvent;
    private final C20524n<Boolean, Boolean> cancelEvent;

    static {
        Covode.recordClassIndex(86557);
    }

    public VideoPublishState() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoPublishState copy$default(VideoPublishState videoPublishState, C20524n nVar, C20524n nVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            nVar = videoPublishState.backEvent;
        }
        if ((i & 2) != 0) {
            nVar2 = videoPublishState.cancelEvent;
        }
        return videoPublishState.copy(nVar, nVar2);
    }

    public final C20524n<Boolean, Boolean> component1() {
        return this.backEvent;
    }

    public final C20524n<Boolean, Boolean> component2() {
        return this.cancelEvent;
    }

    public final VideoPublishState copy(C20524n<Boolean, Boolean> nVar, C20524n<Boolean, Boolean> nVar2) {
        return new VideoPublishState(nVar, nVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoPublishState)) {
            return false;
        }
        VideoPublishState videoPublishState = (VideoPublishState) obj;
        return C89219l.m154714a(this.backEvent, videoPublishState.backEvent) && C89219l.m154714a(this.cancelEvent, videoPublishState.cancelEvent);
    }

    public final int hashCode() {
        C20524n<Boolean, Boolean> nVar = this.backEvent;
        int i = 0;
        int hashCode = (nVar != null ? nVar.hashCode() : 0) * 31;
        C20524n<Boolean, Boolean> nVar2 = this.cancelEvent;
        if (nVar2 != null) {
            i = nVar2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "VideoPublishState(backEvent=" + this.backEvent + ", cancelEvent=" + this.cancelEvent + ")";
    }

    public final C20524n<Boolean, Boolean> getBackEvent() {
        return this.backEvent;
    }

    public final C20524n<Boolean, Boolean> getCancelEvent() {
        return this.cancelEvent;
    }

    public VideoPublishState(C20524n<Boolean, Boolean> nVar, C20524n<Boolean, Boolean> nVar2) {
        this.backEvent = nVar;
        this.cancelEvent = nVar2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VideoPublishState(C20524n nVar, C20524n nVar2, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : nVar, (i & 2) != 0 ? null : nVar2);
    }
}
