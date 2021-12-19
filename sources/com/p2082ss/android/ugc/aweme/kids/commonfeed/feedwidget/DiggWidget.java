package com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.kids.common.p3329b.C57346a;
import com.p2082ss.android.ugc.aweme.kids.common.p3330c.C57354e;
import com.p2082ss.android.ugc.aweme.kids.common.p3330c.C57355f;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.digg.DiggApi;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3341a.C57435a;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b.AbstractC57436a;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget.DiggAnimationView;
import com.p2082ss.android.ugc.aweme.kids.intergration.account.KidsAccountServiceImpl;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.DiggWidget */
public final class DiggWidget extends AbsFeedWidget {

    /* renamed from: a */
    public static final C57418a f130894a = new C57418a((byte) 0);

    static {
        Covode.recordClassIndex(67341);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.DiggWidget$a */
    public static final class C57418a {
        static {
            Covode.recordClassIndex(67342);
        }

        private C57418a() {
        }

        public /* synthetic */ C57418a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.DiggWidget$b */
    public static final class C57419b extends AbstractC57436a implements AbstractC1214u<C33942b>, AbstractC90252i, AbstractC90253j {

        /* renamed from: a */
        public DiggAnimationView f130895a;

        /* renamed from: b */
        public boolean f130896b;

        /* renamed from: c */
        final /* synthetic */ View f130897c;

        /* renamed from: j */
        private LinearLayout f130898j;

        /* renamed from: k */
        private TextView f130899k;

        /* renamed from: l */
        private int f130900l;

        /* renamed from: m */
        private long f130901m;

        static {
            Covode.recordClassIndex(67343);
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b.AbstractC57436a
        /* renamed from: b */
        public final String mo94694b() {
            return "like";
        }

        @Override // org.greenrobot.eventbus.AbstractC90252i
        public final Map<Integer, Object> getSubscriberEventTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put(85, new RunnableC90250g(C57419b.class, "onChangeDiggEvent", C57346a.class, ThreadMode.MAIN, 0, false));
            return hashMap;
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b.AbstractC57436a
        /* renamed from: a */
        public final void mo94687a() {
            EventBus.m156962a().mo145395b(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.DiggWidget$b$b */
        public static final class C57421b<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C57419b f130905a;

            /* renamed from: b */
            final /* synthetic */ int f130906b;

            /* renamed from: c */
            final /* synthetic */ long f130907c;

            static {
                Covode.recordClassIndex(67345);
            }

            C57421b(C57419b bVar, int i, long j) {
                this.f130905a = bVar;
                this.f130906b = i;
                this.f130907c = j;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                this.f130905a.mo94695b(this.f130906b);
                C57354e.m103957a("kids_api_digg", -1, -1, this.f130907c);
            }
        }

        /* renamed from: a */
        private static String m104050a(long j) {
            if (j <= 0) {
                return "0";
            }
            return C53437b.m98615a(j);
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b.AbstractC57436a
        /* renamed from: a */
        public final void mo94690a(DataCenter dataCenter) {
            if (dataCenter != null) {
                dataCenter.mo60189a("digg_aweme", (AbstractC1214u<C33942b>) this);
            }
        }

        /* renamed from: a */
        public final void mo94688a(int i) {
            long currentTimeMillis = System.currentTimeMillis();
            Aweme aweme = this.f130950d;
            C89219l.m154716b(aweme, "");
            DiggApi.m104027a(aweme.getAid(), i).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C57420a(this, i, currentTimeMillis), new C57421b(this, i, currentTimeMillis));
        }

        /* renamed from: b */
        public final void mo94695b(int i) {
            int i2;
            Context context;
            int i3 = 1;
            if (i == 1) {
                i2 = R.string.b6t;
            } else {
                i2 = R.string.h11;
            }
            View view = this.f130897c;
            if (view != null) {
                context = view.getContext();
            } else {
                context = null;
            }
            new C79459a(context).mo123050a(i2).mo123053a();
            mo94693a(!this.f130896b);
            Aweme aweme = this.f130950d;
            C89219l.m154716b(aweme, "");
            if (i == 1) {
                i3 = 0;
            }
            aweme.setUserDigg(i3);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(C33942b bVar) {
            C33942b bVar2 = bVar;
            if (bVar2 != null && C89219l.m154714a((Object) bVar2.f80277a, (Object) "digg_aweme") && !this.f130896b) {
                DiggAnimationView diggAnimationView = this.f130895a;
                if (diggAnimationView != null) {
                    diggAnimationView.mo85726g();
                }
                if (KidsAccountServiceImpl.m104406h().mo94317a()) {
                    mo94688a(1);
                    Aweme aweme = this.f130950d;
                    C89219l.m154716b(aweme, "");
                    aweme.setUserDigg(1);
                }
                mo94693a(true);
                mo94692a("click_double_like");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.DiggWidget$b$a */
        public static final class C57420a<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C57419b f130902a;

            /* renamed from: b */
            final /* synthetic */ int f130903b;

            /* renamed from: c */
            final /* synthetic */ long f130904c;

            static {
                Covode.recordClassIndex(67344);
            }

            C57420a(C57419b bVar, int i, long j) {
                this.f130902a = bVar;
                this.f130903b = i;
                this.f130904c = j;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                if (((BaseResponse) obj).status_code != 0) {
                    this.f130902a.mo94695b(this.f130903b);
                } else if (this.f130902a.f130955i.equals("like")) {
                    Aweme aweme = this.f130902a.f130950d;
                    C89219l.m154716b(aweme, "");
                    String aid = aweme.getAid();
                    C89219l.m154716b(aid, "");
                    boolean z = true;
                    if (this.f130903b != 1) {
                        z = false;
                    }
                    AbstractC81915c.m141874a(new C57346a(aid, z));
                }
                C57354e.m103957a("kids_api_digg", -1, 0, this.f130904c);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.DiggWidget$b$c */
        static final class View$OnClickListenerC57422c implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C57419b f130908a;

            static {
                Covode.recordClassIndex(67346);
            }

            View$OnClickListenerC57422c(C57419b bVar) {
                this.f130908a = bVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (KidsAccountServiceImpl.m104406h().mo94317a()) {
                    if (!this.f130908a.f130896b) {
                        DiggAnimationView diggAnimationView = this.f130908a.f130895a;
                        if (diggAnimationView != null) {
                            diggAnimationView.mo85726g();
                        }
                        this.f130908a.mo94688a(1);
                        this.f130908a.mo94693a(true);
                        this.f130908a.mo94692a("click_like");
                        Aweme aweme = this.f130908a.f130950d;
                        C89219l.m154716b(aweme, "");
                        aweme.setUserDigg(1);
                        return;
                    }
                    DiggAnimationView diggAnimationView2 = this.f130908a.f130895a;
                    if (diggAnimationView2 != null) {
                        diggAnimationView2.mo85726g();
                    }
                    this.f130908a.mo94688a(0);
                    this.f130908a.mo94693a(false);
                    Aweme aweme2 = this.f130908a.f130950d;
                    C89219l.m154716b(aweme2, "");
                    aweme2.setUserDigg(0);
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b.AbstractC57436a
        /* renamed from: a */
        public final void mo94689a(View view) {
            MethodCollector.m26663i(8052);
            if (view instanceof FrameLayout) {
                FrameLayout frameLayout = (FrameLayout) view;
                View inflate = LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.act, (ViewGroup) null);
                this.f130898j = (LinearLayout) inflate.findViewById(R.id.c8o);
                this.f130895a = (DiggAnimationView) inflate.findViewById(R.id.bly);
                this.f130899k = (TextView) inflate.findViewById(R.id.eyi);
                EventBus.m156966a(EventBus.m156962a(), this);
                LinearLayout linearLayout = this.f130898j;
                if (linearLayout != null) {
                    linearLayout.setOnClickListener(new View$OnClickListenerC57422c(this));
                }
                frameLayout.addView(inflate);
            }
            MethodCollector.m26664o(8052);
        }

        @AbstractC90264r(mo145422a = ThreadMode.MAIN)
        public final void onChangeDiggEvent(C57346a aVar) {
            long j;
            AwemeStatistics statistics;
            C89219l.m154721d(aVar, "");
            Aweme aweme = this.f130950d;
            C89219l.m154716b(aweme, "");
            if (TextUtils.equals(aweme.getAid(), aVar.f130718a)) {
                Aweme aweme2 = this.f130950d;
                if (aweme2 == null || (statistics = aweme2.getStatistics()) == null) {
                    j = 0;
                } else {
                    j = statistics.getDiggCount();
                }
                this.f130901m = j;
                Aweme aweme3 = this.f130950d;
                C89219l.m154716b(aweme3, "");
                this.f130900l = aweme3.getUserDigg();
                Aweme aweme4 = this.f130950d;
                C89219l.m154716b(aweme4, "");
                int userDigg = aweme4.getUserDigg();
                boolean z = true;
                if (userDigg != 1) {
                    z = false;
                }
                mo94693a(z);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b.AbstractC57436a
        /* renamed from: a */
        public final void mo94691a(C57435a aVar) {
            long j;
            AwemeStatistics statistics;
            super.mo94691a(aVar);
            Aweme aweme = this.f130950d;
            if (aweme == null || (statistics = aweme.getStatistics()) == null) {
                j = 0;
            } else {
                j = statistics.getDiggCount();
            }
            this.f130901m = j;
            Aweme aweme2 = this.f130950d;
            C89219l.m154716b(aweme2, "");
            this.f130900l = aweme2.getUserDigg();
            Aweme aweme3 = this.f130950d;
            C89219l.m154716b(aweme3, "");
            int userDigg = aweme3.getUserDigg();
            boolean z = true;
            if (userDigg != 1) {
                z = false;
            }
            mo94693a(z);
        }

        /* renamed from: a */
        public final void mo94692a(String str) {
            String str2;
            String str3;
            C33743c a = new C33743c().mo59976a("enter_from", this.f130955i).mo59976a("enter_method", str);
            Aweme aweme = this.f130950d;
            String str4 = null;
            if (aweme != null) {
                str2 = aweme.getAid();
            } else {
                str2 = null;
            }
            C33743c a2 = a.mo59976a("group_id", str2);
            Aweme aweme2 = this.f130950d;
            if (aweme2 != null) {
                str3 = aweme2.getAuthorUid();
            } else {
                str3 = null;
            }
            C33743c a3 = a2.mo59976a("author_id", str3);
            Aweme aweme3 = this.f130950d;
            if (aweme3 != null) {
                str4 = aweme3.getLogPbString();
            }
            C57355f.m103962a("like", a3.mo59976a("log_pb", str4).mo59977a());
        }

        /* renamed from: a */
        public final void mo94693a(boolean z) {
            long j;
            this.f130896b = z;
            DiggAnimationView diggAnimationView = this.f130895a;
            if (diggAnimationView != null) {
                diggAnimationView.setSelected(z);
            }
            if (!z) {
                if (this.f130900l == 1) {
                    Aweme aweme = this.f130950d;
                    C89219l.m154716b(aweme, "");
                    if (!aweme.isDelete()) {
                        j = this.f130901m - 1;
                    }
                }
                j = this.f130901m;
            } else if (this.f130900l == 1) {
                if (this.f130901m < 1) {
                    Aweme aweme2 = this.f130950d;
                    C89219l.m154716b(aweme2, "");
                    if (!aweme2.isDelete()) {
                        this.f130901m = 1;
                    }
                }
                j = this.f130901m;
            } else {
                j = 1 + this.f130901m;
            }
            if (j < 0) {
                j = 0;
            }
            try {
                if (this.f130950d != null) {
                    Aweme aweme3 = this.f130950d;
                    C89219l.m154716b(aweme3, "");
                    if (aweme3.isDelete() && j == 0) {
                        TextView textView = this.f130899k;
                        if (textView != null) {
                            textView.setVisibility(4);
                            return;
                        }
                        return;
                    }
                }
                TextView textView2 = this.f130899k;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                TextView textView3 = this.f130899k;
                if (textView3 != null) {
                    textView3.setText(m104050a(j));
                }
            } catch (Exception e) {
                TextView textView4 = this.f130899k;
                if (textView4 != null) {
                    textView4.setText(m104050a(0L));
                }
                C51423a.m95790a((Throwable) e);
                e.printStackTrace();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57419b(View view, View view2) {
            super(view2);
            this.f130897c = view;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.AbsFeedWidget
    /* renamed from: b */
    public final AbstractC57436a mo94686b(View view) {
        return new C57419b(view, view);
    }
}
