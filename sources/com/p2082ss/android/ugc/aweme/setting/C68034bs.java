package com.p2082ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.setting.bs */
public final class C68034bs {

    /* renamed from: a */
    public static int f152390a = 1;

    /* renamed from: b */
    public static int f152391b = 2;

    /* renamed from: c */
    public static int f152392c = 3;

    /* renamed from: d */
    public static int f152393d = 2;

    /* renamed from: e */
    public static int f152394e = 1;

    /* renamed from: f */
    public static int f152395f;

    static {
        Covode.recordClassIndex(80230);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (((long) r7.getVideoLength()) <= 60500) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        if (r7 != null) goto L_0x0042;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m120335a(com.p2082ss.android.ugc.aweme.shortvideo.BaseShortVideoContext r7) {
        /*
            boolean r0 = r7 instanceof com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel
            r5 = 60500(0xec54, double:2.9891E-319)
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L_0x002e
            r2 = r7
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = (com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel) r2
            boolean r0 = r2.isShoutout()
            if (r0 == 0) goto L_0x0021
            java.lang.String r1 = com.p2082ss.android.ugc.aweme.shoutouts.C74418d.MODE_POST
            com.ss.android.ugc.aweme.shoutouts.d r0 = r2.mShoutOutsData
            java.lang.String r0 = r0.getShoutOutsMode()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0021
        L_0x0020:
            return r3
        L_0x0021:
            if (r7 == 0) goto L_0x0029
            int r0 = r7.getVideoLength()
            if (r0 > 0) goto L_0x0020
        L_0x0029:
            int r0 = r2.recordMode
            if (r0 != r3) goto L_0x0040
            goto L_0x0020
        L_0x002e:
            if (r7 == 0) goto L_0x0052
            int r0 = r7.getVideoLength()
            if (r0 <= 0) goto L_0x0042
            int r0 = r7.getVideoLength()
            long r1 = (long) r0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0042
            goto L_0x0020
        L_0x0040:
            if (r7 == 0) goto L_0x0052
        L_0x0042:
            int r0 = r7.getVideoLength()
            if (r0 <= 0) goto L_0x0052
            int r0 = r7.getVideoLength()
            long r1 = (long) r0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0052
            goto L_0x0020
        L_0x0052:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.setting.C68034bs.m120335a(com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext):boolean");
    }
}
