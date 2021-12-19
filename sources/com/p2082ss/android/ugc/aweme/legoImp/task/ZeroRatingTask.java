package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p834j.C13104c;
import com.bytedance.p802b.p834j.p838d.AbstractC13106a;
import com.bytedance.p802b.p834j.p838d.AbstractC13108c;
import com.p2082ss.android.ugc.aweme.api.C33539h;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.zerorating.ZeroRatingServiceImpl;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.ZeroRatingTask */
public class ZeroRatingTask implements AbstractC58264w {

    /* renamed from: a */
    public boolean f132992a = true;

    static {
        Covode.recordClassIndex(68652);
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
        if (C33539h.m68712a() && !C80580in.m139687c()) {
            ZeroRatingServiceImpl.m141669f().mo59641a();
            try {
                AbstractC13106a aVar = (AbstractC13106a) C13104c.m23566a(AbstractC13106a.class);
                if (aVar != null) {
                    aVar.mo20900a(new AbstractC13108c() {
                        /* class com.p2082ss.android.ugc.aweme.legoImp.task.ZeroRatingTask.C584121 */

                        static {
                            Covode.recordClassIndex(68653);
                        }

                        @Override // com.bytedance.p802b.p834j.p838d.AbstractC13108c
                        /* renamed from: b */
                        public final void mo20839b() {
                            ZeroRatingServiceImpl.m141669f().mo59648e();
                        }

                        @Override // com.bytedance.p802b.p834j.p838d.AbstractC13108c
                        /* renamed from: a */
                        public final void mo20838a() {
                            if (ZeroRatingTask.this.f132992a) {
                                ZeroRatingTask.this.f132992a = false;
                            } else {
                                ZeroRatingServiceImpl.m141669f().mo59647d();
                            }
                        }
                    });
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
