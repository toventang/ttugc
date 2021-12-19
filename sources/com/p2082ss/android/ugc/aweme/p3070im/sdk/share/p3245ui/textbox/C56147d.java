package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3245ui.textbox;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Editable;
import android.text.InputFilter;
import android.util.TypedValue;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DmtEditText;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20728e;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1710c.C23008e;
import com.bytedance.tux.p1710c.C23009f;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55172ad;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55232u;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.DialogC55319a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3220a.C55712b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3235a.AbstractC55947a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3236b.C55949a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56251d;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.share.improve.pkg.CommentSharePackage;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.social.p3914a.C74712f;
import com.p2082ss.android.ugc.aweme.social.widget.C74743a;
import com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74782d;
import com.p2082ss.android.ugc.aweme.social.widget.card.C74787i;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.d */
public final class C56147d {

    /* renamed from: a */
    public final DmtEditText f128074a;

    /* renamed from: b */
    public final TuxButton f128075b;

    /* renamed from: c */
    public AbstractC74782d f128076c;

    /* renamed from: d */
    public final Activity f128077d;

    /* renamed from: e */
    public final View f128078e;

    /* renamed from: f */
    final SharePackage f128079f;

    /* renamed from: g */
    public final ShareTextBoxViewModel f128080g;

    /* renamed from: h */
    private final RemoteImageView f128081h;

    /* renamed from: i */
    private final boolean f128082i;

    /* renamed from: j */
    private final AbstractC1204m f128083j;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.d$b */
    public static final class View$OnClickListenerC56149b implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC56149b f128086a = new View$OnClickListenerC56149b();

        static {
            Covode.recordClassIndex(65950);
        }

        View$OnClickListenerC56149b() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.d$f */
    public static final class View$OnClickListenerC56153f implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC56153f f128095a = new View$OnClickListenerC56153f();

        static {
            Covode.recordClassIndex(65954);
        }

        View$OnClickListenerC56153f() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(65948);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.d$l */
    public static final class C56159l<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C56147d f128101a;

        /* renamed from: b */
        final /* synthetic */ boolean f128102b;

        static {
            Covode.recordClassIndex(65960);
        }

        C56159l(C56147d dVar, boolean z) {
            this.f128101a = dVar;
            this.f128102b = z;
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.d$l$a */
        static final class C56160a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C56159l f128103a;

            static {
                Covode.recordClassIndex(65961);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C56160a(C56159l lVar) {
                super(0);
                this.f128103a = lVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                ShareTextBoxViewModel shareTextBoxViewModel = this.f128103a.f128101a.f128080g;
                if (C89219l.m154714a((Object) shareTextBoxViewModel.f128046k.getValue(), (Object) true)) {
                    AbstractC81915c.m141874a(new C56251d((byte) 0));
                    shareTextBoxViewModel.f128042g.setValue(true);
                }
                return C89391z.f203057a;
            }
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            List<? extends User> list = (List) obj;
            if (list != null && !list.isEmpty()) {
                AbstractC74782d dVar = this.f128101a.f128076c;
                if (dVar == null) {
                    C56147d dVar2 = this.f128101a;
                    C74787i iVar = C74787i.f168102a;
                    Activity activity = dVar2.f128077d;
                    Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    ActivityC0945e eVar = (ActivityC0945e) activity;
                    String string = dVar2.f128079f.f155492i.getString("enter_from");
                    if (string == null) {
                        string = "";
                    }
                    C89219l.m154716b(string, "");
                    dVar = iVar.mo117804a(new C74743a(eVar, null, string, null, 10), C74712f.m131168a());
                    dVar.mo117837a(new C56160a(this));
                    dVar.mo117838a(new C56161b(dVar, this));
                }
                dVar.mo117839a(list);
                dVar.mo117841b();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.d$l$b */
        static final class C56161b extends AbstractC89220m implements AbstractC89172b<List<? extends IMUser>, C89391z> {

            /* renamed from: a */
            final /* synthetic */ AbstractC74782d f128104a;

            /* renamed from: b */
            final /* synthetic */ C56159l f128105b;

            static {
                Covode.recordClassIndex(65962);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C56161b(AbstractC74782d dVar, C56159l lVar) {
                super(1);
                this.f128104a = dVar;
                this.f128105b = lVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(List<? extends IMUser> list) {
                String str;
                List<? extends IMUser> list2 = list;
                C89219l.m154721d(list2, "");
                ShareTextBoxViewModel shareTextBoxViewModel = this.f128105b.f128101a.f128080g;
                Editable text = this.f128105b.f128101a.f128074a.getText();
                if (text != null) {
                    str = text.toString();
                } else {
                    str = null;
                }
                boolean z = this.f128105b.f128102b;
                C89219l.m154721d(list2, "");
                shareTextBoxViewModel.f128044i.f155492i.putBoolean("show_tips_until_cancel", false);
                shareTextBoxViewModel.f128044i.f155492i.putString("is_share_pop_up", "1");
                if (!C89219l.m154714a((Object) shareTextBoxViewModel.f128046k.getValue(), (Object) true)) {
                    shareTextBoxViewModel.f128046k.postValue(true);
                }
                String uuid = UUID.randomUUID().toString();
                C89219l.m154716b(uuid, "");
                C55949a.m101804a((List<IMContact>) list2, str, shareTextBoxViewModel.f128044i, uuid, !z, (AbstractC55947a) null);
                C55712b.m101459a(shareTextBoxViewModel.f128044i, str, C89070n.m154585g((Collection) list2));
                shareTextBoxViewModel.f128042g.setValue(true);
                this.f128104a.mo117842c();
                return C89391z.f203057a;
            }
        }
    }

    /* renamed from: a */
    public final void mo93006a(boolean z) {
        if (this.f128082i) {
            m102022b(z);
        } else {
            m102023c(z);
        }
        m102024d(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.d$g */
    public static final class C56154g<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C56147d f128096a;

        static {
            Covode.recordClassIndex(65955);
        }

        C56154g(C56147d dVar) {
            this.f128096a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            C23144b bVar = new C23144b(this.f128096a.f128078e);
            C89219l.m154716b(num, "");
            bVar.mo37640e(num.intValue()).mo37637b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.d$j */
    public static final class C56157j<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C56147d f128099a;

        static {
            Covode.recordClassIndex(65958);
        }

        C56157j(C56147d dVar) {
            this.f128099a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Float f = (Float) obj;
            TuxButton tuxButton = this.f128099a.f128075b;
            C89219l.m154716b(f, "");
            tuxButton.setAlpha(f.floatValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.d$m */
    public static final class C56162m<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C56147d f128106a;

        static {
            Covode.recordClassIndex(65963);
        }

        C56162m(C56147d dVar) {
            this.f128106a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC74782d dVar;
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue() && (dVar = this.f128106a.f128076c) != null) {
                dVar.mo117843d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.d$a */
    public static final class View$OnClickListenerC56148a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C56147d f128084a;

        /* renamed from: b */
        final /* synthetic */ boolean f128085b;

        static {
            Covode.recordClassIndex(65949);
        }

        View$OnClickListenerC56148a(C56147d dVar, boolean z) {
            this.f128084a = dVar;
            this.f128085b = z;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            if (!C55232u.m101003a(view, 500)) {
                ShareTextBoxViewModel shareTextBoxViewModel = this.f128084a.f128080g;
                Editable text = this.f128084a.f128074a.getText();
                if (text != null) {
                    str = text.toString();
                } else {
                    str = null;
                }
                shareTextBoxViewModel.mo92995a(str, this.f128085b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.d$c */
    public static final class C56150c extends AbstractC89220m implements AbstractC89172b<C23008e, C89391z> {

        /* renamed from: a */
        public static final C56150c f128087a = new C56150c();

        static {
            Covode.recordClassIndex(65951);
        }

        C56150c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23008e eVar) {
            C23008e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            eVar2.f54464c = Float.valueOf(TypedValue.applyDimension(1, 4.0f, system.getDisplayMetrics()));
            eVar2.f54463b = Integer.valueOf((int) R.attr.w);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.d$d */
    public static final class C56151d extends AbstractC20728e {

        /* renamed from: a */
        final /* synthetic */ C56147d f128088a;

        /* renamed from: b */
        final /* synthetic */ String f128089b;

        /* renamed from: c */
        final /* synthetic */ String f128090c;

        /* renamed from: d */
        final /* synthetic */ String f128091d;

        /* renamed from: e */
        final /* synthetic */ TuxTextView f128092e;

        static {
            Covode.recordClassIndex(65952);
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34166a(Throwable th) {
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34165a(Bitmap bitmap) {
            Activity activity = this.f128088a.f128077d;
            String str = this.f128089b;
            C89219l.m154716b(str, "");
            String str2 = this.f128090c;
            String str3 = this.f128091d;
            C89219l.m154716b(str3, "");
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            this.f128092e.setText(CommentSharePackage.C69213a.m122323a(activity, str, str2, str3, bitmap, C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics()))));
        }

        C56151d(C56147d dVar, String str, String str2, String str3, TuxTextView tuxTextView) {
            this.f128088a = dVar;
            this.f128089b = str;
            this.f128090c = str2;
            this.f128091d = str3;
            this.f128092e = tuxTextView;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.d$e */
    public static final class View$OnClickListenerC56152e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C56147d f128093a;

        /* renamed from: b */
        final /* synthetic */ boolean f128094b;

        static {
            Covode.recordClassIndex(65953);
        }

        View$OnClickListenerC56152e(C56147d dVar, boolean z) {
            this.f128093a = dVar;
            this.f128094b = z;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            if (!C55232u.m101003a(view, 500)) {
                ShareTextBoxViewModel shareTextBoxViewModel = this.f128093a.f128080g;
                Editable text = this.f128093a.f128074a.getText();
                if (text != null) {
                    str = text.toString();
                } else {
                    str = null;
                }
                shareTextBoxViewModel.mo92995a(str, this.f128094b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.d$h */
    public static final class C56155h<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C56147d f128097a;

        static {
            Covode.recordClassIndex(65956);
        }

        C56155h(C56147d dVar) {
            this.f128097a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C56143a aVar = (C56143a) obj;
            String string = this.f128097a.f128077d.getString(aVar.f128065a, new Object[]{Integer.valueOf(aVar.f128066b)});
            C89219l.m154716b(string, "");
            new C23144b(this.f128097a.f128078e).mo37635a(string).mo37637b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.d$k */
    public static final class C56158k<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C56147d f128100a;

        static {
            Covode.recordClassIndex(65959);
        }

        C56158k(C56147d dVar) {
            this.f128100a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            TuxButton tuxButton = this.f128100a.f128075b;
            C89219l.m154716b(bool, "");
            tuxButton.setLoading(bool.booleanValue());
            if (bool.booleanValue()) {
                this.f128100a.f128075b.setBackgroundResource(R.color.bh);
            } else {
                this.f128100a.f128075b.setBackgroundResource(R.drawable.aqz);
            }
        }
    }

    /* renamed from: c */
    private final void m102023c(boolean z) {
        this.f128074a.setFilters(new InputFilter[]{new C55172ad(this.f128074a)});
        this.f128075b.setOnClickListener(new View$OnClickListenerC56152e(this, z));
        this.f128078e.setOnClickListener(View$OnClickListenerC56153f.f128095a);
        this.f128078e.setEnabled(false);
        if (!DialogC55319a.m101128a(this.f128081h, this.f128079f, (Boolean) false)) {
            this.f128081h.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.textbox.d$i */
    public static final class C56156i<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C56147d f128098a;

        static {
            Covode.recordClassIndex(65957);
        }

        C56156i(C56147d dVar) {
            this.f128098a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C56144b bVar = (C56144b) obj;
            if (bVar.f128068b > 0) {
                this.f128098a.f128075b.setText(this.f128098a.f128077d.getString(bVar.f128067a) + " (" + bVar.f128068b + ')');
            } else {
                this.f128098a.f128075b.setText(this.f128098a.f128077d.getText(bVar.f128067a));
            }
        }
    }

    /* renamed from: d */
    private final void m102024d(boolean z) {
        this.f128080g.f128036a.observe(this.f128083j, new C56154g(this));
        this.f128080g.f128037b.observe(this.f128083j, new C56155h(this));
        this.f128080g.f128038c.observe(this.f128083j, new C56156i(this));
        this.f128080g.f128039d.observe(this.f128083j, new C56157j(this));
        this.f128080g.f128040e.observe(this.f128083j, new C56158k(this));
        this.f128080g.f128041f.observe(this.f128083j, new C56159l(this, z));
        this.f128080g.f128043h.observe(this.f128083j, new C56162m(this));
    }

    /* renamed from: b */
    private final void m102022b(boolean z) {
        MethodCollector.m26663i(5618);
        this.f128074a.setFilters(new InputFilter[]{new C55172ad(this.f128074a)});
        this.f128075b.setOnClickListener(new View$OnClickListenerC56148a(this, z));
        this.f128078e.setOnClickListener(View$OnClickListenerC56149b.f128086a);
        this.f128078e.setEnabled(false);
        this.f128081h.setVisibility(8);
        View findViewById = this.f128078e.findViewById(R.id.a9_);
        C89219l.m154716b(findViewById, "");
        TuxTextView tuxTextView = (TuxTextView) findViewById;
        tuxTextView.setVisibility(0);
        C23008e a = C23009f.m43397a(C56150c.f128087a);
        Context context = tuxTextView.getContext();
        C89219l.m154716b(context, "");
        tuxTextView.setBackground(a.mo37389a(context));
        SharePackage sharePackage = this.f128079f;
        if (sharePackage != null) {
            CommentSharePackage commentSharePackage = (CommentSharePackage) sharePackage;
            Comment comment = commentSharePackage.f154714a;
            if (comment == null) {
                C89219l.m154715b();
            }
            User user = comment.getUser();
            C89219l.m154716b(user, "");
            String nickname = user.getNickname();
            Comment comment2 = commentSharePackage.f154714a;
            if (comment2 == null) {
                C89219l.m154715b();
            }
            String text = comment2.getText();
            Comment comment3 = commentSharePackage.f154714a;
            if (comment3 == null) {
                C89219l.m154715b();
            }
            String replyToUserName = comment3.getReplyToUserName();
            if (replyToUserName == null) {
                replyToUserName = "";
            }
            Bitmap decodeResource = BitmapFactory.decodeResource(this.f128077d.getResources(), 2131232818);
            C89219l.m154716b(decodeResource, "");
            Activity activity = this.f128077d;
            C89219l.m154716b(nickname, "");
            C89219l.m154716b(text, "");
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            tuxTextView.setText(CommentSharePackage.C69213a.m122323a(activity, nickname, replyToUserName, text, decodeResource, C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics()))));
            Comment comment4 = commentSharePackage.f154714a;
            if (comment4 == null) {
                C89219l.m154715b();
            }
            User user2 = comment4.getUser();
            C89219l.m154716b(user2, "");
            C20766v a2 = C20761r.m39060a(C34735v.m70965a(user2.getAvatarThumb()));
            a2.f49105b = this.f128077d;
            a2.mo34179a("CommentShare").mo34182a(new C56151d(this, nickname, replyToUserName, text, tuxTextView));
            MethodCollector.m26664o(5618);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.share.improve.pkg.CommentSharePackage");
        MethodCollector.m26664o(5618);
        throw nullPointerException;
    }

    public C56147d(Activity activity, View view, SharePackage sharePackage, ShareTextBoxViewModel shareTextBoxViewModel, AbstractC1204m mVar) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(sharePackage, "");
        C89219l.m154721d(shareTextBoxViewModel, "");
        C89219l.m154721d(mVar, "");
        this.f128077d = activity;
        this.f128078e = view;
        this.f128079f = sharePackage;
        this.f128080g = shareTextBoxViewModel;
        this.f128083j = mVar;
        View findViewById = view.findViewById(R.id.ary);
        C89219l.m154716b(findViewById, "");
        this.f128074a = (DmtEditText) findViewById;
        View findViewById2 = view.findViewById(R.id.f3m);
        C89219l.m154716b(findViewById2, "");
        this.f128075b = (TuxButton) findViewById2;
        View findViewById3 = view.findViewById(R.id.buj);
        C89219l.m154716b(findViewById3, "");
        this.f128081h = (RemoteImageView) findViewById3;
        this.f128082i = C89219l.m154714a((Object) sharePackage.f155487d, (Object) UGCMonitor.EVENT_COMMENT);
    }
}
