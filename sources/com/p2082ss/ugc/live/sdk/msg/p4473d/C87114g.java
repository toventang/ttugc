package com.p2082ss.ugc.live.sdk.msg.p4473d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.message.data.PayloadItem;
import com.p2082ss.ugc.live.sdk.msg.data.SdkUplinkPacket;
import com.p2082ss.ugc.live.sdk.msg.p4471b.C87078b;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.live.sdk.msg.d.g */
public final class C87114g {

    /* renamed from: a */
    public static final C87114g f196387a = new C87114g();

    private C87114g() {
    }

    static {
        Covode.recordClassIndex(102910);
    }

    /* renamed from: a */
    public static final String m150863a(SdkUplinkPacket sdkUplinkPacket) {
        Map<String, String> map;
        String str;
        if (sdkUplinkPacket == null || (map = sdkUplinkPacket.headers) == null || (str = map.get("X-Tt-Logid")) == null) {
            return "";
        }
        return str;
    }

    /* renamed from: a */
    public static final String m150862a(PayloadItem payloadItem) {
        List<C87078b> headers;
        T t;
        if (!(payloadItem == null || (headers = payloadItem.getHeaders()) == null)) {
            Iterator<T> it = headers.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C89219l.m154714a((Object) t.f196298a, (Object) "compress_type")) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                return t2.f196299b;
            }
        }
        return null;
    }
}
