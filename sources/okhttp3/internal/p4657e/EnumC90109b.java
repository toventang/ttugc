package okhttp3.internal.p4657e;

import com.bytedance.covode.number.Covode;

/* renamed from: okhttp3.internal.e.b */
public enum EnumC90109b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);
    
    public final int httpCode;

    static {
        Covode.recordClassIndex(106281);
    }

    public static EnumC90109b fromHttp2(int i) {
        EnumC90109b[] values = values();
        for (EnumC90109b bVar : values) {
            if (bVar.httpCode == i) {
                return bVar;
            }
        }
        return null;
    }

    private EnumC90109b(int i) {
        this.httpCode = i;
    }
}
