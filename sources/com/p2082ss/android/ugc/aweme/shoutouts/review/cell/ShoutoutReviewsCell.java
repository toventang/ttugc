package com.p2082ss.android.ugc.aweme.shoutouts.review.cell;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC0216c;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.google.gson.C27910f;
import com.google.p1998c.p2006h.p2007a.AbstractC27645k;
import com.google.p1998c.p2006h.p2007a.C27646l;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.ExecutorC34605m;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.comment.p2500n.C36548b;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.aweme.shoutouts.model.ShoutoutsRatingDeleteApi;
import com.p2082ss.android.ugc.aweme.shoutouts.review.C74528a;
import com.p2082ss.android.ugc.aweme.shoutouts.review.ShoutoutsReviewsViewModel;
import com.p2082ss.android.ugc.aweme.shoutouts.review.p3903a.AbstractC74530a;
import com.p2082ss.android.ugc.aweme.shoutouts.review.p3904b.C74542b;
import com.p2082ss.android.ugc.aweme.shoutouts.review.p3904b.C74543c;
import com.p2082ss.android.ugc.aweme.shoutouts.review.view.ShoutOutRatingBar;
import com.p2082ss.android.ugc.aweme.translation.api.TranslationApi;
import com.p2082ss.android.ugc.aweme.translation.p4142a.C79027a;
import com.p2082ss.android.ugc.aweme.translation.p4142a.C79030c;
import com.p2082ss.android.ugc.aweme.utils.C80228av;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.aweme.utils.C80566ib;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.utils.C80581io;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Objects;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.review.cell.ShoutoutReviewsCell */
public final class ShoutoutReviewsCell extends PowerCell<C74542b> implements View.OnClickListener {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f167642a = {new C89232y(ShoutoutReviewsCell.class, "reviewControl", "getReviewControl()Lcom/ss/android/ugc/aweme/shoutouts/review/controller/IShoutoutReviewControl;", 0)};

    /* renamed from: b */
    public static final C74552b f167643b = new C74552b((byte) 0);

    /* renamed from: j */
    private TextView f167644j;

    /* renamed from: k */
    private TextView f167645k;

    /* renamed from: l */
    private TextView f167646l;

    /* renamed from: m */
    private SmartAvatarImageView f167647m;

    /* renamed from: n */
    private ShoutOutRatingBar f167648n;

    /* renamed from: o */
    private final AbstractC89248d f167649o = new C74551a(this);

    static {
        Covode.recordClassIndex(87357);
    }

    /* renamed from: a */
    public final AbstractC74530a mo117216a() {
        return (AbstractC74530a) this.f167649o.mo23374a(this, f167642a[0]);
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.cell.ShoutoutReviewsCell$b */
    public static final class C74552b {
        static {
            Covode.recordClassIndex(87359);
        }

        private C74552b() {
        }

        public /* synthetic */ C74552b(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: k */
    public final void mo28072k() {
        super.mo28072k();
        this.itemView.setOnLongClickListener(new View$OnLongClickListenerC74553c(this));
        TextView textView = this.f167644j;
        if (textView == null) {
            C89219l.m154710a("tvUserName");
        }
        textView.setOnClickListener(this);
        SmartAvatarImageView smartAvatarImageView = this.f167647m;
        if (smartAvatarImageView == null) {
            C89219l.m154710a("ivUserAvatar");
        }
        smartAvatarImageView.setOnClickListener(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.cell.ShoutoutReviewsCell$a */
    public static final class C74551a implements AbstractC89248d<Object, AbstractC74530a> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f167650a;

        static {
            Covode.recordClassIndex(87358);
        }

        public C74551a(PowerCell powerCell) {
            this.f167650a = powerCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0049, code lost:
            if (r0 == null) goto L_0x004b;
         */
        @Override // p4600h.p4616h.AbstractC89248d
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.p2082ss.android.ugc.aweme.shoutouts.review.p3903a.AbstractC74530a mo23374a(java.lang.Object r6, p4600h.p4620k.AbstractC89286i r7) {
            /*
            // Method dump skipped, instructions count: 149
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shoutouts.review.cell.ShoutoutReviewsCell.C74551a.mo23374a(java.lang.Object, h.k.i):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.cell.ShoutoutReviewsCell$e */
    public static final class C74557e implements AbstractC27645k<C79027a> {

        /* renamed from: a */
        final /* synthetic */ ShoutoutReviewsCell f167660a;

        /* renamed from: b */
        final /* synthetic */ C74542b f167661b;

        static {
            Covode.recordClassIndex(87364);
        }

        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
        public final void onFailure(Throwable th) {
            C89219l.m154721d(th, "");
            C74543c.m130970a(this.f167661b);
            AbstractC74530a a = this.f167660a.mo117216a();
            if (a != null) {
                a.mo117193a(this.f167661b);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
        public final /* synthetic */ void onSuccess(C79027a aVar) {
            C79027a aVar2 = aVar;
            if (aVar2 != null) {
                try {
                    C74542b bVar = this.f167661b;
                    C79030c cVar = aVar2.f177634a.get(0);
                    C89219l.m154716b(cVar, "");
                    bVar.f167620j = cVar.f177641a;
                    C74542b bVar2 = this.f167661b;
                    C89219l.m154721d(bVar2, "");
                    bVar2.f167622l = 2;
                    this.f167661b.f167621k = true;
                    AbstractC74530a a = this.f167660a.mo117216a();
                    if (a != null) {
                        a.mo117193a(this.f167661b);
                        if (C89391z.f203057a != null) {
                            return;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    C74543c.m130970a(this.f167661b);
                    AbstractC74530a a2 = this.f167660a.mo117216a();
                    if (a2 != null) {
                        a2.mo117193a(this.f167661b);
                        return;
                    }
                    return;
                }
            }
            C74543c.m130970a(this.f167661b);
            AbstractC74530a a3 = this.f167660a.mo117216a();
            if (a3 != null) {
                a3.mo117193a(this.f167661b);
            }
        }

        C74557e(ShoutoutReviewsCell shoutoutReviewsCell, C74542b bVar) {
            this.f167660a = shoutoutReviewsCell;
            this.f167661b = bVar;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.azo, viewGroup, false);
        View findViewById = a.findViewById(R.id.f6t);
        C89219l.m154716b(findViewById, "");
        this.f167644j = (TextView) findViewById;
        View findViewById2 = a.findViewById(R.id.eu0);
        C89219l.m154716b(findViewById2, "");
        this.f167645k = (TextView) findViewById2;
        View findViewById3 = a.findViewById(R.id.ety);
        C89219l.m154716b(findViewById3, "");
        this.f167646l = (TextView) findViewById3;
        View findViewById4 = a.findViewById(R.id.c15);
        C89219l.m154716b(findViewById4, "");
        this.f167647m = (SmartAvatarImageView) findViewById4;
        View findViewById5 = a.findViewById(R.id.def);
        C89219l.m154716b(findViewById5, "");
        this.f167648n = (ShoutOutRatingBar) findViewById5;
        C89219l.m154716b(a, "");
        return a;
    }

    public final void onClick(View view) {
        String str;
        ClickAgent.onClick(view);
        if (view != null) {
            TextView textView = this.f167644j;
            if (textView == null) {
                C89219l.m154710a("tvUserName");
            }
            if (!C89219l.m154714a(view, textView)) {
                SmartAvatarImageView smartAvatarImageView = this.f167647m;
                if (smartAvatarImageView == null) {
                    C89219l.m154710a("ivUserAvatar");
                }
                if (!C89219l.m154714a(view, smartAvatarImageView)) {
                    return;
                }
            }
            Context context = view.getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            SmartRoute buildRoute = SmartRouter.buildRoute((Activity) context, "aweme://user/profile/");
            C74542b bVar = (C74542b) this.f42160d;
            String str2 = null;
            if (bVar != null) {
                str = bVar.f167616f;
            } else {
                str = null;
            }
            SmartRoute withParam = buildRoute.withParam("uid", str).withParam("extra_from_pre_page", "notification_page");
            C74542b bVar2 = (C74542b) this.f42160d;
            if (bVar2 != null) {
                str2 = bVar2.f167617g;
            }
            withParam.withParam("sec_uid", str2).open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.cell.ShoutoutReviewsCell$c */
    static final class View$OnLongClickListenerC74553c implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ ShoutoutReviewsCell f167651a;

        static {
            Covode.recordClassIndex(87360);
        }

        View$OnLongClickListenerC74553c(ShoutoutReviewsCell shoutoutReviewsCell) {
            this.f167651a = shoutoutReviewsCell;
        }

        public final boolean onLongClick(View view) {
            String str;
            C74542b bVar = (C74542b) this.f167651a.f42160d;
            if (bVar != null) {
                C89219l.m154721d(bVar, "");
                if (bVar.f167622l != 1) {
                    ShoutoutReviewsCell shoutoutReviewsCell = this.f167651a;
                    ArrayList arrayList = new ArrayList();
                    ShoutoutsReviewsViewModel shoutoutsReviewsViewModel = (ShoutoutsReviewsViewModel) PowerCell.m32711a(shoutoutReviewsCell, ShoutoutsReviewsViewModel.class);
                    if (shoutoutsReviewsViewModel != null) {
                        View view2 = shoutoutReviewsCell.itemView;
                        C89219l.m154716b(view2, "");
                        arrayList.add(view2.getResources().getString(R.string.au1));
                        C74542b bVar2 = (C74542b) shoutoutReviewsCell.f42160d;
                        if (bVar2 != null) {
                            View view3 = shoutoutReviewsCell.itemView;
                            C89219l.m154716b(view3, "");
                            Resources resources = view3.getResources();
                            String str2 = bVar2.f167616f;
                            IAccountUserService g = C31575b.m65865g();
                            if (g != null) {
                                str = g.getCurUserId();
                            } else {
                                str = null;
                            }
                            if (C89219l.m154714a((Object) str2, (Object) str)) {
                                arrayList.add(resources.getString(R.string.b4w));
                            } else {
                                if (!bVar2.f167621k) {
                                    arrayList.add(resources.getString(R.string.am8));
                                } else {
                                    arrayList.add(resources.getString(R.string.alq));
                                }
                                arrayList.add(resources.getString(R.string.fa_));
                            }
                            View view4 = shoutoutReviewsCell.itemView;
                            C89219l.m154716b(view4, "");
                            C74528a aVar = new C74528a(view4.getContext());
                            Object[] array = arrayList.toArray(new CharSequence[0]);
                            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                            CharSequence[] charSequenceArr = (CharSequence[]) array;
                            DialogInterface$OnClickListenerC74554d dVar = new DialogInterface$OnClickListenerC74554d(shoutoutReviewsCell, arrayList, resources, bVar2, shoutoutsReviewsViewModel);
                            DialogInterfaceC0216c.C0217a aVar2 = aVar.f167589a;
                            if (aVar2 != null) {
                                aVar2.mo448a(new C74528a.C74529a(aVar.f167590b, charSequenceArr), dVar);
                            }
                            DialogInterfaceC0216c.C0217a aVar3 = aVar.f167589a;
                            if (aVar3 != null) {
                                aVar3.mo458b();
                            }
                        }
                    }
                }
            }
            return true;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo23350a(C74542b bVar) {
        String str;
        String str2;
        Long g;
        C74542b bVar2 = bVar;
        C89219l.m154721d(bVar2, "");
        String str3 = bVar2.f167614d;
        if (!(str3 == null || (g = C89361p.m154865g(str3)) == null)) {
            TextView textView = this.f167645k;
            if (textView == null) {
                C89219l.m154710a("tvCommentTime");
            }
            View view = this.itemView;
            C89219l.m154716b(view, "");
            textView.setText(C80566ib.m139651a(view.getContext(), g.longValue() * 1000));
        }
        TextView textView2 = this.f167644j;
        if (textView2 == null) {
            C89219l.m154710a("tvUserName");
        }
        textView2.setText(bVar2.f167612b);
        C74542b bVar3 = (C74542b) this.f42160d;
        if (bVar3 == null || !bVar3.f167619i) {
            int i = Build.VERSION.SDK_INT;
            TextView textView3 = this.f167644j;
            if (textView3 == null) {
                C89219l.m154710a("tvUserName");
            }
            textView3.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            Context context = view2.getContext();
            TextView textView4 = this.f167644j;
            if (textView4 == null) {
                C89219l.m154710a("tvUserName");
            }
            C80581io.m139704a(context, "shoutouts", null, textView4);
        }
        TextView textView5 = this.f167646l;
        if (textView5 == null) {
            C89219l.m154710a("tvCommentContent");
        }
        if (bVar2.f167621k) {
            str = bVar2.f167620j;
        } else {
            str = bVar2.f167613c;
        }
        textView5.setText(str);
        ShoutOutRatingBar shoutOutRatingBar = this.f167648n;
        if (shoutOutRatingBar == null) {
            C89219l.m154710a("ratingBar");
        }
        shoutOutRatingBar.setStar((float) bVar2.f167615e);
        int a = C34728n.m70946a(24.0d);
        C74542b bVar4 = (C74542b) this.f42160d;
        if (bVar4 != null && (str2 = bVar4.f167618h) != null) {
            C20766v a2 = C20761r.m39061a(str2);
            C89219l.m154716b(a2, "");
            C20766v a3 = a2.mo34185b(C80397em.m139369a(100)).mo34176a(a, a);
            a3.f49098K = true;
            C20766v a4 = a3.mo34179a("ShoutoutReviewsCell");
            SmartAvatarImageView smartAvatarImageView = this.f167647m;
            if (smartAvatarImageView == null) {
                C89219l.m154710a("ivUserAvatar");
            }
            a4.f49092E = smartAvatarImageView;
            a4.mo34186c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.cell.ShoutoutReviewsCell$d */
    static final class DialogInterface$OnClickListenerC74554d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ShoutoutReviewsCell f167652a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f167653b;

        /* renamed from: c */
        final /* synthetic */ Resources f167654c;

        /* renamed from: d */
        final /* synthetic */ C74542b f167655d;

        /* renamed from: e */
        final /* synthetic */ ShoutoutsReviewsViewModel f167656e;

        static {
            Covode.recordClassIndex(87361);
        }

        DialogInterface$OnClickListenerC74554d(ShoutoutReviewsCell shoutoutReviewsCell, ArrayList arrayList, Resources resources, C74542b bVar, ShoutoutsReviewsViewModel shoutoutsReviewsViewModel) {
            this.f167652a = shoutoutReviewsCell;
            this.f167653b = arrayList;
            this.f167654c = resources;
            this.f167655d = bVar;
            this.f167656e = shoutoutsReviewsViewModel;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            String str;
            String str2;
            dialogInterface.dismiss();
            Object obj = this.f167653b.get(i);
            if (C89219l.m154714a(obj, (Object) this.f167654c.getString(R.string.au1))) {
                C74542b bVar = (C74542b) this.f167652a.f42160d;
                if (bVar != null) {
                    try {
                        IAccountUserService g = C31575b.m65865g();
                        C89219l.m154716b(g, "");
                        User curUser = g.getCurUser();
                        StringBuilder append = new StringBuilder().append(C17867d.m33078a().getResources().getString(R.string.au4, C80580in.m139676a(curUser)));
                        if (bVar.f167621k) {
                            str2 = bVar.f167620j;
                        } else {
                            str2 = bVar.f167613c;
                        }
                        C80228av.m139063a("copy_label", append.append(str2).toString(), C17867d.m33078a(), PrivacyCert.Builder.Companion.with("bpea-222").usage("Long press the comment content to provide copy function. ").tag("longPressToCopyComment").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } else if (C89219l.m154714a(obj, (Object) this.f167654c.getString(R.string.am8))) {
                ShoutoutReviewsCell shoutoutReviewsCell = this.f167652a;
                C74542b bVar2 = this.f167655d;
                try {
                    C89219l.m154721d(bVar2, "");
                    bVar2.f167622l = 1;
                    AbstractC74530a a = shoutoutReviewsCell.mo117216a();
                    if (a != null) {
                        a.mo117193a(bVar2);
                    }
                    C36548b bVar3 = new C36548b();
                    C74542b bVar4 = (C74542b) shoutoutReviewsCell.f42160d;
                    if (bVar4 != null) {
                        str = bVar4.f167613c;
                    } else {
                        str = null;
                    }
                    bVar3.mo64266a(str);
                    bVar3.f86539b = SettingServiceImpl.m120782v().mo108872h();
                    C27646l.m55298a(TranslationApi.m137860a(bVar3.f86539b, new C27910f().mo46674b(bVar3.f86538a), 2), new C74557e(shoutoutReviewsCell, bVar2), ExecutorC34605m.f81660a);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    C74543c.m130970a(bVar2);
                    AbstractC74530a a2 = shoutoutReviewsCell.mo117216a();
                    if (a2 != null) {
                        a2.mo117193a(bVar2);
                    }
                }
            } else if (C89219l.m154714a(obj, (Object) this.f167654c.getString(R.string.alq))) {
                this.f167655d.f167621k = false;
                AbstractC74530a a3 = this.f167652a.mo117216a();
                if (a3 != null) {
                    a3.mo117193a(this.f167655d);
                }
            } else if (C89219l.m154714a(obj, (Object) this.f167654c.getString(R.string.fa_))) {
                View view = this.f167652a.itemView;
                C89219l.m154716b(view, "");
                Context context = view.getContext();
                Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                Activity activity = (Activity) context;
                C74542b bVar5 = this.f167655d;
                String str3 = this.f167656e.f167576a;
                Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("object_id", bVar5.f167611a).appendQueryParameter("comment_with_emoji", "0").appendQueryParameter("owner_id", bVar5.f167616f).appendQueryParameter("report_type", "shoutout_order_comment");
                appendQueryParameter.appendQueryParameter("locale", SettingServiceImpl.m120782v().mo108872h());
                if (!TextUtils.isEmpty(str3)) {
                    appendQueryParameter.appendQueryParameter("video_owner_id", str3);
                }
                Bundle bundle = new Bundle();
                double f = (double) C34723i.m70933f(activity);
                Double.isNaN(f);
                bundle.putInt("half_screen_height", (int) (f * 0.9d));
                C39223a.m79587a().mo68689a(activity, appendQueryParameter, bundle);
            } else if (C89219l.m154714a(obj, (Object) this.f167654c.getString(R.string.b4w))) {
                final C74542b bVar6 = this.f167655d;
                ShoutoutsReviewsViewModel shoutoutsReviewsViewModel = this.f167656e;
                String str4 = bVar6.f167611a;
                C745551 r3 = new AbstractC89171a<C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.shoutouts.review.cell.ShoutoutReviewsCell.DialogInterface$OnClickListenerC74554d.C745551 */

                    /* renamed from: a */
                    final /* synthetic */ DialogInterface$OnClickListenerC74554d f167657a;

                    static {
                        Covode.recordClassIndex(87362);
                    }

                    {
                        this.f167657a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        AbstractC74530a a = this.f167657a.f167652a.mo117216a();
                        if (a != null) {
                            a.mo117194a(new C74558a(bVar6));
                        }
                        return C89391z.f203057a;
                    }
                };
                C745562 r2 = C745562.f167659a;
                Object a4 = RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(ShoutoutsRatingDeleteApi.class);
                C89219l.m154716b(a4, "");
                ((ShoutoutsRatingDeleteApi) a4).deleteRating(shoutoutsReviewsViewModel.f167577b, str4).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo116431a_(new ShoutoutsReviewsViewModel.C74527c(r3, r2));
            }
        }
    }
}
