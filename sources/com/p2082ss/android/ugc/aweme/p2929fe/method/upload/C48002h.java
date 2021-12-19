package com.p2082ss.android.ugc.aweme.p2929fe.method.upload;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61338a;
import com.p2082ss.android.ugc.aweme.p2440ce.C35444b;
import com.p2082ss.android.ugc.aweme.p2929fe.method.AbstractC47909a;
import com.p2082ss.android.ugc.aweme.p2929fe.method.AbstractC47963m;
import com.p2082ss.android.ugc.aweme.p2929fe.method.upload.GetUploadConfigService;
import com.p2082ss.android.ugc.aweme.p2929fe.method.upload.config.UploadAuthConfig;
import com.p2082ss.android.ugc.aweme.p2929fe.method.upload.config.UploadConfig;
import com.p2082ss.android.ugc.aweme.p2929fe.method.upload.response.C48014a;
import com.p2082ss.android.ugc.aweme.p2929fe.method.upload.response.C48015b;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63212bb;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.permission.C80620e;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ttuploader.TTVideoInfo;
import com.p2082ss.ttuploader.TTVideoUploader;
import com.p2082ss.ttuploader.TTVideoUploaderListener;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Objects;
import org.apache.commons.codec.binary.Base64;
import org.json.JSONArray;
import org.json.JSONObject;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p078c.p080b.C1757e;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;

/* renamed from: com.ss.android.ugc.aweme.fe.method.upload.h */
public class C48002h implements AbstractC47982b {

    /* renamed from: h */
    public static final C48003a f111199h = new C48003a((byte) 0);

    /* renamed from: a */
    private GetUploadConfigService.UploadConfigService f111200a = new GetUploadConfigService().f111088a;

    /* renamed from: d */
    protected TTVideoUploader f111201d;

    /* renamed from: e */
    public WeakReference<Activity> f111202e;

    /* renamed from: f */
    public AbstractC47909a.C47912a f111203f;

    /* renamed from: g */
    public AbstractC47963m f111204g;

    static {
        Covode.recordClassIndex(56721);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.h$a */
    public static final class C48003a {
        static {
            Covode.recordClassIndex(56722);
        }

        private C48003a() {
        }

        public /* synthetic */ C48003a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final TTVideoUploader mo80021b() {
        TTVideoUploader tTVideoUploader = this.f111201d;
        if (tTVideoUploader == null) {
            C89219l.m154710a("uploader");
        }
        return tTVideoUploader;
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.h$c */
    static final class C48005c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C48002h f111206a;

        static {
            Covode.recordClassIndex(56724);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48005c(C48002h hVar) {
            super(0);
            this.f111206a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C48002h hVar = this.f111206a;
            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
            Activity activity = hVar.f111202e.get();
            if (activity != null) {
                activity.startActivityForResult(intent, 800);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.h$d */
    static final class C48006d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C48002h f111207a;

        static {
            Covode.recordClassIndex(56725);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48006d(C48002h hVar) {
            super(0);
            this.f111207a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C48002h hVar = this.f111207a;
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("video/*");
            Activity activity = hVar.f111202e.get();
            if (activity != null) {
                activity.startActivityForResult(intent, 700);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.h$e */
    public static final class C48007e implements AbstractC63212bb.AbstractC63213a {

        /* renamed from: a */
        final /* synthetic */ C48002h f111208a;

        /* renamed from: b */
        final /* synthetic */ Intent f111209b;

        static {
            Covode.recordClassIndex(56726);
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63212bb.AbstractC63213a
        public final void onSuccess() {
            String str;
            C48002h hVar = this.f111208a;
            Intent intent = this.f111209b;
            if (intent != null) {
                str = m91009a(intent, "filePath");
            } else {
                str = null;
            }
            hVar.mo79973a(str);
        }

        C48007e(C48002h hVar, Intent intent) {
            this.f111208a = hVar;
            this.f111209b = intent;
        }

        /* renamed from: a */
        private static String m91009a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.method.upload.AbstractC47982b
    /* renamed from: a */
    public final void mo79939a() {
        try {
            TTVideoUploader tTVideoUploader = this.f111201d;
            if (tTVideoUploader == null) {
                C89219l.m154710a("uploader");
            }
            tTVideoUploader.stop();
            TTVideoUploader tTVideoUploader2 = this.f111201d;
            if (tTVideoUploader2 == null) {
                C89219l.m154710a("uploader");
            }
            tTVideoUploader2.close();
            mo80019a(0, "uploadCancel");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.h$b */
    public class C48004b implements TTVideoUploaderListener {
        static {
            Covode.recordClassIndex(56723);
        }

        @Override // com.p2082ss.ttuploader.TTVideoUploaderListener
        public final String getStringFromExtern(int i) {
            return "";
        }

        @Override // com.p2082ss.ttuploader.TTVideoUploaderListener
        public final void onLog(int i, int i2, String str) {
        }

        @Override // com.p2082ss.ttuploader.TTVideoUploaderListener
        public final void onUploadVideoStage(int i, long j) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C48004b() {
        }

        /* renamed from: a */
        private static NetworkInfo m91007a(ConnectivityManager connectivityManager) {
            try {
                return connectivityManager.getActiveNetworkInfo();
            } catch (Exception e) {
                C51423a.m95790a((Throwable) e);
                return C61338a.m111034a();
            }
        }

        @Override // com.p2082ss.ttuploader.TTVideoUploaderListener
        public final int videoUploadCheckNetState(int i, int i2) {
            if (C48002h.this.f111202e.get() == null) {
                return 0;
            }
            Activity activity = C48002h.this.f111202e.get();
            Objects.requireNonNull(activity, "null cannot be cast to non-null type android.app.Activity");
            Object a = m91008a(activity, "connectivity");
            Objects.requireNonNull(a, "null cannot be cast to non-null type android.net.ConnectivityManager");
            if (m91007a((ConnectivityManager) a) != null) {
                return 1;
            }
            return 0;
        }

        /* renamed from: a */
        private static Object m91008a(Activity activity, String str) {
            Object obj;
            MethodCollector.m26663i(5742);
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!C58027i.f132247b && "connectivity".equals(str)) {
                    try {
                        new C21708b().mo35361a();
                        C58027i.f132247b = true;
                        obj = activity.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                obj = activity.getSystemService(str);
            } else if (C58027i.f132246a) {
                synchronized (ClipboardManager.class) {
                    try {
                        obj = activity.getSystemService(str);
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            try {
                                Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                declaredField.setAccessible(true);
                                declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                            } catch (Exception e) {
                                C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        C58027i.f132246a = false;
                    } finally {
                        MethodCollector.m26664o(5742);
                    }
                }
            } else {
                obj = activity.getSystemService(str);
            }
            return obj;
        }

        @Override // com.p2082ss.ttuploader.TTVideoUploaderListener
        public final void onNotify(int i, long j, TTVideoInfo tTVideoInfo) {
            if (i == 0) {
                try {
                    C48002h hVar = C48002h.this;
                    if (tTVideoInfo == null) {
                        C89219l.m154715b();
                    }
                    String str = tTVideoInfo.mVideoId;
                    C89219l.m154716b(str, "");
                    hVar.mo79974a(str, 3);
                    C48002h.this.mo80021b().close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (i == 2) {
                C48002h.this.mo80019a(0, "uploadFailed");
                try {
                    C48002h.this.mo80021b().close();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo80020a(TTVideoUploader tTVideoUploader) {
        C89219l.m154721d(tTVideoUploader, "");
        this.f111201d = tTVideoUploader;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.h$f */
    public static final class C48008f<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C48002h f111210a;

        /* renamed from: b */
        final /* synthetic */ int f111211b;

        /* renamed from: c */
        final /* synthetic */ String f111212c;

        static {
            Covode.recordClassIndex(56727);
        }

        C48008f(C48002h hVar, int i, String str) {
            this.f111210a = hVar;
            this.f111211b = i;
            this.f111212c = str;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            MethodCollector.m26663i(6814);
            if (iVar != null && !iVar.mo5544c() && ((C48014a) iVar.mo5545d()).f111227a == 0) {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                C48015b bVar = ((C48014a) iVar.mo5545d()).f111229c;
                if (bVar != null) {
                    String str = bVar.f111230a;
                    Charset charset = C89338d.f202990a;
                    if (str != null) {
                        byte[] bytes = str.getBytes(charset);
                        C89219l.m154716b(bytes, "");
                        byte[] decodeBase64 = Base64.decodeBase64(bytes);
                        C89219l.m154716b(decodeBase64, "");
                        jSONObject.put("mainUrl", new String(decodeBase64, C89338d.f202990a));
                        jSONObject.put("posterUrl", bVar.f111232c);
                        String str2 = bVar.f111231b;
                        Charset charset2 = C89338d.f202990a;
                        if (str2 != null) {
                            byte[] bytes2 = str2.getBytes(charset2);
                            C89219l.m154716b(bytes2, "");
                            byte[] decodeBase642 = Base64.decodeBase64(bytes2);
                            C89219l.m154716b(decodeBase642, "");
                            jSONObject.put("backupUrl", new String(decodeBase642, C89338d.f202990a));
                            jSONObject.put("mediaType", bVar.f111233d);
                            jSONArray.put(jSONObject);
                            this.f111210a.f111204g.mo61887a(jSONArray);
                        } else {
                            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            MethodCollector.m26664o(6814);
                            throw nullPointerException;
                        }
                    } else {
                        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        MethodCollector.m26664o(6814);
                        throw nullPointerException2;
                    }
                }
            } else if (this.f111211b > 0) {
                Thread.sleep(1000);
                this.f111210a.mo79974a(this.f111212c, this.f111211b - 1);
            } else if (iVar == null || iVar.mo5544c()) {
                this.f111210a.mo80019a(0, "uploadFailed");
            } else if (((C48014a) iVar.mo5545d()).f111227a != 0) {
                this.f111210a.mo80019a(((C48014a) iVar.mo5545d()).f111227a, ((C48014a) iVar.mo5545d()).f111228b);
            }
            MethodCollector.m26664o(6814);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo79973a(String str) {
        if (str != null) {
            this.f111201d = new TTVideoUploader();
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
            createIAVServiceProxybyMonsterPlugin.getShortVideoPluginService();
            this.f111200a.getUploadAuthConfig().mo5534a(new C48011i(this, str), C1731i.f5564c, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.h$i */
    public static final class C48011i<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C48002h f111219a;

        /* renamed from: b */
        final /* synthetic */ String f111220b;

        static {
            Covode.recordClassIndex(56730);
        }

        C48011i(C48002h hVar, String str) {
            this.f111219a = hVar;
            this.f111220b = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1731i<UploadAuthConfig> iVar) {
            if (iVar != null) {
                if (!iVar.mo5544c() && iVar.mo5545d().getCode() == 0) {
                    UploadConfig uploadConfig = iVar.mo5545d().getUploadConfig();
                    if (uploadConfig == null) {
                        return null;
                    }
                    long a = C1757e.m5900a(this.f111219a.f111202e.get(), Uri.parse(this.f111220b));
                    if (a > ((long) uploadConfig.getMaxFileSize())) {
                        new C79459a(this.f111219a.f111202e.get()).mo123050a(R.string.h7j).mo123053a();
                        this.f111219a.mo80019a(0, "uploadFailed");
                        return null;
                    }
                    TTVideoUploader b = this.f111219a.mo80021b();
                    try {
                        Uri parse = Uri.parse(this.f111220b);
                        C89219l.m154716b(parse, "");
                        b.setMediaDataReader(new C48012i(this.f111219a.f111202e.get(), parse, a));
                        b.setAuthorization(uploadConfig.getAuthKey());
                        b.setFileRetryCount(uploadConfig.getFileRetryCount());
                        b.setUserKey(uploadConfig.getAppKey());
                        b.setEnableHttps(uploadConfig.getEnableHttps());
                        b.setSliceTimeout(uploadConfig.getSliceTimeout());
                        b.setSliceReTryCount(uploadConfig.getSliceRetryCount());
                        b.setSliceSize(uploadConfig.getSliceSize());
                        b.setSocketNum(uploadConfig.getSocketNumber());
                        b.setMaxFailTime(uploadConfig.getMaxFailTime());
                        b.setVideoUploadDomain(uploadConfig.getVideoHostName());
                        b.setListener(new C48004b());
                        b.start();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    this.f111219a.f111203f.mo79938a(this.f111219a.f111202e.get(), this.f111219a);
                    return null;
                } else if (!iVar.mo5544c()) {
                    if (iVar.mo5545d().getCode() != 0) {
                        this.f111219a.mo80019a(iVar.mo5545d().getCode(), iVar.mo5545d().getMessage());
                    }
                    this.f111219a.mo80021b().close();
                    return null;
                }
            }
            this.f111219a.mo80019a(0, "uploadFailed");
            try {
                this.f111219a.mo80021b().close();
                return null;
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo80019a(int i, String str) {
        C89219l.m154721d(str, "");
        this.f111204g.mo61886a(i, str);
    }

    /* renamed from: a */
    public void mo79974a(String str, int i) {
        C89219l.m154721d(str, "");
        this.f111200a.getUploadPlayUrlResponse(str).mo5534a(new C48008f(this, i, str), C1731i.f5562a, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.h$h */
    public static final class C48010h implements C35444b.AbstractC35447b {

        /* renamed from: a */
        final /* synthetic */ Activity f111216a;

        /* renamed from: b */
        final /* synthetic */ C48002h f111217b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f111218c;

        static {
            Covode.recordClassIndex(56729);
        }

        C48010h(Activity activity, C48002h hVar, AbstractC89171a aVar) {
            this.f111216a = activity;
            this.f111217b = hVar;
            this.f111218c = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.p2440ce.C35444b.AbstractC35447b
        /* renamed from: a */
        public final void mo53515a(String[] strArr, int[] iArr) {
            if (iArr[0] == 0) {
                this.f111218c.invoke();
                return;
            }
            if (iArr[0] != 0) {
                new C79459a(this.f111216a).mo123052a(this.f111216a.getString(R.string.dng)).mo123053a();
            }
            this.f111217b.f111204g.mo61886a(-1, "uploadFailed");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.h$g */
    public static final class C48009g implements C35444b.AbstractC35447b {

        /* renamed from: a */
        final /* synthetic */ Activity f111213a;

        /* renamed from: b */
        final /* synthetic */ C48002h f111214b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f111215c;

        static {
            Covode.recordClassIndex(56728);
        }

        C48009g(Activity activity, C48002h hVar, AbstractC89171a aVar) {
            this.f111213a = activity;
            this.f111214b = hVar;
            this.f111215c = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.p2440ce.C35444b.AbstractC35447b
        /* renamed from: a */
        public final void mo53515a(String[] strArr, int[] iArr) {
            if (iArr[0] == 0 && iArr[1] == 0) {
                this.f111215c.invoke();
                return;
            }
            if (iArr[0] != 0) {
                new C79459a(this.f111213a).mo123052a(this.f111213a.getString(R.string.dng)).mo123053a();
            }
            if (iArr[1] != 0) {
                new C79459a(this.f111213a).mo123052a(this.f111213a.getString(R.string.dne)).mo123053a();
            }
            this.f111214b.f111204g.mo61886a(-1, "uploadFailed");
        }
    }

    /* renamed from: a */
    private void m90998a(boolean z, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        if (z) {
            Activity activity = this.f111202e.get();
            if (activity == null) {
                return;
            }
            if (C80620e.m139778a(activity) == 0 && C80620e.m139781c(activity) == 0) {
                aVar.invoke();
            } else {
                C35444b.m72473a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.CAMERA"}, new C48009g(activity, this, aVar));
            }
        } else {
            Activity activity2 = this.f111202e.get();
            if (activity2 == null) {
                return;
            }
            if (C80620e.m139781c(activity2) == 0) {
                aVar.invoke();
            } else {
                C35444b.m72473a(activity2, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C48010h(activity2, this, aVar));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.method.upload.AbstractC47982b
    /* renamed from: a */
    public final void mo79941a(JSONObject jSONObject, boolean z) {
        C89219l.m154721d(jSONObject, "");
        int optInt = jSONObject.optInt(StringSet.type);
        if (optInt == 700) {
            m90998a(z, new C48006d(this));
        } else if (optInt == 800) {
            m90998a(z, new C48005c(this));
        }
    }

    public C48002h(WeakReference<Activity> weakReference, AbstractC47909a.C47912a aVar, AbstractC47963m mVar) {
        C89219l.m154721d(weakReference, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(mVar, "");
        this.f111202e = weakReference;
        this.f111203f = aVar;
        this.f111204g = mVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r10 != 900) goto L_0x0019;
     */
    @Override // com.p2082ss.android.ugc.aweme.p2929fe.method.upload.AbstractC47982b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo79942a(int r10, int r11, android.content.Intent r12) {
        /*
        // Method dump skipped, instructions count: 168
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2929fe.method.upload.C48002h.mo79942a(int, int, android.content.Intent):boolean");
    }
}
