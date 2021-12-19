package com.p2082ss.android.ugc.aweme.discover.p2797ui.p2808e;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.discover.adapter.AbstractView$OnAttachStateChangeListenerC41671b;
import com.p2082ss.android.ugc.aweme.discover.model.suicide.SearchDialInfo;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67579v;
import com.p2082ss.android.ugc.aweme.utils.C80223aq;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.e.c */
public final class C42845c extends AbstractView$OnAttachStateChangeListenerC41671b {

    /* renamed from: c */
    public static final C42846a f99915c = new C42846a((byte) 0);

    /* renamed from: a */
    public C80223aq f99916a;

    /* renamed from: b */
    public View f99917b;

    static {
        Covode.recordClassIndex(50949);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.e.c$a */
    public static final class C42846a {
        static {
            Covode.recordClassIndex(50950);
        }

        private C42846a() {
        }

        public /* synthetic */ C42846a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.e.c$b */
    static final class View$OnClickListenerC42847b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42845c f99918a;

        /* renamed from: b */
        final /* synthetic */ SearchDialInfo f99919b;

        static {
            Covode.recordClassIndex(50951);
        }

        View$OnClickListenerC42847b(C42845c cVar, SearchDialInfo searchDialInfo) {
            this.f99918a = cVar;
            this.f99919b = searchDialInfo;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C42845c cVar = this.f99918a;
            SearchDialInfo searchDialInfo = this.f99919b;
            new C67579v("click_get_call").mo96792f();
            C17197a.C17200a aVar = new C17197a.C17200a(cVar.mo70878G());
            aVar.f41071b = searchDialInfo.number;
            aVar.mo27195b(R.string.a8y, (DialogInterface.OnClickListener) null, false).mo27190a(R.string.a8h, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC42849d(cVar, searchDialInfo), false).mo27193a().mo27184b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.e.c$c */
    static final class View$OnClickListenerC42848c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42845c f99920a;

        /* renamed from: b */
        final /* synthetic */ SearchDialInfo f99921b;

        static {
            Covode.recordClassIndex(50952);
        }

        View$OnClickListenerC42848c(C42845c cVar, SearchDialInfo searchDialInfo) {
            this.f99920a = cVar;
            this.f99921b = searchDialInfo;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C42845c cVar = this.f99920a;
            SearchDialInfo searchDialInfo = this.f99921b;
            String str = searchDialInfo.content;
            new C67579v("send_sms_sign").mo96792f();
            Uri parse = Uri.parse("smsto:" + searchDialInfo.number);
            Context G = cVar.mo70878G();
            Intent intent = new Intent("android.intent.action.SENDTO", parse);
            intent.putExtra("sms_body", str);
            C84349a.m145093a(intent, G);
            G.startActivity(intent);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42845c(View view, View view2) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(view2, "");
        this.f99917b = view2;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.e.c$d */
    static final class DialogInterface$OnClickListenerC42849d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C42845c f99922a;

        /* renamed from: b */
        final /* synthetic */ SearchDialInfo f99923b;

        static {
            Covode.recordClassIndex(50953);
        }

        DialogInterface$OnClickListenerC42849d(C42845c cVar, SearchDialInfo searchDialInfo) {
            this.f99922a = cVar;
            this.f99923b = searchDialInfo;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
                this.f99922a.f99916a = new C80223aq(this.f99922a.mo70878G(), this.f99923b.number, this.f99922a.mo70878G().getString(R.string.a8i));
                C80223aq aqVar = this.f99922a.f99916a;
                if (aqVar != null) {
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.DIAL");
                    intent.setData(Uri.parse("tel:" + aqVar.f179702b));
                    Context context = aqVar.f179701a;
                    C84349a.m145093a(intent, context);
                    context.startActivity(intent);
                }
                new C67579v("click_call_sign").mo96792f();
            }
        }
    }

    /* renamed from: a */
    public final void mo73091a(SearchDialInfo searchDialInfo, int i) {
        String str;
        C89219l.m154721d(searchDialInfo, "");
        View view = this.itemView;
        C89219l.m154716b(view, "");
        RemoteImageView remoteImageView = (RemoteImageView) view.findViewById(R.id.bwm);
        String str2 = searchDialInfo.icon;
        if (str2 == null) {
            str2 = "";
        }
        C34577e.m70608b(remoteImageView, str2, -1, -1);
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.title);
        tuxTextView.setText(searchDialInfo.title);
        tuxTextView.setTuxFont(52);
        if (i == 2) {
            View view3 = this.itemView;
            C89219l.m154716b(view3, "");
            TuxTextView tuxTextView2 = (TuxTextView) view3.findViewById(R.id.cvm);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setVisibility(0);
            View view4 = this.itemView;
            C89219l.m154716b(view4, "");
            TuxTextView tuxTextView3 = (TuxTextView) view4.findViewById(R.id.cvm);
            C89219l.m154716b(tuxTextView3, "");
            tuxTextView3.setText(searchDialInfo.number);
        } else if (i == 3) {
            try {
                String str3 = searchDialInfo.content;
                if (!(str3 == null || str3.length() == 0 || (str = searchDialInfo.number) == null)) {
                    if (str.length() != 0) {
                        View view5 = this.itemView;
                        C89219l.m154716b(view5, "");
                        TuxTextView tuxTextView4 = (TuxTextView) view5.findViewById(R.id.cvm);
                        C89219l.m154716b(tuxTextView4, "");
                        tuxTextView4.setVisibility(0);
                        View view6 = this.itemView;
                        C89219l.m154716b(view6, "");
                        Context context = view6.getContext();
                        Object[] objArr = new Object[2];
                        String str4 = searchDialInfo.content;
                        if (str4 == null) {
                            str4 = "";
                        }
                        objArr[0] = str4;
                        String str5 = searchDialInfo.number;
                        if (str5 == null) {
                            str5 = "";
                        }
                        objArr[1] = str5;
                        String string = context.getString(R.string.fyt, objArr);
                        C89219l.m154716b(string, "");
                        View view7 = this.itemView;
                        C89219l.m154716b(view7, "");
                        TuxTextView tuxTextView5 = (TuxTextView) view7.findViewById(R.id.cvm);
                        C89219l.m154716b(tuxTextView5, "");
                        tuxTextView5.setText(string);
                    }
                }
                View view8 = this.itemView;
                C89219l.m154716b(view8, "");
                TuxTextView tuxTextView6 = (TuxTextView) view8.findViewById(R.id.cvm);
                C89219l.m154716b(tuxTextView6, "");
                tuxTextView6.setVisibility(8);
            } catch (Exception e) {
                e.printStackTrace();
                View view9 = this.itemView;
                C89219l.m154716b(view9, "");
                TuxTextView tuxTextView7 = (TuxTextView) view9.findViewById(R.id.cvm);
                C89219l.m154716b(tuxTextView7, "");
                tuxTextView7.setVisibility(8);
            }
        }
        if (!TextUtils.isEmpty(searchDialInfo.desc)) {
            View view10 = this.itemView;
            C89219l.m154716b(view10, "");
            ((TuxTextView) view10.findViewById(R.id.ajd)).setText(searchDialInfo.desc);
            View view11 = this.itemView;
            C89219l.m154716b(view11, "");
            TuxTextView tuxTextView8 = (TuxTextView) view11.findViewById(R.id.ajd);
            C89219l.m154716b(tuxTextView8, "");
            tuxTextView8.setVisibility(0);
        } else {
            View view12 = this.itemView;
            C89219l.m154716b(view12, "");
            TuxTextView tuxTextView9 = (TuxTextView) view12.findViewById(R.id.ajd);
            C89219l.m154716b(tuxTextView9, "");
            tuxTextView9.setVisibility(8);
        }
        View view13 = this.itemView;
        C89219l.m154716b(view13, "");
        ((TuxTextView) view13.findViewById(R.id.ac1)).setTuxFont(52);
        if (i == 2) {
            View view14 = this.itemView;
            C89219l.m154716b(view14, "");
            TuxTextView tuxTextView10 = (TuxTextView) view14.findViewById(R.id.ac1);
            C89219l.m154716b(tuxTextView10, "");
            View view15 = this.itemView;
            C89219l.m154716b(view15, "");
            tuxTextView10.setText(view15.getContext().getString(R.string.doh));
            View view16 = this.itemView;
            C89219l.m154716b(view16, "");
            ((TuxTextView) view16.findViewById(R.id.ac1)).setOnClickListener(new View$OnClickListenerC42847b(this, searchDialInfo));
        } else if (i == 3) {
            View view17 = this.itemView;
            C89219l.m154716b(view17, "");
            TuxTextView tuxTextView11 = (TuxTextView) view17.findViewById(R.id.ac1);
            C89219l.m154716b(tuxTextView11, "");
            View view18 = this.itemView;
            C89219l.m154716b(view18, "");
            tuxTextView11.setText(view18.getContext().getString(R.string.fys));
            View view19 = this.itemView;
            C89219l.m154716b(view19, "");
            ((TuxTextView) view19.findViewById(R.id.ac1)).setOnClickListener(new View$OnClickListenerC42848c(this, searchDialInfo));
        }
    }
}
