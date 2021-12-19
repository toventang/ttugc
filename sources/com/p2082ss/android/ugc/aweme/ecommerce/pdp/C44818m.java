package com.p2082ss.android.ugc.aweme.ecommerce.pdp;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b.C44720k;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2851c.C44766a;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.AbstractC44834a;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.C44867d;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.api.PdpApi;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45546d;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.HashMap;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.m */
public final class C44818m implements IPdpStarter {

    /* renamed from: b */
    public static final C44819a f104541b = new C44819a((byte) 0);

    /* renamed from: c */
    private long f104542c = -1;

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.m$b */
    static final class C44820b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C44820b f104543a = new C44820b();

        static {
            Covode.recordClassIndex(53206);
        }

        C44820b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.m$c */
    static final class C44821c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C44821c f104544a = new C44821c();

        static {
            Covode.recordClassIndex(53207);
        }

        C44821c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.m$e */
    static final class C44823e<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C44823e f104546a = new C44823e();

        static {
            Covode.recordClassIndex(53209);
        }

        C44823e() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(53204);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.m$a */
    public static final class C44819a {
        static {
            Covode.recordClassIndex(53205);
        }

        private C44819a() {
        }

        public /* synthetic */ C44819a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.m$d */
    static final class C44822d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ IPdpStarter.PdpEnterParam f104545a;

        static {
            Covode.recordClassIndex(53208);
        }

        C44822d(IPdpStarter.PdpEnterParam pdpEnterParam) {
            this.f104545a = pdpEnterParam;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            ProductPackStruct productPackStruct = (ProductPackStruct) obj;
            if (this.f104545a.getChainKey() == null && productPackStruct.f104694v != null) {
                HashMap<String, Object> visitReportParams = this.f104545a.getVisitReportParams();
                if (visitReportParams != null) {
                    visitReportParams.put("chain_key", productPackStruct.f104694v);
                }
                this.f104545a.setChainKey(productPackStruct.f104694v);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter
    /* renamed from: a */
    public final C44867d mo75742a(IPdpStarter.PdpEnterParam pdpEnterParam, boolean z) {
        C89219l.m154721d(pdpEnterParam, "");
        return AbstractC44834a.C44835a.m87545a().mo75949a(pdpEnterParam, false, 0, z, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter
    /* renamed from: a */
    public final void mo75743a(ActivityC0945e eVar, IPdpStarter.PdpEnterParam pdpEnterParam) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(pdpEnterParam, "");
        if (SystemClock.elapsedRealtime() - this.f104542c > 1000) {
            this.f104542c = SystemClock.elapsedRealtime();
            if (pdpEnterParam.getFullScreen()) {
                C44867d a = mo75742a(pdpEnterParam, false);
                a.f104626c.mo143254a(C44820b.f104543a, C44821c.f104544a).dispose();
                Intent intent = new Intent(eVar, PdpActivity.class);
                intent.putExtra("ENTER_PARAMS", pdpEnterParam);
                intent.putExtra("CLICK_TIMESTAMP", SystemClock.elapsedRealtime());
                intent.putExtra("PREFETCH_TYPE", a.f104625b);
                if (a.f104627d != null) {
                    AbstractC44834a.C44835a.m87545a().mo75951a(a.f104624a);
                    ProductPackStruct productPackStruct = a.f104627d;
                    if (productPackStruct == null) {
                        C89219l.m154715b();
                    }
                    intent.putExtra("PREFETCH_RESULT", productPackStruct);
                    intent.putExtra("PREFETCH_FINISH_TIME", SystemClock.elapsedRealtime());
                }
                C84349a.m145093a(intent, eVar);
                eVar.startActivity(intent);
            } else {
                C44766a.m87493a(eVar).mo75886b();
                C44867d a2 = mo75742a(pdpEnterParam, false);
                a2.f104626c.mo143254a(new C44822d(pdpEnterParam), C44823e.f104546a).dispose();
                new C44720k(eVar, pdpEnterParam);
                C44788e eVar2 = new C44788e();
                Bundle bundle = new Bundle();
                bundle.putSerializable("ENTER_PARAMS", pdpEnterParam);
                bundle.putBoolean("full_screen", pdpEnterParam.getFullScreen());
                bundle.putLong("CLICK_TIMESTAMP", SystemClock.elapsedRealtime());
                bundle.putInt("PREFETCH_TYPE", a2.f104625b);
                if (a2.f104627d != null) {
                    AbstractC44834a.C44835a.m87545a().mo75951a(a2.f104624a);
                    ProductPackStruct productPackStruct2 = a2.f104627d;
                    if (productPackStruct2 == null) {
                        C89219l.m154715b();
                    }
                    bundle.putParcelable("PREFETCH_RESULT", productPackStruct2);
                    bundle.putLong("PREFETCH_FINISH_TIME", SystemClock.elapsedRealtime());
                }
                eVar2.setArguments(bundle);
                AbstractC0952i supportFragmentManager = eVar.getSupportFragmentManager();
                if (supportFragmentManager != null) {
                    eVar2.show(supportFragmentManager, "pdp_fragment");
                }
            }
            HashMap<String, Object> visitReportParams = pdpEnterParam.getVisitReportParams();
            if (visitReportParams != null) {
                PdpApi.C44837a.m87547a(visitReportParams);
            } else {
                C45546d.m88089a(pdpEnterParam);
            }
        }
    }
}
