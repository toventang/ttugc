package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a;

import android.text.TextUtils;
import androidx.appcompat.app.ActivityC0218d;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.asve.context.C31032a;
import com.p2082ss.android.ugc.asve.p2213b.EnumC31017a;
import com.p2082ss.android.ugc.asve.p2213b.EnumC31024f;
import com.p2082ss.android.ugc.asve.p2213b.EnumC31025g;
import com.p2082ss.android.ugc.asve.p2216e.C31057a;
import com.p2082ss.android.ugc.asve.p2216e.C31058b;
import com.p2082ss.android.ugc.asve.p2216e.C31059c;
import com.p2082ss.android.ugc.asve.recorder.camera.C31165b;
import com.p2082ss.android.ugc.aweme.property.C65342al;
import com.p2082ss.android.ugc.aweme.property.C65343am;
import com.p2082ss.android.ugc.aweme.property.C65355ay;
import com.p2082ss.android.ugc.aweme.property.C65357b;
import com.p2082ss.android.ugc.aweme.property.C65368bh;
import com.p2082ss.android.ugc.aweme.property.C65369bi;
import com.p2082ss.android.ugc.aweme.property.C65421dd;
import com.p2082ss.android.ugc.aweme.property.C65423df;
import com.p2082ss.android.ugc.aweme.shortvideo.duet.C70681h;
import com.p2082ss.android.ugc.aweme.shortvideo.record.C72775au;
import com.p2082ss.android.ugc.aweme.shortvideo.record.C72776av;
import com.p2082ss.android.ugc.aweme.shortvideo.record.C72808s;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4095g.C77962k;
import java.lang.reflect.Type;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.y */
final /* synthetic */ class C73446y implements AbstractC89172b {

    /* renamed from: a */
    private final C21582f f164991a;

    static {
        Covode.recordClassIndex(86183);
    }

    C73446y(C21582f fVar) {
        this.f164991a = fVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        int option;
        EnumC31025g gVar;
        C72776av avVar = (C72776av) obj;
        ((ActivityC0218d) this.f164991a.mo35249a((Type) ActivityC0218d.class, (String) null)).getApplication();
        boolean d = new C77962k("").mo121656d();
        avVar.f163171a = true;
        avVar.f163172b = d ? 1 : 0;
        if (C65343am.m117029a()) {
            option = EnumC31024f.AS_OPTION_FLAG_PICTURE_SIZE.getOption() | 0;
        } else {
            option = (EnumC31024f.AS_OPTION_FLAG_PICTURE_SIZE.getOption() ^ -1) & 0;
        }
        avVar.mo115060a(new C31032a((byte) option) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.util.C74049z.C740501 */

            /* renamed from: a */
            final /* synthetic */ byte f166200a;

            /* renamed from: b */
            final /* synthetic */ int f166201b = 0;

            static {
                Covode.recordClassIndex(86802);
            }

            @Override // com.p2082ss.android.ugc.asve.context.C31032a, com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: i */
            public final boolean mo56146i() {
                return false;
            }

            @Override // com.p2082ss.android.ugc.asve.context.C31032a, com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: d */
            public final byte mo56141d() {
                return this.f166200a;
            }

            @Override // com.p2082ss.android.ugc.asve.context.C31032a, com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: e */
            public final int mo56142e() {
                return C31057a.m63958a();
            }

            @Override // com.p2082ss.android.ugc.asve.context.C31032a, com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: f */
            public final boolean mo56143f() {
                return C31059c.m63960a();
            }

            @Override // com.p2082ss.android.ugc.asve.context.C31032a
            /* renamed from: g */
            public final boolean mo56144g() {
                return C65421dd.m117140a();
            }

            @Override // com.p2082ss.android.ugc.asve.context.C31032a, com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: h */
            public final int mo56145h() {
                return C31058b.m63959a();
            }

            @Override // com.p2082ss.android.ugc.asve.context.C31032a, com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: l */
            public final boolean mo56149l() {
                if (this.f166201b == 1) {
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
            /* renamed from: k */
            public final int[] mo56148k() {
                int[] g = C65357b.m117051g();
                if (g == null || !C65423df.m117142a()) {
                    return new int[]{720, 1280};
                }
                return g;
            }

            {
                this.f166200a = r2;
            }
        });
        String str = avVar.f163178h.f163153c;
        String str2 = avVar.f163178h.f163152b;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            avVar.f163178h.f163156f = C70681h.m124909b();
        }
        avVar.f163179i.f163294b = C65342al.m117028a();
        avVar.f163179i.f163295c = C65357b.m117047c() * 4.0f;
        avVar.f163179i.f163296d = C65357b.m117048d();
        C72808s sVar = avVar.f163179i;
        int a = C72775au.m128326a();
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
        boolean a2 = C65369bi.m117065a();
        avVar.mo115061a(new C73356aa(a2));
        avVar.f163193w = a2;
        avVar.f163183m = true;
        avVar.f163185o = C65368bh.m117064a();
        avVar.f163184n = true;
        return C89391z.f203057a;
    }
}
