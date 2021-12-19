package com.p2082ss.android.ugc.aweme.ecommerce.pdp;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.ecommerce.p2818a.C43314b;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b.C44720k;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2851c.C44766a;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.AbstractC44834a;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.C44867d;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.api.PdpApi;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45546d;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.n */
public final class C44824n implements IPdpStarter {

    /* renamed from: b */
    public static final C44825a f104547b = new C44825a((byte) 0);

    /* renamed from: c */
    private AbstractC88412b f104548c;

    /* renamed from: d */
    private long f104549d = -1;

    static {
        Covode.recordClassIndex(53210);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.n$a */
    public static final class C44825a {
        static {
            Covode.recordClassIndex(53211);
        }

        private C44825a() {
        }

        public /* synthetic */ C44825a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.n$b */
    static final class C44826b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C44824n f104550a;

        /* renamed from: b */
        final /* synthetic */ IPdpStarter.PdpEnterParam f104551b;

        /* renamed from: c */
        final /* synthetic */ C44867d f104552c;

        /* renamed from: d */
        final /* synthetic */ ActivityC0945e f104553d;

        /* renamed from: e */
        final /* synthetic */ long f104554e;

        static {
            Covode.recordClassIndex(53212);
        }

        C44826b(C44824n nVar, IPdpStarter.PdpEnterParam pdpEnterParam, C44867d dVar, ActivityC0945e eVar, long j) {
            this.f104550a = nVar;
            this.f104551b = pdpEnterParam;
            this.f104552c = dVar;
            this.f104553d = eVar;
            this.f104554e = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            ProductPackStruct productPackStruct = (ProductPackStruct) obj;
            if (TextUtils.isEmpty(this.f104551b.getChainKey()) && !TextUtils.isEmpty(productPackStruct.f104694v)) {
                HashMap<String, Object> visitReportParams = this.f104551b.getVisitReportParams();
                if (visitReportParams != null) {
                    String str = productPackStruct.f104694v;
                    if (str == null) {
                        C89219l.m154715b();
                    }
                    visitReportParams.put("chain_key", str);
                }
                this.f104551b.setChainKey(productPackStruct.f104694v);
            }
            AbstractC44834a.C44835a.m87545a().mo75951a(this.f104552c.f104624a);
            C44824n nVar = this.f104550a;
            C44824n.m87531a((C44824n) this.f104553d, (ActivityC0945e) this.f104551b, (IPdpStarter.PdpEnterParam) productPackStruct, (ProductPackStruct) this.f104554e, (long) this.f104552c.f104625b, 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.n$c */
    static final class C44827c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C44824n f104555a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f104556b;

        /* renamed from: c */
        final /* synthetic */ IPdpStarter.PdpEnterParam f104557c;

        /* renamed from: d */
        final /* synthetic */ long f104558d;

        /* renamed from: e */
        final /* synthetic */ C44867d f104559e;

        static {
            Covode.recordClassIndex(53213);
        }

        C44827c(C44824n nVar, ActivityC0945e eVar, IPdpStarter.PdpEnterParam pdpEnterParam, long j, C44867d dVar) {
            this.f104555a = nVar;
            this.f104556b = eVar;
            this.f104557c = pdpEnterParam;
            this.f104558d = j;
            this.f104559e = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            ProductPackStruct productPackStruct;
            List<ProductPackStruct> list;
            Throwable th = (Throwable) obj;
            if (th instanceof IPdpStarter.C44633b) {
                IPdpStarter.C44633b bVar = (IPdpStarter.C44633b) th;
                T t = bVar.getResp().data;
                if (t == null || (list = t.f104725a) == null) {
                    productPackStruct = null;
                } else {
                    productPackStruct = (ProductPackStruct) C89070n.m154583g((List) list);
                }
                C44824n.m87531a(this.f104556b, this.f104557c, productPackStruct, this.f104558d, this.f104559e.f104625b, bVar.getCode());
                return;
            }
            String productId = this.f104557c.getProductId();
            C89219l.m154721d(productId, "");
            AbstractC81915c.m141874a(new C43314b(productId, 5));
            ActivityC0945e eVar = this.f104556b;
            String string = eVar.getString(R.string.gzr);
            C89219l.m154716b(string, "");
            new C23144b(eVar).mo37635a(string).mo37637b();
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
        if (System.currentTimeMillis() - this.f104549d > 1000) {
            this.f104549d = SystemClock.elapsedRealtime();
            if (!pdpEnterParam.getFullScreen()) {
                C44766a.m87493a(eVar).mo75886b();
            }
            AbstractC88412b bVar = this.f104548c;
            if (bVar != null) {
                bVar.dispose();
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C44867d a = mo75742a(pdpEnterParam, false);
            ProductPackStruct productPackStruct = a.f104627d;
            if (productPackStruct != null) {
                if (TextUtils.isEmpty(pdpEnterParam.getChainKey()) && !TextUtils.isEmpty(productPackStruct.f104694v)) {
                    HashMap<String, Object> visitReportParams = pdpEnterParam.getVisitReportParams();
                    if (visitReportParams != null) {
                        String str = productPackStruct.f104694v;
                        if (str == null) {
                            C89219l.m154715b();
                        }
                        visitReportParams.put("chain_key", str);
                    }
                    pdpEnterParam.setChainKey(productPackStruct.f104694v);
                }
                AbstractC44834a.C44835a.m87545a().mo75951a(a.f104624a);
                m87531a((C44824n) eVar, (ActivityC0945e) pdpEnterParam, (IPdpStarter.PdpEnterParam) productPackStruct, (ProductPackStruct) elapsedRealtime, (long) a.f104625b, 0);
                return;
            }
            this.f104548c = a.f104626c.mo143254a(new C44826b(this, pdpEnterParam, a, eVar, elapsedRealtime), new C44827c(this, eVar, pdpEnterParam, elapsedRealtime, a));
        }
    }

    /* renamed from: a */
    public static void m87531a(ActivityC0945e eVar, IPdpStarter.PdpEnterParam pdpEnterParam, ProductPackStruct productPackStruct, long j, int i, int i2) {
        if (pdpEnterParam.getFullScreen()) {
            Intent intent = new Intent(eVar, PdpActivity.class);
            intent.putExtra("ENTER_PARAMS", pdpEnterParam);
            intent.putExtra("PREFETCH_RESULT", productPackStruct);
            intent.putExtra("CLICK_TIMESTAMP", j);
            intent.putExtra("PREFETCH_FINISH_TIME", SystemClock.elapsedRealtime());
            intent.putExtra("PREFETCH_TYPE", i);
            intent.putExtra("ERROR_CODE", i2);
            C84349a.m145093a(intent, eVar);
            eVar.startActivity(intent);
        } else if (!eVar.isFinishing()) {
            int i3 = Build.VERSION.SDK_INT;
            if (!eVar.isDestroyed()) {
                new C44720k(eVar, pdpEnterParam);
                C44788e eVar2 = new C44788e();
                Bundle bundle = new Bundle();
                bundle.putSerializable("ENTER_PARAMS", pdpEnterParam);
                bundle.putBoolean("full_screen", pdpEnterParam.getFullScreen());
                bundle.putParcelable("PREFETCH_RESULT", productPackStruct);
                bundle.putLong("CLICK_TIMESTAMP", j);
                bundle.putLong("PREFETCH_FINISH_TIME", SystemClock.elapsedRealtime());
                bundle.putInt("PREFETCH_TYPE", i);
                bundle.putInt("ERROR_CODE", i2);
                eVar2.setArguments(bundle);
                AbstractC0952i supportFragmentManager = eVar.getSupportFragmentManager();
                if (supportFragmentManager != null) {
                    eVar2.show(supportFragmentManager, "pdp_fragment");
                }
            } else {
                return;
            }
        } else {
            return;
        }
        HashMap<String, Object> visitReportParams = pdpEnterParam.getVisitReportParams();
        if (visitReportParams != null) {
            PdpApi.C44837a.m87547a(visitReportParams);
        } else {
            C45546d.m88089a(pdpEnterParam);
        }
    }
}
