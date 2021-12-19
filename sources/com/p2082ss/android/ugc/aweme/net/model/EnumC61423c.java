package com.p2082ss.android.ugc.aweme.net.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.net.model.c */
public enum EnumC61423c {
    NATIVE_NETWORK_MONITOR_EXCEPTION_LOG("native_network_monitor_exception_log"),
    UNEXPECTED_NETWORK_LOG("unexpected_network_log"),
    NATIVE_NETWORK_API_LOG("native_network_api_log"),
    PENETRATE_HEADER_LOG("penetrate_header_log"),
    HTTP_COOKIE_TOKEN_LOG("http_cookie_token_log"),
    COMPLIANCE_NETWORK_MONITOR_LOG("compliance_network_monitor_log"),
    COMPLIANCE_PAYLOAD_MONITOR_LOG("compliance_payload_monitor_log"),
    COMPLIANCE_THIRDPARTY_NETWORK_MONITOR_LOG("compliance_thirdparty_network_monitor_log");
    

    /* renamed from: b */
    private final String f139466b;

    public final String getLogType() {
        return this.f139466b;
    }

    static {
        Covode.recordClassIndex(72077);
    }

    private EnumC61423c(String str) {
        this.f139466b = str;
    }
}
