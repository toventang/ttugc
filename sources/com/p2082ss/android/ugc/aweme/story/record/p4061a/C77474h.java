package com.p2082ss.android.ugc.aweme.story.record.p4061a;

import androidx.appcompat.app.ActivityC0218d;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.asve.context.C31032a;
import com.p2082ss.android.ugc.asve.p2213b.EnumC31017a;
import com.p2082ss.android.ugc.asve.p2213b.EnumC31024f;
import com.p2082ss.android.ugc.asve.p2213b.EnumC31025g;
import com.p2082ss.android.ugc.asve.recorder.camera.C31165b;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65342al;
import com.p2082ss.android.ugc.aweme.property.C65343am;
import com.p2082ss.android.ugc.aweme.property.C65355ay;
import com.p2082ss.android.ugc.aweme.property.C65357b;
import com.p2082ss.android.ugc.aweme.property.C65368bh;
import com.p2082ss.android.ugc.aweme.property.C65369bi;
import com.p2082ss.android.ugc.aweme.property.C65421dd;
import com.p2082ss.android.ugc.aweme.property.C65423df;
import com.p2082ss.android.ugc.aweme.shortvideo.record.C72776av;
import com.p2082ss.android.ugc.aweme.shortvideo.record.C72808s;
import com.p2082ss.android.ugc.aweme.story.record.p4070j.C77610d;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.C77962k;
import java.lang.reflect.Type;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.story.record.a.h */
final /* synthetic */ class C77474h implements AbstractC89172b {

    /* renamed from: a */
    private final C21582f f173808a;

    static {
        Covode.recordClassIndex(90509);
    }

    C77474h(C21582f fVar) {
        this.f173808a = fVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        int option;
        EnumC31025g gVar;
        C72776av avVar = (C72776av) obj;
        ((ActivityC0218d) this.f173808a.mo35249a((Type) ActivityC0218d.class, (String) null)).getApplication();
        boolean d = new C77962k("").mo121656d();
        avVar.f163171a = true;
        avVar.f163172b = d ? 1 : 0;
        if (C65343am.m117029a()) {
            option = EnumC31024f.AS_OPTION_FLAG_PICTURE_SIZE.getOption() | 0;
        } else {
            option = (EnumC31024f.AS_OPTION_FLAG_PICTURE_SIZE.getOption() ^ -1) & 0;
        }
        avVar.mo115060a(new C31032a((byte) option) {
            /* class com.p2082ss.android.ugc.aweme.story.record.p4061a.C77477k.C774781 */

            /* renamed from: a */
            final /* synthetic */ byte f173811a;

            /* renamed from: b */
            final /* synthetic */ int f173812b = 0;

            static {
                Covode.recordClassIndex(90513);
            }

            @Override // com.p2082ss.android.ugc.asve.context.C31032a, com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: i */
            public final boolean mo56146i() {
                return false;
            }

            @Override // com.p2082ss.android.ugc.asve.context.C31032a, com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: d */
            public final byte mo56141d() {
                return this.f173811a;
            }

            @Override // com.p2082ss.android.ugc.asve.context.C31032a
            /* renamed from: g */
            public final boolean mo56144g() {
                return C65421dd.m117140a();
            }

            @Override // com.p2082ss.android.ugc.asve.context.C31032a, com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: l */
            public final boolean mo56149l() {
                if (this.f173812b == 1) {
                    return true;
                }
                return false;
            }

            @Override // com.p2082ss.android.ugc.asve.context.C31032a, com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: n */
            public final boolean mo56151n() {
                return C65355ay.m117040a();
            }

            @Override // com.p2082ss.android.ugc.asve.context.C31032a, com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: c */
            public final boolean mo56140c() {
                if (C31165b.f74715a != EnumC31017a.AS_CAMERA_2.ordinal()) {
                    return true;
                }
                return false;
            }

            @Override // com.p2082ss.android.ugc.asve.context.C31032a, com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: e */
            public final int mo56142e() {
                return C63244g.m114602a().mo73284l().getABService().getCameraOpenRetryCount();
            }

            @Override // com.p2082ss.android.ugc.asve.context.C31032a, com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: f */
            public final boolean mo56143f() {
                return C63244g.m114602a().mo73284l().getABService().getCloseCameraAsyncIsOpen();
            }

            @Override // com.p2082ss.android.ugc.asve.context.C31032a, com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: h */
            public final int mo56145h() {
                return C63244g.m114602a().mo73284l().getABService().getCameraPreviewRetryCount();
            }

            @Override // com.p2082ss.android.ugc.asve.context.C31032a, com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: k */
            public final int[] mo56148k() {
                int[] g = C65357b.m117051g();
                if (g == null || !C65423df.m117142a()) {
                    return new int[]{720, 1280};
                }
                return g;
            }

            {
                this.f173811a = r2;
            }
        });
        avVar.f163179i.f163294b = C65342al.m117028a();
        avVar.f163179i.f163295c = C65357b.m117047c() * 4.0f;
        avVar.f163179i.f163296d = C65357b.m117048d();
        C72808s sVar = avVar.f163179i;
        int a = C77610d.m135601a();
        if (a == 1) {
            gVar = EnumC31025g.AS_ENCODE_PROFILE_BASELINE;
        } else if (a == 2) {
            gVar = EnumC31025g.AS_ENCODE_PROFILE_MAIN;
        } else if (a != 8) {
            gVar = EnumC31025g.AS_ENCODE_PROFILE_UNKNOWN;
        } else {
            gVar = EnumC31025g.AS_ENCODE_PROFILE_HIGH;
        }
        sVar.mo115094a(gVar);
        avVar.f163181k = true;
        avVar.f163183m = true;
        avVar.f163185o = C65368bh.m117064a();
        boolean a2 = C65369bi.m117065a();
        avVar.mo115061a(new C77476j(a2));
        avVar.f163193w = a2;
        avVar.f163184n = true;
        return C89391z.f203057a;
    }
}
