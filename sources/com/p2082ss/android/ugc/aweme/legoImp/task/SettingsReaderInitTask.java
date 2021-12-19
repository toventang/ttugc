package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.AbstractC16082i;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.ugc.aweme.app.C33748g;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.p2387bf.C34823e;
import com.p2082ss.android.ugc.aweme.setting.AbstractC68041bz;
import com.p2082ss.android.ugc.aweme.settingsrequest.AbstractC68806f;
import com.p2082ss.android.ugc.aweme.settingsrequest.C68811k;
import com.p2082ss.android.ugc.aweme.specact.SpecActServiceImpl;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.SettingsReaderInitTask */
public class SettingsReaderInitTask implements AbstractC58264w {
    static {
        Covode.recordClassIndex(68598);
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
    public final int bQ_() {
        return C58444q.f133061a;
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
        SettingsManager.m29616a().mo25399a(new AbstractC16082i() {
            /* class com.p2082ss.android.ugc.aweme.legoImp.task.SettingsReaderInitTask.C583891 */

            static {
                Covode.recordClassIndex(68599);
            }

            @Override // com.bytedance.ies.abmock.AbstractC16082i
            /* renamed from: a */
            public final void mo25536a() {
                SettingsManagerProxy.inst().notifySettingsChange();
                SpecActServiceImpl.m131497i().mo118027b();
            }
        });
        C51423a.m95787a("SettingsReaderInitTask");
        SettingsManagerProxy.inst().registerSettingsWatcher(AbstractC68806f.m121278a(), false);
        SettingsManagerProxy.inst().registerSettingsWatcher(C34823e.f82260a, false);
        if (C29843f.m60129a(C17867d.m33078a())) {
            try {
                AbstractC88979t.m154294a(C33748g.C33749a.f79953a).mo143278b(C88391a.m153580a(C88392a.f200660a)).mo143261a(C88925a.m154180b(C88946a.f201991c)).mo143062b((AbstractC88986z) new C33748g.C33750b());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        AbstractC68041bz.f152407a.mo108658a((AbstractC68041bz.AbstractC68043a) new C68811k());
    }
}
