package com.bytedance.frameworks.baselib.network.http.cronet;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.a */
public class C14642a {

    /* renamed from: a */
    public static volatile EnumC14643a f35463a = EnumC14643a.NormalStart;

    /* renamed from: b */
    public static volatile EnumC14643a f35464b = EnumC14643a.Default;

    /* renamed from: c */
    private static final String f35465c = C14642a.class.getSimpleName();

    /* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.a$a */
    public enum EnumC14643a {
        NormalStart(-1),
        ColdStart(0),
        HotStart(1),
        WarmStart(2),
        WeakNet(3),
        Default(4);
        

        /* renamed from: a */
        public final int f35467a;

        public final int getValue() {
            return this.f35467a;
        }

        static {
            Covode.recordClassIndex(16738);
        }

        private EnumC14643a(int i) {
            this.f35467a = i;
        }
    }

    static {
        Covode.recordClassIndex(16737);
    }
}
