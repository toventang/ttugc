package com.p2082ss.android.ugc.aweme.bullet.bridge.framework;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.web.AbstractC16494c;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.share.ShareDependService;
import com.p2082ss.android.ugc.aweme.share.ShareService;
import com.p2082ss.android.ugc.aweme.share.improve.p3757b.C69109b;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69124b;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.SearchSharePackage;
import com.p2082ss.android.ugc.aweme.share.p3767m.C69317i;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69684e;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.web.p4239c.p4240a.C81540a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.ShareSearchMethod */
public final class ShareSearchMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C35098a f82823b = new C35098a((byte) 0);

    /* renamed from: c */
    private final String f82824c = "shareSearch";

    /* renamed from: d */
    private AbstractC16183k.EnumC16184a f82825d = AbstractC16183k.EnumC16184a.PRIVATE;

    static {
        Covode.recordClassIndex(42236);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.ShareSearchMethod$a */
    public static final class C35098a {
        static {
            Covode.recordClassIndex(42237);
        }

        private C35098a() {
        }

        public /* synthetic */ C35098a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q, com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: b */
    public final AbstractC16183k.EnumC16184a mo25723b() {
        return this.f82825d;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82824c;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: a */
    public final void mo25722a(AbstractC16183k.EnumC16184a aVar) {
        C89219l.m154721d(aVar, "");
        this.f82825d = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareSearchMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        int i;
        WebView n;
        String str = "";
        C89219l.m154721d(jSONObject, str);
        C89219l.m154721d(aVar, str);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 1);
        WeakReference weakReference = new WeakReference(mo26893e());
        AbstractC16208i h = mo61867h();
        if (h != null) {
            if (!(h instanceof AbstractC16494c)) {
                h = null;
            }
            AbstractC16494c cVar = (AbstractC16494c) h;
            if (!(cVar == null || (n = cVar.mo26210n()) == null)) {
                n.getUrl();
            }
        }
        boolean z = false;
        if (jSONObject != null) {
            String optString = jSONObject.optString("title");
            String optString2 = jSONObject.optString("desc");
            String optString3 = jSONObject.optString("image");
            String optString4 = jSONObject.optString("url");
            String optString5 = jSONObject.optString("schema");
            String optString6 = jSONObject.optString("track_info");
            C89219l.m154716b(optString, str);
            C89219l.m154716b(optString2, str);
            C89219l.m154716b(optString3, str);
            C89219l.m154716b(optString4, str);
            C89219l.m154716b(optString5, str);
            C89219l.m154716b(optString6, str);
            C81540a aVar2 = new C81540a(optString, optString2, optString3, optString4, optString5, optString6);
            Context context = (Context) weakReference.get();
            if (context != null) {
                C89219l.m154716b(context, str);
                Activity a = C34729o.m70950a(context);
                if (a != null) {
                    C89219l.m154721d(a, str);
                    C89219l.m154721d(aVar2, str);
                    String str2 = aVar2.f182345f;
                    C89219l.m154721d(a, str);
                    C89219l.m154721d(aVar2, str);
                    SharePackage.C69654a d = new SharePackage.C69654a().mo109803a("search").mo109806b("search").mo109807c(aVar2.f182340a).mo109808d(aVar2.f182341b);
                    String c = C69124b.m122228c(C69124b.m122226b(aVar2.f182343d));
                    if (c != null) {
                        str = c;
                    }
                    SearchSharePackage searchSharePackage = new SearchSharePackage(d.mo109809e(str));
                    Bundle bundle = searchSharePackage.f155492i;
                    bundle.putString("app_name", a.getString(R.string.u8));
                    bundle.putString("thumb_url", aVar2.f182342c);
                    bundle.putString("schema", aVar2.f182344e);
                    bundle.putString("track_info", aVar2.f182345f);
                    C34577e.m70609b(aVar2.f182342c);
                    SearchSharePackage.C69237a.C69238a aVar3 = new SearchSharePackage.C69237a.C69238a(str2);
                    C69684e.C69686b bVar = new C69684e.C69686b();
                    C69317i.m122515a(bVar, ShareDependService.C68823b.m121325a(ShareDependService.C68822a.m121324a(), searchSharePackage, "share_search", 4));
                    C68863ah.f154027a.mo109409a((ShareService) bVar, (C69684e.C69686b) a, (Activity) true);
                    bVar.mo109823a(new C69109b());
                    bVar.mo109824a(searchSharePackage);
                    bVar.mo109826a(aVar3);
                    ShareDependService.C68822a.m121324a().mo109326a(a, bVar.mo109831a(), R.style.wi).show();
                    z = true;
                }
            }
        }
        if (!jSONObject2.has("tricky_flag")) {
            if (z) {
                i = 1;
            } else {
                i = -1;
            }
            jSONObject2.put("code", i);
            aVar.mo61874a(jSONObject2);
        }
    }
}
