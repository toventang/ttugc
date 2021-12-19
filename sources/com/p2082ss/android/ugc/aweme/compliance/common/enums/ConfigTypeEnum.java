package com.p2082ss.android.ugc.aweme.compliance.common.enums;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4601a.C89070n;

/* renamed from: com.ss.android.ugc.aweme.compliance.common.enums.ConfigTypeEnum */
public enum ConfigTypeEnum {
    API_DENY("api:deny"),
    API_ALLOW("api:allow"),
    PARAM_REMOVE("param:remove"),
    PARAM_ALLOW("param:allow"),
    PARAM_REPLACE("param:replace");
    
    public static final C39630a Companion = new C39630a((byte) 0);
    private final String type;

    /* renamed from: com.ss.android.ugc.aweme.compliance.common.enums.ConfigTypeEnum$a */
    public static final class C39630a {
        static {
            Covode.recordClassIndex(47345);
        }

        private C39630a() {
        }

        /* renamed from: a */
        public static List<String> m80473a() {
            return C89070n.m154522b(ConfigTypeEnum.API_DENY.getType(), ConfigTypeEnum.API_ALLOW.getType());
        }

        /* renamed from: b */
        public static List<String> m80474b() {
            return C89070n.m154522b(ConfigTypeEnum.PARAM_REMOVE.getType(), ConfigTypeEnum.PARAM_ALLOW.getType(), ConfigTypeEnum.PARAM_REPLACE.getType());
        }

        public /* synthetic */ C39630a(byte b) {
            this();
        }
    }

    public final String getType() {
        return this.type;
    }

    static {
        Covode.recordClassIndex(47344);
    }

    private ConfigTypeEnum(String str) {
        this.type = str;
    }
}
