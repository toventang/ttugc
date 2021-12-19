package com.bytedance.android.live.broadcast.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;

public class WaitingReviewInfo {
    @AbstractC27891c(mo46611a = "audit_content")
    private String content;
    @AbstractC27891c(mo46611a = "audit_status")
    private int status;
    @AbstractC27891c(mo46611a = "total_queue_cnt")
    private int totalWaitingCount;
    @AbstractC27891c(mo46611a = "cur_wait_cnt")
    private int waitingCount;
    @AbstractC27891c(mo46611a = "rule_info")
    private List<C3274q> waitingReviewRules;
    @AbstractC27891c(mo46611a = "to_wait_time")
    private int waitingTime;

    static {
        Covode.recordClassIndex(3734);
    }

    public String getContent() {
        return this.content;
    }

    public int getStatus() {
        return this.status;
    }

    public int getTotalWaitingCount() {
        return this.totalWaitingCount;
    }

    public int getWaitingCount() {
        return this.waitingCount;
    }

    public List<C3274q> getWaitingReviewRules() {
        return this.waitingReviewRules;
    }

    public int getWaitingTime() {
        return this.waitingTime;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setTotalWaitingCount(int i) {
        this.totalWaitingCount = i;
    }

    public void setWaitingCount(int i) {
        this.waitingCount = i;
    }

    public void setWaitingReviewRules(List<C3274q> list) {
        this.waitingReviewRules = list;
    }

    public void setWaitingTime(int i) {
        this.waitingTime = i;
    }
}
