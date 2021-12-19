package com.linecorp.linesdk.auth.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import androidx.browser.p024a.C0479c;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.linecorp.linesdk.C28141a;
import com.linecorp.linesdk.EnumC28179b;
import com.linecorp.linesdk.LineAccessToken;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.LineCredential;
import com.linecorp.linesdk.LineProfile;
import com.linecorp.linesdk.auth.LineAuthenticationConfig;
import com.linecorp.linesdk.auth.LineLoginResult;
import com.linecorp.linesdk.auth.internal.C28167a;
import com.linecorp.linesdk.auth.internal.C28176d;
import com.linecorp.linesdk.p2028a.C28142a;
import com.linecorp.linesdk.p2028a.C28160d;
import com.linecorp.linesdk.p2028a.C28161e;
import com.linecorp.linesdk.p2028a.C28162f;
import com.linecorp.linesdk.p2028a.p2029a.C28149b;
import com.linecorp.linesdk.p2028a.p2029a.C28155d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.linecorp.linesdk.auth.internal.c */
final class C28172c {

    /* renamed from: a */
    final LineAuthenticationActivity f65938a;

    /* renamed from: b */
    final LineAuthenticationConfig f65939b;

    /* renamed from: c */
    final C28149b f65940c;

    /* renamed from: d */
    final C28155d f65941d;

    /* renamed from: e */
    final C28167a f65942e;

    /* renamed from: f */
    final C28142a f65943f;

    /* renamed from: g */
    final String[] f65944g;

    /* renamed from: h */
    final C28176d f65945h;

    static {
        Covode.recordClassIndex(34118);
    }

    /* renamed from: com.linecorp.linesdk.auth.internal.c$b */
    class RunnableC28174b implements Runnable {
        static {
            Covode.recordClassIndex(34120);
        }

        public final void run() {
            if (C28172c.this.f65945h.f65952d != C28176d.EnumC28178a.f65955c && !C28172c.this.f65938a.isFinishing()) {
                C28172c.this.f65938a.mo48166a(LineLoginResult.f65914a);
            }
        }

        private RunnableC28174b() {
        }

        /* synthetic */ RunnableC28174b(C28172c cVar, byte b) {
            this();
        }
    }

    /* renamed from: com.linecorp.linesdk.auth.internal.c$a */
    class AsyncTaskC28173a extends AsyncTask<String, Void, LineLoginResult> {
        static {
            Covode.recordClassIndex(34119);
        }

        private AsyncTaskC28173a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(LineLoginResult lineLoginResult) {
            C28172c.this.f65945h.f65952d = C28176d.EnumC28178a.f65956d;
            C28172c.this.f65938a.mo48166a(lineLoginResult);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public final /* synthetic */ LineLoginResult doInBackground(String[] strArr) {
            String str;
            String[] strArr2 = strArr;
            if (strArr2 == null || strArr2.length != 1) {
                str = null;
            } else {
                str = strArr2[0];
            }
            C28162f fVar = C28172c.this.f65945h.f65949a;
            String str2 = C28172c.this.f65945h.f65950b;
            if (TextUtils.isEmpty(str) || fVar == null || TextUtils.isEmpty(str2)) {
                return new LineLoginResult(EnumC28179b.INTERNAL_ERROR, new LineApiError("Requested data is missing."));
            }
            C28149b bVar = C28172c.this.f65940c;
            String str3 = C28172c.this.f65939b.f65904a;
            Uri build = bVar.f65879f.buildUpon().appendPath("oauth").appendPath("accessToken").build();
            HashMap hashMap = new HashMap(5);
            hashMap.put("grant_type", "authorization_code");
            hashMap.put("code", str);
            hashMap.put("redirect_uri", str2);
            hashMap.put("client_id", str3);
            hashMap.put("otp", fVar.f65898b);
            C28141a a = bVar.f65880g.mo48133a(build, Collections.emptyMap(), hashMap, C28149b.f65875b);
            if (!a.mo48124a()) {
                return C28172c.m56277a(a);
            }
            C28161e eVar = (C28161e) a.mo48125b();
            C28160d dVar = eVar.f65895a;
            C28155d dVar2 = C28172c.this.f65941d;
            Uri build2 = dVar2.f65883b.buildUpon().appendPath("profile").build();
            HashMap hashMap2 = new HashMap(1);
            hashMap2.put("Authorization", "Bearer " + dVar.f65891a);
            C28141a b = dVar2.f65884c.mo48134b(build2, hashMap2, Collections.emptyMap(), C28155d.f65882a);
            if (!b.mo48124a()) {
                return C28172c.m56277a(b);
            }
            C28142a aVar = C28172c.this.f65943f;
            C34822d.m71158a(aVar.f65860a, aVar.f65861b, 0).edit().putString("accessToken", aVar.mo48130a(dVar.f65891a)).putString("expiresIn", aVar.mo48129a(dVar.f65892b)).putString("issuedClientTime", aVar.mo48129a(dVar.f65893c)).putString("refreshToken", aVar.mo48130a(dVar.f65894d)).apply();
            return new LineLoginResult((LineProfile) b.mo48125b(), new LineCredential(new LineAccessToken(dVar.f65891a, dVar.f65892b, dVar.f65893c), eVar.f65896b));
        }

        /* synthetic */ AsyncTaskC28173a(C28172c cVar, byte b) {
            this();
        }
    }

    /* renamed from: com.linecorp.linesdk.auth.internal.c$c */
    class AsyncTaskC28175c extends AsyncTask<Void, Void, C28141a<C28162f>> {
        static {
            Covode.recordClassIndex(34121);
        }

        private AsyncTaskC28175c() {
        }

        /* renamed from: a */
        private static Bundle m56278a(Intent intent) {
            try {
                return intent.getExtras();
            } catch (Exception unused) {
                return null;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public final /* synthetic */ C28141a<C28162f> doInBackground(Void[] voidArr) {
            C28149b bVar = C28172c.this.f65940c;
            String str = C28172c.this.f65939b.f65904a;
            Uri build = bVar.f65879f.buildUpon().appendPath("oauth").appendPath("otp").build();
            HashMap hashMap = new HashMap(1);
            hashMap.put("client_id", str);
            return bVar.f65880g.mo48133a(build, Collections.emptyMap(), hashMap, C28149b.f65874a);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(C28141a<C28162f> aVar) {
            C28167a.C28168a aVar2;
            C28171b bVar;
            C28141a<C28162f> aVar3 = aVar;
            if (!aVar3.mo48124a()) {
                C28172c.this.f65945h.f65952d = C28176d.EnumC28178a.f65956d;
                C28172c.this.f65938a.mo48166a(C28172c.m56277a(aVar3));
                return;
            }
            C28162f b = aVar3.mo48125b();
            C28172c.this.f65945h.f65949a = b;
            try {
                C28167a aVar4 = C28172c.this.f65942e;
                LineAuthenticationActivity lineAuthenticationActivity = C28172c.this.f65938a;
                LineAuthenticationConfig lineAuthenticationConfig = C28172c.this.f65939b;
                String[] strArr = C28172c.this.f65944g;
                byte[] bArr = new byte[8];
                long nextLong = new SecureRandom().nextLong();
                int i = 0;
                while (true) {
                    bArr[i] = (byte) ((int) nextLong);
                    nextLong >>= 8;
                    i++;
                    if (i >= 8) {
                        break;
                    }
                }
                String encodeToString = Base64.encodeToString(bArr, 11);
                aVar4.f65923b.f65951c = encodeToString;
                String str = "intent://result#Intent;package=" + lineAuthenticationActivity.getPackageName() + ";scheme=lineauth;end";
                Uri.Builder appendQueryParameter = lineAuthenticationConfig.f65906c.buildUpon().appendQueryParameter("response_type", "code").appendQueryParameter("client_id", lineAuthenticationConfig.f65904a).appendQueryParameter("state", encodeToString).appendQueryParameter("otpId", b.f65897a).appendQueryParameter("redirect_uri", str);
                if (strArr != null && strArr.length > 0) {
                    appendQueryParameter.appendQueryParameter("scope", TextUtils.join(" ", strArr));
                }
                Uri build = appendQueryParameter.build();
                boolean z = lineAuthenticationConfig.f65907d;
                int i2 = Build.VERSION.SDK_INT;
                C0479c.C0480a aVar5 = new C0479c.C0480a();
                aVar5.f1824a.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", C0643b.m2378c(lineAuthenticationActivity, 17170443));
                C0479c a = aVar5.mo2041a();
                Intent data = a.f1822a.setData(build);
                Bundle bundle = a.f1823b;
                C28171b a2 = C28171b.m56275a(lineAuthenticationActivity);
                if (a2 == null) {
                    aVar2 = new C28167a.C28168a(data, bundle, false);
                } else if (z || (bVar = C28167a.f65922a) == null || (a2.f65935a == bVar.f65935a ? a2.f65936b == bVar.f65936b ? a2.f65937c < bVar.f65937c : a2.f65936b < bVar.f65936b : a2.f65935a < bVar.f65935a)) {
                    List<Intent> a3 = C28167a.m56270a(build, lineAuthenticationActivity.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0), m56278a(data));
                    int size = a3.size();
                    if (size == 0) {
                        throw new ActivityNotFoundException("Activity for LINE log-in is not found. uri=".concat(String.valueOf(build)));
                    } else if (size == 1) {
                        aVar2 = new C28167a.C28168a(a3.get(0), bundle, false);
                    } else {
                        Intent createChooser = Intent.createChooser(a3.remove(0), null);
                        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) a3.toArray(new Parcelable[a3.size()]));
                        aVar2 = new C28167a.C28168a(createChooser, bundle, false);
                    }
                } else {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(build);
                    intent.setPackage("jp.naver.line.android");
                    aVar2 = new C28167a.C28168a(intent, bundle, true);
                }
                C28167a.C28169b bVar2 = new C28167a.C28169b(aVar2.f65924a, aVar2.f65925b, str, aVar2.f65926c);
                if (bVar2.f65930d) {
                    int i3 = Build.VERSION.SDK_INT;
                    LineAuthenticationActivity lineAuthenticationActivity2 = C28172c.this.f65938a;
                    Intent intent2 = bVar2.f65927a;
                    Bundle bundle2 = bVar2.f65928b;
                    C84349a.m145093a(intent2, lineAuthenticationActivity2);
                    lineAuthenticationActivity2.startActivity(intent2, bundle2);
                } else {
                    int i4 = Build.VERSION.SDK_INT;
                    C28172c.this.f65938a.startActivityForResult(bVar2.f65927a, 3, bVar2.f65928b);
                }
                C28172c.this.f65945h.f65950b = bVar2.f65929c;
            } catch (ActivityNotFoundException e) {
                C28172c.this.f65945h.f65952d = C28176d.EnumC28178a.f65956d;
                C28172c.this.f65938a.mo48166a(new LineLoginResult(EnumC28179b.INTERNAL_ERROR, new LineApiError(e)));
            }
        }

        /* synthetic */ AsyncTaskC28175c(C28172c cVar, byte b) {
            this();
        }
    }

    /* renamed from: a */
    private static Context m56276a(LineAuthenticationActivity lineAuthenticationActivity) {
        Context applicationContext = lineAuthenticationActivity.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: a */
    static /* synthetic */ LineLoginResult m56277a(C28141a aVar) {
        return new LineLoginResult(aVar.f65857b, aVar.f65858c);
    }

    C28172c(LineAuthenticationActivity lineAuthenticationActivity, LineAuthenticationConfig lineAuthenticationConfig, C28176d dVar, String[] strArr) {
        this(lineAuthenticationActivity, lineAuthenticationConfig, new C28149b(m56276a(lineAuthenticationActivity), lineAuthenticationConfig.f65905b), new C28155d(m56276a(lineAuthenticationActivity), lineAuthenticationConfig.f65905b), new C28167a(dVar), new C28142a(m56276a(lineAuthenticationActivity), lineAuthenticationConfig.f65904a), dVar, strArr);
    }

    private C28172c(LineAuthenticationActivity lineAuthenticationActivity, LineAuthenticationConfig lineAuthenticationConfig, C28149b bVar, C28155d dVar, C28167a aVar, C28142a aVar2, C28176d dVar2, String[] strArr) {
        this.f65938a = lineAuthenticationActivity;
        this.f65939b = lineAuthenticationConfig;
        this.f65940c = bVar;
        this.f65941d = dVar;
        this.f65942e = aVar;
        this.f65943f = aVar2;
        this.f65945h = dVar2;
        this.f65944g = strArr;
    }
}
