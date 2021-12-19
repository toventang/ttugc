package com.p2082ss.android.ugc.asve.recorder;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.C31016b;
import com.p2082ss.android.ugc.asve.context.AbstractC31040h;
import com.p2082ss.android.ugc.asve.p2213b.C31028i;
import com.p2082ss.android.ugc.asve.p2213b.EnumC31025g;
import com.p2082ss.android.vesdk.C85322ar;
import com.p2082ss.android.vesdk.VEAudioEncodeSettings;
import com.p2082ss.android.vesdk.VEDisplaySettings;
import com.p2082ss.android.vesdk.VESize;
import com.p2082ss.android.vesdk.VEVideoEncodeSettings;
import p4600h.C89376n;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.recorder.k */
public final class C31215k {
    static {
        Covode.recordClassIndex(37861);
    }

    /* renamed from: a */
    public static final VEAudioEncodeSettings m64882a() {
        VEAudioEncodeSettings a = new VEAudioEncodeSettings.C85194a().mo130147a();
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: a */
    public static final VEVideoEncodeSettings m64883a(AbstractC31040h hVar) {
        VEVideoEncodeSettings.ENCODE_PROFILE encode_profile;
        C89219l.m154721d(hVar, "");
        VEVideoEncodeSettings.C85292a aVar = new VEVideoEncodeSettings.C85292a(1);
        String c = hVar.mo56165l().mo56208c();
        String b = hVar.mo56165l().mo56207b();
        if (c.length() > 0) {
            b.length();
        }
        aVar.mo130591c(hVar.mo56167n().mo56182c());
        C89378p<Integer, Integer> f = hVar.mo56159f();
        aVar.mo130585b((int) (hVar.mo56167n().mo56181b() * 1024.0f * 1024.0f));
        EnumC31025g e = hVar.mo56167n().mo56184e();
        C89219l.m154721d(e, "");
        int i = C31028i.f74349a[e.ordinal()];
        if (i == 1) {
            encode_profile = VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN;
        } else if (i == 2) {
            encode_profile = VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_BASELINE;
        } else if (i == 3) {
            encode_profile = VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_MAIN;
        } else if (i == 4) {
            encode_profile = VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_HIGH;
        } else {
            throw new C89376n();
        }
        aVar.mo130579a(encode_profile);
        aVar.mo130592d(hVar.mo56167n().mo56183d());
        int intValue = f.getFirst().intValue();
        int intValue2 = f.getSecond().intValue();
        C31016b.f74339a.mo56123d("setVideoRes:  width = " + intValue + "  height = " + intValue2 + ' ');
        aVar.mo130573a(intValue, intValue2);
        aVar.mo130593d(hVar.mo56167n().mo56185f());
        aVar.mo130587b(hVar.mo56167n().mo56186g());
        aVar.mo130596e(hVar.mo56152A());
        VEVideoEncodeSettings d = aVar.mo130594d();
        C89219l.m154716b(d, "");
        return d;
    }

    /* renamed from: b */
    public static final C85322ar m64884b(AbstractC31040h hVar) {
        VEDisplaySettings m;
        C89219l.m154721d(hVar, "");
        C85322ar.C85323a aVar = new C85322ar.C85323a();
        aVar.mo130635a(hVar.mo56170q());
        boolean z = true;
        aVar.mo130639c(true);
        if (!hVar.mo56171r() || hVar.mo56172s() == 0) {
            aVar.mo130641d(true);
        } else {
            aVar.mo130636b();
            aVar.mo130641d(false);
            hVar.mo56172s();
            aVar.mo130631a(hVar.mo56172s());
        }
        aVar.mo130630a();
        aVar.mo130637b(hVar.mo56162i());
        int[] k = hVar.mo56168o().mo56148k();
        if (k.length == 2) {
            aVar.mo130633a(new VESize(k[0], k[1]));
        }
        if (hVar.mo56173t() && (m = hVar.mo56168o().mo56150m()) != null) {
            aVar.mo130632a(m);
        }
        aVar.mo130643e(hVar.mo56169p());
        aVar.mo130639c(!hVar.mo56165l().mo56211f());
        aVar.mo130640d();
        if (hVar.mo56164k().invoke().booleanValue()) {
            aVar.mo130638c();
            aVar.mo130642e();
            aVar.mo130644f();
        }
        if (hVar.mo56174u() <= 0) {
            z = false;
        }
        aVar.mo130645f(z);
        if (hVar.mo56179z()) {
            aVar.mo130634a(C85322ar.EnumC85325c.QR_CODE_GRAPH);
        }
        C85322ar arVar = aVar.f191015a;
        C89219l.m154716b(arVar, "");
        return arVar;
    }
}
