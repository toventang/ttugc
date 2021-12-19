package com.bytedance.android.livesdk.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.ContentUris;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.appcompat.app.DialogInterfaceC0216c;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.p379n.AbstractC5773g;
import com.bytedance.android.livesdk.TTLiveFileProvider;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p562k.DialogC9146a;
import com.bytedance.android.livesdk.utils.crop.C11256a;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.utils.l */
public final class C11275l implements AbstractC5773g {

    /* renamed from: n */
    private static SimpleDateFormat f26964n;

    /* renamed from: a */
    Activity f26965a;

    /* renamed from: b */
    final Fragment f26966b;

    /* renamed from: c */
    final String f26967c;

    /* renamed from: d */
    String f26968d;

    /* renamed from: e */
    final AbstractC5773g.AbstractC5774a f26969e;

    /* renamed from: f */
    final Map<String, String> f26970f;

    /* renamed from: g */
    private final Resources f26971g;

    /* renamed from: h */
    private final String f26972h;

    /* renamed from: i */
    private final int f26973i;

    /* renamed from: j */
    private final int f26974j;

    /* renamed from: k */
    private final int f26975k;

    /* renamed from: l */
    private final int f26976l;

    /* renamed from: m */
    private final String f26977m;

    /* renamed from: o */
    private boolean f26978o;

    /* renamed from: p */
    private Dialog f26979p;

    static {
        Covode.recordClassIndex(12907);
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5773g
    /* renamed from: b */
    public final void mo11515b() {
        Dialog dialog = this.f26979p;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* renamed from: f */
    private Uri m19987f() {
        return m19978a(m19988g());
    }

    /* renamed from: g */
    private String m19988g() {
        return this.f26972h + "_" + this.f26968d + this.f26977m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final String mo18035d() {
        return (this.f26972h + "_" + this.f26968d) + ".jpeg";
    }

    /* renamed from: e */
    private Uri m19986e() {
        File file = new File(this.f26967c + "/" + mo18035d());
        if (!file.exists()) {
            try {
                File file2 = new File(this.f26967c);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file.createNewFile();
            } catch (IOException unused) {
                return null;
            }
        }
        return TTLiveFileProvider.getUri(this.f26965a, this.f26965a.getPackageName() + ".ttlive_provider", file);
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5773g
    /* renamed from: c */
    public final void mo11516c() {
        this.f26968d = String.valueOf(System.currentTimeMillis());
        String[] strArr = {this.f26971g.getString(R.string.ejt), this.f26971g.getString(R.string.eju), this.f26971g.getString(R.string.ejs)};
        DialogInterfaceC0216c.C0217a aVar = new DialogInterfaceC0216c.C0217a(this.f26965a);
        aVar.mo452a(strArr, new DialogInterface$OnClickListenerC11276m(this));
        aVar.mo451a(true);
        aVar.mo458b();
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5773g
    /* renamed from: a */
    public final void mo11513a() {
        if (this.f26979p == null) {
            DialogC9146a.C9147a aVar = new DialogC9146a.C9147a(this.f26965a);
            aVar.f22147b = this.f26965a.getString(R.string.gs0);
            aVar.f22148c = true;
            this.f26979p = aVar.mo15240a();
        }
        if (!this.f26979p.isShowing()) {
            this.f26979p.show();
        }
    }

    /* renamed from: a */
    private void m19980a(int i) {
        C11226ao.m19882a(this.f26965a, i);
    }

    /* renamed from: a */
    private void m19981a(Uri uri) {
        C11256a a = C11256a.C11257a.m19949a(uri);
        a.mo18026a(new C11277n(this));
        a.show(this.f26966b.getChildFragmentManager(), this.f26972h);
    }

    /* renamed from: a */
    private Uri m19978a(String str) {
        if (str == null) {
            str = "";
        }
        File file = new File(this.f26967c + "/" + str);
        if (!file.exists()) {
            try {
                File file2 = new File(this.f26967c);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file.createNewFile();
            } catch (IOException unused) {
                return null;
            }
        }
        return Uri.fromFile(file);
    }

    /* renamed from: b */
    private static String m19984b(String str) {
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        try {
            String attribute = new ExifInterface(str).getAttribute("DateTime");
            if (!TextUtils.isEmpty(attribute)) {
                if (f26964n == null) {
                    f26964n = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
                }
                return String.valueOf(f26964n.parse(attribute).getTime());
            }
        } catch (IOException | ParseException unused) {
        }
        return String.valueOf(file.lastModified());
    }

    /* renamed from: b */
    private void m19985b(Uri uri) {
        C3868c.m9492a("ttlive_upload_cover_want_crop", 0, (JSONObject) null);
        Intent intent = new Intent("com.android.camera.action.CROP");
        intent.addFlags(1);
        intent.addFlags(2);
        intent.setDataAndType(uri, "image/*");
        intent.putExtra("crop", "true");
        intent.putExtra("scale", true);
        intent.putExtra("aspectX", this.f26973i);
        intent.putExtra("aspectY", this.f26974j);
        intent.putExtra("return-data", false);
        intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
        intent.putExtra("noFaceDetection", true);
        intent.putExtra("scaleUpIfNeeded", true);
        Uri f = m19987f();
        if (f != null) {
            intent.putExtra("output", f);
        }
        try {
            Fragment fragment = this.f26966b;
            if (fragment != null) {
                fragment.startActivityForResult(intent, 40002);
            } else {
                this.f26965a.startActivityForResult(intent, 40002);
            }
        } catch (Exception unused) {
            m19980a(R.string.gud);
        }
    }

    /* renamed from: a */
    private void m19982a(Uri uri, boolean z) {
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
            if (this.f26978o) {
                m19981a(uri);
            } else {
                m19985b(uri);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0058, code lost:
        if (0 == 0) goto L_0x005d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m19983a(java.lang.String r8, int r9, int r10) {
        /*
            r7 = this;
            r6 = 11379(0x2c73, float:1.5945E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r6)
            r5 = 1
            r1 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0058, all -> 0x0053 }
            r4.<init>(r8)     // Catch:{ FileNotFoundException -> 0x0058, all -> 0x0053 }
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch:{ FileNotFoundException -> 0x0051, all -> 0x004c }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0051, all -> 0x004c }
            r3.inJustDecodeBounds = r5     // Catch:{ FileNotFoundException -> 0x0051, all -> 0x004c }
            android.graphics.BitmapFactory.decodeStream(r4, r1, r3)     // Catch:{ FileNotFoundException -> 0x0051, all -> 0x004c }
            int r0 = r3.outWidth     // Catch:{ FileNotFoundException -> 0x0051, all -> 0x004c }
            r2 = 0
            if (r9 > r0) goto L_0x003a
            int r0 = r3.outHeight     // Catch:{ FileNotFoundException -> 0x0051, all -> 0x004c }
            if (r10 <= r0) goto L_0x0020
            goto L_0x003a
        L_0x0020:
            int r1 = r3.outWidth     // Catch:{ FileNotFoundException -> 0x0051, all -> 0x004c }
            int r0 = r3.outHeight     // Catch:{ FileNotFoundException -> 0x0051, all -> 0x004c }
            int r1 = r1 * r0
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            if (r1 <= r0) goto L_0x0036
            r0 = 2131830992(0x7f1128d0, float:1.9294997E38)
            r7.m19980a(r0)     // Catch:{ FileNotFoundException -> 0x0051, all -> 0x004c }
            r4.close()     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            return r2
        L_0x0036:
            r4.close()     // Catch:{ IOException -> 0x005d }
            goto L_0x005d
        L_0x003a:
            r0 = 2131830993(0x7f1128d1, float:1.9295E38)
            r7.m19980a(r0)
            java.lang.String r0 = "ttlive_upload_cover_small_toast"
            com.bytedance.android.live.core.p214d.C3868c.m9492a(r0, r2, r1)
            r4.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            return r2
        L_0x004c:
            r0 = move-exception
            r4.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x0054
        L_0x0051:
            r1 = r4
            goto L_0x005a
        L_0x0053:
            r0 = move-exception
        L_0x0054:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            throw r0
        L_0x0058:
            if (r1 == 0) goto L_0x005d
        L_0x005a:
            r1.close()
        L_0x005d:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.utils.C11275l.m19983a(java.lang.String, int, int):boolean");
    }

    @Override // com.bytedance.android.live.p379n.AbstractC5773g
    /* renamed from: a */
    public final boolean mo11514a(int i, int i2, Intent intent) {
        if (i == 40003) {
            if (i2 == 0) {
                AbstractC5773g.AbstractC5774a aVar = this.f26969e;
                if (aVar != null) {
                    aVar.mo9127a();
                }
                return false;
            } else if (intent == null) {
                AbstractC5773g.AbstractC5774a aVar2 = this.f26969e;
                if (aVar2 != null) {
                    aVar2.mo9127a();
                }
                return false;
            } else {
                Uri data = intent.getData();
                String a = C11235c.m19906a(this.f26965a, data);
                if (C13627m.m24498a(a)) {
                    AbstractC5773g.AbstractC5774a aVar3 = this.f26969e;
                    if (aVar3 != null) {
                        aVar3.mo9127a();
                    }
                    C13628n.m24507a(this.f26965a, 2131234335, (int) R.string.gub);
                    return false;
                } else if (!new File(a).exists()) {
                    AbstractC5773g.AbstractC5774a aVar4 = this.f26969e;
                    if (aVar4 != null) {
                        aVar4.mo9127a();
                    }
                    C13628n.m24507a(this.f26965a, 2131234335, (int) R.string.gub);
                    return false;
                } else {
                    if ("file".equals(data.getScheme())) {
                        data = C11235c.m19905a(this.f26965a, a);
                    }
                    this.f26970f.put(this.f26968d, m19984b(a));
                    m19982a(data, false);
                    return true;
                }
            }
        } else if (i != 40004) {
            if (i == 40002) {
                if (i2 == 0) {
                    AbstractC5773g.AbstractC5774a aVar5 = this.f26969e;
                    if (aVar5 != null) {
                        aVar5.mo9127a();
                    }
                    return false;
                }
                C6501b.C6502a.m13948a("livesdk_cover_crop_commit").mo12639a().mo12656c("click").mo12654b("live").mo12658d("cover_edit").mo12655b();
                File file = new File(this.f26967c + "/" + m19988g());
                if (file.exists()) {
                    if (!m19983a(file.getAbsolutePath(), this.f26975k, this.f26976l)) {
                        C11235c.m19907a(this.f26965a, this.f26966b);
                        return true;
                    }
                    String absolutePath = file.getAbsolutePath();
                    String remove = this.f26970f.remove(this.f26968d);
                    AbstractC5773g.AbstractC5774a aVar6 = this.f26969e;
                    if (aVar6 != null) {
                        aVar6.mo9128a(absolutePath, remove);
                    }
                }
                return true;
            }
            return false;
        } else if (i2 == 0) {
            AbstractC5773g.AbstractC5774a aVar7 = this.f26969e;
            if (aVar7 != null) {
                aVar7.mo9127a();
            }
            return false;
        } else {
            try {
                this.f26970f.put(this.f26968d, String.valueOf(System.currentTimeMillis()));
                m19982a(m19986e(), true);
                return true;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static AbstractC5773g m19979a(Activity activity, Fragment fragment, String str, int i, int i2, int i3, int i4, AbstractC5773g.AbstractC5774a aVar) {
        return new C11275l(activity, fragment, str, i, i2, i3, i4, aVar);
    }

    private C11275l(Activity activity, Fragment fragment, String str, int i, int i2, int i3, int i4, AbstractC5773g.AbstractC5774a aVar) {
        this(activity, fragment, str, i, i2, i3, i4, aVar, "", false);
    }

    public C11275l(Activity activity, Fragment fragment, String str, int i, int i2, int i3, int i4, AbstractC5773g.AbstractC5774a aVar, boolean z) {
        this(activity, fragment, str, i, i2, i3, i4, aVar, "", z);
    }

    private C11275l(Activity activity, Fragment fragment, String str, int i, int i2, int i3, int i4, AbstractC5773g.AbstractC5774a aVar, String str2, boolean z) {
        this.f26970f = new HashMap();
        this.f26965a = activity;
        this.f26966b = fragment;
        this.f26969e = aVar;
        this.f26973i = i;
        this.f26974j = i2;
        this.f26975k = i3;
        this.f26976l = i4;
        this.f26978o = z;
        this.f26967c = C11265g.m19959a();
        this.f26972h = str + ".data";
        if (this.f26965a == null && fragment != null) {
            this.f26965a = fragment.getActivity();
        }
        this.f26971g = this.f26965a.getResources();
        this.f26977m = str2;
    }
}
