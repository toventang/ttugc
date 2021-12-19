package com.bytedance.ies.p1208im.core.p1209a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17422a;
import com.bytedance.ies.p1208im.core.api.p1215e.C17453a;
import com.bytedance.ies.p1208im.core.p1226g.C17583c;
import com.bytedance.p1399im.core.internal.p1419a.C19749c;
import com.bytedance.p1399im.core.internal.p1427b.C19786a;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19885i;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19930x;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1404a.C19489e;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19478a;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19480c;
import com.bytedance.p1399im.core.p1406b.C19505b;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19640j;
import com.bytedance.p1399im.core.p1408d.C19656k;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.p1399im.core.p1417i.C19730f;
import com.bytedance.p1399im.core.proto.SortType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.im.core.a.a */
public final class C17397a extends AbstractC17420a {

    /* renamed from: b */
    public static final C17397a f41738b = new C17397a();

    private C17397a() {
    }

    static {
        Covode.recordClassIndex(19884);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a
    /* renamed from: a */
    public final List<C19638h> mo27721a() {
        C19640j a = C19640j.m36671a();
        C89219l.m154716b(a, "");
        return C89070n.m154590j(a.mo31599c().values());
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a
    /* renamed from: a */
    public final C19638h mo27720a(String str) {
        if (str == null) {
            return null;
        }
        return C19640j.m36671a().mo31586a(str);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a
    /* renamed from: c */
    public final void mo27731c(String str) {
        C89219l.m154721d(str, "");
        C19640j.m36671a();
        C19640j.m36675b(str);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a
    /* renamed from: d */
    public final boolean mo27733d(String str) {
        C89219l.m154721d(str, "");
        if (str != null) {
            return C17583c.m32618b().mo28008a(str);
        }
        return false;
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a
    /* renamed from: b */
    public final C19638h mo27728b(String str) {
        C19640j a = C19640j.m36671a();
        C19512f.m36457b("imsdk", "ConversationListModel getConversation async", (Throwable) null);
        C19638h a2 = a.mo31586a(str);
        if (a2 == null && (a2 = C19749c.m36999a(str, true)) != null) {
            if (a2.isStranger()) {
                C19730f.m36907a().mo31680b(a2);
            } else if (!C19505b.m36410b() || !C19505b.m36409a().mo31160b(a2)) {
                a.mo31595a(a2);
            }
        }
        return a2;
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a
    /* renamed from: a */
    public final void mo27723a(AbstractC17422a aVar) {
        C89219l.m154721d(aVar, "");
        C19640j.m36671a().mo31591a(aVar);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a
    /* renamed from: b */
    public final void mo27729b(AbstractC17422a aVar) {
        C89219l.m154721d(aVar, "");
        C19640j a = C19640j.m36671a();
        if (aVar != null) {
            C19512f.m36457b("imsdk", "ConversationListModel removeObserver:".concat(String.valueOf(aVar)), (Throwable) null);
            a.f46668e.remove(aVar);
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a
    /* renamed from: a */
    public final void mo27726a(List<String> list) {
        C89219l.m154721d(list, "");
        C19640j a = C19640j.m36671a();
        if (!(a.f46664a.isEmpty() || list == null || list.isEmpty())) {
            for (String str : list) {
                C19638h hVar = a.f46664a.get(str);
                C19512f.m36457b("imsdk", "updateConversationListInfo - ".concat(String.valueOf(str)), (Throwable) null);
                if (hVar != null) {
                    C19786a.m37232a(hVar.getInboxType(), str, hVar.getConversationShortId(), hVar.getConversationType(), hVar.getUpdatedTime());
                }
            }
            C19786a.m37234a(false);
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a
    /* renamed from: c */
    public final void mo27732c(String str, AbstractC19479b<String> bVar) {
        C89219l.m154721d(str, "");
        C19640j.m36671a();
        C19930x.m37536a();
        if (TextUtils.isEmpty(str)) {
            C19512f.m36457b("imsdk", "DeleteConversationHandler delete, cid invalid", (Throwable) null);
        } else {
            C19640j.m36671a().mo31598b(str, new AbstractC19479b<C19638h>(bVar, str) {
                /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19888j.C198891 */

                /* renamed from: a */
                final /* synthetic */ AbstractC19479b f47231a;

                /* renamed from: b */
                final /* synthetic */ String f47232b;

                /* renamed from: c */
                final /* synthetic */ boolean f47233c = false;

                static {
                    Covode.recordClassIndex(22733);
                }

                @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                /* renamed from: a */
                public final void mo27860a(C19672u uVar) {
                    C19512f.m36457b("imsdk", "DeleteConversationHandler delete, getConversation failed, error:".concat(String.valueOf(uVar)), (Throwable) null);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                /* renamed from: a */
                public final /* synthetic */ void mo27861a(C19638h hVar) {
                    String str;
                    boolean z;
                    C19638h hVar2 = hVar;
                    StringBuilder sb = new StringBuilder("DeleteConversationHandler delete, getConversation result:");
                    if (hVar2 != null) {
                        str = hVar2.getConversationId();
                    } else {
                        str = null;
                    }
                    C19512f.m36457b("imsdk", sb.append(str).toString(), (Throwable) null);
                    if (hVar2 == null || !hVar2.isStranger()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    C19888j jVar = new C19888j(z, this.f47231a);
                    String str2 = this.f47232b;
                    boolean z2 = this.f47233c;
                    C19512f.m36457b("imsdk", "DeleteConversationHandler delete, cid:" + str2 + ", isLocal:" + z2 + ", isStranger:" + jVar.f47225a, (Throwable) null);
                    C19638h a = C19640j.m36671a().mo31586a(str2);
                    if (a == null) {
                        jVar.mo31803b(C19978k.m37686a(-1017));
                    } else if (!jVar.f47225a) {
                        jVar.mo31775a(a);
                        if (!z2 && !a.isTemp()) {
                            jVar.mo31777b(a);
                        }
                    } else if (!z2) {
                        jVar.mo31777b(a);
                    } else {
                        jVar.mo31775a(a);
                    }
                }

                {
                    this.f47231a = r2;
                    this.f47232b = r3;
                }
            });
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a
    /* renamed from: b */
    public final void mo27730b(String str, AbstractC19479b<C19638h> bVar) {
        C89219l.m154721d(str, "");
        long a = C17453a.m32405a(str, bVar);
        if (a > 0) {
            C19640j a2 = C19640j.m36671a();
            String a3 = C19656k.m36719a(a);
            if (a2.mo31586a(a3) == null) {
                C19638h hVar = new C19638h();
                hVar.setInboxType(0);
                hVar.setConversationId(a3);
                hVar.setConversationType(C19489e.AbstractC19490a.f46180a);
                hVar.setUpdatedTime(System.currentTimeMillis());
                hVar.setMemberCount(2);
                hVar.setIsMember(true);
                a2.mo31600c(hVar);
                RunnableC19987d.m37728a(new AbstractC19986c<C19638h>(hVar) {
                    /* class com.bytedance.p1399im.core.p1408d.C19640j.C196504 */

                    /* renamed from: a */
                    final /* synthetic */ C19638h f46687a;

                    static {
                        Covode.recordClassIndex(22494);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
                    /* renamed from: a */
                    public final /* bridge */ /* synthetic */ C19638h mo31187a() {
                        C19749c.m37007a(this.f46687a);
                        return null;
                    }

                    {
                        this.f46687a = r2;
                    }
                }, (AbstractC19985b) null);
            }
            C19930x.m37536a();
            C19885i iVar = new C19885i(bVar);
            ArrayList arrayList = new ArrayList();
            arrayList.add(Long.valueOf(C19483d.m36365a().f46157b.mo27953a()));
            arrayList.add(Long.valueOf(a));
            iVar.mo31774a(0, C19489e.AbstractC19490a.f46180a, arrayList, (Map<String, String>) null);
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a
    /* renamed from: a */
    public final void mo27725a(String str, AbstractC19479b<C19638h> bVar) {
        if (str == null || str.length() == 0) {
            bVar.mo27861a((C19638h) null);
        } else {
            C19640j.m36671a().mo31598b(str, bVar);
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a
    /* renamed from: a */
    public final void mo27727a(List<String> list, Map<String, String> map, AbstractC19480c<C19638h> cVar) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(map, "");
        List<Long> a = C17453a.m32407a(list);
        if (!a.isEmpty()) {
            C19640j.m36671a();
            C19930x.m37536a();
            C19885i iVar = new C19885i(cVar);
            if (!a.isEmpty()) {
                if (!a.contains(Long.valueOf(C19483d.m36365a().f46157b.mo27953a()))) {
                    a.add(0, Long.valueOf(C19483d.m36365a().f46157b.mo27953a()));
                }
                iVar.mo31774a(1, C19489e.AbstractC19490a.f46181b, a, map);
            }
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a
    /* renamed from: a */
    public final void mo27722a(long j, SortType sortType, Boolean bool, AbstractC19478a<List<C19638h>> aVar) {
        C19640j.m36671a().mo31588a(j, sortType, bool, aVar);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a
    /* renamed from: a */
    public final void mo27724a(String str, long j, int i, AbstractC19479b<C19638h> bVar) {
        C19930x.m37536a();
        C19930x.m37538a(1, str, j, i, bVar);
    }
}
