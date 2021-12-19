package com.bytedance.p1399im.core.p1408d;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.bytedance.im.core.d.ap */
public class C19590ap implements Serializable {
    @AbstractC27891c(mo46611a = "end")
    public long end = -1;
    @AbstractC27891c(mo46611a = "start")
    public long start = -1;

    static {
        Covode.recordClassIndex(22434);
    }

    public C19590ap() {
    }

    public C19590ap copy() {
        return new C19590ap(this.start, this.end);
    }

    public void reverse() {
        long j = this.start;
        this.start = this.end;
        this.end = j;
    }

    public boolean isValid() {
        long j = this.start;
        if (j <= 0 || j > this.end) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "[" + this.start + "," + this.end + "]";
    }

    public void merge(C19590ap apVar) {
        if (apVar.isValid()) {
            long j = apVar.start;
            long j2 = this.start;
            if (j2 <= 0) {
                j2 = Long.MAX_VALUE;
            }
            this.start = Math.min(j, j2);
            long j3 = apVar.end;
            long j4 = this.end;
            if (j4 <= 0) {
                j4 = Long.MIN_VALUE;
            }
            this.end = Math.max(j3, j4);
        }
    }

    public C19590ap(long j, long j2) {
        this.start = j;
        this.end = j2;
    }
}
