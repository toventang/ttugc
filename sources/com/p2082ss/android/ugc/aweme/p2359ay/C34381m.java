package com.p2082ss.android.ugc.aweme.p2359ay;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.lighten.p1477a.AbstractC20753j;
import com.bytedance.lighten.p1477a.AbstractC20757n;
import com.bytedance.lighten.p1477a.C20762s;
import com.bytedance.p1733u.C23435d;
import com.facebook.net.C24893c;
import com.p2082ss.android.p2133d.C29863i;
import com.p2082ss.android.ugc.aweme.lego.C58152b;
import com.p2082ss.android.ugc.aweme.p2359ay.C34388q;
import com.p2082ss.android.ugc.aweme.p2359ay.C34395v;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73955am;
import java.io.File;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.ay.m */
public final class C34381m implements AbstractC20753j {

    /* renamed from: a */
    private volatile C20762s f81284a;

    static {
        Covode.recordClassIndex(41325);
    }

    @Override // com.bytedance.lighten.p1477a.AbstractC20753j
    /* renamed from: b */
    public final Context mo34171b() {
        return C17867d.m33078a();
    }

    @Override // com.bytedance.lighten.p1477a.AbstractC20753j
    /* renamed from: c */
    public final boolean mo34172c() {
        if (C58152b.m105089g()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.lighten.p1477a.AbstractC20753j
    /* renamed from: a */
    public final C20762s mo34170a() {
        AbstractC20757n nVar;
        long j;
        MethodCollector.m26663i(865);
        if (this.f81284a == null) {
            synchronized (this) {
                try {
                    if (this.f81284a == null) {
                        if (Build.VERSION.SDK_INT == 18) {
                            nVar = C34388q.C34389a.f81299a;
                        } else {
                            nVar = C34395v.C34396a.f81315a;
                        }
                        File c = C73955am.m130065c();
                        long j2 = 10485760;
                        if (C23435d.m44115a()) {
                            if (c != null) {
                                j = c.getFreeSpace() / 8;
                                if (j <= 20971520) {
                                    if (j < 10485760) {
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(C34390r.f81300e);
                                        C24893c.f59085c = new C24893c.AbstractC24899b() {
                                            /* class com.p2082ss.android.ugc.aweme.p2359ay.C34381m.C343821 */

                                            static {
                                                Covode.recordClassIndex(41326);
                                            }

                                            @Override // com.facebook.net.C24893c.AbstractC24899b
                                            /* renamed from: a */
                                            public final C24893c.AbstractC24898a mo40782a() {
                                                return new C34371f();
                                            }
                                        };
                                        C20762s.C20763a aVar = new C20762s.C20763a(C17867d.m33078a());
                                        aVar.f49041u = true;
                                        aVar.f49037q = true;
                                        aVar.f49030j = Bitmap.Config.RGB_565;
                                        aVar.f49031k = 1;
                                        aVar.f49028h = 5;
                                        aVar.f49036p = new C29863i();
                                        aVar.f49023c = c;
                                        aVar.f49024d = j2;
                                        aVar.f49022b = nVar;
                                        aVar.f49034n = true;
                                        aVar.f49029i = new C34374h();
                                        aVar.f49042v = arrayList;
                                        aVar.f49032l = true;
                                        aVar.f49033m = false;
                                        aVar.f49035o = C34383n.f81286a;
                                        aVar.f49038r = true;
                                        aVar.f49039s = true;
                                        aVar.f49040t = AbstractC34360a.f81228a;
                                        if (Build.VERSION.SDK_INT >= 28 && C34370e.f81255a) {
                                            aVar.f49044x = true;
                                        }
                                        this.f81284a = new C20762s(aVar, (byte) 0);
                                    }
                                }
                            } else {
                                j = 20971520;
                            }
                            j2 = j;
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(C34390r.f81300e);
                            C24893c.f59085c = new C24893c.AbstractC24899b() {
                                /* class com.p2082ss.android.ugc.aweme.p2359ay.C34381m.C343821 */

                                static {
                                    Covode.recordClassIndex(41326);
                                }

                                @Override // com.facebook.net.C24893c.AbstractC24899b
                                /* renamed from: a */
                                public final C24893c.AbstractC24898a mo40782a() {
                                    return new C34371f();
                                }
                            };
                            C20762s.C20763a aVar2 = new C20762s.C20763a(C17867d.m33078a());
                            aVar2.f49041u = true;
                            aVar2.f49037q = true;
                            aVar2.f49030j = Bitmap.Config.RGB_565;
                            aVar2.f49031k = 1;
                            aVar2.f49028h = 5;
                            aVar2.f49036p = new C29863i();
                            aVar2.f49023c = c;
                            aVar2.f49024d = j2;
                            aVar2.f49022b = nVar;
                            aVar2.f49034n = true;
                            aVar2.f49029i = new C34374h();
                            aVar2.f49042v = arrayList2;
                            aVar2.f49032l = true;
                            aVar2.f49033m = false;
                            aVar2.f49035o = C34383n.f81286a;
                            aVar2.f49038r = true;
                            aVar2.f49039s = true;
                            aVar2.f49040t = AbstractC34360a.f81228a;
                            aVar2.f49044x = true;
                            this.f81284a = new C20762s(aVar2, (byte) 0);
                        }
                        j2 = 20971520;
                        ArrayList arrayList22 = new ArrayList();
                        arrayList22.add(C34390r.f81300e);
                        C24893c.f59085c = new C24893c.AbstractC24899b() {
                            /* class com.p2082ss.android.ugc.aweme.p2359ay.C34381m.C343821 */

                            static {
                                Covode.recordClassIndex(41326);
                            }

                            @Override // com.facebook.net.C24893c.AbstractC24899b
                            /* renamed from: a */
                            public final C24893c.AbstractC24898a mo40782a() {
                                return new C34371f();
                            }
                        };
                        C20762s.C20763a aVar22 = new C20762s.C20763a(C17867d.m33078a());
                        aVar22.f49041u = true;
                        aVar22.f49037q = true;
                        aVar22.f49030j = Bitmap.Config.RGB_565;
                        aVar22.f49031k = 1;
                        aVar22.f49028h = 5;
                        aVar22.f49036p = new C29863i();
                        aVar22.f49023c = c;
                        aVar22.f49024d = j2;
                        aVar22.f49022b = nVar;
                        aVar22.f49034n = true;
                        aVar22.f49029i = new C34374h();
                        aVar22.f49042v = arrayList22;
                        aVar22.f49032l = true;
                        aVar22.f49033m = false;
                        aVar22.f49035o = C34383n.f81286a;
                        aVar22.f49038r = true;
                        aVar22.f49039s = true;
                        aVar22.f49040t = AbstractC34360a.f81228a;
                        aVar22.f49044x = true;
                        this.f81284a = new C20762s(aVar22, (byte) 0);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(865);
                    throw th;
                }
            }
        }
        C20762s sVar = this.f81284a;
        MethodCollector.m26664o(865);
        return sVar;
    }
}
