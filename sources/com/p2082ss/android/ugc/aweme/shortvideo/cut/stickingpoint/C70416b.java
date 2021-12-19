package com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.vesdk.clipparam.VEAlgorithmPath;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b */
public final class C70416b {

    /* renamed from: a */
    public AbstractC70417a f157358a;

    /* renamed from: b */
    public C69905c f157359b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b$a */
    public interface AbstractC70417a {
        static {
            Covode.recordClassIndex(82860);
        }

        /* renamed from: a */
        int mo110990a(String str, int i, int i2, VEAlgorithmPath vEAlgorithmPath);
    }

    static {
        Covode.recordClassIndex(82859);
    }

    /* renamed from: a */
    private static VEAlgorithmPath m124201a(VEAlgorithmPath vEAlgorithmPath) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        VEAlgorithmPath vEAlgorithmPath2 = new VEAlgorithmPath();
        Integer num = null;
        if (vEAlgorithmPath != null) {
            str = vEAlgorithmPath.getVeBeatsPath();
        } else {
            str = null;
        }
        vEAlgorithmPath2.setVeBeatsPath(str);
        if (vEAlgorithmPath != null) {
            str2 = vEAlgorithmPath.getDownBeatsPath();
        } else {
            str2 = null;
        }
        vEAlgorithmPath2.setDownBeatsPath(str2);
        if (vEAlgorithmPath != null) {
            str3 = vEAlgorithmPath.getNoStrengthBeatsPath();
        } else {
            str3 = null;
        }
        vEAlgorithmPath2.setNoStrengthBeatsPath(str3);
        if (vEAlgorithmPath != null) {
            str4 = vEAlgorithmPath.getManMadePath();
        } else {
            str4 = null;
        }
        vEAlgorithmPath2.setManMadePath(str4);
        if (vEAlgorithmPath != null) {
            str5 = vEAlgorithmPath.getOnlineBeatsPath();
        } else {
            str5 = null;
        }
        vEAlgorithmPath2.setOnlineBeatsPath(str5);
        if (vEAlgorithmPath == null || (num = Integer.valueOf(vEAlgorithmPath.getMode())) == null) {
            C89219l.m154715b();
        }
        vEAlgorithmPath2.setMode(num.intValue());
        vEAlgorithmPath2.setType(vEAlgorithmPath.getType());
        return vEAlgorithmPath2;
    }

    /* renamed from: a */
    public static VEAlgorithmPath m124200a(C69905c cVar) {
        int i;
        if (cVar == null) {
            C89219l.m154715b();
            return null;
        }
        String b = C70455f.m124269b(cVar);
        String veBeatsPath = cVar.getStickPointMusicAlg().getVeBeatsPath();
        String downBeatsPath = cVar.getStickPointMusicAlg().getDownBeatsPath();
        String noStrengthBeatsPath = cVar.getStickPointMusicAlg().getNoStrengthBeatsPath();
        String manModeBeatsPath = cVar.getStickPointMusicAlg().getManModeBeatsPath();
        if (!C80720e.m139927b(veBeatsPath)) {
            veBeatsPath = null;
        }
        if (!C80720e.m139927b(downBeatsPath)) {
            downBeatsPath = null;
        }
        if (!C80720e.m139927b(noStrengthBeatsPath)) {
            noStrengthBeatsPath = null;
        }
        if (!C80720e.m139927b(manModeBeatsPath)) {
            manModeBeatsPath = null;
        }
        if (cVar.getStickPointMusicAlg().isSuccessivelyAlgType() && !cVar.getStickPointMusicAlg().existSuccessivelyAlgFile()) {
            cVar.getStickPointMusicAlg().setAlgType(VEAlgorithmPath.BEATES_FILE_DEFAULT);
        }
        VEAlgorithmPath vEAlgorithmPath = new VEAlgorithmPath();
        vEAlgorithmPath.setVeBeatsPath(veBeatsPath);
        vEAlgorithmPath.setDownBeatsPath(downBeatsPath);
        if (!cVar.getStickPointMusicAlg().isSuccessivelyAlgType()) {
            if (C80720e.m139927b(downBeatsPath)) {
                vEAlgorithmPath.setNoStrengthBeatsPath(null);
            } else {
                vEAlgorithmPath.setNoStrengthBeatsPath(noStrengthBeatsPath);
            }
        }
        vEAlgorithmPath.setManMadePath(manModeBeatsPath);
        vEAlgorithmPath.setOnlineBeatsPath(b);
        vEAlgorithmPath.setType(cVar.getStickPointMusicAlg().getAlgType());
        if (cVar.getStickPointMusicAlg().isSuccessivelyAlgType()) {
            i = VEAlgorithmPath.MODE_SUCCESSIVELY;
        } else {
            i = VEAlgorithmPath.INTMODE_ONSET;
        }
        vEAlgorithmPath.setMode(i);
        return vEAlgorithmPath;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x013f, code lost:
        if (r10 < 0) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0168, code lost:
        if (r10 >= 0) goto L_0x0119;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0105 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0128  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo110989a(java.lang.String r12, com.p2082ss.android.vesdk.clipparam.VEAlgorithmPath r13, int r14, int r15, java.lang.Integer r16) {
        /*
        // Method dump skipped, instructions count: 418
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70416b.mo110989a(java.lang.String, com.ss.android.vesdk.clipparam.VEAlgorithmPath, int, int, java.lang.Integer):int");
    }
}
