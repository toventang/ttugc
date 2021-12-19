package com.p2082ss.android.ugc.aweme.qainvitation.p3642g;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17234b;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.p3070im.C53598c;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80581io;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.qainvitation.g.a */
public final class C65855a {

    /* renamed from: a */
    public static final C65855a f148404a = new C65855a();

    private C65855a() {
    }

    static {
        Covode.recordClassIndex(77356);
    }

    /* renamed from: a */
    public static String m117767a(IMUser iMUser) {
        C89219l.m154721d(iMUser, "");
        if (C58071d.m104909c()) {
            return m117777e(iMUser);
        }
        return m117776d(iMUser);
    }

    /* renamed from: b */
    public static int m117771b(Context context) {
        C89219l.m154721d(context, "");
        double a = (double) m117766a(context);
        Double.isNaN(a);
        return C89241a.m154729a(a * 0.99d);
    }

    /* renamed from: c */
    private static int m117774c(Context context) {
        C89219l.m154721d(context, "");
        if (C34723i.m70932e(context) != 0) {
            return C34723i.m70932e(context);
        }
        return 0;
    }

    /* renamed from: a */
    public static int m117766a(Context context) {
        C89219l.m154721d(context, "");
        double b = (double) ((C17234b.m31808b(context) - C13628n.m24525e(context)) - m117774c(context));
        Double.isNaN(b);
        return C89241a.m154729a(b * 0.99d);
    }

    /* renamed from: b */
    public static String m117772b(IMUser iMUser) {
        C89219l.m154721d(iMUser, "");
        if (C58071d.m104909c()) {
            return m117776d(iMUser);
        }
        return m117777e(iMUser);
    }

    /* renamed from: a */
    public static List<IMUser> m117768a(List<? extends User> list) {
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            IMUser a = C53598c.m98833a(it.next());
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static List<User> m117773b(List<? extends IMUser> list) {
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m117775c((IMUser) it.next()));
        }
        return arrayList;
    }

    /* renamed from: c */
    public static User m117775c(IMUser iMUser) {
        C89219l.m154721d(iMUser, "");
        User user = new User();
        user.setUid(iMUser.getUid());
        user.setNickname(iMUser.getNickName());
        user.setSignature(iMUser.getSignature());
        user.setAvatarThumb(iMUser.getAvatarThumb());
        user.setUniqueId(iMUser.getUniqueId());
        user.setShortId(iMUser.getShortId());
        user.setFollowStatus(iMUser.getFollowStatus());
        user.setCustomVerify(iMUser.getCustomVerify());
        user.setEnterpriseVerifyReason(iMUser.getEnterpriseVerifyReason());
        user.setVerificationType(iMUser.getVerificationType());
        user.setRemarkName(iMUser.getRemarkName());
        user.isBlock = iMUser.isBlock();
        user.setSecUid(iMUser.getSecUid());
        user.setRegion("");
        return user;
    }

    /* renamed from: d */
    private static String m117776d(IMUser iMUser) {
        boolean z;
        String str;
        String str2;
        String uniqueId = iMUser.getUniqueId();
        if (uniqueId == null || uniqueId.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String nickName = iMUser.getNickName();
            if (nickName == null || nickName.length() == 0) {
                str2 = "";
            } else {
                str2 = iMUser.getNickName();
            }
            C89219l.m154716b(str2, "");
            return str2;
        }
        String uniqueId2 = iMUser.getUniqueId();
        if (uniqueId2 == null || uniqueId2.length() == 0) {
            str = "";
        } else {
            str = iMUser.getUniqueId();
        }
        C89219l.m154716b(str, "");
        return str;
    }

    /* renamed from: e */
    private static String m117777e(IMUser iMUser) {
        boolean z;
        String str;
        String str2;
        String nickName = iMUser.getNickName();
        if (nickName == null || nickName.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String uniqueId = iMUser.getUniqueId();
            if (uniqueId == null || uniqueId.length() == 0) {
                str2 = "";
            } else {
                str2 = iMUser.getUniqueId();
            }
            C89219l.m154716b(str2, "");
            return str2;
        }
        String nickName2 = iMUser.getNickName();
        if (nickName2 == null || nickName2.length() == 0) {
            str = "";
        } else {
            str = iMUser.getNickName();
        }
        C89219l.m154716b(str, "");
        return str;
    }

    /* renamed from: a */
    public static void m117770a(IMUser iMUser, TextView textView, TextView textView2) {
        C89219l.m154721d(iMUser, "");
        C89219l.m154721d(textView, "");
        C89219l.m154721d(textView2, "");
        textView.setText(m117767a(iMUser));
        textView2.setText(m117772b(iMUser));
        if (TextUtils.isEmpty(textView2.getText())) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
        }
    }

    /* renamed from: a */
    public static void m117769a(AvatarImageWithVerify avatarImageWithVerify, Context context, String str, String str2, TextView textView) {
        C89219l.m154721d(avatarImageWithVerify, "");
        avatarImageWithVerify.mo61285a();
        C80581io.m139704a(context, str, str2, textView);
    }
}
