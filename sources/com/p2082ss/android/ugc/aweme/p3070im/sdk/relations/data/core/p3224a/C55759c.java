package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3192c.C55273c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55766f;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import java.util.List;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.c */
public final class C55759c extends AbstractC55766f<IMUser, IMContact> {

    /* renamed from: f */
    public static final C55761b f127168f = new C55761b((byte) 0);

    /* renamed from: a */
    public List<String> f127169a;

    /* renamed from: b */
    public AbstractC89171a<? extends List<String>> f127170b;

    /* renamed from: c */
    public String f127171c;

    /* renamed from: d */
    public boolean f127172d;

    /* renamed from: e */
    public int f127173e;

    /* renamed from: r */
    private final AbstractC89172b<IMUser, IMContact> f127174r;

    /* renamed from: s */
    private final AbstractC89172b<List<? extends IMUser>, List<IMContact>> f127175s;

    static {
        Covode.recordClassIndex(65545);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.c$a */
    public static final class C55760a extends AbstractC55766f.AbstractC55767a<C55759c, IMUser, IMContact> {

        /* renamed from: a */
        public final C55759c f127176a = new C55759c((byte) 0);

        static {
            Covode.recordClassIndex(65546);
        }

        /* Return type fixed from 'com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f' to match base method */
        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55766f.AbstractC55767a
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C55759c mo92638a() {
            return this.f127176a;
        }

        /* Return type fixed from 'com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f' to match base method */
        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55766f.AbstractC55767a
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ C55759c mo92639b() {
            return this.f127176a;
        }

        /* renamed from: a */
        public final C55760a mo92637a(boolean z) {
            this.f127176a.f127172d = z;
            return this;
        }

        /* renamed from: a */
        public final C55760a mo92635a(AbstractC89171a<? extends List<String>> aVar) {
            C89219l.m154721d(aVar, "");
            this.f127176a.f127170b = aVar;
            return this;
        }

        /* renamed from: a */
        public final C55760a mo92636a(String str) {
            C89219l.m154721d(str, "");
            this.f127176a.f127171c = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.c$b */
    public static final class C55761b {
        static {
            Covode.recordClassIndex(65547);
        }

        private C55761b() {
        }

        public /* synthetic */ C55761b(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55766f
    /* renamed from: a */
    public final AbstractC89172b<IMUser, IMContact> mo92632a() {
        return this.f127174r;
    }

    private C55759c() {
        this.f127174r = C55763d.f127178a;
        this.f127175s = C55762c.f127177a;
    }

    /* renamed from: i */
    private final List<String> m101516i() {
        List<String> list;
        AbstractC89171a<? extends List<String>> aVar = this.f127170b;
        if (aVar == null || (list = (List) aVar.invoke()) == null) {
            return this.f127169a;
        }
        return list;
    }

    /* renamed from: j */
    private final int m101517j() {
        if (this.f127172d) {
            return -1;
        }
        if (this.f127189n < 0) {
            this.f127189n = 100;
        }
        return this.f127189n + 5;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55766f, com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55765e
    /* renamed from: b */
    public final boolean mo92623b() {
        String str;
        if (!super.mo92623b() || (str = this.f127171c) == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55766f
    /* renamed from: d */
    public final List<IMUser> mo92634d() {
        if (!this.f127172d) {
            int j = m101517j();
            C55273c.m101041a();
            List<IMUser> a = C55273c.m101047a(m101516i(), j, this.f127173e * j, this.f127171c);
            C56244a.m102191c("FollowLoader", "loadMoreInternal: " + a.size() + " pageIndex:" + this.f127173e + " pageSize:" + j);
            this.f127173e++;
            return a;
        }
        throw new UnsupportedOperationException("Weight sort mode not support load more!");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00a4  */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55766f
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser> mo92633c() {
        /*
        // Method dump skipped, instructions count: 245
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.C55759c.mo92633c():java.util.List");
    }

    public /* synthetic */ C55759c(byte b) {
        this();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.c$c */
    static final class C55762c extends AbstractC89220m implements AbstractC89172b<List<? extends IMUser>, List<? extends IMUser>> {

        /* renamed from: a */
        public static final C55762c f127177a = new C55762c();

        static {
            Covode.recordClassIndex(65548);
        }

        C55762c() {
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

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.c$d */
    static final class C55763d extends AbstractC89220m implements AbstractC89172b<IMUser, IMUser> {

        /* renamed from: a */
        public static final C55763d f127178a = new C55763d();

        static {
            Covode.recordClassIndex(65549);
        }

        C55763d() {
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
}
