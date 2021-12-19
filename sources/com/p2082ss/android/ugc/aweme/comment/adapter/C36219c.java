package com.p2082ss.android.ugc.aweme.comment.adapter;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.drawee.p1855f.C24246a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarImageView;
import com.p2082ss.android.ugc.aweme.challenge.model.Segment;
import com.p2082ss.android.ugc.aweme.comment.adapter.C36216b;
import com.p2082ss.android.ugc.aweme.comment.model.CommentAtSummonFriendItem;
import com.p2082ss.android.ugc.aweme.comment.model.CommentAtUser;
import com.p2082ss.android.ugc.aweme.comment.p2499m.C36544e;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.discover.model.Position;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.search.service.ISearchUserService;
import com.p2082ss.android.ugc.aweme.search.service.SearchUserService;
import com.p2082ss.android.ugc.aweme.utils.C80581io;
import com.p2082ss.android.ugc.aweme.utils.UserVerify;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.c */
public final class C36219c extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public C36216b.AbstractC36218b f85535a;

    /* renamed from: b */
    public CommentAtSummonFriendItem f85536b;

    /* renamed from: c */
    private Aweme f85537c;

    /* renamed from: d */
    private final AbstractC89244h f85538d = C89250i.m154773a((AbstractC89171a) C36222a.f85541a);

    static {
        Covode.recordClassIndex(43485);
    }

    /* renamed from: a */
    private final ISearchUserService m73820a() {
        return (ISearchUserService) this.f85538d.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.c$a */
    static final class C36222a extends AbstractC89220m implements AbstractC89171a<ISearchUserService> {

        /* renamed from: a */
        public static final C36222a f85541a = new C36222a();

        static {
            Covode.recordClassIndex(43488);
        }

        C36222a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ISearchUserService invoke() {
            return SearchUserService.m119898b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36219c(View view) {
        super(view);
        C89219l.m154721d(view, "");
        view.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.comment.adapter.C36219c.View$OnClickListenerC362201 */

            /* renamed from: a */
            final /* synthetic */ C36219c f85539a;

            static {
                Covode.recordClassIndex(43486);
            }

            {
                this.f85539a = r1;
            }

            public final void onClick(View view) {
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                Word word;
                Word word2;
                CommentAtUser commentAtUser;
                CommentAtUser commentAtUser2;
                ClickAgent.onClick(view);
                CommentAtSummonFriendItem commentAtSummonFriendItem = this.f85539a.f85536b;
                if (commentAtSummonFriendItem != null) {
                    CommentAtSummonFriendItem commentAtSummonFriendItem2 = this.f85539a.f85536b;
                    if (commentAtSummonFriendItem2 != null && commentAtSummonFriendItem2.isFromSug) {
                        C33744d a = new C33744d().mo59983a("search_position", "comments").mo59983a("new_sug_session_id", C36544e.f86527a);
                        CommentAtSummonFriendItem commentAtSummonFriendItem3 = this.f85539a.f85536b;
                        String str6 = null;
                        if (commentAtSummonFriendItem3 != null) {
                            str = commentAtSummonFriendItem3.requestId;
                        } else {
                            str = null;
                        }
                        C33744d a2 = a.mo59983a("impr_id", str);
                        CommentAtSummonFriendItem commentAtSummonFriendItem4 = this.f85539a.f85536b;
                        if (commentAtSummonFriendItem4 != null) {
                            str2 = commentAtSummonFriendItem4.keyword;
                        } else {
                            str2 = null;
                        }
                        C33744d a3 = a2.mo59983a("raw_query", str2);
                        CommentAtSummonFriendItem commentAtSummonFriendItem5 = this.f85539a.f85536b;
                        if (commentAtSummonFriendItem5 == null || (commentAtUser2 = commentAtSummonFriendItem5.mUser) == null) {
                            str3 = null;
                        } else {
                            str3 = commentAtUser2.uid;
                        }
                        C33744d a4 = a3.mo59983a("sug_user_id", str3);
                        CommentAtSummonFriendItem commentAtSummonFriendItem6 = this.f85539a.f85536b;
                        if (commentAtSummonFriendItem6 == null || (commentAtUser = commentAtSummonFriendItem6.mUser) == null) {
                            str4 = null;
                        } else {
                            str4 = commentAtUser.relationType;
                        }
                        C33744d a5 = a4.mo59983a("user_tag", str4).mo59980a("words_position", this.f85539a.getAdapterPosition());
                        CommentAtSummonFriendItem commentAtSummonFriendItem7 = this.f85539a.f85536b;
                        if (commentAtSummonFriendItem7 == null || (word2 = commentAtSummonFriendItem7.wordRecord) == null) {
                            str5 = null;
                        } else {
                            str5 = word2.getWordSource();
                        }
                        C33744d a6 = a5.mo59983a("words_source", str5);
                        CommentAtSummonFriendItem commentAtSummonFriendItem8 = this.f85539a.f85536b;
                        if (!(commentAtSummonFriendItem8 == null || (word = commentAtSummonFriendItem8.wordRecord) == null)) {
                            str6 = word.getId();
                        }
                        C39162r.m79460a("trending_words_click", a6.mo59983a("group_id", str6).f79943a);
                    }
                    C36216b.AbstractC36218b bVar = this.f85539a.f85535a;
                    if (bVar != null) {
                        bVar.mo63381a(this.f85539a.getPosition(), commentAtSummonFriendItem);
                    }
                }
            }
        });
        ((TuxTextView) view.findViewById(R.id.ex2)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.comment.adapter.C36219c.View$OnClickListenerC362212 */

            /* renamed from: a */
            final /* synthetic */ C36219c f85540a;

            static {
                Covode.recordClassIndex(43487);
            }

            {
                this.f85540a = r1;
            }

            public final void onClick(View view) {
                C36216b.AbstractC36218b bVar;
                ClickAgent.onClick(view);
                CommentAtSummonFriendItem commentAtSummonFriendItem = this.f85540a.f85536b;
                if (commentAtSummonFriendItem != null && (bVar = this.f85540a.f85535a) != null) {
                    bVar.mo63382a(CommentAtUser.Companion.toUser(commentAtSummonFriendItem.mUser));
                }
            }
        });
    }

    /* renamed from: a */
    private final SpannableString m73819a(SpannableString spannableString, int i, int i2) {
        if (TextUtils.isEmpty(spannableString)) {
            return spannableString;
        }
        int max = Math.max(0, i);
        if (!TextUtils.isEmpty(spannableString) && max <= i2 && max < spannableString.length() && i2 <= spannableString.length()) {
            View view = this.itemView;
            C89219l.m154716b(view, "");
            spannableString.setSpan(new ForegroundColorSpan(view.getResources().getColor(R.color.gq)), max, i2, 17);
        }
        return spannableString;
    }

    /* renamed from: a */
    public final void mo63383a(CommentAtSummonFriendItem commentAtSummonFriendItem, Aweme aweme, C36216b.AbstractC36218b bVar) {
        float f;
        String str;
        String str2 = "";
        C89219l.m154721d(commentAtSummonFriendItem, str2);
        if (commentAtSummonFriendItem.mUser != null) {
            View view = this.itemView;
            C89219l.m154716b(view, str2);
            if (commentAtSummonFriendItem.isMentionBlocked) {
                f = 0.3f;
            } else {
                f = 1.0f;
            }
            view.setAlpha(f);
            View view2 = this.itemView;
            C89219l.m154716b(view2, str2);
            Context context = view2.getContext();
            this.f85535a = bVar;
            this.f85536b = commentAtSummonFriendItem;
            this.f85537c = aweme;
            if (commentAtSummonFriendItem.mUser.nickname == null) {
                str = str2;
            } else {
                str = commentAtSummonFriendItem.mUser.nickname;
            }
            SpannableString spannableString = new SpannableString(str);
            View view3 = this.itemView;
            C89219l.m154716b(view3, str2);
            SmartAvatarImageView avatarImageView = ((AvatarImageWithVerify) view3.findViewById(R.id.dqi)).getAvatarImageView();
            C89219l.m154716b(avatarImageView, str2);
            ((C24246a) avatarImageView.getHierarchy()).mo39954a(R.color.f, C24229q.AbstractC24231b.f57458h);
            View view4 = this.itemView;
            C89219l.m154716b(view4, str2);
            ((AvatarImageWithVerify) view4.findViewById(R.id.dqi)).setUserData(new UserVerify(commentAtSummonFriendItem.mUser.avatarThumb, commentAtSummonFriendItem.mUser.customVerify, commentAtSummonFriendItem.mUser.enterpriseVerifyReason, commentAtSummonFriendItem.mUser.verificationType));
            boolean z = true;
            if (commentAtSummonFriendItem.segments != null) {
                for (Segment segment : commentAtSummonFriendItem.segments) {
                    if (segment != null) {
                        spannableString = m73819a(spannableString, segment.begin, segment.end + 1);
                    }
                }
            } else if (commentAtSummonFriendItem.positions != null) {
                for (Position position : commentAtSummonFriendItem.positions) {
                    if (position != null) {
                        spannableString = m73819a(spannableString, position.getBegin(), position.getEnd() + 1);
                    }
                }
            }
            View view5 = this.itemView;
            C89219l.m154716b(view5, str2);
            ((AvatarImageWithVerify) view5.findViewById(R.id.dqi)).mo61285a();
            View view6 = this.itemView;
            C89219l.m154716b(view6, str2);
            Context context2 = view6.getContext();
            String str3 = commentAtSummonFriendItem.mUser.customVerify;
            String str4 = commentAtSummonFriendItem.mUser.enterpriseVerifyReason;
            View view7 = this.itemView;
            C89219l.m154716b(view7, str2);
            C80581io.m139704a(context2, str3, str4, (TextView) view7.findViewById(R.id.ezz));
            View view8 = this.itemView;
            C89219l.m154716b(view8, str2);
            TuxTextView tuxTextView = (TuxTextView) view8.findViewById(R.id.ex2);
            C89219l.m154716b(tuxTextView, str2);
            tuxTextView.setVisibility(8);
            View view9 = this.itemView;
            C89219l.m154716b(view9, str2);
            TuxTextView tuxTextView2 = (TuxTextView) view9.findViewById(R.id.f3y);
            C89219l.m154716b(tuxTextView2, str2);
            tuxTextView2.setVisibility(0);
            ISearchUserService a = m73820a();
            CommentAtUser commentAtUser = commentAtSummonFriendItem.mUser;
            String str5 = null;
            String a2 = a.mo106816a(context, commentAtUser != null ? commentAtUser.relationType : null);
            if (a2.length() <= 0 || a2 == null) {
                ISearchUserService a3 = m73820a();
                CommentAtUser commentAtUser2 = commentAtSummonFriendItem.mUser;
                a2 = a3.mo106815a(context, commentAtUser2 != null ? commentAtUser2.followStatus : null);
            }
            if (a2.length() <= 0) {
                z = false;
            }
            if (!z || !m73820a().mo106817a()) {
                View view10 = this.itemView;
                C89219l.m154716b(view10, str2);
                TuxTextView tuxTextView3 = (TuxTextView) view10.findViewById(R.id.ewe);
                C89219l.m154716b(tuxTextView3, str2);
                tuxTextView3.setVisibility(8);
            } else {
                View view11 = this.itemView;
                C89219l.m154716b(view11, str2);
                TuxTextView tuxTextView4 = (TuxTextView) view11.findViewById(R.id.ewe);
                C89219l.m154716b(tuxTextView4, str2);
                tuxTextView4.setText(" · ".concat(String.valueOf(a2)));
                View view12 = this.itemView;
                C89219l.m154716b(view12, str2);
                TuxTextView tuxTextView5 = (TuxTextView) view12.findViewById(R.id.ewe);
                C89219l.m154716b(tuxTextView5, str2);
                tuxTextView5.setVisibility(0);
            }
            View view13 = this.itemView;
            C89219l.m154716b(view13, str2);
            TuxTextView tuxTextView6 = (TuxTextView) view13.findViewById(R.id.f3y);
            C89219l.m154716b(tuxTextView6, str2);
            tuxTextView6.setText(spannableString);
            View view14 = this.itemView;
            C89219l.m154716b(view14, str2);
            TuxTextView tuxTextView7 = (TuxTextView) view14.findViewById(R.id.ezz);
            C89219l.m154716b(tuxTextView7, str2);
            CommentAtUser commentAtUser3 = commentAtSummonFriendItem.mUser;
            if (commentAtUser3 != null) {
                if (!TextUtils.isEmpty(commentAtUser3.uniqueId)) {
                    str2 = commentAtUser3.uniqueId;
                } else if (commentAtUser3.shortId != null) {
                    str2 = commentAtUser3.shortId;
                }
            }
            tuxTextView7.setText(str2);
            if (commentAtSummonFriendItem.isFromSug) {
                C33744d a4 = new C33744d().mo59983a("search_position", "comments").mo59983a("new_sug_session_id", C36544e.f86527a).mo59983a("impr_id", commentAtSummonFriendItem.requestId).mo59983a("raw_query", commentAtSummonFriendItem.keyword).mo59983a("sug_user_id", commentAtSummonFriendItem.mUser.uid).mo59983a("user_tag", commentAtSummonFriendItem.mUser.relationType).mo59980a("words_position", getAdapterPosition());
                Word word = commentAtSummonFriendItem.wordRecord;
                C33744d a5 = a4.mo59983a("words_source", word != null ? word.getWordSource() : null);
                Word word2 = commentAtSummonFriendItem.wordRecord;
                if (word2 != null) {
                    str5 = word2.getId();
                }
                C39162r.m79460a("trending_words_show", a5.mo59983a("group_id", str5).f79943a);
            }
        }
    }
}
