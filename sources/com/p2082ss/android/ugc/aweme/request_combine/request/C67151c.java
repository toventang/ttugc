package com.p2082ss.android.ugc.aweme.request_combine.request;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.apm.C12290b;
import com.bytedance.aweme.p800b.C12895a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14652c;
import com.bytedance.ies.abmock.C16083j;
import com.bytedance.keva.Keva;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.client.C22028c;
import com.google.gson.C27917g;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34479a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C46724b;
import com.p2082ss.android.ugc.aweme.experiment.C46872eb;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.net.BaseResponseObjectTypeAdapterFactory;
import com.p2082ss.android.ugc.aweme.net.CollectionTypeAdapterFactory;
import com.p2082ss.android.ugc.aweme.net.MusicTypeAdapterFactory;
import com.p2082ss.android.ugc.aweme.net.UserTypeAdapterFactory;
import com.p2082ss.android.ugc.aweme.request_combine.C67116a;
import com.p2082ss.android.ugc.aweme.request_combine.model.SettingCombineModel;
import com.p2082ss.android.ugc.aweme.request_combine.p3675a.C67117a;
import com.p2082ss.android.ugc.aweme.request_combine.p3676b.C67119a;
import com.p2082ss.android.ugc.aweme.request_combine.p3676b.EnumC67120b;
import com.p2082ss.android.ugc.aweme.request_combine.p3677c.AbstractC67122b;
import com.p2082ss.android.ugc.aweme.requestcombine.AbstractC67176a;
import com.p2082ss.android.ugc.aweme.requestcombine.IColdLaunchRequestCombiner;
import com.p2082ss.android.ugc.aweme.requestcombine.ISettingRequestExtraInfo;
import com.p2082ss.android.ugc.aweme.sticker.model.C75439a;
import com.p2082ss.android.ugc.aweme.typeadapter.BackgroundVideoDeserializer;
import com.p2082ss.android.ugc.aweme.utils.C80361dw;
import com.p2082ss.android.ugc.aweme.utils.C80446fr;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.request_combine.request.c */
public final class C67151c implements IColdLaunchRequestCombiner {

    /* renamed from: a */
    static SettingCombineModel f150560a;

    /* renamed from: b */
    static ArrayList<AbstractC67176a> f150561b = new ArrayList<>();

    /* renamed from: c */
    public static HashMap<String, AbstractC67146b> f150562c = new HashMap<>();

    /* renamed from: d */
    public static final C67151c f150563d = new C67151c();

    private C67151c() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.request_combine.request.c$c */
    public static final class RunnableC67154c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C58221f.C58223b f150569a;

        static {
            Covode.recordClassIndex(78757);
        }

        RunnableC67154c(C58221f.C58223b bVar) {
            this.f150569a = bVar;
        }

        public final void run() {
            this.f150569a.mo95706a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.request_combine.request.c$d */
    public static final class RunnableC67155d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC67176a f150570a;

        static {
            Covode.recordClassIndex(78758);
        }

        RunnableC67155d(AbstractC67176a aVar) {
            this.f150570a = aVar;
        }

        public final void run() {
            this.f150570a.mo96311a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.request_combine.request.c$f */
    public static final class C67157f implements AbstractC88986z<SettingCombineModel> {

        /* renamed from: a */
        final /* synthetic */ Context f150572a;

        static {
            Covode.recordClassIndex(78760);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        /* renamed from: com.ss.android.ugc.aweme.request_combine.request.c$f$a */
        static final class CallableC67158a<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ C67157f f150573a;

            /* renamed from: b */
            final /* synthetic */ String f150574b;

            /* renamed from: c */
            final /* synthetic */ int f150575c;

            static {
                Covode.recordClassIndex(78761);
            }

            CallableC67158a(C67157f fVar, String str, int i) {
                this.f150573a = fVar;
                this.f150574b = str;
                this.f150575c = i;
            }

            /* renamed from: a */
            private static boolean m118892a() {
                try {
                    return C34719f.C34720a.f82009a.mo61395c();
                } catch (Exception unused) {
                    return false;
                }
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                    C58029j.f132256h = m118892a();
                }
                if (C58029j.f132256h) {
                    C12290b.m22060a("combine_settings_monitor_service", 1, new C33743c().mo59976a("errorDesc", this.f150574b).mo59974a("requestCount", Integer.valueOf(this.f150575c)).mo59977a());
                }
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.request_combine.request.c$f$b */
        static final class RunnableC67159b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C67157f f150576a;

            /* renamed from: b */
            final /* synthetic */ SettingCombineModel f150577b;

            static {
                Covode.recordClassIndex(78762);
            }

            RunnableC67159b(C67157f fVar, SettingCombineModel settingCombineModel) {
                this.f150576a = fVar;
                this.f150577b = settingCombineModel;
            }

            public final void run() {
                C67119a.m118771a(EnumC67120b.SETTINGS_COMBINE_API_FINISH);
                C67151c.m118885a(this.f150576a.f150572a, this.f150577b);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.request_combine.request.c$f$c */
        static final class RunnableC67160c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f150578a;

            static {
                Covode.recordClassIndex(78763);
            }

            RunnableC67160c(int i) {
                this.f150578a = i;
            }

            public final void run() {
                C1731i.m5640b(new Callable(this) {
                    /* class com.p2082ss.android.ugc.aweme.request_combine.request.C67151c.C67157f.RunnableC67160c.CallableC671611 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC67160c f150579a;

                    static {
                        Covode.recordClassIndex(78764);
                    }

                    {
                        this.f150579a = r1;
                    }

                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        C12290b.m22060a("combine_settings_monitor_service", 0, new C33743c().mo59974a("requestCount", Integer.valueOf(this.f150579a.f150578a)).mo59977a());
                        return C89391z.f203057a;
                    }
                }, C39162r.m79452a());
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.request_combine.request.c$f$d */
        static final class CallableC67162d<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ int f150580a;

            static {
                Covode.recordClassIndex(78765);
            }

            CallableC67162d(int i) {
                this.f150580a = i;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                C12290b.m22060a("combine_settings_monitor_service", 0, new C33743c().mo59974a("requestCount", Integer.valueOf(this.f150580a)).mo59977a());
                return C89391z.f203057a;
            }
        }

        public C67157f(Context context) {
            this.f150572a = context;
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
            C67119a.m118771a(EnumC67120b.SETTINGS_COMBINE_API_START);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            C67119a.m118771a(EnumC67120b.SETTINGS_COMBINE_API_FINISH);
            if ((th instanceof C14652c) && ((C14652c) th).getStatusCode() == 509) {
                return;
            }
            if (!(th instanceof C34485a) || ((C34480a) th).getErrorCode() != 509) {
                C58221f.C58223b bVar = new C58221f.C58223b();
                for (AbstractC67146b bVar2 : C67151c.f150562c.values()) {
                    bVar2.mo106078a(bVar);
                }
                bVar.mo95706a();
                Iterator<T> it = C67151c.f150561b.iterator();
                while (it.hasNext()) {
                    it.next().mo96312a(th);
                }
                C1731i.m5640b(new CallableC67158a(this, th.getMessage(), C67151c.f150562c.size()), C39162r.m79452a());
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(SettingCombineModel settingCombineModel) {
            SettingCombineModel settingCombineModel2 = settingCombineModel;
            C89219l.m154721d(settingCombineModel2, "");
            if (C46724b.f108902c) {
                C80446fr.m139456a((long) InteractFirstFrameTimeOutDurationSetting.DEFAULT);
            }
            if (C46872eb.f109217a) {
                C80446fr.m139460c(3000);
            }
            if (C46872eb.f109218b) {
                C12895a.f31387b.f31389a.postDelayed(new RunnableC67159b(this, settingCombineModel2), 16);
                C12895a.f31387b.f31389a.post(new RunnableC67160c(C67151c.f150562c.size()));
                return;
            }
            C67119a.m118771a(EnumC67120b.SETTINGS_COMBINE_API_FINISH);
            C67151c.m118885a(this.f150572a, settingCombineModel2);
            C1731i.m5640b(new CallableC67162d(C67151c.f150562c.size()), C39162r.m79452a());
        }
    }

    /* renamed from: b */
    private static boolean m118888b() {
        try {
            C34719f fVar = C34719f.C34720a.f82009a;
            C89219l.m154716b(fVar, "");
            return fVar.mo61395c();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.request_combine.request.c$a */
    public static final class CallableC67152a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ Context f150564a;

        static {
            Covode.recordClassIndex(78755);
        }

        CallableC67152a(Context context) {
            this.f150564a = context;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Keva repoFromSp = Keva.getRepoFromSp(this.f150564a, "setting_repo_sp", 0);
            if (repoFromSp == null) {
                return null;
            }
            repoFromSp.storeInt("key_has_local_cache", 1);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.request_combine.request.c$b */
    public static final class RunnableC67153b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC67146b f150565a;

        /* renamed from: b */
        final /* synthetic */ C58221f.C58223b f150566b;

        /* renamed from: c */
        final /* synthetic */ Context f150567c;

        /* renamed from: d */
        final /* synthetic */ String f150568d;

        static {
            Covode.recordClassIndex(78756);
        }

        RunnableC67153b(AbstractC67146b bVar, C58221f.C58223b bVar2, Context context, String str) {
            this.f150565a = bVar;
            this.f150566b = bVar2;
            this.f150567c = context;
            this.f150568d = str;
        }

        public final void run() {
            Integer num;
            if (!this.f150565a.mo106079a(C67151c.f150560a)) {
                C67116a b = this.f150565a.mo106080b();
                if (b == null || b.httpCode != 509) {
                    this.f150565a.mo106078a(this.f150566b);
                    String str = this.f150568d;
                    C89219l.m154716b(str, "");
                    C67116a b2 = this.f150565a.mo106080b();
                    if (b2 != null) {
                        num = Integer.valueOf(b2.httpCode);
                    } else {
                        num = null;
                    }
                    C67151c.m118887a(str, num);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.requestcombine.IColdLaunchRequestCombiner
    /* renamed from: a */
    public final boolean mo95594a() {
        return C67117a.m118770a();
    }

    static {
        Covode.recordClassIndex(78754);
        if (C16083j.m29874a().mo25538c()) {
            m118886a(new C67172l());
        } else {
            m118886a(new C67167g());
            m118886a(new C67166f());
        }
        if (!C80580in.m139689d()) {
            m118886a(new C67168h());
        }
        m118886a(new C67170j());
        m118886a(new C67171k());
        m118886a(new C67175m());
        m118886a(new C67165e());
        m118886a(new C67163d());
        if (AbstractC67122b.C67123a.f150532a) {
            m118886a(new C67169i());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.requestcombine.IColdLaunchRequestCombiner
    /* renamed from: a */
    public final void mo95593a(AbstractC67176a aVar) {
        if (aVar != null) {
            f150561b.add(aVar);
        }
    }

    /* renamed from: a */
    private static void m118886a(AbstractC67146b bVar) {
        String a = bVar.mo106076a();
        if (a != null) {
            f150562c.put(a, bVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.requestcombine.IColdLaunchRequestCombiner
    /* renamed from: a */
    public final C67116a mo95592a(String str) {
        C89219l.m154721d(str, "");
        AbstractC67146b bVar = f150562c.get(str);
        if (bVar != null) {
            return bVar.mo106080b();
        }
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.request_combine.request.c$e */
    public static final class C67156e<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C67156e f150571a = new C67156e();

        static {
            Covode.recordClassIndex(78759);
        }

        C67156e() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            T t;
            String str;
            C22099u uVar = (C22099u) obj;
            C89219l.m154721d(uVar, "");
            C27917g a = C80361dw.m139332a();
            a.mo46679a(new CollectionTypeAdapterFactory());
            a.mo46679a(new MusicTypeAdapterFactory());
            a.mo46679a(new UserTypeAdapterFactory());
            a.mo46681a((Type) C75439a.class, (Object) new BackgroundVideoDeserializer());
            a.mo46679a(new BaseResponseObjectTypeAdapterFactory());
            AbstractC34479a aVar = (AbstractC34479a) a.mo46682b().mo46670a((String) uVar.f52262b, (Class) SettingCombineModel.class);
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
                ISettingRequestExtraInfo a2 = SettingRequestExtraInfoImpl.m118789a();
                if (a2 != null) {
                    a2.mo106072a(linkedHashMap);
                }
            }
            aVar.checkValid();
            return aVar;
        }
    }

    /* renamed from: a */
    public static void m118887a(String str, Integer num) {
        if (m118888b()) {
            C12290b.m22060a("combine_settings_monitor_service", 2, new C33743c().mo59974a("errorCode", num).mo59976a("url", str).mo59977a());
        }
    }

    /* renamed from: a */
    public static void m118885a(Context context, SettingCombineModel settingCombineModel) {
        C67116a b;
        Integer num;
        if (C46872eb.f109218b) {
            System.currentTimeMillis();
            C1731i.m5640b(new CallableC67152a(context), C39162r.m79452a());
            f150560a = settingCombineModel;
            C58221f.C58223b bVar = new C58221f.C58223b();
            for (Map.Entry<String, AbstractC67146b> entry : f150562c.entrySet()) {
                C12895a.f31387b.f31389a.post(new RunnableC67153b(entry.getValue(), bVar, context, entry.getKey()));
            }
            C12895a.f31387b.f31389a.post(new RunnableC67154c(bVar));
            Iterator<T> it = f150561b.iterator();
            while (it.hasNext()) {
                C12895a.f31387b.f31389a.post(new RunnableC67155d(it.next()));
            }
            return;
        }
        System.currentTimeMillis();
        Keva repoFromSp = Keva.getRepoFromSp(context, "setting_repo_sp", 0);
        if (repoFromSp != null) {
            repoFromSp.storeInt("key_has_local_cache", 1);
        }
        f150560a = settingCombineModel;
        C58221f.C58223b bVar2 = new C58221f.C58223b();
        for (Map.Entry<String, AbstractC67146b> entry2 : f150562c.entrySet()) {
            String key = entry2.getKey();
            AbstractC67146b value = entry2.getValue();
            if (!value.mo106079a(f150560a) && ((b = value.mo106080b()) == null || b.httpCode != 509)) {
                value.mo106078a(bVar2);
                C89219l.m154716b(key, "");
                C67116a b2 = value.mo106080b();
                if (b2 != null) {
                    num = Integer.valueOf(b2.httpCode);
                } else {
                    num = null;
                }
                m118887a(key, num);
            }
        }
        bVar2.mo95706a();
        Iterator<T> it2 = f150561b.iterator();
        while (it2.hasNext()) {
            it2.next().mo96311a();
        }
    }
}
