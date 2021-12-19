package com.p2082ss.android.ugc.aweme.p4173ug.amplify;

import android.app.Activity;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p4173ug.amplify.p4175ui.DialogC79570a;
import com.p2082ss.android.ugc.aweme.settingsrequest.PopupSettingManager;
import com.p2082ss.android.ugc.aweme.settingsrequest.p3741d.C68793c;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ug.amplify.a */
public final class C79563a implements WeakHandler.IHandler {

    /* renamed from: a */
    public static WeakReference<Activity> f178541a;

    /* renamed from: b */
    public static WeakHandler f178542b;

    /* renamed from: c */
    public static final C79563a f178543c;

    private C79563a() {
    }

    static {
        Covode.recordClassIndex(92769);
        C79563a aVar = new C79563a();
        f178543c = aVar;
        f178542b = new WeakHandler(aVar);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        C68793c a;
        C89219l.m154721d(message, "");
        WeakReference<Activity> weakReference = f178541a;
        if (weakReference == null) {
            C89219l.m154710a("activityRef");
        }
        Activity activity = weakReference.get();
        if (activity != null && !activity.isFinishing() && message.what == 3 && (a = PopupSettingManager.C68764a.f153819a.mo109243a("ugc_permission_v2")) != null) {
            new DialogC79570a(activity, a).show();
        }
    }
}
