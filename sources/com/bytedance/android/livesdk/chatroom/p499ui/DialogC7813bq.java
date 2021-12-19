package com.bytedance.android.livesdk.chatroom.p499ui;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.bq */
public final class DialogC7813bq extends Dialog {

    /* renamed from: d */
    public static final C7814a f19385d = new C7814a((byte) 0);

    /* renamed from: a */
    public AbstractC7815b f19386a;

    /* renamed from: b */
    public String f19387b = "";

    /* renamed from: c */
    public String f19388c = "";

    /* renamed from: e */
    private final AbstractC89244h f19389e = C89250i.m154773a((AbstractC89171a) new C7816c(this));

    /* renamed from: f */
    private final AbstractC89244h f19390f = C89250i.m154773a((AbstractC89171a) new C7821h(this));

    /* renamed from: g */
    private final AbstractC89244h f19391g = C89250i.m154773a((AbstractC89171a) new C7820g(this));

    /* renamed from: h */
    private final AbstractC89244h f19392h = C89250i.m154773a((AbstractC89171a) new C7819f(this));

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.bq$b */
    public interface AbstractC7815b {
        static {
            Covode.recordClassIndex(8610);
        }

        /* renamed from: a */
        void mo13659a();
    }

    static {
        Covode.recordClassIndex(8608);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.bq$a */
    public static final class C7814a {
        static {
            Covode.recordClassIndex(8609);
        }

        private C7814a() {
        }

        public /* synthetic */ C7814a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.bq$c */
    static final class C7816c extends AbstractC89220m implements AbstractC89171a<LiveTextView> {

        /* renamed from: a */
        final /* synthetic */ DialogC7813bq f19393a;

        static {
            Covode.recordClassIndex(8611);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7816c(DialogC7813bq bqVar) {
            super(0);
            this.f19393a = bqVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LiveTextView invoke() {
            return this.f19393a.findViewById(R.id.et6);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.bq$f */
    static final class C7819f extends AbstractC89220m implements AbstractC89171a<LiveTextView> {

        /* renamed from: a */
        final /* synthetic */ DialogC7813bq f19396a;

        static {
            Covode.recordClassIndex(8614);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7819f(DialogC7813bq bqVar) {
            super(0);
            this.f19396a = bqVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LiveTextView invoke() {
            return this.f19396a.findViewById(R.id.f4v);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.bq$g */
    static final class C7820g extends AbstractC89220m implements AbstractC89171a<LiveTextView> {

        /* renamed from: a */
        final /* synthetic */ DialogC7813bq f19397a;

        static {
            Covode.recordClassIndex(8615);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7820g(DialogC7813bq bqVar) {
            super(0);
            this.f19397a = bqVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LiveTextView invoke() {
            return this.f19397a.findViewById(R.id.f63);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.bq$h */
    static final class C7821h extends AbstractC89220m implements AbstractC89171a<LiveTextView> {

        /* renamed from: a */
        final /* synthetic */ DialogC7813bq f19398a;

        static {
            Covode.recordClassIndex(8616);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7821h(DialogC7813bq bqVar) {
            super(0);
            this.f19398a = bqVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LiveTextView invoke() {
            return this.f19398a.findViewById(R.id.f73);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.bq$d */
    static final class View$OnClickListenerC7817d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC7813bq f19394a;

        static {
            Covode.recordClassIndex(8612);
        }

        View$OnClickListenerC7817d(DialogC7813bq bqVar) {
            this.f19394a = bqVar;
        }

        public final void onClick(View view) {
            this.f19394a.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.bq$e */
    static final class View$OnClickListenerC7818e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC7813bq f19395a;

        static {
            Covode.recordClassIndex(8613);
        }

        View$OnClickListenerC7818e(DialogC7813bq bqVar) {
            this.f19395a = bqVar;
        }

        public final void onClick(View view) {
            this.f19395a.dismiss();
            AbstractC7815b bVar = this.f19395a.f19386a;
            if (bVar != null) {
                bVar.mo13659a();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC7813bq(Context context) {
        super(context);
        C89219l.m154721d(context, "");
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -2);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setBackgroundDrawable(new ColorDrawable(0));
        }
        Window window4 = getWindow();
        if (window4 != null) {
            window4.setGravity(17);
        }
        setCanceledOnTouchOutside(false);
        super.onCreate(bundle);
        setContentView(R.layout.b6f);
        ((LiveTextView) this.f19389e.getValue()).setOnClickListener(new View$OnClickListenerC7817d(this));
        ((LiveTextView) this.f19390f.getValue()).setOnClickListener(new View$OnClickListenerC7818e(this));
        LiveTextView liveTextView = (LiveTextView) this.f19391g.getValue();
        C89219l.m154716b(liveTextView, "");
        liveTextView.setText(this.f19387b);
        LiveTextView liveTextView2 = (LiveTextView) this.f19392h.getValue();
        C89219l.m154716b(liveTextView2, "");
        liveTextView2.setText(this.f19388c);
    }
}
