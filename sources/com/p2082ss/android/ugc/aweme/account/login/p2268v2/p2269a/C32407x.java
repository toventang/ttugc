package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.p025c.C0484a;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.sdk.p1625a.AbstractC22346c;
import com.bytedance.sdk.p1625a.p1626a.AbstractC22329e;
import com.bytedance.sdk.p1625a.p1626a.C22306c;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22289b;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22292e;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22293f;
import com.bytedance.sdk.p1625a.p1626a.p1628b.AbstractC22295a;
import com.bytedance.sdk.p1625a.p1626a.p1628b.AbstractC22296b;
import com.bytedance.sdk.p1625a.p1626a.p1628b.AbstractC22302h;
import com.bytedance.sdk.p1625a.p1626a.p1628b.AbstractC22303i;
import com.bytedance.sdk.p1625a.p1626a.p1628b.AbstractC22305k;
import com.bytedance.sdk.p1625a.p1626a.p1630d.C22314a;
import com.bytedance.sdk.p1625a.p1626a.p1630d.C22315b;
import com.bytedance.sdk.p1625a.p1626a.p1630d.C22318e;
import com.bytedance.sdk.p1625a.p1626a.p1630d.C22325l;
import com.bytedance.sdk.p1625a.p1626a.p1630d.C22326m;
import com.bytedance.sdk.p1625a.p1626a.p1630d.C22328o;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22406a;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22407b;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22408c;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22409d;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22410e;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22411f;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22412g;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22416k;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22417l;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22418m;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22419n;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22420o;
import com.bytedance.sdk.p1625a.p1645h.p1647b.C22449l;
import com.bytedance.sdk.p1625a.p1645h.p1647b.p1648a.AbstractC22423a;
import com.bytedance.sdk.p1625a.p1645h.p1647b.p1648a.AbstractC22424b;
import com.bytedance.sdk.p1625a.p1645h.p1647b.p1648a.AbstractC22425c;
import com.bytedance.sdk.p1625a.p1645h.p1647b.p1648a.AbstractC22426d;
import com.bytedance.sdk.p1625a.p1645h.p1647b.p1648a.AbstractC22427e;
import com.bytedance.sdk.p1625a.p1645h.p1647b.p1648a.AbstractC22428f;
import com.bytedance.sdk.p1625a.p1645h.p1647b.p1648a.AbstractC22429g;
import com.bytedance.sdk.p1625a.p1645h.p1647b.p1648a.AbstractC22430h;
import com.bytedance.sdk.p1625a.p1645h.p1647b.p1648a.AbstractC22431i;
import com.bytedance.sdk.p1625a.p1645h.p1647b.p1648a.AbstractC22432j;
import com.bytedance.sdk.p1625a.p1645h.p1647b.p1648a.AbstractC22434l;
import com.bytedance.sdk.p1625a.p1645h.p1647b.p1648a.AbstractC22435m;
import com.bytedance.sdk.p1625a.p1645h.p1647b.p1648a.AbstractC22436n;
import com.bytedance.sdk.p1625a.p1645h.p1647b.p1648a.AbstractC22438p;
import com.bytedance.sdk.p1625a.p1663n.C22507a;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.account.C31673h;
import com.p2082ss.android.ugc.aweme.account.agegate.util.C31566h;
import com.p2082ss.android.ugc.aweme.account.api.p2241a.C31571a;
import com.p2082ss.android.ugc.aweme.account.experiment.C31663o;
import com.p2082ss.android.ugc.aweme.account.login.p2258c.C31896b;
import com.p2082ss.android.ugc.aweme.account.login.p2263h.C31940a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32584f;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.ActionResultModel;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32582d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32399s;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32405w;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.p2270a.C32334a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.C32634g;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.C32646i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.C32731t;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.C32746u;
import com.p2082ss.android.ugc.aweme.account.login.recover.p2264a.C31999a;
import com.p2082ss.android.ugc.aweme.account.login.recover.p2264a.C32004b;
import com.p2082ss.android.ugc.aweme.account.login.recover.p2264a.C32010c;
import com.p2082ss.android.ugc.aweme.account.login.recover.p2264a.C32012d;
import com.p2082ss.android.ugc.aweme.account.login.recover.p2264a.C32014e;
import com.p2082ss.android.ugc.aweme.account.login.recover.p2264a.C32016f;
import com.p2082ss.android.ugc.aweme.account.login.recover.p2264a.p2265a.AbstractC32001a;
import com.p2082ss.android.ugc.aweme.account.login.recover.p2264a.p2265a.AbstractC32002b;
import com.p2082ss.android.ugc.aweme.account.login.recover.p2264a.p2265a.AbstractC32003c;
import com.p2082ss.android.ugc.aweme.account.login.recover.p2264a.p2266b.C32007a;
import com.p2082ss.android.ugc.aweme.account.login.recover.p2264a.p2266b.C32008b;
import com.p2082ss.android.ugc.aweme.account.login.recover.p2264a.p2266b.C32009c;
import com.p2082ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2242b.C31588c;
import com.p2082ss.android.ugc.aweme.account.p2273m.C32838c;
import com.p2082ss.android.ugc.aweme.account.p2273m.C32840d;
import com.p2082ss.android.ugc.aweme.account.p2273m.C32844f;
import com.p2082ss.android.ugc.aweme.account.p2274n.C32853e;
import com.p2082ss.android.ugc.aweme.account.p2274n.C32856f;
import com.p2082ss.android.ugc.aweme.account.util.C33047p;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;
import org.p4663a.AbstractC90213b;
import org.p4663a.AbstractC90214c;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.AbstractC88974o;
import p4560f.p4561a.AbstractC88976q;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x */
public final class C32407x {

    /* renamed from: a */
    public static final C32407x f77264a = new C32407x();

    /* renamed from: b */
    private static final AbstractC89244h f77265b = C89250i.m154773a((AbstractC89171a) C32507cp.f77571a);

    /* renamed from: a */
    public static boolean m66805a() {
        return ((Boolean) f77265b.getValue()).booleanValue();
    }

    private C32407x() {
    }

    /* renamed from: a */
    public static /* synthetic */ AbstractC88973n m66803a(AbstractC32572b bVar, String str, String str2, String str3, boolean z, AbstractC89172b bVar2, int i) {
        boolean z2 = z;
        if ((i & 16) != 0) {
            z2 = false;
        }
        if ((i & 32) != 0) {
            bVar2 = null;
        }
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        AbstractC88973n b = AbstractC88973n.m154243a((AbstractC88976q) new C32437as(str3, bVar, z2, str2, str)).mo143251d(new C32439at(str3, bVar, str, str2, z2)).mo143244b(new C32442au(str3, bVar2, bVar, z2));
        C89219l.m154716b(b, "");
        return C32555z.m67011a(bVar, b);
    }

    /* renamed from: a */
    public static AbstractC88973n<C22291d<C22416k>> m66800a(AbstractC32572b bVar, String str, String str2, EnumC32592i iVar, EnumC32594j jVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(jVar, "");
        boolean z = iVar == EnumC32592i.SIGN_UP;
        AbstractC88973n d = AbstractC88973n.m154243a((AbstractC88976q) new C32447ay(z, bVar, iVar, jVar, str, str2)).mo143244b(new C32449az(z, bVar)).mo143251d(new C32451ba(z, bVar));
        C89219l.m154716b(d, "");
        return C32555z.m67011a(bVar, d);
    }

    /* renamed from: a */
    public static /* synthetic */ AbstractC88973n m66795a(AbstractC32572b bVar, String str, EnumC32592i iVar, EnumC32594j jVar, String str2, String str3, String str4, int i) {
        if ((i & 16) != 0) {
            str2 = "";
        }
        if ((i & 64) != 0) {
            str4 = null;
        }
        return m66796a(bVar, str, iVar, jVar, str2, str3, str4, (Map<String, String>) null);
    }

    /* renamed from: a */
    public static AbstractC88973n<C22291d<C22419n>> m66796a(AbstractC32572b bVar, String str, EnumC32592i iVar, EnumC32594j jVar, String str2, String str3, String str4, Map<String, String> map) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        int a = m66784a(iVar);
        int a2 = m66785a(jVar);
        AbstractC88973n d = AbstractC88973n.m154243a((AbstractC88976q) new C32480bw(str3, a2, bVar, iVar, jVar, map, str, str2, a)).mo143244b(new C32482bx(a2, str4, jVar, bVar, str3, str)).mo143251d(new C32483by(a2, str4, str3, str));
        C89219l.m154716b(d, "");
        return C32555z.m67011a(bVar, d);
    }

    /* renamed from: a */
    public static AbstractC88973n<C22291d<C22419n>> m66793a(AbstractC32572b bVar, String str, EnumC32592i iVar, EnumC32594j jVar, String str2, String str3) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        int a = m66784a(iVar);
        int a2 = m66785a(jVar);
        AbstractC88973n d = AbstractC88973n.m154243a((AbstractC88976q) new C32493cf(str2, a2, bVar, str, str3, a, iVar, jVar)).mo143244b(new C32495cg(a2, jVar, bVar, str2, str)).mo143251d(new C32496ch(a2, str2, str));
        C89219l.m154716b(d, "");
        return C32555z.m67011a(bVar, d);
    }

    /* renamed from: a */
    public static AbstractC88973n<C22314a> m66799a(AbstractC32572b bVar, String str, String str2, int i, Map<String, String> map, AbstractC89172b<? super C32405w, C89391z> bVar2) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        AbstractC88973n b = AbstractC88973n.m154243a((AbstractC88976q) new C32540q(bVar, str, str2, i, map)).mo143251d(new C32542r(bVar)).mo143244b(new C32543s(bVar2, bVar));
        C89219l.m154716b(b, "");
        return C32555z.m67011a(bVar, b);
    }

    /* renamed from: a */
    public static AbstractC88973n<C22314a> m66804a(String str, AbstractC32572b bVar, String str2, String str3, int i, Map<String, String> map, AbstractC89172b<? super C32405w, C89391z> bVar2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        AbstractC88973n b = AbstractC88973n.m154243a((AbstractC88976q) new C32411ab(bVar, map, str2, str3, i)).mo143251d(new C32413ac(str, bVar)).mo143244b(new C32414ad(str, bVar, bVar2));
        C89219l.m154716b(b, "");
        return C32555z.m67011a(bVar, b);
    }

    /* renamed from: a */
    public static AbstractC88973n<C22291d<C22419n>> m66797a(AbstractC32572b bVar, String str, EnumC32594j jVar, String str2) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(str2, "");
        int a = m66785a(jVar);
        AbstractC88973n b = AbstractC88973n.m154243a((AbstractC88976q) new C32476bt(str2, a, bVar, jVar, str)).mo143251d(new C32478bu(a, str2, str)).mo143244b(new C32479bv(a, str2, str));
        C89219l.m154716b(b, "");
        return C32555z.m67011a(bVar, b);
    }

    /* renamed from: a */
    public static AbstractC88973n<C22291d<C22419n>> m66794a(AbstractC32572b bVar, String str, EnumC32592i iVar, EnumC32594j jVar, String str2, String str3, String str4) {
        String str5;
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(str4, "");
        int a = m66784a(iVar);
        int a2 = m66785a(jVar);
        if (!TextUtils.isEmpty(bVar.mo58467x())) {
            str5 = bVar.mo58467x();
        } else {
            int i = C32554y.f77682c[jVar.ordinal()];
            str5 = (i == 1 || i == 2) ? "first_bind_phone_click" : i != 3 ? (i == 4 || i == 5) ? "rebind_phone_click" : "" : "change_bind_phone_click";
        }
        C89219l.m154716b(str5, "");
        AbstractC88973n b = AbstractC88973n.m154243a((AbstractC88976q) new C32468bn(str4, a2, str5, bVar, iVar, jVar, str, str2, a, str3)).mo143251d(new C32470bo(a2, str4, str)).mo143244b(new C32471bp(a2, str4, str));
        C89219l.m154716b(b, "");
        return C32555z.m67011a(bVar, b);
    }

    /* renamed from: a */
    public static AbstractC88973n<C32009c> m66791a(AbstractC32572b bVar, String str, EnumC32592i iVar, EnumC32594j jVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(jVar, "");
        AbstractC88973n a = AbstractC88973n.m154243a((AbstractC88976q) new C32435ar(bVar, str, iVar, jVar));
        C89219l.m154716b(a, "");
        return C32555z.m67011a(bVar, a);
    }

    /* renamed from: a */
    public static AbstractC88973n<C22291d<C22420o>> m66801a(AbstractC32572b bVar, String str, String str2, String str3, String str4) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        AbstractC88973n b = AbstractC88973n.m154243a((AbstractC88976q) new C32443av(str3, bVar, str2, str, str4)).mo143251d(new C32445aw(bVar, str3)).mo143244b(new C32446ax(str3, bVar));
        C89219l.m154716b(b, "");
        return C32555z.m67011a(bVar, b);
    }

    /* renamed from: a */
    public static AbstractC88973n<C22315b> m66798a(AbstractC32572b bVar, String str, String str2) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        AbstractC88973n a = AbstractC88973n.m154243a((AbstractC88976q) new C32547v(bVar, str2, str));
        C89219l.m154716b(a, "");
        return C32555z.m67011a(bVar, a);
    }

    /* renamed from: a */
    public static AbstractC88973n<C32403u> m66802a(AbstractC32572b bVar, String str, String str2, String str3, String str4, Map<String, String> map) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        AbstractC88973n a = AbstractC88973n.m154243a((AbstractC88976q) new C32429ao(bVar, map, str, str2, str3, str4));
        C89219l.m154716b(a, "");
        return C32555z.m67011a(bVar, a);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$z */
    public static final class C32553z implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77679a;

        static {
            Covode.recordClassIndex(39321);
        }

        public C32553z(AbstractC32572b bVar) {
            this.f77679a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            this.f77679a.mo57470b_(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$cp */
    static final class C32507cp extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C32507cp f77571a = new C32507cp();

        static {
            Covode.recordClassIndex(39275);
        }

        C32507cp() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C31663o.m65975a());
        }
    }

    static {
        Covode.recordClassIndex(39175);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$at */
    public static final class C32439at<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ String f77355a;

        /* renamed from: b */
        final /* synthetic */ AbstractC32572b f77356b;

        /* renamed from: c */
        final /* synthetic */ String f77357c;

        /* renamed from: d */
        final /* synthetic */ String f77358d;

        /* renamed from: e */
        final /* synthetic */ boolean f77359e;

        static {
            Covode.recordClassIndex(39207);
        }

        C32439at(String str, AbstractC32572b bVar, String str2, String str3, boolean z) {
            this.f77355a = str;
            this.f77356b = bVar;
            this.f77357c = str2;
            this.f77358d = str3;
            this.f77359e = z;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$at$a */
        static final class C32441a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C32439at f77361a;

            /* renamed from: b */
            final /* synthetic */ C22291d f77362b;

            static {
                Covode.recordClassIndex(39209);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32441a(C32439at atVar, C22291d dVar) {
                super(0);
                this.f77361a = atVar;
                this.f77362b = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                if (!C89219l.m154714a((Object) this.f77361a.f77355a, (Object) "phone")) {
                    C32582d.m67063a(this.f77361a.f77356b, this.f77361a.f77357c);
                }
                C32853e.m67449a(this.f77361a.f77357c, this.f77361a.f77358d, this.f77361a.f77355a, this.f77361a.f77356b, this.f77361a.f77359e ? 1 : 0, "login");
                C32404v.m66778a(false, this.f77361a.f77355a, (AbstractC32584f) this.f77361a.f77356b, ((C22420o) this.f77362b.f52723j).f53055u, (Map) null, this.f77361a.f77359e, 16);
                AbstractC32572b bVar = this.f77361a.f77356b;
                EnumC32592i iVar = EnumC32592i.LOGIN;
                EnumC32594j Z_ = this.f77361a.f77356b.mo58460Z_();
                C22507a aVar = ((C22420o) this.f77362b.f52723j).f53055u;
                C89219l.m154716b(aVar, "");
                C32334a.m66709a(bVar, iVar, Z_, aVar);
                return C89391z.f203057a;
            }
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C22291d dVar = (C22291d) obj;
            final C32441a aVar = new C32441a(this, dVar);
            if (((C22420o) dVar.f52723j).f53055u.f53221l) {
                C39223a.m79603q().mo68627a(true, new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x.C32439at.RunnableC324401 */

                    static {
                        Covode.recordClassIndex(39208);
                    }

                    public final void run() {
                        aVar.invoke();
                    }
                });
            } else {
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$a */
    public static final class C32408a<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77266a;

        /* renamed from: b */
        final /* synthetic */ String f77267b;

        /* renamed from: c */
        final /* synthetic */ String f77268c;

        /* renamed from: d */
        final /* synthetic */ boolean f77269d;

        static {
            Covode.recordClassIndex(39176);
        }

        public C32408a(AbstractC32572b bVar, String str, String str2, boolean z) {
            this.f77266a = bVar;
            this.f77267b = str;
            this.f77268c = str2;
            this.f77269d = z;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$a$a */
        public static final class C32409a extends AbstractC32385h {

            /* renamed from: c */
            final /* synthetic */ C32408a f77270c;

            /* renamed from: d */
            final /* synthetic */ AbstractC88974o f77271d;

            static {
                Covode.recordClassIndex(39177);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: e */
            public final /* synthetic */ void mo36686e(C22289b bVar) {
                mo36686e((C22291d) bVar);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e
            /* renamed from: a */
            public final void mo36711a(C22291d<C32386i> dVar) {
                C89219l.m154721d(dVar, "");
                this.f77271d.mo143049a(dVar);
            }

            C32409a(C32408a aVar, AbstractC88974o oVar) {
                this.f77270c = aVar;
                this.f77271d = oVar;
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo36681a(C22289b bVar, int i) {
                mo36681a((C22291d) bVar, i);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36682a(C22289b bVar, String str) {
                C22291d dVar = (C22291d) bVar;
                C89219l.m154721d(dVar, "");
                this.f77271d.mo143050a((Throwable) new C32405w(dVar.f52715d, dVar.f52717f, this.f77270c.f77266a.mo58458A(), this.f77270c.f77266a.mo58460Z_(), null, null, 32, null));
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e
            /* renamed from: a */
            public final void mo36712a(C22291d<C32386i> dVar, int i) {
                int i2;
                String str;
                C32386i iVar;
                JSONObject jSONObject;
                AbstractC88974o oVar = this.f77271d;
                if (dVar != null) {
                    i2 = dVar.f52715d;
                } else {
                    i2 = -10000;
                }
                JSONObject jSONObject2 = null;
                if (dVar != null) {
                    str = dVar.f52717f;
                } else {
                    str = null;
                }
                EnumC32592i A = this.f77270c.f77266a.mo58458A();
                EnumC32594j Z_ = this.f77270c.f77266a.mo58460Z_();
                if (!(dVar == null || (iVar = (C32386i) dVar.f52723j) == null || (jSONObject = iVar.f53008m) == null)) {
                    jSONObject2 = jSONObject.getJSONObject("data");
                }
                oVar.mo143050a((Throwable) new C32405w(i2, str, A, Z_, jSONObject2, null, 32, null));
            }
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<C22291d<C32386i>> oVar) {
            String str;
            C89219l.m154721d(oVar, "");
            C31588c.m65888b(this.f77266a.mo58466w(), "email");
            C32409a aVar = new C32409a(this, oVar);
            this.f77266a.mo58464b(aVar);
            Context context = this.f77266a.getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(context, "");
            String str2 = this.f77267b;
            String str3 = this.f77268c;
            boolean z = this.f77269d;
            C89219l.m154721d(context, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            C89219l.m154721d(aVar, "");
            C32386i iVar = new C32386i(str2, str3);
            C22355a.C22356a aVar2 = new C22355a.C22356a();
            if (z) {
                str = "/passport/email/bind_with_change_password/";
            } else {
                str = "/passport/email/bind/";
            }
            aVar2.f52826a = str;
            C89219l.m154721d(iVar, "");
            HashMap hashMap = new HashMap();
            String c = C13627m.m24501c(iVar.f77223a);
            C89219l.m154716b(c, "");
            hashMap.put("email", c);
            String c2 = C13627m.m24501c(iVar.f77224b);
            C89219l.m154716b(c2, "");
            hashMap.put("code", c2);
            hashMap.put("mix_mode", "1");
            C22355a c3 = aVar2.mo36707a(hashMap).mo36710c();
            C89219l.m154716b(c3, "");
            new C32383g(context, c3, iVar, aVar).mo36736d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$ae */
    public static final class C32415ae<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77285a;

        /* renamed from: b */
        final /* synthetic */ String f77286b;

        /* renamed from: c */
        final /* synthetic */ String f77287c;

        /* renamed from: d */
        final /* synthetic */ String f77288d;

        /* renamed from: e */
        final /* synthetic */ String f77289e;

        static {
            Covode.recordClassIndex(39183);
        }

        public C32415ae(AbstractC32572b bVar, String str, String str2, String str3, String str4) {
            this.f77285a = bVar;
            this.f77286b = str;
            this.f77287c = str2;
            this.f77288d = str3;
            this.f77289e = str4;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$ae$a */
        public static final class C32416a extends AbstractC32395p {

            /* renamed from: c */
            final /* synthetic */ C32415ae f77290c;

            /* renamed from: d */
            final /* synthetic */ AbstractC88974o f77291d;

            static {
                Covode.recordClassIndex(39184);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: e */
            public final /* synthetic */ void mo36686e(C22289b bVar) {
                mo36686e((C22291d) bVar);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e
            /* renamed from: a */
            public final void mo36711a(C22291d<C32396q> dVar) {
                C89219l.m154721d(dVar, "");
                this.f77291d.mo143049a(dVar);
            }

            C32416a(C32415ae aeVar, AbstractC88974o oVar) {
                this.f77290c = aeVar;
                this.f77291d = oVar;
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo36681a(C22289b bVar, int i) {
                mo36681a((C22291d) bVar, i);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36682a(C22289b bVar, String str) {
                C22291d dVar = (C22291d) bVar;
                C89219l.m154721d(dVar, "");
                this.f77291d.mo143050a((Throwable) new C32405w(dVar.f52715d, dVar.f52717f, this.f77290c.f77285a.mo58458A(), this.f77290c.f77285a.mo58460Z_(), null, null, 32, null));
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e
            /* renamed from: a */
            public final void mo36712a(C22291d<C32396q> dVar, int i) {
                String str;
                AbstractC88974o oVar = this.f77291d;
                if (dVar != null) {
                    str = dVar.f52717f;
                } else {
                    str = null;
                }
                oVar.mo143050a((Throwable) new C32405w(i, str, this.f77290c.f77285a.mo58458A(), this.f77290c.f77285a.mo58460Z_(), null, null, 32, null));
            }
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<C22291d<C32396q>> oVar) {
            C89219l.m154721d(oVar, "");
            C32416a aVar = new C32416a(this, oVar);
            this.f77285a.mo58464b(aVar);
            Context context = this.f77285a.getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(context, "");
            String str = this.f77286b;
            String str2 = this.f77287c;
            String str3 = this.f77288d;
            String str4 = this.f77289e;
            C89219l.m154721d(context, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d("", "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            C89219l.m154721d(str4, "");
            C89219l.m154721d(aVar, "");
            C32396q qVar = new C32396q(str, "", str2, str3, str4);
            C22355a.C22356a aVar2 = new C22355a.C22356a();
            aVar2.f52826a = C22306c.C22307a.m41972a("/passport/app/email/code_login/");
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(qVar.f77237d)) {
                hashMap.put("captcha", qVar.f77237d);
            }
            String c = C13627m.m24501c(qVar.f77236c);
            C89219l.m154716b(c, "");
            hashMap.put("code", c);
            String c2 = C13627m.m24501c(qVar.f77238e);
            C89219l.m154716b(c2, "");
            hashMap.put(StringSet.type, c2);
            hashMap.put("verify_ticket", qVar.f77239f);
            hashMap.put("not_login_ticket", qVar.f77240g);
            hashMap.put("mix_mode", "1");
            C22355a c3 = aVar2.mo36707a(hashMap).mo36710c();
            C89219l.m154716b(c3, "");
            new C32397r(context, c3, qVar, aVar, (byte) 0).mo36736d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$ah */
    public static final class C32419ah<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77294a;

        /* renamed from: b */
        final /* synthetic */ String f77295b;

        /* renamed from: c */
        final /* synthetic */ String f77296c;

        /* renamed from: d */
        final /* synthetic */ boolean f77297d;

        static {
            Covode.recordClassIndex(39187);
        }

        public C32419ah(AbstractC32572b bVar, String str, String str2, boolean z) {
            this.f77294a = bVar;
            this.f77295b = str;
            this.f77296c = str2;
            this.f77297d = z;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$ah$a */
        public static final class C32420a extends AbstractC22427e {

            /* renamed from: c */
            final /* synthetic */ C32419ah f77298c;

            /* renamed from: d */
            final /* synthetic */ AbstractC88974o f77299d;

            static {
                Covode.recordClassIndex(39188);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: e */
            public final /* synthetic */ void mo36686e(C22289b bVar) {
                mo36686e((C22291d) bVar);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e
            /* renamed from: a */
            public final void mo36711a(C22291d<C22410e> dVar) {
                C89219l.m154721d(dVar, "");
                if (dVar.f52723j == null || ((C22410e) dVar.f52723j).f52989e == null) {
                    this.f77299d.mo143050a((Throwable) new C32405w(-1, "no data", EnumC32592i.SIGN_UP, EnumC32594j.CREATE_PASSWORD_FOR_EMAIL, null, null, 32, null));
                } else {
                    this.f77299d.mo143049a(dVar);
                }
            }

            C32420a(C32419ah ahVar, AbstractC88974o oVar) {
                this.f77298c = ahVar;
                this.f77299d = oVar;
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo36681a(C22289b bVar, int i) {
                mo36681a((C22291d) bVar, i);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36682a(C22289b bVar, String str) {
                C22291d dVar = (C22291d) bVar;
                C89219l.m154721d(dVar, "");
                AbstractC88974o oVar = this.f77299d;
                int i = dVar.f52715d;
                String str2 = dVar.f52717f;
                EnumC32592i iVar = EnumC32592i.SIGN_UP;
                EnumC32594j Z_ = this.f77298c.f77294a.mo58460Z_();
                String str3 = dVar.f52717f;
                C89219l.m154716b(str3, "");
                oVar.mo143050a((Throwable) new C32405w(i, str2, iVar, Z_, null, str3));
            }

            /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
                if (r6 == null) goto L_0x000c;
             */
            @Override // com.bytedance.sdk.p1625a.AbstractC22358e
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo36712a(com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d<com.bytedance.sdk.p1625a.p1645h.p1646a.C22410e> r12, int r13) {
                /*
                // Method dump skipped, instructions count: 115
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x.C32419ah.C32420a.mo36712a(com.bytedance.sdk.a.a.a.d, int):void");
            }
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<C22291d<C22410e>> oVar) {
            C89219l.m154721d(oVar, "");
            C32404v.m66770a((Boolean) true, "email", (AbstractC32584f) this.f77294a, false, (Map) null, false, 56);
            C32420a aVar = new C32420a(this, oVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("rules_version", "v2");
            linkedHashMap.putAll(C31566h.m65850b());
            if (C33047p.m67683a()) {
                linkedHashMap.putAll(C33047p.m67684b());
            }
            if (this.f77297d) {
                linkedHashMap.put("multi_signup", "1");
            } else {
                linkedHashMap.put("multi_signup", "0");
            }
            this.f77294a.mo58464b(aVar);
            this.f77294a.mo58469z().mo36648a(this.f77296c, this.f77295b, "", "", linkedHashMap, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$as */
    public static final class C32437as<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ String f77348a;

        /* renamed from: b */
        final /* synthetic */ AbstractC32572b f77349b;

        /* renamed from: c */
        final /* synthetic */ boolean f77350c;

        /* renamed from: d */
        final /* synthetic */ String f77351d;

        /* renamed from: e */
        final /* synthetic */ String f77352e;

        static {
            Covode.recordClassIndex(39205);
        }

        C32437as(String str, AbstractC32572b bVar, boolean z, String str2, String str3) {
            this.f77348a = str;
            this.f77349b = bVar;
            this.f77350c = z;
            this.f77351d = str2;
            this.f77352e = str3;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$as$a */
        public static final class C32438a extends AbstractC22436n {

            /* renamed from: c */
            final /* synthetic */ C32437as f77353c;

            /* renamed from: d */
            final /* synthetic */ AbstractC88974o f77354d;

            static {
                Covode.recordClassIndex(39206);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: e */
            public final /* synthetic */ void mo36686e(C22289b bVar) {
                mo36686e((C22291d) bVar);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e
            /* renamed from: a */
            public final void mo36711a(C22291d<C22420o> dVar) {
                C89219l.m154721d(dVar, "");
                if (dVar.f52723j == null || ((C22420o) dVar.f52723j).f53055u == null) {
                    this.f77354d.mo143050a((Throwable) new C32405w(-1, "no data", EnumC32592i.LOGIN, EnumC32594j.INPUT_PHONE_FIND_PASSWORD, null, "no data"));
                } else {
                    this.f77354d.mo143049a(dVar);
                }
            }

            C32438a(C32437as asVar, AbstractC88974o oVar) {
                this.f77353c = asVar;
                this.f77354d = oVar;
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo36681a(C22289b bVar, int i) {
                mo36681a((C22291d) bVar, i);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36682a(C22289b bVar, String str) {
                C22291d dVar = (C22291d) bVar;
                C89219l.m154721d(dVar, "");
                C89219l.m154721d(str, "");
                AbstractC88974o oVar = this.f77354d;
                int i = dVar.f52715d;
                String str2 = dVar.f52717f;
                EnumC32592i iVar = EnumC32592i.LOGIN;
                EnumC32594j Z_ = this.f77353c.f77349b.mo58460Z_();
                String str3 = dVar.f52717f;
                C89219l.m154716b(str3, "");
                oVar.mo143050a((Throwable) new C32405w(i, str2, iVar, Z_, null, str3));
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e
            /* renamed from: a */
            public final void mo36712a(C22291d<C22420o> dVar, int i) {
                int i2;
                String str;
                JSONObject jSONObject;
                String str2;
                C22420o oVar;
                JSONObject jSONObject2;
                AbstractC88974o oVar2 = this.f77354d;
                if (dVar != null) {
                    i2 = dVar.f52715d;
                } else {
                    i2 = -10000;
                }
                String str3 = null;
                if (dVar != null) {
                    str = dVar.f52717f;
                } else {
                    str = null;
                }
                EnumC32592i iVar = EnumC32592i.LOGIN;
                EnumC32594j Z_ = this.f77353c.f77349b.mo58460Z_();
                if (dVar == null || (oVar = (C22420o) dVar.f52723j) == null || (jSONObject2 = oVar.f53008m) == null || (jSONObject = jSONObject2.getJSONObject("data")) == null) {
                    jSONObject = null;
                } else {
                    jSONObject.put("loginType", this.f77353c.f77348a);
                    jSONObject.put("pwd", this.f77353c.f77351d);
                    jSONObject.put("handle", this.f77353c.f77352e);
                }
                StringBuilder sb = new StringBuilder();
                if (dVar != null) {
                    str2 = dVar.f52717f;
                } else {
                    str2 = null;
                }
                StringBuilder append = sb.append(str2).append('|');
                if (dVar != null) {
                    str3 = dVar.f52718g;
                }
                oVar2.mo143050a((Throwable) new C32405w(i2, str, iVar, Z_, jSONObject, append.append(str3).toString()));
            }
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<C22291d<C22420o>> oVar) {
            C89219l.m154721d(oVar, "");
            C32404v.m66770a((Boolean) false, this.f77348a, (AbstractC32584f) this.f77349b, false, (Map) null, this.f77350c, 24);
            C32438a aVar = new C32438a(this, oVar);
            this.f77349b.mo58464b(aVar);
            String str = this.f77348a;
            int hashCode = str.hashCode();
            if (hashCode != 96619420) {
                if (hashCode != 106642798) {
                }
                this.f77349b.mo58469z().mo36664c(this.f77352e, this.f77351d, "", aVar);
                return;
            } else if (str.equals("email")) {
                this.f77349b.mo58469z().mo36662b(this.f77352e, this.f77351d, "", aVar);
                return;
            }
            this.f77349b.mo58469z().mo36646a(this.f77352e, this.f77351d, "", aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$av */
    static final class C32443av<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ String f77367a;

        /* renamed from: b */
        final /* synthetic */ AbstractC32572b f77368b;

        /* renamed from: c */
        final /* synthetic */ String f77369c;

        /* renamed from: d */
        final /* synthetic */ String f77370d;

        /* renamed from: e */
        final /* synthetic */ String f77371e;

        static {
            Covode.recordClassIndex(39211);
        }

        C32443av(String str, AbstractC32572b bVar, String str2, String str3, String str4) {
            this.f77367a = str;
            this.f77368b = bVar;
            this.f77369c = str2;
            this.f77370d = str3;
            this.f77371e = str4;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$av$a */
        public static final class C32444a extends AbstractC22436n {

            /* renamed from: c */
            final /* synthetic */ C32443av f77372c;

            /* renamed from: d */
            final /* synthetic */ AbstractC88974o f77373d;

            static {
                Covode.recordClassIndex(39212);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: e */
            public final /* synthetic */ void mo36686e(C22289b bVar) {
                mo36686e((C22291d) bVar);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e
            /* renamed from: a */
            public final void mo36711a(C22291d<C22420o> dVar) {
                C89219l.m154721d(dVar, "");
                if (dVar.f52723j == null || ((C22420o) dVar.f52723j).f53055u == null) {
                    this.f77373d.mo143050a((Throwable) new C32405w(-1, "no data", EnumC32592i.LOGIN, EnumC32594j.INPUT_PHONE_FIND_PASSWORD, null, "no data"));
                } else {
                    this.f77373d.mo143049a(dVar);
                }
            }

            C32444a(C32443av avVar, AbstractC88974o oVar) {
                this.f77372c = avVar;
                this.f77373d = oVar;
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo36681a(C22289b bVar, int i) {
                mo36681a((C22291d) bVar, i);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36682a(C22289b bVar, String str) {
                C22291d dVar = (C22291d) bVar;
                C89219l.m154721d(dVar, "");
                C89219l.m154721d(str, "");
                AbstractC88974o oVar = this.f77373d;
                int i = dVar.f52715d;
                String str2 = dVar.f52717f;
                EnumC32592i iVar = EnumC32592i.LOGIN;
                EnumC32594j Z_ = this.f77372c.f77368b.mo58460Z_();
                String str3 = dVar.f52717f;
                C89219l.m154716b(str3, "");
                oVar.mo143050a((Throwable) new C32405w(i, str2, iVar, Z_, null, str3));
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e
            /* renamed from: a */
            public final void mo36712a(C22291d<C22420o> dVar, int i) {
                int i2;
                String str;
                JSONObject jSONObject;
                String str2;
                C22420o oVar;
                JSONObject jSONObject2;
                AbstractC88974o oVar2 = this.f77373d;
                if (dVar != null) {
                    i2 = dVar.f52715d;
                } else {
                    i2 = -10000;
                }
                String str3 = null;
                if (dVar != null) {
                    str = dVar.f52717f;
                } else {
                    str = null;
                }
                EnumC32592i iVar = EnumC32592i.LOGIN;
                EnumC32594j Z_ = this.f77372c.f77368b.mo58460Z_();
                if (dVar == null || (oVar = (C22420o) dVar.f52723j) == null || (jSONObject2 = oVar.f53008m) == null || (jSONObject = jSONObject2.getJSONObject("data")) == null) {
                    jSONObject = null;
                } else {
                    jSONObject.put("loginType", this.f77372c.f77367a);
                    jSONObject.put("pwd", this.f77372c.f77369c);
                    jSONObject.put("handle", this.f77372c.f77370d);
                }
                StringBuilder sb = new StringBuilder();
                if (dVar != null) {
                    str2 = dVar.f52717f;
                } else {
                    str2 = null;
                }
                StringBuilder append = sb.append(str2).append('|');
                if (dVar != null) {
                    str3 = dVar.f52718g;
                }
                oVar2.mo143050a((Throwable) new C32405w(i2, str, iVar, Z_, jSONObject, append.append(str3).toString()));
            }
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<C22291d<C22420o>> oVar) {
            C89219l.m154721d(oVar, "");
            C32404v.m66770a((Boolean) false, this.f77367a, (AbstractC32584f) this.f77368b, false, (Map) null, false, 48);
            C32444a aVar = new C32444a(this, oVar);
            this.f77368b.mo58464b(aVar);
            String str = this.f77367a;
            int hashCode = str.hashCode();
            if (hashCode != 96619420) {
                if (hashCode == 106642798 && str.equals("phone")) {
                    Context context = this.f77368b.getContext();
                    if (context == null) {
                        C89219l.m154715b();
                    }
                    C89219l.m154716b(context, "");
                    C32016f.C32017a.m66404a(context, this.f77371e, "", "", "", "", this.f77369c, "", "", EnumC32592i.LOGIN.getValue(), 3, aVar).mo36736d();
                    return;
                }
            } else if (str.equals("email")) {
                Context context2 = this.f77368b.getContext();
                if (context2 == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(context2, "");
                C32016f.C32017a.m66404a(context2, this.f77371e, "", "", "", "", this.f77369c, "", "", EnumC32592i.LOGIN.getValue(), 2, aVar).mo36736d();
                return;
            }
            this.f77368b.mo58469z().mo36646a(this.f77370d, this.f77369c, "", aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$ay */
    static final class C32447ay<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ boolean f77378a;

        /* renamed from: b */
        final /* synthetic */ AbstractC32572b f77379b;

        /* renamed from: c */
        final /* synthetic */ EnumC32592i f77380c;

        /* renamed from: d */
        final /* synthetic */ EnumC32594j f77381d;

        /* renamed from: e */
        final /* synthetic */ String f77382e;

        /* renamed from: f */
        final /* synthetic */ String f77383f;

        static {
            Covode.recordClassIndex(39215);
        }

        C32447ay(boolean z, AbstractC32572b bVar, EnumC32592i iVar, EnumC32594j jVar, String str, String str2) {
            this.f77378a = z;
            this.f77379b = bVar;
            this.f77380c = iVar;
            this.f77381d = jVar;
            this.f77382e = str;
            this.f77383f = str2;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$ay$a */
        public static final class C32448a extends AbstractC22431i {

            /* renamed from: c */
            final /* synthetic */ C32447ay f77384c;

            /* renamed from: d */
            final /* synthetic */ AbstractC88974o f77385d;

            static {
                Covode.recordClassIndex(39216);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: e */
            public final /* synthetic */ void mo36686e(C22289b bVar) {
                mo36686e((C22291d) bVar);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e
            /* renamed from: a */
            public final void mo36711a(C22291d<C22416k> dVar) {
                C89219l.m154721d(dVar, "");
                if (dVar.f52723j == null || ((C22416k) dVar.f52723j).f53021d == null) {
                    this.f77385d.mo143050a((Throwable) C32405w.C32406a.m66783a(this.f77384c.f77380c, this.f77384c.f77381d));
                } else {
                    this.f77385d.mo143049a(dVar);
                }
            }

            C32448a(C32447ay ayVar, AbstractC88974o oVar) {
                this.f77384c = ayVar;
                this.f77385d = oVar;
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo36681a(C22289b bVar, int i) {
                mo36681a((C22291d) bVar, i);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36682a(C22289b bVar, String str) {
                C22291d dVar = (C22291d) bVar;
                C89219l.m154721d(dVar, "");
                AbstractC88974o oVar = this.f77385d;
                int i = dVar.f52715d;
                String str2 = dVar.f52717f;
                EnumC32592i iVar = this.f77384c.f77380c;
                EnumC32594j jVar = this.f77384c.f77381d;
                String str3 = dVar.f52717f;
                C89219l.m154716b(str3, "");
                oVar.mo143050a((Throwable) new C32405w(i, str2, iVar, jVar, null, str3));
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e
            /* renamed from: a */
            public final void mo36712a(C22291d<C22416k> dVar, int i) {
                String str;
                JSONObject jSONObject;
                String str2;
                C22416k kVar;
                JSONObject jSONObject2;
                AbstractC88974o oVar = this.f77385d;
                String str3 = null;
                if (dVar != null) {
                    str = dVar.f52717f;
                } else {
                    str = null;
                }
                EnumC32592i iVar = this.f77384c.f77380c;
                EnumC32594j jVar = this.f77384c.f77381d;
                if (dVar == null || (kVar = (C22416k) dVar.f52723j) == null || (jSONObject2 = kVar.f53008m) == null) {
                    jSONObject = null;
                } else {
                    jSONObject = jSONObject2.getJSONObject("data");
                }
                StringBuilder sb = new StringBuilder();
                if (dVar != null) {
                    str2 = dVar.f52717f;
                } else {
                    str2 = null;
                }
                StringBuilder append = sb.append(str2).append('|');
                if (dVar != null) {
                    str3 = dVar.f52718g;
                }
                oVar.mo143050a((Throwable) new C32405w(i, str, iVar, jVar, jSONObject, append.append(str3).toString()));
            }
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<C22291d<C22416k>> oVar) {
            C89219l.m154721d(oVar, "");
            boolean z = this.f77378a;
            if (!z) {
                C32404v.m66770a(Boolean.valueOf(z), "sms_verification", (AbstractC32584f) this.f77379b, false, (Map) null, false, 56);
            }
            C32448a aVar = new C32448a(this, oVar);
            this.f77379b.mo58464b(aVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(C31566h.m65850b());
            if (C33047p.m67683a()) {
                linkedHashMap.putAll(C33047p.m67684b());
            }
            Bundle arguments = this.f77379b.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            C89219l.m154716b(arguments, "");
            if (arguments.getBoolean("is_multi_account_same_user", false)) {
                linkedHashMap.put("multi_signup", "1");
            } else {
                linkedHashMap.put("multi_signup", "0");
            }
            this.f77379b.mo58469z().mo36652a(this.f77382e, this.f77383f, linkedHashMap, aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$bb */
    public static final class C32452bb<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ EnumC32592i f77391a;

        /* renamed from: b */
        final /* synthetic */ AbstractC32572b f77392b;

        /* renamed from: c */
        final /* synthetic */ EnumC32594j f77393c;

        /* renamed from: d */
        final /* synthetic */ String f77394d;

        /* renamed from: e */
        final /* synthetic */ String f77395e;

        static {
            Covode.recordClassIndex(39220);
        }

        public C32452bb(EnumC32592i iVar, AbstractC32572b bVar, EnumC32594j jVar, String str, String str2) {
            this.f77391a = iVar;
            this.f77392b = bVar;
            this.f77393c = jVar;
            this.f77394d = str;
            this.f77395e = str2;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$bb$a */
        public static final class C32453a extends AbstractC22432j {

            /* renamed from: c */
            final /* synthetic */ C32452bb f77396c;

            /* renamed from: d */
            final /* synthetic */ AbstractC88974o f77397d;

            static {
                Covode.recordClassIndex(39221);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: e */
            public final /* synthetic */ void mo36686e(C22289b bVar) {
                mo36686e((C22291d) bVar);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e
            /* renamed from: a */
            public final void mo36711a(C22291d<C22417l> dVar) {
                C89219l.m154721d(dVar, "");
                if (dVar.f52723j == null || ((C22417l) dVar.f52723j).f53026e == null) {
                    this.f77397d.mo143050a((Throwable) new C32405w(-1, "no data", this.f77396c.f77391a, this.f77396c.f77393c, null, "no data"));
                } else {
                    this.f77397d.mo143049a(dVar.f52723j);
                }
            }

            C32453a(C32452bb bbVar, AbstractC88974o oVar) {
                this.f77396c = bbVar;
                this.f77397d = oVar;
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo36681a(C22289b bVar, int i) {
                mo36681a((C22291d) bVar, i);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36682a(C22289b bVar, String str) {
                C22291d dVar = (C22291d) bVar;
                C89219l.m154721d(dVar, "");
                AbstractC88974o oVar = this.f77397d;
                int i = dVar.f52715d;
                String str2 = dVar.f52717f;
                EnumC32592i iVar = this.f77396c.f77391a;
                EnumC32594j jVar = this.f77396c.f77393c;
                String str3 = dVar.f52717f;
                C89219l.m154716b(str3, "");
                oVar.mo143050a((Throwable) new C32405w(i, str2, iVar, jVar, null, str3));
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e
            /* renamed from: a */
            public final void mo36712a(C22291d<C22417l> dVar, int i) {
                String str;
                JSONObject jSONObject;
                String str2;
                C22417l lVar;
                JSONObject jSONObject2;
                AbstractC88974o oVar = this.f77397d;
                String str3 = null;
                if (dVar != null) {
                    str = dVar.f52717f;
                } else {
                    str = null;
                }
                EnumC32592i iVar = this.f77396c.f77391a;
                EnumC32594j jVar = this.f77396c.f77393c;
                if (dVar == null || (lVar = (C22417l) dVar.f52723j) == null || (jSONObject2 = lVar.f53008m) == null) {
                    jSONObject = null;
                } else {
                    jSONObject = jSONObject2.getJSONObject("data");
                }
                StringBuilder sb = new StringBuilder();
                if (dVar != null) {
                    str2 = dVar.f52717f;
                } else {
                    str2 = null;
                }
                StringBuilder append = sb.append(str2).append('|');
                if (dVar != null) {
                    str3 = dVar.f52718g;
                }
                oVar.mo143050a((Throwable) new C32405w(i, str, iVar, jVar, jSONObject, append.append(str3).toString()));
            }
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<C22417l> oVar) {
            boolean z;
            C89219l.m154721d(oVar, "");
            if (this.f77391a == EnumC32592i.SIGN_UP) {
                z = true;
            } else {
                z = false;
            }
            C32404v.m66770a(Boolean.valueOf(z), "sms_verification", (AbstractC32584f) this.f77392b, false, (Map) null, false, 56);
            C32453a aVar = new C32453a(this, oVar);
            this.f77392b.mo58464b(aVar);
            this.f77392b.mo58469z().mo36645a(this.f77394d, this.f77395e, "", aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$be */
    public static final class C32456be<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ EnumC32592i f77404a;

        /* renamed from: b */
        final /* synthetic */ EnumC32594j f77405b;

        /* renamed from: c */
        final /* synthetic */ AbstractC32572b f77406c;

        /* renamed from: d */
        final /* synthetic */ String f77407d;

        /* renamed from: e */
        final /* synthetic */ String f77408e;

        static {
            Covode.recordClassIndex(39224);
        }

        public C32456be(EnumC32592i iVar, EnumC32594j jVar, AbstractC32572b bVar, String str, String str2) {
            this.f77404a = iVar;
            this.f77405b = jVar;
            this.f77406c = bVar;
            this.f77407d = str;
            this.f77408e = str2;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$be$a */
        public static final class C32457a extends AbstractC22430h {

            /* renamed from: c */
            final /* synthetic */ C32456be f77409c;

            /* renamed from: d */
            final /* synthetic */ AbstractC88974o f77410d;

            static {
                Covode.recordClassIndex(39225);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: e */
            public final /* synthetic */ void mo36686e(C22289b bVar) {
                mo36686e((C22291d) bVar);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e
            /* renamed from: a */
            public final void mo36711a(C22291d<C22418m> dVar) {
                if (dVar == null || dVar.f52723j == null || ((C22418m) dVar.f52723j).f53031e == null) {
                    this.f77410d.mo143050a((Throwable) new C32405w(-1, "no data", this.f77409c.f77404a, this.f77409c.f77405b, null, "no data"));
                } else {
                    this.f77410d.mo143049a(dVar.f52723j);
                }
            }

            C32457a(C32456be beVar, AbstractC88974o oVar) {
                this.f77409c = beVar;
                this.f77410d = oVar;
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo36681a(C22289b bVar, int i) {
                mo36681a((C22291d) bVar, i);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36682a(C22289b bVar, String str) {
                C22291d dVar = (C22291d) bVar;
                if (dVar != null) {
                    AbstractC88974o oVar = this.f77410d;
                    int i = dVar.f52715d;
                    String str2 = dVar.f52717f;
                    EnumC32592i iVar = this.f77409c.f77404a;
                    EnumC32594j jVar = this.f77409c.f77405b;
                    String str3 = dVar.f52717f;
                    C89219l.m154716b(str3, "");
                    oVar.mo143050a((Throwable) new C32405w(i, str2, iVar, jVar, null, str3));
                }
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e
            /* renamed from: a */
            public final void mo36712a(C22291d<C22418m> dVar, int i) {
                String str;
                JSONObject jSONObject;
                String str2;
                C22418m mVar;
                JSONObject jSONObject2;
                AbstractC88974o oVar = this.f77410d;
                String str3 = null;
                if (dVar != null) {
                    str = dVar.f52717f;
                } else {
                    str = null;
                }
                EnumC32592i iVar = this.f77409c.f77404a;
                EnumC32594j jVar = this.f77409c.f77405b;
                if (dVar == null || (mVar = (C22418m) dVar.f52723j) == null || (jSONObject2 = mVar.f53008m) == null) {
                    jSONObject = null;
                } else {
                    jSONObject = jSONObject2.getJSONObject("data");
                }
                StringBuilder sb = new StringBuilder();
                if (dVar != null) {
                    str2 = dVar.f52717f;
                } else {
                    str2 = null;
                }
                StringBuilder append = sb.append(str2).append('|');
                if (dVar != null) {
                    str3 = dVar.f52718g;
                }
                oVar.mo143050a((Throwable) new C32405w(i, str, iVar, jVar, jSONObject, append.append(str3).toString()));
            }
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<C22418m> oVar) {
            C89219l.m154721d(oVar, "");
            C32457a aVar = new C32457a(this, oVar);
            this.f77406c.mo58464b(aVar);
            Context context = this.f77406c.getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(context, "");
            String str = this.f77407d;
            String str2 = this.f77408e;
            C89219l.m154721d(context, "");
            C89219l.m154721d("", "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d("", "");
            C89219l.m154721d(aVar, "");
            C22418m mVar = new C22418m("", str2, 0, "");
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(mVar.f53027a)) {
                String c = C13627m.m24501c(mVar.f53027a);
                C89219l.m154716b(c, "");
                hashMap.put("mobile", c);
            }
            if (!TextUtils.isEmpty(mVar.f53030d)) {
                hashMap.put("captcha", mVar.f53030d);
            }
            String c2 = C13627m.m24501c(mVar.f53028b.toString());
            C89219l.m154716b(c2, "");
            hashMap.put("code", c2);
            hashMap.put("mix_mode", "1");
            if (str != null) {
                hashMap.put("not_login_ticket", str);
            }
            Map<String, String> b = C31566h.m65850b();
            if (!b.isEmpty()) {
                C89041ag.m154426b(hashMap, b);
            }
            C22355a.C22356a aVar2 = new C22355a.C22356a();
            aVar2.f52826a = C22306c.C22307a.m41972a("/passport/mobile/sms_login/");
            C22355a c3 = aVar2.mo36707a(hashMap).mo36705a().mo36710c();
            C89219l.m154716b(c3, "");
            new C32010c(context, c3, mVar, aVar).mo36736d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$bn */
    static final class C32468bn<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ String f77433a;

        /* renamed from: b */
        final /* synthetic */ int f77434b;

        /* renamed from: c */
        final /* synthetic */ String f77435c;

        /* renamed from: d */
        final /* synthetic */ AbstractC32572b f77436d;

        /* renamed from: e */
        final /* synthetic */ EnumC32592i f77437e;

        /* renamed from: f */
        final /* synthetic */ EnumC32594j f77438f;

        /* renamed from: g */
        final /* synthetic */ String f77439g;

        /* renamed from: h */
        final /* synthetic */ String f77440h;

        /* renamed from: i */
        final /* synthetic */ int f77441i;

        /* renamed from: j */
        final /* synthetic */ String f77442j;

        static {
            Covode.recordClassIndex(39236);
        }

        C32468bn(String str, int i, String str2, AbstractC32572b bVar, EnumC32592i iVar, EnumC32594j jVar, String str3, String str4, int i2, String str5) {
            this.f77433a = str;
            this.f77434b = i;
            this.f77435c = str2;
            this.f77436d = bVar;
            this.f77437e = iVar;
            this.f77438f = jVar;
            this.f77439g = str3;
            this.f77440h = str4;
            this.f77441i = i2;
            this.f77442j = str5;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$bn$a */
        public static final class C32469a extends C31896b {

            /* renamed from: c */
            final /* synthetic */ C32468bn f77443c;

            /* renamed from: d */
            final /* synthetic */ AbstractC88974o f77444d;

            static {
                Covode.recordClassIndex(39237);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.p2082ss.android.ugc.aweme.account.login.p2258c.C31896b, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: e */
            public final /* synthetic */ void mo36686e(C22289b bVar) {
                mo36686e((C22291d) bVar);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.p2082ss.android.ugc.aweme.account.login.p2258c.C31896b
            /* renamed from: a */
            public final void mo36711a(C22291d<C22419n> dVar) {
                AbstractC88974o oVar = this.f77444d;
                if (dVar == null) {
                    C89219l.m154715b();
                }
                oVar.mo143049a(dVar);
            }

            C32469a(C32468bn bnVar, AbstractC88974o oVar) {
                this.f77443c = bnVar;
                this.f77444d = oVar;
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.p2082ss.android.ugc.aweme.account.login.p2258c.C31896b, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo36681a(C22289b bVar, int i) {
                mo36681a((C22291d) bVar, i);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36682a(C22289b bVar, String str) {
                C22291d dVar = (C22291d) bVar;
                C89219l.m154721d(dVar, "");
                this.f77444d.mo143050a((Throwable) new C32405w(dVar.f52715d, dVar.f52717f, this.f77443c.f77437e, this.f77443c.f77438f, null, null, 32, null));
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.p2082ss.android.ugc.aweme.account.login.p2258c.C31896b
            /* renamed from: a */
            public final void mo36712a(C22291d<C22419n> dVar, int i) {
                String str;
                String str2;
                C22419n nVar;
                JSONObject jSONObject;
                JSONObject optJSONObject;
                C22419n nVar2;
                JSONObject jSONObject2 = new JSONObject();
                if (dVar == null || (nVar2 = (C22419n) dVar.f52723j) == null || (str = nVar2.f53036d) == null) {
                    str = "";
                }
                jSONObject2.put("next_url", str);
                if (i == 2030) {
                    if (!(dVar == null || (nVar = (C22419n) dVar.f52723j) == null || (jSONObject = nVar.f53008m) == null || (optJSONObject = jSONObject.optJSONObject("data")) == null)) {
                        jSONObject2.put("data", optJSONObject);
                    }
                    jSONObject2.put("url_path", "/passport/mobile/send_code/v1/");
                }
                AbstractC88974o oVar = this.f77444d;
                if (dVar != null) {
                    str2 = dVar.f52717f;
                } else {
                    str2 = null;
                }
                oVar.mo143050a((Throwable) new C32405w(i, str2, this.f77443c.f77437e, this.f77443c.f77438f, jSONObject2, null, 32, null));
            }
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<C22291d<C22419n>> oVar) {
            C89219l.m154721d(oVar, "");
            C39162r.m79460a("send_sms", new C31376a().mo57399a("send_method", this.f77433a).mo57397a("send_reason", this.f77434b).mo57399a("enter_method", this.f77435c).mo57399a("enter_from", this.f77436d.mo58466w()).f75156a);
            boolean a = C32856f.m67455a(C31291a.f74991a);
            C32469a aVar = new C32469a(this, oVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (C32407x.m66805a()) {
                linkedHashMap.put("is6Digits", "1");
            }
            this.f77436d.mo58464b(aVar);
            this.f77436d.mo58469z().mo36631a(this.f77439g, this.f77434b, this.f77440h, this.f77441i, a ? 1 : 0, "", this.f77442j, linkedHashMap, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$bq */
    public static final class C32472bq<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ String f77451a;

        /* renamed from: b */
        final /* synthetic */ AbstractC32572b f77452b;

        /* renamed from: c */
        final /* synthetic */ int f77453c;

        /* renamed from: d */
        final /* synthetic */ Map f77454d;

        /* renamed from: e */
        final /* synthetic */ Integer f77455e;

        /* renamed from: f */
        final /* synthetic */ String f77456f;

        /* renamed from: g */
        final /* synthetic */ String f77457g;

        static {
            Covode.recordClassIndex(39240);
        }

        C32472bq(String str, AbstractC32572b bVar, int i, Map map, Integer num, String str2, String str3) {
            this.f77451a = str;
            this.f77452b = bVar;
            this.f77453c = i;
            this.f77454d = map;
            this.f77455e = num;
            this.f77456f = str2;
            this.f77457g = str3;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$bq$a */
        public static final class C32473a extends AbstractC22429g {

            /* renamed from: c */
            final /* synthetic */ AbstractC88974o f77458c;

            static {
                Covode.recordClassIndex(39241);
            }

            C32473a(AbstractC88974o oVar) {
                this.f77458c = oVar;
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: e */
            public final /* synthetic */ void mo36686e(C22289b bVar) {
                mo36686e((C22291d) bVar);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e
            /* renamed from: a */
            public final void mo36711a(C22291d<C22412g> dVar) {
                C89219l.m154721d(dVar, "");
                this.f77458c.mo143049a(dVar);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo36681a(C22289b bVar, int i) {
                mo36681a((C22291d) bVar, i);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36682a(C22289b bVar, String str) {
                C22291d dVar = (C22291d) bVar;
                C89219l.m154721d(dVar, "");
                this.f77458c.mo143050a((Throwable) new C32405w(dVar.f52715d, dVar.f52717f, EnumC32592i.LOGIN, EnumC32594j.INPUT_EMAIL_FIND_PASSWORD, null, null, 32, null));
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e
            /* renamed from: a */
            public final void mo36712a(C22291d<C22412g> dVar, int i) {
                int i2;
                String str;
                C22412g gVar;
                JSONObject jSONObject;
                AbstractC88974o oVar = this.f77458c;
                if (dVar != null) {
                    i2 = dVar.f52715d;
                } else {
                    i2 = -10000;
                }
                JSONObject jSONObject2 = null;
                if (dVar != null) {
                    str = dVar.f52717f;
                } else {
                    str = null;
                }
                EnumC32592i iVar = EnumC32592i.LOGIN;
                EnumC32594j jVar = EnumC32594j.INPUT_EMAIL_FIND_PASSWORD;
                if (!(dVar == null || (gVar = (C22412g) dVar.f52723j) == null || (jSONObject = gVar.f53008m) == null)) {
                    jSONObject2 = jSONObject.getJSONObject("data");
                }
                oVar.mo143050a((Throwable) new C32405w(i2, str, iVar, jVar, jSONObject2, null, 32, null));
            }
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<C22291d<C22412g>> oVar) {
            C89219l.m154721d(oVar, "");
            C39162r.m79460a("send_email_code", new C31376a().mo57399a("send_method", this.f77451a).mo57399a("enter_method", this.f77452b.mo58467x()).mo57399a("enter_from", this.f77452b.mo58466w()).mo57397a("send_reason", this.f77453c).f75156a);
            C32473a aVar = new C32473a(oVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map map = this.f77454d;
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            linkedHashMap.put("rules_version", "v2");
            this.f77452b.mo58464b(aVar);
            if (this.f77455e == null) {
                this.f77452b.mo58469z().mo36641a(this.f77456f, this.f77457g, this.f77453c, linkedHashMap, aVar);
            } else {
                this.f77452b.mo58469z().mo36639a(this.f77456f, this.f77457g, this.f77453c, this.f77455e.intValue(), (Map<String, String>) linkedHashMap, (AbstractC22429g) aVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$bt */
    static final class C32476bt<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ String f77463a;

        /* renamed from: b */
        final /* synthetic */ int f77464b;

        /* renamed from: c */
        final /* synthetic */ AbstractC32572b f77465c;

        /* renamed from: d */
        final /* synthetic */ EnumC32594j f77466d;

        /* renamed from: e */
        final /* synthetic */ String f77467e;

        static {
            Covode.recordClassIndex(39244);
        }

        C32476bt(String str, int i, AbstractC32572b bVar, EnumC32594j jVar, String str2) {
            this.f77463a = str;
            this.f77464b = i;
            this.f77465c = bVar;
            this.f77466d = jVar;
            this.f77467e = str2;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$bt$a */
        public static final class C32477a extends C31896b {

            /* renamed from: c */
            final /* synthetic */ C32476bt f77468c;

            /* renamed from: d */
            final /* synthetic */ AbstractC88974o f77469d;

            static {
                Covode.recordClassIndex(39245);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.p2082ss.android.ugc.aweme.account.login.p2258c.C31896b, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: e */
            public final /* synthetic */ void mo36686e(C22289b bVar) {
                mo36686e((C22291d) bVar);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.p2082ss.android.ugc.aweme.account.login.p2258c.C31896b
            /* renamed from: a */
            public final void mo36711a(C22291d<C22419n> dVar) {
                super.mo36711a(dVar);
                AbstractC88974o oVar = this.f77469d;
                if (dVar == null) {
                    C89219l.m154715b();
                }
                oVar.mo143049a(dVar);
            }

            C32477a(C32476bt btVar, AbstractC88974o oVar) {
                this.f77468c = btVar;
                this.f77469d = oVar;
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.p2082ss.android.ugc.aweme.account.login.p2258c.C31896b, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo36681a(C22289b bVar, int i) {
                mo36681a((C22291d) bVar, i);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36682a(C22289b bVar, String str) {
                C22291d dVar = (C22291d) bVar;
                C89219l.m154721d(dVar, "");
                C89219l.m154721d(str, "");
                this.f77469d.mo143050a((Throwable) new C32405w(dVar.f52715d, dVar.f52717f, EnumC32592i.LOGIN, this.f77468c.f77466d, null, null, 32, null));
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.p2082ss.android.ugc.aweme.account.login.p2258c.C31896b
            /* renamed from: a */
            public final void mo36712a(C22291d<C22419n> dVar, int i) {
                int i2;
                String str;
                C22419n nVar;
                JSONObject jSONObject;
                super.mo36712a(dVar, i);
                AbstractC88974o oVar = this.f77469d;
                if (dVar != null) {
                    i2 = dVar.f52715d;
                } else {
                    i2 = -10000;
                }
                JSONObject jSONObject2 = null;
                if (dVar != null) {
                    str = dVar.f52717f;
                } else {
                    str = null;
                }
                EnumC32592i iVar = EnumC32592i.LOGIN;
                EnumC32594j jVar = this.f77468c.f77466d;
                if (!(dVar == null || (nVar = (C22419n) dVar.f52723j) == null || (jSONObject = nVar.f53008m) == null)) {
                    jSONObject2 = jSONObject.getJSONObject("data");
                }
                oVar.mo143050a((Throwable) new C32405w(i2, str, iVar, jVar, jSONObject2, null, 32, null));
            }
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<C22291d<C22419n>> oVar) {
            C89219l.m154721d(oVar, "");
            C39162r.m79460a("send_sms", new C31376a().mo57399a("send_method", this.f77463a).mo57397a("send_reason", this.f77464b).mo57399a("enter_method", this.f77465c.mo58467x()).mo57399a("enter_from", this.f77465c.mo58466w()).f75156a);
            C32477a aVar = new C32477a(this, oVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (C32407x.m66805a()) {
                linkedHashMap.put("is6Digits", "1");
            }
            this.f77465c.mo58464b(aVar);
            this.f77465c.mo58469z().mo36633a(this.f77467e, this.f77464b, linkedHashMap, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$bw */
    public static final class C32480bw<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ String f77476a;

        /* renamed from: b */
        final /* synthetic */ int f77477b;

        /* renamed from: c */
        final /* synthetic */ AbstractC32572b f77478c;

        /* renamed from: d */
        final /* synthetic */ EnumC32592i f77479d;

        /* renamed from: e */
        final /* synthetic */ EnumC32594j f77480e;

        /* renamed from: f */
        final /* synthetic */ Map f77481f;

        /* renamed from: g */
        final /* synthetic */ String f77482g;

        /* renamed from: h */
        final /* synthetic */ String f77483h;

        /* renamed from: i */
        final /* synthetic */ int f77484i;

        static {
            Covode.recordClassIndex(39248);
        }

        C32480bw(String str, int i, AbstractC32572b bVar, EnumC32592i iVar, EnumC32594j jVar, Map map, String str2, String str3, int i2) {
            this.f77476a = str;
            this.f77477b = i;
            this.f77478c = bVar;
            this.f77479d = iVar;
            this.f77480e = jVar;
            this.f77481f = map;
            this.f77482g = str2;
            this.f77483h = str3;
            this.f77484i = i2;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$bw$a */
        public static final class C32481a extends C31896b {

            /* renamed from: c */
            final /* synthetic */ C32480bw f77485c;

            /* renamed from: d */
            final /* synthetic */ AbstractC88974o f77486d;

            static {
                Covode.recordClassIndex(39249);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.p2082ss.android.ugc.aweme.account.login.p2258c.C31896b, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: e */
            public final /* synthetic */ void mo36686e(C22289b bVar) {
                mo36686e((C22291d) bVar);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.p2082ss.android.ugc.aweme.account.login.p2258c.C31896b
            /* renamed from: a */
            public final void mo36711a(C22291d<C22419n> dVar) {
                AbstractC88974o oVar = this.f77486d;
                if (dVar == null) {
                    C89219l.m154715b();
                }
                oVar.mo143049a(dVar);
            }

            C32481a(C32480bw bwVar, AbstractC88974o oVar) {
                this.f77485c = bwVar;
                this.f77486d = oVar;
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.p2082ss.android.ugc.aweme.account.login.p2258c.C31896b, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo36681a(C22289b bVar, int i) {
                mo36681a((C22291d) bVar, i);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36682a(C22289b bVar, String str) {
                C22291d dVar = (C22291d) bVar;
                C89219l.m154721d(dVar, "");
                this.f77486d.mo143050a((Throwable) new C32405w(dVar.f52715d, dVar.f52717f, this.f77485c.f77479d, this.f77485c.f77480e, null, null, 32, null));
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.p2082ss.android.ugc.aweme.account.login.p2258c.C31896b
            /* renamed from: a */
            public final void mo36712a(C22291d<C22419n> dVar, int i) {
                String str;
                String str2;
                C22419n nVar;
                JSONObject jSONObject = new JSONObject();
                if (dVar == null || (nVar = (C22419n) dVar.f52723j) == null || (str = nVar.f53036d) == null) {
                    str = "";
                }
                jSONObject.put("next_url", str);
                AbstractC88974o oVar = this.f77486d;
                if (dVar != null) {
                    str2 = dVar.f52717f;
                } else {
                    str2 = null;
                }
                oVar.mo143050a((Throwable) new C32405w(i, str2, this.f77485c.f77479d, this.f77485c.f77480e, jSONObject, null, 32, null));
            }
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<C22291d<C22419n>> oVar) {
            C89219l.m154721d(oVar, "");
            C39162r.m79460a("send_sms", new C31376a().mo57399a("send_method", this.f77476a).mo57397a("send_reason", this.f77477b).mo57399a("enter_method", this.f77478c.mo58467x()).mo57399a("enter_from", this.f77478c.mo58466w()).f75156a);
            boolean a = C32856f.m67455a(C31291a.f74991a);
            C32481a aVar = new C32481a(this, oVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (C32407x.m66805a()) {
                linkedHashMap.put("is6Digits", "1");
            }
            Map map = this.f77481f;
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            this.f77478c.mo58464b(aVar);
            this.f77478c.mo58469z().mo36631a(this.f77482g, this.f77477b, this.f77483h, this.f77484i, a ? 1 : 0, null, null, linkedHashMap, aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$bz */
    static final class C32484bz<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ String f77497a;

        /* renamed from: b */
        final /* synthetic */ int f77498b;

        /* renamed from: c */
        final /* synthetic */ AbstractC32572b f77499c;

        /* renamed from: d */
        final /* synthetic */ EnumC32592i f77500d;

        /* renamed from: e */
        final /* synthetic */ EnumC32594j f77501e;

        /* renamed from: f */
        final /* synthetic */ String f77502f;

        /* renamed from: g */
        final /* synthetic */ String f77503g;

        /* renamed from: h */
        final /* synthetic */ int f77504h;

        static {
            Covode.recordClassIndex(39252);
        }

        C32484bz(String str, int i, AbstractC32572b bVar, EnumC32592i iVar, EnumC32594j jVar, String str2, String str3, int i2) {
            this.f77497a = str;
            this.f77498b = i;
            this.f77499c = bVar;
            this.f77500d = iVar;
            this.f77501e = jVar;
            this.f77502f = str2;
            this.f77503g = str3;
            this.f77504h = i2;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$bz$a */
        public static final class C32485a extends C31896b {

            /* renamed from: c */
            final /* synthetic */ C32484bz f77505c;

            /* renamed from: d */
            final /* synthetic */ AbstractC88974o f77506d;

            static {
                Covode.recordClassIndex(39253);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.p2082ss.android.ugc.aweme.account.login.p2258c.C31896b, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: e */
            public final /* synthetic */ void mo36686e(C22289b bVar) {
                mo36686e((C22291d) bVar);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.p2082ss.android.ugc.aweme.account.login.p2258c.C31896b
            /* renamed from: a */
            public final void mo36711a(C22291d<C22419n> dVar) {
                AbstractC88974o oVar = this.f77506d;
                if (dVar == null) {
                    C89219l.m154715b();
                }
                oVar.mo143049a(dVar);
            }

            C32485a(C32484bz bzVar, AbstractC88974o oVar) {
                this.f77505c = bzVar;
                this.f77506d = oVar;
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.p2082ss.android.ugc.aweme.account.login.p2258c.C31896b, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo36681a(C22289b bVar, int i) {
                mo36681a((C22291d) bVar, i);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36682a(C22289b bVar, String str) {
                C22291d dVar = (C22291d) bVar;
                C89219l.m154721d(dVar, "");
                this.f77506d.mo143050a((Throwable) new C32405w(dVar.f52715d, dVar.f52717f, this.f77505c.f77500d, this.f77505c.f77501e, null, null, 32, null));
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.p2082ss.android.ugc.aweme.account.login.p2258c.C31896b
            /* renamed from: a */
            public final void mo36712a(C22291d<C22419n> dVar, int i) {
                String str;
                String str2;
                C22419n nVar;
                JSONObject jSONObject;
                JSONObject optJSONObject;
                C22419n nVar2;
                JSONObject jSONObject2 = new JSONObject();
                if (dVar == null || (nVar2 = (C22419n) dVar.f52723j) == null || (str = nVar2.f53036d) == null) {
                    str = "";
                }
                jSONObject2.put("next_url", str);
                if (i == 2030) {
                    if (!(dVar == null || (nVar = (C22419n) dVar.f52723j) == null || (jSONObject = nVar.f53008m) == null || (optJSONObject = jSONObject.optJSONObject("data")) == null)) {
                        jSONObject2.put("data", optJSONObject);
                    }
                    jSONObject2.put("url_path", "/passport/mobile/send_code/v1/");
                } else if (i == 1206) {
                    new C79459a(C31291a.f74991a).mo123050a(R.string.aql).mo123053a();
                }
                AbstractC88974o oVar = this.f77506d;
                if (dVar != null) {
                    str2 = dVar.f52717f;
                } else {
                    str2 = null;
                }
                oVar.mo143050a((Throwable) new C32405w(i, str2, this.f77505c.f77500d, this.f77505c.f77501e, jSONObject2, null, 32, null));
            }
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<C22291d<C22419n>> oVar) {
            C89219l.m154721d(oVar, "");
            C39162r.m79460a("send_sms", new C31376a().mo57399a("send_method", this.f77497a).mo57397a("send_reason", this.f77498b).mo57399a("enter_method", this.f77499c.mo58467x()).mo57399a("enter_from", this.f77499c.mo58466w()).f75156a);
            boolean a = C32856f.m67455a(C31291a.f74991a);
            C32485a aVar = new C32485a(this, oVar);
            Map<? extends String, ? extends String> linkedHashMap = new LinkedHashMap<>();
            if (C32407x.m66805a()) {
                linkedHashMap.put("is6Digits", "1");
            }
            this.f77499c.mo58464b(aVar);
            Context context = this.f77499c.getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(context, "");
            String str = this.f77502f;
            int i = this.f77498b;
            String str2 = this.f77503g;
            int i2 = this.f77504h;
            C89219l.m154721d(context, "");
            C89219l.m154721d("", "");
            C89219l.m154721d("", "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(aVar, "");
            C22419n nVar = new C22419n("", "", i, str2, i2, a ? 1 : 0);
            Map<String, String> linkedHashMap2 = new LinkedHashMap<>();
            linkedHashMap2.putAll(linkedHashMap);
            Map<? extends String, ? extends String> map = nVar.f53046z;
            if ((map instanceof Map) && map != null) {
                linkedHashMap2.putAll(map);
            }
            C22355a.C22356a aVar2 = new C22355a.C22356a();
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(nVar.f53033a)) {
                hashMap.put("mobile", C13627m.m24501c(nVar.f53033a));
            }
            if (!TextUtils.isEmpty(nVar.f53039g)) {
                hashMap.put("old_mobile", C13627m.m24501c(nVar.f53039g));
            }
            if (!TextUtils.isEmpty(nVar.f53034b)) {
                hashMap.put("captcha", nVar.f53034b);
            }
            hashMap.put(StringSet.type, C13627m.m24501c(String.valueOf(nVar.f53037e)));
            hashMap.put("unbind_exist", C13627m.m24501c(String.valueOf(nVar.f53038f)));
            hashMap.put("mix_mode", "1");
            if (nVar.f53032A == 1) {
                hashMap.put("check_register", "1");
            } else if (nVar.f53032A == 0) {
                hashMap.put("check_register", "0");
            }
            if (C31663o.m65975a()) {
                hashMap.put("is6Digits", "1");
            } else {
                hashMap.put("is6Digits", "0");
            }
            if (!TextUtils.isEmpty(nVar.f53041u)) {
                hashMap.put("ticket", nVar.f53041u);
            }
            hashMap.put("auto_read", String.valueOf(nVar.f53042v));
            if (!TextUtils.isEmpty(nVar.f53043w)) {
                hashMap.put("shark_ticket", nVar.f53043w);
            }
            if (!TextUtils.isEmpty(nVar.f53045y)) {
                hashMap.put("auth_token", nVar.f53045y);
            }
            if (!TextUtils.isEmpty(nVar.f53044x)) {
                hashMap.put("unusable_mobile_ticket", nVar.f53044x);
            }
            if (str != null) {
                hashMap.put("not_login_ticket", str);
            }
            C22355a.C22356a a2 = aVar2.mo36708a(hashMap, linkedHashMap2);
            C89219l.m154716b(a2, "");
            a2.f52826a = C22306c.C22307a.m41972a("/passport/mobile/send_code/v1/");
            C22355a c = a2.mo36710c();
            C89219l.m154716b(c, "");
            new C32014e(context, c, nVar, aVar).mo36736d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$cc */
    static final class C32489cc<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ int f77516a;

        /* renamed from: b */
        final /* synthetic */ String f77517b;

        /* renamed from: c */
        final /* synthetic */ EnumC32592i f77518c;

        /* renamed from: d */
        final /* synthetic */ EnumC32594j f77519d;

        /* renamed from: e */
        final /* synthetic */ AbstractC32572b f77520e;

        /* renamed from: f */
        final /* synthetic */ String f77521f;

        static {
            Covode.recordClassIndex(39257);
        }

        C32489cc(int i, String str, EnumC32592i iVar, EnumC32594j jVar, AbstractC32572b bVar, String str2) {
            this.f77516a = i;
            this.f77517b = str;
            this.f77518c = iVar;
            this.f77519d = jVar;
            this.f77520e = bVar;
            this.f77521f = str2;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$cc$a */
        public static final class C32490a extends AbstractC22434l {

            /* renamed from: c */
            final /* synthetic */ C32489cc f77522c;

            /* renamed from: d */
            final /* synthetic */ AbstractC88974o f77523d;

            static {
                Covode.recordClassIndex(39258);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: e */
            public final /* synthetic */ void mo36686e(C22289b bVar) {
                mo36686e((C22291d) bVar);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e
            /* renamed from: a */
            public final void mo36711a(C22291d<C22419n> dVar) {
                C89219l.m154721d(dVar, "");
                this.f77523d.mo143049a(dVar);
            }

            C32490a(C32489cc ccVar, AbstractC88974o oVar) {
                this.f77522c = ccVar;
                this.f77523d = oVar;
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo36681a(C22289b bVar, int i) {
                mo36681a((C22291d) bVar, i);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36682a(C22289b bVar, String str) {
                C22291d dVar = (C22291d) bVar;
                C89219l.m154721d(dVar, "");
                this.f77523d.mo143050a((Throwable) new C32405w(dVar.f52715d, dVar.f52717f, this.f77522c.f77518c, this.f77522c.f77519d, null, null, 32, null));
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e
            /* renamed from: a */
            public final void mo36712a(C22291d<C22419n> dVar, int i) {
                String str;
                String str2;
                C22419n nVar;
                AbstractC88974o oVar = this.f77523d;
                if (dVar != null) {
                    str = dVar.f52717f;
                } else {
                    str = null;
                }
                EnumC32592i iVar = this.f77522c.f77518c;
                EnumC32594j jVar = this.f77522c.f77519d;
                JSONObject jSONObject = new JSONObject();
                if (dVar == null || (nVar = (C22419n) dVar.f52723j) == null || (str2 = nVar.f53036d) == null) {
                    str2 = "";
                }
                jSONObject.put("next_url", str2);
                oVar.mo143050a((Throwable) new C32405w(i, str, iVar, jVar, jSONObject, null, 32, null));
            }
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<C22291d<C22419n>> oVar) {
            C89219l.m154721d(oVar, "");
            C39162r.m79460a("send_voice_verification_code", new C31376a().mo57399a("send_reason", String.valueOf(this.f77516a)).mo57399a("send_method", this.f77517b).f75156a);
            C32490a aVar = new C32490a(this, oVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (C32407x.m66805a()) {
                linkedHashMap.put("is6Digits", "1");
            }
            this.f77520e.mo58464b(aVar);
            this.f77520e.mo58469z().mo36642a(this.f77521f, "", this.f77516a, linkedHashMap, aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$ct */
    public static final class C32512ct<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77580a;

        /* renamed from: b */
        final /* synthetic */ String f77581b;

        static {
            Covode.recordClassIndex(39280);
        }

        public C32512ct(AbstractC32572b bVar, String str) {
            this.f77580a = bVar;
            this.f77581b = str;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$ct$a */
        public static final class C32513a extends AbstractC32374af {

            /* renamed from: c */
            final /* synthetic */ C32512ct f77582c;

            /* renamed from: d */
            final /* synthetic */ AbstractC88974o f77583d;

            static {
                Covode.recordClassIndex(39281);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: e */
            public final /* synthetic */ void mo36686e(C22289b bVar) {
                mo36686e((C22291d) bVar);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e
            /* renamed from: a */
            public final void mo36711a(C22291d<C32375ag> dVar) {
                C89219l.m154721d(dVar, "");
                C32375ag agVar = (C32375ag) dVar.f52723j;
                if (agVar == null || agVar.f77204b == null) {
                    this.f77583d.mo143050a((Throwable) C32405w.C32406a.m66783a(this.f77582c.f77580a.mo58458A(), this.f77582c.f77580a.mo58460Z_()));
                } else {
                    this.f77583d.mo143049a(dVar);
                }
            }

            C32513a(C32512ct ctVar, AbstractC88974o oVar) {
                this.f77582c = ctVar;
                this.f77583d = oVar;
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo36681a(C22289b bVar, int i) {
                mo36681a((C22291d) bVar, i);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36682a(C22289b bVar, String str) {
                C22291d dVar = (C22291d) bVar;
                C89219l.m154721d(dVar, "");
                super.mo36682a(dVar, str);
                this.f77583d.mo143050a((Throwable) new C32405w(dVar.f52715d, dVar.f52717f, this.f77582c.f77580a.mo58458A(), this.f77582c.f77580a.mo58460Z_(), null, null, 32, null));
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e
            /* renamed from: a */
            public final void mo36712a(C22291d<C32375ag> dVar, int i) {
                String str;
                AbstractC88974o oVar = this.f77583d;
                if (dVar != null) {
                    str = dVar.f52717f;
                } else {
                    str = null;
                }
                oVar.mo143050a((Throwable) new C32405w(i, str, this.f77582c.f77580a.mo58458A(), this.f77582c.f77580a.mo58460Z_(), null, null, 32, null));
            }
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<C22291d<C32375ag>> oVar) {
            C89219l.m154721d(oVar, "");
            C32513a aVar = new C32513a(this, oVar);
            this.f77580a.mo58464b(aVar);
            Context context = this.f77580a.getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(context, "");
            String str = this.f77581b;
            C89219l.m154721d(context, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d("", "");
            C89219l.m154721d(aVar, "");
            C32375ag agVar = new C32375ag(str, "");
            C22355a.C22356a aVar2 = new C22355a.C22356a();
            aVar2.f52826a = C22306c.C22307a.m41972a("/passport/account/verify/");
            C89219l.m154721d(agVar, "");
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(agVar.f77205c)) {
                hashMap.put("captcha", agVar.f77205c);
            }
            String c = C13627m.m24501c(agVar.f77204b);
            C89219l.m154716b(c, "");
            hashMap.put("password", c);
            hashMap.put("mix_mode", "1");
            C22355a c2 = aVar2.mo36707a(hashMap).mo36710c();
            C89219l.m154716b(c2, "");
            new C32376ah(context, c2, agVar, aVar, (byte) 0).mo36736d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$cx */
    public static final class C32518cx<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77592a;

        /* renamed from: b */
        final /* synthetic */ EnumC32592i f77593b;

        /* renamed from: c */
        final /* synthetic */ EnumC32594j f77594c;

        /* renamed from: d */
        final /* synthetic */ String f77595d;

        /* renamed from: e */
        final /* synthetic */ String f77596e;

        static {
            Covode.recordClassIndex(39286);
        }

        public C32518cx(AbstractC32572b bVar, EnumC32592i iVar, EnumC32594j jVar, String str, String str2) {
            this.f77592a = bVar;
            this.f77593b = iVar;
            this.f77594c = jVar;
            this.f77595d = str;
            this.f77596e = str2;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$cx$a */
        public static final class C32519a extends AbstractC22428f {

            /* renamed from: c */
            final /* synthetic */ C32518cx f77597c;

            /* renamed from: d */
            final /* synthetic */ AbstractC88974o f77598d;

            static {
                Covode.recordClassIndex(39287);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: e */
            public final /* synthetic */ void mo36686e(C22289b bVar) {
                mo36686e((C22291d) bVar);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e
            /* renamed from: a */
            public final void mo36711a(C22291d<C22411f> dVar) {
                C89219l.m154721d(dVar, "");
                this.f77598d.mo143049a(dVar.f52723j);
            }

            C32519a(C32518cx cxVar, AbstractC88974o oVar) {
                this.f77597c = cxVar;
                this.f77598d = oVar;
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo36681a(C22289b bVar, int i) {
                mo36681a((C22291d) bVar, i);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36682a(C22289b bVar, String str) {
                C22291d dVar = (C22291d) bVar;
                C89219l.m154721d(dVar, "");
                this.f77598d.mo143050a((Throwable) new C32405w(dVar.f52715d, dVar.f52717f, this.f77597c.f77593b, this.f77597c.f77594c, null, null, 32, null));
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e
            /* renamed from: a */
            public final void mo36712a(C22291d<C22411f> dVar, int i) {
                String str;
                C22411f fVar;
                JSONObject jSONObject;
                AbstractC88974o oVar = this.f77598d;
                JSONObject jSONObject2 = null;
                if (dVar != null) {
                    str = dVar.f52717f;
                } else {
                    str = null;
                }
                EnumC32592i iVar = this.f77597c.f77593b;
                EnumC32594j jVar = this.f77597c.f77594c;
                if (!(dVar == null || (fVar = (C22411f) dVar.f52723j) == null || (jSONObject = fVar.f53008m) == null)) {
                    jSONObject2 = jSONObject.getJSONObject("data");
                }
                oVar.mo143050a((Throwable) new C32405w(i, str, iVar, jVar, jSONObject2, null, 32, null));
            }
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<C22411f> oVar) {
            C89219l.m154721d(oVar, "");
            C32404v.m66770a((Boolean) true, "email", (AbstractC32584f) this.f77592a, false, (Map) null, false, 56);
            C32519a aVar = new C32519a(this, oVar);
            this.f77592a.mo58464b(aVar);
            this.f77592a.mo58469z().mo36651a(this.f77595d, this.f77596e, C31566h.m65850b(), aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$d */
    public static final class C32522d<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77601a;

        /* renamed from: b */
        final /* synthetic */ EnumC32592i f77602b;

        /* renamed from: c */
        final /* synthetic */ EnumC32594j f77603c;

        /* renamed from: d */
        final /* synthetic */ boolean f77604d;

        /* renamed from: e */
        final /* synthetic */ String f77605e;

        /* renamed from: f */
        final /* synthetic */ String f77606f;

        static {
            Covode.recordClassIndex(39290);
        }

        public C32522d(AbstractC32572b bVar, EnumC32592i iVar, EnumC32594j jVar, boolean z, String str, String str2) {
            this.f77601a = bVar;
            this.f77602b = iVar;
            this.f77603c = jVar;
            this.f77604d = z;
            this.f77605e = str;
            this.f77606f = str2;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$d$a */
        public static final class C32523a extends AbstractC22423a {

            /* renamed from: c */
            final /* synthetic */ C32522d f77607c;

            /* renamed from: d */
            final /* synthetic */ AbstractC88974o f77608d;

            static {
                Covode.recordClassIndex(39291);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: e */
            public final /* synthetic */ void mo36686e(C22289b bVar) {
                mo36686e((C22291d) bVar);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e
            /* renamed from: a */
            public final void mo36711a(C22291d<C22406a> dVar) {
                C89219l.m154721d(dVar, "");
                this.f77608d.mo143049a(dVar);
            }

            C32523a(C32522d dVar, AbstractC88974o oVar) {
                this.f77607c = dVar;
                this.f77608d = oVar;
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo36681a(C22289b bVar, int i) {
                mo36681a((C22291d) bVar, i);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36682a(C22289b bVar, String str) {
                C22291d dVar = (C22291d) bVar;
                C89219l.m154721d(dVar, "");
                this.f77608d.mo143050a((Throwable) new C32405w(dVar.f52715d, dVar.f52717f, this.f77607c.f77602b, this.f77607c.f77603c, null, null, 32, null));
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e
            /* renamed from: a */
            public final void mo36712a(C22291d<C22406a> dVar, int i) {
                C89219l.m154721d(dVar, "");
                this.f77608d.mo143050a((Throwable) new C32405w(dVar.f52715d, dVar.f52717f, this.f77607c.f77602b, this.f77607c.f77603c, null, null, 32, null));
            }
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<C22291d<C22406a>> oVar) {
            C89219l.m154721d(oVar, "");
            C31588c.m65888b(this.f77601a.mo58466w(), "mobile");
            C32523a aVar = new C32523a(this, oVar);
            this.f77601a.mo58464b(aVar);
            if (this.f77604d) {
                Context context = this.f77601a.getContext();
                if (context == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(context, "");
                String str = this.f77605e;
                String str2 = this.f77606f;
                C89219l.m154721d(context, "");
                C89219l.m154721d(str, "");
                C89219l.m154721d(str2, "");
                C89219l.m154721d("", "");
                C89219l.m154721d("", "");
                C89219l.m154721d(aVar, "");
                C22406a aVar2 = new C22406a(str, str2, "", "", 0);
                C22355a.C22356a aVar3 = new C22355a.C22356a();
                aVar3.f52826a = "/passport/mobile/bind_with_change_password/";
                C89219l.m154721d(aVar2, "");
                HashMap hashMap = new HashMap();
                if (!TextUtils.isEmpty(aVar2.f52967c)) {
                    String str3 = aVar2.f52967c;
                    C89219l.m154716b(str3, "");
                    hashMap.put("captcha", str3);
                }
                String c = C13627m.m24501c(aVar2.f52966b);
                C89219l.m154716b(c, "");
                hashMap.put("code", c);
                String c2 = C13627m.m24501c(aVar2.f52965a);
                C89219l.m154716b(c2, "");
                hashMap.put("mobile", c2);
                if (!TextUtils.isEmpty(aVar2.f52968d)) {
                    String c3 = C13627m.m24501c(aVar2.f52968d);
                    C89219l.m154716b(c3, "");
                    hashMap.put("password", c3);
                }
                String c4 = C13627m.m24501c(String.valueOf(aVar2.f52969e));
                C89219l.m154716b(c4, "");
                hashMap.put("unbind_exist", c4);
                hashMap.put("mix_mode", "1");
                C22355a c5 = aVar3.mo36707a(hashMap).mo36710c();
                C89219l.m154716b(c5, "");
                new C32332a(context, c5, aVar2, aVar).mo36736d();
                return;
            }
            this.f77601a.mo58469z().mo36644a(this.f77605e, this.f77606f, "", aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$g */
    public static final class C32526g<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77613a;

        /* renamed from: b */
        final /* synthetic */ String f77614b;

        /* renamed from: c */
        final /* synthetic */ String f77615c;

        /* renamed from: d */
        final /* synthetic */ String f77616d;

        /* renamed from: e */
        final /* synthetic */ boolean f77617e;

        static {
            Covode.recordClassIndex(39294);
        }

        public C32526g(AbstractC32572b bVar, String str, String str2, String str3, boolean z) {
            this.f77613a = bVar;
            this.f77614b = str;
            this.f77615c = str2;
            this.f77616d = str3;
            this.f77617e = z;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$g$a */
        public static final class C32527a extends AbstractC32391m {

            /* renamed from: c */
            final /* synthetic */ C32526g f77618c;

            /* renamed from: d */
            final /* synthetic */ AbstractC88974o f77619d;

            static {
                Covode.recordClassIndex(39295);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: e */
            public final /* synthetic */ void mo36686e(C22289b bVar) {
                mo36686e((C22291d) bVar);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e
            /* renamed from: a */
            public final void mo36711a(C22291d<C32392n> dVar) {
                C89219l.m154721d(dVar, "");
                this.f77619d.mo143049a(dVar);
            }

            C32527a(C32526g gVar, AbstractC88974o oVar) {
                this.f77618c = gVar;
                this.f77619d = oVar;
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo36681a(C22289b bVar, int i) {
                mo36681a((C22291d) bVar, i);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36682a(C22289b bVar, String str) {
                C22291d dVar = (C22291d) bVar;
                C89219l.m154721d(dVar, "");
                this.f77619d.mo143050a((Throwable) new C32405w(dVar.f52715d, dVar.f52717f, this.f77618c.f77613a.mo58458A(), this.f77618c.f77613a.mo58460Z_(), null, null, 32, null));
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e
            /* renamed from: a */
            public final void mo36712a(C22291d<C32392n> dVar, int i) {
                int i2;
                String str;
                C32392n nVar;
                JSONObject jSONObject;
                AbstractC88974o oVar = this.f77619d;
                if (dVar != null) {
                    i2 = dVar.f52715d;
                } else {
                    i2 = -10000;
                }
                JSONObject jSONObject2 = null;
                if (dVar != null) {
                    str = dVar.f52717f;
                } else {
                    str = null;
                }
                EnumC32592i A = this.f77618c.f77613a.mo58458A();
                EnumC32594j Z_ = this.f77618c.f77613a.mo58460Z_();
                if (!(dVar == null || (nVar = (C32392n) dVar.f52723j) == null || (jSONObject = nVar.f53008m) == null)) {
                    jSONObject2 = jSONObject.getJSONObject("data");
                }
                oVar.mo143050a((Throwable) new C32405w(i2, str, A, Z_, jSONObject2, null, 32, null));
            }
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<C22291d<C32392n>> oVar) {
            String str;
            C89219l.m154721d(oVar, "");
            C32527a aVar = new C32527a(this, oVar);
            this.f77613a.mo58464b(aVar);
            Context context = this.f77613a.getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(context, "");
            String str2 = this.f77614b;
            String str3 = this.f77615c;
            String str4 = this.f77616d;
            boolean z = this.f77617e;
            C89219l.m154721d(context, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            C89219l.m154721d(str4, "");
            C89219l.m154721d(aVar, "");
            C32392n nVar = new C32392n(str2, str3, str4);
            C22355a.C22356a aVar2 = new C22355a.C22356a();
            if (z) {
                str = "/passport/email/change_with_update_password/";
            } else {
                str = "/passport/email/change/";
            }
            aVar2.f52826a = str;
            C89219l.m154721d(nVar, "");
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(nVar.f77231c)) {
                hashMap.put("ticket", nVar.f77231c);
            }
            String c = C13627m.m24501c(nVar.f77229a);
            C89219l.m154716b(c, "");
            hashMap.put("code", c);
            hashMap.put("mix_mode", "1");
            String c2 = C13627m.m24501c(nVar.f77230b);
            C89219l.m154716b(c2, "");
            hashMap.put("email", c2);
            String c3 = C13627m.m24501c("6");
            C89219l.m154716b(c3, "");
            hashMap.put(StringSet.type, c3);
            C22355a c4 = aVar2.mo36707a(hashMap).mo36710c();
            C89219l.m154716b(c4, "");
            new C32393o(context, c4, nVar, aVar).mo36736d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$h */
    public static final class C32528h<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ EnumC32592i f77620a;

        /* renamed from: b */
        final /* synthetic */ EnumC32594j f77621b;

        /* renamed from: c */
        final /* synthetic */ AbstractC32572b f77622c;

        /* renamed from: d */
        final /* synthetic */ String f77623d;

        /* renamed from: e */
        final /* synthetic */ String f77624e;

        /* renamed from: f */
        final /* synthetic */ String f77625f;

        /* renamed from: g */
        final /* synthetic */ C0484a f77626g;

        static {
            Covode.recordClassIndex(39296);
        }

        public C32528h(EnumC32592i iVar, EnumC32594j jVar, AbstractC32572b bVar, String str, String str2, String str3, C0484a aVar) {
            this.f77620a = iVar;
            this.f77621b = jVar;
            this.f77622c = bVar;
            this.f77623d = str;
            this.f77624e = str2;
            this.f77625f = str3;
            this.f77626g = aVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$h$a */
        public static final class C32529a extends AbstractC22424b {

            /* renamed from: c */
            final /* synthetic */ C32528h f77627c;

            /* renamed from: d */
            final /* synthetic */ AbstractC88974o f77628d;

            static {
                Covode.recordClassIndex(39297);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: e */
            public final /* synthetic */ void mo36686e(C22289b bVar) {
                mo36686e((C22291d) bVar);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e
            /* renamed from: a */
            public final void mo36711a(C22291d<C22407b> dVar) {
                C89219l.m154721d(dVar, "");
                this.f77628d.mo143049a(dVar);
            }

            C32529a(C32528h hVar, AbstractC88974o oVar) {
                this.f77627c = hVar;
                this.f77628d = oVar;
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo36681a(C22289b bVar, int i) {
                mo36681a((C22291d) bVar, i);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36682a(C22289b bVar, String str) {
                C22291d dVar = (C22291d) bVar;
                C89219l.m154721d(dVar, "");
                this.f77628d.mo143050a((Throwable) new C32405w(dVar.f52715d, dVar.f52717f, this.f77627c.f77620a, this.f77627c.f77621b, null, null, 32, null));
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e
            /* renamed from: a */
            public final void mo36712a(C22291d<C22407b> dVar, int i) {
                C89219l.m154721d(dVar, "");
                this.f77628d.mo143050a((Throwable) new C32405w(dVar.f52715d, dVar.f52717f, this.f77627c.f77620a, this.f77627c.f77621b, null, null, 32, null));
            }
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<C22291d<C22407b>> oVar) {
            C89219l.m154721d(oVar, "");
            C32529a aVar = new C32529a(this, oVar);
            this.f77622c.mo58464b(aVar);
            this.f77622c.mo58469z().mo36647a(this.f77623d, this.f77624e, "", this.f77625f, this.f77626g, aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$k */
    public static final class C32532k<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77631a;

        /* renamed from: b */
        final /* synthetic */ String f77632b;

        /* renamed from: c */
        final /* synthetic */ String f77633c;

        static {
            Covode.recordClassIndex(39300);
        }

        public C32532k(AbstractC32572b bVar, String str, String str2) {
            this.f77631a = bVar;
            this.f77632b = str;
            this.f77633c = str2;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$k$a */
        public static final class C32533a extends AbstractC32389k {

            /* renamed from: c */
            final /* synthetic */ C32532k f77634c;

            /* renamed from: d */
            final /* synthetic */ AbstractC88974o f77635d;

            static {
                Covode.recordClassIndex(39301);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: e */
            public final /* synthetic */ void mo36686e(C22289b bVar) {
                mo36686e((C22291d) bVar);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e
            /* renamed from: a */
            public final void mo36711a(C22291d<C32390l> dVar) {
                C89219l.m154721d(dVar, "");
                C32390l lVar = (C32390l) dVar.f52723j;
                if (lVar == null || lVar.f77228b == null) {
                    this.f77635d.mo143050a((Throwable) C32405w.C32406a.m66783a(this.f77634c.f77631a.mo58458A(), this.f77634c.f77631a.mo58460Z_()));
                } else {
                    this.f77635d.mo143049a(dVar);
                }
            }

            C32533a(C32532k kVar, AbstractC88974o oVar) {
                this.f77634c = kVar;
                this.f77635d = oVar;
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo36681a(C22289b bVar, int i) {
                mo36681a((C22291d) bVar, i);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36682a(C22289b bVar, String str) {
                C22291d dVar = (C22291d) bVar;
                C89219l.m154721d(dVar, "");
                super.mo36682a(dVar, str);
                this.f77635d.mo143050a((Throwable) new C32405w(dVar.f52715d, dVar.f52717f, this.f77634c.f77631a.mo58458A(), this.f77634c.f77631a.mo58460Z_(), null, null, 32, null));
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e
            /* renamed from: a */
            public final void mo36712a(C22291d<C32390l> dVar, int i) {
                String str;
                AbstractC88974o oVar = this.f77635d;
                if (dVar != null) {
                    str = dVar.f52717f;
                } else {
                    str = null;
                }
                oVar.mo143050a((Throwable) new C32405w(i, str, this.f77634c.f77631a.mo58458A(), this.f77634c.f77631a.mo58460Z_(), null, null, 32, null));
            }
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<C22291d<C32390l>> oVar) {
            C89219l.m154721d(oVar, "");
            C32533a aVar = new C32533a(this, oVar);
            this.f77631a.mo58464b(aVar);
            Context context = this.f77631a.getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(context, "");
            String str = this.f77632b;
            String str2 = this.f77633c;
            C89219l.m154721d(context, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(aVar, "");
            C32390l lVar = new C32390l(str, str2);
            C22355a.C22356a aVar2 = new C22355a.C22356a();
            aVar2.f52826a = "/passport/email/change_password/";
            C89219l.m154721d(lVar, "");
            HashMap hashMap = new HashMap();
            String c = C13627m.m24501c(lVar.f77227a);
            C89219l.m154716b(c, "");
            hashMap.put("ticket", c);
            String c2 = C13627m.m24501c(lVar.f77228b);
            C89219l.m154716b(c2, "");
            hashMap.put("password", c2);
            hashMap.put("mix_mode", "1");
            hashMap.put("rules_version", "v2");
            C22355a c3 = aVar2.mo36707a(hashMap).mo36710c();
            C89219l.m154716b(c3, "");
            new C32387j(context, c3, lVar, aVar, (byte) 0).mo36736d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$n */
    public static final class C32536n<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77638a;

        /* renamed from: b */
        final /* synthetic */ String f77639b;

        /* renamed from: c */
        final /* synthetic */ String f77640c;

        static {
            Covode.recordClassIndex(39304);
        }

        public C32536n(AbstractC32572b bVar, String str, String str2) {
            this.f77638a = bVar;
            this.f77639b = str;
            this.f77640c = str2;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$n$a */
        public static final class C32537a extends AbstractC22425c {

            /* renamed from: c */
            final /* synthetic */ C32536n f77641c;

            /* renamed from: d */
            final /* synthetic */ AbstractC88974o f77642d;

            static {
                Covode.recordClassIndex(39305);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: e */
            public final /* synthetic */ void mo36686e(C22289b bVar) {
                mo36686e((C22291d) bVar);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e
            /* renamed from: a */
            public final void mo36711a(C22291d<C22408c> dVar) {
                C89219l.m154721d(dVar, "");
                C22408c cVar = (C22408c) dVar.f52723j;
                if (cVar == null || cVar.f52979b == null) {
                    this.f77642d.mo143050a((Throwable) C32405w.C32406a.m66783a(this.f77641c.f77638a.mo58458A(), this.f77641c.f77638a.mo58460Z_()));
                } else {
                    this.f77642d.mo143049a(dVar);
                }
            }

            C32537a(C32536n nVar, AbstractC88974o oVar) {
                this.f77641c = nVar;
                this.f77642d = oVar;
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo36681a(C22289b bVar, int i) {
                mo36681a((C22291d) bVar, i);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36682a(C22289b bVar, String str) {
                C22291d dVar = (C22291d) bVar;
                C89219l.m154721d(dVar, "");
                super.mo36682a(dVar, str);
                this.f77642d.mo143050a((Throwable) new C32405w(dVar.f52715d, dVar.f52717f, this.f77641c.f77638a.mo58458A(), this.f77641c.f77638a.mo58460Z_(), null, null, 32, null));
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e
            /* renamed from: a */
            public final void mo36712a(C22291d<C22408c> dVar, int i) {
                String str;
                AbstractC88974o oVar = this.f77642d;
                if (dVar != null) {
                    str = dVar.f52717f;
                } else {
                    str = null;
                }
                oVar.mo143050a((Throwable) new C32405w(i, str, this.f77641c.f77638a.mo58458A(), this.f77641c.f77638a.mo58460Z_(), null, null, 32, null));
            }
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<C22291d<C22408c>> oVar) {
            C89219l.m154721d(oVar, "");
            C32537a aVar = new C32537a(this, oVar);
            this.f77638a.mo58464b(aVar);
            Context context = this.f77638a.getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(context, "");
            String str = this.f77639b;
            String str2 = this.f77640c;
            C89219l.m154721d(context, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d("", "");
            C89219l.m154721d(aVar, "");
            C22408c cVar = new C22408c(str, str2, "");
            C22355a.C22356a aVar2 = new C22355a.C22356a();
            aVar2.f52826a = C22306c.C22307a.m41972a("/passport/password/change/");
            C89219l.m154721d(cVar, "");
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(cVar.f52980c)) {
                String str3 = cVar.f52980c;
                C89219l.m154716b(str3, "");
                hashMap.put("captcha", str3);
            }
            String c = C13627m.m24501c(cVar.f52978a);
            C89219l.m154716b(c, "");
            hashMap.put("ticket", c);
            String c2 = C13627m.m24501c(cVar.f52979b);
            C89219l.m154716b(c2, "");
            hashMap.put("password", c2);
            hashMap.put("mix_mode", "1");
            hashMap.put("rules_version", "v2");
            C22355a c3 = aVar2.mo36707a(hashMap).mo36710c();
            C89219l.m154716b(c3, "");
            new C32356aa(context, c3, cVar, aVar, (byte) 0).mo36736d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$t */
    public static final class C32544t<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ EnumC32592i f77655a;

        /* renamed from: b */
        final /* synthetic */ EnumC32594j f77656b;

        /* renamed from: c */
        final /* synthetic */ AbstractC32572b f77657c;

        /* renamed from: d */
        final /* synthetic */ String f77658d;

        static {
            Covode.recordClassIndex(39312);
        }

        public C32544t(EnumC32592i iVar, EnumC32594j jVar, AbstractC32572b bVar, String str) {
            this.f77655a = iVar;
            this.f77656b = jVar;
            this.f77657c = bVar;
            this.f77658d = str;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$t$a */
        public static final class C32545a extends AbstractC22426d {

            /* renamed from: c */
            final /* synthetic */ C32544t f77659c;

            /* renamed from: d */
            final /* synthetic */ AbstractC88974o f77660d;

            static {
                Covode.recordClassIndex(39313);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: e */
            public final /* synthetic */ void mo36686e(C22289b bVar) {
                mo36686e((C22291d) bVar);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e
            /* renamed from: a */
            public final void mo36711a(C22291d<C22409d> dVar) {
                C89219l.m154721d(dVar, "");
                this.f77660d.mo143049a(dVar.f52723j);
            }

            C32545a(C32544t tVar, AbstractC88974o oVar) {
                this.f77659c = tVar;
                this.f77660d = oVar;
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo36681a(C22289b bVar, int i) {
                mo36681a((C22291d) bVar, i);
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36682a(C22289b bVar, String str) {
                C22291d dVar = (C22291d) bVar;
                C89219l.m154721d(dVar, "");
                this.f77660d.mo143050a((Throwable) new C32405w(dVar.f52715d, dVar.f52717f, this.f77659c.f77655a, this.f77659c.f77656b, null, null, 32, null));
            }

            @Override // com.bytedance.sdk.p1625a.AbstractC22358e
            /* renamed from: a */
            public final void mo36712a(C22291d<C22409d> dVar, int i) {
                int i2;
                String str;
                AbstractC88974o oVar = this.f77660d;
                if (dVar != null) {
                    i2 = dVar.f52715d;
                    str = dVar.f52717f;
                } else {
                    i2 = -10000;
                    str = null;
                }
                oVar.mo143050a((Throwable) new C32405w(i2, str, this.f77659c.f77655a, this.f77659c.f77656b, null, null, 32, null));
            }
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<C22409d> oVar) {
            C89219l.m154721d(oVar, "");
            C32545a aVar = new C32545a(this, oVar);
            this.f77657c.mo58464b(aVar);
            this.f77657c.mo58469z().mo36658a(this.f77658d, C89041ag.m154415a(), "", aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$aa */
    public static final class C32410aa<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77272a;

        static {
            Covode.recordClassIndex(39178);
        }

        public C32410aa(AbstractC32572b bVar) {
            this.f77272a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f77272a.mo57470b_(1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$cr */
    public static final class C32510cr<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77578a;

        static {
            Covode.recordClassIndex(39278);
        }

        C32510cr(AbstractC32572b bVar) {
            this.f77578a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C32404v.m66776a(true, this.f77578a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$r */
    static final class C32542r<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77652a;

        static {
            Covode.recordClassIndex(39310);
        }

        C32542r(AbstractC32572b bVar) {
            this.f77652a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C32404v.m66776a(true, this.f77652a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$ab */
    static final class C32411ab<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77273a;

        /* renamed from: b */
        final /* synthetic */ Map f77274b;

        /* renamed from: c */
        final /* synthetic */ String f77275c;

        /* renamed from: d */
        final /* synthetic */ String f77276d;

        /* renamed from: e */
        final /* synthetic */ int f77277e;

        static {
            Covode.recordClassIndex(39179);
        }

        C32411ab(AbstractC32572b bVar, Map map, String str, String str2, int i) {
            this.f77273a = bVar;
            this.f77274b = map;
            this.f77275c = str;
            this.f77276d = str2;
            this.f77277e = i;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$ab$a */
        public static final class C32412a extends AbstractC22295a {

            /* renamed from: c */
            final /* synthetic */ C32411ab f77278c;

            /* renamed from: d */
            final /* synthetic */ AbstractC88974o f77279d;

            static {
                Covode.recordClassIndex(39180);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: e */
            public final /* synthetic */ void mo36686e(C22314a aVar) {
                C89219l.m154721d(aVar, "");
                this.f77279d.mo143049a(aVar);
            }

            C32412a(C32411ab abVar, AbstractC88974o oVar) {
                this.f77278c = abVar;
                this.f77279d = oVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36681a(C22314a aVar, int i) {
                String str;
                C22314a aVar2 = aVar;
                AbstractC88974o oVar = this.f77279d;
                if (aVar2 != null) {
                    str = aVar2.f52717f;
                } else {
                    str = null;
                }
                oVar.mo143050a((Throwable) new C32405w(i, str, this.f77278c.f77273a.mo58458A(), this.f77278c.f77273a.mo58460Z_(), null, null, 32, null));
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, java.lang.String] */
            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36682a(C22314a aVar, String str) {
                C22314a aVar2 = aVar;
                C89219l.m154721d(aVar2, "");
                this.f77279d.mo143050a((Throwable) new C32405w(aVar2.f52715d, aVar2.f52717f, this.f77278c.f77273a.mo58458A(), this.f77278c.f77273a.mo58460Z_(), null, null, 32, null));
            }
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<C22314a> oVar) {
            C89219l.m154721d(oVar, "");
            C32412a aVar = new C32412a(this, oVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map map = this.f77274b;
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            linkedHashMap.put("rules_version", "v2");
            this.f77273a.mo58464b(aVar);
            this.f77273a.mo58469z().mo36661b(this.f77275c, this.f77276d, this.f77277e, linkedHashMap, aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$bh */
    public static final class C32460bh<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ EnumC32592i f77413a;

        /* renamed from: b */
        final /* synthetic */ EnumC32594j f77414b;

        /* renamed from: c */
        final /* synthetic */ AbstractC32572b f77415c;

        /* renamed from: d */
        final /* synthetic */ String f77416d;

        /* renamed from: e */
        final /* synthetic */ int f77417e;

        static {
            Covode.recordClassIndex(39228);
        }

        public C32460bh(EnumC32592i iVar, EnumC32594j jVar, AbstractC32572b bVar, String str, int i) {
            this.f77413a = iVar;
            this.f77414b = jVar;
            this.f77415c = bVar;
            this.f77416d = str;
            this.f77417e = i;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$bh$a */
        public static final class C32461a extends AbstractC22438p {

            /* renamed from: c */
            final /* synthetic */ C32460bh f77418c;

            /* renamed from: d */
            final /* synthetic */ AbstractC88974o f77419d;

            static {
                Covode.recordClassIndex(39229);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: e */
            public final /* synthetic */ void mo36686e(C22293f fVar) {
                C89219l.m154721d(fVar, "");
                this.f77419d.mo143049a(fVar);
            }

            C32461a(C32460bh bhVar, AbstractC88974o oVar) {
                this.f77418c = bhVar;
                this.f77419d = oVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36681a(C22293f fVar, int i) {
                C22293f fVar2 = fVar;
                C89219l.m154721d(fVar2, "");
                this.f77419d.mo143050a((Throwable) new C32405w(fVar2.f52715d, fVar2.f52717f, this.f77418c.f77413a, this.f77418c.f77414b, null, null, 32, null));
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, java.lang.String] */
            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36682a(C22293f fVar, String str) {
                C22293f fVar2 = fVar;
                C89219l.m154721d(fVar2, "");
                this.f77419d.mo143050a((Throwable) new C32405w(fVar2.f52715d, fVar2.f52717f, this.f77418c.f77413a, this.f77418c.f77414b, null, null, 32, null));
            }
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<C22293f> oVar) {
            C89219l.m154721d(oVar, "");
            C32461a aVar = new C32461a(this, oVar);
            this.f77415c.mo58464b(aVar);
            this.f77415c.mo58469z().mo36632a(this.f77416d, this.f77417e, "", aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$cl */
    public static final class C32501cl<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77556a;

        /* renamed from: b */
        final /* synthetic */ String f77557b;

        /* renamed from: c */
        final /* synthetic */ String f77558c;

        static {
            Covode.recordClassIndex(39269);
        }

        public C32501cl(AbstractC32572b bVar, String str, String str2) {
            this.f77556a = bVar;
            this.f77557b = str;
            this.f77558c = str2;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$cl$a */
        public static final class C32502a extends AbstractC22302h {

            /* renamed from: c */
            final /* synthetic */ C32501cl f77559c;

            /* renamed from: d */
            final /* synthetic */ AbstractC88974o f77560d;

            static {
                Covode.recordClassIndex(39270);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: e */
            public final /* synthetic */ void mo36686e(C22325l lVar) {
                C89219l.m154721d(lVar, "");
                this.f77560d.mo143049a(lVar);
            }

            C32502a(C32501cl clVar, AbstractC88974o oVar) {
                this.f77559c = clVar;
                this.f77560d = oVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36681a(C22325l lVar, int i) {
                C22325l lVar2 = lVar;
                C89219l.m154721d(lVar2, "");
                this.f77560d.mo143050a((Throwable) new C32405w(i, lVar2.f52717f, EnumC32592i.SET_OR_RESET_PASSWORD, this.f77559c.f77556a.mo58460Z_(), null, null, 32, null));
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, java.lang.String] */
            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36682a(C22325l lVar, String str) {
                C22325l lVar2 = lVar;
                C89219l.m154721d(lVar2, "");
                this.f77560d.mo143050a((Throwable) new C32405w(lVar2.f52715d, lVar2.f52717f, EnumC32592i.SET_OR_RESET_PASSWORD, this.f77559c.f77556a.mo58460Z_(), null, null, 32, null));
            }
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<C22325l> oVar) {
            C89219l.m154721d(oVar, "");
            C32404v.m66770a((Boolean) false, "email", (AbstractC32584f) this.f77556a, true, (Map) null, false, 48);
            C32502a aVar = new C32502a(this, oVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("rules_version", "v2");
            this.f77556a.mo58464b(aVar);
            AbstractC22329e z = this.f77556a.mo58469z();
            String str = this.f77557b;
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
            z.mo36663b(C89361p.m154910b((CharSequence) str).toString(), this.f77558c, linkedHashMap, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$cq */
    public static final class C32508cq<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77572a;

        /* renamed from: b */
        final /* synthetic */ Map f77573b;

        /* renamed from: c */
        final /* synthetic */ String f77574c;

        /* renamed from: d */
        final /* synthetic */ int f77575d;

        static {
            Covode.recordClassIndex(39276);
        }

        C32508cq(AbstractC32572b bVar, Map map, String str, int i) {
            this.f77572a = bVar;
            this.f77573b = map;
            this.f77574c = str;
            this.f77575d = i;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$cq$a */
        public static final class C32509a extends AbstractC22438p {

            /* renamed from: c */
            final /* synthetic */ C32508cq f77576c;

            /* renamed from: d */
            final /* synthetic */ AbstractC88974o f77577d;

            static {
                Covode.recordClassIndex(39277);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: e */
            public final /* synthetic */ void mo36686e(C22293f fVar) {
                C89219l.m154721d(fVar, "");
                this.f77577d.mo143049a(fVar);
            }

            C32509a(C32508cq cqVar, AbstractC88974o oVar) {
                this.f77576c = cqVar;
                this.f77577d = oVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36681a(C22293f fVar, int i) {
                String str;
                C22293f fVar2 = fVar;
                AbstractC88974o oVar = this.f77577d;
                if (fVar2 != null) {
                    str = fVar2.f52717f;
                } else {
                    str = null;
                }
                oVar.mo143050a((Throwable) new C32405w(i, str, this.f77576c.f77572a.mo58458A(), this.f77576c.f77572a.mo58460Z_(), null, null, 32, null));
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, java.lang.String] */
            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36682a(C22293f fVar, String str) {
                C22293f fVar2 = fVar;
                C89219l.m154721d(fVar2, "");
                this.f77577d.mo143050a((Throwable) new C32405w(fVar2.f52715d, fVar2.f52717f, this.f77576c.f77572a.mo58458A(), this.f77576c.f77572a.mo58460Z_(), null, null, 32, null));
            }
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<C22293f> oVar) {
            C89219l.m154721d(oVar, "");
            C32509a aVar = new C32509a(this, oVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map map = this.f77573b;
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            this.f77572a.mo58464b(aVar);
            this.f77572a.mo58469z().mo36634a(this.f77574c, this.f77575d, linkedHashMap, aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$cw */
    static final class C32516cw<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77586a;

        /* renamed from: b */
        final /* synthetic */ Map f77587b;

        /* renamed from: c */
        final /* synthetic */ int f77588c;

        /* renamed from: d */
        final /* synthetic */ String f77589d;

        static {
            Covode.recordClassIndex(39284);
        }

        C32516cw(AbstractC32572b bVar, Map map, int i, String str) {
            this.f77586a = bVar;
            this.f77587b = map;
            this.f77588c = i;
            this.f77589d = str;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$cw$a */
        public static final class C32517a extends AbstractC22305k {

            /* renamed from: c */
            final /* synthetic */ C32516cw f77590c;

            /* renamed from: d */
            final /* synthetic */ AbstractC88974o f77591d;

            static {
                Covode.recordClassIndex(39285);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: e */
            public final /* synthetic */ void mo36686e(C22328o oVar) {
                C89219l.m154721d(oVar, "");
                this.f77591d.mo143049a(oVar);
            }

            C32517a(C32516cw cwVar, AbstractC88974o oVar) {
                this.f77590c = cwVar;
                this.f77591d = oVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36681a(C22328o oVar, int i) {
                int i2;
                String str;
                JSONObject jSONObject;
                C22328o oVar2 = oVar;
                AbstractC88974o oVar3 = this.f77591d;
                if (oVar2 != null) {
                    i2 = oVar2.f52715d;
                } else {
                    i2 = -10000;
                }
                JSONObject jSONObject2 = null;
                if (oVar2 != null) {
                    str = oVar2.f52717f;
                } else {
                    str = null;
                }
                EnumC32592i A = this.f77590c.f77586a.mo58458A();
                EnumC32594j Z_ = this.f77590c.f77586a.mo58460Z_();
                if (!(oVar2 == null || (jSONObject = oVar2.f52719h) == null)) {
                    jSONObject2 = jSONObject.optJSONObject("data");
                }
                oVar3.mo143050a((Throwable) new C32405w(i2, str, A, Z_, jSONObject2, null, 32, null));
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, java.lang.String] */
            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36682a(C22328o oVar, String str) {
                C22328o oVar2 = oVar;
                C89219l.m154721d(oVar2, "");
                this.f77591d.mo143050a((Throwable) new C32405w(oVar2.f52715d, oVar2.f52717f, this.f77590c.f77586a.mo58458A(), this.f77590c.f77586a.mo58460Z_(), null, null, 32, null));
            }
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<C22328o> oVar) {
            C89219l.m154721d(oVar, "");
            C32517a aVar = new C32517a(this, oVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map map = this.f77587b;
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            this.f77586a.mo58464b(aVar);
            this.f77586a.mo58469z().mo36630a(this.f77588c, this.f77589d, linkedHashMap, aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$q */
    static final class C32540q<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77645a;

        /* renamed from: b */
        final /* synthetic */ String f77646b;

        /* renamed from: c */
        final /* synthetic */ String f77647c;

        /* renamed from: d */
        final /* synthetic */ int f77648d;

        /* renamed from: e */
        final /* synthetic */ Map f77649e;

        static {
            Covode.recordClassIndex(39308);
        }

        C32540q(AbstractC32572b bVar, String str, String str2, int i, Map map) {
            this.f77645a = bVar;
            this.f77646b = str;
            this.f77647c = str2;
            this.f77648d = i;
            this.f77649e = map;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$q$a */
        public static final class C32541a extends AbstractC22295a {

            /* renamed from: c */
            final /* synthetic */ C32540q f77650c;

            /* renamed from: d */
            final /* synthetic */ AbstractC88974o f77651d;

            static {
                Covode.recordClassIndex(39309);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: e */
            public final /* synthetic */ void mo36686e(C22314a aVar) {
                C89219l.m154721d(aVar, "");
                this.f77651d.mo143049a(aVar);
            }

            C32541a(C32540q qVar, AbstractC88974o oVar) {
                this.f77650c = qVar;
                this.f77651d = oVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36681a(C22314a aVar, int i) {
                String str;
                C22314a aVar2 = aVar;
                AbstractC88974o oVar = this.f77651d;
                if (aVar2 != null) {
                    str = aVar2.f52717f;
                } else {
                    str = null;
                }
                oVar.mo143050a((Throwable) new C32405w(i, str, this.f77650c.f77645a.mo58458A(), this.f77650c.f77645a.mo58460Z_(), null, null, 32, null));
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, java.lang.String] */
            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36682a(C22314a aVar, String str) {
                C22314a aVar2 = aVar;
                C89219l.m154721d(aVar2, "");
                this.f77651d.mo143050a((Throwable) new C32405w(aVar2.f52715d, aVar2.f52717f, this.f77650c.f77645a.mo58458A(), this.f77650c.f77645a.mo58460Z_(), null, null, 32, null));
            }
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<C22314a> oVar) {
            C89219l.m154721d(oVar, "");
            C32541a aVar = new C32541a(this, oVar);
            this.f77645a.mo58464b(aVar);
            this.f77645a.mo58469z().mo36640a(this.f77646b, this.f77647c, this.f77648d, this.f77649e, aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$bi */
    public static final class C32462bi<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77420a;

        static {
            Covode.recordClassIndex(39230);
        }

        public C32462bi(AbstractC32572b bVar) {
            this.f77420a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C31588c.m65887a(this.f77420a.mo58466w(), "change_bind_phone_click", "phone", 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$bs */
    public static final class C32475bs<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ String f77461a;

        /* renamed from: b */
        final /* synthetic */ int f77462b;

        static {
            Covode.recordClassIndex(39243);
        }

        C32475bs(String str, int i) {
            this.f77461a = str;
            this.f77462b = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C32404v.m66766a(0, this.f77461a, this.f77462b, "mail", (String) null, (String) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$cs */
    public static final class C32511cs<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77579a;

        static {
            Covode.recordClassIndex(39279);
        }

        C32511cs(AbstractC32572b bVar) {
            this.f77579a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (obj instanceof C32405w) {
                C32404v.m66776a(false, this.f77579a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$w */
    public static final class C32549w<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77668a;

        static {
            Covode.recordClassIndex(39317);
        }

        public C32549w(AbstractC32572b bVar) {
            this.f77668a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            final String str = (String) obj;
            C89219l.m154721d(str, "");
            return new AbstractC90213b(this) {
                /* class com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x.C32549w.C325501 */

                /* renamed from: a */
                final /* synthetic */ C32549w f77669a;

                static {
                    Covode.recordClassIndex(39318);
                }

                {
                    this.f77669a = r1;
                }

                @Override // org.p4663a.AbstractC90213b
                /* renamed from: a_ */
                public final void mo57509a_(AbstractC90214c<? super C32382f> cVar) {
                    int i;
                    String str;
                    Integer num;
                    C32382f fVar = (C32382f) NetworkProxyAccount.f78256b.mo58679a().mo46670a(str, (Class) C32382f.class);
                    if (TextUtils.equals(fVar.f77219a, "success")) {
                        cVar.onNext(fVar);
                    } else {
                        C32381e eVar = fVar.f77220b;
                        if (eVar == null || (num = eVar.f77216a) == null) {
                            i = -1;
                        } else {
                            i = num.intValue();
                        }
                        C32381e eVar2 = fVar.f77220b;
                        if (eVar2 != null) {
                            str = eVar2.f77217b;
                        } else {
                            str = null;
                        }
                        cVar.onError(new C32405w(i, str, EnumC32592i.SIGN_UP, this.f77669a.f77668a.mo58460Z_(), null, null, 32, null));
                    }
                    cVar.onComplete();
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$ak */
    public static final class C32423ak<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77302a;

        /* renamed from: b */
        final /* synthetic */ String f77303b;

        /* renamed from: c */
        final /* synthetic */ String f77304c;

        /* renamed from: d */
        final /* synthetic */ int f77305d = 1;

        /* renamed from: e */
        final /* synthetic */ int f77306e = 3;

        /* renamed from: f */
        final /* synthetic */ Map f77307f = null;

        static {
            Covode.recordClassIndex(39191);
        }

        public C32423ak(AbstractC32572b bVar, String str, String str2) {
            this.f77302a = bVar;
            this.f77303b = str;
            this.f77304c = str2;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$ak$a */
        public static final class C32424a extends AbstractC22346c<C22318e> {

            /* renamed from: c */
            final /* synthetic */ C32423ak f77308c;

            /* renamed from: d */
            final /* synthetic */ AbstractC88974o f77309d;

            static {
                Covode.recordClassIndex(39192);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: e */
            public final /* synthetic */ void mo36686e(C22318e eVar) {
                C89219l.m154721d(eVar, "");
                C32646i.m67195a(this.f77308c.f77302a, true, 0);
                this.f77309d.mo143049a(eVar);
            }

            C32424a(C32423ak akVar, AbstractC88974o oVar) {
                this.f77308c = akVar;
                this.f77309d = oVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36681a(C22318e eVar, int i) {
                C22318e eVar2 = eVar;
                C32646i.m67195a(this.f77308c.f77302a, false, i);
                if (eVar2 == null) {
                    this.f77309d.mo143050a((Throwable) C32405w.C32406a.m66783a(this.f77308c.f77302a.mo58458A(), this.f77308c.f77302a.mo58460Z_()));
                } else {
                    this.f77309d.mo143050a((Throwable) new C32405w(i, eVar2.f52717f, this.f77308c.f77302a.mo58458A(), this.f77308c.f77302a.mo58460Z_(), eVar2.f52719h, null, 32, null));
                }
            }
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<C22318e> oVar) {
            C89219l.m154721d(oVar, "");
            C32424a aVar = new C32424a(this, oVar);
            this.f77302a.mo58464b(aVar);
            this.f77302a.mo58469z().mo36638a(this.f77303b, this.f77304c, this.f77305d, this.f77306e, this.f77307f, aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$bk */
    public static final class C32464bk<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77422a;

        /* renamed from: b */
        final /* synthetic */ boolean f77423b;

        /* renamed from: c */
        final /* synthetic */ String f77424c;

        /* renamed from: d */
        final /* synthetic */ String f77425d;

        static {
            Covode.recordClassIndex(39232);
        }

        public C32464bk(AbstractC32572b bVar, boolean z, String str, String str2) {
            this.f77422a = bVar;
            this.f77423b = z;
            this.f77424c = str;
            this.f77425d = str2;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$bk$a */
        public static final class C32465a extends AbstractC22302h {

            /* renamed from: c */
            final /* synthetic */ C32464bk f77426c;

            /* renamed from: d */
            final /* synthetic */ AbstractC88974o f77427d;

            static {
                Covode.recordClassIndex(39233);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
            /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: f.a.o */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: e */
            public final /* synthetic */ void mo36686e(C22325l lVar) {
                C22325l lVar2 = lVar;
                C89219l.m154721d(lVar2, "");
                if (lVar2.f52724j == null) {
                    C32405w.C32406a.m66783a(EnumC32592i.SET_OR_RESET_PASSWORD, this.f77426c.f77422a.mo58460Z_());
                } else {
                    this.f77427d.mo143049a(lVar2);
                }
            }

            C32465a(C32464bk bkVar, AbstractC88974o oVar) {
                this.f77426c = bkVar;
                this.f77427d = oVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36681a(C22325l lVar, int i) {
                String str;
                C22325l lVar2 = lVar;
                AbstractC88974o oVar = this.f77427d;
                if (lVar2 != null) {
                    str = lVar2.f52717f;
                } else {
                    str = null;
                }
                oVar.mo143050a((Throwable) new C32405w(i, str, EnumC32592i.SET_OR_RESET_PASSWORD, this.f77426c.f77422a.mo58460Z_(), null, null, 32, null));
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, java.lang.String] */
            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36682a(C22325l lVar, String str) {
                C22325l lVar2 = lVar;
                C89219l.m154721d(lVar2, "");
                this.f77427d.mo143050a((Throwable) new C32405w(lVar2.f52715d, lVar2.f52717f, EnumC32592i.SET_OR_RESET_PASSWORD, this.f77426c.f77422a.mo58460Z_(), null, null, 32, null));
            }
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<C22325l> oVar) {
            C89219l.m154721d(oVar, "");
            C32404v.m66770a((Boolean) false, "sms_verification", (AbstractC32584f) this.f77422a, true, (Map) null, this.f77423b, 16);
            C32465a aVar = new C32465a(this, oVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("rules_version", "v2");
            this.f77422a.mo58464b(aVar);
            this.f77422a.mo58469z().mo36649a(this.f77424c, this.f77425d, linkedHashMap, aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$ac */
    static final class C32413ac<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ String f77280a;

        /* renamed from: b */
        final /* synthetic */ AbstractC32572b f77281b;

        static {
            Covode.recordClassIndex(39181);
        }

        C32413ac(String str, AbstractC32572b bVar) {
            this.f77280a = str;
            this.f77281b = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str = this.f77280a;
            String x = this.f77281b.mo58467x();
            C89219l.m154716b(x, "");
            C32404v.m66767a(0, str, x);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$b */
    public static final class C32450b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77388a;

        static {
            Covode.recordClassIndex(39218);
        }

        public C32450b(AbstractC32572b bVar) {
            this.f77388a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C31588c.m65886a(this.f77388a.mo58466w(), "email", 0, null, null);
            C31588c.m65887a(this.f77388a.mo58466w(), this.f77388a.mo58467x(), "email", 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$bc */
    public static final class C32454bc<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ boolean f77398a;

        /* renamed from: b */
        final /* synthetic */ boolean f77399b;

        /* renamed from: c */
        final /* synthetic */ AbstractC32572b f77400c;

        static {
            Covode.recordClassIndex(39222);
        }

        public C32454bc(boolean z, boolean z2, AbstractC32572b bVar) {
            this.f77398a = z;
            this.f77399b = z2;
            this.f77400c = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            C22417l lVar = (C22417l) obj;
            boolean z = this.f77398a;
            if (this.f77399b) {
                str = "whatsapp";
            } else {
                str = "sms_verification";
            }
            C32404v.m66778a(z, str, (AbstractC32584f) this.f77400c, lVar.f53026e, (Map) null, false, 48);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$bg */
    public static final class C32459bg<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C32459bg f77412a = new C32459bg();

        static {
            Covode.recordClassIndex(39227);
        }

        C32459bg() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            C32405w wVar = (C32405w) th;
            if (wVar.getErrorCode() != 1011) {
                C32840d.C32841a.m67417b(false, wVar.getErrorCode(), wVar.getDetailErrorMsg());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$bj */
    public static final class C32463bj<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77421a;

        static {
            Covode.recordClassIndex(39231);
        }

        public C32463bj(AbstractC32572b bVar) {
            this.f77421a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            C31588c.m65887a(this.f77421a.mo58466w(), "change_bind_phone_click", "phone", ((C32405w) th).getErrorCode());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$bo */
    static final class C32470bo<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ int f77445a;

        /* renamed from: b */
        final /* synthetic */ String f77446b;

        /* renamed from: c */
        final /* synthetic */ String f77447c;

        static {
            Covode.recordClassIndex(39238);
        }

        C32470bo(int i, String str, String str2) {
            this.f77445a = i;
            this.f77446b = str;
            this.f77447c = str2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C32844f.C32845a.m67422a(0, this.f77445a, 0, "");
            C32404v.m66766a(0, this.f77446b, this.f77445a, "text", (String) null, this.f77447c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$br */
    public static final class C32474br<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ String f77459a;

        /* renamed from: b */
        final /* synthetic */ int f77460b;

        static {
            Covode.recordClassIndex(39242);
        }

        C32474br(String str, int i) {
            this.f77459a = str;
            this.f77460b = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            C32405w wVar = (C32405w) th;
            C32404v.m66766a(wVar.getErrorCode(), this.f77459a, this.f77460b, "mail", wVar.getErrorMsg(), (String) null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$bu */
    static final class C32478bu<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ int f77470a;

        /* renamed from: b */
        final /* synthetic */ String f77471b;

        /* renamed from: c */
        final /* synthetic */ String f77472c;

        static {
            Covode.recordClassIndex(39246);
        }

        C32478bu(int i, String str, String str2) {
            this.f77470a = i;
            this.f77471b = str;
            this.f77472c = str2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C32844f.C32845a.m67422a(0, this.f77470a, 0, "");
            C32404v.m66766a(0, this.f77471b, this.f77470a, "text", (String) null, this.f77472c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$by */
    public static final class C32483by<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ int f77493a;

        /* renamed from: b */
        final /* synthetic */ String f77494b;

        /* renamed from: c */
        final /* synthetic */ String f77495c;

        /* renamed from: d */
        final /* synthetic */ String f77496d;

        static {
            Covode.recordClassIndex(39251);
        }

        C32483by(int i, String str, String str2, String str3) {
            this.f77493a = i;
            this.f77494b = str;
            this.f77495c = str2;
            this.f77496d = str3;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C32844f.C32845a.m67423a(0, this.f77493a, 0, "", this.f77494b);
            C32404v.m66766a(0, this.f77495c, this.f77493a, "text", (String) null, this.f77496d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$cb */
    static final class C32488cb<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ int f77513a;

        /* renamed from: b */
        final /* synthetic */ String f77514b;

        /* renamed from: c */
        final /* synthetic */ String f77515c;

        static {
            Covode.recordClassIndex(39256);
        }

        C32488cb(int i, String str, String str2) {
            this.f77513a = i;
            this.f77514b = str;
            this.f77515c = str2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C32844f.C32845a.m67423a(0, this.f77513a, 0, "", this.f77514b);
            C32404v.m66766a(0, this.f77515c, this.f77513a, "text", (String) null, (String) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$ch */
    public static final class C32496ch<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ int f77546a;

        /* renamed from: b */
        final /* synthetic */ String f77547b;

        /* renamed from: c */
        final /* synthetic */ String f77548c;

        static {
            Covode.recordClassIndex(39264);
        }

        C32496ch(int i, String str, String str2) {
            this.f77546a = i;
            this.f77547b = str;
            this.f77548c = str2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C32844f.C32845a.m67424b(0, this.f77546a, 0, "");
            C32404v.m66766a(0, this.f77547b, this.f77546a, "whatsapp", (String) null, this.f77548c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$cu */
    public static final class C32514cu<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77584a;

        static {
            Covode.recordClassIndex(39282);
        }

        public C32514cu(AbstractC32572b bVar) {
            this.f77584a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String w = this.f77584a.mo58466w();
            C89219l.m154716b(w, "");
            String x = this.f77584a.mo58467x();
            C89219l.m154716b(x, "");
            C32404v.m66782b(true, "mobile", w, x);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$cv */
    public static final class C32515cv<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77585a;

        static {
            Covode.recordClassIndex(39283);
        }

        public C32515cv(AbstractC32572b bVar) {
            this.f77585a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String w = this.f77585a.mo58466w();
            C89219l.m154716b(w, "");
            String x = this.f77585a.mo58467x();
            C89219l.m154716b(x, "");
            C32404v.m66782b(false, "mobile", w, x);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$i */
    public static final class C32530i<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77629a;

        static {
            Covode.recordClassIndex(39298);
        }

        public C32530i(AbstractC32572b bVar) {
            this.f77629a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C32838c.C32839a.m67408b(0, "changePhone", 0, "");
            C31588c.m65887a(this.f77629a.mo58466w(), "rebind_phone_click", "phone", 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$l */
    public static final class C32534l<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77636a;

        static {
            Covode.recordClassIndex(39302);
        }

        public C32534l(AbstractC32572b bVar) {
            this.f77636a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String w = this.f77636a.mo58466w();
            C89219l.m154716b(w, "");
            String x = this.f77636a.mo58467x();
            C89219l.m154716b(x, "");
            C32404v.m66779a(true, "email", w, x);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$m */
    public static final class C32535m<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77637a;

        static {
            Covode.recordClassIndex(39303);
        }

        public C32535m(AbstractC32572b bVar) {
            this.f77637a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String w = this.f77637a.mo58466w();
            C89219l.m154716b(w, "");
            String x = this.f77637a.mo58467x();
            C89219l.m154716b(x, "");
            C32404v.m66779a(false, "email", w, x);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$o */
    public static final class C32538o<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77643a;

        static {
            Covode.recordClassIndex(39306);
        }

        public C32538o(AbstractC32572b bVar) {
            this.f77643a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String w = this.f77643a.mo58466w();
            C89219l.m154716b(w, "");
            String x = this.f77643a.mo58467x();
            C89219l.m154716b(x, "");
            C32404v.m66779a(true, "phone", w, x);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$p */
    public static final class C32539p<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77644a;

        static {
            Covode.recordClassIndex(39307);
        }

        public C32539p(AbstractC32572b bVar) {
            this.f77644a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String w = this.f77644a.mo58466w();
            C89219l.m154716b(w, "");
            String x = this.f77644a.mo58467x();
            C89219l.m154716b(x, "");
            C32404v.m66779a(false, "phone", w, x);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$s */
    static final class C32543s<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f77653a;

        /* renamed from: b */
        final /* synthetic */ AbstractC32572b f77654b;

        static {
            Covode.recordClassIndex(39311);
        }

        C32543s(AbstractC89172b bVar, AbstractC32572b bVar2) {
            this.f77653a = bVar;
            this.f77654b = bVar2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (obj instanceof C32405w) {
                AbstractC89172b bVar = this.f77653a;
                if (bVar != null) {
                    bVar.invoke(obj);
                }
                C32404v.m66776a(false, this.f77654b);
            }
        }
    }

    /* renamed from: a */
    private static int m66784a(EnumC32592i iVar) {
        int i = C32554y.f77681b[iVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2 || i == 3 || i == 4 || i == 5) {
            return 1;
        }
        return -1;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$al */
    public static final class C32425al<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77310a;

        /* renamed from: b */
        final /* synthetic */ Map f77311b = null;

        /* renamed from: c */
        final /* synthetic */ String f77312c;

        /* renamed from: d */
        final /* synthetic */ String f77313d;

        /* renamed from: e */
        final /* synthetic */ int f77314e;

        /* renamed from: f */
        final /* synthetic */ int f77315f;

        static {
            Covode.recordClassIndex(39193);
        }

        public C32425al(AbstractC32572b bVar, String str, String str2) {
            this.f77310a = bVar;
            this.f77312c = str;
            this.f77313d = str2;
            this.f77314e = 1;
            this.f77315f = 3;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$al$a */
        public static final class C32426a extends AbstractC22346c<C22292e> {

            /* renamed from: c */
            final /* synthetic */ C32425al f77316c;

            /* renamed from: d */
            final /* synthetic */ AbstractC88974o f77317d;

            static {
                Covode.recordClassIndex(39194);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
            /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: f.a.o */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: e */
            public final /* synthetic */ void mo36686e(C22292e eVar) {
                C22292e eVar2 = eVar;
                C89219l.m154721d(eVar2, "");
                if (eVar2.f52724j == null) {
                    this.f77317d.mo143050a((Throwable) new C32405w(-1, "no data", this.f77316c.f77310a.mo58458A(), this.f77316c.f77310a.mo58460Z_(), null, null, 32, null));
                } else {
                    this.f77317d.mo143049a(eVar2);
                }
            }

            C32426a(C32425al alVar, AbstractC88974o oVar) {
                this.f77316c = alVar;
                this.f77317d = oVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
            /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
                if (r6 == null) goto L_0x000e;
             */
            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ void mo36681a(com.bytedance.sdk.p1625a.p1626a.p1627a.C22292e r12, int r13) {
                /*
                    r11 = this;
                    com.bytedance.sdk.a.a.a.e r12 = (com.bytedance.sdk.p1625a.p1626a.p1627a.C22292e) r12
                    f.a.o r2 = r11.f77317d
                    com.ss.android.ugc.aweme.account.login.v2.a.w r4 = new com.ss.android.ugc.aweme.account.login.v2.a.w
                    if (r12 == 0) goto L_0x005c
                    int r5 = r12.f52715d
                    java.lang.String r6 = r12.f52717f
                    if (r6 != 0) goto L_0x0010
                L_0x000e:
                    java.lang.String r6 = ""
                L_0x0010:
                    com.ss.android.ugc.aweme.account.login.v2.a.x$al r0 = r11.f77316c
                    com.ss.android.ugc.aweme.account.login.v2.base.b r0 = r0.f77310a
                    com.ss.android.ugc.aweme.account.login.v2.base.i r7 = r0.mo58458A()
                    com.ss.android.ugc.aweme.account.login.v2.a.x$al r0 = r11.f77316c
                    com.ss.android.ugc.aweme.account.login.v2.base.b r0 = r0.f77310a
                    com.ss.android.ugc.aweme.account.login.v2.base.j r8 = r0.mo58460Z_()
                    if (r12 == 0) goto L_0x002e
                    org.json.JSONObject r1 = r12.f52719h
                    if (r1 == 0) goto L_0x002e
                    java.lang.String r0 = "data"
                    org.json.JSONObject r9 = r1.getJSONObject(r0)
                    if (r9 != 0) goto L_0x0033
                L_0x002e:
                    org.json.JSONObject r9 = new org.json.JSONObject
                    r9.<init>()
                L_0x0033:
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    r3 = 0
                    if (r12 == 0) goto L_0x005a
                    java.lang.String r0 = r12.f52717f
                L_0x003d:
                    java.lang.StringBuilder r1 = r1.append(r0)
                    r0 = 124(0x7c, float:1.74E-43)
                    java.lang.StringBuilder r0 = r1.append(r0)
                    if (r12 == 0) goto L_0x004b
                    java.lang.String r3 = r12.f52718g
                L_0x004b:
                    java.lang.StringBuilder r0 = r0.append(r3)
                    java.lang.String r10 = r0.toString()
                    r4.<init>(r5, r6, r7, r8, r9, r10)
                    r2.mo143050a(r4)
                    return
                L_0x005a:
                    r0 = r3
                    goto L_0x003d
                L_0x005c:
                    r0 = -10000(0xffffffffffffd8f0, float:NaN)
                    r5 = -10000(0xffffffffffffd8f0, float:NaN)
                    goto L_0x000e
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x.C32425al.C32426a.mo36681a(com.bytedance.sdk.a.a.a.b, int):void");
            }
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<C22292e> oVar) {
            Map<String, String> linkedHashMap;
            C89219l.m154721d(oVar, "");
            C32404v.m66770a((Boolean) true, "email", (AbstractC32584f) this.f77310a, false, (Map) null, false, 56);
            C32426a aVar = new C32426a(this, oVar);
            Map map = this.f77311b;
            if (map != null) {
                linkedHashMap = C89041ag.m154431d(map);
            } else {
                linkedHashMap = new LinkedHashMap<>();
            }
            linkedHashMap.put("rules_version", "v2");
            linkedHashMap.putAll(C31566h.m65850b());
            if (C33047p.m67683a()) {
                linkedHashMap.putAll(C33047p.m67684b());
            }
            this.f77310a.mo58464b(aVar);
            this.f77310a.mo58469z().mo36660b(this.f77312c, this.f77313d, this.f77314e, this.f77315f, linkedHashMap, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$ao */
    public static final class C32429ao<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77320a;

        /* renamed from: b */
        final /* synthetic */ Map f77321b;

        /* renamed from: c */
        final /* synthetic */ String f77322c;

        /* renamed from: d */
        final /* synthetic */ String f77323d;

        /* renamed from: e */
        final /* synthetic */ String f77324e;

        /* renamed from: f */
        final /* synthetic */ String f77325f;

        static {
            Covode.recordClassIndex(39197);
        }

        C32429ao(AbstractC32572b bVar, Map map, String str, String str2, String str3, String str4) {
            this.f77320a = bVar;
            this.f77321b = map;
            this.f77322c = str;
            this.f77323d = str2;
            this.f77324e = str3;
            this.f77325f = str4;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$ao$a */
        public static final class C32430a extends AbstractC32402t {

            /* renamed from: c */
            final /* synthetic */ C32429ao f77326c;

            /* renamed from: d */
            final /* synthetic */ AbstractC88974o f77327d;

            static {
                Covode.recordClassIndex(39198);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo36686e(C32403u uVar) {
                int i;
                if (uVar == null || uVar.f77256p == null) {
                    AbstractC88974o oVar = this.f77327d;
                    if (uVar != null) {
                        i = uVar.f52715d;
                    } else {
                        i = -1;
                    }
                    oVar.mo143050a((Throwable) new C32405w(i, "no data", EnumC32592i.LOGIN, EnumC32594j.CHANGE_PASSWORD, null, "no data"));
                    return;
                }
                this.f77327d.mo143049a(uVar);
            }

            C32430a(C32429ao aoVar, AbstractC88974o oVar) {
                this.f77326c = aoVar;
                this.f77327d = oVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo36712a(C32403u uVar, int i) {
                if (uVar == null) {
                    this.f77327d.mo143050a((Throwable) C32405w.C32406a.m66783a(this.f77326c.f77320a.mo58458A(), this.f77326c.f77320a.mo58460Z_()));
                } else {
                    this.f77327d.mo143050a((Throwable) new C32405w(i, uVar.f52717f, this.f77326c.f77320a.mo58458A(), this.f77326c.f77320a.mo58460Z_(), uVar.f52719h, null, 32, null));
                }
            }
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<C32403u> oVar) {
            String str;
            String str2;
            C89219l.m154721d(oVar, "");
            C32430a aVar = new C32430a(this, oVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("rules_version", "v2");
            Map map = this.f77321b;
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            this.f77320a.mo58464b(aVar);
            Context context = this.f77320a.getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            String str3 = this.f77322c;
            String str4 = this.f77323d;
            String str5 = this.f77324e;
            String str6 = this.f77325f;
            C89219l.m154721d(str3, "");
            C89219l.m154721d(str4, "");
            C89219l.m154721d(str5, "");
            C89219l.m154721d(str6, "");
            C32399s.C32401b bVar = new C32399s.C32401b(str4, str5, str6);
            C22355a.C22356a aVar2 = new C22355a.C22356a();
            if (C89219l.m154714a((Object) str3, (Object) "email")) {
                str = "/passport/password/forced_reset_by_email_ticket/";
            } else {
                str = "/passport/password/forced_reset_by_mobile_ticket/";
            }
            aVar2.f52826a = str;
            boolean z = !C89219l.m154714a((Object) str3, (Object) "email");
            HashMap hashMap = new HashMap();
            hashMap.put("conditional_login_ticket", C13627m.m24501c(bVar.f77249b));
            hashMap.put("password", C13627m.m24501c(bVar.f77248a));
            if (z) {
                str2 = C13627m.m24501c(bVar.f77250c);
            } else {
                str2 = bVar.f77250c;
            }
            hashMap.put("ticket", str2);
            hashMap.put("mix_mode", "1");
            hashMap.putAll(linkedHashMap);
            C32399s sVar = new C32399s(context, aVar2.mo36707a(hashMap).mo36710c(), bVar, aVar);
            sVar.f77244e = !C89219l.m154714a((Object) str3, (Object) "email");
            sVar.mo36736d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$v */
    static final class C32547v<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77662a;

        /* renamed from: b */
        final /* synthetic */ String f77663b;

        /* renamed from: c */
        final /* synthetic */ Map f77664c = null;

        /* renamed from: d */
        final /* synthetic */ String f77665d;

        static {
            Covode.recordClassIndex(39315);
        }

        C32547v(AbstractC32572b bVar, String str, String str2) {
            this.f77662a = bVar;
            this.f77663b = str;
            this.f77665d = str2;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$v$a */
        public static final class C32548a extends AbstractC22296b {

            /* renamed from: c */
            final /* synthetic */ C32547v f77666c;

            /* renamed from: d */
            final /* synthetic */ AbstractC88974o f77667d;

            static {
                Covode.recordClassIndex(39316);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
            /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: f.a.o */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: e */
            public final /* synthetic */ void mo36686e(C22315b bVar) {
                int i;
                C22315b bVar2 = bVar;
                if (bVar2 == null || !bVar2.f52713b) {
                    AbstractC88974o oVar = this.f77667d;
                    if (bVar2 != null) {
                        i = bVar2.f52715d;
                    } else {
                        i = -1;
                    }
                    oVar.mo143050a((Throwable) new C32405w(i, "no data", EnumC32592i.SET_OR_RESET_PASSWORD, EnumC32594j.CHANGE_PASSWORD, null, "no data"));
                    return;
                }
                this.f77667d.mo143049a(bVar2);
            }

            C32548a(C32547v vVar, AbstractC88974o oVar) {
                this.f77666c = vVar;
                this.f77667d = oVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36681a(C22315b bVar, int i) {
                C22315b bVar2 = bVar;
                if (bVar2 == null) {
                    this.f77667d.mo143050a((Throwable) C32405w.C32406a.m66783a(this.f77666c.f77662a.mo58458A(), this.f77666c.f77662a.mo58460Z_()));
                } else {
                    this.f77667d.mo143050a((Throwable) new C32405w(i, bVar2.f52717f, this.f77666c.f77662a.mo58458A(), this.f77666c.f77662a.mo58460Z_(), bVar2.f52719h, null, 32, null));
                }
            }
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<C22315b> oVar) {
            C89219l.m154721d(oVar, "");
            C32548a aVar = new C32548a(this, oVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("rules_version", "v2");
            linkedHashMap.put("conditional_login_ticket", this.f77663b);
            Map map = this.f77664c;
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            this.f77662a.mo58464b(aVar);
            this.f77662a.mo58469z().mo36655a(this.f77665d, (Map<String, String>) linkedHashMap, (AbstractC22296b) aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$ad */
    static final class C32414ad<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ String f77282a;

        /* renamed from: b */
        final /* synthetic */ AbstractC32572b f77283b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f77284c;

        static {
            Covode.recordClassIndex(39182);
        }

        C32414ad(String str, AbstractC32572b bVar, AbstractC89172b bVar2) {
            this.f77282a = str;
            this.f77283b = bVar;
            this.f77284c = bVar2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            C32405w wVar = (C32405w) th;
            int errorCode = wVar.getErrorCode();
            String str = this.f77282a;
            String x = this.f77283b.mo58467x();
            C89219l.m154716b(x, "");
            C32404v.m66767a(errorCode, str, x);
            AbstractC89172b bVar = this.f77284c;
            if (bVar != null) {
                bVar.invoke(wVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$af */
    public static final class C32417af<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77292a;

        static {
            Covode.recordClassIndex(39185);
        }

        public C32417af(AbstractC32572b bVar) {
            this.f77292a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String w = this.f77292a.mo58466w();
            C89219l.m154716b(w, "");
            String x = this.f77292a.mo58467x();
            C89219l.m154716b(x, "");
            C32404v.m66781b(0, w, x);
            AbstractC32572b bVar = this.f77292a;
            EnumC32592i iVar = EnumC32592i.LOGIN;
            EnumC32594j Z_ = this.f77292a.mo58460Z_();
            T t = ((C22291d) obj).f52723j;
            C89219l.m154716b(t, "");
            C32334a.m66709a(bVar, iVar, Z_, ((C32396q) t).f77235b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$ag */
    public static final class C32418ag<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77293a;

        static {
            Covode.recordClassIndex(39186);
        }

        public C32418ag(AbstractC32572b bVar) {
            this.f77293a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            int errorCode = ((C32405w) th).getErrorCode();
            String w = this.f77293a.mo58466w();
            C89219l.m154716b(w, "");
            String x = this.f77293a.mo58467x();
            C89219l.m154716b(x, "");
            C32404v.m66781b(errorCode, w, x);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$aj */
    public static final class C32422aj<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77301a;

        static {
            Covode.recordClassIndex(39190);
        }

        public C32422aj(AbstractC32572b bVar) {
            this.f77301a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            String x = this.f77301a.mo58467x();
            C89219l.m154716b(x, "");
            C32405w wVar = (C32405w) th;
            C32404v.m66780a(false, "email", "register", x, wVar.getErrorCode());
            C32404v.m66775a(true, wVar.getErrorCode(), "email", (AbstractC32584f) this.f77301a, (Map) null, false, 48);
            C32840d.C32841a.m67412a(1, wVar.getErrorCode(), wVar.getDetailErrorMsg());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$am */
    public static final class C32427am<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77318a;

        static {
            Covode.recordClassIndex(39195);
        }

        public C32427am(AbstractC32572b bVar) {
            this.f77318a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C22292e eVar = (C22292e) obj;
            String x = this.f77318a.mo58467x();
            C89219l.m154716b(x, "");
            C32404v.m66779a(true, "email", "register", x);
            C32404v.m66778a(true, "email", (AbstractC32584f) this.f77318a, eVar.f52724j, (Map) null, false, 48);
            AbstractC32572b bVar = this.f77318a;
            EnumC32592i iVar = EnumC32592i.SIGN_UP;
            EnumC32594j Z_ = this.f77318a.mo58460Z_();
            C22507a aVar = eVar.f52724j;
            C89219l.m154716b(aVar, "");
            C32334a.m66709a(bVar, iVar, Z_, aVar);
            if (C33047p.m67683a()) {
                C33047p.f78597a = null;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$an */
    public static final class C32428an<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77319a;

        static {
            Covode.recordClassIndex(39196);
        }

        public C32428an(AbstractC32572b bVar) {
            this.f77319a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            String x = this.f77319a.mo58467x();
            C89219l.m154716b(x, "");
            C32405w wVar = (C32405w) th;
            C32404v.m66780a(false, "email", "register", x, wVar.getErrorCode());
            C32404v.m66775a(true, wVar.getErrorCode(), "email", (AbstractC32584f) this.f77319a, (Map) null, false, 48);
            C32840d.C32841a.m67412a(1, wVar.getErrorCode(), wVar.getDetailErrorMsg());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$aw */
    static final class C32445aw<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77374a;

        /* renamed from: b */
        final /* synthetic */ String f77375b;

        static {
            Covode.recordClassIndex(39213);
        }

        C32445aw(AbstractC32572b bVar, String str) {
            this.f77374a = bVar;
            this.f77375b = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C22291d dVar = (C22291d) obj;
            AbstractC32572b bVar = this.f77374a;
            EnumC32592i iVar = EnumC32592i.LOGIN;
            EnumC32594j Z_ = this.f77374a.mo58460Z_();
            C22507a aVar = ((C22420o) dVar.f52723j).f53055u;
            C89219l.m154716b(aVar, "");
            C32334a.m66709a(bVar, iVar, Z_, aVar);
            C32404v.m66778a(false, this.f77375b, (AbstractC32584f) this.f77374a, ((C22420o) dVar.f52723j).f53055u, (Map) null, false, 48);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$ax */
    static final class C32446ax<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ String f77376a;

        /* renamed from: b */
        final /* synthetic */ AbstractC32572b f77377b;

        static {
            Covode.recordClassIndex(39214);
        }

        C32446ax(String str, AbstractC32572b bVar) {
            this.f77376a = str;
            this.f77377b = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            C32405w wVar = (C32405w) th;
            if (C89219l.m154714a((Object) this.f77376a, (Object) "phone")) {
                C32840d.C32841a.m67414a(false, wVar.getErrorCode(), wVar.getDetailErrorMsg());
            } else {
                C32840d.C32841a.m67412a(1, wVar.getErrorCode(), wVar.getDetailErrorMsg());
            }
            C32404v.m66775a(false, wVar.getErrorCode(), this.f77376a, (AbstractC32584f) this.f77377b, (Map) null, false, 48);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$az */
    static final class C32449az<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ boolean f77386a;

        /* renamed from: b */
        final /* synthetic */ AbstractC32572b f77387b;

        static {
            Covode.recordClassIndex(39217);
        }

        C32449az(boolean z, AbstractC32572b bVar) {
            this.f77386a = z;
            this.f77387b = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            C32405w wVar = (C32405w) th;
            C32404v.m66775a(this.f77386a, wVar.getErrorCode(), "sms_verification", (AbstractC32584f) this.f77387b, (Map) null, false, 48);
            C32840d.C32841a.m67417b(false, wVar.getErrorCode(), wVar.getDetailErrorMsg());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$ba */
    static final class C32451ba<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ boolean f77389a;

        /* renamed from: b */
        final /* synthetic */ AbstractC32572b f77390b;

        static {
            Covode.recordClassIndex(39219);
        }

        C32451ba(boolean z, AbstractC32572b bVar) {
            this.f77389a = z;
            this.f77390b = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C22291d dVar = (C22291d) obj;
            C32404v.m66778a(this.f77389a, "sms_verification", (AbstractC32584f) this.f77390b, ((C22416k) dVar.f52723j).f53021d, (Map) null, false, 48);
            AbstractC32572b bVar = this.f77390b;
            EnumC32592i iVar = EnumC32592i.SIGN_UP;
            EnumC32594j Z_ = this.f77390b.mo58460Z_();
            C22507a aVar = ((C22416k) dVar.f52723j).f53021d;
            C89219l.m154716b(aVar, "");
            C32334a.m66709a(bVar, iVar, Z_, aVar);
            if (C33047p.m67683a()) {
                C33047p.f78597a = null;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$bd */
    public static final class C32455bd<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ boolean f77401a;

        /* renamed from: b */
        final /* synthetic */ boolean f77402b;

        /* renamed from: c */
        final /* synthetic */ AbstractC32572b f77403c;

        static {
            Covode.recordClassIndex(39223);
        }

        public C32455bd(boolean z, boolean z2, AbstractC32572b bVar) {
            this.f77401a = z;
            this.f77402b = z2;
            this.f77403c = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            C32405w wVar = (C32405w) th;
            if (!this.f77401a || wVar.getErrorCode() != 1011) {
                C32840d.C32841a.m67417b(false, wVar.getErrorCode(), wVar.getDetailErrorMsg());
                boolean z = this.f77401a;
                int errorCode = wVar.getErrorCode();
                if (this.f77402b) {
                    str = "whatsapp";
                } else {
                    str = "sms_verification";
                }
                C32404v.m66775a(z, errorCode, str, (AbstractC32584f) this.f77403c, (Map) null, false, 48);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$bf */
    public static final class C32458bf<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77411a;

        static {
            Covode.recordClassIndex(39226);
        }

        public C32458bf(AbstractC32572b bVar) {
            this.f77411a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C22418m mVar = (C22418m) obj;
            AbstractC32572b bVar = this.f77411a;
            EnumC32592i iVar = EnumC32592i.LOGIN;
            EnumC32594j Z_ = this.f77411a.mo58460Z_();
            C22507a aVar = mVar.f53031e;
            C89219l.m154716b(aVar, "");
            C32334a.m66709a(bVar, iVar, Z_, aVar);
            C32404v.m66778a(false, "sms_verification", (AbstractC32584f) this.f77411a, mVar.f53031e, (Map) null, false, 48);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$bm */
    public static final class C32467bm<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77431a;

        /* renamed from: b */
        final /* synthetic */ boolean f77432b;

        static {
            Covode.recordClassIndex(39235);
        }

        public C32467bm(AbstractC32572b bVar, boolean z) {
            this.f77431a = bVar;
            this.f77432b = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th instanceof C32405w) {
                C32405w wVar = (C32405w) th;
                C32404v.m66775a(false, wVar.getErrorCode(), "sms_verification", (AbstractC32584f) this.f77431a, (Map) null, this.f77432b, 16);
                if (this.f77431a.mo58460Z_() == EnumC32594j.RESET_PASSWORD_FOR_PHONE) {
                    C36085cj.m73540a(8, 3, (Object) wVar.getErrorMsg());
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$bp */
    static final class C32471bp<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ int f77448a;

        /* renamed from: b */
        final /* synthetic */ String f77449b;

        /* renamed from: c */
        final /* synthetic */ String f77450c;

        static {
            Covode.recordClassIndex(39239);
        }

        C32471bp(int i, String str, String str2) {
            this.f77448a = i;
            this.f77449b = str;
            this.f77450c = str2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            C32405w wVar = (C32405w) th;
            C32844f.C32845a.m67422a(1, this.f77448a, wVar.getErrorCode(), wVar.getErrorMsg());
            C32404v.m66766a(wVar.getErrorCode(), this.f77449b, this.f77448a, "text", wVar.getErrorMsg(), this.f77450c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$bv */
    static final class C32479bv<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ int f77473a;

        /* renamed from: b */
        final /* synthetic */ String f77474b;

        /* renamed from: c */
        final /* synthetic */ String f77475c;

        static {
            Covode.recordClassIndex(39247);
        }

        C32479bv(int i, String str, String str2) {
            this.f77473a = i;
            this.f77474b = str;
            this.f77475c = str2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            C32405w wVar = (C32405w) th;
            C32844f.C32845a.m67422a(1, this.f77473a, wVar.getErrorCode(), wVar.getMessage());
            C32404v.m66766a(wVar.getErrorCode(), this.f77474b, this.f77473a, "text", wVar.getErrorMsg(), this.f77475c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$c */
    public static final class C32486c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77507a;

        static {
            Covode.recordClassIndex(39254);
        }

        public C32486c(AbstractC32572b bVar) {
            this.f77507a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            C32405w wVar = (C32405w) th;
            C31588c.m65886a(this.f77507a.mo58466w(), "email", wVar.getErrorCode(), wVar.getErrorMsg(), null);
            C31588c.m65887a(this.f77507a.mo58466w(), this.f77507a.mo58467x(), "email", wVar.getErrorCode());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$cd */
    static final class C32491cd<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ int f77524a;

        /* renamed from: b */
        final /* synthetic */ String f77525b;

        /* renamed from: c */
        final /* synthetic */ String f77526c;

        static {
            Covode.recordClassIndex(39259);
        }

        C32491cd(int i, String str, String str2) {
            this.f77524a = i;
            this.f77525b = str;
            this.f77526c = str2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            C32405w wVar = (C32405w) th;
            C32844f.C32845a.m67422a(1, this.f77524a, wVar.getErrorCode(), wVar.getMessage());
            C32404v.m66766a(wVar.getErrorCode(), this.f77525b, this.f77524a, "voice", wVar.getErrorMsg(), this.f77526c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$ci */
    public static final class C32497ci<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77549a;

        /* renamed from: b */
        final /* synthetic */ String f77550b;

        static {
            Covode.recordClassIndex(39265);
        }

        C32497ci(AbstractC32572b bVar, String str) {
            this.f77549a = bVar;
            this.f77550b = str;
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<C22291d<C22449l.C22450a>> oVar) {
            C89219l.m154721d(oVar, "");
            C32498a aVar = new C32498a(this, oVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("rules_version", "v2");
            this.f77549a.mo58464b(aVar);
            this.f77549a.mo58469z().mo36657a(this.f77550b, (Map<String, String>) linkedHashMap, (AbstractC22435m) aVar);
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$ci$a */
        public static final class C32498a extends AbstractC22435m {

            /* renamed from: c */
            final /* synthetic */ C32497ci f77551c;

            /* renamed from: d */
            final /* synthetic */ AbstractC88974o f77552d;

            static {
                Covode.recordClassIndex(39266);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
            /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: f.a.o */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.sdk.p1625a.p1626a.p1627a.AbstractC22288a
            /* renamed from: a */
            public final /* synthetic */ void mo36605a(C22291d<C22449l.C22450a> dVar) {
                C22291d<C22449l.C22450a> dVar2 = dVar;
                if (dVar2 == null) {
                    this.f77552d.mo143050a((Throwable) new C32405w(-1, "no data", EnumC32592i.SIGN_UP, this.f77551c.f77549a.mo58460Z_(), null, null, 32, null));
                } else if (dVar2.f52715d != 0) {
                    this.f77552d.mo143050a((Throwable) new C32405w(dVar2.f52715d, dVar2.f52717f, EnumC32592i.SIGN_UP, this.f77551c.f77549a.mo58460Z_(), null, null, 32, null));
                } else {
                    this.f77552d.mo143049a(dVar2);
                }
            }

            C32498a(C32497ci ciVar, AbstractC88974o oVar) {
                this.f77551c = ciVar;
                this.f77552d = oVar;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$cj */
    public static final class C32499cj<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77553a;

        /* renamed from: b */
        final /* synthetic */ String f77554b;

        static {
            Covode.recordClassIndex(39267);
        }

        C32499cj(AbstractC32572b bVar, String str) {
            this.f77553a = bVar;
            this.f77554b = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C32853e.m67449a(C31940a.m66306a(C32582d.m67066b(this.f77553a)), this.f77554b, "phone", this.f77553a, 0, "register");
            String w = this.f77553a.mo58466w();
            C89219l.m154716b(w, "");
            String x = this.f77553a.mo58467x();
            C89219l.m154716b(x, "");
            C32404v.m66779a(true, "phone", w, x);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$ck */
    public static final class C32500ck<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77555a;

        static {
            Covode.recordClassIndex(39268);
        }

        C32500ck(AbstractC32572b bVar) {
            this.f77555a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            String w = this.f77555a.mo58466w();
            C89219l.m154716b(w, "");
            String x = this.f77555a.mo58467x();
            C89219l.m154716b(x, "");
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            C32404v.m66780a(false, "phone", w, x, ((C32405w) th).getErrorCode());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$cn */
    public static final class C32504cn<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77564a;

        /* renamed from: b */
        final /* synthetic */ boolean f77565b;

        static {
            Covode.recordClassIndex(39272);
        }

        public C32504cn(AbstractC32572b bVar, boolean z) {
            this.f77564a = bVar;
            this.f77565b = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            C32405w wVar = (C32405w) th;
            String x = this.f77564a.mo58467x();
            C89219l.m154716b(x, "");
            C32404v.m66780a(false, "email", "reset_password", x, wVar.getErrorCode());
            C32404v.m66775a(false, wVar.getErrorCode(), "email", (AbstractC32584f) this.f77564a, (Map) null, this.f77565b, 16);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$co */
    public static final class C32505co<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77566a;

        /* renamed from: b */
        final /* synthetic */ String f77567b;

        /* renamed from: c */
        final /* synthetic */ String f77568c;

        static {
            Covode.recordClassIndex(39273);
        }

        public C32505co(AbstractC32572b bVar, String str, String str2) {
            this.f77566a = bVar;
            this.f77567b = str;
            this.f77568c = str2;
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<C22326m> oVar) {
            C89219l.m154721d(oVar, "");
            C32506a aVar = new C32506a(this, oVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("rules_version", "v2");
            this.f77566a.mo58464b(aVar);
            this.f77566a.mo58469z().mo36650a(this.f77567b, this.f77568c, linkedHashMap, aVar);
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$co$a */
        public static final class C32506a extends AbstractC22303i {

            /* renamed from: c */
            final /* synthetic */ C32505co f77569c;

            /* renamed from: d */
            final /* synthetic */ AbstractC88974o f77570d;

            static {
                Covode.recordClassIndex(39274);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: e */
            public final /* synthetic */ void mo36686e(C22326m mVar) {
                AbstractC32572b bVar = this.f77569c.f77566a;
                C89219l.m154721d(bVar, "");
                new C79459a(C31291a.f74991a).mo123052a(C31291a.f74991a.getString(R.string.d8s)).mo123053a();
                ActivityC0945e activity = bVar.getActivity();
                if (activity != null) {
                    Bundle arguments = bVar.getArguments();
                    if (arguments == null) {
                        arguments = new Bundle();
                    }
                    arguments.putInt("next_page", EnumC32594j.FINISH.getValue());
                    C89219l.m154716b(arguments, "");
                    ((ActionResultModel) C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(ActionResultModel.class)).f77690a.postValue(arguments);
                }
            }

            C32506a(C32505co coVar, AbstractC88974o oVar) {
                this.f77569c = coVar;
                this.f77570d = oVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
            @Override // com.bytedance.sdk.p1625a.AbstractC22346c
            /* renamed from: a */
            public final /* synthetic */ void mo36681a(C22326m mVar, int i) {
                C22326m mVar2 = mVar;
                if (mVar2 == null) {
                    this.f77570d.mo143050a((Throwable) C32405w.C32406a.m66783a(this.f77569c.f77566a.mo58458A(), this.f77569c.f77566a.mo58460Z_()));
                } else {
                    this.f77570d.mo143050a((Throwable) new C32405w(i, mVar2.f52717f, this.f77569c.f77566a.mo58458A(), this.f77569c.f77566a.mo58460Z_(), mVar2.f52719h, null, 32, null));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$cy */
    public static final class C32520cy<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77599a;

        static {
            Covode.recordClassIndex(39288);
        }

        public C32520cy(AbstractC32572b bVar) {
            this.f77599a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C32840d.C32841a.m67412a(0, 0, "");
            String x = this.f77599a.mo58467x();
            C89219l.m154716b(x, "");
            C32404v.m66767a(0, "register", x);
            C32404v.m66778a(true, "email", (AbstractC32584f) this.f77599a, ((C22411f) obj).f52995f, (Map) null, false, 48);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$cz */
    public static final class C32521cz<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77600a;

        static {
            Covode.recordClassIndex(39289);
        }

        public C32521cz(AbstractC32572b bVar) {
            this.f77600a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            C32405w wVar = (C32405w) th;
            C32840d.C32841a.m67412a(1, wVar.getErrorCode(), wVar.getErrorMsg());
            int errorCode = wVar.getErrorCode();
            String x = this.f77600a.mo58467x();
            C89219l.m154716b(x, "");
            C32404v.m66767a(errorCode, "register", x);
            C32404v.m66775a(true, wVar.getErrorCode(), "email", (AbstractC32584f) this.f77600a, (Map) null, false, 48);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$e */
    public static final class C32524e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77609a;

        /* renamed from: b */
        final /* synthetic */ String f77610b;

        static {
            Covode.recordClassIndex(39292);
        }

        public C32524e(AbstractC32572b bVar, String str) {
            this.f77609a = bVar;
            this.f77610b = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C32838c.C32839a.m67407a(0, "bindPhone", 0, "");
            C31588c.m65886a(this.f77609a.mo58466w(), "mobile", 0, null, this.f77610b);
            C31588c.m65887a(this.f77609a.mo58466w(), this.f77609a.mo58467x(), "phone", 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$j */
    public static final class C32531j<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77630a;

        static {
            Covode.recordClassIndex(39299);
        }

        public C32531j(AbstractC32572b bVar) {
            this.f77630a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            C32405w wVar = (C32405w) th;
            C32838c.C32839a.m67408b(1, "changePhone", wVar.getErrorCode(), wVar.getErrorMsg());
            C31588c.m65887a(this.f77630a.mo58466w(), "rebind_phone_click", "phone", wVar.getErrorCode());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$u */
    public static final class C32546u<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77661a;

        static {
            Covode.recordClassIndex(39314);
        }

        public C32546u(AbstractC32572b bVar) {
            this.f77661a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            C32405w wVar = (C32405w) th;
            Integer valueOf = Integer.valueOf(wVar.getErrorCode());
            String x = this.f77661a.mo58467x();
            C89219l.m154716b(x, "");
            C32634g.C32635a.m67184a(valueOf, x);
            C32840d.C32841a.m67412a(1, wVar.getErrorCode(), "CheckEmail:" + wVar.getErrorMsg());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$ai */
    public static final class C32421ai<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77300a;

        static {
            Covode.recordClassIndex(39189);
        }

        public C32421ai(AbstractC32572b bVar) {
            this.f77300a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C22291d dVar = (C22291d) obj;
            String x = this.f77300a.mo58467x();
            C89219l.m154716b(x, "");
            C32404v.m66779a(true, "email", "register", x);
            C32404v.m66778a(true, "email", (AbstractC32584f) this.f77300a, ((C22410e) dVar.f52723j).f52989e, (Map) null, false, 48);
            AbstractC32572b bVar = this.f77300a;
            EnumC32592i iVar = EnumC32592i.SIGN_UP;
            EnumC32594j Z_ = this.f77300a.mo58460Z_();
            C22507a aVar = ((C22410e) dVar.f52723j).f52989e;
            C89219l.m154716b(aVar, "");
            C32334a.m66709a(bVar, iVar, Z_, aVar);
            if (C33047p.m67683a()) {
                C33047p.f78597a = null;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$aq */
    static final class C32433aq<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77335a;

        /* renamed from: b */
        final /* synthetic */ String f77336b;

        /* renamed from: c */
        final /* synthetic */ String f77337c;

        /* renamed from: d */
        final /* synthetic */ EnumC32592i f77338d;

        /* renamed from: e */
        final /* synthetic */ EnumC32594j f77339e;

        static {
            Covode.recordClassIndex(39201);
        }

        C32433aq(AbstractC32572b bVar, String str, String str2, EnumC32592i iVar, EnumC32594j jVar) {
            this.f77335a = bVar;
            this.f77336b = str;
            this.f77337c = str2;
            this.f77338d = iVar;
            this.f77339e = jVar;
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(final AbstractC88974o<C32007a> oVar) {
            C89219l.m154721d(oVar, "");
            Context context = this.f77335a.getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(context, "");
            String str = this.f77336b;
            String str2 = this.f77337c;
            C324341 r2 = new AbstractC32001a(this) {
                /* class com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x.C32433aq.C324341 */

                /* renamed from: c */
                final /* synthetic */ C32433aq f77340c;

                static {
                    Covode.recordClassIndex(39202);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
                @Override // com.bytedance.sdk.p1625a.AbstractC22346c
                /* renamed from: e */
                public final /* synthetic */ void mo36686e(C32007a aVar) {
                    if (aVar != null) {
                        oVar.mo143049a(aVar);
                    } else {
                        oVar.mo143050a((Throwable) new C32405w(-1, "no data", this.f77340c.f77338d, this.f77340c.f77339e, null, null, 32, null));
                    }
                }

                {
                    this.f77340c = r1;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
                @Override // com.bytedance.sdk.p1625a.AbstractC22346c
                /* renamed from: a */
                public final /* synthetic */ void mo36681a(C32007a aVar, int i) {
                    String str;
                    C32007a aVar2 = aVar;
                    AbstractC88974o oVar = oVar;
                    if (aVar2 != null) {
                        str = aVar2.f52717f;
                    } else {
                        str = null;
                    }
                    oVar.mo143050a((Throwable) new C32405w(i, str, this.f77340c.f77338d, this.f77340c.f77339e, null, null, 32, null));
                }
            };
            C89219l.m154721d(context, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(r2, "");
            C22355a.C22356a aVar = new C22355a.C22356a();
            HashMap hashMap = new HashMap();
            hashMap.put("need_limit_platform", "0");
            hashMap.put("need_limit_os", "0");
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("not_login_ticket", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                if (str2 == null) {
                    C89219l.m154715b();
                }
                hashMap.put("ticket", str2);
            }
            C22355a.C22356a a = aVar.mo36707a(hashMap);
            C89219l.m154716b(a, "");
            a.f52826a = C22306c.C22307a.m41972a("/passport/auth/available_ways/");
            C22355a c = a.mo36710c();
            C89219l.m154716b(c, "");
            new C31999a(context, c, r2).mo36736d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$ar */
    static final class C32435ar<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77342a;

        /* renamed from: b */
        final /* synthetic */ String f77343b;

        /* renamed from: c */
        final /* synthetic */ EnumC32592i f77344c;

        /* renamed from: d */
        final /* synthetic */ EnumC32594j f77345d;

        static {
            Covode.recordClassIndex(39203);
        }

        C32435ar(AbstractC32572b bVar, String str, EnumC32592i iVar, EnumC32594j jVar) {
            this.f77342a = bVar;
            this.f77343b = str;
            this.f77344c = iVar;
            this.f77345d = jVar;
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(final AbstractC88974o<C32009c> oVar) {
            C89219l.m154721d(oVar, "");
            Context context = this.f77342a.getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(context, "");
            String str = this.f77343b;
            C324361 r3 = new AbstractC32003c(this) {
                /* class com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x.C32435ar.C324361 */

                /* renamed from: c */
                final /* synthetic */ C32435ar f77346c;

                static {
                    Covode.recordClassIndex(39204);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
                @Override // com.bytedance.sdk.p1625a.AbstractC22346c
                /* renamed from: e */
                public final /* synthetic */ void mo36686e(C32009c cVar) {
                    if (cVar != null) {
                        oVar.mo143049a(cVar);
                    } else {
                        oVar.mo143050a((Throwable) new C32405w(-1, "no data", this.f77346c.f77344c, this.f77346c.f77345d, null, null, 32, null));
                    }
                }

                {
                    this.f77346c = r1;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, java.lang.String] */
                @Override // com.bytedance.sdk.p1625a.AbstractC22346c
                /* renamed from: a */
                public final /* synthetic */ void mo36682a(C32009c cVar, String str) {
                    C32009c cVar2 = cVar;
                    if (cVar2 != null) {
                        oVar.mo143050a((Throwable) new C32405w(cVar2.f52715d, cVar2.f52717f, this.f77346c.f77344c, this.f77346c.f77345d, null, null, 32, null));
                    }
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
                @Override // com.bytedance.sdk.p1625a.AbstractC22346c
                /* renamed from: a */
                public final /* synthetic */ void mo36681a(C32009c cVar, int i) {
                    String str;
                    C32009c cVar2 = cVar;
                    AbstractC88974o oVar = oVar;
                    if (cVar2 != null) {
                        str = cVar2.f52717f;
                    } else {
                        str = null;
                    }
                    oVar.mo143050a((Throwable) new C32405w(i, str, this.f77346c.f77344c, this.f77346c.f77345d, null, null, 32, null));
                }
            };
            C89219l.m154721d(context, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(r3, "");
            C22355a.C22356a aVar = new C22355a.C22356a();
            HashMap hashMap = new HashMap();
            hashMap.put("not_login_ticket", str);
            C22355a.C22356a a = aVar.mo36707a(hashMap);
            C89219l.m154716b(a, "");
            a.f52826a = "/passport/shark/safe_verify/";
            C22355a c = a.mo36710c();
            C89219l.m154716b(c, "");
            new C32012d(context, c, r3).mo36736d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$au */
    public static final class C32442au<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ String f77363a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f77364b;

        /* renamed from: c */
        final /* synthetic */ AbstractC32572b f77365c;

        /* renamed from: d */
        final /* synthetic */ boolean f77366d;

        static {
            Covode.recordClassIndex(39210);
        }

        C32442au(String str, AbstractC89172b bVar, AbstractC32572b bVar2, boolean z) {
            this.f77363a = str;
            this.f77364b = bVar;
            this.f77365c = bVar2;
            this.f77366d = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            C32405w wVar = (C32405w) th;
            if (C89219l.m154714a((Object) this.f77363a, (Object) "phone")) {
                C32840d.C32841a.m67414a(false, wVar.getErrorCode(), wVar.getDetailErrorMsg());
            } else {
                C32840d.C32841a.m67412a(1, wVar.getErrorCode(), wVar.getDetailErrorMsg());
            }
            AbstractC89172b bVar = this.f77364b;
            if (bVar != null) {
                bVar.invoke(wVar);
            }
            C32404v.m66775a(false, wVar.getErrorCode(), this.f77363a, (AbstractC32584f) this.f77365c, (Map) null, this.f77366d, 16);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$bl */
    public static final class C32466bl<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77428a;

        /* renamed from: b */
        final /* synthetic */ String f77429b;

        /* renamed from: c */
        final /* synthetic */ boolean f77430c;

        static {
            Covode.recordClassIndex(39234);
        }

        public C32466bl(AbstractC32572b bVar, String str, boolean z) {
            this.f77428a = bVar;
            this.f77429b = str;
            this.f77430c = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C22325l lVar = (C22325l) obj;
            C32853e.m67449a(C31940a.m66306a(C32582d.m67066b(this.f77428a)), this.f77429b, "phone", this.f77428a, this.f77430c ? 1 : 0, "set_password");
            C32404v.m66778a(false, "sms_verification", (AbstractC32584f) this.f77428a, lVar.f52724j, (Map) null, this.f77430c, 16);
            String x = this.f77428a.mo58467x();
            C89219l.m154716b(x, "");
            C32404v.m66779a(true, "phone", "reset_password", x);
            AbstractC32572b bVar = this.f77428a;
            EnumC32592i iVar = EnumC32592i.SET_OR_RESET_PASSWORD;
            EnumC32594j Z_ = this.f77428a.mo58460Z_();
            C22507a aVar = lVar.f52724j;
            C89219l.m154716b(aVar, "");
            C32334a.m66709a(bVar, iVar, Z_, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$bx */
    public static final class C32482bx<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ int f77487a;

        /* renamed from: b */
        final /* synthetic */ String f77488b;

        /* renamed from: c */
        final /* synthetic */ EnumC32594j f77489c;

        /* renamed from: d */
        final /* synthetic */ AbstractC32572b f77490d;

        /* renamed from: e */
        final /* synthetic */ String f77491e;

        /* renamed from: f */
        final /* synthetic */ String f77492f;

        static {
            Covode.recordClassIndex(39250);
        }

        C32482bx(int i, String str, EnumC32594j jVar, AbstractC32572b bVar, String str2, String str3) {
            this.f77487a = i;
            this.f77488b = str;
            this.f77489c = jVar;
            this.f77490d = bVar;
            this.f77491e = str2;
            this.f77492f = str3;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            C32405w wVar = (C32405w) th;
            C32844f.C32845a.m67423a(1, this.f77487a, wVar.getErrorCode(), wVar.getMessage(), this.f77488b);
            if (this.f77489c == EnumC32594j.INPUT_PHONE_SIGN_UP) {
                Integer valueOf = Integer.valueOf(wVar.getErrorCode());
                String x = this.f77490d.mo58467x();
                C89219l.m154716b(x, "");
                C32746u.C32747a.m67342a(valueOf, x);
            } else if (this.f77489c == EnumC32594j.INPUT_PHONE_LOGIN) {
                String x2 = this.f77490d.mo58467x();
                C89219l.m154716b(x2, "");
                C32731t.C32732a.m67326a(false, x2);
            }
            C32404v.m66766a(wVar.getErrorCode(), this.f77491e, this.f77487a, "text", wVar.getErrorMsg(), this.f77492f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$ca */
    static final class C32487ca<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ int f77508a;

        /* renamed from: b */
        final /* synthetic */ String f77509b;

        /* renamed from: c */
        final /* synthetic */ EnumC32594j f77510c;

        /* renamed from: d */
        final /* synthetic */ AbstractC32572b f77511d;

        /* renamed from: e */
        final /* synthetic */ String f77512e;

        static {
            Covode.recordClassIndex(39255);
        }

        C32487ca(int i, String str, EnumC32594j jVar, AbstractC32572b bVar, String str2) {
            this.f77508a = i;
            this.f77509b = str;
            this.f77510c = jVar;
            this.f77511d = bVar;
            this.f77512e = str2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            C32405w wVar = (C32405w) th;
            C32844f.C32845a.m67423a(1, this.f77508a, wVar.getErrorCode(), wVar.getMessage(), this.f77509b);
            if (this.f77510c == EnumC32594j.INPUT_PHONE_SIGN_UP) {
                Integer valueOf = Integer.valueOf(wVar.getErrorCode());
                String x = this.f77511d.mo58467x();
                C89219l.m154716b(x, "");
                C32746u.C32747a.m67342a(valueOf, x);
            } else if (this.f77510c == EnumC32594j.INPUT_PHONE_LOGIN) {
                String x2 = this.f77511d.mo58467x();
                C89219l.m154716b(x2, "");
                C32731t.C32732a.m67326a(false, x2);
            }
            C32404v.m66766a(wVar.getErrorCode(), this.f77512e, this.f77508a, "text", wVar.getErrorMsg(), (String) null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$ce */
    static final class C32492ce<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ int f77527a;

        /* renamed from: b */
        final /* synthetic */ String f77528b;

        /* renamed from: c */
        final /* synthetic */ String f77529c;

        /* renamed from: d */
        final /* synthetic */ AbstractC32572b f77530d;

        static {
            Covode.recordClassIndex(39260);
        }

        C32492ce(int i, String str, String str2, AbstractC32572b bVar) {
            this.f77527a = i;
            this.f77528b = str;
            this.f77529c = str2;
            this.f77530d = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C32844f.C32845a.m67422a(0, this.f77527a, 0, "");
            C32404v.m66766a(0, this.f77528b, this.f77527a, "voice", (String) null, this.f77529c);
            ActivityC0945e activity = this.f77530d.getActivity();
            if (activity != null) {
                Boolean.valueOf(!activity.isFinishing());
            }
            ActivityC0945e activity2 = this.f77530d.getActivity();
            if (activity2 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity2, "");
            C17197a.C17200a aVar = new C17197a.C17200a(activity2);
            aVar.f41070a = activity2.getString(R.string.aqm, new Object[]{this.f77529c});
            aVar.mo27190a(R.string.as_, (DialogInterface.OnClickListener) null, false).mo27193a().mo27185c().setCancelable(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$cg */
    public static final class C32495cg<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ int f77541a;

        /* renamed from: b */
        final /* synthetic */ EnumC32594j f77542b;

        /* renamed from: c */
        final /* synthetic */ AbstractC32572b f77543c;

        /* renamed from: d */
        final /* synthetic */ String f77544d;

        /* renamed from: e */
        final /* synthetic */ String f77545e;

        static {
            Covode.recordClassIndex(39263);
        }

        C32495cg(int i, EnumC32594j jVar, AbstractC32572b bVar, String str, String str2) {
            this.f77541a = i;
            this.f77542b = jVar;
            this.f77543c = bVar;
            this.f77544d = str;
            this.f77545e = str2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            C32405w wVar = (C32405w) th;
            C32844f.C32845a.m67424b(1, this.f77541a, wVar.getErrorCode(), wVar.getMessage());
            if (this.f77542b == EnumC32594j.INPUT_PHONE_SIGN_UP) {
                Integer valueOf = Integer.valueOf(wVar.getErrorCode());
                String x = this.f77543c.mo58467x();
                C89219l.m154716b(x, "");
                C32746u.C32747a.m67342a(valueOf, x);
            } else if (this.f77542b == EnumC32594j.INPUT_PHONE_LOGIN) {
                String x2 = this.f77543c.mo58467x();
                C89219l.m154716b(x2, "");
                C32731t.C32732a.m67326a(false, x2);
            }
            C32404v.m66766a(wVar.getErrorCode(), this.f77544d, this.f77541a, "whatsapp", wVar.getErrorMsg(), this.f77545e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$cm */
    public static final class C32503cm<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77561a;

        /* renamed from: b */
        final /* synthetic */ String f77562b;

        /* renamed from: c */
        final /* synthetic */ boolean f77563c;

        static {
            Covode.recordClassIndex(39271);
        }

        public C32503cm(AbstractC32572b bVar, String str, boolean z) {
            this.f77561a = bVar;
            this.f77562b = str;
            this.f77563c = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C22325l lVar = (C22325l) obj;
            C32853e.m67449a(C32582d.m67060a(this.f77561a), this.f77562b, "email", this.f77561a, this.f77563c ? 1 : 0, "set_password");
            String x = this.f77561a.mo58467x();
            C89219l.m154716b(x, "");
            C32404v.m66779a(true, "email", "reset_password", x);
            C32404v.m66778a(false, "email", (AbstractC32584f) this.f77561a, lVar.f52724j, (Map) null, this.f77563c, 16);
            AbstractC32572b bVar = this.f77561a;
            EnumC32592i iVar = EnumC32592i.SET_OR_RESET_PASSWORD;
            EnumC32594j Z_ = this.f77561a.mo58460Z_();
            C22507a aVar = lVar.f52724j;
            C89219l.m154716b(aVar, "");
            C32334a.m66709a(bVar, iVar, Z_, aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$f */
    public static final class C32525f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77611a;

        /* renamed from: b */
        final /* synthetic */ String f77612b;

        static {
            Covode.recordClassIndex(39293);
        }

        public C32525f(AbstractC32572b bVar, String str) {
            this.f77611a = bVar;
            this.f77612b = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            Objects.requireNonNull(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
            C32405w wVar = (C32405w) th;
            C32838c.C32839a.m67407a(1, "bindPhone", wVar.getErrorCode(), wVar.getErrorMsg());
            C31588c.m65886a(this.f77611a.mo58466w(), "mobile", wVar.getErrorCode(), wVar.getErrorMsg(), this.f77612b);
            C31588c.m65887a(this.f77611a.mo58466w(), this.f77611a.mo58467x(), "phone", wVar.getErrorCode());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$y */
    public static final class C32552y<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77675a;

        /* renamed from: b */
        final /* synthetic */ String f77676b;

        /* renamed from: c */
        final /* synthetic */ String f77677c;

        /* renamed from: d */
        final /* synthetic */ String f77678d;

        static {
            Covode.recordClassIndex(39320);
        }

        public C32552y(AbstractC32572b bVar, String str, String str2, String str3) {
            this.f77675a = bVar;
            this.f77676b = str;
            this.f77677c = str2;
            this.f77678d = str3;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C39162r.m79460a("set_username_response", new C31376a().mo57399a("enter_from", this.f77675a.mo58466w()).mo57399a("enter_method", this.f77675a.mo58467x()).mo57399a("platform", this.f77676b).mo57397a("is_success", 1).mo57399a("origin_username", this.f77677c).mo57399a("result_username", this.f77678d).f75156a);
        }
    }

    /* renamed from: a */
    public static int m66785a(EnumC32594j jVar) {
        switch (C32554y.f77680a[jVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return C31673h.f75782u;
            case 4:
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return C31673h.f75765d;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return C31673h.f75769h;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return C31673h.f75787z;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return C31673h.f75778q;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                return C31673h.f75774m;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                return C31673h.f75780s;
            case ABRConfig.ABR_SELECT_SCENE:
                return C31673h.f75780s;
            default:
                return C31673h.f75782u;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$ap */
    static final class C32431ap<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77328a;

        /* renamed from: b */
        final /* synthetic */ C32004b.C32006b f77329b;

        /* renamed from: c */
        final /* synthetic */ EnumC32592i f77330c;

        /* renamed from: d */
        final /* synthetic */ EnumC32594j f77331d;

        /* renamed from: e */
        final /* synthetic */ String f77332e;

        static {
            Covode.recordClassIndex(39199);
        }

        C32431ap(AbstractC32572b bVar, C32004b.C32006b bVar2, EnumC32592i iVar, EnumC32594j jVar, String str) {
            this.f77328a = bVar;
            this.f77329b = bVar2;
            this.f77330c = iVar;
            this.f77331d = jVar;
            this.f77332e = str;
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(final AbstractC88974o<C32008b> oVar) {
            C89219l.m154721d(oVar, "");
            Context context = this.f77328a.getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(context, "");
            C32004b.C32006b bVar = this.f77329b;
            C324321 r3 = new AbstractC32002b(this) {
                /* class com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x.C32431ap.C324321 */

                /* renamed from: c */
                final /* synthetic */ C32431ap f77333c;

                static {
                    Covode.recordClassIndex(39200);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
                @Override // com.bytedance.sdk.p1625a.AbstractC22346c
                /* renamed from: e */
                public final /* synthetic */ void mo36686e(C32008b bVar) {
                    if (bVar != null) {
                        oVar.mo143049a(bVar);
                    } else {
                        oVar.mo143050a((Throwable) new C32405w(-1, "no data", this.f77333c.f77330c, this.f77333c.f77331d, null, null, 32, null));
                    }
                }

                {
                    this.f77333c = r1;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, java.lang.String] */
                @Override // com.bytedance.sdk.p1625a.AbstractC22346c
                /* renamed from: a */
                public final /* synthetic */ void mo36682a(C32008b bVar, String str) {
                    C32008b bVar2 = bVar;
                    if (bVar2 != null) {
                        oVar.mo143050a((Throwable) new C32405w(bVar2.f52715d, bVar2.f52717f, this.f77333c.f77330c, this.f77333c.f77331d, null, null, 32, null));
                    }
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
                @Override // com.bytedance.sdk.p1625a.AbstractC22346c
                /* renamed from: a */
                public final /* synthetic */ void mo36681a(C32008b bVar, int i) {
                    String str;
                    C32008b bVar2 = bVar;
                    AbstractC88974o oVar = oVar;
                    if (bVar2 != null) {
                        str = bVar2.f52717f;
                    } else {
                        str = null;
                    }
                    oVar.mo143050a((Throwable) new C32405w(i, str, this.f77333c.f77330c, this.f77333c.f77331d, null, null, 32, null));
                    C39162r.m79460a("login_click_next_result", new C31376a().mo57399a("platform", this.f77333c.f77332e).mo57397a("status", 0).mo57397a("error_code", i).f75156a);
                }
            };
            C89219l.m154721d(context, "");
            C89219l.m154721d(r3, "");
            C22355a.C22356a aVar = new C22355a.C22356a();
            HashMap hashMap = new HashMap();
            hashMap.put("mix_mode", "1");
            if (bVar != null) {
                hashMap.put("find_way", String.valueOf(bVar.getFind_way()));
                int find_way = bVar.getFind_way();
                if (find_way == 0) {
                    if (bVar.getArea_code() != null) {
                        hashMap.put("area_code", bVar.getArea_code());
                    }
                    if (bVar.getMobile() != null) {
                        hashMap.put("mobile", bVar.getMobile());
                    }
                } else if (find_way != 1) {
                    if (find_way == 4 && bVar.getEmail() != null) {
                        hashMap.put("email", bVar.getEmail());
                    }
                } else if (bVar.getLogin_name() != null) {
                    hashMap.put("login_name", bVar.getLogin_name());
                }
            }
            C22355a.C22356a a = aVar.mo36707a(hashMap);
            C89219l.m154716b(a, "");
            a.f52826a = "/passport/mobile/get_account/";
            new C32004b(context, a.mo36710c(), r3).mo36736d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$x */
    public static final class C32551x<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC32572b f77671a;

        /* renamed from: b */
        final /* synthetic */ String f77672b;

        /* renamed from: c */
        final /* synthetic */ String f77673c;

        /* renamed from: d */
        final /* synthetic */ String f77674d;

        static {
            Covode.recordClassIndex(39319);
        }

        public C32551x(AbstractC32572b bVar, String str, String str2, String str3) {
            this.f77671a = bVar;
            this.f77672b = str;
            this.f77673c = str2;
            this.f77674d = str3;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            int i;
            String str;
            Throwable th = (Throwable) obj;
            C31376a a = new C31376a().mo57399a("enter_from", this.f77671a.mo58466w()).mo57399a("enter_method", this.f77671a.mo58467x()).mo57399a("platform", this.f77672b).mo57397a("is_success", 0);
            boolean z = th instanceof C32405w;
            if (z) {
                i = ((C32405w) th).getErrorCode();
            } else {
                i = -1;
            }
            C31376a a2 = a.mo57397a("error_code", i);
            String str2 = "";
            if (!z) {
                str = th.getMessage();
            } else {
                str = str2;
            }
            C39162r.m79460a("set_username_response", a2.mo57399a("error_desc", str).mo57399a("origin_username", this.f77673c).mo57399a("result_username", this.f77674d).f75156a);
            if (z) {
                C32405w wVar = (C32405w) th;
                if (wVar.getErrorCode() == 4 || wVar.getErrorCode() == 1337) {
                    ActivityC0945e activity = this.f77671a.getActivity();
                    if (activity != null) {
                        activity.finish();
                        return;
                    }
                    return;
                }
                AbstractC32572b bVar = this.f77671a;
                int errorCode = wVar.getErrorCode();
                String message = th.getMessage();
                if (message != null) {
                    str2 = message;
                }
                C32334a.m66708a(bVar, errorCode, str2, wVar.getScene(), wVar.getStep(), wVar.getExtra());
                return;
            }
            AbstractC32572b bVar2 = this.f77671a;
            String string = bVar2.getString(R.string.dcq);
            C89219l.m154716b(string, str2);
            bVar2.mo57442a(0, string);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$cf */
    public static final class C32493cf<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ String f77531a;

        /* renamed from: b */
        final /* synthetic */ int f77532b;

        /* renamed from: c */
        final /* synthetic */ AbstractC32572b f77533c;

        /* renamed from: d */
        final /* synthetic */ String f77534d;

        /* renamed from: e */
        final /* synthetic */ String f77535e;

        /* renamed from: f */
        final /* synthetic */ int f77536f;

        /* renamed from: g */
        final /* synthetic */ EnumC32592i f77537g;

        /* renamed from: h */
        final /* synthetic */ EnumC32594j f77538h;

        static {
            Covode.recordClassIndex(39261);
        }

        C32493cf(String str, int i, AbstractC32572b bVar, String str2, String str3, int i2, EnumC32592i iVar, EnumC32594j jVar) {
            this.f77531a = str;
            this.f77532b = i;
            this.f77533c = bVar;
            this.f77534d = str2;
            this.f77535e = str3;
            this.f77536f = i2;
            this.f77537g = iVar;
            this.f77538h = jVar;
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(final AbstractC88974o<C22291d<C22419n>> oVar) {
            C89219l.m154721d(oVar, "");
            C39162r.m79460a("send_whatsapp_code", new C31376a().mo57399a("send_method", this.f77531a).mo57397a("send_reason", this.f77532b).mo57399a("enter_method", this.f77533c.mo58467x()).mo57399a("enter_from", this.f77533c.mo58466w()).f75156a);
            Context context = this.f77533c.getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(context, "");
            String str = this.f77534d;
            int i = this.f77532b;
            String str2 = this.f77535e;
            int i2 = this.f77536f;
            boolean a = C32856f.m67455a(C31291a.f74991a);
            C324941 r2 = new AbstractC22434l(this) {
                /* class com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x.C32493cf.C324941 */

                /* renamed from: c */
                final /* synthetic */ C32493cf f77539c;

                static {
                    Covode.recordClassIndex(39262);
                }

                @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.bytedance.sdk.p1625a.AbstractC22346c
                /* renamed from: e */
                public final /* synthetic */ void mo36686e(C22289b bVar) {
                    mo36686e((C22291d) bVar);
                }

                @Override // com.bytedance.sdk.p1625a.AbstractC22358e
                /* renamed from: a */
                public final void mo36711a(C22291d<C22419n> dVar) {
                    if (dVar != null) {
                        oVar.mo143049a(dVar);
                    } else {
                        oVar.mo143050a((Throwable) new C32405w(-1, "no data", this.f77539c.f77537g, this.f77539c.f77538h, null, null, 32, null));
                    }
                }

                {
                    this.f77539c = r1;
                }

                @Override // com.bytedance.sdk.p1625a.AbstractC22358e, com.bytedance.sdk.p1625a.AbstractC22346c
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo36681a(C22289b bVar, int i) {
                    mo36681a((C22291d) bVar, i);
                }

                @Override // com.bytedance.sdk.p1625a.AbstractC22346c
                /* renamed from: a */
                public final /* synthetic */ void mo36682a(C22289b bVar, String str) {
                    C22291d dVar = (C22291d) bVar;
                    C89219l.m154721d(dVar, "");
                    oVar.mo143050a((Throwable) new C32405w(dVar.f52715d, dVar.f52717f, this.f77539c.f77537g, this.f77539c.f77538h, null, null, 32, null));
                }

                @Override // com.bytedance.sdk.p1625a.AbstractC22358e
                /* renamed from: a */
                public final void mo36712a(C22291d<C22419n> dVar, int i) {
                    String str;
                    String str2;
                    C22419n nVar;
                    JSONObject jSONObject;
                    JSONObject optJSONObject;
                    C22419n nVar2;
                    JSONObject jSONObject2 = new JSONObject();
                    if (dVar == null || (nVar2 = (C22419n) dVar.f52723j) == null || (str = nVar2.f53036d) == null) {
                        str = "";
                    }
                    jSONObject2.put("next_url", str);
                    if (i == 2030) {
                        if (!(dVar == null || (nVar = (C22419n) dVar.f52723j) == null || (jSONObject = nVar.f53008m) == null || (optJSONObject = jSONObject.optJSONObject("data")) == null)) {
                            jSONObject2.put("data", optJSONObject);
                        }
                        jSONObject2.put("url_path", "/passport/mobile/send_code/v1/");
                    }
                    AbstractC88974o oVar = oVar;
                    if (dVar != null) {
                        str2 = dVar.f52717f;
                    } else {
                        str2 = null;
                    }
                    oVar.mo143050a((Throwable) new C32405w(i, str2, this.f77539c.f77537g, this.f77539c.f77538h, jSONObject2, null, 32, null));
                }
            };
            C89219l.m154721d(context, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d("", "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(r2, "");
            C22419n nVar = new C22419n(str, "", i, str2, i2, a ? 1 : 0);
            C22355a.C22356a aVar = new C22355a.C22356a();
            HashMap hashMap = new HashMap();
            String c = C13627m.m24501c(nVar.f53033a);
            C89219l.m154716b(c, "");
            hashMap.put("mobile", c);
            if (!TextUtils.isEmpty(nVar.f53039g)) {
                String c2 = C13627m.m24501c(nVar.f53039g);
                C89219l.m154716b(c2, "");
                hashMap.put("old_mobile", c2);
            }
            String str3 = nVar.f53034b;
            C89219l.m154716b(str3, "");
            hashMap.put("captcha", str3);
            String c3 = C13627m.m24501c(String.valueOf(nVar.f53037e));
            C89219l.m154716b(c3, "");
            hashMap.put(StringSet.type, c3);
            String c4 = C13627m.m24501c(String.valueOf(nVar.f53038f));
            C89219l.m154716b(c4, "");
            hashMap.put("unbind_exist", c4);
            hashMap.put("mix_mode", "1");
            if (nVar.f53032A == 1) {
                hashMap.put("check_register", "1");
            } else if (nVar.f53032A == 0) {
                hashMap.put("check_register", "0");
            }
            if (!TextUtils.isEmpty(nVar.f53041u)) {
                String str4 = nVar.f53041u;
                C89219l.m154716b(str4, "");
                hashMap.put("ticket", str4);
            }
            hashMap.put("auto_read", String.valueOf(nVar.f53042v));
            if (!TextUtils.isEmpty(nVar.f53043w)) {
                String str5 = nVar.f53043w;
                C89219l.m154716b(str5, "");
                hashMap.put("shark_ticket", str5);
            }
            if (!TextUtils.isEmpty(nVar.f53044x)) {
                String str6 = nVar.f53044x;
                C89219l.m154716b(str6, "");
                hashMap.put("unusable_mobile_ticket", str6);
            }
            C22355a.C22356a a2 = aVar.mo36707a(hashMap);
            C89219l.m154716b(a2, "");
            a2.f52826a = C22306c.C22307a.m41972a("/passport/mobile/send_whatsapp_code/");
            C22355a c5 = a2.mo36710c();
            C89219l.m154716b(c5, "");
            new C31571a(context, c5, nVar, r2).mo36736d();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ AbstractC88973n m66787a(AbstractC32572b bVar, String str) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(str, "");
        AbstractC88973n b = AbstractC88973n.m154243a((AbstractC88976q) new C32497ci(bVar, str)).mo143251d(new C32499cj(bVar, str)).mo143244b(new C32500ck(bVar));
        C89219l.m154716b(b, "");
        return C32555z.m67011a(bVar, b);
    }

    /* renamed from: b */
    public static AbstractC88973n<C22328o> m66807b(AbstractC32572b bVar, String str, int i, Map<String, String> map) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(str, "");
        AbstractC88973n a = AbstractC88973n.m154243a((AbstractC88976q) new C32516cw(bVar, map, i, str));
        C89219l.m154716b(a, "");
        return C32555z.m67011a(bVar, a);
    }

    /* renamed from: a */
    public static AbstractC88973n<C22293f> m66790a(AbstractC32572b bVar, String str, int i, Map<String, String> map) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(str, "");
        AbstractC88973n b = AbstractC88973n.m154243a((AbstractC88976q) new C32508cq(bVar, map, str, i)).mo143251d(new C32510cr(bVar)).mo143244b(new C32511cs(bVar));
        C89219l.m154716b(b, "");
        return C32555z.m67011a(bVar, b);
    }

    /* renamed from: a */
    public static AbstractC88973n<C32008b> m66786a(AbstractC32572b bVar, C32004b.C32006b bVar2, EnumC32592i iVar, EnumC32594j jVar, String str) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(str, "");
        AbstractC88973n a = AbstractC88973n.m154243a((AbstractC88976q) new C32431ap(bVar, bVar2, iVar, jVar, str));
        C89219l.m154716b(a, "");
        return C32555z.m67011a(bVar, a);
    }

    /* renamed from: b */
    public static AbstractC88973n<C22291d<C22419n>> m66808b(AbstractC32572b bVar, String str, EnumC32592i iVar, EnumC32594j jVar, String str2) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(str2, "");
        int a = m66785a(jVar);
        AbstractC88973n d = AbstractC88973n.m154243a((AbstractC88976q) new C32489cc(a, str2, iVar, jVar, bVar, str)).mo143244b(new C32491cd(a, str2, str)).mo143251d(new C32492ce(a, str2, str, bVar));
        C89219l.m154716b(d, "");
        return C32555z.m67011a(bVar, d);
    }

    /* renamed from: b */
    public static AbstractC88973n<C32007a> m66810b(AbstractC32572b bVar, String str, String str2, EnumC32592i iVar, EnumC32594j jVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(jVar, "");
        AbstractC88973n a = AbstractC88973n.m154243a((AbstractC88976q) new C32433aq(bVar, str, str2, iVar, jVar));
        C89219l.m154716b(a, "");
        return C32555z.m67011a(bVar, a);
    }

    /* renamed from: b */
    public static AbstractC88973n<C22291d<C22419n>> m66809b(AbstractC32572b bVar, String str, EnumC32592i iVar, EnumC32594j jVar, String str2, String str3, String str4) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        int a = m66784a(iVar);
        int a2 = m66785a(jVar);
        AbstractC88973n d = AbstractC88973n.m154243a((AbstractC88976q) new C32484bz(str3, a2, bVar, iVar, jVar, str, str2, a)).mo143244b(new C32487ca(a2, str4, jVar, bVar, str3)).mo143251d(new C32488cb(a2, str4, str3));
        C89219l.m154716b(d, "");
        return C32555z.m67011a(bVar, d);
    }

    /* renamed from: a */
    public static /* synthetic */ AbstractC88973n m66788a(AbstractC32572b bVar, String str, int i, String str2, Map map, String str3, int i2) {
        Map map2 = map;
        String str4 = null;
        if ((i2 & 16) != 0) {
            map2 = null;
        }
        if ((i2 & 32) == 0) {
            str4 = str3;
        }
        return m66789a(bVar, str, i, str2, map2, str4, (Integer) null);
    }

    /* renamed from: a */
    public static AbstractC88973n<C22291d<C22412g>> m66789a(AbstractC32572b bVar, String str, int i, String str2, Map<String, String> map, String str3, Integer num) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        AbstractC88973n d = AbstractC88973n.m154243a((AbstractC88976q) new C32472bq(str2, bVar, i, map, num, str, str3)).mo143244b(new C32474br(str2, i)).mo143251d(new C32475bs(str2, i));
        C89219l.m154716b(d, "");
        return C32555z.m67011a(bVar, d);
    }
}
