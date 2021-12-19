package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core;

import android.content.ContentValues;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.net.C39151f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55219n;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3190a.C55266b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3191b.EnumC55267a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3192c.C55271a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.fetch.C55834a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.fetch.model.FamiliarRelation;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.fetch.model.FamiliarsRelationFetchResponse;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.p3223b.C55730a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.p3223b.C55731b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.p3223b.C55735d;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89064i;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.c */
public final class C55804c implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    static Map<Integer, C55805a> f127229a = new LinkedHashMap();

    /* renamed from: b */
    static volatile boolean f127230b;

    /* renamed from: c */
    public static final C55804c f127231c;

    /* renamed from: d */
    private static final C55731b f127232d = C55731b.f127107c;

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(178, new RunnableC90250g(C55804c.class, "onEvent", C39151f.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    private C55804c() {
    }

    /* renamed from: b */
    public static boolean m101586b() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    static {
        Covode.recordClassIndex(65590);
        C55804c cVar = new C55804c();
        f127231c = cVar;
        EventBus.m156966a(EventBus.m156962a(), cVar);
    }

    /* renamed from: a */
    public static void m101584a() {
        AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C89546bf.f203267b), null, null, new C55806b(null), 3);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.c$a */
    public static final class C55805a {

        /* renamed from: a */
        public int f127233a;

        /* renamed from: b */
        public int f127234b;

        /* renamed from: c */
        public int f127235c;

        /* renamed from: d */
        public boolean f127236d = true;

        static {
            Covode.recordClassIndex(65591);
        }

        public C55805a(int i) {
            this.f127233a = i;
        }
    }

    @AbstractC90264r
    public final void onEvent(C39151f fVar) {
        if (f127230b) {
            m101584a();
            f127230b = false;
        }
    }

    /* renamed from: a */
    static FamiliarsRelationFetchResponse m101583a(String str) {
        int i = 0;
        do {
            try {
                return C55834a.f127267a.getSpotlightRelationOfFriends(str).get();
            } catch (Throwable unused) {
                i++;
                if (i >= 2) {
                    return null;
                }
            }
        } while (i >= 2);
        return null;
    }

    /* renamed from: a */
    static boolean m101585a(FamiliarRelation familiarRelation) {
        C89219l.m154721d(familiarRelation, "");
        int relationType = familiarRelation.getRelationType();
        List<String> secUserIds = familiarRelation.getSecUserIds();
        C89219l.m154716b(secUserIds, "");
        List<Long> createdTimes = familiarRelation.getCreatedTimes();
        if (createdTimes == null) {
            int size = familiarRelation.getSecUserIds().size();
            Long[] lArr = new Long[size];
            for (int i = 0; i < size; i++) {
                lArr[i] = 0L;
            }
            createdTimes = C89064i.m154508i(lArr);
        }
        C55730a aVar = new C55730a(relationType, secUserIds, createdTimes);
        int i2 = 0;
        do {
            try {
                C55271a.m101036a();
                if (aVar.getSecUserIds().size() == 0) {
                    return true;
                }
                List<String> secUserIds2 = aVar.getSecUserIds();
                List<Long> createdTimes2 = aVar.getCreatedTimes();
                if (secUserIds2.size() != createdTimes2.size()) {
                    C56244a.m102193e("FriendsRelationDao", "sec user and created time not match");
                    return true;
                }
                C55266b.m101026a().mo92265b();
                int relationType2 = aVar.getRelationType();
                for (int i3 = 0; i3 < aVar.getSecUserIds().size(); i3++) {
                    String str = secUserIds2.get(i3);
                    long longValue = createdTimes2.get(i3).longValue();
                    if (str != null) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(EnumC55267a.COLUMN_RELATION_TYPE.key, Integer.valueOf(relationType2));
                        contentValues.put(EnumC55267a.COLUMN_SEC_UID.key, str);
                        contentValues.put(EnumC55267a.COLUMN_CREATED_TIME.key, Long.valueOf(longValue));
                        C55266b.m101026a().mo92262a("FRIENDS_RELATION", contentValues);
                    }
                }
                C55266b.m101026a().mo92266c();
                return true;
            } catch (Throwable unused) {
                i2++;
                if (i2 >= 2) {
                    return false;
                }
            }
        } while (i2 >= 2);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.c$b */
    public static final class C55806b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f127237a;

        static {
            Covode.recordClassIndex(65592);
        }

        C55806b(AbstractC89124d dVar) {
            super(2, dVar);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C55806b(dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C55806b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            List<FamiliarRelation> relations;
            boolean z;
            if (this.f127237a == 0) {
                C89382r.m154942a(obj);
                C55219n a = C55219n.m100965a();
                C89219l.m154716b(a, "");
                if (System.currentTimeMillis() - a.f126297a.getLong("last_friends_relation_fetch_time", 0) >= ((long) (C55731b.f127105a * 1000))) {
                    C17867d.m33078a();
                    if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                        C58029j.f132256h = C55804c.m101586b();
                    }
                    if (!C58029j.f132256h) {
                        C55804c.f127230b = true;
                    } else {
                        C55804c.f127229a.clear();
                        C55271a.m101036a();
                        C55266b.m101026a().mo92267c("FRIENDS_RELATION");
                        C55735d[] dVarArr = C55731b.f127106b;
                        if (dVarArr == null) {
                            C89219l.m154715b();
                        }
                        for (C55735d dVar : dVarArr) {
                            C55804c.f127229a.put(Integer.valueOf(dVar.f127124a), new C55805a(dVar.f127124a));
                        }
                        while (C55197c.m100917a()) {
                            JSONArray jSONArray = new JSONArray();
                            for (Map.Entry<Integer, C55805a> entry : C55804c.f127229a.entrySet()) {
                                C55805a value = entry.getValue();
                                if (value.f127236d) {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("relation_type", value.f127233a);
                                    jSONObject.put("count", value.f127234b);
                                    jSONObject.put("cursor", value.f127235c);
                                    jSONArray.put(jSONObject);
                                }
                            }
                            String jSONArray2 = jSONArray.toString();
                            C89219l.m154716b(jSONArray2, "");
                            FamiliarsRelationFetchResponse a2 = C55804c.m101583a(jSONArray2);
                            if (a2 != null && (relations = a2.getRelations()) != null) {
                                boolean z2 = false;
                                for (FamiliarRelation familiarRelation : relations) {
                                    C89219l.m154716b(familiarRelation, "");
                                    if (C55804c.m101585a(familiarRelation)) {
                                        C55805a aVar = C55804c.f127229a.get(Integer.valueOf(familiarRelation.getRelationType()));
                                        if (aVar != null) {
                                            if (familiarRelation.getHasMore() == 1) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            aVar.f127236d = z;
                                            aVar.f127235c = familiarRelation.getNextCursor();
                                        }
                                        if (familiarRelation.getHasMore() == 1) {
                                            z2 = true;
                                        }
                                    }
                                }
                                if (!z2) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        C55219n a3 = C55219n.m100965a();
                        C89219l.m154716b(a3, "");
                        a3.f126297a.edit().putLong("last_friends_relation_fetch_time", System.currentTimeMillis()).commit();
                    }
                }
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
