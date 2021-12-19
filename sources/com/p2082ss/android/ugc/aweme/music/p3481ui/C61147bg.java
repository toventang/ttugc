package com.p2082ss.android.ugc.aweme.music.p3481ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.p2082ss.android.ugc.aweme.music.p3477l.C60833a;
import com.p2082ss.android.ugc.aweme.services.IRessoAnchorServiceImpl;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import p4600h.C89378p;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.music.ui.bg */
public final class C61147bg {

    /* renamed from: a */
    public static final C61148a f138835a = new C61148a((byte) 0);

    /* renamed from: b */
    private final boolean f138836b;

    /* renamed from: c */
    private final String f138837c;

    /* renamed from: d */
    private final String f138838d;

    /* renamed from: e */
    private final String f138839e;

    static {
        Covode.recordClassIndex(71752);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.bg$a */
    public static final class C61148a {
        static {
            Covode.recordClassIndex(71753);
        }

        private C61148a() {
        }

        public /* synthetic */ C61148a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    private static void m110765a(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    /* renamed from: a */
    private final void m110766a(Context context, ExternalMusicInfo externalMusicInfo) {
        String str;
        if (!(!C89219l.m154714a((Object) "resso", (Object) externalMusicInfo.getPartnerName()))) {
            HashMap hashMap = new HashMap();
            if (C60833a.m110436a(context)) {
                str = "other_app";
            } else {
                String externalSchema = externalMusicInfo.getExternalSchema();
                if (externalSchema == null || !C89361p.m154874b(externalSchema, "aweme://lynxview/", false)) {
                    str = "webview";
                } else {
                    str = "lynx";
                }
            }
            hashMap.put("anchor_type", "Resso");
            hashMap.put("enter_from", "single_song");
            hashMap.put("click_type", str);
            hashMap.put("music_id", this.f138838d);
            hashMap.put("anchor_id", externalMusicInfo.getPartnerSongId());
            hashMap.put("external_label_id", externalMusicInfo.getExternalLabel());
            C39162r.m79460a("enter_anchor_detail", hashMap);
        }
    }

    /* renamed from: c */
    public final void mo98696c(Context context, List<ExternalMusicInfo> list) {
        String str;
        C89219l.m154721d(list, "");
        for (ExternalMusicInfo externalMusicInfo : list) {
            HashMap hashMap = new HashMap();
            hashMap.put("music_id", externalMusicInfo.getPartnerSongId());
            if (!this.f138836b || !C89219l.m154714a((Object) "resso", (Object) externalMusicInfo.getPartnerName())) {
                hashMap.put("music_from", externalMusicInfo.getPartnerName());
            } else {
                hashMap.put("music_from", "resso_exclusive");
            }
            if (C89219l.m154714a((Object) "resso", (Object) externalMusicInfo.getPartnerName())) {
                if (C60833a.m110436a(context)) {
                    str = "other_app";
                } else {
                    str = "lynx";
                }
                hashMap.put("show_type", str);
                String externalLabel = externalMusicInfo.getExternalLabel();
                if (externalLabel == null) {
                    externalLabel = "";
                }
                hashMap.put("external_label_id", externalLabel);
            }
            hashMap.put("process_id", this.f138837c);
            C39162r.m79460a("show_copyright_music", hashMap);
        }
    }

    /* renamed from: b */
    private final void m110768b(Context context, ExternalMusicInfo externalMusicInfo) {
        if (C89219l.m154714a((Object) "resso", (Object) externalMusicInfo.getPartnerName())) {
            if (Keva.getRepo("anchor_data_keva").getInt("is_resso_installed_key", -1) == -1) {
                Keva.getRepo("anchor_data_keva").storeInt("is_resso_installed_key", C60833a.m110436a(context) ? 1 : 0);
            }
            if (C60833a.m110436a(context)) {
                if (Build.VERSION.SDK_INT >= 23) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(externalMusicInfo.getExternalAppLink()));
                    intent.addCategory("android.intent.category.BROWSABLE");
                    intent.addCategory("android.intent.category.DEFAULT");
                    m110765a(context, intent);
                } else {
                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(externalMusicInfo.getExternalDeepLink()));
                    intent2.addCategory("android.intent.category.BROWSABLE");
                    intent2.addCategory("android.intent.category.DEFAULT");
                    intent2.setPackage("com.moonvideo.android.resso");
                    m110765a(context, intent2);
                }
            } else if (!TextUtils.isEmpty(externalMusicInfo.getExternalSchema())) {
                String externalSchema = externalMusicInfo.getExternalSchema();
                if (externalSchema == null) {
                    externalSchema = "";
                }
                m110767a(context, externalSchema, externalMusicInfo.getExternalLabel());
            }
        } else if (!TextUtils.isEmpty(externalMusicInfo.getJumpUrl())) {
            SmartRouter.buildRoute(context, "aweme://webview/").withParam("url", externalMusicInfo.getJumpUrl()).withParam("hide_nav_bar", false).withParam("use_webview_title", true).withParam("bundle_forbidden_jump", true).open();
        }
        C39162r.m79460a("click_listen_complete_entrance", new C33744d().mo59983a("enter_from", "single_song").mo59983a("music_id", this.f138838d).f79943a);
    }

    /* renamed from: b */
    public final void mo98695b(Context context, List<ExternalMusicInfo> list) {
        String str;
        String a;
        String str2 = "";
        C89219l.m154721d(list, str2);
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPartnerSongId());
        }
        String a2 = C89070n.m154551a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62);
        if (list.size() == 1) {
            str = list.get(0).getPartnerName();
            if (this.f138836b && C89219l.m154714a((Object) "resso", (Object) str)) {
                str = "resso_exclusive";
            }
        } else {
            str = "multi_anchor";
        }
        if (list.size() == 1) {
            a = str2;
        } else {
            ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().getPartnerName());
            }
            a = C89070n.m154551a(arrayList2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62);
        }
        if (list.size() == 1) {
            if (C60833a.m110436a(context)) {
                str2 = "other_app";
            } else {
                str2 = "lynx";
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("music_id", a2);
        hashMap.put("music_from", str);
        hashMap.put("multi_anchor", a);
        hashMap.put("show_type", str2);
        hashMap.put("process_id", this.f138837c);
        C39162r.m79460a("click_copyright_music", hashMap);
        if (list.size() == 1) {
            m110766a(context, list.get(0));
        }
    }

    /* renamed from: a */
    public final void mo98694a(Context context, List<ExternalMusicInfo> list) {
        String str;
        String a;
        String str2;
        String str3 = "";
        C89219l.m154721d(list, str3);
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPartnerSongId());
        }
        String a2 = C89070n.m154551a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62);
        if (list.size() == 1) {
            str = list.get(0).getPartnerName();
            if (this.f138836b && C89219l.m154714a((Object) "resso", (Object) str)) {
                str = "resso_exclusive";
            }
        } else {
            str = "multi_anchor";
        }
        if (list.size() == 1) {
            a = str3;
        } else {
            ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().getPartnerName());
            }
            a = C89070n.m154551a(arrayList2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62);
        }
        if (list.size() != 1) {
            str2 = str3;
        } else if (C60833a.m110436a(context)) {
            str2 = "other_app";
        } else {
            str2 = "lynx";
        }
        HashMap hashMap = new HashMap();
        if (list.size() == 1 && C89219l.m154714a((Object) "resso", (Object) list.get(0).getPartnerName())) {
            String externalLabel = list.get(0).getExternalLabel();
            if (externalLabel != null) {
                str3 = externalLabel;
            }
            hashMap.put("external_label_id", str3);
        }
        hashMap.put("music_id", a2);
        hashMap.put("music_from", str);
        hashMap.put("multi_anchor", a);
        hashMap.put("show_type", str2);
        hashMap.put("process_id", this.f138837c);
        C39162r.m79460a("show_copyright_music", hashMap);
    }

    /* renamed from: a */
    public final void mo98693a(Context context, ExternalMusicInfo externalMusicInfo, boolean z) {
        String str;
        C89219l.m154721d(externalMusicInfo, "");
        if (context != null) {
            m110768b(context, externalMusicInfo);
            if (z) {
                HashMap hashMap = new HashMap();
                hashMap.put("music_id", externalMusicInfo.getPartnerSongId());
                if (!this.f138836b || !C89219l.m154714a((Object) "resso", (Object) externalMusicInfo.getPartnerName())) {
                    hashMap.put("music_from", externalMusicInfo.getPartnerName());
                } else {
                    hashMap.put("music_from", "resso_exclusive");
                }
                hashMap.put("process_id", this.f138837c);
                if (C89219l.m154714a((Object) "resso", (Object) externalMusicInfo.getPartnerName())) {
                    if (C60833a.m110436a(context)) {
                        str = "other_app";
                    } else {
                        str = "lynx";
                    }
                    hashMap.put("show_type", str);
                }
                C39162r.m79460a("click_copyright_music", hashMap);
                m110766a(context, externalMusicInfo);
            }
        }
    }

    /* renamed from: a */
    private final void m110767a(Context context, String str, String str2) {
        String str3;
        C89378p<Long, Integer> copyrightLimitMsUninstalledResso = IRessoAnchorServiceImpl.createIRessoAnchorServicebyMonsterPlugin(false).getCopyrightLimitMsUninstalledResso(str2);
        long longValue = copyrightLimitMsUninstalledResso.getFirst().longValue();
        int intValue = copyrightLimitMsUninstalledResso.getSecond().intValue();
        String g = C58071d.m104913g();
        String str4 = "";
        if (g != null) {
            Locale locale = Locale.getDefault();
            C89219l.m154716b(locale, str4);
            Objects.requireNonNull(g, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = g.toLowerCase(locale);
            C89219l.m154716b(lowerCase, str4);
            if (lowerCase != null) {
                str4 = lowerCase;
            }
        }
        if (C89361p.m154874b(str, "aweme://lynxview/", false)) {
            str3 = str + "&enter_from=" + "single_song" + "&lang=" + SettingServiceImpl.m120782v().mo108872h() + "&copyright_limit_ms=" + longValue + "&region=" + str4 + "&copyright_limit_count=" + intValue + "&process_id=" + this.f138837c + "&group_id=" + this.f138839e;
        } else {
            str3 = str + "%26enter_from%3D" + "single_song" + "%26lang%3D" + SettingServiceImpl.m120782v().mo108872h() + "%26copyright_limit_ms%3D" + longValue + "%26region%3D" + str4 + "%26copyright_limit_count%3D" + intValue + "%26process_id%3D" + this.f138837c + "%26group_id%3D" + this.f138839e;
        }
        if (!TextUtils.isEmpty(str)) {
            SmartRouter.buildRoute(context, str3).withParam("enter_from", "single_song").open();
        }
    }

    public C61147bg(boolean z, String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f138836b = z;
        this.f138837c = str;
        this.f138838d = str2;
        this.f138839e = str3;
    }
}
