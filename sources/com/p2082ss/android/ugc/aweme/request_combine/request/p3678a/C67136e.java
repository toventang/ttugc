package com.p2082ss.android.ugc.aweme.request_combine.request.p3678a;

import android.content.Context;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16049c;
import com.bytedance.ies.abmock.C16083j;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.client.C22028c;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34725k;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.legacy.AbTestManagerImpl;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58260s;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.EnumC58147aa;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.legoImp.task.C58452y;
import com.p2082ss.android.ugc.aweme.p2482cn.C36145b;
import com.p2082ss.android.ugc.aweme.request_combine.request.SettingRequestExtraInfoImpl;
import com.p2082ss.android.ugc.aweme.request_combine.request.p3679b.C67147a;
import com.p2082ss.android.ugc.aweme.request_combine.request.p3679b.C67148b;
import com.p2082ss.android.ugc.aweme.requestcombine.ISettingRequestExtraInfo;
import com.p2082ss.android.ugc.aweme.setting.api.SettingApi;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.request_combine.request.a.e */
public final class C67136e implements AbstractC58259r {

    /* renamed from: c */
    public static final C67137a f150549c = new C67137a((byte) 0);

    /* renamed from: a */
    public final C88411a f150550a;

    /* renamed from: b */
    public final int f150551b;

    static {
        Covode.recordClassIndex(78739);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58260s.m105199a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "request_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.request_combine.request.a.e$a */
    public static final class C67137a {
        static {
            Covode.recordClassIndex(78740);
        }

        private C67137a() {
        }

        public /* synthetic */ C67137a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58259r
    /* renamed from: b */
    public final EnumC58147aa mo58051b() {
        return EnumC58147aa.P0;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    public /* synthetic */ C67136e() {
        this(0);
    }

    /* renamed from: com.ss.android.ugc.aweme.request_combine.request.a.e$e */
    static final class C67141e<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C67141e f150555a = new C67141e();

        static {
            Covode.recordClassIndex(78744);
        }

        C67141e() {
        }

        /* renamed from: com.ss.android.ugc.aweme.request_combine.request.a.e$e$a */
        static final class CallableC67142a<V> implements Callable {

            /* renamed from: a */
            public static final CallableC67142a f150556a = new CallableC67142a();

            static {
                Covode.recordClassIndex(78745);
            }

            CallableC67142a() {
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                AbTestManagerImpl.m104980b().mo95590a(true);
                return C89391z.f203057a;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x007c, code lost:
            if (r5 != null) goto L_0x007e;
         */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r10) {
            /*
            // Method dump skipped, instructions count: 323
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.request_combine.request.p3678a.C67136e.C67141e.accept(java.lang.Object):void");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    /* renamed from: com.ss.android.ugc.aweme.request_combine.request.a.e$c */
    static final class C67139c<T> implements AbstractC88438k {

        /* renamed from: a */
        public static final C67139c f150553a = new C67139c();

        static {
            Covode.recordClassIndex(78742);
        }

        C67139c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final /* synthetic */ boolean mo7718a(Object obj) {
            C89219l.m154721d(obj, "");
            return obj instanceof C28022o;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.request_combine.request.a.e$d */
    static final class C67140d<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C67140d f150554a = new C67140d();

        static {
            Covode.recordClassIndex(78743);
        }

        C67140d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            AbstractC28019l lVar = (AbstractC28019l) obj;
            C89219l.m154721d(lVar, "");
            return lVar.mo46789j();
        }
    }

    public C67136e(int i) {
        this.f150551b = i;
        if (i == 1 || i == 2) {
            C16049c.m29650a();
        }
        this.f150550a = new C88411a();
    }

    /* renamed from: com.ss.android.ugc.aweme.request_combine.request.a.e$b */
    static final class C67138b<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C67138b f150552a = new C67138b();

        static {
            Covode.recordClassIndex(78741);
        }

        C67138b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            T t;
            String str;
            C22099u uVar = (C22099u) obj;
            C89219l.m154721d(uVar, "");
            List<C22027b> list = uVar.f52261a.f52042d;
            C89219l.m154716b(list, "");
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                T t2 = t;
                C89219l.m154716b(t2, "");
                if (C89219l.m154714a((Object) t2.f52037a, (Object) "x-tt-logid")) {
                    break;
                }
            }
            T t3 = t;
            if (!(t3 == null || (str = t3.f52038b) == null)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("x-tt-logid", str);
                C22028c cVar = uVar.f52261a;
                C89219l.m154716b(cVar, "");
                String str2 = cVar.f52039a;
                C89219l.m154716b(str2, "");
                linkedHashMap.put("url", str2);
                ISettingRequestExtraInfo a = SettingRequestExtraInfoImpl.m118789a();
                if (a != null) {
                    a.mo106072a(linkedHashMap);
                }
            }
            return uVar.f52262b;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.request_combine.request.a.e$f */
    static final class C67143f<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C67143f f150557a = new C67143f();

        static {
            Covode.recordClassIndex(78746);
        }

        C67143f() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            Throwable th = (Throwable) obj;
            C58221f.m105153e().mo95704a(new C67147a()).mo95704a(new C67148b()).mo95706a();
            JSONObject jSONObject = new JSONObject();
            if (th == null || (str = th.getMessage()) == null) {
                str = "";
            }
            jSONObject.put("errorMsg", str);
            C12290b.m22060a("settings_v3_result", 1, jSONObject);
            C51423a.m95787a("creator_fund_investigate action = creator_fund_setting_finished, success = false, is_combine = false, is_v3 = " + C16083j.m29874a().mo25538c() + ", is_v3_api = true");
            C39162r.m79460a("config_fetch_success", new C33744d().mo59983a("status", "0").mo59983a("source", "0").f79943a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58259r
    /* renamed from: a */
    public final void mo58050a(Context context, boolean z) {
        C89219l.m154721d(context, "");
        String b = C36145b.m73641b().mo63268b(C17867d.m33078a(), "last_setting_version", "");
        this.f150550a.mo142945a(((SettingApi) RetrofitFactory.m33635a().mo28816a(C29736b.f70924e).mo28858a(SettingApi.class)).queryV3Setting(C58452y.m107035a(), C34725k.m70937a(C17867d.m33078a()), b).mo143242b(C88925a.m154180b(C88946a.f201991c)).mo143234a(C88925a.m154180b(C88946a.f201991c)).mo143248c(C67138b.f150552a).mo143238a(C67139c.f150553a).mo143248c(C67140d.f150554a).mo143231a(C67141e.f150555a, C67143f.f150557a));
    }
}
