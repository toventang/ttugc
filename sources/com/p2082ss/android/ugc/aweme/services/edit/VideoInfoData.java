package com.p2082ss.android.ugc.aweme.services.edit;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.services.edit.VideoInfoData */
public final class VideoInfoData {
    private float rusumeVolumeMusic;
    private float rusumeVolumeOrigin;

    static {
        Covode.recordClassIndex(79773);
    }

    public VideoInfoData() {
        this(0.0f, 0.0f, 3, null);
    }

    public final float getRusumeVolumeMusic() {
        return this.rusumeVolumeMusic;
    }

    public final float getRusumeVolumeOrigin() {
        return this.rusumeVolumeOrigin;
    }

    public final void setRusumeVolumeMusic(float f) {
        this.rusumeVolumeMusic = f;
    }

    public final void setRusumeVolumeOrigin(float f) {
        this.rusumeVolumeOrigin = f;
    }

    public VideoInfoData(float f, float f2) {
        this.rusumeVolumeOrigin = f;
        this.rusumeVolumeMusic = f2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VideoInfoData(float f, float f2, int i, C89214g gVar) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2);
    }
}
