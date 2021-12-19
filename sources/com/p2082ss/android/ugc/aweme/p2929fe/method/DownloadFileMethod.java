package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Base64;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.common.utility.p909d.C13609b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.web.p1285a.C18288a;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2440ce.C35444b;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p077b.C1731i;
import p078c.p080b.C1756d;
import p078c.p080b.C1757e;
import p078c.p083d.C1762a;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.fe.method.DownloadFileMethod */
public final class DownloadFileMethod extends BaseCommonJavaMethod implements IDownloadListener, AbstractC33974au {

    /* renamed from: f */
    public static final C47826a f110780f = new C47826a((byte) 0);

    /* renamed from: a */
    String f110781a;

    /* renamed from: b */
    String f110782b;

    /* renamed from: d */
    Integer f110783d;

    /* renamed from: e */
    public String f110784e;

    static {
        Covode.recordClassIndex(56466);
    }

    private DownloadFileMethod(byte b) {
        this();
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFirstStart(DownloadInfo downloadInfo) {
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFirstSuccess(DownloadInfo downloadInfo) {
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onPrepare(DownloadInfo downloadInfo) {
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.DownloadFileMethod$a */
    public static final class C47826a {
        static {
            Covode.recordClassIndex(56467);
        }

        private C47826a() {
        }

        public /* synthetic */ C47826a(byte b) {
            this();
        }
    }

    private /* synthetic */ DownloadFileMethod() {
        this((C18288a) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.fe.method.DownloadFileMethod$e */
    public static final class CallableC47830e<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ DownloadFileMethod f110796a;

        /* renamed from: b */
        final /* synthetic */ String f110797b;

        /* renamed from: c */
        final /* synthetic */ JSONObject f110798c;

        /* renamed from: d */
        final /* synthetic */ int f110799d = 3;

        static {
            Covode.recordClassIndex(56471);
        }

        CallableC47830e(DownloadFileMethod downloadFileMethod, String str, JSONObject jSONObject) {
            this.f110796a = downloadFileMethod;
            this.f110797b = str;
            this.f110798c = jSONObject;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            DownloadFileMethod.super.sendEvent(this.f110797b, this.f110798c, this.f110799d);
            return C89391z.f203057a;
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        Integer num = this.f110783d;
        if (num != null) {
            Downloader.getInstance((Context) this.mContextRef.get()).cancel(num.intValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.fe.method.DownloadFileMethod$b */
    public static final class CallableC47827b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f110785a;

        /* renamed from: b */
        final /* synthetic */ File f110786b;

        static {
            Covode.recordClassIndex(56468);
        }

        CallableC47827b(C89233z.C89238e eVar, File file) {
            this.f110785a = eVar;
            this.f110786b = file;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C89391z call() {
            C89391z zVar;
            MethodCollector.m26663i(7898);
            try {
                ParcelFileDescriptor openFileDescriptor = C17867d.m33078a().getContentResolver().openFileDescriptor(this.f110785a.element, "w");
                if (openFileDescriptor != null) {
                    C1756d.m5893a(this.f110786b, new FileOutputStream(openFileDescriptor.getFileDescriptor()));
                    zVar = C89391z.f203057a;
                } else {
                    zVar = null;
                }
            } catch (Exception e) {
                e.printStackTrace();
                zVar = C89391z.f203057a;
            }
            MethodCollector.m26664o(7898);
            return zVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.DownloadFileMethod$d */
    static final class CallableC47829d<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ DownloadFileMethod f110791a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f110792b;

        /* renamed from: c */
        final /* synthetic */ Uri f110793c;

        /* renamed from: d */
        final /* synthetic */ List f110794d;

        /* renamed from: e */
        final /* synthetic */ String f110795e;

        static {
            Covode.recordClassIndex(56470);
        }

        CallableC47829d(DownloadFileMethod downloadFileMethod, C89233z.C89238e eVar, Uri uri, List list, String str) {
            this.f110791a = downloadFileMethod;
            this.f110792b = eVar;
            this.f110793c = uri;
            this.f110794d = list;
            this.f110795e = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            ParcelFileDescriptor parcelFileDescriptor;
            ContentResolver contentResolver;
            MethodCollector.m26663i(7902);
            FileOutputStream fileOutputStream = null;
            if (this.f110792b.element != null) {
                fileOutputStream = new FileOutputStream((File) this.f110792b.element);
            } else if (this.f110793c != null) {
                Context context = (Context) this.f110791a.mContextRef.get();
                if (context == null || (contentResolver = context.getContentResolver()) == null) {
                    parcelFileDescriptor = null;
                } else {
                    parcelFileDescriptor = contentResolver.openFileDescriptor(this.f110793c, "w");
                }
                if (parcelFileDescriptor != null) {
                    fileOutputStream = new FileOutputStream(parcelFileDescriptor.getFileDescriptor());
                }
            }
            boolean z = false;
            try {
                byte[] decode = Base64.decode((String) this.f110794d.get(1), 0);
                if (fileOutputStream != null) {
                    fileOutputStream.write(decode);
                }
                C13609b.m24451a(fileOutputStream);
                z = true;
            } catch (Exception e) {
                e.printStackTrace();
                C13609b.m24451a(fileOutputStream);
            } catch (Throwable th) {
                C13609b.m24451a(fileOutputStream);
                MethodCollector.m26664o(7902);
                throw th;
            }
            if (z) {
                DownloadFileMethod downloadFileMethod = this.f110791a;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(StringSet.type, "success");
                String str = this.f110795e;
                if (str != null) {
                    jSONObject2.put("path", str);
                }
                jSONObject.put("data", jSONObject2);
                jSONObject.put("id", this.f110791a.f110784e);
                jSONObject.put("eventName", "download_status_change");
                downloadFileMethod.mo79893a("notification", jSONObject);
                String str2 = this.f110795e;
                if (str2 != null) {
                    this.f110791a.mo79892a(str2);
                }
            }
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(7902);
            return zVar;
        }
    }

    public DownloadFileMethod(C18288a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo79892a(String str) {
        Context context = (Context) this.mContextRef.get();
        if (context != null) {
            C89219l.m154716b(context, "");
            File file = new File(str);
            C89233z.C89238e eVar = new C89233z.C89238e();
            eVar.element = (T) C1757e.m5910c(context, file.getName(), null);
            if (eVar.element == null) {
                eVar.element = (T) C1757e.m5902a(context, file.getName(), "image/jpeg");
            }
            C1731i.m5640b(new CallableC47827b(eVar, file), C1731i.f5562a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final BaseCommonJavaMethod attach(WeakReference<Context> weakReference) {
        Context context;
        if (!(weakReference == null || (context = weakReference.get()) == null || !(context instanceof AbstractC1204m))) {
            ((AbstractC1204m) context).getLifecycle().mo4012a(this);
        }
        BaseCommonJavaMethod attach = super.attach(weakReference);
        C89219l.m154716b(attach, "");
        return attach;
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onCanceled(DownloadInfo downloadInfo) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(StringSet.type, "cancel");
        jSONObject.put("data", jSONObject2);
        jSONObject.put("id", this.f110784e);
        jSONObject.put("eventName", "download_status_change");
        mo79893a("notification", jSONObject);
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onPause(DownloadInfo downloadInfo) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(StringSet.type, "pause");
        jSONObject.put("data", jSONObject2);
        jSONObject.put("id", this.f110784e);
        jSONObject.put("eventName", "download_status_change");
        mo79893a("notification", jSONObject);
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo downloadInfo) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("progress", downloadInfo);
        jSONObject2.put(StringSet.type, "progress");
        jSONObject.put("data", jSONObject2);
        jSONObject.put("id", this.f110784e);
        jSONObject.put("eventName", "download_status_change");
        mo79893a("notification", jSONObject);
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onStart(DownloadInfo downloadInfo) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(StringSet.type, "start");
        jSONObject.put("data", jSONObject2);
        jSONObject.put("id", this.f110784e);
        jSONObject.put("eventName", "download_status_change");
        mo79893a("notification", jSONObject);
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        if (downloadInfo != null && downloadInfo.getSavePath() != null && downloadInfo.getName() != null) {
            String str = null;
            String savePath = downloadInfo.getSavePath();
            C89219l.m154716b(savePath, "");
            if (C89361p.m154874b(savePath, "content://", false)) {
                try {
                    str = C1762a.m5918a((Context) this.mContextRef.get(), Uri.parse(downloadInfo.getSavePath()));
                    C89379q.m157068constructorimpl(C89391z.f203057a);
                } catch (Throwable th) {
                    C89379q.m157068constructorimpl(C89382r.m154941a(th));
                }
            } else {
                str = new File(downloadInfo.getSavePath(), downloadInfo.getName()).getPath();
                if (TextUtils.equals(this.f110782b, "image") && str != null) {
                    mo79892a(str);
                }
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StringSet.type, "success");
            if (str != null) {
                jSONObject2.put("path", str);
            }
            jSONObject.put("data", jSONObject2);
            jSONObject.put("id", this.f110784e);
            jSONObject.put("eventName", "download_status_change");
            mo79893a("notification", jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo79893a(String str, JSONObject jSONObject) {
        C1731i.m5640b(new CallableC47830e(this, str, jSONObject), C1731i.f5564c);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        Context actContext = getActContext();
        if (!(actContext instanceof Activity)) {
            actContext = null;
        }
        Activity activity = (Activity) actContext;
        if (activity != null) {
            C35444b.m72473a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C47828c(this, jSONObject, aVar, activity));
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(StringSet.type, "error");
        jSONObject.put("data", jSONObject2);
        jSONObject.put("id", this.f110784e);
        jSONObject.put("eventName", "download_status_change");
        mo79893a("notification", jSONObject);
        if (TextUtils.equals(this.f110782b, "image")) {
            this.mContextRef.get();
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(StringSet.type, "restart");
        jSONObject.put("data", jSONObject2);
        jSONObject.put("id", this.f110784e);
        jSONObject.put("eventName", "download_status_change");
        mo79893a("notification", jSONObject);
    }

    @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(StringSet.type, "restart");
        jSONObject.put("data", jSONObject2);
        jSONObject.put("id", this.f110784e);
        jSONObject.put("eventName", "download_status_change");
        mo79893a("notification", jSONObject);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.DownloadFileMethod$c */
    static final class C47828c implements C35444b.AbstractC35447b {

        /* renamed from: a */
        final /* synthetic */ DownloadFileMethod f110787a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f110788b;

        /* renamed from: c */
        final /* synthetic */ BaseCommonJavaMethod.AbstractC47813a f110789c;

        /* renamed from: d */
        final /* synthetic */ Activity f110790d;

        static {
            Covode.recordClassIndex(56469);
        }

        C47828c(DownloadFileMethod downloadFileMethod, JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar, Activity activity) {
            this.f110787a = downloadFileMethod;
            this.f110788b = jSONObject;
            this.f110789c = aVar;
            this.f110790d = activity;
        }

        /* JADX WARNING: Removed duplicated region for block: B:47:0x00f0  */
        @Override // com.p2082ss.android.ugc.aweme.p2440ce.C35444b.AbstractC35447b
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo53515a(java.lang.String[] r20, int[] r21) {
            /*
            // Method dump skipped, instructions count: 573
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2929fe.method.DownloadFileMethod.C47828c.mo53515a(java.lang.String[], int[]):void");
        }
    }
}
