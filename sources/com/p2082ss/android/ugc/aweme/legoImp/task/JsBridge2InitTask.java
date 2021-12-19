package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.C16041a;
import com.bytedance.ies.abmock.AbstractC16082i;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.web.jsbridge2.AbstractC18347m;
import com.bytedance.ies.web.jsbridge2.C18364w;
import com.bytedance.ies.web.jsbridge2.EnumC18325aj;
import com.bytedance.keva.Keva;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC21994b;
import com.bytedance.retrofit2.p1610b.AbstractC22004l;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.crossplatform.CrossPlatformServiceImpl;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58084a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.C58267z;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58149ac;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.settings.C68754t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.zip.ZipInputStream;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.JsBridge2InitTask */
public class JsBridge2InitTask implements AbstractC58084a, AbstractC58264w {

    /* renamed from: a */
    public EnumC58151ae f132873a;

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.JsBridge2InitTask$NetRequest */
    interface NetRequest {
        static {
            Covode.recordClassIndex(68517);
        }

        @AbstractC22012t
        AbstractC21983b<String> postBody(@AbstractC21993ag String str, @AbstractC21994b TypedOutput typedOutput, @AbstractC22004l List<C22027b> list);
    }

    static {
        Covode.recordClassIndex(68511);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58084a
    /* renamed from: c */
    public final String[] mo28603c() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58084a
    /* renamed from: d */
    public final int mo28604d() {
        return 1;
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
        return this.f132873a;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58084a
    /* renamed from: e */
    public final EnumC58149ac mo28605e() {
        if (C58267z.m105225c()) {
            return EnumC58149ac.IO;
        }
        return EnumC58149ac.CPU;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.JsBridge2InitTask$4 */
    static /* synthetic */ class C583644 {

        /* renamed from: a */
        static final /* synthetic */ int[] f132882a;

        static {
            Covode.recordClassIndex(68516);
            int[] iArr = new int[EnumC18325aj.values().length];
            f132882a = iArr;
            try {
                iArr[EnumC18325aj.XSS_CALLBACK_ID_SWITCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public JsBridge2InitTask(EnumC58151ae aeVar) {
        this.f132873a = aeVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(final Context context) {
        final long currentTimeMillis = System.currentTimeMillis();
        try {
            if (C52912c.f121688a.f121689b.getUseBridgeEngineV2().booleanValue()) {
                mo95745a(context, currentTimeMillis);
                return;
            }
        } catch (C16041a e) {
            e.printStackTrace();
        }
        if (this.f132873a == EnumC58151ae.BOOT_FINISH) {
            SettingsManager.m29616a().mo25399a(new AbstractC16082i() {
                /* class com.p2082ss.android.ugc.aweme.legoImp.task.JsBridge2InitTask.C583601 */

                static {
                    Covode.recordClassIndex(68512);
                }

                @Override // com.bytedance.ies.abmock.AbstractC16082i
                /* renamed from: a */
                public final void mo25536a() {
                    C40780g.m82245b().execute(new RunnableC58438l(this, context, currentTimeMillis));
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo95745a(final Context context, long j) {
        boolean z;
        if (this.f132873a == EnumC58151ae.BOOT_FINISH) {
            z = true;
        } else {
            z = false;
        }
        final ExecutorService b = C40780g.m82245b();
        C18364w.m34183a(z, new AbstractC18347m() {
            /* class com.p2082ss.android.ugc.aweme.legoImp.task.JsBridge2InitTask.C583612 */

            static {
                Covode.recordClassIndex(68513);
            }

            @Override // com.bytedance.ies.web.jsbridge2.AbstractC18347m
            /* renamed from: j */
            public final String mo29389j() {
                return "https://jsb-sg.tiktokv.com/src/server/v2/package";
            }

            @Override // com.bytedance.ies.web.jsbridge2.AbstractC18347m
            /* renamed from: a */
            public final AbstractC18347m.EnumC18353e mo29379a() {
                return AbstractC18347m.EnumC18353e.SG;
            }

            @Override // com.bytedance.ies.web.jsbridge2.AbstractC18347m
            /* renamed from: b */
            public final int mo29381b() {
                return C17867d.f42590n;
            }

            @Override // com.bytedance.ies.web.jsbridge2.AbstractC18347m
            /* renamed from: i */
            public final Executor mo29388i() {
                return b;
            }

            @Override // com.bytedance.ies.web.jsbridge2.AbstractC18347m
            /* renamed from: d */
            public final String mo29383d() {
                return C17867d.m33085f();
            }

            @Override // com.bytedance.ies.web.jsbridge2.AbstractC18347m
            /* renamed from: e */
            public final String mo29384e() {
                return AppLog.getServerDeviceId();
            }

            @Override // com.bytedance.ies.web.jsbridge2.AbstractC18347m
            /* renamed from: h */
            public final AbstractC18347m.AbstractC18348a mo29387h() {
                return new AbstractC18347m.AbstractC18348a() {
                    /* class com.p2082ss.android.ugc.aweme.legoImp.task.JsBridge2InitTask.C583612.C583621 */

                    static {
                        Covode.recordClassIndex(68514);
                    }

                    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18347m.AbstractC18348a
                    /* renamed from: a */
                    public final String mo29390a(String str, String str2) {
                        return null;
                    }

                    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18347m.AbstractC18348a
                    /* renamed from: b */
                    public final void mo29392b(String str, String str2) {
                        Keva.getRepo("jsbridge2-permission", 1).storeString(str, str2);
                    }

                    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18347m.AbstractC18348a
                    /* renamed from: a */
                    public final void mo29391a(String str, AbstractC18347m.AbstractC18348a.AbstractC18349a aVar) {
                        aVar.mo29315a(Keva.getRepo("jsbridge2-permission", 1).getString(str, ""));
                    }
                };
            }

            @Override // com.bytedance.ies.web.jsbridge2.AbstractC18347m
            /* renamed from: f */
            public final String mo29385f() {
                return CrossPlatformServiceImpl.m81709c().mo69603b();
            }

            @Override // com.bytedance.ies.web.jsbridge2.AbstractC18347m
            /* renamed from: g */
            public final Collection<String> mo29386g() {
                LinkedList linkedList = new LinkedList();
                linkedList.add("webcast");
                return linkedList;
            }

            @Override // com.bytedance.ies.web.jsbridge2.AbstractC18347m
            /* renamed from: c */
            public final String mo29382c() {
                MethodCollector.m26663i(1500);
                try {
                    StringBuilder sb = new StringBuilder();
                    ZipInputStream zipInputStream = new ZipInputStream(context.getAssets().open("jsb_whitelist.zip"));
                    if (zipInputStream.getNextEntry() != null) {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = zipInputStream.read(bArr, 0, 1024);
                            if (read < 0) {
                                break;
                            }
                            sb.append(new String(bArr, 0, read));
                        }
                    }
                    zipInputStream.close();
                    String sb2 = sb.toString();
                    MethodCollector.m26664o(1500);
                    return sb2;
                } catch (IOException unused) {
                    MethodCollector.m26664o(1500);
                    return null;
                }
            }

            @Override // com.bytedance.ies.web.jsbridge2.AbstractC18347m
            /* renamed from: a */
            public final void mo29380a(String str, String str2, byte[] bArr, AbstractC18347m.AbstractC18350b bVar) {
                try {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new C22027b("ContentType", str2));
                    bVar.mo29323a(((NetRequest) RetrofitUtils.m43281a(str, NetRequest.class)).postBody(str, new TypedByteArray(null, bArr, new String[0]), arrayList).execute().f52262b);
                } catch (Exception e) {
                    e.printStackTrace();
                    bVar.mo29324a(e);
                }
            }
        }, new C58437k(z, j), new C18364w.AbstractC18366a() {
            /* class com.p2082ss.android.ugc.aweme.legoImp.task.JsBridge2InitTask.C583633 */

            static {
                Covode.recordClassIndex(68515);
            }

            @Override // com.bytedance.ies.web.jsbridge2.C18364w.AbstractC18366a
            /* renamed from: a */
            public final boolean mo29406a(EnumC18325aj ajVar) {
                if (C583644.f132882a[ajVar.ordinal()] != 1) {
                    return false;
                }
                return C68754t.m121189a().f153791a;
            }
        });
    }
}
