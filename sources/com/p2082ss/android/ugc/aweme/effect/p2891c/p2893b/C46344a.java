package com.p2082ss.android.ugc.aweme.effect.p2891c.p2893b;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.effect.EffectPointModel;
import com.p2082ss.android.ugc.aweme.effect.p2891c.C46337a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65444e;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import dmt.p4542av.video.C88300w;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.effect.c.b.a */
public final class C46344a {

    /* renamed from: a */
    public static final C46344a f108028a = new C46344a();

    /* renamed from: b */
    private static final AbstractC89244h f108029b = C89250i.m154773a((AbstractC89171a) C46345a.f108030a);

    /* renamed from: a */
    private static long m89390a() {
        return ((Number) f108029b.getValue()).longValue();
    }

    private C46344a() {
    }

    /* renamed from: a */
    public static final boolean m89398a(EffectPointModel effectPointModel) {
        return C89219l.m154714a((Object) (effectPointModel != null ? effectPointModel.getKey() : null), (Object) "1");
    }

    static {
        Covode.recordClassIndex(54921);
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.c.b.a$a */
    static final class C46345a extends AbstractC89220m implements AbstractC89171a<Long> {

        /* renamed from: a */
        public static final C46345a f108030a = new C46345a();

        static {
            Covode.recordClassIndex(54922);
        }

        C46345a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Long invoke() {
            long j = 60000;
            if (C63244g.m114602a().mo73284l().enable3MinRecord()) {
                j = Math.max(60000L, 180000L);
            }
            if (C65444e.m117163a()) {
                j = Math.max(j, C63244g.m114602a().mo73285m().importLongVideoThreshold());
            }
            return Long.valueOf(j);
        }
    }

    /* renamed from: b */
    private static boolean m89399b(EffectPointModel effectPointModel) {
        String str;
        if (effectPointModel != null) {
            str = effectPointModel.getKey();
        } else {
            str = null;
        }
        return C89219l.m154714a((Object) str, (Object) "2");
    }

    /* renamed from: c */
    private static boolean m89400c(EffectPointModel effectPointModel) {
        String str;
        if (effectPointModel != null) {
            str = effectPointModel.getKey();
        } else {
            str = null;
        }
        return C89219l.m154714a((Object) str, (Object) "3");
    }

    /* renamed from: a */
    public static long m89391a(int i) {
        return Math.max((long) (i / 5), 1000L);
    }

    /* renamed from: a */
    public static final boolean m89396a(long j) {
        if (j >= m89390a()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final C88300w m89393a(int i, VideoPublishEditModel videoPublishEditModel) {
        EffectPointModel effectPointModel;
        if (videoPublishEditModel == null || (effectPointModel = videoPublishEditModel.mTimeEffect) == null) {
            return null;
        }
        long endPoint = (long) effectPointModel.getEndPoint();
        long startPoint = (long) effectPointModel.getStartPoint();
        String key = effectPointModel.getKey();
        if (Math.abs(startPoint - endPoint) < 1000) {
            long max = Math.max(1000L, (long) (i / 5));
            long j = (long) i;
            if (startPoint + max > j) {
                startPoint = j - max;
            }
            endPoint = max + startPoint;
        }
        return C88300w.m153451a(key, startPoint, endPoint);
    }

    /* renamed from: a */
    public static final List<EffectPointModel> m89395a(long j, long j2) {
        ArrayList arrayList = new ArrayList();
        EffectPointModel effectPointModel = new EffectPointModel();
        effectPointModel.setUiStartPoint((int) j);
        effectPointModel.setUiEndPoint((int) j2);
        arrayList.add(effectPointModel);
        return arrayList;
    }

    /* renamed from: a */
    public static final long m89392a(EffectPointModel effectPointModel, long j, long j2) {
        if (m89399b(effectPointModel)) {
            return j2 + (j * 2);
        }
        if (m89400c(effectPointModel)) {
            return (j2 - j) + ((long) (((float) j) / 0.5f));
        }
        return j2;
    }

    /* renamed from: a */
    public static final C89378p<Long, Long> m89394a(String str, C46337a aVar, AbstractC31071f fVar) {
        long j;
        Long l;
        Long l2;
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        long j2 = 0;
        if (fVar == null) {
            return new C89378p<>(0L, 0L);
        }
        int r = fVar.mo56384r(fVar.mo56370k());
        if (!aVar.f108014e || (l2 = aVar.f108012c.get(str)) == null || l2.longValue() <= 0) {
            j = (long) r;
        } else {
            Long l3 = aVar.f108012c.get(str);
            if (l3 != null) {
                j = l3.longValue();
            } else {
                j = 0;
            }
        }
        int G = fVar.mo56246G();
        if (!aVar.f108014e || (l = aVar.f108013d.get(str)) == null || l.longValue() <= 0) {
            j2 = m89391a(G);
        } else {
            Long l4 = aVar.f108013d.get(str);
            if (l4 != null) {
                j2 = l4.longValue();
            }
        }
        long j3 = (long) G;
        if (j3 - j < j2) {
            j = j3 - j2;
        }
        aVar.f108012c.put(str, Long.valueOf(j));
        aVar.f108013d.put(str, Long.valueOf(j2));
        return new C89378p<>(Long.valueOf(j), Long.valueOf(j + j2));
    }

    /* renamed from: a */
    public static final boolean m89397a(ViewPager viewPager, PagerAdapter pagerAdapter, boolean z) {
        C89219l.m154721d(viewPager, "");
        C89219l.m154721d(pagerAdapter, "");
        if (viewPager.getCurrentItem() != pagerAdapter.getCount() - 1 || !z) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        return (r6 + ((float) r8)) + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r5 != false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if (r5 != false) goto L_0x0013;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final float m89389a(com.p2082ss.android.ugc.aweme.effect.EffectPointModel r3, int r4, boolean r5, float r6, float r7, int r8, float r9) {
        /*
            boolean r0 = m89399b(r3)
            if (r0 == 0) goto L_0x0017
            long r2 = m89390a()
            long r0 = (long) r4
            long r2 = r2 - r0
            r0 = 2
            long r2 = r2 / r0
            float r1 = (float) r2
            float r1 = r1 / r9
            if (r5 == 0) goto L_0x002c
        L_0x0013:
            float r0 = (float) r8
            float r7 = r7 - r0
            float r7 = r7 - r1
            return r7
        L_0x0017:
            boolean r0 = m89400c(r3)
            if (r0 == 0) goto L_0x0030
            long r2 = m89390a()
            long r0 = (long) r4
            long r2 = r2 - r0
            float r1 = (float) r2
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r0
            float r1 = r1 / r0
            float r1 = r1 / r9
            if (r5 == 0) goto L_0x002c
            goto L_0x0013
        L_0x002c:
            float r0 = (float) r8
            float r6 = r6 + r0
            float r6 = r6 + r1
            return r6
        L_0x0030:
            if (r5 == 0) goto L_0x0033
            return r6
        L_0x0033:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.effect.p2891c.p2893b.C46344a.m89389a(com.ss.android.ugc.aweme.effect.EffectPointModel, int, boolean, float, float, int, float):float");
    }
}
