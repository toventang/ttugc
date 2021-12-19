package com.p2082ss.android.ugc.aweme.tools.p4082b;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.tools.b.f */
public enum EnumC77815f {
    MAIN_BUSINESS("main_business_data_in_tools_line"),
    SOCIAL("social_data_in_tools_line"),
    COMMERCE("commerce_data_in_tools_line"),
    UG("ug_data_in_tools_line"),
    TECH("tech_data_in_tools_line"),
    GLOBAL("global_data_in_tools_line");
    
    public final String intentKey;

    static {
        Covode.recordClassIndex(90900);
    }

    private EnumC77815f(String str) {
        this.intentKey = str;
    }
}
