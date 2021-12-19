package com.p2082ss.android.ugc.aweme.notification.p3519ab;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.notification.ab.c */
public final class C61801c {

    /* renamed from: a */
    public static final C61801c f140288a = new C61801c();

    private C61801c() {
    }

    static {
        Covode.recordClassIndex(72535);
    }

    /* renamed from: a */
    public static final boolean m111863a() {
        try {
            NoticeCollapsibility noticeCollapsibility = (NoticeCollapsibility) SettingsManager.m29616a().mo25396a("notice_collapsibility", NoticeCollapsibility.class);
            if (noticeCollapsibility == null || noticeCollapsibility.cutOffDays == 0 || noticeCollapsibility.extraNoticeCount == 0) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static final int m111864b() {
        try {
            NoticeCollapsibility noticeCollapsibility = (NoticeCollapsibility) SettingsManager.m29616a().mo25396a("notice_collapsibility", NoticeCollapsibility.class);
            if (noticeCollapsibility != null) {
                return noticeCollapsibility.cutOffDays;
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: c */
    public static final int m111865c() {
        try {
            NoticeCollapsibility noticeCollapsibility = (NoticeCollapsibility) SettingsManager.m29616a().mo25396a("notice_collapsibility", NoticeCollapsibility.class);
            if (noticeCollapsibility != null) {
                return noticeCollapsibility.extraNoticeCount;
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }
}
