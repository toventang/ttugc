package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.topnotice.p3163ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.TopChatNoticeSourceType;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.d */
public final class C54959d extends RecyclerView.ViewHolder {

    /* renamed from: e */
    public static final C54960a f125807e = new C54960a((byte) 0);

    /* renamed from: a */
    final TuxButton f125808a;

    /* renamed from: b */
    final ImageView f125809b;

    /* renamed from: c */
    final TextView f125810c;

    /* renamed from: d */
    final TextView f125811d;

    static {
        Covode.recordClassIndex(64683);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.d$a */
    public static final class C54960a {
        static {
            Covode.recordClassIndex(64684);
        }

        private C54960a() {
        }

        public /* synthetic */ C54960a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.d$c */
    static final class View$OnClickListenerC54962c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SessionListTopNoticeViewModel f125813a;

        /* renamed from: b */
        final /* synthetic */ TopChatNoticeSourceType f125814b;

        static {
            Covode.recordClassIndex(64686);
        }

        View$OnClickListenerC54962c(SessionListTopNoticeViewModel sessionListTopNoticeViewModel, TopChatNoticeSourceType topChatNoticeSourceType) {
            this.f125813a = sessionListTopNoticeViewModel;
            this.f125814b = topChatNoticeSourceType;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            SessionListTopNoticeViewModel sessionListTopNoticeViewModel = this.f125813a;
            TopChatNoticeSourceType topChatNoticeSourceType = this.f125814b;
            C89219l.m154721d(topChatNoticeSourceType, "");
            EnumC54957b value = sessionListTopNoticeViewModel.f125836h.getValue();
            if (value != null) {
                str = value.getNoticeCode();
            } else {
                str = null;
            }
            sessionListTopNoticeViewModel.mo91944a(str, topChatNoticeSourceType, 1, "");
            sessionListTopNoticeViewModel.mo91943a("notification_setting_alert_close");
            sessionListTopNoticeViewModel.f125836h.setValue(EnumC54957b.EmptyTopNoticeView);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.d$b */
    static final class View$OnClickListenerC54961b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SessionListTopNoticeViewModel f125812a;

        static {
            Covode.recordClassIndex(64685);
        }

        View$OnClickListenerC54961b(SessionListTopNoticeViewModel sessionListTopNoticeViewModel) {
            this.f125812a = sessionListTopNoticeViewModel;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0045, code lost:
            if (r1 != 3) goto L_0x0014;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r6) {
            /*
            // Method dump skipped, instructions count: 101
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.topnotice.p3163ui.C54959d.View$OnClickListenerC54961b.onClick(android.view.View):void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54959d(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.bkq);
        C89219l.m154716b(findViewById, "");
        this.f125808a = (TuxButton) findViewById;
        View findViewById2 = view.findViewById(R.id.bgf);
        C89219l.m154716b(findViewById2, "");
        this.f125809b = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.ex4);
        C89219l.m154716b(findViewById3, "");
        this.f125810c = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.ex3);
        C89219l.m154716b(findViewById4, "");
        this.f125811d = (TextView) findViewById4;
    }
}
