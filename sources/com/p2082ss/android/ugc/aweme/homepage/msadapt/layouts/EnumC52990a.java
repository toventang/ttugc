package com.p2082ss.android.ugc.aweme.homepage.msadapt.layouts;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.homepage.msadapt.layouts.a */
public enum EnumC52990a {
    BLACK(0),
    WHITE(1);
    
    public static final C52991a Companion = new C52991a((byte) 0);

    /* renamed from: b */
    private final int f121851b;

    /* renamed from: com.ss.android.ugc.aweme.homepage.msadapt.layouts.a$a */
    public static final class C52991a {
        static {
            Covode.recordClassIndex(62529);
        }

        private C52991a() {
        }

        public /* synthetic */ C52991a(byte b) {
            this();
        }

        /* renamed from: a */
        public static EnumC52990a m97924a(int i) {
            EnumC52990a[] values = EnumC52990a.values();
            for (EnumC52990a aVar : values) {
                if (aVar.getId() == i) {
                    return aVar;
                }
            }
            throw new IllegalArgumentException("The HingeColor id doesn't exit");
        }
    }

    public final int getId() {
        return this.f121851b;
    }

    static {
        Covode.recordClassIndex(62528);
    }

    private EnumC52990a(int i) {
        this.f121851b = i;
    }
}
