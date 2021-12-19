package com.p2082ss.android.ugc.aweme.kids.commonfeed.report;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.p1713b.AbstractC23034g;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23029d;
import com.bytedance.tux.p1721g.C23144b;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.kids.common.p3329b.C57347b;
import com.p2082ss.android.ugc.aweme.kids.common.p3330c.C57354e;
import com.p2082ss.android.ugc.aweme.kids.common.p3330c.C57355f;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget.C57535d;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.report.api.ReportApi;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.report.p3346a.C57459a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.report.b */
public final class C57460b {

    /* renamed from: a */
    public static List<C57459a> f131032a = new ArrayList();

    /* renamed from: b */
    public static Set<Integer> f131033b = new LinkedHashSet();

    /* renamed from: c */
    public static C57535d f131034c;

    /* renamed from: d */
    public static final C57460b f131035d = new C57460b();

    private C57460b() {
    }

    /* renamed from: a */
    public static boolean m104148a() {
        if (!f131033b.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final /* synthetic */ C57535d m104151d() {
        C57535d dVar = f131034c;
        if (dVar == null) {
            C89219l.m154710a("reportReasonReasonList");
        }
        return dVar;
    }

    static {
        Covode.recordClassIndex(67392);
    }

    /* renamed from: b */
    public static String m104149b() {
        String arrayList = new ArrayList(f131033b).toString();
        C89219l.m154716b(arrayList, "");
        return arrayList;
    }

    /* renamed from: c */
    public static void m104150c() {
        C57355f.m103962a("submit_report_reason", new C33743c().mo59976a("object_type", "video").mo59974a("is_success", (Integer) 0).mo59976a("reason_id", m104149b()).mo59977a());
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.report.b$b */
    static final class C57462b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ long f131039a;

        static {
            Covode.recordClassIndex(67394);
        }

        C57462b(long j) {
            this.f131039a = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C57460b.m104150c();
            C57354e.m103957a("kids_api_report", -1, -1, this.f131039a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.report.b$d */
    public static final class C57466d extends AbstractC89220m implements AbstractC89172b<C23029d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Context f131044a;

        /* renamed from: b */
        final /* synthetic */ String f131045b;

        /* renamed from: c */
        final /* synthetic */ String f131046c;

        static {
            Covode.recordClassIndex(67398);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57466d(Context context, String str, String str2) {
            super(1);
            this.f131044a = context;
            this.f131045b = str;
            this.f131046c = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23029d dVar) {
            C23029d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            dVar2.mo37423a(R.string.csi, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.kids.commonfeed.report.C57460b.C57466d.C574671 */

                /* renamed from: a */
                final /* synthetic */ C57466d f131047a;

                static {
                    Covode.recordClassIndex(67399);
                }

                {
                    this.f131047a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C23024a aVar2 = aVar;
                    C89219l.m154721d(aVar2, "");
                    if (C57460b.m104148a()) {
                        aVar2.f54509b = true;
                        Context context = this.f131047a.f131044a;
                        while (true) {
                            if (context != null) {
                                if (!(context instanceof Activity)) {
                                    if (!(context instanceof ContextWrapper)) {
                                        break;
                                    }
                                    context = ((ContextWrapper) context).getBaseContext();
                                } else {
                                    Activity activity = (Activity) context;
                                    if (activity != null) {
                                        String str = this.f131047a.f131045b;
                                        String str2 = this.f131047a.f131046c;
                                        Object obj = new ArrayList(C57460b.f131033b).get(0);
                                        C89219l.m154716b(obj, "");
                                        int intValue = ((Number) obj).intValue();
                                        String b = C57460b.m104149b();
                                        long currentTimeMillis = System.currentTimeMillis();
                                        long parseLong = Long.parseLong(str);
                                        long parseLong2 = Long.parseLong(str2);
                                        C89219l.m154721d("video", "");
                                        C89219l.m154721d(b, "");
                                        ReportApi.f131030a.reportAwame("video", parseLong, parseLong2, intValue, b).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C57461a(activity, str, currentTimeMillis), new C57462b(currentTimeMillis));
                                    }
                                }
                            } else {
                                break;
                            }
                        }
                    } else {
                        C57460b.m104151d().setErrorVisibility(false);
                        C57355f.m103962a("report_reason_error", new C33743c().mo59976a("object_type", "video").mo59977a());
                        aVar2.f54509b = false;
                    }
                    return C89391z.f203057a;
                }
            });
            dVar2.mo37425b(R.string.csk, C574682.f131048a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.report.b$e */
    public static final class C57469e extends AbstractC89220m implements AbstractC89172b<C23013a, C89391z> {

        /* renamed from: a */
        public static final C57469e f131049a = new C57469e();

        static {
            Covode.recordClassIndex(67401);
        }

        C57469e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23013a aVar) {
            C23013a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            if (aVar2.f54481a.getAction() instanceof C23029d) {
                AbstractC23034g action = aVar2.f54481a.getAction();
                Objects.requireNonNull(action, "null cannot be cast to non-null type com.bytedance.tux.dialog.action.ButtonGroup");
                ((C23029d) action).f54521a.get(0).mo37428a(C574701.f131050a);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.report.b$f */
    public static final class C57471f extends AbstractC89220m implements AbstractC89172b<C23013a, C89391z> {

        /* renamed from: a */
        public static final C57471f f131051a = new C57471f();

        static {
            Covode.recordClassIndex(67403);
        }

        C57471f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23013a aVar) {
            C23013a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            if (aVar2.f54577j == null) {
                C57355f.m103962a("cancel_report_reason", new C33743c().mo59976a(StringSet.type, "dismiss page").mo59977a());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.report.b$a */
    static final class C57461a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ Context f131036a;

        /* renamed from: b */
        final /* synthetic */ String f131037b;

        /* renamed from: c */
        final /* synthetic */ long f131038c;

        static {
            Covode.recordClassIndex(67393);
        }

        C57461a(Context context, String str, long j) {
            this.f131036a = context;
            this.f131037b = str;
            this.f131038c = j;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (((BaseResponse) obj).status_code == 0) {
                Context context = this.f131036a;
                String str = this.f131037b;
                while (true) {
                    if (context != null) {
                        if (!(context instanceof Activity)) {
                            if (!(context instanceof ContextWrapper)) {
                                break;
                            }
                            context = ((ContextWrapper) context).getBaseContext();
                        } else {
                            Activity activity = (Activity) context;
                            if (activity != null) {
                                new C23144b(activity).mo37640e(R.string.csj).mo37637b();
                                ReportAwemeManager.m104144a().mo94625a(str);
                                AbstractC81915c.m141874a(new C57347b(str));
                                C57355f.m103962a("submit_report_reason", new C33743c().mo59976a("object_type", "video").mo59974a("is_success", (Integer) 1).mo59976a("reason_id", C57460b.m104149b()).mo59977a());
                            }
                        }
                    } else {
                        break;
                    }
                }
            } else {
                C57460b.m104150c();
            }
            C57354e.m103957a("kids_api_report", -1, 0, this.f131038c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.report.b$c */
    public static final class C57463c extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C57459a f131040a;

        /* renamed from: b */
        final /* synthetic */ C23013a f131041b;

        static {
            Covode.recordClassIndex(67395);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57463c(C57459a aVar, C23013a aVar2) {
            super(1);
            this.f131040a = aVar;
            this.f131041b = aVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                C57460b.f131033b.add(Integer.valueOf(this.f131040a.f131029e));
            } else if (C57460b.f131033b.contains(Integer.valueOf(this.f131040a.f131029e))) {
                C57460b.f131033b.remove(Integer.valueOf(this.f131040a.f131029e));
            }
            if (!C57460b.m104148a()) {
                if (this.f131041b.f54481a.getAction() instanceof C23029d) {
                    AbstractC23034g action = this.f131041b.f54481a.getAction();
                    Objects.requireNonNull(action, "null cannot be cast to non-null type com.bytedance.tux.dialog.action.ButtonGroup");
                    ((C23029d) action).f54521a.get(0).mo37428a(C574641.f131042a);
                }
            } else if (this.f131041b.f54481a.getAction() instanceof C23029d) {
                AbstractC23034g action2 = this.f131041b.f54481a.getAction();
                Objects.requireNonNull(action2, "null cannot be cast to non-null type com.bytedance.tux.dialog.action.ButtonGroup");
                ((C23029d) action2).f54521a.get(0).mo37428a(C574652.f131043a);
            }
            return C89391z.f203057a;
        }
    }
}
