package com.p2082ss.android.ugc.aweme.comment.barrage.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.p2082ss.android.ugc.aweme.comment.barrage.C36296a;
import com.p2082ss.android.ugc.aweme.comment.services.CommentService;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.CommentBubbleTaggedPeopleView */
public final class CommentBubbleTaggedPeopleView extends FrameLayout {

    /* renamed from: a */
    public final TuxTextView f86001a;

    /* renamed from: b */
    public Aweme f86002b;

    /* renamed from: c */
    public C36296a f86003c;

    static {
        Covode.recordClassIndex(43656);
    }

    public CommentBubbleTaggedPeopleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.CommentBubbleTaggedPeopleView$a */
    public static final class View$OnClickListenerC36367a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommentBubbleTaggedPeopleView f86004a;

        /* renamed from: b */
        final /* synthetic */ C36296a f86005b;

        /* renamed from: c */
        final /* synthetic */ Aweme f86006c;

        static {
            Covode.recordClassIndex(43657);
        }

        public View$OnClickListenerC36367a(CommentBubbleTaggedPeopleView commentBubbleTaggedPeopleView, C36296a aVar, Aweme aweme) {
            this.f86004a = commentBubbleTaggedPeopleView;
            this.f86005b = aVar;
            this.f86006c = aweme;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            C33744d dVar = new C33744d();
            C36296a aVar = this.f86005b;
            String str2 = null;
            if (aVar != null) {
                str = aVar.f85809b;
            } else {
                str = null;
            }
            C33744d a = dVar.mo59983a("enter_from", str);
            String aid = this.f86006c.getAid();
            String str3 = "";
            if (aid == null) {
                aid = str3;
            }
            C33744d a2 = a.mo59983a("group_id", aid);
            String authorUid = this.f86006c.getAuthorUid();
            if (authorUid != null) {
                str3 = authorUid;
            }
            C39162r.m79460a("tag_anchor_click", a2.mo59983a("author_id", str3).mo59983a("anchor_type", "low_interest").f79943a);
            CommentService e = CommentServiceImpl.m73664e();
            Context context = this.f86004a.getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            ActivityC0945e eVar = (ActivityC0945e) context;
            Aweme aweme = this.f86006c;
            C36296a aVar2 = this.f86005b;
            if (aVar2 != null) {
                str2 = aVar2.f85809b;
            }
            e.mo63290a(eVar, aweme, str2, "low_interest");
        }
    }

    private /* synthetic */ CommentBubbleTaggedPeopleView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CommentBubbleTaggedPeopleView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(9070);
        FrameLayout.inflate(context, R.layout.i3, this);
        View findViewById = findViewById(R.id.ef5);
        C89219l.m154716b(findViewById, "");
        this.f86001a = (TuxTextView) findViewById;
        MethodCollector.m26664o(9070);
    }
}
