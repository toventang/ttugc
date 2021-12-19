package com.p2082ss.android.ugc.aweme.tux.p4159a.p4169j;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.p084a.p088b.p089a.C1863a;
import com.p084a.p088b.p090b.C1869a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.tux.a.j.d */
public final class C79465d {
    static {
        Covode.recordClassIndex(92663);
    }

    /* renamed from: a */
    public static void m138183a(TuxButton tuxButton, ViewGroup.LayoutParams layoutParams) {
        C89219l.m154721d(tuxButton, "");
        C89219l.m154721d(layoutParams, "");
    }

    /* renamed from: a */
    public static boolean m138184a(String str, C1863a aVar, TuxButton tuxButton, ViewGroup.LayoutParams layoutParams) {
        String str2;
        String str3;
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(tuxButton, "");
        C89219l.m154721d(layoutParams, "");
        switch (str.hashCode()) {
            case -1909861454:
                if (str.equals("app:tux_buttonVariant") && (str2 = aVar.f5673a) != null) {
                    switch (str2.hashCode()) {
                        case -1908079720:
                            if (str2.equals("const_secondary")) {
                                tuxButton.setButtonVariant(2);
                                break;
                            }
                            break;
                        case -817598092:
                            if (str2.equals("secondary")) {
                                tuxButton.setButtonVariant(1);
                                break;
                            }
                            break;
                        case -314765822:
                            if (str2.equals("primary")) {
                                tuxButton.setButtonVariant(0);
                                break;
                            }
                            break;
                        case 3387192:
                            if (str2.equals("none")) {
                                tuxButton.setButtonVariant(-1);
                                break;
                            }
                            break;
                    }
                }
                break;
            case -1164020445:
                if (str.equals("app:tux_drawableStart")) {
                    Context context = tuxButton.getContext();
                    C89219l.m154716b(context, "");
                    tuxButton.setButtonStartIcon(Integer.valueOf(C1869a.m6042b(context, aVar)));
                    return true;
                }
                break;
            case -697836383:
                if (str.equals("app:tux_iconHeight")) {
                    Context context2 = tuxButton.getContext();
                    C89219l.m154716b(context2, "");
                    tuxButton.setIconHeight(C89241a.m154730a(C1869a.m6037a(context2, aVar)));
                    return true;
                }
                break;
            case -553081260:
                if (str.equals("app:tux_loadingIcon")) {
                    Context context3 = tuxButton.getContext();
                    C89219l.m154716b(context3, "");
                    tuxButton.setLoadingIcon(C1869a.m6042b(context3, aVar));
                    return true;
                }
                break;
            case 253523420:
                if (str.equals("app:tux_drawableEnd")) {
                    Context context4 = tuxButton.getContext();
                    C89219l.m154716b(context4, "");
                    tuxButton.setButtonEndIcon(Integer.valueOf(C1869a.m6042b(context4, aVar)));
                    return true;
                }
                break;
            case 486716404:
                if (str.equals("app:tux_buttonSize") && (str3 = aVar.f5673a) != null) {
                    switch (str3.hashCode()) {
                        case -1078030475:
                            if (str3.equals("medium")) {
                                tuxButton.setButtonSize(2);
                                break;
                            }
                            break;
                        case 3387192:
                            if (str3.equals("none")) {
                                tuxButton.setButtonSize(-1);
                                break;
                            }
                            break;
                        case 3560192:
                            if (str3.equals("tiny")) {
                                tuxButton.setButtonSize(0);
                                break;
                            }
                            break;
                        case 102742843:
                            if (str3.equals("large")) {
                                tuxButton.setButtonSize(3);
                                break;
                            }
                            break;
                        case 109548807:
                            if (str3.equals("small")) {
                                tuxButton.setButtonSize(1);
                                break;
                            }
                            break;
                    }
                }
                break;
            case 902192320:
                if (str.equals("app:tux_buttonAutoSizing")) {
                    tuxButton.mo37349a(C1869a.m6041a(aVar));
                    return true;
                }
                break;
            case 1931119372:
                if (str.equals("app:tux_iconWidth")) {
                    Context context5 = tuxButton.getContext();
                    C89219l.m154716b(context5, "");
                    tuxButton.setIconWidth(C89241a.m154730a(C1869a.m6037a(context5, aVar)));
                    return true;
                }
                break;
        }
        return false;
    }
}
