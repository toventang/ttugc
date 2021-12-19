package com.p2082ss.android.ugc.aweme.friends.p3011a;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.C17177c;
import com.bytedance.ies.dmt.p1194ui.p1195a.C17151a;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.p1721g.C23144b;
import com.github.p1912a.p1913a.C25040a;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify;
import com.p2082ss.android.ugc.aweme.challenge.model.Segment;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.discover.model.Position;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.friends.C51489f;
import com.p2082ss.android.ugc.aweme.friends.model.SummonFriendItem;
import com.p2082ss.android.ugc.aweme.friends.p3011a.C51437a;
import com.p2082ss.android.ugc.aweme.friends.p3013c.C51484e;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.model.C67679e;
import com.p2082ss.android.ugc.aweme.search.model.C67684i;
import com.p2082ss.android.ugc.aweme.search.service.ISearchUserService;
import com.p2082ss.android.ugc.aweme.search.service.SearchUserService;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80409eu;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.utils.UserVerify;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.friends.a.b */
public final class C51443b extends AbstractC39063h {

    /* renamed from: l */
    public static final C51450c f118544l = new C51450c((byte) 0);

    /* renamed from: a */
    public int f118545a;

    /* renamed from: b */
    public List<? extends IMUser> f118546b;

    /* renamed from: c */
    public List<? extends SummonFriendItem> f118547c;

    /* renamed from: d */
    public List<? extends C67679e> f118548d;

    /* renamed from: e */
    public LogPbBean f118549e;

    /* renamed from: f */
    public String f118550f;

    /* renamed from: g */
    public String f118551g = "";

    /* renamed from: h */
    public int f118552h = -1;

    /* renamed from: i */
    public String f118553i = "";

    /* renamed from: j */
    public AbstractC51444a f118554j;

    /* renamed from: k */
    public List<String> f118555k = new ArrayList();

    /* renamed from: m */
    private final AbstractC89244h f118556m = C89250i.m154773a((AbstractC89171a) C51451d.f118586a);

    /* renamed from: com.ss.android.ugc.aweme.friends.a.b$a */
    public interface AbstractC51444a {
        static {
            Covode.recordClassIndex(60703);
        }

        /* renamed from: a */
        String mo86926a();
    }

    static {
        Covode.recordClassIndex(60702);
    }

    /* renamed from: e */
    public final ISearchUserService mo63369e() {
        return (ISearchUserService) this.f118556m.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.a.b$c */
    public static final class C51450c {
        static {
            Covode.recordClassIndex(60709);
        }

        private C51450c() {
        }

        public /* synthetic */ C51450c(byte b) {
            this();
        }

        /* renamed from: a */
        public static String m95842a(String str) {
            if (str != null) {
                StringBuilder sb = new StringBuilder();
                Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                String obj = C89361p.m154910b((CharSequence) str).toString();
                for (int i = 0; i < obj.length(); i++) {
                    sb.append(C25040a.m48012a(obj.charAt(i)));
                }
                String sb2 = sb.toString();
                if (sb2 == null) {
                    return "";
                }
                return sb2;
            }
            return "";
        }

        /* renamed from: b */
        public static String m95843b(String str) {
            if (str != null) {
                StringBuilder sb = new StringBuilder();
                Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                String obj = C89361p.m154910b((CharSequence) str).toString();
                for (int i = 0; i < obj.length(); i++) {
                    sb.append(C25040a.m48012a(obj.charAt(i)).charAt(0));
                }
                String sb2 = sb.toString();
                if (sb2 == null) {
                    return "";
                }
                return sb2;
            }
            return "";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.a.b$d */
    static final class C51451d extends AbstractC89220m implements AbstractC89171a<ISearchUserService> {

        /* renamed from: a */
        public static final C51451d f118586a = new C51451d();

        static {
            Covode.recordClassIndex(60710);
        }

        C51451d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ISearchUserService invoke() {
            return SearchUserService.m119898b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.a.b$b */
    public final class C51445b extends C17151a<IMUser> {

        /* renamed from: a */
        public TextView f118557a;

        /* renamed from: b */
        public FrameLayout f118558b;

        /* renamed from: c */
        public TextView f118559c;

        /* renamed from: d */
        public AvatarImageWithVerify f118560d;

        /* renamed from: e */
        public TextView f118561e;

        /* renamed from: f */
        public TextView f118562f;

        /* renamed from: g */
        public TuxIconView f118563g;

        /* renamed from: h */
        public LinearLayout f118564h;

        /* renamed from: i */
        public int f118565i = -1;

        /* renamed from: j */
        public String f118566j = "";

        /* renamed from: k */
        public String f118567k = "";

        /* renamed from: l */
        public AbstractC51444a f118568l;

        /* renamed from: m */
        final AbstractC89244h f118569m = C89250i.m154773a((AbstractC89171a) new C51448c(this));

        /* renamed from: n */
        public final View f118570n;

        /* renamed from: o */
        public final C51443b f118571o;

        /* renamed from: p */
        final /* synthetic */ C51443b f118572p;

        /* renamed from: q */
        private final AbstractC89244h f118573q = C89250i.m154773a((AbstractC89171a) new C51447b(this));

        /* renamed from: r */
        private final AbstractC89244h f118574r = C89250i.m154773a((AbstractC89171a) new C51449d(this));

        static {
            Covode.recordClassIndex(60704);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.p1195a.C17151a
        /* renamed from: a */
        public final void mo27050a() {
        }

        /* renamed from: b */
        public final int mo86930b() {
            return ((Number) this.f118573q.getValue()).intValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final String mo86931c() {
            return (String) this.f118574r.getValue();
        }

        /* renamed from: com.ss.android.ugc.aweme.friends.a.b$b$b */
        static final class C51447b extends AbstractC89220m implements AbstractC89171a<Integer> {

            /* renamed from: a */
            final /* synthetic */ C51445b f118583a;

            static {
                Covode.recordClassIndex(60706);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C51447b(C51445b bVar) {
                super(0);
                this.f118583a = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Integer invoke() {
                return Integer.valueOf(this.f118583a.f118570n.getResources().getColor(R.color.al));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.friends.a.b$b$c */
        static final class C51448c extends AbstractC89220m implements AbstractC89171a<String> {

            /* renamed from: a */
            final /* synthetic */ C51445b f118584a;

            static {
                Covode.recordClassIndex(60707);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C51448c(C51445b bVar) {
                super(0);
                this.f118584a = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ String invoke() {
                String string = this.f118584a.f118570n.getResources().getString(R.string.cbk);
                C89219l.m154716b(string, "");
                return string;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.friends.a.b$b$d */
        static final class C51449d extends AbstractC89220m implements AbstractC89171a<String> {

            /* renamed from: a */
            final /* synthetic */ C51445b f118585a;

            static {
                Covode.recordClassIndex(60708);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C51449d(C51445b bVar) {
                super(0);
                this.f118585a = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ String invoke() {
                String string = this.f118585a.f118570n.getResources().getString(R.string.bz2);
                C89219l.m154716b(string, "");
                return string;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.friends.a.b$b$a */
        public static final class View$OnClickListenerC51446a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C51445b f118575a;

            /* renamed from: b */
            final /* synthetic */ User f118576b;

            /* renamed from: c */
            final /* synthetic */ LogPbBean f118577c;

            /* renamed from: d */
            final /* synthetic */ String f118578d;

            /* renamed from: e */
            final /* synthetic */ boolean f118579e;

            /* renamed from: f */
            final /* synthetic */ String f118580f;

            /* renamed from: g */
            final /* synthetic */ Word f118581g;

            /* renamed from: h */
            final /* synthetic */ C89233z.C89238e f118582h;

            static {
                Covode.recordClassIndex(60705);
            }

            View$OnClickListenerC51446a(C51445b bVar, User user, LogPbBean logPbBean, String str, boolean z, String str2, Word word, C89233z.C89238e eVar) {
                this.f118575a = bVar;
                this.f118576b = user;
                this.f118577c = logPbBean;
                this.f118578d = str;
                this.f118579e = z;
                this.f118580f = str2;
                this.f118581g = word;
                this.f118582h = eVar;
            }

            public final void onClick(View view) {
                String str;
                String str2;
                String str3;
                ClickAgent.onClick(view);
                if (this.f118575a.f118572p.f118555k.contains(this.f118576b.getUid())) {
                    View view2 = this.f118575a.itemView;
                    C89219l.m154716b(view2, "");
                    new C23144b(view2).mo37640e(R.string.d23).mo37637b();
                } else {
                    String str4 = null;
                    if (this.f118575a.f118565i == 0) {
                        C33744d a = new C33744d().mo59983a("search_keyword", this.f118575a.f118567k);
                        C48027ac acVar = C48027ac.C48028a.f111257a;
                        LogPbBean logPbBean = this.f118577c;
                        if (logPbBean == null || (str2 = logPbBean.getImprId()) == null) {
                            AbstractC51444a aVar = this.f118575a.f118568l;
                            if (aVar != null) {
                                str2 = aVar.mo86926a();
                            } else {
                                str2 = null;
                            }
                        }
                        C33744d a2 = a.mo59983a("log_pb", acVar.mo80055a(str2));
                        LogPbBean logPbBean2 = this.f118577c;
                        if (logPbBean2 == null || (str3 = logPbBean2.getImprId()) == null) {
                            AbstractC51444a aVar2 = this.f118575a.f118568l;
                            if (aVar2 != null) {
                                str3 = aVar2.mo86926a();
                            } else {
                                str3 = null;
                            }
                        }
                        C33744d a3 = a2.mo59983a("impr_id", str3);
                        String str5 = this.f118578d;
                        if (str5 == null) {
                            str5 = "";
                        }
                        C33744d a4 = a3.mo59983a("search_id", str5).mo59980a("relation_tag", this.f118576b.getFollowStatus());
                        C89219l.m154716b(a4, "");
                        C39162r.m79463b("add_video_at", C59208ac.m108761a(C80409eu.m139390a(a4, this.f118576b).f79943a));
                    }
                    if (this.f118579e) {
                        C33744d a5 = new C33744d().mo59983a("search_position", this.f118575a.f118566j).mo59983a("new_sug_session_id", C51489f.f118674a).mo59983a("impr_id", this.f118578d).mo59983a("raw_query", this.f118575a.f118567k).mo59983a("sug_user_id", this.f118576b.getUid()).mo59983a("user_tag", this.f118580f).mo59980a("words_position", this.f118575a.getAdapterPosition());
                        Word word = this.f118581g;
                        if (word != null) {
                            str = word.getWordSource();
                        } else {
                            str = null;
                        }
                        C33744d a6 = a5.mo59983a("words_source", str);
                        Word word2 = this.f118581g;
                        if (word2 != null) {
                            str4 = word2.getId();
                        }
                        C39162r.m79460a("trending_words_click", a6.mo59983a("group_id", str4).f79943a);
                    }
                    IAccountUserService g = C31575b.m65865g();
                    C89219l.m154716b(g, "");
                    if (!TextUtils.equals(g.getCurUserId(), this.f118576b.getUid())) {
                        C39162r.onEvent(MobClick.obtain().setEventName("at_friend").setLabelName("friend_list").setValue(this.f118576b.getUid()));
                        AbstractC81915c.m141874a(new C51484e(this.f118576b));
                    } else {
                        View view3 = this.f118575a.itemView;
                        C89219l.m154716b(view3, "");
                        new C23144b(view3).mo37640e(R.string.dfq).mo37637b();
                    }
                }
                C39162r.m79460a("tag_mention_head_click", new C33744d().mo59983a("previous_page", "video_edit_page").mo59983a("to_user_id", this.f118576b.getUid()).mo59983a("user_type", (String) this.f118582h.element).mo59983a("search_keyword", this.f118575a.f118567k).mo59983a("function", "mention").mo59983a("is_valid", String.valueOf(!this.f118575a.f118572p.f118555k.contains(this.f118576b.getUid()) ? 1 : 0)).mo59983a("click_type", "choose").mo59983a("enter_from", "video_post_page").f79943a);
            }
        }

        /* renamed from: a */
        public final void mo86927a(int i, SummonFriendItem summonFriendItem) {
            float f;
            ArrayList arrayList;
            C89219l.m154721d(summonFriendItem, "");
            View view = this.f118570n;
            if (summonFriendItem.isMentionBlocked) {
                f = 0.3f;
            } else {
                f = 1.0f;
            }
            view.setAlpha(f);
            List<Segment> list = summonFriendItem.segments;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                for (T t : list) {
                    C89219l.m154716b(t, "");
                    arrayList2.add(new Position(t.begin, t.end));
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            User user = summonFriendItem.mUser;
            C89219l.m154716b(user, "");
            mo86928a(i, user, arrayList, summonFriendItem.logPbBean, summonFriendItem.searchId, null, null);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51445b(C51443b bVar, View view, C51443b bVar2) {
            super(view);
            C89219l.m154721d(view, "");
            C89219l.m154721d(bVar2, "");
            this.f118572p = bVar;
            this.f118570n = view;
            this.f118571o = bVar2;
            View findViewById = view.findViewById(R.id.dtk);
            C89219l.m154716b(findViewById, "");
            this.f118557a = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.bqn);
            C89219l.m154716b(findViewById2, "");
            this.f118558b = (FrameLayout) findViewById2;
            View findViewById3 = view.findViewById(R.id.bmn);
            C89219l.m154716b(findViewById3, "");
            this.f118559c = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.nz);
            C89219l.m154716b(findViewById4, "");
            this.f118560d = (AvatarImageWithVerify) findViewById4;
            View findViewById5 = view.findViewById(R.id.cpj);
            C89219l.m154716b(findViewById5, "");
            this.f118561e = (TextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.ajd);
            C89219l.m154716b(findViewById6, "");
            this.f118562f = (TextView) findViewById6;
            View findViewById7 = view.findViewById(R.id.dhg);
            C89219l.m154716b(findViewById7, "");
            this.f118563g = (TuxIconView) findViewById7;
            View findViewById8 = view.findViewById(R.id.bqo);
            C89219l.m154716b(findViewById8, "");
            this.f118564h = (LinearLayout) findViewById8;
        }

        /* renamed from: a */
        static SpannableString m95835a(int i, String str, String str2, int i2) {
            if (C89361p.m154922c((CharSequence) str2, '.')) {
                str2 = C89361p.m154869a(str2, ".", "\\.", false);
            }
            SpannableString spannableString = new SpannableString(str);
            try {
                Pattern compile = Pattern.compile(str2);
                if (compile == null) {
                    C89219l.m154715b();
                }
                Matcher matcher = compile.matcher(spannableString);
                if (matcher.find()) {
                    int start = matcher.start();
                    int end = matcher.end();
                    if (start >= i2) {
                        spannableString.setSpan(new ForegroundColorSpan(i), start, end, 33);
                    }
                }
                return spannableString;
            } catch (PatternSyntaxException e) {
                e.printStackTrace();
                return spannableString;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo86929a(User user, LogPbBean logPbBean, String str, boolean z, String str2, Word word) {
            float f;
            View view = this.itemView;
            C89219l.m154716b(view, "");
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            view.setBackground(C17177c.m31711c(view2.getContext()));
            FrameLayout frameLayout = this.f118558b;
            if (this.f118572p.f118555k.contains(user.getUid())) {
                f = 0.3f;
            } else {
                f = 1.0f;
            }
            frameLayout.setAlpha(f);
            this.f118570n.setAlpha(1.0f);
            this.f118560d.setUserData(new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType())));
            AvatarImageWithVerify avatarImageWithVerify = this.f118560d;
            View view3 = this.itemView;
            C89219l.m154716b(view3, "");
            C51461i.m95847a(avatarImageWithVerify, view3.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), this.f118561e);
            if (MainServiceImpl.createIMainServicebyMonsterPlugin(false).shouldChangeToHandle("Message")) {
                this.f118561e.setVisibility(0);
                this.f118561e.setText(C80580in.m139684b(user));
                if (this.f118572p.f118545a == 1) {
                    this.f118562f.setVisibility(8);
                } else {
                    this.f118562f.setVisibility(0);
                    this.f118562f.setText(C80580in.m139697j(user));
                }
            }
            if (!this.f118572p.mo63369e().mo106817a() || user.getFollowStatus() != 2 || this.f118572p.f118545a == 1) {
                this.f118563g.setVisibility(8);
            } else {
                this.f118563g.setVisibility(0);
                this.f118563g.setIconRes(R.raw.icon_person_arrow_left_right);
            }
            C89233z.C89238e eVar = new C89233z.C89238e();
            eVar.element = "all_user";
            List<? extends IMUser> list = this.f118572p.f118546b;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (C89219l.m154714a((Object) user.getUid(), (Object) it.next().getUid())) {
                        eVar.element = "follow";
                    }
                }
            }
            this.f118559c.setVisibility(8);
            this.f118570n.setOnClickListener(new View$OnClickListenerC51446a(this, user, logPbBean, str, z, str2, word, eVar));
            C39162r.m79460a("tag_mention_head_show", new C33744d().mo59983a("enter_from", "video_post_page").mo59983a("previous_page", "video_edit_page").mo59983a("to_user_id", user.getUid()).mo59983a("user_type", (String) eVar.element).mo59983a("search_keyword", this.f118567k).mo59983a("function", "mention").mo59983a("is_valid", String.valueOf(!this.f118572p.f118555k.contains(user.getUid()) ? 1 : 0)).f79943a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo86928a(int i, User user, List<? extends Position> list, LogPbBean logPbBean, String str, String str2, Word word) {
            int i2;
            List<? extends IMUser> list2 = this.f118571o.f118546b;
            if (list2 != null) {
                i2 = list2.size();
            } else {
                i2 = 0;
            }
            if (i != i2 || this.f118572p.f118545a == 1) {
                this.f118557a.setVisibility(8);
            } else {
                this.f118557a.setVisibility(0);
                this.f118557a.setText(R.string.v_);
            }
            if (this.f118572p.f118545a == 1) {
                this.f118562f.setVisibility(8);
            } else {
                this.f118562f.setVisibility(0);
                this.f118562f.setText("@" + C80580in.m139684b(user));
            }
            if (this.f118572p.f118545a == 1) {
                this.f118561e.setText(user.getNickname());
            } else {
                SpannableString spannableString = new SpannableString(user.getNickname());
                if (list != null) {
                    for (T t : list) {
                        int begin = t.getBegin();
                        int end = t.getEnd() + 1;
                        if (!TextUtils.isEmpty(spannableString)) {
                            int max = Math.max(0, begin);
                            if (!TextUtils.isEmpty(spannableString) && max <= end && max < spannableString.length() && end <= spannableString.length()) {
                                spannableString.setSpan(new ForegroundColorSpan(mo86930b()), max, end, 17);
                            }
                        }
                    }
                }
                this.f118561e.setText(spannableString);
            }
            mo86929a(user, logPbBean, str, true, str2, word);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public final int mo60933c() {
        int i;
        Integer valueOf;
        List<? extends IMUser> list = this.f118546b;
        int i2 = 0;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        List list2 = this.f118547c;
        if (!((list2 == null && (list2 = this.f118548d) == null) || (valueOf = Integer.valueOf(list2.size())) == null)) {
            i2 = valueOf.intValue();
        }
        return i + i2;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        C89219l.m154721d(viewGroup, "");
        if (this.f118545a == 1) {
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a9f, viewGroup, false);
            C89219l.m154716b(a, "");
            return new C51445b(this, a, this);
        }
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a9d, viewGroup, false);
        C89219l.m154716b(a2, "");
        return new C51445b(this, a2, this);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        String str;
        float f;
        List<? extends IMUser> list = this.f118546b;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        if (viewHolder instanceof C51445b) {
            C51445b bVar = (C51445b) viewHolder;
            bVar.f118565i = this.f118552h;
            String str2 = this.f118553i;
            String str3 = "";
            C89219l.m154721d(str2, str3);
            bVar.f118566j = str2;
            String str4 = this.f118551g;
            C89219l.m154721d(str4, str3);
            bVar.f118567k = str4;
            bVar.f118568l = this.f118554j;
            float f2 = 1.0f;
            if (i < i2) {
                List<? extends IMUser> list2 = this.f118546b;
                if (list2 != null) {
                    IMUser iMUser = (IMUser) list2.get(i);
                    C89219l.m154721d(iMUser, str3);
                    bVar.f118561e.setText(iMUser.getNickName());
                    if (i != 0 || bVar.f118572p.f118545a == 1) {
                        bVar.f118557a.setVisibility(8);
                    } else {
                        bVar.f118557a.setVisibility(0);
                        bVar.f118557a.setText(R.string.vd);
                    }
                    if (bVar.f118572p.f118545a == 1) {
                        bVar.f118562f.setVisibility(8);
                        bVar.f118561e.setText(iMUser.getDisplayName());
                    } else {
                        TextView textView = bVar.f118561e;
                        String str5 = bVar.f118571o.f118551g;
                        C89219l.m154721d(iMUser, str3);
                        C89219l.m154721d(str5, str3);
                        String lowerCase = str5.toLowerCase();
                        C89219l.m154716b(lowerCase, str3);
                        String nickName = iMUser.getNickName();
                        if (!TextUtils.isEmpty(nickName)) {
                            C89219l.m154716b(nickName, str3);
                            Objects.requireNonNull(nickName, "null cannot be cast to non-null type java.lang.String");
                            String lowerCase2 = nickName.toLowerCase();
                            C89219l.m154716b(lowerCase2, str3);
                            int a = C89361p.m154888a((CharSequence) lowerCase2, lowerCase, 0, false, 6);
                            if (a != -1 && a < nickName.length() && lowerCase.length() + a <= nickName.length()) {
                                lowerCase = nickName.substring(a, lowerCase.length() + a);
                                C89219l.m154716b(lowerCase, str3);
                            }
                        }
                        int b = bVar.mo86930b();
                        String displayName = iMUser.getDisplayName();
                        C89219l.m154716b(displayName, str3);
                        textView.setText(C51445b.m95835a(b, displayName, lowerCase, 0));
                        TextView textView2 = bVar.f118562f;
                        String str6 = bVar.f118571o.f118551g;
                        textView2.setVisibility(0);
                        if (iMUser.getSearchType() == 5) {
                            textView2.setText(iMUser.getSignature());
                        } else {
                            String str7 = "@";
                            if (iMUser.getSearchType() == 3) {
                                if (!TextUtils.isEmpty(iMUser.getRemarkName())) {
                                    textView2.setText(C51445b.m95835a(bVar.mo86930b(), bVar.mo86931c() + iMUser.getNickName(), IMService.createIIMServicebyMonsterPlugin(false).convertSearchKeyword(iMUser.getNickName(), iMUser.getNickNamePinyin(), iMUser.getNickNameInitial(), str6), bVar.mo86931c().length()));
                                } else if (!C58071d.m104909c()) {
                                    textView2.setText(str7 + iMUser.getDisplayId());
                                } else {
                                    textView2.setText(iMUser.getSignature());
                                }
                            } else if (iMUser.getSearchType() == 1) {
                                if (C58071d.m104909c()) {
                                    str7 = (String) bVar.f118569m.getValue();
                                }
                                String displayId = iMUser.getDisplayId();
                                textView2.setText(C51445b.m95835a(bVar.mo86930b(), str7 + displayId, IMService.createIIMServicebyMonsterPlugin(false).convertSearchKeyword(displayId, C51450c.m95842a(displayId), C51450c.m95843b(displayId), str6), str7.length()));
                            } else if (iMUser.getSearchType() == 2) {
                                textView2.setText(C51445b.m95835a(bVar.mo86930b(), str3, IMService.createIIMServicebyMonsterPlugin(false).convertSearchKeyword(iMUser.getContactName(), iMUser.getContactNamePinyin(), iMUser.getContactNameInitial(), str6), 6));
                            } else {
                                textView2.setVisibility(8);
                            }
                        }
                        if (TextUtils.isEmpty(textView2.getText())) {
                            textView2.setVisibility(8);
                        }
                    }
                    View view = bVar.f118570n;
                    if (iMUser.isMentionEnabled()) {
                        f = 1.0f;
                    } else {
                        f = 0.3f;
                    }
                    view.setAlpha(f);
                    bVar.mo86929a(C51437a.C51440b.m95827a(iMUser), null, null, false, null, null);
                    return;
                }
                return;
            }
            List<? extends C67679e> list3 = this.f118548d;
            if (list3 != null) {
                C67679e eVar = (C67679e) list3.get(i - i2);
                LogPbBean logPbBean = this.f118549e;
                String str8 = this.f118550f;
                C89219l.m154721d(eVar, str3);
                View view2 = bVar.f118570n;
                if (eVar.f151672g.getMentionBlockType() == 1) {
                    f2 = 0.3f;
                }
                view2.setAlpha(f2);
                C67684i iVar = eVar.f151672g;
                C89219l.m154716b(iVar, str3);
                User user = new User();
                user.setUid(iVar.getUserId());
                user.setSecUid(iVar.getSecUserId());
                user.setNickname(iVar.getUserNickname());
                UrlModel urlModel = new UrlModel();
                urlModel.setUri(iVar.getUserAvatarUri());
                urlModel.setUrlList(C89070n.m154522b(iVar.getUserAvatarUri(), iVar.getUserAvatarUri()));
                user.setAvatarThumb(urlModel);
                ISearchUserService e = bVar.f118572p.mo63369e();
                View view3 = bVar.itemView;
                C89219l.m154716b(view3, str3);
                user.setRelationLabel(e.mo106816a(view3.getContext(), iVar.getUserRelationType()));
                user.setUniqueId(iVar.getUsername());
                if (iVar.isVerifiedUser()) {
                    str3 = "verified";
                }
                user.setCustomVerify(str3);
                bVar.mo86928a(i, user, eVar.f151669d, logPbBean, str8, eVar.f151672g.getUserRelationType(), eVar.f151671f);
                C33744d a2 = new C33744d().mo59983a("search_position", bVar.f118566j).mo59983a("new_sug_session_id", C51489f.f118674a).mo59983a("impr_id", str8).mo59983a("raw_query", bVar.f118567k).mo59983a("sug_user_id", eVar.f151672g.getUserId()).mo59983a("user_tag", eVar.f151672g.getUserRelationType()).mo59980a("words_position", bVar.getAdapterPosition());
                Word word = eVar.f151671f;
                String str9 = null;
                if (word != null) {
                    str = word.getWordSource();
                } else {
                    str = null;
                }
                C33744d a3 = a2.mo59983a("words_source", str);
                Word word2 = eVar.f151671f;
                if (word2 != null) {
                    str9 = word2.getId();
                }
                C39162r.m79460a("trending_words_show", a3.mo59983a("group_id", str9).f79943a);
                return;
            }
            List<? extends SummonFriendItem> list4 = this.f118547c;
            if (list4 != null) {
                bVar.mo86927a(i, (SummonFriendItem) list4.get(i - i2));
            }
        }
    }
}
