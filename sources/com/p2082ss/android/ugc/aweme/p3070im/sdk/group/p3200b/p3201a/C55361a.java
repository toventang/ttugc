package com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3200b.p3201a;

import android.content.res.Resources;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17422a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19639i;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.p1399im.core.proto.ApplyStatusCode;
import com.bytedance.p1399im.core.proto.BatchGetConversationAuditUnreadRequestBody;
import com.bytedance.p1399im.core.proto.ConversationApplyInfo;
import com.bytedance.p1399im.core.proto.RequestBody;
import com.bytedance.p1399im.p1400a.p1401a.AbstractC19473b;
import com.bytedance.p1399im.p1400a.p1401a.C19464a;
import com.bytedance.p1399im.p1400a.p1401a.p1402a.C19468b;
import com.bytedance.p1399im.p1400a.p1401a.p1403b.C19474a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.C55675b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.EnumC55687c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.p3211a.C55649c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.p3211a.C55654e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.p3211a.C55667i;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.p3211a.EnumC55669j;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.b.a.a */
public final class C55361a implements AbstractC17422a {

    /* renamed from: a */
    public static final ConcurrentHashMap<Long, Integer> f126581a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public static final C1213t<List<Long>> f126582b = new C1213t<>();

    /* renamed from: c */
    public static final ConcurrentHashMap<Long, CopyOnWriteArrayList<C1213t<Integer>>> f126583c = new ConcurrentHashMap<>();

    /* renamed from: d */
    public static final C55361a f126584d = new C55361a();

    /* renamed from: e */
    private static final AbstractC19473b f126585e;

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
    /* renamed from: a */
    public final void mo28001a(C19638h hVar) {
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
    /* renamed from: a */
    public final void mo28002a(C19638h hVar, int i) {
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
    /* renamed from: a */
    public final void mo28003a(String str, int i) {
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
    /* renamed from: a */
    public final void mo28004a(String str, int i, List list) {
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
    /* renamed from: a */
    public final void mo28005a(String str, List list) {
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
    /* renamed from: a */
    public final void mo28006a(List list) {
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
    /* renamed from: b */
    public final void mo28010b(C19638h hVar) {
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
    /* renamed from: b */
    public final void mo28012b(List list) {
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
    /* renamed from: c */
    public final void mo28015c(List list) {
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
    /* renamed from: d */
    public final int mo28016d() {
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.b.a.a$a */
    public static final class C55362a implements AbstractC19473b {
        static {
            Covode.recordClassIndex(65127);
        }

        C55362a() {
        }

        @Override // com.bytedance.p1399im.p1400a.p1401a.AbstractC19473b
        /* renamed from: b */
        public final void mo31133b(ConversationApplyInfo conversationApplyInfo) {
            C89219l.m154721d(conversationApplyInfo, "");
            C56244a.m102190b("GroupRequestManager", "onNewApplyAck notifyInfo=".concat(String.valueOf(conversationApplyInfo)));
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.b.a.a$a$a */
        static final class C55363a extends AbstractC89220m implements AbstractC89172b<C19474a, C89391z> {

            /* renamed from: a */
            final /* synthetic */ ConversationApplyInfo f126586a;

            static {
                Covode.recordClassIndex(65128);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C55363a(ConversationApplyInfo conversationApplyInfo) {
                super(1);
                this.f126586a = conversationApplyInfo;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C19474a aVar) {
                long j;
                boolean z;
                Map<Long, Long> map;
                Long l;
                C19474a aVar2 = aVar;
                if (aVar2 == null || (map = aVar2.f46136a) == null || (l = map.get(this.f126586a.conv_short_id)) == null) {
                    j = 0;
                } else {
                    j = l.longValue();
                }
                Integer num = C55361a.f126581a.get(this.f126586a.conv_short_id);
                boolean z2 = false;
                if (num == null) {
                    num = 0;
                }
                if (C89219l.m154703a(num.intValue(), 0) > 0) {
                    z = true;
                } else {
                    z = false;
                }
                ConcurrentHashMap<Long, Integer> concurrentHashMap = C55361a.f126581a;
                Long l2 = this.f126586a.conv_short_id;
                C89219l.m154716b(l2, "");
                concurrentHashMap.put(l2, Integer.valueOf((int) j));
                if (j > 0) {
                    z2 = true;
                }
                if (z != z2) {
                    C55361a.m101174d(C89070n.m154516a(this.f126586a.conv_short_id));
                }
                return C89391z.f203057a;
            }
        }

        @Override // com.bytedance.p1399im.p1400a.p1401a.AbstractC19473b
        /* renamed from: a */
        public final void mo31132a(ConversationApplyInfo conversationApplyInfo) {
            C56244a.m102190b("GroupRequestManager", "onNewConversationApply notifyInfo=".concat(String.valueOf(conversationApplyInfo)));
            if (conversationApplyInfo != null && conversationApplyInfo.apply_status == ApplyStatusCode.APPLYING) {
                String str = null;
                if (1 != 0) {
                    ArrayList arrayList = new ArrayList();
                    Map<String, String> map = conversationApplyInfo.ext;
                    if (map != null) {
                        str = map.get("a:disable_inner_push");
                    }
                    if (!C89219l.m154714a((Object) "1", (Object) str)) {
                        Long l = conversationApplyInfo.conv_short_id;
                        C89219l.m154716b(l, "");
                        arrayList.add(l);
                    }
                    C55361a.m101173a(C89070n.m154516a(conversationApplyInfo.conv_short_id), arrayList, new C55363a(conversationApplyInfo));
                }
            }
        }
    }

    private C55361a() {
    }

    /* renamed from: a */
    public final void mo92406a() {
        f126581a.clear();
        AbstractC17420a.C17421a.m32276a().mo27723a(this);
    }

    static {
        Covode.recordClassIndex(65126);
        C55362a aVar = new C55362a();
        f126585e = aVar;
        C19464a.m36302a().f46128a.add(aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.b.a.a$c */
    public static final class C55365c implements AbstractC19479b<C19474a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f126588a;

        /* renamed from: b */
        final /* synthetic */ List f126589b;

        static {
            Covode.recordClassIndex(65130);
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.b.a.a$c$a */
        static final class CallableC55366a<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ C55365c f126590a;

            /* renamed from: b */
            final /* synthetic */ C19474a f126591b;

            static {
                Covode.recordClassIndex(65131);
            }

            CallableC55366a(C55365c cVar, C19474a aVar) {
                this.f126590a = cVar;
                this.f126591b = aVar;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                C19474a aVar;
                Map<Long, Long> map;
                Long l;
                ArrayList arrayList = new ArrayList();
                User d = C55197c.m100922d();
                if (!(d == null || d.getUid() == null || (aVar = this.f126591b) == null || (map = aVar.f46136a) == null)) {
                    for (Long l2 : map.keySet()) {
                        if (this.f126590a.f126589b.contains(l2) && (l = map.get(l2)) != null && l.longValue() > 0) {
                            C89219l.m154716b(l2, "");
                            arrayList.add(l2);
                        }
                    }
                }
                return C89070n.m154590j(arrayList);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.b.a.a$c$c */
        static final class C55368c<T> implements AbstractC88433f {

            /* renamed from: a */
            public static final C55368c f126593a = new C55368c();

            static {
                Covode.recordClassIndex(65133);
            }

            C55368c() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                C56244a.m102193e("GroupRequestManager", "requestInner error: ".concat(String.valueOf(obj)));
            }
        }

        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final void mo27860a(C19672u uVar) {
            C56244a.m102193e("GroupRequestManager", "request get unread count fail:" + String.valueOf(uVar));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final /* synthetic */ void mo27861a(C19474a aVar) {
            C19474a aVar2 = aVar;
            this.f126588a.invoke(aVar2);
            AbstractC88403ab.m153604a((Callable) new CallableC55366a(this, aVar2)).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(C55367b.f126592a, C55368c.f126593a);
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.b.a.a$c$b */
        static final class C55367b<T> implements AbstractC88433f {

            /* renamed from: a */
            public static final C55367b f126592a = new C55367b();

            static {
                Covode.recordClassIndex(65132);
            }

            C55367b() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                List<T> list = (List) obj;
                C89219l.m154716b(list, "");
                for (T t : list) {
                    long longValue = t.longValue();
                    C55654e eVar = C55654e.f126932b;
                    String valueOf = String.valueOf(longValue);
                    Resources resources = C17867d.m33078a().getResources();
                    Integer num = C55361a.f126581a.get(Long.valueOf(longValue));
                    if (num == null) {
                        num = 0;
                    }
                    C89219l.m154716b(num, "");
                    int intValue = num.intValue();
                    Object[] objArr = new Object[1];
                    int i = C55361a.f126581a.get(Long.valueOf(longValue));
                    if (i == null) {
                        i = 0;
                    }
                    objArr[0] = i;
                    String quantityString = resources.getQuantityString(R.plurals.cs, intValue, objArr);
                    C89219l.m154716b(quantityString, "");
                    C55675b bVar = new C55675b(valueOf, quantityString, EnumC55687c.NewRequest);
                    C89219l.m154721d(bVar, "");
                    if (!eVar.mo92546c().mo92554a()) {
                        C89219l.m154721d(bVar, "");
                        C55649c.m101402a(new C55667i(EnumC55669j.Tip, null, null, null, bVar, 14));
                        C55649c.m101400a();
                        eVar.mo92542a(1000L);
                    }
                }
            }
        }

        C55365c(AbstractC89172b bVar, List list) {
            this.f126588a = bVar;
            this.f126589b = list;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.b.a.a$b */
    public static final class C55364b implements AbstractC19479b<String> {

        /* renamed from: a */
        final /* synthetic */ long f126587a;

        static {
            Covode.recordClassIndex(65129);
        }

        public C55364b(long j) {
            this.f126587a = j;
        }

        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final void mo27860a(C19672u uVar) {
            C56244a.m102193e("GroupRequestManager", "markRead fail:" + String.valueOf(uVar));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
        /* renamed from: a */
        public final /* synthetic */ void mo27861a(String str) {
            Integer num = C55361a.f126581a.get(Long.valueOf(this.f126587a));
            if (num != null && C89219l.m154703a(num.intValue(), 0) > 0) {
                C55361a.f126581a.remove(Long.valueOf(this.f126587a));
                C55361a.m101174d(C89070n.m154516a(Long.valueOf(this.f126587a)));
            }
        }
    }

    /* renamed from: a */
    public static int m101172a(long j) {
        Integer num = f126581a.get(Long.valueOf(j));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
    /* renamed from: c */
    public final void mo28014c(C19638h hVar) {
        if (hVar != null) {
            C56244a.m102190b("GroupRequestManager", "onLeaveConversation:" + hVar.getConversationShortId());
            f126581a.remove(Long.valueOf(hVar.getConversationShortId()));
        }
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
    /* renamed from: d */
    public final void mo28017d(C19638h hVar) {
        if (hVar != null) {
            C56244a.m102190b("GroupRequestManager", "onDissolveConversation:" + hVar.getConversationShortId());
            f126581a.remove(Long.valueOf(hVar.getConversationShortId()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.b.a.a$d */
    static final class C55369d extends AbstractC89220m implements AbstractC89172b<C19474a, C89391z> {

        /* renamed from: a */
        public static final C55369d f126594a = new C55369d();

        static {
            Covode.recordClassIndex(65134);
        }

        C55369d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C19474a aVar) {
            Map<Long, Long> map;
            List list;
            long j;
            C19474a aVar2 = aVar;
            if (!(aVar2 == null || (map = aVar2.f46136a) == null)) {
                for (Long l : map.keySet()) {
                    ConcurrentHashMap<Long, Integer> concurrentHashMap = C55361a.f126581a;
                    C89219l.m154716b(l, "");
                    Long l2 = map.get(l);
                    if (l2 != null) {
                        j = l2.longValue();
                    } else {
                        j = 0;
                    }
                    concurrentHashMap.put(l, Integer.valueOf((int) j));
                }
                Set<Long> keySet = map.keySet();
                if (keySet != null) {
                    list = C89070n.m154590j(keySet);
                } else {
                    list = null;
                }
                C55361a.m101174d(list);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: d */
    public static void m101174d(List<Long> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            long longValue = it.next().longValue();
            CopyOnWriteArrayList<C1213t<Integer>> copyOnWriteArrayList = f126583c.get(Long.valueOf(longValue));
            if (copyOnWriteArrayList != null) {
                Iterator<C1213t<Integer>> it2 = copyOnWriteArrayList.iterator();
                C89219l.m154716b(it2, "");
                while (it2.hasNext()) {
                    C1213t<Integer> next = it2.next();
                    int i = f126581a.get(Long.valueOf(longValue));
                    if (i == null) {
                        i = 0;
                    }
                    next.postValue(i);
                }
            }
        }
        f126582b.postValue(list);
    }

    @Override // com.bytedance.p1399im.core.p1408d.AbstractC19667p
    /* renamed from: a */
    public final void mo28007a(Map<String, C19638h> map) {
        Collection<C19638h> values;
        int i;
        String str;
        if (map != null && (values = map.values()) != null) {
            List j = C89070n.m154590j(values);
            C89219l.m154721d(j, "");
            CharSequence b = C55197c.m100919b();
            C89219l.m154716b(b, "");
            ArrayList arrayList = new ArrayList();
            Iterator it = j.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                C19638h hVar = (C19638h) next;
                if (hVar.isGroupChat()) {
                    C19639i coreInfo = hVar.getCoreInfo();
                    if (coreInfo == null || (str = String.valueOf(coreInfo.getOwner())) == null) {
                        str = "";
                    }
                    if (C89219l.m154714a((Object) str, (Object) b)) {
                        arrayList.add(next);
                    }
                }
            }
            ArrayList<C19638h> arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList2, 10));
            for (C19638h hVar2 : arrayList2) {
                arrayList3.add(Long.valueOf(hVar2.getConversationShortId()));
            }
            ArrayList arrayList4 = arrayList3;
            int size = arrayList4.size() / 100;
            if (size >= 0) {
                while (true) {
                    int i2 = i * 100;
                    m101173a(arrayList4.subList(i2, C89271h.m154772c(arrayList4.size(), i2 + 100)), C89086z.INSTANCE, C55369d.f126594a);
                    if (i != size) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m101173a(List<Long> list, List<Long> list2, AbstractC89172b<? super C19474a, C89391z> bVar) {
        if (list != null && !list.isEmpty()) {
            C19464a.m36302a();
            C55365c cVar = new C55365c(bVar, list2);
            C19512f.m36450a("imsdk", "getUnReadAuditByConShortIds", (Throwable) null);
            new C19468b(cVar).mo31798a(0, new RequestBody.Builder().addExtension(2042, BatchGetConversationAuditUnreadRequestBody.ADAPTER, new BatchGetConversationAuditUnreadRequestBody.Builder().conv_short_id(list).build()).build(), null, new Object[0]);
        }
    }
}
