package com.p2082ss.android.ugc.aweme.shortvideo.util;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89350l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ak */
public final class C73950ak {

    /* renamed from: a */
    public static final C73950ak f166025a = new C73950ak();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ak$a */
    public interface AbstractC73951a {
        static {
            Covode.recordClassIndex(86701);
        }

        /* renamed from: a */
        C89378p<Boolean, C89378p<Integer, Boolean>> mo116387a(int i, int i2);
    }

    private C73950ak() {
    }

    static {
        Covode.recordClassIndex(86700);
    }

    /* renamed from: a */
    public static int m130041a() {
        return C16048b.m29633a().mo25412a(true, "fast_import_fps_limit", 40);
    }

    /* renamed from: b */
    private static C89378p<Integer, Integer> m130044b() {
        String str = "1100*";
        if (TextUtils.isEmpty(str) || !new C89350l("[0-9]+\\*[0-9]*").matches(str)) {
            str = "720*1280";
        }
        List<String> b = C89361p.m154915b(str, new String[]{"*"});
        if (C89219l.m154714a((Object) b.get(1), (Object) "")) {
            return new C89378p<>(Integer.valueOf(Integer.parseInt(b.get(0))), -1);
        }
        return new C89378p<>(Integer.valueOf(Integer.parseInt(b.get(0))), Integer.valueOf(Integer.parseInt(b.get(1))));
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ak$b */
    public static final class C73952b implements AbstractC73951a {

        /* renamed from: a */
        public final int f166026a = 721;

        /* renamed from: b */
        public final int f166027b;

        static {
            Covode.recordClassIndex(86702);
        }

        public C73952b(int i) {
            this.f166027b = i;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.util.C73950ak.AbstractC73951a
        /* renamed from: a */
        public final C89378p<Boolean, C89378p<Integer, Boolean>> mo116387a(int i, int i2) {
            int a = C73950ak.m130041a();
            int max = Math.max(SettingsManager.m29616a().mo25394a("fast_import_1080p_higher_fps_limited", 60), a);
            int i3 = this.f166026a;
            int i4 = this.f166027b;
            if (i3 > i || i4 < i) {
                return new C89378p<>(false, new C89378p(-1, false));
            }
            if (i2 <= a && SettingsManager.m29616a().mo25400a("fast_import_1080p_lower_benchmark_enable", false)) {
                return new C89378p<>(true, new C89378p(0, false));
            }
            if (a + 1 <= i2 && max >= i2 && SettingsManager.m29616a().mo25400a("fast_import_1080p_higher_benchmark_enable", false)) {
                return new C89378p<>(true, new C89378p(0, true));
            }
            return new C89378p<>(true, new C89378p(-11005, false));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ak$c */
    public static final class C73953c implements AbstractC73951a {

        /* renamed from: a */
        public final int f166028a = 1;

        /* renamed from: b */
        public final int f166029b = 720;

        static {
            Covode.recordClassIndex(86703);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.util.C73950ak.AbstractC73951a
        /* renamed from: a */
        public final C89378p<Boolean, C89378p<Integer, Boolean>> mo116387a(int i, int i2) {
            int a = C73950ak.m130041a();
            int max = Math.max(SettingsManager.m29616a().mo25394a("fast_import_720p_higher_fps_limited", 60), a);
            int i3 = this.f166028a;
            int i4 = this.f166029b;
            if (i3 > i || i4 < i) {
                return new C89378p<>(false, new C89378p(-1, false));
            }
            if (i2 <= a || (a + 1 <= i2 && max >= i2 && SettingsManager.m29616a().mo25400a("fast_import_720p_higher_benchmark_enable", false))) {
                return new C89378p<>(true, new C89378p(0, false));
            }
            return new C89378p<>(true, new C89378p(-11005, false));
        }
    }

    /* renamed from: a */
    private static boolean m130043a(C89378p<Integer, Integer> pVar, C89378p<Integer, Integer> pVar2) {
        if (pVar2.getSecond().intValue() <= 0) {
            if (pVar.getFirst().intValue() <= pVar2.getFirst().intValue()) {
                return true;
            }
            return false;
        } else if (pVar.getFirst().intValue() > pVar2.getFirst().intValue() || pVar.getSecond().intValue() > pVar2.getSecond().intValue()) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public static C89378p<Integer, Boolean> m130042a(int i, int i2, int i3) {
        C89378p<Integer, Integer> b = m130044b();
        if (!m130043a(new C89378p(Integer.valueOf(i), Integer.valueOf(i2)), b)) {
            return new C89378p<>(-11004, false);
        }
        ArrayList<AbstractC73951a> arrayList = new ArrayList();
        arrayList.add(new C73953c());
        arrayList.add(new C73952b(Math.max(721, b.getFirst().intValue())));
        if (!arrayList.isEmpty()) {
            for (AbstractC73951a aVar : arrayList) {
                C89378p<Boolean, C89378p<Integer, Boolean>> a = aVar.mo116387a(i, i3);
                if (a.getFirst().booleanValue()) {
                    return a.getSecond();
                }
            }
        }
        return new C89378p<>(-1, false);
    }
}
