package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3165a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.p1399im.core.p1404a.C19489e;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19639i;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.top.p3127a.C54354a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53688g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3170a.C55052e;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.g */
public final class C54999g extends AbstractC54985b {

    /* renamed from: f */
    private final int f125896f = 1;

    /* renamed from: g */
    private final int f125897g = R.string.cgj;

    /* renamed from: h */
    private final int f125898h = R.raw.icon_flag;

    static {
        Covode.recordClassIndex(64725);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3165a.AbstractC54985b
    /* renamed from: a */
    public final int mo91950a() {
        return this.f125897g;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3165a.AbstractC54985b
    /* renamed from: b */
    public final int mo91951b() {
        return this.f125898h;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3165a.AbstractC54985b
    /* renamed from: c */
    public final int mo91952c() {
        return this.f125896f;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3165a.AbstractC54985b
    /* renamed from: e */
    public final boolean mo91954e() {
        int a = C55052e.m100670a();
        if (2 <= a && 5 >= a) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3165a.AbstractC54985b
    /* renamed from: d */
    public final void mo91953d() {
        boolean z;
        int i;
        String str;
        String str2;
        C19638h hVar = this.f125868a;
        if (hVar != null) {
            Context context = this.f125870c;
            while (true) {
                String str3 = null;
                if (context == null) {
                    return;
                }
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (activity != null) {
                        C89219l.m154721d(hVar, "");
                        String valueOf = String.valueOf(hVar.getConversationShortId());
                        if (hVar.getConversationType() == C19489e.AbstractC19490a.f46181b) {
                            z = true;
                            i = 3;
                        } else {
                            z = false;
                            if (hVar.isStranger()) {
                                i = 1;
                            } else {
                                i = 0;
                            }
                        }
                        if (z) {
                            valueOf = String.valueOf(C53688g.m98956a());
                        }
                        String conversationId = hVar.getConversationId();
                        C89219l.m154716b(conversationId, "");
                        C19639i coreInfo = hVar.getCoreInfo();
                        if (coreInfo != null) {
                            str3 = coreInfo.getName();
                        }
                        if (z) {
                            str = "im_group_chat";
                        } else {
                            str = "im";
                        }
                        C53688g.m98963a(new C53688g.C53689a(valueOf, "", conversationId, (String) null, (Boolean) null, str, i, str3, 24), activity, "2");
                        int c = this.f125872e.mo91860c();
                        C54354a.C54358d dVar = C54354a.C54358d.f124504a;
                        C89219l.m154721d(dVar, "");
                        C0484a aVar = new C0484a();
                        aVar.put("enter_from", "chat_list");
                        if (c == 20) {
                            str2 = "group";
                        } else {
                            str2 = "private";
                        }
                        aVar.put("chat_type", str2);
                        aVar.put("enter_method", "button");
                        dVar.invoke("click_report", aVar);
                        return;
                    }
                    return;
                } else if (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54999g(Context context, AbstractC17427b bVar, AbstractC56237a aVar) {
        super(context, bVar, aVar, (byte) 0);
        C89219l.m154721d(context, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
    }
}
