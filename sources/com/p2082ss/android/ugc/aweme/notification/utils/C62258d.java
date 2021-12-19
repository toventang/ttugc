package com.p2082ss.android.ugc.aweme.notification.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.comment.p2490d.C36410g;
import com.p2082ss.android.ugc.aweme.inbox.p3267b.C56323c;
import com.p2082ss.android.ugc.aweme.notice.api.C61530a;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61631f;
import com.p2082ss.android.ugc.aweme.notification.p3519ab.C61803e;
import com.p2082ss.android.ugc.aweme.qna.services.QnaService;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.notification.utils.d */
public final class C62258d {

    /* renamed from: a */
    public static final C62258d f141308a = new C62258d();

    private C62258d() {
    }

    static {
        Covode.recordClassIndex(73032);
    }

    /* renamed from: a */
    public static List<C61631f> m112609a() {
        int i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C61631f(C61530a.C61532b.m111445a(), R.string.div, R.raw.icon_bubble_line_fill, R.string.dia, R.string.dim, 2131231276));
        arrayList.add(new C61631f(3, R.string.dj1, R.raw.icon_heart_fill, R.string.dj9, R.string.dj8, 2131231281));
        arrayList.add(new C61631f(44, R.string.diy, R.raw.icon_bubble_ellipsis_right_fill, R.string.dii, R.string.dih, 2131231279));
        if (QnaService.m117969a().enablePublicQna()) {
            arrayList.add(new C61631f(84, R.string.ck, R.raw.icon_qa_fill_ltr, R.string.cj, R.string.ci, R.drawable.o5));
        }
        if (C36410g.m74113d()) {
            i = R.string.d21;
        } else {
            i = R.string.dix;
        }
        arrayList.add(new C61631f(26, i, R.raw.icon_at_fill, R.string.dje, R.string.djd, R.drawable.oc));
        if (!C56323c.m102321h()) {
            arrayList.add(new C61631f(7, R.string.diz, R.raw.icon_person_fill, R.string.dit, R.string.dis, 2131231280));
        }
        if (C61803e.m111866a()) {
            arrayList.add(new C61631f(599, R.string.cj9, R.raw.icon_store_fill, R.string.cln, R.string.clm, 2131231282));
        }
        arrayList.add(new C61631f(37, R.string.dj3, R.raw.icon_tiktok_logo, R.string.djl, R.string.djk, 2131231283));
        return arrayList;
    }
}
