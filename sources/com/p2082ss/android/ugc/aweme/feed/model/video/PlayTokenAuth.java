package com.p2082ss.android.ugc.aweme.feed.model.video;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.video.PlayTokenAuth */
public final class PlayTokenAuth implements Serializable {
    @AbstractC27891c(mo46611a = "auth")
    public String auth;
    public int hostIndex;
    @AbstractC27891c(mo46611a = "hosts")
    public List<String> hosts;
    @AbstractC27891c(mo46611a = "token")
    public String token;
    @AbstractC27891c(mo46611a = "version")
    public Integer version;
    @AbstractC27891c(mo46611a = "vid")
    public String vid;

    static {
        Covode.recordClassIndex(58846);
    }

    public final void resetHostIndex() {
        this.hostIndex = 0;
    }

    public final String getAuth() {
        return this.auth;
    }

    public final int getHostIndex() {
        return this.hostIndex;
    }

    public final List<String> getHosts() {
        return this.hosts;
    }

    public final String getToken() {
        return this.token;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public final String getVid() {
        return this.vid;
    }

    public final int getVersionN() {
        Integer num = this.version;
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    public final String tryGetHost() {
        List<String> list = this.hosts;
        if (list == null || this.hostIndex >= list.size()) {
            return null;
        }
        List<String> list2 = this.hosts;
        if (list2 == null) {
            C89219l.m154715b();
        }
        return list2.get(this.hostIndex);
    }

    public final boolean tryUseNextHost() {
        List<String> list = this.hosts;
        if (list == null || this.hostIndex >= list.size() - 1) {
            return false;
        }
        this.hostIndex++;
        return true;
    }

    public final void setAuth(String str) {
        this.auth = str;
    }

    public final void setHostIndex(int i) {
        this.hostIndex = i;
    }

    public final void setHosts(List<String> list) {
        this.hosts = list;
    }

    public final void setToken(String str) {
        this.token = str;
    }

    public final void setVersion(Integer num) {
        this.version = num;
    }

    public final void setVid(String str) {
        this.vid = str;
    }

    public final void setVersionN(int i) {
        this.version = Integer.valueOf(i);
    }
}
