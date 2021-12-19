package com.p2082ss.android.ugc.aweme.p2929fe.method.upload;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.p2929fe.method.AbstractC47909a;
import com.p2082ss.android.ugc.aweme.p2929fe.method.AbstractC47963m;
import com.p2082ss.android.ugc.aweme.p2929fe.method.upload.C48002h;
import com.p2082ss.android.ugc.aweme.p2929fe.method.upload.I18nGetUploadConfigService;
import com.p2082ss.android.ugc.aweme.p2929fe.method.upload.config.I18nUploadAuthConfig;
import com.p2082ss.android.ugc.aweme.p2929fe.method.upload.config.UploadConfig;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ttuploader.TTVideoUploader;
import java.lang.ref.WeakReference;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p078c.p080b.C1757e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.fe.method.upload.a */
public final class C47979a extends C48002h {

    /* renamed from: a */
    public WeakReference<Activity> f111122a;

    /* renamed from: b */
    public AbstractC47909a.C47912a f111123b;

    /* renamed from: c */
    public AbstractC47963m f111124c;

    /* renamed from: i */
    private I18nGetUploadConfigService.UploadConfigService f111125i = new I18nGetUploadConfigService().f111090a;

    static {
        Covode.recordClassIndex(56695);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p2929fe.method.upload.C48002h
    /* renamed from: a */
    public final void mo79973a(String str) {
        if (str != null) {
            mo80020a(new TTVideoUploader());
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
            createIAVServiceProxybyMonsterPlugin.getShortVideoPluginService();
            this.f111125i.getUploadAuthConfig().mo5534a(new C47981b(this, str), C1731i.f5564c, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.a$a */
    static final class C47980a<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C47979a f111126a;

        /* renamed from: b */
        final /* synthetic */ int f111127b;

        /* renamed from: c */
        final /* synthetic */ String f111128c;

        static {
            Covode.recordClassIndex(56696);
        }

        C47980a(C47979a aVar, int i, String str) {
            this.f111126a = aVar;
            this.f111127b = i;
            this.f111128c = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x005e  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0087  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x00b3  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x00ee  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0100  */
        @Override // p077b.AbstractC1729g
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object then(p077b.C1731i r12) {
            /*
            // Method dump skipped, instructions count: 415
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2929fe.method.upload.C47979a.C47980a.then(b.i):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.a$b */
    public static final class C47981b<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C47979a f111129a;

        /* renamed from: b */
        final /* synthetic */ String f111130b;

        static {
            Covode.recordClassIndex(56697);
        }

        C47981b(C47979a aVar, String str) {
            this.f111129a = aVar;
            this.f111130b = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1731i<I18nUploadAuthConfig> iVar) {
            if (iVar != null) {
                if (!iVar.mo5544c() && iVar.mo5545d().status_code == 0) {
                    UploadConfig uploadConfig = iVar.mo5545d().getUploadConfig();
                    if (uploadConfig == null) {
                        return null;
                    }
                    long a = C1757e.m5900a(this.f111129a.f111122a.get(), Uri.parse(this.f111130b));
                    if (a > ((long) uploadConfig.getMaxFileSize())) {
                        new C79459a(this.f111129a.f111122a.get()).mo123050a(R.string.h7j).mo123053a();
                        this.f111129a.mo80019a(0, "uploadFailed");
                        return null;
                    }
                    TTVideoUploader b = this.f111129a.mo80021b();
                    try {
                        Uri parse = Uri.parse(this.f111130b);
                        C89219l.m154716b(parse, "");
                        b.setMediaDataReader(new C48012i(this.f111129a.f111122a.get(), parse, a));
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
                        b.setListener(new C48002h.C48004b());
                        b.start();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    this.f111129a.f111123b.mo79938a(this.f111129a.f111122a.get(), this.f111129a);
                    return null;
                } else if (!iVar.mo5544c()) {
                    if (iVar.mo5545d().status_code != 0) {
                        C47979a aVar = this.f111129a;
                        int i = iVar.mo5545d().status_code;
                        String str = iVar.mo5545d().message;
                        C89219l.m154716b(str, "");
                        aVar.mo80019a(i, str);
                    }
                    this.f111129a.mo80021b().close();
                    return null;
                }
            }
            this.f111129a.mo80019a(0, "uploadFailed");
            try {
                this.f111129a.mo80021b().close();
                return null;
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }
    }

    /* renamed from: a */
    private static String m90962a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.method.upload.C48002h
    /* renamed from: a */
    public final void mo79974a(String str, int i) {
        C89219l.m154721d(str, "");
        this.f111125i.getUploadPlayUrlResponse(str, 3).mo5534a(new C47980a(this, i, str), C1731i.f5562a, null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47979a(WeakReference<Activity> weakReference, AbstractC47909a.C47912a aVar, AbstractC47963m mVar) {
        super(weakReference, aVar, mVar);
        C89219l.m154721d(weakReference, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(mVar, "");
        this.f111122a = weakReference;
        this.f111123b = aVar;
        this.f111124c = mVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r10 != 900) goto L_0x0019;
     */
    @Override // com.p2082ss.android.ugc.aweme.p2929fe.method.upload.C48002h, com.p2082ss.android.ugc.aweme.p2929fe.method.upload.AbstractC47982b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo79942a(int r10, int r11, android.content.Intent r12) {
        /*
        // Method dump skipped, instructions count: 147
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2929fe.method.upload.C47979a.mo79942a(int, int, android.content.Intent):boolean");
    }
}
