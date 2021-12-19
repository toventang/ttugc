package com.p2082ss.android.ugc.aweme.ecommerce.pdp;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.common.utility.C13598c;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.sheet.p1724a.C23208a;
import com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44302b;
import com.p2082ss.android.ugc.aweme.ecommerce.p2819ab.C43327j;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.C44867d;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.C44890b;
import com.p2082ss.android.ugc.aweme.ecommerce.router.C45264j;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45563h;
import com.p2082ss.android.ugc.aweme.language.AbstractC58069b;
import com.p2082ss.android.ugc.aweme.setting.services.ISettingService;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter */
public interface IPdpStarter {

    /* renamed from: a */
    public static final C44631a f104129a = C44631a.f104130a;

    static {
        Covode.recordClassIndex(53011);
    }

    /* renamed from: a */
    C44867d mo75742a(PdpEnterParam pdpEnterParam, boolean z);

    /* renamed from: a */
    void mo75743a(ActivityC0945e eVar, PdpEnterParam pdpEnterParam);

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter$PdpEnterParam */
    public static final class PdpEnterParam implements Serializable {
        private String chainKey;
        private final Float collapsedHeight;
        private final boolean collapsible;
        private final float expandHeight;
        private final boolean fullScreen;
        private final boolean isPromotionPage;
        private final HashMap<String, Object> orderRequestParams;
        private final boolean playerControl;
        private final HashMap<String, Object> productEnterContext;
        private final HashMap<String, Object> requestParams;
        private final HashMap<String, Object> trackParams;
        private final HashMap<String, Object> visitReportParams;

        static {
            Covode.recordClassIndex(53012);
        }

        public PdpEnterParam() {
            this(null, null, null, null, false, 0.0f, null, false, false, false, null, 2047, null);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter$PdpEnterParam */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PdpEnterParam copy$default(PdpEnterParam pdpEnterParam, HashMap hashMap, HashMap hashMap2, HashMap hashMap3, HashMap hashMap4, boolean z, float f, Float f2, boolean z2, boolean z3, boolean z4, HashMap hashMap5, int i, Object obj) {
            if ((i & 1) != 0) {
                hashMap = pdpEnterParam.requestParams;
            }
            if ((i & 2) != 0) {
                hashMap2 = pdpEnterParam.orderRequestParams;
            }
            if ((i & 4) != 0) {
                hashMap3 = pdpEnterParam.trackParams;
            }
            if ((i & 8) != 0) {
                hashMap4 = pdpEnterParam.visitReportParams;
            }
            if ((i & 16) != 0) {
                z = pdpEnterParam.fullScreen;
            }
            if ((i & 32) != 0) {
                f = pdpEnterParam.expandHeight;
            }
            if ((i & 64) != 0) {
                f2 = pdpEnterParam.collapsedHeight;
            }
            if ((i & 128) != 0) {
                z2 = pdpEnterParam.collapsible;
            }
            if ((i & 256) != 0) {
                z3 = pdpEnterParam.playerControl;
            }
            if ((i & 512) != 0) {
                z4 = pdpEnterParam.isPromotionPage;
            }
            if ((i & 1024) != 0) {
                hashMap5 = pdpEnterParam.productEnterContext;
            }
            return pdpEnterParam.copy(hashMap, hashMap2, hashMap3, hashMap4, z, f, f2, z2, z3, z4, hashMap5);
        }

        public final HashMap<String, Object> component1() {
            return this.requestParams;
        }

        public final boolean component10() {
            return this.isPromotionPage;
        }

        public final HashMap<String, Object> component11() {
            return this.productEnterContext;
        }

        public final HashMap<String, Object> component2() {
            return this.orderRequestParams;
        }

        public final HashMap<String, Object> component3() {
            return this.trackParams;
        }

        public final HashMap<String, Object> component4() {
            return this.visitReportParams;
        }

        public final boolean component5() {
            return this.fullScreen;
        }

        public final float component6() {
            return this.expandHeight;
        }

        public final Float component7() {
            return this.collapsedHeight;
        }

        public final boolean component8() {
            return this.collapsible;
        }

        public final boolean component9() {
            return this.playerControl;
        }

        public final PdpEnterParam copy(HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2, HashMap<String, Object> hashMap3, HashMap<String, Object> hashMap4, boolean z, float f, Float f2, boolean z2, boolean z3, boolean z4, HashMap<String, Object> hashMap5) {
            C89219l.m154721d(hashMap, "");
            return new PdpEnterParam(hashMap, hashMap2, hashMap3, hashMap4, z, f, f2, z2, z3, z4, hashMap5);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PdpEnterParam)) {
                return false;
            }
            PdpEnterParam pdpEnterParam = (PdpEnterParam) obj;
            return C89219l.m154714a(this.requestParams, pdpEnterParam.requestParams) && C89219l.m154714a(this.orderRequestParams, pdpEnterParam.orderRequestParams) && C89219l.m154714a(this.trackParams, pdpEnterParam.trackParams) && C89219l.m154714a(this.visitReportParams, pdpEnterParam.visitReportParams) && this.fullScreen == pdpEnterParam.fullScreen && Float.compare(this.expandHeight, pdpEnterParam.expandHeight) == 0 && C89219l.m154714a(this.collapsedHeight, pdpEnterParam.collapsedHeight) && this.collapsible == pdpEnterParam.collapsible && this.playerControl == pdpEnterParam.playerControl && this.isPromotionPage == pdpEnterParam.isPromotionPage && C89219l.m154714a(this.productEnterContext, pdpEnterParam.productEnterContext);
        }

        public final int hashCode() {
            HashMap<String, Object> hashMap = this.requestParams;
            int i = 0;
            int hashCode = (hashMap != null ? hashMap.hashCode() : 0) * 31;
            HashMap<String, Object> hashMap2 = this.orderRequestParams;
            int hashCode2 = (hashCode + (hashMap2 != null ? hashMap2.hashCode() : 0)) * 31;
            HashMap<String, Object> hashMap3 = this.trackParams;
            int hashCode3 = (hashCode2 + (hashMap3 != null ? hashMap3.hashCode() : 0)) * 31;
            HashMap<String, Object> hashMap4 = this.visitReportParams;
            int hashCode4 = (hashCode3 + (hashMap4 != null ? hashMap4.hashCode() : 0)) * 31;
            boolean z = this.fullScreen;
            int i2 = 1;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int com_ss_android_ugc_aweme_ecommerce_pdp_IPdpStarter$PdpEnterParam_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = (((hashCode4 + i3) * 31) + m87367xd42a2e08(this.expandHeight)) * 31;
            Float f = this.collapsedHeight;
            int hashCode5 = (com_ss_android_ugc_aweme_ecommerce_pdp_IPdpStarter$PdpEnterParam_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (f != null ? f.hashCode() : 0)) * 31;
            boolean z2 = this.collapsible;
            if (z2) {
                z2 = true;
            }
            int i6 = z2 ? 1 : 0;
            int i7 = z2 ? 1 : 0;
            int i8 = z2 ? 1 : 0;
            int i9 = (hashCode5 + i6) * 31;
            boolean z3 = this.playerControl;
            if (z3) {
                z3 = true;
            }
            int i10 = z3 ? 1 : 0;
            int i11 = z3 ? 1 : 0;
            int i12 = z3 ? 1 : 0;
            int i13 = (i9 + i10) * 31;
            if (!this.isPromotionPage) {
                i2 = 0;
            }
            int i14 = (i13 + i2) * 31;
            HashMap<String, Object> hashMap5 = this.productEnterContext;
            if (hashMap5 != null) {
                i = hashMap5.hashCode();
            }
            return i14 + i;
        }

        public final String toString() {
            return "PdpEnterParam(requestParams=" + this.requestParams + ", orderRequestParams=" + this.orderRequestParams + ", trackParams=" + this.trackParams + ", visitReportParams=" + this.visitReportParams + ", fullScreen=" + this.fullScreen + ", expandHeight=" + this.expandHeight + ", collapsedHeight=" + this.collapsedHeight + ", collapsible=" + this.collapsible + ", playerControl=" + this.playerControl + ", isPromotionPage=" + this.isPromotionPage + ", productEnterContext=" + this.productEnterContext + ")";
        }

        public final String getChainKey() {
            return this.chainKey;
        }

        public final Float getCollapsedHeight() {
            return this.collapsedHeight;
        }

        public final boolean getCollapsible() {
            return this.collapsible;
        }

        public final float getExpandHeight() {
            return this.expandHeight;
        }

        public final boolean getFullScreen() {
            return this.fullScreen;
        }

        public final HashMap<String, Object> getOrderRequestParams() {
            return this.orderRequestParams;
        }

        public final boolean getPlayerControl() {
            return this.playerControl;
        }

        public final HashMap<String, Object> getProductEnterContext() {
            return this.productEnterContext;
        }

        public final HashMap<String, Object> getRequestParams() {
            return this.requestParams;
        }

        public final HashMap<String, Object> getTrackParams() {
            return this.trackParams;
        }

        public final HashMap<String, Object> getVisitReportParams() {
            return this.visitReportParams;
        }

        public final boolean isPromotionPage() {
            return this.isPromotionPage;
        }

        public final String getProductId() {
            try {
                Object obj = this.requestParams.get("product_id");
                if (obj != null) {
                    return (String) ((List) obj).get(0);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            } catch (Exception unused) {
                return "";
            }
        }

        public final void setChainKey(String str) {
            this.chainKey = str;
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_pdp_IPdpStarter$PdpEnterParam_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
        public static int m87367xd42a2e08(float f) {
            return Float.floatToIntBits(f);
        }

        public PdpEnterParam(HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2, HashMap<String, Object> hashMap3, HashMap<String, Object> hashMap4, boolean z, float f, Float f2, boolean z2, boolean z3, boolean z4, HashMap<String, Object> hashMap5) {
            Object obj;
            C89219l.m154721d(hashMap, "");
            this.requestParams = hashMap;
            this.orderRequestParams = hashMap2;
            this.trackParams = hashMap3;
            this.visitReportParams = hashMap4;
            this.fullScreen = z;
            this.expandHeight = f;
            this.collapsedHeight = f2;
            this.collapsible = z2;
            this.playerControl = z3;
            this.isPromotionPage = z4;
            this.productEnterContext = hashMap5;
            String str = null;
            if (hashMap4 != null) {
                obj = hashMap4.get("chain_key");
            } else {
                obj = null;
            }
            this.chainKey = obj instanceof String ? obj : str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ PdpEnterParam(HashMap hashMap, HashMap hashMap2, HashMap hashMap3, HashMap hashMap4, boolean z, float f, Float f2, boolean z2, boolean z3, boolean z4, HashMap hashMap5, int i, C89214g gVar) {
            this((i & 1) != 0 ? new HashMap() : hashMap, (i & 2) != 0 ? null : hashMap2, (i & 4) != 0 ? null : hashMap3, (i & 8) != 0 ? null : hashMap4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? (float) C45563h.f106106b : f, (i & 64) != 0 ? null : f2, (i & 128) != 0 ? true : z2, (i & 256) == 0 ? z3 : true, (i & 512) == 0 ? z4 : false, (i & 1024) == 0 ? hashMap5 : null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter$a */
    public static final class C44631a {

        /* renamed from: a */
        static final /* synthetic */ C44631a f104130a = new C44631a();

        /* renamed from: b */
        private static final C44818m f104131b = new C44818m();

        /* renamed from: c */
        private static final C44824n f104132c = new C44824n();

        private C44631a() {
        }

        /* renamed from: a */
        public static IPdpStarter m87369a() {
            if (C43327j.m86446a() == C43327j.f101119b) {
                return f104132c;
            }
            return f104131b;
        }

        static {
            Covode.recordClassIndex(53013);
        }

        /* renamed from: a */
        public static int m87368a(HashMap<String, Object> hashMap) {
            Object obj;
            if (hashMap != null) {
                obj = hashMap.get("source_page_type");
            } else {
                obj = null;
            }
            if (C89219l.m154714a(obj, (Object) "live")) {
                return 1;
            }
            if (C89219l.m154714a(obj, (Object) "video")) {
                return 2;
            }
            if (C89219l.m154714a(obj, (Object) "show_window")) {
                return 3;
            }
            return 0;
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter$a$a */
        static final class C44632a extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

            /* renamed from: a */
            final /* synthetic */ AbstractC0952i f104133a;

            /* renamed from: b */
            final /* synthetic */ Context f104134b;

            /* renamed from: c */
            final /* synthetic */ Uri f104135c;

            /* renamed from: d */
            final /* synthetic */ AbstractC89171a f104136d;

            static {
                Covode.recordClassIndex(53014);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C44632a(AbstractC0952i iVar, Context context, Uri uri, AbstractC89171a aVar) {
                super(1);
                this.f104133a = iVar;
                this.f104134b = context;
                this.f104135c = uri;
                this.f104136d = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(View view) {
                C89219l.m154721d(view, "");
                if (this.f104133a != null) {
                    Uri build = C45264j.m87841a("bullet://bullet", C89041ag.m154428c(new C89378p("url", this.f104135c.toString()))).build();
                    C89219l.m154716b(build, "");
                    C44302b.C44303a.m87026a(build, (int) (((float) (C45563h.f106106b - (C13598c.m24425a(this.f104134b) + C13598c.m24429b(this.f104134b)))) * 0.95f), this.f104133a, "report_page");
                    AbstractC89171a aVar = this.f104136d;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                }
                return C89391z.f203057a;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: com.bytedance.tux.sheet.a.a$d[] */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static void m87370a(Context context, AbstractC0952i iVar, HashMap<String, Object> hashMap, AbstractC89171a<C89391z> aVar) {
            AbstractC58069b a;
            String a2;
            String str = "";
            C89219l.m154721d(context, str);
            C89219l.m154721d(hashMap, str);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("hide_nav_bar", 1);
            hashMap2.put("disableBounces", 1);
            hashMap2.put("soft_input_adjust", "pan");
            ISettingService v = SettingServiceImpl.m120782v();
            if (!(v == null || (a = v.mo108857a(context)) == null || (a2 = a.mo90017a()) == null)) {
                str = a2;
            }
            hashMap2.put("locale", str);
            hashMap2.putAll(hashMap);
            new C23208a.C23211b().mo37796a(((C23208a.C23213d) new C23208a.C23213d().mo37785a(R.string.bfc)).mo37801c(R.raw.icon_flag).mo37787a(new C44632a(iVar, context, C45264j.m87841a("https://oec-api.tiktokv.com/view/fe_tiktok_ecommerce_report/index.html/reasons", hashMap2).build(), aVar))).mo37800b().show(iVar, "pdp_more");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter$b */
    public static final class C44633b extends RuntimeException {

        /* renamed from: a */
        private final int f104137a;

        /* renamed from: b */
        private final C44890b f104138b;

        static {
            Covode.recordClassIndex(53015);
        }

        public final int getCode() {
            return this.f104137a;
        }

        public final C44890b getResp() {
            return this.f104138b;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44633b(int i, String str, C44890b bVar) {
            super(str);
            C89219l.m154721d(bVar, "");
            this.f104137a = i;
            this.f104138b = bVar;
        }
    }
}
