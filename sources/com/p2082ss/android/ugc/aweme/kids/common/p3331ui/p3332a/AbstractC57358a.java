package com.p2082ss.android.ugc.aweme.kids.common.p3331ui.p3332a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20713a;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.p2082ss.android.ugc.aweme.base.C34602l;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2377h.C34593a;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39059e;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.framework.p3008c.C51426a;
import com.p2082ss.android.ugc.aweme.kids.common.p3331ui.p3332a.C57359b;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.performance.C62845i;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.kids.common.ui.a.a */
public abstract class AbstractC57358a extends AbstractC39059e<Aweme> {

    /* renamed from: a */
    protected C57359b.AbstractC57360a f130744a;

    static {
        Covode.recordClassIndex(67276);
    }

    public AbstractC57358a(View view) {
        super(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo94626a(UrlModel urlModel, String str) {
        C20766v a = C20761r.m39060a(C34735v.m70965a(urlModel));
        int[] a2 = C80397em.m139369a(200);
        if (a2 != null) {
            a.mo34185b(a2);
        }
        a.f49092E = this.f92232n;
        a.mo34179a(str).mo34186c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo94627a(Video video, String str) {
        boolean z;
        UrlModel dynamicCover;
        if (mo67807g()) {
            SmartImageView smartImageView = this.f92232n;
            C57359b.AbstractC57360a aVar = this.f130744a;
            C89219l.m154721d(smartImageView, "");
            C89219l.m154721d(video, "");
            C89219l.m154721d(str, "");
            Context a = C17867d.m33078a();
            if (!C62845i.m113257a()) {
                if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
                    C58029j.f132253e = C57359b.m103967a();
                }
                if (!C58029j.f132253e || C51426a.m95802a(a)) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (C34593a.m70629a("aweme_app", "use_dynamic_cover", z) && (dynamicCover = video.getDynamicCover()) != null && dynamicCover.getUrlList() != null && !dynamicCover.getUrlList().isEmpty()) {
                        for (String str2 : dynamicCover.getUrlList()) {
                            if (!TextUtils.isEmpty(str2)) {
                                UrlModel dynamicCover2 = video.getDynamicCover();
                                C89219l.m154716b(dynamicCover2, "");
                                C20713a aVar2 = C20713a.f48937a;
                                C89219l.m154716b(aVar2, "");
                                int i = aVar2.f48938b;
                                C34602l a2 = C34735v.m70965a(dynamicCover2);
                                C89219l.m154716b(a2, "");
                                if (!TextUtils.isEmpty("") && !a2.mo61062a()) {
                                    List<String> list = a2.f81655b;
                                    C89219l.m154716b(list, "");
                                    ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                                    for (T t : list) {
                                        C89219l.m154716b(t, "");
                                        arrayList.add(C89361p.m154929e((CharSequence) t, (CharSequence) "?") ? (((String) t) + "&ilog=") + "" : (((String) t) + "?ilog=") + "");
                                    }
                                    a2.f81655b = arrayList;
                                }
                                C20766v a3 = C20761r.m39060a(a2);
                                a3.f49092E = smartImageView;
                                a3.mo34179a(str).mo34177a(i, new C57359b.C57361b(a2, video)).mo34175a().mo34181a(new C57359b.C57363c(smartImageView, aVar, dynamicCover2, a2, video));
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
