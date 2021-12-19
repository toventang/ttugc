package com.p2082ss.android.newmedia.p2167e.p2168a;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.webkit.URLUtil;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.common.p900c.C13500a;
import com.bytedance.common.p900c.C13501b;
import com.bytedance.common.p900c.C13507d;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.uikit.dialog.DialogC18267b;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.newmedia.C30128d;
import com.p2082ss.android.ugc.aweme.CrossPlatformLegacyServiceImpl;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.download.component_api.AbstractC43167a;
import com.p2082ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.p2440ce.C35444b;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Objects;
import p077b.C1731i;
import p078c.p080b.C1757e;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.newmedia.e.a.a */
public final class C30134a {

    /* renamed from: a */
    public boolean f71890a = true;

    /* renamed from: b */
    private WeakReference<Context> f71891b;

    /* renamed from: c */
    private boolean f71892c = true;

    /* renamed from: d */
    private boolean f71893d = true;

    /* renamed from: e */
    private boolean f71894e = true;

    /* renamed from: f */
    private boolean f71895f = true;

    /* renamed from: g */
    private boolean f71896g = true;

    /* renamed from: h */
    private boolean f71897h = true;

    /* renamed from: i */
    private boolean f71898i = true;

    static {
        Covode.recordClassIndex(36633);
    }

    /* renamed from: a */
    public static C30134a m60958a(Context context) {
        return new C30134a(context);
    }

    private C30134a(Context context) {
        this.f71891b = new WeakReference<>(context);
    }

    /* renamed from: a */
    public final void mo53511a(WebView webView) {
        WebSettings settings;
        boolean z;
        String sb;
        if (webView != null && this.f71891b.get() != null && (settings = webView.getSettings()) != null) {
            try {
                settings.setJavaScriptEnabled(this.f71892c);
            } catch (Exception unused) {
            }
            try {
                if (this.f71893d) {
                    settings.setSupportZoom(true);
                    settings.setBuiltInZoomControls(true);
                    C13500a.m24282a(settings);
                } else {
                    settings.setSupportZoom(false);
                }
            } catch (Throwable unused2) {
            }
            settings.setTextZoom(100);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(this.f71894e);
            settings.setDomStorageEnabled(this.f71896g);
            if (!SettingsManager.m29616a().mo25400a("allow_file_access", true) || !this.f71897h) {
                z = false;
            } else {
                z = true;
            }
            settings.setAllowFileAccess(z);
            settings.setBlockNetworkImage(!this.f71898i);
            if (!this.f71890a) {
                try {
                    webView.setLayerType(1, null);
                } catch (Throwable unused3) {
                }
            }
            C13501b.m24283a(webView.getSettings(), true);
            if (!this.f71895f) {
                webView.setOnLongClickListener(null);
                webView.setLongClickable(false);
            } else {
                webView.setLongClickable(true);
                webView.setOnLongClickListener(new View.OnLongClickListener() {
                    /* class com.p2082ss.android.newmedia.p2167e.p2168a.C30134a.View$OnLongClickListenerC301351 */

                    static {
                        Covode.recordClassIndex(36634);
                    }

                    public final boolean onLongClick(View view) {
                        WebView webView;
                        WebView.HitTestResult hitTestResult;
                        if ((view instanceof WebView) && (hitTestResult = (webView = (WebView) view).getHitTestResult()) != null && webView.getSettings() != null && (hitTestResult.getType() == 5 || hitTestResult.getType() == 8)) {
                            final String extra = hitTestResult.getExtra();
                            final Context context = webView.getContext();
                            if (!(extra == null || context == null || !C30128d.m60946a(extra))) {
                                DialogC18267b.C18268a aVar = new DialogC18267b.C18268a(context);
                                aVar.mo29155a(new String[]{context.getString(R.string.hb5)}, new DialogInterface.OnClickListener() {
                                    /* class com.p2082ss.android.newmedia.p2167e.p2168a.C30134a.View$OnLongClickListenerC301351.DialogInterface$OnClickListenerC301361 */

                                    static {
                                        Covode.recordClassIndex(36635);
                                    }

                                    /* renamed from: a */
                                    public final void mo53513a() {
                                        C1731i.m5640b(new CallableC30138b(context, extra), C1731i.f5562a).mo5534a(new C30139c(context), C1731i.f5564c, null);
                                    }

                                    /* renamed from: a */
                                    static final /* synthetic */ Boolean m60960a(Context context, String str) {
                                        boolean z = false;
                                        if (context != null) {
                                            try {
                                                String guessFileName = URLUtil.guessFileName(str, null, "image/jpeg");
                                                Uri a = C1757e.m5902a(context, guessFileName, "image/jpeg");
                                                AbstractC43167a with = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
                                                with.f100626c = guessFileName;
                                                with.f100629f = a.toString();
                                                if (with.mo73400a("ss_web_settings").mo73409f() != 0) {
                                                    z = true;
                                                }
                                            } catch (Throwable unused) {
                                            }
                                        }
                                        return Boolean.valueOf(z);
                                    }

                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        if (C0643b.m2367a(context, "android.permission.WRITE_EXTERNAL_STORAGE") == -1) {
                                            C35444b.m72473a(C34729o.m70950a(context), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C35444b.AbstractC35447b() {
                                                /* class com.p2082ss.android.newmedia.p2167e.p2168a.C30134a.View$OnLongClickListenerC301351.DialogInterface$OnClickListenerC301361.C301371 */

                                                static {
                                                    Covode.recordClassIndex(36636);
                                                }

                                                @Override // com.p2082ss.android.ugc.aweme.p2440ce.C35444b.AbstractC35447b
                                                /* renamed from: a */
                                                public final void mo53515a(String[] strArr, int[] iArr) {
                                                    if (iArr.length <= 0 || iArr[0] != 0) {
                                                        Toast makeText = Toast.makeText(context, (int) R.string.gep, 1);
                                                        if (Build.VERSION.SDK_INT == 25) {
                                                            C80567ic.m139657a(makeText);
                                                        }
                                                        makeText.show();
                                                        return;
                                                    }
                                                    DialogInterface$OnClickListenerC301361.this.mo53513a();
                                                }
                                            });
                                        } else {
                                            mo53513a();
                                        }
                                    }
                                });
                                aVar.mo29159c();
                                return true;
                            }
                        }
                        return false;
                    }
                });
            }
            Context context = webView.getContext();
            C89219l.m154716b(context, "");
            C89219l.m154721d(context, "");
            C89219l.m154721d(webView, "");
            String a = C30141e.m60967a(context, webView);
            if (a == null) {
                a = "";
            }
            StringBuilder append = new StringBuilder().append(a).append(" trill_").append(C17867d.m33084e()).append(" JsSdk/1.0 NetType/");
            Context a2 = C17867d.m33078a();
            if (TextUtils.isEmpty(C58029j.f132254f) || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132254f = NetworkUtils.getNetworkAccessType(a2);
            }
            String str = C58029j.f132254f;
            C89219l.m154716b(str, "");
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            String upperCase = str.toUpperCase();
            C89219l.m154716b(upperCase, "");
            String sb2 = append.append(upperCase).append(" Channel/").append(C17867d.f42595s).append(" AppName/").append(C17867d.m33081b()).append(" app_version/").append(C17867d.m33085f()).toString();
            Locale c = CrossPlatformLegacyServiceImpl.m65225f().mo57046c();
            if (Build.VERSION.SDK_INT >= 21) {
                sb = sb2 + " ByteLocale/" + c.toLanguageTag();
            } else {
                StringBuilder append2 = new StringBuilder().append(sb2).append(" ByteLocale/");
                String locale = c.toString();
                C89219l.m154716b(locale, "");
                sb = append2.append(C89361p.m154868a(locale, "_", "-")).toString();
            }
            String str2 = (sb + " ByteFullLocale/" + CrossPlatformLegacyServiceImpl.m65225f().mo57049d()) + " Region/" + C58071d.m104913g();
            if (!C13627m.m24498a(str2)) {
                WebSettings settings2 = webView.getSettings();
                C89219l.m154716b(settings2, "");
                C1764a.m5930a(settings2, str2);
            }
            C13507d.m24290a(webView.getSettings(), 0);
            C13507d.f32889a.mo21779a(webView);
        }
    }
}
