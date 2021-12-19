package com.p2082ss.android.ugc.aweme.simreporter;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.simreporter.InitInfo */
public final class InitInfo {
    private String playerName = "tiktok-ttplayer";
    private String playerVersion = "";
    private String uid = "";

    static {
        Covode.recordClassIndex(87510);
    }

    public final String getPlayerName() {
        return this.playerName;
    }

    public final String getPlayerVersion() {
        return this.playerVersion;
    }

    public final String getUid() {
        return this.uid;
    }

    public final String toString() {
        return "InitInfo(uid='" + this.uid + "', playerName='" + this.playerName + "', playerVersion='" + this.playerVersion + "')";
    }

    public final void setPlayerName(String str) {
        C89219l.m154719c(str, "");
        this.playerName = str;
    }

    public final void setPlayerVersion(String str) {
        C89219l.m154719c(str, "");
        this.playerVersion = str;
    }

    public final void setUid(String str) {
        C89219l.m154719c(str, "");
        this.uid = str;
    }
}
