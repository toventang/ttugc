package com.p2082ss.android.ugc.aweme.p2929fe.method.upload;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.http.p2146a.p2149b.C29934d;
import com.p2082ss.android.newmedia.C30128d;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.base.utils.C34717d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feedback.C50569d;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2440ce.C35444b;
import com.p2082ss.android.ugc.aweme.p2929fe.method.AbstractC47909a;
import com.p2082ss.android.ugc.aweme.p2929fe.method.AbstractC47963m;
import com.p2082ss.android.ugc.aweme.p2929fe.p2930a.C47806b;
import com.p2082ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p2082ss.android.ugc.aweme.profile.model.TcmImage;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80313cs;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p077b.C1743j;
import p078c.p080b.C1756d;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.fe.method.upload.e */
public final class C47991e implements WeakHandler.IHandler, AbstractC47982b, AbstractC47983c {

    /* renamed from: j */
    public static final C47992a f111163j = new C47992a((byte) 0);

    /* renamed from: a */
    public int f111164a;

    /* renamed from: b */
    public boolean f111165b;

    /* renamed from: c */
    public HashMap<Integer, AvatarUri> f111166c;

    /* renamed from: d */
    public List<String> f111167d;

    /* renamed from: e */
    public AtomicInteger f111168e;

    /* renamed from: f */
    public AtomicInteger f111169f;

    /* renamed from: g */
    public AbstractC89171a<C89391z> f111170g;

    /* renamed from: h */
    public final WeakReference<Activity> f111171h;

    /* renamed from: i */
    public final AbstractC47963m f111172i;

    /* renamed from: k */
    private int f111173k = 1;

    /* renamed from: l */
    private String f111174l = "";

    /* renamed from: m */
    private boolean f111175m;

    /* renamed from: n */
    private String f111176n = "";

    /* renamed from: o */
    private String f111177o = "";

    /* renamed from: p */
    private List<WeakHandler.IHandler> f111178p;

    /* renamed from: q */
    private String f111179q = "";

    /* renamed from: r */
    private String f111180r = "";

    /* renamed from: s */
    private final AbstractC47909a.C47912a f111181s;

    static {
        Covode.recordClassIndex(56710);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.method.upload.AbstractC47982b
    /* renamed from: a */
    public final void mo79939a() {
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.method.upload.AbstractC47983c
    /* renamed from: l */
    public final void mo61897l() {
        this.f111170g = null;
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.e$a */
    public static final class C47992a {
        static {
            Covode.recordClassIndex(56711);
        }

        private C47992a() {
        }

        public /* synthetic */ C47992a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.method.upload.AbstractC47982b
    /* renamed from: a */
    public final boolean mo79942a(int i, int i2, Intent intent) {
        Object obj;
        String a;
        if (i2 == 0 || intent == null) {
            this.f111172i.mo61886a(0, "uploadCancel");
            return true;
        }
        Activity activity = this.f111171h.get();
        if (activity == null) {
            this.f111172i.mo61886a(0, "uploadFailed");
            return true;
        }
        Uri data = intent.getData();
        if (data == null || C13627m.m24498a(data.toString())) {
            new C23144b(activity).mo37636b(2131231583).mo37640e(R.string.dok).mo37637b();
            this.f111172i.mo61886a(0, "uploadFailed");
            return true;
        }
        String uri = data.toString();
        C89219l.m154716b(uri, "");
        this.f111177o = uri;
        try {
            obj = C89379q.m157068constructorimpl(C1756d.m5891a(C17867d.m33078a(), data));
        } catch (Throwable th) {
            obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        if (!C89379q.m157073isFailureimpl(obj) && obj != null) {
            if (this.f111179q.length() > 0) {
                a = new C29844g(Api.f79771d + "/" + this.f111179q).mo52126a();
            } else {
                C29844g gVar = new C29844g(Api.f79772e);
                C31575b.m65859a();
                IAccountUserService e = C31575b.f75524a.mo57069e();
                C89219l.m154716b(e, "");
                gVar.mo52130a("uid", e.getCurUserId());
                gVar.mo52130a("source", this.f111174l);
                a = gVar.mo52126a();
            }
            this.f111181s.mo79937a(activity);
            if (this.f111179q.length() > 0) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C29934d("NS", this.f111180r));
                C31575b.m65859a();
                C31575b.f75524a.mo57069e().uploadAvatar(new WeakHandler(this), a, 8388608, this.f111177o, arrayList, "image_info");
            } else {
                C31575b.m65859a();
                C31575b.f75524a.mo57069e().uploadAvatar(new WeakHandler(this), a, 8388608, this.f111177o, null);
            }
            return true;
        }
        new C23144b(activity).mo37636b(2131231583).mo37640e(R.string.dok).mo37637b();
        this.f111172i.mo61886a(0, "uploadFailed");
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.e$g */
    public static final class CallableC47998g<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C47991e f111192a;

        /* renamed from: b */
        final /* synthetic */ C47993b f111193b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f111194c;

        static {
            Covode.recordClassIndex(56717);
        }

        CallableC47998g(C47991e eVar, C47993b bVar, ArrayList arrayList) {
            this.f111192a = eVar;
            this.f111193b = bVar;
            this.f111194c = arrayList;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C47993b bVar = this.f111193b;
            if (bVar != null) {
                this.f111194c.add(bVar);
            }
            return C47991e.m90981a(this.f111194c);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.method.upload.AbstractC47983c
    /* renamed from: g */
    public final void mo61896g() {
        this.f111172i.mo61886a(0, "uploadCancel");
        this.f111165b = true;
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.e$c */
    public static final class C47994c implements IAVProcessService.IProcessCallback<String> {

        /* renamed from: a */
        final /* synthetic */ C1743j f111185a;

        static {
            Covode.recordClassIndex(56713);
        }

        C47994c(C1743j jVar) {
            this.f111185a = jVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVProcessService.IProcessCallback
        public final /* synthetic */ void finish(String str) {
            this.f111185a.mo5555a(str);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ AtomicInteger m90980a(C47991e eVar) {
        AtomicInteger atomicInteger = eVar.f111169f;
        if (atomicInteger == null) {
            C89219l.m154710a("mMultiUploadFailNum");
        }
        return atomicInteger;
    }

    /* renamed from: b */
    public static final /* synthetic */ HashMap m90984b(C47991e eVar) {
        HashMap<Integer, AvatarUri> hashMap = eVar.f111166c;
        if (hashMap == null) {
            C89219l.m154710a("mAvatarUriList");
        }
        return hashMap;
    }

    /* renamed from: c */
    public static final /* synthetic */ AtomicInteger m90985c(C47991e eVar) {
        AtomicInteger atomicInteger = eVar.f111168e;
        if (atomicInteger == null) {
            C89219l.m154710a("mMultiUploadSuccessNum");
        }
        return atomicInteger;
    }

    /* renamed from: d */
    public static final /* synthetic */ List m90986d(C47991e eVar) {
        List<String> list = eVar.f111167d;
        if (list == null) {
            C89219l.m154710a("mFileNameList");
        }
        return list;
    }

    /* renamed from: a */
    private final void m90982a(int i) {
        this.f111178p = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            C47995d dVar = new C47995d(this, i2);
            List<WeakHandler.IHandler> list = this.f111178p;
            if (list == null) {
                C89219l.m154710a("mIHandlerList");
            }
            list.add(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.e$h */
    public static final class C47999h<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C47991e f111195a;

        /* renamed from: b */
        final /* synthetic */ C47993b f111196b;

        static {
            Covode.recordClassIndex(56718);
        }

        C47999h(C47991e eVar, C47993b bVar) {
            this.f111195a = eVar;
            this.f111196b = bVar;
        }

        @Override // p077b.AbstractC1729g
        public final Object then(C1731i<JSONArray> iVar) {
            if (this.f111195a.f111165b) {
                return null;
            }
            C89219l.m154716b(iVar, "");
            if (iVar.mo5545d() != null) {
                this.f111195a.f111172i.mo61887a(iVar.mo5545d());
            } else {
                this.f111195a.f111172i.mo61886a(0, "uploadFailed");
            }
            if (this.f111196b != null) {
                return null;
            }
            AbstractC89171a<C89391z> aVar = this.f111195a.f111170g;
            if (aVar != null) {
                aVar.invoke();
            }
            C50569d.m94803a(this.f111195a.f111164a);
            return null;
        }
    }

    /* renamed from: a */
    private static C1731i<String> m90979a(String str) {
        C1743j jVar = new C1743j();
        try {
            AVExternalServiceImpl.m113114a().abilityService().processService().compressPhoto(str, 216, 384, new C47994c(jVar));
        } catch (Exception e) {
            e.printStackTrace();
            jVar.mo5555a((Object) null);
        }
        C1731i<TResult> iVar = jVar.f5610a;
        C89219l.m154716b(iVar, "");
        return iVar;
    }

    /* renamed from: a */
    public static JSONArray m90981a(List<C47993b> list) {
        String str;
        try {
            JSONArray jSONArray = new JSONArray();
            for (C47993b bVar : list) {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(bVar.f111182a)) {
                    jSONObject.put("url", bVar.f111182a);
                }
                if (!TextUtils.isEmpty(bVar.f111183b)) {
                    jSONObject.put("uri", bVar.f111183b);
                }
                C1731i<String> a = m90979a(bVar.f111184c);
                try {
                    a.mo5547f();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    String d = a.mo5545d();
                    if (d == null) {
                        d = "";
                    }
                    str = C80313cs.m139233b(d);
                } catch (IOException unused) {
                    str = "";
                }
                jSONObject.put("base64", str);
                jSONArray.put(jSONObject);
            }
            return jSONArray;
        } catch (JSONException unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo80016a(Activity activity) {
        Intent intent = new Intent(activity, ImageChooseUploadActivity.class);
        intent.putExtra("maxSelectNum", this.f111173k);
        intent.putExtra("enter_from", this.f111176n);
        m90983a(activity, intent);
        C39162r.m79460a("enter_image_choose", new C33744d().mo59983a("enter_from", this.f111176n).f79943a);
        ImageChooseUploadActivity.f111091i = this;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        this.f111181s.mo79936a();
        Activity activity = this.f111171h.get();
        if (activity == null || message == null) {
            this.f111172i.mo61886a(0, "uploadFailed");
            return;
        }
        if (message.obj instanceof C34485a) {
            C79459a aVar = new C79459a(activity);
            Object obj = message.obj;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException");
            aVar.mo123052a(((C34485a) obj).getErrorMsg()).mo123053a();
        } else if (message.obj instanceof AvatarUri) {
            Object obj2 = message.obj;
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.AvatarUri");
            AvatarUri avatarUri = (AvatarUri) obj2;
            if (avatarUri.urlList != null) {
                List<String> list = avatarUri.urlList;
                C89219l.m154716b(list, "");
                if (!list.isEmpty()) {
                    String str = avatarUri.urlList.get(0);
                    C89219l.m154716b(str, "");
                    String str2 = avatarUri.uri;
                    C89219l.m154716b(str2, "");
                    mo80017a(new C47993b(str, str2, this.f111177o), new ArrayList<>());
                    return;
                }
            }
            this.f111172i.mo61886a(0, "uploadFailed");
            return;
        } else if (message.obj instanceof TcmImage) {
            Object obj3 = message.obj;
            Objects.requireNonNull(obj3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.TcmImage");
            TcmImage tcmImage = (TcmImage) obj3;
            String mid = tcmImage.getMid();
            if (mid == null || mid.length() == 0) {
                this.f111172i.mo61886a(0, "uploadFailed");
                return;
            }
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mid", tcmImage.getMid());
            jSONArray.put(jSONObject);
            this.f111172i.mo61887a(jSONArray);
            return;
        }
        this.f111172i.mo61886a(0, "uploadFailed");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.e$d */
    public static final class C47995d implements WeakHandler.IHandler {

        /* renamed from: a */
        final /* synthetic */ C47991e f111186a;

        /* renamed from: b */
        final /* synthetic */ int f111187b;

        static {
            Covode.recordClassIndex(56714);
        }

        C47995d(C47991e eVar, int i) {
            this.f111186a = eVar;
            this.f111187b = i;
        }

        @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
        public final void handleMsg(Message message) {
            if (!this.f111186a.f111165b) {
                if (message.obj instanceof C34485a) {
                    Activity activity = this.f111186a.f111171h.get();
                    if (activity != null) {
                        C79459a aVar = new C79459a(activity);
                        Object obj = message.obj;
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException");
                        aVar.mo123052a(((C34485a) obj).getErrorMsg()).mo123053a();
                    }
                    C47991e.m90980a(this.f111186a).incrementAndGet();
                } else if (message.obj instanceof AvatarUri) {
                    Object obj2 = message.obj;
                    Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.AvatarUri");
                    AvatarUri avatarUri = (AvatarUri) obj2;
                    if (C34717d.m70910b(avatarUri.urlList)) {
                        C47991e.m90984b(this.f111186a).put(Integer.valueOf(this.f111187b), avatarUri);
                        C47991e.m90985c(this.f111186a).incrementAndGet();
                    } else {
                        C47991e.m90980a(this.f111186a).incrementAndGet();
                    }
                } else {
                    C47991e.m90980a(this.f111186a).incrementAndGet();
                }
                if (C47991e.m90980a(this.f111186a).get() + C47991e.m90985c(this.f111186a).get() == C47991e.m90986d(this.f111186a).size()) {
                    int size = C47991e.m90986d(this.f111186a).size();
                    int i = C47991e.m90985c(this.f111186a).get();
                    if (i == 0) {
                        this.f111186a.f111172i.mo61886a(0, "uploadFailedAll");
                        AbstractC89171a<C89391z> aVar2 = this.f111186a.f111170g;
                        if (aVar2 != null) {
                            aVar2.invoke();
                        }
                        C50569d.m94803a(this.f111186a.f111164a);
                    } else if (i >= 0 && size > i) {
                        this.f111186a.f111172i.mo61886a(0, "uploadFailed");
                        AbstractC89171a<C89391z> aVar3 = this.f111186a.f111170g;
                        if (aVar3 != null) {
                            aVar3.invoke();
                        }
                        C50569d.m94803a(this.f111186a.f111164a);
                    } else if (i == size) {
                        ArrayList<C47993b> arrayList = new ArrayList<>();
                        int size2 = C47991e.m90986d(this.f111186a).size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            AvatarUri avatarUri2 = (AvatarUri) C47991e.m90984b(this.f111186a).get(Integer.valueOf(i2));
                            if (!(avatarUri2 == null || avatarUri2.urlList == null)) {
                                List<String> list = avatarUri2.urlList;
                                C89219l.m154716b(list, "");
                                if (!list.isEmpty()) {
                                    String str = avatarUri2.urlList.get(0);
                                    C89219l.m154716b(str, "");
                                    String str2 = avatarUri2.uri;
                                    C89219l.m154716b(str2, "");
                                    arrayList.add(new C47993b(str, str2, (String) C47991e.m90986d(this.f111186a).get(i2)));
                                }
                            }
                        }
                        if (arrayList.size() == C47991e.m90984b(this.f111186a).size()) {
                            this.f111186a.mo80017a((C47993b) null, arrayList);
                            return;
                        }
                        this.f111186a.f111172i.mo61886a(0, "uploadFailed");
                        AbstractC89171a<C89391z> aVar4 = this.f111186a.f111170g;
                        if (aVar4 != null) {
                            aVar4.invoke();
                        }
                        C50569d.m94803a(this.f111186a.f111164a);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m90983a(Activity activity, Intent intent) {
        C84349a.m145093a(intent, activity);
        activity.startActivity(intent);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.e$e */
    static final class C47996e implements C35444b.AbstractC35447b {

        /* renamed from: a */
        final /* synthetic */ C47991e f111188a;

        /* renamed from: b */
        final /* synthetic */ Activity f111189b;

        static {
            Covode.recordClassIndex(56715);
        }

        C47996e(C47991e eVar, Activity activity) {
            this.f111188a = eVar;
            this.f111189b = activity;
        }

        @Override // com.p2082ss.android.ugc.aweme.p2440ce.C35444b.AbstractC35447b
        /* renamed from: a */
        public final void mo53515a(String[] strArr, int[] iArr) {
            C89219l.m154716b(iArr, "");
            if (iArr.length != 0) {
                if (iArr[0] == 0) {
                    C30128d.m60944a(this.f111189b);
                    return;
                }
                new C79459a(this.f111189b).mo123052a(this.f111189b.getString(R.string.dng)).mo123053a();
                this.f111188a.f111172i.mo61886a(-1, "uploadFailed");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.e$f */
    static final class C47997f implements C35444b.AbstractC35447b {

        /* renamed from: a */
        final /* synthetic */ C47991e f111190a;

        /* renamed from: b */
        final /* synthetic */ Activity f111191b;

        static {
            Covode.recordClassIndex(56716);
        }

        C47997f(C47991e eVar, Activity activity) {
            this.f111190a = eVar;
            this.f111191b = activity;
        }

        @Override // com.p2082ss.android.ugc.aweme.p2440ce.C35444b.AbstractC35447b
        /* renamed from: a */
        public final void mo53515a(String[] strArr, int[] iArr) {
            C89219l.m154716b(iArr, "");
            if (iArr.length != 0) {
                if (iArr[0] == 0) {
                    this.f111190a.mo80016a(this.f111191b);
                    return;
                }
                new C79459a(this.f111191b).mo123052a(this.f111191b.getString(R.string.dng)).mo123053a();
                this.f111190a.f111172i.mo61886a(-1, "uploadFailed");
            }
        }
    }

    /* renamed from: a */
    public final void mo80017a(C47993b bVar, ArrayList<C47993b> arrayList) {
        C1731i.m5640b(new CallableC47998g(this, bVar, arrayList), C1731i.f5562a).mo5534a(new C47999h(this, bVar), C1731i.f5564c, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.method.upload.AbstractC47983c
    /* renamed from: a */
    public final void mo61895a(List<C48000f> list, AbstractC89171a<C89391z> aVar) {
        Object obj;
        C89219l.m154721d(aVar, "");
        if (list != null) {
            this.f111170g = aVar;
            this.f111168e = new AtomicInteger(0);
            this.f111169f = new AtomicInteger(0);
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f111197a);
            }
            this.f111167d = arrayList;
            this.f111166c = new HashMap<>();
            List<String> list2 = this.f111167d;
            if (list2 == null) {
                C89219l.m154710a("mFileNameList");
            }
            m90982a(list2.size());
            List<String> list3 = this.f111167d;
            if (list3 == null) {
                C89219l.m154710a("mFileNameList");
            }
            int size = list3.size();
            for (int i = 0; i < size; i++) {
                List<String> list4 = this.f111167d;
                if (list4 == null) {
                    C89219l.m154710a("mFileNameList");
                }
                String str = list4.get(i);
                if (C13627m.m24498a(str)) {
                    AtomicInteger atomicInteger = this.f111169f;
                    if (atomicInteger == null) {
                        C89219l.m154710a("mMultiUploadFailNum");
                    }
                    atomicInteger.incrementAndGet();
                } else {
                    try {
                        obj = C89379q.m157068constructorimpl(C1756d.m5891a(C17867d.m33078a(), Uri.parse(str)));
                    } catch (Throwable th) {
                        obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
                    }
                    if (!C89379q.m157073isFailureimpl(obj) && obj != null) {
                        C29844g gVar = new C29844g(Api.f79772e);
                        C31575b.m65859a();
                        IAccountUserService e = C31575b.f75524a.mo57069e();
                        C89219l.m154716b(e, "");
                        gVar.mo52130a("uid", e.getCurUserId());
                        gVar.mo52130a("source", this.f111174l);
                        String a = gVar.mo52126a();
                        String a2 = C47806b.m90822a(str);
                        if (!(a2 == null || a2.length() == 0)) {
                            C31575b.m65859a();
                            IAccountUserService e2 = C31575b.f75524a.mo57069e();
                            List<WeakHandler.IHandler> list5 = this.f111178p;
                            if (list5 == null) {
                                C89219l.m154710a("mIHandlerList");
                            }
                            e2.uploadAvatar(new WeakHandler(list5.get(i)), a, 8388608, C50569d.m94802a(a2, new File(a2), this.f111164a), null);
                        }
                    } else {
                        AtomicInteger atomicInteger2 = this.f111169f;
                        if (atomicInteger2 == null) {
                            C89219l.m154710a("mMultiUploadFailNum");
                        }
                        atomicInteger2.incrementAndGet();
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.method.upload.AbstractC47982b
    /* renamed from: a */
    public final void mo79941a(JSONObject jSONObject, boolean z) {
        C89219l.m154721d(jSONObject, "");
        this.f111173k = jSONObject.optInt("maxSelectNum", 1);
        String optString = jSONObject.optString("source", "");
        C89219l.m154716b(optString, "");
        this.f111174l = optString;
        this.f111175m = jSONObject.optBoolean("isMultiSelect", false);
        String optString2 = jSONObject.optString("from", "");
        C89219l.m154716b(optString2, "");
        this.f111176n = optString2;
        this.f111164a = jSONObject.optInt("image_width", 216);
        String optString3 = jSONObject.optString("encryptURL", "");
        C89219l.m154716b(optString3, "");
        this.f111179q = optString3;
        String optString4 = jSONObject.optString("nameSpace", "");
        C89219l.m154716b(optString4, "");
        this.f111180r = optString4;
        if (this.f111171h.get() != null) {
            if (this.f111175m) {
                Activity activity = this.f111171h.get();
                Objects.requireNonNull(activity, "null cannot be cast to non-null type android.app.Activity");
                Activity activity2 = activity;
                if (C0643b.m2367a(activity2, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                    mo80016a(activity2);
                } else {
                    C35444b.m72473a(activity2, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C47997f(this, activity2));
                }
            } else {
                Activity activity3 = this.f111171h.get();
                Objects.requireNonNull(activity3, "null cannot be cast to non-null type android.app.Activity");
                Activity activity4 = activity3;
                if (C0643b.m2367a(activity4, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                    C30128d.m60944a(activity4);
                } else {
                    C35444b.m72473a(activity4, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C47996e(this, activity4));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.e$b */
    public static final class C47993b {

        /* renamed from: a */
        public final String f111182a;

        /* renamed from: b */
        public final String f111183b;

        /* renamed from: c */
        public final String f111184c;

        static {
            Covode.recordClassIndex(56712);
        }

        public C47993b(String str, String str2, String str3) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            this.f111182a = str;
            this.f111183b = str2;
            this.f111184c = str3;
        }
    }

    public C47991e(WeakReference<Activity> weakReference, AbstractC47909a.C47912a aVar, AbstractC47963m mVar) {
        C89219l.m154721d(weakReference, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(mVar, "");
        this.f111171h = weakReference;
        this.f111181s = aVar;
        this.f111172i = mVar;
    }
}
