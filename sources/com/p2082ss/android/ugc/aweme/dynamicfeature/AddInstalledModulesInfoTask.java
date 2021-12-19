package com.p2082ss.android.ugc.aweme.dynamicfeature;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.common.utility.p907b.RunnableC13596e;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.p2082ss.android.ugc.aweme.lancet.p3386c.C58014b;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import java.util.List;
import java.util.Map;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.dynamicfeature.AddInstalledModulesInfoTask */
public final class AddInstalledModulesInfoTask implements AbstractC58264w {
    static {
        Covode.recordClassIndex(51505);
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

    /* renamed from: com.ss.android.ugc.aweme.dynamicfeature.AddInstalledModulesInfoTask$a */
    static final class RunnableC43298a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f101064a;

        static {
            Covode.recordClassIndex(51506);
        }

        RunnableC43298a(Context context) {
            this.f101064a = context;
        }

        public final void run() {
            Npth.addAttachUserData(new AttachUserData(this) {
                /* class com.p2082ss.android.ugc.aweme.dynamicfeature.AddInstalledModulesInfoTask.RunnableC43298a.C432991 */

                /* renamed from: a */
                final /* synthetic */ RunnableC43298a f101065a;

                static {
                    Covode.recordClassIndex(51507);
                }

                {
                    this.f101065a = r1;
                }

                @Override // com.bytedance.crash.AttachUserData
                public final Map<? extends String, ? extends String> getUserData(CrashType crashType) {
                    String str;
                    ApplicationInfo applicationInfo;
                    IPluginService d = AabPluginServiceImpl.m114069d();
                    StringBuilder sb = new StringBuilder("Installed by Morpheus: ");
                    String str2 = null;
                    if (d != null) {
                        str = C89070n.m154551a(d.mo28887a(), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 63);
                    } else {
                        str = null;
                    }
                    String sb2 = sb.append(str).toString();
                    StringBuilder sb3 = new StringBuilder("Fused: ");
                    PackageManager packageManager = this.f101065a.f101064a.getPackageManager();
                    String packageName = this.f101065a.f101064a.getPackageName();
                    if (TextUtils.equals(packageName, C17867d.m33078a().getPackageName())) {
                        if (C58014b.f132218a == null) {
                            C58014b.f132218a = packageManager.getApplicationInfo(packageName, 128);
                        }
                        applicationInfo = C58014b.f132218a;
                    } else {
                        applicationInfo = packageManager.getApplicationInfo(packageName, 128);
                    }
                    String sb4 = sb3.append(applicationInfo.metaData.getString("com.android.dynamic.apk.fused.modules")).toString();
                    StringBuilder sb5 = new StringBuilder("Split modules: ");
                    try {
                        String[] strArr = this.f101065a.f101064a.getApplicationInfo().splitNames;
                        if (strArr != null) {
                            str2 = C89064i.m154484a(strArr, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 63);
                        }
                    } catch (Throwable unused) {
                        str2 = "[NOT SUPPORT]";
                    }
                    return C89041ag.m154412a(C89387v.m154943a("Installed_Dynamic_Features", C89070n.m154551a(C89070n.m154522b(sb2, sb4, sb5.append(str2).toString()), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (AbstractC89172b) null, 62)));
                }
            }, CrashType.ALL);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        C89219l.m154721d(context, "");
        if (Build.VERSION.SDK_INT >= 21) {
            RunnableC13596e.m24423a(new RunnableC43298a(context));
        }
    }
}
