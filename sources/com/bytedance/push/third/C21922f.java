package com.bytedance.push.third;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.push.third.p1602a.C21915a;
import com.bytedance.push.third.p1602a.C21916b;
import com.bytedance.push.third.p1602a.C21917c;
import com.p2082ss.android.message.C30061a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: com.bytedance.push.third.f */
public class C21922f extends AbstractC21914a {

    /* renamed from: c */
    private static C21922f f51910c;

    static {
        Covode.recordClassIndex(25587);
    }

    @Override // com.bytedance.push.third.AbstractC21914a
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Set mo35674b() {
        return super.mo35674b();
    }

    @Override // com.bytedance.push.third.AbstractC21914a
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ JSONArray mo35677c() {
        return super.mo35677c();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.push.third.AbstractC21914a
    /* renamed from: a */
    public final void mo35673a() {
        if (this.f51900a.size() == 0) {
            this.f51900a.put(5, new C21921e(5, "com.fcm.FcmPushAdapter", "fcm", new C21917c(C30061a.f71748a)));
            this.f51900a.put(2, new C21921e(2, "com.bytedance.push.self.SelfPushAdapter", "SelfPush", new C21915a(C30061a.f71748a)));
            this.f51900a.put(14, new C21921e(14, "com.adm.push.AdmPushAdapter", "amazon", new C21915a(C30061a.f71748a)));
            this.f51900a.put(15, new C21921e(15, "com.bytedance.push.frontier.FrontierPushAdapter", "frontierPush", new C21916b()));
        }
    }

    @Override // com.bytedance.push.third.AbstractC21914a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ int mo35671a(String str) {
        return super.mo35671a(str);
    }

    @Override // com.bytedance.push.third.AbstractC21914a
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ String mo35678d(int i) {
        return super.mo35678d(i);
    }

    @Override // com.bytedance.push.third.AbstractC21914a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC21918b mo35672a(int i) {
        return super.mo35672a(i);
    }

    @Override // com.bytedance.push.third.AbstractC21914a
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo35675b(int i) {
        return super.mo35675b(i);
    }

    private C21922f(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        C30061a.m60799a((Application) applicationContext);
    }

    @Override // com.bytedance.push.third.AbstractC21914a
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo35676b(String str) {
        return super.mo35676b(str);
    }

    /* renamed from: a */
    public static C21922f m41214a(Context context) {
        MethodCollector.m26663i(6172);
        if (f51910c == null) {
            synchronized (C21922f.class) {
                try {
                    if (f51910c == null) {
                        f51910c = new C21922f(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6172);
                    throw th;
                }
            }
        }
        C21922f fVar = f51910c;
        MethodCollector.m26664o(6172);
        return fVar;
    }
}
