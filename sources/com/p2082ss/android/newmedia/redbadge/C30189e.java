package com.p2082ss.android.newmedia.redbadge;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.newmedia.redbadge.p2169a.C30152a;
import com.p2082ss.android.newmedia.redbadge.p2169a.C30153b;
import com.p2082ss.android.newmedia.redbadge.p2169a.C30154c;
import com.p2082ss.android.newmedia.redbadge.p2169a.C30155d;
import com.p2082ss.android.newmedia.redbadge.p2169a.C30156e;
import com.p2082ss.android.newmedia.redbadge.p2169a.C30157f;
import com.p2082ss.android.newmedia.redbadge.p2169a.C30158g;
import com.p2082ss.android.newmedia.redbadge.p2169a.C30159h;
import com.p2082ss.android.newmedia.redbadge.p2169a.C30160i;
import com.p2082ss.android.newmedia.redbadge.p2169a.C30161j;
import com.p2082ss.android.newmedia.redbadge.p2169a.C30162k;
import com.p2082ss.android.newmedia.redbadge.p2169a.C30163l;
import com.p2082ss.android.newmedia.redbadge.p2169a.C30164m;
import com.p2082ss.android.newmedia.redbadge.p2169a.C30168n;
import com.p2082ss.android.newmedia.redbadge.p2169a.C30169o;
import com.p2082ss.android.newmedia.redbadge.p2169a.C30170p;
import com.p2082ss.android.newmedia.redbadge.p2169a.C30171q;
import com.p2082ss.android.newmedia.redbadge.p2169a.C30172r;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.newmedia.redbadge.e */
public class C30189e {

    /* renamed from: a */
    private static final List<Class<? extends AbstractC30151a>> f71984a;

    /* renamed from: d */
    private static volatile C30189e f71985d;

    /* renamed from: b */
    private AbstractC30151a f71986b;

    /* renamed from: c */
    private ComponentName f71987c;

    private C30189e() {
    }

    /* renamed from: a */
    public static synchronized C30189e m61060a() {
        C30189e eVar;
        synchronized (C30189e.class) {
            MethodCollector.m26663i(14220);
            if (f71985d == null) {
                synchronized (C30189e.class) {
                    try {
                        if (f71985d == null) {
                            f71985d = new C30189e();
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(14220);
                        throw th;
                    }
                }
            }
            eVar = f71985d;
            MethodCollector.m26664o(14220);
        }
        return eVar;
    }

    static {
        Covode.recordClassIndex(36691);
        LinkedList linkedList = new LinkedList();
        f71984a = linkedList;
        linkedList.add(C30152a.class);
        linkedList.add(C30153b.class);
        linkedList.add(C30159h.class);
        linkedList.add(C30160i.class);
        linkedList.add(C30164m.class);
        linkedList.add(C30170p.class);
        linkedList.add(C30154c.class);
        linkedList.add(C30157f.class);
        linkedList.add(C30161j.class);
        linkedList.add(C30168n.class);
        linkedList.add(C30171q.class);
        linkedList.add(C30172r.class);
        linkedList.add(C30162k.class);
        linkedList.add(C30156e.class);
        linkedList.add(C30163l.class);
        linkedList.add(C30158g.class);
        linkedList.add(C30169o.class);
    }

    /* renamed from: a */
    private boolean m61061a(Context context) {
        AbstractC30151a aVar;
        boolean z = false;
        if (context == null) {
            return false;
        }
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                return false;
            }
            this.f71987c = launchIntentForPackage.getComponent();
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            if (!(resolveActivity == null || resolveActivity.activityInfo == null || TextUtils.isEmpty(resolveActivity.activityInfo.name))) {
                if (!resolveActivity.activityInfo.name.toLowerCase().contains("resolver")) {
                    String str = resolveActivity.activityInfo.packageName;
                    Iterator<Class<? extends AbstractC30151a>> it = f71984a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        try {
                            aVar = (AbstractC30151a) it.next().newInstance();
                        } catch (Throwable unused) {
                        }
                        if (aVar != null && aVar.mo53567a().contains(str)) {
                            this.f71986b = aVar;
                            z = true;
                            break;
                        }
                    }
                    if (this.f71986b == null) {
                        if (Build.MANUFACTURER.equalsIgnoreCase("OPPO")) {
                            this.f71986b = new C30161j();
                            return true;
                        } else if (Build.MANUFACTURER.equalsIgnoreCase("VIVO")) {
                            this.f71986b = new C30168n();
                            return true;
                        } else if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
                            this.f71986b = new C30170p();
                            return true;
                        } else if (Build.MANUFACTURER.equalsIgnoreCase("ZUK")) {
                            this.f71986b = new C30172r();
                            return true;
                        } else if (Build.MANUFACTURER.equalsIgnoreCase("ZTE")) {
                            this.f71986b = new C30171q();
                            return true;
                        } else if (Build.MANUFACTURER.equalsIgnoreCase("SONY")) {
                            this.f71986b = new C30164m();
                            return true;
                        } else if (Build.MANUFACTURER.equalsIgnoreCase("Samsung")) {
                            this.f71986b = new C30162k();
                            return true;
                        } else {
                            this.f71986b = new C30155d();
                            return true;
                        }
                    }
                    return z;
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final boolean mo53608a(Context context, int i) {
        try {
            mo53609b(context, i);
            return true;
        } catch (C30188d unused) {
            Logger.debug();
            return false;
        }
    }

    /* renamed from: b */
    public final void mo53609b(Context context, int i) {
        if (this.f71986b != null || m61061a(context)) {
            try {
                this.f71986b.mo53568a(context, this.f71987c, i);
            } catch (Exception e) {
                throw new C30188d("Unable to execute badge", e);
            }
        } else {
            throw new C30188d("No default launcher available");
        }
    }
}
