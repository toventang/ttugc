package com.p2082ss.android.ugc.aweme.ecommerce.semipdp;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.router.C45264j;
import com.p2082ss.android.ugc.aweme.ecommerce.semipdp.repository.C45362b;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpStarter */
public final class SemiPdpStarter {

    /* renamed from: a */
    public static final SemiPdpStarter f105574a = new SemiPdpStarter();

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpStarter$SemiPdpEnterParams */
    public static final class SemiPdpEnterParams implements Serializable {
        private final boolean fullScreen;
        private final HashMap<String, Object> requestParams;
        private final HashMap<String, Object> trackParams;

        static {
            Covode.recordClassIndex(53751);
        }

        public final boolean getFullScreen() {
            return this.fullScreen;
        }

        public final HashMap<String, Object> getRequestParams() {
            return this.requestParams;
        }

        public final HashMap<String, Object> getTrackParams() {
            return this.trackParams;
        }

        public SemiPdpEnterParams(HashMap<String, Object> hashMap, boolean z, HashMap<String, Object> hashMap2) {
            C89219l.m154721d(hashMap, "");
            this.requestParams = hashMap;
            this.fullScreen = z;
            this.trackParams = hashMap2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SemiPdpEnterParams(HashMap hashMap, boolean z, HashMap hashMap2, int i, C89214g gVar) {
            this(hashMap, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : hashMap2);
        }
    }

    private SemiPdpStarter() {
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpStarter$a */
    public static final class C45295a extends AbstractC89220m implements AbstractC89183m<ProductPackStruct, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f105575a;

        /* renamed from: b */
        final /* synthetic */ SemiPdpEnterParams f105576b;

        static {
            Covode.recordClassIndex(53752);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45295a(ActivityC0945e eVar, SemiPdpEnterParams semiPdpEnterParams) {
            super(2);
            this.f105575a = eVar;
            this.f105576b = semiPdpEnterParams;
        }

        /* renamed from: a */
        private static boolean m87886a() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        /* renamed from: b */
        private static boolean m87887b() {
            if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
                return C58029j.f132253e;
            }
            boolean a = m87886a();
            C58029j.f132253e = a;
            return a;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(ProductPackStruct productPackStruct, Integer num) {
            mo76382a(productPackStruct, num);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo76382a(ProductPackStruct productPackStruct, Integer num) {
            if (!m87887b()) {
                new C23144b(this.f105575a).mo37635a(this.f105575a.getString(R.string.gzr)).mo37637b();
            } else if (!this.f105576b.getFullScreen()) {
                SemiPdpStarter.m87884a(this.f105575a, this.f105576b, productPackStruct, num);
            } else {
                SemiPdpStarter.m87885b(this.f105575a, this.f105576b, productPackStruct, num);
            }
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpStarter.C45295a.RunnableC452961 */

                /* renamed from: a */
                final /* synthetic */ C45295a f105577a;

                static {
                    Covode.recordClassIndex(53753);
                }

                {
                    this.f105577a = r1;
                }

                public final void run() {
                    C45362b.m87934a(this.f105577a.f105576b.getRequestParams());
                }
            }, 450);
        }
    }

    static {
        Covode.recordClassIndex(53750);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpStarter$c */
    public static final class C45298c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C45295a f105579a;

        static {
            Covode.recordClassIndex(53755);
        }

        public C45298c(C45295a aVar) {
            this.f105579a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f105579a.mo76382a(null, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpStarter$b */
    public static final class C45297b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C45295a f105578a;

        static {
            Covode.recordClassIndex(53754);
        }

        public C45297b(C45295a aVar) {
            this.f105578a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            ProductPackStruct productPackStruct;
            T t;
            List<ProductPackStruct> list;
            T t2 = ((C22099u) obj).f52262b;
            if (t2 == null || (t = t2.data) == null || (list = t.f104725a) == null) {
                productPackStruct = null;
            } else {
                productPackStruct = (ProductPackStruct) C89070n.m154583g((List) list);
            }
            this.f105578a.mo76382a(productPackStruct, Integer.valueOf(t2.code));
        }
    }

    /* renamed from: b */
    public static void m87885b(Context context, SemiPdpEnterParams semiPdpEnterParams, ProductPackStruct productPackStruct, Integer num) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("ENTER_PARAMS", semiPdpEnterParams);
        if (productPackStruct != null) {
            linkedHashMap.put("product_info", productPackStruct);
        }
        if (num != null) {
            linkedHashMap.put("ERROR_CODE", Integer.valueOf(num.intValue()));
        }
        C45264j.m87843a(context, "aweme://ec/semi_pdp_activity", linkedHashMap, false).open();
    }

    /* renamed from: a */
    public static void m87884a(Context context, SemiPdpEnterParams semiPdpEnterParams, ProductPackStruct productPackStruct, Integer num) {
        C45307a aVar = new C45307a();
        Bundle bundle = new Bundle();
        bundle.putSerializable("ENTER_PARAMS", semiPdpEnterParams);
        if (productPackStruct != null) {
            bundle.putParcelable("product_info", productPackStruct);
        }
        if (num != null) {
            bundle.putInt("ERROR_CODE", num.intValue());
        }
        aVar.setArguments(bundle);
        C23226a aVar2 = new C23226a.C23227a().mo37812a(3).mo37817a(aVar).mo37822b(false).mo37823c().f55057a;
        if (!(context instanceof ActivityC0945e)) {
            context = null;
        }
        ActivityC0945e eVar = (ActivityC0945e) context;
        if (eVar != null) {
            aVar2.show(eVar.getSupportFragmentManager(), "SemiPdpFragment");
        }
    }
}
