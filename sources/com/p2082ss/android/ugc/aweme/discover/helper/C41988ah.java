package com.p2082ss.android.ugc.aweme.discover.helper;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.ah */
public final class C41988ah {

    /* renamed from: a */
    public static final C41988ah f97917a = new C41988ah();

    /* renamed from: a */
    public static final boolean m84051a(int i) {
        return (i == 1 || i == 2) ? false : true;
    }

    private C41988ah() {
    }

    static {
        Covode.recordClassIndex(49918);
    }

    /* renamed from: a */
    public static final String m84049a(Context context, Integer num) {
        if (!(context == null || num == null)) {
            if (num.intValue() == 1) {
                String string = context.getResources().getString(R.string.bz9);
                C89219l.m154716b(string, "");
                return string;
            } else if (num.intValue() == 2) {
                String string2 = context.getResources().getString(R.string.baw);
                C89219l.m154716b(string2, "");
                return string2;
            }
        }
        return "";
    }

    /* renamed from: a */
    public static String m84050a(Context context, String str) {
        if (!(context == null || str == null)) {
            int hashCode = str.hashCode();
            if (hashCode != -600094315) {
                if (hashCode != 301801488) {
                }
                String string = context.getString(R.string.bz9);
                C89219l.m154716b(string, "");
                return string;
            } else if (str.equals("friends")) {
                String string2 = context.getString(R.string.baw);
                C89219l.m154716b(string2, "");
                return string2;
            }
        }
        return "";
    }

    /* renamed from: a */
    public static final String m84048a(Context context, User user) {
        if (context == null || user == null) {
            return "";
        }
        String a = m84049a(context, Integer.valueOf(user.getFollowStatus()));
        if (a.length() > 0 && a != null) {
            return a;
        }
        String relationShip = user.getRelationShip();
        if (TextUtils.equals(relationShip, "suggested")) {
            String string = context.getResources().getString(R.string.ff2);
            C89219l.m154716b(string, "");
            return string;
        } else if (TextUtils.equals(relationShip, "contacts")) {
            String string2 = context.getResources().getString(R.string.c20);
            C89219l.m154716b(string2, "");
            return string2;
        } else if (TextUtils.equals(relationShip, "facebook")) {
            String string3 = context.getResources().getString(R.string.f0c);
            C89219l.m154716b(string3, "");
            return string3;
        } else if (TextUtils.equals(relationShip, "follower")) {
            String string4 = context.getResources().getString(R.string.bzo);
            C89219l.m154716b(string4, "");
            return string4;
        } else if (!TextUtils.equals(relationShip, "twitter")) {
            return "";
        } else {
            String string5 = context.getResources().getString(R.string.gx6);
            C89219l.m154716b(string5, "");
            return string5;
        }
    }
}
