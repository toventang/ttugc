package com.p2082ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.p2730de.C40963b;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.shortvideo.C69831ai;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.trill.R;
import dmt.p4542av.video.C88168aj;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.bb */
public final class C73979bb {
    static {
        Covode.recordClassIndex(86729);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.c.h.a.q<? extends com.ss.android.ugc.aweme.shortvideo.ai> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final AbstractFutureC27655q<C69831ai> m130113a(AbstractFutureC27655q<? extends C69831ai> qVar) {
        C89219l.m154721d(qVar, "");
        C63244g.m114602a();
        return qVar;
    }

    /* renamed from: a */
    private static String m130116a(User user) {
        String str;
        if (user != null) {
            str = user.getRemarkName();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            if (user != null) {
                return user.getRemarkName();
            }
            return null;
        } else if (user != null) {
            return user.getNickname();
        } else {
            return null;
        }
    }

    /* renamed from: a */
    public static final String m130114a(int i) {
        Context a = C40963b.m82473a();
        if (i == 1) {
            String string = a.getString(R.string.a9r);
            C89219l.m154716b(string, "");
            return string;
        } else if (i != 2) {
            String string2 = a.getString(R.string.dkc);
            C89219l.m154716b(string2, "");
            return string2;
        } else {
            String string3 = a.getString(R.string.a9q);
            C89219l.m154716b(string3, "");
            return string3;
        }
    }

    /* renamed from: a */
    public static final int[] m130117a(EditPreviewInfo editPreviewInfo) {
        List<EditVideoSegment> videoList;
        if (editPreviewInfo == null || (videoList = editPreviewInfo.getVideoList()) == null || videoList.size() <= 0) {
            return null;
        }
        return C88168aj.m153237a(videoList.get(0).getVideoPath());
    }

    /* renamed from: a */
    public static final String m130115a(int i, List<? extends User> list) {
        if (i <= 0) {
            return "";
        }
        User user = null;
        if (i > 1) {
            Context a = C40963b.m82473a();
            Object[] objArr = new Object[2];
            if (list != null) {
                user = (User) list.get(0);
            }
            objArr[0] = m130116a(user);
            objArr[1] = Integer.valueOf(i);
            String string = a.getString(R.string.eyd, objArr);
            if (string == null) {
                string = "";
            }
            C89219l.m154716b(string, "");
            return string;
        }
        if (list != null) {
            user = (User) list.get(0);
        }
        String a2 = m130116a(user);
        if (a2 == null) {
            return "";
        }
        return a2;
    }
}
