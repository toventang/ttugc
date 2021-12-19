package com.p2082ss.android.ugc.playerkit.simapicommon.p4325a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.playerkit.simapicommon.a.f */
public class C84238f implements Serializable {
    @AbstractC27891c(mo46611a = "vid")

    /* renamed from: a */
    String f188349a;
    @AbstractC27891c(mo46611a = "auth")

    /* renamed from: b */
    String f188350b;
    @AbstractC27891c(mo46611a = "token")

    /* renamed from: c */
    String f188351c;
    @AbstractC27891c(mo46611a = "hosts")

    /* renamed from: d */
    List<String> f188352d;
    @AbstractC27891c(mo46611a = "version")

    /* renamed from: e */
    Integer f188353e;

    /* renamed from: f */
    private int f188354f;
    public Object origin;

    static {
        Covode.recordClassIndex(98147);
    }

    public void resetHostIndex() {
        this.f188354f = 0;
    }

    public String getAuth() {
        return this.f188350b;
    }

    public int getHostIndex() {
        return this.f188354f;
    }

    public List<String> getHosts() {
        return this.f188352d;
    }

    public String getToken() {
        return this.f188351c;
    }

    public String getVid() {
        return this.f188349a;
    }

    public int getVersion() {
        Integer num = this.f188353e;
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    public String tryGetHost() {
        List<String> list = this.f188352d;
        if (list == null || this.f188354f >= list.size()) {
            return null;
        }
        return this.f188352d.get(this.f188354f);
    }

    public boolean tryUseNextHost() {
        List<String> list = this.f188352d;
        if (list == null || this.f188354f >= list.size() - 1) {
            return false;
        }
        this.f188354f++;
        return true;
    }

    public void setAuth(String str) {
        this.f188350b = str;
    }

    public void setHostIndex(int i) {
        this.f188354f = i;
    }

    public void setHosts(List<String> list) {
        this.f188352d = list;
    }

    public void setToken(String str) {
        this.f188351c = str;
    }

    public void setVid(String str) {
        this.f188349a = str;
    }

    public void setVersion(int i) {
        this.f188353e = Integer.valueOf(i);
    }
}
