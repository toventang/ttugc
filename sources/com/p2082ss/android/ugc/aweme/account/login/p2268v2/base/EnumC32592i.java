package com.p2082ss.android.ugc.aweme.account.login.p2268v2.base;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4601a.C89041ag;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.i */
public enum EnumC32592i {
    NONE(-1),
    SIGN_UP(0),
    LOGIN(1),
    SET_OR_RESET_PASSWORD(2),
    BIND_PHONE(3),
    MODIFY_PHONE(4),
    RECOVER_ACCOUNT(5),
    CHANGE_PASSWORD(9),
    BIND_EMAIL(6),
    VERIFY(7),
    CHANGE_EMAIL(8),
    ONE_KEY_LOGIN(10),
    TWO_STEP_VERIFICATION(11),
    LOGIN_FLOW(12),
    GUEST_MODE(13),
    UNBIND_PHONE(14),
    UNBIND_EMAIL(15);
    
    public static final C32593a Companion = new C32593a((byte) 0);
    public static final Map<Integer, EnumC32592i> VALUES_MAP;

    /* renamed from: b */
    private final int f77745b;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.i$a */
    public static final class C32593a {
        static {
            Covode.recordClassIndex(39365);
        }

        private C32593a() {
        }

        public /* synthetic */ C32593a(byte b) {
            this();
        }
    }

    public final int getValue() {
        return this.f77745b;
    }

    static {
        Covode.recordClassIndex(39364);
        EnumC32592i[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C89271h.m154769b(C89041ag.m154411a(values.length), 16));
        for (EnumC32592i iVar : values) {
            linkedHashMap.put(Integer.valueOf(iVar.f77745b), iVar);
        }
        VALUES_MAP = linkedHashMap;
    }

    private EnumC32592i(int i) {
        this.f77745b = i;
    }
}
