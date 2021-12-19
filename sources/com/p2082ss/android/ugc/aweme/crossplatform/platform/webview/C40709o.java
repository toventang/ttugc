package com.p2082ss.android.ugc.aweme.crossplatform.platform.webview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.SparseArray;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.p2440ce.C35444b;
import java.io.File;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.o */
public final class C40709o extends Fragment {

    /* renamed from: e */
    public static final C40710a f95313e = new C40710a((byte) 0);

    /* renamed from: a */
    public ValueCallback<Uri> f95314a;

    /* renamed from: b */
    public ValueCallback<Uri[]> f95315b;

    /* renamed from: c */
    public String f95316c;

    /* renamed from: d */
    public boolean f95317d;

    /* renamed from: f */
    private SparseArray f95318f;

    static {
        Covode.recordClassIndex(48555);
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.o$a */
    public static final class C40710a {
        static {
            Covode.recordClassIndex(48556);
        }

        private C40710a() {
        }

        public /* synthetic */ C40710a(byte b) {
            this();
        }
    }

    /* renamed from: c */
    private static Intent m82124c() {
        return new Intent("android.media.action.VIDEO_CAPTURE");
    }

    /* renamed from: d */
    private static Intent m82125d() {
        return new Intent("android.provider.MediaStore.RECORD_SOUND");
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f95318f;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: a */
    private final Intent m82117a() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        Intent a = m82119a(m82123b(), m82124c(), m82125d());
        a.putExtra("android.intent.extra.INTENT", intent);
        return a;
    }

    /* renamed from: b */
    private final Intent m82123b() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        File a = m82122a(C17867d.m33078a(), Environment.DIRECTORY_DCIM);
        if (a == null) {
            a = new File(m82121a(C17867d.m33078a()), Environment.DIRECTORY_DCIM);
        }
        C89219l.m154716b(a, "");
        File file = new File(a.getAbsolutePath() + File.separator + "browser-photos");
        file.mkdirs();
        this.f95316c = file.getAbsolutePath() + File.separator + System.currentTimeMillis() + ".jpg";
        Context context = getContext();
        String str = this.f95316c;
        if (str == null) {
            C89219l.m154715b();
        }
        intent.putExtra("output", m82120a(context, new File(str)));
        return intent;
    }

    /* renamed from: a */
    private static Intent m82118a(String str) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(str);
        return intent;
    }

    /* renamed from: a */
    private static Intent m82119a(Intent... intentArr) {
        Intent intent = new Intent("android.intent.action.CHOOSER");
        intent.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
        return intent;
    }

    /* renamed from: a */
    private static File m82121a(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.webview.o$b */
    static final class C40711b implements C35444b.AbstractC35447b {

        /* renamed from: a */
        final /* synthetic */ C40709o f95319a;

        /* renamed from: b */
        final /* synthetic */ ValueCallback f95320b;

        /* renamed from: c */
        final /* synthetic */ WebChromeClient.FileChooserParams f95321c;

        static {
            Covode.recordClassIndex(48557);
        }

        C40711b(C40709o oVar, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            this.f95319a = oVar;
            this.f95320b = valueCallback;
            this.f95321c = fileChooserParams;
        }

        @Override // com.p2082ss.android.ugc.aweme.p2440ce.C35444b.AbstractC35447b
        /* renamed from: a */
        public final void mo53515a(String[] strArr, int[] iArr) {
            String str;
            C89219l.m154716b(iArr, "");
            for (int i : iArr) {
                if (i != 0) {
                    return;
                }
            }
            this.f95319a.f95315b = this.f95320b;
            C40709o oVar = this.f95319a;
            String[] acceptTypes = this.f95321c.getAcceptTypes();
            C89219l.m154716b(acceptTypes, "");
            if (acceptTypes.length == 0) {
                str = "";
            } else {
                str = this.f95321c.getAcceptTypes()[0];
            }
            oVar.mo69891a(str, "");
        }
    }

    /* renamed from: a */
    private static Uri m82120a(Context context, File file) {
        if (context == null || Build.VERSION.SDK_INT < 24 || context.getApplicationInfo().targetSdkVersion < 24) {
            return Uri.fromFile(file);
        }
        return FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", file);
    }

    /* renamed from: a */
    private static File m82122a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            return context.getExternalFilesDir(str);
        }
        if (C58016d.f132223d != null && C58016d.f132224e) {
            return C58016d.f132223d;
        }
        File externalFilesDir = context.getExternalFilesDir(str);
        C58016d.f132223d = externalFilesDir;
        return externalFilesDir;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0167  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo69891a(java.lang.String r16, java.lang.String r17) {
        /*
        // Method dump skipped, instructions count: 385
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.C40709o.mo69891a(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0072, code lost:
        if (r4 == null) goto L_0x001d;
     */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 117
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.C40709o.onActivityResult(int, int, android.content.Intent):void");
    }
}
