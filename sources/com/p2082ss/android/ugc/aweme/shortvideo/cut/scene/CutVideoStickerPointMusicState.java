package com.p2082ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.C20521k;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoStickerPointMusicState */
public final class CutVideoStickerPointMusicState implements AbstractC20368af {
    private final C20521k dismissAnimateEvent;
    private final C20521k musicDialogVisibleEvent;
    private final Boolean musicViewVisible;
    private final C20521k showAnimateEvent;
    private final C20521k startMusicEvent;

    static {
        Covode.recordClassIndex(82577);
    }

    public CutVideoStickerPointMusicState() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ CutVideoStickerPointMusicState copy$default(CutVideoStickerPointMusicState cutVideoStickerPointMusicState, C20521k kVar, C20521k kVar2, C20521k kVar3, C20521k kVar4, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            kVar = cutVideoStickerPointMusicState.startMusicEvent;
        }
        if ((i & 2) != 0) {
            kVar2 = cutVideoStickerPointMusicState.showAnimateEvent;
        }
        if ((i & 4) != 0) {
            kVar3 = cutVideoStickerPointMusicState.dismissAnimateEvent;
        }
        if ((i & 8) != 0) {
            kVar4 = cutVideoStickerPointMusicState.musicDialogVisibleEvent;
        }
        if ((i & 16) != 0) {
            bool = cutVideoStickerPointMusicState.musicViewVisible;
        }
        return cutVideoStickerPointMusicState.copy(kVar, kVar2, kVar3, kVar4, bool);
    }

    public final C20521k component1() {
        return this.startMusicEvent;
    }

    public final C20521k component2() {
        return this.showAnimateEvent;
    }

    public final C20521k component3() {
        return this.dismissAnimateEvent;
    }

    public final C20521k component4() {
        return this.musicDialogVisibleEvent;
    }

    public final Boolean component5() {
        return this.musicViewVisible;
    }

    public final CutVideoStickerPointMusicState copy(C20521k kVar, C20521k kVar2, C20521k kVar3, C20521k kVar4, Boolean bool) {
        return new CutVideoStickerPointMusicState(kVar, kVar2, kVar3, kVar4, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutVideoStickerPointMusicState)) {
            return false;
        }
        CutVideoStickerPointMusicState cutVideoStickerPointMusicState = (CutVideoStickerPointMusicState) obj;
        return C89219l.m154714a(this.startMusicEvent, cutVideoStickerPointMusicState.startMusicEvent) && C89219l.m154714a(this.showAnimateEvent, cutVideoStickerPointMusicState.showAnimateEvent) && C89219l.m154714a(this.dismissAnimateEvent, cutVideoStickerPointMusicState.dismissAnimateEvent) && C89219l.m154714a(this.musicDialogVisibleEvent, cutVideoStickerPointMusicState.musicDialogVisibleEvent) && C89219l.m154714a(this.musicViewVisible, cutVideoStickerPointMusicState.musicViewVisible);
    }

    public final int hashCode() {
        C20521k kVar = this.startMusicEvent;
        int i = 0;
        int hashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        C20521k kVar2 = this.showAnimateEvent;
        int hashCode2 = (hashCode + (kVar2 != null ? kVar2.hashCode() : 0)) * 31;
        C20521k kVar3 = this.dismissAnimateEvent;
        int hashCode3 = (hashCode2 + (kVar3 != null ? kVar3.hashCode() : 0)) * 31;
        C20521k kVar4 = this.musicDialogVisibleEvent;
        int hashCode4 = (hashCode3 + (kVar4 != null ? kVar4.hashCode() : 0)) * 31;
        Boolean bool = this.musicViewVisible;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "CutVideoStickerPointMusicState(startMusicEvent=" + this.startMusicEvent + ", showAnimateEvent=" + this.showAnimateEvent + ", dismissAnimateEvent=" + this.dismissAnimateEvent + ", musicDialogVisibleEvent=" + this.musicDialogVisibleEvent + ", musicViewVisible=" + this.musicViewVisible + ")";
    }

    public final C20521k getDismissAnimateEvent() {
        return this.dismissAnimateEvent;
    }

    public final C20521k getMusicDialogVisibleEvent() {
        return this.musicDialogVisibleEvent;
    }

    public final Boolean getMusicViewVisible() {
        return this.musicViewVisible;
    }

    public final C20521k getShowAnimateEvent() {
        return this.showAnimateEvent;
    }

    public final C20521k getStartMusicEvent() {
        return this.startMusicEvent;
    }

    public CutVideoStickerPointMusicState(C20521k kVar, C20521k kVar2, C20521k kVar3, C20521k kVar4, Boolean bool) {
        this.startMusicEvent = kVar;
        this.showAnimateEvent = kVar2;
        this.dismissAnimateEvent = kVar3;
        this.musicDialogVisibleEvent = kVar4;
        this.musicViewVisible = bool;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CutVideoStickerPointMusicState(C20521k kVar, C20521k kVar2, C20521k kVar3, C20521k kVar4, Boolean bool, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : kVar, (i & 2) != 0 ? null : kVar2, (i & 4) != 0 ? null : kVar3, (i & 8) != 0 ? null : kVar4, (i & 16) == 0 ? bool : null);
    }
}
