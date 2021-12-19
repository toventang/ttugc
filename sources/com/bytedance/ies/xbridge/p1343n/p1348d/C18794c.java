package com.bytedance.ies.xbridge.p1343n.p1348d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.model.p1342c.AbstractC18744a;

/* renamed from: com.bytedance.ies.xbridge.n.d.c */
public final class C18794c extends AbstractC18744a {

    /* renamed from: c */
    public static final C18795a f44573c = new C18795a((byte) 0);

    /* renamed from: a */
    public EnumC18796b f44574a;

    /* renamed from: b */
    public C18797c f44575b;

    /* renamed from: com.bytedance.ies.xbridge.n.d.c$c */
    public static final class C18797c {

        /* renamed from: a */
        public Integer f44578a;

        static {
            Covode.recordClassIndex(21493);
        }
    }

    static {
        Covode.recordClassIndex(21490);
    }

    /* renamed from: com.bytedance.ies.xbridge.n.d.c$a */
    public static final class C18795a {
        static {
            Covode.recordClassIndex(21491);
        }

        private C18795a() {
        }

        public /* synthetic */ C18795a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.xbridge.n.d.c$b */
    public enum EnumC18796b {
        SELECT("select"),
        DISMISS("dismiss");
        

        /* renamed from: b */
        private final String f44577b;

        public final String getAction() {
            return this.f44577b;
        }

        static {
            Covode.recordClassIndex(21492);
        }

        private EnumC18796b(String str) {
            this.f44577b = str;
        }
    }
}
