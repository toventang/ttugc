package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.web.p1285a.C18288a;
import com.google.p1998c.p2005g.AbstractC27577g;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.feed.C48314ai;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69585e;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69645h;
import com.p2082ss.android.ugc.aweme.sharer.C69649j;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69684e;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.AbstractC88974o;
import p4560f.p4561a.AbstractC88976q;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.fe.method.ShareMethod */
public final class ShareMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: a */
    public static final C47893a f110926a = new C47893a((byte) 0);

    /* renamed from: b */
    private final ArrayList<String> f110927b;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.ShareMethod$b */
    public static final class C47894b implements Comparator<AbstractC69581b> {

        /* renamed from: a */
        private final AbstractC89244h f110928a;

        static {
            Covode.recordClassIndex(56582);
        }

        /* renamed from: a */
        private final List<C69649j> m90891a() {
            return (List) this.f110928a.getValue();
        }

        /* renamed from: com.ss.android.ugc.aweme.fe.method.ShareMethod$b$a */
        static final class C47895a extends AbstractC89220m implements AbstractC89171a<List<? extends C69649j>> {

            /* renamed from: a */
            final /* synthetic */ List f110929a;

            static {
                Covode.recordClassIndex(56583);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C47895a(List list) {
                super(0);
                this.f110929a = list;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* bridge */ /* synthetic */ List<? extends C69649j> invoke() {
                return this.f110929a;
            }
        }

        public C47894b(List<? extends C69649j> list) {
            C89219l.m154721d(list, "");
            this.f110928a = C89250i.m154773a((AbstractC89171a) new C47895a(list));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(AbstractC69581b bVar, AbstractC69581b bVar2) {
            AbstractC69581b bVar3 = bVar;
            AbstractC69581b bVar4 = bVar2;
            C89219l.m154721d(bVar3, "");
            C89219l.m154721d(bVar4, "");
            return m90890a(bVar3, m90891a()) - m90890a(bVar4, m90891a());
        }

        /* renamed from: a */
        private static int m90890a(AbstractC69581b bVar, List<? extends C69649j> list) {
            for (C69649j jVar : list) {
                if (C89219l.m154714a((Object) jVar.f155469a, (Object) bVar.mo109548a())) {
                    return list.indexOf(jVar);
                }
            }
            return Integer.MAX_VALUE;
        }
    }

    static {
        Covode.recordClassIndex(56580);
    }

    private ShareMethod(byte b) {
        this();
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.ShareMethod$a */
    public static final class C47893a {
        static {
            Covode.recordClassIndex(56581);
        }

        private C47893a() {
        }

        public /* synthetic */ C47893a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.ShareMethod$g */
    public static final class C47901g extends AbstractC27577g<List<? extends String>> {
        static {
            Covode.recordClassIndex(56589);
        }

        C47901g() {
        }
    }

    public /* synthetic */ ShareMethod() {
        this((C18288a) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.fe.method.ShareMethod$e */
    public static final class RunnableC47898e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ShareMethod f110940a;

        /* renamed from: b */
        final /* synthetic */ Context f110941b;

        /* renamed from: c */
        final /* synthetic */ View f110942c;

        /* renamed from: d */
        final /* synthetic */ int f110943d;

        static {
            Covode.recordClassIndex(56586);
        }

        RunnableC47898e(ShareMethod shareMethod, Context context, View view, int i) {
            this.f110940a = shareMethod;
            this.f110941b = context;
            this.f110942c = view;
            this.f110943d = i;
        }

        public final void run() {
            int c = C13628n.m24522c(this.f110941b, (float) this.f110942c.getHeight());
            if (this.f110943d == 1) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("panel_height", c);
                jSONObject.put("panel_frame", jSONObject2);
                this.f110940a.mJsBridge.mo29252b("H5_sharePanelFrame", jSONObject);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.fe.method.ShareMethod$f */
    public static final class C47899f<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ AbstractC69581b f110944a;

        /* renamed from: b */
        final /* synthetic */ Context f110945b;

        static {
            Covode.recordClassIndex(56587);
        }

        C47899f(AbstractC69581b bVar, Context context) {
            this.f110944a = bVar;
            this.f110945b = context;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            final AbstractC69645h hVar = (AbstractC69645h) obj;
            C89219l.m154721d(hVar, "");
            return AbstractC88973n.m154243a((AbstractC88976q) new AbstractC88976q(this) {
                /* class com.p2082ss.android.ugc.aweme.p2929fe.method.ShareMethod.C47899f.C479001 */

                /* renamed from: a */
                final /* synthetic */ C47899f f110946a;

                static {
                    Covode.recordClassIndex(56588);
                }

                {
                    this.f110946a = r1;
                }

                @Override // p4560f.p4561a.AbstractC88976q
                /* renamed from: a */
                public final void mo58447a(AbstractC88974o<Boolean> oVar) {
                    C89219l.m154721d(oVar, "");
                    AbstractC69581b bVar = this.f110946a.f110944a;
                    AbstractC69645h hVar = hVar;
                    C89219l.m154716b(hVar, "");
                    oVar.mo143049a(Boolean.valueOf(bVar.mo61913a(hVar, this.f110946a.f110945b)));
                }
            });
        }
    }

    public ShareMethod(C18288a aVar) {
        super(aVar);
        this.f110927b = new ArrayList<>(Arrays.asList("copylink", "qrcode", "browser", "refresh"));
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.ShareMethod$d */
    public static final class C47897d implements AbstractC69690f {

        /* renamed from: a */
        final /* synthetic */ ShareMethod f110934a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f110935b;

        /* renamed from: c */
        final /* synthetic */ JSONObject f110936c;

        /* renamed from: d */
        final /* synthetic */ BaseCommonJavaMethod.AbstractC47813a f110937d;

        /* renamed from: e */
        final /* synthetic */ JSONObject f110938e;

        /* renamed from: f */
        final /* synthetic */ String f110939f;

        static {
            Covode.recordClassIndex(56585);
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f
        /* renamed from: b */
        public final void mo60847b(SharePackage sharePackage, Context context) {
            C89219l.m154721d(sharePackage, "");
            C89219l.m154721d(context, "");
            try {
                JSONObject jSONObject = this.f110936c;
                if (jSONObject != null) {
                    jSONObject.put("code", 0);
                }
            } catch (JSONException unused) {
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f
        /* renamed from: a */
        public final void mo60845a(SharePackage sharePackage, Context context) {
            JSONObject jSONObject;
            C89219l.m154721d(sharePackage, "");
            C89219l.m154721d(context, "");
            T t = this.f110935b.element;
            if (!(t == null || (jSONObject = this.f110936c) == null)) {
                jSONObject.put("share_channel", t);
            }
            BaseCommonJavaMethod.AbstractC47813a aVar = this.f110937d;
            if (aVar != null) {
                aVar.mo79888a(this.f110936c);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f
        /* renamed from: a */
        public final void mo60846a(AbstractC69693h hVar, SharePackage sharePackage, Context context) {
            C89219l.m154721d(hVar, "");
            C89219l.m154721d(sharePackage, "");
            C89219l.m154721d(context, "");
            this.f110935b.element = (T) hVar.mo61919c();
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69660b
        /* renamed from: a */
        public final void mo60844a(AbstractC69581b bVar, boolean z, SharePackage sharePackage, Context context) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(context, "");
            if (this.f110938e != null) {
                C39162r.onEvent(MobClick.obtain().setEventName(this.f110938e.optString("tag")).setLabelName(bVar.mo109548a()).setValue(this.f110938e.optString("value")).setJsonObject(this.f110938e.optJSONObject("extras")));
            }
            if (z) {
                this.f110935b.element = (T) bVar.mo109548a();
                String a = bVar.mo109548a();
                String str = this.f110939f;
                C89219l.m154716b(str, "");
                C33744d dVar = new C33744d();
                dVar.mo59983a("enter_from", "h5_page");
                dVar.mo59983a("platform", a);
                dVar.mo59983a("url", str);
                C39162r.m79460a("h5_share", dVar.f79943a);
            }
        }

        C47897d(ShareMethod shareMethod, C89233z.C89238e eVar, JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar, JSONObject jSONObject2, String str) {
            this.f110934a = shareMethod;
            this.f110935b = eVar;
            this.f110936c = jSONObject;
            this.f110937d = aVar;
            this.f110938e = jSONObject2;
            this.f110939f = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.ShareMethod$c */
    public static final class C47896c extends AbstractC69585e {

        /* renamed from: a */
        final /* synthetic */ AbstractC69581b f110930a;

        /* renamed from: b */
        final /* synthetic */ ShareMethod f110931b;

        /* renamed from: c */
        final /* synthetic */ C69684e.C69686b f110932c;

        /* renamed from: d */
        final /* synthetic */ SharePackage f110933d;

        static {
            Covode.recordClassIndex(56584);
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b, com.p2082ss.android.ugc.aweme.sharer.AbstractC69574a
        /* renamed from: a */
        public final boolean mo61913a(AbstractC69645h hVar, Context context) {
            C89219l.m154721d(hVar, "");
            C89219l.m154721d(context, "");
            Activity j = C17873f.m33102j();
            SharePackage sharePackage = this.f110933d;
            C89219l.m154721d(sharePackage, "");
            if (j == null) {
                return false;
            }
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
        C47896c(AbstractC69581b bVar, AbstractC69581b bVar2, ShareMethod shareMethod, C69684e.C69686b bVar3, SharePackage sharePackage) {
            super(bVar2);
            this.f110930a = bVar;
            this.f110931b = shareMethod;
            this.f110932c = bVar3;
            this.f110933d = sharePackage;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        String str;
        WebView webView;
        JSONObject jSONObject2 = new JSONObject();
        int i = 1;
        jSONObject2.put("code", 1);
        WeakReference<Context> weakReference = this.mContextRef;
        C89219l.m154716b(weakReference, "");
        C18288a aVar2 = this.mJsBridge;
        if (aVar2 == null || (webView = aVar2.f43654d) == null) {
            str = null;
        } else {
            str = webView.getUrl();
        }
        boolean a = mo79927a(weakReference, jSONObject, str, jSONObject2, aVar);
        if (!jSONObject2.has("tricky_flag")) {
            if (!a) {
                i = -1;
            }
            jSONObject2.put("code", i);
            if (aVar != null) {
                aVar.mo79888a(jSONObject2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x018e A[LOOP:1: B:59:0x0188->B:61:0x018e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x022a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo79927a(java.lang.ref.WeakReference<android.content.Context> r37, org.json.JSONObject r38, java.lang.String r39, org.json.JSONObject r40, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod.AbstractC47813a r41) {
        /*
        // Method dump skipped, instructions count: 660
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2929fe.method.ShareMethod.mo79927a(java.lang.ref.WeakReference, org.json.JSONObject, java.lang.String, org.json.JSONObject, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a):boolean");
    }
}
