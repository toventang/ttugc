package com.p2082ss.android.ugc.aweme.notification.view.template;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteRoundImageView;
import com.p2082ss.android.ugc.aweme.follow.widet.C51086a;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61630e;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.p3517a.C61619a;
import com.p2082ss.android.ugc.aweme.notice.repo.list.p3517a.C61620b;
import com.p2082ss.android.ugc.aweme.notice.repo.list.p3517a.C61621c;
import com.p2082ss.android.ugc.aweme.notice.repo.list.p3517a.C61623e;
import com.p2082ss.android.ugc.aweme.notice.repo.list.p3517a.C61624f;
import com.p2082ss.android.ugc.aweme.notification.p3520b.C61862a;
import com.p2082ss.android.ugc.aweme.notification.p3520b.C61863b;
import com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractC62099d;
import com.p2082ss.android.ugc.aweme.notification.p3529h.C62135q;
import com.p2082ss.android.ugc.aweme.notification.p3529h.p3530a.AbstractC62027a;
import com.p2082ss.android.ugc.aweme.notification.utils.C62259e;
import com.p2082ss.android.ugc.aweme.notification.view.C62285b;
import com.p2082ss.android.ugc.aweme.notification.view.C62307g;
import com.p2082ss.android.ugc.aweme.notification.view.FollowTuxTextView;
import com.p2082ss.android.ugc.aweme.notification.view.NotificationBoldSpan;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.aweme.views.MutualRelationView;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.view.template.NoticeTemplateMiddleView */
public final class NoticeTemplateMiddleView extends AbstractView$OnClickListenerC62342g {

    /* renamed from: a */
    public static final C62312a f141430a = new C62312a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f141431b;

    /* renamed from: c */
    private final AbstractC89244h f141432c;

    /* renamed from: d */
    private SparseArray f141433d;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.view.template.NoticeTemplateMiddleView$b */
    public static final class C62313b {

        /* renamed from: c */
        public static final C62314a f141434c = new C62314a((byte) 0);

        /* renamed from: a */
        public int f141435a = Integer.MAX_VALUE;

        /* renamed from: b */
        public final C61630e f141436b;

        static {
            Covode.recordClassIndex(73097);
        }

        /* renamed from: com.ss.android.ugc.aweme.notification.view.template.NoticeTemplateMiddleView$b$a */
        public static final class C62314a {
            static {
                Covode.recordClassIndex(73098);
            }

            private C62314a() {
            }

            public /* synthetic */ C62314a(byte b) {
                this();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
            if (r0.f139850k == 11) goto L_0x0032;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x006a, code lost:
            if (r2.intValue() == 10) goto L_0x0063;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C62313b(com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61630e r7, boolean r8) {
            /*
            // Method dump skipped, instructions count: 111
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.view.template.NoticeTemplateMiddleView.C62313b.<init>(com.ss.android.ugc.aweme.notice.repo.list.bean.e, boolean):void");
        }
    }

    static {
        Covode.recordClassIndex(73095);
    }

    public NoticeTemplateMiddleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.view.template.AbstractView$OnClickListenerC62342g
    /* renamed from: a */
    public final View mo100306a(int i) {
        if (this.f141433d == null) {
            this.f141433d = new SparseArray();
        }
        View view = (View) this.f141433d.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f141433d.put(i, findViewById);
        return findViewById;
    }

    public final int getNormalTextColor() {
        return ((Number) this.f141431b.getValue()).intValue();
    }

    public final int getPressedTextColor() {
        return ((Number) this.f141432c.getValue()).intValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.view.template.NoticeTemplateMiddleView$a */
    public static final class C62312a {
        static {
            Covode.recordClassIndex(73096);
        }

        private C62312a() {
        }

        public /* synthetic */ C62312a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m112728a(C17191a.C17192a aVar, C61621c cVar, AbstractC89183m<? super C61623e, ? super C17191a.C17192a, C89391z> mVar) {
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(cVar, "");
            String str = cVar.f139845f;
            if (str == null) {
                str = "";
            }
            int i = 0;
            if (str.length() != 0) {
                List list = cVar.f139855p;
                if (list == null) {
                    list = C89086z.INSTANCE;
                }
                int size = list.size();
                Matcher matcher = Pattern.compile("\\[\\[text_link_(\\d)\\]\\]").matcher(str);
                while (matcher.find()) {
                    if (i != matcher.start()) {
                        int start = matcher.start();
                        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                        String substring = str.substring(i, start);
                        C89219l.m154716b(substring, "");
                        aVar.mo27177a(substring);
                    }
                    i = matcher.end();
                    int intValue = Integer.valueOf(matcher.group(1)).intValue() - 1;
                    if (size > intValue && list.get(intValue) != null) {
                        C61623e eVar = (C61623e) list.get(intValue);
                        if (mVar == null) {
                            String str2 = eVar.f139862b;
                            if (str2 != null) {
                                aVar.mo27177a(str2);
                            }
                        } else {
                            mVar.invoke(eVar, aVar);
                        }
                    }
                }
                if (i < str.length()) {
                    Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                    String substring2 = str.substring(i);
                    C89219l.m154716b(substring2, "");
                    aVar.mo27177a(substring2);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.view.template.AbstractView$OnClickListenerC62342g
    public final EnumC62343h getTemplatePosition() {
        return EnumC62343h.Middle;
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.view.template.NoticeTemplateMiddleView$f */
    static final class C62318f extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ Context f141442a;

        static {
            Covode.recordClassIndex(73102);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62318f(Context context) {
            super(0);
            this.f141442a = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C0643b.m2378c(this.f141442a, R.color.bx));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.view.template.NoticeTemplateMiddleView$g */
    static final class C62319g extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ Context f141443a;

        static {
            Covode.recordClassIndex(73103);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62319g(Context context) {
            super(0);
            this.f141443a = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C0643b.m2378c(this.f141443a, R.color.c4));
        }
    }

    /* renamed from: a */
    private final float m112718a() {
        C61621c cVar;
        Integer valueOf;
        C61630e templateNotice = getTemplateNotice();
        if (templateNotice == null || (cVar = templateNotice.f139886b) == null || (valueOf = Integer.valueOf(cVar.f139850k)) == null) {
            return 0.0f;
        }
        if (valueOf.intValue() == 10) {
            return 192.0f;
        }
        if (valueOf.intValue() == 11) {
            return 146.0f;
        }
        if (valueOf.intValue() == 12 || valueOf.intValue() == 13) {
            return 132.0f;
        }
        return 0.0f;
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.view.template.AbstractView$OnClickListenerC62342g
    /* renamed from: a */
    public final boolean mo100308a(View view) {
        String b = mo100309b(view);
        if (b == null) {
            return false;
        }
        mo100329a(b);
        return true;
    }

    /* renamed from: c */
    private final C62313b m112723c(C62313b bVar) {
        C61621c cVar;
        C61620b bVar2;
        C61630e eVar = bVar.f141436b;
        if (!(eVar == null || (cVar = eVar.f139886b) == null || (bVar2 = cVar.f139844e) == null)) {
            m112721a((MutualRelationView) mo100306a(R.id.cp5), bVar2);
        }
        return bVar;
    }

    /* renamed from: b */
    private final C62313b m112722b(C62313b bVar) {
        String str;
        C61621c cVar;
        C61621c cVar2;
        String str2;
        if (getMBaseNotice() == null) {
            return bVar;
        }
        TuxTextView tuxTextView = (TuxTextView) mo100306a(R.id.cu7);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setVisibility(0);
        mo100328a(mo100306a(R.id.cu7), this);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        C61630e eVar = bVar.f141436b;
        if (eVar == null || (cVar2 = eVar.f139886b) == null || (str2 = cVar2.f139845f) == null || spannableStringBuilder.append((CharSequence) str2) == null) {
            ((TuxTextView) mo100306a(R.id.cu7)).setTextColor(C0643b.m2378c(getContext(), R.color.c5));
            C61630e eVar2 = bVar.f141436b;
            if (eVar2 == null || (cVar = eVar2.f139886b) == null || (str = cVar.f139846g) == null) {
                str = "";
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        TuxTextView tuxTextView2 = (TuxTextView) mo100306a(R.id.cu7);
        C89219l.m154716b(tuxTextView2, "");
        MusNotice mBaseNotice = getMBaseNotice();
        if (mBaseNotice == null) {
            C89219l.m154715b();
        }
        C62135q.m112363a(tuxTextView2, spannableStringBuilder, mBaseNotice, bVar.f141435a, 0);
        return bVar;
    }

    /* renamed from: a */
    private final C62313b m112719a(C62313b bVar) {
        C61621c cVar;
        C61624f fVar;
        C61619a aVar;
        User user;
        C61630e eVar = bVar.f141436b;
        if (!(eVar == null || (cVar = eVar.f139886b) == null || (fVar = cVar.f139843d) == null || (aVar = fVar.f139870e) == null)) {
            FollowTuxTextView followTuxTextView = (FollowTuxTextView) mo100306a(R.id.cv0);
            C89219l.m154716b(followTuxTextView, "");
            followTuxTextView.setVisibility(0);
            FollowTuxTextView followTuxTextView2 = (FollowTuxTextView) mo100306a(R.id.cv0);
            C89219l.m154716b(followTuxTextView2, "");
            followTuxTextView2.setText(aVar.f139833c);
            int i = aVar.f139832b;
            if (i == 0) {
                Context context = getContext();
                C89219l.m154716b(context, "");
                ((FollowTuxTextView) mo100306a(R.id.cv0)).setTextColor(context.getResources().getColor(R.color.c5));
            } else if (i == 1) {
                Context context2 = getContext();
                C89219l.m154716b(context2, "");
                ((FollowTuxTextView) mo100306a(R.id.cv0)).setTextColor(context2.getResources().getColor(R.color.b9));
            }
            int i2 = aVar.f139831a;
            if (i2 == 0) {
                ((FollowTuxTextView) mo100306a(R.id.cv0)).setOnClickListener(null);
            } else if (i2 == 1) {
                ((FollowTuxTextView) mo100306a(R.id.cv0)).setOnClickListener(this);
            } else if (!(i2 != 2 || (user = (User) C89070n.m154583g((List) fVar.f139866a)) == null || fVar.f139870e == null)) {
                ((FollowTuxTextView) mo100306a(R.id.cv0)).mo73175a(user.getFollowStatus(), user.getFollowerStatus());
                C62259e.m112622a("show", "", "inbox_interaction_message", user, bVar.f141436b.f139893i);
                new C51086a((FollowTuxTextView) mo100306a(R.id.cv0), new C62317e(fVar, this, bVar)).mo86508a(user);
            }
        }
        return bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.view.template.AbstractView$OnClickListenerC62342g
    /* renamed from: b */
    public final String mo100309b(View view) {
        Integer valueOf;
        C61621c cVar;
        C61621c cVar2;
        C61624f fVar;
        C61621c cVar3;
        C61620b bVar;
        String str;
        C61621c cVar4;
        C61624f fVar2;
        C61619a aVar;
        C61621c cVar5;
        C61624f fVar3;
        String str2 = null;
        if (view == null || (valueOf = Integer.valueOf(view.getId())) == null) {
            return null;
        }
        if (valueOf.intValue() == R.id.cu9 || valueOf.intValue() == R.id.cu7 || valueOf.intValue() == R.id.cv3) {
            C61630e templateNotice = getTemplateNotice();
            if (templateNotice == null || (cVar = templateNotice.f139886b) == null) {
                return null;
            }
            return cVar.f139849j;
        } else if (valueOf.intValue() == R.id.cuw) {
            C61630e templateNotice2 = getTemplateNotice();
            if (templateNotice2 == null || (cVar5 = templateNotice2.f139886b) == null || (fVar3 = cVar5.f139843d) == null) {
                return null;
            }
            return fVar3.f139868c;
        } else if (valueOf.intValue() == R.id.cv0) {
            C61630e templateNotice3 = getTemplateNotice();
            if (templateNotice3 == null || (cVar4 = templateNotice3.f139886b) == null || (fVar2 = cVar4.f139843d) == null || ((aVar = fVar2.f139870e) != null && (str2 = aVar.f139834d) != null)) {
                return str2;
            }
            return fVar2.f139868c;
        } else if (valueOf.intValue() != R.id.cp5) {
            return null;
        } else {
            C61630e templateNotice4 = getTemplateNotice();
            if (templateNotice4 != null && (cVar3 = templateNotice4.f139886b) != null && (bVar = cVar3.f139844e) != null && (str = bVar.f139838d) != null) {
                return str;
            }
            C61630e templateNotice5 = getTemplateNotice();
            if (templateNotice5 == null || (cVar2 = templateNotice5.f139886b) == null || (fVar = cVar2.f139843d) == null) {
                return null;
            }
            return fVar.f139868c;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.view.template.NoticeTemplateMiddleView$d */
    public static final class C62316d implements AbstractC62099d {

        /* renamed from: a */
        final /* synthetic */ NoticeTemplateMiddleView f141437a;

        /* renamed from: b */
        final /* synthetic */ C61623e f141438b;

        static {
            Covode.recordClassIndex(73100);
        }

        C62316d(NoticeTemplateMiddleView noticeTemplateMiddleView, C61623e eVar) {
            this.f141437a = noticeTemplateMiddleView;
            this.f141438b = eVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractC62099d
        /* renamed from: a */
        public final void mo100133a(View view, User user) {
            Boolean bool;
            AbstractC62027a mBridge;
            AbstractC62027a mBridge2;
            C89219l.m154721d(view, "");
            AbstractC62027a mBridge3 = this.f141437a.getMBridge();
            if (mBridge3 != null) {
                mBridge3.mo100094n();
            }
            C61623e eVar = this.f141438b;
            if (eVar != null) {
                bool = Boolean.valueOf(eVar.f139865e);
            } else {
                bool = null;
            }
            if (bool.booleanValue() && (mBridge2 = this.f141437a.getMBridge()) != null) {
                mBridge2.mo100095o();
            }
            C61623e eVar2 = this.f141438b;
            if (!(eVar2 == null || eVar2.f139864d != 1 || (mBridge = this.f141437a.getMBridge()) == null)) {
                mBridge.mo100084a(user, "click_name");
            }
            C36125t.m73598a(C36125t.m73591a(), this.f141438b.f139863c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.view.template.NoticeTemplateMiddleView$c */
    static final /* synthetic */ class C62315c extends C89217j implements AbstractC89183m<C61623e, C17191a.C17192a, C89391z> {
        static {
            Covode.recordClassIndex(73099);
        }

        C62315c(NoticeTemplateMiddleView noticeTemplateMiddleView) {
            super(2, noticeTemplateMiddleView, NoticeTemplateMiddleView.class, "buildTextLink", "buildTextLink(Lcom/ss/android/ugc/aweme/notice/repo/list/uitemplate/TextLinkConfig;Lcom/bytedance/ies/dmt/ui/text/DmtText$BidiConcat;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C61623e eVar, C17191a.C17192a aVar) {
            Integer num;
            C61623e eVar2 = eVar;
            C17191a.C17192a aVar2 = aVar;
            String str = "";
            C89219l.m154721d(eVar2, str);
            C89219l.m154721d(aVar2, str);
            NoticeTemplateMiddleView noticeTemplateMiddleView = (NoticeTemplateMiddleView) this.receiver;
            C62307g gVar = null;
            if (eVar2 != null) {
                num = Integer.valueOf(eVar2.f139861a);
            } else {
                num = null;
            }
            if (num.intValue() == 2) {
                gVar = new C62307g(null, 100, noticeTemplateMiddleView.getNormalTextColor(), noticeTemplateMiddleView.getPressedTextColor(), new C62316d(noticeTemplateMiddleView, eVar2));
            }
            String str2 = eVar2.f139862b;
            if (str2 != null) {
                str = str2;
            }
            aVar2.mo27178a(str, gVar, 33);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private final void m112721a(MutualRelationView mutualRelationView, C61620b bVar) {
        if (mutualRelationView != null && bVar != null) {
            C61863b.m112002a(mutualRelationView, bVar.f139839e, bVar.f139835a);
            String str = bVar.f139836b;
            if (str != null && C80538hl.m139614a(str)) {
                mutualRelationView.getTvDesc().setText(str);
                C61862a.m111999b(mutualRelationView);
            }
            if (bVar.f139837c != 1) {
                mutualRelationView.setOnClickListener(null);
            } else {
                mutualRelationView.setOnClickListener(this);
            }
            if (bVar.f139839e == null) {
                C61863b.m112000a(mutualRelationView, bVar.f139835a, false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.view.template.NoticeTemplateMiddleView$e */
    public static final class C62317e extends C51086a.C51094g {

        /* renamed from: a */
        final /* synthetic */ C61624f f141439a;

        /* renamed from: b */
        final /* synthetic */ NoticeTemplateMiddleView f141440b;

        /* renamed from: c */
        final /* synthetic */ C62313b f141441c;

        static {
            Covode.recordClassIndex(73101);
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.C51094g, com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
        /* renamed from: a */
        public final void mo63346a(int i, User user) {
            JSONObject jSONObject;
            super.mo63346a(i, user);
            C62259e.m112622a("follow", "", "inbox_interaction_message", user, this.f141441c.f141436b.f139893i);
            String str = this.f141441c.f141436b.f139893i;
            if (str != null) {
                jSONObject = new JSONObject(str);
            } else {
                jSONObject = new JSONObject();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
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
            C62259e.m112617a(user, linkedHashMap);
        }

        C62317e(C61624f fVar, NoticeTemplateMiddleView noticeTemplateMiddleView, C62313b bVar) {
            this.f141439a = fVar;
            this.f141440b = noticeTemplateMiddleView;
            this.f141441c = bVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0053, code lost:
        if (p4600h.C89391z.f203057a == null) goto L_0x0055;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.p2082ss.android.ugc.aweme.notification.view.template.NoticeTemplateMiddleView.C62313b m112720a(com.p2082ss.android.ugc.aweme.notification.view.template.NoticeTemplateMiddleView.C62313b r13, boolean r14) {
        /*
        // Method dump skipped, instructions count: 133
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notification.view.template.NoticeTemplateMiddleView.m112720a(com.ss.android.ugc.aweme.notification.view.template.NoticeTemplateMiddleView$b, boolean):com.ss.android.ugc.aweme.notification.view.template.NoticeTemplateMiddleView$b");
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.view.template.AbstractView$OnClickListenerC62342g
    /* renamed from: a */
    public final void mo100307a(MusNotice musNotice, AbstractC62027a aVar) {
        long j;
        boolean z;
        C61621c cVar;
        Integer valueOf;
        C61621c cVar2;
        String str;
        C61621c cVar3;
        C61621c cVar4;
        C61624f fVar;
        C61621c cVar5;
        C61621c cVar6;
        Long l;
        C89219l.m154721d(musNotice, "");
        C89219l.m154721d(aVar, "");
        super.mo100307a(musNotice, aVar);
        C61630e templateNotice = getTemplateNotice();
        if (templateNotice == null || (l = templateNotice.f139887c) == null) {
            j = 0;
        } else {
            j = l.longValue();
        }
        musNotice.createTime = j;
        TuxTextView tuxTextView = (TuxTextView) mo100306a(R.id.cuw);
        C89219l.m154716b(tuxTextView, "");
        TuxTextView tuxTextView2 = (TuxTextView) mo100306a(R.id.cu7);
        C89219l.m154716b(tuxTextView2, "");
        LinearLayout linearLayout = (LinearLayout) mo100306a(R.id.cv3);
        C89219l.m154716b(linearLayout, "");
        RemoteRoundImageView remoteRoundImageView = (RemoteRoundImageView) mo100306a(R.id.cu9);
        C89219l.m154716b(remoteRoundImageView, "");
        FollowTuxTextView followTuxTextView = (FollowTuxTextView) mo100306a(R.id.cv0);
        C89219l.m154716b(followTuxTextView, "");
        MutualRelationView mutualRelationView = (MutualRelationView) mo100306a(R.id.cp5);
        C89219l.m154716b(mutualRelationView, "");
        View[] viewArr = {tuxTextView, tuxTextView2, linearLayout, remoteRoundImageView, followTuxTextView, mutualRelationView};
        for (int i = 0; i < 6; i++) {
            viewArr[i].setVisibility(8);
        }
        ((TuxTextView) mo100306a(R.id.cu7)).setTextColor(C0643b.m2378c(getContext(), R.color.bx));
        C61630e templateNotice2 = getTemplateNotice();
        AbstractC62027a mBridge = getMBridge();
        if (mBridge != null) {
            z = mBridge.mo100091k();
        } else {
            z = false;
        }
        C62313b bVar = new C62313b(templateNotice2, z);
        C61630e templateNotice3 = getTemplateNotice();
        String str2 = null;
        r3 = null;
        String str3 = null;
        r3 = null;
        UrlModel urlModel = null;
        str2 = null;
        if (!(templateNotice3 == null || (cVar = templateNotice3.f139886b) == null || (valueOf = Integer.valueOf(cVar.f139842c)) == null)) {
            if (valueOf.intValue() == 0) {
                m112723c(m112720a(bVar, false));
                return;
            } else if (valueOf.intValue() == 1) {
                m112722b(m112723c(m112720a(bVar, true)));
                return;
            } else if (valueOf.intValue() == 2) {
                C62313b b = m112722b(m112723c(m112720a(bVar, true)));
                LinearLayout linearLayout2 = (LinearLayout) mo100306a(R.id.cv3);
                C89219l.m154716b(linearLayout2, "");
                linearLayout2.setVisibility(0);
                mo100328a(mo100306a(R.id.cv3), this);
                TuxTextView tuxTextView3 = (TuxTextView) mo100306a(R.id.cv4);
                C89219l.m154716b(tuxTextView3, "");
                C61630e eVar = b.f141436b;
                if (!(eVar == null || (cVar6 = eVar.f139886b) == null)) {
                    str3 = cVar6.f139847h;
                }
                tuxTextView3.setText(str3);
                return;
            } else if (valueOf.intValue() == 3) {
                C62313b b2 = m112722b(m112723c(m112720a(bVar, true)));
                RemoteRoundImageView remoteRoundImageView2 = (RemoteRoundImageView) mo100306a(R.id.cu9);
                C89219l.m154716b(remoteRoundImageView2, "");
                remoteRoundImageView2.setVisibility(0);
                mo100328a(mo100306a(R.id.cu9), this);
                RemoteImageView remoteImageView = (RemoteImageView) mo100306a(R.id.cu9);
                C61630e eVar2 = b2.f141436b;
                if (!(eVar2 == null || (cVar5 = eVar2.f139886b) == null)) {
                    urlModel = cVar5.f139848i;
                }
                C34577e.m70592a(remoteImageView, urlModel);
                return;
            } else if (valueOf.intValue() == 4) {
                if (getMBaseNotice() != null) {
                    TuxTextView tuxTextView4 = (TuxTextView) mo100306a(R.id.cu7);
                    C89219l.m154716b(tuxTextView4, "");
                    tuxTextView4.setVisibility(0);
                    mo100328a(mo100306a(R.id.cu7), this);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    C61630e eVar3 = bVar.f141436b;
                    if (eVar3 == null || (cVar4 = eVar3.f139886b) == null || (fVar = cVar4.f139843d) == null || (str = fVar.f139869d) == null) {
                        str = "";
                    }
                    spannableStringBuilder.append((CharSequence) str).append((CharSequence) ": ");
                    spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
                    C61630e eVar4 = bVar.f141436b;
                    if (!(eVar4 == null || (cVar3 = eVar4.f139886b) == null)) {
                        str2 = cVar3.f139845f;
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        spannableStringBuilder.append((CharSequence) str2);
                    } else {
                        spannableStringBuilder.delete(spannableStringBuilder.length() - 2, spannableStringBuilder.length());
                    }
                    TuxTextView tuxTextView5 = (TuxTextView) mo100306a(R.id.cu7);
                    C89219l.m154716b(tuxTextView5, "");
                    MusNotice mBaseNotice = getMBaseNotice();
                    if (mBaseNotice == null) {
                        C89219l.m154715b();
                    }
                    C62135q.m112363a(tuxTextView5, spannableStringBuilder, mBaseNotice, bVar.f141435a, C13628n.m24504a(getContext()) - ((int) C13628n.m24520b(getContext(), m112718a())));
                    bVar = m112719a(bVar);
                }
                m112723c(bVar);
                return;
            } else if (valueOf.intValue() == 5) {
                if (getMBaseNotice() != null) {
                    TuxTextView tuxTextView6 = (TuxTextView) mo100306a(R.id.cu7);
                    C89219l.m154716b(tuxTextView6, "");
                    tuxTextView6.setVisibility(0);
                    TuxTextView tuxTextView7 = (TuxTextView) mo100306a(R.id.cu7);
                    C89219l.m154716b(tuxTextView7, "");
                    if (C62285b.f141373d == null) {
                        C62285b.f141373d = new C62285b();
                    }
                    tuxTextView7.setMovementMethod(C62285b.f141373d);
                    C17191a.C17192a aVar2 = new C17191a.C17192a();
                    C61630e eVar5 = bVar.f141436b;
                    if (!(eVar5 == null || (cVar2 = eVar5.f139886b) == null)) {
                        String str4 = cVar2.f139845f;
                        if (str4 == null || str4.length() == 0) {
                            ((TuxTextView) mo100306a(R.id.cu7)).setTextColor(C0643b.m2378c(getContext(), R.color.c5));
                            String str5 = cVar2.f139846g;
                            if (str5 == null) {
                                str5 = "";
                            }
                            aVar2.mo27177a(str5);
                        } else {
                            C62312a.m112728a(aVar2, cVar2, new C62315c(this));
                        }
                    }
                    TuxTextView tuxTextView8 = (TuxTextView) mo100306a(R.id.cu7);
                    C89219l.m154716b(tuxTextView8, "");
                    C17191a aVar3 = aVar2.f40973a;
                    MusNotice mBaseNotice2 = getMBaseNotice();
                    if (mBaseNotice2 == null) {
                        C89219l.m154715b();
                    }
                    C62135q.m112363a(tuxTextView8, aVar3, mBaseNotice2, bVar.f141435a, C13628n.m24504a(getContext()) - ((int) C13628n.m24520b(getContext(), m112718a())));
                    bVar = m112719a(bVar);
                }
                m112723c(bVar);
                return;
            }
        }
        setVisibility(8);
    }

    private /* synthetic */ NoticeTemplateMiddleView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private NoticeTemplateMiddleView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        C1764a.m5927a(LayoutInflater.from(context), R.layout.l7, this, true);
        ((RemoteRoundImageView) mo100306a(R.id.cu9)).setOnClickListener(this);
        this.f141431b = C89250i.m154773a((AbstractC89171a) new C62318f(context));
        this.f141432c = C89250i.m154773a((AbstractC89171a) new C62319g(context));
    }
}
