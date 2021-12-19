package com.bytedance.p1399im.core.p1408d;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* renamed from: com.bytedance.im.core.d.ah */
public class C19537ah implements Serializable {
    private String alias;
    private String conversationId;
    private int conversationType;
    private int role;
    private String secUid;
    private int silent;
    private long silentTime;
    private long sortOrder;
    private long uid;

    static {
        Covode.recordClassIndex(22381);
    }

    public String getAlias() {
        return this.alias;
    }

    public String getConversationId() {
        return this.conversationId;
    }

    public int getConversationType() {
        return this.conversationType;
    }

    public int getRole() {
        return this.role;
    }

    public String getSecUid() {
        return this.secUid;
    }

    public int getSilent() {
        return this.silent;
    }

    public long getSilentTime() {
        return this.silentTime;
    }

    public long getSortOrder() {
        return this.sortOrder;
    }

    public long getUid() {
        return this.uid;
    }

    public int hashCode() {
        if (this.conversationId == null || this.uid == 0) {
            return 0;
        }
        return (this.conversationId + "_" + this.uid).hashCode();
    }

    public void setAlias(String str) {
        this.alias = str;
    }

    public void setConversationId(String str) {
        this.conversationId = str;
    }

    public void setConversationType(int i) {
        this.conversationType = i;
    }

    public void setRole(int i) {
        this.role = i;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }

    public void setSilent(int i) {
        this.silent = i;
    }

    public void setSilentTime(long j) {
        this.silentTime = j;
    }

    public void setSortOrder(long j) {
        this.sortOrder = j;
    }

    public void setUid(long j) {
        this.uid = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C19537ah ahVar = (C19537ah) obj;
            String str = this.conversationId;
            if (str == null ? ahVar.conversationId == null : str.equals(ahVar.conversationId)) {
                if (this.uid == ahVar.uid) {
                    return true;
                }
            }
        }
        return false;
    }
}
