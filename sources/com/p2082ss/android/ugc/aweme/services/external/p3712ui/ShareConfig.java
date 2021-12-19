package com.p2082ss.android.ugc.aweme.services.external.p3712ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39078ad;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.external.ui.ShareConfig */
public final class ShareConfig {
    private String appName;
    private String file;
    private List<String> imageList;
    private final C39078ad shareContext;
    private final int type;
    private List<String> videoList;

    static {
        Covode.recordClassIndex(79881);
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getFile() {
        return this.file;
    }

    public final List<String> getImageList() {
        return this.imageList;
    }

    public final C39078ad getShareContext() {
        return this.shareContext;
    }

    public final int getType() {
        return this.type;
    }

    public final List<String> getVideoList() {
        return this.videoList;
    }

    public final void setAppName(String str) {
        this.appName = str;
    }

    public final void setFile(String str) {
        this.file = str;
    }

    public final void setImageList(List<String> list) {
        this.imageList = list;
    }

    public final void setVideoList(List<String> list) {
        this.videoList = list;
    }

    public ShareConfig(C39078ad adVar, int i) {
        C89219l.m154721d(adVar, "");
        this.shareContext = adVar;
        this.type = i;
    }
}
