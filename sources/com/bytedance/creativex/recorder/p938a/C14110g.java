package com.bytedance.creativex.recorder.p938a;

import androidx.lifecycle.AbstractC1214u;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p938a.p939a.AbstractC14099a;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.p2082ss.android.ugc.asve.p2217f.C31098f;
import com.p2082ss.android.ugc.asve.wrap.AbstractC31262b;
import com.p2082ss.android.ugc.asve.wrap.C31261a;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p2082ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.p2082ss.android.ugc.aweme.tools.beauty.BeautyCategoryExtra;
import com.p2082ss.android.ugc.aweme.tools.beauty.C77878d;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.C77972o;
import com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78056f;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.creativex.recorder.a.g */
public final class C14110g {

    /* renamed from: j */
    public static final C14111a f34307j = new C14111a((byte) 0);

    /* renamed from: a */
    public boolean f34308a;

    /* renamed from: b */
    public boolean f34309b;

    /* renamed from: c */
    public boolean f34310c;

    /* renamed from: d */
    public final C0484a<String, Boolean> f34311d = new C0484a<>();

    /* renamed from: e */
    long f34312e;

    /* renamed from: f */
    public final AbstractC78056f.AbstractC78058b f34313f = new C14113c(this);

    /* renamed from: g */
    public final AbstractC14177d f34314g;

    /* renamed from: h */
    public final AbstractC14099a f34315h;

    /* renamed from: i */
    public final AbstractC89172b<Boolean, C89391z> f34316i;

    static {
        Covode.recordClassIndex(16179);
    }

    /* renamed from: com.bytedance.creativex.recorder.a.g$a */
    public static final class C14111a {
        static {
            Covode.recordClassIndex(16180);
        }

        private C14111a() {
        }

        public /* synthetic */ C14111a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo22663a() {
        C31098f.m64301a(new C14112b(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.creativex.recorder.a.g$b */
    public static final class C14112b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C14110g f34317a;

        static {
            Covode.recordClassIndex(16181);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14112b(C14110g gVar) {
            super(0);
            this.f34317a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (!this.f34317a.f34308a || !this.f34317a.f34310c || this.f34317a.f34309b) {
                this.f34317a.f34316i.invoke(false);
            } else {
                this.f34317a.f34316i.invoke(true);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public final void mo22664b() {
        boolean z;
        Iterator<Map.Entry<String, Boolean>> it = this.f34311d.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Boolean value = it.next().getValue();
            C89219l.m154716b(value, "");
            if (value.booleanValue()) {
                z = true;
                break;
            }
        }
        if (this.f34308a != z) {
            this.f34308a = z;
            mo22663a();
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.a.g$c */
    public static final class C14113c implements AbstractC78056f.AbstractC78058b {

        /* renamed from: a */
        final /* synthetic */ C14110g f34318a;

        static {
            Covode.recordClassIndex(16182);
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78056f.AbstractC78058b
        /* renamed from: a */
        public final void mo22667a(ComposerBeauty composerBeauty, List<String> list) {
            C89219l.m154721d(composerBeauty, "");
            C89219l.m154721d(list, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78056f.AbstractC78058b
        /* renamed from: b */
        public final void mo22669b(ComposerBeauty composerBeauty) {
            C89219l.m154721d(composerBeauty, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78056f.AbstractC78058b
        /* renamed from: b */
        public final void mo22670b(ComposerBeauty composerBeauty, List<String> list) {
            C89219l.m154721d(composerBeauty, "");
            C89219l.m154721d(list, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C14113c(C14110g gVar) {
            this.f34318a = gVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78056f.AbstractC78058b
        /* renamed from: a */
        public final void mo22665a(ComposerBeauty composerBeauty) {
            C89219l.m154721d(composerBeauty, "");
            if (C77878d.m136005g(composerBeauty) && composerBeauty != null) {
                this.f34318a.f34311d.clear();
                this.f34318a.mo22664b();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78056f.AbstractC78058b
        /* renamed from: a */
        public final void mo22668a(BeautyCategory beautyCategory) {
            Boolean bool;
            C89219l.m154721d(beautyCategory, "");
            C14110g gVar = this.f34318a;
            BeautyCategoryExtra beautyCategoryExtra = beautyCategory.getBeautyCategoryExtra();
            if (beautyCategoryExtra != null) {
                bool = Boolean.valueOf(beautyCategoryExtra.getShowTips());
            } else {
                bool = null;
            }
            gVar.f34310c = bool.booleanValue();
            this.f34318a.mo22663a();
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.service.AbstractC78056f.AbstractC78058b
        /* renamed from: a */
        public final void mo22666a(ComposerBeauty composerBeauty, int i, List<String> list) {
            boolean z;
            C89219l.m154721d(composerBeauty, "");
            C89219l.m154721d(list, "");
            BeautyCategoryExtra categoryExtra = composerBeauty.getCategoryExtra();
            if (categoryExtra != null && categoryExtra.getShowTips()) {
                C0484a<String, Boolean> aVar = this.f34318a.f34311d;
                String resourceId = composerBeauty.getEffect().getResourceId();
                if (i != 0) {
                    z = true;
                } else {
                    z = false;
                }
                aVar.put(resourceId, Boolean.valueOf(z));
                this.f34318a.mo22664b();
            }
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.a.g$e */
    public static final class C14115e implements AbstractC31262b {

        /* renamed from: a */
        final /* synthetic */ C14110g f34320a;

        static {
            Covode.recordClassIndex(16184);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C14115e(C14110g gVar) {
            this.f34320a = gVar;
        }

        @Override // com.p2082ss.android.ugc.asve.wrap.AbstractC31262b
        /* renamed from: a */
        public final void mo22671a(C31261a[] aVarArr) {
            boolean z;
            C14110g gVar = this.f34320a;
            if (aVarArr == null || aVarArr.length == 0) {
                z = false;
            } else {
                z = true;
            }
            gVar.f34309b = z;
            C14110g gVar2 = this.f34320a;
            if (System.currentTimeMillis() - gVar2.f34312e >= 1000) {
                gVar2.f34312e = System.currentTimeMillis();
                this.f34320a.mo22663a();
            }
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.a.g$d */
    static final class C14114d<T> implements AbstractC1214u<C77972o<ComposerBeauty>> {

        /* renamed from: a */
        final /* synthetic */ C14110g f34319a;

        static {
            Covode.recordClassIndex(16183);
        }

        C14114d(C14110g gVar) {
            this.f34319a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(C77972o<ComposerBeauty> oVar) {
            BeautyCategoryExtra categoryExtra;
            boolean z;
            C77972o<ComposerBeauty> oVar2 = oVar;
            if (oVar2 != null) {
                for (ComposerBeauty composerBeauty : oVar2) {
                    if (!(composerBeauty == null || (categoryExtra = composerBeauty.getCategoryExtra()) == null || !categoryExtra.getShowTips())) {
                        C0484a<String, Boolean> aVar = this.f34319a.f34311d;
                        String resourceId = composerBeauty.getEffect().getResourceId();
                        if (composerBeauty.getProgressValue() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        aVar.put(resourceId, Boolean.valueOf(z));
                        this.f34319a.mo22664b();
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super java.lang.Boolean, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C14110g(AbstractC14177d dVar, AbstractC14099a aVar, AbstractC89172b<? super Boolean, C89391z> bVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        this.f34314g = dVar;
        this.f34315h = aVar;
        this.f34316i = bVar;
    }
}
