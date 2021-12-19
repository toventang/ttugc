package com.p2082ss.android.ugc.aweme.share.improve.p3758c;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.ImageInfo;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80361dw;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.c.a */
public final class C69123a {
    static {
        Covode.recordClassIndex(81437);
    }

    /* renamed from: a */
    public static final void m122221a(Bundle bundle, String str, List<? extends Aweme> list) {
        UrlModel cover;
        ImageInfo imageInfo;
        UrlModel labelThumb;
        C89219l.m154721d(bundle, "");
        C89219l.m154721d(str, "");
        if (!(list == null || list.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Aweme aweme : list) {
                if (aweme.getAwemeType() == 2) {
                    List<ImageInfo> imageInfos = aweme.getImageInfos();
                    if (!(imageInfos == null || (imageInfo = imageInfos.get(0)) == null || (labelThumb = imageInfo.getLabelThumb()) == null)) {
                        arrayList.add(labelThumb);
                    }
                } else {
                    Video video = aweme.getVideo();
                    if (!(video == null || (cover = video.getCover()) == null)) {
                        arrayList.add(cover);
                    }
                }
                i++;
                if (i >= 3) {
                    break;
                }
            }
            if (arrayList.size() >= 3) {
                bundle.putString(str, C80361dw.m139334a(arrayList));
            }
        }
    }

    /* renamed from: a */
    public static final boolean m122222a(AbstractC69693h hVar, Context context, Aweme aweme, String str) {
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        if (!C37699a.m76218U(aweme)) {
            return true;
        }
        C39162r.m79460a("dou_promote_layer_show", new C33744d().mo59983a("enter_from", str).mo59983a("group_id", aweme.getAid()).mo59983a("author_id", aweme.getAuthorUid()).f79943a);
        new C79459a(context).mo123050a(R.string.o7).mo123053a();
        return false;
    }
}
