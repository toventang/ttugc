package com.p2082ss.android.ugc.aweme.qainvitation.p3638c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.qainvitation.service.IQAInvitationService;
import com.p2082ss.android.ugc.aweme.qainvitation.service.QAInvitationService;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qainvitation.c.a */
public final class C65821a extends ConstraintLayout {

    /* renamed from: g */
    public static final C65822a f148313g = new C65822a((byte) 0);

    /* renamed from: h */
    private final IQAInvitationService f148314h;

    /* renamed from: i */
    private String f148315i;

    /* renamed from: j */
    private String f148316j;

    /* renamed from: k */
    private long f148317k;

    /* renamed from: l */
    private long f148318l;

    /* renamed from: m */
    private List<? extends User> f148319m;

    static {
        Covode.recordClassIndex(77322);
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.c.a$a */
    public static final class C65822a {
        static {
            Covode.recordClassIndex(77323);
        }

        private C65822a() {
        }

        public /* synthetic */ C65822a(byte b) {
            this();
        }
    }

    public final String getEnterFrom() {
        return this.f148316j;
    }

    public final String getEnterMethod() {
        return this.f148315i;
    }

    public final IQAInvitationService getQaInviteService() {
        return this.f148314h;
    }

    public final long getQuestionId() {
        return this.f148317k;
    }

    public final long getQuestionUserId() {
        return this.f148318l;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User>, java.util.List<com.ss.android.ugc.aweme.profile.model.User> */
    public final List<User> getUsers() {
        return this.f148319m;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        C89219l.m154716b(parent, "");
        if (parent.getParent() != null) {
            ViewParent parent2 = getParent();
            C89219l.m154716b(parent2, "");
            ViewParent parent3 = parent2.getParent();
            Objects.requireNonNull(parent3, "null cannot be cast to non-null type android.view.ViewGroup");
            View findViewById = ((ViewGroup) parent3).findViewById(R.id.dzj);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    public final void setQuestionId(long j) {
        this.f148317k = j;
    }

    public final void setQuestionUserId(long j) {
        this.f148318l = j;
    }

    public final void setEnterFrom(String str) {
        C89219l.m154721d(str, "");
        this.f148316j = str;
    }

    public final void setEnterMethod(String str) {
        C89219l.m154721d(str, "");
        this.f148315i = str;
    }

    public final void setUsers(List<? extends User> list) {
        C89219l.m154721d(list, "");
        this.f148319m = list;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C65821a(String str, String str2, long j, long j2, List<? extends User> list, Context context) {
        super(context, null, 0);
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(5866);
        this.f148315i = str;
        this.f148316j = str2;
        this.f148317k = j;
        this.f148318l = j2;
        this.f148319m = list;
        IQAInvitationService b = QAInvitationService.m117786b();
        C89219l.m154716b(b, "");
        this.f148314h = b;
        View inflate = LayoutInflater.from(context).inflate(R.layout.aqw, this);
        C89219l.m154716b(inflate, "");
        List<IMUser> a = b.mo105001a(this.f148319m);
        getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.dgn);
        C89219l.m154716b(recyclerView, "");
        recyclerView.setLayoutManager(linearLayoutManager);
        ((RecyclerView) inflate.findViewById(R.id.dgn)).setHasFixedSize(true);
        C65823b bVar = new C65823b(a);
        RecyclerView recyclerView2 = (RecyclerView) inflate.findViewById(R.id.dgn);
        C89219l.m154716b(recyclerView2, "");
        recyclerView2.setAdapter(bVar);
        C39162r.m79460a("enter_qa_invited_users_panel", new C33744d().mo59983a("enter_from", this.f148316j).mo59983a("enter_method", this.f148315i).mo59981a("question_id", this.f148317k).mo59981a("question_user_id", this.f148318l).mo59980a("invitee_count", a.size()).f79943a);
        MethodCollector.m26664o(5866);
    }

    public /* synthetic */ C65821a(String str, String str2, long j, long j2, List list, Context context, byte b) {
        this(str, str2, j, j2, list, context);
    }
}
