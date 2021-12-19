package com.bytedance.p1399im.core.p1417i.p1418a;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.C19749c;
import com.bytedance.p1399im.core.internal.p1419a.C19777i;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19821ai;
import com.bytedance.p1399im.core.internal.p1431d.AbstractC19977j;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.internal.utils.C19994c;
import com.bytedance.p1399im.core.internal.utils.C19997f;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1404a.C19489e;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19478a;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19598aw;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19656k;
import com.bytedance.p1399im.core.p1417i.C19730f;
import com.bytedance.p1399im.core.p1417i.C19737g;
import com.bytedance.p1399im.core.proto.GetStrangerConversationListRequestBody;
import com.bytedance.p1399im.core.proto.GetStrangerConversationListResponseBody;
import com.bytedance.p1399im.core.proto.IMCMD;
import com.bytedance.p1399im.core.proto.MessageBody;
import com.bytedance.p1399im.core.proto.RequestBody;
import com.bytedance.p1399im.core.proto.StrangerConversation;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.im.core.i.a.a */
public final class C19709a extends AbstractC19927w<List<C19638h>> {

    /* renamed from: a */
    private long f46853a;

    /* renamed from: b */
    private boolean f46854b;

    static {
        Covode.recordClassIndex(22553);
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31644a() {
        return true;
    }

    public C19709a(AbstractC19478a<List<C19638h>> aVar) {
        super(IMCMD.GET_STRANGER_CONVERSATION_LIST.getValue(), aVar);
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        if (kVar.f47482f.body == null || kVar.f47482f.body.get_stranger_conversation_body == null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final void mo31129a(C19978k kVar, Runnable runnable) {
        final long j;
        final boolean z;
        int i = 0;
        if (!kVar.mo31869l() || !mo31130a(kVar)) {
            C19510e.m36435a(kVar, false).mo31165a();
            mo31803b(kVar);
            return;
        }
        GetStrangerConversationListResponseBody getStrangerConversationListResponseBody = kVar.f47482f.body.get_stranger_conversation_body;
        final List<StrangerConversation> list = getStrangerConversationListResponseBody.conversation_list;
        if (getStrangerConversationListResponseBody.next_cursor != null) {
            j = getStrangerConversationListResponseBody.next_cursor.longValue();
        } else {
            j = -1;
        }
        if (getStrangerConversationListResponseBody.has_more == null || !getStrangerConversationListResponseBody.has_more.booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        final int intValue = kVar.f47482f.inbox_type.intValue();
        if (this.f46854b) {
            if (getStrangerConversationListResponseBody.total_unread != null) {
                i = getStrangerConversationListResponseBody.total_unread.intValue();
            }
            C19512f.m36457b("imsdk", "StrangerConversationHandler get totalUnread:".concat(String.valueOf(i)), (Throwable) null);
            C19730f a = C19730f.m36907a();
            C19512f.m36457b("imsdk", "StrangerManager setTotalUnread:".concat(String.valueOf(i)), (Throwable) null);
            a.f46890d = i;
        }
        if (list == null || list.isEmpty()) {
            C19512f.m36457b("imsdk", "StrangerConversationHandler handleResponse list empty", (Throwable) null);
            mo31801a(null, j, z);
        } else {
            RunnableC19987d.m37728a(new AbstractC19986c<List<C19638h>>() {
                /* class com.bytedance.p1399im.core.p1417i.p1418a.C19709a.C197101 */

                static {
                    Covode.recordClassIndex(22554);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
                /* renamed from: a */
                public final /* synthetic */ List<C19638h> mo31187a() {
                    long j;
                    String str;
                    C19538ai aiVar;
                    long j2;
                    long j3;
                    long j4;
                    int i;
                    long j5;
                    int i2;
                    long j6;
                    long j7;
                    long j8;
                    long j9;
                    ArrayList arrayList = new ArrayList();
                    C19512f.m36457b("imsdk", "StrangerConversationHandler saveStrangerConversation start:" + list.size(), (Throwable) null);
                    for (StrangerConversation strangerConversation : list) {
                        int i3 = intValue;
                        if (strangerConversation != null && !TextUtils.isEmpty(strangerConversation.conversation_id)) {
                            C19512f.m36457b("imsdk", "IMConversationDao saveStrangerConversation:" + strangerConversation.conversation_id + ", inbox:" + i3, (Throwable) null);
                            int i4 = 0;
                            C19638h a = C19749c.m36999a(strangerConversation.conversation_id, false);
                            C19598aw a2 = C19821ai.m37325a(strangerConversation.last_message, true, (Pair<String, String>) null, 1);
                            if (a == null) {
                                C19512f.m36457b("imsdk", "IMConversationDao strangerConversation is new, insert", (Throwable) null);
                                a = new C19638h();
                                a.setConversationId(strangerConversation.conversation_id);
                                if (strangerConversation.conversation_short_id != null) {
                                    j = strangerConversation.conversation_short_id.longValue();
                                } else {
                                    j = 0;
                                }
                                a.setConversationShortId(j);
                                a.setConversationType(C19489e.AbstractC19490a.f46180a);
                                a.setMemberCount(2);
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(Long.valueOf(C19483d.m36365a().f46157b.mo27953a()));
                                arrayList2.add(Long.valueOf(C19656k.m36718a(strangerConversation.conversation_id)));
                                a.setMemberIds(arrayList2);
                                a.setIsMember(true);
                                a.setInboxType(i3);
                                MessageBody messageBody = strangerConversation.last_message;
                                if (messageBody == null) {
                                    aiVar = null;
                                } else {
                                    if (messageBody.ext == null || !messageBody.ext.containsKey("s:client_message_id") || TextUtils.isEmpty(messageBody.ext.get("s:client_message_id"))) {
                                        str = "";
                                    } else {
                                        str = messageBody.ext.get("s:client_message_id");
                                    }
                                    aiVar = new C19538ai();
                                    aiVar.setUuid(str);
                                    if (messageBody.server_message_id != null) {
                                        j2 = messageBody.server_message_id.longValue();
                                    } else {
                                        j2 = 0;
                                    }
                                    aiVar.setMsgId(j2);
                                    aiVar.setSecSender(messageBody.sec_sender);
                                    if (messageBody.sender != null) {
                                        j3 = messageBody.sender.longValue();
                                    } else {
                                        j3 = 0;
                                    }
                                    aiVar.setSender(j3);
                                    if (messageBody.create_time != null) {
                                        j4 = messageBody.create_time.longValue();
                                    } else {
                                        j4 = 0;
                                    }
                                    aiVar.setCreatedAt(j4);
                                    if (messageBody.message_type != null) {
                                        i = messageBody.message_type.intValue();
                                    } else {
                                        i = 0;
                                    }
                                    aiVar.setMsgType(i);
                                    aiVar.setConversationId(messageBody.conversation_id);
                                    if (messageBody.conversation_short_id != null) {
                                        j5 = messageBody.conversation_short_id.longValue();
                                    } else {
                                        j5 = 0;
                                    }
                                    aiVar.setConversationShortId(j5);
                                    if (messageBody.conversation_type != null) {
                                        i2 = messageBody.conversation_type.intValue();
                                    } else {
                                        i2 = 0;
                                    }
                                    aiVar.setConversationType(i2);
                                    aiVar.setContent(messageBody.content);
                                    if (C19483d.m36365a().mo31141b().f46192A) {
                                        aiVar = C19994c.m37743b(aiVar);
                                    }
                                    aiVar.setDeleted(0);
                                    aiVar.setMsgStatus(5);
                                    if (messageBody.index_in_conversation != null) {
                                        j6 = messageBody.index_in_conversation.longValue();
                                    } else {
                                        j6 = 0;
                                    }
                                    aiVar.setIndex(j6);
                                    if (messageBody.order_in_conversation != null) {
                                        j7 = messageBody.order_in_conversation.longValue();
                                    } else {
                                        j7 = 0;
                                    }
                                    aiVar.setOrderIndex(j7);
                                    if (messageBody.index_in_conversation_v2 != null) {
                                        j8 = messageBody.index_in_conversation_v2.longValue();
                                    } else {
                                        j8 = 0;
                                    }
                                    aiVar.setIndexInConversationV2(j8);
                                    if (messageBody.status != null) {
                                        i4 = messageBody.status.intValue();
                                    }
                                    aiVar.setSvrStatus(i4);
                                    aiVar.updatePropertyFromServer(messageBody);
                                    if (messageBody.version != null) {
                                        j9 = messageBody.version.longValue();
                                    } else {
                                        j9 = 0;
                                    }
                                    aiVar.setVersion(j9);
                                    aiVar.setExt(messageBody.ext);
                                    aiVar.setReadStatus(1);
                                    aiVar.setSenderInfo(C19997f.m37763a(messageBody.user_profile));
                                }
                                a.setLastMessage(aiVar);
                                a.setLastMessageIndex(aiVar.getIndex());
                                a.setLastMessageOrderIndex(aiVar.getOrderIndex());
                                a.setMaxIndexV2(aiVar.getIndexInConversationV2());
                                if (strangerConversation.badge_count != null) {
                                    a.setBadgeCount(strangerConversation.badge_count.intValue());
                                }
                                a.setUnreadCount((long) strangerConversation.unread.intValue());
                                a.setUpdatedTime(aiVar.getCreatedAt());
                                a.setHasMore(true);
                                a.setStranger(true);
                                a.setSingleChatMembers(C19997f.m37768a(strangerConversation.conversation_id, strangerConversation.participants));
                                C19737g.m36929a(a, strangerConversation);
                                if (!(a2 == null || a2.f46543a == null)) {
                                    C19737g.m36928a(a, a2.f46543a);
                                }
                                C19749c.m37007a(a);
                            } else {
                                C19512f.m36457b("imsdk", "IMConversationDao strangerConversation already exist, update", (Throwable) null);
                                C19737g.m36928a(a, C19777i.m37203h(a.getConversationId()));
                                a.setUnreadCount((long) strangerConversation.unread.intValue());
                                a.setStranger(true);
                                C19737g.m36929a(a, strangerConversation);
                                C19749c.m37008a(a, true);
                            }
                            arrayList.add(a);
                        }
                    }
                    C19512f.m36457b("imsdk", "StrangerConversationHandler saveStrangerConversation end:" + arrayList.size(), (Throwable) null);
                    return arrayList;
                }
            }, new AbstractC19985b<List<C19638h>>() {
                /* class com.bytedance.p1399im.core.p1417i.p1418a.C19709a.C197112 */

                static {
                    Covode.recordClassIndex(22555);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo31188a(List<C19638h> list) {
                    C19709a.this.mo31801a(list, j, z);
                }
            });
        }
        C19510e.m36435a(kVar, true).mo31165a();
    }

    /* renamed from: a */
    public final void mo31658a(int i, long j, long j2, boolean z) {
        C19512f.m36457b("imsdk", "StrangerConversationHandler get, inbox:" + i + ", cursor:" + j + ", count:" + j2 + ", needTotalUnread:" + z, (Throwable) null);
        if (j2 <= 0) {
            j2 = 20;
        }
        this.f46853a = j;
        this.f46854b = z;
        mo31798a(i, new RequestBody.Builder().get_stranger_conversation_body(new GetStrangerConversationListRequestBody.Builder().count(Long.valueOf(j2)).cursor(Long.valueOf(j)).show_total_unread(Boolean.valueOf(z)).build()).build(), (AbstractC19977j) null, new Object[0]);
    }
}
