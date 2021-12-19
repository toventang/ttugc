package com.bytedance.sdk.bridge.p1694b;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.bridge.b.b */
public final class C22695b {

    /* renamed from: d */
    public static final C22697b f53611d = new C22697b((byte) 0);

    /* renamed from: a */
    public int f53612a;

    /* renamed from: b */
    public String f53613b;

    /* renamed from: c */
    public JSONObject f53614c;

    static {
        Covode.recordClassIndex(26516);
    }

    /* renamed from: com.bytedance.sdk.bridge.b.b$a */
    public enum EnumC22696a {
        SUCCESS(1),
        ERROR(0),
        NOT_FOUND(-2),
        NO_PRIVILEGE(-1),
        PARAMS_ERROR(-3);
        

        /* renamed from: b */
        private final int f53616b;

        public final int getValue() {
            return this.f53616b;
        }

        static {
            Covode.recordClassIndex(26517);
        }

        private EnumC22696a(int i) {
            this.f53616b = i;
        }
    }

    /* renamed from: com.bytedance.sdk.bridge.b.b$b */
    public static final class C22697b {
        static {
            Covode.recordClassIndex(26518);
        }

        private C22697b() {
        }

        public /* synthetic */ C22697b(byte b) {
            this();
        }
    }

    private C22695b() {
        this.f53612a = EnumC22696a.ERROR.getValue();
    }

    public /* synthetic */ C22695b(byte b) {
        this();
    }
}
