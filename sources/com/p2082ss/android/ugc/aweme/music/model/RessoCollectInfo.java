package com.p2082ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.model.RessoCollectInfo */
public final class RessoCollectInfo implements Serializable {
    @AbstractC27891c(mo46611a = "added_on_resso")
    private final boolean addedOnResso;
    @AbstractC27891c(mo46611a = "deep_link")
    private final String deepLink;

    static {
        Covode.recordClassIndex(71416);
    }

    public static /* synthetic */ RessoCollectInfo copy$default(RessoCollectInfo ressoCollectInfo, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = ressoCollectInfo.addedOnResso;
        }
        if ((i & 2) != 0) {
            str = ressoCollectInfo.deepLink;
        }
        return ressoCollectInfo.copy(z, str);
    }

    public final boolean component1() {
        return this.addedOnResso;
    }

    public final String component2() {
        return this.deepLink;
    }

    public final RessoCollectInfo copy(boolean z, String str) {
        C89219l.m154721d(str, "");
        return new RessoCollectInfo(z, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RessoCollectInfo)) {
            return false;
        }
        RessoCollectInfo ressoCollectInfo = (RessoCollectInfo) obj;
        return this.addedOnResso == ressoCollectInfo.addedOnResso && C89219l.m154714a(this.deepLink, ressoCollectInfo.deepLink);
    }

    public final int hashCode() {
        boolean z = this.addedOnResso;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        String str = this.deepLink;
        return i4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "RessoCollectInfo(addedOnResso=" + this.addedOnResso + ", deepLink=" + this.deepLink + ")";
    }

    public final boolean getAddedOnResso() {
        return this.addedOnResso;
    }

    public final String getDeepLink() {
        return this.deepLink;
    }

    public RessoCollectInfo(boolean z, String str) {
        C89219l.m154721d(str, "");
        this.addedOnResso = z;
        this.deepLink = str;
    }
}
