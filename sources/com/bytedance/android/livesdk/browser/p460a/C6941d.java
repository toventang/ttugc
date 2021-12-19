package com.bytedance.android.livesdk.browser.p460a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.TTLiveFileProvider;
import com.bytedance.android.livesdk.p437ag.C6670f;
import com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d;
import com.bytedance.android.livesdk.utils.C11265g;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.android.livesdk.browser.a.d */
public class C6941d extends C6939b {

    /* renamed from: a */
    public ValueCallback<Uri[]> f17349a;

    /* renamed from: b */
    String f17350b;

    /* renamed from: c */
    boolean f17351c;

    /* renamed from: d */
    private ValueCallback<Uri> f17352d;

    /* renamed from: e */
    private WeakReference<Fragment> f17353e;

    /* renamed from: f */
    private WeakReference<Activity> f17354f;

    static {
        Covode.recordClassIndex(7680);
    }

    /* renamed from: c */
    static Intent m14815c() {
        return new Intent("android.media.action.VIDEO_CAPTURE");
    }

    /* renamed from: d */
    static Intent m14816d() {
        return new Intent("android.provider.MediaStore.RECORD_SOUND");
    }

    /* renamed from: e */
    private Context m14817e() {
        WeakReference<Fragment> weakReference = this.f17353e;
        if (weakReference != null && weakReference.get() != null) {
            return this.f17353e.get().getActivity();
        }
        WeakReference<Activity> weakReference2 = this.f17354f;
        if (weakReference2 == null || weakReference2.get() == null) {
            return null;
        }
        return this.f17354f.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Intent mo13222a() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        Intent a = m14814a(mo13225b(), m14815c(), m14816d());
        a.putExtra("android.intent.extra.INTENT", intent);
        return a;
    }

    public View getVideoLoadingProgressView() {
        MethodCollector.m26663i(7701);
        Context e = m14817e();
        if (e != null) {
            FrameLayout frameLayout = new FrameLayout(e);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            LiveLoadingView liveLoadingView = new LiveLoadingView(e);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            frameLayout.addView(liveLoadingView, layoutParams);
            MethodCollector.m26664o(7701);
            return frameLayout;
        }
        MethodCollector.m26664o(7701);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Intent mo13225b() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        this.f17350b = C11265g.m19959a() + File.separator + System.currentTimeMillis() + ".jpg";
        intent.putExtra("output", TTLiveFileProvider.getUri(m14817e(), m14817e().getPackageName() + ".ttlive_provider", new File(this.f17350b)));
        return intent;
    }

    public C6941d(Activity activity) {
        this.f17354f = new WeakReference<>(activity);
    }

    /* renamed from: a */
    static Intent m14813a(String str) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(str);
        return intent;
    }

    public C6941d(Fragment fragment) {
        this.f17353e = new WeakReference<>(fragment);
    }

    /* renamed from: a */
    static Intent m14814a(Intent... intentArr) {
        Intent intent = new Intent("android.intent.action.CHOOSER");
        intent.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
        return intent;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13224a(Intent intent) {
        WeakReference<Fragment> weakReference = this.f17353e;
        if (weakReference == null || weakReference.get() == null) {
            WeakReference<Activity> weakReference2 = this.f17354f;
            if (weakReference2 != null && weakReference2.get() != null) {
                this.f17354f.get().startActivityForResult(intent, 2048);
                return;
            }
            return;
        }
        this.f17353e.get().startActivityForResult(intent, 2048);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0062, code lost:
        if (r3 == null) goto L_0x001d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13223a(int r7, int r8, android.content.Intent r9) {
        /*
        // Method dump skipped, instructions count: 101
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.p460a.C6941d.mo13223a(int, int, android.content.Intent):void");
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, final ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        final String str;
        Activity activity;
        Fragment fragment;
        if (fileChooserParams.getAcceptTypes().length > 0) {
            str = fileChooserParams.getAcceptTypes()[0];
        } else {
            str = "";
        }
        WeakReference<Activity> weakReference = this.f17354f;
        if (weakReference == null || (activity = weakReference.get()) == null) {
            WeakReference<Fragment> weakReference2 = this.f17353e;
            if (weakReference2 == null || (fragment = weakReference2.get()) == null) {
                activity = null;
            } else {
                activity = fragment.getActivity();
            }
        }
        C6670f.m14183a(activity).mo12816a(new AbstractC6656d() {
            /* class com.bytedance.android.livesdk.browser.p460a.C6941d.C69421 */

            static {
                Covode.recordClassIndex(7681);
            }

            @Override // com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d
            /* renamed from: b */
            public final void mo11014b(String... strArr) {
                valueCallback.onReceiveValue(null);
                C6941d.this.f17349a = null;
            }

            /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00be */
            @Override // com.bytedance.android.livesdk.p437ag.p439b.AbstractC6656d
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo11013a(java.lang.String... r11) {
                /*
                // Method dump skipped, instructions count: 200
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.p460a.C6941d.C69421.mo11013a(java.lang.String[]):void");
            }
        }, "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.CAMERA");
        return true;
    }
}
