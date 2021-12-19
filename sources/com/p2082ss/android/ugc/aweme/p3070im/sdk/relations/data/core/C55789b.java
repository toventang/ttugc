package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3192c.C55271a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3192c.C55273c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55766f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.p3223b.C55735d;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.b */
public final class C55789b extends AbstractC55766f<IMUser, IMContact> {

    /* renamed from: e */
    public static final C55791b f127210e = new C55791b((byte) 0);

    /* renamed from: a */
    public List<String> f127211a;

    /* renamed from: b */
    public AbstractC89171a<? extends List<String>> f127212b;

    /* renamed from: c */
    public String f127213c;

    /* renamed from: d */
    public C55735d[] f127214d;

    /* renamed from: f */
    private final AbstractC89172b<IMUser, IMContact> f127215f;

    /* renamed from: r */
    private final AbstractC89172b<List<? extends IMUser>, List<IMContact>> f127216r;

    static {
        Covode.recordClassIndex(65575);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.b$a */
    public static final class C55790a extends AbstractC55766f.AbstractC55767a<C55789b, IMUser, IMContact> {

        /* renamed from: a */
        public final C55789b f127217a = new C55789b((byte) 0);

        static {
            Covode.recordClassIndex(65576);
        }

        /* Return type fixed from 'com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f' to match base method */
        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55766f.AbstractC55767a
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C55789b mo92638a() {
            return this.f127217a;
        }

        /* Return type fixed from 'com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f' to match base method */
        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55766f.AbstractC55767a
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ C55789b mo92639b() {
            return this.f127217a;
        }

        /* renamed from: a */
        public final C55790a mo92656a(C55735d[] dVarArr) {
            this.f127217a.f127214d = dVarArr;
            return this;
        }

        /* renamed from: a */
        public final C55790a mo92654a(AbstractC89171a<? extends List<String>> aVar) {
            C89219l.m154721d(aVar, "");
            this.f127217a.f127212b = aVar;
            return this;
        }

        /* renamed from: a */
        public final C55790a mo92655a(String str) {
            C89219l.m154721d(str, "");
            this.f127217a.f127213c = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.b$b */
    public static final class C55791b {
        static {
            Covode.recordClassIndex(65577);
        }

        private C55791b() {
        }

        public /* synthetic */ C55791b(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55766f
    /* renamed from: a */
    public final AbstractC89172b<IMUser, IMContact> mo92632a() {
        return this.f127215f;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55766f
    /* renamed from: d */
    public final List<IMUser> mo92634d() {
        throw new UnsupportedOperationException("FamiliarsLoader not support load more");
    }

    private C55789b() {
        this.f127215f = C55793d.f127219a;
        this.f127216r = C55792c.f127218a;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55766f, com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55765e
    /* renamed from: b */
    public final boolean mo92623b() {
        String str;
        if (!super.mo92623b() || (str = this.f127213c) == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55766f
    /* renamed from: c */
    public final List<IMUser> mo92633c() {
        List<String> list;
        C55271a.m101036a();
        Map<String, Integer> c = C55271a.m101038c();
        if (c.isEmpty()) {
            return new ArrayList();
        }
        C55273c.m101041a();
        AbstractC89171a<? extends List<String>> aVar = this.f127212b;
        if (aVar == null || (list = (List) aVar.invoke()) == null) {
            list = this.f127211a;
        }
        if (this.f127189n < 0) {
            this.f127189n = 100;
        }
        List<IMUser> a = C55273c.m101047a(list, this.f127189n + 5, 0, this.f127213c);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C55735d[] dVarArr = this.f127214d;
        if (dVarArr != null) {
            for (C55735d dVar : dVarArr) {
                linkedHashMap.put(Integer.valueOf(dVar.f127124a), dVar.f127125b);
            }
        }
        ArrayList arrayList = new ArrayList();
        C89219l.m154716b(a, "");
        for (T t : a) {
            if ((t instanceof IMUser) && c.keySet().contains(t.getSecUid())) {
                t.setRecType((String) linkedHashMap.get(c.get(t.getSecUid())));
                arrayList.add(t);
            }
        }
        if (arrayList.size() > 1) {
            C89070n.m154530a((List) arrayList, (Comparator) new C55794e(linkedHashMap, c));
        }
        C56244a.m102191c("FamiliarsLoader", "loadInternal: " + arrayList.size());
        return arrayList;
    }

    public /* synthetic */ C55789b(byte b) {
        this();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.b$c */
    static final class C55792c extends AbstractC89220m implements AbstractC89172b<List<? extends IMUser>, List<? extends IMUser>> {

        /* renamed from: a */
        public static final C55792c f127218a = new C55792c();

        static {
            Covode.recordClassIndex(65578);
        }

        C55792c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ List<? extends IMUser> invoke(List<? extends IMUser> list) {
            C89219l.m154721d(list, "");
            return list;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.b$d */
    static final class C55793d extends AbstractC89220m implements AbstractC89172b<IMUser, IMUser> {

        /* renamed from: a */
        public static final C55793d f127219a = new C55793d();

        static {
            Covode.recordClassIndex(65579);
        }

        C55793d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ IMUser invoke(IMUser iMUser) {
            C89219l.m154721d(iMUser, "");
            return iMUser;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.b$e */
    public static final class C55794e<T> implements Comparator {

        /* renamed from: a */
        final /* synthetic */ Map f127220a;

        /* renamed from: b */
        final /* synthetic */ Map f127221b;

        static {
            Covode.recordClassIndex(65580);
        }

        public C55794e(Map map, Map map2) {
            this.f127220a = map;
            this.f127221b = map2;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C89090a.m154604a((String) this.f127220a.get(this.f127221b.get(t.getSecUid())), (String) this.f127220a.get(this.f127221b.get(t2.getSecUid())));
        }
    }
}
