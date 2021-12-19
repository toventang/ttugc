package com.p2082ss.android.ugc.aweme.p2306ah;

import android.app.Activity;
import com.bytedance.bpea.basics.C13349j;
import com.bytedance.bpea.basics.C13350k;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.p878a.C13401b;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.panel.C14277a;
import com.bytedance.creativex.recorder.filter.panel.C14283c;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.aweme.filter.view.internal.main.C50864b;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.utils.C80245bi;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import com.p2082ss.android.ugc.tools.view.p4362a.C84921e;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.ah.d */
public final class C33450d {
    static {
        Covode.recordClassIndex(40307);
    }

    /* renamed from: com.ss.android.ugc.aweme.ah.d$b */
    public static final class C33456b extends C84921e {
        static {
            Covode.recordClassIndex(40313);
        }

        C33456b() {
        }

        @Override // com.p2082ss.android.ugc.tools.view.p4362a.C84921e
        /* renamed from: a */
        public final AbstractC84919c mo59545a(Object obj) {
            C89219l.m154721d(obj, "");
            if (obj instanceof Activity) {
                return C80245bi.m139086a((Activity) obj);
            }
            return super.mo59545a(obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ah.d$a */
    static final class C33451a extends AbstractC89220m implements AbstractC89172b<C14277a.C14278a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C33456b f79503a;

        /* renamed from: b */
        final /* synthetic */ C21582f f79504b;

        static {
            Covode.recordClassIndex(40308);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33451a(C33456b bVar, C21582f fVar) {
            super(1);
            this.f79503a = bVar;
            this.f79504b = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C14277a.C14278a aVar) {
            C14277a.C14278a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f34608b = new AbstractC89172b<C14283c.C14286c, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.p2306ah.C33450d.C33451a.C334521 */

                /* renamed from: a */
                final /* synthetic */ C33451a f79505a;

                static {
                    Covode.recordClassIndex(40309);
                }

                {
                    this.f79505a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C14283c.C14286c cVar) {
                    C14283c.C14286c cVar2 = cVar;
                    C89219l.m154721d(cVar2, "");
                    C33456b bVar = this.f79505a.f79503a;
                    C89219l.m154721d(bVar, "");
                    cVar2.f34631a = bVar;
                    cVar2.f34632b = C334531.f79506a;
                    return C89391z.f203057a;
                }
            };
            aVar2.f34607a = new AbstractC89172b<Activity, Boolean>(this) {
                /* class com.p2082ss.android.ugc.aweme.p2306ah.C33450d.C33451a.C334542 */

                /* renamed from: a */
                final /* synthetic */ C33451a f79507a;

                static {
                    Covode.recordClassIndex(40311);
                }

                {
                    this.f79507a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ Boolean invoke(Activity activity) {
                    Activity activity2 = activity;
                    boolean z = true;
                    if (!C63244g.m114602a().mo73255A().mo93903b()) {
                        final C89233z.C89238e eVar = new C89233z.C89238e();
                        eVar.element = null;
                        eVar.element = (T) this.f79507a.f79504b.mo35252b(AbstractC14177d.class, null);
                        T t = eVar.element;
                        if (t != null) {
                            t.mo22742b(false, new PrivacyCert(new C13349j("1033"), "Open the camera on the shooting page to preview and shoot the video.", new C13350k[]{C13401b.m24107a()}));
                        }
                        AbstractC63269z A = C63244g.m114602a().mo73255A();
                        if (activity2 == null) {
                            C89219l.m154715b();
                        }
                        A.mo93897a(activity2, "", "", null, new AbstractC63269z.AbstractC63270a() {
                            /* class com.p2082ss.android.ugc.aweme.p2306ah.C33450d.C33451a.C334542.C334551 */

                            static {
                                Covode.recordClassIndex(40312);
                            }

                            @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z.AbstractC63270a
                            /* renamed from: a */
                            public final void mo59543a() {
                                T t = eVar.element;
                                if (t != null) {
                                    t.mo22740a(false, new PrivacyCert(new C13349j("1013"), "Open the camera on the shooting page to preview and shoot the video.", new C13350k[]{C13401b.m24107a()}));
                                }
                            }

                            @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z.AbstractC63270a
                            /* renamed from: b */
                            public final void mo59544b() {
                                T t = eVar.element;
                                if (t != null) {
                                    t.mo22740a(false, new PrivacyCert(new C13349j("1014"), "Open the camera on the shooting page to preview and shoot the video.", new C13350k[]{C13401b.m24107a()}));
                                }
                            }
                        });
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            };
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final C14277a m68560a(AbstractC22186b bVar, C21582f fVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(fVar, "");
        return new C14277a(bVar, fVar, new C50864b(C63244g.m114602a().mo73290r().mo86007e(), C63244g.m114602a().mo73290r().mo86006d()), C63244g.m114602a().mo73290r().mo86008f().mo86051a(), new C33451a(new C33456b(), fVar));
    }
}
