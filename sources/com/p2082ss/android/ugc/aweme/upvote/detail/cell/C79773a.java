package com.p2082ss.android.ugc.aweme.upvote.detail.cell;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1719f.p1720a.C23126b;
import com.p2082ss.android.ugc.aweme.base.utils.C34722h;
import com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.p2082ss.android.ugc.aweme.comment.services.CommentService;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.live.C58589b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.aweme.translation.p4142a.C79030c;
import com.p2082ss.android.ugc.aweme.translation.p4144ui.AbstractC79038a;
import com.p2082ss.android.ugc.aweme.upvote.api.UpvoteApi;
import com.p2082ss.android.ugc.aweme.upvote.detail.panel.C79884l;
import com.p2082ss.android.ugc.aweme.upvote.detail.panel.UpvoteDetailPanelViewModel;
import com.p2082ss.android.ugc.aweme.upvote.p4188b.C79706b;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.C79707a;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.C79714h;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80566ib;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4589j.C88934a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.upvote.detail.cell.a */
public final class C79773a implements AbstractC79038a {

    /* renamed from: a */
    C79714h f178960a;

    /* renamed from: b */
    public final TuxTextView f178961b;

    /* renamed from: c */
    public final UpvoteDetailPanelViewModel f178962c;

    static {
        Covode.recordClassIndex(92997);
    }

    @Override // com.p2082ss.android.ugc.aweme.translation.p4144ui.AbstractC79038a
    /* renamed from: a */
    public final void mo85292a() {
    }

    @Override // com.p2082ss.android.ugc.aweme.translation.p4144ui.AbstractC79038a
    /* renamed from: a */
    public final void mo85296a(C79030c cVar) {
        String str;
        if (cVar != null && (str = cVar.f177641a) != null) {
            C79714h hVar = this.f178960a;
            if (hVar == null) {
                C89219l.m154710a("upvote");
            }
            mo123362a(str, hVar.getCreateTime());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.cell.a$a */
    static final class C79774a extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C79773a f178963a;

        /* renamed from: b */
        final /* synthetic */ boolean f178964b;

        /* renamed from: c */
        final /* synthetic */ C79714h f178965c;

        /* renamed from: d */
        final /* synthetic */ String f178966d;

        static {
            Covode.recordClassIndex(92998);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79774a(C79773a aVar, boolean z, C79714h hVar, String str) {
            super(1);
            this.f178963a = aVar;
            this.f178964b = z;
            this.f178965c = hVar;
            this.f178966d = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            C89219l.m154721d(view, "");
            if (this.f178964b) {
                this.f178963a.mo123362a(this.f178965c.getText(), this.f178965c.getCreateTime());
            }
            UpvoteDetailPanelViewModel upvoteDetailPanelViewModel = this.f178963a.f178962c;
            C79714h hVar = this.f178965c;
            C79773a aVar = this.f178963a;
            C89219l.m154721d(hVar, "");
            C89219l.m154721d(aVar, "");
            String commentId = hVar.getCommentId();
            if (upvoteDetailPanelViewModel.mo123374a(commentId)) {
                UpvoteDetailPanelViewModel.C79796a aVar2 = upvoteDetailPanelViewModel.mo23343h().get(commentId);
                if (aVar2 != null) {
                    aVar2.f179016a = false;
                }
            } else {
                UpvoteDetailPanelViewModel.C79796a aVar3 = upvoteDetailPanelViewModel.mo23343h().get(hVar.getCommentId());
                if (aVar3 != null) {
                    aVar3.f179016a = true;
                    aVar.mo85296a(aVar3.f179017b);
                } else {
                    String text = hVar.getText();
                    if (text != null) {
                        String h = SettingServiceImpl.m120782v().mo108872h();
                        String b = C58589b.m107696a().mo46674b(C89070n.m154516a(new C79707a(text)));
                        UpvoteApi upvoteApi = UpvoteApi.f178837a;
                        C89219l.m154716b(b, "");
                        AbstractC88412b a = upvoteApi.translate(h, b, 2).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new UpvoteDetailPanelViewModel.C79804i(upvoteDetailPanelViewModel, commentId, aVar), new UpvoteDetailPanelViewModel.C79805j(aVar));
                        C89219l.m154716b(a, "");
                        C88934a.m154195a(a, upvoteDetailPanelViewModel.mo23342g());
                    }
                }
            }
            C39162r.m79462a("translate_recommendation", C89387v.m154943a(this.f178966d, "to_user_id"));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.cell.a$b */
    static final class C79775b extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C79773a f178967a;

        /* renamed from: b */
        final /* synthetic */ C79714h f178968b;

        /* renamed from: c */
        final /* synthetic */ String f178969c;

        static {
            Covode.recordClassIndex(92999);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79775b(C79773a aVar, C79714h hVar, String str) {
            super(1);
            this.f178967a = aVar;
            this.f178968b = hVar;
            this.f178969c = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            double d;
            int i;
            int i2;
            C89219l.m154721d(view, "");
            Context context = this.f178967a.f178961b.getContext();
            String str = null;
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity != null) {
                CommentService e = CommentServiceImpl.m73664e();
                String commentId = this.f178968b.getCommentId();
                User user = this.f178968b.getUser();
                if (user != null) {
                    str = user.getUid();
                }
                String itemId = this.f178968b.getItemId();
                C79773a aVar = this.f178967a;
                if (((C79884l) aVar.f178962c.mo20673e()).f179120c == 0.0f) {
                    d = 0.5d;
                } else {
                    d = 0.73d;
                }
                Context context2 = aVar.f178961b.getContext();
                C89219l.m154716b(context2, "");
                Resources resources = context2.getResources();
                C89219l.m154709a((Object) resources, "");
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                if (displayMetrics != null) {
                    i = displayMetrics.heightPixels;
                } else {
                    i = 0;
                }
                Context context3 = aVar.f178961b.getContext();
                C89219l.m154716b(context3, "");
                int identifier = context3.getResources().getIdentifier("status_bar_height", "dimen", "android");
                if (identifier > 0) {
                    i2 = context3.getResources().getDimensionPixelSize(identifier);
                } else {
                    i2 = 0;
                }
                double d2 = (double) i;
                Double.isNaN(d2);
                double d3 = d * d2;
                double d4 = (double) i2;
                Double.isNaN(d4);
                e.mo63286a(activity, commentId, str, itemId, (int) (d3 + d4));
                C39162r.m79462a("report_recommendation", C89387v.m154943a(this.f178969c, "to_user_id"));
            }
            return C89391z.f203057a;
        }
    }

    public C79773a(TuxTextView tuxTextView, UpvoteDetailPanelViewModel upvoteDetailPanelViewModel) {
        C89219l.m154721d(tuxTextView, "");
        C89219l.m154721d(upvoteDetailPanelViewModel, "");
        this.f178961b = tuxTextView;
        this.f178962c = upvoteDetailPanelViewModel;
    }

    /* renamed from: a */
    public final void mo123362a(String str, long j) {
        boolean z;
        int color;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = C34722h.m70923b(((Number) C79706b.m138537a(Integer.valueOf((int) R.string.f6m), Integer.valueOf((int) R.string.fav))).intValue());
            C89219l.m154716b(str, "");
            this.f178961b.setTextColorRes(R.attr.bj);
        } else {
            this.f178961b.setTextColorRes(R.attr.bc);
        }
        String a = C80471gb.m139481a(str);
        C89219l.m154716b(a, "");
        C79714h hVar = this.f178960a;
        if (hVar == null) {
            C89219l.m154710a("upvote");
        }
        if (hVar.isFake()) {
            this.f178961b.setText(a);
            return;
        }
        String a2 = C80566ib.m139651a(this.f178961b.getContext(), j * 1000);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a + ' ' + a2);
        C23126b bVar = new C23126b(61, false);
        Context context = this.f178961b.getContext();
        C89219l.m154716b(context, "");
        C89219l.m154719c(context, "");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.bd, typedValue, true);
        if (typedValue.type < 28 || typedValue.type > 31) {
            color = context.getResources().getColor(0);
        } else {
            color = typedValue.data;
        }
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(color);
        int length = spannableStringBuilder.length() - a2.length();
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(bVar, length, length2, 17);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, length2, 17);
        this.f178961b.setText(spannableStringBuilder);
    }
}
