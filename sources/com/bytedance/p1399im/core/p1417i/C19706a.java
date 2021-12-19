package com.bytedance.p1399im.core.p1417i;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19546ak;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19672u;
import java.util.List;

/* renamed from: com.bytedance.im.core.i.a */
public final class C19706a extends C19546ak {
    static {
        Covode.recordClassIndex(22550);
    }

    /* renamed from: i */
    private boolean m36857i() {
        C19638h a = mo31307a();
        if (a == null || !a.isStranger()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.p1399im.core.p1408d.C19546ak
    /* renamed from: c */
    public final void mo31317c() {
        if (!m36857i()) {
            super.mo31317c();
        }
    }

    @Override // com.bytedance.p1399im.core.p1408d.C19546ak
    /* renamed from: b */
    public final void mo31311b() {
        if (m36857i()) {
            C19730f.m36907a().mo31678a(this.f46400a, new AbstractC19479b<List<C19538ai>>() {
                /* class com.bytedance.p1399im.core.p1417i.C19706a.C197071 */

                static {
                    Covode.recordClassIndex(22551);
                }

                @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                /* renamed from: a */
                public final void mo27860a(C19672u uVar) {
                    C19706a.super.mo31311b();
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo27861a(List<C19538ai> list) {
                    C19706a.super.mo31311b();
                }
            });
        } else {
            super.mo31311b();
        }
    }

    public C19706a(String str, boolean z) {
        super(str, z);
        C19512f.m36457b("imsdk", "ExtendMessageModel constructor, conversationId:".concat(String.valueOf(str)), (Throwable) null);
    }

    @Override // com.bytedance.p1399im.core.p1408d.C19546ak
    /* renamed from: a */
    public final void mo31309a(final int i, final String str, final AbstractC19479b bVar) {
        if (m36857i()) {
            C19730f.m36907a().mo31678a(this.f46400a, new AbstractC19479b<List<C19538ai>>() {
                /* class com.bytedance.p1399im.core.p1417i.C19706a.C197082 */

                static {
                    Covode.recordClassIndex(22552);
                }

                @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                /* renamed from: a */
                public final void mo27860a(C19672u uVar) {
                    C19706a.super.mo31309a((C19706a) i, (int) str, (String) bVar);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo27861a(List<C19538ai> list) {
                    C19706a.super.mo31309a((C19706a) i, (int) str, (String) bVar);
                }
            });
        } else {
            super.mo31309a(i, str, bVar);
        }
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19674v, com.bytedance.p1399im.core.p1408d.C19546ak
    /* renamed from: a */
    public final void mo27796a(List<C19538ai> list, int i, String str) {
        if (m36857i()) {
            C19730f a = C19730f.m36907a();
            String str2 = this.f46400a;
            C19538ai g = mo31321g();
            C19638h a2 = a.mo31672a(str2);
            if (!(a2 == null || g == null)) {
                C19512f.m36457b("imsdk", "StrangerManager updateLastMessage, cid:" + str2 + ", msgUuid:" + g.getUuid() + ", msgSvrId:" + g.getMsgId() + ", msgIndex:" + g.getIndex() + ", msgOrderIndex:" + g.getOrderIndex(), (Throwable) null);
                C19737g.m36928a(a2, g);
            }
        }
        super.mo27796a(list, i, str);
    }
}
