package com.p2082ss.android.ugc.aweme.external;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.performance.ICrashEffectIdInfoListener;
import com.p2082ss.android.ugc.aweme.services.performance.ICrashReportService;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import dmt.p4542av.video.C88151a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.external.a */
public final class C47050a implements ICrashReportService {

    /* renamed from: a */
    public ArrayList<ICrashEffectIdInfoListener> f109602a = new ArrayList<>();

    static {
        Covode.recordClassIndex(55654);
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a$a */
    static final class C47051a extends AbstractC89220m implements AbstractC89172b<Integer, String> {

        /* renamed from: a */
        public static final C47051a f109603a = new C47051a();

        static {
            Covode.recordClassIndex(55655);
        }

        C47051a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(Integer num) {
            return m90326a(num.intValue());
        }

        /* renamed from: a */
        public static String m90326a(int i) {
            if (i == 1) {
                return "oom_detected";
            }
            if (i == 2) {
                return "native_crash_detected";
            }
            if (i == 3) {
                return "java_crash_detected";
            }
            throw new Exception("Unknown error type");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.performance.ICrashReportService
    public final void addCrashEffectIdInfoListener(ICrashEffectIdInfoListener iCrashEffectIdInfoListener) {
        C89219l.m154721d(iCrashEffectIdInfoListener, "");
        this.f109602a.add(iCrashEffectIdInfoListener);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.performance.ICrashReportService
    public final void report(int i) {
        String obj;
        HashMap<String, Object> hashMap = C88151a.f200099a.get(i);
        if (hashMap != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                Object value = entry.getValue();
                if (!(value == null || (obj = value.toString()) == null || obj.length() <= 0)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Objects.requireNonNull(linkedHashMap, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>");
            LinkedHashMap linkedHashMap2 = linkedHashMap;
            if (linkedHashMap2 != null) {
                C84911q.m145926b(C47051a.m90326a(i) + ": " + linkedHashMap2);
                C80322d.m139251a(C47051a.m90326a(i), new C84425b().mo129408a(linkedHashMap2).f188764a);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.performance.ICrashReportService
    public final void setEffectIdInfo(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        Iterator<T> it = this.f109602a.iterator();
        while (it.hasNext()) {
            it.next().setEffectIdInfo(str, str2);
        }
    }
}
