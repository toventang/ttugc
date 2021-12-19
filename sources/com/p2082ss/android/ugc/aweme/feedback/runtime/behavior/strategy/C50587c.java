package com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.C50580b;
import com.p2082ss.android.ugc.aweme.runtime.behavior.C67212c;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.c */
public final class C50587c extends AbstractC50584a {

    /* renamed from: a */
    public static final C50588a f116897a = new C50588a((byte) 0);

    static {
        Covode.recordClassIndex(59743);
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50584a
    /* renamed from: a */
    public final String mo85928a() {
        return "abnor_download";
    }

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.c$a */
    public static final class C50588a {
        static {
            Covode.recordClassIndex(59744);
        }

        private C50588a() {
        }

        public /* synthetic */ C50588a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50584a
    /* renamed from: b */
    public final long mo85930b() {
        return TimeUnit.HOURS.toMillis(2);
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50584a
    /* renamed from: c */
    public final String mo85931c() {
        long currentTimeMillis = System.currentTimeMillis() - mo85930b();
        List<C67212c> a = C50580b.m94818a("download_start", currentTimeMillis);
        List<C67212c> a2 = C50580b.m94818a("download_cancel", currentTimeMillis);
        List<C67212c> a3 = C50580b.m94818a("download_success", currentTimeMillis);
        List<C67212c> a4 = C50580b.m94818a("download_error", currentTimeMillis);
        List<C67212c> a5 = C50580b.m94818a("water_mark_start", currentTimeMillis);
        List<C67212c> a6 = C50580b.m94818a("water_mark_cancel", currentTimeMillis);
        List<C67212c> a7 = C50580b.m94818a("water_mark_success", currentTimeMillis);
        List<C67212c> a8 = C50580b.m94818a("water_mark_error", currentTimeMillis);
        StringBuilder sb = new StringBuilder();
        if (!a.isEmpty()) {
            sb.append("DownloadTimes: " + a.size() + ';');
        }
        if (!a2.isEmpty()) {
            sb.append("DownloadCancel: " + a2.size() + ';');
        }
        if (!a3.isEmpty()) {
            sb.append("DownloadSuccess: " + a3.size() + ';');
        }
        if (!a4.isEmpty()) {
            sb.append("DownloadError: " + a4.size() + "(ECode:");
            boolean z = true;
            for (C67212c cVar : a4) {
                if (!z) {
                    sb.append(",");
                }
                sb.append(cVar.f150639d);
                z = false;
            }
            sb.append(");");
        }
        if (!a5.isEmpty()) {
            sb.append("WatermarkTimes: " + a5.size() + ';');
        }
        if (!a6.isEmpty()) {
            sb.append("WatermarkCancel: " + a6.size() + ';');
        }
        if (!a7.isEmpty()) {
            sb.append("WatermarkSuccess: " + a7.size() + ';');
        }
        if (!a8.isEmpty()) {
            sb.append("WatermarkError: " + a8.size() + ';');
        }
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        return sb2;
    }

    @Override // com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AbstractC50584a
    /* renamed from: a */
    public final boolean mo85929a(String str) {
        C89219l.m154721d(str, "");
        switch (str.hashCode()) {
            case -1826452220:
                if (str.equals("water_mark_cancel")) {
                    return true;
                }
                return false;
            case -210589876:
                if (str.equals("download_success")) {
                    return true;
                }
                return false;
            case 71186961:
                if (str.equals("download_cancel")) {
                    return true;
                }
                return false;
            case 974485393:
                if (str.equals("download_error")) {
                    return true;
                }
                return false;
            case 987458027:
                if (str.equals("download_start")) {
                    return true;
                }
                return false;
            case 1051818558:
                if (str.equals("water_mark_error")) {
                    return true;
                }
                return false;
            case 1064791192:
                if (str.equals("water_mark_start")) {
                    return true;
                }
                return false;
            case 1092137657:
                if (str.equals("water_mark_success")) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }
}
