package com.bytedance.p1399im.core.internal.p1427b.p1428a;

import android.content.ContentValues;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.C19743b;
import com.bytedance.p1399im.core.internal.p1419a.C19749c;
import com.bytedance.p1399im.core.internal.p1419a.C19769e;
import com.bytedance.p1399im.core.internal.p1419a.C19773g;
import com.bytedance.p1399im.core.internal.p1419a.p1420a.C19742b;
import com.bytedance.p1399im.core.internal.p1419a.p1421b.C19745a;
import com.bytedance.p1399im.core.internal.p1431d.AbstractC19977j;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.internal.utils.C19997f;
import com.bytedance.p1399im.core.internal.utils.C20002j;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1404a.C19489e;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1407c.C19509d;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19640j;
import com.bytedance.p1399im.core.p1408d.C19664m;
import com.bytedance.p1399im.core.p1415g.C19699c;
import com.bytedance.p1399im.core.p1417i.C19737g;
import com.bytedance.p1399im.core.proto.ConversationOperationStatus;
import com.bytedance.p1399im.core.proto.CreateConversationV2RequestBody;
import com.bytedance.p1399im.core.proto.CreateConversationV2ResponseBody;
import com.bytedance.p1399im.core.proto.IMCMD;
import com.bytedance.p1399im.core.proto.RequestBody;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.bytedance.im.core.internal.b.a.i */
public final class C19885i extends AbstractC19927w<C19638h> {

    /* renamed from: a */
    public final C19664m f47217a = new C19664m();

    static {
        Covode.recordClassIndex(22729);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31644a() {
        return true;
    }

    C19885i() {
        super(IMCMD.CREATE_CONVERSATION_V2.getValue());
    }

    public C19885i(AbstractC19479b<C19638h> bVar) {
        super(IMCMD.CREATE_CONVERSATION_V2.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        if (kVar.f47482f.body == null || kVar.f47482f.body.create_conversation_v2_body == null || kVar.f47482f.body.create_conversation_v2_body.status == null || kVar.f47482f.body.create_conversation_v2_body.status.intValue() != ConversationOperationStatus.OP_SUCCEED.getValue() || kVar.f47482f.body.create_conversation_v2_body.conversation == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final void mo31129a(final C19978k kVar, final Runnable runnable) {
        this.f47217a.f46719c = SystemClock.uptimeMillis();
        C19664m mVar = this.f47217a;
        mVar.f46720d = mVar.f46719c - this.f47217a.f46718b;
        if (!kVar.mo31869l() || !mo31130a(kVar)) {
            mo31803b(kVar);
            runnable.run();
            C19510e.m36435a(kVar, false).mo31165a();
            return;
        }
        final CreateConversationV2ResponseBody createConversationV2ResponseBody = kVar.f47482f.body.create_conversation_v2_body;
        RunnableC19987d.m37728a(new AbstractC19986c<C19638h>() {
            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19885i.C198861 */

            static {
                Covode.recordClassIndex(22730);
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public C19638h mo31187a() {
                boolean z;
                int i;
                boolean z2;
                C19885i.this.f47217a.f46722f = SystemClock.uptimeMillis();
                C19885i.this.f47217a.f46721e = C19885i.this.f47217a.f46722f - C19885i.this.f47217a.f46719c;
                C19638h hVar = null;
                try {
                    C19742b.m36974a("CreateConversationHandler saveConversation");
                    C19638h a = C19749c.m36999a(createConversationV2ResponseBody.conversation.conversation_id, true);
                    if (a != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String str = createConversationV2ResponseBody.conversation.conversation_id;
                    if (createConversationV2ResponseBody.conversation.conversation_type == null) {
                        i = -1;
                    } else {
                        i = createConversationV2ResponseBody.conversation.conversation_type.intValue();
                    }
                    C19769e.m37141a(str, i, C19997f.m37768a(createConversationV2ResponseBody.conversation.conversation_id, createConversationV2ResponseBody.conversation.first_page_participants.participants));
                    C19638h a2 = C19997f.m37764a(kVar.f47482f.inbox_type.intValue(), a, createConversationV2ResponseBody.conversation, System.currentTimeMillis());
                    a2.setUpdatedTime(System.currentTimeMillis());
                    C19737g.m36927a(a2);
                    if (z) {
                        z2 = C19749c.m37008a(a2, true);
                    } else if (TextUtils.isEmpty(a2.getConversationId())) {
                        z2 = false;
                    } else {
                        C20002j.m37782c("IMConversationDao insertConversation:" + a2.getConversationId());
                        long currentTimeMillis = System.currentTimeMillis();
                        ContentValues f = C19749c.m37027f(a2);
                        if (a2.getCoreInfo() != null) {
                            C19743b.m36987a(a2.getCoreInfo());
                        }
                        if (a2.getSettingInfo() != null) {
                            C19773g.m37163a(a2.getSettingInfo());
                        }
                        if (C19742b.m36978b("conversation_list", f) >= 0) {
                            z2 = true;
                            C19745a.m36988a();
                            C19483d.m36365a();
                        } else {
                            z2 = false;
                        }
                        C19699c.m36829a().mo31653a("insertConversation", currentTimeMillis);
                    }
                    C19512f.m36457b("imsdk", "CreateConversationHandler hasLocal = " + z + " result = " + z2, (Throwable) null);
                    C19742b.m36975a("CreateConversationHandler saveConversation", true);
                    if (z2) {
                        hVar = a2;
                    }
                } catch (Exception e) {
                    C19512f.m36457b("imsdk", "CreateConversationHandler saveConversation", e);
                    C19742b.m36975a("CreateConversationHandler saveConversation", false);
                }
                C19885i.this.f47217a.f46723g = SystemClock.uptimeMillis();
                C19885i.this.f47217a.f46724h = C19885i.this.f47217a.f46723g - C19885i.this.f47217a.f46722f;
                return hVar;
            }
        }, new AbstractC19985b<C19638h>() {
            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19885i.C198872 */

            static {
                Covode.recordClassIndex(22731);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
            /* renamed from: a */
            public final /* synthetic */ void mo31188a(C19638h hVar) {
                C19638h hVar2 = hVar;
                C19885i.this.f47217a.f46726j = SystemClock.uptimeMillis();
                C19885i.this.f47217a.f46725i = C19885i.this.f47217a.f46726j - C19885i.this.f47217a.f46723g;
                C19885i.this.f47217a.f46727k = C19885i.this.f47217a.f46726j - C19885i.this.f47217a.f46717a;
                if (hVar2 != null) {
                    C19640j.m36671a().mo31600c(hVar2);
                    C19885i.this.mo31802a(hVar2, kVar);
                } else {
                    C19885i.this.mo31803b(C19978k.m37686a(-3001));
                }
                runnable.run();
                C19510e.m36435a(kVar, true).mo31164a("conversation_id", createConversationV2ResponseBody.conversation.conversation_id).mo31164a("conversation_type", createConversationV2ResponseBody.conversation.conversation_type).mo31164a("total_count", createConversationV2ResponseBody.conversation.participants_count).mo31165a();
                C19509d dVar = new C19509d();
                dVar.f46304a = "cost";
                dVar.f46305b = "create_conversation";
                dVar.mo31164a("network_time", Long.valueOf(C19885i.this.f47217a.f46720d)).mo31164a("sub_ts_time", Long.valueOf(C19885i.this.f47217a.f46721e)).mo31164a("on_run_time", Long.valueOf(C19885i.this.f47217a.f46724h)).mo31164a("main_ts_time", Long.valueOf(C19885i.this.f47217a.f46725i)).mo31164a("whole_time", Long.valueOf(C19885i.this.f47217a.f46727k)).mo31165a();
            }
        });
    }

    /* renamed from: a */
    public final long mo31774a(int i, int i2, List<Long> list, Map<String, String> map) {
        return m37418a(i, i2, list, null, map, null);
    }

    /* renamed from: a */
    private long m37418a(int i, int i2, List<Long> list, String str, Map<String, String> map, AbstractC19977j jVar) {
        String uuid;
        CreateConversationV2RequestBody build;
        this.f47217a.f46717a = SystemClock.uptimeMillis();
        if (list.contains(-1L)) {
            mo31803b(C19978k.m37686a(-1015));
            return -1;
        }
        CreateConversationV2RequestBody.Builder participants = new CreateConversationV2RequestBody.Builder().conversation_type(Integer.valueOf(i2)).participants(list);
        if (map != null) {
            participants.biz_ext(map);
        }
        if (!TextUtils.isEmpty(null)) {
            participants.name(null);
        }
        if (!TextUtils.isEmpty(null)) {
            participants.avatar_url(null);
        }
        if (!TextUtils.isEmpty(null)) {
            participants.description(null);
        }
        if (i2 == C19489e.AbstractC19490a.f46180a) {
            build = participants.build();
        } else {
            boolean z = !TextUtils.isEmpty(null);
            CreateConversationV2RequestBody.Builder persistent = participants.persistent(Boolean.valueOf(z));
            if (z) {
                uuid = null;
            } else {
                uuid = UUID.randomUUID().toString();
            }
            build = persistent.idempotent_id(uuid).build();
        }
        RequestBody build2 = new RequestBody.Builder().create_conversation_v2_body(build).build();
        this.f47217a.f46718b = SystemClock.uptimeMillis();
        return mo31798a(i, build2, (AbstractC19977j) null, new Object[0]);
    }
}
