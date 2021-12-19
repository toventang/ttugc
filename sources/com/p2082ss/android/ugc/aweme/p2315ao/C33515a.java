package com.p2082ss.android.ugc.aweme.p2315ao;

import android.app.Activity;
import android.content.res.Resources;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.AtMe;
import com.p2082ss.android.ugc.aweme.notification.bean.C61871f;
import com.p2082ss.android.ugc.aweme.notification.utils.C62266j;
import com.p2082ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ao.a */
public final class C33515a {

    /* renamed from: a */
    private static final AbstractC89244h f79616a = C89250i.m154773a((AbstractC89171a) C33516a.f79617a);

    /* renamed from: b */
    private static final String m68679b() {
        return (String) f79616a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.ao.a$a */
    static final class C33516a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C33516a f79617a = new C33516a();

        static {
            Covode.recordClassIndex(40379);
        }

        C33516a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            return C33515a.m68672a().getString(R.string.djh);
        }
    }

    static {
        Covode.recordClassIndex(40378);
    }

    /* renamed from: a */
    public static final Resources m68672a() {
        Resources resources;
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity == null || (resources = topActivity.getResources()) == null) {
            return C17867d.m33078a().getResources();
        }
        return resources;
    }

    /* renamed from: c */
    public static final User m68680c(List<? extends User> list) {
        User user;
        if (list == null || list.size() != 1 || (user = (User) C89070n.m154583g((List) list)) == null || user.getMatchedFriendStruct() == null) {
            return null;
        }
        return user;
    }

    /* renamed from: a */
    public static final String m68676a(List<? extends User> list) {
        User user;
        MatchedFriendStruct matchedFriendStruct;
        if (list == null || (user = (User) C89070n.m154583g((List) list)) == null || (matchedFriendStruct = user.getMatchedFriendStruct()) == null) {
            return null;
        }
        return matchedFriendStruct.getRecType();
    }

    /* renamed from: b */
    public static final C89378p<Integer, Integer> m68678b(List<? extends User> list) {
        int i;
        User user;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        if (i > 1 || list == null || (user = (User) C89070n.m154583g((List) list)) == null) {
            return null;
        }
        return new C89378p<>(Integer.valueOf(user.getFollowStatus()), Integer.valueOf(user.getFollowerStatus()));
    }

    /* renamed from: a */
    public static final String m68674a(AtMe atMe) {
        C89219l.m154721d(atMe, "");
        int subType = atMe.getSubType();
        if (subType != 2) {
            if (subType == 7) {
                String string = m68672a().getString(R.string.djc);
                C89219l.m154716b(string, "");
                return string;
            } else if (subType == 54) {
                String string2 = m68672a().getString(R.string.di4);
                C89219l.m154716b(string2, "");
                return string2;
            } else if (subType != 55) {
                String string3 = m68672a().getString(R.string.djb);
                C89219l.m154716b(string3, "");
                return string3;
            }
        }
        return m68672a().getString(R.string.djf) + ' ' + atMe.getContent();
    }

    /* renamed from: a */
    public static final String m68675a(C61871f fVar) {
        String string;
        C89219l.m154721d(fVar, "");
        if (C80537hk.m139613a(fVar.mo99968a())) {
            if (fVar.type == 14) {
                string = m68672a().getString(R.string.dio, fVar.mo99968a());
            } else {
                string = m68672a().getString(R.string.cja, fVar.mo99968a());
            }
            C89219l.m154716b(string, "");
            return string;
        }
        String string2 = m68672a().getString(R.string.cj_);
        C89219l.m154716b(string2, "");
        return string2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p4600h.C89386u<java.lang.String, java.lang.Integer, java.lang.Integer> m68673a(com.p2082ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r11) {
        /*
        // Method dump skipped, instructions count: 406
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2315ao.C33515a.m68673a(com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice):h.u");
    }

    /* renamed from: a */
    public static final String m68677a(List<? extends User> list, int i) {
        boolean z;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        if (list.size() == 1) {
            return C62266j.m112643a((User) C89070n.m154579f((List) list));
        }
        if (list.size() == 2 && 1 <= i && 3 >= i) {
            return C62266j.m112643a((User) list.get(0)) + ' ' + m68679b() + ' ' + C62266j.m112643a((User) list.get(1));
        }
        if (list.size() == 3 || (i == 3 && list.size() > 3)) {
            return C62266j.m112643a((User) list.get(0)) + ", " + C62266j.m112643a((User) list.get(1)) + ' ' + m68679b() + ' ' + C62266j.m112643a((User) list.get(2));
        }
        if (list.size() <= 1) {
            return "";
        }
        String string = m68672a().getString(R.string.djg);
        C89219l.m154716b(string, "");
        String a = C1764a.m5928a(string, Arrays.copyOf(new Object[]{Integer.valueOf(Math.max(i, list.size()) - 2)}, 1));
        C89219l.m154716b(a, "");
        return C62266j.m112643a((User) list.get(0)) + ", " + C62266j.m112643a((User) list.get(1)) + ' ' + m68679b() + ' ' + a;
    }
}
