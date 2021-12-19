package com.p2082ss.android.ugc.aweme.tools.p4098c;

import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.property.C65340aj;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70504v;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.tools.EnumC78601i;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.vesdk.C85391be;
import com.p2082ss.android.vesdk.ROTATE_DEGREE;
import com.p2082ss.android.vesdk.VEUtils;
import java.util.Arrays;
import java.util.List;
import p078c.p083d.C1762a;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.tools.c.c */
public final class C78102c {
    static {
        Covode.recordClassIndex(91200);
    }

    /* renamed from: a */
    public static final int m136520a(String str, int[] iArr) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(iArr, "");
        C84911q.m145928d("start getVideoFileInfoWithRotation");
        if (C65340aj.m117026a() && C89361p.m154874b(str, "content://", false)) {
            str = C1762a.m5918a(C63247i.f143610a, C84896h.m145871d(str));
            C89219l.m154716b(str, "");
        }
        C63244g.m114602a().mo73293u();
        int videoFileInfo = VEUtils.getVideoFileInfo(str, iArr);
        if (videoFileInfo == 0 && iArr[2] % LiveFeedRefreshTimeSetting.DEFAULT != 0) {
            int i = iArr[1];
            iArr[1] = iArr[0];
            iArr[0] = i;
        }
        C84911q.m145928d("end getVideoFileInfoWithRotation");
        return videoFileInfo;
    }

    /* renamed from: b */
    public static final void m136524b(C85391be beVar, List<? extends VideoSegment> list) {
        C89219l.m154721d(beVar, "");
        if (!(list == null || list.isEmpty())) {
            int length = beVar.f191152e.length;
            int size = list.size() + length;
            beVar.f191152e = Arrays.copyOf(beVar.f191152e, size);
            beVar.f191153f = Arrays.copyOf(beVar.f191153f, size);
            beVar.f191156i = Arrays.copyOf(beVar.f191156i, size);
            beVar.f191157j = Arrays.copyOf(beVar.f191157j, size);
            beVar.f191158k = (ROTATE_DEGREE[]) Arrays.copyOf(beVar.f191158k, size);
            beVar.f191148a = (String[]) Arrays.copyOf(beVar.f191148a, size);
            beVar.f191149b = Arrays.copyOf(beVar.f191149b, size);
            int i = 0;
            for (T t : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C89070n.m154520a();
                }
                T t2 = t;
                int i3 = i + length;
                beVar.f191152e[i3] = (int) t2.mo110578d();
                beVar.f191153f[i3] = (int) t2.mo110580e();
                beVar.f191156i[i3] = (double) EnumC78601i.NORMAL.value();
                beVar.f191157j[i3] = true;
                beVar.f191158k[i3] = ROTATE_DEGREE.ROTATE_NONE;
                beVar.f191148a[i3] = t2.mo110571a(false).toString();
                beVar.f191149b[i3] = t2.f156709a;
                i = i2;
            }
        }
    }

    /* renamed from: a */
    public static final void m136522a(C85391be beVar, List<? extends VideoSegment> list) {
        C89219l.m154721d(beVar, "");
        if (list != null) {
            int i = 0;
            for (T t : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C89070n.m154520a();
                }
                T t2 = t;
                beVar.f191152e[i] = (int) t2.mo110578d();
                beVar.f191153f[i] = (int) t2.mo110580e();
                beVar.f191158k[i] = C70504v.C70505a.m124383a(t2.f156718j);
                beVar.f191156i[i] = (double) t2.mo110582f();
                beVar.f191157j[i] = !t2.f156717i;
                i = i2;
            }
        }
    }

    /* renamed from: a */
    public static final void m136521a(C85391be beVar, int i, VideoSegment videoSegment) {
        boolean z;
        C89219l.m154721d(beVar, "");
        C89219l.m154721d(videoSegment, "");
        boolean[] zArr = beVar.f191157j;
        C89219l.m154716b(zArr, "");
        int length = zArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i3 + 1;
            boolean[] zArr2 = beVar.f191157j;
            if (i == i3) {
                z = true;
            } else {
                z = false;
            }
            zArr2[i3] = z;
            i2++;
            i3 = i4;
        }
        beVar.f191156i[i] = (double) videoSegment.mo110582f();
        beVar.f191152e[i] = 0;
        beVar.f191153f[i] = (int) videoSegment.f156710b;
        beVar.f191158k[i] = C70504v.C70505a.m124383a(videoSegment.f156718j);
    }

    /* renamed from: a */
    public static final void m136523a(C85391be beVar, List<? extends VideoSegment> list, int[] iArr, int[] iArr2, float[] fArr, int[] iArr3) {
        C89219l.m154721d(beVar, "");
        C89219l.m154721d(iArr, "");
        C89219l.m154721d(iArr2, "");
        C89219l.m154721d(fArr, "");
        C89219l.m154721d(iArr3, "");
        if (list != null && (!list.isEmpty())) {
            int i = 0;
            for (T t : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C89070n.m154520a();
                }
                beVar.f191157j[i] = !t.f156717i;
                beVar.f191152e[i] = iArr[i];
                beVar.f191153f[i] = iArr2[i];
                beVar.f191156i[i] = (double) fArr[i];
                beVar.f191158k[i] = C70504v.C70505a.m124383a(iArr3[i]);
                i = i2;
            }
        }
    }
}
