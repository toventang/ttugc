package com.p2082ss.android.ugc.aweme.watermark;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.property.C65357b;
import com.p2082ss.android.ugc.aweme.property.C65441dx;
import com.p2082ss.android.ugc.aweme.property.C65442dy;
import com.p2082ss.android.ugc.aweme.property.C65443dz;
import com.p2082ss.android.ugc.aweme.property.C65445ea;
import com.p2082ss.android.ugc.aweme.property.C65446eb;
import com.p2082ss.android.ugc.aweme.shortvideo.p3793af.p3794a.AbstractC69815a;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.vesdk.VEUtils;
import com.p2082ss.android.vesdk.VEVideoEncodeSettings;
import dmt.p4542av.video.C88241c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.watermark.l */
public final class C81502l {

    /* renamed from: a */
    public static int f182212a;

    /* renamed from: b */
    public static int f182213b;

    /* renamed from: c */
    public static VEUtils.VEVideoFileInfo f182214c;

    /* renamed from: d */
    public static final C81502l f182215d = new C81502l();

    private C81502l() {
    }

    static {
        Covode.recordClassIndex(94875);
    }

    /* renamed from: b */
    public static final boolean m141339b(int i, int i2) {
        double d = (double) i;
        double d2 = (double) i2;
        Double.isNaN(d2);
        Double.isNaN(d);
        if (Math.abs((d / (d2 * 1.0d)) - 1.7777777777777777d) < 0.001d) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final VEVideoEncodeSettings m141337a(int i, int i2) {
        VEVideoEncodeSettings.C85292a aVar = new VEVideoEncodeSettings.C85292a(3);
        aVar.mo130598g(C65442dy.m117161a()).mo130573a(i, i2);
        boolean b = C65357b.m117046b();
        C73991bj.m130128a("VEWatermarkParamBuilder VEVideoEncodeSettings hardEncode:".concat(String.valueOf(b)));
        if (b) {
            aVar.mo130588b(true).mo130577a(VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR, C88241c.m153350a(C65441dx.m117160a()));
        } else {
            aVar.mo130588b(false).mo130577a(VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF, C65446eb.m117165a());
        }
        VEVideoEncodeSettings.ENCODE_PRESET a = C88241c.m153351a(C65445ea.m117164a());
        if (a != null) {
            aVar.mo130578a(a);
        }
        aVar.mo130574a(C65443dz.m117162a());
        aVar.f190871a.enableRemuxVideo = false;
        aVar.mo130597f(1);
        VEVideoEncodeSettings d = aVar.mo130594d();
        C89219l.m154716b(d, "");
        return d;
    }

    /* renamed from: a */
    public static final AbstractC69815a m141336a(int i, String str, boolean z, int[] iArr) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(iArr, "");
        if (z) {
            return new C81501k(str, iArr[0], iArr[1], i);
        }
        return new C81474a(str, iArr[0], iArr[1], i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x01c5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.p2082ss.android.vesdk.VEWatermarkParam m141338a(com.p2082ss.android.ugc.aweme.shortvideo.p3793af.p3794a.AbstractC69815a r24, com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a r25, int[] r26, boolean r27, java.lang.String r28, boolean r29) {
        /*
        // Method dump skipped, instructions count: 817
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.watermark.C81502l.m141338a(com.ss.android.ugc.aweme.shortvideo.af.a.a, com.ss.android.ugc.aweme.account.model.a, int[], boolean, java.lang.String, boolean):com.ss.android.vesdk.VEWatermarkParam");
    }
}
