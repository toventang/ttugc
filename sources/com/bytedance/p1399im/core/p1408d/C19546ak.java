package com.bytedance.p1399im.core.p1408d;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.C19771f;
import com.bytedance.p1399im.core.internal.p1419a.C19777i;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19797ac;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19808af;
import com.bytedance.p1399im.core.internal.p1427b.p1428a.C19930x;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b;
import com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c;
import com.bytedance.p1399im.core.internal.p1434e.C19983a;
import com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d;
import com.bytedance.p1399im.core.internal.utils.C19996e;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.bytedance.p1399im.core.internal.utils.C20009m;
import com.bytedance.p1399im.core.internal.utils.C20010n;
import com.bytedance.p1399im.core.internal.utils.C20014q;
import com.bytedance.p1399im.core.internal.utils.C20041s;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1404a.C19489e;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1407c.C19509d;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.proto.MessageDirection;
import com.bytedance.p1399im.core.proto.MessagesInConversationRequestBody;
import com.bytedance.p1399im.core.proto.ParticipantMinIndex;
import com.bytedance.p1399im.core.proto.RequestBody;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.im.core.d.ak */
public class C19546ak implements AbstractC19671t, AbstractC19674v, AbstractC19676x {

    /* renamed from: q */
    public static Comparator f46399q = new Comparator<C19538ai>() {
        /* class com.bytedance.p1399im.core.p1408d.C19546ak.C195471 */

        static {
            Covode.recordClassIndex(22391);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(C19538ai aiVar, C19538ai aiVar2) {
            C19538ai aiVar3 = aiVar;
            C19538ai aiVar4 = aiVar2;
            if (aiVar3.getOrderIndex() < aiVar4.getOrderIndex()) {
                return -1;
            }
            if (aiVar3.getOrderIndex() == aiVar4.getOrderIndex()) {
                return 0;
            }
            return 1;
        }
    };

    /* renamed from: a */
    public String f46400a;

    /* renamed from: b */
    public C20009m f46401b = new C20009m();

    /* renamed from: c */
    public int f46402c = 50;

    /* renamed from: d */
    public AbstractC19674v f46403d;

    /* renamed from: e */
    public AbstractC19676x f46404e;

    /* renamed from: f */
    public boolean f46405f = true;

    /* renamed from: g */
    public boolean f46406g = true;

    /* renamed from: h */
    public boolean f46407h = true;

    /* renamed from: i */
    boolean f46408i;

    /* renamed from: j */
    public boolean f46409j = false;

    /* renamed from: k */
    public AbstractC19668q f46410k;

    /* renamed from: l */
    public Map<Long, C19589ao> f46411l = new HashMap();

    /* renamed from: m */
    public long f46412m = 0;

    /* renamed from: n */
    long f46413n = -1;

    /* renamed from: o */
    boolean f46414o = false;

    /* renamed from: p */
    public C19605bb f46415p;

    /* renamed from: r */
    private boolean f46416r;

    /* renamed from: s */
    private boolean f46417s;

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19671t
    /* renamed from: a */
    public final void mo31305a(String str) {
        if (TextUtils.equals(this.f46400a, str)) {
            C19512f.m36457b("imsdk", "MessageModel onLeakRepairEnd, mRequestLoadOlder:" + this.f46416r + ", mRequestLoadNewer" + this.f46417s, (Throwable) null);
            if (this.f46416r) {
                this.f46416r = false;
                mo31319e();
            } else if (this.f46417s) {
                this.f46417s = false;
                m36522i();
            }
        }
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27794a(C19538ai aiVar, boolean z) {
        AbstractC19674v vVar;
        if (this.f46406g && (vVar = this.f46403d) != null) {
            vVar.mo27794a(aiVar, z);
        }
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27795a(final List<C19538ai> list, final int i, final C19593ar arVar) {
        if (!this.f46406g) {
            final C1955920 r3 = new AbstractC19479b() {
                /* class com.bytedance.p1399im.core.p1408d.C19546ak.C1955920 */

                static {
                    Covode.recordClassIndex(22403);
                }

                @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                /* renamed from: a */
                public final void mo27860a(C19672u uVar) {
                    C19546ak.this.mo31315b(list, i, arVar);
                }

                @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                /* renamed from: a */
                public final void mo27861a(Object obj) {
                    C19546ak.this.mo31315b(list, i, arVar);
                }
            };
            C19512f.m36457b("imsdk", "MessageModel loadNewerMessageListToEnd", (Throwable) null);
            if (!this.f46406g) {
                if (this.f46401b.isEmpty()) {
                    mo31311b();
                } else if (C19522aa.m36471a().mo31186a(this.f46400a)) {
                    C19512f.m36457b("imsdk", "MessageModel loadNewerMessageListToEnd checking now", (Throwable) null);
                    this.f46417s = true;
                } else if (this.f46408i) {
                    C19512f.m36457b("imsdk", "MessageModel loadNewerMessageListToEnd querying now", (Throwable) null);
                    r3.mo27860a(C19672u.m36755a().mo31628a().f46736a);
                } else {
                    this.f46408i = true;
                    final ArrayList arrayList = new ArrayList(this.f46401b);
                    RunnableC19987d.m37728a(new AbstractC19986c<List<C19538ai>>() {
                        /* class com.bytedance.p1399im.core.p1408d.C19546ak.C195849 */

                        static {
                            Covode.recordClassIndex(22428);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
                        /* renamed from: a */
                        public final /* synthetic */ List<C19538ai> mo31187a() {
                            C19512f.m36457b("imsdk", "MessageModel loadNewerMessageListToEnd onRun", (Throwable) null);
                            C19538ai f = C19546ak.this.mo31320f();
                            C19638h a = C19546ak.this.mo31307a();
                            if (f == null || a == null || a.getLastMessage() == null || f.getIndex() >= a.getLastMessage().getIndex()) {
                                return Collections.emptyList();
                            }
                            String str = C19546ak.this.f46400a;
                            long index = f.getIndex();
                            C19522aa.m36471a();
                            return C19777i.m37178a(str, index, C19522aa.m36473b(C19546ak.this.f46400a, C19546ak.m36520b(arrayList)), 0, null, false);
                        }
                    }, new AbstractC19985b<List<C19538ai>>() {
                        /* class com.bytedance.p1399im.core.p1408d.C19546ak.C1954810 */

                        static {
                            Covode.recordClassIndex(22392);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
                        /* renamed from: a */
                        public final /* synthetic */ void mo31188a(List<C19538ai> list) {
                            List<C19538ai> list2 = list;
                            C19512f.m36457b("imsdk", "MessageModel onPerformLoadNewerToEnd onCallback", (Throwable) null);
                            C19546ak.this.f46406g = true;
                            C19546ak akVar = C19546ak.this;
                            C19512f.m36457b("imsdk", "MessageModel onPerformLoadNewerToEnd, result:" + list2.size(), (Throwable) null);
                            Collections.reverse(list2);
                            akVar.f46401b.addList(list2);
                            akVar.f46408i = false;
                            akVar.mo31318d();
                            akVar.mo27799b(list2, true);
                            akVar.mo31305a(akVar.f46400a);
                            AbstractC19479b bVar = r3;
                            if (bVar != null) {
                                bVar.mo27861a((Object) null);
                            }
                        }
                    });
                }
            }
        } else {
            mo31315b(list, i, arVar);
        }
        this.f46415p.mo31387a(mo31322h());
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27792a(C19538ai aiVar) {
        AbstractC19674v vVar;
        if (this.f46401b.remove(aiVar) && (vVar = this.f46403d) != null) {
            vVar.mo27792a(aiVar);
        }
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public void mo27796a(List<C19538ai> list, int i, String str) {
        AbstractC19674v vVar = this.f46403d;
        if (vVar != null) {
            vVar.mo27796a(list, i, str);
        }
        this.f46415p.mo31387a(mo31322h());
        C19605bb bbVar = this.f46415p;
        C19483d a = C19483d.m36365a();
        C89219l.m154709a((Object) a, "");
        if (a.mo31141b().f46228aJ && bbVar.f46587f) {
            bbVar.f46585d.sendEmptyMessageDelayed(bbVar.f46582a, bbVar.f46583b);
        }
        if (C19483d.m36365a().f46158c != null) {
            RunnableC19987d.m37728a(new AbstractC19986c() {
                /* class com.bytedance.p1399im.core.p1408d.C19546ak.C1956223 */

                static {
                    Covode.recordClassIndex(22406);
                }

                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
                /* renamed from: a */
                public final Object mo31187a() {
                    int[] iArr;
                    try {
                        C19546ak akVar = C19546ak.this;
                        if (C19483d.m36365a().f46158c == null) {
                            return null;
                        }
                        C20009m mVar = akVar.f46401b;
                        if (mVar == null || mVar.size() <= 0) {
                            iArr = new int[]{0, 0};
                        } else {
                            ArrayList<C19538ai> arrayList = new ArrayList(mVar);
                            Collections.sort(arrayList, new Comparator<C19538ai>() {
                                /* class com.bytedance.p1399im.core.p1408d.C19546ak.C1956324 */

                                static {
                                    Covode.recordClassIndex(22407);
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                @Override // java.util.Comparator
                                public final /* synthetic */ int compare(C19538ai aiVar, C19538ai aiVar2) {
                                    C19538ai aiVar3 = aiVar;
                                    C19538ai aiVar4 = aiVar2;
                                    if (aiVar3.getOrderIndex() > aiVar4.getOrderIndex()) {
                                        return 1;
                                    }
                                    if (aiVar3.getOrderIndex() < aiVar4.getOrderIndex()) {
                                        return -1;
                                    }
                                    return 0;
                                }
                            });
                            long j = 0;
                            int i = 0;
                            for (C19538ai aiVar : arrayList) {
                                if (j > aiVar.getIndex()) {
                                    i++;
                                }
                                j = aiVar.getIndex();
                            }
                            iArr = new int[]{arrayList.size(), i};
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("receive_no", iArr[0]);
                            jSONObject.put("disordered_no", iArr[1]);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        C19512f.m36451a("sdk_enter_chat", jSONObject);
                        C19509d dVar = new C19509d();
                        dVar.f46304a = "message_data_source";
                        dVar.f46305b = "wrong_order";
                        dVar.mo31164a("total_count", Integer.valueOf(iArr[0])).mo31164a("count", Integer.valueOf(iArr[1])).mo31165a();
                        return null;
                    } catch (Exception unused) {
                        return null;
                    }
                }
            }, (AbstractC19985b) null);
        }
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27798a(List<C19538ai> list, boolean z) {
        if (list != null && !list.isEmpty()) {
            this.f46401b.appendList(list);
        }
        AbstractC19674v vVar = this.f46403d;
        if (vVar != null) {
            vVar.mo27798a(list, z);
        }
        this.f46415p.mo31387a(mo31322h());
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27797a(List<C19538ai> list, Map<String, Map<String, String>> map) {
        if (list != null && !list.isEmpty()) {
            this.f46401b.updateList(list);
            AbstractC19674v vVar = this.f46403d;
            if (vVar != null) {
                vVar.mo27797a(list, map);
            }
        }
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27793a(C19538ai aiVar, Map<String, List<C19536ag>> map, Map<String, List<C19536ag>> map2) {
        AbstractC19674v vVar = this.f46403d;
        if (vVar != null) {
            vVar.mo27793a(aiVar, map, map2);
        }
    }

    /* renamed from: a */
    public final void mo31310a(final String str, final C19538ai aiVar, final AbstractC19479b<Pair<List<Long>, List<Long>>> bVar) {
        C19640j.m36671a();
        C19640j.m36672a(str, new AbstractC19479b<List<ParticipantMinIndex>>() {
            /* class com.bytedance.p1399im.core.p1408d.C19546ak.C1957229 */

            static {
                Covode.recordClassIndex(22416);
            }

            @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
            /* renamed from: a */
            public final void mo27860a(C19672u uVar) {
                C19546ak.this.mo31314b(aiVar, bVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
            /* renamed from: a */
            public final /* synthetic */ void mo27861a(List<ParticipantMinIndex> list) {
                final List<ParticipantMinIndex> list2 = list;
                RunnableC19987d.m37729a(new AbstractC19986c<Pair<Boolean, Map<Long, C19589ao>>>() {
                    /* class com.bytedance.p1399im.core.p1408d.C19546ak.C1957229.C195731 */

                    static {
                        Covode.recordClassIndex(22417);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
                    /* renamed from: a */
                    public final /* synthetic */ Pair<Boolean, Map<Long, C19589ao>> mo31187a() {
                        long j;
                        long j2;
                        C19546ak akVar = C19546ak.this;
                        String str = str;
                        List list = list2;
                        if (TextUtils.isEmpty(str)) {
                            return null;
                        }
                        boolean b = akVar.mo31316b(str);
                        if (akVar.f46411l != null && !akVar.f46411l.isEmpty()) {
                            HashSet hashSet = new HashSet();
                            if (list != null && !list.isEmpty()) {
                                int size = list.size();
                                for (int i = 0; i < size; i++) {
                                    ParticipantMinIndex participantMinIndex = (ParticipantMinIndex) list.get(i);
                                    if (participantMinIndex != null) {
                                        if (participantMinIndex.user_id != null) {
                                            j = participantMinIndex.user_id.longValue();
                                        } else {
                                            j = 0;
                                        }
                                        if (participantMinIndex.index != null) {
                                            j2 = participantMinIndex.index.longValue();
                                        } else {
                                            j2 = Long.MIN_VALUE;
                                        }
                                        hashSet.add(Long.valueOf(j));
                                        if (akVar.f46411l.get(Long.valueOf(j)) != null && j2 > akVar.f46411l.get(Long.valueOf(j)).f46507c) {
                                            akVar.f46411l.get(Long.valueOf(j)).mo31359a(j2);
                                            b = true;
                                        }
                                    }
                                }
                            }
                        }
                        return new Pair(Boolean.valueOf(b), akVar.f46411l);
                    }
                }, new AbstractC19985b<Pair<Boolean, Map<Long, C19589ao>>>() {
                    /* class com.bytedance.p1399im.core.p1408d.C19546ak.C1957229.C195742 */

                    static {
                        Covode.recordClassIndex(22418);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
                    /* renamed from: a */
                    public final /* synthetic */ void mo31188a(Pair<Boolean, Map<Long, C19589ao>> pair) {
                        Pair<Boolean, Map<Long, C19589ao>> pair2 = pair;
                        if (pair2 != null) {
                            final Map<Long, C19589ao> map = (Map) pair2.second;
                            if (map != null && !map.isEmpty()) {
                                Pair<List<Long>, List<Long>> a = C19546ak.this.mo31306a(aiVar, map);
                                if (bVar != null) {
                                    bVar.mo27861a(a);
                                }
                            } else if (bVar != null) {
                                bVar.mo27861a(new Pair(Collections.emptyList(), Collections.emptyList()));
                            }
                            if (((Boolean) pair2.first).booleanValue()) {
                                RunnableC19987d.m37729a(new AbstractC19986c<Boolean>() {
                                    /* class com.bytedance.p1399im.core.p1408d.C19546ak.C1957229.C195742.C195751 */

                                    static {
                                        Covode.recordClassIndex(22419);
                                    }

                                    /* Return type fixed from 'java.lang.Object' to match base method */
                                    @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
                                    /* renamed from: a */
                                    public final /* synthetic */ Boolean mo31187a() {
                                        return Boolean.valueOf(C19771f.m37154a(str, map));
                                    }
                                }, null, C19983a.m37722d());
                            }
                        } else if (bVar != null) {
                            bVar.mo27860a(C19672u.m36756a(C19978k.m37686a(-9999)));
                        }
                    }
                }, C19983a.m37722d());
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x008a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo31316b(java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 293
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.p1408d.C19546ak.mo31316b(java.lang.String):boolean");
    }

    /* renamed from: h */
    public final List<C19538ai> mo31322h() {
        return new ArrayList(this.f46401b);
    }

    static {
        Covode.recordClassIndex(22390);
    }

    /* renamed from: a */
    public final C19638h mo31307a() {
        return C19640j.m36671a().mo31586a(this.f46400a);
    }

    /* renamed from: b */
    public void mo31311b() {
        mo31309a(this.f46402c, "MessageModel.initMessageList.default", (AbstractC19479b) null);
    }

    /* renamed from: f */
    public final C19538ai mo31320f() {
        if (this.f46401b.isEmpty()) {
            return null;
        }
        return (C19538ai) this.f46401b.get(0);
    }

    /* renamed from: g */
    public final C19538ai mo31321g() {
        if (this.f46401b.isEmpty()) {
            return null;
        }
        C20009m mVar = this.f46401b;
        return (C19538ai) mVar.get(mVar.size() - 1);
    }

    /* renamed from: c */
    public void mo31317c() {
        if (C19522aa.m36471a().mo31186a(this.f46400a)) {
            C19512f.m36457b("imsdk", "MessageModel requestHistoryMessage checking now", (Throwable) null);
            return;
        }
        final ArrayList arrayList = new ArrayList(this.f46401b);
        RunnableC19987d.m37728a(new AbstractC19986c<Boolean>() {
            /* class com.bytedance.p1399im.core.p1408d.C19546ak.C195582 */

            static {
                Covode.recordClassIndex(22402);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
            /* renamed from: a */
            public final /* synthetic */ Boolean mo31187a() {
                boolean z;
                C19522aa.m36471a();
                long a = C19522aa.m36470a(C19546ak.this.f46400a, C19546ak.m36518a(arrayList));
                long d = C19777i.m37197d(C19546ak.this.f46400a);
                C19512f.m36457b("imsdk", "MessageModel requestHistoryMessage onRun, cid:" + C19546ak.this.f46400a + ", loadOlderMinIndex:" + a + ", minIndex:" + d, (Throwable) null);
                if (a <= 0 || d >= a) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }, new AbstractC19985b<Boolean>() {
            /* class com.bytedance.p1399im.core.p1408d.C19546ak.C195763 */

            static {
                Covode.recordClassIndex(22420);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
            /* renamed from: a */
            public final /* synthetic */ void mo31188a(Boolean bool) {
                Boolean bool2 = bool;
                C19512f.m36457b("imsdk", "MessageModel requestHistoryMessage onCallback, cid:" + C19546ak.this.f46400a + ", result:" + bool2, (Throwable) null);
                if (bool2.booleanValue()) {
                    C19930x.m37536a();
                    String str = C19546ak.this.f46400a;
                    C19797ac acVar = new C19797ac();
                    C19638h a = C19640j.m36671a().mo31586a(str);
                    if (a == null || !a.hasMore() || a.isLocal()) {
                        C20014q.m37816a().mo31908b(str, (List<C19538ai>) null);
                    } else {
                        RunnableC19987d.m37729a(new AbstractC19986c<Long>(str, a) {
                            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19797ac.C197981 */

                            /* renamed from: a */
                            final /* synthetic */ String f47011a;

                            /* renamed from: b */
                            final /* synthetic */ C19638h f47012b;

                            static {
                                Covode.recordClassIndex(22642);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
                            /* renamed from: a */
                            public final /* synthetic */ Long mo31187a() {
                                long d = C19777i.m37197d(this.f47011a);
                                if (d <= 0) {
                                    return Long.valueOf(this.f47012b.getLastMessageIndex());
                                }
                                return Long.valueOf(d);
                            }

                            {
                                this.f47011a = r2;
                                this.f47012b = r3;
                            }
                        }, new AbstractC19985b<Long>(str, a) {
                            /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19797ac.C197992 */

                            /* renamed from: a */
                            final /* synthetic */ String f47014a;

                            /* renamed from: b */
                            final /* synthetic */ C19638h f47015b;

                            static {
                                Covode.recordClassIndex(22643);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
                            /* renamed from: a */
                            public final /* synthetic */ void mo31188a(Long l) {
                                Long l2 = l;
                                if (l2.longValue() == -1) {
                                    C20014q.m37816a().mo31908b(this.f47014a, (List<C19538ai>) null);
                                    return;
                                }
                                C19797ac acVar = C19797ac.this;
                                C19638h hVar = this.f47015b;
                                RequestBody build = new RequestBody.Builder().messages_in_conversation_body(new MessagesInConversationRequestBody.Builder().conversation_id(hVar.getConversationId()).conversation_short_id(Long.valueOf(hVar.getConversationShortId())).conversation_type(Integer.valueOf(hVar.getConversationType())).direction(MessageDirection.OLDER).anchor_index(Long.valueOf(l2.longValue())).build()).build();
                                acVar.mo31798a(hVar.getInboxType(), build, null, hVar.getConversationId());
                            }

                            {
                                this.f47014a = r2;
                                this.f47015b = r3;
                            }
                        }, C19983a.m37721c());
                    }
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo31318d() {
        if (!this.f46406g) {
            if (C19522aa.m36471a().mo31186a(this.f46400a)) {
                C19512f.m36457b("imsdk", "MessageModel requestNewerMessage checking now", (Throwable) null);
                return;
            }
            final ArrayList arrayList = new ArrayList(this.f46401b);
            RunnableC19987d.m37728a(new AbstractC19986c<Boolean>() {
                /* class com.bytedance.p1399im.core.p1408d.C19546ak.C195794 */

                static {
                    Covode.recordClassIndex(22423);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
                /* renamed from: a */
                public final /* synthetic */ Boolean mo31187a() {
                    boolean z;
                    C19522aa.m36471a();
                    long b = C19522aa.m36473b(C19546ak.this.f46400a, C19546ak.m36520b(arrayList));
                    long e = C19777i.m37200e(C19546ak.this.f46400a);
                    C19512f.m36457b("imsdk", "MessageModel requestNewerMessage onRun, cid:" + C19546ak.this.f46400a + ", loadNewerMaxIndex:" + b + ", maxIndex:" + e, (Throwable) null);
                    if (b <= 0 || e <= b) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }, new AbstractC19985b<Boolean>() {
                /* class com.bytedance.p1399im.core.p1408d.C19546ak.C195805 */

                static {
                    Covode.recordClassIndex(22424);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
                /* renamed from: a */
                public final /* synthetic */ void mo31188a(Boolean bool) {
                    Boolean bool2 = bool;
                    C19512f.m36457b("imsdk", "MessageModel requestNewerMessage onCallback, cid:" + C19546ak.this.f46400a + ", result:" + bool2, (Throwable) null);
                    if (bool2.booleanValue()) {
                        C19930x.m37536a();
                        String str = C19546ak.this.f46400a;
                        C19808af afVar = new C19808af();
                        C19638h a = C19640j.m36671a().mo31586a(str);
                        if (a == null || a.isLocal()) {
                            C20014q.m37816a().mo31913c(str, (List<C19538ai>) null);
                        } else {
                            RunnableC19987d.m37729a(new AbstractC19986c<Long>(str, a) {
                                /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19808af.C198091 */

                                /* renamed from: a */
                                final /* synthetic */ String f47038a;

                                /* renamed from: b */
                                final /* synthetic */ C19638h f47039b;

                                static {
                                    Covode.recordClassIndex(22653);
                                }

                                /* Return type fixed from 'java.lang.Object' to match base method */
                                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
                                /* renamed from: a */
                                public final /* synthetic */ Long mo31187a() {
                                    long e = C19777i.m37200e(this.f47038a);
                                    if (e <= 0) {
                                        return Long.valueOf(this.f47039b.getMinIndex());
                                    }
                                    return Long.valueOf(e);
                                }

                                {
                                    this.f47038a = r2;
                                    this.f47039b = r3;
                                }
                            }, new AbstractC19985b<Long>(str, a) {
                                /* class com.bytedance.p1399im.core.internal.p1427b.p1428a.C19808af.C198102 */

                                /* renamed from: a */
                                final /* synthetic */ String f47041a;

                                /* renamed from: b */
                                final /* synthetic */ C19638h f47042b;

                                static {
                                    Covode.recordClassIndex(22654);
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
                                /* renamed from: a */
                                public final /* synthetic */ void mo31188a(Long l) {
                                    Long l2 = l;
                                    if (l2.longValue() == -1) {
                                        C20014q.m37816a().mo31913c(this.f47041a, (List<C19538ai>) null);
                                        return;
                                    }
                                    C19808af afVar = C19808af.this;
                                    C19638h hVar = this.f47042b;
                                    RequestBody build = new RequestBody.Builder().messages_in_conversation_body(new MessagesInConversationRequestBody.Builder().conversation_id(hVar.getConversationId()).conversation_short_id(Long.valueOf(hVar.getConversationShortId())).conversation_type(Integer.valueOf(hVar.getConversationType())).direction(MessageDirection.NEWER).anchor_index(Long.valueOf(l2.longValue())).build()).build();
                                    afVar.mo31798a(hVar.getInboxType(), build, null, hVar.getConversationId());
                                }

                                {
                                    this.f47041a = r2;
                                    this.f47042b = r3;
                                }
                            }, C19983a.m37721c());
                        }
                    }
                }
            });
        }
    }

    /* renamed from: i */
    private void m36522i() {
        C19512f.m36457b("imsdk", "MessageModel loadNewerMessageList", (Throwable) null);
        if (this.f46406g) {
            mo27799b((List<C19538ai>) null, true);
        } else if (this.f46401b.isEmpty()) {
            mo27799b((List<C19538ai>) null, false);
            mo31311b();
        } else if (C19522aa.m36471a().mo31186a(this.f46400a)) {
            C19512f.m36457b("imsdk", "MessageModel loadNewerMessageList checking now", (Throwable) null);
            this.f46417s = true;
            mo27799b((List<C19538ai>) null, false);
        } else if (this.f46408i) {
            C19512f.m36457b("imsdk", "MessageModel loadNewerMessageList querying now", (Throwable) null);
            mo27799b((List<C19538ai>) null, false);
        } else {
            this.f46408i = true;
            final ArrayList arrayList = new ArrayList(this.f46401b);
            RunnableC19987d.m37728a(new AbstractC19986c<List<C19538ai>>() {
                /* class com.bytedance.p1399im.core.p1408d.C19546ak.C195827 */

                static {
                    Covode.recordClassIndex(22426);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
                /* renamed from: a */
                public final /* synthetic */ List<C19538ai> mo31187a() {
                    C19512f.m36457b("imsdk", "MessageModel loadNewerMessageList onRun", (Throwable) null);
                    C19538ai f = C19546ak.this.mo31320f();
                    C19638h a = C19546ak.this.mo31307a();
                    if (f == null || a == null || a.getLastMessage() == null || f.getIndex() >= a.getLastMessage().getIndex()) {
                        return Collections.emptyList();
                    }
                    String str = C19546ak.this.f46400a;
                    long index = f.getIndex();
                    C19522aa.m36471a();
                    return C19777i.m37176a(str, index, C19522aa.m36473b(C19546ak.this.f46400a, C19546ak.m36520b(arrayList)), C19546ak.this.f46402c + 5);
                }
            }, new AbstractC19985b<List<C19538ai>>() {
                /* class com.bytedance.p1399im.core.p1408d.C19546ak.C195838 */

                static {
                    Covode.recordClassIndex(22427);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
                /* renamed from: a */
                public final /* synthetic */ void mo31188a(List<C19538ai> list) {
                    List<C19538ai> list2 = list;
                    if (list2.size() > C19546ak.this.f46402c) {
                        list2 = list2.subList(list2.size() - C19546ak.this.f46402c, list2.size());
                        C19546ak.this.f46406g = false;
                    } else {
                        C19546ak.this.f46406g = true;
                    }
                    C19512f.m36457b("imsdk", "MessageModel loadNewerMessageList onCallback", (Throwable) null);
                    C19546ak akVar = C19546ak.this;
                    C19512f.m36457b("imsdk", "MessageModel onPerformLoadNewer, result:" + list2.size(), (Throwable) null);
                    Collections.reverse(list2);
                    akVar.f46401b.addList(list2);
                    akVar.f46408i = false;
                    if (list2.size() < akVar.f46402c) {
                        C19512f.m36457b("imsdk", "MessageModel onProcessLoadMore, less than limit, loadNewer", (Throwable) null);
                        akVar.mo31318d();
                    }
                    akVar.mo27799b(list2, true);
                    akVar.mo31305a(akVar.f46400a);
                }
            });
        }
    }

    /* renamed from: e */
    public final void mo31319e() {
        C19512f.m36457b("imsdk", "MessageModel loadOlderMessageList", (Throwable) null);
        if (mo31307a() == null) {
            mo27798a((List<C19538ai>) null, false);
        } else if (this.f46408i) {
            C19512f.m36457b("imsdk", "MessageModel loadOlderMessageList querying now", (Throwable) null);
            mo27798a((List<C19538ai>) null, false);
        } else if (C19522aa.m36471a().mo31186a(this.f46400a)) {
            C19512f.m36457b("imsdk", "MessageModel loadOlderMessageList checking now", (Throwable) null);
            this.f46416r = true;
            mo27798a((List<C19538ai>) null, false);
        } else {
            this.f46408i = true;
            final ArrayList arrayList = new ArrayList(this.f46401b);
            RunnableC19987d.m37728a(new AbstractC19986c<List<C19538ai>>() {
                /* class com.bytedance.p1399im.core.p1408d.C19546ak.C1954911 */

                static {
                    Covode.recordClassIndex(22393);
                }

                /* access modifiers changed from: private */
                /* renamed from: b */
                public List<C19538ai> mo31187a() {
                    C19512f.m36457b("imsdk", "MessageModel loadOlderMessageList onRun", (Throwable) null);
                    C19538ai g = C19546ak.this.mo31321g();
                    if (g == null) {
                        return null;
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    String str = C19546ak.this.f46400a;
                    long index = g.getIndex();
                    C19522aa.m36471a();
                    List<C19538ai> a = C19777i.m37177a(str, index, C19522aa.m36470a(C19546ak.this.f46400a, C19546ak.m36518a(arrayList)), C19546ak.this.f46402c, null);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
                        C19510e.m36438a("im_load_more_msg_duration", jSONObject);
                    } catch (Exception unused) {
                    }
                    return a;
                }
            }, new AbstractC19985b<List<C19538ai>>() {
                /* class com.bytedance.p1399im.core.p1408d.C19546ak.C1955012 */

                static {
                    Covode.recordClassIndex(22394);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
                /* renamed from: a */
                public final /* synthetic */ void mo31188a(List<C19538ai> list) {
                    Integer valueOf;
                    List<C19538ai> list2 = list;
                    C19512f.m36457b("imsdk", "MessageModel loadOlderMessageList onCallback", (Throwable) null);
                    C19546ak akVar = C19546ak.this;
                    StringBuilder sb = new StringBuilder("MessageModel onPerformLoadMore, result:");
                    if (list2 == null) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(list2.size());
                    }
                    C19512f.m36457b("imsdk", sb.append(valueOf).toString(), (Throwable) null);
                    akVar.f46408i = false;
                    if (list2 == null || list2.size() < akVar.f46402c) {
                        C19512f.m36457b("imsdk", "MessageModel onProcessLoadMore, less than limit, loadHistory", (Throwable) null);
                        akVar.mo31317c();
                    }
                    akVar.mo27798a(list2, true);
                    akVar.mo31305a(akVar.f46400a);
                }
            });
        }
    }

    /* renamed from: b */
    public static void m36521b(final C19538ai aiVar) {
        C19512f.m36457b("imsdk", "MessageModel updateMessage", (Throwable) null);
        RunnableC19987d.m37728a(new AbstractC19986c<C19538ai>() {
            /* class com.bytedance.p1399im.core.p1408d.C19546ak.C1955315 */

            static {
                Covode.recordClassIndex(22397);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ C19538ai mo31187a() {
                if (C19777i.m37185a(aiVar, true, true)) {
                    return aiVar;
                }
                return null;
            }
        }, new AbstractC19985b<C19538ai>(null) {
            /* class com.bytedance.p1399im.core.p1408d.C19546ak.C1955416 */

            /* renamed from: a */
            final /* synthetic */ AbstractC19479b f46427a = null;

            static {
                Covode.recordClassIndex(22398);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
            /* renamed from: a */
            public final /* synthetic */ void mo31188a(C19538ai aiVar) {
                if (aiVar != null) {
                    C20014q.m37816a().mo31900a(Collections.singletonList(aiVar));
                    AbstractC19479b bVar = this.f46427a;
                    if (bVar != null) {
                        bVar.mo27861a(aiVar);
                        return;
                    }
                    return;
                }
                AbstractC19479b bVar2 = this.f46427a;
                if (bVar2 != null) {
                    bVar2.mo27860a(C19672u.m36756a(C19978k.m37686a(-3001)));
                }
            }
        });
    }

    /* renamed from: a */
    public static long m36518a(List<C19538ai> list) {
        if (list.isEmpty()) {
            return 0;
        }
        C20041s.m37876a();
        long d = C20041s.m37890d();
        long j = Long.MAX_VALUE;
        for (C19538ai aiVar : list) {
            long indexInConversationV2 = aiVar.getIndexInConversationV2();
            if (indexInConversationV2 >= d) {
                j = Math.min(indexInConversationV2, j);
            }
        }
        if (j != Long.MAX_VALUE) {
            return j;
        }
        return 0;
    }

    /* renamed from: b */
    public static long m36520b(List<C19538ai> list) {
        if (list.isEmpty()) {
            return 0;
        }
        C20041s.m37876a();
        long d = C20041s.m37890d();
        long j = Long.MIN_VALUE;
        for (C19538ai aiVar : list) {
            long indexInConversationV2 = aiVar.getIndexInConversationV2();
            if (indexInConversationV2 >= d) {
                j = Math.max(indexInConversationV2, j);
            }
        }
        if (j != Long.MIN_VALUE) {
            return j;
        }
        return 0;
    }

    /* renamed from: a */
    public static void m36519a(C19538ai aiVar, AbstractC19479b<C19538ai> bVar) {
        C19930x.m37536a();
        C19930x.m37540a(aiVar, bVar);
    }

    public C19546ak(String str, boolean z) {
        C19512f.m36457b("imsdk", "MessageModel constructor, conversationId:" + str + ", unreadLiveControl:true, enableMsgRead:" + z, (Throwable) null);
        this.f46400a = str;
        this.f46405f = true;
        this.f46409j = z;
        if (z) {
            C19512f.m36457b("imsdk", "MessageModel enter conversation request minIndex", (Throwable) null);
            mo31310a(this.f46400a, (C19538ai) null, (AbstractC19479b<Pair<List<Long>, List<Long>>>) null);
            this.f46410k = new AbstractC19668q() {
                /* class com.bytedance.p1399im.core.p1408d.C19546ak.C195816 */

                static {
                    Covode.recordClassIndex(22425);
                }

                @Override // com.bytedance.p1399im.core.p1408d.AbstractC19668q
                /* renamed from: a */
                public final void mo31325a(C19638h hVar) {
                    if (hVar != null && !TextUtils.isEmpty(hVar.getConversationId()) && hVar.getConversationId().equals(C19546ak.this.f46400a)) {
                        C19512f.m36457b("imsdk", "MessageModel onMemberChange", (Throwable) null);
                        C19546ak akVar = C19546ak.this;
                        akVar.mo31310a(akVar.f46400a, (C19538ai) null, (AbstractC19479b<Pair<List<Long>, List<Long>>>) null);
                    }
                }
            };
        }
        this.f46415p = new C19605bb(this.f46400a, C19483d.m36365a().mo31141b().f46228aJ);
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27789a(final int i, final C19538ai aiVar) {
        if (aiVar.getLocalCache(-1) != null || this.f46406g) {
            mo31312b(i, aiVar);
        } else {
            mo31309a(this.f46402c, "MessageModel.onAddMessage", new AbstractC19479b() {
                /* class com.bytedance.p1399im.core.p1408d.C19546ak.C1955719 */

                static {
                    Covode.recordClassIndex(22401);
                }

                @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                /* renamed from: a */
                public final void mo27860a(C19672u uVar) {
                    C19546ak.this.mo31312b(i, aiVar);
                }

                @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                /* renamed from: a */
                public final void mo27861a(Object obj) {
                    C19546ak.this.mo31312b(i, aiVar);
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo31312b(int i, C19538ai aiVar) {
        C19512f.m36457b("imsdk", "MessageModel onAddMessageInner, mUptoNewest:" + this.f46406g, (Throwable) null);
        if (this.f46406g) {
            if (aiVar != null) {
                this.f46401b.add(aiVar);
                if (this.f46401b.size() > 3000) {
                    this.f46401b = new C20009m(this.f46401b.subList(0, 3000));
                }
            }
            AbstractC19674v vVar = this.f46403d;
            if (vVar != null) {
                vVar.mo27789a(i, aiVar);
            }
        }
    }

    /* renamed from: a */
    public final Pair<List<Long>, List<Long>> mo31306a(C19538ai aiVar, Map<Long, C19589ao> map) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (aiVar != null && !TextUtils.isEmpty(aiVar.getConversationId()) && aiVar.getConversationId().equals(this.f46400a) && map != null && !map.isEmpty()) {
            for (Map.Entry<Long, C19589ao> entry : map.entrySet()) {
                if (!(entry == null || entry.getValue() == null || entry.getValue().f46506b == C19483d.m36365a().f46157b.mo27953a() || Math.abs(entry.getValue().f46507c) > aiVar.getIndex())) {
                    arrayList2.add(Long.valueOf(entry.getValue().f46506b));
                    if (!aiVar.isIndexLocal() && (entry.getValue().f46509e >= aiVar.getOrderIndex() || (entry.getValue().f46508d >= aiVar.getIndex() && !entry.getValue().mo31361b()))) {
                        arrayList.add(Long.valueOf(entry.getValue().f46506b));
                    }
                }
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    /* renamed from: b */
    public final void mo31314b(final C19538ai aiVar, final AbstractC19479b<Pair<List<Long>, List<Long>>> bVar) {
        C19512f.m36457b("imsdk", "read_receiptgetReadAndAllByLocal", (Throwable) null);
        RunnableC19987d.m37729a(new AbstractC19986c<Map<Long, C19589ao>>() {
            /* class com.bytedance.p1399im.core.p1408d.C19546ak.C1957730 */

            static {
                Covode.recordClassIndex(22421);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
            /* renamed from: a */
            public final /* synthetic */ Map<Long, C19589ao> mo31187a() {
                C19538ai aiVar = aiVar;
                if (aiVar == null || !aiVar.isSelf() || aiVar.isDeleted() || !C20010n.m37809c(aiVar) || TextUtils.isEmpty(aiVar.getConversationId()) || !aiVar.getConversationId().equals(C19546ak.this.f46400a)) {
                    return null;
                }
                if (C19546ak.this.f46411l == null || C19546ak.this.f46411l.isEmpty()) {
                    C19546ak.this.f46411l = C19771f.m37158c(aiVar.getConversationId(), C19546ak.this.f46411l);
                }
                return C19546ak.this.f46411l;
            }
        }, new AbstractC19985b<Map<Long, C19589ao>>() {
            /* class com.bytedance.p1399im.core.p1408d.C19546ak.C1957831 */

            static {
                Covode.recordClassIndex(22422);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
            /* renamed from: a */
            public final /* synthetic */ void mo31188a(Map<Long, C19589ao> map) {
                Map<Long, C19589ao> map2 = map;
                if (map2 == null || map2.isEmpty()) {
                    AbstractC19479b bVar = bVar;
                    if (bVar != null) {
                        bVar.mo27861a(new Pair(Collections.emptyList(), Collections.emptyList()));
                        return;
                    }
                    return;
                }
                Pair<List<Long>, List<Long>> a = C19546ak.this.mo31306a(aiVar, map2);
                AbstractC19479b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.mo27861a(a);
                }
            }
        }, C19983a.m37722d());
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27791a(int i, C19587an anVar) {
        AbstractC19674v vVar = this.f46403d;
        if (vVar != null) {
            vVar.mo27791a(i, anVar);
        }
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: b */
    public final void mo27799b(List<C19538ai> list, boolean z) {
        AbstractC19674v vVar = this.f46403d;
        if (vVar != null) {
            vVar.mo27799b(list, z);
        }
        this.f46415p.mo31387a(mo31322h());
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19676x
    /* renamed from: a */
    public final void mo31308a(int i, int i2, C19538ai aiVar) {
        if (this.f46404e != null && aiVar != null && TextUtils.equals(this.f46400a, aiVar.getConversationId())) {
            this.f46404e.mo31308a(i, i2, aiVar);
        }
    }

    /* renamed from: b */
    public final void mo31313b(int i, C19538ai aiVar, C19600ay ayVar) {
        if (this.f46406g) {
            if (aiVar != null && i == C19489e.AbstractC19491b.f46184a) {
                this.f46401b.add(aiVar);
                if (this.f46401b.size() > 3000) {
                    this.f46401b = new C20009m(this.f46401b.subList(0, 3000));
                }
            }
            AbstractC19674v vVar = this.f46403d;
            if (vVar != null) {
                vVar.mo27790a(i, aiVar, ayVar);
            }
        }
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19674v
    /* renamed from: a */
    public final void mo27790a(final int i, final C19538ai aiVar, final C19600ay ayVar) {
        C19512f.m36457b("imsdk", "MessageModel onSendMessage statusCode=" + i + " message=" + aiVar, (Throwable) null);
        if (!this.f46406g) {
            mo31309a(this.f46402c, "MessageModel.onSendMessage", new AbstractC19479b() {
                /* class com.bytedance.p1399im.core.p1408d.C19546ak.C1955618 */

                static {
                    Covode.recordClassIndex(22400);
                }

                @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                /* renamed from: a */
                public final void mo27860a(C19672u uVar) {
                    C19546ak.this.mo31313b(i, aiVar, ayVar);
                }

                @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                /* renamed from: a */
                public final void mo27861a(Object obj) {
                    C19546ak.this.mo31313b(i, aiVar, ayVar);
                }
            });
        } else {
            mo31313b(i, aiVar, ayVar);
        }
    }

    /* renamed from: b */
    public final void mo31315b(final List<C19538ai> list, final int i, final C19593ar arVar) {
        Integer num;
        StringBuilder sb = new StringBuilder("MessageModel onGetMessage, list:");
        final C19538ai aiVar = null;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        C19512f.m36457b("imsdk", sb.append(num).append(", msgSource:").append(i).append(", mUptoNewest:").append(this.f46406g).toString(), (Throwable) null);
        if (this.f46406g) {
            Iterator it = this.f46401b.iterator();
            final long j = 0;
            while (it.hasNext()) {
                C19538ai aiVar2 = (C19538ai) it.next();
                if (aiVar2 != null) {
                    j = Math.max(j, aiVar2.getIndexInConversationV2());
                }
            }
            if (!this.f46401b.isEmpty()) {
                aiVar = (C19538ai) this.f46401b.get(0);
            }
            RunnableC19987d.m37729a(new AbstractC19986c<List<C19538ai>>() {
                /* class com.bytedance.p1399im.core.p1408d.C19546ak.C1956021 */

                static {
                    Covode.recordClassIndex(22404);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
                /* renamed from: a */
                public final /* synthetic */ List<C19538ai> mo31187a() {
                    C19512f.m36457b("imsdk", "MessageModel onGetMessage, onRun", (Throwable) null);
                    return C19522aa.m36471a().mo31185a(C19546ak.this.f46400a, j, aiVar, list);
                }
            }, new AbstractC19985b<List<C19538ai>>() {
                /* class com.bytedance.p1399im.core.p1408d.C19546ak.C1956122 */

                static {
                    Covode.recordClassIndex(22405);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
                /* renamed from: a */
                public final /* synthetic */ void mo31188a(List<C19538ai> list) {
                    List<C19538ai> list2 = list;
                    C19546ak akVar = C19546ak.this;
                    int i = i;
                    C19593ar arVar = arVar;
                    C19512f.m36457b("imsdk", "MessageModel onPerformGetMessage, result:" + C19996e.m37747a((List) list2), (Throwable) null);
                    if (akVar.f46409j) {
                        RunnableC19987d.m37729a(new AbstractC19986c<Pair<Boolean, Map<Long, C19589ao>>>(list2) {
                            /* class com.bytedance.p1399im.core.p1408d.C19546ak.C1956826 */

                            /* renamed from: a */
                            final /* synthetic */ List f46460a;

                            static {
                                Covode.recordClassIndex(22412);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
                            /* renamed from: a */
                            public final /* synthetic */ Pair<Boolean, Map<Long, C19589ao>> mo31187a() {
                                List list = this.f46460a;
                                if (list == null || list.isEmpty()) {
                                    return null;
                                }
                                ArrayList<C19538ai> arrayList = new ArrayList(this.f46460a);
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    C19538ai aiVar = (C19538ai) it.next();
                                    if (aiVar == null || aiVar.isSelf() || TextUtils.isEmpty(aiVar.getConversationId()) || !aiVar.getConversationId().equals(C19546ak.this.f46400a)) {
                                        it.remove();
                                    }
                                }
                                if (arrayList.isEmpty()) {
                                    return null;
                                }
                                C19546ak akVar = C19546ak.this;
                                boolean b = akVar.mo31316b(akVar.f46400a);
                                C19512f.m36457b("imsdk", "updateReadIndexOnGetOtherMsg before update readIndex mReadStatusMap=" + C19999h.f47538a.mo46674b(C19546ak.this.f46411l), (Throwable) null);
                                for (C19538ai aiVar2 : arrayList) {
                                    long index = aiVar2.getIndex();
                                    long orderIndex = aiVar2.getOrderIndex();
                                    long sender = aiVar2.getSender();
                                    C19589ao aoVar = C19546ak.this.f46411l.get(Long.valueOf(sender));
                                    if (aoVar != null) {
                                        if (aoVar.mo31361b()) {
                                            if (orderIndex > aoVar.f46509e) {
                                                aoVar.mo31360b(index);
                                                aoVar.mo31363c(orderIndex);
                                                C19546ak.this.f46411l.put(Long.valueOf(sender), aoVar);
                                            }
                                        } else if (index >= aoVar.f46508d) {
                                            aoVar.mo31360b(index);
                                            aoVar.mo31363c(orderIndex);
                                            C19546ak.this.f46411l.put(Long.valueOf(sender), aoVar);
                                        }
                                        b = true;
                                    }
                                }
                                C19512f.m36457b("imsdk", "updateReadIndexOnGetOtherMsg after update readIndex mReadStatusMap=" + C19999h.f47538a.mo46674b(C19546ak.this.f46411l), (Throwable) null);
                                return new Pair(Boolean.valueOf(b), C19546ak.this.f46411l);
                            }

                            {
                                this.f46460a = r2;
                            }
                        }, new AbstractC19985b<Pair<Boolean, Map<Long, C19589ao>>>() {
                            /* class com.bytedance.p1399im.core.p1408d.C19546ak.C1956927 */

                            static {
                                Covode.recordClassIndex(22413);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
                            /* renamed from: a */
                            public final /* synthetic */ void mo31188a(Pair<Boolean, Map<Long, C19589ao>> pair) {
                                final Pair<Boolean, Map<Long, C19589ao>> pair2 = pair;
                                if (pair2 != null && ((Boolean) pair2.first).booleanValue()) {
                                    RunnableC19987d.m37729a(new AbstractC19986c<Boolean>() {
                                        /* class com.bytedance.p1399im.core.p1408d.C19546ak.C1956927.C195701 */

                                        static {
                                            Covode.recordClassIndex(22414);
                                        }

                                        /* Return type fixed from 'java.lang.Object' to match base method */
                                        @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19986c
                                        /* renamed from: a */
                                        public final /* synthetic */ Boolean mo31187a() {
                                            C19771f.m37154a(C19546ak.this.f46400a, (Map) pair2.second);
                                            return true;
                                        }
                                    }, null, C19983a.m37722d());
                                }
                            }
                        }, C19983a.m37722d());
                    }
                    if (list2 != null && !list2.isEmpty()) {
                        akVar.f46401b.addList(list2);
                        if (akVar.f46403d != null) {
                            akVar.f46403d.mo27795a(list2, i, arVar);
                        }
                    }
                    akVar.f46415p.mo31387a(akVar.mo31322h());
                }
            }, C19983a.m37722d());
        }
    }

    /* renamed from: a */
    public void mo31309a(final int i, final String str, final AbstractC19479b bVar) {
        C19512f.m36457b("imsdk", "MessageModel initMessageList", (Throwable) null);
        if (this.f46408i) {
            C19512f.m36457b("imsdk", "MessageModel initMessageList mLocalDBQuerying, return", (Throwable) null);
            if (bVar != null) {
                bVar.mo27860a(C19672u.m36755a().mo31628a().f46736a);
                return;
            }
            return;
        }
        this.f46408i = true;
        this.f46413n = SystemClock.uptimeMillis();
        RunnableC19987d.m37728a(new AbstractC19986c<Pair<List<C19538ai>, C19677y>>() {
            /* class com.bytedance.p1399im.core.p1408d.C19546ak.C1955517 */

            static {
                Covode.recordClassIndex(22399);
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public Pair<List<C19538ai>, C19677y> mo31187a() {
                C19512f.m36457b("imsdk", "MessageModel initMessageList onRun", (Throwable) null);
                long uptimeMillis = SystemClock.uptimeMillis();
                List<C19538ai> a = C19777i.m37175a(C19546ak.this.f46400a, i);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
                    C19510e.m36438a("im_init_msg_duration", jSONObject);
                } catch (Exception unused) {
                }
                C19522aa a2 = C19522aa.m36471a();
                String str = C19546ak.this.f46400a;
                C19512f.m36457b("imsdk", "LeakMsgRepairManager onModelInit, cid:" + str + ", list:" + C19996e.m37747a((List) a) + ", repair:true", (Throwable) null);
                long uptimeMillis2 = SystemClock.uptimeMillis();
                C19677y yVar = new C19677y();
                List<C19538ai> a3 = C19522aa.m36472a(str, a, yVar);
                yVar.f46740d = a3.size();
                yVar.f46748l = SystemClock.uptimeMillis() - uptimeMillis2;
                if (TextUtils.isEmpty(str) || a2.f46337c.contains(str)) {
                    C19512f.m36457b("imsdk", "LeakMsgRepairManager triggerRepair, cid:" + str + ", already doing", (Throwable) null);
                } else {
                    C20041s.m37876a();
                    if (!C20041s.m37889c()) {
                        C19512f.m36457b("imsdk", "LeakMsgRepairManager triggerRepair, cid:" + str + ", no recent mode", (Throwable) null);
                    } else {
                        a2.f46337c.add(str);
                        RunnableC19987d.m37729a(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00d1: INVOKE  
                              (wrap: com.bytedance.im.core.d.aa$1 : 0x00c5: CONSTRUCTOR  (r2v1 com.bytedance.im.core.d.aa$1) = (r7v1 'a2' com.bytedance.im.core.d.aa), (r6v0 'str' java.lang.String) call: com.bytedance.im.core.d.aa.1.<init>(com.bytedance.im.core.d.aa, java.lang.String):void type: CONSTRUCTOR)
                              (wrap: com.bytedance.im.core.d.aa$2 : 0x00ca: CONSTRUCTOR  (r1v7 com.bytedance.im.core.d.aa$2) = (r7v1 'a2' com.bytedance.im.core.d.aa), (r6v0 'str' java.lang.String) call: com.bytedance.im.core.d.aa.2.<init>(com.bytedance.im.core.d.aa, java.lang.String):void type: CONSTRUCTOR)
                              (wrap: java.util.concurrent.Executor : 0x00cd: INVOKE  (r0v23 java.util.concurrent.Executor) =  type: STATIC call: com.bytedance.im.core.internal.e.a.a():java.util.concurrent.Executor)
                             type: STATIC call: com.bytedance.im.core.internal.e.d.a(com.bytedance.im.core.internal.e.c, com.bytedance.im.core.internal.e.b, java.util.concurrent.Executor):void in method: com.bytedance.im.core.d.ak.17.b():android.util.Pair<java.util.List<com.bytedance.im.core.d.ai>, com.bytedance.im.core.d.y>, file: classes10.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00c5: CONSTRUCTOR  (r2v1 com.bytedance.im.core.d.aa$1) = (r7v1 'a2' com.bytedance.im.core.d.aa), (r6v0 'str' java.lang.String) call: com.bytedance.im.core.d.aa.1.<init>(com.bytedance.im.core.d.aa, java.lang.String):void type: CONSTRUCTOR in method: com.bytedance.im.core.d.ak.17.b():android.util.Pair<java.util.List<com.bytedance.im.core.d.ai>, com.bytedance.im.core.d.y>, file: classes10.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                            	... 24 more
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.im.core.d.aa, state: GENERATED_AND_UNLOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                            	... 30 more
                            */
                        /*
                        // Method dump skipped, instructions count: 213
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.p1408d.C19546ak.C1955517.mo31187a():android.util.Pair");
                    }
                }, new AbstractC19985b<Pair<List<C19538ai>, C19677y>>() {
                    /* class com.bytedance.p1399im.core.p1408d.C19546ak.C1957128 */

                    static {
                        Covode.recordClassIndex(22415);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX WARNING: Removed duplicated region for block: B:18:0x0098  */
                    /* JADX WARNING: Removed duplicated region for block: B:19:0x009a  */
                    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ad  */
                    /* JADX WARNING: Removed duplicated region for block: B:23:0x00af  */
                    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b6  */
                    @Override // com.bytedance.p1399im.core.internal.p1434e.AbstractC19985b
                    /* renamed from: a */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final /* synthetic */ void mo31188a(android.util.Pair<java.util.List<com.bytedance.p1399im.core.p1408d.C19538ai>, com.bytedance.p1399im.core.p1408d.C19677y> r19) {
                        /*
                        // Method dump skipped, instructions count: 467
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.p1408d.C19546ak.C1957128.mo31188a(java.lang.Object):void");
                    }
                });
            }
        }
