package com.p2082ss.android.ugc.aweme.newfollow.p3507ui;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.NoticeView;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.p2482cn.C36145b;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.e */
public final class C61517e {

    /* renamed from: a */
    public static int f139646a = 3;

    /* renamed from: b */
    public static int f139647b = 15;

    /* renamed from: c */
    public NoticeView f139648c;

    /* renamed from: d */
    public Context f139649d;

    /* renamed from: e */
    public AbstractC61520b f139650e;

    /* renamed from: f */
    public EnumC61519a f139651f = EnumC61519a.Message;

    /* renamed from: com.ss.android.ugc.aweme.newfollow.ui.e$b */
    public interface AbstractC61520b {
        static {
            Covode.recordClassIndex(72183);
        }

        /* renamed from: a */
        boolean mo86687a(Context context);

        /* renamed from: b */
        void mo86688b(Context context);
    }

    static {
        Covode.recordClassIndex(72180);
    }

    /* renamed from: b */
    public final long mo99174b() {
        return C36145b.m73641b().mo63273e(this.f139649d, "key_cross_push_notification_guide");
    }

    /* renamed from: c */
    public final long mo99175c() {
        return C36145b.m73641b().mo63273e(this.f139649d, "key_times_push_notification_guide");
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.ui.e$a */
    public enum EnumC61519a {
        Message,
        Follow;

        static {
            Covode.recordClassIndex(72182);
        }
    }

    /* renamed from: a */
    public final void mo99173a() {
        AbstractC61520b bVar;
        Context context = this.f139649d;
        if (context != null && this.f139648c != null && (bVar = this.f139650e) != null) {
            bVar.mo86687a(context);
            if (!this.f139650e.mo86687a(this.f139649d)) {
                long b = mo99174b();
                System.currentTimeMillis();
                mo99175c();
                if (System.currentTimeMillis() - b <= ((long) f139647b) * 86400000 || mo99175c() >= ((long) f139646a)) {
                    this.f139648c.setVisibility(8);
                    return;
                }
                this.f139648c.setVisibility(0);
                if (this.f139651f == EnumC61519a.Follow) {
                    C39162r.m79460a("notification_setting_alert_show", new C33744d().mo59983a("enter_from", "follow").f79943a);
                } else {
                    C39162r.m79460a("notification_setting_alert_show", new C33744d().mo59983a("enter_from", "message").f79943a);
                }
            } else {
                this.f139648c.setVisibility(8);
            }
        }
    }

    public C61517e(NoticeView noticeView, AbstractC61520b bVar) {
        this.f139648c = noticeView;
        noticeView.setVisibility(8);
        this.f139650e = bVar;
        NoticeView noticeView2 = this.f139648c;
        if (!(noticeView2 == null || bVar == null)) {
            Context context = noticeView2.getContext();
            this.f139649d = context;
            NoticeView noticeView3 = this.f139648c;
            if (!(noticeView3 == null || context == null)) {
                noticeView3.setOnInternalClickListener(new NoticeView.AbstractC42575a() {
                    /* class com.p2082ss.android.ugc.aweme.newfollow.p3507ui.C61517e.C615181 */

                    static {
                        Covode.recordClassIndex(72181);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.NoticeView.AbstractC42575a
                    /* renamed from: a */
                    public final void mo72753a() {
                        C61517e.this.f139648c.setVisibility(8);
                        C61517e eVar = C61517e.this;
                        if (eVar.f139650e != null) {
                            try {
                                eVar.f139650e.mo86688b(eVar.f139649d);
                            } catch (Exception unused) {
                                Context context = eVar.f139649d;
                                Intent intent = new Intent("android.settings.SETTINGS");
                                C84349a.m145093a(intent, context);
                                context.startActivity(intent);
                            }
                        }
                        C61517e.this.mo99175c();
                        C61517e.this.mo99174b();
                        if (C61517e.this.f139651f == EnumC61519a.Follow) {
                            C39162r.m79460a("notification_setting_alert_click", new C33744d().mo59983a("enter_from", "follow").f79943a);
                        } else {
                            C39162r.m79460a("notification_setting_alert_click", new C33744d().mo59983a("enter_from", "message").f79943a);
                        }
                    }

                    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.NoticeView.AbstractC42575a
                    /* renamed from: b */
                    public final void mo72754b() {
                        C61517e.this.f139648c.setVisibility(8);
                        C36145b.m73641b().mo63263a(C61517e.this.f139649d, "key_cross_push_notification_guide", Long.valueOf(System.currentTimeMillis()).longValue());
                        C61517e eVar = C61517e.this;
                        C36145b.m73641b().mo63263a(eVar.f139649d, "key_times_push_notification_guide", Long.valueOf(eVar.mo99175c() + 1).longValue());
                        C61517e.this.mo99175c();
                        C61517e.this.mo99174b();
                        if (C61517e.this.f139651f == EnumC61519a.Follow) {
                            C39162r.m79460a("notification_setting_alert_close", new C33744d().mo59983a("enter_from", "follow").f79943a);
                        } else {
                            C39162r.m79460a("notification_setting_alert_close", new C33744d().mo59983a("enter_from", "message").f79943a);
                        }
                    }
                });
            }
        }
        try {
            f139646a = C52912c.f121688a.f121689b.getPushGuideInfo().getCloseCountLimit().intValue();
            f139647b = C52912c.f121688a.f121689b.getPushGuideInfo().getShowupInterval().intValue();
        } catch (Exception e) {
            e.printStackTrace();
            f139646a = 3;
            f139647b = 15;
        }
    }
}
