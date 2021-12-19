package com.p2082ss.android.ugc.aweme.external;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.services.ttuploader.IExternalUploaderService;
import com.p2082ss.android.ugc.aweme.shortvideo.TTUploaderService;

/* renamed from: com.ss.android.ugc.aweme.external.h */
public final class C47165h implements IExternalUploaderService {
    static {
        Covode.recordClassIndex(55769);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.ttuploader.IExternalUploaderService
    public final void cacheUploadAuthKeyConfig() {
        TTUploaderService.m123220c();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.ttuploader.IExternalUploaderService
    public final String getSdkV4AuthKey() {
        return C63244g.m114602a().mo73277e().getSdkV4AuthKey("");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        if (r1 == null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        r7 = r1.f147889d;
        r8 = r1.f147886a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        if (r8 != null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        r8 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        if (r1 == null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        r0 = r1.f147894i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0043, code lost:
        if (r0 != null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
        return new com.p2082ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig(r3, r4, r5, r6, r7, r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        r9 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0029, code lost:
        if (r5 == null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002c, code lost:
        if (r1 != null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002e, code lost:
        r6 = r1.f147888c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0030, code lost:
        if (r6 != null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        r6 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        p4600h.p4611f.p4613b.C89219l.m154716b(r6, r9);
     */
    @Override // com.p2082ss.android.ugc.aweme.services.ttuploader.IExternalUploaderService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p2082ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig getUploadVideoConfig(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String r9 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r11, r9)
            com.ss.android.ugc.aweme.port.in.u r0 = com.p2082ss.android.ugc.aweme.port.p3561in.C63244g.m114602a()
            com.ss.android.ugc.aweme.port.in.au r0 = r0.mo73257C()
            com.google.gson.f r1 = r0.getRetrofitFactoryGson()
            java.lang.Class<com.ss.android.ugc.aweme.publish.f.c> r0 = com.p2082ss.android.ugc.aweme.publish.p3619f.C65611c.class
            java.lang.Object r0 = r1.mo46670a(r11, r0)
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r9)
            com.ss.android.ugc.aweme.publish.f.c r0 = (com.p2082ss.android.ugc.aweme.publish.p3619f.C65611c) r0
            com.ss.android.ugc.aweme.publish.f.f r1 = r0.f147851a
            com.ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig r2 = new com.ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig
            r0 = 0
            if (r1 == 0) goto L_0x004d
            int r3 = r1.f147893h
            int r4 = r1.f147891f
            java.lang.String r5 = r1.f147887b
            if (r5 != 0) goto L_0x002e
        L_0x002b:
            r5 = r9
            if (r1 == 0) goto L_0x0032
        L_0x002e:
            java.lang.String r6 = r1.f147888c
            if (r6 != 0) goto L_0x0033
        L_0x0032:
            r6 = r9
        L_0x0033:
            p4600h.p4611f.p4613b.C89219l.m154716b(r6, r9)
            if (r1 == 0) goto L_0x004b
            int r7 = r1.f147889d
            java.lang.String r8 = r1.f147886a
            if (r8 != 0) goto L_0x0041
        L_0x003e:
            r8 = r9
            if (r1 == 0) goto L_0x0045
        L_0x0041:
            java.lang.String r0 = r1.f147894i
            if (r0 != 0) goto L_0x0049
        L_0x0045:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
        L_0x0049:
            r9 = r0
            goto L_0x0045
        L_0x004b:
            r7 = 0
            goto L_0x003e
        L_0x004d:
            r3 = 0
            r4 = 0
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.external.C47165h.getUploadVideoConfig(java.lang.String):com.ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig");
    }
}
