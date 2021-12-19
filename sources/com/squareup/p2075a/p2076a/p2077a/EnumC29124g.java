package com.squareup.p2075a.p2076a.p2077a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.squareup.a.a.a.g */
public enum EnumC29124g {
    SPDY_SYN_STREAM,
    SPDY_REPLY,
    SPDY_HEADERS,
    HTTP_20_HEADERS;

    public final boolean failIfHeadersAbsent() {
        if (this == SPDY_HEADERS) {
            return true;
        }
        return false;
    }

    public final boolean failIfHeadersPresent() {
        if (this == SPDY_REPLY) {
            return true;
        }
        return false;
    }

    public final boolean failIfStreamPresent() {
        if (this == SPDY_SYN_STREAM) {
            return true;
        }
        return false;
    }

    public final boolean failIfStreamAbsent() {
        if (this == SPDY_REPLY || this == SPDY_HEADERS) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(35473);
    }
}
