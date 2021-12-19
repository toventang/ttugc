package com.bytedance.common.wschannel.p911a;

import com.bytedance.common.wschannel.model.Frame;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.covode.number.Covode;
import com.squareup.wire.Wire;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p4632k.C89427i;

/* renamed from: com.bytedance.common.wschannel.a.c */
final class C13646c implements AbstractC13644a {
    static {
        Covode.recordClassIndex(15677);
    }

    C13646c() {
    }

    @Override // com.bytedance.common.wschannel.p911a.AbstractC13644a
    /* renamed from: a */
    public final WsChannelMsg mo21925a(byte[] bArr) {
        Frame decode = Frame.ADAPTER.decode(bArr);
        long longValue = ((Long) Wire.get(decode.seqid, Frame.DEFAULT_SEQID)).longValue();
        long longValue2 = ((Long) Wire.get(decode.logid, Frame.DEFAULT_LOGID)).longValue();
        int intValue = ((Integer) Wire.get(decode.service, Frame.DEFAULT_SERVICE)).intValue();
        int intValue2 = ((Integer) Wire.get(decode.method, Frame.DEFAULT_METHOD)).intValue();
        List<Frame.ExtendedEntry> list = (List) Wire.get(decode.headers, Collections.emptyList());
        String str = (String) Wire.get(decode.payload_encoding, "");
        String str2 = (String) Wire.get(decode.payload_type, "");
        byte[] byteArray = ((C89427i) Wire.get(decode.payload, Frame.DEFAULT_PAYLOAD)).toByteArray();
        WsChannelMsg wsChannelMsg = new WsChannelMsg();
        wsChannelMsg.f33467e = longValue2;
        wsChannelMsg.f33466d = longValue;
        wsChannelMsg.f33468f = intValue;
        wsChannelMsg.f33469g = intValue2;
        if (list != null && list.size() >= 0) {
            ArrayList arrayList = new ArrayList();
            for (Frame.ExtendedEntry extendedEntry : list) {
                WsChannelMsg.MsgHeader msgHeader = new WsChannelMsg.MsgHeader();
                msgHeader.f33478a = (String) Wire.get(extendedEntry.key, "");
                msgHeader.f33479b = (String) Wire.get(extendedEntry.value, "");
                arrayList.add(msgHeader);
            }
            wsChannelMsg.f33470h = arrayList;
        }
        wsChannelMsg.f33471i = str;
        wsChannelMsg.f33472j = str2;
        wsChannelMsg.f33473k = byteArray;
        return wsChannelMsg;
    }

    @Override // com.bytedance.common.wschannel.p911a.AbstractC13644a
    /* renamed from: a */
    public final byte[] mo21926a(WsChannelMsg wsChannelMsg) {
        C89427i iVar;
        if (wsChannelMsg == null) {
            return null;
        }
        if (wsChannelMsg.mo22159a() != null) {
            iVar = C89427i.m155136of(wsChannelMsg.mo22159a());
        } else {
            iVar = C89427i.EMPTY;
        }
        Frame.Builder method = new Frame.Builder().logid(Long.valueOf(wsChannelMsg.f33467e)).seqid(Long.valueOf(wsChannelMsg.f33466d)).service(Integer.valueOf(wsChannelMsg.f33468f)).payload_encoding(wsChannelMsg.f33471i).payload_type(wsChannelMsg.f33472j).payload(iVar).method(Integer.valueOf(wsChannelMsg.f33469g));
        List<WsChannelMsg.MsgHeader> list = wsChannelMsg.f33470h;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (WsChannelMsg.MsgHeader msgHeader : list) {
                arrayList.add(new Frame.ExtendedEntry.Builder().key(msgHeader.f33478a).value(msgHeader.f33479b).build());
            }
        }
        if (!arrayList.isEmpty()) {
            method.headers(arrayList);
        }
        return Frame.ADAPTER.encode(method.build());
    }
}
