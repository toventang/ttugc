package com.p2082ss.android.ugc.aweme.kids.setting;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.p2082ss.android.ugc.aweme.bullet.api.IBulletService;
import com.p2082ss.android.ugc.aweme.bullet.impl.BulletService;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.o */
public interface AbstractC57982o {
    static {
        Covode.recordClassIndex(68008);
    }

    /* renamed from: a */
    CommonItemView mo95126a(View view);

    /* renamed from: a */
    String mo95127a();

    /* renamed from: a */
    void mo95128a(CommonItemView commonItemView);

    /* renamed from: a */
    void mo95129a(String str, String str2, Boolean bool);

    /* renamed from: b */
    Activity mo95130b();

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.o$a */
    public static final class C57983a {
        static {
            Covode.recordClassIndex(68009);
        }

        /* renamed from: a */
        public static /* synthetic */ void m104791a(AbstractC57982o oVar, String str, String str2, Boolean bool, int i) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                bool = null;
            }
            oVar.mo95129a(str, str2, bool);
        }

        /* renamed from: a */
        public static void m104792a(AbstractC57982o oVar, String str, String str2, Boolean bool, Boolean bool2) {
            C89219l.m154721d(str, "");
            IBulletService f = BulletService.m71938f();
            Activity b = oVar.mo95130b();
            Bundle bundle = new Bundle();
            if (str2 != null) {
                bundle.putString("title", str2);
            }
            if (bool != null) {
                bool.booleanValue();
                bundle.putBoolean("hide_nav_bar", bool.booleanValue());
            }
            f.mo61853a(b, str, bundle);
        }
    }
}
