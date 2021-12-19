package com.p2082ss.android.ugc.aweme.logger;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.common.p2132c.C29819a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.p4315i.C84120a;
import java.util.List;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.logger.WarmBootLogger$BootTypeLogger$1 */
public class WarmBootLogger$BootTypeLogger$1 implements AbstractC58264w {

    /* renamed from: a */
    final /* synthetic */ int f134173a;

    static {
        Covode.recordClassIndex(69268);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
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

    WarmBootLogger$BootTypeLogger$1(int i) {
        this.f134173a = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        int i = this.f134173a;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(StringSet.type, i);
            C29819a.m60077a("main_boot_type", jSONObject);
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C58949c.f134189c = 2;
                    } else if (i != 4) {
                        if (i != 5) {
                            C58949c.f134189c = -1;
                        }
                    }
                    C84120a.m144656a().mo128938a(C58949c.f134189c);
                }
                C58949c.f134189c = 1;
                C84120a.m144656a().mo128938a(C58949c.f134189c);
            }
            C58949c.f134189c = 0;
            C84120a.m144656a().mo128938a(C58949c.f134189c);
        } catch (Exception unused) {
        }
    }
}
