package com.facebook.internal;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.example.p1811a.C23833c;
import com.facebook.AccessToken;
import com.facebook.C24012b;
import com.facebook.C24318i;
import com.facebook.C24798j;
import com.facebook.C24811k;
import com.facebook.C24815l;
import com.facebook.C24872m;
import com.facebook.C24915r;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.share.internal.C24954k;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3386c.C58014b;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84357h;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84365i;
import com.p2082ss.android.ugc.tiktok.security.p4335c.C84367b;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.af */
public class DialogC24700af extends Dialog {

    /* renamed from: k */
    private static final int f58637k = R.style.vd;

    /* renamed from: m */
    private static volatile int f58638m;

    /* renamed from: a */
    public String f58639a;

    /* renamed from: b */
    public String f58640b;

    /* renamed from: c */
    public AbstractC24707c f58641c;

    /* renamed from: d */
    public WebView f58642d;

    /* renamed from: e */
    public ProgressDialog f58643e;

    /* renamed from: f */
    public ImageView f58644f;

    /* renamed from: g */
    public FrameLayout f58645g;

    /* renamed from: h */
    public boolean f58646h;

    /* renamed from: i */
    public boolean f58647i;

    /* renamed from: j */
    public boolean f58648j;

    /* renamed from: l */
    private AsyncTaskC24708d f58649l;

    /* renamed from: n */
    private WindowManager.LayoutParams f58650n;

    /* renamed from: com.facebook.internal.af$c */
    public interface AbstractC24707c {
        static {
            Covode.recordClassIndex(28860);
        }

        /* renamed from: a */
        void mo40543a(Bundle bundle, C24798j jVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40520a(Throwable th) {
        C24798j jVar;
        if (this.f58641c != null && !this.f58646h) {
            this.f58646h = true;
            if (th instanceof C24798j) {
                jVar = (C24798j) th;
            } else {
                jVar = new C24798j(th);
            }
            this.f58641c.mo40543a(null, jVar);
            dismiss();
        }
    }

    /* renamed from: a */
    public final void mo40519a(int i) {
        MethodCollector.m26663i(6193);
        LinearLayout linearLayout = new LinearLayout(getContext());
        C247033 r1 = new WebView(getContext()) {
            /* class com.facebook.internal.DialogC24700af.C247033 */

            static {
                Covode.recordClassIndex(28856);
            }

            public final void goBack() {
                if (!C84365i.m145121b(this)) {
                    super.goBack();
                }
            }

            public final boolean canGoBack() {
                if (!super.canGoBack() || !C84365i.m145120a(this)) {
                    return false;
                }
                return true;
            }

            public final void onWindowFocusChanged(boolean z) {
                try {
                    super.onWindowFocusChanged(z);
                } catch (NullPointerException unused) {
                }
            }

            {
                MethodCollector.m26663i(6952);
                if (C84367b.m145126a()) {
                    WebSettings settings = getSettings();
                    String userAgentString = settings.getUserAgentString();
                    if (!userAgentString.contains("BytedanceWebview/d8a21c6")) {
                        StringBuilder sb = new StringBuilder(userAgentString);
                        if (!TextUtils.isEmpty(sb)) {
                            sb.append(" ");
                        }
                        sb.append("BytedanceWebview/d8a21c6");
                        C1764a.m5930a(settings, sb.toString());
                    }
                }
                MethodCollector.m26664o(6952);
            }
        };
        this.f58642d = r1;
        r1.setVerticalScrollBarEnabled(false);
        this.f58642d.setHorizontalScrollBarEnabled(false);
        m47315a(this.f58642d, new C24706b(this, (byte) 0));
        this.f58642d.getSettings().setJavaScriptEnabled(true);
        m47316a(this.f58642d, this.f58639a);
        this.f58642d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f58642d.setVisibility(4);
        this.f58642d.getSettings().setSavePassword(false);
        this.f58642d.getSettings().setSaveFormData(false);
        this.f58642d.setFocusable(true);
        this.f58642d.setFocusableInTouchMode(true);
        this.f58642d.setOnTouchListener(new View.OnTouchListener() {
            /* class com.facebook.internal.DialogC24700af.View$OnTouchListenerC247044 */

            static {
                Covode.recordClassIndex(28857);
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (view.hasFocus()) {
                    return false;
                }
                view.requestFocus();
                return false;
            }
        });
        linearLayout.setPadding(i, i, i, i);
        linearLayout.addView(this.f58642d);
        linearLayout.setBackgroundColor(-872415232);
        this.f58645g.addView(linearLayout);
        MethodCollector.m26664o(6193);
    }

    public void onDetachedFromWindow() {
        this.f58647i = true;
        super.onDetachedFromWindow();
    }

    static {
        Covode.recordClassIndex(28853);
    }

    public void cancel() {
        if (this.f58641c != null && !this.f58646h) {
            mo40520a(new C24815l());
        }
    }

    public void dismiss() {
        ProgressDialog progressDialog;
        WebView webView = this.f58642d;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.f58647i && (progressDialog = this.f58643e) != null && progressDialog.isShowing()) {
            this.f58643e.dismiss();
        }
        super.dismiss();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        AsyncTaskC24708d dVar = this.f58649l;
        if (dVar != null) {
            dVar.cancel(true);
            this.f58643e.dismiss();
        }
        super.onStop();
    }

    /* renamed from: com.facebook.internal.af$a */
    public static class C24705a {

        /* renamed from: a */
        public Context f58655a;

        /* renamed from: b */
        public String f58656b;

        /* renamed from: c */
        public int f58657c;

        /* renamed from: d */
        public AbstractC24707c f58658d;

        /* renamed from: e */
        public Bundle f58659e;

        /* renamed from: f */
        private String f58660f;

        /* renamed from: g */
        private AccessToken f58661g;

        static {
            Covode.recordClassIndex(28858);
        }

        /* renamed from: a */
        public DialogC24700af mo40536a() {
            AccessToken accessToken = this.f58661g;
            if (accessToken != null) {
                this.f58659e.putString("app_id", accessToken.f56407h);
                this.f58659e.putString("access_token", this.f58661g.f56404e);
            } else {
                this.f58659e.putString("app_id", this.f58656b);
            }
            return DialogC24700af.m47312a(this.f58655a, this.f58660f, this.f58659e, this.f58657c, this.f58658d);
        }

        /* renamed from: a */
        private void m47321a(Context context, String str, Bundle bundle) {
            this.f58655a = context;
            this.f58660f = str;
            if (bundle != null) {
                this.f58659e = bundle;
            } else {
                this.f58659e = new Bundle();
            }
        }

        public C24705a(Context context, String str, Bundle bundle) {
            this.f58661g = C24012b.m45437a().f56861b;
            if (!AccessToken.m45056a()) {
                String a = C24693ad.m47233a(context);
                if (a != null) {
                    this.f58656b = a;
                } else {
                    throw new C24798j("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
            }
            m47321a(context, str, bundle);
        }

        public C24705a(Context context, String str, String str2, Bundle bundle) {
            str = str == null ? C24693ad.m47233a(context) : str;
            C24699ae.m47302a(str, "applicationId");
            this.f58656b = str;
            m47321a(context, str2, bundle);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        AsyncTaskC24708d dVar = this.f58649l;
        if (dVar == null || dVar.getStatus() != AsyncTask.Status.PENDING) {
            mo40518a();
            return;
        }
        this.f58649l.execute(new Void[0]);
        this.f58643e.show();
    }

    public void onAttachedToWindow() {
        AutofillManager autofillManager;
        WindowManager.LayoutParams layoutParams;
        this.f58647i = false;
        Context context = getContext();
        if (Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class)) != null && autofillManager.isAutofillSupported() && autofillManager.isEnabled() && (layoutParams = this.f58650n) != null && layoutParams.token == null) {
            this.f58650n.token = getOwnerActivity().getWindow().getAttributes().token;
            IBinder iBinder = this.f58650n.token;
        }
        super.onAttachedToWindow();
    }

    /* renamed from: com.facebook.internal.af$d */
    class AsyncTaskC24708d extends AsyncTask<Void, Void, String[]> {

        /* renamed from: a */
        public Exception[] f58663a;

        /* renamed from: c */
        private String f58665c;

        /* renamed from: d */
        private Bundle f58666d;

        static {
            Covode.recordClassIndex(28861);
        }

        /* renamed from: a */
        private String[] m47325a() {
            if (C24677a.m47209a(this)) {
                return null;
            }
            try {
                String[] stringArray = this.f58666d.getStringArray("media");
                final String[] strArr = new String[stringArray.length];
                this.f58663a = new Exception[stringArray.length];
                final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                AccessToken accessToken = C24012b.m45437a().f56861b;
                for (final int i = 0; i < stringArray.length; i++) {
                    try {
                        if (isCancelled()) {
                            Iterator it = concurrentLinkedQueue.iterator();
                            while (it.hasNext()) {
                                ((AsyncTask) it.next()).cancel(true);
                            }
                            return null;
                        }
                        Uri parse = Uri.parse(stringArray[i]);
                        if (C24693ad.m47269b(parse)) {
                            strArr[i] = parse.toString();
                            countDownLatch.countDown();
                        } else {
                            concurrentLinkedQueue.add(C24954k.m47858a(accessToken, parse, new GraphRequest.AbstractC23858b() {
                                /* class com.facebook.internal.DialogC24700af.AsyncTaskC24708d.C247091 */

                                static {
                                    Covode.recordClassIndex(28862);
                                }

                                @Override // com.facebook.GraphRequest.AbstractC23858b
                                /* renamed from: a */
                                public final void mo39350a(C24915r rVar) {
                                    try {
                                        FacebookRequestError facebookRequestError = rVar.f59155d;
                                        String str = "Error staging photo.";
                                        if (facebookRequestError != null) {
                                            String a = facebookRequestError.mo39341a();
                                            if (a != null) {
                                                str = a;
                                            }
                                            throw new C24811k(rVar, str);
                                        }
                                        JSONObject jSONObject = rVar.f59153b;
                                        if (jSONObject != null) {
                                            String optString = jSONObject.optString("uri");
                                            if (optString != null) {
                                                strArr[i] = optString;
                                                countDownLatch.countDown();
                                                return;
                                            }
                                            throw new C24798j(str);
                                        }
                                        throw new C24798j(str);
                                    } catch (Exception e) {
                                        AsyncTaskC24708d.this.f58663a[i] = e;
                                    }
                                }
                            }).mo39347a());
                        }
                    } catch (Exception unused) {
                        Iterator it2 = concurrentLinkedQueue.iterator();
                        while (it2.hasNext()) {
                            ((AsyncTask) it2.next()).cancel(true);
                        }
                        return null;
                    }
                }
                countDownLatch.await();
                return strArr;
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
                return null;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public final /* synthetic */ String[] doInBackground(Void[] voidArr) {
            if (C24677a.m47209a(this)) {
                return null;
            }
            try {
                return m47325a();
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
                return null;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(String[] strArr) {
            if (!C24677a.m47209a(this)) {
                try {
                    String[] strArr2 = strArr;
                    if (!C24677a.m47209a(this)) {
                        try {
                            DialogC24700af.this.f58643e.dismiss();
                            Exception[] excArr = this.f58663a;
                            for (Exception exc : excArr) {
                                if (exc != null) {
                                    DialogC24700af.this.mo40520a(exc);
                                    return;
                                }
                            }
                            if (strArr2 == null) {
                                DialogC24700af.this.mo40520a(new C24798j("Failed to stage photos for web dialog"));
                                return;
                            }
                            List asList = Arrays.asList(strArr2);
                            if (asList.contains(null)) {
                                DialogC24700af.this.mo40520a(new C24798j("Failed to stage photos for web dialog"));
                                return;
                            }
                            C24693ad.m47259a(this.f58666d, "media", new JSONArray((Collection) asList));
                            DialogC24700af.this.f58639a = C24693ad.m47228a(C24691ab.m47224a(), C24872m.m47693e() + "/dialog/" + this.f58665c, this.f58666d).toString();
                            DialogC24700af.this.mo40519a((DialogC24700af.this.f58644f.getDrawable().getIntrinsicWidth() / 2) + 1);
                        } catch (Throwable th) {
                            C24677a.m47208a(th, this);
                        }
                    }
                } catch (Throwable th2) {
                    C24677a.m47208a(th2, this);
                }
            }
        }

        AsyncTaskC24708d(String str, Bundle bundle) {
            this.f58665c = str;
            this.f58666d = bundle;
        }
    }

    /* renamed from: a */
    public final void mo40518a() {
        int i;
        int i2;
        Display defaultDisplay = ((WindowManager) m47313a(getContext(), "window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
            i = displayMetrics.widthPixels;
        } else {
            i = displayMetrics.heightPixels;
        }
        if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
            i2 = displayMetrics.heightPixels;
        } else {
            i2 = displayMetrics.widthPixels;
        }
        getWindow().setLayout(Math.min(m47311a(i, displayMetrics.density, 480, 800), displayMetrics.widthPixels), Math.min(m47311a(i2, displayMetrics.density, 800, 1280), displayMetrics.heightPixels));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.internal.af$b */
    public class C24706b extends WebViewClient {
        static {
            Covode.recordClassIndex(28859);
        }

        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return C23833c.m45039a(webView, renderProcessGoneDetail);
        }

        private C24706b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:35:0x0088  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x008e  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean m47323a(java.lang.String r8) {
            /*
            // Method dump skipped, instructions count: 207
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.DialogC24700af.C24706b.m47323a(java.lang.String):boolean");
        }

        /* synthetic */ C24706b(DialogC24700af afVar, byte b) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (C84365i.m145122b(webView, str)) {
                return true;
            }
            return m47323a(str);
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!DialogC24700af.this.f58647i) {
                DialogC24700af.this.f58643e.dismiss();
            }
            DialogC24700af.this.f58645g.setBackgroundColor(0);
            DialogC24700af.this.f58642d.setVisibility(0);
            DialogC24700af.this.f58644f.setVisibility(0);
            DialogC24700af.this.f58648j = true;
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            if (!DialogC24700af.this.f58647i) {
                DialogC24700af.this.f58643e.show();
            }
        }

        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            DialogC24700af.this.mo40520a(new C24318i(null, -11, null));
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            DialogC24700af.this.mo40520a(new C24318i(str, i, str2));
        }
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        if (layoutParams.token == null) {
            this.f58650n = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }

    /* renamed from: a */
    protected static void m47314a(Context context) {
        ApplicationInfo applicationInfo;
        if (context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                String packageName = context.getPackageName();
                if (TextUtils.equals(packageName, C17867d.m33078a().getPackageName())) {
                    if (C58014b.f132218a == null) {
                        C58014b.f132218a = packageManager.getApplicationInfo(packageName, 128);
                    }
                    applicationInfo = C58014b.f132218a;
                } else {
                    applicationInfo = packageManager.getApplicationInfo(packageName, 128);
                }
                if (applicationInfo != null && applicationInfo.metaData != null && f58638m == 0) {
                    int i = applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme");
                    if (i == 0) {
                        i = f58637k;
                    }
                    f58638m = i;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        MethodCollector.m26663i(6021);
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f58643e = progressDialog;
        progressDialog.requestWindowFeature(1);
        this.f58643e.setMessage(getContext().getString(R.string.ahi));
        this.f58643e.setCanceledOnTouchOutside(false);
        this.f58643e.setOnCancelListener(new DialogInterface.OnCancelListener() {
            /* class com.facebook.internal.DialogC24700af.DialogInterface$OnCancelListenerC247011 */

            static {
                Covode.recordClassIndex(28854);
            }

            public final void onCancel(DialogInterface dialogInterface) {
                DialogC24700af.this.cancel();
            }
        });
        requestWindowFeature(1);
        this.f58645g = new FrameLayout(getContext());
        mo40518a();
        getWindow().setGravity(17);
        getWindow().setSoftInputMode(16);
        ImageView imageView = new ImageView(getContext());
        this.f58644f = imageView;
        imageView.setOnClickListener(new View.OnClickListener() {
            /* class com.facebook.internal.DialogC24700af.View$OnClickListenerC247022 */

            static {
                Covode.recordClassIndex(28855);
            }

            public final void onClick(View view) {
                if (!C24677a.m47209a(this)) {
                    try {
                        DialogC24700af.this.cancel();
                    } catch (Throwable th) {
                        C24677a.m47208a(th, this);
                    }
                }
            }
        });
        this.f58644f.setImageDrawable(getContext().getResources().getDrawable(2131231595));
        this.f58644f.setVisibility(4);
        if (this.f58639a != null) {
            mo40519a((this.f58644f.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        this.f58645g.addView(this.f58644f, new ViewGroup.LayoutParams(-2, -2));
        setContentView(this.f58645g);
        MethodCollector.m26664o(6021);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bundle mo40517a(String str) {
        Uri parse = Uri.parse(str);
        Bundle c = C24693ad.m47271c(parse.getQuery());
        c.putAll(C24693ad.m47271c(parse.getFragment()));
        return c;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    protected DialogC24700af(Context context, String str) {
        this(context, str, f58638m);
        C24699ae.m47299a();
    }

    /* renamed from: a */
    private static void m47316a(WebView webView, String str) {
        MethodCollector.m26663i(6344);
        String a = C84357h.f188595a.mo129370a(webView, str);
        if (!TextUtils.isEmpty(a)) {
            str = a;
        }
        webView.loadUrl(str);
        MethodCollector.m26664o(6344);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            WebView webView = this.f58642d;
            if (webView == null || !webView.canGoBack()) {
                cancel();
            } else {
                this.f58642d.goBack();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* renamed from: a */
    private static Object m47313a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(6180);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(6180);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    private static void m47315a(WebView webView, WebViewClient webViewClient) {
        if (C84367b.m145126a()) {
            WebSettings settings = webView.getSettings();
            String userAgentString = settings.getUserAgentString();
            if (!userAgentString.contains("BytedanceWebview/d8a21c6")) {
                StringBuilder sb = new StringBuilder(userAgentString);
                if (!TextUtils.isEmpty(sb)) {
                    sb.append(" ");
                }
                sb.append("BytedanceWebview/d8a21c6");
                settings.setUserAgentString(sb.toString());
            }
        }
        webView.setWebViewClient(C23833c.m45038a(webViewClient));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private DialogC24700af(android.content.Context r2, java.lang.String r3, int r4) {
        /*
            r1 = this;
            if (r4 != 0) goto L_0x0007
            com.facebook.internal.C24699ae.m47299a()
            int r4 = com.facebook.internal.DialogC24700af.f58638m
        L_0x0007:
            r1.<init>(r2, r4)
            java.lang.String r0 = "fbconnect://success"
            r1.f58640b = r0
            r0 = 0
            r1.f58646h = r0
            r1.f58647i = r0
            r1.f58648j = r0
            r1.f58639a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.DialogC24700af.<init>(android.content.Context, java.lang.String, int):void");
    }

    /* renamed from: a */
    private static int m47311a(int i, float f, int i2, int i3) {
        int i4 = (int) (((float) i) / f);
        double d = 0.5d;
        if (i4 <= i2) {
            d = 1.0d;
        } else if (i4 < i3) {
            double d2 = (double) (i3 - i4);
            double d3 = (double) (i3 - i2);
            Double.isNaN(d2);
            Double.isNaN(d3);
            d = 0.5d + ((d2 / d3) * 0.5d);
        }
        double d4 = (double) i;
        Double.isNaN(d4);
        return (int) (d4 * d);
    }

    /* renamed from: a */
    public static DialogC24700af m47312a(Context context, String str, Bundle bundle, int i, AbstractC24707c cVar) {
        m47314a(context);
        return new DialogC24700af(context, str, bundle, i, cVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private DialogC24700af(android.content.Context r5, java.lang.String r6, android.os.Bundle r7, int r8, com.facebook.internal.DialogC24700af.AbstractC24707c r9) {
        /*
        // Method dump skipped, instructions count: 148
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.DialogC24700af.<init>(android.content.Context, java.lang.String, android.os.Bundle, int, com.facebook.internal.af$c):void");
    }
}
