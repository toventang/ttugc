package com.p2082ss.android.ugc.aweme.utils;

import android.os.Bundle;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.keva.Keva;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.setting.api.LinkPrivacyPopupApi;
import com.p2082ss.android.ugc.aweme.setting.model.C68179i;
import com.p2082ss.android.ugc.aweme.setting.p3732ui.p3733a.C68507a;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.ei */
public final class C80382ei {

    /* renamed from: d */
    public static final C80383a f179912d = new C80383a((byte) 0);

    /* renamed from: a */
    public final String f179913a;

    /* renamed from: b */
    public final boolean f179914b;

    /* renamed from: c */
    public final AbstractC0952i f179915c;

    /* renamed from: e */
    private final AbstractC89244h f179916e = C89250i.m154773a((AbstractC89171a) C80384b.f179918a);

    /* renamed from: f */
    private final AbstractC89244h f179917f = C89250i.m154773a((AbstractC89171a) C80385c.f179919a);

    /* renamed from: com.ss.android.ugc.aweme.utils.ei$e */
    static final class C80387e<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C80387e f179921a = new C80387e();

        static {
            Covode.recordClassIndex(93655);
        }

        C80387e() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.ei$g */
    public static final class C80389g<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C80389g f179923a = new C80389g();

        static {
            Covode.recordClassIndex(93657);
        }

        C80389g() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(93650);
    }

    /* renamed from: a */
    public final Keva mo123717a() {
        return (Keva) this.f179916e.getValue();
    }

    /* renamed from: b */
    public final LinkPrivacyPopupApi mo123718b() {
        return (LinkPrivacyPopupApi) this.f179917f.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.ei$a */
    public static final class C80383a {
        static {
            Covode.recordClassIndex(93651);
        }

        private C80383a() {
        }

        public /* synthetic */ C80383a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.ei$b */
    static final class C80384b extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C80384b f179918a = new C80384b();

        static {
            Covode.recordClassIndex(93652);
        }

        C80384b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("LINK_PRIVACY_DIALOG_SHOWED");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.ei$c */
    static final class C80385c extends AbstractC89220m implements AbstractC89171a<LinkPrivacyPopupApi> {

        /* renamed from: a */
        public static final C80385c f179919a = new C80385c();

        static {
            Covode.recordClassIndex(93653);
        }

        C80385c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LinkPrivacyPopupApi invoke() {
            Object a = RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(LinkPrivacyPopupApi.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.ei$d */
    static final class C80386d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C80382ei f179920a;

        static {
            Covode.recordClassIndex(93654);
        }

        C80386d(C80382ei eiVar) {
            this.f179920a = eiVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f179920a.mo123717a().storeBoolean(this.f179920a.f179913a, true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.ei$f */
    public static final class C80388f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C80382ei f179922a;

        static {
            Covode.recordClassIndex(93656);
        }

        public C80388f(C80382ei eiVar) {
            this.f179922a = eiVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            boolean z;
            C68179i iVar = (C68179i) obj;
            C80382ei eiVar = this.f179922a;
            C89219l.m154716b(iVar, "");
            if (iVar.f152655a) {
                Fragment a = eiVar.f179915c.mo3551a("Privacy_Guide");
                if (a == null || !(a instanceof C68507a)) {
                    boolean z2 = eiVar.f179914b;
                    Boolean bool = iVar.f152656b;
                    if (bool != null) {
                        z = bool.booleanValue();
                    } else {
                        z = false;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("is_sharer", z2);
                    bundle.putBoolean("privacy_toggle", z);
                    C68507a aVar = new C68507a();
                    aVar.setArguments(bundle);
                    AbstractC0976n a2 = eiVar.f179915c.mo3552a();
                    C89219l.m154716b(a2, "");
                    a2.mo3454a(R.id.cg7, aVar, "Privacy_Guide").mo3473c();
                    C39162r.onEventV3("link_privacy_pop_up");
                    eiVar.mo123718b().updateLinkPrivacyPopupStatus(true).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C80386d(eiVar), C80387e.f179921a);
                }
            } else if (iVar.f152657c) {
                eiVar.mo123717a().storeBoolean(eiVar.f179913a, true);
            }
        }
    }

    public C80382ei(String str, boolean z, AbstractC0952i iVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(iVar, "");
        this.f179913a = str;
        this.f179914b = z;
        this.f179915c = iVar;
    }
}
