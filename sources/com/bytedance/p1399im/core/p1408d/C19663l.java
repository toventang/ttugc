package com.bytedance.p1399im.core.p1408d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.im.core.d.l */
public class C19663l implements Serializable {
    private String conversationId;
    private Map<String, String> ext;
    private int favor;
    private int mute;
    private int stickTop;
    private long version;

    static {
        Covode.recordClassIndex(22507);
    }

    public String getConversationId() {
        return this.conversationId;
    }

    public int getFavor() {
        return this.favor;
    }

    public int getMute() {
        return this.mute;
    }

    public int getStickTop() {
        return this.stickTop;
    }

    public long getVersion() {
        return this.version;
    }

    public String getExtStr() {
        return C19999h.m37773a(this.ext);
    }

    public boolean isFavor() {
        if (this.favor == 1) {
            return true;
        }
        return false;
    }

    public boolean isMute() {
        if (this.mute == 1) {
            return true;
        }
        return false;
    }

    public boolean isStickTop() {
        if (this.stickTop == 1) {
            return true;
        }
        return false;
    }

    public synchronized Map<String, String> getExt() {
        Map<String, String> map;
        MethodCollector.m26663i(5850);
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        map = this.ext;
        MethodCollector.m26664o(5850);
        return map;
    }

    public void setConversationId(String str) {
        this.conversationId = str;
    }

    public void setExt(Map<String, String> map) {
        this.ext = map;
    }

    public void setFavor(int i) {
        this.favor = i;
    }

    public void setMute(int i) {
        this.mute = i;
    }

    public void setStickTop(int i) {
        this.stickTop = i;
    }

    public void setVersion(long j) {
        this.version = j;
    }

    public void setExtStr(String str) {
        this.ext = C19999h.m37774a(str);
    }
}
