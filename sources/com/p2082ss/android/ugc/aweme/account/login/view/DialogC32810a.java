package com.p2082ss.android.ugc.aweme.account.login.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.view.AutoLinefeedTextView;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.view.a */
public final class DialogC32810a extends Dialog {

    /* renamed from: a */
    public AbstractC32811a f78166a;

    /* renamed from: b */
    public View.OnClickListener f78167b;

    /* renamed from: c */
    public View.OnClickListener f78168c;

    /* renamed from: d */
    public final C32812b f78169d;

    /* renamed from: e */
    private View f78170e;

    /* renamed from: f */
    private TextView f78171f;

    /* renamed from: g */
    private AutoLinefeedTextView f78172g;

    /* renamed from: h */
    private TextView f78173h;

    /* renamed from: i */
    private TextView f78174i;

    /* renamed from: com.ss.android.ugc.aweme.account.login.view.a$a */
    public interface AbstractC32811a {
        static {
            Covode.recordClassIndex(39591);
        }

        /* renamed from: a */
        void mo58554a();
    }

    static {
        Covode.recordClassIndex(39590);
    }

    public final void onBackPressed() {
    }

    public final void show() {
        super.show();
        C39162r.m79460a("phone_verification_channel_alert", new C31376a().mo57399a("enter_type", this.f78169d.f78179e).f75156a);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.view.a$c */
    static final class View$OnClickListenerC32813c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC32810a f78181a;

        static {
            Covode.recordClassIndex(39593);
        }

        View$OnClickListenerC32813c(DialogC32810a aVar) {
            this.f78181a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC32811a aVar = this.f78181a.f78166a;
            if (aVar != null) {
                aVar.mo58554a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.view.a$d */
    static final class View$OnClickListenerC32814d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC32810a f78182a;

        static {
            Covode.recordClassIndex(39594);
        }

        View$OnClickListenerC32814d(DialogC32810a aVar) {
            this.f78182a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            View.OnClickListener onClickListener = this.f78182a.f78167b;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.view.a$e */
    static final class View$OnClickListenerC32815e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC32810a f78183a;

        static {
            Covode.recordClassIndex(39595);
        }

        View$OnClickListenerC32815e(DialogC32810a aVar) {
            this.f78183a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            View.OnClickListener onClickListener = this.f78183a.f78168c;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.h7);
        this.f78170e = findViewById(R.id.a0w);
        this.f78171f = (TextView) findViewById(R.id.f63);
        this.f78172g = (AutoLinefeedTextView) findViewById(R.id.ev0);
        this.f78173h = (TextView) findViewById(R.id.ew6);
        this.f78174i = (TextView) findViewById(R.id.f3a);
        TextView textView = this.f78171f;
        if (textView != null) {
            textView.setText(this.f78169d.f78175a);
        }
        AutoLinefeedTextView autoLinefeedTextView = this.f78172g;
        if (autoLinefeedTextView != null) {
            String str = this.f78169d.f78176b;
            String str2 = this.f78169d.f78180f;
            if (!(str == null || str.length() == 0)) {
                autoLinefeedTextView.setText(str);
                autoLinefeedTextView.post(new AutoLinefeedTextView.RunnableC32809a(autoLinefeedTextView, str2));
            }
        }
        TextView textView2 = this.f78173h;
        if (textView2 != null) {
            textView2.setText(this.f78169d.f78177c);
        }
        TextView textView3 = this.f78174i;
        if (textView3 != null) {
            textView3.setText(this.f78169d.f78178d);
        }
        View view = this.f78170e;
        if (view != null) {
            view.setOnClickListener(new View$OnClickListenerC32813c(this));
        }
        TextView textView4 = this.f78173h;
        if (textView4 != null) {
            textView4.setOnClickListener(new View$OnClickListenerC32814d(this));
        }
        TextView textView5 = this.f78174i;
        if (textView5 != null) {
            textView5.setOnClickListener(new View$OnClickListenerC32815e(this));
        }
        setCanceledOnTouchOutside(false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC32810a(Context context, C32812b bVar) {
        super(context, R.style.ue);
        C89219l.m154721d(context, "");
        C89219l.m154721d(bVar, "");
        this.f78169d = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.view.a$b */
    public static final class C32812b {

        /* renamed from: a */
        public final String f78175a;

        /* renamed from: b */
        public final String f78176b;

        /* renamed from: c */
        public final String f78177c;

        /* renamed from: d */
        public final String f78178d;

        /* renamed from: e */
        public final String f78179e;

        /* renamed from: f */
        public final String f78180f;

        static {
            Covode.recordClassIndex(39592);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C32812b)) {
                return false;
            }
            C32812b bVar = (C32812b) obj;
            return C89219l.m154714a(this.f78175a, bVar.f78175a) && C89219l.m154714a(this.f78176b, bVar.f78176b) && C89219l.m154714a(this.f78177c, bVar.f78177c) && C89219l.m154714a(this.f78178d, bVar.f78178d) && C89219l.m154714a(this.f78179e, bVar.f78179e) && C89219l.m154714a(this.f78180f, bVar.f78180f);
        }

        public final int hashCode() {
            String str = this.f78175a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f78176b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f78177c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f78178d;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.f78179e;
            int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
            String str6 = this.f78180f;
            if (str6 != null) {
                i = str6.hashCode();
            }
            return hashCode5 + i;
        }

        public final String toString() {
            return "Param(title=" + this.f78175a + ", desc=" + this.f78176b + ", firstItem=" + this.f78177c + ", secondItem=" + this.f78178d + ", enterType=" + this.f78179e + ", phoneNum=" + this.f78180f + ")";
        }

        public C32812b(String str, String str2, String str3, String str4, String str5, String str6) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            C89219l.m154721d(str4, "");
            C89219l.m154721d(str5, "");
            C89219l.m154721d(str6, "");
            this.f78175a = str;
            this.f78176b = str2;
            this.f78177c = str3;
            this.f78178d = str4;
            this.f78179e = str5;
            this.f78180f = str6;
        }
    }
}
