package com.bytedance.android.livesdkapi.session;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdkapi.session.b */
public enum EnumC11866b {
    ServerApiCall("server_api_call"),
    MessageReceived("message_received"),
    SdkInterfaceCall("sdk_interface_call"),
    SdkCallback("sdk_callback"),
    BussinessApiCall("bussiness_api_call");
    

    /* renamed from: b */
    private final String f28397b;

    public final String getType() {
        return this.f28397b;
    }

    static {
        Covode.recordClassIndex(13584);
    }

    private EnumC11866b(String str) {
        this.f28397b = str;
    }
}
