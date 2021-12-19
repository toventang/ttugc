package com.p2082ss.android.ugc.aweme.notification.adapter;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.sheet.p1724a.C23208a;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34478k;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.commercialize.log.LogHelperImpl;
import com.p2082ss.android.ugc.aweme.common.C39109f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.inbox.C56398e;
import com.p2082ss.android.ugc.aweme.inbox.C56511t;
import com.p2082ss.android.ugc.aweme.inbox.EnumC56501q;
import com.p2082ss.android.ugc.aweme.inbox.EnumC56508r;
import com.p2082ss.android.ugc.aweme.inbox.p3267b.C56318b;
import com.p2082ss.android.ugc.aweme.inbox.p3269d.C56346e;
import com.p2082ss.android.ugc.aweme.inbox.p3269d.C56359f;
import com.p2082ss.android.ugc.aweme.live.AbstractC58593c;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.notice.api.C61530a;
import com.p2082ss.android.ugc.aweme.notice.repo.TutorialVideoInfo;
import com.p2082ss.android.ugc.aweme.notice.repo.TutorialVideoResp;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.AtMe;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61627b;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61629d;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61630e;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61631f;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61634i;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61637k;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61639m;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.CheckProfileNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.CombineLiveNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.DiggNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.DuetNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.FollowApproveNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.FollowRequest;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.FriendNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineDatas;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.PostNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.p3517a.C61621c;
import com.p2082ss.android.ugc.aweme.notice.repo.list.p3517a.C61624f;
import com.p2082ss.android.ugc.aweme.notification.MusNewNotificationFragment;
import com.p2082ss.android.ugc.aweme.notification.adapter.C61840f;
import com.p2082ss.android.ugc.aweme.notification.api.MusNotificationApiManager;
import com.p2082ss.android.ugc.aweme.notification.bean.C61865a;
import com.p2082ss.android.ugc.aweme.notification.bean.C61869d;
import com.p2082ss.android.ugc.aweme.notification.bean.C61871f;
import com.p2082ss.android.ugc.aweme.notification.bean.C61872g;
import com.p2082ss.android.ugc.aweme.notification.bean.C61884p;
import com.p2082ss.android.ugc.aweme.notification.bean.C61886q;
import com.p2082ss.android.ugc.aweme.notification.bean.C61890t;
import com.p2082ss.android.ugc.aweme.notification.p3523e.p3524a.C61961a;
import com.p2082ss.android.ugc.aweme.notification.p3523e.p3524a.C61964b;
import com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractC62100e;
import com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractC62159w;
import com.p2082ss.android.ugc.aweme.notification.p3529h.C62061as;
import com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.BaseNotificationVM;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.NotificationCombineVM;
import com.p2082ss.android.ugc.aweme.notification.utils.C62259e;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.recommend.users.C66652b;
import com.p2082ss.android.ugc.aweme.services.function.FunctionSupportService;
import com.p2082ss.android.ugc.aweme.services.function.IFunctionKey;
import com.p2082ss.android.ugc.aweme.story.live.C77354d;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.adapter.d */
public final class C61819d extends AbstractC39060f<MusNotice> implements AbstractC62100e {

    /* renamed from: i */
    public static final C61821b f140330i = new C61821b((byte) 0);

    /* renamed from: A */
    private boolean f140331A = true;

    /* renamed from: B */
    private List<MusNotice> f140332B;

    /* renamed from: C */
    private int f140333C;

    /* renamed from: D */
    private final HashMap<String, Boolean> f140334D = new HashMap<>();

    /* renamed from: E */
    private int f140335E;

    /* renamed from: F */
    private List<MusNotice> f140336F;

    /* renamed from: G */
    private boolean f140337G;

    /* renamed from: H */
    private boolean f140338H;

    /* renamed from: I */
    private boolean f140339I = true;

    /* renamed from: J */
    private C61886q f140340J = new C61886q(2002, null, null, 0, 12);

    /* renamed from: K */
    private final AbstractC89244h f140341K = C89250i.m154773a((AbstractC89171a) C61825f.f140370a);

    /* renamed from: L */
    private final AbstractC89244h f140342L = C89250i.m154773a((AbstractC89171a) new C61824e(this));

    /* renamed from: M */
    private RecyclerView f140343M;

    /* renamed from: N */
    private final C61840f f140344N = new C61840f(new C61823d(this));

    /* renamed from: O */
    private LinearLayoutManager f140345O;

    /* renamed from: P */
    private final String f140346P;

    /* renamed from: Q */
    private final AbstractC89171a<C89391z> f140347Q;

    /* renamed from: a */
    public AbstractC34478k<User> f140348a;

    /* renamed from: b */
    public C62061as.AbstractC62063b f140349b;

    /* renamed from: c */
    public boolean f140350c;

    /* renamed from: d */
    public boolean f140351d;

    /* renamed from: e */
    public AbstractC61820a f140352e;

    /* renamed from: f */
    public int f140353f;

    /* renamed from: g */
    public DmtStatusView f140354g;

    /* renamed from: h */
    public final Fragment f140355h;

    /* renamed from: j */
    private MusNotice f140356j;

    /* renamed from: k */
    private MusNotice f140357k;

    /* renamed from: w */
    private List<MusNotice> f140358w;

    /* renamed from: x */
    private C61869d f140359x;

    /* renamed from: y */
    private int f140360y = C61530a.C61532b.m111445a();

    /* renamed from: z */
    private C61631f f140361z;

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.d$a */
    public interface AbstractC61820a {
        static {
            Covode.recordClassIndex(72556);
        }

        /* renamed from: y */
        void mo99843y();
    }

    static {
        Covode.recordClassIndex(72555);
    }

    /* renamed from: l */
    public final List<MusNotice> mo99898l() {
        return (List) this.f140341K.getValue();
    }

    /* renamed from: m */
    public final NotificationCombineVM mo99899m() {
        return (NotificationCombineVM) this.f140342L.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.d$b */
    public static final class C61821b {
        static {
            Covode.recordClassIndex(72557);
        }

        private C61821b() {
        }

        public /* synthetic */ C61821b(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    /* renamed from: a */
    public final void mo67815a(Exception exc) {
        C89219l.m154721d(exc, "");
        RecyclerView recyclerView = this.f140343M;
        if (recyclerView != null) {
            Boolean.valueOf(recyclerView.mo4484l());
            if (recyclerView.mo4484l() && C61961a.m112084a().f140646a) {
                C89219l.m154721d(exc, "");
                C39109f.m79404c("AdapterNotifyCrashFixer", "catch notify when recyclerview scroll or layout, stack:" + Log.getStackTraceString(exc));
                if (C61961a.m112084a().f140647b) {
                    C51423a.m95786a(exc);
                }
                try {
                    if (C56359f.m102344a("inbox_adapter_notify_error", 1.0f)) {
                        String stackTraceString = Log.getStackTraceString(exc);
                        C89219l.m154716b(stackTraceString, "");
                        if (stackTraceString.length() > 2000) {
                            stackTraceString = stackTraceString.substring(0, LiveNetAdaptiveHurryTimeSetting.DEFAULT);
                            C89219l.m154716b(stackTraceString, "");
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("stack", stackTraceString);
                        C39162r.m79460a("inbox_adapter_notify_error", linkedHashMap);
                    }
                    C89379q.m157068constructorimpl(C89391z.f203057a);
                } catch (Throwable th) {
                    C89379q.m157068constructorimpl(C89382r.m154941a(th));
                }
                recyclerView.post(new RunnableC61826g(this, exc));
                return;
            }
        }
        super.mo67815a(exc);
    }

    /* renamed from: a */
    public final void mo99893a(User user) {
        String str;
        C89219l.m154721d(user, "");
        List<MusNotice> list = this.f92236l;
        C89219l.m154716b(list, "");
        boolean z = false;
        int i = 0;
        for (MusNotice musNotice : list) {
            if (musNotice instanceof C61886q) {
                User user2 = ((C61886q) musNotice).f140510b;
                if (user2 != null) {
                    str = user2.getUid();
                } else {
                    str = null;
                }
                if (C89219l.m154714a((Object) str, (Object) user.getUid())) {
                    if (i >= 0 && i < this.f92236l.size()) {
                        if (i == this.f92236l.size() - 1) {
                            MusNotice musNotice2 = (MusNotice) this.f92236l.get(i - 1);
                            if ((musNotice2 instanceof C61886q) && ((C61886q) musNotice2).f140509a == 2000) {
                                z = true;
                            }
                        }
                        this.f92236l.remove(i);
                        notifyItemRemoved(i);
                        if (z) {
                            int i2 = i - 1;
                            this.f92236l.remove(i2);
                            notifyItemRemoved(i2);
                            super.mo62377b_(m111895h(m111897j(mo63369e())));
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            i++;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.d$d */
    public static final class C61823d implements C61840f.AbstractC61841a {

        /* renamed from: a */
        final /* synthetic */ C61819d f140368a;

        static {
            Covode.recordClassIndex(72559);
        }

        @Override // com.p2082ss.android.ugc.aweme.notification.adapter.C61840f.AbstractC61841a
        /* renamed from: b */
        public final BaseNotificationVM mo99903b() {
            return this.f140368a.mo99899m();
        }

        @Override // com.p2082ss.android.ugc.aweme.notification.adapter.C61840f.AbstractC61841a
        /* renamed from: c */
        public final Fragment mo99904c() {
            return this.f140368a.f140355h;
        }

        @Override // com.p2082ss.android.ugc.aweme.notification.adapter.C61840f.AbstractC61841a
        /* renamed from: e */
        public final AbstractC34478k<User> mo99906e() {
            return this.f140368a.f140348a;
        }

        @Override // com.p2082ss.android.ugc.aweme.notification.adapter.C61840f.AbstractC61841a
        /* renamed from: f */
        public final C62061as.AbstractC62063b mo99907f() {
            return this.f140368a.f140349b;
        }

        @Override // com.p2082ss.android.ugc.aweme.notification.adapter.C61840f.AbstractC61841a
        /* renamed from: g */
        public final void mo99908g() {
            this.f140368a.mo99900n();
        }

        @Override // com.p2082ss.android.ugc.aweme.notification.adapter.C61840f.AbstractC61841a
        /* renamed from: a */
        public final List<MusNotice> mo99901a() {
            List<MusNotice> list = this.f140368a.f92236l;
            C89219l.m154716b(list, "");
            return list;
        }

        @Override // com.p2082ss.android.ugc.aweme.notification.adapter.C61840f.AbstractC61841a
        /* renamed from: d */
        public final DmtStatusView mo99905d() {
            DmtStatusView dmtStatusView = this.f140368a.f140354g;
            if (dmtStatusView == null) {
                C89219l.m154715b();
            }
            return dmtStatusView;
        }

        C61823d(C61819d dVar) {
            this.f140368a = dVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.notification.adapter.C61840f.AbstractC61841a
        /* renamed from: a */
        public final void mo99902a(int i) {
            this.f140368a.mo99894b(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.d$f */
    public static final class C61825f extends AbstractC89220m implements AbstractC89171a<List<MusNotice>> {

        /* renamed from: a */
        public static final C61825f f140370a = new C61825f();

        static {
            Covode.recordClassIndex(72561);
        }

        C61825f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<MusNotice> invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.d$g */
    static final class RunnableC61826g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C61819d f140371a;

        /* renamed from: b */
        final /* synthetic */ Exception f140372b;

        static {
            Covode.recordClassIndex(72562);
        }

        RunnableC61826g(C61819d dVar, Exception exc) {
            this.f140371a = dVar;
            this.f140372b = exc;
        }

        public final void run() {
            C61819d.super.mo67815a((C61819d) this.f140372b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.d$i */
    public static final class RunnableC61828i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C61819d f140378a;

        /* renamed from: b */
        final /* synthetic */ List f140379b;

        static {
            Covode.recordClassIndex(72564);
        }

        RunnableC61828i(C61819d dVar, List list) {
            this.f140378a = dVar;
            this.f140379b = list;
        }

        public final void run() {
            C61819d.super.mo62377b_(this.f140379b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.d$e */
    public static final class C61824e extends AbstractC89220m implements AbstractC89171a<NotificationCombineVM> {

        /* renamed from: a */
        final /* synthetic */ C61819d f140369a;

        static {
            Covode.recordClassIndex(72560);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61824e(C61819d dVar) {
            super(0);
            this.f140369a = dVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ NotificationCombineVM invoke() {
            return NotificationCombineVM.C62352a.m112807a(this.f140369a.f140355h);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: e */
    public final List<MusNotice> mo63369e() {
        List<MusNotice> e = super.mo63369e();
        if (e == null) {
            return new ArrayList();
        }
        return e;
    }

    /* renamed from: o */
    private final boolean m111902o() {
        if (C13603b.m24435a((Collection) this.f92236l)) {
            return false;
        }
        if (this.f92236l.size() != 1) {
            int size = this.f92236l.size() - 2;
            if (size >= 0) {
                int i = 0;
                while (true) {
                    if (!(this.f92236l.get(i) instanceof C61634i) || !(this.f92236l.get(i + 1) instanceof C61634i)) {
                        if (i == size) {
                            break;
                        }
                        i++;
                    } else {
                        this.f92236l.remove(i);
                        if (i == 0 && ((MusNotice) this.f92236l.get(i)).timeLineType == 5) {
                            this.f92236l.remove(i);
                        }
                        return true;
                    }
                }
            }
            return false;
        } else if (!(this.f92236l.get(0) instanceof C61634i)) {
            return false;
        } else {
            this.f92236l.remove(0);
            return true;
        }
    }

    /* renamed from: n */
    public final void mo99900n() {
        if (this.f140350c) {
            int indexOf = mo63369e().indexOf(this.f140340J);
            if (indexOf != -1) {
                this.f140350c = false;
                this.f140339I = false;
                List<MusNotice> list = this.f140336F;
                if (list != null) {
                    mo63369e().addAll(indexOf, list);
                    notifyItemRangeInserted(indexOf, list.size());
                }
            }
            this.f140350c = false;
        }
        int indexOf2 = mo63369e().indexOf(this.f140340J);
        if (indexOf2 != -1) {
            int size = mo63369e().size();
            List g = C89070n.m154585g((Collection) mo63369e().subList(0, indexOf2));
            mo63369e().clear();
            mo63369e().addAll(g);
            notifyItemRangeRemoved(indexOf2, size - mo63369e().size());
            m111896i(mo63369e());
            AbstractC61820a aVar = this.f140352e;
            if (aVar != null) {
                mo63369e();
                aVar.mo99843y();
            }
        }
    }

    /* renamed from: f */
    public final void mo99897f(List<? extends MusNotice> list) {
        super.mo62376b(m111895h(list));
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public final int mo60936c(int i) {
        return C61848g.m111971a((MusNotice) mo63369e().get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        this.f140343M = null;
        super.onDetachedFromRecyclerView(recyclerView);
        this.f140345O = null;
    }

    /* renamed from: n */
    private static int m111901n(List<MusNotice> list) {
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (!(list.get(i2) instanceof C61634i) && (i = i + 1) >= 10) {
                return i2 + 1;
            }
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: b */
    public final void mo62376b(List<MusNotice> list) {
        super.mo62376b(m111895h(m111897j(list)));
        C61964b.m112086a(this.f140360y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final long getItemId(int i) {
        if (i < mo63369e().size()) {
            return (long) ((MusNotice) mo63369e().get(i)).hashCode();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.f140343M = recyclerView;
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            this.f140345O = (LinearLayoutManager) layoutManager;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        C56346e.m102340e();
        super.onViewAttachedToWindow(viewHolder);
        if (!(viewHolder instanceof View$OnClickListenerC62026a)) {
            viewHolder = null;
        }
        View$OnClickListenerC62026a aVar = (View$OnClickListenerC62026a) viewHolder;
        if (aVar != null) {
            aVar.cf_();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        super.onViewDetachedFromWindow(viewHolder);
        if (!(viewHolder instanceof View$OnClickListenerC62026a)) {
            viewHolder = null;
        }
        View$OnClickListenerC62026a aVar = (View$OnClickListenerC62026a) viewHolder;
        if (aVar != null) {
            aVar.mo100081d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.d$c */
    public static final class C61822c extends AbstractC89220m implements AbstractC89172b<MusNotice, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C61819d f140362a;

        /* renamed from: b */
        final /* synthetic */ boolean f140363b;

        /* renamed from: c */
        final /* synthetic */ boolean f140364c;

        /* renamed from: d */
        final /* synthetic */ MusNotice f140365d;

        /* renamed from: e */
        final /* synthetic */ MusNotice f140366e;

        /* renamed from: f */
        final /* synthetic */ C61869d f140367f;

        static {
            Covode.recordClassIndex(72558);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61822c(C61819d dVar, boolean z, boolean z2, MusNotice musNotice, MusNotice musNotice2, C61869d dVar2) {
            super(1);
            this.f140362a = dVar;
            this.f140363b = z;
            this.f140364c = z2;
            this.f140365d = musNotice;
            this.f140366e = musNotice2;
            this.f140367f = dVar2;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(MusNotice musNotice) {
            boolean z;
            MusNotice musNotice2 = musNotice;
            C89219l.m154721d(musNotice2, "");
            if (musNotice2.type == 50 || musNotice2.type == 13 || musNotice2.type == 1000 || ((musNotice2.type == 2007 && this.f140363b) || (musNotice2.type == 2008 && this.f140364c))) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.d$h */
    public static final class C61827h<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ MusNotice f140373a;

        /* renamed from: b */
        final /* synthetic */ C61819d f140374b;

        /* renamed from: c */
        final /* synthetic */ MusNotice f140375c;

        /* renamed from: d */
        final /* synthetic */ int f140376d;

        /* renamed from: e */
        final /* synthetic */ Context f140377e;

        static {
            Covode.recordClassIndex(72563);
        }

        C61827h(MusNotice musNotice, C61819d dVar, MusNotice musNotice2, int i, Context context) {
            this.f140373a = musNotice;
            this.f140374b = dVar;
            this.f140375c = musNotice2;
            this.f140376d = i;
            this.f140377e = context;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C89219l.m154716b(iVar, "");
            if (iVar.mo5546e() != null) {
                new C23144b(this.f140374b.f140355h).mo37635a(this.f140377e.getString(R.string.clo)).mo37637b();
            }
            C62259e.m112613a(this.f140373a, (BaseResponse) iVar.mo5545d(), iVar.mo5546e());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.d$j */
    static final class View$OnClickListenerC61829j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C61819d f140380a;

        /* renamed from: b */
        final /* synthetic */ int f140381b;

        static {
            Covode.recordClassIndex(72565);
        }

        View$OnClickListenerC61829j(C61819d dVar, int i) {
            this.f140380a = dVar;
            this.f140381b = i;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f140380a.mo99894b(this.f140381b);
            AbstractC0952i fragmentManager = this.f140380a.f140355h.getFragmentManager();
            if (fragmentManager != null) {
                AbstractC0976n a = fragmentManager.mo3552a();
                C89219l.m154716b(a, "");
                Fragment a2 = fragmentManager.mo3551a("DELETE_NOTICE_ACTION_SHEET_TAG");
                if (a2 != null) {
                    a.mo3455a(a2).mo3473c();
                }
            }
        }
    }

    /* renamed from: e */
    private final int m111893e(int i) {
        List<Object> d = C89070n.m154571d((Iterable) mo63369e(), i);
        int i2 = 0;
        if ((d instanceof Collection) && d.isEmpty()) {
            return 0;
        }
        for (Object obj : d) {
            if ((obj instanceof C61634i) && (i2 = i2 + 1) < 0) {
                C89070n.m154523b();
            }
        }
        return i2;
    }

    /* renamed from: g */
    private final void m111894g(List<CombineLiveNotice> list) {
        if (list == null || list.isEmpty()) {
            this.f140358w = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C61872g.m112009a(it.next()));
        }
        this.f140358w = arrayList;
    }

    /* renamed from: d */
    public final void mo99895d(int i) {
        if (i >= 0 && i < mo63369e().size() && mo60936c(i) == 1001) {
            try {
                Object obj = mo63369e().get(i);
                if (!(obj instanceof C61871f)) {
                    obj = null;
                }
                C61871f fVar = (C61871f) obj;
                if (fVar != null) {
                    C62259e.m112615a(fVar, i - m111893e(i));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private static boolean m111892a(MusNotice musNotice) {
        if (!C61886q.C61887a.m112014a(musNotice) && !C61865a.C61866a.m112007a(musNotice)) {
            if (C89070n.m154522b(2007, 2008).contains(Integer.valueOf(musNotice.type))) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private final List<MusNotice> m111895h(List<? extends MusNotice> list) {
        boolean z;
        boolean z2;
        C61869d dVar = this.f140359x;
        MusNotice musNotice = this.f140356j;
        MusNotice musNotice2 = this.f140357k;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        if (mo99899m().mo100364t() == EnumC56508r.TOP) {
            z = true;
        } else {
            z = false;
        }
        if (mo99899m().mo100349h() == EnumC56508r.TOP) {
            z2 = true;
        } else {
            z2 = false;
        }
        C89070n.m154537a((List) arrayList, (AbstractC89172b) new C61822c(this, z, z2, musNotice2, musNotice, dVar));
        if (z) {
            arrayList.add(0, mo99899m().mo100360p());
        }
        if (z2) {
            arrayList.add(0, mo99899m().mo100359o());
        }
        if (musNotice2 != null && this.f140331A) {
            arrayList.add(0, musNotice2);
        }
        if (musNotice != null && this.f140331A) {
            arrayList.add(0, musNotice);
        }
        if (dVar != null && this.f140331A) {
            arrayList.add(0, dVar);
        }
        m111896i(arrayList);
        C61809a.m111874a(C89070n.m154585g((Collection) arrayList));
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r2 <= 0) goto L_0x001c;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m111896i(java.util.List<? extends com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice> r7) {
        /*
            r6 = this;
            java.util.Iterator r3 = r7.iterator()
            r5 = 0
            r2 = 0
        L_0x0006:
            boolean r1 = r3.hasNext()
            r4 = -1
            r0 = 1
            if (r1 == 0) goto L_0x001c
            java.lang.Object r0 = r3.next()
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r0 = (com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r0
            int r1 = r0.type
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r1 != r0) goto L_0x004d
            if (r2 > 0) goto L_0x0035
        L_0x001c:
            java.util.Iterator r3 = r7.iterator()
            r2 = 0
        L_0x0021:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0034
            java.lang.Object r0 = r3.next()
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r0 = (com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r0
            int r1 = r0.type
            r0 = 2009(0x7d9, float:2.815E-42)
            if (r1 != r0) goto L_0x004a
            r4 = r2
        L_0x0034:
            r2 = r4
        L_0x0035:
            java.util.List r0 = r6.mo99898l()
            r0.clear()
            if (r2 <= 0) goto L_0x0050
            java.util.List r1 = r6.mo99898l()
            java.util.List r0 = r7.subList(r5, r2)
            r1.addAll(r0)
            return
        L_0x004a:
            int r2 = r2 + 1
            goto L_0x0021
        L_0x004d:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x0050:
            java.util.List r0 = r6.mo99898l()
            r0.addAll(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.adapter.C61819d.m111896i(java.util.List):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    /* renamed from: a_ */
    public final RecyclerView.ViewHolder mo62748a_(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        int c = C0643b.m2378c(viewGroup.getContext(), R.color.c5);
        mo67819f(c);
        RecyclerView.ViewHolder a_ = super.mo62748a_(viewGroup);
        Context context = viewGroup.getContext();
        C89219l.m154716b(context, "");
        TuxTextView tuxTextView = new TuxTextView(context, null, 0, 6);
        tuxTextView.setTuxFont(61);
        tuxTextView.setGravity(17);
        tuxTextView.setTextColor(c);
        tuxTextView.setText(R.string.cfm);
        View view = a_.itemView;
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
        DmtStatusView dmtStatusView = (DmtStatusView) view;
        dmtStatusView.setBuilder(dmtStatusView.mo27381c().mo27406b(tuxTextView));
        C89219l.m154716b(a_, "");
        return a_;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: b_ */
    public final void mo62377b_(List<MusNotice> list) {
        Integer valueOf;
        int intValue;
        this.f140332B = list;
        int i = 0;
        this.f140335E = 0;
        this.f140336F = null;
        this.f140337G = false;
        this.f140350c = false;
        this.f140339I = true;
        super.mo62377b_(m111895h(m111897j(list)));
        try {
            LinearLayoutManager linearLayoutManager = this.f140345O;
            if (linearLayoutManager != null && (valueOf = Integer.valueOf(linearLayoutManager.mo4373m())) != null && valueOf.intValue() >= 0 && (intValue = valueOf.intValue()) >= 0) {
                while (true) {
                    mo99895d(i);
                    if (i == intValue) {
                        break;
                    }
                    i++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        C61964b.m112086a(this.f140360y);
        AbstractC62159w.C62160a.m112409a(AbstractC62159w.EnumC62162c.INBOX);
    }

    /* renamed from: e */
    public final void mo99896e(List<CombineLiveNotice> list) {
        m111894g(list);
        List e = mo63369e();
        for (int size = e.size() - 1; size >= 0; size--) {
            if (((MusNotice) e.get(size)).type == 1001 && (e.get(size) instanceof C61871f)) {
                e.remove(size);
            }
        }
        super.mo62377b_(m111895h(m111897j(mo63369e())));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r2 <= 0) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ca, code lost:
        if (r1 == null) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cc, code lost:
        r7.add(r2 + 1, r6.f140340J);
        p4600h.p4601a.C89070n.m154545e((java.util.List) r1);
        r7.removeAll(r1);
        notifyDataSetChanged();
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m111900m(java.util.List<com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice> r7) {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.adapter.C61819d.m111900m(java.util.List):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.bytedance.tux.sheet.a.a$e[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractC62100e
    /* renamed from: a */
    public final void mo93497a(int i) {
        if (i < mo63369e().size() && this.f140355h.getContext() != null) {
            View$OnClickListenerC61829j jVar = new View$OnClickListenerC61829j(this, i);
            new C23208a.C23211b().mo37797a(new C23208a.C23214e().mo37785a(R.string.b4w).mo37789b(1).mo37786a(jVar)).mo37800b().show(this.f140355h.getFragmentManager(), "DELETE_NOTICE_ACTION_SHEET_TAG");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0084, code lost:
        if ((r7.getTimeInMillis() - r0) >= (((long) r11) * 86400000)) goto L_0x00a6;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m111898k(java.util.List<com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice> r15) {
        /*
        // Method dump skipped, instructions count: 360
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.adapter.C61819d.m111898k(java.util.List):void");
    }

    /* renamed from: l */
    private final void m111899l(List<MusNotice> list) {
        List<MusNotice> list2;
        if (this.f140339I && !this.f140350c) {
            this.f140336F = null;
            if (mo99899m().mo100337a() == C61530a.C61532b.m111445a() && C56398e.m102367b().mo93391d()) {
                int i = -1;
                int i2 = -1;
                int i3 = 0;
                for (T t : list) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        C89070n.m154520a();
                    }
                    T t2 = t;
                    if (i < 0 && (((MusNotice) t2).type == 2000 || ((MusNotice) t2).type == 2009)) {
                        i = i3;
                    }
                    if (((MusNotice) t2).timeLineType == 0 || ((MusNotice) t2).timeLineType == 1) {
                        i2 = i4;
                    }
                    i3 = i4;
                }
                if (i > 0) {
                    int i5 = C56511t.m102471a().f128747c;
                    if (i2 < 0) {
                        if (i5 > 0 && (list2 = this.f140332B) != null && list2.size() > i5) {
                            List<MusNotice> list3 = this.f140332B;
                            if (list3 == null) {
                                C89219l.m154715b();
                            }
                            i2 = list.indexOf(list3.get(i5 - 1)) + 1;
                        } else {
                            return;
                        }
                    }
                    if (i2 > 0 && i2 < list.size()) {
                        if (i2 >= i) {
                            StringBuilder append = new StringBuilder("collapse invalid index, start:").append(i2).append(", end:").append(i).append(", notices:");
                            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                            for (T t3 : list) {
                                arrayList.add(C89387v.m154943a(Integer.valueOf(((MusNotice) t3).type), Integer.valueOf(((MusNotice) t3).timeLineType)));
                            }
                            C39109f.m79401a("MusNewNotiAdapter", append.append(arrayList).toString(), new IllegalStateException());
                            return;
                        }
                        this.f140336F = C89070n.m154585g((Collection) list.subList(i2, i));
                        ArrayList arrayList2 = new ArrayList();
                        int i6 = 0;
                        for (T t4 : list) {
                            int i7 = i6 + 1;
                            if (i6 < 0) {
                                C89070n.m154520a();
                            } else if (i6 >= i2 && i6 < i) {
                                i6 = i7;
                            }
                            arrayList2.add(t4);
                            i6 = i7;
                        }
                        list.clear();
                        list.addAll(arrayList2);
                        list.add(i2, this.f140340J);
                        List<MusNotice> list4 = this.f140336F;
                        if (!(list4 == null || list4.isEmpty())) {
                            this.f140350c = true;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo99894b(int i) {
        User user;
        JSONObject jSONObject;
        String str;
        C61621c cVar;
        C61624f fVar;
        List<User> list;
        Context context = this.f140355h.getContext();
        if (context != null) {
            C89219l.m154716b(context, "");
            int size = this.f92236l.size();
            if (size > 0 && i >= 0 && i < size) {
                MusNotice musNotice = (MusNotice) this.f92236l.get(i);
                if (musNotice != null) {
                    User user2 = null;
                    if (musNotice.type == 2011) {
                        AbstractC34478k<User> kVar = this.f140348a;
                        if (kVar != null) {
                            if (!(musNotice instanceof C61886q)) {
                                musNotice = null;
                            }
                            C61886q qVar = (C61886q) musNotice;
                            if (qVar != null) {
                                user2 = qVar.f140510b;
                            }
                            kVar.mo60910a(3, user2, i);
                            return;
                        }
                        return;
                    } else if (musNotice.type == 2007) {
                        EnumC56501q.THIRD_PLATFORM.markDelete();
                    } else if (musNotice.type == 2008) {
                        C62259e.m112611a(mo99899m().mo100349h());
                        EnumC56501q.CONTACTS.markDelete();
                    } else {
                        if (musNotice.type == 225) {
                            C59256u uVar = new C59256u();
                            uVar.f135352b = C59256u.EnumC59257a.CLOSE;
                            C59256u a = uVar.mo96834a("notification_page");
                            a.f135350a = C59256u.EnumC59259c.INBOX_NOTICE;
                            C61630e eVar = musNotice.templateNotice;
                            if (eVar == null || (cVar = eVar.f139886b) == null || (fVar = cVar.f139843d) == null || (list = fVar.f139866a) == null) {
                                user = null;
                            } else {
                                user = (User) C89070n.m154583g((List) list);
                            }
                            C59256u a2 = a.mo96832a(user);
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            C61630e eVar2 = musNotice.templateNotice;
                            if (eVar2 == null || (str = eVar2.f139893i) == null) {
                                jSONObject = new JSONObject();
                            } else {
                                jSONObject = new JSONObject(str);
                            }
                            Iterator<String> keys = jSONObject.keys();
                            C89219l.m154716b(keys, "");
                            while (keys.hasNext()) {
                                String next = keys.next();
                                try {
                                    if (C89219l.m154714a((Object) next, (Object) "business_extra")) {
                                        JSONObject jSONObject2 = new JSONObject(jSONObject.optString(next));
                                        Iterator<String> keys2 = jSONObject2.keys();
                                        C89219l.m154716b(keys2, "");
                                        while (keys2.hasNext()) {
                                            String next2 = keys2.next();
                                            C89219l.m154716b(next2, "");
                                            String optString = jSONObject2.optString(next2);
                                            C89219l.m154716b(optString, "");
                                            linkedHashMap.put(next2, optString);
                                        }
                                    } else if (!linkedHashMap.containsKey(next)) {
                                        C89219l.m154716b(next, "");
                                        String optString2 = jSONObject.optString(next);
                                        C89219l.m154716b(optString2, "");
                                        linkedHashMap.put(next, optString2);
                                    }
                                    C89379q.m157068constructorimpl(C89391z.f203057a);
                                } catch (Throwable th) {
                                    C89379q.m157068constructorimpl(C89382r.m154941a(th));
                                }
                            }
                            a2.mo96788a(linkedHashMap).mo96792f();
                        }
                        MusNotificationApiManager.m111987a(musNotice.nid).mo5534a(new C61827h(musNotice, this, musNotice, i, context), C1731i.f5564c, null);
                    }
                }
                this.f92236l.remove(i);
                List<MusNotice> list2 = this.f140332B;
                if (list2 != null) {
                    Objects.requireNonNull(list2, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
                    C89206ad.m154680b(list2).remove(musNotice);
                }
                List<MusNotice> l = mo99898l();
                Objects.requireNonNull(l, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
                C89206ad.m154680b(l).remove(musNotice);
                Fragment fragment = this.f140355h;
                Objects.requireNonNull(fragment, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.MusNewNotificationFragment");
                MusNewNotificationFragment musNewNotificationFragment = (MusNewNotificationFragment) fragment;
                if (musNotice != null) {
                    musNewNotificationFragment.mo99825k().getItems().remove(musNotice);
                }
                List<MusNotice> q = mo99899m().mo100361q();
                Objects.requireNonNull(q, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
                C89206ad.m154680b(q).remove(musNotice);
                if (m111902o()) {
                    notifyDataSetChanged();
                } else {
                    notifyItemRemoved(i);
                }
            }
            List e = mo63369e();
            if (e == null || e.isEmpty()) {
                this.f140347Q.invoke();
            }
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: j */
    private final List<MusNotice> m111897j(List<? extends MusNotice> list) {
        boolean z;
        List<MusNotice> list2;
        List<MusNotice> list3;
        if ((list == null || list.isEmpty()) && ((list3 = this.f140358w) == null || list3.isEmpty())) {
            return C89086z.INSTANCE;
        }
        C61964b.m112085a();
        if (list == null) {
            list = C89086z.INSTANCE;
        }
        List<MusNotice> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        if (this.f140360y != C61530a.C61532b.m111445a() || C16048b.m29633a().mo25412a(true, "i18n_following_live_skylight_type", 0) == 1 || (list2 = this.f140358w) == null || list2.isEmpty()) {
            z = false;
        } else {
            List<MusNotice> list4 = this.f140358w;
            if (list4 == null) {
                C89219l.m154715b();
            }
            arrayList2.addAll(list4);
            z = true;
        }
        if (z) {
            ArrayList arrayList3 = new ArrayList();
            for (T t : list) {
                T t2 = t;
                if (!(((MusNotice) t2).type == 1001 || ((MusNotice) t2).type == 50 || ((MusNotice) t2).type == 13 || ((MusNotice) t2).type == 1000)) {
                    arrayList3.add(t);
                }
            }
            arrayList2.addAll(arrayList3);
        } else {
            arrayList2.addAll(list);
        }
        ArrayList<Object> arrayList4 = new ArrayList();
        for (Object obj : arrayList2) {
            MusNotice musNotice = (MusNotice) obj;
            if (musNotice.templateNotice == null) {
                int i = musNotice.type;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 6) {
                            if (i == 9) {
                                C61639m mVar = musNotice.voteNotice;
                                if (mVar != null) {
                                    List<? extends User> list5 = mVar.f139927a;
                                    if (list5 != null) {
                                        if (list5.isEmpty()) {
                                        }
                                    }
                                }
                            } else if (i == 31) {
                                if (musNotice.commentNotice != null) {
                                    CommentNotice commentNotice = musNotice.commentNotice;
                                    C89219l.m154716b(commentNotice, "");
                                    if (commentNotice.isReplyWithVideo()) {
                                        CommentNotice commentNotice2 = musNotice.commentNotice;
                                        C89219l.m154716b(commentNotice2, "");
                                        Comment comment = commentNotice2.getComment();
                                        if (comment != null) {
                                            if (comment.getAliasAweme() == null) {
                                            }
                                        }
                                    }
                                }
                                CommentNotice commentNotice3 = musNotice.commentNotice;
                                if (commentNotice3 != null) {
                                    if (commentNotice3.getComment() == null) {
                                    }
                                }
                            } else if (i != 33) {
                                if (i == 41) {
                                    DiggNotice diggNotice = musNotice.diggNotice;
                                    if (diggNotice != null) {
                                        List<User> users = diggNotice.getUsers();
                                        if (users != null) {
                                            if (users.isEmpty()) {
                                            }
                                        }
                                    }
                                } else if (i == 45) {
                                    AtMe atMe = musNotice.atMe;
                                    if (atMe != null) {
                                        if (atMe.getUser() == null) {
                                        }
                                    }
                                } else if (i == 50) {
                                    LiveOuterService.m107269s();
                                    if (!(musNotice instanceof C61884p)) {
                                        musNotice = null;
                                    }
                                    C61884p pVar = (C61884p) musNotice;
                                    if (pVar != null) {
                                        List<UrlModel> list6 = pVar.f140503a;
                                        if (list6 != null) {
                                            if (list6.isEmpty()) {
                                            }
                                        }
                                    }
                                } else if (i == 61) {
                                    LiveOuterService.m107269s();
                                    if (musNotice.tcmNotice == null) {
                                    }
                                } else if (i == 69) {
                                    C61629d dVar = musNotice.donationNotice;
                                    if (dVar != null) {
                                        if (dVar.f139883a != null) {
                                            C61629d dVar2 = musNotice.donationNotice;
                                            if (dVar2 != null) {
                                                if (dVar2.f139884b == null) {
                                                }
                                            }
                                        }
                                    }
                                } else if (i != 81) {
                                    if (i != 82) {
                                        switch (i) {
                                            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                                                break;
                                            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                                                break;
                                            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                                                if (musNotice.followRequestNotice == null) {
                                                    break;
                                                }
                                            default:
                                                switch (i) {
                                                    case 21:
                                                        DuetNotice duetNotice = musNotice.duetNotice;
                                                        if (duetNotice != null) {
                                                            if (duetNotice.getAweme() == null) {
                                                                break;
                                                            }
                                                        } else {
                                                            break;
                                                        }
                                                    case 22:
                                                        PostNotice postNotice = musNotice.postNotice;
                                                        if (postNotice != null) {
                                                            if (postNotice.getAweme() == null) {
                                                                break;
                                                            }
                                                        } else {
                                                            break;
                                                        }
                                                    case 23:
                                                        FollowApproveNotice followApproveNotice = musNotice.followApproveNotice;
                                                        if (followApproveNotice != null) {
                                                            if (followApproveNotice.getUser() == null) {
                                                                break;
                                                            }
                                                        } else {
                                                            break;
                                                        }
                                                    case 24:
                                                        FriendNotice friendNotice = musNotice.friendNotice;
                                                        if (friendNotice != null) {
                                                            if (friendNotice.getUser() == null) {
                                                                break;
                                                            }
                                                        } else {
                                                            break;
                                                        }
                                                    default:
                                                        switch (i) {
                                                            case 1000:
                                                                if (!(musNotice instanceof C61890t)) {
                                                                    break;
                                                                }
                                                            case 1001:
                                                                LiveOuterService.m107269s();
                                                                if (!(musNotice instanceof C61871f)) {
                                                                    break;
                                                                }
                                                            case 1002:
                                                                CheckProfileNotice checkProfileNotice = musNotice.checkProfileNotice;
                                                                if (checkProfileNotice == null) {
                                                                    break;
                                                                } else {
                                                                    List<User> users2 = checkProfileNotice.getUsers();
                                                                    if (users2 != null) {
                                                                        if (users2.isEmpty()) {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        break;
                                                                    }
                                                                }
                                                            default:
                                                                switch (i) {
                                                                    default:
                                                                        switch (i) {
                                                                            case 2006:
                                                                            case 2009:
                                                                            case 2010:
                                                                            case 2011:
                                                                                break;
                                                                            case 2007:
                                                                                if (mo99899m().mo100364t() != EnumC56508r.BOTTOM) {
                                                                                    break;
                                                                                }
                                                                            case 2008:
                                                                                if (mo99899m().mo100349h() != EnumC56508r.BOTTOM) {
                                                                                    break;
                                                                                }
                                                                            default:
                                                                                if (musNotice.templateNotice == null) {
                                                                                    CommentNotice commentNotice4 = musNotice.commentNotice;
                                                                                    if (commentNotice4 != null) {
                                                                                        if (commentNotice4.getComment() == null) {
                                                                                            break;
                                                                                        }
                                                                                    } else {
                                                                                        break;
                                                                                    }
                                                                                }
                                                                        }
                                                                    case LiveNetAdaptiveHurryTimeSetting.DEFAULT:
                                                                    case 2001:
                                                                    case 2002:
                                                                    case 2003:
                                                                        arrayList4.add(obj);
                                                                        break;
                                                                }
                                                        }
                                                }
                                        }
                                    } else if (musNotice.businessAccountNotice == null) {
                                    }
                                } else if (musNotice.promoteNotice == null) {
                                }
                            } else if (musNotice.followNotice == null) {
                            }
                        } else if (!FunctionSupportService.INSTANCE.notSupport(IFunctionKey.AD)) {
                            C61627b bVar = musNotice.adHelperNotice;
                            if (bVar != null) {
                                if (bVar.f139873a == null) {
                                }
                            }
                        }
                    }
                    if (musNotice.textNotice == null) {
                    }
                }
                if (musNotice.announcement == null) {
                }
            }
            arrayList4.add(obj);
        }
        for (Object obj2 : arrayList4) {
            arrayList.add(obj2);
        }
        m111898k(arrayList);
        if (C56318b.m102312c()) {
            m111899l(arrayList);
        } else if (C66652b.f149825a.mo105657c()) {
            m111900m(arrayList);
        }
        C61964b.m112091b();
        return arrayList;
    }

    /* renamed from: a */
    public final void mo99891a(TutorialVideoResp tutorialVideoResp) {
        if (tutorialVideoResp == null || tutorialVideoResp.getInfo() == null) {
            this.f140357k = null;
        } else {
            TutorialVideoInfo info = tutorialVideoResp.getInfo();
            if (info == null) {
                C89219l.m154715b();
            }
            this.f140357k = C61890t.C61891a.m112015a(info);
        }
        super.mo62377b_(m111895h(m111897j(mo63369e())));
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        C89219l.m154721d(viewGroup, "");
        return this.f140344N.mo99915a(viewGroup, i);
    }

    /* renamed from: a */
    public final void mo99890a(int i, C61631f fVar) {
        boolean z;
        C89219l.m154721d(fVar, "");
        this.f140360y = i;
        this.f140361z = fVar;
        if (i == C61530a.C61532b.m111445a()) {
            z = true;
        } else {
            z = false;
        }
        this.f140331A = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        this.f140344N.mo99916a(viewHolder, i);
    }

    /* renamed from: a */
    public final void mo99892a(NoticeCombineDatas noticeCombineDatas, int i) {
        int i2;
        List<UrlModel> list;
        C89219l.m154721d(noticeCombineDatas, "");
        C61637k recommendAvatars = noticeCombineDatas.getRecommendAvatars();
        LiveOuterService.m107269s();
        if (recommendAvatars == null || (list = recommendAvatars.f139917a) == null || list.isEmpty()) {
            this.f140356j = null;
        } else {
            this.f140356j = C61884p.C61885a.m112013a(recommendAvatars);
            ILiveOuterService s = LiveOuterService.m107269s();
            C89219l.m154716b(s, "");
            AbstractC58593c d = s.mo95830d();
            if (d != null) {
                d.mo12985a(1);
            }
            C77354d.m135258a("message");
            LogHelperImpl.m77303a().mo66430a("message");
            ILiveOuterService s2 = LiveOuterService.m107269s();
            C89219l.m154716b(s2, "");
            s2.mo95839m().mo34111a("ttlive_inbox_topLives_entrance", 0, new HashMap());
        }
        ArrayList arrayList = new ArrayList();
        FollowRequest followRequest = noticeCombineDatas.getFollowRequest();
        if (followRequest != null) {
            i2 = followRequest.getFollowRequestCount();
        } else {
            i2 = 0;
        }
        m111891a((List<User>) arrayList, i2, i, false);
        m111894g(noticeCombineDatas.getLiveNotices());
        List<MusNotice> h = m111895h(m111897j(mo63369e()));
        RecyclerView recyclerView = this.f140343M;
        if (recyclerView == null || !recyclerView.mo4484l() || !C61961a.m112084a().f140646a) {
            super.mo62377b_(h);
        } else {
            recyclerView.post(new RunnableC61828i(this, h));
        }
    }

    public C61819d(Fragment fragment, String str, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        this.f140355h = fragment;
        this.f140346P = str;
        this.f140347Q = aVar;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m111891a(List<User> list, int i, int i2, boolean z) {
        C89219l.m154721d(list, "");
        if (!C56318b.m102311b()) {
            this.f140333C = i2;
            if (i <= 0) {
                this.f140359x = null;
            } else {
                this.f140359x = new C61869d(i, list);
            }
            if (z) {
                super.mo62377b_(m111895h(mo63369e()));
            }
        }
    }
}
