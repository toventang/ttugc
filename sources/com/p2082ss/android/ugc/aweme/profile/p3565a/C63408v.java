package com.p2082ss.android.ugc.aweme.profile.p3565a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.challenge.AbstractC35500d;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStory;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.story.api.AbstractC76444b;
import com.p2082ss.android.ugc.aweme.story.avatar.AbstractC76504c;
import com.p2082ss.android.ugc.aweme.story.model.C77384g;
import com.p2082ss.android.ugc.aweme.story.p4024c.C76660b;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.a.v */
public final class C63408v extends RecyclerView.ViewHolder {

    /* renamed from: f */
    public static final C63411a f143954f = new C63411a((byte) 0);

    /* renamed from: a */
    public Aweme f143955a;

    /* renamed from: b */
    public long f143956b = -1;

    /* renamed from: c */
    public final View f143957c;

    /* renamed from: d */
    public final String f143958d;

    /* renamed from: e */
    public final C63347b f143959e;

    static {
        Covode.recordClassIndex(74699);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.a.v$a */
    public static final class C63411a {
        static {
            Covode.recordClassIndex(74702);
        }

        private C63411a() {
        }

        public /* synthetic */ C63411a(byte b) {
            this();
        }

        /* renamed from: a */
        public static int m114972a(List<? extends Aweme> list) {
            if (list != null) {
                int i = 0;
                for (Aweme aweme : list) {
                    if (aweme.getAwemeType() == 40) {
                        return i;
                    }
                    i++;
                }
            }
            return -1;
        }

        /* renamed from: a */
        public static boolean m114973a(int i, User user) {
            boolean z;
            boolean z2;
            String str;
            boolean z3;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            AbstractC76504c d = C77260g.f173332a.mo120156d();
            if (d != null) {
                z2 = d.mo120233a(user);
            } else {
                z2 = false;
            }
            AbstractC76444b e = C77260g.f173332a.mo120157e();
            if (user == null || (str = user.getUid()) == null) {
                str = "";
            }
            if (e.mo120171a(str) != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!C76660b.m134246f() || !z || (!z2 && !z3)) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public static boolean m114974a(Aweme aweme, Aweme aweme2) {
            C89219l.m154721d(aweme, "");
            C89219l.m154721d(aweme2, "");
            UserStory userStory = aweme.getUserStory();
            if (userStory != null) {
                long addToCacheTime = userStory.getAddToCacheTime();
                UserStory userStory2 = aweme2.getUserStory();
                if (userStory2 == null || userStory2.getAddToCacheTime() < addToCacheTime) {
                    return false;
                }
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.a.v$c */
    static final class C63413c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C63413c f143963a = new C63413c();

        static {
            Covode.recordClassIndex(74704);
        }

        C63413c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C51423a.m95790a((Throwable) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.a.v$b */
    static final class C63412b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C63408v f143962a;

        static {
            Covode.recordClassIndex(74703);
        }

        C63412b(C63408v vVar) {
            this.f143962a = vVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f143962a.f143956b = ((C77384g) obj).getPlayVideoViewers();
            TuxTextView tuxTextView = (TuxTextView) this.f143962a.f143957c.findViewById(R.id.f18);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setText(C53437b.m98615a(this.f143962a.f143956b));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63408v(View view, String str, C63347b bVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
        this.f143957c = view;
        this.f143958d = str;
        this.f143959e = bVar;
        view.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.profile.p3565a.C63408v.View$OnClickListenerC634091 */

            /* renamed from: a */
            final /* synthetic */ C63408v f143960a;

            static {
                Covode.recordClassIndex(74700);
            }

            {
                this.f143960a = r1;
            }

            public final void onClick(View view) {
                User author;
                AbstractC76504c d;
                String str;
                String str2;
                ClickAgent.onClick(view);
                AbstractC35500d dVar = this.f143960a.f143959e.f143799g;
                if (dVar != null) {
                    dVar.mo62403a(this.f143960a.f143957c, this.f143960a.f143955a, this.f143960a.f143958d);
                }
                Aweme aweme = this.f143960a.f143955a;
                if (aweme != null && (author = aweme.getAuthor()) != null && (d = C77260g.f173332a.mo120156d()) != null) {
                    User b = C80580in.m139683b();
                    C89219l.m154716b(b, "");
                    if (C89219l.m154714a((Object) b.getUid(), (Object) author.getUid())) {
                        str = "personal_homepage";
                    } else {
                        str = "others_homepage";
                    }
                    Aweme aweme2 = this.f143960a.f143955a;
                    if (aweme2 != null) {
                        str2 = aweme2.getRequestId();
                    } else {
                        str2 = null;
                    }
                    d.mo120231a("story_click", str, author, str2, new C89378p[0]);
                }
            }
        });
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
            /* class com.p2082ss.android.ugc.aweme.profile.p3565a.C63408v.View$OnAttachStateChangeListenerC634102 */

            /* renamed from: a */
            final /* synthetic */ C63408v f143961a;

            static {
                Covode.recordClassIndex(74701);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f143961a = r1;
            }

            public final void onViewDetachedFromWindow(View view) {
                ((SmartImageView) this.f143961a.f143957c.findViewById(R.id.buj)).setAttached(false);
            }

            public final void onViewAttachedToWindow(View view) {
                User author;
                AbstractC76504c d;
                String str;
                String str2;
                ((SmartImageView) this.f143961a.f143957c.findViewById(R.id.buj)).setAttached(true);
                Aweme aweme = this.f143961a.f143955a;
                if (aweme != null && (author = aweme.getAuthor()) != null && (d = C77260g.f173332a.mo120156d()) != null) {
                    User b = C80580in.m139683b();
                    C89219l.m154716b(b, "");
                    if (C89219l.m154714a((Object) b.getUid(), (Object) author.getUid())) {
                        str = "personal_homepage";
                    } else {
                        str = "others_homepage";
                    }
                    Aweme aweme2 = this.f143961a.f143955a;
                    if (aweme2 != null) {
                        str2 = aweme2.getRequestId();
                    } else {
                        str2 = null;
                    }
                    d.mo120231a("story_show", str, author, str2, new C89378p[0]);
                }
            }
        });
    }
}
