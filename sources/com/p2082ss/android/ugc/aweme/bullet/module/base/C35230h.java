package com.p2082ss.android.ugc.aweme.bullet.module.base;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.webkit.ValueCallback;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38680bg;
import com.p2082ss.android.ugc.aweme.p2440ce.C35444b;
import java.io.File;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.base.h */
public final class C35230h extends Fragment {

    /* renamed from: e */
    public static final C35231a f83235e = new C35231a((byte) 0);

    /* renamed from: a */
    public ValueCallback<Uri> f83236a;

    /* renamed from: b */
    public ValueCallback<Uri[]> f83237b;

    /* renamed from: c */
    public String f83238c;

    /* renamed from: d */
    public boolean f83239d;

    /* renamed from: f */
    private HashMap f83240f;

    static {
        Covode.recordClassIndex(42392);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.h$a */
    public static final class C35231a {
        static {
            Covode.recordClassIndex(42393);
        }

        private C35231a() {
        }

        public /* synthetic */ C35231a(byte b) {
            this();
        }
    }

    /* renamed from: c */
    private static Intent m72143c() {
        return new Intent("android.media.action.VIDEO_CAPTURE");
    }

    /* renamed from: d */
    private static Intent m72144d() {
        return new Intent("android.provider.MediaStore.RECORD_SOUND");
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f83240f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: a */
    private final Intent m72138a() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        Intent a = m72140a(m72142b(), m72143c(), m72144d());
        a.putExtra("android.intent.extra.INTENT", intent);
        return a;
    }

    /* renamed from: b */
    private final Intent m72142b() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        this.f83238c = C38680bg.m78485a() + File.separator + System.currentTimeMillis() + ".jpg";
        Context context = getContext();
        String str = this.f83238c;
        if (str == null) {
            C89219l.m154715b();
        }
        intent.putExtra("output", m72141a(context, new File(str)));
        return intent;
    }

    /* renamed from: a */
    private static Intent m72139a(String str) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(str);
        return intent;
    }

    /* renamed from: a */
    private static Intent m72140a(Intent... intentArr) {
        Intent intent = new Intent("android.intent.action.CHOOSER");
        intent.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
        return intent;
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.base.h$b */
    static final class C35232b implements C35444b.AbstractC35447b {

        /* renamed from: a */
        final /* synthetic */ C35230h f83241a;

        /* renamed from: b */
        final /* synthetic */ ValueCallback f83242b;

        /* renamed from: c */
        final /* synthetic */ String[] f83243c;

        static {
            Covode.recordClassIndex(42394);
        }

        C35232b(C35230h hVar, ValueCallback valueCallback, String[] strArr) {
            this.f83241a = hVar;
            this.f83242b = valueCallback;
            this.f83243c = strArr;
        }

        @Override // com.p2082ss.android.ugc.aweme.p2440ce.C35444b.AbstractC35447b
        /* renamed from: a */
        public final void mo53515a(String[] strArr, int[] iArr) {
            String str;
            C89219l.m154716b(iArr, "");
            int length = iArr.length;
            int i = 0;
            while (i < length && iArr[i] == 0) {
                this.f83241a.f83237b = this.f83242b;
                C35230h hVar = this.f83241a;
                String[] strArr2 = this.f83243c;
                if (strArr2 == null || strArr2.length == 0) {
                    str = "";
                } else {
                    str = strArr2[0];
                }
                hVar.mo62124a(str, "");
                i++;
            }
        }
    }

    /* renamed from: a */
    private static Uri m72141a(Context context, File file) {
        if (context == null || Build.VERSION.SDK_INT < 24 || context.getApplicationInfo().targetSdkVersion < 24) {
            return Uri.fromFile(file);
        }
        return FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", file);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0167  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62124a(java.lang.String r16, java.lang.String r17) {
        /*
        // Method dump skipped, instructions count: 385
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.bullet.module.base.C35230h.mo62124a(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0069, code lost:
        if (r3 == null) goto L_0x001d;
     */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r7, int r8, android.content.Intent r9) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.bullet.module.base.C35230h.onActivityResult(int, int, android.content.Intent):void");
    }
}
