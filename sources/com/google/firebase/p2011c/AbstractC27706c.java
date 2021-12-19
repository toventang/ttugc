package com.google.firebase.p2011c;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.firebase.c.c */
public interface AbstractC27706c {
    static {
        Covode.recordClassIndex(33288);
    }

    /* renamed from: a */
    EnumC27707a mo46342a(String str);

    /* renamed from: com.google.firebase.c.c$a */
    public enum EnumC27707a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        

        /* renamed from: a */
        private final int f65123a;

        public final int getCode() {
            return this.f65123a;
        }

        static {
            Covode.recordClassIndex(33289);
        }

        private EnumC27707a(int i) {
            this.f65123a = i;
        }
    }
}
