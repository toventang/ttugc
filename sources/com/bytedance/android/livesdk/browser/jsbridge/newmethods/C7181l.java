package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Base64;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.browser.C6935a;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11265g;
import com.bytedance.android.livesdk.utils.crop.C11256a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.web.jsbridge2.AbstractC18334e;
import com.bytedance.ies.web.jsbridge2.C18338g;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.C89391z;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.l */
public final class C7181l extends AbstractC18334e<C7182a, C7183b> {

    /* renamed from: a */
    private Fragment f17876a;

    /* renamed from: b */
    private final String f17877b = "upload_photo";

    /* renamed from: c */
    private String f17878c;

    /* renamed from: d */
    private C7182a f17879d;

    static {
        Covode.recordClassIndex(7927);
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final void onTerminate() {
        this.f17876a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.l$a */
    public static final class C7182a {
        @AbstractC27891c(mo46611a = "min_width")

        /* renamed from: a */
        int f17880a;
        @AbstractC27891c(mo46611a = "min_height")

        /* renamed from: b */
        int f17881b;
        @AbstractC27891c(mo46611a = "max_width")

        /* renamed from: c */
        int f17882c;
        @AbstractC27891c(mo46611a = "max_height")

        /* renamed from: d */
        int f17883d;
        @AbstractC27891c(mo46611a = "max_size")

        /* renamed from: e */
        int f17884e;

        static {
            Covode.recordClassIndex(7928);
        }

        C7182a() {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.l$b */
    static final class C7183b {
        @AbstractC27891c(mo46611a = "tempFiles")

        /* renamed from: a */
        C7184a[] f17885a;

        static {
            Covode.recordClassIndex(7929);
        }

        private C7183b(C7184a[] aVarArr) {
            this.f17885a = aVarArr;
        }

        /* synthetic */ C7183b(C7184a[] aVarArr, byte b) {
            this(aVarArr);
        }

        /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.l$b$a */
        static class C7184a {
            @AbstractC27891c(mo46611a = "path")

            /* renamed from: a */
            String f17886a;
            @AbstractC27891c(mo46611a = "size")

            /* renamed from: b */
            int f17887b;
            @AbstractC27891c(mo46611a = "base64Data")

            /* renamed from: c */
            String f17888c;

            static {
                Covode.recordClassIndex(7930);
            }

            public C7184a(String str, int i, String str2) {
                this.f17886a = str;
                this.f17887b = i;
                this.f17888c = str2;
            }
        }
    }

    public C7181l(Fragment fragment) {
        this.f17876a = fragment;
    }

    /* renamed from: a */
    private static Context m15094a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: a */
    private void m15095a(Uri uri) {
        C11256a a = C11256a.C11257a.m19949a(uri);
        a.mo18026a(new C7185m(this));
        a.show(this.f17876a.getChildFragmentManager(), "upload_photo");
    }

    /* renamed from: b */
    private boolean m15096b(String str) {
        MethodCollector.m26663i(7518);
        Context context = this.callContext.f43859a;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            if (this.f17879d.f17880a > options.outWidth || this.f17879d.f17881b > options.outHeight) {
                C11226ao.m19882a(m15094a(context), (int) R.string.guf);
                MethodCollector.m26664o(7518);
                return false;
            }
            if (options.outWidth > this.f17879d.f17882c || options.outHeight > this.f17879d.f17883d || options.outWidth * options.outHeight > this.f17879d.f17884e) {
                C11226ao.m19882a(m15094a(context), (int) R.string.gue);
                MethodCollector.m26664o(7518);
                return false;
            }
            MethodCollector.m26664o(7518);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C89391z mo13379a(String str) {
        ActivityC0945e activity = this.f17876a.getActivity();
        if (activity == null) {
            finishWithFailure();
            return null;
        } else if (!m15096b(str)) {
            C6935a.m14799a(activity, this.f17876a);
            return null;
        } else {
            Context context = this.callContext.f43859a;
            if (context != null) {
                File file = new File(str);
                if (!file.exists()) {
                    finishWithFailure();
                } else {
                    byte[] a = C11265g.m19962a(file);
                    if (!(a == null || a.length == 0)) {
                        if (a.length >= this.f17879d.f17884e) {
                            C11226ao.m19883a(m15094a(context), C3966y.m9660a((int) R.string.gpg, Integer.valueOf((this.f17879d.f17884e / 1024) / 1024)), 0);
                        } else {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("uri", str);
                                jSONObject.put("file_name", "upload_photo_" + this.f17878c + "crop");
                                finishWithResult(new C7183b(new C7183b.C7184a[]{new C7183b.C7184a(jSONObject.toString(), a.length, "data:image/jpg;base64," + Base64.encodeToString(a, 2))}, (byte) 0));
                            } catch (JSONException e) {
                                e.printStackTrace();
                                finishWithFailure();
                            }
                        }
                    }
                }
            }
            return null;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final /* synthetic */ void invoke(C7182a aVar, C18338g gVar) {
        this.f17879d = aVar;
        this.f17878c = String.valueOf(System.currentTimeMillis());
        C6935a.m14799a(this.f17876a.getActivity(), this.f17876a);
    }

    /* renamed from: a */
    public final void mo13380a(int i, int i2, Intent intent) {
        MethodCollector.m26663i(7364);
        if (i == 40003) {
            if (i2 != -1 || intent == null || intent.getData() == null) {
                finishWithFailure();
                MethodCollector.m26664o(7364);
                return;
            }
            ActivityC0945e activity = this.f17876a.getActivity();
            if (activity == null) {
                finishWithFailure();
                MethodCollector.m26664o(7364);
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
                finishWithFailure();
                MethodCollector.m26664o(7364);
                return;
            }
            m15095a(data);
        }
        MethodCollector.m26664o(7364);
    }
}
