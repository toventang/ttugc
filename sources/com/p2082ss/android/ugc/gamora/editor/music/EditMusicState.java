package com.p2082ss.android.ugc.gamora.editor.music;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20365ac;
import com.bytedance.jedi.arch.C20521k;
import com.bytedance.jedi.arch.C20522l;
import com.bytedance.jedi.arch.C20523m;
import com.bytedance.jedi.arch.C20526p;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.UiState;
import com.p2082ss.android.ugc.aweme.p2724cz.AbstractC40906e;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3853q.View$OnClickListenerC72712e;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.music.EditMusicState */
public final class EditMusicState extends UiState {
    private final C20526p cleanSelectedMusic;
    private final C20526p clickChangeVolume;
    private final C20523m cutMusic;
    private final C20521k enableChangeVoice;
    private final Boolean enableCutMusic;
    private final View$OnClickListenerC72712e.AbstractC72715b musicViewClickListener;
    private final C69905c mvMusicDetail;
    private final boolean needMob;
    private final C20522l onVoiceVolumeChange;
    private final C20526p refreshMusicPanel;
    private final C20365ac<C69905c> selectMusic;
    private final AbstractC40906e transitionListener;

    /* renamed from: ui */
    private final AbstractC23517a f184350ui;

    static {
        Covode.recordClassIndex(96255);
    }

    public EditMusicState() {
        this(null, null, null, null, null, null, null, null, false, null, null, null, null, 8191, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.gamora.editor.music.EditMusicState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditMusicState copy$default(EditMusicState editMusicState, Boolean bool, C20523m mVar, C69905c cVar, AbstractC40906e eVar, View$OnClickListenerC72712e.AbstractC72715b bVar, C20365ac acVar, C20526p pVar, C20526p pVar2, boolean z, C20526p pVar3, C20522l lVar, C20521k kVar, AbstractC23517a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = editMusicState.enableCutMusic;
        }
        if ((i & 2) != 0) {
            mVar = editMusicState.cutMusic;
        }
        if ((i & 4) != 0) {
            cVar = editMusicState.mvMusicDetail;
        }
        if ((i & 8) != 0) {
            eVar = editMusicState.transitionListener;
        }
        if ((i & 16) != 0) {
            bVar = editMusicState.musicViewClickListener;
        }
        if ((i & 32) != 0) {
            acVar = editMusicState.selectMusic;
        }
        if ((i & 64) != 0) {
            pVar = editMusicState.cleanSelectedMusic;
        }
        if ((i & 128) != 0) {
            pVar2 = editMusicState.clickChangeVolume;
        }
        if ((i & 256) != 0) {
            z = editMusicState.needMob;
        }
        if ((i & 512) != 0) {
            pVar3 = editMusicState.refreshMusicPanel;
        }
        if ((i & 1024) != 0) {
            lVar = editMusicState.onVoiceVolumeChange;
        }
        if ((i & 2048) != 0) {
            kVar = editMusicState.enableChangeVoice;
        }
        if ((i & 4096) != 0) {
            aVar = editMusicState.getUi();
        }
        return editMusicState.copy(bool, mVar, cVar, eVar, bVar, acVar, pVar, pVar2, z, pVar3, lVar, kVar, aVar);
    }

    public final Boolean component1() {
        return this.enableCutMusic;
    }

    public final C20526p component10() {
        return this.refreshMusicPanel;
    }

    public final C20522l component11() {
        return this.onVoiceVolumeChange;
    }

    public final C20521k component12() {
        return this.enableChangeVoice;
    }

    public final AbstractC23517a component13() {
        return getUi();
    }

    public final C20523m component2() {
        return this.cutMusic;
    }

    public final C69905c component3() {
        return this.mvMusicDetail;
    }

    public final AbstractC40906e component4() {
        return this.transitionListener;
    }

    public final View$OnClickListenerC72712e.AbstractC72715b component5() {
        return this.musicViewClickListener;
    }

    public final C20365ac<C69905c> component6() {
        return this.selectMusic;
    }

    public final C20526p component7() {
        return this.cleanSelectedMusic;
    }

    public final C20526p component8() {
        return this.clickChangeVolume;
    }

    public final boolean component9() {
        return this.needMob;
    }

    public final EditMusicState copy(Boolean bool, C20523m mVar, C69905c cVar, AbstractC40906e eVar, View$OnClickListenerC72712e.AbstractC72715b bVar, C20365ac<? extends C69905c> acVar, C20526p pVar, C20526p pVar2, boolean z, C20526p pVar3, C20522l lVar, C20521k kVar, AbstractC23517a aVar) {
        C89219l.m154721d(aVar, "");
        return new EditMusicState(bool, mVar, cVar, eVar, bVar, acVar, pVar, pVar2, z, pVar3, lVar, kVar, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditMusicState)) {
            return false;
        }
        EditMusicState editMusicState = (EditMusicState) obj;
        return C89219l.m154714a(this.enableCutMusic, editMusicState.enableCutMusic) && C89219l.m154714a(this.cutMusic, editMusicState.cutMusic) && C89219l.m154714a(this.mvMusicDetail, editMusicState.mvMusicDetail) && C89219l.m154714a(this.transitionListener, editMusicState.transitionListener) && C89219l.m154714a(this.musicViewClickListener, editMusicState.musicViewClickListener) && C89219l.m154714a(this.selectMusic, editMusicState.selectMusic) && C89219l.m154714a(this.cleanSelectedMusic, editMusicState.cleanSelectedMusic) && C89219l.m154714a(this.clickChangeVolume, editMusicState.clickChangeVolume) && this.needMob == editMusicState.needMob && C89219l.m154714a(this.refreshMusicPanel, editMusicState.refreshMusicPanel) && C89219l.m154714a(this.onVoiceVolumeChange, editMusicState.onVoiceVolumeChange) && C89219l.m154714a(this.enableChangeVoice, editMusicState.enableChangeVoice) && C89219l.m154714a(getUi(), editMusicState.getUi());
    }

    public final int hashCode() {
        Boolean bool = this.enableCutMusic;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        C20523m mVar = this.cutMusic;
        int hashCode2 = (hashCode + (mVar != null ? mVar.hashCode() : 0)) * 31;
        C69905c cVar = this.mvMusicDetail;
        int hashCode3 = (hashCode2 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        AbstractC40906e eVar = this.transitionListener;
        int hashCode4 = (hashCode3 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        View$OnClickListenerC72712e.AbstractC72715b bVar = this.musicViewClickListener;
        int hashCode5 = (hashCode4 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        C20365ac<C69905c> acVar = this.selectMusic;
        int hashCode6 = (hashCode5 + (acVar != null ? acVar.hashCode() : 0)) * 31;
        C20526p pVar = this.cleanSelectedMusic;
        int hashCode7 = (hashCode6 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        C20526p pVar2 = this.clickChangeVolume;
        int hashCode8 = (hashCode7 + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        boolean z = this.needMob;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode8 + i2) * 31;
        C20526p pVar3 = this.refreshMusicPanel;
        int hashCode9 = (i5 + (pVar3 != null ? pVar3.hashCode() : 0)) * 31;
        C20522l lVar = this.onVoiceVolumeChange;
        int hashCode10 = (hashCode9 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        C20521k kVar = this.enableChangeVoice;
        int hashCode11 = (hashCode10 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        AbstractC23517a ui = getUi();
        if (ui != null) {
            i = ui.hashCode();
        }
        return hashCode11 + i;
    }

    public final String toString() {
        return "EditMusicState(enableCutMusic=" + this.enableCutMusic + ", cutMusic=" + this.cutMusic + ", mvMusicDetail=" + this.mvMusicDetail + ", transitionListener=" + this.transitionListener + ", musicViewClickListener=" + this.musicViewClickListener + ", selectMusic=" + this.selectMusic + ", cleanSelectedMusic=" + this.cleanSelectedMusic + ", clickChangeVolume=" + this.clickChangeVolume + ", needMob=" + this.needMob + ", refreshMusicPanel=" + this.refreshMusicPanel + ", onVoiceVolumeChange=" + this.onVoiceVolumeChange + ", enableChangeVoice=" + this.enableChangeVoice + ", ui=" + getUi() + ")";
    }

    public final C20526p getCleanSelectedMusic() {
        return this.cleanSelectedMusic;
    }

    public final C20526p getClickChangeVolume() {
        return this.clickChangeVolume;
    }

    public final C20523m getCutMusic() {
        return this.cutMusic;
    }

    public final C20521k getEnableChangeVoice() {
        return this.enableChangeVoice;
    }

    public final Boolean getEnableCutMusic() {
        return this.enableCutMusic;
    }

    public final View$OnClickListenerC72712e.AbstractC72715b getMusicViewClickListener() {
        return this.musicViewClickListener;
    }

    public final C69905c getMvMusicDetail() {
        return this.mvMusicDetail;
    }

    public final boolean getNeedMob() {
        return this.needMob;
    }

    public final C20522l getOnVoiceVolumeChange() {
        return this.onVoiceVolumeChange;
    }

    public final C20526p getRefreshMusicPanel() {
        return this.refreshMusicPanel;
    }

    public final C20365ac<C69905c> getSelectMusic() {
        return this.selectMusic;
    }

    public final AbstractC40906e getTransitionListener() {
        return this.transitionListener;
    }

    @Override // com.bytedance.ui_component.UiState
    public final AbstractC23517a getUi() {
        return this.f184350ui;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.bytedance.jedi.arch.ac<? extends com.ss.android.ugc.aweme.shortvideo.c> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditMusicState(Boolean bool, C20523m mVar, C69905c cVar, AbstractC40906e eVar, View$OnClickListenerC72712e.AbstractC72715b bVar, C20365ac<? extends C69905c> acVar, C20526p pVar, C20526p pVar2, boolean z, C20526p pVar3, C20522l lVar, C20521k kVar, AbstractC23517a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        this.enableCutMusic = bool;
        this.cutMusic = mVar;
        this.mvMusicDetail = cVar;
        this.transitionListener = eVar;
        this.musicViewClickListener = bVar;
        this.selectMusic = acVar;
        this.cleanSelectedMusic = pVar;
        this.clickChangeVolume = pVar2;
        this.needMob = z;
        this.refreshMusicPanel = pVar3;
        this.onVoiceVolumeChange = lVar;
        this.enableChangeVoice = kVar;
        this.f184350ui = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditMusicState(Boolean bool, C20523m mVar, C69905c cVar, AbstractC40906e eVar, View$OnClickListenerC72712e.AbstractC72715b bVar, C20365ac acVar, C20526p pVar, C20526p pVar2, boolean z, C20526p pVar3, C20522l lVar, C20521k kVar, AbstractC23517a aVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : mVar, (i & 4) != 0 ? null : cVar, (i & 8) != 0 ? null : eVar, (i & 16) != 0 ? null : bVar, (i & 32) != 0 ? null : acVar, (i & 64) != 0 ? null : pVar, (i & 128) != 0 ? null : pVar2, (i & 256) != 0 ? false : z, (i & 512) != 0 ? null : pVar3, (i & 1024) != 0 ? null : lVar, (i & 2048) == 0 ? kVar : null, (i & 4096) != 0 ? new AbstractC23517a.C23518a() : aVar);
    }
}
