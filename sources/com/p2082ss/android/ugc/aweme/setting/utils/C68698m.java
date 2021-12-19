package com.p2082ss.android.ugc.aweme.setting.utils;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.base.utils.C34727m;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.p2386be.AbstractC34793a;
import com.p2082ss.android.ugc.aweme.p2727db.AbstractC40931a;
import com.p2082ss.android.ugc.aweme.p2728dc.C40949a;
import com.p2082ss.android.ugc.aweme.p2728dc.C40956d;
import com.p2082ss.android.ugc.aweme.setting.p3732ui.AbstractActivityC68607v;
import com.p2082ss.android.ugc.aweme.setting.unit.p3736a.C68634c;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.HashSet;
import java.util.Iterator;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.utils.m */
public final class C68698m {
    static {
        Covode.recordClassIndex(80959);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.setting.utils.m$b */
    public static final class C68700b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractActivityC68607v f153702a;

        /* renamed from: b */
        final /* synthetic */ HashSet f153703b;

        static {
            Covode.recordClassIndex(80961);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68700b(AbstractActivityC68607v vVar, HashSet hashSet) {
            super(0);
            this.f153702a = vVar;
            this.f153703b = hashSet;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C58957c.m108321a(this.f153702a, "settings_page", "click_setting", new AbstractC34543f(this) {
                /* class com.p2082ss.android.ugc.aweme.setting.utils.C68698m.C68700b.C687011 */

                /* renamed from: a */
                final /* synthetic */ C68700b f153704a;

                static {
                    Covode.recordClassIndex(80962);
                }

                {
                    this.f153704a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
                /* renamed from: b */
                public final void mo57674b() {
                }

                @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
                /* renamed from: a */
                public final void mo57673a() {
                    if (!this.f153704a.f153703b.isEmpty()) {
                        Iterator it = this.f153704a.f153703b.iterator();
                        while (it.hasNext()) {
                            ((AbstractC40931a) it.next()).mo70127a(true);
                        }
                        this.f153704a.f153703b.clear();
                    }
                    AbstractC81915c.m141874a(new C40949a());
                    C34727m.m70945a(new Runnable(this) {
                        /* class com.p2082ss.android.ugc.aweme.setting.utils.C68698m.C68700b.C687011.RunnableC687021 */

                        /* renamed from: a */
                        final /* synthetic */ C687011 f153705a;

                        static {
                            Covode.recordClassIndex(80963);
                        }

                        {
                            this.f153705a = r1;
                        }

                        public final void run() {
                            if (!this.f153705a.f153704a.f153702a.isFinishing()) {
                                this.f153705a.f153704a.f153702a.finish();
                            }
                        }
                    }, 500);
                }
            });
            C40956d.m82463a("settings_page", "click_setting");
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.setting.utils.m$a */
    public static final class View$OnClickListenerC68699a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f153701a;

        static {
            Covode.recordClassIndex(80960);
        }

        View$OnClickListenerC68699a(AbstractC89171a aVar) {
            this.f153701a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f153701a.invoke();
        }
    }

    /* renamed from: a */
    public static final void m121135a(AbstractActivityC68607v vVar, HashSet<AbstractC40931a<AbstractC34793a>> hashSet) {
        C89219l.m154721d(vVar, "");
        C89219l.m154721d(hashSet, "");
        C68700b bVar = new C68700b(vVar, hashSet);
        C68634c cVar = vVar.f153541z;
        cVar.mo70127a(true);
        View$OnClickListenerC68699a aVar = new View$OnClickListenerC68699a(bVar);
        C89219l.m154721d(aVar, "");
        cVar.mo70126a(new C68634c.C68635a(cVar, aVar));
        AbstractC40931a<AbstractC34793a>[] b = vVar.mo108968b();
        C89219l.m154716b(b, "");
        for (AbstractC40931a<AbstractC34793a> aVar2 : b) {
            if (aVar2.mo70132l().mo61501b()) {
                hashSet.add(aVar2);
                aVar2.mo70127a(false);
            }
        }
    }
}
