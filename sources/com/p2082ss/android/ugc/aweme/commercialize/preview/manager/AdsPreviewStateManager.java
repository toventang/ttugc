package com.p2082ss.android.ugc.aweme.commercialize.preview.manager;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.commercialize.preview.api.AdsPreviewApi;
import com.p2082ss.android.ugc.aweme.commercialize.preview.p2608a.AbstractC38305a;
import com.p2082ss.android.ugc.aweme.commercialize.preview.p2609b.C38306a;
import com.p2082ss.android.ugc.aweme.commercialize.preview.p2610c.AbstractC38307a;
import com.p2082ss.android.ugc.aweme.commercialize.util.C38583c;
import com.p2082ss.android.ugc.aweme.commercialize.util.p2620b.C38582a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4589j.C88934a;
import p4560f.p4561a.p4590k.C88946a;
import p4560f.p4561a.p4591l.C88958b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.preview.manager.AdsPreviewStateManager */
public final class AdsPreviewStateManager implements AbstractC33974au {

    /* renamed from: f */
    public static List<String> f90554f;

    /* renamed from: g */
    public static List<String> f90555g;

    /* renamed from: h */
    public static final C38318a f90556h = new C38318a((byte) 0);

    /* renamed from: a */
    public final C88958b<AbstractC38307a> f90557a;

    /* renamed from: b */
    public final C88411a f90558b = new C88411a();

    /* renamed from: c */
    public AbstractC38305a f90559c;

    /* renamed from: d */
    public String f90560d = "";

    /* renamed from: e */
    public String f90561e = "";

    /* renamed from: i */
    private final Keva f90562i = Keva.getRepo("ads_preview_keva");

    /* renamed from: com.ss.android.ugc.aweme.commercialize.preview.manager.AdsPreviewStateManager$c */
    public static final class C38320c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C38320c f90564a = new C38320c();

        static {
            Covode.recordClassIndex(45811);
        }

        C38320c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(45808);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            dispose();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.preview.manager.AdsPreviewStateManager$a */
    public static final class C38318a {
        static {
            Covode.recordClassIndex(45809);
        }

        private C38318a() {
        }

        public /* synthetic */ C38318a(byte b) {
            this();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void dispose() {
        this.f90558b.dispose();
    }

    public AdsPreviewStateManager() {
        C88958b<AbstractC38307a> bVar = new C88958b<>();
        C89219l.m154716b(bVar, "");
        this.f90557a = bVar;
    }

    /* renamed from: a */
    public final void mo66927a() {
        AbstractC88412b a = ((AdsPreviewApi) C38582a.m78287a(AdsPreviewApi.class, C38583c.f91178a)).sendAdsPreviewRequest(this.f90560d, this.f90561e).mo143285c(new C38321d(this)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143254a(new C38322e(this), new C38323f(this));
        C89219l.m154716b(a, "");
        C88934a.m154195a(a, this.f90558b);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.preview.manager.AdsPreviewStateManager$d */
    static final class C38321d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AdsPreviewStateManager f90565a;

        static {
            Covode.recordClassIndex(45812);
        }

        C38321d(AdsPreviewStateManager adsPreviewStateManager) {
            this.f90565a = adsPreviewStateManager;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f90565a.mo66928a(AbstractC38307a.C38309b.f90533a);
        }
    }

    /* renamed from: a */
    public final void mo66928a(AbstractC38307a aVar) {
        this.f90557a.onNext(aVar);
    }

    /* renamed from: a */
    public static final /* synthetic */ AbstractC38305a m77707a(AdsPreviewStateManager adsPreviewStateManager) {
        AbstractC38305a aVar = adsPreviewStateManager.f90559c;
        if (aVar == null) {
            C89219l.m154710a("previewCallback");
        }
        return aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.preview.manager.AdsPreviewStateManager$f */
    static final class C38323f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AdsPreviewStateManager f90567a;

        static {
            Covode.recordClassIndex(45814);
        }

        C38323f(AdsPreviewStateManager adsPreviewStateManager) {
            this.f90567a = adsPreviewStateManager;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f90567a.mo66928a(AbstractC38307a.C38308a.f90532a);
            this.f90567a.mo66929a(null, null);
            C39162r.onEventV3("ads_interface_preview_ad_failed");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.preview.manager.AdsPreviewStateManager$b */
    public static final class C38319b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AdsPreviewStateManager f90563a;

        static {
            Covode.recordClassIndex(45810);
        }

        public C38319b(AdsPreviewStateManager adsPreviewStateManager) {
            this.f90563a = adsPreviewStateManager;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (obj instanceof AbstractC38307a.C38312e) {
                AdsPreviewStateManager.m77707a(this.f90563a).mo66896a();
            } else if (obj instanceof AbstractC38307a.C38311d) {
                AdsPreviewStateManager.m77707a(this.f90563a).mo66897b();
            } else if (obj instanceof AbstractC38307a.C38309b) {
                AdsPreviewStateManager.m77707a(this.f90563a).mo66898c();
            } else if (obj instanceof AbstractC38307a.C38310c) {
                AdsPreviewStateManager.m77707a(this.f90563a).mo66899d();
            } else if (obj instanceof AbstractC38307a.C38308a) {
                AdsPreviewStateManager.m77707a(this.f90563a).mo66900e();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.preview.manager.AdsPreviewStateManager$e */
    static final class C38322e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AdsPreviewStateManager f90566a;

        static {
            Covode.recordClassIndex(45813);
        }

        C38322e(AdsPreviewStateManager adsPreviewStateManager) {
            this.f90566a = adsPreviewStateManager;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List<String> adIds;
            List<String> creativeIds;
            List<String> creativeIds2;
            C38306a aVar = (C38306a) obj;
            List<String> adIds2 = aVar.getAdIds();
            if (((adIds2 == null || adIds2.isEmpty()) && ((creativeIds2 = aVar.getCreativeIds()) == null || creativeIds2.isEmpty())) || ((adIds = aVar.getAdIds()) != null && !adIds.isEmpty() && (creativeIds = aVar.getCreativeIds()) != null && !creativeIds.isEmpty())) {
                this.f90566a.mo66928a(AbstractC38307a.C38308a.f90532a);
                this.f90566a.mo66929a(null, null);
                C39162r.onEventV3("ads_interface_preview_ad_failed");
                return;
            }
            this.f90566a.mo66928a(AbstractC38307a.C38310c.f90534a);
            this.f90566a.mo66929a(aVar.getAdIds(), aVar.getCreativeIds());
        }
    }

    /* renamed from: a */
    public final void mo66929a(List<String> list, List<String> list2) {
        boolean z;
        f90554f = list;
        f90555g = list2;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f90562i.storeLong("preview_timestamp", System.currentTimeMillis());
            Keva keva = this.f90562i;
            Object[] array = list.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            keva.storeStringArray("preview_adids", (String[]) array);
        }
        if (list2 != null && !list2.isEmpty()) {
            this.f90562i.storeLong("preview_timestamp", System.currentTimeMillis());
            Keva keva2 = this.f90562i;
            Object[] array2 = list2.toArray(new String[0]);
            Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
            keva2.storeStringArray("preview_cids", (String[]) array2);
        }
    }
}
