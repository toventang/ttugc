package com.p2082ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.property.SmartCompileModelV1 */
public final class SmartCompileModelV1 extends C65431dn {
    @AbstractC27891c(mo46611a = "hw_compile_setting")
    private final String hwCompileSetting;
    @AbstractC27891c(mo46611a = "sw_compile_setting")
    private final String swCompileSetting;

    static {
        Covode.recordClassIndex(76814);
    }

    public final String getHwCompileSetting() {
        return this.hwCompileSetting;
    }

    public final String getSwCompileSetting() {
        return this.swCompileSetting;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SmartCompileModelV1(String str, int i, String str2, String str3, String str4) {
        super(str, i, str2);
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        this.swCompileSetting = str3;
        this.hwCompileSetting = str4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SmartCompileModelV1(java.lang.String r7, int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12, p4600h.p4611f.p4613b.C89214g r13) {
        /*
            r6 = this;
            r2 = r8
            r1 = r7
            r0 = r12 & 1
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x0009
            r1 = r3
        L_0x0009:
            r0 = r12 & 2
            if (r0 == 0) goto L_0x000f
            r0 = -1
            r2 = -1
        L_0x000f:
            r0 = r12 & 4
            if (r0 == 0) goto L_0x001a
        L_0x0013:
            r0 = r6
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L_0x001a:
            r3 = r9
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.property.SmartCompileModelV1.<init>(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, h.f.b.g):void");
    }
}
