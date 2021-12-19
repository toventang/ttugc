package com.bytedance.android.livesdk.share;

import android.content.Context;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.p250i.p251a.AbstractC4357d;
import com.bytedance.android.live.p379n.AbstractC5777j;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.definition.C8317c;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdkapi.depend.p683e.AbstractC11664a;
import com.bytedance.android.livesdkapi.session.C11870f;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.share.c */
public final class C10765c {

    /* renamed from: a */
    public static final C10765c f25926a = new C10765c();

    private C10765c() {
    }

    static {
        Covode.recordClassIndex(12365);
    }

    /* renamed from: com.bytedance.android.livesdk.share.c$a */
    public static final class C10766a extends AbstractC11664a {
        static {
            Covode.recordClassIndex(12366);
        }

        @Override // com.bytedance.android.livesdkapi.depend.p683e.AbstractC11664a
        /* renamed from: b */
        public final String mo17680b() {
            return "definition_selection_key";
        }

        @Override // com.bytedance.android.livesdkapi.depend.p683e.AbstractC11664a
        /* renamed from: c */
        public final int mo17681c() {
            return R.string.dt3;
        }

        @Override // com.bytedance.android.livesdkapi.depend.p683e.AbstractC11664a
        /* renamed from: d */
        public final int mo17682d() {
            return 1000;
        }

        @Override // com.bytedance.android.livesdkapi.depend.p683e.AbstractC11664a
        /* renamed from: e */
        public final boolean mo17683e() {
            C6805b<Boolean> bVar = AbstractC6804a.f17019cO;
            C89219l.m154716b(bVar, "");
            boolean z = !bVar.mo13066a().booleanValue();
            C6805b<Boolean> bVar2 = AbstractC6804a.f17019cO;
            C89219l.m154716b(bVar2, "");
            C6806c.m14603a((C6800c) bVar2, (Object) true);
            return z;
        }

        @Override // com.bytedance.android.livesdkapi.depend.p683e.AbstractC11664a
        /* renamed from: a */
        public final int mo17678a() {
            String g;
            C11870f fVar = C11870f.C11871a.f28404a;
            String str = "";
            C89219l.m154716b(fVar, str);
            EnterRoomLinkSession a = fVar.mo19010a();
            C89219l.m154716b(a, str);
            String str2 = a.f28391b.f28233c.f28288E;
            if (str2 == null) {
                str2 = str;
            }
            AbstractC2953a a2 = C6193a.m13435a(AbstractC4357d.class);
            C89219l.m154716b(a2, str);
            AbstractC5777j b = ((AbstractC4357d) a2).getLivePlayControllerManager().mo11553b(str2);
            if (!(b == null || (g = b.mo11547g()) == null)) {
                str = g;
            }
            C3854a.m9453a(4, "LiveSheetActionProvider", "getIconResId(). tag=" + str2 + ", currentSdkKey=" + str);
            int hashCode = str.hashCode();
            if (hashCode != -1008619738) {
                if (hashCode != 3324) {
                    if (hashCode != 3448) {
                        if (hashCode != 3665) {
                            if (hashCode == 115761 && str.equals("uhd")) {
                                return 2131234541;
                            }
                        } else if (str.equals("sd")) {
                            return 2131234543;
                        }
                    } else if (str.equals("ld")) {
                        return 2131234542;
                    }
                } else if (str.equals("hd")) {
                    return 2131234544;
                }
            } else if (str.equals("origin")) {
                return 2131234545;
            }
            return 2131234541;
        }

        @Override // com.bytedance.android.livesdkapi.depend.p683e.AbstractC11664a
        /* renamed from: a */
        public final void mo17679a(Context context) {
            C8317c.C8318a.m16475a(context, false);
        }
    }
}
