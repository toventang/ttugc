package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.p2141e.AbstractC29904a;
import com.p2082ss.android.p2141e.C29905b;
import com.p2082ss.android.ugc.aweme.common.C39161q;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitFramework */
public class InitFramework implements AbstractC58264w {
    static {
        Covode.recordClassIndex(68471);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 17;
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
        return EnumC58151ae.MAIN;
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
        C80720e.m139919a(context);
        C29905b.m60282a(C17867d.m33078a());
        try {
            SharedPreferences.Editor edit = C34822d.m71158a(C29905b.f71340a, "KEY_NEED_UPLOAD_LAUNCHLOG", 0).edit();
            edit.putInt("json_data", 1);
            edit.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        C29905b.m60282a(C17867d.m33078a()).f71342b = new AbstractC29904a() {
            /* class com.p2082ss.android.ugc.aweme.legoImp.task.InitFramework.C583421 */

            static {
                Covode.recordClassIndex(68472);
            }

            @Override // com.p2082ss.android.p2141e.AbstractC29904a
            public final void onEvent(Map<String, String> map) {
                C39161q.m79451a("launch_log", map);
            }
        };
    }
}
