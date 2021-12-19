package com.p2082ss.android.ugc.aweme.social.widget.card;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpermissions.p1239b.C17747a;
import com.p2082ss.android.ugc.aweme.friends.AbstractC51485d;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.C74764h;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.EnumC74754a;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.EnumC74761f;
import com.p2082ss.android.ugc.aweme.social.widget.card.permission.C74808c;
import com.p2082ss.android.ugc.aweme.social.widget.card.permission.ContactLargeSquareCell;
import com.p2082ss.android.ugc.aweme.social.widget.card.permission.ContactRectangleCell;
import com.p2082ss.android.ugc.aweme.social.widget.card.permission.ContactSquareCell;
import com.p2082ss.android.ugc.aweme.social.widget.card.permission.FacebookLargeSquareCell;
import com.p2082ss.android.ugc.aweme.social.widget.card.permission.FacebookRectangleCell;
import com.p2082ss.android.ugc.aweme.social.widget.card.permission.FacebookSquareCell;
import com.p2082ss.android.ugc.aweme.social.widget.card.permission.PermissionCell;
import com.p2082ss.android.ugc.aweme.social.widget.card.rec.cell.C74825a;
import com.p2082ss.android.ugc.aweme.social.widget.card.rec.cell.RecUserRectangleCell;
import com.p2082ss.android.ugc.aweme.social.widget.card.rec.cell.RecUserSquareCell;
import com.p2082ss.android.ugc.aweme.social.widget.card.rec.cell.RecommendUserCell;
import com.p2082ss.android.ugc.aweme.ufr.AbstractC79495a;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.Locale;
import java.util.Objects;
import p4600h.C89376n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.e */
public final class C74783e {
    static {
        Covode.recordClassIndex(87628);
    }

    /* renamed from: c */
    public static final String m131301c(EnumC74761f fVar) {
        C89219l.m154721d(fVar, "");
        if (m131300b(fVar)) {
            return "on";
        }
        return "off";
    }

    /* renamed from: a */
    public static final Class<? extends AbstractC79495a> m131297a(EnumC74761f fVar) {
        C89219l.m154721d(fVar, "");
        int i = C74784f.f168090a[fVar.ordinal()];
        if (i == 1) {
            return C51648a.f118980a.mo87326f();
        }
        if (i == 2) {
            return C51648a.f118980a.mo87320c();
        }
        throw new C89376n();
    }

    /* renamed from: b */
    public static final boolean m131300b(EnumC74761f fVar) {
        C89219l.m154721d(fVar, "");
        int i = C74784f.f168091b[fVar.ordinal()];
        if (i == 1) {
            return C51648a.f118980a.mo87327g().mo86993b();
        }
        if (i == 2) {
            return C51648a.f118980a.mo87322d().mo86984c();
        }
        throw new C89376n();
    }

    /* renamed from: d */
    public static final String m131302d(EnumC74761f fVar) {
        C89219l.m154721d(fVar, "");
        int i = C74784f.f168094e[fVar.ordinal()];
        if (i == 1) {
            AbstractC51485d g = C51648a.f118980a.mo87327g();
            User b = C80580in.m139683b();
            C89219l.m154716b(b, "");
            if (g.mo86987a(b.getUid()).length() > 0) {
                return "on";
            }
            return "off";
        } else if (i == 2) {
            boolean b2 = C51648a.f118980a.mo87322d().mo86983b();
            boolean a = C17747a.m32890a("android.permission.READ_CONTACTS");
            if (b2) {
                return "on";
            }
            if (a) {
                return "off";
            }
            return "unknown";
        } else {
            throw new C89376n();
        }
    }

    /* renamed from: e */
    public static final String m131303e(EnumC74761f fVar) {
        C89219l.m154721d(fVar, "");
        int i = C74784f.f168095f[fVar.ordinal()];
        if (i == 1) {
            String name = fVar.name();
            Locale locale = Locale.ENGLISH;
            C89219l.m154716b(locale, "");
            Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = name.toLowerCase(locale);
            C89219l.m154716b(lowerCase, "");
            return lowerCase;
        } else if (i == 2) {
            String name2 = fVar.name();
            Locale locale2 = Locale.ENGLISH;
            C89219l.m154716b(locale2, "");
            Objects.requireNonNull(name2, "null cannot be cast to non-null type java.lang.String");
            String lowerCase2 = name2.toLowerCase(locale2);
            C89219l.m154716b(lowerCase2, "");
            return lowerCase2;
        } else {
            throw new C89376n();
        }
    }

    /* renamed from: a */
    public static final Class<? extends RecommendUserCell<C74825a>> m131299a(C74764h hVar) {
        C89219l.m154721d(hVar, "");
        int i = C74784f.f168100k[hVar.f168048a.ordinal()];
        if (i == 1) {
            return RecUserSquareCell.class;
        }
        if (i == 2) {
            return RecUserRectangleCell.class;
        }
        throw new IllegalArgumentException("current is not support large square!");
    }

    /* renamed from: a */
    public static final Class<? extends PermissionCell<? extends C74808c>> m131298a(EnumC74761f fVar, EnumC74754a aVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(aVar, "");
        int i = C74784f.f168099j[aVar.ordinal()];
        if (i == 1) {
            int i2 = C74784f.f168096g[fVar.ordinal()];
            if (i2 == 1) {
                return FacebookRectangleCell.class;
            }
            if (i2 == 2) {
                return ContactRectangleCell.class;
            }
            throw new C89376n();
        } else if (i == 2) {
            int i3 = C74784f.f168097h[fVar.ordinal()];
            if (i3 == 1) {
                return FacebookSquareCell.class;
            }
            if (i3 == 2) {
                return ContactSquareCell.class;
            }
            throw new C89376n();
        } else if (i == 3) {
            int i4 = C74784f.f168098i[fVar.ordinal()];
            if (i4 == 1) {
                return FacebookLargeSquareCell.class;
            }
            if (i4 == 2) {
                return ContactLargeSquareCell.class;
            }
            throw new C89376n();
        } else {
            throw new C89376n();
        }
    }
}
