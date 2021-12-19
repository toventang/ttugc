package com.p2082ss.android.ugc.aweme.account.agegate.util;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.util.C33047p;
import com.p2082ss.android.ugc.aweme.base.p2364a.C34470e;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p2082ss.android.ugc.aweme.service.IRegionMockService;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.util.e */
public final class C31558e {

    /* renamed from: g */
    public static final C31559a f75489g = new C31559a((byte) 0);

    /* renamed from: a */
    public boolean f75490a;

    /* renamed from: b */
    public C23226a f75491b;

    /* renamed from: c */
    public LinearLayout f75492c;

    /* renamed from: d */
    public TextView f75493d;

    /* renamed from: e */
    public final EnumC32594j f75494e;

    /* renamed from: f */
    public final Context f75495f;

    static {
        Covode.recordClassIndex(38277);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.util.e$a */
    public static final class C31559a {
        static {
            Covode.recordClassIndex(38278);
        }

        private C31559a() {
        }

        public /* synthetic */ C31559a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.util.e$c */
    public static final class C31562c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C31558e f75498a;

        static {
            Covode.recordClassIndex(38281);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31562c(C31558e eVar) {
            super(0);
            this.f75498a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (this.f75498a.f75490a) {
                C23226a aVar = this.f75498a.f75491b;
                if (aVar == null) {
                    C89219l.m154710a("regionSelectSheet");
                }
                aVar.dismiss();
            } else {
                LinearLayout linearLayout = this.f75498a.f75492c;
                if (linearLayout == null) {
                    C89219l.m154710a("regionSelectViews");
                }
                new C23144b(linearLayout).mo37635a("To continue, please select your registration region").mo37634a(3000L).mo37637b();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.agegate.util.e$b */
    public static final class View$OnClickListenerC31560b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31558e f75496a;

        static {
            Covode.recordClassIndex(38279);
        }

        public View$OnClickListenerC31560b(C31558e eVar) {
            this.f75496a = eVar;
        }

        public final void onClick(View view) {
            Activity activity;
            ClickAgent.onClick(view);
            IRegionMockService iRegionMockService = (IRegionMockService) ServiceManager.get().getService(IRegionMockService.class);
            Context context = this.f75496a.f75495f;
            if (context != null) {
                activity = C34470e.m70451a(context);
            } else {
                activity = null;
            }
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            iRegionMockService.mo106973a((ActivityC0945e) activity, new AbstractC89172b<String, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.account.agegate.util.C31558e.View$OnClickListenerC31560b.C315611 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC31560b f75497a;

                static {
                    Covode.recordClassIndex(38280);
                }

                {
                    this.f75497a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(String str) {
                    MethodCollector.m26663i(11348);
                    String str2 = str;
                    C89219l.m154721d(str2, "");
                    TextView textView = this.f75497a.f75496a.f75493d;
                    if (textView == null) {
                        C89219l.m154710a("regionSelect");
                    }
                    if (textView != null) {
                        textView.setText("Your account will be registered in ".concat(String.valueOf(str2)));
                    }
                    this.f75497a.f75496a.f75490a = true;
                    C33047p pVar = C33047p.f78598b;
                    C89219l.m154721d(str2, "");
                    synchronized (pVar) {
                        try {
                            C33047p.f78597a = str2;
                        } catch (Throwable th) {
                            MethodCollector.m26664o(11348);
                            throw th;
                        }
                    }
                    C89391z zVar = C89391z.f203057a;
                    MethodCollector.m26664o(11348);
                    return zVar;
                }
            });
        }
    }

    public C31558e(EnumC32594j jVar, Context context) {
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(context, "");
        this.f75494e = jVar;
        this.f75495f = context;
    }
}
