package com.bytedance.ies.p1208im.core.p1209a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.C17415a;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17443i;
import com.bytedance.p1399im.core.internal.p1419a.C19749c;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19478a;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.p1399im.core.p1417i.AbstractC19719c;
import com.bytedance.p1399im.core.p1417i.C19721e;
import com.bytedance.p1399im.core.p1417i.C19730f;
import com.bytedance.p1399im.core.p1417i.p1418a.C19709a;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.im.core.a.g */
public final class C17413g extends AbstractC17443i {

    /* renamed from: b */
    public static final C17414a f41770b = new C17414a((byte) 0);

    /* renamed from: c */
    private final C19721e f41771c = new C19721e();

    static {
        Covode.recordClassIndex(19900);
    }

    /* renamed from: com.bytedance.ies.im.core.a.g$a */
    public static final class C17414a {
        static {
            Covode.recordClassIndex(19901);
        }

        private C17414a() {
        }

        public /* synthetic */ C17414a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17443i
    /* renamed from: a */
    public final boolean mo27783a() {
        return this.f41771c.f46873d;
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17443i
    /* renamed from: b */
    public final void mo27784b() {
        this.f41771c.f46872c = null;
        C19730f.m36907a().f46888b = null;
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17443i
    /* renamed from: c */
    public final void mo27785c() {
        if (this.f41771c.f46873d) {
            C17415a.m32255b().mo27838c("StrangerConversationModel", "refresh loading now");
            return;
        }
        C19721e eVar = this.f41771c;
        C19512f.m36457b("imsdk", "StrangerListModel refresh: " + eVar.f46873d, (Throwable) null);
        if (eVar.f46873d) {
            C19512f.m36457b("imsdk", "StrangerListModel refresh loading now", (Throwable) null);
            return;
        }
        eVar.f46873d = true;
        RunnableC19987d.m37728a(new AbstractC19986c<List<C19638h>>() {
            /* class com.bytedance.p1399im.core.p1417i.C19721e.C197221 */

            static {
                Covode.recordClassIndex(22566);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ List<C19638h> mo31187a() {
                return C19749c.m37002a(C19730f.f46886a, C19721e.f46870a);
            }
        }, new AbstractC19985b<List<C19638h>>() {
            /* class com.bytedance.p1399im.core.p1417i.C19721e.C197232 */

            static {
                Covode.recordClassIndex(22567);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
            /* renamed from: a */
            public final /* synthetic */ void mo31188a(List<C19638h> list) {
                Integer valueOf;
                List<C19638h> list2 = list;
                C19721e eVar = C19721e.this;
                StringBuilder sb = new StringBuilder("StrangerListModel onQueryConversation:");
                if (list2 == null) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(list2.size());
                }
                C19512f.m36457b("imsdk", sb.append(valueOf).append(", ").append(eVar.f46874e).append(", ").append(eVar.f46871b.size()).toString(), (Throwable) null);
                if (eVar.f46874e || !eVar.f46871b.isEmpty()) {
                    C19512f.m36457b("imsdk", "StrangerListModel onQueryConversation: already refreshed", (Throwable) null);
                    return;
                }
                eVar.f46871b.clear();
                eVar.mo31670a(list2);
                if (eVar.f46872c != null) {
                    eVar.f46872c.mo31663a(list2);
                }
            }
        });
        new C19709a(new AbstractC19478a<List<C19638h>>() {
            /* class com.bytedance.p1399im.core.p1417i.C19721e.C197243 */

            static {
                Covode.recordClassIndex(22568);
            }

            @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
            /* renamed from: a */
            public final void mo27860a(C19672u uVar) {
                C19512f.m36457b("imsdk", "StrangerListModel refresh onFailure", (Throwable) null);
                C19721e.this.f46874e = true;
                C19721e.this.f46873d = false;
                C19721e eVar = C19721e.this;
                C19512f.m36457b("imsdk", "StrangerListModel onRefreshFailed", (Throwable) null);
                if (eVar.f46872c != null) {
                    eVar.f46872c.mo31662a(uVar);
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, long, boolean] */
            @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19478a
            /* renamed from: a */
            public final /* synthetic */ void mo31135a(List<C19638h> list, long j, boolean z) {
                C19512f.m36457b("imsdk", "StrangerListModel refresh onSuccess, nextCursor:" + j + ", hasMore:" + z, (Throwable) null);
                C19721e.this.f46876g = j;
                C19721e.this.f46875f = z;
                C19721e.this.f46873d = false;
                RunnableC19987d.m37728a(new AbstractC19986c<List<C19638h>>() {
                    /* class com.bytedance.p1399im.core.p1417i.C19721e.C197243.C197251 */

                    static {
                        Covode.recordClassIndex(22569);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
                    /* renamed from: a */
                    public final /* bridge */ /* synthetic */ List<C19638h> mo31187a() {
                        return C19749c.m37002a(C19730f.f46886a, C19721e.f46870a);
                    }
                }, new AbstractC19985b<List<C19638h>>() {
                    /* class com.bytedance.p1399im.core.p1417i.C19721e.C197243.C197262 */

                    static {
                        Covode.recordClassIndex(22570);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
                    /* renamed from: a */
                    public final /* synthetic */ void mo31188a(List<C19638h> list) {
                        Integer valueOf;
                        List<C19638h> list2 = list;
                        C19721e eVar = C19721e.this;
                        StringBuilder sb = new StringBuilder("StrangerListModel onRefreshConversation:");
                        if (list2 == null) {
                            valueOf = null;
                        } else {
                            valueOf = Integer.valueOf(list2.size());
                        }
                        C19512f.m36457b("imsdk", sb.append(valueOf).toString(), (Throwable) null);
                        eVar.f46871b.clear();
                        eVar.mo31670a(list2);
                        if (eVar.f46872c != null) {
                            eVar.f46872c.mo31664a(list2, eVar.f46875f);
                        }
                        C19721e.this.f46874e = true;
                    }
                });
            }
        }).mo31658a(C19730f.f46886a, 0L, (long) C19721e.f46870a, false);
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17443i
    /* renamed from: d */
    public final void mo27786d() {
        if (this.f41771c.f46873d) {
            C17415a.m32255b().mo27838c("StrangerConversationModel", "loadMore loading now");
            return;
        }
        C19721e eVar = this.f41771c;
        C19512f.m36457b("imsdk", "StrangerListModel loadMore, mFirstPageFetched:" + eVar.f46874e + ", mHasMore:" + eVar.f46875f, (Throwable) null);
        if (!eVar.f46874e) {
            C19512f.m36457b("imsdk", "StrangerListModel loadMore un refresh", (Throwable) null);
        } else if (eVar.f46873d) {
            C19512f.m36457b("imsdk", "StrangerListModel loadMore loading now", (Throwable) null);
        } else {
            eVar.f46873d = true;
            if (!eVar.f46875f) {
                eVar.mo31667a();
            } else {
                new C19709a(new AbstractC19478a<List<C19638h>>() {
                    /* class com.bytedance.p1399im.core.p1417i.C19721e.C197274 */

                    static {
                        Covode.recordClassIndex(22571);
                    }

                    @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                    /* renamed from: a */
                    public final void mo27860a(C19672u uVar) {
                        C19512f.m36457b("imsdk", "StrangerListModel loadMore onFailure", (Throwable) null);
                        C19721e.this.mo31667a();
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, long, boolean] */
                    @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19478a
                    /* renamed from: a */
                    public final /* synthetic */ void mo31135a(List<C19638h> list, long j, boolean z) {
                        C19512f.m36457b("imsdk", "StrangerListModel loadMore onSuccess, nextCursor:" + j + ", hasMore:" + z, (Throwable) null);
                        C19721e.this.f46876g = j;
                        C19721e.this.f46875f = z;
                        C19721e.this.mo31667a();
                    }
                }).mo31658a(C19730f.f46886a, eVar.f46876g, (long) C19721e.f46870a, false);
            }
        }
    }

    @Override // com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17443i
    /* renamed from: a */
    public final void mo27782a(AbstractC19719c cVar) {
        C89219l.m154721d(cVar, "");
        C19721e eVar = this.f41771c;
        eVar.f46872c = cVar;
        C19730f.m36907a().f46888b = eVar;
    }
}
