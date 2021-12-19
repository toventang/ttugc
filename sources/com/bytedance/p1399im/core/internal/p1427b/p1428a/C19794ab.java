package com.bytedance.p1399im.core.internal.p1427b.p1428a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.C19749c;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19640j;
import com.bytedance.p1399im.core.proto.IMCMD;

/* renamed from: com.bytedance.im.core.internal.b.a.ab */
public final class C19794ab extends AbstractC19927w<String> {
    static {
        Covode.recordClassIndex(22638);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final boolean mo31130a(C19978k kVar) {
        return true;
    }

    C19794ab() {
        super(IMCMD.LEAVE_CONVERSATION.getValue());
    }

    public C19794ab(AbstractC19479b<String> bVar) {
        super(IMCMD.LEAVE_CONVERSATION.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.p1399im.core.internal.p1427b.p1428a.AbstractC19927w
    /* renamed from: a */
    public final void mo31129a(final C19978k kVar, final Runnable runnable) {
        final String str = (String) kVar.f47480d[0];
        final boolean booleanValue = ((Boolean) kVar.f47480d[1]).booleanValue();
        if (kVar.mo31869l()) {
            RunnableC19987d.m37728a(new AbstractC19986c<Boolean>() {
                /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19794ab.C197951 */

                static {
                    Covode.recordClassIndex(22639);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
                /* renamed from: a */
                public final /* synthetic */ Boolean mo31187a() {
                    C19749c.m37026e(str);
                    return true;
                }
            }, new AbstractC19985b<Boolean>() {
                /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19794ab.C197962 */

                static {
                    Covode.recordClassIndex(22640);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
                /* renamed from: a */
                public final /* synthetic */ void mo31188a(Boolean bool) {
                    if (bool.booleanValue()) {
                        C19638h a = C19640j.m36671a().mo31586a(str);
                        C19640j.m36671a().mo31597b(a);
                        if (a != null && booleanValue) {
                            new C19888j().mo31777b(a);
                        }
                        C19794ab.this.mo31800a(str);
                    }
                    runnable.run();
                    C19510e.m36435a(kVar, true).mo31164a("conversation_id", str).mo31165a();
                }
            });
            return;
        }
        mo31803b(kVar);
        runnable.run();
        C19510e.m36435a(kVar, false).mo31164a("conversation_id", str).mo31165a();
    }
}
