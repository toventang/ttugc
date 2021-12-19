package com.p2082ss.android.ugc.aweme.livewallpaper.p3419f;

import android.app.Activity;
import android.app.WallpaperInfo;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.apm.C12290b;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.p1710c.C23001b;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.p2324e.C33730a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3418e.C58888c;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3418e.C58889d;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3418e.C58891e;
import com.p2082ss.android.ugc.aweme.p4173ug.UgCommonServiceImpl;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.f.f */
public final class C58901f {
    static {
        Covode.recordClassIndex(69217);
    }

    /* renamed from: a */
    public static float m108217a(int i) {
        return (((float) i) * 1.0f) / 100.0f;
    }

    /* renamed from: a */
    public static boolean m108228a(Context context, String str) {
        try {
            WallpaperInfo wallpaperInfo = WallpaperManager.getInstance(context).getWallpaperInfo();
            if (wallpaperInfo == null) {
                return false;
            }
            String packageName = wallpaperInfo.getPackageName();
            if (m108237d()) {
                return AbstractC58894c.f134066a.equals(packageName);
            }
            return packageName.equals(str);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m108226a(Activity activity, String str, Aweme aweme) {
        if (!m108237d() || activity == null || activity.isFinishing()) {
            return false;
        }
        boolean b = C29843f.m60133b(activity, AbstractC58894c.f134066a);
        if (b && !m108225a(activity)) {
            return false;
        }
        m108221a(activity, b, str, aweme);
        return true;
    }

    /* renamed from: a */
    public static boolean m108227a(Context context) {
        if (m108237d() && C58892a.m108189a(context, AbstractC58894c.f134066a) < C58891e.m108188a()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m108229a(Aweme aweme) {
        if (!m108235b(aweme)) {
            return aweme != null && aweme.getAuthor() != null && !C31575b.m65865g().isMe(aweme.getAuthor().getUid()) && aweme.getAuthor().isSecret();
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m108236c() {
        return SettingsManager.m29616a().mo25400a("live_wallpaper_block", false);
    }

    /* renamed from: d */
    public static boolean m108237d() {
        if (!C58888c.m108186a()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static String m108231b() {
        return m108219a() + "fallback.mp4";
    }

    /* renamed from: a */
    public static String m108219a() {
        File b = m108230b(C17867d.m33078a());
        if (b != null) {
            return b + "/LiveWallpaper/";
        }
        return "";
    }

    /* renamed from: a */
    public static boolean m108225a(Activity activity) {
        if (C58889d.m108187a() > C58892a.m108189a(activity, AbstractC58894c.f134066a)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m108223a(String str) {
        C39162r.m79460a("wallpaper_start_download", new C33744d().mo59983a("enter_from", str).f79943a);
    }

    /* renamed from: b */
    private static File m108230b(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    /* renamed from: b */
    private static void m108233b(String str) {
        C39162r.m79460a("wallpaper_plugin_alert", new C33744d().mo59983a("group_id", str).mo59982a("is_gp_install", Boolean.valueOf(C29843f.m60133b(C17867d.m33078a(), "com.android.vending"))).f79943a);
    }

    /* renamed from: b */
    public static boolean m108235b(Aweme aweme) {
        Video video;
        if (aweme == null || (video = aweme.getVideo()) == null) {
            return true;
        }
        int width = video.getWidth();
        int height = video.getHeight();
        if (width == 0 || height == 0 || aweme.getAwemeType() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static final /* synthetic */ Object m108218a(Context context, boolean z) {
        MethodCollector.m26663i(6282);
        try {
            if (m108237d() && C29843f.m60133b(context, AbstractC58894c.f134066a)) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("need_tighten", z);
                context.getContentResolver().call(AbstractC58894c.f134068c, "change_mode", "", bundle);
            }
        } catch (RuntimeException unused) {
        }
        MethodCollector.m26664o(6282);
        return null;
    }

    /* renamed from: b */
    public static void m108232b(int i, String str) {
        C12290b.m22060a("livewall_paper_download", i, new C33743c().mo59976a("message", str).mo59977a());
        if (!TextUtils.isEmpty(str)) {
            C33830n.m69192a("type_livewall_paper_download", "", new C33743c().mo59976a("message", str).mo59977a());
        }
    }

    /* renamed from: a */
    public static void m108220a(int i, String str) {
        C12290b.m22060a("livewall_paper_setting", i, new C33743c().mo59976a("message", str).mo59977a());
        if (!TextUtils.isEmpty(str)) {
            C33830n.m69192a("type_livewallpaper_setting", "", new C33743c().mo59976a("message", str).mo59977a());
        }
    }

    /* renamed from: b */
    public static void m108234b(String str, String str2, boolean z) {
        C39162r.m79460a("wallpaper_download_result", new C33744d().mo59983a("enter_from", str).mo59983a("group_id", str2).mo59980a("is_success", z ? 1 : 0).f79943a);
    }

    /* renamed from: a */
    public static void m108222a(Activity activity, boolean z, boolean z2) {
        C39162r.m79460a("wallpaper_plugin_download_dialog_click", new C33744d().mo59980a("action", z ? 1 : 0).mo59980a("is_gp_install", C29843f.m60133b(activity, "com.android.vending") ? 1 : 0).mo59980a(StringSet.type, z2 ? 1 : 0).f79943a);
    }

    /* renamed from: a */
    public static void m108224a(String str, String str2, boolean z) {
        int i;
        String str3;
        LiveWallPaperBean liveWallPaperBean = C58895d.f134069e.f134072c;
        if (liveWallPaperBean == null || liveWallPaperBean.getVolume() <= 0.0f) {
            i = 0;
        } else {
            i = 1;
        }
        if (z) {
            str3 = "wall_paper_success";
        } else {
            str3 = "wall_paper_fail";
        }
        C39162r.m79460a(str3, new C33744d().mo59983a("group_id", str).mo59983a("enter_from", str2).mo59980a("is_volume_enable", i).f79943a);
        if (z) {
            UgCommonServiceImpl.m138290j().mo123105d();
        }
    }

    /* renamed from: a */
    private static void m108221a(final Activity activity, final boolean z, String str, final Aweme aweme) {
        int i;
        int i2;
        int i3;
        MethodCollector.m26663i(6129);
        if (activity == null || activity.isFinishing()) {
            MethodCollector.m26664o(6129);
            return;
        }
        if (z) {
            i = R.string.h32;
            i2 = R.string.h33;
            i3 = R.string.h31;
        } else {
            i = R.string.hak;
            i2 = R.string.hal;
            i3 = R.string.cmu;
        }
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageDrawable(new C23001b(activity, R.raw.icon_2pt_live_wallpaper));
        new C17197a.C17200a(activity).mo27189a(i2).mo27194b(i).mo27195b(R.string.dhl, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.C58901f.DialogInterface$OnClickListenerC589032 */

            static {
                Covode.recordClassIndex(69219);
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C58901f.m108222a(activity, false, z);
            }
        }, false).mo27191a(imageView, 48, 48).mo27190a(i3, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.livewallpaper.p3419f.C58901f.DialogInterface$OnClickListenerC589021 */

            static {
                Covode.recordClassIndex(69218);
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                Video video;
                UrlModel cover;
                String str;
                if (aweme != null) {
                    C58895d dVar = C58895d.f134069e;
                    Aweme aweme = aweme;
                    if (!(dVar.mo96320b(aweme.getAid()) || (video = aweme.getVideo()) == null || (cover = video.getCover()) == null || video.getPlayAddrH264() == null || C13603b.m24435a((Collection) video.getPlayAddrH264().getUrlList()))) {
                        List<String> urlList = video.getPlayAddrH264().getUrlList();
                        if (urlList.size() > 2) {
                            str = urlList.get(2);
                        } else {
                            str = urlList.get(0);
                        }
                        String a = C33730a.m69052a(aweme, str);
                        if (!TextUtils.isEmpty(a)) {
                            LiveWallPaperBean.C58910a newBuilder = LiveWallPaperBean.newBuilder();
                            newBuilder.f134104a = aweme.getAid();
                            newBuilder.f134111h = cover;
                            newBuilder.f134112i = a;
                            newBuilder.f134113j = video.getPlayAddrH264().getUri();
                            newBuilder.f134107d = video.getWidth();
                            newBuilder.f134108e = video.getHeight();
                            newBuilder.f134109f = "video_share";
                            newBuilder.f134110g = 0.0f;
                            newBuilder.f134114k = C68863ah.f154027a.mo109411a(aweme);
                            dVar.f134070a.add(0, newBuilder.mo96357a());
                            dVar.mo96319b();
                        }
                    }
                }
                Activity activity = activity;
                if (activity != null) {
                    try {
                        if (!C29843f.m60133b(activity, "com.android.vending")) {
                            SmartRouter.buildRoute(activity, "aweme://webview/").withParam(Uri.parse("https://play.google.com/store/apps/details?id=com.ss.android.ugc.tiktok.livewallpaper")).withParam("hide_nav_bar", true).withParam("hide_status_bar", true).open();
                        } else {
                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.ss.android.ugc.tiktok.livewallpaper"));
                            intent.setPackage("com.android.vending");
                            intent.addFlags(268435456);
                            C84349a.m145093a(intent, activity);
                            activity.startActivity(intent);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                C58901f.m108222a(activity, true, z);
            }
        }, false).mo27193a().mo27185c();
        m108233b(str);
        MethodCollector.m26664o(6129);
    }
}
