package com.p2082ss.android.ugc.aweme.share.silent;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.ShareChannelSettings;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.share.improve.C68963a;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.silent.c */
public enum EnumC69448c {
    INSTAGRAM("instagram", "Instagram", R.raw.icon_instagram, R.raw.icon_color_instagram_circle, 2),
    INSTAGRAM_STORY("instagram_story", "Instagram", R.raw.icon_instagram_story, R.raw.icon_color_instagram_story_circle, 3),
    WHATSAPP("whatsapp", "Whatsapp", R.raw.icon_whatsapp, R.raw.icon_color_whatsapp_circle, 5),
    FACEBOOK("facebook", "Facebook", R.raw.icon_facebook, R.raw.icon_color_facebook_circle, 6),
    SMS("sms", "Sms", R.raw.icon_messages, R.raw.icon_color_sms_circle, 13),
    MESSENGER("messenger", "Messenger", R.raw.icon_messenger, R.raw.icon_color_messenger_circle, 7),
    VK("vk", "VK", R.raw.icon_vk, R.raw.icon_color_vk_circle, 9),
    SNAPCHAT("snapchat", "Snapchat", R.raw.icon_snapchat, R.raw.icon_color_snapchat_circle, 8),
    LINE("line", "Line", R.raw.icon_line, R.raw.icon_color_line_circle, 11),
    ZALO("zalo", "Zalo", R.raw.icon_zalo, R.raw.icon_color_zalo_circle, 10),
    KAKAOTALK("kakaotalk", "KakaoTalk", R.raw.icon_kakaotalk, R.raw.icon_color_kakaotalk_circle, 12);
    
    public static final C69449a Companion = new C69449a((byte) 0);

    /* renamed from: b */
    private final String f155145b;

    /* renamed from: c */
    private final String f155146c;

    /* renamed from: d */
    private final int f155147d;

    /* renamed from: e */
    private final int f155148e;

    /* renamed from: f */
    private final int f155149f;

    public static final List<EnumC69448c> supportChannels(Activity activity) {
        return C69449a.m122656a(activity);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.silent.c$a */
    public static final class C69449a {
        static {
            Covode.recordClassIndex(81787);
        }

        private C69449a() {
        }

        public /* synthetic */ C69449a(byte b) {
            this();
        }

        /* renamed from: a */
        public static List<EnumC69448c> m122656a(Activity activity) {
            List list;
            Object obj;
            C89219l.m154721d(activity, "");
            if (!AVExternalServiceImpl.m113114a().configService().avsettingsConfig().enableSaveUploadVideo()) {
                return C89086z.INSTANCE;
            }
            List c = C89070n.m154524c(EnumC69448c.WHATSAPP, EnumC69448c.INSTAGRAM, EnumC69448c.INSTAGRAM_STORY, EnumC69448c.FACEBOOK, EnumC69448c.SMS, EnumC69448c.MESSENGER, EnumC69448c.VK, EnumC69448c.SNAPCHAT, EnumC69448c.LINE, EnumC69448c.ZALO, EnumC69448c.KAKAOTALK);
            try {
                IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
                C89219l.m154716b(iESSettingsProxy, "");
                List<ShareChannelSettings> silentShareList = iESSettingsProxy.getSilentShareList();
                list = new ArrayList();
                for (ShareChannelSettings shareChannelSettings : silentShareList) {
                    Iterator it = c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        String key = ((EnumC69448c) obj).getKey();
                        C89219l.m154716b(shareChannelSettings, "");
                        if (C89219l.m154714a((Object) key, (Object) shareChannelSettings.getId())) {
                            break;
                        }
                    }
                    if (obj != null) {
                        list.add(obj);
                    }
                }
            } catch (C16041a unused) {
                list = C89070n.m154571d((Iterable) c, 4);
            }
            List<EnumC69448c> g = C89070n.m154585g((Collection) list);
            Iterator<EnumC69448c> it2 = g.iterator();
            while (it2.hasNext()) {
                AbstractC69581b a = C68963a.C68964a.m121652a(it2.next().getKey(), activity);
                if (a == null || !a.mo109557b(activity)) {
                    it2.remove();
                }
            }
            return g;
        }
    }

    public final int getCheckedIconRes() {
        return this.f155148e;
    }

    public final String getKey() {
        return this.f155145b;
    }

    public final String getLabel() {
        return this.f155146c;
    }

    public final int getSaveType() {
        return this.f155149f;
    }

    public final int getUncheckedIconRes() {
        return this.f155147d;
    }

    static {
        Covode.recordClassIndex(81786);
    }

    private EnumC69448c(String str, String str2, int i, int i2, int i3) {
        this.f155145b = str;
        this.f155146c = str2;
        this.f155147d = i;
        this.f155148e = i2;
        this.f155149f = i3;
    }
}
