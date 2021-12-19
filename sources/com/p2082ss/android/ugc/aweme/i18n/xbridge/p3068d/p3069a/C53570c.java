package com.p2082ss.android.ugc.aweme.i18n.xbridge.p3068d.p3069a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.p1292a.C18423d;
import com.bytedance.ies.xbridge.base.runtime.p1292a.C18424e;
import com.p2082ss.android.newmedia.C30128d;
import com.p2082ss.android.ugc.aweme.i18n.xbridge.p3064a.AbstractC53515a;
import com.p2082ss.android.ugc.aweme.i18n.xbridge.p3064a.AbstractC53516b;
import com.p2082ss.android.ugc.aweme.i18n.xbridge.p3068d.C53557a;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2440ce.C35444b;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import com.p2082ss.android.ugc.aweme.utils.C80313cs;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import p077b.C1731i;
import p077b.C1743j;
import p078c.p080b.C1757e;
import p078c.p083d.C1762a;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.d.a.c */
public final class C53570c implements AbstractC53515a {

    /* renamed from: e */
    public static final C53571a f122957e = new C53571a((byte) 0);

    /* renamed from: a */
    public final AbstractC53516b f122958a;

    /* renamed from: b */
    public Uri f122959b;

    /* renamed from: c */
    public String f122960c;

    /* renamed from: d */
    public String f122961d;

    /* renamed from: f */
    private final WeakReference<Activity> f122962f;

    /* renamed from: g */
    private final ExecutorService f122963g;

    /* renamed from: h */
    private final ExecutorService f122964h;

    /* renamed from: i */
    private AsyncTaskC53574c f122965i;

    /* renamed from: j */
    private boolean f122966j;

    /* renamed from: k */
    private boolean f122967k;

    /* renamed from: l */
    private boolean f122968l;

    static {
        Covode.recordClassIndex(63146);
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.d.a.c$a */
    public static final class C53571a {
        static {
            Covode.recordClassIndex(63147);
        }

        private C53571a() {
        }

        public /* synthetic */ C53571a(byte b) {
            this();
        }

        /* renamed from: a */
        public static String m98785a(Context context, String str) {
            String a = C1762a.m5918a(context, Uri.parse(str));
            if (a == null) {
                a = "";
            }
            try {
                String b = C80313cs.m139233b(a);
                C89219l.m154716b(b, "");
                return b;
            } catch (IOException unused) {
                return "";
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.d.a.c$c */
    public static final class AsyncTaskC53574c extends AsyncTask<C89391z, C89391z, Uri> {

        /* renamed from: a */
        public final boolean f122974a;

        /* renamed from: b */
        private final WeakReference<Activity> f122975b;

        /* renamed from: c */
        private final WeakReference<C53570c> f122976c;

        static {
            Covode.recordClassIndex(63150);
        }

        /* access modifiers changed from: protected */
        public final void onCancelled() {
            C53570c cVar = this.f122976c.get();
            if (cVar != null) {
                cVar.f122958a.mo90106a(-7, "Take photo cancelled");
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Uri doInBackground(C89391z... zVarArr) {
            C89219l.m154721d(zVarArr, "");
            Activity activity = this.f122975b.get();
            if (activity == null) {
                return null;
            }
            try {
                String concat = "Dou_fsm_".concat(String.valueOf(new SimpleDateFormat("yyyy-MMdd_HHmmss", Locale.ENGLISH).format(new Date())));
                if (this.f122974a) {
                    return C1757e.m5902a(activity, concat + ".jpg", "image/jpeg");
                }
                File createTempFile = File.createTempFile(concat, ".jpg", C53557a.m98768a());
                C53570c cVar = this.f122976c.get();
                if (cVar != null) {
                    C89219l.m154716b(createTempFile, "");
                    String absolutePath = createTempFile.getAbsolutePath();
                    C89219l.m154716b(absolutePath, "");
                    cVar.f122960c = absolutePath;
                }
                return C30128d.m60943a(activity, createTempFile);
            } catch (IOException unused) {
                return null;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(Uri uri) {
            Uri uri2 = uri;
            C53570c cVar = this.f122976c.get();
            Activity activity = this.f122975b.get();
            if (cVar != null && activity != null) {
                if (uri2 == null) {
                    cVar.f122958a.mo90106a(0, "Take photo failed");
                    return;
                }
                cVar.f122959b = uri2;
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                if (C89219l.m154714a((Object) cVar.f122961d, (Object) "front")) {
                    intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
                    intent.putExtra("android.intent.extras.LENS_FACING_FRONT", 1);
                    intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
                    intent.putExtra("default_camera", "1");
                    intent.putExtra("default_mode", "com.huawei.camera2.mode.photo.PhotoMode");
                    intent.putExtra("camerafacing", "front");
                    intent.putExtra("previous_mode", "front");
                }
                intent.putExtra("output", uri2);
                intent.addFlags(3);
                activity.startActivityForResult(intent, 1);
            }
        }

        public AsyncTaskC53574c(Activity activity, C53570c cVar, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(cVar, "");
            this.f122974a = z;
            this.f122975b = new WeakReference<>(activity);
            this.f122976c = new WeakReference<>(cVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.d.a.c$b */
    public static final class RunnableC53572b implements Runnable {

        /* renamed from: a */
        public final WeakReference<Activity> f122969a;

        /* renamed from: b */
        private final String f122970b;

        /* renamed from: c */
        private final WeakReference<AbstractC53516b> f122971c;

        /* renamed from: d */
        private final boolean f122972d;

        static {
            Covode.recordClassIndex(63148);
        }

        public final void run() {
            Activity activity;
            String str = this.f122970b;
            if (str != null) {
                C1731i<String> a = m98786a(str);
                try {
                    a.mo5547f();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String d = a.mo5545d();
                if (d != null) {
                    C18424e.C18425a aVar = new C18424e.C18425a(d, new File(d).length(), "image");
                    if (this.f122972d && (activity = this.f122969a.get()) != null) {
                        C89219l.m154716b(activity, "");
                        aVar.f44027a = C53571a.m98785a(activity, d);
                    }
                    List<C18424e.C18425a> a2 = C89070n.m154516a(aVar);
                    AbstractC53516b bVar = this.f122971c.get();
                    if (bVar != null) {
                        C18424e eVar = new C18424e();
                        eVar.f44026a = a2;
                        bVar.mo90107a(eVar);
                        if (C89391z.f203057a != null) {
                            return;
                        }
                    }
                }
                AbstractC53516b bVar2 = this.f122971c.get();
                if (bVar2 != null) {
                    bVar2.mo90106a(0, "CompressFilePath is null");
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.d.a.c$b$a */
        public static final class C53573a implements IAVProcessService.IProcessCallback<String> {

            /* renamed from: a */
            final /* synthetic */ C1743j f122973a;

            static {
                Covode.recordClassIndex(63149);
            }

            C53573a(C1743j jVar) {
                this.f122973a = jVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVProcessService.IProcessCallback
            public final /* synthetic */ void finish(String str) {
                this.f122973a.mo5555a(str);
            }
        }

        /* renamed from: a */
        private static C1731i<String> m98786a(String str) {
            C1743j jVar = new C1743j();
            try {
                AVExternalServiceImpl.m113114a().abilityService().processService().compressPhoto(str, 216, 384, new C53573a(jVar));
            } catch (Exception e) {
                e.printStackTrace();
                jVar.mo5555a((Object) null);
            }
            C1731i<TResult> iVar = jVar.f5610a;
            C89219l.m154716b(iVar, "");
            return iVar;
        }

        public RunnableC53572b(WeakReference<Activity> weakReference, String str, AbstractC53516b bVar, boolean z) {
            C89219l.m154721d(weakReference, "");
            C89219l.m154721d(bVar, "");
            this.f122969a = weakReference;
            this.f122972d = z;
            this.f122970b = str;
            this.f122971c = new WeakReference<>(bVar);
        }
    }

    /* renamed from: a */
    public final void mo90122a(Activity activity) {
        AsyncTaskC53574c cVar = this.f122965i;
        if (cVar != null) {
            cVar.cancel(false);
        }
        AsyncTaskC53574c cVar2 = new AsyncTaskC53574c(activity, this, this.f122968l);
        cVar2.executeOnExecutor(this.f122963g, new C89391z[0]);
        this.f122965i = cVar2;
    }

    @Override // com.p2082ss.android.ugc.aweme.i18n.xbridge.p3064a.AbstractC53515a
    /* renamed from: a */
    public final void mo90104a(C18423d dVar) {
        boolean z;
        String[] strArr;
        C89219l.m154721d(dVar, "");
        Activity activity = this.f122962f.get();
        if (activity == null) {
            this.f122958a.mo90106a(0, "Activity not found");
            return;
        }
        PackageManager packageManager = activity.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        if (!packageManager.hasSystemFeature("android.hardware.camera.any")) {
            this.f122958a.mo90106a(0, "Camera feature not found");
        } else if (new Intent("android.media.action.IMAGE_CAPTURE").resolveActivity(activity.getPackageManager()) == null) {
            this.f122958a.mo90106a(0, "Camera app not found");
        } else {
            this.f122961d = dVar.f44022j;
            if (dVar.f44020h || dVar.f44016d) {
                z = true;
            } else {
                z = false;
            }
            this.f122966j = z;
            this.f122967k = dVar.f44016d;
            this.f122968l = dVar.f44021i;
            boolean a = m98781a(activity, "android.permission.CAMERA");
            if (!this.f122968l ? !a : !a || !m98781a(activity, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                if (this.f122968l) {
                    strArr = new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"};
                } else {
                    strArr = new String[]{"android.permission.CAMERA"};
                }
                C35444b.m72473a(activity, strArr, new C53575d(this, activity));
                return;
            }
            mo90122a(activity);
        }
    }

    /* renamed from: a */
    private static boolean m98781a(Activity activity, String str) {
        if (C0643b.m2367a(activity, str) == 0) {
            return true;
        }
        return false;
    }

    public C53570c(WeakReference<Activity> weakReference, AbstractC53516b bVar) {
        C89219l.m154721d(weakReference, "");
        C89219l.m154721d(bVar, "");
        this.f122962f = weakReference;
        this.f122958a = bVar;
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.SERIAL);
        a.f95504b = "takePhoto";
        this.f122963g = C40780g.m82242a(a.mo70028a());
        C40787l.C40788a a2 = C40787l.m82269a(EnumC40793o.SERIAL);
        a2.f95504b = "compressPhoto";
        this.f122964h = C40780g.m82242a(a2.mo70028a());
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.d.a.c$d */
    static final class C53575d implements C35444b.AbstractC35447b {

        /* renamed from: a */
        final /* synthetic */ C53570c f122977a;

        /* renamed from: b */
        final /* synthetic */ Activity f122978b;

        static {
            Covode.recordClassIndex(63151);
        }

        C53575d(C53570c cVar, Activity activity) {
            this.f122977a = cVar;
            this.f122978b = activity;
        }

        @Override // com.p2082ss.android.ugc.aweme.p2440ce.C35444b.AbstractC35447b
        /* renamed from: a */
        public final void mo53515a(String[] strArr, int[] iArr) {
            boolean z;
            C89219l.m154716b(strArr, "");
            if (strArr.length != 0) {
                C89219l.m154716b(iArr, "");
                for (int i : iArr) {
                    if (i == 0) {
                    }
                }
                this.f122977a.mo90122a(this.f122978b);
                return;
            }
            if (strArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if ((!z) && iArr[0] == -1) {
                this.f122977a.f122958a.mo90106a(-6, "Camera permission denied");
            } else if (strArr.length != 0 && iArr.length == 2 && iArr[1] == -1) {
                this.f122977a.f122958a.mo90106a(-6, "Storage permission denied");
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.i18n.xbridge.p3064a.AbstractC53515a
    /* renamed from: a */
    public final boolean mo90105a(int i, int i2, Intent intent) {
        if (i2 == 0) {
            this.f122958a.mo90106a(-7, "User cancel");
            return true;
        }
        if (i2 == -1) {
            if (this.f122966j) {
                this.f122964h.execute(new RunnableC53572b(this.f122962f, String.valueOf(this.f122959b), this.f122958a, this.f122967k));
            } else {
                long a = C1757e.m5900a(this.f122962f.get(), this.f122959b);
                String str = this.f122960c;
                if (str == null) {
                    str = String.valueOf(this.f122959b);
                }
                List<C18424e.C18425a> a2 = C89070n.m154516a(new C18424e.C18425a(str, a, "image"));
                AbstractC53516b bVar = this.f122958a;
                C18424e eVar = new C18424e();
                eVar.f44026a = a2;
                bVar.mo90107a(eVar);
            }
        }
        return true;
    }
}
