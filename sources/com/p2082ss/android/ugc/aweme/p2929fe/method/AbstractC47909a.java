package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34467b;
import com.p2082ss.android.ugc.aweme.p2929fe.method.upload.AbstractC47982b;
import com.p2082ss.android.ugc.aweme.views.DialogC81438i;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import org.json.JSONArray;

/* renamed from: com.ss.android.ugc.aweme.fe.method.a */
public abstract class AbstractC47909a implements AbstractC34467b, AbstractC47963m {

    /* renamed from: a */
    private WeakReference<Context> f110959a;

    /* renamed from: c */
    public C47912a f110960c;

    /* renamed from: d */
    public AbstractC47982b f110961d;

    /* renamed from: e */
    public short[] f110962e;

    /* renamed from: f */
    public boolean f110963f = true;

    static {
        Covode.recordClassIndex(56606);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.a$a */
    public static class C47912a {

        /* renamed from: a */
        WeakReference<AbstractC47982b> f110968a;

        /* renamed from: b */
        private DialogC81438i f110969b;

        static {
            Covode.recordClassIndex(56609);
        }

        /* renamed from: a */
        public final void mo79936a() {
            DialogC81438i iVar = this.f110969b;
            if (iVar != null) {
                iVar.dismiss();
                this.f110969b = null;
                WeakReference<AbstractC47982b> weakReference = this.f110968a;
                if (weakReference != null) {
                    weakReference.clear();
                    this.f110968a = null;
                }
            }
        }

        /* renamed from: a */
        public final void mo79937a(Context context) {
            DialogC81438i iVar = this.f110969b;
            if (iVar == null || !iVar.isShowing()) {
                DialogC81438i iVar2 = new DialogC81438i(context, context.getString(R.string.h47));
                this.f110969b = iVar2;
                iVar2.show();
            }
        }

        /* renamed from: a */
        public final void mo79938a(Context context, AbstractC47982b bVar) {
            this.f110969b = new DialogC81438i(context, context.getString(R.string.h47));
            this.f110968a = new WeakReference<>(bVar);
            this.f110969b.setOnCancelListener(new DialogInterface$OnCancelListenerC47919b(this));
            this.f110969b.show();
        }
    }

    public AbstractC47909a(WeakReference<Context> weakReference) {
        this.f110959a = weakReference;
        this.f110960c = new C47912a();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007a, code lost:
        if (r1.equals("camera-image") == false) goto L_0x0039;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo79933a(final org.json.JSONObject r7) {
        /*
        // Method dump skipped, instructions count: 242
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2929fe.method.AbstractC47909a.mo79933a(org.json.JSONObject):void");
    }

    /* renamed from: a */
    private String[] m90900a(Resources resources, JSONArray jSONArray) {
        String[] strArr = {resources.getString(R.string.azt), resources.getString(R.string.ay7), resources.getString(R.string.b1q), resources.getString(R.string.b1r), resources.getString(R.string.a8y)};
        int length = jSONArray.length() + 1;
        String[] strArr2 = new String[length];
        this.f110962e = new short[length];
        for (int i = 0; i < length; i++) {
            String optString = jSONArray.optString(i);
            optString.hashCode();
            switch (optString.hashCode()) {
                case -2031693645:
                    if (optString.equals("camera-image")) {
                        this.f110962e[i] = 0;
                        strArr2[i] = strArr[0];
                        continue;
                    }
                    break;
                case -2019804205:
                    if (optString.equals("camera-video")) {
                        this.f110962e[i] = 2;
                        strArr2[i] = strArr[2];
                        continue;
                    }
                    break;
                case -1903465347:
                    if (optString.equals("album-image")) {
                        this.f110962e[i] = 1;
                        strArr2[i] = strArr[1];
                        continue;
                    }
                    break;
                case -1891575907:
                    if (optString.equals("album-video")) {
                        this.f110962e[i] = 3;
                        strArr2[i] = strArr[3];
                        continue;
                    }
                    break;
            }
            this.f110962e[i] = 4;
            strArr2[i] = strArr[4];
        }
        return strArr2;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34467b
    /* renamed from: a */
    public final boolean mo60905a(int i, int i2, Intent intent) {
        AbstractC47982b bVar;
        if ((i == 1 || i == 600 || i == 700 || i == 800 || i == 900 || i == 10003) && (bVar = this.f110961d) != null) {
            return bVar.mo79942a(i, i2, intent);
        }
        mo61886a(0, "uploadFailed");
        return true;
    }
}
