package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.compliance.common.p2660a.C39605a;
import com.p2082ss.android.ugc.aweme.compliance.common.p2662c.C39617a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.utils.C40043a;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.a */
public final class C39727a {

    /* renamed from: a */
    public static final PrivacySettingsApi f93575a = ((PrivacySettingsApi) RetrofitFactory.m33635a().mo28816a(C39605a.f93367a).mo28858a(PrivacySettingsApi.class));

    /* renamed from: b */
    public static final C39727a f93576b = new C39727a();

    private C39727a() {
    }

    static {
        Covode.recordClassIndex(47456);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.a$a */
    public static final class C39728a<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C39728a f93577a = new C39728a();

        static {
            Covode.recordClassIndex(47457);
        }

        C39728a() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C39617a.m80456a("/tiktok/privacy/user/follow_list_setting/update/v1", 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.a$c */
    static final class C39730c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C39730c f93579a = new C39730c();

        static {
            Covode.recordClassIndex(47459);
        }

        C39730c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C39617a.m80456a("/tiktok/privacy/user/im_setting/update/v1", 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.a$e */
    static final class C39732e<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C39732e f93581a = new C39732e();

        static {
            Covode.recordClassIndex(47461);
        }

        C39732e() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C39617a.m80456a("/tiktok/privacy/user/involve_setting/update/v1", 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.a$g */
    static final class C39734g<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C39734g f93583a = new C39734g();

        static {
            Covode.recordClassIndex(47463);
        }

        C39734g() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C39617a.m80456a("/tiktok/privacy/user/item_setting/update/v1", 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.a$i */
    public static final class C39736i<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C39736i f93585a = new C39736i();

        static {
            Covode.recordClassIndex(47465);
        }

        C39736i() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C39617a.m80456a("/tiktok/privacy/user/liked_list_setting/update/v1", 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.a$k */
    public static final class C39738k<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C39738k f93587a = new C39738k();

        static {
            Covode.recordClassIndex(47467);
        }

        C39738k() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C39617a.m80456a("/tiktok/privacy/user/recommended_setting/update/v1", 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.a$m */
    static final class C39740m<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C39740m f93589a = new C39740m();

        static {
            Covode.recordClassIndex(47469);
        }

        C39740m() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C39617a.m80456a("/tiktok/privacy/user/suggest_setting/update/v1", 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.a$b */
    public static final class C39729b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C39729b f93578a = new C39729b();

        static {
            Covode.recordClassIndex(47458);
        }

        C39729b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154716b(th, "");
            C39617a.m80457a("/tiktok/privacy/user/follow_list_setting/update/v1", C40043a.m80996a(th), C40043a.m81001b(th));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.a$d */
    static final class C39731d<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C39731d f93580a = new C39731d();

        static {
            Covode.recordClassIndex(47460);
        }

        C39731d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154716b(th, "");
            C39617a.m80457a("/tiktok/privacy/user/im_setting/update/v1", C40043a.m80996a(th), C40043a.m81001b(th));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.a$f */
    static final class C39733f<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C39733f f93582a = new C39733f();

        static {
            Covode.recordClassIndex(47462);
        }

        C39733f() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154716b(th, "");
            C39617a.m80457a("/tiktok/privacy/user/involve_setting/update/v1", C40043a.m80996a(th), C40043a.m81001b(th));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.a$h */
    static final class C39735h<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C39735h f93584a = new C39735h();

        static {
            Covode.recordClassIndex(47464);
        }

        C39735h() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154716b(th, "");
            C39617a.m80457a("/tiktok/privacy/user/item_setting/update/v1", C40043a.m80996a(th), C40043a.m81001b(th));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.a$j */
    public static final class C39737j<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C39737j f93586a = new C39737j();

        static {
            Covode.recordClassIndex(47466);
        }

        C39737j() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154716b(th, "");
            C39617a.m80457a("/tiktok/privacy/user/liked_list_setting/update/v1", C40043a.m80996a(th), C40043a.m81001b(th));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.a$l */
    public static final class C39739l<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C39739l f93588a = new C39739l();

        static {
            Covode.recordClassIndex(47468);
        }

        C39739l() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154716b(th, "");
            C39617a.m80457a("/tiktok/privacy/user/recommended_setting/update/v1", C40043a.m80996a(th), C40043a.m81001b(th));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.a$n */
    static final class C39741n<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C39741n f93590a = new C39741n();

        static {
            Covode.recordClassIndex(47470);
        }

        C39741n() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154716b(th, "");
            C39617a.m80457a("/tiktok/privacy/user/suggest_setting/update/v1", C40043a.m80996a(th), C40043a.m81001b(th));
        }
    }

    /* renamed from: a */
    public static AbstractC88979t<BaseResponse> m80619a(String str, int i) {
        C89219l.m154721d(str, "");
        AbstractC88979t<BaseResponse> a = f93575a.setItemSetting(str, i).mo143280b(C39734g.f93583a).mo143264a(C39735h.f93584a);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: b */
    public static AbstractC88979t<BaseResponse> m80620b(String str, int i) {
        C89219l.m154721d(str, "");
        AbstractC88979t<BaseResponse> a = f93575a.setImSetting(str, i).mo143280b(C39730c.f93579a).mo143264a(C39731d.f93580a);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: c */
    public static AbstractC88979t<BaseResponse> m80621c(String str, int i) {
        C89219l.m154721d(str, "");
        AbstractC88979t<BaseResponse> a = f93575a.setSuggestionSetting(str, i).mo143280b(C39740m.f93589a).mo143264a(C39741n.f93590a);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: d */
    public static AbstractC88979t<BaseResponse> m80622d(String str, int i) {
        C89219l.m154721d(str, "");
        AbstractC88979t<BaseResponse> a = f93575a.setInvolveSetting(str, i).mo143280b(C39732e.f93581a).mo143264a(C39733f.f93582a);
        C89219l.m154716b(a, "");
        return a;
    }
}
