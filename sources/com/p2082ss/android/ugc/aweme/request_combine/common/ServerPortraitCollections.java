package com.p2082ss.android.ugc.aweme.request_combine.common;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.google.gson.AbstractC28019l;
import com.google.gson.C27910f;
import com.google.gson.C28022o;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.legacy.ColdLaunchRequestCombinerImpl;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.request_combine.PortraitCombineModel;
import com.p2082ss.android.ugc.aweme.request_combine.p3677c.AbstractC67122b;
import com.p2082ss.android.ugc.aweme.requestcombine.AbstractC67176a;
import com.p2082ss.android.ugc.aweme.requestcombine.IServerPortraitService;
import java.util.List;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.request_combine.common.ServerPortraitCollections */
public class ServerPortraitCollections implements IServerPortraitService {

    /* renamed from: a */
    private volatile C28022o f150533a;

    /* renamed from: b */
    private volatile C28022o f150534b;

    static {
        Covode.recordClassIndex(78710);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.request_combine.common.ServerPortraitCollections$PortraitRequestTask */
    public class PortraitRequestTask implements AbstractC58264w {
        static {
            Covode.recordClassIndex(78713);
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

        private PortraitRequestTask() {
        }

        @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
        /* renamed from: a */
        public final void mo28600a(Context context) {
            C51423a.m95787a("PortraitRequestTask");
            try {
                ServerPortraitCollections.this.mo105955a(UserPortraitApi.m118788a("bitrate_selection"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* synthetic */ PortraitRequestTask(ServerPortraitCollections serverPortraitCollections, byte b) {
            this();
        }
    }

    public ServerPortraitCollections() {
        if (AbstractC67122b.C67123a.f150532a) {
            C1731i.m5640b(new CallableC67126a(this), C1731i.f5562a);
            ColdLaunchRequestCombinerImpl.m104985b().mo95593a(new AbstractC67176a() {
                /* class com.p2082ss.android.ugc.aweme.request_combine.common.ServerPortraitCollections.C671241 */

                static {
                    Covode.recordClassIndex(78711);
                }

                @Override // com.p2082ss.android.ugc.aweme.requestcombine.AbstractC67176a
                /* renamed from: a */
                public final void mo96311a() {
                    ServerPortraitCollections serverPortraitCollections = ServerPortraitCollections.this;
                    if (ColdLaunchRequestCombinerImpl.m104985b().mo95594a()) {
                        PortraitCombineModel portraitCombineModel = (PortraitCombineModel) ColdLaunchRequestCombinerImpl.m104985b().mo95592a("/tiktok/v1/efficiency_portrait/");
                        if (portraitCombineModel != null) {
                            if (portraitCombineModel.httpCode == 200 && portraitCombineModel.getPortraitData() != null) {
                                serverPortraitCollections.mo105955a(portraitCombineModel.getPortraitData());
                                return;
                            } else if (portraitCombineModel.httpCode == 509) {
                                return;
                            }
                        }
                        serverPortraitCollections.mo105956b();
                        return;
                    }
                    serverPortraitCollections.mo105956b();
                }

                @Override // com.p2082ss.android.ugc.aweme.requestcombine.AbstractC67176a
                /* renamed from: a */
                public final void mo96312a(Throwable th) {
                    ServerPortraitCollections.this.mo105956b();
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo105956b() {
        new C58221f.C58224c().mo95703b((AbstractC58264w) new PortraitRequestTask(this, (byte) 0)).mo95706a();
    }

    /* renamed from: d */
    public static IServerPortraitService m118773d() {
        MethodCollector.m26663i(334);
        Object a = C81908b.m141854a(IServerPortraitService.class, false);
        if (a != null) {
            IServerPortraitService iServerPortraitService = (IServerPortraitService) a;
            MethodCollector.m26664o(334);
            return iServerPortraitService;
        }
        if (C81908b.f183334de == null) {
            synchronized (IServerPortraitService.class) {
                try {
                    if (C81908b.f183334de == null) {
                        C81908b.f183334de = new ServerPortraitCollections();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(334);
                    throw th;
                }
            }
        }
        ServerPortraitCollections serverPortraitCollections = (ServerPortraitCollections) C81908b.f183334de;
        MethodCollector.m26664o(334);
        return serverPortraitCollections;
    }

    @Override // com.p2082ss.android.ugc.aweme.requestcombine.IServerPortraitService
    /* renamed from: a */
    public final C28022o mo105954a() {
        if (this.f150533a != null && this.f150533a.f65804a.size() > 0) {
            return this.f150533a;
        }
        if (this.f150534b == null || this.f150534b.f65804a.size() <= 0) {
            return null;
        }
        return this.f150534b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Object mo105957c() {
        try {
            if (this.f150534b == null) {
                this.f150534b = (C28022o) new C27910f().mo46671a(C34822d.m71158a(C17867d.m33078a(), "user_portraits_sp", 0).getString("user_portraits_sp", null), new C27895a<C28022o>() {
                    /* class com.p2082ss.android.ugc.aweme.request_combine.common.ServerPortraitCollections.C671252 */

                    static {
                        Covode.recordClassIndex(78712);
                    }
                }.type);
            }
        } catch (Throwable th) {
            C13468b.m24211a(th, "UserPortraitManagerinitConfig error!");
        }
        return null;
    }

    /* renamed from: a */
    public final synchronized void mo105955a(C28022o oVar) {
        MethodCollector.m26663i(327);
        if (oVar == null) {
            MethodCollector.m26664o(327);
            return;
        }
        try {
            this.f150533a = oVar;
            C28022o oVar2 = this.f150533a;
            SharedPreferences a = C34822d.m71158a(C17867d.m33078a(), "user_portraits_sp", 0);
            a.edit().putString("user_portraits_sp", new C27910f().mo46672a((AbstractC28019l) oVar2)).apply();
            MethodCollector.m26664o(327);
        } catch (Exception e) {
            C51423a.m95788a("", e);
            MethodCollector.m26664o(327);
        }
    }
}
