package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.account.util.C33039i;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Price;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticDTO;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticTextDTO;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.AbstractC44779h;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44778g;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.FlashSale;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.PickTag;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductDetailReview;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.review.C45157f;
import com.p2082ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewItemStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.SaleProp;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuItem;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuPrice;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45544c;
import com.p2082ss.android.ugc.aweme.ecommerce.track.TrackerProvider;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45553a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.k */
public final class C44720k {

    /* renamed from: C */
    public static final C44721a f104310C = new C44721a((byte) 0);

    /* renamed from: A */
    public DeliveryPanelStarter.PackedDeliverySelectResult f104311A;

    /* renamed from: B */
    public final IPdpStarter.PdpEnterParam f104312B;

    /* renamed from: D */
    private final Set<String> f104313D;

    /* renamed from: E */
    private boolean f104314E;

    /* renamed from: F */
    private boolean f104315F;

    /* renamed from: G */
    private final HashSet<String> f104316G;

    /* renamed from: H */
    private final HashSet<String> f104317H;

    /* renamed from: a */
    public final LinkedHashMap<String, Object> f104318a;

    /* renamed from: b */
    public long f104319b = -1;

    /* renamed from: c */
    public final HashSet<String> f104320c = new HashSet<>();

    /* renamed from: d */
    public final HashSet<String> f104321d = new HashSet<>();

    /* renamed from: e */
    public boolean f104322e;

    /* renamed from: f */
    public long f104323f = -1;

    /* renamed from: g */
    public final HashSet<String> f104324g = new HashSet<>();

    /* renamed from: h */
    public boolean f104325h;

    /* renamed from: i */
    public boolean f104326i;

    /* renamed from: j */
    public ProductPackStruct f104327j;

    /* renamed from: k */
    public boolean f104328k;

    /* renamed from: l */
    public Integer f104329l;

    /* renamed from: m */
    public Long f104330m;

    /* renamed from: n */
    public boolean f104331n;

    /* renamed from: o */
    public boolean f104332o;

    /* renamed from: p */
    public Integer f104333p;

    /* renamed from: q */
    public long f104334q = -1;

    /* renamed from: r */
    public long f104335r = -1;

    /* renamed from: s */
    public long f104336s = -1;

    /* renamed from: t */
    public long f104337t = -1;

    /* renamed from: u */
    public boolean f104338u;

    /* renamed from: v */
    public boolean f104339v;

    /* renamed from: w */
    public int f104340w;

    /* renamed from: x */
    public long f104341x = -1;

    /* renamed from: y */
    public String f104342y = "next";

    /* renamed from: z */
    public Boolean f104343z;

    static {
        Covode.recordClassIndex(53106);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.k$a */
    public static final class C44721a {
        static {
            Covode.recordClassIndex(53107);
        }

        private C44721a() {
        }

        public /* synthetic */ C44721a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C44720k m87476a(Context context) {
            C44720k kVar = null;
            if (context == null) {
                return null;
            }
            Activity a = C34729o.m70950a(context);
            Objects.requireNonNull(a, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            AbstractC1174ac a2 = C1181ae.m3881a((ActivityC0945e) a, (C1175ad.AbstractC1177b) null).mo3983a(TrackerProvider.class);
            C89219l.m154716b(a2, "");
            Object obj = ((TrackerProvider) a2).f106048a;
            if (obj instanceof C44720k) {
                kVar = obj;
            }
            return kVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.k$d */
    public static final class C44724d extends C27895a<Map<String, ? extends Object>> {
        static {
            Covode.recordClassIndex(53110);
        }

        C44724d() {
        }
    }

    /* renamed from: a */
    public final void mo75866a(boolean z) {
        this.f104331n = z;
        this.f104318a.put("page_show_type", z ? "full_screen" : "half_screen");
    }

    /* renamed from: a */
    public final void mo75859a(String str) {
        C89219l.m154721d(str, "");
        this.f104342y = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0045, code lost:
        if (r1.length() == 0) goto L_0x0047;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo75857a(com.p2082ss.android.ugc.aweme.ecommerce.track.C45544c.C45545a r6) {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b.C44720k.mo75857a(com.ss.android.ugc.aweme.ecommerce.track.c$a):void");
    }

    /* renamed from: a */
    public final void mo75867a(boolean z, boolean z2) {
        new C44714h(z, SystemClock.elapsedRealtime() - this.f104323f, this.f104320c.size(), z2).mo76746c(this.f104318a);
        this.f104323f = SystemClock.elapsedRealtime();
    }

    /* renamed from: a */
    public final void mo75865a(String str, boolean z, Float f, String str2, boolean z2, String str3) {
        C89219l.m154721d(str, "");
        if (C89219l.m154714a((Object) str, (Object) "showcase_detail")) {
            new C44742l("shopprofile", z).mo76746c(this.f104318a);
        } else {
            new C44742l(str, z).mo76746c(this.f104318a);
        }
        if (z2 || !this.f104313D.contains(str)) {
            C45544c.m88081a("tiktokec_module_show", new C44732l(this, str, f, str2, str3));
        }
        this.f104313D.add(str);
    }

    /* renamed from: a */
    public final void mo75861a(String str, AbstractC44779h hVar) {
        C89219l.m154721d(str, "");
        C45544c.m88081a("tiktokec_module_click", new C44731k(this, str, hVar));
    }

    /* renamed from: a */
    public final void mo75855a(ReviewItemStruct reviewItemStruct) {
        C89219l.m154721d(reviewItemStruct, "");
        if (!this.f104316G.contains(reviewItemStruct.f105340a.f105353a)) {
            this.f104316G.add(reviewItemStruct.f105340a.f105353a);
            C45544c.m88081a("tiktokec_review_show", new C44738r(this, reviewItemStruct));
        }
    }

    /* renamed from: a */
    public final void mo75864a(String str, HashMap<String, Object> hashMap) {
        C89219l.m154721d(str, "");
        C45544c.m88081a("tiktokec_button_show", new C44726f(this, str, hashMap));
    }

    /* renamed from: a */
    public final void mo75863a(String str, Boolean bool, Boolean bool2) {
        C89219l.m154721d(str, "");
        new C44708d(str, bool, bool2).mo76746c(this.f104318a);
        this.f104324g.add(str);
    }

    /* renamed from: a */
    public final void mo75862a(String str, Boolean bool) {
        C89219l.m154721d(str, "");
        new C44748o(str, bool).mo76746c(this.f104318a);
        if (!C89219l.m154714a((Object) str, (Object) "logistics")) {
            C45544c.m88081a("tiktokec_enter_page", new C44733m(this, str));
        }
    }

    /* renamed from: a */
    public final void mo75860a(String str, long j, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C45544c.m88081a("tiktokec_stay_page", new C44734n(this, str, j, str2));
    }

    /* renamed from: a */
    public final void mo75858a(Boolean bool, boolean z, long j) {
        new C44755s().mo76746c(this.f104318a);
        C45544c.m88081a("tiktokec_confirm_sku", new C44740t(this, z, j, bool));
    }

    /* renamed from: b */
    public final void mo75868b() {
        new C44750p().mo76746c(this.f104318a);
    }

    /* renamed from: c */
    public final void mo75875c() {
        C45544c.m88081a("tiktokec_cart_entrance_show", new C44728h(this));
    }

    /* renamed from: d */
    public final void mo75879d() {
        C45544c.m88081a("tiktokec_cart_entrance_click", new C44727g(this));
    }

    /* renamed from: a */
    public final void mo75852a() {
        if (!this.f104315F) {
            this.f104315F = true;
            C45544c.m88081a("tiktokec_module_show", new C44739s(this));
        }
    }

    /* renamed from: e */
    public final void mo75881e(String str) {
        C89219l.m154721d(str, "");
        new C44752q(str).mo76746c(this.f104318a);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.k$e */
    static final class C44725e extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44720k f104348a;

        /* renamed from: b */
        final /* synthetic */ String f104349b;

        /* renamed from: c */
        final /* synthetic */ HashMap f104350c;

        static {
            Covode.recordClassIndex(53111);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44725e(C44720k kVar, String str, HashMap hashMap) {
            super(1);
            this.f104348a = kVar;
            this.f104349b = str;
            this.f104350c = hashMap;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            C45544c.C45545a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            C45544c.C45545a.m88084a(aVar2, this.f104348a.f104318a);
            aVar2.mo76752b("button_name", this.f104349b);
            HashMap hashMap = this.f104350c;
            if (hashMap != null) {
                C45544c.C45545a.m88084a(aVar2, hashMap);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.k$f */
    static final class C44726f extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44720k f104351a;

        /* renamed from: b */
        final /* synthetic */ String f104352b;

        /* renamed from: c */
        final /* synthetic */ HashMap f104353c;

        static {
            Covode.recordClassIndex(53112);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44726f(C44720k kVar, String str, HashMap hashMap) {
            super(1);
            this.f104351a = kVar;
            this.f104352b = str;
            this.f104353c = hashMap;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            C45544c.C45545a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            C45544c.C45545a.m88084a(aVar2, this.f104351a.f104318a);
            aVar2.mo76752b("button_name", this.f104352b);
            HashMap hashMap = this.f104353c;
            if (hashMap != null) {
                C45544c.C45545a.m88084a(aVar2, hashMap);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.k$g */
    static final class C44727g extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44720k f104354a;

        static {
            Covode.recordClassIndex(53113);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44727g(C44720k kVar) {
            super(1);
            this.f104354a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            C45544c.C45545a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            C45544c.C45545a.m88084a(aVar2, this.f104354a.f104318a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.k$h */
    static final class C44728h extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44720k f104355a;

        static {
            Covode.recordClassIndex(53114);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44728h(C44720k kVar) {
            super(1);
            this.f104355a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            C45544c.C45545a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            C45544c.C45545a.m88084a(aVar2, this.f104355a.f104318a);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.k$m */
    public static final class C44733m extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44720k f104367a;

        /* renamed from: b */
        final /* synthetic */ String f104368b;

        static {
            Covode.recordClassIndex(53119);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44733m(C44720k kVar, String str) {
            super(1);
            this.f104367a = kVar;
            this.f104368b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            C45544c.C45545a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            C45544c.C45545a.m88084a(aVar2, this.f104367a.f104318a);
            aVar2.mo76752b("page_name", this.f104368b);
            this.f104367a.mo75876c(aVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public final void mo75871b(String str) {
        if (str == null) {
            this.f104340w = 0;
            return;
        }
        this.f104340w = 1;
        this.f104320c.add(str);
    }

    /* renamed from: c */
    public final void mo75877c(String str) {
        C89219l.m154721d(str, "");
        new C44718j(str).mo76746c(this.f104318a);
    }

    /* renamed from: d */
    public final void mo75880d(String str) {
        if (str != null) {
            new C44744m(str).mo76746c(this.f104318a);
            this.f104322e = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.k$b */
    static final class C44722b extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44720k f104344a;

        /* renamed from: b */
        final /* synthetic */ SkuPrice f104345b;

        /* renamed from: c */
        final /* synthetic */ int f104346c;

        static {
            Covode.recordClassIndex(53108);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44722b(C44720k kVar, SkuPrice skuPrice, int i) {
            super(1);
            this.f104344a = kVar;
            this.f104345b = skuPrice;
            this.f104346c = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            C45544c.C45545a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            C45553a.m88104a(aVar2, this.f104344a.f104318a, this.f104344a.f104327j, this.f104345b, this.f104346c, "product_detail");
            aVar2.mo76752b("action_refer", "product_detail");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.k$i */
    public static final class C44729i extends AbstractC89220m implements AbstractC89172b<Long, Long> {

        /* renamed from: a */
        final /* synthetic */ Object f104356a;

        static {
            Covode.recordClassIndex(53115);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44729i(Object obj) {
            super(1);
            this.f104356a = obj;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Long invoke(Long l) {
            long longValue = l.longValue();
            Object obj = this.f104356a;
            long j = -1;
            if ((obj instanceof Long) && (!C89219l.m154714a(obj, (Object) -1L))) {
                j = longValue - ((Number) this.f104356a).longValue();
            }
            return Long.valueOf(j);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.k$j */
    static final class C44730j extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44720k f104357a;

        /* renamed from: b */
        final /* synthetic */ C44778g f104358b;

        static {
            Covode.recordClassIndex(53116);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44730j(C44720k kVar, C44778g gVar) {
            super(1);
            this.f104357a = kVar;
            this.f104358b = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            C45544c.C45545a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            C45544c.C45545a.m88084a(aVar2, this.f104357a.f104318a);
            this.f104357a.mo75857a(aVar2);
            C44720k.m87441a(aVar2, this.f104358b.f104476i);
            aVar2.mo76752b("module_name", "price");
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.k$l */
    public static final class C44732l extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44720k f104362a;

        /* renamed from: b */
        final /* synthetic */ String f104363b;

        /* renamed from: c */
        final /* synthetic */ Float f104364c;

        /* renamed from: d */
        final /* synthetic */ String f104365d;

        /* renamed from: e */
        final /* synthetic */ String f104366e;

        static {
            Covode.recordClassIndex(53118);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44732l(C44720k kVar, String str, Float f, String str2, String str3) {
            super(1);
            this.f104362a = kVar;
            this.f104363b = str;
            this.f104364c = f;
            this.f104365d = str2;
            this.f104366e = str3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            C45544c.C45545a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            C45544c.C45545a.m88084a(aVar2, this.f104362a.f104318a);
            aVar2.mo76752b("module_name", this.f104363b);
            if (C89219l.m154714a((Object) this.f104363b, (Object) "logistics")) {
                Float f = this.f104364c;
                if (f != null) {
                    aVar2.mo76752b("shipping_price", f);
                }
                String str = this.f104365d;
                if (str != null) {
                    aVar2.mo76752b("shipping_currency", str);
                }
                String str2 = this.f104366e;
                if (str2 != null) {
                    aVar2.mo76752b("free_shipping_condition", str2);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.k$n */
    static final class C44734n extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44720k f104369a;

        /* renamed from: b */
        final /* synthetic */ String f104370b;

        /* renamed from: c */
        final /* synthetic */ long f104371c;

        /* renamed from: d */
        final /* synthetic */ String f104372d;

        static {
            Covode.recordClassIndex(53120);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44734n(C44720k kVar, String str, long j, String str2) {
            super(1);
            this.f104369a = kVar;
            this.f104370b = str;
            this.f104371c = j;
            this.f104372d = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            C45544c.C45545a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            C45544c.C45545a.m88084a(aVar2, this.f104369a.f104318a);
            aVar2.mo76752b("page_name", this.f104370b);
            aVar2.mo76752b("stay_time", Long.valueOf(this.f104371c));
            aVar2.mo76752b("quit_type", this.f104372d);
            this.f104369a.mo75876c(aVar2);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.k$q */
    public static final class C44737q extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44720k f104387a;

        /* renamed from: b */
        final /* synthetic */ String f104388b;

        /* renamed from: c */
        final /* synthetic */ int f104389c;

        /* renamed from: d */
        final /* synthetic */ String f104390d;

        /* renamed from: e */
        final /* synthetic */ boolean f104391e;

        static {
            Covode.recordClassIndex(53123);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44737q(C44720k kVar, String str, int i, String str2, boolean z) {
            super(1);
            this.f104387a = kVar;
            this.f104388b = str;
            this.f104389c = i;
            this.f104390d = str2;
            this.f104391e = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            C45544c.C45545a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            C45544c.C45545a.m88084a(aVar2, this.f104387a.f104318a);
            aVar2.mo76752b("photo_id", this.f104388b);
            aVar2.mo76752b("rank", Integer.valueOf(this.f104389c));
            aVar2.mo76752b("review_id", this.f104390d);
            aVar2.mo76752b("is_self", Integer.valueOf(this.f104391e ? 1 : 0));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.k$s */
    static final class C44739s extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44720k f104394a;

        static {
            Covode.recordClassIndex(53125);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44739s(C44720k kVar) {
            super(1);
            this.f104394a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            ProductDetailReview productDetailReview;
            C45544c.C45545a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            C45544c.C45545a.m88084a(aVar2, this.f104394a.f104318a);
            ProductPackStruct productPackStruct = this.f104394a.f104327j;
            if (productPackStruct != null) {
                productDetailReview = productPackStruct.f104686n;
            } else {
                productDetailReview = null;
            }
            C44720k.m87441a(aVar2, productDetailReview);
            aVar2.mo76752b("module_name", "review_entrance");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.k$u */
    public static final class C44741u extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44720k f104399a;

        /* renamed from: b */
        final /* synthetic */ String f104400b;

        /* renamed from: c */
        final /* synthetic */ String f104401c;

        static {
            Covode.recordClassIndex(53127);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44741u(C44720k kVar, String str, String str2) {
            super(1);
            this.f104399a = kVar;
            this.f104400b = str;
            this.f104401c = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            C45544c.C45545a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            C45544c.C45545a.m88084a(aVar2, this.f104399a.f104318a);
            aVar2.mo76753c("activity_name", this.f104400b);
            aVar2.mo76753c("promotion_name", this.f104401c);
            if (C89219l.m154714a((Object) this.f104400b, (Object) "flashsale")) {
                this.f104399a.mo75870b(aVar2);
                aVar2.f106065a.remove("flashsale_price");
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public static void m87444b(Map<String, ? extends Object> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "product_detail");
        linkedHashMap.put("popup_name", "server");
        linkedHashMap.put("action_type", "retry");
        linkedHashMap.put("error_code", "10007209");
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        C45544c.m88082a("tiktokec_popup_click", linkedHashMap);
    }

    /* renamed from: f */
    public static Map<String, Object> m87445f(String str) {
        Object obj;
        Map<String, Object> map = null;
        if (str == null) {
            return null;
        }
        try {
            obj = C89379q.m157068constructorimpl((Map) C33039i.m67675a(str, new C44724d().type));
        } catch (Throwable th) {
            obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        if (!C89379q.m157073isFailureimpl(obj)) {
            map = obj;
        }
        return map;
    }

    /* renamed from: c */
    public final void mo75876c(C45544c.C45545a aVar) {
        LogisticDTO logisticDTO;
        C89219l.m154721d(aVar, "");
        aVar.mo76752b("previous_page", "product_detail");
        int i = 0;
        aVar.mo76752b("is_fullscreen", 0);
        Boolean bool = this.f104343z;
        if (bool != null) {
            aVar.mo76752b("is_address_deliverable", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        ProductPackStruct productPackStruct = this.f104327j;
        if (!(productPackStruct == null || (logisticDTO = productPackStruct.f104681i) == null)) {
            i = logisticDTO.f103614a;
        }
        aVar.mo76752b("delivery_option", Integer.valueOf(i));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.k$k */
    static final class C44731k extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44720k f104359a;

        /* renamed from: b */
        final /* synthetic */ String f104360b;

        /* renamed from: c */
        final /* synthetic */ AbstractC44779h f104361c;

        static {
            Covode.recordClassIndex(53117);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44731k(C44720k kVar, String str, AbstractC44779h hVar) {
            super(1);
            this.f104359a = kVar;
            this.f104360b = str;
            this.f104361c = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0073, code lost:
            if (r3 != null) goto L_0x0048;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0077, code lost:
            if (r3 != null) goto L_0x0054;
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(com.p2082ss.android.ugc.aweme.ecommerce.track.C45544c.C45545a r6) {
            /*
            // Method dump skipped, instructions count: 124
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b.C44720k.C44731k.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.k$r */
    static final class C44738r extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44720k f104392a;

        /* renamed from: b */
        final /* synthetic */ ReviewItemStruct f104393b;

        static {
            Covode.recordClassIndex(53124);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44738r(C44720k kVar, ReviewItemStruct reviewItemStruct) {
            super(1);
            this.f104392a = kVar;
            this.f104393b = reviewItemStruct;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            ProductDetailReview productDetailReview;
            ProductDetailReview productDetailReview2;
            List<ReviewItemStruct> list;
            C45544c.C45545a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            C45544c.C45545a.m88084a(aVar2, this.f104392a.f104318a);
            ProductPackStruct productPackStruct = this.f104392a.f104327j;
            if (productPackStruct != null) {
                productDetailReview = productPackStruct.f104686n;
            } else {
                productDetailReview = null;
            }
            C44720k.m87441a(aVar2, productDetailReview);
            C45157f.C45158a.m87786a(aVar2, this.f104393b, null);
            ProductPackStruct productPackStruct2 = this.f104392a.f104327j;
            int i = 0;
            if (productPackStruct2 != null && (productDetailReview2 = productPackStruct2.f104686n) != null && (list = productDetailReview2.f104666c) != null) {
                Iterator<ReviewItemStruct> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (C89219l.m154714a((Object) it.next().f105340a.f105353a, (Object) this.f104393b.f105340a.f105353a)) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            aVar2.mo76752b("rank", Integer.valueOf(i));
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public final void mo75869b(ReviewItemStruct reviewItemStruct) {
        List<Image> list;
        boolean z;
        boolean z2;
        C89219l.m154721d(reviewItemStruct, "");
        List<Image> list2 = reviewItemStruct.f105340a.f105356d;
        if (list2 != null) {
            int i = 0;
            for (T t : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    C89070n.m154520a();
                }
                String str = reviewItemStruct.f105340a.f105353a;
                String valueOf = String.valueOf(t.getUri());
                Boolean bool = reviewItemStruct.f105345f;
                if (bool != null) {
                    z2 = bool.booleanValue();
                } else {
                    z2 = false;
                }
                m87442a(str, valueOf, i, z2);
                i = i2;
            }
        }
        ReviewItemStruct.AppendReview appendReview = reviewItemStruct.f105340a.f105358f;
        if (!(appendReview == null || (list = appendReview.f105350b) == null)) {
            int i3 = 0;
            for (T t2 : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    C89070n.m154520a();
                }
                String str2 = reviewItemStruct.f105340a.f105353a;
                String valueOf2 = String.valueOf(t2.getUri());
                Boolean bool2 = reviewItemStruct.f105345f;
                if (bool2 != null) {
                    z = bool2.booleanValue();
                } else {
                    z = false;
                }
                m87442a(str2, valueOf2, i3, z);
                i3 = i4;
            }
        }
    }

    /* renamed from: c */
    public final void mo75878c(boolean z) {
        if (this.f104339v) {
            new C44716i(z).mo76746c(this.f104318a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.k$c */
    public static final class C44723c extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44720k f104347a;

        static {
            Covode.recordClassIndex(53109);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44723c(C44720k kVar) {
            super(1);
            this.f104347a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            List<SkuItem> list;
            float f;
            float f2;
            Price realPrice;
            String priceVal;
            Float c;
            Price realPrice2;
            String priceVal2;
            Float c2;
            C45544c.C45545a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            ProductPackStruct productPackStruct = this.f104347a.f104327j;
            SkuPrice skuPrice = null;
            Object next = null;
            skuPrice = null;
            if (!(productPackStruct == null || (list = productPackStruct.f104679g) == null)) {
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getPrice());
                }
                Iterator it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        SkuPrice skuPrice2 = (SkuPrice) next;
                        if (skuPrice2 == null || (realPrice2 = skuPrice2.getRealPrice()) == null || (priceVal2 = realPrice2.getPriceVal()) == null || (c2 = C89361p.m154861c(priceVal2)) == null) {
                            f = 0.0f;
                        } else {
                            f = c2.floatValue();
                        }
                        do {
                            Object next2 = it2.next();
                            SkuPrice skuPrice3 = (SkuPrice) next2;
                            if (skuPrice3 == null || (realPrice = skuPrice3.getRealPrice()) == null || (priceVal = realPrice.getPriceVal()) == null || (c = C89361p.m154861c(priceVal)) == null) {
                                f2 = 0.0f;
                            } else {
                                f2 = c.floatValue();
                            }
                            if (Float.compare(f, f2) > 0) {
                                next = next2;
                                f = f2;
                            }
                        } while (it2.hasNext());
                    }
                }
                skuPrice = (SkuPrice) next;
            }
            C45553a.m88104a(aVar2, this.f104347a.f104318a, this.f104347a.f104327j, skuPrice, 1, "product_detail");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.k$o */
    public static final class C44735o extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44720k f104373a;

        /* renamed from: b */
        final /* synthetic */ boolean f104374b;

        /* renamed from: c */
        final /* synthetic */ Object f104375c;

        /* renamed from: d */
        final /* synthetic */ boolean f104376d;

        static {
            Covode.recordClassIndex(53121);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44735o(C44720k kVar, boolean z, Object obj, boolean z2) {
            super(1);
            this.f104373a = kVar;
            this.f104374b = z;
            this.f104375c = obj;
            this.f104376d = z2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            String str;
            int i;
            int i2;
            Float f;
            String str2;
            PickTag pickTag;
            LogisticDTO logisticDTO;
            LogisticTextDTO logisticTextDTO;
            String str3;
            LogisticDTO logisticDTO2;
            Price price;
            LogisticDTO logisticDTO3;
            Price price2;
            String priceVal;
            LogisticDTO logisticDTO4;
            Integer num;
            C45544c.C45545a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            C45544c.C45545a.m88084a(aVar2, this.f104373a.f104318a);
            if (this.f104374b) {
                str = "full_screen";
            } else {
                str = "half_screen";
            }
            aVar2.mo76752b("page_show_type", str);
            ProductPackStruct productPackStruct = this.f104373a.f104327j;
            if (productPackStruct == null || (num = productPackStruct.f104675c) == null) {
                i = 1;
            } else {
                i = num.intValue();
            }
            aVar2.mo76752b("product_type", String.valueOf(i));
            ProductPackStruct productPackStruct2 = this.f104373a.f104327j;
            if (productPackStruct2 == null || (logisticDTO4 = productPackStruct2.f104681i) == null) {
                i2 = 0;
            } else {
                i2 = logisticDTO4.f103614a;
            }
            aVar2.mo76752b("delivery_option", Integer.valueOf(i2));
            Object obj = this.f104375c;
            if ((obj instanceof Long) && (!C89219l.m154714a(obj, (Object) -1L))) {
                aVar2.mo76750a("start_click_to_now", Long.valueOf(SystemClock.elapsedRealtime() - ((Number) this.f104375c).longValue()));
            }
            ProductPackStruct productPackStruct3 = this.f104373a.f104327j;
            String str4 = null;
            if (productPackStruct3 == null || (logisticDTO3 = productPackStruct3.f104681i) == null || (price2 = logisticDTO3.f103619f) == null || (priceVal = price2.getPriceVal()) == null) {
                f = null;
            } else {
                f = C89361p.m154861c(priceVal);
            }
            ProductPackStruct productPackStruct4 = this.f104373a.f104327j;
            if (productPackStruct4 == null || (logisticDTO2 = productPackStruct4.f104681i) == null || (price = logisticDTO2.f103619f) == null) {
                str2 = null;
            } else {
                str2 = price.getCurrency();
            }
            if (!(f == null || str2 == null)) {
                aVar2.mo76752b("shipping_price", f);
                aVar2.mo76752b("shipping_currency", str2);
            }
            ProductPackStruct productPackStruct5 = this.f104373a.f104327j;
            if (!(productPackStruct5 == null || (logisticDTO = productPackStruct5.f104681i) == null || (logisticTextDTO = logisticDTO.f103623j) == null || (str3 = logisticTextDTO.f103630f) == null)) {
                aVar2.mo76752b("free_shipping_condition", str3);
            }
            ProductPackStruct productPackStruct6 = this.f104373a.f104327j;
            if (!(productPackStruct6 == null || (pickTag = productPackStruct6.f104691s) == null)) {
                str4 = pickTag.f104656d;
            }
            Map<String, ? extends Object> f2 = C44720k.m87445f(str4);
            if (f2 != null) {
                aVar2.mo76751a(f2);
            }
            aVar2.mo76752b("is_with_coupon", Integer.valueOf(this.f104376d ? 1 : 0));
            this.f104373a.mo75857a(aVar2);
            this.f104373a.mo75870b(aVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.k$t */
    static final class C44740t extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44720k f104395a;

        /* renamed from: b */
        final /* synthetic */ boolean f104396b;

        /* renamed from: c */
        final /* synthetic */ long f104397c;

        /* renamed from: d */
        final /* synthetic */ Boolean f104398d;

        static {
            Covode.recordClassIndex(53126);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44740t(C44720k kVar, boolean z, long j, Boolean bool) {
            super(1);
            this.f104395a = kVar;
            this.f104396b = z;
            this.f104397c = j;
            this.f104398d = bool;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            int i;
            String str;
            String str2;
            String str3;
            PickTag pickTag;
            List<SaleProp> list;
            Integer num;
            C45544c.C45545a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            C45544c.C45545a.m88084a(aVar2, this.f104395a.f104318a);
            this.f104395a.mo75857a(aVar2);
            ProductPackStruct productPackStruct = this.f104395a.f104327j;
            if (productPackStruct == null || (num = productPackStruct.f104675c) == null) {
                i = 1;
            } else {
                i = num.intValue();
            }
            aVar2.mo76752b("product_type", String.valueOf(i));
            if (this.f104396b) {
                str = "full_screen";
            } else {
                str = "half_screen";
            }
            aVar2.mo76752b("page_show_type", str);
            aVar2.mo76752b("start_click_to_now", Long.valueOf(SystemClock.elapsedRealtime() - this.f104397c));
            ProductPackStruct productPackStruct2 = this.f104395a.f104327j;
            if (productPackStruct2 == null || (list = productPackStruct2.f104678f) == null || list.size() <= 6) {
                str2 = "no_greater_than_6";
            } else {
                str2 = "greater_than_6";
            }
            aVar2.mo76752b("sku_show_type", str2);
            ProductPackStruct productPackStruct3 = this.f104395a.f104327j;
            if (productPackStruct3 == null || (pickTag = productPackStruct3.f104691s) == null) {
                str3 = null;
            } else {
                str3 = pickTag.f104656d;
            }
            Map<String, ? extends Object> f = C44720k.m87445f(str3);
            if (f != null) {
                aVar2.mo76751a(f);
            }
            Boolean bool = this.f104398d;
            if (bool != null) {
                aVar2.mo76752b("is_buy_with_coupon", Integer.valueOf(bool.booleanValue() ? 1 : 0));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static void m87443a(Map<String, ? extends Object> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "product_detail");
        linkedHashMap.put("popup_name", "server");
        linkedHashMap.put("error_code", "10007209");
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        C45544c.m88082a("tiktokec_popup_show", linkedHashMap);
    }

    /* renamed from: b */
    public final void mo75870b(C45544c.C45545a aVar) {
        Object obj;
        String str;
        FlashSale flashSale;
        Integer num = this.f104329l;
        String str2 = null;
        if (num != null) {
            if (num.intValue() == 1) {
                obj = "warm_up";
            } else if (num.intValue() == 2) {
                obj = "on_sale";
            } else {
                return;
            }
            aVar.mo76753c("flashsale_status", obj);
            ProductPackStruct productPackStruct = this.f104327j;
            if (productPackStruct == null || (flashSale = productPackStruct.f104687o) == null) {
                str = null;
            } else {
                str = flashSale.f104646g;
            }
            aVar.mo76753c("flashsale_price", str);
            if (C89219l.m154714a(obj, (Object) "warm_up")) {
                Long l = this.f104330m;
                if (l != null && l.longValue() >= 86400000) {
                    str2 = "no_countdown";
                    aVar.mo76753c("countdown_type", str2);
                }
            } else {
                if (C89219l.m154714a(obj, (Object) "on_sale")) {
                    Long l2 = this.f104330m;
                    if (l2 != null && l2.longValue() >= 86400000) {
                        str2 = "gt_24";
                    }
                }
                aVar.mo76753c("countdown_type", str2);
            }
            str2 = "in_24";
            aVar.mo76753c("countdown_type", str2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.b.k$p */
    public static final class C44736p extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C44720k f104377a;

        /* renamed from: b */
        final /* synthetic */ boolean f104378b;

        /* renamed from: c */
        final /* synthetic */ long f104379c;

        /* renamed from: d */
        final /* synthetic */ boolean f104380d;

        /* renamed from: e */
        final /* synthetic */ boolean f104381e;

        /* renamed from: f */
        final /* synthetic */ boolean f104382f;

        /* renamed from: g */
        final /* synthetic */ boolean f104383g;

        /* renamed from: h */
        final /* synthetic */ Float f104384h;

        /* renamed from: i */
        final /* synthetic */ String f104385i;

        /* renamed from: j */
        final /* synthetic */ boolean f104386j;

        static {
            Covode.recordClassIndex(53122);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44736p(C44720k kVar, boolean z, long j, boolean z2, boolean z3, boolean z4, boolean z5, Float f, String str, boolean z6) {
            super(1);
            this.f104377a = kVar;
            this.f104378b = z;
            this.f104379c = j;
            this.f104380d = z2;
            this.f104381e = z3;
            this.f104382f = z4;
            this.f104383g = z5;
            this.f104384h = f;
            this.f104385i = str;
            this.f104386j = z6;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            String str;
            int i;
            String str2;
            PickTag pickTag;
            LogisticDTO logisticDTO;
            LogisticTextDTO logisticTextDTO;
            String str3;
            LogisticDTO logisticDTO2;
            Integer num;
            C45544c.C45545a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            C45544c.C45545a.m88084a(aVar2, this.f104377a.f104318a);
            if (this.f104378b) {
                str = "full_screen";
            } else {
                str = "half_screen";
            }
            aVar2.mo76752b("page_show_type", str);
            ProductPackStruct productPackStruct = this.f104377a.f104327j;
            int i2 = 1;
            if (productPackStruct == null || (num = productPackStruct.f104675c) == null) {
                i = 1;
            } else {
                i = num.intValue();
            }
            aVar2.mo76752b("product_type", String.valueOf(i));
            this.f104377a.mo75857a(aVar2);
            aVar2.mo76752b("sku_photo_view_cnt", Integer.valueOf(this.f104377a.f104321d.size()));
            aVar2.mo76752b("main_photo_view_cnt", Integer.valueOf(this.f104377a.f104320c.size()));
            aVar2.mo76752b("stay_time", Long.valueOf(this.f104379c));
            aVar2.mo76752b("quit_type", this.f104377a.f104342y);
            aVar2.mo76752b("is_sku_selected", Integer.valueOf(this.f104380d ? 1 : 0));
            aVar2.mo76752b("is_add_cart", Integer.valueOf(this.f104381e ? 1 : 0));
            aVar2.mo76752b("is_collection_clicked", Integer.valueOf(this.f104382f ? 1 : 0));
            aVar2.mo76752b("is_image_clicked", Integer.valueOf(this.f104377a.f104322e ? 1 : 0));
            aVar2.mo76752b("is_seller_store_entered", Integer.valueOf(this.f104377a.f104328k ? 1 : 0));
            int i3 = 0;
            if (this.f104377a.f104327j == null) {
                i2 = 0;
            }
            aVar2.mo76752b("is_load_data", Integer.valueOf(i2));
            aVar2.mo76752b("is_address_deliverable", Integer.valueOf(this.f104383g ? 1 : 0));
            ProductPackStruct productPackStruct2 = this.f104377a.f104327j;
            if (!(productPackStruct2 == null || (logisticDTO2 = productPackStruct2.f104681i) == null)) {
                i3 = logisticDTO2.f103614a;
            }
            aVar2.mo76752b("delivery_option", Integer.valueOf(i3));
            Float f = this.f104384h;
            if (!(f == null || this.f104385i == null)) {
                aVar2.mo76752b("shipping_price", f);
                aVar2.mo76752b("shipping_currency", this.f104385i);
            }
            this.f104377a.mo75870b(aVar2);
            ProductPackStruct productPackStruct3 = this.f104377a.f104327j;
            if (!(productPackStruct3 == null || (logisticDTO = productPackStruct3.f104681i) == null || (logisticTextDTO = logisticDTO.f103623j) == null || (str3 = logisticTextDTO.f103630f) == null)) {
                aVar2.mo76752b("free_shipping_condition", str3);
            }
            ProductPackStruct productPackStruct4 = this.f104377a.f104327j;
            if (productPackStruct4 == null || (pickTag = productPackStruct4.f104691s) == null) {
                str2 = null;
            } else {
                str2 = pickTag.f104656d;
            }
            Map<String, ? extends Object> f2 = C44720k.m87445f(str2);
            if (f2 != null) {
                aVar2.mo76751a(f2);
            }
            aVar2.mo76752b("is_with_coupon", Integer.valueOf(this.f104386j ? 1 : 0));
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo75853a(C44778g gVar) {
        C89219l.m154721d(gVar, "");
        if (!this.f104314E) {
            this.f104314E = true;
            C45544c.m88081a("tiktokec_module_show", new C44730j(this, gVar));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0067, code lost:
        if (r1.length() == 0) goto L_0x0069;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo75854a(com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct r7) {
        /*
        // Method dump skipped, instructions count: 168
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b.C44720k.mo75854a(com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct):void");
    }

    /* renamed from: b */
    public final void mo75874b(boolean z) {
        this.f104332o = z;
        this.f104318a.put("is_single_sku", Integer.valueOf(z ? 1 : 0));
    }

    /* renamed from: a */
    public final void mo75856a(SkuPrice skuPrice, int i) {
        C45544c.m88081a("StartCheckout", new C44722b(this, skuPrice, i));
    }

    /* renamed from: a */
    public static void m87441a(C45544c.C45545a aVar, ProductDetailReview productDetailReview) {
        int i;
        if (productDetailReview == null || productDetailReview.f104664a == null) {
            i = 0;
        } else {
            i = 1;
        }
        aVar.mo76752b("has_rate", Integer.valueOf(i));
        if (productDetailReview != null) {
            Float f = productDetailReview.f104664a;
            if (f != null) {
                aVar.mo76752b("rate", Float.valueOf(f.floatValue()));
            }
            Integer num = productDetailReview.f104665b;
            if (num != null) {
                aVar.mo76752b("review_cnt", Integer.valueOf(num.intValue()));
            }
        }
    }

    public C44720k(Context context, IPdpStarter.PdpEnterParam pdpEnterParam) {
        String str;
        C89219l.m154721d(context, "");
        C89219l.m154721d(pdpEnterParam, "");
        this.f104312B = pdpEnterParam;
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<>();
        this.f104318a = linkedHashMap;
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "product_detail");
        HashMap<String, Object> trackParams = pdpEnterParam.getTrackParams();
        if (trackParams != null) {
            linkedHashMap.putAll(trackParams);
        }
        linkedHashMap.remove("user_id");
        if (this.f104331n) {
            str = "full_screen";
        } else {
            str = "half_screen";
        }
        linkedHashMap.put("page_show_type", str);
        mo75866a(pdpEnterParam.getFullScreen());
        mo75874b(false);
        this.f104334q = SystemClock.elapsedRealtime();
        this.f104335r = SystemClock.elapsedRealtime();
        TrackerProvider.C45534a.m88074a(context, this);
        this.f104313D = new LinkedHashSet();
        this.f104316G = new HashSet<>();
        this.f104317H = new HashSet<>();
    }

    /* renamed from: b */
    public final void mo75872b(String str, Boolean bool) {
        C89219l.m154721d(str, "");
        new C44710e(str, bool).mo76746c(this.f104318a);
    }

    /* renamed from: b */
    public final void mo75873b(String str, HashMap<String, Object> hashMap) {
        C89219l.m154721d(str, "");
        C45544c.m88081a("tiktokec_button_click", new C44725e(this, str, hashMap));
    }

    /* renamed from: a */
    private void m87442a(String str, String str2, int i, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (!this.f104317H.contains(str2)) {
            this.f104317H.add(str2);
            C45544c.m88081a("tiktokec_photo_show", new C44737q(this, str2, i, str, z));
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m87440a(C44720k kVar, String str, boolean z, Float f, String str2, String str3, int i) {
        Float f2 = f;
        String str4 = str2;
        String str5 = null;
        if ((i & 4) != 0) {
            f2 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 32) == 0) {
            str5 = str3;
        }
        kVar.mo75865a(str, z, f2, str4, false, str5);
    }
}
