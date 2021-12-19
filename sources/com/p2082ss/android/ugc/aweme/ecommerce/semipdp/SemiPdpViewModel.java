package com.p2082ss.android.ugc.aweme.ecommerce.semipdp;

import android.content.Context;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.router.SmartRouter;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.p2082ss.android.ugc.aweme.ecommerce.p2819ab.C43331n;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44773c;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44775e;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44787p;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductBase;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPrice;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ThirdParty;
import com.p2082ss.android.ugc.aweme.ecommerce.router.C45264j;
import com.p2082ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.semipdp.p2856b.C45341a;
import com.p2082ss.android.ugc.aweme.ecommerce.semipdp.repository.C45362b;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45572m;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89378p;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpViewModel */
public final class SemiPdpViewModel extends JediViewModel<SemiPdpState> {

    /* renamed from: a */
    public ProductPackStruct f105580a;

    /* renamed from: b */
    public SemiPdpStarter.SemiPdpEnterParams f105581b;

    /* renamed from: c */
    Keva f105582c;

    /* renamed from: d */
    public boolean f105583d;

    /* renamed from: e */
    public boolean f105584e;

    /* renamed from: f */
    public boolean f105585f;

    /* renamed from: g */
    public String f105586g = "return";

    /* renamed from: k */
    public boolean f105587k;

    /* renamed from: l */
    public int f105588l = 4;

    /* renamed from: m */
    public final HashSet<Image> f105589m = new HashSet<>();

    /* renamed from: n */
    public C45349j f105590n;

    static {
        Covode.recordClassIndex(53757);
    }

    /* renamed from: i */
    private static boolean m87891i() {
        if (!C43331n.m86449a()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final C45349j mo76402a() {
        C45349j jVar = this.f105590n;
        if (jVar == null) {
            C89219l.m154710a("logger");
        }
        return jVar;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ SemiPdpState mo23027d() {
        return new SemiPdpState(false, null, false, 0, null, 0, null, 127, null);
    }

    /* renamed from: b */
    public final void mo76409b() {
        HashMap<String, Object> requestParams;
        SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams = this.f105581b;
        if (semiPdpEnterParams != null && (requestParams = semiPdpEnterParams.getRequestParams()) != null) {
            mo76410b(0);
            SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams2 = this.f105581b;
            if (semiPdpEnterParams2 == null) {
                C89219l.m154715b();
            }
            C45362b.m87933a(semiPdpEnterParams2, 0).f105697a.mo143254a(new C45300b(requestParams, this), new C45301c(requestParams, this));
        }
    }

    /* renamed from: g */
    public final boolean mo76411g() {
        String str;
        ThirdParty thirdParty;
        try {
            Keva repo = Keva.getRepo("ecom_keva_store");
            this.f105582c = repo;
            if (repo != null) {
                StringBuilder sb = new StringBuilder("notice_sheet_");
                ProductPackStruct productPackStruct = this.f105580a;
                if (productPackStruct == null || (thirdParty = productPackStruct.f104688p) == null) {
                    str = null;
                } else {
                    str = thirdParty.f104716a;
                }
                if (repo.getBoolean(sb.append(str).toString(), false)) {
                    return false;
                }
            }
        } catch (Throwable unused) {
            C22708a.m42800a("Keva Get Notice Sheet Shown Fail");
        }
        return true;
    }

    /* renamed from: h */
    public final HashMap<String, Object> mo76412h() {
        int i;
        String str;
        ProductBase productBase;
        ProductPrice productPrice;
        String str2;
        ProductBase productBase2;
        ProductPrice productPrice2;
        Integer num;
        HashMap<String, Object> hashMap = new HashMap<>();
        ProductPackStruct productPackStruct = this.f105580a;
        if (productPackStruct == null || (num = productPackStruct.f104675c) == null) {
            i = 1;
        } else {
            i = num.intValue();
        }
        hashMap.put("product_type", Integer.valueOf(i));
        ProductPackStruct productPackStruct2 = this.f105580a;
        String str3 = "";
        if (productPackStruct2 == null || (productBase2 = productPackStruct2.f104677e) == null || (productPrice2 = productBase2.f104663g) == null || (str = productPrice2.f104697a) == null) {
            str = str3;
        }
        hashMap.put("original_price", str);
        ProductPackStruct productPackStruct3 = this.f105580a;
        if (!(productPackStruct3 == null || (productBase = productPackStruct3.f104677e) == null || (productPrice = productBase.f104663g) == null || (str2 = productPrice.f104698b) == null)) {
            str3 = str2;
        }
        hashMap.put("sale_price", str3);
        return hashMap;
    }

    /* renamed from: a */
    public final void mo76407a(String str) {
        C89219l.m154721d(str, "");
        this.f105586g = str;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpViewModel$c */
    static final class C45301c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ HashMap f105594a;

        /* renamed from: b */
        final /* synthetic */ SemiPdpViewModel f105595b;

        static {
            Covode.recordClassIndex(53760);
        }

        C45301c(HashMap hashMap, SemiPdpViewModel semiPdpViewModel) {
            this.f105594a = hashMap;
            this.f105595b = semiPdpViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f105595b.mo76410b(3);
            C45362b.m87934a(this.f105594a);
        }
    }

    /* renamed from: b */
    public final void mo76410b(int i) {
        mo33689c(new C45304f(i));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpViewModel$a */
    static final class C45299a extends AbstractC89220m implements AbstractC89172b<SemiPdpState, SemiPdpState> {

        /* renamed from: a */
        public static final C45299a f105591a = new C45299a();

        static {
            Covode.recordClassIndex(53758);
        }

        C45299a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ SemiPdpState invoke(SemiPdpState semiPdpState) {
            SemiPdpState semiPdpState2 = semiPdpState;
            C89219l.m154721d(semiPdpState2, "");
            return SemiPdpState.copy$default(semiPdpState2, true, null, false, 0, null, 0, null, 126, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpViewModel$e */
    static final class C45303e extends AbstractC89220m implements AbstractC89172b<SemiPdpState, SemiPdpState> {

        /* renamed from: a */
        final /* synthetic */ boolean f105598a;

        static {
            Covode.recordClassIndex(53762);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45303e(boolean z) {
            super(1);
            this.f105598a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ SemiPdpState invoke(SemiPdpState semiPdpState) {
            SemiPdpState semiPdpState2 = semiPdpState;
            C89219l.m154721d(semiPdpState2, "");
            return SemiPdpState.copy$default(semiPdpState2, false, null, this.f105598a, 0, null, 0, null, 123, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpViewModel$f */
    public static final class C45304f extends AbstractC89220m implements AbstractC89172b<SemiPdpState, SemiPdpState> {

        /* renamed from: a */
        final /* synthetic */ int f105599a;

        static {
            Covode.recordClassIndex(53763);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45304f(int i) {
            super(1);
            this.f105599a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ SemiPdpState invoke(SemiPdpState semiPdpState) {
            SemiPdpState semiPdpState2 = semiPdpState;
            C89219l.m154721d(semiPdpState2, "");
            return SemiPdpState.copy$default(semiPdpState2, false, null, false, 0, Integer.valueOf(this.f105599a), 0, null, 111, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpViewModel$h */
    static final class C45306h extends AbstractC89220m implements AbstractC89172b<SemiPdpState, SemiPdpState> {

        /* renamed from: a */
        final /* synthetic */ int f105602a;

        static {
            Covode.recordClassIndex(53765);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45306h(int i) {
            super(1);
            this.f105602a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ SemiPdpState invoke(SemiPdpState semiPdpState) {
            SemiPdpState semiPdpState2 = semiPdpState;
            C89219l.m154721d(semiPdpState2, "");
            return SemiPdpState.copy$default(semiPdpState2, false, null, false, this.f105602a, null, 0, null, 119, null);
        }
    }

    /* renamed from: b */
    public static void m87890b(Context context) {
        if (!(context instanceof ActivityC0945e)) {
            context = null;
        }
        ActivityC0945e eVar = (ActivityC0945e) context;
        if (eVar != null) {
            new C23144b(eVar).mo37640e(R.string.bfr).mo37634a(3000L).mo37637b();
        }
    }

    /* renamed from: a */
    public final void mo76403a(int i) {
        mo33689c(new C45305g(this, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpViewModel$g */
    public static final class C45305g extends AbstractC89220m implements AbstractC89172b<SemiPdpState, SemiPdpState> {

        /* renamed from: a */
        final /* synthetic */ SemiPdpViewModel f105600a;

        /* renamed from: b */
        final /* synthetic */ int f105601b;

        static {
            Covode.recordClassIndex(53764);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45305g(SemiPdpViewModel semiPdpViewModel, int i) {
            super(1);
            this.f105600a = semiPdpViewModel;
            this.f105601b = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ SemiPdpState invoke(SemiPdpState semiPdpState) {
            SemiPdpState semiPdpState2 = semiPdpState;
            C89219l.m154721d(semiPdpState2, "");
            int i = this.f105601b;
            int i2 = 3;
            if (i != 0) {
                if (i == 23002002) {
                    i2 = 4;
                } else if (i == 23002102) {
                    i2 = 5;
                }
            } else if (this.f105600a.f105580a != null) {
                i2 = -1;
            }
            return SemiPdpState.copy$default(semiPdpState2, false, null, false, 0, Integer.valueOf(i2), 0, null, 111, null);
        }
    }

    /* renamed from: a */
    public final void mo76406a(ProductPackStruct productPackStruct) {
        C89219l.m154721d(productPackStruct, "");
        this.f105580a = productPackStruct;
        mo33689c(new C45302d(this, productPackStruct));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpViewModel$b */
    static final class C45300b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ HashMap f105592a;

        /* renamed from: b */
        final /* synthetic */ SemiPdpViewModel f105593b;

        static {
            Covode.recordClassIndex(53759);
        }

        C45300b(HashMap hashMap, SemiPdpViewModel semiPdpViewModel) {
            this.f105592a = hashMap;
            this.f105593b = semiPdpViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            SemiPdpViewModel semiPdpViewModel;
            int i;
            T t;
            List<ProductPackStruct> list;
            T t2 = ((C22099u) obj).f52262b;
            if (!t2.isCodeOK() || (t = t2.data) == null || (list = t.f104725a) == null || C89070n.m154583g((List) list) == null) {
                semiPdpViewModel = this.f105593b;
                if (t2.isCodeOK()) {
                    i = -99999;
                } else {
                    i = t2.code;
                }
            } else {
                this.f105593b.mo76406a((ProductPackStruct) C89070n.m154579f((List) t2.data.f104725a));
                semiPdpViewModel = this.f105593b;
                i = 0;
            }
            semiPdpViewModel.mo76403a(i);
            C45362b.m87934a(this.f105592a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpViewModel$d */
    public static final class C45302d extends AbstractC89220m implements AbstractC89172b<SemiPdpState, SemiPdpState> {

        /* renamed from: a */
        final /* synthetic */ SemiPdpViewModel f105596a;

        /* renamed from: b */
        final /* synthetic */ ProductPackStruct f105597b;

        static {
            Covode.recordClassIndex(53761);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45302d(SemiPdpViewModel semiPdpViewModel, ProductPackStruct productPackStruct) {
            super(1);
            this.f105596a = semiPdpViewModel;
            this.f105597b = productPackStruct;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ SemiPdpState invoke(SemiPdpState semiPdpState) {
            String str;
            String str2;
            String str3;
            int i;
            String str4;
            ProductPrice productPrice;
            ProductPrice productPrice2;
            SemiPdpState semiPdpState2 = semiPdpState;
            String str5 = "";
            C89219l.m154721d(semiPdpState2, str5);
            ProductPackStruct productPackStruct = this.f105597b;
            ArrayList arrayList = new ArrayList();
            arrayList.add(C44773c.m87496a(productPackStruct));
            ThirdParty thirdParty = productPackStruct.f104688p;
            if (thirdParty != null) {
                str = thirdParty.f104720e;
            } else {
                str = null;
            }
            C89219l.m154721d(productPackStruct, str5);
            ProductBase productBase = productPackStruct.f104677e;
            if (productBase == null || (productPrice2 = productBase.f104663g) == null || (str2 = productPrice2.f104698b) == null) {
                str2 = str5;
            }
            ProductBase productBase2 = productPackStruct.f104677e;
            if (productBase2 == null || (productPrice = productBase2.f104663g) == null || (str3 = productPrice.f104697a) == null) {
                str3 = str5;
            }
            ProductBase productBase3 = productPackStruct.f104677e;
            if (!(productBase3 == null || (str4 = productBase3.f104657a) == null)) {
                str5 = str4;
            }
            arrayList.add(new C45341a(str2, str3, str5, str));
            if (productPackStruct.f104676d != null) {
                arrayList.add(C44787p.m87503a(productPackStruct));
            }
            arrayList.addAll(C44775e.m87497a(productPackStruct, false));
            Integer num = this.f105597b.f104675c;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 1;
            }
            return SemiPdpState.copy$default(semiPdpState2, false, arrayList, false, 0, null, i, this.f105597b.f104690r, 29, null);
        }
    }

    /* renamed from: a */
    public final void mo76404a(Context context) {
        String str;
        ProductPackStruct productPackStruct;
        ThirdParty thirdParty;
        ThirdParty thirdParty2;
        String str2;
        ThirdParty thirdParty3;
        ThirdParty thirdParty4;
        if (context != null) {
            ProductPackStruct productPackStruct2 = this.f105580a;
            String str3 = null;
            if (productPackStruct2 == null || (thirdParty4 = productPackStruct2.f104688p) == null) {
                str = null;
            } else {
                str = thirdParty4.f104716a;
            }
            ProductPackStruct productPackStruct3 = this.f105580a;
            if (!(productPackStruct3 == null || (thirdParty3 = productPackStruct3.f104688p) == null)) {
                str3 = thirdParty3.f104717b;
            }
            if (str == null || (productPackStruct = this.f105580a) == null || (thirdParty = productPackStruct.f104688p) == null || thirdParty.f104717b == null) {
                m87890b(context);
                return;
            }
            this.f105586g = "next";
            if (m87891i()) {
                C45349j jVar = this.f105590n;
                if (jVar == null) {
                    C89219l.m154710a("logger");
                } else {
                    jVar.mo76428a("h5", mo76412h());
                }
                SmartRouter.buildRoute(context, str3).open();
                return;
            }
            ProductPackStruct productPackStruct4 = this.f105580a;
            if (productPackStruct4 != null && (thirdParty2 = productPackStruct4.f104688p) != null && (str2 = thirdParty2.f104718c) != null) {
                if (C45572m.m88115a(context, str, str2)) {
                    C45349j jVar2 = this.f105590n;
                    if (jVar2 == null) {
                        C89219l.m154710a("logger");
                    } else {
                        jVar2.mo76428a("app", mo76412h());
                    }
                } else {
                    C45349j jVar3 = this.f105590n;
                    if (jVar3 == null) {
                        C89219l.m154710a("logger");
                    } else {
                        jVar3.mo76428a("h5", mo76412h());
                    }
                    SmartRouter.buildRoute(context, str3).open();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo76408a(boolean z) {
        mo33689c(new C45303e(z));
        this.f105583d = z;
    }

    /* renamed from: a */
    public final void mo76405a(Context context, String str) {
        HashMap<String, Object> trackParams;
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        if (str.length() != 0) {
            C89378p[] pVarArr = new C89378p[2];
            pVarArr[0] = new C89378p("enter_from", "semi_product_detail");
            HashMap hashMap = new HashMap();
            SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams = this.f105581b;
            if (!(semiPdpEnterParams == null || (trackParams = semiPdpEnterParams.getTrackParams()) == null)) {
                hashMap.putAll(trackParams);
            }
            hashMap.put("previous_page", "semi_product_detail");
            pVarArr[1] = new C89378p("trackParams", C80342dg.m139300a().mo46674b(hashMap));
            String uri = C45264j.m87841a(str, C89041ag.m154428c(pVarArr)).build().toString();
            C89219l.m154716b(uri, "");
            this.f105586g = "next";
            SmartRouter.buildRoute(context, uri).open();
        }
    }
}
