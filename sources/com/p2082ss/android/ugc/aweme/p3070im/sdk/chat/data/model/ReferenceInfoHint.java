package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.ReferenceInfoHint */
public final class ReferenceInfoHint implements Serializable {
    @AbstractC27891c(mo46611a = "content")
    private final String content;
    @AbstractC27891c(mo46611a = "refmsg_content")
    private final String refmsg_content;
    @AbstractC27891c(mo46611a = "refmsg_sec_uid")
    private final String refmsg_sec_uid;
    @AbstractC27891c(mo46611a = "refmsg_type")
    private final int refmsg_type;
    @AbstractC27891c(mo46611a = "refmsg_uid")
    private final String refmsg_uid;

    static {
        Covode.recordClassIndex(63454);
    }

    public ReferenceInfoHint() {
        this(null, null, null, 0, null, 31, null);
    }

    public final String getContent() {
        return this.content;
    }

    public final String getRefmsg_content() {
        return this.refmsg_content;
    }

    public final String getRefmsg_sec_uid() {
        return this.refmsg_sec_uid;
    }

    public final int getRefmsg_type() {
        return this.refmsg_type;
    }

    public final String getRefmsg_uid() {
        return this.refmsg_uid;
    }

    public final BaseContent getParsedContent() {
        long j;
        EnumC53772b.C53814f fVar = EnumC53772b.Companion;
        int i = this.refmsg_type;
        String str = this.refmsg_content;
        Long g = C89361p.m154865g(this.refmsg_uid);
        if (g != null) {
            j = g.longValue();
        } else {
            j = 0;
        }
        return fVar.mo90397a(i, str, false, j);
    }

    public ReferenceInfoHint(String str, String str2, String str3, int i, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        this.content = str;
        this.refmsg_uid = str2;
        this.refmsg_sec_uid = str3;
        this.refmsg_type = i;
        this.refmsg_content = str4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ReferenceInfoHint(java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, java.lang.String r11, int r12, p4600h.p4611f.p4613b.C89214g r13) {
        /*
            r6 = this;
            r3 = r9
            r4 = r10
            r2 = r8
            r1 = r7
            r0 = r12 & 1
            java.lang.String r5 = ""
            if (r0 == 0) goto L_0x000b
            r1 = r5
        L_0x000b:
            r0 = r12 & 2
            if (r0 == 0) goto L_0x0010
            r2 = r5
        L_0x0010:
            r0 = r12 & 4
            if (r0 == 0) goto L_0x0015
            r3 = r5
        L_0x0015:
            r0 = r12 & 8
            if (r0 == 0) goto L_0x001b
            r0 = -1
            r4 = -1
        L_0x001b:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0024
        L_0x001f:
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L_0x0024:
            r5 = r11
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ReferenceInfoHint.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, h.f.b.g):void");
    }
}
