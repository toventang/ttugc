package com.p2082ss.android.ugc.aweme.bullet.bridge.framework;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.web.AbstractC16494c;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.service.base.p1168e.C16639c;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.google.gson.C27910f;
import com.google.p1998c.p2005g.AbstractC27577g;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.newmedia.C30128d;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.feed.C48314ai;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.share.ShareDependService;
import com.p2082ss.android.ugc.aweme.share.ShareService;
import com.p2082ss.android.ugc.aweme.share.improve.C68963a;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C68981ae;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69037c;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69090p;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.RemoteImageSharePackage;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.WebSharePackage;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69585e;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69645h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69684e;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.p3783a.C69659a;
import com.p2082ss.android.ugc.aweme.utils.C80627s;
import com.p2082ss.android.ugc.aweme.web.p4239c.p4240a.C81541b;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.AbstractC88974o;
import p4560f.p4561a.AbstractC88976q;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.ShareMethod */
public final class ShareMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C35091a f82804b = new C35091a((byte) 0);

    /* renamed from: c */
    private final ArrayList<String> f82805c = new ArrayList<>(Arrays.asList("copylink", "qrcode", "browser", "refresh"));

    /* renamed from: d */
    private final String f82806d = "share";

    /* renamed from: e */
    private AbstractC16183k.EnumC16184a f82807e = AbstractC16183k.EnumC16184a.PRIVATE;

    static {
        Covode.recordClassIndex(42228);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.ShareMethod$a */
    public static final class C35091a {
        static {
            Covode.recordClassIndex(42229);
        }

        private C35091a() {
        }

        public /* synthetic */ C35091a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.ShareMethod$f */
    public static final class C35097f extends AbstractC27577g<List<? extends String>> {
        static {
            Covode.recordClassIndex(42235);
        }

        C35097f() {
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q, com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: b */
    public final AbstractC16183k.EnumC16184a mo25723b() {
        return this.f82807e;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82806d;
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.ShareMethod$c */
    public static final class C35093c implements AbstractC69693h {

        /* renamed from: a */
        final /* synthetic */ ShareMethod f82813a;

        static {
            Covode.recordClassIndex(42231);
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
        /* renamed from: b */
        public final int mo61918b() {
            return R.string.f96;
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
        /* renamed from: c */
        public final String mo61919c() {
            return "refresh";
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
        public final int co_() {
            return 2131232631;
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
        /* renamed from: d */
        public final boolean mo61921d() {
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
        /* renamed from: e */
        public final boolean mo61922e() {
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
        /* renamed from: f */
        public final boolean mo61923f() {
            return true;
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
        /* renamed from: g */
        public final int mo61924g() {
            return co_();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35093c(ShareMethod shareMethod) {
            this.f82813a = shareMethod;
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
        /* renamed from: a */
        public final void mo61914a(Context context) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(context, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
        /* renamed from: a */
        public final void mo61916a(ImageView imageView) {
            C89219l.m154721d(imageView, "");
            C89219l.m154721d(imageView, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
        /* renamed from: a */
        public final void mo61917a(TextView textView) {
            C89219l.m154721d(textView, "");
            AbstractC69693h.C69694a.m123110a(this, textView);
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
        /* renamed from: a */
        public final void mo61915a(Context context, SharePackage sharePackage) {
            WebView n;
            C89219l.m154721d(context, "");
            C89219l.m154721d(sharePackage, "");
            AbstractC16208i h = this.f82813a.mo61867h();
            if (h != null) {
                if (!(h instanceof AbstractC16494c)) {
                    h = null;
                }
                AbstractC16494c cVar = (AbstractC16494c) h;
                if (cVar != null && (n = cVar.mo26210n()) != null) {
                    n.reload();
                }
            }
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: a */
    public final void mo25722a(AbstractC16183k.EnumC16184a aVar) {
        C89219l.m154721d(aVar, "");
        this.f82807e = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.ShareMethod$e */
    public static final class C35095e<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ AbstractC69581b f82819a;

        /* renamed from: b */
        final /* synthetic */ Context f82820b;

        static {
            Covode.recordClassIndex(42233);
        }

        C35095e(AbstractC69581b bVar, Context context) {
            this.f82819a = bVar;
            this.f82820b = context;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            final AbstractC69645h hVar = (AbstractC69645h) obj;
            C89219l.m154721d(hVar, "");
            return AbstractC88973n.m154243a((AbstractC88976q) new AbstractC88976q(this) {
                /* class com.p2082ss.android.ugc.aweme.bullet.bridge.framework.ShareMethod.C35095e.C350961 */

                /* renamed from: a */
                final /* synthetic */ C35095e f82821a;

                static {
                    Covode.recordClassIndex(42234);
                }

                {
                    this.f82821a = r1;
                }

                @Override // p4560f.p4561a.AbstractC88976q
                /* renamed from: a */
                public final void mo58447a(AbstractC88974o<Boolean> oVar) {
                    C89219l.m154721d(oVar, "");
                    AbstractC69581b bVar = this.f82821a.f82819a;
                    AbstractC69645h hVar = hVar;
                    C89219l.m154716b(hVar, "");
                    oVar.mo143049a(Boolean.valueOf(bVar.mo61913a(hVar, this.f82821a.f82820b)));
                }
            });
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.ShareMethod$d */
    public static final class C35094d implements AbstractC69690f {

        /* renamed from: a */
        final /* synthetic */ ShareMethod f82814a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f82815b;

        /* renamed from: c */
        final /* synthetic */ BaseBridgeMethod.AbstractC34965a f82816c;

        /* renamed from: d */
        final /* synthetic */ JSONObject f82817d;

        /* renamed from: e */
        final /* synthetic */ String f82818e;

        static {
            Covode.recordClassIndex(42232);
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f
        /* renamed from: a */
        public final void mo60846a(AbstractC69693h hVar, SharePackage sharePackage, Context context) {
            C89219l.m154721d(hVar, "");
            C89219l.m154721d(sharePackage, "");
            C89219l.m154721d(context, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f
        /* renamed from: a */
        public final void mo60845a(SharePackage sharePackage, Context context) {
            C89219l.m154721d(sharePackage, "");
            C89219l.m154721d(context, "");
            BaseBridgeMethod.AbstractC34965a aVar = this.f82816c;
            if (aVar != null) {
                aVar.mo61874a(this.f82815b);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f
        /* renamed from: b */
        public final void mo60847b(SharePackage sharePackage, Context context) {
            C89219l.m154721d(sharePackage, "");
            C89219l.m154721d(context, "");
            try {
                JSONObject jSONObject = this.f82815b;
                if (jSONObject != null) {
                    jSONObject.put("code", 0);
                }
            } catch (JSONException unused) {
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69660b
        /* renamed from: a */
        public final void mo60844a(AbstractC69581b bVar, boolean z, SharePackage sharePackage, Context context) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(context, "");
            if (this.f82817d != null) {
                C39162r.onEvent(MobClick.obtain().setEventName(this.f82817d.optString("tag")).setLabelName(bVar.mo109548a()).setValue(this.f82817d.optString("value")).setJsonObject(this.f82817d.optJSONObject("extras")));
            }
            if (z) {
                String a = bVar.mo109548a();
                String str = this.f82818e;
                C89219l.m154716b(str, "");
                C33744d dVar = new C33744d();
                dVar.mo59983a("enter_from", "h5_page");
                dVar.mo59983a("platform", a);
                dVar.mo59983a("url", str);
                C39162r.m79460a("h5_share", dVar.f79943a);
            }
        }

        C35094d(ShareMethod shareMethod, JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar, JSONObject jSONObject2, String str) {
            this.f82814a = shareMethod;
            this.f82815b = jSONObject;
            this.f82816c = aVar;
            this.f82817d = jSONObject2;
            this.f82818e = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.ShareMethod$b */
    public static final class C35092b extends AbstractC69585e {

        /* renamed from: a */
        final /* synthetic */ AbstractC69581b f82808a;

        /* renamed from: b */
        final /* synthetic */ ShareMethod f82809b;

        /* renamed from: c */
        final /* synthetic */ C69684e.C69686b f82810c;

        /* renamed from: d */
        final /* synthetic */ SharePackage f82811d;

        /* renamed from: e */
        final /* synthetic */ String f82812e;

        static {
            Covode.recordClassIndex(42230);
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b, com.p2082ss.android.ugc.aweme.sharer.AbstractC69574a
        /* renamed from: a */
        public final boolean mo61913a(AbstractC69645h hVar, Context context) {
            C89219l.m154721d(hVar, "");
            C89219l.m154721d(context, "");
            Activity j = C17873f.m33102j();
            SharePackage sharePackage = this.f82811d;
            String str = this.f82812e;
            C89219l.m154721d(sharePackage, "");
            if (j == null) {
                return false;
            }
            sharePackage.f155492i.putString("url_for_im_share", str);
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (!g.isLogin()) {
                C58957c.m108318a(j, "", "click_shareim_button");
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("share_package", sharePackage);
            IMService.createIIMServicebyMonsterPlugin(false).enterChooseContact(j, bundle);
            C48314ai.m91746a("chat_merge");
            return true;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35092b(AbstractC69581b bVar, AbstractC69581b bVar2, ShareMethod shareMethod, C69684e.C69686b bVar3, SharePackage sharePackage, String str) {
            super(bVar2);
            this.f82808a = bVar;
            this.f82809b = shareMethod;
            this.f82810c = bVar3;
            this.f82811d = sharePackage;
            this.f82812e = str;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        WebView n;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        JSONObject jSONObject2 = new JSONObject();
        int i = 1;
        jSONObject2.put("code", 1);
        WeakReference<Context> weakReference = new WeakReference<>(mo26893e());
        AbstractC16208i h = mo61867h();
        String str = null;
        if (h != null) {
            if (!(h instanceof AbstractC16494c)) {
                h = null;
            }
            AbstractC16494c cVar = (AbstractC16494c) h;
            if (!(cVar == null || (n = cVar.mo26210n()) == null)) {
                str = n.getUrl();
            }
        }
        boolean a = m71744a(weakReference, jSONObject, str, jSONObject2, aVar);
        if (!jSONObject2.has("tricky_flag")) {
            if (!a) {
                i = -1;
            }
            jSONObject2.put("code", i);
            aVar.mo61874a(jSONObject2);
        }
    }

    /* renamed from: a */
    private final boolean m71744a(WeakReference<Context> weakReference, JSONObject jSONObject, String str, JSONObject jSONObject2, BaseBridgeMethod.AbstractC34965a aVar) {
        Activity a;
        SharePackage a2;
        List list;
        String str2 = str;
        if (jSONObject == null) {
            return false;
        }
        String optString = jSONObject.optString("title");
        String optString2 = jSONObject.optString("desc");
        String optString3 = jSONObject.optString("image");
        String optString4 = jSONObject.optString("url");
        Uri parse = Uri.parse(optString4);
        C89219l.m154716b(parse, "");
        if (C16639c.m30885a(parse, "u_code") == null) {
            Uri.Builder buildUpon = Uri.parse(optString4).buildUpon();
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            optString4 = buildUpon.appendQueryParameter("u_code", C30128d.m60947b(g.getCurUserId())).build().toString();
        }
        String optString5 = jSONObject.optString("image_path");
        String optString6 = jSONObject.optString(StringSet.type);
        String optString7 = jSONObject.optString("shareitems");
        if (!TextUtils.isEmpty(optString7) && (list = (List) new C27910f().mo46671a(optString7, new C35097f().getType())) != null) {
            this.f82805c.clear();
            this.f82805c.addAll(list);
        }
        List<String> a3 = C80627s.m139794a(jSONObject.optJSONArray("shareEntriesForbidList"));
        JSONObject jSONObject3 = null;
        if (jSONObject.has("logArgs")) {
            jSONObject3 = jSONObject.optJSONObject("logArgs");
        }
        if (optString2 == null || optString2.length() == 0) {
            C89219l.m154716b(optString, "");
            optString2 = optString;
        }
        C81541b bVar = new C81541b(optString, optString2, optString3, optString4, optString5);
        String optString8 = jSONObject.optString("platform");
        Context context = weakReference.get();
        if (TextUtils.isEmpty(optString8) || context == null || (a = C34729o.m70950a(context)) == null) {
            return false;
        }
        C69684e.C69686b bVar2 = new C69684e.C69686b();
        C68863ah.f154027a.mo109409a((ShareService) bVar2, (C69684e.C69686b) a, (Activity) true);
        if (TextUtils.equals(optString6, "image")) {
            C89219l.m154716b(optString3, "");
            if (str2 == null) {
                str2 = "";
            }
            a2 = RemoteImageSharePackage.C69235a.m122352a(context, bVar, optString3, str2);
            bVar2.mo109827a(new C69090p(optString3));
        } else if (TextUtils.equals(optString6, "local_img")) {
            a2 = WebSharePackage.C69244a.m122381a(context, bVar, str2);
        } else {
            a2 = WebSharePackage.C69244a.m122382a(context, bVar, str2, false);
            AbstractC69581b a4 = ShareDependService.C68822a.m121324a().mo109325a(a2, "");
            bVar2.mo109823a(new C35092b(a4, a4, this, bVar2, a2, str2));
        }
        if (this.f82805c.contains("refresh")) {
            bVar2.mo109827a(new C35093c(this));
        }
        if (this.f82805c.contains("browser")) {
            bVar2.mo109827a(new C68981ae());
        }
        if (this.f82805c.contains("copylink")) {
            bVar2.mo109827a(new C69037c("fromWeb", false, 6));
        }
        for (String str3 : a3) {
            bVar2.mo109829a(str3);
        }
        bVar2.mo109824a(a2);
        if (!TextUtils.equals(optString8, "share_native")) {
            AbstractC69581b a5 = C68963a.C68964a.m121652a(optString8, a);
            if (a5 == null) {
                return false;
            }
            if (!C69659a.m123052a()) {
                return a5.mo61913a(a2.mo87088a(a5), context);
            }
            R cL_ = a2.mo109580b(a5).mo143237a(new C35095e(a5, context)).cL_();
            C89219l.m154716b(cL_, "");
            return cL_.booleanValue();
        }
        jSONObject2.put("tricky_flag", "tricky_flag");
        bVar2.mo109826a(new C35094d(this, jSONObject2, aVar, jSONObject3, optString4));
        ShareDependService.C68822a.m121324a().mo109326a(a, bVar2.mo109831a(), R.style.wi).show();
        return true;
    }
}
