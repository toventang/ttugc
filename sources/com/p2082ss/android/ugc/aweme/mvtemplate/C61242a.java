package com.p2082ss.android.ugc.aweme.mvtemplate;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.mvtemplate.api.MovieDetailAPi;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.qrcode.view.ProgressDialogC66468a;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.StickerDownloadConfig;
import com.p2082ss.android.ugc.aweme.tools.p4118f.AbstractC78598b;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80273bt;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.trill.R;
import java.util.UUID;
import p4600h.C89391z;

/* renamed from: com.ss.android.ugc.aweme.mvtemplate.a */
public final class C61242a {

    /* renamed from: a */
    public ProgressDialogC66468a f139057a;

    /* renamed from: b */
    public Context f139058b;

    /* renamed from: c */
    public String f139059c = "";

    /* renamed from: d */
    public String f139060d = "";

    /* renamed from: e */
    public boolean f139061e = true;

    /* renamed from: f */
    public int f139062f = 2;

    /* renamed from: g */
    public AbstractC78598b f139063g;

    static {
        Covode.recordClassIndex(71855);
    }

    /* renamed from: b */
    private static boolean m110900b() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    private boolean m110899a() {
        if (!C80720e.m139939e()) {
            C13628n.m24506a(this.f139058b, (int) R.string.feu);
        } else if (C80720e.m139940f() < 20971520) {
            C13628n.m24506a(this.f139058b, (int) R.string.fev);
        } else {
            C17867d.m33078a();
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m110900b();
            }
            if (!C58029j.f132256h) {
                new C79459a(C17867d.m33078a()).mo123050a(R.string.dbw).mo123053a();
                return false;
            } else if (!this.f139061e) {
                return true;
            } else {
                if (this.f139057a == null) {
                    Context context = this.f139058b;
                    ProgressDialogC66468a a = ProgressDialogC66468a.m118220a(context, context.getResources().getString(R.string.bde));
                    this.f139057a = a;
                    a.setIndeterminate(false);
                } else {
                    Context context2 = this.f139058b;
                    if ((context2 instanceof Activity) && !((Activity) context2).isFinishing()) {
                        this.f139057a.show();
                        this.f139057a.mo105414a();
                    }
                }
                return true;
            }
        }
        return false;
    }

    public C61242a(Context context) {
        this.f139058b = context;
    }

    public C61242a(Context context, Integer num) {
        this.f139058b = context;
        if (num != null) {
            this.f139062f = num.intValue();
        }
    }

    /* renamed from: a */
    public final void mo98769a(final String str, final int i) {
        final String str2;
        if (m110899a()) {
            if (TextUtils.isEmpty(this.f139059c)) {
                str2 = "mv_reuse";
            } else {
                str2 = this.f139059c;
            }
            C612431 r1 = new SimpleServiceLoadCallback() {
                /* class com.p2082ss.android.ugc.aweme.mvtemplate.C61242a.C612431 */

                static {
                    Covode.recordClassIndex(71856);
                }

                @Override // com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback, com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onFailed() {
                    if (C61242a.this.f139057a != null) {
                        C80273bt.m139146b(C61242a.this.f139057a);
                    }
                }

                /* access modifiers changed from: package-private */
                /* renamed from: a */
                public final /* synthetic */ C89391z mo98771a(Integer num) {
                    if (num.intValue() == 2004 || num.intValue() == 2002) {
                        new C79459a(C61242a.this.f139058b).mo123052a(C61242a.this.f139058b.getResources().getString(R.string.dby)).mo123053a();
                    } else if (num.intValue() == 2003) {
                        new C79459a(C61242a.this.f139058b).mo123052a(C61242a.this.f139058b.getResources().getString(R.string.dbx)).mo123053a();
                    } else if (num.intValue() == 2006) {
                        new C79459a(C61242a.this.f139058b).mo123052a(C61242a.this.f139058b.getResources().getString(R.string.bqg)).mo123053a();
                    } else {
                        new C79459a(C61242a.this.f139058b).mo123052a(C61242a.this.f139058b.getResources().getString(R.string.dbw)).mo123053a();
                    }
                    if (C61242a.this.f139057a != null) {
                        C80273bt.m139146b(C61242a.this.f139057a);
                    }
                    if (C61242a.this.f139063g == null) {
                        return null;
                    }
                    C61242a.this.f139063g.onFinish(num.intValue());
                    return null;
                }

                @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j) {
                    RecordConfig.Builder shootWay = new RecordConfig.Builder().enterFrom(C61242a.this.f139060d).creationId(UUID.randomUUID().toString()).shootWay(str2);
                    StickerDownloadConfig stickerDownloadConfig = new StickerDownloadConfig(str, C58071d.m104913g());
                    stickerDownloadConfig.setType(Integer.valueOf(i));
                    if (C61242a.this.f139062f == 2) {
                        stickerDownloadConfig.setEnterFromType(10002);
                    } else if (C61242a.this.f139062f == 3) {
                        stickerDownloadConfig.setEnterFromType(10003);
                    } else if (C61242a.this.f139062f == 1) {
                        stickerDownloadConfig.setEnterFromType(10001);
                    }
                    stickerDownloadConfig.setOnFail(new C61252b(this));
                    stickerDownloadConfig.setOnSuccess(new C61253c(this));
                    asyncAVService.uiService().recordService().startRecordMV(C61242a.this.f139058b, shootWay.build(), stickerDownloadConfig);
                }
            };
            if ("mv_page".equals(str2)) {
                AVExternalServiceImpl.m113114a().asyncService(str2, r1);
            } else {
                AVExternalServiceImpl.m113114a().asyncServiceWithOutPanel(str2, r1);
            }
        }
    }

    /* renamed from: a */
    public final void mo98770a(String str, Integer num, String str2, String str3) {
        this.f139059c = str2;
        this.f139060d = str3;
        int i = 1;
        if (num == null) {
            num = 1;
        }
        int intValue = num.intValue();
        if (AVExternalServiceImpl.m113114a().configService().avsettingsConfig().getMvPlan() > 0) {
            if (intValue == MovieDetailAPi.f139096a) {
                i = 4;
            } else {
                i = 3;
            }
        }
        mo98769a(str, i);
    }
}
