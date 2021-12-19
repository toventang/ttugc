package com.p2082ss.android.ugc.aweme.watermark;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.VEVideoEncodeSettings;
import com.p2082ss.android.vesdk.VEWatermarkParam;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.watermark.o */
public final class C81505o extends AbstractC81510t {

    /* renamed from: a */
    public C81504n f182228a;

    /* renamed from: b */
    public C81503m f182229b;

    /* renamed from: c */
    public C81488b f182230c;

    /* renamed from: d */
    public C85581w.EnumC85613l f182231d = C85581w.EnumC85613l.VIDEO_OUT_RATIO_ORIGINAL;

    /* renamed from: e */
    public int f182232e = -16777216;

    /* renamed from: f */
    public final VEWatermarkParam f182233f;

    /* renamed from: g */
    public VEVideoEncodeSettings f182234g;

    static {
        Covode.recordClassIndex(94878);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81505o(String str, String str2, VEWatermarkParam vEWatermarkParam, VEVideoEncodeSettings vEVideoEncodeSettings, C81488b bVar) {
        super(str, str2, (byte) 0);
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(vEVideoEncodeSettings, "");
        this.f182233f = vEWatermarkParam;
        this.f182234g = vEVideoEncodeSettings;
        this.f182230c = bVar;
    }
}
