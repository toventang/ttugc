package com.bytedance.p1399im.core.internal.p1427b.p1428a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.C19749c;
import com.bytedance.p1399im.core.internal.p1419a.C19769e;
import com.bytedance.p1399im.core.internal.p1427b.C19786a;
import com.bytedance.p1399im.core.internal.p1431d.AbstractC19977j;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.internal.utils.C19997f;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1408d.C19537ah;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19640j;
import com.bytedance.p1399im.core.proto.ConversationParticipantsListRequestBody;
import com.bytedance.p1399im.core.proto.IMCMD;
import com.bytedance.p1399im.core.proto.ParticipantsPage;
import com.bytedance.p1399im.core.proto.RequestBody;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.b.a.ad */
public final class C19802ad extends AbstractC19927w<List<C19537ah>> {

    /* renamed from: a */
    public List<C19537ah> f47023a;

    /* renamed from: b */
    public boolean f47024b;

    static {
        Covode.recordClassIndex(22646);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31644a() {
        return true;
    }

    public C19802ad() {
        this(true);
    }

    public C19802ad(boolean z) {
        super(IMCMD.CONVERSATION_PARTICIPANTS_LIST.getValue(), null);
        this.f47023a = new ArrayList();
        this.f47024b = z;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        if (kVar.f47482f.body == null || kVar.f47482f.body.conversation_participants_body == null || kVar.f47482f.body.conversation_participants_body.participants_page == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final void mo31129a(final C19978k kVar, final Runnable runnable) {
        if (!kVar.mo31869l() || !mo31130a(kVar)) {
            mo31803b(kVar);
            runnable.run();
            C19510e.m36435a(kVar, false).mo31165a();
            return;
        }
        ParticipantsPage participantsPage = kVar.f47482f.body.conversation_participants_body.participants_page;
        final String str = (String) kVar.f47480d[0];
        this.f47023a.addAll(C19997f.m37768a(str, participantsPage.participants));
        if (participantsPage.has_more.booleanValue()) {
            mo31743a(str, participantsPage.cursor.longValue(), kVar.f47479c);
        } else {
            RunnableC19987d.m37728a(new AbstractC19986c<Pair<C19638h, List<C19537ah>>>() {
                /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19802ad.C198031 */

                static {
                    Covode.recordClassIndex(22647);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
                /* renamed from: a */
                public final /* synthetic */ Pair<C19638h, List<C19537ah>> mo31187a() {
                    int conversationType;
                    C19638h a = C19640j.m36671a().mo31586a(str);
                    C19769e.m37148d(str);
                    String str = str;
                    if (a == null) {
                        conversationType = -1;
                    } else {
                        conversationType = a.getConversationType();
                    }
                    C19769e.m37141a(str, conversationType, C19802ad.this.f47023a);
                    return new Pair(C19749c.m36999a(str, true), C19802ad.this.f47023a);
                }
            }, new AbstractC19985b<Pair<C19638h, List<C19537ah>>>() {
                /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19802ad.C198042 */

                static {
                    Covode.recordClassIndex(22648);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
                /* renamed from: a */
                public final /* synthetic */ void mo31188a(Pair<C19638h, List<C19537ah>> pair) {
                    Pair<C19638h, List<C19537ah>> pair2 = pair;
                    if (C19802ad.this.f47024b) {
                        if (pair2.first != null) {
                            C19640j.m36671a().mo31590a((C19638h) pair2.first, 7);
                        }
                        if (pair2.second != null && !((List) pair2.second).isEmpty()) {
                            C19640j.m36671a().mo31592a(str, (List) pair2.second);
                        }
                    }
                    C19786a.f46971g.remove(str);
                    C19802ad.this.mo31800a(pair2.second);
                    runnable.run();
                    C19510e.m36435a(kVar, true).mo31165a();
                }
            });
        }
    }

    /* renamed from: a */
    public final long mo31743a(String str, long j, AbstractC19977j jVar) {
        if (C19786a.m37239b(str)) {
            return -1;
        }
        C19786a.m37241c(str);
        C19638h a = C19640j.m36671a().mo31586a(str);
        if (a == null) {
            return -1;
        }
        RequestBody build = new RequestBody.Builder().conversation_participants_body(new ConversationParticipantsListRequestBody.Builder().conversation_id(str).conversation_short_id(Long.valueOf(a.getConversationShortId())).conversation_type(Integer.valueOf(a.getConversationType())).cursor(Long.valueOf(j)).build()).build();
        return mo31798a(a.getInboxType(), build, jVar, str, Long.valueOf(j));
    }
}
