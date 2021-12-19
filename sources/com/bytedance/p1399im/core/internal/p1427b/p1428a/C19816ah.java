package com.bytedance.p1399im.core.internal.p1427b.p1428a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.internal.utils.C20014q;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1408d.C19536ag;
import com.bytedance.p1399im.core.p1408d.C19587an;
import com.bytedance.p1399im.core.proto.IMCMD;
import com.bytedance.p1399im.core.proto.MessageType;
import com.bytedance.p1399im.core.proto.ModifyMessagePropertyStatus;
import com.bytedance.p1399im.core.proto.ModifyPropertyContent;
import com.bytedance.p1399im.core.proto.OPERATION_TYPE;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.b.a.ah */
public final class C19816ah extends AbstractC19927w<C19587an> {
    static {
        Covode.recordClassIndex(22660);
    }

    public C19816ah() {
        super(IMCMD.SET_MESSAGE_PROPERTY.getValue());
    }

    /* renamed from: a */
    public static boolean m37315a(ModifyMessagePropertyStatus modifyMessagePropertyStatus) {
        if (modifyMessagePropertyStatus == ModifyMessagePropertyStatus.MODIFY_PROPERTY_SUCCESS || modifyMessagePropertyStatus == ModifyMessagePropertyStatus.MODIFY_PROPERTY_REPEAT_REQUEST) {
            return true;
        }
        return false;
    }

    public C19816ah(AbstractC19479b<C19587an> bVar) {
        super(IMCMD.SET_MESSAGE_PROPERTY.getValue(), bVar);
    }

    /* renamed from: a */
    public final void mo31747a(final C19587an anVar) {
        if (anVar == null || anVar.invalid()) {
            mo31746a(-1015, anVar);
            return;
        }
        anVar.setMsgType(MessageType.MESSAGE_TYPE_UPDATE_MESSAGE_PROPERTY.getValue());
        RunnableC19987d.m37728a(new AbstractC19986c<Boolean>() {
            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19816ah.C198193 */

            static {
                Covode.recordClassIndex(22663);
            }

            /* access modifiers changed from: private */
            /* JADX WARNING: Code restructure failed: missing block: B:35:0x0100, code lost:
                r2 = com.bytedance.p1399im.core.internal.p1419a.C19777i.m37195c(r3.getClientMessageId());
             */
            /* renamed from: b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Boolean mo31187a() {
                /*
                // Method dump skipped, instructions count: 422
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.internal.p1427b.p1428a.C19816ah.C198193.mo31187a():java.lang.Boolean");
            }
        }, (AbstractC19985b) null);
    }

    /* renamed from: b */
    public static List<C19536ag> m37316b(C19587an anVar) {
        List<ModifyPropertyContent> propertyContentList;
        if (anVar == null || (propertyContentList = anVar.getPropertyContentList()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ModifyPropertyContent modifyPropertyContent : propertyContentList) {
            if (modifyPropertyContent.operation != null) {
                C19536ag agVar = new C19536ag();
                agVar.msgUuid = anVar.getClientMessageId();
                agVar.conversationId = anVar.getConversationId();
                agVar.uid = Long.valueOf(C19483d.m36365a().f46157b.mo27953a());
                agVar.sec_uid = C19483d.m36365a().f46157b.mo27962c();
                agVar.idempotent_id = modifyPropertyContent.idempotent_id;
                agVar.key = modifyPropertyContent.key;
                agVar.value = modifyPropertyContent.value;
                agVar.status = 1;
                agVar.create_time = Long.valueOf(System.currentTimeMillis());
                if (modifyPropertyContent.operation.getValue() == OPERATION_TYPE.ADD_PROPERTY_ITEM.getValue()) {
                    agVar.deleted = 0;
                } else if (modifyPropertyContent.operation.getValue() == OPERATION_TYPE.REMOVE_PROPERTY_ITEM.getValue()) {
                    agVar.deleted = 1;
                }
                arrayList.add(agVar);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        if (kVar == null || !kVar.mo31869l() || kVar.f47482f == null || kVar.f47482f.body == null || kVar.f47482f.body.modify_message_property_body == null || !m37315a(kVar.f47482f.body.modify_message_property_body.status)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo31746a(int i, C19587an anVar) {
        if (anVar == null || !anVar.getMute()) {
            mo31803b(C19978k.m37686a(i));
            C20014q.m37816a().mo31892a(i, anVar);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r3 = (com.bytedance.p1399im.core.p1408d.C19587an) r5.f47480d[0];
     */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31129a(final com.bytedance.p1399im.core.internal.p1431d.C19978k r5, java.lang.Runnable r6) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0006
            java.lang.Object[] r0 = r5.f47480d
            if (r0 != 0) goto L_0x0007
        L_0x0006:
            return
        L_0x0007:
            java.lang.Object[] r1 = r5.f47480d
            r0 = 0
            r3 = r1[r0]
            com.bytedance.im.core.d.an r3 = (com.bytedance.p1399im.core.p1408d.C19587an) r3
            if (r3 != 0) goto L_0x0011
            return
        L_0x0011:
            boolean r0 = r4.mo31130a(r5)
            com.bytedance.im.core.internal.b.a.ah$1 r2 = new com.bytedance.im.core.internal.b.a.ah$1
            r2.<init>(r5, r3, r0)
            com.bytedance.im.core.internal.b.a.ah$2 r1 = new com.bytedance.im.core.internal.b.a.ah$2
            r1.<init>(r3, r5, r0)
            java.util.concurrent.Executor r0 = com.bytedance.p1399im.core.internal.p1434e.C19983a.m37717a()
            com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d.m37729a(r2, r1, r0)
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.internal.p1427b.p1428a.C19816ah.mo31129a(com.bytedance.im.core.internal.d.k, java.lang.Runnable):void");
    }
}
