package com.p2082ss.android.ugc.aweme.comment.barrage.view;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.comment.barrage.C36296a;
import com.p2082ss.android.ugc.aweme.comment.barrage.p2488c.AbstractC36318a;
import com.p2082ss.android.ugc.aweme.comment.barrage.p2488c.C36322c;
import com.p2082ss.android.ugc.aweme.comment.p2495i.C36491b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p3538o.AbstractC62694c;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76598h;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedHashSet;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.b */
public final class C36379b implements AbstractC62694c {

    /* renamed from: b */
    public static final C36380a f86039b = new C36380a((byte) 0);

    /* renamed from: a */
    public final C36491b f86040a;

    /* renamed from: c */
    private AbstractC36318a f86041c;

    /* renamed from: d */
    private final AwemeCommentBubbleList f86042d;

    /* renamed from: e */
    private final Context f86043e;

    /* renamed from: f */
    private View f86044f;

    /* renamed from: g */
    private Aweme f86045g;

    static {
        Covode.recordClassIndex(43674);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.b$a */
    public static final class C36380a {
        static {
            Covode.recordClassIndex(43675);
        }

        private C36380a() {
        }

        public /* synthetic */ C36380a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3538o.AbstractC62694c
    /* renamed from: b */
    public final void mo63657b() {
        AbstractC36318a aVar = this.f86041c;
        if (aVar != null) {
            aVar.mo63566b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3538o.AbstractC62694c
    /* renamed from: d */
    public final void mo63659d() {
        this.f86042d.mo63602s();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3538o.AbstractC62694c
    /* renamed from: e */
    public final void mo63660e() {
        this.f86042d.mo27122r();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3538o.AbstractC62694c
    /* renamed from: c */
    public final void mo63658c() {
        AbstractC36318a aVar = this.f86041c;
        if (aVar != null) {
            aVar.mo63566b();
        }
        this.f86041c = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3538o.AbstractC62694c
    /* renamed from: a */
    public final void mo63655a() {
        String str;
        AbstractC36318a aVar = this.f86041c;
        if (aVar != null) {
            aVar.mo63566b();
        }
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        g.getCurUser();
        Aweme aweme = this.f86045g;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        this.f86041c = new C36322c(str, this.f86040a, this.f86042d);
        AwemeCommentBubbleList awemeCommentBubbleList = this.f86042d;
        awemeCommentBubbleList.f85964R = true;
        awemeCommentBubbleList.f85965S = awemeCommentBubbleList.getFirstDataPositionInState();
        ViewGroup.LayoutParams layoutParams = awemeCommentBubbleList.f85962P.getLayoutParams();
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        layoutParams.height = C89241a.m154730a(TypedValue.applyDimension(1, 192.0f, system.getDisplayMetrics()));
        awemeCommentBubbleList.f85962P.setLayoutParams(layoutParams);
        this.f86042d.setBubbleListManager(this.f86041c);
    }

    public C36379b(C36491b bVar) {
        C89219l.m154721d(bVar, "");
        this.f86040a = bVar;
        Context context = bVar.mo63863a().getContext();
        C89219l.m154716b(context, "");
        this.f86043e = context;
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.jj, bVar.mo63863a(), true);
        C89219l.m154716b(a, "");
        this.f86044f = a;
        AwemeCommentBubbleList awemeCommentBubbleList = (AwemeCommentBubbleList) a.findViewById(R.id.a96);
        C89219l.m154716b(awemeCommentBubbleList, "");
        this.f86042d = awemeCommentBubbleList;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3538o.AbstractC62694c
    /* renamed from: a */
    public final void mo63656a(Aweme aweme) {
        String str;
        C89219l.m154721d(aweme, "");
        this.f86040a.mo63863a().setVisibility(0);
        this.f86042d.setVisibility(0);
        if (!TextUtils.isEmpty(aweme.getAid())) {
            aweme.getAid();
            AbstractC36318a aVar = this.f86041c;
            if (aVar != null) {
                aVar.mo63566b();
            }
            AwemeCommentBubbleList awemeCommentBubbleList = this.f86042d;
            String str2 = this.f86040a.f86298c;
            String groupId = aweme.getGroupId();
            int a = C76598h.m134176a(aweme.getAuthor());
            if (C76706a.m134278d(aweme)) {
                str = "story";
            } else {
                str = UGCMonitor.TYPE_POST;
            }
            awemeCommentBubbleList.setMMobEventParam(new C36296a(aweme, str2, groupId, a, str, this.f86040a.f86299d, new LinkedHashSet()));
            AbstractC36318a aVar2 = this.f86041c;
            if (aVar2 != null) {
                aVar2.mo63563a(aweme);
                return;
            }
            return;
        }
        AbstractC36318a aVar3 = this.f86041c;
        if (aVar3 != null) {
            aVar3.mo63566b();
        }
    }
}
