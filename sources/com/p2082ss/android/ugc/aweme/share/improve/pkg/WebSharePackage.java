package com.p2082ss.android.ugc.aweme.share.improve.pkg;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.deviceregister.DeviceRegisterManager;
import com.p2082ss.android.newmedia.C30128d;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.share.C68849aa;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69124b;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69125c;
import com.p2082ss.android.ugc.aweme.share.p3767m.C69315h;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69645h;
import com.p2082ss.android.ugc.aweme.sharer.C69650k;
import com.p2082ss.android.ugc.aweme.sharer.C69652m;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73955am;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.aweme.web.p4239c.p4240a.C81541b;
import com.p2082ss.android.ugc.trill.R;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.AbstractC88974o;
import p4560f.p4561a.AbstractC88976q;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage */
public final class WebSharePackage extends SharePackage {

    /* renamed from: b */
    public static final C69244a f154781b = new C69244a((byte) 0);

    /* renamed from: a */
    public String f154782a;

    static {
        Covode.recordClassIndex(81573);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage$a */
    public static final class C69244a {
        static {
            Covode.recordClassIndex(81574);
        }

        private C69244a() {
        }

        public /* synthetic */ C69244a(byte b) {
            this();
        }

        /* renamed from: a */
        private static String m122384a(JSONObject jSONObject, String str) {
            String optString = jSONObject.optString(str);
            if (optString == null || C89219l.m154714a((Object) optString, (Object) "null")) {
                return null;
            }
            return optString;
        }

        /* renamed from: a */
        public static WebSharePackage m122381a(Context context, C81541b bVar, String str) {
            String str2 = "";
            C89219l.m154721d(context, str2);
            C89219l.m154721d(bVar, str2);
            SharePackage.C69654a b = new SharePackage.C69654a().mo109803a("pic").mo109806b("web");
            String str3 = bVar.f182346a;
            C89219l.m154716b(str3, str2);
            SharePackage.C69654a c = b.mo109807c(str3);
            String str4 = bVar.f182347b;
            C89219l.m154716b(str4, str2);
            SharePackage.C69654a d = c.mo109808d(str4);
            String b2 = C69124b.m122226b(bVar.f182349d);
            if (b2 != null) {
                str2 = b2;
            }
            WebSharePackage webSharePackage = new WebSharePackage(d.mo109809e(str2));
            Bundle bundle = webSharePackage.f155492i;
            bundle.putString("app_name", context.getString(R.string.u8));
            bundle.putString("thumb_url", "file://" + bVar.f182351f);
            bundle.putString("thumb_path", bVar.f182351f);
            bundle.putString("url_for_im_share", str);
            return webSharePackage;
        }

        /* renamed from: a */
        public static WebSharePackage m122382a(Context context, C81541b bVar, String str, boolean z) {
            String str2 = "";
            C89219l.m154721d(context, str2);
            C89219l.m154721d(bVar, str2);
            SharePackage.C69654a b = new SharePackage.C69654a().mo109803a("web").mo109806b("web");
            String str3 = bVar.f182346a;
            C89219l.m154716b(str3, str2);
            SharePackage.C69654a c = b.mo109807c(str3);
            String str4 = bVar.f182347b;
            C89219l.m154716b(str4, str2);
            SharePackage.C69654a d = c.mo109808d(str4);
            String b2 = C69124b.m122226b(bVar.f182349d);
            if (b2 != null) {
                str2 = b2;
            }
            WebSharePackage webSharePackage = new WebSharePackage(d.mo109809e(str2));
            Bundle bundle = webSharePackage.f155492i;
            bundle.putString("app_name", context.getString(R.string.u8));
            bundle.putString("thumb_url", bVar.f182348c);
            bundle.putString("url_for_im_share", str);
            bundle.putBoolean("user_origin_link", z);
            webSharePackage.f154782a = bVar.f182348c;
            C34577e.m70609b(bVar.f182348c);
            return webSharePackage;
        }

        /* renamed from: a */
        public static WebSharePackage m122383a(Context context, String str, JSONObject jSONObject, String str2, String str3) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(jSONObject, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            SharePackage.C69654a aVar = new SharePackage.C69654a();
            aVar.mo109803a("web");
            String a = m122384a(jSONObject, "title");
            if (a == null) {
                a = "";
            }
            aVar.mo109807c(a);
            String a2 = m122384a(jSONObject, "description");
            if (a2 == null) {
                a2 = "";
            }
            aVar.mo109808d(a2);
            String a3 = m122384a(jSONObject, "url");
            if (a3 == null) {
                a3 = "";
            }
            aVar.mo109809e(a3);
            String str4 = aVar.f155496c;
            if (str4 == null || str4.length() == 0) {
                if (str == null || str.length() == 0 || !(!C89219l.m154714a((Object) str, (Object) "undefined"))) {
                    aVar.mo109807c(str3);
                } else {
                    aVar.mo109807c(str);
                }
            }
            String str5 = aVar.f155497d;
            if (str5 == null || str5.length() == 0) {
                aVar.mo109808d(" ");
            }
            String str6 = aVar.f155498e;
            if (str6 == null || !(!C89361p.m154870a((CharSequence) str6))) {
                aVar.mo109809e(str2);
            } else {
                C29844g gVar = new C29844g(aVar.f155498e);
                if (!C68849aa.C68850a.m121493a()) {
                    IAccountUserService g = C31575b.m65865g();
                    C89219l.m154716b(g, "");
                    gVar.mo52130a("u_code", C30128d.m60947b(g.getCurUserId()));
                }
                if (!C68849aa.C68850a.m121494b()) {
                    gVar.mo52130a("iid", DeviceRegisterManager.getInstallId());
                }
                String a4 = gVar.mo52126a();
                C89219l.m154716b(a4, "");
                aVar.mo109809e(a4);
            }
            WebSharePackage webSharePackage = new WebSharePackage(aVar);
            Bundle bundle = webSharePackage.f155492i;
            bundle.putString("app_name", context.getString(R.string.u8));
            bundle.putString("thumb_url", m122384a(jSONObject, "image"));
            return webSharePackage;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage$e */
    static final class C69251e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f154795a;

        static {
            Covode.recordClassIndex(81581);
        }

        C69251e(AbstractC89172b bVar) {
            this.f154795a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC89172b bVar = this.f154795a;
            C89219l.m154716b(obj, "");
            bVar.invoke(obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage$g */
    static final class C69254g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f154802a;

        static {
            Covode.recordClassIndex(81584);
        }

        C69254g(AbstractC89172b bVar) {
            this.f154802a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC89172b bVar = this.f154802a;
            C89219l.m154716b(obj, "");
            bVar.invoke(obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage$i */
    static final class C69256i<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ WebSharePackage f154804a;

        static {
            Covode.recordClassIndex(81586);
        }

        C69256i(WebSharePackage webSharePackage) {
            this.f154804a = webSharePackage;
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<String> oVar) {
            C89219l.m154721d(oVar, "");
            oVar.mo143049a(this.f154804a.f155491h);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebSharePackage(SharePackage.C69654a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage$b */
    static final class C69245b<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ String f154783a;

        static {
            Covode.recordClassIndex(81575);
        }

        C69245b(String str) {
            this.f154783a = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            final String str = (String) obj;
            C89219l.m154721d(str, "");
            return AbstractC88973n.m154243a((AbstractC88976q) new AbstractC88976q(this) {
                /* class com.p2082ss.android.ugc.aweme.share.improve.pkg.WebSharePackage.C69245b.C692461 */

                /* renamed from: a */
                final /* synthetic */ C69245b f154784a;

                static {
                    Covode.recordClassIndex(81576);
                }

                {
                    this.f154784a = r1;
                }

                @Override // p4560f.p4561a.AbstractC88976q
                /* renamed from: a */
                public final void mo58447a(AbstractC88974o<AbstractC69645h> oVar) {
                    C89219l.m154721d(oVar, "");
                    String str = str;
                    C89219l.m154716b(str, "");
                    oVar.mo143049a(new C69650k(str, this.f154784a.f154783a, null, 4));
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage$d */
    static final class C69249d<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ String f154792a;

        static {
            Covode.recordClassIndex(81579);
        }

        C69249d(String str) {
            this.f154792a = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            final String str = (String) obj;
            C89219l.m154721d(str, "");
            return AbstractC88973n.m154243a((AbstractC88976q) new AbstractC88976q(this) {
                /* class com.p2082ss.android.ugc.aweme.share.improve.pkg.WebSharePackage.C69249d.C692501 */

                /* renamed from: a */
                final /* synthetic */ C69249d f154793a;

                static {
                    Covode.recordClassIndex(81580);
                }

                {
                    this.f154793a = r1;
                }

                @Override // p4560f.p4561a.AbstractC88976q
                /* renamed from: a */
                public final void mo58447a(AbstractC88974o<AbstractC69645h> oVar) {
                    C89219l.m154721d(oVar, "");
                    String str = str;
                    C89219l.m154716b(str, "");
                    oVar.mo143049a(new C69650k(str, this.f154793a.f154792a, null, 4));
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage$h */
    static final class C69255h<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ WebSharePackage f154803a;

        static {
            Covode.recordClassIndex(81585);
        }

        C69255h(WebSharePackage webSharePackage) {
            this.f154803a = webSharePackage;
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<String> oVar) {
            String str = "";
            C89219l.m154721d(oVar, str);
            String str2 = this.f154803a.f155491h;
            if (str2 != null) {
                str = str2;
            }
            oVar.mo143049a(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage$c */
    static final class C69247c<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ WebSharePackage f154786a;

        /* renamed from: b */
        final /* synthetic */ boolean f154787b;

        /* renamed from: c */
        final /* synthetic */ AbstractC69581b f154788c;

        /* renamed from: d */
        final /* synthetic */ String f154789d;

        static {
            Covode.recordClassIndex(81577);
        }

        C69247c(WebSharePackage webSharePackage, boolean z, AbstractC69581b bVar, String str) {
            this.f154786a = webSharePackage;
            this.f154787b = z;
            this.f154788c = bVar;
            this.f154789d = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            final C69652m mVar;
            String str = (String) obj;
            C89219l.m154721d(str, "");
            if (this.f154787b) {
                str = this.f154786a.f155491h;
            }
            if (C89219l.m154714a((Object) this.f154788c.mo109548a(), (Object) "email")) {
                mVar = new C69650k(str, this.f154786a.f155489f, this.f154789d);
            } else {
                mVar = new C69652m(str, this.f154789d);
            }
            return AbstractC88973n.m154243a((AbstractC88976q) new AbstractC88976q(this) {
                /* class com.p2082ss.android.ugc.aweme.share.improve.pkg.WebSharePackage.C69247c.C692481 */

                /* renamed from: a */
                final /* synthetic */ C69247c f154790a;

                static {
                    Covode.recordClassIndex(81578);
                }

                {
                    this.f154790a = r1;
                }

                @Override // p4560f.p4561a.AbstractC88976q
                /* renamed from: a */
                public final void mo58447a(AbstractC88974o<AbstractC69645h> oVar) {
                    C89219l.m154721d(oVar, "");
                    C69652m mVar = mVar;
                    String str = this.f154790a.f154786a.f154782a;
                    if (str == null) {
                        str = "";
                    }
                    String a = C34577e.m70588a(str);
                    C89219l.m154716b(a, "");
                    if (a.length() > 0) {
                        String str2 = C73955am.m130077g(C17867d.m33078a()) + "image_for_share.jpg";
                        C80720e.m139931c(str2);
                        C80720e.m139932c(a, str2);
                        String uri = C69125c.m122230a(str2, C17867d.m33078a()).toString();
                        C89219l.m154716b(uri, "");
                        mVar.mo109799a("image", uri);
                    }
                    oVar.mo143049a(mVar);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage$f */
    static final class C69252f<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ WebSharePackage f154796a;

        /* renamed from: b */
        final /* synthetic */ boolean f154797b;

        /* renamed from: c */
        final /* synthetic */ AbstractC69581b f154798c;

        /* renamed from: d */
        final /* synthetic */ String f154799d;

        static {
            Covode.recordClassIndex(81582);
        }

        C69252f(WebSharePackage webSharePackage, boolean z, AbstractC69581b bVar, String str) {
            this.f154796a = webSharePackage;
            this.f154797b = z;
            this.f154798c = bVar;
            this.f154799d = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            final C69652m mVar;
            String str = (String) obj;
            C89219l.m154721d(str, "");
            if (this.f154797b) {
                str = this.f154796a.f155491h;
            }
            if (C89219l.m154714a((Object) this.f154798c.mo109548a(), (Object) "email")) {
                mVar = new C69650k(str, this.f154796a.f155489f, this.f154799d);
            } else {
                mVar = new C69652m(str, this.f154799d);
            }
            return AbstractC88973n.m154243a((AbstractC88976q) new AbstractC88976q(this) {
                /* class com.p2082ss.android.ugc.aweme.share.improve.pkg.WebSharePackage.C69252f.C692531 */

                /* renamed from: a */
                final /* synthetic */ C69252f f154800a;

                static {
                    Covode.recordClassIndex(81583);
                }

                {
                    this.f154800a = r1;
                }

                @Override // p4560f.p4561a.AbstractC88976q
                /* renamed from: a */
                public final void mo58447a(AbstractC88974o<AbstractC69645h> oVar) {
                    C89219l.m154721d(oVar, "");
                    C69652m mVar = mVar;
                    String str = this.f154800a.f154796a.f154782a;
                    if (str == null) {
                        str = "";
                    }
                    String a = C34577e.m70588a(str);
                    C89219l.m154716b(a, "");
                    if (a.length() > 0) {
                        String str2 = C73955am.m130077g(C17867d.m33078a()) + "image_for_share.jpg";
                        C80720e.m139931c(str2);
                        C80720e.m139932c(a, str2);
                        String uri = C69125c.m122230a(str2, C17867d.m33078a()).toString();
                        C89219l.m154716b(uri, "");
                        mVar.mo109799a("image", uri);
                    }
                    oVar.mo143049a(mVar);
                }
            });
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage
    /* renamed from: b */
    public final AbstractC88973n<AbstractC69645h> mo109580b(AbstractC69581b bVar) {
        AbstractC88973n<String> b;
        C89219l.m154721d(bVar, "");
        String a = C69315h.f154879a.mo109599a(bVar, this.f155487d, this.f155490g);
        boolean z = this.f155492i.getBoolean("user_origin_link");
        if (z) {
            b = AbstractC88973n.m154243a((AbstractC88976q) new C69255h(this));
            C89219l.m154716b(b, "");
        } else {
            b = C69125c.m122234b(this.f155491h, this.f155487d, bVar);
        }
        if (C89219l.m154714a((Object) bVar.mo109548a(), (Object) "facebook")) {
            AbstractC88973n<R> a2 = b.mo143237a(new C69245b(a)).mo143242b(C88925a.m154180b(C88946a.f201991c)).mo143234a(C88391a.m153580a(C88392a.f200660a));
            C89219l.m154716b(a2, "");
            return a2;
        }
        AbstractC88973n<R> a3 = b.mo143237a(new C69247c(this, z, bVar, a)).mo143242b(C88925a.m154180b(C88946a.f201991c)).mo143234a(C88391a.m153580a(C88392a.f200660a));
        C89219l.m154716b(a3, "");
        return a3;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage
    /* renamed from: a */
    public final AbstractC69645h mo87088a(AbstractC69581b bVar) {
        String a;
        C89219l.m154721d(bVar, "");
        String a2 = C69315h.f154879a.mo109599a(bVar, this.f155487d, this.f155490g);
        if (this.f155492i.getBoolean("user_origin_link")) {
            a = this.f155491h;
        } else {
            a = C69125c.m122232a(this.f155491h, this.f155487d, bVar);
        }
        if (C89219l.m154714a((Object) bVar.mo109548a(), (Object) "facebook")) {
            return new C69650k(a, a2, null, 4);
        }
        if (C89219l.m154714a((Object) bVar.mo109548a(), (Object) "email")) {
            return new C69650k(a, this.f155489f, a2);
        }
        C69652m mVar = new C69652m(a, a2);
        String str = this.f154782a;
        if (str == null) {
            str = "";
        }
        String a3 = C34577e.m70588a(str);
        C89219l.m154716b(a3, "");
        if (a3.length() > 0) {
            String str2 = C73955am.m130077g(C17867d.m33078a()) + "image_for_share.jpg";
            C80720e.m139931c(str2);
            C80720e.m139932c(a3, str2);
            String uri = C69125c.m122230a(str2, C17867d.m33078a()).toString();
            C89219l.m154716b(uri, "");
            mVar.mo109799a("image", uri);
        }
        return mVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage
    /* renamed from: a */
    public final void mo109572a(AbstractC69581b bVar, AbstractC89172b<? super AbstractC69645h, C89391z> bVar2) {
        AbstractC88973n<String> b;
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        String a = C69315h.f154879a.mo109599a(bVar, this.f155487d, this.f155490g);
        boolean z = this.f155492i.getBoolean("user_origin_link");
        if (z) {
            b = AbstractC88973n.m154243a((AbstractC88976q) new C69256i(this));
            C89219l.m154716b(b, "");
        } else {
            b = C69125c.m122234b(this.f155491h, this.f155487d, bVar);
        }
        if (C89219l.m154714a((Object) bVar.mo109548a(), (Object) "facebook")) {
            b.mo143237a(new C69249d(a)).mo143242b(C88925a.m154180b(C88946a.f201991c)).mo143234a(C88391a.m153580a(C88392a.f200660a)).mo143253e(new C69251e(bVar2));
        } else {
            b.mo143237a(new C69252f(this, z, bVar, a)).mo143242b(C88925a.m154180b(C88946a.f201991c)).mo143234a(C88391a.m153580a(C88392a.f200660a)).mo143253e(new C69254g(bVar2));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage
    /* renamed from: a */
    public final boolean mo109573a(AbstractC69581b bVar, Context context, AbstractC89172b<? super Boolean, C89391z> bVar2) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(bVar2, "");
        C68863ah.f154028b.mo109361a(bVar.mo109548a(), 0);
        return false;
    }
}
