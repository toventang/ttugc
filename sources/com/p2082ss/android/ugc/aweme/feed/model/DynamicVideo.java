package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.DynamicVideo */
public final class DynamicVideo implements Serializable {
    @AbstractC27891c(mo46611a = "gecko_channel")
    private final List<String> geckoChannel;
    @AbstractC27891c(mo46611a = "lynx_scheme")
    private final String lynxScheme;

    static {
        Covode.recordClassIndex(58675);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.feed.model.DynamicVideo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DynamicVideo copy$default(DynamicVideo dynamicVideo, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dynamicVideo.lynxScheme;
        }
        if ((i & 2) != 0) {
            list = dynamicVideo.geckoChannel;
        }
        return dynamicVideo.copy(str, list);
    }

    public final String component1() {
        return this.lynxScheme;
    }

    public final List<String> component2() {
        return this.geckoChannel;
    }

    public final DynamicVideo copy(String str, List<String> list) {
        return new DynamicVideo(str, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicVideo)) {
            return false;
        }
        DynamicVideo dynamicVideo = (DynamicVideo) obj;
        return C89219l.m154714a(this.lynxScheme, dynamicVideo.lynxScheme) && C89219l.m154714a(this.geckoChannel, dynamicVideo.geckoChannel);
    }

    public final int hashCode() {
        String str = this.lynxScheme;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<String> list = this.geckoChannel;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "DynamicVideo(lynxScheme=" + this.lynxScheme + ", geckoChannel=" + this.geckoChannel + ")";
    }

    public final List<String> getGeckoChannel() {
        return this.geckoChannel;
    }

    public final String getLynxScheme() {
        return this.lynxScheme;
    }

    public DynamicVideo(String str, List<String> list) {
        this.lynxScheme = str;
        this.geckoChannel = list;
    }
}
