package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.p122a.AbstractC2540a;
import com.bytedance.p122a.C2541b;
import com.p2082ss.android.common.p2132c.C29819a;
import com.p2082ss.android.ugc.aweme.experiment.C46964ga;
import com.p2082ss.android.ugc.aweme.experiment.C46983gp;
import com.p2082ss.android.ugc.aweme.experiment.C47003h;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.ApiUserInitTask */
public final class ApiUserInitTask implements AbstractC58264w {
    static {
        Covode.recordClassIndex(68395);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.ApiUserInitTask$a */
    public static final class C58307a implements AbstractC2540a {

        /* renamed from: a */
        public static final C58307a f132797a = new C58307a();

        private C58307a() {
        }

        static {
            Covode.recordClassIndex(68396);
        }

        @Override // com.bytedance.p122a.AbstractC2540a
        /* renamed from: a */
        public final void mo7003a(String str, JSONObject jSONObject) {
            C29819a.m60077a(str, jSONObject);
            String.valueOf(jSONObject);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BACKGROUND;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        try {
            boolean z = true;
            Object a = C16048b.m29633a().mo25415a(true, "api_user_config", C47003h.class);
            C89219l.m154716b(a, "");
            C47003h hVar = (C47003h) a;
            Integer num = null;
            (hVar != null ? Integer.valueOf(hVar.f109522b) : null).intValue();
            if (hVar != null) {
                num = Integer.valueOf(hVar.f109521a);
            }
            num.intValue();
            HashMap hashMap = new HashMap();
            if (hVar != null) {
                List<C46964ga> list = hVar.f109523c;
                if (list != null) {
                    for (T t : list) {
                        if (t != null) {
                            String str = t.f109451a;
                            List<C46983gp> list2 = t.f109452b;
                            if (list2 != null) {
                                for (T t2 : list2) {
                                    hashMap.put(C89219l.m154704a(str, (Object) t2.f109481a), Integer.valueOf(t2.f109482b));
                                }
                            }
                        }
                    }
                }
                int intValue = Integer.valueOf(hVar.f109522b).intValue();
                int intValue2 = Integer.valueOf(hVar.f109521a).intValue();
                C58307a aVar = C58307a.f132797a;
                if (intValue != 1) {
                    z = false;
                }
                C2541b.f7678b = z;
                C2541b.f7679c = hashMap;
                C2541b.f7677a = (long) intValue2;
                C2541b.f7680d = aVar;
            }
        } catch (Throwable unused) {
        }
    }
}
