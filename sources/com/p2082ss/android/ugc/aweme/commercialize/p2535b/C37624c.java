package com.p2082ss.android.ugc.aweme.commercialize.p2535b;

import android.content.Context;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.p2082ss.android.ugc.aweme.feed.model.WikipediaExtra;
import com.p2082ss.android.ugc.aweme.feed.model.WikipediaInfo;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.wiki.AddWikiActivity;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.b.c */
public final class C37624c {
    static {
        Covode.recordClassIndex(45046);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.b.c$a */
    public static final class C37625a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ WikipediaInfo f88945a;

        /* renamed from: b */
        final /* synthetic */ Map f88946b;

        /* renamed from: c */
        final /* synthetic */ WikipediaInfo f88947c;

        /* renamed from: d */
        final /* synthetic */ Context f88948d;

        /* renamed from: e */
        final /* synthetic */ Map f88949e;

        static {
            Covode.recordClassIndex(45047);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37625a(WikipediaInfo wikipediaInfo, Map map, WikipediaInfo wikipediaInfo2, Context context, Map map2) {
            super(0);
            this.f88945a = wikipediaInfo;
            this.f88946b = map;
            this.f88947c = wikipediaInfo2;
            this.f88948d = context;
            this.f88949e = map2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            String str = "";
            C89219l.m154716b(iESSettingsProxy, str);
            String wikipediaAnchorUrlPlaceholder = iESSettingsProxy.getWikipediaAnchorUrlPlaceholder();
            C89219l.m154716b(wikipediaAnchorUrlPlaceholder, str);
            String a = C1764a.m5928a(wikipediaAnchorUrlPlaceholder, Arrays.copyOf(new Object[]{this.f88945a.getLang(), this.f88945a.getKeyword()}, 2));
            C89219l.m154716b(a, str);
            Map map = this.f88946b;
            String keyword = this.f88945a.getKeyword();
            if (keyword == null) {
                C89219l.m154715b();
            }
            map.put("title", keyword);
            Map map2 = this.f88946b;
            String keyword2 = this.f88945a.getKeyword();
            if (keyword2 == null) {
                C89219l.m154715b();
            }
            map2.put("wiki_entry", keyword2);
            Map map3 = this.f88946b;
            String lang = this.f88945a.getLang();
            if (lang == null) {
                C89219l.m154715b();
            }
            map3.put("language", lang);
            Map map4 = this.f88946b;
            String anchorId = this.f88947c.getAnchorId();
            if (anchorId != null) {
                str = anchorId;
            }
            map4.put("anchor_id", str);
            AddWikiActivity.C81638a.m141514a(this.f88948d, a, this.f88946b, this.f88949e);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.b.c$b */
    public static final class C37626b extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f88950a;

        static {
            Covode.recordClassIndex(45048);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37626b(AbstractC89171a aVar) {
            super(1);
            this.f88950a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37420c(R.string.hbx, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.commercialize.p2535b.C37624c.C37626b.C376271 */

                /* renamed from: a */
                final /* synthetic */ C37626b f88951a;

                static {
                    Covode.recordClassIndex(45049);
                }

                {
                    this.f88951a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    this.f88951a.f88950a.invoke();
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37418b(R.string.a8y, (AbstractC89172b<? super C23024a, C89391z>) null);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final void m75876a(Context context, WikipediaInfo wikipediaInfo, Map<String, String> map, Map<String, String> map2) {
        String keyword;
        Integer status;
        String str;
        C89219l.m154721d(context, "");
        C89219l.m154721d(wikipediaInfo, "");
        C89219l.m154721d(map, "");
        C89219l.m154721d(map2, "");
        String lang = wikipediaInfo.getLang();
        if (lang != null && lang.length() != 0 && (keyword = wikipediaInfo.getKeyword()) != null && keyword.length() != 0) {
            C37625a aVar = new C37625a(wikipediaInfo, map, wikipediaInfo, context, map2);
            WikipediaExtra extra = wikipediaInfo.getExtra();
            if (extra == null || (status = extra.getStatus()) == null || status.intValue() == 0) {
                aVar.invoke();
                return;
            }
            C23023b bVar = new C23023b(context);
            WikipediaExtra extra2 = wikipediaInfo.getExtra();
            String str2 = null;
            if (extra2 != null) {
                str = extra2.getWarningMsg();
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                str2 = context.getString(R.string.hbz);
            } else {
                WikipediaExtra extra3 = wikipediaInfo.getExtra();
                if (extra3 != null) {
                    str2 = extra3.getWarningMsg();
                }
            }
            C23028c.m43435a(bVar.mo37413d(str2), new C37626b(aVar)).mo37405a().mo37396b().show();
        }
    }
}
