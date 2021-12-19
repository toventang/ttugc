package com.p2082ss.android.ugc.aweme.story.record.dockbar;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20526p;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.record.dockbar.StoryRecordDockBarState */
public final class StoryRecordDockBarState implements AbstractC20368af {
    private final C20526p clickAlbumIcon;

    static {
        Covode.recordClassIndex(90534);
    }

    public StoryRecordDockBarState() {
        this(null, 1, null);
    }

    public static /* synthetic */ StoryRecordDockBarState copy$default(StoryRecordDockBarState storyRecordDockBarState, C20526p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            pVar = storyRecordDockBarState.clickAlbumIcon;
        }
        return storyRecordDockBarState.copy(pVar);
    }

    public final C20526p component1() {
        return this.clickAlbumIcon;
    }

    public final StoryRecordDockBarState copy(C20526p pVar) {
        return new StoryRecordDockBarState(pVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof StoryRecordDockBarState) && C89219l.m154714a(this.clickAlbumIcon, ((StoryRecordDockBarState) obj).clickAlbumIcon);
        }
        return true;
    }

    public final int hashCode() {
        C20526p pVar = this.clickAlbumIcon;
        if (pVar != null) {
            return pVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "StoryRecordDockBarState(clickAlbumIcon=" + this.clickAlbumIcon + ")";
    }

    public final C20526p getClickAlbumIcon() {
        return this.clickAlbumIcon;
    }

    public StoryRecordDockBarState(C20526p pVar) {
        this.clickAlbumIcon = pVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StoryRecordDockBarState(C20526p pVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : pVar);
    }
}
