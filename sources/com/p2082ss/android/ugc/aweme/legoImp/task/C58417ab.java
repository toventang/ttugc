package com.p2082ss.android.ugc.aweme.legoImp.task;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.platform.p1565a.C21622a;
import com.p2082ss.android.agilelogger.ALog;
import com.p2082ss.android.ugc.aweme.i18n.C53433a;
import com.p2082ss.android.ugc.aweme.utils.C80341df;
import com.p2082ss.android.ugc.aweme.utils.C80521h;
import java.lang.Thread;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.ab */
final class C58417ab implements AttachUserData {

    /* renamed from: a */
    private final C21622a f133007a;

    static {
        Covode.recordClassIndex(68658);
    }

    C58417ab(C21622a aVar) {
        this.f133007a = aVar;
    }

    @Override // com.bytedance.crash.AttachUserData
    public final Map<? extends String, ? extends String> getUserData(CrashType crashType) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        HashMap hashMap = new HashMap();
        if (this.f133007a != null) {
            String str = "";
            ALog.m59865d("horae", str);
            if ((Thread.getDefaultUncaughtExceptionHandler() instanceof C53433a) && (uncaughtExceptionHandler = ((C53433a) Thread.getDefaultUncaughtExceptionHandler()).f122647a) != null) {
                str = str + "super:" + uncaughtExceptionHandler.getClass().getName();
            }
            hashMap.put("double_turbo_quicken_engine", str + Thread.getDefaultUncaughtExceptionHandler().getClass().getName() + C80341df.f179871a + ",ArrayMapPlugin:" + C80521h.f180136b);
        }
        return hashMap;
    }
}
