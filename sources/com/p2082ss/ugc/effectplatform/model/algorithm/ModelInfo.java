package com.p2082ss.ugc.effectplatform.model.algorithm;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.AbstractC86780f;
import com.p2082ss.ugc.effectplatform.C86756c;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.ugc.effectplatform.model.algorithm.ModelInfo */
public class ModelInfo {
    private String _name;
    private ExtendedUrlModel file_url;
    private String name;
    private String name_sec;
    private int status;
    private long totalSize;
    private int type;
    private String version;

    static {
        Covode.recordClassIndex(102557);
    }

    public ModelInfo() {
        this(null, null, null, null, 0, 0, 0, 127, null);
    }

    public ExtendedUrlModel getFile_url() {
        return this.file_url;
    }

    public String getName_sec() {
        return this.name_sec;
    }

    public int getStatus() {
        return this.status;
    }

    public long getTotalSize() {
        return this.totalSize;
    }

    public int getType() {
        return this.type;
    }

    public String getVersion() {
        return this.version;
    }

    public String getName() {
        String str;
        if (C89361p.m154870a((CharSequence) this._name) && (!C89361p.m154870a((CharSequence) getName_sec()))) {
            AbstractC86780f fVar = C86756c.f195652a;
            if (fVar == null || (str = fVar.decrypt(getName_sec())) == null) {
                str = "";
            }
            this._name = str;
        }
        if (C89361p.m154870a((CharSequence) this._name)) {
            return this.name;
        }
        return this._name;
    }

    public void setFile_url(ExtendedUrlModel extendedUrlModel) {
        this.file_url = extendedUrlModel;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setTotalSize(long j) {
        this.totalSize = j;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setName(String str) {
        C89219l.m154719c(str, "");
        this.name = str;
    }

    public void setName_sec(String str) {
        C89219l.m154719c(str, "");
        this.name_sec = str;
    }

    public void setVersion(String str) {
        C89219l.m154719c(str, "");
        this.version = str;
    }

    public ModelInfo(String str, String str2, String str3, ExtendedUrlModel extendedUrlModel, long j, int i, int i2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(str3, "");
        this._name = str;
        this.name_sec = str2;
        this.version = str3;
        this.file_url = extendedUrlModel;
        this.totalSize = j;
        this.type = i;
        this.status = i2;
        this.name = "";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ModelInfo(java.lang.String r10, java.lang.String r11, java.lang.String r12, com.p2082ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel r13, long r14, int r16, int r17, int r18, p4600h.p4611f.p4613b.C89214g r19) {
        /*
            r9 = this;
            r8 = r17
            r7 = r16
            r1 = r10
            r4 = r13
            r2 = r11
            r5 = r14
            r0 = r18 & 1
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x000f
            r1 = r3
        L_0x000f:
            r0 = r18 & 2
            if (r0 == 0) goto L_0x0014
            r2 = r3
        L_0x0014:
            r0 = r18 & 4
            if (r0 == 0) goto L_0x0032
        L_0x0018:
            r0 = r18 & 8
            if (r0 == 0) goto L_0x001d
            r4 = 0
        L_0x001d:
            r0 = r18 & 16
            if (r0 == 0) goto L_0x0023
            r5 = 0
        L_0x0023:
            r0 = r18 & 32
            if (r0 == 0) goto L_0x0028
            r7 = 0
        L_0x0028:
            r0 = r18 & 64
            if (r0 == 0) goto L_0x002d
            r8 = 1
        L_0x002d:
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r7, r8)
            return
        L_0x0032:
            r3 = r12
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ugc.effectplatform.model.algorithm.ModelInfo.<init>(java.lang.String, java.lang.String, java.lang.String, com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel, long, int, int, int, h.f.b.g):void");
    }
}
