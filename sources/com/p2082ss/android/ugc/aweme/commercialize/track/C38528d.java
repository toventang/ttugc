package com.p2082ss.android.ugc.aweme.commercialize.track;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.commercialize.track.d */
public final class C38528d {

    /* renamed from: a */
    public static final C38533g f91044a = null;

    /* renamed from: b */
    public static final C38528d f91045b = new C38528d();

    /* renamed from: c */
    private static final AbstractC89244h f91046c = C89250i.m154773a((AbstractC89171a) C38529a.f91047a);

    /* renamed from: a */
    public static boolean m78146a() {
        return ((Boolean) f91046c.getValue()).booleanValue();
    }

    private C38528d() {
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.track.d$a */
    static final class C38529a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C38529a f91047a = new C38529a();

        static {
            Covode.recordClassIndex(46059);
        }

        C38529a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(m78147a());
        }

        /* renamed from: a */
        private static boolean m78147a() {
            boolean z;
            boolean z2;
            try {
                Object a = SettingsManager.m29616a().mo25397a("ttnet_commerce_control", C38533g.class, C38528d.f91044a);
                if (!(a instanceof C38533g)) {
                    a = null;
                }
                C38533g gVar = (C38533g) a;
                if (gVar != null) {
                    z2 = gVar.getEnable3rdTrackerUsingTTNet();
                } else {
                    z2 = false;
                }
                z = C89379q.m157068constructorimpl(Boolean.valueOf(z2));
            } catch (Throwable th) {
                z = C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
            if (C89379q.m157071exceptionOrNullimpl(z) != null) {
                z = false;
            }
            return ((Boolean) z).booleanValue();
        }
    }

    static {
        Covode.recordClassIndex(46058);
    }
}
