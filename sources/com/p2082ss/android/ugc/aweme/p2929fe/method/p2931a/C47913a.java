package com.p2082ss.android.ugc.aweme.p2929fe.method.p2931a;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.http.p2146a.p2149b.C29934d;
import com.p2082ss.android.newmedia.C30128d;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2440ce.C35444b;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import com.p2082ss.android.ugc.aweme.p2929fe.method.AbstractC47909a;
import com.p2082ss.android.ugc.aweme.p2929fe.method.AbstractC47963m;
import com.p2082ss.android.ugc.aweme.p2929fe.method.upload.AbstractC47982b;
import com.p2082ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p2082ss.android.ugc.aweme.profile.model.TcmImage;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80313cs;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.C1731i;
import p077b.C1743j;

/* renamed from: com.ss.android.ugc.aweme.fe.method.a.a */
public final class C47913a implements WeakHandler.IHandler, AbstractC47982b {

    /* renamed from: a */
    public String f110970a = "";

    /* renamed from: b */
    public AbstractC47963m f110971b;

    /* renamed from: c */
    private String f110972c = "";

    /* renamed from: d */
    private AsyncTaskC47916c f110973d;

    /* renamed from: e */
    private WeakReference<Activity> f110974e;

    /* renamed from: f */
    private AbstractC47909a.C47912a f110975f;

    /* renamed from: g */
    private Executor f110976g;

    /* renamed from: h */
    private Executor f110977h;

    /* renamed from: i */
    private String f110978i;

    /* renamed from: j */
    private String f110979j;

    static {
        Covode.recordClassIndex(56610);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.method.upload.AbstractC47982b
    /* renamed from: a */
    public final void mo79939a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.fe.method.a.a$c */
    public static class AsyncTaskC47916c extends AsyncTask<Void, Void, File> {

        /* renamed from: a */
        private WeakReference<Activity> f110985a;

        /* renamed from: b */
        private WeakReference<C47913a> f110986b;

        static {
            Covode.recordClassIndex(56613);
        }

        /* access modifiers changed from: protected */
        public final void onCancelled() {
            C47913a aVar = this.f110986b.get();
            if (aVar != null) {
                aVar.f110971b.mo61886a(0, "uploadCancel");
            }
        }

        /* renamed from: a */
        private File m90912a() {
            Activity activity = this.f110985a.get();
            if (activity == null) {
                return null;
            }
            try {
                String concat = "Dou_fsm_".concat(String.valueOf(new SimpleDateFormat("yyyy-MMdd_HHmmss").format(new Date())));
                if (C58016d.f132222c == null || !C58016d.f132224e) {
                    C58016d.f132222c = activity.getFilesDir();
                }
                return File.createTempFile(concat, ".jpg", C58016d.f132222c);
            } catch (IOException unused) {
                return null;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public final /* synthetic */ File doInBackground(Void[] voidArr) {
            return m90912a();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(File file) {
            File file2 = file;
            C47913a aVar = this.f110986b.get();
            Activity activity = this.f110985a.get();
            if (aVar != null && activity != null) {
                if (file2 == null) {
                    aVar.f110971b.mo61886a(0, "uploadFailed");
                    return;
                }
                aVar.f110970a = file2.getAbsolutePath();
                Uri a = C30128d.m60943a(activity, file2);
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                intent.putExtra("output", a);
                intent.addFlags(3);
                activity.startActivityForResult(intent, 1);
            }
        }

        AsyncTaskC47916c(Activity activity, C47913a aVar) {
            this.f110985a = new WeakReference<>(activity);
            this.f110986b = new WeakReference<>(aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.a.a$a */
    static class RunnableC47914a implements Runnable {

        /* renamed from: a */
        private WeakReference<C47915b> f110980a;

        /* renamed from: b */
        private WeakReference<AbstractC47963m> f110981b;

        static {
            Covode.recordClassIndex(56611);
        }

        public final void run() {
            C47915b bVar = this.f110980a.get();
            AbstractC47963m mVar = this.f110981b.get();
            if (bVar != null && mVar != null) {
                try {
                    mVar.mo61887a(m90911a(bVar));
                } catch (JSONException unused) {
                    mVar.mo61886a(0, "uploadFailed");
                }
            }
        }

        /* renamed from: a */
        private static C1731i<String> m90910a(String str) {
            C1743j jVar = new C1743j();
            try {
                AVExternalServiceImpl.m113114a().abilityService().processService().compressPhoto(str, 216, 384, new C47918c(jVar));
            } catch (Exception e) {
                e.printStackTrace();
            }
            return jVar.f5610a;
        }

        /* renamed from: a */
        private static JSONArray m90911a(C47915b bVar) {
            C1731i<String> a = m90910a(bVar.f110984c);
            try {
                a.mo5547f();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String d = a.mo5545d();
            if (d != null) {
                try {
                    d = C80313cs.m139233b(d);
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(bVar.f110982a)) {
                jSONObject.put("url", bVar.f110982a);
            }
            if (!TextUtils.isEmpty(bVar.f110983b)) {
                jSONObject.put("uri", bVar.f110983b);
            }
            jSONObject.put("base64", d);
            jSONArray.put(jSONObject);
            return jSONArray;
        }

        RunnableC47914a(C47915b bVar, AbstractC47963m mVar) {
            this.f110980a = new WeakReference<>(bVar);
            this.f110981b = new WeakReference<>(mVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo79940a(Activity activity) {
        AsyncTaskC47916c cVar = this.f110973d;
        if (cVar != null) {
            cVar.cancel(false);
        }
        AsyncTaskC47916c cVar2 = new AsyncTaskC47916c(activity, this);
        this.f110973d = cVar2;
        cVar2.executeOnExecutor(this.f110976g, new Void[0]);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        Activity activity = this.f110974e.get();
        if (activity == null) {
            this.f110971b.mo61886a(0, "uploadFailed");
        } else if (message.obj instanceof C34485a) {
            new C79459a(activity).mo123052a(((C34485a) message.obj).getErrorMsg()).mo123053a();
            this.f110971b.mo61886a(0, "uploadFailed");
        } else if (message.obj instanceof AvatarUri) {
            AvatarUri avatarUri = (AvatarUri) message.obj;
            if (avatarUri == null || avatarUri.urlList == null || avatarUri.urlList.isEmpty()) {
                this.f110971b.mo61886a(0, "uploadFailed");
            } else {
                this.f110977h.execute(new RunnableC47914a(new C47915b(avatarUri.urlList.get(0), avatarUri.uri, this.f110970a), this.f110971b));
            }
        } else if (message.obj instanceof TcmImage) {
            TcmImage tcmImage = (TcmImage) message.obj;
            if (!TextUtils.isEmpty(tcmImage.getMid())) {
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("mid", tcmImage.getMid());
                    jSONArray.put(jSONObject);
                    this.f110971b.mo61887a(jSONArray);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else {
                this.f110971b.mo61886a(0, "uploadFailed");
            }
        } else {
            this.f110971b.mo61886a(0, "uploadFailed");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.method.upload.AbstractC47982b
    /* renamed from: a */
    public final void mo79941a(JSONObject jSONObject, boolean z) {
        Activity activity = this.f110974e.get();
        if (activity == null) {
            this.f110971b.mo61886a(0, "uploadFailed");
            return;
        }
        PackageManager packageManager = activity.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        if (!packageManager.hasSystemFeature("android.hardware.camera.any")) {
            this.f110971b.mo61886a(0, "uploadFailed");
        } else if (new Intent("android.media.action.IMAGE_CAPTURE").resolveActivity(activity.getPackageManager()) == null) {
            this.f110971b.mo61886a(0, "uploadFailed");
        } else {
            this.f110972c = jSONObject.optString("source");
            this.f110978i = jSONObject.optString("encryptURL", "");
            this.f110979j = jSONObject.optString("nameSpace", "");
            if (C0643b.m2367a(activity, "android.permission.CAMERA") == 0) {
                mo79940a(activity);
            } else {
                C35444b.m72473a(activity, new String[]{"android.permission.CAMERA"}, new C47917b(this, activity));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.fe.method.a.a$b */
    public static class C47915b {

        /* renamed from: a */
        public String f110982a;

        /* renamed from: b */
        public String f110983b;

        /* renamed from: c */
        public String f110984c;

        static {
            Covode.recordClassIndex(56612);
        }

        C47915b(String str, String str2, String str3) {
            this.f110982a = str;
            this.f110983b = str2;
            this.f110984c = str3;
        }
    }

    public C47913a(WeakReference<Activity> weakReference, AbstractC47909a.C47912a aVar, AbstractC47963m mVar) {
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.SERIAL);
        a.f95504b = "takephoto";
        this.f110976g = C40780g.m82242a(a.mo70028a());
        C40787l.C40788a a2 = C40787l.m82269a(EnumC40793o.SERIAL);
        a2.f95504b = "uploadphoto";
        this.f110977h = C40780g.m82242a(a2.mo70028a());
        this.f110978i = "";
        this.f110979j = "";
        this.f110975f = aVar;
        this.f110971b = mVar;
        this.f110974e = weakReference;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.method.upload.AbstractC47982b
    /* renamed from: a */
    public final boolean mo79942a(int i, int i2, Intent intent) {
        if (i2 == 0) {
            this.f110971b.mo61886a(0, "uploadCancel");
            return true;
        }
        if (i2 == -1) {
            String str = Api.f79772e + "?uid=" + C31575b.m65865g().getCurUserId();
            if (!TextUtils.isEmpty(this.f110972c)) {
                str = str + "&source=" + this.f110972c;
            }
            if (!TextUtils.isEmpty(this.f110978i)) {
                str = new C29844g(Api.f79771d + "/" + this.f110978i).mo52126a();
            }
            this.f110975f.mo79936a();
            Activity activity = this.f110974e.get();
            File file = new File(this.f110970a);
            Intent intent2 = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent2.setData(Uri.fromFile(file));
            activity.sendBroadcast(intent2);
            MediaScannerConnection.scanFile(activity, new String[]{file.toString()}, null, null);
            this.f110975f.mo79937a(this.f110974e.get());
            if (!TextUtils.isEmpty(this.f110978i)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C29934d("NS", this.f110979j));
                C31575b.m65865g().uploadAvatar(new WeakHandler(this), str, 8388608, this.f110970a, arrayList, "image_info");
            } else {
                C31575b.m65865g().uploadAvatar(new WeakHandler(this), str, 8388608, this.f110970a, null);
            }
        } else {
            this.f110971b.mo61886a(0, "uploadFailed");
        }
        return true;
    }
}
