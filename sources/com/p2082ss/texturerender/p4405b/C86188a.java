package com.p2082ss.texturerender.p4405b;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.LinkedList;

/* renamed from: com.ss.texturerender.b.a */
public final class C86188a {

    /* renamed from: a */
    LinkedList<C86189a> f192276a = new LinkedList<>();

    static {
        Covode.recordClassIndex(101331);
    }

    public final String toString() {
        String str = "";
        for (int i = 0; i < this.f192276a.size(); i++) {
            str = str + "pts[" + i + "]:" + this.f192276a.get(i).pts + ";";
        }
        return str;
    }

    /* renamed from: a */
    public final void mo136497a(C86189a aVar) {
        this.f192276a.offer(aVar);
    }

    /* renamed from: a */
    public final C86189a mo136496a(long j) {
        C86189a aVar = null;
        while (!this.f192276a.isEmpty()) {
            C86189a element = this.f192276a.element();
            if (j <= element.updateClockTime) {
                if (aVar == null) {
                    return this.f192276a.poll();
                }
                if (j > aVar.updateClockTime) {
                    if (j - aVar.updateClockTime < element.updateClockTime - j) {
                        return aVar;
                    }
                    return this.f192276a.poll();
                }
            }
            aVar = this.f192276a.poll();
            if (this.f192276a.isEmpty()) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: com.ss.texturerender.b.a$a */
    public static class C86189a implements Serializable {
        public long pts;
        public long updateClockTime;

        static {
            Covode.recordClassIndex(101332);
        }

        public C86189a(long j, long j2) {
            this.pts = j;
            this.updateClockTime = j2;
        }
    }
}
