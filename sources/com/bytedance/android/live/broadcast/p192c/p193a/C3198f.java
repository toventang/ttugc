package com.bytedance.android.live.broadcast.p192c.p193a;

import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.base.model.C2962b;
import com.bytedance.android.livesdkapi.depend.model.C11672a;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import com.google.gson.C28024q;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* renamed from: com.bytedance.android.live.broadcast.c.a.f */
public final class C3198f {
    static {
        Covode.recordClassIndex(3679);
    }

    /* renamed from: a */
    private static C2962b m8683a(UrlModel urlModel) {
        if (urlModel == null) {
            return new C2962b();
        }
        C2962b bVar = new C2962b();
        bVar.f8711a = urlModel.getUri();
        bVar.f8712b = urlModel.getUrlList();
        return bVar;
    }

    /* renamed from: b */
    private static void m8686b(C11672a aVar) {
        if (!C13627m.m24498a(aVar.f27889E)) {
            aVar.f27890F = (C11672a.C11676d) C4139e.C4140a.f11575b.mo46670a(aVar.f27889E, C11672a.C11676d.class);
        }
    }

    /* renamed from: a */
    public static C11672a m8684a(Effect effect) {
        C11672a aVar = new C11672a();
        aVar.f27896d = m8683a(effect.getIconUrl());
        aVar.f27893a = Long.valueOf(effect.getEffectId()).longValue();
        aVar.mo18440a(effect.getId());
        aVar.mo18442b(effect.getResourceId());
        aVar.mo18444c(effect.getUnzipPath());
        aVar.f27898f = effect.getHint();
        aVar.f27904l = effect.isDownloaded();
        aVar.f27901i = effect.getTags();
        String tagsUpdatedAt = effect.getTagsUpdatedAt();
        if (tagsUpdatedAt != null) {
            aVar.f27903k = tagsUpdatedAt;
        }
        aVar.f27902j = effect.getTypes();
        aVar.f27897e = effect.getName();
        aVar.f27909q = effect;
        aVar.f27885A = effect.getExtra();
        aVar.mo18441a(C3192b.m8668a(effect.getExtra()));
        String sdkExtra = effect.getSdkExtra();
        if (sdkExtra != null) {
            aVar.f27889E = sdkExtra;
        }
        m8687c(aVar);
        m8686b(aVar);
        return C3192b.m8667a(aVar.f27909q, aVar);
    }

    /* renamed from: a */
    public static Effect m8685a(C11672a aVar) {
        UrlModel urlModel;
        if (aVar.f27909q != null) {
            return aVar.f27909q;
        }
        Effect effect = new Effect();
        effect.setId(aVar.f27894b);
        effect.setEffectId(aVar.f27895c);
        C2962b bVar = aVar.f27896d;
        if (bVar == null) {
            urlModel = new UrlModel();
        } else {
            urlModel = new UrlModel();
            urlModel.setUri(bVar.f8711a);
            urlModel.setUrlList(bVar.f8712b);
        }
        effect.setIconUrl(urlModel);
        effect.setUnzipPath(aVar.f27899g);
        effect.setHint(aVar.f27898f);
        effect.setTags(aVar.f27901i);
        effect.setDownloaded(aVar.f27904l);
        effect.setEffectId(aVar.f27895c);
        String str = aVar.f27903k;
        if (str != null) {
            effect.setTagsUpdatedAt(str);
        }
        effect.setExtra(aVar.f27885A);
        effect.setTypes(aVar.f27902j);
        String str2 = aVar.f27889E;
        if (str2 != null) {
            effect.setSdkExtra(str2);
        }
        return effect;
    }

    /* renamed from: c */
    private static void m8687c(C11672a aVar) {
        if (!C13627m.m24498a(aVar.f27885A)) {
            try {
                C28022o j = C28024q.m56139a(aVar.f27885A).mo46789j();
                if (j.mo46802b("RepelPanel")) {
                    aVar.f27900h = j.mo46803c("RepelPanel").mo46694g();
                }
                if (j.mo46802b("is_blessing_sticker")) {
                    aVar.f27912t = j.mo46803c("is_blessing_sticker").mo46695h();
                }
                if (j.mo46802b("game")) {
                    aVar.f27914v = j.mo46803c("game").mo46695h();
                }
                if (j.mo46802b("video_tag")) {
                    aVar.mo18445d(j.mo46803c("video_tag").mo46689c());
                }
                if (j.mo46802b("beautify")) {
                    List<C11672a.C11674b> list = (List) C4139e.C4140a.f11575b.mo46668a((AbstractC28019l) C28024q.m56139a(j.mo46803c("beautify").mo46689c()).mo46789j().mo46805e("items"), new C27895a<List<C11672a.C11674b>>() {
                        /* class com.bytedance.android.live.broadcast.p192c.p193a.C3198f.C31991 */

                        static {
                            Covode.recordClassIndex(3680);
                        }
                    }.type);
                    aVar.mo18441a(list);
                    for (C11672a.C11674b bVar : list) {
                        aVar.f27908p.add(bVar.f27921c);
                    }
                }
                if (j.mo46802b("Review_original_frame")) {
                    aVar.f27913u = j.mo46803c("Review_original_frame").mo46695h();
                }
            } catch (Throwable unused) {
            }
        }
    }
}
