package com.p2082ss.android.ugc.aweme.favorites.p2928ui;

import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.favorites.api.C47192d;
import com.p2082ss.android.ugc.aweme.favorites.api.C47195e;
import com.p2082ss.android.ugc.aweme.favorites.api.C47196f;
import com.p2082ss.android.ugc.aweme.favorites.api.C47197g;
import com.p2082ss.android.ugc.aweme.favorites.model.C47481j;
import com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47606ae;
import com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47662ah;
import com.p2082ss.android.ugc.aweme.metrics.C59243i;
import com.p2082ss.android.ugc.aweme.metrics.C59249n;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89387v;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.g */
public final class C47697g extends PopupWindow {

    /* renamed from: c */
    public static final C47703a f110582c = new C47703a((byte) 0);

    /* renamed from: a */
    public final ActivityC0945e f110583a;

    /* renamed from: b */
    public final String f110584b;

    /* renamed from: d */
    private final String f110585d;

    static {
        Covode.recordClassIndex(56319);
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.g$a */
    public static final class C47703a {
        static {
            Covode.recordClassIndex(56325);
        }

        private C47703a() {
        }

        public /* synthetic */ C47703a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.g$b */
    static final class C47704b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C47697g f110591a;

        static {
            Covode.recordClassIndex(56326);
        }

        C47704b(C47697g gVar) {
            this.f110591a = gVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f110591a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.g$e */
    public static final class C47707e implements AbstractC47729o {

        /* renamed from: a */
        final /* synthetic */ C47697g f110596a;

        static {
            Covode.recordClassIndex(56329);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47707e(C47697g gVar) {
            this.f110596a = gVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.favorites.p2928ui.AbstractC47729o
        /* renamed from: a */
        public final void mo79775a(boolean z, C47192d dVar) {
            C89219l.m154721d(dVar, "");
            this.f110596a.mo79822a(!z, dVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.g$f */
    public static final class C47708f implements C47662ah.AbstractC47664b {

        /* renamed from: a */
        final /* synthetic */ C47697g f110597a;

        static {
            Covode.recordClassIndex(56330);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47708f(C47697g gVar) {
            this.f110597a = gVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.favorites.ui.g$f$b */
        static final class C47710b<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C47708f f110600a;

            static {
                Covode.recordClassIndex(56332);
            }

            C47710b(C47708f fVar) {
                this.f110600a = fVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                new C23144b(this.f110600a.f110597a.f110583a).mo37640e(R.string.bof).mo37637b();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.favorites.ui.g$f$a */
        static final class C47709a<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C47708f f110598a;

            /* renamed from: b */
            final /* synthetic */ String f110599b;

            static {
                Covode.recordClassIndex(56331);
            }

            C47709a(C47708f fVar, String str) {
                this.f110598a = fVar;
                this.f110599b = str;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                new C59243i().mo96812a(this.f110598a.f110597a.f110584b).mo96811a((Integer) 0).mo96792f();
                this.f110598a.f110597a.mo79822a(false, new C47192d(((C47197g) obj).f109862a, this.f110599b, null, null, 28));
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47662ah.AbstractC47664b
        /* renamed from: a */
        public final void mo79777a(String str) {
            C89219l.m154721d(str, "");
            new C47481j().f110302b.mo79755a(new C47196f(1, null, str, null, null, null, null, null, 250)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C47709a(this, str), new C47710b(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.g$d */
    public static final class C47706d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C47697g f110595a;

        static {
            Covode.recordClassIndex(56328);
        }

        C47706d(C47697g gVar) {
            this.f110595a = gVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            new C23144b(this.f110595a.f110583a).mo37640e(R.string.bof).mo37637b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.g$c */
    public static final class C47705c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C47697g f110592a;

        /* renamed from: b */
        final /* synthetic */ boolean f110593b;

        /* renamed from: c */
        final /* synthetic */ C47192d f110594c;

        static {
            Covode.recordClassIndex(56327);
        }

        C47705c(C47697g gVar, boolean z, C47192d dVar) {
            this.f110592a = gVar;
            this.f110593b = z;
            this.f110594c = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (this.f110593b) {
                C39162r.m79462a("collection_add_videos", C89387v.m154943a(this.f110592a.f110584b, "enter_from"), C89387v.m154943a(this.f110594c.f109842a, "collection_id"));
            }
            C23144b bVar = new C23144b(this.f110592a.f110583a);
            String string = this.f110592a.f110583a.getString(R.string.bsq);
            C89219l.m154716b(string, "");
            String a = C1764a.m5928a(string, Arrays.copyOf(new Object[]{this.f110594c.f109843b}, 1));
            C89219l.m154716b(a, "");
            bVar.mo37635a(a).mo37636b(R.raw.icon_tick_fill_small).mo37639d(R.attr.aw).mo37637b();
        }
    }

    /* renamed from: a */
    public final void mo79822a(boolean z, C47192d dVar) {
        new C47481j().f110302b.mo79755a(new C47196f(10, dVar.f109842a, null, null, null, C89070n.m154516a(this.f110585d), null, null, 220)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C47705c(this, z, dVar), new C47706d(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47697g(ActivityC0945e eVar, String str, String str2) {
        super(eVar);
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        MethodCollector.m26663i(7939);
        this.f110583a = eVar;
        this.f110585d = str;
        this.f110584b = str2;
        setContentView(LayoutInflater.from(eVar).inflate(R.layout.a04, (ViewGroup) null));
        getContentView().setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47697g.View$OnClickListenerC476981 */

            /* renamed from: a */
            final /* synthetic */ C47697g f110586a;

            static {
                Covode.recordClassIndex(56320);
            }

            {
                this.f110586a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f110586a.dismiss();
                C39162r.m79462a("click_collection_banner", C89387v.m154943a(this.f110586a.f110584b, "enter_from"));
                new C47481j().f110302b.mo79754a(0, (String) null).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new AbstractC88433f(this) {
                    /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47697g.View$OnClickListenerC476981.C476991 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC476981 f110587a;

                    static {
                        Covode.recordClassIndex(56321);
                    }

                    {
                        this.f110587a = r1;
                    }

                    @Override // p4560f.p4561a.p4567d.AbstractC88433f
                    public final /* synthetic */ void accept(Object obj) {
                        C47195e eVar = (C47195e) obj;
                        List<C47192d> list = eVar.f109850a;
                        if (list == null || list.isEmpty()) {
                            C47697g gVar = this.f110587a.f110586a;
                            ActivityC0945e eVar2 = this.f110587a.f110586a.f110583a;
                            new C59249n().mo96820a(gVar.f110584b).mo96792f();
                            AbstractC0952i supportFragmentManager = gVar.f110583a.getSupportFragmentManager();
                            C89219l.m154716b(supportFragmentManager, "");
                            String string = eVar2.getString(R.string.bsp);
                            C89219l.m154716b(string, "");
                            String string2 = eVar2.getString(R.string.fdd);
                            C89219l.m154716b(string2, "");
                            C47662ah.C47663a.m90668a(supportFragmentManager, string, string2, new C47708f(gVar));
                            return;
                        }
                        C47697g gVar2 = this.f110587a.f110586a;
                        C47606ae.C47607a.m90645a(gVar2.f110583a, false, null, gVar2.f110584b, eVar.f109850a.size(), new C47707e(gVar2));
                    }
                }, C477002.f110588a);
            }
        });
        setWidth(C13628n.m24504a(eVar));
        setHeight(-2);
        setBackgroundDrawable(new ColorDrawable(0));
        setOutsideTouchable(true);
        setTouchInterceptor(new View.OnTouchListener(this) {
            /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47697g.View$OnTouchListenerC477012 */

            /* renamed from: a */
            final /* synthetic */ C47697g f110589a;

            static {
                Covode.recordClassIndex(56323);
            }

            {
                this.f110589a = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C89219l.m154716b(motionEvent, "");
                if (motionEvent.getAction() != 4) {
                    return false;
                }
                this.f110589a.dismiss();
                return true;
            }
        });
        setAnimationStyle(R.style.wc);
        final AbstractC88412b d = AbstractC88979t.m154307b(5, TimeUnit.SECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C47704b(this));
        setOnDismissListener(new PopupWindow.OnDismissListener() {
            /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47697g.C477023 */

            static {
                Covode.recordClassIndex(56324);
            }

            public final void onDismiss() {
                AbstractC88412b bVar = d;
                C89219l.m154716b(bVar, "");
                if (!bVar.isDisposed()) {
                    d.dispose();
                }
            }
        });
        MethodCollector.m26664o(7939);
    }
}
