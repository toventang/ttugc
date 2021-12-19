package com.p2082ss.android.ugc.aweme.base.component;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20745e;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.ProfileEditActivity;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69124b;
import com.p2082ss.android.ugc.aweme.utils.C80222ap;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.views.DialogC81459o;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.base.component.i */
public final class DialogC34558i extends DialogC81459o {

    /* renamed from: a */
    public final User f81589a;

    /* renamed from: b */
    public final int f81590b = 1;

    /* renamed from: c */
    private final AbstractC89244h f81591c = C89250i.m154773a((AbstractC89171a) new C34564f(this));

    /* renamed from: d */
    private final AbstractC89244h f81592d = C89250i.m154773a((AbstractC89171a) new C34565g(this));

    /* renamed from: e */
    private final AbstractC89244h f81593e = C89250i.m154773a((AbstractC89171a) new C34566h(this));

    /* renamed from: f */
    private final AbstractC89244h f81594f = C89250i.m154773a((AbstractC89171a) new C34562d(this));

    /* renamed from: g */
    private final AbstractC89244h f81595g = C89250i.m154773a((AbstractC89171a) new C34563e(this));

    static {
        Covode.recordClassIndex(41520);
    }

    /* renamed from: b */
    private final TextView m70584b() {
        return (TextView) this.f81594f.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.base.component.i$d */
    static final class C34562d extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ DialogC34558i f81600a;

        static {
            Covode.recordClassIndex(41524);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34562d(DialogC34558i iVar) {
            super(0);
            this.f81600a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f81600a.findViewById(R.id.x6);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.component.i$e */
    static final class C34563e extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ DialogC34558i f81601a;

        static {
            Covode.recordClassIndex(41525);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34563e(DialogC34558i iVar) {
            super(0);
            this.f81601a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f81601a.findViewById(R.id.etf);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.component.i$f */
    static final class C34564f extends AbstractC89220m implements AbstractC89171a<SmartImageView> {

        /* renamed from: a */
        final /* synthetic */ DialogC34558i f81602a;

        static {
            Covode.recordClassIndex(41526);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34564f(DialogC34558i iVar) {
            super(0);
            this.f81602a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SmartImageView invoke() {
            return this.f81602a.findViewById(R.id.btr);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.component.i$g */
    static final class C34565g extends AbstractC89220m implements AbstractC89171a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ DialogC34558i f81603a;

        static {
            Covode.recordClassIndex(41527);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34565g(DialogC34558i iVar) {
            super(0);
            this.f81603a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ImageView invoke() {
            return this.f81603a.findViewById(R.id.bts);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.component.i$h */
    static final class C34566h extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ DialogC34558i f81604a;

        static {
            Covode.recordClassIndex(41528);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34566h(DialogC34558i iVar) {
            super(0);
            this.f81604a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f81604a.findViewById(R.id.eth);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.component.i$a */
    static final class RunnableC34559a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DialogC34558i f81596a;

        /* renamed from: b */
        final /* synthetic */ TextView f81597b;

        static {
            Covode.recordClassIndex(41521);
        }

        RunnableC34559a(DialogC34558i iVar, TextView textView) {
            this.f81596a = iVar;
            this.f81597b = textView;
        }

        public final void run() {
            float a = C13628n.m24503a(this.f81596a.getContext(), 12.0f);
            float a2 = C13628n.m24503a(this.f81596a.getContext(), 1.0f);
            int width = (this.f81597b.getWidth() - this.f81597b.getPaddingLeft()) - this.f81597b.getPaddingRight();
            float measureText = this.f81597b.getPaint().measureText(this.f81597b.getText().toString());
            float textSize = this.f81597b.getTextSize();
            while (measureText > ((float) width) && textSize > a) {
                this.f81597b.setTextSize(0, textSize - a2);
                textSize = this.f81597b.getTextSize();
                measureText = this.f81597b.getPaint().measureText(this.f81597b.getText().toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.component.i$b */
    static final class View$OnClickListenerC34560b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC34558i f81598a;

        static {
            Covode.recordClassIndex(41522);
        }

        View$OnClickListenerC34560b(DialogC34558i iVar) {
            this.f81598a = iVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f81598a.dismiss();
            C39162r.m79460a("close_modify_username", new C33744d().mo59983a("enter_from", "modify_username_notify").mo59983a("click_method", "button").f79943a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.component.i$c */
    static final class View$OnClickListenerC34561c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC34558i f81599a;

        static {
            Covode.recordClassIndex(41523);
        }

        View$OnClickListenerC34561c(DialogC34558i iVar) {
            this.f81599a = iVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f81599a.dismiss();
            Context context = this.f81599a.getContext();
            C89219l.m154716b(context, "");
            ProfileEditActivity.m115659a(C69124b.m122223a(context), new C80222ap().mo123646a("need_focus_id_input", 2).f179700a);
            C39162r.m79460a("click_modify_username", new C33744d().mo59983a("enter_from", "modify_username_notify").f79943a);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        UrlModel urlModel;
        super.onCreate(bundle);
        setContentView(R.layout.afk);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        User user = this.f81589a;
        if (user != null) {
            urlModel = user.getAvatarMedium();
        } else {
            urlModel = null;
        }
        C20766v a = C20761r.m39060a(C34735v.m70965a(urlModel));
        C20745e.C20746a aVar = new C20745e.C20746a();
        aVar.f48957a = true;
        a.f49126w = aVar.mo34169a();
        a.f49092E = (SmartImageView) this.f81591c.getValue();
        a.mo34186c();
        ((TextView) this.f81593e.getValue()).setText("@" + C80580in.m139684b(user));
        ((ImageView) this.f81592d.getValue()).setOnClickListener(new View$OnClickListenerC34560b(this));
        TextView b = m70584b();
        b.post(new RunnableC34559a(this, b));
        m70584b().setOnClickListener(new View$OnClickListenerC34561c(this));
        if (this.f81590b == 1) {
            ((TextView) this.f81595g.getValue()).setText(getContext().getString(R.string.aag));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC34558i(Context context, User user) {
        super(context, R.style.fk, true, false, false);
        C89219l.m154721d(context, "");
        this.f81589a = user;
    }
}
