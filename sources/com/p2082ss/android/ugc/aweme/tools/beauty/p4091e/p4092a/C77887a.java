package com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.p4092a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p2082ss.android.ugc.aweme.dependence.beauty.C41093a;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.C77886a;
import java.util.HashMap;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.e.a.a */
public final class C77887a {

    /* renamed from: a */
    public static final C77887a f174764a = new C77887a();

    private C77887a() {
    }

    static {
        Covode.recordClassIndex(90976);
    }

    /* renamed from: a */
    public static void m136013a(ComposerBeauty composerBeauty, int i, String str) {
        Object obj;
        C89219l.m154721d(composerBeauty, "");
        C89219l.m154721d(str, "");
        C41093a.m82765c("monitorBeautyItemDownload  code:" + i + " effect:" + composerBeauty.getEffect().getName());
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("code", String.valueOf(i));
        hashMap.put("msg", str);
        hashMap.put("effect_id", composerBeauty.getEffect().getEffectId());
        hashMap.put("effect_name", composerBeauty.getEffect().getName());
        List<String> urlList = composerBeauty.getEffect().getFileUrl().getUrlList();
        if (urlList != null) {
            obj = C89070n.m154583g((List) urlList);
        } else {
            obj = null;
        }
        hashMap.put("download_url", String.valueOf(obj));
        AbstractC77888b bVar = C77886a.f174760q;
        if (bVar != null) {
            bVar.mo110214a("beauty_resource_download", hashMap);
        }
    }

    /* renamed from: b */
    public static void m136015b(ComposerBeauty composerBeauty, int i, String str) {
        C89219l.m154721d(composerBeauty, "");
        C89219l.m154721d(str, "");
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("code", String.valueOf(i));
        hashMap.put("msg", str);
        hashMap.put("effect_id", composerBeauty.getEffect().getEffectId());
        hashMap.put("effect_name", composerBeauty.getEffect().getName());
        hashMap.put("unzip_path", composerBeauty.getEffect().getUnzipPath());
        AbstractC77888b bVar = C77886a.f174760q;
        if (bVar != null) {
            bVar.mo110214a("beauty_resource_unzip", hashMap);
        }
    }

    /* renamed from: a */
    public static void m136014a(String str, int i, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C41093a.m82765c("monitorBeautyListFetch panel:" + str + " code:" + i + " msg:" + str2);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("panel", str);
        hashMap.put("msg", str2);
        hashMap.put("code", String.valueOf(i));
        AbstractC77888b bVar = C77886a.f174760q;
        if (bVar != null) {
            bVar.mo110214a("beauty_fetch_effect_list", hashMap);
        }
    }
}
