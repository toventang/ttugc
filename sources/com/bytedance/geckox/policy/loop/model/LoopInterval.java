package com.bytedance.geckox.policy.loop.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class LoopInterval {
    @AbstractC27891c(mo46611a = "interval")
    private int interval;

    static {
        Covode.recordClassIndex(17138);
    }

    /* renamed from: com.bytedance.geckox.policy.loop.model.LoopInterval$a */
    public enum EnumC15000a {
        lv_1(1),
        lv_2(2),
        lv_3(3);
        

        /* renamed from: a */
        private int f36645a;

        public final int getLevel() {
            return this.f36645a;
        }

        static {
            Covode.recordClassIndex(17139);
        }

        private EnumC15000a(int i) {
            this.f36645a = i;
        }
    }

    public int getInterval() {
        return this.interval;
    }

    public LoopInterval(int i) {
        this.interval = i;
    }
}
