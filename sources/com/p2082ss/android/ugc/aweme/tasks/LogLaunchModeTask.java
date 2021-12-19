package com.p2082ss.android.ugc.aweme.tasks;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.p3009d.C51427a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.metrics.C59262x;
import com.p2082ss.android.ugc.aweme.p2482cn.C36145b;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.tasks.LogLaunchModeTask */
public class LogLaunchModeTask implements AbstractC58264w {

    /* renamed from: a */
    private Uri f174306a;

    /* renamed from: b */
    private String f174307b;

    /* renamed from: c */
    private String f174308c;

    static {
        Covode.recordClassIndex(90779);
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
        return EnumC58151ae.BOOT_FINISH;
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
        String str;
        Uri uri = this.f174306a;
        String str2 = "";
        if (uri != null) {
            str = uri.getQueryParameter("enter_to");
        } else {
            str = str2;
        }
        C36145b b = C36145b.m73641b();
        Context applicationContext = C51427a.f118503a.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        long e = b.mo63273e(applicationContext, "red_point_count");
        C59262x xVar = new C59262x();
        xVar.f135422a = this.f174308c;
        xVar.f135425d = Integer.toString(1);
        if (str != null) {
            str2 = str;
        }
        xVar.f135423b = str2;
        xVar.f135424c = Long.toString(e);
        xVar.f135426e = this.f174307b;
        xVar.mo96792f();
    }

    public LogLaunchModeTask(Uri uri, String str) {
        this.f174306a = uri;
        this.f174307b = str;
        this.f174308c = "enter_launch";
    }

    public LogLaunchModeTask(Uri uri, String str, String str2) {
        this.f174306a = uri;
        this.f174307b = str;
        this.f174308c = str2;
    }
}
