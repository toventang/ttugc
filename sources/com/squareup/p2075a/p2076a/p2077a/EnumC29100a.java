package com.squareup.p2075a.p2076a.p2077a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.squareup.a.a.a.a */
public enum EnumC29100a {
    NO_ERROR(0, -1, 0),
    PROTOCOL_ERROR(1, 1, 1),
    INVALID_STREAM(1, 2, -1),
    UNSUPPORTED_VERSION(1, 4, -1),
    STREAM_IN_USE(1, 8, -1),
    STREAM_ALREADY_CLOSED(1, 9, -1),
    INTERNAL_ERROR(2, 6, 2),
    FLOW_CONTROL_ERROR(3, 7, -1),
    STREAM_CLOSED(5, -1, -1),
    FRAME_TOO_LARGE(6, 11, -1),
    REFUSED_STREAM(7, 3, -1),
    CANCEL(8, 5, -1),
    COMPRESSION_ERROR(9, -1, -1),
    CONNECT_ERROR(10, -1, -1),
    ENHANCE_YOUR_CALM(11, -1, -1),
    INADEQUATE_SECURITY(12, -1, -1),
    HTTP_1_1_REQUIRED(13, -1, -1),
    INVALID_CREDENTIALS(-1, 10, -1);
    
    public final int httpCode;
    public final int spdyGoAwayCode;
    public final int spdyRstCode;

    static {
        Covode.recordClassIndex(35449);
    }

    public static EnumC29100a fromHttp2(int i) {
        EnumC29100a[] values = values();
        for (EnumC29100a aVar : values) {
            if (aVar.httpCode == i) {
                return aVar;
            }
        }
        return null;
    }

    public static EnumC29100a fromSpdy3Rst(int i) {
        EnumC29100a[] values = values();
        for (EnumC29100a aVar : values) {
            if (aVar.spdyRstCode == i) {
                return aVar;
            }
        }
        return null;
    }

    public static EnumC29100a fromSpdyGoAway(int i) {
        EnumC29100a[] values = values();
        for (EnumC29100a aVar : values) {
            if (aVar.spdyGoAwayCode == i) {
                return aVar;
            }
        }
        return null;
    }

    private EnumC29100a(int i, int i2, int i3) {
        this.httpCode = i;
        this.spdyRstCode = i2;
        this.spdyGoAwayCode = i3;
    }
}
