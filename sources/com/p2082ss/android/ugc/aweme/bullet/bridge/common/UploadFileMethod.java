package com.p2082ss.android.ugc.aweme.bullet.bridge.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.appcompat.widget.C0402ai;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16723b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.ies.web.p1285a.C18297h;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.p1722h.C23154c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34467b;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34471f;
import com.p2082ss.android.ugc.aweme.base.utils.C34717d;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feedback.C50569d;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2440ce.C35444b;
import com.p2082ss.android.ugc.aweme.p2929fe.method.C47937e;
import com.p2082ss.android.ugc.aweme.p2929fe.method.upload.AbstractC47983c;
import com.p2082ss.android.ugc.aweme.p2929fe.method.upload.C48000f;
import com.p2082ss.android.ugc.aweme.p2929fe.method.upload.ImageChooseUploadActivity;
import com.p2082ss.android.ugc.aweme.profile.C63419ae;
import com.p2082ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p2082ss.android.ugc.aweme.utils.C80313cs;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
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
import p078c.p083d.C1762a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.UploadFileMethod */
public class UploadFileMethod extends BaseBridgeMethod implements AbstractC33974au, AbstractC34467b, AbstractC47983c {

    /* renamed from: b */
    protected WeakReference<Context> f82679b;

    /* renamed from: c */
    public int f82680c;

    /* renamed from: d */
    public boolean f82681d;

    /* renamed from: e */
    public BaseBridgeMethod.AbstractC34965a f82682e;

    /* renamed from: f */
    public SparseArray<AvatarUri> f82683f;

    /* renamed from: g */
    public List<String> f82684g = new ArrayList();

    /* renamed from: h */
    public AtomicInteger f82685h;

    /* renamed from: i */
    public AtomicInteger f82686i;

    /* renamed from: j */
    public AbstractC89171a<C89391z> f82687j;

    /* renamed from: k */
    public boolean f82688k;

    /* renamed from: l */
    public int f82689l;

    /* renamed from: m */
    public String f82690m;

    /* renamed from: n */
    public long f82691n = Long.MAX_VALUE;

    /* renamed from: o */
    public boolean f82692o = false;

    /* renamed from: p */
    private String f82693p = "";

    /* renamed from: q */
    private String f82694q;

    /* renamed from: r */
    private boolean f82695r;

    /* renamed from: s */
    private boolean f82696s;

    /* renamed from: t */
    private List<String> f82697t = new ArrayList();

    /* renamed from: u */
    private List<WeakHandler.IHandler> f82698u;

    /* renamed from: v */
    private boolean f82699v = false;

    /* renamed from: w */
    private float f82700w = 1.0f;

    /* renamed from: x */
    private int f82701x = 0;

    /* renamed from: y */
    private int f82702y = 0;

    /* renamed from: z */
    private C16248b f82703z;

    static {
        Covode.recordClassIndex(42161);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return "uploadFile";
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.method.upload.AbstractC47983c
    /* renamed from: l */
    public final void mo61897l() {
        this.f82687j = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.method.upload.AbstractC47983c
    /* renamed from: g */
    public final void mo61896g() {
        this.f82682e.mo61871a(0, "H5_uploadFileCancel");
        this.f82688k = true;
    }

    /* renamed from: m */
    private C1731i<String> m71637m() {
        C1743j jVar = new C1743j();
        try {
            if (this.f82695r || C1756d.m5891a(C17867d.m33078a(), Uri.parse(this.f82694q)) == null) {
                jVar.mo5555a((Object) null);
            } else {
                AVExternalServiceImpl.m113114a().abilityService().processService().compressPhoto(this.f82694q, 216, 384, new C35055b(jVar));
            }
        } catch (Exception e) {
            e.printStackTrace();
            jVar.mo5555a((Object) null);
        } catch (Throwable th) {
            this.f82695r = false;
            this.f82694q = "";
            throw th;
        }
        this.f82695r = false;
        this.f82694q = "";
        return jVar.f5610a;
    }

    /* renamed from: a */
    private void m71636a(int i) {
        this.f82698u = new ArrayList();
        for (final int i2 = 0; i2 < i; i2++) {
            this.f82698u.add(new WeakHandler.IHandler() {
                /* class com.p2082ss.android.ugc.aweme.bullet.bridge.common.UploadFileMethod.C350533 */

                static {
                    Covode.recordClassIndex(42164);
                }

                @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
                public final void handleMsg(Message message) {
                    if (UploadFileMethod.this.f82683f != null && UploadFileMethod.this.f82686i != null && UploadFileMethod.this.f82685h != null && UploadFileMethod.this.f82684g != null && UploadFileMethod.this.f82682e != null && UploadFileMethod.this.f82679b != null && !UploadFileMethod.this.f82688k) {
                        if (message.obj instanceof C34485a) {
                            Activity a = C23154c.m43640a(UploadFileMethod.this.f82679b.get());
                            if (a != null) {
                                new C23144b(a).mo37635a(((C34485a) message.obj).getErrorMsg()).mo37637b();
                            }
                            UploadFileMethod.this.f82683f.put(i2, new AvatarUri());
                            UploadFileMethod.this.f82686i.incrementAndGet();
                        } else if (message.obj instanceof AvatarUri) {
                            AvatarUri avatarUri = (AvatarUri) message.obj;
                            if (C34717d.m70910b(avatarUri.urlList)) {
                                UploadFileMethod.this.f82683f.put(i2, avatarUri);
                                UploadFileMethod.this.f82685h.incrementAndGet();
                            } else {
                                UploadFileMethod.this.f82683f.put(i2, new AvatarUri());
                                UploadFileMethod.this.f82686i.incrementAndGet();
                            }
                        } else {
                            UploadFileMethod.this.f82683f.put(i2, new AvatarUri());
                            UploadFileMethod.this.f82686i.incrementAndGet();
                        }
                        if (UploadFileMethod.this.f82686i.get() + UploadFileMethod.this.f82685h.get() == UploadFileMethod.this.f82684g.size()) {
                            if (UploadFileMethod.this.f82686i.get() == UploadFileMethod.this.f82684g.size()) {
                                UploadFileMethod uploadFileMethod = UploadFileMethod.this;
                                uploadFileMethod.mo61894a(uploadFileMethod.f82683f);
                                UploadFileMethod.this.f82682e.mo61871a(0, "H5_uploadFileFailed");
                            } else {
                                UploadFileMethod uploadFileMethod2 = UploadFileMethod.this;
                                UploadFileMethod.this.f82682e.mo61873a(uploadFileMethod2.mo61894a(uploadFileMethod2.f82683f), 1, "H5_uploadFile");
                            }
                            if (UploadFileMethod.this.f82687j != null) {
                                UploadFileMethod.this.f82687j.invoke();
                            }
                            C50569d.m94803a(UploadFileMethod.this.f82689l);
                        }
                    }
                }
            });
        }
    }

    public UploadFileMethod(C16248b bVar) {
        super(bVar);
        this.f82703z = bVar;
        if (mo26893e() != null) {
            this.f82679b = new WeakReference<>(mo26893e());
        }
    }

    /* renamed from: a */
    public final JSONArray mo61894a(SparseArray<AvatarUri> sparseArray) {
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
                if (i < this.f82697t.size()) {
                    jSONObject.put("img_base64", this.f82697t.get(i));
                }
                jSONArray.put(jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONArray;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        Context context = this.f82679b.get();
        if (context != null) {
            Activity a = C23154c.m43640a(context);
            if ((message.obj instanceof C34485a) && a != null) {
                new C23144b(a).mo37635a(((C34485a) message.obj).getErrorMsg()).mo37637b();
                m71635a(0, "", "");
            } else if (message.obj instanceof AvatarUri) {
                AvatarUri avatarUri = (AvatarUri) message.obj;
                if (avatarUri.urlList == null || avatarUri.urlList.isEmpty()) {
                    m71635a(0, "", "");
                    try {
                        this.f82682e.mo61871a(0, "H5_uploadFileFailed");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        this.f82682e.mo61873a(m71635a(1, avatarUri.urlList.get(0), avatarUri.uri), 1, "H5_uploadFile");
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            } else {
                m71635a(0, "", "");
                try {
                    this.f82682e.mo61871a(0, "H5_uploadFileFailed");
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    private static String m71634a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.method.upload.AbstractC47983c
    /* renamed from: a */
    public final void mo61895a(List<C48000f> list, AbstractC89171a<C89391z> aVar) {
        if (!C34717d.m70908a(list)) {
            this.f82687j = aVar;
            this.f82685h = new AtomicInteger(0);
            this.f82686i = new AtomicInteger(0);
            this.f82684g.clear();
            this.f82697t.clear();
            for (int i = 0; i < list.size(); i++) {
                this.f82684g.add(list.get(i).f111197a);
                this.f82697t.add(list.get(i).f111198b);
            }
            this.f82683f = new SparseArray<>();
            m71636a(this.f82684g.size());
            for (int i2 = 0; i2 < this.f82684g.size(); i2++) {
                String str = this.f82684g.get(i2);
                if (C13627m.m24498a(str)) {
                    this.f82683f.put(i2, new AvatarUri());
                    this.f82686i.incrementAndGet();
                } else {
                    try {
                        if (C1756d.m5891a(C17867d.m33078a(), Uri.parse(str)) == null) {
                            this.f82683f.put(i2, new AvatarUri());
                            this.f82686i.incrementAndGet();
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    String str2 = Api.f79772e + "?uid=" + C31575b.m65865g().getCurUserId();
                    if (!TextUtils.isEmpty(this.f82693p)) {
                        str2 = str2 + "&source=" + this.f82693p;
                    }
                    String a = C1762a.m5918a(mo26893e(), Uri.parse(str));
                    if (a != null && !a.isEmpty()) {
                        C31575b.m65859a();
                        C31575b.f75524a.mo57069e().uploadAvatar(new WeakHandler(this.f82698u.get(i2)), str2, 4194304, C50569d.m94802a(a, new File(a), this.f82689l), null);
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        Context context;
        if (mo61868i() == EnumC16723b.WEB) {
            C18297h a = m71423a(jSONObject);
            JSONObject optJSONObject = jSONObject.optJSONObject("res");
            C18288a aVar2 = (C18288a) this.f82703z.mo25832c(C18288a.class);
            if (this.f82679b != null && aVar2 != null) {
                try {
                    new C47937e(this.f82679b, aVar2).call(a, optJSONObject);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else {
            this.f82682e = aVar;
            String optString = jSONObject.optString(StringSet.type);
            this.f82693p = jSONObject.optString("source");
            this.f82695r = jSONObject.optBoolean("skip_img_base64", false);
            this.f82680c = jSONObject.optInt("maxSelectNum", 1);
            this.f82696s = jSONObject.optBoolean("isMultiSelect", false);
            this.f82681d = jSONObject.optBoolean("shouldWithCamera", false);
            this.f82689l = jSONObject.optInt("image_width", -1);
            this.f82690m = jSONObject.optString("from", "");
            long optLong = jSONObject.optLong("maxFileSize", Long.MAX_VALUE);
            this.f82691n = optLong;
            if (optLong == 0) {
                this.f82691n = Long.MAX_VALUE;
            }
            this.f82692o = jSONObject.optBoolean("needBase64Response", false);
            this.f82699v = jSONObject.optBoolean("isNeedCut", false);
            this.f82701x = jSONObject.optInt("minImageWidth");
            this.f82702y = jSONObject.optInt("minImageHeight");
            int optInt = jSONObject.optInt("cropRatioWidth", 0);
            int optInt2 = jSONObject.optInt("cropRatioHeight", 0);
            if (optInt * optInt2 != 0) {
                this.f82700w = (((float) optInt2) * 1.0f) / ((float) optInt);
            }
            if ("image".equals(optString)) {
                WeakReference<Context> weakReference = this.f82679b;
                if (weakReference != null) {
                    context = weakReference.get();
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
                this.f82688k = false;
                if (this.f82696s) {
                    final Activity activity = (Activity) context;
                    C35444b.m72473a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C35444b.AbstractC35447b() {
                        /* class com.p2082ss.android.ugc.aweme.bullet.bridge.common.UploadFileMethod.C350522 */

                        static {
                            Covode.recordClassIndex(42163);
                        }

                        @Override // com.p2082ss.android.ugc.aweme.p2440ce.C35444b.AbstractC35447b
                        /* renamed from: a */
                        public final void mo53515a(String[] strArr, int[] iArr) {
                            if (iArr != null && iArr.length > 0) {
                                if (iArr[0] == 0) {
                                    Intent intent = new Intent(activity, ImageChooseUploadActivity.class);
                                    intent.putExtra("shouldWithCamera", UploadFileMethod.this.f82681d);
                                    intent.putExtra("maxSelectNum", UploadFileMethod.this.f82680c);
                                    intent.putExtra("maxFileSize", UploadFileMethod.this.f82691n);
                                    intent.putExtra("needBase64Response", UploadFileMethod.this.f82692o);
                                    intent.putExtra("enter_from", UploadFileMethod.this.f82690m);
                                    Activity activity = activity;
                                    C84349a.m145093a(intent, activity);
                                    activity.startActivity(intent);
                                    C39162r.m79460a("enter_image_choose", new C33744d().mo59983a("enter_from", UploadFileMethod.this.f82690m).f79943a);
                                    ImageChooseUploadActivity.f111091i = UploadFileMethod.this;
                                    return;
                                }
                                new C23144b(activity).mo37635a(activity.getString(R.string.dng)).mo37637b();
                                UploadFileMethod.this.mo61896g();
                            }
                        }
                    });
                    return;
                }
                Activity activity2 = (Activity) context;
                C35444b.m72473a(activity2, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C35054a(this, activity2));
            }
        }
    }

    /* renamed from: a */
    private JSONObject m71635a(int i, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        C1731i<String> m = m71637m();
        try {
            m.mo5547f();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String d = m.mo5545d();
        if (d != null) {
            try {
                d = C80313cs.m139233b(d);
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        try {
            jSONObject.put("code", i);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("url", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("uri", str2);
            }
            if (!TextUtils.isEmpty(d)) {
                jSONObject.put("img_base64", d);
            }
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
        return jSONObject;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34467b
    /* renamed from: a */
    public final boolean mo60905a(int i, int i2, Intent intent) {
        Uri uri;
        int i3;
        if (i != 10003) {
            if (i == 10004) {
                if (i2 == 0 || intent == null) {
                    mo61896g();
                } else {
                    Context context = this.f82679b.get();
                    if (context == null) {
                        return true;
                    }
                    String a = C1762a.m5918a(context, intent.getData());
                    if (C13627m.m24498a(a)) {
                        C13628n.m24507a(context, 2131231583, (int) R.string.dok);
                        return true;
                    } else if (!new File(a).exists()) {
                        C13628n.m24507a(context, 2131231583, (int) R.string.dok);
                        return true;
                    } else {
                        String str = Api.f79772e + "?uid=" + C31575b.m65865g().getCurUserId();
                        if (!TextUtils.isEmpty(this.f82693p)) {
                            str = str + "&source=" + this.f82693p;
                        }
                        this.f82694q = a;
                        String a2 = m71634a(intent, "uri");
                        String a3 = m71634a(intent, "url");
                        if (TextUtils.isEmpty(a2) || TextUtils.isEmpty(a3)) {
                            C31575b.m65859a();
                            C31575b.f75524a.mo57069e().uploadAvatar(new WeakHandler(this), str, 4194304, this.f82694q, null);
                            return true;
                        }
                        this.f82682e.mo61873a(m71635a(1, a3, a2), 1, "uploadFile");
                        return true;
                    }
                }
            }
            return true;
        } else if (i2 == 0 || intent == null) {
            mo61896g();
            return true;
        } else {
            Context context2 = this.f82679b.get();
            if (context2 == null) {
                return true;
            }
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_result_selection");
            if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
                uri = intent.getData();
            } else {
                uri = (Uri) parcelableArrayListExtra.get(0);
            }
            if (uri == null || C13627m.m24498a(uri.toString())) {
                C13628n.m24507a(context2, 2131231583, (int) R.string.dok);
                return true;
            }
            try {
                if (C1756d.m5891a(C17867d.m33078a(), uri) == null) {
                    C13628n.m24507a(context2, 2131231583, (int) R.string.dok);
                    return true;
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            if (this.f82699v) {
                if (context2 instanceof Activity) {
                    if (!TextUtils.isEmpty(this.f82693p)) {
                        try {
                            i3 = Integer.parseInt(this.f82693p);
                        } catch (NumberFormatException e2) {
                            e2.printStackTrace();
                        }
                        C63419ae.f143971a.gotoCropActivity((Activity) context2, uri.toString(), false, this.f82700w, (int) C13628n.m24520b(context2, 16.0f), 10004, this.f82701x, this.f82702y, i3, false);
                    }
                    i3 = -1;
                    C63419ae.f143971a.gotoCropActivity((Activity) context2, uri.toString(), false, this.f82700w, (int) C13628n.m24520b(context2, 16.0f), 10004, this.f82701x, this.f82702y, i3, false);
                }
                return true;
            }
            String str2 = Api.f79772e + "?uid=" + C31575b.m65865g().getCurUserId();
            if (!TextUtils.isEmpty(this.f82693p)) {
                str2 = str2 + "&source=" + this.f82693p;
            }
            this.f82694q = uri.toString();
            C31575b.m65859a();
            C31575b.f75524a.mo57069e().uploadAvatar(new WeakHandler(this), str2, 4194304, this.f82694q, null);
            return true;
        }
    }
}
