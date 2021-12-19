package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.core.p036g.C0692e;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.base.model.user.C2996c;
import com.bytedance.android.live.network.C5809h;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.C11265g;
import com.bytedance.android.livesdkapi.model.C11835a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.web.jsbridge2.AbstractC18334e;
import com.bytedance.ies.web.jsbridge2.C18338g;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.google.gson.p2018a.AbstractC27891c;
import com.google.gson.p2019b.C27895a;
import com.kakao.usermgmt.StringSet;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4570b.C88446a;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bj */
public final class C7132bj extends AbstractC18334e<JSONObject, C7135a> {

    /* renamed from: a */
    public AbstractC88412b f17762a;

    /* renamed from: b */
    String f17763b;

    /* renamed from: c */
    public int f17764c;

    /* renamed from: d */
    private JSONObject f17765d;

    static {
        Covode.recordClassIndex(7878);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bj$a */
    public static final class C7135a {
        @AbstractC27891c(mo46611a = "imageList")

        /* renamed from: a */
        C7136a[] f17769a;

        static {
            Covode.recordClassIndex(7881);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bj$a$a */
        public static final class C7136a {
            @AbstractC27891c(mo46611a = "path")

            /* renamed from: a */
            String f17770a;
            @AbstractC27891c(mo46611a = "status")

            /* renamed from: b */
            int f17771b = 1;
            @AbstractC27891c(mo46611a = "url")

            /* renamed from: c */
            String f17772c;

            static {
                Covode.recordClassIndex(7882);
            }

            C7136a() {
            }
        }

        private C7135a(C7136a[] aVarArr) {
            this.f17769a = aVarArr;
        }

        /* synthetic */ C7135a(C7136a[] aVarArr, byte b) {
            this(aVarArr);
        }
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final void onTerminate() {
        AbstractC88412b bVar = this.f17762a;
        if (bVar != null && !bVar.isDisposed()) {
            this.f17762a.dispose();
        }
    }

    /* renamed from: a */
    public final void mo13368a(C7135a.C7136a[] aVarArr) {
        finishWithResult(new C7135a(aVarArr, (byte) 0));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final /* synthetic */ void invoke(JSONObject jSONObject, C18338g gVar) {
        byte[] bArr;
        String str;
        JSONObject jSONObject2 = jSONObject;
        this.f17765d = jSONObject2.getJSONObject("params");
        this.f17763b = jSONObject2.getString("url");
        JSONArray jSONArray = jSONObject2.getJSONArray("imageList");
        String string = jSONObject2.getString(StringSet.type);
        this.f17764c = 0;
        ArrayList arrayList = new ArrayList();
        final C7135a.C7136a[] aVarArr = new C7135a.C7136a[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                String string2 = jSONArray.getString(i);
                C7135a.C7136a aVar = new C7135a.C7136a();
                aVar.f17770a = string2;
                aVarArr[i] = aVar;
                if (string.equals("path")) {
                    JSONObject jSONObject3 = new JSONObject(string2);
                    bArr = C11265g.m19962a(new File(jSONObject3.getString("uri")));
                    str = jSONObject3.getString("file_name");
                } else {
                    bArr = Base64.decode(string2, 0);
                    str = "upload_photo_" + i + "_" + System.currentTimeMillis();
                }
                if (bArr != null) {
                    arrayList.add(AbstractC88979t.m154294a(new C7137bk(this, bArr, str)).mo143292d(new C7138bl(string2)));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        AbstractC88979t.m154309b((Iterable) arrayList).mo143267a((AbstractC88434g) C88446a.f200695a, true).mo143271a(new C11191f()).mo143062b((AbstractC88986z) new AbstractC88986z<C0692e<String, C5832d<C2996c>>>() {
            /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7132bj.C71331 */

            static {
                Covode.recordClassIndex(7879);
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onComplete() {
                C7132bj.this.mo13368a(aVarArr);
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onError(Throwable th) {
                C7132bj.this.mo13368a(aVarArr);
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onSubscribe(AbstractC88412b bVar) {
                C7132bj.this.f17762a = bVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.AbstractC88986z
            public final /* synthetic */ void onNext(C0692e<String, C5832d<C2996c>> eVar) {
                C0692e<String, C5832d<C2996c>> eVar2 = eVar;
                C7132bj.this.f17764c++;
                C7135a.C7136a[] aVarArr = aVarArr;
                int length = aVarArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    C7135a.C7136a aVar = aVarArr[i];
                    if (!aVar.f17770a.equals(eVar2.f2750a)) {
                        i++;
                    } else if (eVar2.f2751b != null && ((C5832d) eVar2.f2751b).data != null && !TextUtils.isEmpty(((C2996c) ((C5832d) eVar2.f2751b).data).f8817a)) {
                        aVar.f17772c = ((C2996c) ((C5832d) eVar2.f2751b).data).f8817a;
                        aVar.f17771b = 0;
                    }
                }
                int i2 = C7132bj.this.f17764c;
                C7135a.C7136a[] aVarArr2 = aVarArr;
                if (i2 == aVarArr2.length) {
                    C7132bj.this.mo13368a(aVarArr2);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C5832d<C2996c> mo13367a(String str, byte[] bArr, String str2) {
        MethodCollector.m26663i(8410);
        JSONObject jSONObject = this.f17765d;
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart("data", new TypedByteArray("multipart/form-data", bArr, str2));
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                buildUpon.appendQueryParameter(next, String.valueOf(jSONObject.opt(next)));
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            multipartTypedOutput.writeTo(byteArrayOutputStream);
        } catch (IOException unused) {
        }
        C11835a a = C5809h.m12739a().mo11583a(-1, buildUpon.build().toString(), new ArrayList(1), multipartTypedOutput.mimeType(), byteArrayOutputStream.toByteArray(), multipartTypedOutput.length(), multipartTypedOutput.md5Stub()).mo18908a();
        String str3 = new String(a.f28196e);
        if (a.f28193b == 200) {
            C5832d<C2996c> dVar = (C5832d) C4139e.C4140a.f11575b.mo46671a(str3, new C27895a<C5832d<C2996c>>() {
                /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7132bj.C71342 */

                static {
                    Covode.recordClassIndex(7880);
                }
            }.type);
            try {
                if (dVar.statusCode != 0) {
                    dVar.error = (RequestError) C4139e.C4140a.f11575b.mo46670a(new JSONObject(str3).getJSONObject("data").toString(), RequestError.class);
                }
            } catch (JSONException unused2) {
            }
            MethodCollector.m26664o(8410);
            return dVar;
        }
        Exception exc = new Exception();
        MethodCollector.m26664o(8410);
        throw exc;
    }
}
