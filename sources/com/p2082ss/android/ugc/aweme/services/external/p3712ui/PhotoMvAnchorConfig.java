package com.p2082ss.android.ugc.aweme.services.external.p3712ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.services.external.ui.PhotoMvAnchorConfig */
public final class PhotoMvAnchorConfig {
    public static final Companion Companion = new Companion(null);
    private MusicModel musicModel;
    private String slideshowMvId;
    private String templateType;

    static {
        Covode.recordClassIndex(79871);
    }

    /* renamed from: com.ss.android.ugc.aweme.services.external.ui.PhotoMvAnchorConfig$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(79872);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }
    }

    public final MusicModel getMusicModel() {
        return this.musicModel;
    }

    public final String getSlideshowMvId() {
        return this.slideshowMvId;
    }

    public final String getTemplateType() {
        return this.templateType;
    }

    public final void setMusicModel(MusicModel musicModel2) {
        this.musicModel = musicModel2;
    }

    public final void setSlideshowMvId(String str) {
        this.slideshowMvId = str;
    }

    public final void setTemplateType(String str) {
        this.templateType = str;
    }
}
