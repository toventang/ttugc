package com.p2082ss.android.ugc.aweme.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.ugc.statisticlogger.C18228e;
import com.bytedance.ies.uikit.p1279a.C18236d;
import com.p2082ss.android.newmedia.AbstractC30133e;
import com.p2082ss.android.newmedia.redbadge.C30173b;
import com.p2082ss.android.ugc.aweme.app.launch.p2334a.C33814a;
import com.p2082ss.android.ugc.aweme.app.launch.p2334a.C33816b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58259r;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.C58195d;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.main.MainActivity;
import com.p2082ss.android.ugc.aweme.notice.api.C61542b;
import com.p2082ss.android.ugc.aweme.notice.api.p3514e.C61595q;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.request_combine.p3675a.C67117a;
import com.p2082ss.android.ugc.aweme.requesttask.idle.C67193e;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.app.AwemeAppData */
public final class AwemeAppData extends AbstractC30133e implements C18236d.AbstractC18237a, C18236d.AbstractC18239c {

    /* renamed from: f */
    public boolean f79679f;

    /* renamed from: g */
    public boolean f79680g;

    /* renamed from: h */
    public boolean f79681h;

    static {
        Covode.recordClassIndex(40423);
    }

    /* renamed from: com.ss.android.ugc.aweme.app.AwemeAppData$RedPointTask */
    class RedPointTask implements AbstractC58264w {
        static {
            Covode.recordClassIndex(40425);
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        public final int bQ_() {
            return 1048575;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: f */
        public final EnumC58150ad mo28606f() {
            return AbstractC58265x.m105221a(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: g */
        public final String mo28607g() {
            return "task_";
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: i */
        public final boolean mo28609i() {
            return true;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: j */
        public final List mo28610j() {
            return null;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
        /* renamed from: b */
        public final EnumC58151ae mo28601b() {
            return EnumC58151ae.BOOT_FINISH;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: k */
        public final EnumC58148ab mo28611k() {
            return EnumC58148ab.DEFAULT;
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: h */
        public final String mo28608h() {
            return getClass().getSimpleName();
        }

        private RedPointTask() {
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: a */
        public final void mo28600a(Context context) {
            boolean z;
            boolean z2;
            boolean z3;
            C61542b.m111464a(true, 4);
            if (C33816b.m69182a() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C51423a.m95784a(4, "ws", "connectWsFromRedPointTask return cause experiment");
            } else if (C33814a.f80061a) {
                C33814a.f80061a = false;
                C51423a.m95784a(4, "ws", "connectWsFromRedPointTask return cause isFirstConnectWsFromRedPointTask");
            } else {
                if (C33816b.m69182a() == 2 || C33816b.m69182a() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_background", C17873f.f42636l);
                jSONObject.put("experiment_group", C33816b.m69182a());
                if (C33816b.m69182a() == 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    C33814a.m69181a(z2, "onresume_connect_force");
                    C12290b.m22060a("aweme_long_connection_on_resume", 1, jSONObject);
                    return;
                }
                C61595q qVar = C61595q.f139777f;
                C89219l.m154716b(qVar, "");
                if (!qVar.f139779e) {
                    C33814a.m69181a(z2, "onresume_connect_when_need");
                    C12290b.m22060a("aweme_long_connection_on_resume", 1, jSONObject);
                    return;
                }
                C12290b.m22060a("aweme_long_connection_on_resume", 0, jSONObject);
            }
        }

        /* synthetic */ RedPointTask(AwemeAppData awemeAppData, byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.C18236d.AbstractC18237a
    /* renamed from: b */
    public final void mo29098b(Activity activity) {
        C30173b.m61015a(activity).mo53574b();
        C18228e.m33928b(activity);
    }

    @Override // com.bytedance.ies.uikit.p1279a.C18236d.AbstractC18237a
    /* renamed from: a */
    public final void mo29097a(Activity activity) {
        boolean z = activity instanceof MainActivity;
        boolean z2 = false;
        if (z) {
            if (C58195d.m105109b()) {
                C40780g.m82245b().execute(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.app.AwemeAppData.RunnableC335491 */

                    static {
                        Covode.recordClassIndex(40424);
                    }

                    public final void run() {
                        new C58221f.C58224c().mo95703b((AbstractC58264w) new RedPointTask(AwemeAppData.this, (byte) 0)).mo95706a();
                    }
                });
            } else {
                new C58221f.C58224c().mo95703b((AbstractC58264w) new RedPointTask(this, (byte) 0)).mo95706a();
            }
        }
        C18228e.m33927a(activity);
        this.f79679f = false;
        this.f79680g = false;
        this.f79681h = z;
        if (activity == null) {
            throw new NullPointerException("getIntent");
        }
        Intent intent = activity.getIntent();
        try {
            this.f79679f = intent.getBooleanExtra("from_notification", false);
            Uri data = intent.getData();
            if (intent.getBooleanExtra("ads_app_activity_by_wap_click", false) || !(data == null || data.getQueryParameter("gd_label") == null || !data.getQueryParameter("gd_label").startsWith("click_wap"))) {
                z2 = true;
            }
            this.f79680g = z2;
        } catch (Exception e) {
            e.getMessage();
        }
        if (!C58195d.m105111d() && !C67117a.m118770a()) {
            new C58221f.C58223b().mo95701b((AbstractC58259r) new C67193e()).mo95706a();
        }
    }
}
