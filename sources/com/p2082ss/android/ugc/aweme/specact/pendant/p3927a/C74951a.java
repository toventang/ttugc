package com.p2082ss.android.ugc.aweme.specact.pendant.p3927a;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.C16041a;
import com.bytedance.ies.dmt.p1194ui.frameworkui.PullUpLayout;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgActivityTasks;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.p2082ss.android.ugc.aweme.p2929fe.p2930a.C47809e;
import com.p2082ss.android.ugc.aweme.specact.p3926b.C74936a;
import com.p2082ss.android.ugc.aweme.specact.p3926b.C74939c;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3938f.C75049c;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3939g.AbstractC75056b;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75060a;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75063d;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75065f;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75081k;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75082l;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75083m;
import com.p2082ss.android.ugc.aweme.specact.popup.p3942a.C75126k;
import com.p2082ss.android.ugc.aweme.specact.popup.p3945d.C75196a;
import com.p2082ss.android.ugc.aweme.specact.popup.p3945d.View$OnClickListenerC75197b;
import com.p2082ss.android.ugc.aweme.specact.popup.p3946e.C75202a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.specact.pendant.a.a */
public final class C74951a implements AbstractC75056b {

    /* renamed from: j */
    public static final AbstractC89244h f168497j = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C74953b.f168509a);

    /* renamed from: k */
    public static final C74952a f168498k = new C74952a((byte) 0);

    /* renamed from: a */
    public final Keva f168499a = Keva.getRepo("pendant_global_timer_reducer");

    /* renamed from: b */
    public long f168500b;

    /* renamed from: c */
    public List<? extends UgActivityTasks> f168501c = new ArrayList();

    /* renamed from: d */
    public final String f168502d = "SpecActBackgroundTask";

    /* renamed from: e */
    public UgAwemeActivitySetting f168503e;

    /* renamed from: f */
    public UgActivityTasks f168504f;

    /* renamed from: g */
    public int f168505g;

    /* renamed from: h */
    public List<String> f168506h = new ArrayList();

    /* renamed from: i */
    public String f168507i = "";

    /* renamed from: l */
    private final AbstractC89244h f168508l = C89250i.m154773a((AbstractC89171a) C74957f.f168517a);

    /* renamed from: d */
    private final C74939c m131604d() {
        return (C74939c) this.f168508l.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.a.a$a */
    public static final class C74952a {
        static {
            Covode.recordClassIndex(87822);
        }

        /* renamed from: a */
        public static C74951a m131613a() {
            return (C74951a) C74951a.f168497j.getValue();
        }

        private C74952a() {
        }

        public /* synthetic */ C74952a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.a.a$b */
    static final class C74953b extends AbstractC89220m implements AbstractC89171a<C74951a> {

        /* renamed from: a */
        public static final C74953b f168509a = new C74953b();

        static {
            Covode.recordClassIndex(87823);
        }

        C74953b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C74951a invoke() {
            return new C74951a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.a.a$f */
    static final class C74957f extends AbstractC89220m implements AbstractC89171a<C74939c> {

        /* renamed from: a */
        public static final C74957f f168517a = new C74957f();

        static {
            Covode.recordClassIndex(87827);
        }

        C74957f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C74939c invoke() {
            return new C74939c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.a.a$e */
    static final class RunnableC74956e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C74951a f168516a;

        static {
            Covode.recordClassIndex(87826);
        }

        RunnableC74956e(C74951a aVar) {
            this.f168516a = aVar;
        }

        public final void run() {
            UgActivityTasks a = this.f168516a.mo118087a();
            if (a != null) {
                this.f168516a.f168504f = a;
            }
        }
    }

    static {
        Covode.recordClassIndex(87821);
    }

    /* renamed from: e */
    private final boolean m131605e() {
        if (this.f168506h.size() != this.f168501c.size() || !m131606f()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private final boolean m131606f() {
        if (C75081k.m131846b() == this.f168499a.getLong(C75083m.m131848a("background_task_date"), 0)) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3939g.AbstractC75056b
    /* renamed from: b */
    public final void mo118091b() {
        this.f168499a.storeLong(C75083m.m131848a("background_task_time"), this.f168500b);
        C47809e.C47810a.f110762a.mo79874a(C75083m.m131848a("background_task_total_time"), (Object) String.valueOf(this.f168500b));
        this.f168499a.storeLong(C75083m.m131848a("background_task_date"), C75081k.m131846b());
    }

    /* renamed from: a */
    public final UgActivityTasks mo118087a() {
        boolean z;
        List<? extends UgActivityTasks> list = this.f168501c;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        for (UgActivityTasks ugActivityTasks : this.f168501c) {
            if (((long) ugActivityTasks.getTime().intValue()) <= this.f168500b) {
                String taskId = ugActivityTasks.getTaskId();
                C89219l.m154716b(taskId, "");
                if (!m131603a(taskId)) {
                }
            }
            return ugActivityTasks;
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3939g.AbstractC75056b
    /* renamed from: c */
    public final void mo118092c() {
        this.f168504f = null;
        this.f168500b = 0;
        this.f168505g = 0;
        this.f168507i = "";
        this.f168506h.clear();
        this.f168499a.storeString(C75083m.m131848a("completed_task_id_list"), "");
        this.f168499a.storeLong(C75083m.m131848a("background_task_time"), this.f168500b);
        C47809e.C47810a.f110762a.mo79874a(C75083m.m131848a("background_task_total_time"), (Object) String.valueOf(this.f168500b));
        this.f168499a.storeInt(C75083m.m131848a("background_task_finished_stage"), -1);
        this.f168499a.storeLong(C75083m.m131848a("background_task_date"), C75081k.m131846b());
        this.f168499a.storeBoolean(C75083m.m131848a("do_like_or_comment_tribute_action"), false);
        this.f168499a.storeBoolean(C75083m.m131848a("has_report_like_and_comment_tribute"), false);
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC74956e(this), ((long) new Random().nextInt(5)) * 1000);
    }

    /* renamed from: a */
    private final boolean m131603a(String str) {
        return this.f168506h.contains(str);
    }

    /* renamed from: a */
    private static boolean m131602a(UgAwemeActivitySetting ugAwemeActivitySetting) {
        if (ugAwemeActivitySetting != null && !C75060a.m131800c(ugAwemeActivitySetting) && C75060a.m131796a(ugAwemeActivitySetting)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.a.a$c */
    public static final class C74954c extends AbstractC89220m implements AbstractC89172b<C74936a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C74951a f168510a;

        /* renamed from: b */
        final /* synthetic */ String f168511b;

        static {
            Covode.recordClassIndex(87824);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74954c(C74951a aVar, String str) {
            super(1);
            this.f168510a = aVar;
            this.f168511b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C74936a aVar) {
            String str;
            UgActivityTasks a;
            C74936a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            if (aVar2.f168465a != 10009) {
                this.f168510a.mo118091b();
                this.f168510a.f168499a.storeInt(C75083m.m131848a("background_task_finished_stage"), this.f168510a.f168505g);
                this.f168510a.f168505g++;
                C74951a aVar3 = this.f168510a;
                if (aVar3.f168507i.length() == 0) {
                    str = this.f168511b;
                } else {
                    str = this.f168510a.f168507i + ',' + this.f168511b;
                }
                aVar3.f168507i = str;
                this.f168510a.f168506h.add(this.f168511b);
                this.f168510a.f168499a.storeString(C75083m.m131848a("completed_task_id_list"), this.f168510a.f168507i);
                if (this.f168510a.f168506h.size() < this.f168510a.f168501c.size() && (a = this.f168510a.mo118087a()) != null) {
                    this.f168510a.f168504f = a;
                }
            } else {
                this.f168510a.mo118091b();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.specact.pendant.p3939g.AbstractC75056b
    /* renamed from: a */
    public final void mo118088a(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        if (!m131605e() && this.f168504f != null && C75082l.m131847a(aweme)) {
            UgActivityTasks ugActivityTasks = this.f168504f;
            if (ugActivityTasks == null) {
                C89219l.m154715b();
            }
            int b = C75060a.m131797b(ugActivityTasks);
            long j = this.f168500b;
            if (j >= ((long) b)) {
                UgActivityTasks ugActivityTasks2 = this.f168504f;
                if (ugActivityTasks2 == null) {
                    C89219l.m154715b();
                }
                UgActivityTasks clone = ugActivityTasks2.clone();
                this.f168504f = null;
                C89219l.m154716b(clone, "");
                mo118089a(clone);
                return;
            }
            this.f168500b = j + 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.a.a$d */
    public static final class C74955d extends AbstractC89220m implements AbstractC89172b<C74936a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C74951a f168512a;

        /* renamed from: b */
        final /* synthetic */ String f168513b;

        /* renamed from: c */
        final /* synthetic */ int f168514c;

        /* renamed from: d */
        final /* synthetic */ String f168515d;

        static {
            Covode.recordClassIndex(87825);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74955d(C74951a aVar, String str, int i, String str2) {
            super(1);
            this.f168512a = aVar;
            this.f168513b = str;
            this.f168514c = i;
            this.f168515d = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C74936a aVar) {
            String str;
            UgActivityTasks a;
            String str2;
            boolean z;
            boolean z2;
            View view;
            MethodCollector.m26663i(10781);
            C74936a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            boolean z3 = false;
            if (!(C17873f.m33102j() == null || this.f168513b == null || !C75063d.m131826a() || (str2 = aVar2.f168466b) == null)) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    int optInt = jSONObject.optInt("display_amount");
                    String optString = jSONObject.optString("display_cash_amount_i18n");
                    if (optInt > 0) {
                        C89219l.m154716b(optString, "");
                        if (optString.length() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            String str3 = C75202a.m131945a(C75060a.m131806h(this.f168512a.f168503e), "enter_from", "inapp_push") + "#unified_watch_video";
                            String a2 = C1764a.m5928a(this.f168513b, Arrays.copyOf(new Object[]{Integer.valueOf(optInt), optString, Integer.valueOf(this.f168514c / 60)}, 3));
                            C89219l.m154716b(a2, "");
                            if (this.f168512a.f168505g == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            C75196a aVar3 = new C75196a("", a2, z2, str3, (byte) 0);
                            Activity j = C17873f.m33102j();
                            if (j == null) {
                                C89219l.m154715b();
                            }
                            C89219l.m154721d(j, "");
                            C89219l.m154721d(aVar3, "");
                            View$OnClickListenerC75197b bVar = new View$OnClickListenerC75197b(j, aVar3);
                            PullUpLayout pullUpLayout = bVar.f169093f;
                            if (pullUpLayout == null) {
                                C89219l.m154710a("mPullUpLayout");
                            }
                            pullUpLayout.mo27261a();
                            if (!bVar.f169095h.isFinishing() && !bVar.isShowing()) {
                                bVar.f169090c = System.currentTimeMillis() + ((long) bVar.f169088a);
                                PullUpLayout pullUpLayout2 = bVar.f169093f;
                                if (pullUpLayout2 == null) {
                                    C89219l.m154710a("mPullUpLayout");
                                }
                                pullUpLayout2.postDelayed(bVar.f169091d, (long) bVar.f169088a);
                                if (bVar.f169092e.getParent() != null) {
                                    ViewParent parent = bVar.f169092e.getParent();
                                    if (parent != null) {
                                        ((ViewGroup) parent).removeView(bVar.f169092e);
                                    } else {
                                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                                        MethodCollector.m26664o(10781);
                                        throw nullPointerException;
                                    }
                                }
                                try {
                                    Window window = bVar.f169095h.getWindow();
                                    if (window != null) {
                                        view = window.getDecorView();
                                    } else {
                                        view = null;
                                    }
                                    int i = Build.VERSION.SDK_INT;
                                    bVar.showAtLocation(view, 48, 0, -C13628n.m24525e(C17867d.m33078a()));
                                    C39162r.onEventV3("watch_task_push_show");
                                    View$OnClickListenerC75197b.f169086i = true;
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            this.f168512a.f168499a.storeInt(C75083m.m131848a("background_task_finished_stage"), this.f168512a.f168505g);
            this.f168512a.f168499a.storeLong(C75083m.m131848a("background_task_time"), this.f168512a.f168500b);
            C74951a aVar4 = this.f168512a;
            if (aVar4.f168507i.length() == 0) {
                z3 = true;
            }
            if (z3) {
                str = this.f168515d;
            } else {
                str = this.f168512a.f168507i + ',' + this.f168515d;
            }
            aVar4.f168507i = str;
            this.f168512a.f168506h.add(this.f168515d);
            this.f168512a.f168499a.storeString(C75083m.m131848a("completed_task_id_list"), this.f168512a.f168507i);
            C47809e.C47810a.f110762a.mo79874a(C75083m.m131848a("background_task_total_time"), (Object) String.valueOf(this.f168512a.f168500b));
            this.f168512a.f168505g++;
            if (this.f168512a.f168506h.size() < this.f168512a.f168501c.size() && (a = this.f168512a.mo118087a()) != null) {
                this.f168512a.f168504f = a;
            }
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(10781);
            return zVar;
        }
    }

    /* renamed from: a */
    public final void mo118089a(UgActivityTasks ugActivityTasks) {
        int b = C75060a.m131797b(ugActivityTasks);
        String c = C75060a.m131799c(ugActivityTasks);
        String a = C75060a.m131795a(ugActivityTasks);
        if (!TextUtils.isEmpty(c)) {
            C74955d dVar = new C74955d(this, a, b, c);
            C74954c cVar = new C74954c(this, c);
            if (!C89219l.m154714a((Object) c, (Object) "like_comment_tribute")) {
                m131604d();
                C74939c.m131538a(c, b, true, dVar, cVar);
            } else if (this.f168499a.getBoolean(C75083m.m131848a("do_like_or_comment_tribute_action"), false)) {
                m131604d();
                C74939c.m131538a(c, b, true, dVar, cVar);
                this.f168499a.storeBoolean(C75083m.m131848a("has_report_like_and_comment_tribute"), true);
                C39162r.m79460a("interact_task_complete", new C33744d().mo59983a("task_name", "complete").mo59983a("task_id", c).f79943a);
            } else {
                C39162r.m79460a("interact_task_complete", new C33744d().mo59983a("task_name", "watch_video").mo59983a("task_id", c).f79943a);
            }
        }
    }

    /* renamed from: a */
    public final void mo118090a(List<C75126k.C75135i> list) {
        try {
            if (!C75083m.m131849a()) {
                return;
            }
            if (m131602a(this.f168503e)) {
                this.f168500b = this.f168499a.getLong(C75083m.m131848a("background_task_time"), 0);
                this.f168505g = this.f168499a.getInt(C75083m.m131848a("background_task_finished_stage"), -1) + 1;
                String string = this.f168499a.getString(C75083m.m131848a("completed_task_id_list"), "");
                C89219l.m154716b(string, "");
                this.f168507i = string;
                if (string.length() > 0) {
                    this.f168506h = C89070n.m154585g((Collection) C89361p.m154915b(this.f168507i, new String[]{","}));
                }
                UgAwemeActivitySetting ugAwemeActivitySetting = this.f168503e;
                if (ugAwemeActivitySetting == null) {
                    C89219l.m154715b();
                }
                List<UgActivityTasks> a = C75065f.m131830a(ugAwemeActivitySetting.getActivityTasks(), list);
                if (!a.isEmpty()) {
                    this.f168501c = a;
                    if (!m131605e() && !m131606f()) {
                        this.f168500b = 0;
                        this.f168505g = 0;
                        this.f168507i = "";
                        this.f168506h.clear();
                        this.f168499a.storeString(C75083m.m131848a("completed_task_id_list"), "");
                        this.f168499a.storeInt(C75083m.m131848a("background_task_finished_stage"), -1);
                        this.f168499a.storeLong(C75083m.m131848a("background_task_date"), C75081k.m131846b());
                        this.f168499a.storeLong(C75083m.m131848a("background_task_time"), 0);
                        C47809e.C47810a.f110762a.mo79874a(C75083m.m131848a("background_task_total_time"), (Object) String.valueOf(this.f168500b));
                        this.f168499a.storeBoolean(C75083m.m131848a("do_like_or_comment_tribute_action"), false);
                        this.f168499a.storeBoolean(C75083m.m131848a("has_report_like_and_comment_tribute"), false);
                    }
                    C75049c.m131767a(this);
                    UgActivityTasks a2 = mo118087a();
                    if (a2 != null) {
                        this.f168504f = a2;
                    }
                }
            }
        } catch (C16041a unused) {
        }
    }
}
