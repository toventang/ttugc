package com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.p084a.p088b.p089a.C1863a;
import com.p084a.p088b.p090b.C1869a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.tux.a.j.e */
public final class C79466e {
    static {
        Covode.recordClassIndex(92664);
    }

    /* renamed from: a */
    public static void m138185a(TuxIconView tuxIconView, ViewGroup.LayoutParams layoutParams) {
        C89219l.m154721d(tuxIconView, "");
        C89219l.m154721d(layoutParams, "");
    }

    /* renamed from: a */
    public static boolean m138186a(String str, C1863a aVar, TuxIconView tuxIconView, ViewGroup.LayoutParams layoutParams) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(tuxIconView, "");
        C89219l.m154721d(layoutParams, "");
        switch (str.hashCode()) {
            case -1754043686:
                if (!str.equals("app:tux_icon")) {
                    return false;
                }
                String str2 = aVar.f5673a;
                C89219l.m154716b(str2, "");
                tuxIconView.setIconRes(Integer.parseInt(str2));
                return true;
            case -697836383:
                if (!str.equals("app:tux_iconHeight")) {
                    return false;
                }
                Context context = tuxIconView.getContext();
                C89219l.m154716b(context, "");
                tuxIconView.setIconHeight(C89241a.m154730a(C1869a.m6037a(context, aVar)));
                return true;
            case -380386150:
                if (!str.equals("app:tux_iconShadow")) {
                    return false;
                }
                tuxIconView.mo37658a(C1869a.m6041a(aVar));
                return true;
            case 361903975:
                if (!str.equals("app:tux_tintColor")) {
                    return false;
                }
                Context context2 = tuxIconView.getContext();
                C89219l.m154716b(context2, "");
                tuxIconView.setTintColor(C1869a.m6044d(context2, aVar));
                return true;
            case 1931119372:
                if (!str.equals("app:tux_iconWidth")) {
                    return false;
                }
                Context context3 = tuxIconView.getContext();
                C89219l.m154716b(context3, "");
                tuxIconView.setIconWidth(C89241a.m154730a(C1869a.m6037a(context3, aVar)));
                return true;
            default:
                return false;
        }
    }
}
