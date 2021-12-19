package com.p2082ss.android.ugc.aweme.feedback.reply;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1204e.p1205a.C17305a;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.activity.C33067a;
import com.p2082ss.android.ugc.aweme.app.C33802l;
import com.p2082ss.android.ugc.aweme.feedback.C50566a;
import com.p2082ss.android.ugc.aweme.feedback.reply.FeedbackNewestReplyApi;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;

/* renamed from: com.ss.android.ugc.aweme.feedback.reply.a */
public final class C50571a implements Handler.Callback {

    /* renamed from: a */
    public Handler f116869a;

    /* renamed from: b */
    private Context f116870b;

    static {
        Covode.recordClassIndex(59720);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo85860a() {
        try {
            Keva a = C50574d.m94806a();
            if (a == null || !a.getBoolean("has", false)) {
                return null;
            }
            C17305a a2 = C17305a.m32043a();
            Handler handler = this.f116869a;
            FeedbackNewestReplyApi.C50570a aVar = FeedbackNewestReplyApi.f116868b;
            aVar.getClass();
            a2.mo27615a(handler, new CallableC50573c(aVar), 0);
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public C50571a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f116870b = applicationContext;
        this.f116869a = new Handler(this.f116870b.getMainLooper(), this);
    }

    public final boolean handleMessage(Message message) {
        if (message.obj instanceof C50575e) {
            C50575e eVar = (C50575e) message.obj;
            if (eVar.f116876b == 0 && eVar.f116877c != null && eVar.f116877c.f116879b.booleanValue() && C33067a.m67726a(C17873f.m33102j(), false) && C33802l.m69153a() > 0) {
                AbstractC81915c.m141874a(new C50566a());
            }
        } else if (message.obj instanceof Exception) {
            ((Exception) message.obj).printStackTrace();
        }
        return false;
    }
}
