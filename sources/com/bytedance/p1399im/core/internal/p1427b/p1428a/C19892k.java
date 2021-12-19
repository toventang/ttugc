package com.bytedance.p1399im.core.internal.p1427b.p1428a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19618bg;
import com.bytedance.p1399im.core.p1408d.C19666o;
import com.bytedance.p1399im.core.proto.DeleteMessageRequestBody;
import com.bytedance.p1399im.core.proto.DeleteStrangerMessageRequestBody;
import com.bytedance.p1399im.core.proto.RequestBody;

/* renamed from: com.bytedance.im.core.internal.b.a.k */
public final class C19892k extends AbstractC19927w<C19538ai> {

    /* renamed from: a */
    public boolean f47238a;

    /* renamed from: b */
    C19538ai f47239b;

    /* renamed from: c */
    RequestBody f47240c;

    /* renamed from: d */
    private boolean f47241d;

    /* renamed from: e */
    private long f47242e;

    /* renamed from: f */
    private int f47243f;

    /* renamed from: g */
    private int f47244g;

    static {
        Covode.recordClassIndex(22736);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        return true;
    }

    public C19892k() {
        this(false, null);
    }

    /* renamed from: a */
    public final void mo31778a(C19666o oVar) {
        if (oVar == null) {
            C19512f.m36457b("imsdk", "DeleteMsgHandlerretryDeleteReq, request invalid", (Throwable) null);
            return;
        }
        this.f47241d = true;
        this.f47238a = oVar.isStranger;
        this.f47243f = oVar.retryTimes.intValue();
        this.f47242e = oVar.userDelTime.longValue();
        C19512f.m36457b("imsdk", "DeleteMsgHandlerretryDeleteReq, cid:" + oVar.conversationId + ", retryTimes:" + this.f47243f + ", userDelTime:" + this.f47242e, (Throwable) null);
        if (oVar.isStranger) {
            mo31798a(oVar.inboxType.intValue(), new RequestBody.Builder().delete_stranger_message_body(oVar.toStrangeMsgReqBody()).build(), null, new Object[0]);
            return;
        }
        mo31798a(oVar.inboxType.intValue(), new RequestBody.Builder().delete_message_body(oVar.toMsgReqBody()).build(), null, new Object[0]);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C19892k(boolean r2, com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b<com.bytedance.p1399im.core.p1408d.C19538ai> r3) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x000e
            com.bytedance.im.core.proto.IMCMD r0 = com.bytedance.p1399im.core.proto.IMCMD.DELETE_STRANGER_MESSAGE
        L_0x0004:
            int r0 = r0.getValue()
            r1.<init>(r0, r3)
            r1.f47238a = r2
            return
        L_0x000e:
            com.bytedance.im.core.proto.IMCMD r0 = com.bytedance.p1399im.core.proto.IMCMD.DELETE_MESSAGE
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.internal.p1427b.p1428a.C19892k.<init>(boolean, com.bytedance.im.core.a.a.b):void");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final void mo31129a(C19978k kVar, Runnable runnable) {
        RequestBody requestBody;
        RequestBody requestBody2;
        if (kVar.mo31869l()) {
            mo31800a(this.f47239b);
            return;
        }
        if (this.f47238a) {
            if (!(this.f47241d || (requestBody2 = this.f47240c) == null || requestBody2.delete_stranger_message_body == null)) {
                int i = this.f47244g;
                Long l = this.f47240c.delete_stranger_message_body.server_message_id;
                DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody = this.f47240c.delete_stranger_message_body;
                if (C19618bg.f46617b != null) {
                    C19618bg.f46617b.mo31408a(i, l, deleteStrangerMessageRequestBody);
                }
            }
        } else if (!(this.f47241d || (requestBody = this.f47240c) == null || requestBody.delete_message_body == null)) {
            int i2 = this.f47244g;
            Long l2 = this.f47240c.delete_message_body.message_id;
            DeleteMessageRequestBody deleteMessageRequestBody = this.f47240c.delete_message_body;
            if (C19618bg.f46617b != null) {
                C19618bg.f46617b.mo31407a(i2, l2, deleteMessageRequestBody);
            }
        }
        mo31803b(kVar);
    }
}
