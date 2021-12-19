package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.base.model.user.C2996c;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p215e.p217b.C3886a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.network.C5809h;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.livesdk.TTLiveFileProvider;
import com.bytedance.android.livesdk.browser.C6935a;
import com.bytedance.android.livesdk.browser.jsbridge.p472c.AbstractC7044a;
import com.bytedance.android.livesdk.browser.p465f.C7019d;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverCropCustomStyleSetting;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.android.livesdk.p437ag.C6670f;
import com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d;
import com.bytedance.android.livesdk.p562k.DialogC9146a;
import com.bytedance.android.livesdk.utils.C11235c;
import com.bytedance.android.livesdk.utils.C11265g;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.utils.crop.C11256a;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.web.jsbridge2.AbstractC18334e;
import com.bytedance.ies.web.jsbridge2.C18338g;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.google.gson.p2018a.AbstractC27891c;
import com.google.gson.p2019b.C27895a;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.trill.R;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.t */
public final class C7206t extends AbstractC18334e<JSONObject, C7218b> implements AbstractC7044a {

    /* renamed from: a */
    final String f17936a;

    /* renamed from: b */
    public AbstractC88412b f17937b;

    /* renamed from: c */
    public Fragment f17938c;

    /* renamed from: d */
    DialogC9146a f17939d;

    /* renamed from: e */
    C18338g f17940e;

    /* renamed from: f */
    public int f17941f;

    /* renamed from: g */
    public String f17942g;

    /* renamed from: h */
    public JSONObject f17943h;

    /* renamed from: i */
    private String f17944i;

    /* renamed from: j */
    private final String f17945j = "upload_photo";

    /* renamed from: k */
    private int f17946k;

    /* renamed from: l */
    private int f17947l;

    /* renamed from: m */
    private int f17948m;

    /* renamed from: n */
    private int f17949n;

    /* renamed from: o */
    private Uri f17950o;

    static {
        Covode.recordClassIndex(7952);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.t$a */
    public static final class C7217a {
        @AbstractC27891c(mo46611a = "uri")

        /* renamed from: a */
        String f17973a;
        @AbstractC27891c(mo46611a = "local_url")

        /* renamed from: b */
        String f17974b;
        @AbstractC27891c(mo46611a = "local_img")

        /* renamed from: c */
        String f17975c;

        static {
            Covode.recordClassIndex(7963);
        }

        C7217a() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.t$b */
    public static final class C7218b {
        @AbstractC27891c(mo46611a = "code")

        /* renamed from: a */
        int f17976a;
        @AbstractC27891c(mo46611a = "status")

        /* renamed from: b */
        int f17977b;
        @AbstractC27891c(mo46611a = "status_msg")

        /* renamed from: c */
        String f17978c;
        @AbstractC27891c(mo46611a = "data")

        /* renamed from: d */
        C7217a f17979d;

        static {
            Covode.recordClassIndex(7964);
        }

        public C7218b() {
        }

        private C7218b(int i, String str, C7217a aVar) {
            this.f17976a = 1;
            this.f17977b = i;
            this.f17978c = str;
            this.f17979d = aVar;
        }

        /* synthetic */ C7218b(int i, String str, C7217a aVar, byte b) {
            this(i, str, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13400a() {
        DialogC9146a aVar = this.f17939d;
        if (aVar != null && aVar.isShowing()) {
            this.f17939d.dismiss();
        }
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final void onTerminate() {
        AbstractC88412b bVar = this.f17937b;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f17938c = null;
        this.f17940e = null;
    }

    /* renamed from: d */
    private static boolean m15115d() {
        if (Build.VERSION.SDK_INT > 29 || LiveCoverCropCustomStyleSetting.INSTANCE.enable()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private Uri m15116e() {
        return m15109a("upload_photo_" + this.f17944i);
    }

    /* renamed from: g */
    private String m15118g() {
        return m15119h() + ".jpeg";
    }

    /* renamed from: h */
    private String m15119h() {
        return "upload_photo_" + this.f17944i;
    }

    /* renamed from: b */
    public final void mo13401b() {
        mo13400a();
        finishWithResult(new C7218b(1, C3966y.m9657a((int) R.string.gk6), new C7217a(), (byte) 0));
    }

    /* renamed from: c */
    public final void mo13402c() {
        mo13400a();
        finishWithResult(new C7218b(1, C3966y.m9657a((int) R.string.gk6), new C7217a(), (byte) 0));
    }

    /* renamed from: f */
    private Uri m15117f() {
        File file = new File(this.f17936a + "/" + m15118g());
        if (!file.exists()) {
            try {
                File file2 = new File(this.f17936a);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file.createNewFile();
            } catch (IOException e) {
                C6555i.m14021b();
                C3854a.m9455a(6, "ttlive_exception", e.getStackTrace());
            }
        }
        return TTLiveFileProvider.getUri(this.f17938c.getActivity(), this.f17938c.getActivity().getPackageName() + ".ttlive_provider", file);
    }

    public C7206t(Fragment fragment) {
        this.f17938c = fragment;
        this.f17936a = C11265g.m19959a();
    }

    /* renamed from: a */
    private void m15110a(Uri uri) {
        C11256a a = C11256a.C11257a.m19949a(uri);
        a.mo18026a(new C7220u(this));
        a.show(this.f17938c.getChildFragmentManager(), "upload_photo");
    }

    /* renamed from: a */
    private Uri m15109a(String str) {
        if (str == null) {
            str = "";
        }
        File file = new File(this.f17936a + "/" + str);
        if (!file.exists()) {
            try {
                File file2 = new File(this.f17936a);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }
        return Uri.fromFile(file);
    }

    /* renamed from: b */
    private void m15113b(Uri uri) {
        C3868c.m9492a("ttlive_upload_cover_want_crop", 0, (JSONObject) null);
        Intent intent = new Intent("com.android.camera.action.CROP");
        intent.addFlags(1);
        intent.addFlags(2);
        intent.setDataAndType(uri, "image/*");
        intent.putExtra("crop", "true");
        intent.putExtra("scale", true);
        intent.putExtra("aspectX", this.f17948m);
        intent.putExtra("aspectY", this.f17949n);
        intent.putExtra("return-data", false);
        intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
        intent.putExtra("noFaceDetection", true);
        intent.putExtra("scaleUpIfNeeded", true);
        Uri e = m15116e();
        if (e != null) {
            intent.putExtra("output", e);
        }
        try {
            Fragment fragment = this.f17938c;
            if (fragment != null) {
                fragment.startActivityForResult(intent, 40002);
                return;
            }
            throw new NullPointerException("getActivity");
        } catch (Exception unused) {
            C13628n.m24506a(this.f17938c.getContext(), (int) R.string.gud);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r2 = com.bytedance.android.livesdk.utils.C11265g.m19961a(r0, r4);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m15114c(final android.net.Uri r4) {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7206t.m15114c(android.net.Uri):void");
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.t$c */
    static class C7219c {

        /* renamed from: a */
        public C5832d<C2996c> f17980a;

        /* renamed from: b */
        public String f17981b;

        static {
            Covode.recordClassIndex(7965);
        }

        public C7219c(String str, C5832d<C2996c> dVar) {
            this.f17980a = dVar;
            this.f17981b = str;
        }
    }

    /* renamed from: a */
    private void m15111a(Uri uri, boolean z) {
        if (uri != null) {
            if (!z) {
                try {
                    String lastPathSegment = uri.getLastPathSegment();
                    int i = Build.VERSION.SDK_INT;
                    if (!C13627m.m24498a(lastPathSegment) && lastPathSegment.contains(":")) {
                        lastPathSegment = lastPathSegment.split(":")[1];
                    }
                    try {
                        uri = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, Long.parseLong(lastPathSegment));
                    } catch (NumberFormatException unused) {
                    }
                } catch (Exception unused2) {
                    return;
                }
            }
            if (m15115d()) {
                m15110a(uri);
            } else {
                m15113b(uri);
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final /* synthetic */ void invoke(JSONObject jSONObject, final C18338g gVar) {
        JSONObject jSONObject2 = jSONObject;
        this.f17940e = gVar;
        String optString = jSONObject2.optString(StringSet.type);
        final JSONObject jSONObject3 = jSONObject2.getJSONObject("args");
        if (jSONObject3 == null) {
            finishWithResult(new C7218b(4, C3966y.m9657a((int) R.string.gtr), new C7217a(), (byte) 0));
            return;
        }
        int optInt = jSONObject3.optInt("action_type", 0);
        this.f17942g = jSONObject3.optString("url");
        this.f17943h = new JSONObject();
        int i = -1;
        if (jSONObject3.getJSONObject("params") != null) {
            JSONObject jSONObject4 = jSONObject3.getJSONObject("params");
            this.f17943h = jSONObject4;
            i = jSONObject4.optInt("encrypt", -1);
        }
        if (TextUtils.isEmpty(this.f17942g) || (!this.f17942g.startsWith("https") && i == 1)) {
            finishWithResult(new C7218b(5, C3966y.m9657a((int) R.string.gk7), new C7217a(), (byte) 0));
            return;
        }
        ActivityC0945e a = C11279p.m20001a(gVar.f43859a);
        if (a == null || !TextUtils.equals("video", optString)) {
            if (TextUtils.equals("picture", optString)) {
                this.f17944i = String.valueOf(System.currentTimeMillis());
                this.f17947l = jSONObject3.optInt("min_width");
                this.f17946k = jSONObject3.optInt("min_height");
                this.f17948m = jSONObject3.optInt("aspect_x", 1);
                this.f17949n = jSONObject3.optInt("aspect_y", 1);
                ActivityC0945e activity = this.f17938c.getActivity();
                if (optInt == 0) {
                    C6935a.m14800a(activity, this.f17938c, this.f17936a, m15118g());
                } else if (optInt == 1) {
                    C6935a.m14799a(activity, this.f17938c);
                }
            }
        } else if (optInt == 0) {
            C6670f.m14183a(a).mo12816a(new AbstractC6656d() {
                /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7206t.C72071 */

                static {
                    Covode.recordClassIndex(7953);
                }

                @Override // com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d
                /* renamed from: b */
                public final void mo11014b(String... strArr) {
                    C13628n.m24507a(gVar.f43859a, 2131234335, (int) R.string.gj4);
                    C7206t.this.finishWithFailure();
                }

                @Override // com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d
                /* renamed from: a */
                public final void mo11013a(String... strArr) {
                    Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                    intent.putExtra("android.intent.extra.durationLimit", jSONObject3.optInt("duration_limit", 10000) / 1000);
                    intent.putExtra("android.intent.extra.videoQuality", 1);
                    if (C7206t.this.f17938c.getActivity() == null) {
                        C7206t.this.finishWithFailure();
                    } else {
                        C7206t.this.f17938c.startActivityForResult(intent, 9001);
                    }
                }
            }, "android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE");
        } else if (optInt == 1) {
            C6670f.m14183a(a).mo12816a(new AbstractC6656d() {
                /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7206t.C72103 */

                static {
                    Covode.recordClassIndex(7956);
                }

                @Override // com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d
                /* renamed from: b */
                public final void mo11014b(String... strArr) {
                    C13628n.m24507a(gVar.f43859a, 2131234335, (int) R.string.gj4);
                    C7206t.this.finishWithFailure();
                }

                @Override // com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d
                /* renamed from: a */
                public final void mo11013a(String... strArr) {
                    Intent intent = new Intent("android.intent.action.GET_CONTENT");
                    if (jSONObject3.optInt("duration_limit", -1) != -1) {
                        C7206t.this.finishWithResult(new C7218b(1, "Local video does not support duration_limit parameter", new C7217a(), (byte) 0));
                        return;
                    }
                    intent.setType("video/*");
                    if (C7206t.this.f17938c.getActivity() == null) {
                        C7206t.this.finishWithFailure();
                    } else {
                        C7206t.this.f17938c.startActivityForResult(intent, 9002);
                    }
                }
            }, "android.permission.READ_EXTERNAL_STORAGE");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0078  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m15112a(android.net.Uri r8, int r9, int r10) {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7206t.m15112a(android.net.Uri, int, int):boolean");
    }

    /* renamed from: a */
    public final C5832d<C2996c> mo13399a(String str, byte[] bArr, JSONObject jSONObject) {
        MethodCollector.m26663i(6221);
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart("data", new TypedByteArray("multipart/form-data", bArr, "upload_photo_" + this.f17944i + "crop"));
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
        } catch (IOException e) {
            C3854a.m9460b("EncryptedUploadMethod", "uploadFile", e);
        }
        String uri = buildUpon.build().toString();
        C3854a.m9453a(3, "EncryptedUploadMethod", uri);
        String str2 = new String(C5809h.m12739a().mo11583a(-1, uri, new ArrayList(1), multipartTypedOutput.mimeType(), byteArrayOutputStream.toByteArray(), multipartTypedOutput.length(), multipartTypedOutput.md5Stub()).mo18908a().f28196e);
        C5832d<C2996c> dVar = (C5832d) C4139e.C4140a.f11575b.mo46671a(str2, new C27895a<C5832d<C2996c>>() {
            /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7206t.C72092 */

            static {
                Covode.recordClassIndex(7955);
            }
        }.type);
        try {
            if (dVar.statusCode != 0) {
                dVar.error = (RequestError) C4139e.C4140a.f11575b.mo46670a(new JSONObject(str2).getJSONObject("data").toString(), RequestError.class);
            }
        } catch (JSONException e2) {
            C3854a.m9460b("EncryptedUploadMethod", "uploadFile", e2);
        }
        MethodCollector.m26664o(6221);
        return dVar;
    }

    @Override // com.bytedance.android.livesdk.browser.jsbridge.p472c.AbstractC7044a
    /* renamed from: a */
    public final void mo13336a(int i, int i2, final Intent intent) {
        if (9001 == i || 9002 == i) {
            if (-1 != i2) {
                finishWithResult(new C7218b(2, C3966y.m9657a((int) R.string.gk5), new C7217a(), (byte) 0));
            } else if (intent == null || intent.getData() == null) {
                mo13401b();
            } else {
                ActivityC0945e activity = this.f17938c.getActivity();
                if (activity == null) {
                    mo13401b();
                    return;
                }
                final byte[] a = C11265g.m19961a(activity, intent.getData());
                DialogC9146a.C9147a aVar = new DialogC9146a.C9147a(activity);
                aVar.f22147b = C3966y.m9657a((int) R.string.gqr);
                aVar.f22148c = false;
                DialogC9146a a2 = aVar.mo15240a();
                this.f17939d = a2;
                a2.show();
                C6670f.m14183a(this.f17938c.getActivity()).mo12816a(new AbstractC6656d() {
                    /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7206t.C72114 */

                    static {
                        Covode.recordClassIndex(7957);
                    }

                    @Override // com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d
                    /* renamed from: b */
                    public final void mo11014b(String... strArr) {
                        C3854a.m9453a(3, "EncryptedUploadMethod", "onPermissionDenied: ");
                    }

                    @Override // com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d
                    /* renamed from: a */
                    public final void mo11013a(String... strArr) {
                        C7206t tVar = C7206t.this;
                        byte[] bArr = a;
                        Uri data = intent.getData();
                        AbstractC88979t.m154294a(new C7221v(tVar, data)).mo143267a((AbstractC88434g) new AbstractC88434g<String, AbstractC88984x<C7219c>>(bArr) {
                            /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7206t.C72158 */

                            /* renamed from: a */
                            final /* synthetic */ byte[] f17968a;

                            static {
                                Covode.recordClassIndex(7961);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4560f.p4561a.p4567d.AbstractC88434g
                            public final /* synthetic */ AbstractC88984x<C7219c> apply(String str) {
                                return AbstractC88979t.m154294a(new C7224y(this, this.f17968a, str));
                            }

                            {
                                this.f17968a = r2;
                            }
                        }, false).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143255a(new AbstractC88433f<C7219c>(data) {
                            /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7206t.C72125 */

                            /* renamed from: a */
                            final /* synthetic */ Uri f17964a;

                            static {
                                Covode.recordClassIndex(7958);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4560f.p4561a.p4567d.AbstractC88433f
                            public final /* synthetic */ void accept(C7219c cVar) {
                                C7219c cVar2 = cVar;
                                C7206t tVar = C7206t.this;
                                C2996c cVar3 = (C2996c) cVar2.f17980a.data;
                                Uri uri = this.f17964a;
                                String str = cVar2.f17981b;
                                tVar.mo13400a();
                                try {
                                    C7217a aVar = new C7217a();
                                    aVar.f17973a = cVar3.f8817a;
                                    C7019d.m14971a();
                                    aVar.f17974b = C7019d.m14972a(tVar.callContext.f43859a, uri);
                                    C7019d.m14971a();
                                    aVar.f17975c = C7019d.m14973a(str);
                                    C7218b bVar = new C7218b(0, C3966y.m9657a((int) R.string.gk8), aVar, (byte) 0);
                                    tVar.f17940e.mo29356a("H5_uploadVideoStatus", bVar);
                                    tVar.finishWithResult(bVar);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }

                            {
                                this.f17964a = r2;
                            }
                        }, new AbstractC88433f<Throwable>() {
                            /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7206t.C72136 */

                            static {
                                Covode.recordClassIndex(7959);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // p4560f.p4561a.p4567d.AbstractC88433f
                            public final /* synthetic */ void accept(Throwable th) {
                                Context context;
                                Throwable th2 = th;
                                if (!(C7206t.this.f17938c == null || (context = C7206t.this.f17938c.getContext()) == null)) {
                                    C3886a.m9503a(context, th2, null);
                                }
                                C7206t.this.mo13401b();
                            }
                        }, new AbstractC88428a() {
                            /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7206t.C72147 */

                            static {
                                Covode.recordClassIndex(7960);
                            }

                            @Override // p4560f.p4561a.p4567d.AbstractC88428a
                            /* renamed from: a */
                            public final void mo8579a() {
                            }
                        });
                    }
                }, "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
            }
        } else if (i == 40003) {
            if (-1 != i2) {
                finishWithResult(new C7218b(2, C3966y.m9657a((int) R.string.gk5), new C7217a(), (byte) 0));
            } else if (intent == null || intent.getData() == null) {
                mo13402c();
            } else {
                ActivityC0945e activity2 = this.f17938c.getActivity();
                if (activity2 == null) {
                    mo13402c();
                    return;
                }
                Uri data = intent.getData();
                String a3 = C11235c.m19906a(activity2, data);
                if (C13627m.m24498a(a3)) {
                    mo13402c();
                } else if (!new File(a3).exists()) {
                    mo13402c();
                } else {
                    if ("file".equals(data.getScheme())) {
                        data = C11235c.m19905a(activity2, a3);
                    }
                    m15111a(data, false);
                }
            }
        } else if (i == 40004) {
            if (-1 != i2) {
                finishWithResult(new C7218b(2, C3966y.m9657a((int) R.string.gk5), new C7217a(), (byte) 0));
                return;
            }
            try {
                m15111a(m15117f(), true);
            } catch (Exception unused) {
            }
        } else if (i != 40002) {
        } else {
            if (-1 != i2) {
                finishWithResult(new C7218b(2, C3966y.m9657a((int) R.string.gk5), new C7217a(), (byte) 0));
                return;
            }
            ActivityC0945e activity3 = this.f17938c.getActivity();
            if (activity3 == null) {
                mo13402c();
                return;
            }
            Uri uri = this.f17950o;
            if (uri == null) {
                C13628n.m24507a(activity3, 2131234335, (int) R.string.gub);
                mo13402c();
            } else if (!m15112a(uri, this.f17947l, this.f17946k)) {
                C6935a.m14799a(activity3, this.f17938c);
            } else {
                m15114c(this.f17950o);
            }
        }
    }
}
