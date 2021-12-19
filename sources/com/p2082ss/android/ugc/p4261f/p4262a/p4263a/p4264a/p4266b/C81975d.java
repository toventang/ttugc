package com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2160ml.C30091m;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.C81968b;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81965d;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.C81967f;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.AbstractC81969a;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.C81971b;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.C81978f;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.f.a.a.a.b.d */
public final class C81975d extends AbstractC81969a {

    /* renamed from: e */
    public AbstractC81981g f183453e;

    static {
        Covode.recordClassIndex(95790);
    }

    /* renamed from: com.ss.android.ugc.f.a.a.a.b.d$a */
    public static class C81976a extends AbstractC81969a.AbstractC81970a {
        static {
            Covode.recordClassIndex(95791);
        }

        @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.AbstractC81969a.AbstractC81970a
        /* renamed from: a */
        public final AbstractC81981g mo61745a() {
            C81975d dVar = new C81975d(this.f183444a, (byte) 0);
            AbstractC81981g a = new C81978f.C81979a(this.f183444a).mo127143a(this.f183445b).mo127144b(this.f183446c).mo127142a(this.f183447d).mo61745a();
            a.mo117465a(this.f183445b);
            a.mo117466b(this.f183446c);
            a.mo117464a(this.f183447d);
            dVar.f183453e = a;
            return dVar;
        }

        public C81976a(AbstractC81965d dVar) {
            super(dVar);
        }
    }

    private C81975d(AbstractC81965d dVar) {
        super(dVar);
    }

    /* synthetic */ C81975d(AbstractC81965d dVar, byte b) {
        this(dVar);
    }

    @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4266b.AbstractC81981g
    /* renamed from: a */
    public final C81967f mo61744a(List<? extends AbstractC81964c> list, Map<String, Object> map) {
        AbstractC81964c cVar;
        int i;
        C81967f fVar = new C81967f();
        if (list == null || list.isEmpty()) {
            fVar.f183435b = new C81968b(0, "bitrate list is empty...");
            return fVar;
        }
        List<? extends AbstractC81964c> c = mo127140c(list);
        if (c.isEmpty()) {
            fVar.f183435b = new C81968b(5, "Intersection bitrate list is empty.");
            return fVar;
        }
        int i2 = 1;
        try {
            C30091m mVar = C81971b.C81972a.f183449a.f183448a;
            if (mVar != null) {
                if (mVar.mo53465c()) {
                    if (mVar.mo53464b()) {
                        List list2 = (List) map.get("cache_size_list");
                        if (list2 != null) {
                            int intValue = ((Integer) map.get("internet_speed")).intValue();
                            if (intValue > 0) {
                                int intValue2 = ((Integer) map.get("internet_speed_0")).intValue();
                                int intValue3 = ((Integer) map.get("internet_speed_1")).intValue();
                                int intValue4 = ((Integer) map.get("internet_speed_2")).intValue();
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= c.size()) {
                                        cVar = (AbstractC81964c) c.get(c.size() - 1);
                                        break;
                                    }
                                    int bitRate = ((AbstractC81964c) c.get(i3)).getBitRate();
                                    map.put("video_bitrate", Integer.valueOf(bitRate));
                                    if (list2.size() - i2 >= i3) {
                                        i = ((Integer) list2.get(i3)).intValue();
                                    } else {
                                        i = 0;
                                    }
                                    map.put("cache_size", Integer.valueOf(i));
                                    float f = (float) bitRate;
                                    map.put("bitrate_speed", Float.valueOf(f / (((float) intValue) + 1.0f)));
                                    map.put("bitrate_speed_0", Float.valueOf(f / (((float) intValue2) + 1.0f)));
                                    map.put("bitrate_speed_1", Float.valueOf(f / (((float) intValue3) + 1.0f)));
                                    map.put("bitrate_speed_2", Float.valueOf(f / (((float) intValue4) + 1.0f)));
                                    List<String> a = mVar.f71806b.mo53455a(map, mVar.mo53460a(), mVar.f71808d.output, mVar.f71808d.feature_list, null);
                                    if (a.size() > 0 && a.get(0).equalsIgnoreCase("true")) {
                                        cVar = (AbstractC81964c) c.get(i3);
                                        break;
                                    }
                                    i3++;
                                    i2 = 1;
                                }
                                if (cVar != null) {
                                    fVar.f183434a = cVar;
                                    fVar.f183436c = 1;
                                    return fVar;
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            fVar.f183435b = new C81968b(9, th.getMessage());
        }
        C81967f a2 = this.f183453e.mo61744a(c, new C81978f.C81980b().mo127146a(((Integer) map.get("internet_speed")).intValue()).f183455a);
        a2.f183436c = 0;
        return a2;
    }
}
