package com.p2082ss.android.ugc.aweme.story.record.toolbar;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20521k;
import com.bytedance.jedi.arch.C20526p;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.record.toolbar.StoryRecordToolbarState */
public final class StoryRecordToolbarState implements AbstractC20368af {
    private final C20526p clickBack;
    private final C20521k clickBeauty;
    private final C20526p clickFlash;
    private final C20526p clickSwitch;

    static {
        Covode.recordClassIndex(90675);
    }

    public StoryRecordToolbarState() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ StoryRecordToolbarState copy$default(StoryRecordToolbarState storyRecordToolbarState, C20526p pVar, C20526p pVar2, C20521k kVar, C20526p pVar3, int i, Object obj) {
        if ((i & 1) != 0) {
            pVar = storyRecordToolbarState.clickBack;
        }
        if ((i & 2) != 0) {
            pVar2 = storyRecordToolbarState.clickFlash;
        }
        if ((i & 4) != 0) {
            kVar = storyRecordToolbarState.clickBeauty;
        }
        if ((i & 8) != 0) {
            pVar3 = storyRecordToolbarState.clickSwitch;
        }
        return storyRecordToolbarState.copy(pVar, pVar2, kVar, pVar3);
    }

    public final C20526p component1() {
        return this.clickBack;
    }

    public final C20526p component2() {
        return this.clickFlash;
    }

    public final C20521k component3() {
        return this.clickBeauty;
    }

    public final C20526p component4() {
        return this.clickSwitch;
    }

    public final StoryRecordToolbarState copy(C20526p pVar, C20526p pVar2, C20521k kVar, C20526p pVar3) {
        return new StoryRecordToolbarState(pVar, pVar2, kVar, pVar3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryRecordToolbarState)) {
            return false;
        }
        StoryRecordToolbarState storyRecordToolbarState = (StoryRecordToolbarState) obj;
        return C89219l.m154714a(this.clickBack, storyRecordToolbarState.clickBack) && C89219l.m154714a(this.clickFlash, storyRecordToolbarState.clickFlash) && C89219l.m154714a(this.clickBeauty, storyRecordToolbarState.clickBeauty) && C89219l.m154714a(this.clickSwitch, storyRecordToolbarState.clickSwitch);
    }

    public final int hashCode() {
        C20526p pVar = this.clickBack;
        int i = 0;
        int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
        C20526p pVar2 = this.clickFlash;
        int hashCode2 = (hashCode + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        C20521k kVar = this.clickBeauty;
        int hashCode3 = (hashCode2 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        C20526p pVar3 = this.clickSwitch;
        if (pVar3 != null) {
            i = pVar3.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "StoryRecordToolbarState(clickBack=" + this.clickBack + ", clickFlash=" + this.clickFlash + ", clickBeauty=" + this.clickBeauty + ", clickSwitch=" + this.clickSwitch + ")";
    }

    public final C20526p getClickBack() {
        return this.clickBack;
    }

    public final C20521k getClickBeauty() {
        return this.clickBeauty;
    }

    public final C20526p getClickFlash() {
        return this.clickFlash;
    }

    public final C20526p getClickSwitch() {
        return this.clickSwitch;
    }

    public StoryRecordToolbarState(C20526p pVar, C20526p pVar2, C20521k kVar, C20526p pVar3) {
        this.clickBack = pVar;
        this.clickFlash = pVar2;
        this.clickBeauty = kVar;
        this.clickSwitch = pVar3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StoryRecordToolbarState(C20526p pVar, C20526p pVar2, C20521k kVar, C20526p pVar3, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : pVar, (i & 2) != 0 ? null : pVar2, (i & 4) != 0 ? null : kVar, (i & 8) != 0 ? null : pVar3);
    }
}
