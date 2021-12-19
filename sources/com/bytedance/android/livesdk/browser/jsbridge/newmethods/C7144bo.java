package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.livesdk.TTLiveFileProvider;
import com.bytedance.android.livesdk.browser.C6935a;
import com.bytedance.android.livesdk.browser.jsbridge.p472c.AbstractC7044a;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.android.livesdk.p562k.DialogC9146a;
import com.bytedance.android.livesdk.utils.C11265g;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.web.jsbridge2.AbstractC18334e;
import com.bytedance.ies.web.jsbridge2.C18338g;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.io.IOException;
import p078c.p080b.C1756d;
import p4560f.p4561a.p4565b.AbstractC88412b;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bo */
public final class C7144bo extends AbstractC18334e<C7146a, C7147b> implements AbstractC7044a {

    /* renamed from: a */
    public Fragment f17794a;

    /* renamed from: b */
    public AbstractC88412b f17795b;

    /* renamed from: c */
    public int f17796c;

    /* renamed from: d */
    private String f17797d;

    /* renamed from: e */
    private final String f17798e = "upload_photo";

    /* renamed from: f */
    private String f17799f;

    /* renamed from: g */
    private DialogC9146a f17800g;

    /* renamed from: h */
    private C7146a f17801h;

    /* renamed from: i */
    private Uri f17802i;

    static {
        Covode.recordClassIndex(7890);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bo$a */
    public static final class C7146a {
        @AbstractC27891c(mo46611a = "aspect_x")

        /* renamed from: a */
        int f17806a;
        @AbstractC27891c(mo46611a = "aspect_y")

        /* renamed from: b */
        int f17807b;
        @AbstractC27891c(mo46611a = "min_width")

        /* renamed from: c */
        int f17808c;
        @AbstractC27891c(mo46611a = "min_height")

        /* renamed from: d */
        int f17809d;
        @AbstractC27891c(mo46611a = "max_size")

        /* renamed from: e */
        int f17810e;
        @AbstractC27891c(mo46611a = "action_type")

        /* renamed from: f */
        int f17811f;

        static {
            Covode.recordClassIndex(7892);
        }

        C7146a() {
        }
    }

    /* renamed from: b */
    public final void mo13372b() {
        mo13371a();
        finishWithFailure();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13371a() {
        DialogC9146a aVar = this.f17800g;
        if (aVar != null && aVar.isShowing()) {
            this.f17800g.dismiss();
        }
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final void onTerminate() {
        AbstractC88412b bVar = this.f17795b;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f17794a = null;
        mo13371a();
    }

    /* renamed from: d */
    private void m15074d() {
        Context context = this.callContext.f43859a;
        if (context != null) {
            this.f17802i = C1756d.m5888a(context, m15075e());
        }
    }

    /* renamed from: e */
    private String m15075e() {
        return "upload_photo_" + this.f17799f + "crop";
    }

    /* renamed from: f */
    private String m15076f() {
        return m15077g() + ".temp";
    }

    /* renamed from: g */
    private String m15077g() {
        return "upload_photo_" + this.f17799f;
    }

    /* renamed from: c */
    private Uri m15073c() {
        File file = new File(this.f17797d + "/" + m15076f());
        if (!file.exists()) {
            try {
                File file2 = new File(this.f17797d);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file.createNewFile();
            } catch (IOException e) {
                C6555i.m14021b();
                C3854a.m9455a(6, "ttlive_exception", e.getStackTrace());
            }
        }
        return TTLiveFileProvider.getUri(this.f17794a.getActivity(), this.f17794a.getActivity().getPackageName() + ".ttlive_provider", file);
    }

    public C7144bo(Fragment fragment) {
        this.f17794a = fragment;
        this.f17797d = C11265g.m19959a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r2 = com.bytedance.android.livesdk.utils.C11265g.m19961a(r0, r8);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m15070a(final android.net.Uri r8) {
        /*
        // Method dump skipped, instructions count: 188
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7144bo.m15070a(android.net.Uri):void");
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bo$b */
    static final class C7147b {
        @AbstractC27891c(mo46611a = "uri")

        /* renamed from: a */
        String f17812a;
        @AbstractC27891c(mo46611a = "url")

        /* renamed from: b */
        String f17813b;
        @AbstractC27891c(mo46611a = "image_data")

        /* renamed from: c */
        String f17814c;

        static {
            Covode.recordClassIndex(7893);
        }

        private C7147b(String str, String str2) {
            this.f17812a = str;
            this.f17813b = str2;
        }

        /* synthetic */ C7147b(String str, String str2, byte b) {
            this(str, str2);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final /* synthetic */ void invoke(C7146a aVar, C18338g gVar) {
        C7146a aVar2 = aVar;
        this.f17801h = aVar2;
        this.f17799f = String.valueOf(System.currentTimeMillis());
        ActivityC0945e activity = this.f17794a.getActivity();
        if (aVar2.f17811f == 0) {
            C6935a.m14800a(activity, this.f17794a, this.f17797d, m15076f());
        } else if (aVar2.f17811f == 1) {
            C6935a.m14799a(activity, this.f17794a);
        }
    }

    /* renamed from: a */
    private void m15071a(Uri uri, boolean z) {
        if (uri != null) {
            Intent intent = new Intent("com.android.camera.action.CROP");
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
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            intent.addFlags(1);
            intent.addFlags(2);
            intent.setDataAndType(uri, "image/*");
            intent.putExtra("crop", "true");
            intent.putExtra("scale", true);
            intent.putExtra("aspectX", this.f17801h.f17806a);
            intent.putExtra("aspectY", this.f17801h.f17807b);
            intent.putExtra("return-data", false);
            intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
            intent.putExtra("noFaceDetection", true);
            intent.putExtra("scaleUpIfNeeded", true);
            m15074d();
            Uri uri2 = this.f17802i;
            if (uri2 != null) {
                intent.putExtra("output", uri2);
            }
            try {
                Fragment fragment = this.f17794a;
                if (fragment != null) {
                    fragment.startActivityForResult(intent, 40002);
                }
            } catch (Exception unused2) {
                C13628n.m24506a(this.f17794a.getContext(), (int) R.string.gud);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0078  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m15072a(android.net.Uri r8, int r9, int r10) {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7144bo.m15072a(android.net.Uri, int, int):boolean");
    }

    @Override // com.bytedance.android.livesdk.browser.jsbridge.p472c.AbstractC7044a
    /* renamed from: a */
    public final void mo13336a(int i, int i2, Intent intent) {
        MethodCollector.m26663i(7151);
        if (i == 40003) {
            if (i2 != -1 || intent == null || intent.getData() == null) {
                mo13372b();
                MethodCollector.m26664o(7151);
                return;
            }
            ActivityC0945e activity = this.f17794a.getActivity();
            if (activity == null) {
                mo13372b();
                MethodCollector.m26664o(7151);
                return;
            }
            Uri data = intent.getData();
            Bitmap bitmap = null;
            try {
                bitmap = BitmapFactory.decodeStream(activity.getContentResolver().openInputStream(data));
            } catch (Exception unused) {
            }
            if (bitmap == null) {
                C13628n.m24507a(activity, 2131234335, (int) R.string.gub);
                mo13372b();
                MethodCollector.m26664o(7151);
                return;
            }
            m15071a(data, false);
            MethodCollector.m26664o(7151);
        } else if (i != 40004) {
            if (i == 40002) {
                if (i2 != -1) {
                    mo13372b();
                    MethodCollector.m26664o(7151);
                    return;
                }
                ActivityC0945e activity2 = this.f17794a.getActivity();
                if (activity2 == null) {
                    mo13372b();
                    MethodCollector.m26664o(7151);
                    return;
                }
                Uri uri = this.f17802i;
                if (uri == null) {
                    C13628n.m24507a(activity2, 2131234335, (int) R.string.gub);
                    mo13372b();
                } else if (!m15072a(uri, this.f17801h.f17808c, this.f17801h.f17809d)) {
                    C6935a.m14799a(activity2, this.f17794a);
                    MethodCollector.m26664o(7151);
                    return;
                } else {
                    m15070a(this.f17802i);
                    MethodCollector.m26664o(7151);
                    return;
                }
            }
            MethodCollector.m26664o(7151);
        } else if (i2 != -1) {
            MethodCollector.m26664o(7151);
        } else {
            try {
                m15071a(m15073c(), true);
                MethodCollector.m26664o(7151);
            } catch (Exception e) {
                C6555i.m14021b();
                C3854a.m9455a(6, "ttlive_exception", e.getStackTrace());
                MethodCollector.m26664o(7151);
            }
        }
    }
}
