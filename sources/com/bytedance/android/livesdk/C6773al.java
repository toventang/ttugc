package com.bytedance.android.livesdk;

import com.bytedance.android.livesdkapi.p702ws.LiveWsMessage;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.ugc.live.sdk.message.data.PayloadItem;
import com.p2082ss.ugc.live.sdk.msg.p4471b.C87078b;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.al */
public final class C6773al {

    /* renamed from: a */
    public static final C6773al f16816a = new C6773al();

    private C6773al() {
    }

    static {
        Covode.recordClassIndex(7511);
    }

    /* renamed from: a */
    public static final List<C87078b> m14560a(LiveWsMessage liveWsMessage) {
        List<LiveWsMessage.MsgHeader> list;
        ArrayList arrayList = new ArrayList();
        if (!(liveWsMessage == null || (list = liveWsMessage.f28425f) == null)) {
            for (T t : list) {
                C89219l.m154716b(t, "");
                arrayList.add(new C87078b(t.f28431a, t.f28432b));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final byte[] m14561a(PayloadItem payloadItem) {
        MethodCollector.m26663i(10378);
        if (payloadItem == null) {
            byte[] bArr = new byte[1];
            MethodCollector.m26664o(10378);
            return bArr;
        }
        byte[] payload = payloadItem.getPayload();
        if (C89219l.m154714a((Object) payloadItem.getCompressType(), (Object) "gzip")) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(payload);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C9986o.m18454a(byteArrayInputStream, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            byteArrayInputStream.close();
            C89219l.m154716b(byteArray, "");
            MethodCollector.m26664o(10378);
            return byteArray;
        }
        C89219l.m154716b(payload, "");
        MethodCollector.m26664o(10378);
        return payload;
    }
}
