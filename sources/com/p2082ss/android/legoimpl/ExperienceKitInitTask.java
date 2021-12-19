package com.p2082ss.android.legoimpl;

import android.content.Context;
import android.p003ss.com.vboost.C0004a;
import android.p003ss.com.vboost.VboostListener;
import android.p003ss.com.vboost.p007d.C0051f;
import android.p003ss.com.vboost.p008e.C0059a;
import android.p003ss.com.vboost.p008e.C0062c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.settings.C68734b;
import com.p2082ss.android.ugc.aweme.settings.C68751q;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.legoimpl.ExperienceKitInitTask */
public class ExperienceKitInitTask implements AbstractC58264w {
    static {
        Covode.recordClassIndex(36377);
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
    /* renamed from: i */
    public final boolean mo28609i() {
        return C68751q.m121187a();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        C51423a.m95784a(3, null, "ExperienceKitInitTask");
        C39162r.m79460a("vboost_task_launch", new C84425b().f188764a);
        try {
            C0062c.f224a = SettingsManager.m29616a().mo25394a("vboost_log_level_settings_mt", 6);
            boolean a = C68751q.m121187a();
            C51423a.m95784a(4, "vboost", "enable:".concat(String.valueOf(a)));
            if (a) {
                C299561 r2 = new VboostListener.AbstractC0003a() {
                    /* class com.p2082ss.android.legoimpl.ExperienceKitInitTask.C299561 */

                    static {
                        Covode.recordClassIndex(36378);
                    }

                    @Override // android.p003ss.com.vboost.VboostListener.AbstractC0003a
                    /* renamed from: a */
                    public final void mo3a(String str, JSONObject jSONObject) {
                        C39162r.m79461a(str, jSONObject);
                    }
                };
                C0051f fVar = C0051f.C0054a.f206a;
                fVar.f200k = new WeakReference<>(r2);
                C0059a.f218a = fVar.f201l;
                C51423a.m95791b(4, "vboost", "registerApplication.");
                C39162r.m79460a("vboost_register_application", new C84425b().f188764a);
                C0004a.m4a(context);
                HashSet hashSet = new HashSet();
                int[] iArr = (int[]) SettingsManager.m29616a().mo25397a("allowed_vboost_scene_mt", int[].class, C68734b.f153755a);
                if (iArr != null) {
                    for (int i : iArr) {
                        hashSet.add(Integer.valueOf(i));
                    }
                }
                C0004a.m5a(hashSet);
                AVExternalServiceImpl.m113114a().publishService().setKitManageRegister(true);
            }
        } catch (Throwable th) {
            C51423a.m95791b(6, "vboost", "registerApplication exception.");
            C22708a.m42802a(th);
            C0051f.f192j = false;
            AVExternalServiceImpl.m113114a().publishService().setKitManageRegister(false);
        }
    }
}
