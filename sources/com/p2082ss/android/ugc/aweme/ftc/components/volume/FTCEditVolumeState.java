package com.p2082ss.android.ugc.aweme.ftc.components.volume;

import com.bytedance.covode.number.Covode;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.UiState;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.volume.FTCEditVolumeState */
public final class FTCEditVolumeState extends UiState {
    private final String musicTitle;
    private final Integer musicVolume;

    /* renamed from: ui */
    private final AbstractC23517a f120763ui;
    private final String voiceTitle;

    static {
        Covode.recordClassIndex(61828);
    }

    public FTCEditVolumeState() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ FTCEditVolumeState copy$default(FTCEditVolumeState fTCEditVolumeState, String str, String str2, Integer num, AbstractC23517a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fTCEditVolumeState.musicTitle;
        }
        if ((i & 2) != 0) {
            str2 = fTCEditVolumeState.voiceTitle;
        }
        if ((i & 4) != 0) {
            num = fTCEditVolumeState.musicVolume;
        }
        if ((i & 8) != 0) {
            aVar = fTCEditVolumeState.getUi();
        }
        return fTCEditVolumeState.copy(str, str2, num, aVar);
    }

    public final String component1() {
        return this.musicTitle;
    }

    public final String component2() {
        return this.voiceTitle;
    }

    public final Integer component3() {
        return this.musicVolume;
    }

    public final AbstractC23517a component4() {
        return getUi();
    }

    public final FTCEditVolumeState copy(String str, String str2, Integer num, AbstractC23517a aVar) {
        C89219l.m154721d(aVar, "");
        return new FTCEditVolumeState(str, str2, num, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FTCEditVolumeState)) {
            return false;
        }
        FTCEditVolumeState fTCEditVolumeState = (FTCEditVolumeState) obj;
        return C89219l.m154714a(this.musicTitle, fTCEditVolumeState.musicTitle) && C89219l.m154714a(this.voiceTitle, fTCEditVolumeState.voiceTitle) && C89219l.m154714a(this.musicVolume, fTCEditVolumeState.musicVolume) && C89219l.m154714a(getUi(), fTCEditVolumeState.getUi());
    }

    public final int hashCode() {
        String str = this.musicTitle;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.voiceTitle;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.musicVolume;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        AbstractC23517a ui = getUi();
        if (ui != null) {
            i = ui.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "FTCEditVolumeState(musicTitle=" + this.musicTitle + ", voiceTitle=" + this.voiceTitle + ", musicVolume=" + this.musicVolume + ", ui=" + getUi() + ")";
    }

    public final String getMusicTitle() {
        return this.musicTitle;
    }

    public final Integer getMusicVolume() {
        return this.musicVolume;
    }

    @Override // com.bytedance.ui_component.UiState
    public final AbstractC23517a getUi() {
        return this.f120763ui;
    }

    public final String getVoiceTitle() {
        return this.voiceTitle;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FTCEditVolumeState(String str, String str2, Integer num, AbstractC23517a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        this.musicTitle = str;
        this.voiceTitle = str2;
        this.musicVolume = num;
        this.f120763ui = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FTCEditVolumeState(String str, String str2, Integer num, AbstractC23517a aVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? new AbstractC23517a.C23518a() : aVar);
    }
}
