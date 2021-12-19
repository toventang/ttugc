package com.p2082ss.android.ugc.aweme.services.external.p3712ui;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.external.ui.ChangeBanMusicConfig */
public final class ChangeBanMusicConfig {
    private final String creationId;
    private final String mp4Path;
    private final String originVideo;
    public String outputDir;
    private int videoHeight;
    private int videoWidth;
    private final String wavPath;

    static {
        Covode.recordClassIndex(79848);
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final String getMp4Path() {
        return this.mp4Path;
    }

    public final String getOriginVideo() {
        return this.originVideo;
    }

    public final int getVideoHeight() {
        return this.videoHeight;
    }

    public final int getVideoWidth() {
        return this.videoWidth;
    }

    public final String getWavPath() {
        return this.wavPath;
    }

    public final String getOutputDir() {
        String str = this.outputDir;
        if (str == null) {
            C89219l.m154710a("outputDir");
        }
        return str;
    }

    public final void setVideoHeight(int i) {
        this.videoHeight = i;
    }

    public final void setVideoWidth(int i) {
        this.videoWidth = i;
    }

    public final void setOutputDir(String str) {
        C89219l.m154721d(str, "");
        this.outputDir = str;
    }

    public ChangeBanMusicConfig(String str, String str2, String str3, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        this.originVideo = str;
        this.mp4Path = str2;
        this.wavPath = str3;
        this.creationId = str4;
    }
}
