package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.VideoInfo */
public final class VideoInfo {
    private final UrlModel cover;
    @AbstractC27891c(mo46611a = "link_info")
    private final LinkInfo linkInfo;

    static {
        Covode.recordClassIndex(63492);
    }

    public static /* synthetic */ VideoInfo copy$default(VideoInfo videoInfo, UrlModel urlModel, LinkInfo linkInfo2, int i, Object obj) {
        if ((i & 1) != 0) {
            urlModel = videoInfo.cover;
        }
        if ((i & 2) != 0) {
            linkInfo2 = videoInfo.linkInfo;
        }
        return videoInfo.copy(urlModel, linkInfo2);
    }

    public final UrlModel component1() {
        return this.cover;
    }

    public final LinkInfo component2() {
        return this.linkInfo;
    }

    public final VideoInfo copy(UrlModel urlModel, LinkInfo linkInfo2) {
        C89219l.m154721d(urlModel, "");
        C89219l.m154721d(linkInfo2, "");
        return new VideoInfo(urlModel, linkInfo2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoInfo)) {
            return false;
        }
        VideoInfo videoInfo = (VideoInfo) obj;
        return C89219l.m154714a(this.cover, videoInfo.cover) && C89219l.m154714a(this.linkInfo, videoInfo.linkInfo);
    }

    public final int hashCode() {
        UrlModel urlModel = this.cover;
        int i = 0;
        int hashCode = (urlModel != null ? urlModel.hashCode() : 0) * 31;
        LinkInfo linkInfo2 = this.linkInfo;
        if (linkInfo2 != null) {
            i = linkInfo2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "VideoInfo(cover=" + this.cover + ", linkInfo=" + this.linkInfo + ")";
    }

    public final UrlModel getCover() {
        return this.cover;
    }

    public final LinkInfo getLinkInfo() {
        return this.linkInfo;
    }

    public VideoInfo(UrlModel urlModel, LinkInfo linkInfo2) {
        C89219l.m154721d(urlModel, "");
        C89219l.m154721d(linkInfo2, "");
        this.cover = urlModel;
        this.linkInfo = linkInfo2;
    }
}
