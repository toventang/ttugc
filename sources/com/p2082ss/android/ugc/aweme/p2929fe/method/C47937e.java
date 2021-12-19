package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.appcompat.widget.C0402ai;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.ies.web.p1285a.C18297h;
import com.bytedance.tux.p1721g.C23144b;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.newmedia.C30128d;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34467b;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34471f;
import com.p2082ss.android.ugc.aweme.base.utils.C34717d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feedback.C50569d;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2440ce.C35444b;
import com.p2082ss.android.ugc.aweme.p2929fe.method.upload.AbstractC47983c;
import com.p2082ss.android.ugc.aweme.p2929fe.method.upload.C48000f;
import com.p2082ss.android.ugc.aweme.p2929fe.method.upload.ImageChooseUploadActivity;
import com.p2082ss.android.ugc.aweme.p2929fe.p2930a.C47806b;
import com.p2082ss.android.ugc.aweme.profile.C63419ae;
import com.p2082ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80437fl;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import com.zhihu.matisse.C87936a;
import com.zhihu.matisse.EnumC87938b;
import com.zhihu.matisse.internal.entity.C87955b;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.p4511a.AbstractC87937a;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.C1731i;
import p077b.C1743j;
import p078c.p080b.C1756d;
import p078c.p080b.C1757e;
import p078c.p083d.C1762a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* renamed from: com.ss.android.ugc.aweme.fe.method.e */
public final class C47937e implements AbstractC18293d, AbstractC34467b, AbstractC47983c {

    /* renamed from: a */
    protected WeakReference<Context> f111019a;

    /* renamed from: b */
    protected C18288a f111020b;

    /* renamed from: c */
    public long f111021c = Long.MAX_VALUE;

    /* renamed from: d */
    private String f111022d = "";

    /* renamed from: e */
    private String f111023e;

    /* renamed from: f */
    private boolean f111024f;

    /* renamed from: g */
    private int f111025g;

    /* renamed from: h */
    private boolean f111026h;

    /* renamed from: i */
    private boolean f111027i;

    /* renamed from: j */
    private SparseArray<AvatarUri> f111028j;

    /* renamed from: k */
    private List<String> f111029k = new ArrayList();

    /* renamed from: l */
    private List<String> f111030l = new ArrayList();

    /* renamed from: m */
    private AtomicInteger f111031m;

    /* renamed from: n */
    private AtomicInteger f111032n;

    /* renamed from: o */
    private AbstractC89171a<C89391z> f111033o;

    /* renamed from: p */
    private List<WeakHandler.IHandler> f111034p;

    /* renamed from: q */
    private boolean f111035q;

    /* renamed from: r */
    private int f111036r;

    /* renamed from: s */
    private String f111037s;

    /* renamed from: t */
    private boolean f111038t = false;

    /* renamed from: u */
    private boolean f111039u = false;

    /* renamed from: v */
    private float f111040v = 1.0f;

    /* renamed from: w */
    private int f111041w = 0;

    /* renamed from: x */
    private int f111042x = 0;

    static {
        Covode.recordClassIndex(56645);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.method.upload.AbstractC47983c
    /* renamed from: l */
    public final void mo61897l() {
        this.f111033o = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo79951a(Activity activity, int[] iArr) {
        if (iArr != null && iArr.length > 0) {
            if (iArr[0] == 0) {
                Intent intent = new Intent(activity, ImageChooseUploadActivity.class);
                intent.putExtra("shouldWithCamera", this.f111027i);
                intent.putExtra("maxSelectNum", this.f111025g);
                intent.putExtra("maxFileSize", this.f111021c);
                intent.putExtra("needBase64Response", this.f111038t);
                intent.putExtra("enter_from", this.f111037s);
                C84349a.m145093a(intent, activity);
                activity.startActivity(intent);
                C39162r.m79460a("enter_image_choose", new C33744d().mo59983a("enter_from", this.f111037s).f79943a);
                ImageChooseUploadActivity.f111091i = this;
                return;
            }
            new C79459a(activity).mo123052a(activity.getString(R.string.dng)).mo123053a();
            m90922a("image", "0");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34467b
    /* renamed from: a */
    public final boolean mo60905a(int i, int i2, Intent intent) {
        Uri uri;
        int i3;
        if (i != 10003) {
            if (i == 10004) {
                if (i2 == 0 || intent == null) {
                    m90922a("image", "1");
                } else {
                    Context a = m90916a(this.f111019a.get());
                    if (a == null) {
                        return true;
                    }
                    String a2 = C1762a.m5918a(a, intent.getData());
                    if (C13627m.m24498a(a2)) {
                        new C23144b(this.f111020b.f43654d).mo37636b(2131231583).mo37640e(R.string.dok).mo37637b();
                        return true;
                    } else if (!new File(a2).exists()) {
                        new C23144b(this.f111020b.f43654d).mo37636b(2131231583).mo37640e(R.string.dok).mo37637b();
                        return true;
                    } else {
                        this.f111023e = a2;
                        String a3 = m90918a(intent, "uri");
                        String a4 = m90918a(intent, "url");
                        if (TextUtils.isEmpty(a3) || TextUtils.isEmpty(a4)) {
                            String str = Api.f79772e + "?uid=" + C31575b.m65865g().getCurUserId();
                            if (!TextUtils.isEmpty(this.f111022d)) {
                                str = str + "&source=" + this.f111022d;
                            }
                            C31575b.m65859a();
                            C31575b.f75524a.mo57069e().uploadAvatar(new WeakHandler(this), str, 4194304, this.f111023e, null);
                            return true;
                        }
                        m90923a("image", m90920a(1, a4, a3));
                        return true;
                    }
                }
            }
            return true;
        } else if (i2 == 0 || intent == null) {
            m90922a("image", "1");
            return true;
        } else {
            Context a5 = m90916a(this.f111019a.get());
            if (a5 == null) {
                return true;
            }
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_result_selection");
            if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
                uri = intent.getData();
            } else {
                uri = (Uri) parcelableArrayListExtra.get(0);
            }
            if (uri == null || C13627m.m24498a(uri.toString())) {
                new C23144b(this.f111020b.f43654d).mo37636b(2131231583).mo37640e(R.string.dok).mo37637b();
                return true;
            }
            try {
                if (C1756d.m5891a(C17867d.m33078a(), uri) == null) {
                    new C23144b(this.f111020b.f43654d).mo37636b(2131231583).mo37640e(R.string.dok).mo37637b();
                    return true;
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            if (this.f111039u) {
                if (a5 instanceof Activity) {
                    if (!TextUtils.isEmpty(this.f111022d)) {
                        try {
                            i3 = Integer.parseInt(this.f111022d);
                        } catch (NumberFormatException e2) {
                            e2.printStackTrace();
                        }
                        C63419ae.f143971a.gotoCropActivity((Activity) a5, uri.toString(), false, this.f111040v, (int) C13628n.m24520b(a5, 16.0f), 10004, this.f111041w, this.f111042x, i3, false);
                    }
                    i3 = -1;
                    C63419ae.f143971a.gotoCropActivity((Activity) a5, uri.toString(), false, this.f111040v, (int) C13628n.m24520b(a5, 16.0f), 10004, this.f111041w, this.f111042x, i3, false);
                }
                return true;
            }
            this.f111023e = uri.toString();
            String str2 = Api.f79772e + "?uid=" + C31575b.m65865g().getCurUserId();
            if (!TextUtils.isEmpty(this.f111022d)) {
                str2 = str2 + "&source=" + this.f111022d;
            }
            C31575b.m65859a();
            C31575b.f75524a.mo57069e().uploadAvatar(new WeakHandler(this), str2, 4194304, this.f111023e, null);
            return true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.method.upload.AbstractC47983c
    /* renamed from: a */
    public final void mo61895a(List<C48000f> list, AbstractC89171a<C89391z> aVar) {
        if (!C34717d.m70908a(list)) {
            this.f111033o = aVar;
            this.f111031m = new AtomicInteger(0);
            this.f111032n = new AtomicInteger(0);
            this.f111029k.clear();
            this.f111030l.clear();
            for (int i = 0; i < list.size(); i++) {
                this.f111029k.add(list.get(i).f111197a);
                this.f111030l.add(list.get(i).f111198b);
            }
            this.f111028j = new SparseArray<>();
            m90921a(this.f111029k.size());
            for (int i2 = 0; i2 < this.f111029k.size(); i2++) {
                String str = this.f111029k.get(i2);
                if (C13627m.m24498a(str)) {
                    this.f111028j.put(i2, new AvatarUri());
                    this.f111032n.incrementAndGet();
                } else {
                    try {
                        if (C1756d.m5891a(C17867d.m33078a(), Uri.parse(str)) == null) {
                            this.f111028j.put(i2, new AvatarUri());
                            this.f111032n.incrementAndGet();
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    String str2 = Api.f79772e + "?uid=" + C31575b.m65865g().getCurUserId();
                    if (!TextUtils.isEmpty(this.f111022d)) {
                        str2 = str2 + "&source=" + this.f111022d;
                    }
                    String a = C47806b.m90822a(str);
                    if (a != null && !a.isEmpty()) {
                        C31575b.m65859a();
                        C31575b.f75524a.mo57069e().uploadAvatar(new WeakHandler(this.f111034p.get(i2)), str2, 4194304, C50569d.m94802a(a, new File(a), this.f111036r), null);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo79950a(int i, Message message) {
        if (this.f111028j != null && this.f111032n != null && this.f111031m != null && this.f111029k != null && this.f111019a != null && !this.f111035q) {
            if (message.obj instanceof C34485a) {
                Context a = m90916a(this.f111019a.get());
                if (a != null) {
                    new C79459a(a).mo123052a(((C34485a) message.obj).getErrorMsg()).mo123053a();
                }
                this.f111028j.put(i, new AvatarUri());
                this.f111032n.incrementAndGet();
            } else if (message.obj instanceof AvatarUri) {
                AvatarUri avatarUri = (AvatarUri) message.obj;
                if (C34717d.m70910b(avatarUri.urlList)) {
                    this.f111028j.put(i, avatarUri);
                    this.f111031m.incrementAndGet();
                } else {
                    this.f111028j.put(i, new AvatarUri());
                    this.f111032n.incrementAndGet();
                }
            } else {
                this.f111028j.put(i, new AvatarUri());
                this.f111032n.incrementAndGet();
            }
            if (this.f111032n.get() + this.f111031m.get() == this.f111029k.size()) {
                if (this.f111032n.get() == this.f111029k.size()) {
                    m90923a("image", m90920a(0, "", ""));
                } else {
                    JSONArray a2 = m90919a(this.f111028j);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(StringSet.type, "image");
                        jSONObject.put("args", a2);
                        jSONObject.put("msg", "H5_uploadFile");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    C18288a aVar = this.f111020b;
                    if (aVar != null) {
                        aVar.mo29252b("H5_uploadFile", jSONObject);
                    }
                }
                AbstractC89171a<C89391z> aVar2 = this.f111033o;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
                C50569d.m94803a(this.f111036r);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.method.upload.AbstractC47983c
    /* renamed from: g */
    public final void mo61896g() {
        m90922a("image", "1");
        this.f111035q = true;
    }

    /* renamed from: a */
    private C1731i<String> m90917a() {
        C1743j jVar = new C1743j();
        try {
            if (this.f111024f || C1756d.m5891a(C17867d.m33078a(), Uri.parse(this.f111023e)) == null) {
                jVar.mo5555a((Object) null);
            } else {
                AVExternalServiceImpl.m113114a().abilityService().processService().compressPhoto(this.f111023e, 216, 384, new C47955h(jVar));
            }
        } catch (Exception e) {
            e.printStackTrace();
            jVar.mo5555a((Object) null);
        } catch (Throwable th) {
            this.f111024f = false;
            this.f111023e = "";
            throw th;
        }
        this.f111024f = false;
        this.f111023e = "";
        return jVar.f5610a;
    }

    /* renamed from: a */
    private static Context m90916a(Context context) {
        while (context != null) {
            if ((context instanceof Activity) || !(context instanceof ContextWrapper)) {
                return context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* renamed from: a */
    private void m90921a(int i) {
        this.f111034p = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            this.f111034p.add(new C47956i(this, i2));
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        JSONObject a;
        Context a2 = m90916a(this.f111019a.get());
        if (a2 != null) {
            if (message.obj instanceof C34485a) {
                new C79459a(a2).mo123052a(((C34485a) message.obj).getErrorMsg()).mo123053a();
            } else if (message.obj instanceof AvatarUri) {
                AvatarUri avatarUri = (AvatarUri) message.obj;
                if (avatarUri.urlList == null || avatarUri.urlList.isEmpty()) {
                    a = m90920a(0, "", "");
                } else {
                    a = m90920a(1, avatarUri.urlList.get(0), avatarUri.uri);
                }
                m90923a("image", a);
            }
            a = m90920a(0, "", "");
            m90923a("image", a);
        }
    }

    /* renamed from: a */
    private JSONArray m90919a(SparseArray<AvatarUri> sparseArray) {
        String str;
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            JSONObject jSONObject = new JSONObject();
            String str2 = "";
            if (sparseArray.get(i) == null || !C34717d.m70910b(sparseArray.get(i).urlList)) {
                str = str2;
            } else {
                str = sparseArray.get(i).uri;
                str2 = sparseArray.get(i).urlList.get(0);
            }
            try {
                jSONObject.put("url", str2);
                jSONObject.put("uri", str);
                if (i < this.f111030l.size()) {
                    jSONObject.put("img_base64", this.f111030l.get(i));
                }
                jSONArray.put(jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    private static String m90918a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public C47937e(WeakReference<Context> weakReference, C18288a aVar) {
        this.f111019a = weakReference;
        this.f111020b = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo79952b(Activity activity, int[] iArr) {
        if (iArr != null && iArr.length > 0) {
            if (iArr[0] == 0) {
                try {
                    C87936a.m152942a(activity).mo142434a(EnumC87938b.ofImage()).mo142439a().mo142444c().mo142440a(1).mo142445d().mo142442b().mo142441a(new AbstractC87937a() {
                        /* class com.p2082ss.android.ugc.aweme.p2929fe.method.C47937e.C479381 */

                        static {
                            Covode.recordClassIndex(56646);
                        }

                        @Override // com.zhihu.matisse.p4511a.AbstractC87937a
                        /* renamed from: a */
                        public final C87955b mo61898a(Context context, Item item) {
                            Uri uri = item.f199738c;
                            if (uri == null || C13627m.m24498a(uri.toString())) {
                                return new C87955b(context.getString(R.string.doo), (byte) 0);
                            }
                            try {
                                if (C1756d.m5891a(C17867d.m33078a(), uri) == null) {
                                    return new C87955b(context.getString(R.string.doo), (byte) 0);
                                }
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            }
                            if (C47937e.this.f111021c == 0 || C1757e.m5900a(C17867d.m33078a(), uri) <= C47937e.this.f111021c) {
                                return null;
                            }
                            return new C87955b(context.getString(R.string.dq, C80437fl.m139445a(C47937e.this.f111021c)), (byte) 0);
                        }
                    }).mo142443b(10003);
                } catch (Exception e) {
                    C51423a.m95788a("", e);
                    C30128d.m60944a(activity);
                }
            } else {
                new C79459a(activity).mo123052a(activity.getString(R.string.dng)).mo123053a();
                mo61896g();
            }
        }
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(C18297h hVar, JSONObject jSONObject) {
        Context context;
        String string = hVar.f43671d.getString(StringSet.type);
        this.f111022d = "";
        if (TextUtils.equals("image", string)) {
            this.f111022d = hVar.f43671d.optString("source");
            this.f111024f = hVar.f43671d.optBoolean("skip_img_base64", false);
            this.f111025g = hVar.f43671d.optInt("maxSelectNum", 1);
            this.f111026h = hVar.f43671d.optBoolean("isMultiSelect", false);
            this.f111027i = hVar.f43671d.optBoolean("shouldWithCamera", false);
            this.f111036r = hVar.f43671d.optInt("image_width", -1);
            this.f111037s = hVar.f43671d.optString("from", "");
            long optLong = hVar.f43671d.optLong("maxFileSize", Long.MAX_VALUE);
            this.f111021c = optLong;
            if (optLong == 0) {
                this.f111021c = Long.MAX_VALUE;
            }
            this.f111038t = hVar.f43671d.optBoolean("needBase64Response", false);
            this.f111039u = hVar.f43671d.optBoolean("isNeedCut", false);
            this.f111041w = hVar.f43671d.optInt("minImageWidth");
            this.f111042x = hVar.f43671d.optInt("minImageHeight");
            int optInt = hVar.f43671d.optInt("cropRatioWidth", 0);
            int optInt2 = hVar.f43671d.optInt("cropRatioHeight", 0);
            if (optInt * optInt2 != 0) {
                this.f111040v = (((float) optInt2) * 1.0f) / ((float) optInt);
            }
            WeakReference<Context> weakReference = this.f111019a;
            if (weakReference != null) {
                context = m90916a(weakReference.get());
            } else {
                context = null;
            }
            if (context instanceof AbstractC34471f) {
                ((AbstractC34471f) context).setActivityResultListener(this);
            } else if (context instanceof C0402ai) {
                context = ((C0402ai) context).getBaseContext();
                if (context instanceof AbstractC34471f) {
                    ((AbstractC34471f) context).setActivityResultListener(this);
                } else {
                    return;
                }
            } else {
                return;
            }
            jSONObject.put("code", 1);
            this.f111035q = false;
            if (this.f111026h) {
                Activity activity = (Activity) context;
                C35444b.m72473a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C47954g(this, activity));
                return;
            }
            Activity activity2 = (Activity) context;
            C35444b.m72473a(activity2, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C47939f(this, activity2));
        }
    }

    /* renamed from: a */
    private void m90922a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("reason", str2);
            jSONObject.put("code", 1);
            jSONObject2.put(StringSet.type, str);
            jSONObject2.put("args", jSONObject);
            jSONObject2.put("msg", "H5_uploadFileCancel");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C18288a aVar = this.f111020b;
        if (aVar != null) {
            aVar.mo29252b("H5_uploadFileCancel", jSONObject2);
        }
    }

    /* renamed from: a */
    private void m90923a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(StringSet.type, str);
            jSONObject2.put("args", jSONObject);
            jSONObject2.put("msg", "H5_uploadFile");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C18288a aVar = this.f111020b;
        if (aVar != null) {
            aVar.mo29252b("H5_uploadFile", jSONObject2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033 A[Catch:{ JSONException -> 0x004f }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003e A[Catch:{ JSONException -> 0x004f }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0049 A[Catch:{ JSONException -> 0x004f }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONObject m90920a(int r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            b.i r1 = r3.m90917a()
            r1.mo5547f()     // Catch:{ InterruptedException -> 0x000d }
            goto L_0x0011
        L_0x000d:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0011:
            java.lang.Object r0 = r1.mo5545d()
            if (r0 == 0) goto L_0x0026
            java.lang.Object r0 = r1.mo5545d()     // Catch:{ IOException -> 0x0022 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x0022 }
            java.lang.String r1 = com.p2082ss.android.ugc.aweme.utils.C80313cs.m139233b(r0)     // Catch:{ IOException -> 0x0022 }
            goto L_0x0028
        L_0x0022:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0026:
            java.lang.String r1 = ""
        L_0x0028:
            java.lang.String r0 = "code"
            r2.put(r0, r4)     // Catch:{ JSONException -> 0x004f }
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ JSONException -> 0x004f }
            if (r0 != 0) goto L_0x0038
            java.lang.String r0 = "url"
            r2.put(r0, r5)     // Catch:{ JSONException -> 0x004f }
        L_0x0038:
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ JSONException -> 0x004f }
            if (r0 != 0) goto L_0x0043
            java.lang.String r0 = "uri"
            r2.put(r0, r6)     // Catch:{ JSONException -> 0x004f }
        L_0x0043:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x004f }
            if (r0 != 0) goto L_0x0053
            java.lang.String r0 = "img_base64"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x004f }
            goto L_0x0053
        L_0x004f:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0053:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2929fe.method.C47937e.m90920a(int, java.lang.String, java.lang.String):org.json.JSONObject");
    }
}
