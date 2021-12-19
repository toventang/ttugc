package com.p2082ss.ugc.effectplatform.util;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.Effect;
import com.p2082ss.ugc.effectplatform.model.ProviderEffect;
import com.p2082ss.ugc.effectplatform.model.UrlModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4519d.p4520a.p4530d.p4531a.C88045d;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.ugc.effectplatform.util.j */
public final class C86993j {

    /* renamed from: a */
    public static final C86993j f196152a = new C86993j();

    private C86993j() {
    }

    /* renamed from: a */
    public static boolean m150665a(UrlModel urlModel) {
        List<String> url_list;
        return urlModel == null || (url_list = urlModel.getUrl_list()) == null || url_list.isEmpty();
    }

    static {
        Covode.recordClassIndex(102759);
    }

    /* renamed from: a */
    public static String m150658a(ProviderEffect providerEffect) {
        String url;
        C89219l.m154719c(providerEffect, "");
        ProviderEffect.StickerBean sticker_info = providerEffect.getSticker_info();
        if (sticker_info == null || (url = sticker_info.getUrl()) == null) {
            return "";
        }
        return url;
    }

    /* renamed from: b */
    public static List<String> m150666b(UrlModel urlModel) {
        if (urlModel == null || m150665a(urlModel)) {
            return new ArrayList();
        }
        return urlModel.getUrl_list();
    }

    /* renamed from: a */
    public static boolean m150664a(Effect effect) {
        if (effect != null && !m150665a(effect.getFile_url())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static List<String> m150659a(List<String> list, String str) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next() + str);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static void m150667b(String str, List<? extends Effect> list) {
        if (list != null) {
            for (Effect effect : list) {
                if (!C87007u.m150697a(str)) {
                    if (str == null) {
                        C89219l.m154707a();
                    }
                    effect.setRecId(str);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m150660a(String str, Effect effect) {
        String uri;
        C89219l.m154719c(str, "");
        C89219l.m154719c(effect, "");
        UrlModel trans_file_url = effect.getTrans_file_url();
        if (trans_file_url != null && (uri = trans_file_url.getUri()) != null && !C89361p.m154870a((CharSequence) uri)) {
            effect.setTransResPath(str + C88045d.f199951a + effect.getId() + "_trans_" + uri);
        }
    }

    /* renamed from: a */
    public static void m150662a(String str, List<? extends Effect> list) {
        C89219l.m154719c(str, "");
        if (list != null) {
            for (Effect effect : list) {
                effect.setZipPath(str + C88045d.f199951a + effect.getId() + ".zip");
                effect.setUnzipPath(str + C88045d.f199951a + effect.getId());
                m150660a(str, effect);
            }
        }
    }

    /* renamed from: a */
    public static void m150663a(List<String> list, List<? extends Effect> list2) {
        if (list2 != null) {
            for (Effect effect : list2) {
                UrlModel file_url = effect.getFile_url();
                List<String> a = m150659a(list, effect.getFile_url().getUri());
                if (a == null) {
                    a = new ArrayList<>();
                }
                file_url.setUrl_list(a);
                UrlModel icon_url = effect.getIcon_url();
                List<String> a2 = m150659a(list, effect.getIcon_url().getUri());
                if (a2 == null) {
                    a2 = new ArrayList<>();
                }
                icon_url.setUrl_list(a2);
                List<String> url_list = effect.getHint_icon().getUrl_list();
                if (url_list != null && !url_list.isEmpty()) {
                    UrlModel hint_icon = effect.getHint_icon();
                    List<String> a3 = m150659a(list, effect.getHint_icon().getUri());
                    if (a3 == null) {
                        a3 = new ArrayList<>();
                    }
                    hint_icon.setUrl_list(a3);
                }
                UrlModel trans_file_url = effect.getTrans_file_url();
                if (trans_file_url != null) {
                    String uri = trans_file_url.getUri();
                    if (uri != null && !C89361p.m154870a((CharSequence) uri)) {
                        List<String> a4 = m150659a(list, trans_file_url.getUri());
                        if (a4 == null) {
                            a4 = new ArrayList<>();
                        }
                        trans_file_url.setUrl_list(a4);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m150661a(String str, String str2, List<? extends Effect> list) {
        String str3;
        C89219l.m154719c(str, "");
        if (list != null) {
            for (Effect effect : list) {
                effect.setZipPath(str + C88045d.f199951a + effect.getId() + ".zip");
                effect.setUnzipPath(str + C88045d.f199951a + effect.getId());
                if (str2 == null) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                effect.setPanel(str3);
                m150660a(str, effect);
            }
        }
    }
}
