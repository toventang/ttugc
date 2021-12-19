package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.top;

import android.content.Context;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.C53709a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.TopChatNoticeSourceType;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.top.p3127a.C54354a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.top.BottomNoticeViewModel */
public final class BottomNoticeViewModel extends SessionListTopNoticeViewModel {

    /* renamed from: a */
    public C53709a f124485a;

    /* renamed from: b */
    public String f124486b = "notice_code";

    /* renamed from: c */
    final Context f124487c;

    static {
        Covode.recordClassIndex(64047);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BottomNoticeViewModel(Context context) {
        super(null, null, null, null, null, null, 63);
        C89219l.m154721d(context, "");
        this.f124487c = context;
    }

    /* renamed from: a */
    public final void mo91427a(int i) {
        String str;
        String str2 = this.f124486b;
        TopChatNoticeSourceType topChatNoticeSourceType = TopChatNoticeSourceType.DM_CHAT;
        C53709a aVar = this.f124485a;
        if (aVar != null) {
            str = aVar.getConversationId();
        } else {
            str = null;
        }
        mo91944a(str2, topChatNoticeSourceType, i, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo91428b(int i) {
        mo91427a(i);
        C54354a.m99667a(Integer.valueOf(i), C54354a.C54359e.f124505a);
        if (i == 3) {
            C54354a.C54356b bVar = C54354a.C54356b.f124502a;
            C89219l.m154721d(bVar, "");
            C0484a aVar = new C0484a();
            aVar.put("enter_from", "chat");
            aVar.put("enter_method", "pop_up");
            bVar.invoke("click_report", aVar);
        }
    }
}
